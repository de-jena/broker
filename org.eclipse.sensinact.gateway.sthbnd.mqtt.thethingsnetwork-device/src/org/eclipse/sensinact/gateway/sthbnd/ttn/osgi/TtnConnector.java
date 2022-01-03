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
package org.eclipse.sensinact.gateway.sthbnd.ttn.osgi;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.sensinact.gateway.common.bundle.Mediator;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.ExtModelConfiguration;
import org.eclipse.sensinact.gateway.generic.ExtModelConfigurationBuilder;
import org.eclipse.sensinact.gateway.generic.packet.InvalidPacketException;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttPacket;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttAuthentication;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttBroker;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttTopic;
import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnActivationListener;
import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnDownlinkListener;
import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnUplinkListener;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnActivationPayload;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnMetadata;
import org.eclipse.sensinact.gateway.sthbnd.ttn.packet.TtnActivationPacket;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * 
 * @author ungei
 * @since 3 Nov 2021
 */
//@Component
public class TtnConnector {

	private Mediator mediator;
	private MqttProtocolStackEndpoint connector;
	private ExtModelConfiguration<MqttPacket> manager;
	
	@Activate
	public void activate(TtnConfig config, BundleContext ctx) {
		System.out.println("!!!!!!!!!!!!!!!!! TTN !!!!!!!!!!!!!!!!!!!!!!!!");
		mediator = new Mediator(ctx);
		manager = ExtModelConfigurationBuilder.instance(mediator, MqttPacket.class
						).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
								).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
										).withStartAtInitializationTime(true
												).build("ttn-resource.xml", Collections.<String, String>emptyMap());

		connector = new MqttProtocolStackEndpoint(mediator);
		
		 MqttAuthentication authentication = new MqttAuthentication.Builder()
	                .username("scj-simple-sensors@ttn")
	                .password("NNSXS.6Z5OFLUZ7WSTECNCNYOCROVBL4ZUKCJ3ZUPIJHQ.LGDZO7FJYSGVIMIATERZRREJZWZN6QS7HOAYYC6G7XYR35HVCOAQ")
	                .build();

        final TtnDownlinkListener ttnDownlinkListener = new TtnDownlinkListener();

        final MqttTopic messageTopic = new MqttTopic("v3/scj-simple-sensors@ttn/devices/+/#",
                new TtnUplinkListener(ttnDownlinkListener, connector));

        final MqttTopic activationTopic = new MqttTopic("v3/scj-simple-sensors@ttn/devices/+/events/activations",
                new TtnActivationListener(connector));
        
        MqttBroker broker = new MqttBroker.Builder()
            .host("eu1.cloud.thethings.network")
            .port(8883)
            .protocol(MqttBroker.Protocol.valueOf("SSL"))
            .authentication(authentication)
            .topics(new ArrayList<MqttTopic>() {{
                add(activationTopic);
                add(messageTopic);
            }}).build();
        ttnDownlinkListener.setBroker(broker);
        connector.addBroker(broker);
        try {
        	broker.connect();
        	manager.connect(connector);
        } catch (Exception e) {
			e.printStackTrace();
		}
        
        String device = "eui-70b3d57ed004734a";
        TtnActivationPayload payload = new TtnActivationPayload("scj-simple-sensors@ttn", device, "260B95D6", new TtnMetadata("2021-11-05T12:48:54.789586818Z", 0, "modulation", "dataRate", "codingRate", Collections.emptyList()));
		TtnActivationPacket packet = new TtnActivationPacket(device, payload.getSubPackets());
        try {
			connector.process(packet);
		} catch (InvalidPacketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Deactivate
	public void deactivate() {
		System.out.println("Disconnecting");
		connector.disconnectBrokers();
	}
}
