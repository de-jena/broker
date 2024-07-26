/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ibis.sensinact;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.promise.Promise;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.model.sensinact.ibis.IbisAdmin;
import de.jena.model.sensinact.ibis.IbisDevice;
import de.jena.model.sensinact.ibis.IbisSensinactFactory;

/**
 * This sensiNact connector for ibis data send by the bus, tram, etc via MQTT 
 * 
 */
@RequireEMFJson
@Component
public class IbisConnector {

	private static final Logger LOGGER = System.getLogger(IbisConnector.class.getName());

	private static final String TOPIC = "5g/ibis/";

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;

	@Reference(target = ("(transformator.id=ibisToSensinact)"))
	private ModelTransformator transformator;

	@Reference
	DataUpdate sensiNact;

	@Reference(target = "(id=read)")
	private MessagingService messaging;

	private PushStream<Message> subscription;

	@Activate
	public void activate() {
		try {
			subscription = messaging.subscribe(TOPIC + "#");
			subscription.forEachEvent(this::handle);
		} catch (Exception e) {
			LOGGER.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", TOPIC, e);
		}
		LOGGER.log(Level.INFO, "Ibis connector is active!");
	}

	@Deactivate
	private void deactivate() {
		subscription.close();
	}

	public long handle(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			LOGGER.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onMessage(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	private void onMessage(Message message) {
		String topic = message.topic();
		LOGGER.log(Level.DEBUG, "Event arrived for topic {0}", topic);
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createFileURI(UUID.randomUUID() + "-ibis.json"));
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()), Collections.emptyMap());
			Optional<IbisDevice> device = transform(topic, resource.getContents().get(0));
			if (device.isPresent()) {
				Promise<?> promise = sensiNact.pushUpdate(device.get());
				promise.onFailure(e -> LOGGER.log(Level.ERROR, "Error while pushing signal to sensinact.", e));
			}
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, "Error while parsing json.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private Optional<IbisDevice> transform(String topic, EObject eo) {
		String[] topicSplit = topic.replaceFirst(TOPIC, "").split("/");
		if (topicSplit.length < 2) {
			LOGGER.log(Level.WARNING, "Topic \"{0}\" without deviceId and deviceType.", topic);
			return Optional.empty();
		}
		String deviceType = topicSplit[0];
		String deviceId = topicSplit[1];
		
		IbisDevice device = (IbisDevice) transformator.doTransformation(eo);
		device.setId(deviceId);
		IbisAdmin ibisAdmin = IbisSensinactFactory.eINSTANCE.createIbisAdmin();
		ibisAdmin.setDeviceType(deviceType);
		device.setIbisAdmin(ibisAdmin);
		return Optional.of(device);
	}
}
