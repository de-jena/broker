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
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import de.dim.trafficos.simulator.api.IntersectionConstants;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
public class IntersectionTab extends VerticalLayout {

	/** serialVersionUID */
	private static final long serialVersionUID = -5538372422534592428L;

	private TextField intersectionName;
	private TextArea intersectionDescr;
	private Grid<DisplayedRoad> roadGrid;
	private List<DisplayedRoad> displayedRoads = new ArrayList<>();
	private Button clearBtn, submitBtn;

	private static final String OPTION_ADD_MAIN_ROAD = "Add a main road";
	private static final String OPTION_ADD_SECONDARY_ROAD = "Add a secondary road";

	private static final List<String> MAIN_ROAD_OPTIONS = List.of(IntersectionConstants.MAIN_LEFT_RIGHT_MERGE, 
			IntersectionConstants.MAIN_LEFT_RIGHT_SEP, IntersectionConstants.MAIN_STRAIGHT, IntersectionConstants.MAIN_STRAIGHT_LEFT_MERGE,
			IntersectionConstants.MAIN_STRAIGHT_LEFT_SEP, IntersectionConstants.MAIN_STRAIGHT_RIGHT_MERGE, IntersectionConstants.MAIN_STRAIGHT_RIGHT_SEP,
			IntersectionConstants.MAIN_STRAIGHT_TURNS_MERGE, IntersectionConstants.MAIN_STRAIGHT_TURNS_SEP);

	private static final List<String> SECONDARY_ROAD_OPTIONS = List.of(IntersectionConstants.SEC_LEFT_RIGHT_MERGE, IntersectionConstants.SEC_LEFT_RIGHT_SEP,
			IntersectionConstants.SEC_STRAIGHT_LEFT_MERGE, IntersectionConstants.SEC_STRAIGHT_LEFT_SEP, IntersectionConstants.SEC_STRAIGHT_RIGHT_MERGE,
			IntersectionConstants.SEC_STRAIGHT_RIGHT_SEP, IntersectionConstants.SEC_STRAIGHT_TURNS_MERGE, IntersectionConstants.SEC_STRAIGHT_TURNS_SEP);

	public IntersectionTab() {
		setSizeFull();

		intersectionName = new TextField();
		intersectionName.setLabel("Intersection name");

		intersectionDescr = new TextArea();
		intersectionDescr.setWidthFull();
		intersectionDescr.setLabel("Intersection description");

		Button addRoadBtn = new Button("Add Road", evt -> {
			createRoadDialog().open();
		});
		addRoadBtn.setWidth("10%");		
		add(intersectionName, intersectionDescr, addRoadBtn);			

		createGrid();
		createBtnLayout();		
	}
	


	private void createBtnLayout() {
		HorizontalLayout btnLayout = new HorizontalLayout();
		clearBtn = new Button("Clear", evt ->  {
			displayedRoads.clear();
			roadGrid.setItems(Collections.emptyList());
			roadGrid.setVisible(false);
			submitBtn.setEnabled(false);
		});
		
		submitBtn = new Button("Create");
		submitBtn.setEnabled(false);
		
		btnLayout.add(clearBtn, submitBtn);		
		add(btnLayout);		
	}


	private void createGrid() {
		roadGrid = new Grid<DisplayedRoad>();
		roadGrid.addColumn(DisplayedRoad::getIndex).setHeader("Index");
		roadGrid.addColumn(DisplayedRoad::getType).setHeader("Type");
		roadGrid.addColumn(
				new ComponentRenderer<>(Button::new, (button, road) -> {
					button.addClickListener(e -> this.removeRoad(road));
					button.setIcon(new Icon(VaadinIcon.TRASH));
				})).setHeader("Delete");
		roadGrid.addColumn(
				new ComponentRenderer<>(Button::new, (button, road) -> {
					button.addClickListener(e -> this.moveRoadUp(road));
					button.setIcon(new Icon(VaadinIcon.ARROW_UP));
					if(road.getIndex() == 0) button.setEnabled(false);
				})).setHeader("Move Up");
		roadGrid.addColumn(
				new ComponentRenderer<>(Button::new, (button, road) -> {
					button.addClickListener(e -> this.moveRoadDown(road));
					button.setIcon(new Icon(VaadinIcon.ARROW_DOWN));
					if(road.getIndex() == displayedRoads.size()-1) button.setEnabled(false);
				})).setHeader("Move Down");
		roadGrid.setVisible(false);		
		add(roadGrid);
	}

