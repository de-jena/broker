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

import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import de.dim.trafficos.common.model.common.Position;
import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;

/**
 * 
 * @author ilenia
 * @since Feb 8, 2023
 */
public class TLModuleDetailsLayout extends VerticalLayout {

	/** serialVersionUID */
	private static final long serialVersionUID = 8539180977878534190L;
	private Grid<TLSignalTransmitter> transmitterGrid;

	public void fillLayout(TLModule module) {
		transmitterGrid = new Grid<>();
		transmitterGrid.addColumn(TLSignalTransmitter::getName).setHeader("Name").setAutoWidth(true);
		transmitterGrid.addColumn(new ComponentRenderer<>(Label::new, (label, transmitter) -> {
			label.setText(transmitter.getSignalGroup().getId());
		})).setHeader("Signal Group").setAutoWidth(true);
		transmitterGrid.addColumn(new ComponentRenderer<>(VerticalLayout::new, (layout, transmitter) -> {
			Position position = transmitter.getLocation().stream().filter(l -> l instanceof Position).map(l -> (Position) l).findFirst().orElse(null);
			if(position == null) {
				layout.add(new Label("N/A"));
			} else {
				String lat = String.valueOf(position.getLatitude());
				String lng = String.valueOf(position.getLongitude());
				Label latLabel = new Label("Lat: " + lat);
				Label lngLabel = new Label("Lng: " + lng);
				layout.add(latLabel, lngLabel);	
			}
		})).setHeader("Location").setAutoWidth(true);
		transmitterGrid.addColumn(new ComponentRenderer<>(VerticalLayout::new, (layout, transmitter) -> {
			List<LightSignal> lightSignals = transmitter.getLightSignal();
			if(lightSignals.isEmpty()) {
				layout.add(new Label("N/A"));
			} else {
				TLLightSignalGrid lightSignalGrid = new TLLightSignalGrid(transmitter);
				lightSignalGrid.setVisible(true);
				layout.add(lightSignalGrid);			
			}			
		})).setHeader("Light Signal").setAutoWidth(true);
		transmitterGrid.addColumn(
				new ComponentRenderer<>(Button::new, (button, transmitter) -> {
					button.addClickListener(e -> {
						module.getSignalTransmitter().remove(transmitter);
						transmitterGrid.setItems(module.getSignalTransmitter());
					});
					button.setIcon(new Icon(VaadinIcon.TRASH));
				})).setHeader("Delete").setAutoWidth(true);
		transmitterGrid.setItems(module.getSignalTransmitter());
		add(transmitterGrid);
	}

}
