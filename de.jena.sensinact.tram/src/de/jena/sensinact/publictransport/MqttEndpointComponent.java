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
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;

import de.dim.trafficos.model.device.DataEntry;
import de.dim.trafficos.model.device.DataValue;
import de.dim.trafficos.model.device.IdNameElement;
import de.dim.trafficos.model.device.Intersection;
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

	private MessagingService messaging;

	private ResourceSet resourceSet;
	private PushStream<Message> pTSubscribe;
	private PushStream<Message> deSubscribe;

	@Reference
	private DataUpdate sensiNact;

	public void handlePublicTransportMessage(Message message) {

		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		try {

			byte[] content = message.payload().array();
			System.out.println("Recieved Public Transport Message");
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
			System.out.println("Recieved Data Entry");
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

	@Activate
	public MqttEndpointComponent(BundleContext bctx, @Reference(target = "(id=dim)") MessagingService messaging,
			@Reference(target = "(&(emf.model.name=device)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED) ResourceSet resourceSet) {
		this.messaging = messaging;
		this.resourceSet = resourceSet;
		try {
			pTSubscribe = messaging.subscribe("public/transport/data/entry");
			pTSubscribe.forEach(this::handlePublicTransportMessage);

			deSubscribe = messaging.subscribe("intersection/data/entry");
			deSubscribe.forEach(this::handleDataEntryMessage);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {
		pTSubscribe.close();
		deSubscribe.close();
	}

	/**
	 * @param de
	 */
	private void handleDataValue(DataValue dv) {
		IdNameElement element = dv.getElement();
		if (element instanceof Output) {
			Output out = (Output) element;
			GenericPacket packet = new GenericPacket(out.getId(), out.getType(), "value", dv.getValue());
			sensiNact.pushUpdate(packet);
			switch (out.getType()) {
			case "SGR":
				String icon = getSignalIcon(dv.getValue(), out.getName().startsWith("K"));
				if (icon != null) {
					packet = new GenericPacket(out.getId(), "admin", "icon", icon);
					sensiNact.pushUpdate(packet);
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
		if (value.getType() == PublicTransportDataValueType.GEO_INFO) {
			PublicTransportPosition position = (PublicTransportPosition) value.getValue();

			GenericPacket packet = new GenericPacket(name, "admin", "location",
					position.getPosition().getLatitude() + ":" + position.getPosition().getLongitude());
			sensiNact.pushUpdate(packet);
		} else if (value.getType() == PublicTransportDataValueType.DOOR_CHANGE) {
			PublicTransportDoorChange doorChange = (PublicTransportDoorChange) value.getValue();
			GenericPacket packet = new GenericPacket(name, "vehicle", "door_status",
					doorChange.getType().toString());
			sensiNact.pushUpdate(packet);
			GenericPacket doorStatus = new GenericPacket(name, "admin", "icon",
					doorChange.getType() == PublicTransportDoorChangeType.DOOR_OPEN ? "tram_open" : "tram_closed");
			sensiNact.pushUpdate(doorStatus);
		}
	}

	/**
	 */
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, unbind = "removeIntersection")
	public void addIntersection(Intersection intersection) {
		intersection.getOutput().stream().filter(o -> "SGR".equals(o.getType()) || "DET".equals(o.getType()))
				.forEach(this::handleOutput);
	}

	public void removeIntersection(Intersection intersection) {

	}

	private void handleOutput(Output out) {
		System.out.println("Creating Intersection");
		GenericPacket packet = new GenericPacket(out.getId(), "admin", "friendlyName", out.getName());
		sensiNact.pushUpdate(packet);
		// TODO Auto-generated catch block
		if (!out.getLocation().isEmpty()) {
			Position p = (Position) out.getLocation().get(0);
			packet = new GenericPacket(out.getId(), "admin", "location", p.getLatitude() + ":" + p.getLongitude());
			sensiNact.pushUpdate(packet);
		}
		packet = new GenericPacket(out.getId(), out.getType(), "description", out.getDescription());
		sensiNact.pushUpdate(packet);
		String icon = determinIcon(out);
		packet = new GenericPacket(out.getId(), "admin", "icon", icon);
		sensiNact.pushUpdate(packet);
	}

	/**
	 * @param out
	 * @return
	 */
	private String determinIcon(Output out) {
		if (out.getType().equals("DET"))
			return "default";
		if (out.getName().startsWith("S")) {
			return "default";
		}
		if (out.getName().startsWith("K")) {
			return "car";
		} else {
			return "ped";
		}
	}
}
