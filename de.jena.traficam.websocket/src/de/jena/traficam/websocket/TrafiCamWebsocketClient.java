package de.jena.traficam.websocket;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URI;

import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

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

//configure using reader config in ConfigurationUpdater#configureClient
@Component(name = "TrafiCamWSC", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = TrafiCamConfig.class)
public class TrafiCamWebsocketClient {
	private static final Logger logger = System.getLogger(TrafiCamWebsocketClient.class.getName());

	private WebSocketClient client;
	// configure using sender config in ConfigurationUpdater#configureClient using .target=(id=something))
	@Reference
	private TrafiCamReader reader;

	@Activate
	public void activate(TrafiCamConfig config) throws Exception {
		client = new WebSocketClient();
		String url = "ws://" + config.address() + "/api/subscriptions";
		logger.log(Level.INFO, "Connect websocket for camera {0} to {1}.",config.id(), url);
		URI dest = new URI(url);

		client.start();
		TrafiCamWebsocket socket = new TrafiCamWebsocket(reader);
		ClientUpgradeRequest request = new ClientUpgradeRequest();
		client.connect(socket, dest, request);
	}

	@Modified
	public void modify(TrafiCamConfig config) throws Exception {
		deactivate();
		activate(config);
	}
	
	@Deactivate
	public void deactivate() throws Exception {
		logger.log(Level.INFO, "Disconnect websocket");
		client.stop();
	}

}
