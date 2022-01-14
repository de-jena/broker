/**
 * Copyright (c) 2012 - 2020 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.smart.city.mqtt.api;

/**
 * 
 * @author ilenia
 * @since Jul 27, 2020
 */
public interface SimulatorTestService {

	public void startSimulation();
	
	public void stopSimulation();
}
