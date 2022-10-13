/**
 * Copyright (c) 2012 - 2021 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.sensinact.gateway.sthbnd.ttn.packet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfcloud.jackson.databind.EMFContext;
import org.eclipse.sensinact.gateway.common.bundle.Mediator;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.ExtModelConfiguration;
import org.eclipse.sensinact.gateway.generic.ExtModelConfigurationBuilder;
import org.eclipse.sensinact.gateway.generic.local.LocalProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.generic.packet.InvalidPacketException;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnSubPacket;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.RxMetadata;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage;
import de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage;

/**
 * 
 * @author mark
 * @since 24.09.2021
 */
@Component(immediate = true)
public class MqttEndpointComponent {

	private Mediator mediator;
	private LocalProtocolStackEndpoint<TtnUplinkPacket> connector;
	private ExtModelConfiguration<TtnUplinkPacket> manager;

	private Logger logger = LoggerFactory.getLogger(MqttEndpointComponent.class.getName());
	
	@Reference(target = "(id=ttn)")
	private MessagingService messagingTtnSimpleSensors;
	
	@Reference(target = "(id=ttn2)")
	private MessagingService messagingTtnSensors;

	@Reference(target="(&(emf.model.name=uplinkpayload)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ResourceSet resourceSet;
	
	@Reference
	private UplinkPayloadPackage uplinkPayloadPackage;
	
	private PushStream<Message> subscriptionSimpleSensors;
	private PushStream<Message> subscriptionSensors;
	
	private static final String SUBSCRIPTION_TOPIC = "v3/#";
	
	
	@SuppressWarnings("rawtypes")
	public void handleMessage(Message message) {
		
		System.out.println("Topic " +  message.topic());
		byte[] content = message.payload().array();
		System.out.println(new String(content));
		
		Resource res = resourceSet.createResource(URI.createFileURI("temp.json"));
		Map<?, ?> options = Collections.singletonMap(EMFContext.Attributes.ROOT_ELEMENT, uplinkPayloadPackage.getTtnUplinkPayload());
		try {
			res.load(new ByteArrayInputStream(content), options);
			if(!res.getContents().isEmpty()) {
				EObject eObj = res.getContents().get(0);
				if(eObj instanceof TtnUplinkPayload) {
					TtnUplinkPayload payload = (TtnUplinkPayload) eObj;
					if(payload != null) {
						System.out.println("We have a playload ");
						List<TtnSubPacket> uplinkSubPackets = extractUplinkSubPackets(payload.getUplinkMessage());
						if(uplinkSubPackets.isEmpty()) {
							System.out.println("But no subpackets");
			        		return;
						}
						System.out.println("Creating UplinkPacket with " + uplinkSubPackets.size() + " subpacket for " + payload.getEndDeviceIds().getDeviceId());
						TtnUplinkPacket packet = new TtnUplinkPacket(payload.getEndDeviceIds().getDeviceId(), uplinkSubPackets);
			            try {
			            	System.out.println("Processing UplinkPacket");
			                connector.process(packet);
			            } catch (InvalidPacketException e) {
			                e.printStackTrace();
			            }
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
            logger.error(e.getMessage(),e);
		}
	}

	@SuppressWarnings("rawtypes")
	private List<TtnSubPacket>  extractUplinkSubPackets(UplinkMessage uplinkMessage) {
		Objects.requireNonNull(uplinkMessage, () -> "UplinkMessage canno be null!");
		List<RxMetadata> metadata = uplinkMessage.getRxMetadata();
		List<TtnSubPacket> subPackets = new ArrayList<>();
		
		metadata.stream().filter(md -> md.getLocation() != null)
		.forEach(md -> {
			subPackets.add(new TtnSubPacket<>("admin", "location", null, null ,md.getLocation().getLatitude() + ":" + md.getLocation().getLongitude()));
		});
		
		EMap<String, Object> decodedPayload = uplinkMessage.getDecodedPayload();
		if(decodedPayload != null) {
			decodedPayload.keySet().stream().map(k -> new TtnSubPacket<>("system", k, null,null,decodedPayload.get(k))).forEach(subPackets::add);
		}
		return subPackets;
	}
	
	@Activate
	public void activate(BundleContext bctx) {
		mediator = new Mediator(bctx);
		try {
			manager = ExtModelConfigurationBuilder.instance(mediator, TtnUplinkPacket.class
	            	).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
							).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
									).withStartAtInitializationTime(true
	                    	).build("ttn-resource.xml", Collections.<String, String>emptyMap());
			connector = new LocalProtocolStackEndpoint<TtnUplinkPacket>(mediator);
			connector.connect(manager);		
			
			System.out.println("Here comes TTN");
			
//			subscribe = messaging.subscribe("v3/scj-simple-sensors@ttn/devices/eui-70b3d57ed004734a/up");
			subscriptionSimpleSensors = messagingTtnSimpleSensors.subscribe(SUBSCRIPTION_TOPIC);
			subscriptionSensors = messagingTtnSensors.subscribe(SUBSCRIPTION_TOPIC);
			subscriptionSimpleSensors.merge(subscriptionSensors).forEach(this::handleMessage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {
		System.out.println("deactivating TTN");
		subscriptionSimpleSensors.close();
		subscriptionSensors.close();
		if (connector != null) {
			connector.stop();
		}
	}
}
