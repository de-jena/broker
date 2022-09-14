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
package org.gecko.sensinact.rat;

import java.util.Collections;
import java.util.concurrent.Executors;

import org.eclipse.sensinact.gateway.common.bundle.Mediator;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.ExtModelConfiguration;
import org.eclipse.sensinact.gateway.generic.ExtModelConfigurationBuilder;
import org.eclipse.sensinact.gateway.generic.packet.InvalidPacketException;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttPacket;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttAuthentication;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttBroker;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttBroker.Builder;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttTopic;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.listener.MqttTopicMessage;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.promise.PromiseFactory;

/**
 * 
 * @author mark
 * @since 24.09.2021
 */
@Component(immediate = true, configurationPolicy = ConfigurationPolicy.REQUIRE, configurationPid = "MQTT")
public class MqttEndpointComponent {

	private Mediator mediator;
	private MqttProtocolStackEndpoint connector;
	private ExtModelConfiguration<MqttPacket> manager;
	private PromiseFactory pf = new PromiseFactory(Executors.newCachedThreadPool());

	@Activate
	public void activate(MqttConfig config, BundleContext bctx) {
		mediator = new Mediator(bctx);
		String topicName = config.topic();
		try {
			manager = ExtModelConfigurationBuilder.instance(mediator, MqttPacket.class
					).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
							).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
									).withStartAtInitializationTime(true
											).build("gpsrat-resource.xml", Collections.<String, String>emptyMap());
			manager.setObserved(Collections.singletonList(topicName.replace("#", "*")));
			connector = new MqttProtocolStackEndpoint(mediator);
			MqttAuthentication auth = null;
			if (config.username() != null) {
				auth = new MqttAuthentication.Builder().username(config.username()).password(config.password()).build();
			}
			MqttTopic topic = new MqttTopic(topicName, new MqttTopicMessage() {

				@Override
				protected void messageReceived(String topic, String content) {
					pf.submit(()->handleMessage(topic, topicName)).onSuccess(connector::process);
				}
			});
			Builder brokerBuilder = new MqttBroker.Builder().host(config.host()).topics(Collections.singletonList(topic));
			if (auth != null) {
				brokerBuilder = brokerBuilder.authentication(auth);
			}
			MqttBroker broker = brokerBuilder.build();
			connector.addBroker(broker);
			connector.connect(manager);
			
//			System.out.println("saying hello");
//			MqttPacket hello = new MqttPacket("test rat");
//			hello.setHelloMessage(true);
//			connector.process(hello);
//			
			MqttPacket friendlyName = new MqttPacket("test rat", "admin", "blablub", "testFriendlyName");
			connector.process(friendlyName);
//
			MqttPacket location = new MqttPacket("test rat", "admin", "location", "50:41");
			connector.process(location);

			MqttPacket speed = new MqttPacket("test rat", "position", "speed", "1");
			connector.process(speed);
			
			friendlyName = new MqttPacket("test rat 2", "admin", "friendlyName", "testFriendlyName 2");
			connector.process(friendlyName);
//
			location = new MqttPacket("test rat 2", "admin", "location", "50:42");
			connector.process(location);

			speed = new MqttPacket("test rat 2", "position", "speed", "1");
			connector.process(speed);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Deactivate
	public void deactivate() {
		MqttPacket bye = new MqttPacket("test rat");
		bye.setGoodbyeMessage(true);
		bye = new MqttPacket("test rat 2");
		bye.setGoodbyeMessage(true);
		try {
			connector.process(bye);
		} catch (InvalidPacketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (connector != null) {
			connector.stop();
		}
	}
	
	private MqttPacket handleMessage(String topic, String message) {
		String deviceTopic = topic.replace("gpsrat/", "");
		String providerId = deviceTopic.substring(0, deviceTopic.indexOf("/"));
		System.err.println("topic: " + topic  +", content: " + message + ", provider: " + providerId);
		return new MqttPacket(providerId, GPSRatConstants.SERVICE_ID, GPSRatConstants.RESOURCE_SPEED, message);
	}

}
