/**
 * Copyright (c) 2012 - 2017 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mqtt.message.adapter;

import org.gecko.osgi.messaging.SimpleMessagingContext;

/**
 * MQTT context ot provider additional configurations
 * @author Mark Hoffmann
 * @since 10.10.2017
 */
public class MQTTContext extends SimpleMessagingContext {
	
	private QoS qos;
	private boolean retained = false;
	
	public QoS getQoS() {
		return qos;
	}
	
	public void setQoS(QoS qos) {
		this.qos = qos;
	}
	
	public boolean isRetained() {
		return retained;
	}
	
	public void setRetained(boolean retained) {
		this.retained = retained;
	}

}
