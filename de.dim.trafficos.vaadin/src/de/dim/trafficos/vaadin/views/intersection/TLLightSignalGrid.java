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

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;

/**
 * 
 * @author ilenia
 * @since Feb 8, 2023
 */
public class TLLightSignalGrid extends Grid<LightSignal> {

	/** serialVersionUID */
	private static final long serialVersionUID = -7050525617140528220L;

	public TLLightSignalGrid(TLSignalTransmitter transmitter) {
		addColumn(new ComponentRenderer<>(Checkbox::new, (box, light) -> {
			box.setValue(light.isBliking());
			box.setEnabled(false);
		})).setHeader("Blinking").setAutoWidth(true);
		addColumn(LightSignal::getValue).setHeader("Type").setAutoWidth(true);
		addColumn(
				new ComponentRenderer<>(Button::new, (button, light) -> {
					button.addClickListener(e -> {
						transmitter.getLightSignal().remove(light);
						if(transmitter.getLightSignal().isEmpty()) setVisible(false);
						else {
							setItems(transmitter.getLightSignal());
							setVisible(true);
						}
					});
					button.setIcon(new Icon(VaadinIcon.TRASH));
				})).setHeader("Delete").setAutoWidth(true);
		setItems(transmitter.getLightSignal());
		setWidthFull();
		setAllRowsVisible(true);
		setVisible(false);
	}

}
