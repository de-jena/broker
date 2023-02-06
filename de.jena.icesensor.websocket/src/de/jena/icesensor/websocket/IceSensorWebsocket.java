package de.jena.icesensor.websocket;

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

@WebSocket(idleTimeout = -1)
public class IceSensorWebsocket {

	private static final Logger logger = System.getLogger(IceSensorWebsocket.class.getName());
	private boolean connected;
	private IceSensorReader reader;

	public IceSensorWebsocket(IceSensorReader reader) {
		this.reader = reader;
	}

	@OnWebSocketConnect
	public void onConnect(Session session) {
		logger.log(Level.INFO, "OnConnect: " + session);
		subscribe(session.getRemote());

	}

	private void subscribe(RemoteEndpoint remoteEndpoint) {
		remoteEndpoint.sendString(
				"{\"stream\": \"livedata\",\"request_id\": \"MyId1234567890\", \"action\": \"subscribe\"}",
				new WriteCallback() {

					@Override
					public void writeFailed(Throwable arg0) {
						connected = false;

					}

					@Override
					public void writeSuccess() {
						connected = true;
					}
				});
	}

	@OnWebSocketMessage
	public void onMessage(Session session, String msg) {
		logger.log(Level.INFO, "OnMessage: " + msg);
		reader.read(msg);
	}

	@OnWebSocketClose
	public void onWebSocketClose(Session session, int i, String reason) {
		logger.log(Level.INFO, "OnClose:" + session + reason);
		while (!connected)
			try {
				Thread.sleep(60000);
				subscribe(session.getRemote());
				Thread.sleep(10000);
			} catch (InterruptedException e) {

			}
	}

	@OnWebSocketError
	public void onErrorReceived(Throwable t) {
		t.printStackTrace();
	}

}
