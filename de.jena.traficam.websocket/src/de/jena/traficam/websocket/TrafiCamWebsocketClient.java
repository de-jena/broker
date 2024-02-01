package de.jena.traficam.websocket;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URI;

import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import de.jena.traficam.api.TrafiCamConfig;

/**
 * Copyright (c) 2012 - 2022 Data In Motion and others. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Data In Motion - initial API and implementation
 */

@Component(configurationPid = "TrafiCamConfig")
public class TrafiCamWebsocketClient {
	private static final Logger logger = System.getLogger(TrafiCamWebsocketClient.class.getName());

	private WebSocketClient client;
	@Reference
	private TrafiCamReader reader;

	@Activate
	public void activate(TrafiCamConfig config) throws Exception {
		client = new WebSocketClient();
		String url = "ws://" + config.address() + "/api/subscriptions";
		logger.log(Level.INFO, "Connect websocket " + url);
		URI dest = new URI(url);

		client.start();
		TrafiCamWebsocket socket = new TrafiCamWebsocket(reader);
		ClientUpgradeRequest request = new ClientUpgradeRequest();
		client.connect(socket, dest, request);
	}

	@Deactivate
	public void deactivate() throws Exception {
		logger.log(Level.INFO, "Disconnect websocket");
		client.stop();
	}

}
