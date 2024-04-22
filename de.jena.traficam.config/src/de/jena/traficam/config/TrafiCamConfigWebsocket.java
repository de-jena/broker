package de.jena.traficam.config;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import org.eclipse.jetty.websocket.api.RemoteEndpoint;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WriteCallback;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

/**
 * Copyright (c) 2012 - 2022 Data In Motion and others. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Data In Motion - initial API and implementation
 */

@WebSocket(idleTimeout = 100000)
public class TrafiCamConfigWebsocket {

	private static final Logger logger = System.getLogger(TrafiCamConfigWebsocket.class.getName());
	private ConfigChangedCallBack cfgChangedCallback;

	public TrafiCamConfigWebsocket(ConfigChangedCallBack cfgChangedCallback) {
		this.cfgChangedCallback = cfgChangedCallback;
	}


	@OnWebSocketConnect
	public void onConnect(Session session) {
		logger.log(Level.INFO, "OnConnect: " + session);
		subscribe(session.getRemote());
	}

	private void subscribe(RemoteEndpoint remoteEndpoint) {
		remoteEndpoint.sendString("""
				{
					"messageType":"Subscription",
					"subscription":{
						"type":"Event",
						"action":"Subscribe"
					},
					"inclusion": [{
						"type":"Configuration"
					}]
				}""", WriteCallback.NOOP);
	}

	@OnWebSocketMessage
	public void onMessage(Session session, String msg) {
		logger.log(Level.DEBUG, "OnMessage: " + msg);
		cfgChangedCallback.configChanged();
	}

	@OnWebSocketClose
	public void onWebSocketClose(Session session, int i, String reason) {
		logger.log(Level.INFO, "OnClose:" + session +" Reason: "+ reason);

		session.getRemote().sendString("""
				{
					"messageType":"Subscription",
					"subscription":{
						"type":"Event",
						"action":"Unsubscribe"
					}
				}""", WriteCallback.NOOP);
	}

	@OnWebSocketError
	public void onErrorReceived(Throwable t) {
		logger.log(Level.ERROR, "Error from Websocket: ", t);
	}

}
