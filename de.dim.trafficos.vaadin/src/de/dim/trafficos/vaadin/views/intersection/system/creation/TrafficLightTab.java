/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.vaadin.views.intersection.system.creation;

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import de.dim.trafficos.common.model.common.Position;
import de.dim.trafficos.common.model.common.TOSCommonPackage;
import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;
import de.dim.trafficos.vaadin.helper.GeneralTab;
import de.dim.trafficos.vaadin.helper.MapComponent;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
public class TrafficLightTab extends GeneralTab<TLModule> {

	/** serialVersionUID */
	private static final long serialVersionUID = -6803804657172881530L;
	private static final List<String> TL_MODULE_OPTIONS = List.of(TLModuleType.FDL.toString(), TLModuleType.LML.toString());
	
	private Grid<TLModule> moduleGrid;
	private TOSTrafficLightPackage tlPackage;
	private TOSCommonPackage commonPackage;
	private ComboBox<String> addModuleComboBox;
	private Button addModuleBtn;
	
	public TrafficLightTab(TOSTrafficLightPackage tlPackage, TOSCommonPackage commonPackage) {
		this.tlPackage = tlPackage;
		this.commonPackage = commonPackage;
		fillLayout();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.vaadin.views.intersection.GeneralTab#fillLayout()
	 */
	@Override
	protected void fillLayout() {
		setSizeFull();
		HorizontalLayout addModuleLayout = new HorizontalLayout();
		addModuleComboBox = new ComboBox<String>();
		addModuleComboBox.setItems(TL_MODULE_OPTIONS);
		addModuleComboBox.setHelperText("Select Module Type");
		addModuleBtn = new Button("Add Module", evt -> {
			TLModule module = tlPackage.getTOSTrafficLightFactory().createTLModule();
			module.setType(TLModuleType.valueOf(addModuleComboBox.getValue()));
			result.add(module);
			result.sort((m1, m2) -> Integer.valueOf(m1.getAddress()).compareTo(Integer.valueOf(m2.getAddress())));
			moduleGrid.setItems(result);
			moduleGrid.setVisible(true);
			submitBtn.setEnabled(true);
		});
		addModuleBtn.setEnabled(false);
		addModuleComboBox.addValueChangeListener(evt -> {
			if(evt.getValue() == null) addModuleBtn.setEnabled(false);
			else addModuleBtn.setEnabled(true);
		});
		addModuleLayout.add(addModuleComboBox, addModuleBtn);
		add(addModuleLayout);
		
		createModuleGrid();
		createBtnLayout();		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.vaadin.views.intersection.GeneralTab#clearTab()
	 */
	@Override
	public void clearTab() {
		result.clear();		
		moduleGrid.setItems(result);
		moduleGrid.setVisible(false);
		addModuleComboBox.setValue(null);
	}
	
	private void createModuleGrid() {
		moduleGrid = new Grid<TLModule>();
		moduleGrid.addColumn(
				new ComponentRenderer<>(IntegerField::new, (field, module) -> {
					field.setValue(module.getAddress());
					field.addValueChangeListener(evt -> {
						module.setAddress(field.getValue());
					});
				})).setHeader("Address");
		moduleGrid.addColumn(TLModule::getType).setHeader("Type");
		moduleGrid.addColumn(
				new ComponentRenderer<>(Button::new, (button, module) -> {
					button.addClickListener(e -> createTransmitterDialog(module).open());
					button.setIcon(new Icon(VaadinIcon.PLUS));
				})).setHeader("Add Transmitters");
		moduleGrid.addColumn(
				new ComponentRenderer<>(Button::new, (button, module) -> {
					button.addClickListener(e -> this.removeModule(module));
					button.setIcon(new Icon(VaadinIcon.TRASH));
				})).setHeader("Delete Module");
		moduleGrid.setVisible(false);		
		moduleGrid.setDetailsVisibleOnClick(true);
		moduleGrid.setItemDetailsRenderer(this.createReportDetailsRenderer());
		add(moduleGrid);
	}
	
	private ComponentRenderer<TLModuleDetailsLayout, TLModule> createReportDetailsRenderer() {
		return new ComponentRenderer<>(TLModuleDetailsLayout::new,
				(layout, module) -> {
					layout.fillLayout(module);
				});
	}

	private void removeModule(TLModule module) {
		if(result.remove(module)) {
			result.sort((m1, m2) -> Integer.valueOf(m1.getAddress()).compareTo(Integer.valueOf(m2.getAddress())));
			moduleGrid.setItems(result);
			if(result.isEmpty()) {
				moduleGrid.setVisible(false);
				submitBtn.setEnabled(false);
			} 		
		}
	}
	
    private Dialog createTransmitterDialog(TLModule module) {
    	Dialog dialog = new Dialog();
    	dialog.setHeaderTitle("New TL Signal Transmitter"); 
    	TLSignalTransmitter transmitter = tlPackage.getTOSTrafficLightFactory().createTLSignalTransmitter();
    	transmitter.setSignalGroup(tlPackage.getTOSTrafficLightFactory().createTLSignalGroup());
    	
    	VerticalLayout dialogLayout = new VerticalLayout();
        dialogLayout.setPadding(false);
        dialogLayout.setSpacing(false);
        dialogLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
    	
        HorizontalLayout namesLayout = new HorizontalLayout();
        TextField nameField = new TextField("Name");
        nameField.addValueChangeListener(evt -> transmitter.setName(evt.getValue()));
        TextField signalGroupField = new TextField("Signal Group");
        signalGroupField.addValueChangeListener(evt -> transmitter.getSignalGroup().setId(evt.getValue()));
        namesLayout.add(nameField, signalGroupField);
        
        Position position = commonPackage.getTOSCommonFactory().createPosition();
        transmitter.getLocation().add(position);
        HorizontalLayout geoLayout = new HorizontalLayout();
        geoLayout.setAlignItems(Alignment.BASELINE);
        NumberField latField = new NumberField("Latitude");
        latField.addValueChangeListener(evt -> position.setLatitude(evt.getValue()));
        NumberField lngField = new NumberField("Longitude");
        lngField.addValueChangeListener(evt -> position.setLongitude(evt.getValue()));
        NumberField altField = new NumberField("Altitude");
        Button geoPickerBtn = new Button(new Icon(VaadinIcon.LOCATION_ARROW_CIRCLE_O), evt -> {
        	createMapDialog(latField, lngField).open();
        });
        geoLayout.add(latField, lngField, altField, geoPickerBtn);
        
        TLLightSignalGrid lightSignalGrid = new TLLightSignalGrid(transmitter);

        Button addLightSignalBtn = new Button("Add Light Signal", evt -> {
        	Dialog lightDialog = createLightSignalDialog(transmitter);
        	lightDialog.addOpenedChangeListener(evt1 -> {
        		if(!evt1.getSource().isOpened()) {
        			if(transmitter.getLightSignal().isEmpty()) lightSignalGrid.setVisible(false);
            		else {
            			lightSignalGrid.setItems(transmitter.getLightSignal());
            			lightSignalGrid.setVisible(true);
            		}
        		}        		
        	});
        	lightDialog.open();
        });       
        
        dialogLayout.add(namesLayout, geoLayout, addLightSignalBtn, lightSignalGrid);
        dialog.add(dialogLayout);
        
        Button saveButton = new Button("Add", e -> {
        	module.getSignalTransmitter().add(transmitter);
        	dialog.close();
        });
		Button cancelButton = new Button("Cancel", e -> dialog.close());
		dialog.getFooter().add(cancelButton);
		dialog.getFooter().add(saveButton);

        return dialog;
    }
    
    private Dialog createMapDialog(NumberField latField, NumberField lngField) {
    	
    	Dialog dialog = new Dialog();
    	dialog.setWidth("70%");
    	dialog.setHeight("70%");
    	dialog.setHeaderTitle("Geo Picker");
    	MapComponent mapComponent = new MapComponent();
    	dialog.add(mapComponent);
    	Button saveButton = new Button("Save", e -> {
        	latField.setValue(mapComponent.getLatitude());
        	lngField.setValue(mapComponent.getLongitude());
        	dialog.close();
        });
		Button cancelButton = new Button("Cancel", e -> dialog.close());
		dialog.getFooter().add(cancelButton);
		dialog.getFooter().add(saveButton);
    	return dialog;
    }
    
    private Dialog createLightSignalDialog(TLSignalTransmitter transmitter) {
    	Dialog dialog = new Dialog();
    	dialog.setHeaderTitle("New Light Signal");    	
    	VerticalLayout dialogLayout = new VerticalLayout();
        dialogLayout.setPadding(false);
        dialogLayout.setSpacing(false);
        dialogLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
        
        Checkbox blinkBox = new Checkbox("Is it blinking signal?");
        ComboBox<String> typeComboBox = new ComboBox<>();
        typeComboBox.setItems(SignalValueType.VALUES.stream().map(v -> v.toString()).collect(Collectors.toList()));
        typeComboBox.setHelperText("Set Signal Type");
       
        dialogLayout.add(blinkBox, typeComboBox);    
        dialog.add(dialogLayout);
        
        Button saveButton = new Button("Add", e -> {
        	LightSignal lightSignal = tlPackage.getTOSTrafficLightFactory().createLightSignal();
        	lightSignal.setBlinking(blinkBox.getValue());
        	lightSignal.setValue(SignalValueType.valueOf(typeComboBox.getValue()));
        	transmitter.getLightSignal().add(lightSignal);
        	dialog.close();
        });
        saveButton.setEnabled(false);
        typeComboBox.addValueChangeListener(evt -> {
        	if(evt.getValue() == null) saveButton.setEnabled(false);
        	else saveButton.setEnabled(true);
        });
		Button cancelButton = new Button("Cancel", e -> dialog.close());
		dialog.getFooter().add(cancelButton);
		dialog.getFooter().add(saveButton);
        return dialog;
    }
}