	public Button getSubmitBtn() {
		return submitBtn;
	}
	
	public List<DisplayedRoad> getRoads() {
		return displayedRoads;
	}
	
	private Dialog createRoadDialog() {
    	Dialog dialog = new Dialog();
    	dialog.setHeaderTitle("New Road");
    	
    	VerticalLayout dialogLayout = new VerticalLayout();
    	dialogLayout.setPadding(false);
        dialogLayout.setSpacing(false);
        dialogLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
        
    	VerticalLayout roadOptionsLayout = new VerticalLayout();
		RadioButtonGroup<String> roadOptionsGroup = new RadioButtonGroup<String>();
		roadOptionsGroup.setItems(OPTION_ADD_MAIN_ROAD, OPTION_ADD_SECONDARY_ROAD);
		roadOptionsGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
		roadOptionsLayout.add(roadOptionsGroup);
		
		ComboBox<String> roadTypeComboBox = new ComboBox<>();
		roadTypeComboBox.setHelperText("Select Road Type");
		roadTypeComboBox.setVisible(false);

        dialogLayout.add(roadOptionsGroup, roadTypeComboBox);
        dialog.add(dialogLayout);
        
        Button saveButton = new Button("Add", e -> {
        	DisplayedRoad road = new DisplayedRoad(displayedRoads.size(), roadTypeComboBox.getValue());
			displayedRoads.add(road);
			dialog.close();
			Collections.sort(displayedRoads);
			roadGrid.setItems(displayedRoads);
			roadGrid.setVisible(true); 			
        });
        
		Button cancelButton = new Button("Cancel", e -> dialog.close());
		dialog.getFooter().add(cancelButton);
		dialog.getFooter().add(saveButton);
        
//        Listeners
		roadOptionsGroup.addValueChangeListener(evt -> {
			if(evt.getValue() == null) {
				saveButton.setEnabled(false);
				return;
			}
			roadTypeComboBox.setVisible(true);
			if(OPTION_ADD_MAIN_ROAD.equals(evt.getValue())) {				
				roadTypeComboBox.setItems(MAIN_ROAD_OPTIONS);
			} else if(OPTION_ADD_SECONDARY_ROAD.equals(evt.getValue())) {
				roadTypeComboBox.setItems(SECONDARY_ROAD_OPTIONS);
			}
			if(roadTypeComboBox.getValue() != null) saveButton.setEnabled(true);
		});
		
		roadTypeComboBox.addValueChangeListener(evt -> {
			if(evt.getValue() != null && roadOptionsGroup.getValue() != null) saveButton.setEnabled(true);			
		});

        return dialog;
    }

	private void removeRoad(DisplayedRoad road) {
		int index = road.getIndex();
		if(displayedRoads.remove(road)) {
			if(displayedRoads.isEmpty()) {
				roadGrid.setItems(Collections.emptyList());
				roadGrid.setVisible(false);
				return;
			}
			displayedRoads = displayedRoads.stream()
					.map(r -> {
						if(r.getIndex() <= index) return r;
						r.setIndex(r.getIndex()-1); 
						return r;
					}).collect(Collectors.toList());
			Collections.sort(displayedRoads);
			roadGrid.setItems(displayedRoads);
		}
	}

	private void moveRoadUp(DisplayedRoad road) {
		if(road.getIndex().equals(0)) return;
		int index = road.getIndex();
		displayedRoads.get(index).setIndex(index-1);
		displayedRoads.get(index-1).setIndex(index);
		Collections.sort(displayedRoads);
		roadGrid.setItems(displayedRoads);
	}

	private void moveRoadDown(DisplayedRoad road) {
		if(road.getIndex().equals(displayedRoads.size()-1)) return;
		int index = road.getIndex();
		displayedRoads.get(index).setIndex(index+1);
		displayedRoads.get(index+1).setIndex(index);
		Collections.sort(displayedRoads);
		roadGrid.setItems(displayedRoads);
	}

}
