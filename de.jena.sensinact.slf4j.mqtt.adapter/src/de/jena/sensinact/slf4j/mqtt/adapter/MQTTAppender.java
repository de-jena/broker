/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.slf4j.mqtt.adapter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.AsyncAppenderBase;
import ch.qos.logback.classic.LoggerContext;

import java.nio.ByteBuffer;

import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Juergen Albert
 * @since 25 Aug 2023
 */
@Component
public class MQTTAppender extends AppenderBase<ILoggingEvent>{

	/** ATTACH */
	private static final String ATTACH = "attach ";
	private static final String DETACH = "detach ";
	MessagingService messaging;
	
	@Activate
	public MQTTAppender(@Reference(target = "(id=logging)") MessagingService messaging) {
		LoggerFactory.getLogger("MQTT Appender").warn("Activating");
		this.messaging = messaging;
		setName("MQTT Logger");
		try {
			messaging.subscribe("log/control").forEach(this::config);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.start();
	}
	
	@Deactivate
	void deactivate() {
		stop();
	}
	
	private void config(Message message) {
		String cmd = new String(message.payload().array());
		if(cmd.startsWith(ATTACH)) {
			registerForLogger(cmd.substring(ATTACH.length()).trim());
		}
		if(cmd.startsWith(DETACH)) {
			unregisterForLogger(cmd.substring(DETACH.length()).trim());
		}
	}
	
	
	/**
	 * @param trim
	 */
	private void registerForLogger(String logger) {
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		
		lc.getLogger(logger).addAppender(this);
	}

	/**
	 * @param trim
	 */
	private void unregisterForLogger(String logger) {
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		
		lc.getLogger(logger).detachAppender(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.qos.logback.core.AsyncAppenderBase#append(java.lang.Object)
	 */
	@Override
	protected void append(ILoggingEvent eventObject) {
		try {
			String message = eventObject.getLoggerName() + " " + eventObject.getFormattedMessage();
			messaging.publish("log/event", ByteBuffer.wrap(message.getBytes()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
