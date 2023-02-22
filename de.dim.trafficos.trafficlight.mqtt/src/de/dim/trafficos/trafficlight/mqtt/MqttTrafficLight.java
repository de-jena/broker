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
package de.dim.trafficos.trafficlight.mqtt;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dim.trafficos.trafficlight.model.trafficlight.ChangedState;
import de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

@RequireEMFJson
@Component
public class MqttTrafficLight {
	private Logger logger = LoggerFactory.getLogger(MqttTrafficLight.class.getName());

	@Reference
	private TOSTrafficLightPackage tosPackage;
	@Reference(target = "(id=dim)")
	private MessagingService messaging;
	private PushStream<Message> tlSubscribe;

	@Reference(target = "(&(emf.model.name=trafficlight)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ResourceSet resourceSet;

	@Activate
	public void activate() {
		try {
			tlSubscribe = messaging.subscribe("ilsa/#");
			tlSubscribe.forEach(this::handleTrafficLightMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {
		tlSubscribe.close();
	}

	public void handleTrafficLightMessage(Message message) {
		String topic = message.topic();
		StringBuilder sb = new StringBuilder(topic).append("\n");
		// get Intersection name and module address from topic
		byte[] content = message.payload().array();
		if (content.length == 0)
			return;

		logger.debug(new String(content));
		Resource res = resourceSet.createResource(URI.createFileURI("temp.json"), "application/json");
		try {
			res.load(new ByteArrayInputStream(content),
					Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, tosPackage.getTLUpdate()));
			EList<EObject> contents = res.getContents();
			TLUpdate update = (TLUpdate) contents.get(0);
			sb.append(update.getTimestamp()).append(" ");
			for (ChangedState state : update.getChangedStates()) {
				String channel = state.getChannel();
				String color = state.getColor();
				boolean on = state.isOn();
				sb.append(channel).append("_").append(color).append(" ").append(on ? "on, " : "off, ");
			}
			logger.info(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}
	}
}
