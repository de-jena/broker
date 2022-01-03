/**
 * Copyright (c) 2012 - 2021 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.sensinact.rat;

import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttPacket;

/**
 * 
 * @author ungei
 * @since 22 Oct 2021
 */
public class HelloWorldPacket extends MqttPacket {

	/**
	 * Creates a new instance.
	 * @param providerId
	 * @param serviceId
	 * @param resourceId
	 * @param data
	 */
	public HelloWorldPacket(String providerId) {
		super(providerId);
		super.setHelloMessage(true);
	}

}
