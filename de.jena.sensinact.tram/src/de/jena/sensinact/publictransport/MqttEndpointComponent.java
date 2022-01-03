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
package de.jena.sensinact.publictransport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sensinact.gateway.common.bundle.Mediator;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.ExtModelConfiguration;
import org.eclipse.sensinact.gateway.generic.ExtModelConfigurationBuilder;
import org.eclipse.sensinact.gateway.generic.local.LocalProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.generic.packet.InvalidPacketException;
import org.gecko.emf.osgi.json.annotation.RequireEMFJson;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;

import de.dim.trafficos.model.device.DataEntry;
import de.dim.trafficos.model.device.DataValue;
import de.dim.trafficos.model.device.IdNameElement;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.Location;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.Position;
import de.dim.trafficos.model.device.PublicTransportDataEntry;
import de.dim.trafficos.model.device.PublicTransportDataValue;
import de.dim.trafficos.model.device.PublicTransportDataValueType;
import de.dim.trafficos.model.device.PublicTransportDoorChange;
import de.dim.trafficos.model.device.PublicTransportDoorChangeType;
import de.dim.trafficos.model.device.PublicTransportPosition;

/**
 * 
 * @author mark
 * @since 24.09.2021
 */
@RequireEMFJson
@Component(immediate = true)
public class MqttEndpointComponent {

	private Mediator mediator;
	private LocalProtocolStackEndpoint<GenericPacket> tramConnector;
	private ExtModelConfiguration<GenericPacket> tramManager;

	private LocalProtocolStackEndpoint<GenericPacket> signalGroupConnector;
	private ExtModelConfiguration<GenericPacket> signalGroupManager;

	@Reference(target = "(id=dim)")
	private MessagingService messaging;

	@Reference(target="(&(emf.model.name=device)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ResourceSet resourceSet;
	private PushStream<Message> pTSubscribe;
	private PushStream<Message> deSubscribe;
	private PushStream<Message> outSubscribe;
	
	
	public void handlePublicTransportMessage(Message message) {
		
		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		try {
			
			byte[] content = message.payload().array();
			System.out.println("Recieved:");
			System.out.println(new String(content));
			ByteArrayInputStream bais = new ByteArrayInputStream(content);
			resource.load(bais, saveOptions);
			PublicTransportDataEntry ptde = (PublicTransportDataEntry) resource.getContents().get(0);
			
			ptde.getDataValue().forEach(this::handlePublicTransportDataValue);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resourceSet.getResources().remove(resource);
			resource.getContents().clear();
		}
	}

	public void handleDataEntryMessage(Message message) {
		
		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		try {
			
			byte[] content = message.payload().array();
			System.out.println("Recieved Data Entry:");
			System.out.println(new String(content));
			ByteArrayInputStream bais = new ByteArrayInputStream(content);
			resource.load(bais, saveOptions);
			DataEntry de = (DataEntry) resource.getContents().get(0);
			
			de.getValue().forEach(this::handleDataValue);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resourceSet.getResources().remove(resource);
			resource.getContents().clear();
		}
	}

	public void handleIntersectionMessage(Message message) {
		
		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		try {
			
			byte[] content = message.payload().array();
			System.out.println("Recieved Intersection:");
			System.out.println(new String(content));
			ByteArrayInputStream bais = new ByteArrayInputStream(content);
			resource.load(bais, saveOptions);
			Intersection de = (Intersection) resource.getContents().get(0);
			
			registerIntersection(de);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resourceSet.getResources().remove(resource);
			resource.getContents().clear();
		}
	}

	@Activate
	public void activate(BundleContext bctx) {
		mediator = new Mediator(bctx);
		try {
			tramManager = ExtModelConfigurationBuilder.instance(mediator, GenericPacket.class
	            	).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
							).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
									).withStartAtInitializationTime(true
	                    	).build("publictransport-resource.xml", Collections.<String, String>emptyMap());
			tramConnector = new LocalProtocolStackEndpoint<GenericPacket>(mediator);
			tramConnector.connect(tramManager);

			signalGroupManager = ExtModelConfigurationBuilder.instance(mediator, GenericPacket.class
					).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
							).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
									).withStartAtInitializationTime(true
											).build("signalGroup-resource.xml", Collections.<String, String>emptyMap());
			signalGroupConnector = new LocalProtocolStackEndpoint<GenericPacket>(mediator);
			signalGroupConnector.connect(tramManager);
			
