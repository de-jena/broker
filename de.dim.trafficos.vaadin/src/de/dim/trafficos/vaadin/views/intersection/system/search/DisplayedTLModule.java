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

import java.util.List;

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;

/**
 * 
 * @author ilenia
 * @since Feb 23, 2023
 */
public class DisplayedTLModule {
	
	String address;
	String signalGroup;
	List<LightSignal> lights;
	
	public DisplayedTLModule(String address, String signalGroup, List<LightSignal> lights) {
		this.address = address;
		this.signalGroup = signalGroup;
		this.lights = lights;
	}

	public String getAddress() {
		return address;
	}
	
	public String getSignalGroup() {
		return signalGroup;
	}
	
	public List<LightSignal> getLights() {
		return lights;
	}
}
