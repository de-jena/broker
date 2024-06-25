/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.traficam.mqtt;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.traficam.api.TrafiCamConfig;

@Component(configurationPid = "TrafiCamSender", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MqttLifeSign {
	private static final Logger logger = System.getLogger(MqttLifeSign.class.getName());

	@Reference
	private MessagingService messaging;
	private String topic;

	private ScheduledExecutorService executor;

	@Activate
	public void activate(TrafiCamConfig config) {
		String id = config.id();
		topic = "5g/admin/" + id + "/lifesign";
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::sendLifeSign, 0, 1, TimeUnit.MINUTES);
		logger.log(Level.INFO, "MQTT life sign started. {0}", id);
	}

	@Deactivate
	public void deactivate() {
		executor.shutdown();
		logger.log(Level.INFO, "MQTT life sign stopped.");
	}

	private void sendLifeSign() {
		try {
			logger.log(Level.DEBUG, "Send life sign.");
			ByteBuffer buffer = ByteBuffer.wrap(("" + new Date().getTime()).getBytes());
			messaging.publish(topic, buffer);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error while sending life sign via MQTT.", e);
		}
	}

}
