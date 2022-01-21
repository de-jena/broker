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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
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

import de.jena.sensinact.ocpp.structures.MeasurementNotification;
import de.jena.sensinact.ocpp.structures.impl.OcppStructuresPackageImpl;

@Component
@RequireEMFJson
public class EnergyManagement {

	private Mediator mediator;

	private LocalProtocolStackEndpoint<GenericPacket> energyManagementConnector;
	private ExtModelConfiguration<GenericPacket> energyModelManager;

	private MessagingService messaging;

	private ResourceSet resourceSet;
	private PushStream<Message> emSubscribe;
	
	
	public void handleDataEntryMessage(Message message) {
		
		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		try {
			
			byte[] content = message.payload().array();
			ByteArrayInputStream bais = new ByteArrayInputStream(content);
			resource.load(bais, saveOptions);
			resource.getContents().stream().findFirst().map(o -> (MeasurementNotification)  o).ifPresent(this::handleMeasurementNotification);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resourceSet.getResources().remove(resource);
			resource.getContents().clear();
		}
	}

	@Activate
	public EnergyManagement(BundleContext bctx, 
			@Reference(target = "(id=dim)") MessagingService messaging,
			@Reference(target="(&(emf.model.name=structures)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED) ResourceSet resourceSet) {
		this.messaging = messaging;
		this.resourceSet = resourceSet;
		mediator = new Mediator(bctx);
		try {

			energyModelManager = ExtModelConfigurationBuilder.instance(mediator, GenericPacket.class
					).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
							).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
									).withStartAtInitializationTime(true
											).build("signalGroup-resource.xml", Collections.<String, String>emptyMap());
			energyManagementConnector = new LocalProtocolStackEndpoint<GenericPacket>(mediator);
			energyManagementConnector.connect(energyModelManager);
			System.out.println("Connecting to hsmw/#");
			emSubscribe = messaging.subscribe("hsmw/#");
			emSubscribe.forEach(this::handleDataEntryMessage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {

		emSubscribe.close();
		if (energyManagementConnector != null) {
			energyManagementConnector.stop();
		}
	}
	
	
	private void handleMeasurementNotification(MeasurementNotification notification) {
			
		List<GenericPacket> packets = transform(notification, OcppStructuresPackageImpl.Literals.NOTIFICATION__SOURCE_ID);
		packets.forEach(t -> {
			try {
				energyManagementConnector.process(t);
			} catch (InvalidPacketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

	/**
	 * @param notification
	 * @param idValue 
	 * @return
	 */
	private List<GenericPacket> transform(EObject notification, EAttribute idValue) {
		List<GenericPacket> packages = new ArrayList<GenericPacket>();
		String id = notification.eGet(idValue).toString();
		packages.add(new GenericPacket(id, "admin", "model", EcoreUtil.getURI(notification.eClass()).toString()));
		notification.eClass().getEAllAttributes().stream()
		.filter(attribute -> idValue != attribute)
		.map(a -> new GenericPacket(id, notification.eClass().getName(), a.getName(),notification.eGet(a)))
		.forEach(packages::add);
		return packages;
	}
}
