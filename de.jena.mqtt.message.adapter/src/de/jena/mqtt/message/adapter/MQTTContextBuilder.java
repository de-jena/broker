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

import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.SimpleMessagingContextBuilder;

/**
 * Builder for the MQTT MessageContext
 * @author Mark Hoffmann
 * @since 10.10.2017
 */
public class MQTTContextBuilder extends SimpleMessagingContextBuilder {
	
	private MQTTContext context = new MQTTContext();
	
	/**
	 * Sets the {@link QoS} parameter
	 * @param qos the qualitiy of service parameter. <code>null</code> defaults to 'at least one'
	 * @return
	 */
	public MQTTContextBuilder withQoS(QoS qos) {
		context.setQoS(qos == null ? QoS.AT_LEAST_ONE : qos);
		return this;
	}
	
	/**
	 * Sets retained to true
	 * @return the builder instance
	 */
	public MQTTContextBuilder retained() {
		context.setRetained(true);
		return this;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.osgi.messaging.MessageContextBuilder#build()
	 */
	@Override
	public MessagingContext build() {
		return buildContext(context);
	}

}
