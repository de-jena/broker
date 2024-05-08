/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.traficam.config;

import java.io.ByteArrayOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.gecko.adapter.mqtt.MQTTContextBuilder;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.metatype.annotations.Designate;

import de.jena.traficam.CamConfig;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamPackage;
import de.jena.traficam.api.TrafiCamConfig;

/**
 * Reads traficam camera configuration via rest api calls and sends it to MQTT broker
 * 
 * @author grune
 * @since Apr 23, 2024
 */
@RequireEMFJson
@Component(configurationPid = "TrafiCamWSC", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = TrafiCamConfig.class)
public class CameraConfig {
	/** _5G_CONFIG_TRAFICAM */
	private static final String TOPIC_PREFIX = "5g/config/traficam/";

	private static final Logger logger = System.getLogger(CameraConfig.class.getName());

	private static final String CLASSMAP_PATH = "/classmap";
	private static final String CALIBRATION_PATH = "/camera/info";

	@Reference
	private MessagingService messaging;
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	TrafiCamPackage trafiCamPackage;
	@Reference
	TrafiCamFactory trafiCamFactory;

	private WebSocketClient client;
	private String id;
	private String address;

	@Activate
	public void activate(TrafiCamConfig config) {
		id = config.id();
		address = config.address();
		CamConfig camConfig = loadConfigRest();
		sendConfigMQTT(camConfig);
		subscribeWebSocket(config.address());
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

	private void subscribeWebSocket(String address) {
		try {
			client = new WebSocketClient();
			java.net.URI dest = new java.net.URI("ws://" + address + "/api/subscriptions");
			client.start();
			TrafiCamConfigWebsocket socket = new TrafiCamConfigWebsocket(this::refresh);
			ClientUpgradeRequest request = new ClientUpgradeRequest();
			client.connect(socket, dest, request);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error while websocket subscription. {0} ", e);
		}
	}

	private void refresh() {
		logger.log(Level.INFO, "Update configuration for {0}.", id);

		CamConfig config = loadConfigRest();
		sendConfigMQTT(config);
	}

	private CamConfig loadConfigRest() {
		String path = "http://" + address + "/api";
		CamConfig config = loadConfig(path + CALIBRATION_PATH);
		CamConfig classMapConfig = loadConfig(path + CLASSMAP_PATH);
		config.getClassMap().addAll(classMapConfig.getClassMap());
		return config;
	}

	private void sendConfigMQTT(CamConfig config) {
		try {
			BinaryResourceImpl res = new BinaryResourceImpl();
			res.getContents().add(EcoreUtil.copy(config));
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			res.save(bao, null);
			ByteBuffer buffer = ByteBuffer.wrap(bao.toByteArray());
			MessagingContext ctx = new MQTTContextBuilder().retained().build();
			messaging.publish(TOPIC_PREFIX + id + "/retained", buffer, ctx);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error writing intersection configuration from {0}.\n{1}", config, e);
		}
	}

	private CamConfig loadConfig(String address) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI(address), "application/json");
		try {
			Map<String, Object> loadOption = new HashMap<>();
			loadOption.put(EMFJs.OPTION_ROOT_ELEMENT, trafiCamPackage.getCamConfig());
			resource.load(loadOption);
			CamConfig config = (CamConfig) resource.getContents().get(0);
			EList<Diagnostic> errors = resource.getErrors();
			if (!errors.isEmpty())
				errors.forEach(diag -> logger.log(Level.ERROR, diag.getMessage()));
			return config;
		} catch (Throwable e) {
			logger.log(Level.ERROR, "Error while reading camera configuration", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
		return null;
	}

}
