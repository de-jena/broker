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
package de.dim.trafficos.vaadin.views.intersection.system.search;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;

/**
 * 
 * @author ilenia
 * @since Feb 23, 2023
 */
public class SignalLightGrid extends Grid<LightSignal> {

	/** serialVersionUID */
	private static final long serialVersionUID = -6874539757291905511L;
	
	public SignalLightGrid() {
		addColumn(LightSignal::getValue).setHeader("Value").setAutoWidth(true);
		addComponentColumn(light -> {
			Button btn = new Button();
			String backgroundColor = "grey";
			switch(light.getValue()) {
			case RED: 
				backgroundColor = "red";
				break;
			case AMBER:
				backgroundColor = "orange";
				break;
			case GREEN: case ORIENTATION_SOUND: case SIGNAL_IS_COMING:
				backgroundColor = "green";
				break;
			default:
				break;
			}
			if(light.isOn()) {
				btn.getElement().getStyle().set("background", backgroundColor);
			} else {
				btn.getElement().getStyle().set("background", "grey");
			}
			return btn;			
		}).setHeader("ON/OFF").setAutoWidth(true);

	}

}
