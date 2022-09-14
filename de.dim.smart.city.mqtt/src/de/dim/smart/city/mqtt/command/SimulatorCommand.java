/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.smart.city.mqtt.command;

import org.apache.felix.service.command.annotations.GogoCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.smart.city.mqtt.api.SimulatorTestService;

/**
 * 
 * 
 * @author Juergen Albert
 * @since 14 Sep 2022
 */
@Component(service = SimulatorCommand.class)
@GogoCommand(scope = "simulator", function= {"startSimulation", "stopSimulation"})
public class SimulatorCommand {

	@Reference
	private SimulatorTestService simulator;
	
	public void startSimulation() {
		simulator.startSimulation();
	}

	public void stopSimulation() {
		simulator.stopSimulation();
	}
}
