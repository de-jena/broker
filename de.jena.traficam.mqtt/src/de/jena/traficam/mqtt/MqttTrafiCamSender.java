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

import java.io.ByteArrayOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.traficam.api.TrafiCamConfig;
import de.jena.traficam.websocket.TrafiCamReader;
import traficam.TrafiCam;
import traficam.TrafiCamObject;

@RequireEMFJson
@Component(configurationPid = "TrafiCamConfig")
public class MqttTrafiCamSender {
	private static final Logger logger = System.getLogger(MqttTrafiCamSender.class.getName());

	Map<String, Object> config = Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz");
	
	@Reference(target = "(emf.resource.configurator.name=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference
	private TrafiCamReader trafficReader;
	private PushStream<TrafiCam> subscribtion;

	@Reference(target = "(id=full)")
	private MessagingService messaging;
	private String topic;

	@Activate
	public void activate(TrafiCamConfig config) {
		String id = config.id();
		topic = "5g/traficam/" + id + "/";
		refreshSubscribtion();
		logger.log(Level.INFO, "MQTT TrafiCam sender started. {0}", id);
	}

	private void refreshSubscribtion() {
		if (subscribtion != null)
			subscribtion.close();
		subscribtion = trafficReader.subscribe();
		subscribtion.forEachEvent(this::handle);
	}

	@Deactivate
	public void deactivate() {
		if (subscribtion != null)
			subscribtion.close();
		logger.log(Level.DEBUG, "MQTT TrafiCam sender stopped.");
	}

	private long handle(PushEvent<? extends TrafiCam> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.WARNING, "PushStream closed.");
			break;
		case DATA:
			event.getData().getObject().forEach(this::sendObject);
			break;
		case ERROR:
			logger.log(Level.ERROR, "PushStream error.", event.getFailure());
			event.getFailure().printStackTrace();
			break;
		default:
			logger.log(Level.WARNING, "PushStream ???.");
			break;
		}
		return 0;
	}

	private void sendObject(TrafiCamObject object) {
		ResourceSet resourceSet = serviceObjects.getService();
		try {
			Resource res = resourceSet.createResource(URI.createFileURI(UUID.randomUUID().toString() + ".json"));
			res.getContents().add(EcoreUtil.copy(object));
//			res.getContents().add(object);
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			res.save(bao, config);
			logger.log(Level.DEBUG, "Send traficam data via MQTT. {0}", new String(bao.toByteArray()));
			ByteBuffer buffer = ByteBuffer.wrap(bao.toByteArray());
			messaging.publish(getTopic(object), buffer);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error while sending telegram via MQTT.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private String getTopic(TrafiCamObject object) {
		short classId = object.getClassId();
		long id = object.getId();
		return topic + classId + "/" + id;
	}
}