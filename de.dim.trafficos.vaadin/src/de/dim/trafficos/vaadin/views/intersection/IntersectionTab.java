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
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import de.dim.trafficos.intersection.model.intersection.RoadType;
import de.dim.trafficos.vaadin.helper.GeneralTab;

/**
 * 
 * @author ilenia
 * @since Feb 7, 2023
 */
public class IntersectionTab extends GeneralTab<DisplayedRoad> {

	/** serialVersionUID */
	private static final long serialVersionUID = -5538372422534592428L;

	private TextField intersectionName;
	private TextArea intersectionDescr;
	private Grid<DisplayedRoad> roadGrid;

	private static final String OPTION_ADD_MAIN_ROAD = "Add a main road";
	private static final String OPTION_ADD_SECONDARY_ROAD = "Add a secondary road";

	private static final List<RoadType> MAIN_ROAD_OPTIONS = List.of(RoadType.MAIN_LEFT_RIGHT_MERGE, 
			RoadType.MAIN_LEFT_RIGHT_SEP, RoadType.MAIN_STRAIGHT, RoadType.MAIN_STRAIGHT_LEFT_MERGE,
			RoadType.MAIN_STRAIGHT_LEFT_SEP, RoadType.MAIN_STRAIGHT_RIGHT_MERGE, RoadType.MAIN_STRAIGHT_RIGHT_SEP,
			RoadType.MAIN_STRAIGHT_TURNS_MERGE, RoadType.MAIN_STRAIGHT_TURNS_SEP);

	private static final List<RoadType> SECONDARY_ROAD_OPTIONS = List.of(RoadType.SEC_LEFT_RIGHT_MERGE, RoadType.SEC_LEFT_RIGHT_SEP,
			RoadType.SEC_STRAIGHT_LEFT_MERGE, RoadType.SEC_STRAIGHT_LEFT_SEP, RoadType.SEC_STRAIGHT_RIGHT_MERGE,
			RoadType.SEC_STRAIGHT_RIGHT_SEP, RoadType.SEC_STRAIGHT_TURNS_MERGE, RoadType.SEC_STRAIGHT_TURNS_SEP);

	
	public IntersectionTab() {
		fillLayout();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.vaadin.views.intersection.GeneralTab#fillLayout()
	 */
	@Override
	protected void fillLayout() {
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



	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.vaadin.views.intersection.GeneralTab#clearTab()
	 */
	@Override
	public void clearTab() {
		result.clear();
		roadGrid.setItems(result);
		roadGrid.setVisible(false);		
	}
	
	public String getIntersectionName() {
		return intersectionName.getValue();
	}
	
	public String getIntersectionDescr() {
		return intersectionDescr.getValue();
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
					if(road.getIndex() == result.size()-1) button.setEnabled(false);
				})).setHeader("Move Down");
		roadGrid.setVisible(false);		
		add(roadGrid);
	}

	private Dialog createRoadDialog() {
		Dialog dialog = new Dialog();
		dialog.setWidth("70%");
		dialog.setHeight("70%");
		dialog.setHeaderTitle("New Road");

		VerticalLayout dialogLayout = new VerticalLayout();
		dialogLayout.setSizeFull();
		dialogLayout.setPadding(false);
		dialogLayout.setSpacing(false);
		dialogLayout.setAlignItems(FlexComponent.Alignment.STRETCH);

		VerticalLayout roadOptionsLayout = new VerticalLayout();
		RadioButtonGroup<String> roadOptionsGroup = new RadioButtonGroup<String>();
		roadOptionsGroup.setItems(OPTION_ADD_MAIN_ROAD, OPTION_ADD_SECONDARY_ROAD);
		roadOptionsGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
		roadOptionsLayout.add(roadOptionsGroup);

		ComboBox<RoadType> roadTypeComboBox = new ComboBox<>();
		roadTypeComboBox.setWidthFull();
		roadTypeComboBox.setHelperText("Select Road Type");
		roadTypeComboBox.setVisible(false);

		dialogLayout.add(roadOptionsGroup, roadTypeComboBox);
		dialog.add(dialogLayout);

		Button saveButton = new Button("Add", e -> {
			DisplayedRoad road = new DisplayedRoad(result.size(), roadTypeComboBox.getValue());
			result.add(road);
			dialog.close();
			Collections.sort(result);
			roadGrid.setItems(result);
			roadGrid.setVisible(true); 	
			submitBtn.setEnabled(true);
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
		if(result.remove(road)) {
			result = result.stream()
					.map(r -> {
						if(r.getIndex() <= index) return r;
						r.setIndex(r.getIndex()-1); 
						return r;
					}).collect(Collectors.toList());
			Collections.sort(result);
			roadGrid.setItems(result);
			if(result.isEmpty()) {
				roadGrid.setVisible(false);
				submitBtn.setEnabled(false);
			}			
		}
	}

	private void moveRoadUp(DisplayedRoad road) {
		if(road.getIndex().equals(0)) return;
		int index = road.getIndex();
		result.get(index).setIndex(index-1);
		result.get(index-1).setIndex(index);
		Collections.sort(result);
		roadGrid.setItems(result);
	}

	private void moveRoadDown(DisplayedRoad road) {
		if(road.getIndex().equals(result.size()-1)) return;
		int index = road.getIndex();
		result.get(index).setIndex(index+1);
		result.get(index+1).setIndex(index);
		Collections.sort(result);
		roadGrid.setItems(result);
	}



	
}
