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
package de.jena.sensinact.hsmw;

import java.io.ByteArrayInputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;

import de.jena.sensinact.ocpp.structures.MeasurementNotification;

@Component
@RequireEMFJson
public class EnergyManagement {

	/** _5G_DEVICES */
	private static final String TOPIC = "5g/devices/#";

	private static final Logger logger = System.getLogger(EnergyManagement.class.getName());
	
	private MessagingService messaging;

	private ResourceSet resourceSet;
	private PushStream<Message> emSubscribe;
	
	@Reference
	private DataUpdate sensiNact;
	
	public void handleDataEntryMessage(Message message) {
		
		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		try {
			
			byte[] content = message.payload().array();
			ByteArrayInputStream bais = new ByteArrayInputStream(content);
			resource.load(bais, saveOptions);
			resource.getContents().stream().findFirst().map(o -> (MeasurementNotification)  o).ifPresent(o -> handleMeasurementNotification(message.topic(), o));
			
		} catch (Exception e) {
			logger.log(Level.ERROR, "Could not parse event for topic " + message.topic(), e);
		} finally {
			resourceSet.getResources().remove(resource);
			resource.getContents().clear();
		}
	}

	@Activate
	public EnergyManagement(BundleContext bctx, 
			@Reference(target = "(id=full)") MessagingService messaging,
			@Reference(target="(&(emf.model.name=structures)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED) ResourceSet resourceSet) {
		this.messaging = messaging;
		this.resourceSet = resourceSet;
		try {
			logger.log(Level.INFO, "Connecting to 5g/devices/#");
			emSubscribe = this.messaging.subscribe(TOPIC);
			emSubscribe.forEach(this::handleDataEntryMessage);
		} catch(Exception e) {
			logger.log(Level.ERROR, "Could not connect to topic " + TOPIC, e);
		}
	}

	@Deactivate
	public void deactivate() {
		emSubscribe.close();
	}
	
	private void handleMeasurementNotification(String topic, MeasurementNotification notification) {
		String[] parts = topic.split("/");
//		List<DoublePacket> packets = transform(notification, parts[parts.length -2], parts[parts.length -1]);
//		packets.forEach(sensiNact::pushUpdate);
	}

	/**
	 * @param notification
	 * @param idValue 
	 * @return
	 */
//	private List<DoublePacket> transform(EObject notification, String provider, String service) {
//		
//		List<DoublePacket> packages = new ArrayList<DoublePacket>();
//		notification.eClass().getEAllAttributes().stream()
//		.map(a -> new DoublePacket(notification.eClass().getName(), provider, service, a.getName(),notification.eGet(a)))
//		.forEach(packages::add);
//		return packages;
//	}
}
