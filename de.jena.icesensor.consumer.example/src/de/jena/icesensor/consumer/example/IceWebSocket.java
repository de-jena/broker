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
package de.jena.icesensor.consumer.example;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emfcloud.jackson.module.EMFModule;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;
import org.eclipse.jetty.websocket.api.RemoteEndpoint;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

import com.fasterxml.jackson.core.JsonProcessingException;

import de.jena.model.icesensor.SensorData;

@WebSocket
public class IceWebSocket {

	private static final Logger logger = System.getLogger(IceWebSocket.class.getName());

	private static IceSensorCollector collector;

	private String handle;

	public static void setCollector(IceSensorCollector collector) {
		IceWebSocket.collector = collector;
	}

	public IceWebSocket() {
		logger.log(Level.INFO, "WebSocket created. {0}", collector);
	}

	@OnWebSocketConnect
	public void onConnect(Session session) {
		logger.log(Level.INFO, "new socket");
		RemoteEndpoint remote = session.getRemote();
		handle = collector.register(sensor -> remote.sendString(toJson(sensor), null));
	}

	private String toJson(SensorData sensor) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		Resource resource = resourceSet.createResource(URI.createFileURI("sensor.json"), "application/json");
		resource.getContents().add(sensor);
		try {
			return EMFModule.setupDefaultMapper().writeValueAsString(resource);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
	}

	@OnWebSocketClose
	public void onClose(Session session, int statusCode, String reason) {
		logger.log(Level.INFO, "socked closed [{0}] {1}", statusCode, reason);
		collector.deregister(handle);
	}

	@OnWebSocketMessage
	public void onText(Session session, String message) {
		logger.log(Level.INFO, "message received: {0}", message);
		if (session.isOpen()) {
			session.getRemote().sendString(message + " " + new Date(), null);
		}
	}

	@OnWebSocketError
	public void onError(Throwable error) {
		logger.log(Level.ERROR, "Error received:", error);
	}

}
