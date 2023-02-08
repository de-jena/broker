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
package de.dim.trafficos.vaadin.views.intersection;

import java.util.ArrayList;
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

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
public class TrafficLightTab extends VerticalLayout {

	/** serialVersionUID */
	private static final long serialVersionUID = -6803804657172881530L;
	private static final List<String> TL_MODULE_OPTIONS = List.of(TLModuleType.FDL.toString(), TLModuleType.LML.toString());
	
	private Grid<TLModule> moduleGrid;
	private List<TLModule> moduleList = new ArrayList<>();
	private TOSTrafficLightPackage tlPackage;
	
	public TrafficLightTab(TOSTrafficLightPackage tlPackage) {
		this.tlPackage = tlPackage;
		setSizeFull();
		
		HorizontalLayout addModuleLayout = new HorizontalLayout();
		ComboBox<String> addModuleComboBox = new ComboBox<String>();
		addModuleComboBox.setItems(TL_MODULE_OPTIONS);
		addModuleComboBox.setHelperText("Select Module Type");
		Button addModuleBtn = new Button("Add Module", evt -> {
			TLModule module = tlPackage.getTOSTrafficLightFactory().createTLModule();
			module.setType(TLModuleType.valueOf(addModuleComboBox.getValue()));
			moduleList.add(module);
			moduleList.sort((m1, m2) -> Integer.valueOf(m1.getAddress()).compareTo(Integer.valueOf(m2.getAddress())));
			moduleGrid.setItems(moduleList);
			moduleGrid.setVisible(true);
		});
		addModuleBtn.setEnabled(false);
		addModuleComboBox.addValueChangeListener(evt -> {
			if(evt.getValue() == null) addModuleBtn.setEnabled(false);
			else addModuleBtn.setEnabled(true);
		});
		addModuleLayout.add(addModuleComboBox, addModuleBtn);
		add(addModuleLayout);
		
		createModuleGrid();
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
		if(moduleList.remove(module)) {
			if(moduleList.isEmpty()) {
				moduleGrid.setVisible(false);
			} else {
				moduleList.sort((m1, m2) -> Integer.valueOf(m1.getAddress()).compareTo(Integer.valueOf(m2.getAddress())));
			}
			moduleGrid.setItems(moduleList);
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
        
//        TODO: we need the common package to be able to add a Position to the transmitter
        HorizontalLayout geoLayout = new HorizontalLayout();
        NumberField latField = new NumberField("Latitude");
        NumberField lngField = new NumberField("Longitude");
        NumberField altField = new NumberField("Altitude");
        geoLayout.add(latField, lngField, altField);
        
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
        	lightSignal.setBliking(blinkBox.getValue());
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
