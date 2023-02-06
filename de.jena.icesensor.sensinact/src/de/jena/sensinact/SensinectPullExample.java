/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;

@Component(immediate = true)
@EventTopics(value = "*")
public class SensinectPullExample implements TypedEventHandler<IceSensorDto> {

	@Override
	public void notify(String topic, IceSensorDto event) {
		System.out.println("Ice: " + event.data);
	}
}
