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

import java.util.Collections;
import java.util.List;

import org.eclipse.sensinact.gateway.common.bundle.Mediator;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.ExtModelConfiguration;
import org.eclipse.sensinact.gateway.generic.ExtModelConfigurationBuilder;
import org.eclipse.sensinact.gateway.generic.local.LocalProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.generic.packet.InvalidPacketException;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnSubPacket;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnUplinkPayload;
import org.eclipse.sensinact.gateway.util.json.JsonProviderFactory;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.json.JsonException;
import jakarta.json.JsonObject;

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
	private MessagingService messaging;

//	@Reference(target="(&(emf.model.name=device)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
//	private ResourceSet resourceSet;
	private PushStream<Message> subscribe;
	
	
	public void handleMessage(Message message) {
		
		byte[] content = message.payload().array();
		System.out.println(new String(content));
		
        JsonObject json = JsonProviderFactory.readObject(new String(content));
        TtnUplinkPayload payload = null;

        try {
            payload = new TtnUplinkPayload(json);
        } catch (JsonException e) {
        	e.printStackTrace();
                logger.error(e.getMessage(),e);
        }
        if (payload != null) {
        	System.out.println("We have a playload ");
        	List<TtnSubPacket> subPackets = payload.getSubPackets();
        	if(subPackets.isEmpty()) {
        		System.out.println("But no subpackages");
        		return;
        	}
        	System.out.println("Creating UplinkPackaget with " + subPackets.size() + " subpackage for " + payload.getDeviceId());
        	
            TtnUplinkPacket packet = new TtnUplinkPacket(payload.getDeviceId(), subPackets);
            try {
            	System.out.println("Processing UplinkPackaget");
                connector.process(packet);
            } catch (InvalidPacketException e) {
                e.printStackTrace();
            }
        }
		
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
			
//			System.out.println("saying hello");
//			PublicTransportPacket hello = new PublicTransportPacket("test rat");
//			hello.setHelloMessage(true);
//			connector.process(hello);
//			
			
			System.out.println("Here comes TTN");
			
			
//	        String device = "hi";
//	        TtnActivationPayload payload = new TtnActivationPayload("scj-simple-sensors@ttn", device, "260B95D6", new TtnMetadata("2021-11-05T12:48:54.789586818Z", 0, "modulation", "dataRate", "codingRate", Collections.emptyList()));
//			TtnActivationPacket packet = new TtnActivationPacket(device, payload.getSubPackets());
//			connector.process(packet);
			
			
			subscribe = messaging.subscribe("v3/scj-simple-sensors@ttn/devices/eui-70b3d57ed004734a/up");
			subscribe.forEach(this::handleMessage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {
		System.out.println("deactivating TTN");
		subscribe.close();
		if (connector != null) {
			connector.stop();
		}
	}
//
//	private void handleDataValue(PublicTransportDataValue value) {
//		String name = value.getValue().getName();
//		try {
//			if(value.getType() == PublicTransportDataValueType.GEO_INFO) {
//				PublicTransportPosition position = (PublicTransportPosition) value.getValue();
//				
//				PublicTransportPacket packet = new PublicTransportPacket(name, "admin", "location", position.getPosition().getLatitude() + ":" + position.getPosition().getLongitude());
//				connector.process(packet);
//			} else if (value.getType() == PublicTransportDataValueType.DOOR_CHANGE) {
//				PublicTransportDoorChange doorChange = (PublicTransportDoorChange) value.getValue();
//				PublicTransportPacket packet = new PublicTransportPacket(name, "vehicle", "door_status", doorChange.getType().toString());
//				connector.process(packet);
//				PublicTransportPacket doorStatus = new PublicTransportPacket(name, "admin", "icon", doorChange.getType() == PublicTransportDoorChangeType.DOOR_OPEN ? "tram_open" : "tram_closed");
//				connector.process(doorStatus);
//			}
//		} catch (InvalidPacketException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