//			System.out.println("saying hello");
//			GenericPacket hello = new GenericPacket("test rat");
//			hello.setHelloMessage(true);
//			connector.process(hello);
//			
			
			System.out.println("Saying Hello");
			
			pTSubscribe = messaging.subscribe("public/transport/data/entry");
			pTSubscribe.forEach(this::handlePublicTransportMessage);

			outSubscribe = messaging.subscribe("intersection/output");
			outSubscribe.forEach(this::handleIntersectionMessage);

			deSubscribe = messaging.subscribe("intersection/data/entry");
			deSubscribe.forEach(this::handleDataEntryMessage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {
		pTSubscribe.close();
		if (tramConnector != null) {
			tramConnector.stop();
		}

		deSubscribe.close();
		outSubscribe.close();
		if (signalGroupConnector != null) {
			signalGroupConnector.stop();
		}
	}
	
	
	/**
	 * @param de
	 */
	private void handleDataValue(DataValue dv) {
		IdNameElement element = dv.getElement();
		if(element instanceof Output) {
			Output out = (Output) element;
			GenericPacket packet = new GenericPacket(out.getId(), out.getType(), "value", dv.getValue());
			try {
				signalGroupConnector.process(packet);
			switch (out.getType()) {
			case "SGR":
				String icon = getSignalIcon(dv.getValue(), out.getName().startsWith("K")); 
				if(icon != null) {
					packet = new GenericPacket(out.getId(), "admin", "icon", icon);
					signalGroupConnector.process(packet);
				}
				break;
			case "DET":
//				String icon = getSignalIcon(dv.getValue(), out.getName().startsWith("K")); 
//				if(icon != null) {
//					packet = new GenericPacket(out.getId(), "admin", "icon", icon);
//					signalGroupConnector.process(packet);
//				}
				break;

			default:
				break;
			}
			} catch (InvalidPacketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	/**
	 * @param value
	 * @param startsWith
	 * @return
	 */
	private String getSignalIcon(String value, boolean car) {
		switch (value) {
		case "RED":
			return car ? "carRed" : "pedRed"; 
		case "GREEN":
			return car ? "carGreen" : "pedGreen"; 
		case "AMBER":
			return car ? "carAmber" : null; 
		case "RED_AMBER":
			return car ? "carRedAmber" : null; 
		default:
			return car ? "car" : "ped"; 
		}
	}

	private void handlePublicTransportDataValue(PublicTransportDataValue value) {
		String name = value.getValue().getName();
		try {
			if(value.getType() == PublicTransportDataValueType.GEO_INFO) {
				PublicTransportPosition position = (PublicTransportPosition) value.getValue();
				
				GenericPacket packet = new GenericPacket(name, "admin", "location", position.getPosition().getLatitude() + ":" + position.getPosition().getLongitude());
				tramConnector.process(packet);
			} else if (value.getType() == PublicTransportDataValueType.DOOR_CHANGE) {
				PublicTransportDoorChange doorChange = (PublicTransportDoorChange) value.getValue();
				GenericPacket packet = new GenericPacket(name, "vehicle", "door_status", doorChange.getType().toString());
				tramConnector.process(packet);
				GenericPacket doorStatus = new GenericPacket(name, "admin", "icon", doorChange.getType() == PublicTransportDoorChangeType.DOOR_OPEN ? "tram_open" : "tram_closed");
				tramConnector.process(doorStatus);
			}
		} catch (InvalidPacketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param de
	 */
	private void registerIntersection(Intersection intersection) {
		intersection.getOutput().stream().filter(o -> "SGR".equals(o.getType()) || "DET".equals(o.getType())).forEach(this::handleOutput);
	}
	

	private void handleOutput(Output out) {
		System.out.println("Creating Intersection");
		GenericPacket packet = new GenericPacket(out.getId(), "admin", "friendlyName", out.getName());
		try {
			signalGroupConnector.process(packet);
			// TODO Auto-generated catch block
			if(!out.getLocation().isEmpty()) {
				Position p = (Position) out.getLocation().get(0);
				packet = new GenericPacket(out.getId(), "admin", "location", p.getLatitude() + ":" + p.getLongitude());
				signalGroupConnector.process(packet);
			}
			packet = new GenericPacket(out.getId(), out.getType(), "description", out.getDescription());
			signalGroupConnector.process(packet);
			String icon = determinIcon(out);
			packet = new GenericPacket(out.getId(), "admin", "icon", icon);
			signalGroupConnector.process(packet);
		} catch (InvalidPacketException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param out
	 * @return
	 */
	private String determinIcon(Output out) {
		if(out.getType().equals("DET"))
			return "default";
		if(out.getName().startsWith("S")) {
			return "default";
		}
		if(out.getName().startsWith("K")) {
			return "car";
		} else {
			return "ped";
		}
	}
}
