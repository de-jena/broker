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

import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.grid.Grid;

/**
 * 
 * @author ilenia
 * @since Feb 23, 2023
 */
public class TLModuleGrid extends Grid<DisplayedTLTransmitter> {

	/** serialVersionUID */
	private static final long serialVersionUID = 8339762587419646724L;
	
	Map<String, SignalLightGrid> signalLightGridsMap = new HashMap<>();;
	
	public TLModuleGrid() {
		addColumn(DisplayedTLTransmitter::getAddress).setHeader("Address").setAutoWidth(true);
		addColumn(DisplayedTLTransmitter::getSignalGroup).setHeader("Signal Group").setAutoWidth(true);
		addComponentColumn(transmitter -> {
			SignalLightGrid lightGrid = new SignalLightGrid();			
			lightGrid.setItems(transmitter.getLights());
			lightGrid.setVisible(true);
			String key = transmitter.getAddress() +"_"+ transmitter.getName();
			signalLightGridsMap.put(key, lightGrid);
			return lightGrid;
		}).setHeader("Lights").setAutoWidth(true).setKey("light-column");
	}
	
	public Map<String, SignalLightGrid> getSignalLightGridsMap() {
		return signalLightGridsMap;
	}
}
