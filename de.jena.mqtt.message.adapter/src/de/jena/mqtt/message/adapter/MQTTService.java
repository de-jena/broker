/**
 * Copyright (c) 2012 - 2017 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mqtt.message.adapter;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingConstants;
import org.gecko.osgi.messaging.MessagingContext;
import org.gecko.osgi.messaging.MessagingService;
import org.gecko.osgi.messaging.SimpleMessage;
import org.osgi.annotation.bundle.Capability;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamBuilder;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.QueuePolicyOption;
import org.osgi.util.pushstream.SimplePushEventSource;

/**
 * MQTT messaging service implementation
 * @author Mark Hoffmann
 * @since 10.10.2017
 */
@Capability(namespace=MessagingConstants.CAPABILITY_NAMESPACE, name="mqtt.adapter", version="1.0.0", attribute= {"vendor=Gecko.io", "implementation=Paho"})
@Component(service=MessagingService.class, name="MQTTService", configurationPolicy=ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class MQTTService implements MessagingService, AutoCloseable, MqttCallback {

	private static final Logger logger = System.getLogger(MQTTService.class.getName());
	
	private MqttClient mqtt;

	private PushStreamProvider provider = new PushStreamProvider();

	private Map<String, SimplePushEventSource<Message>> subscriptions = new ConcurrentHashMap<>();

	private String url;
	
	public MQTTService(){
		// to be used with @Activate
	}

	public MQTTService(MqttClient mqtt){
		this.mqtt = mqtt;
		this.mqtt.setCallback(this);
	}

	@ObjectClassDefinition
	@interface MqttConfig {

		String brokerUrl();
		String username();
		String password(); 
		int maxInflight() default 10; 
	}		

	@Activate	
	void activate(MqttConfig config, BundleContext context) throws Exception {
		logger.log(Level.INFO,"Creating new MQTTService for " + config.brokerUrl());
		url = config.brokerUrl();
		String id = UUID.randomUUID().toString() + "-" + url;
		try {
			MqttConnectOptions options = new MqttConnectOptions();
			if(config.username() != null && config.username().length() != 0) {
				options.setUserName(config.username());
				if(config.password() != null && config.password().length() != 0)
				options.setPassword(config.password().toCharArray());
			}
			options.setMaxInflight(config.maxInflight());
			options.setAutomaticReconnect(true);
			mqtt = new MqttClient(config.brokerUrl(), id);
			mqtt.connect(options);
			mqtt.setCallback(this);
		} catch(Exception e){
			logger.log(Level.ERROR,"Error connecting to MQTT broker " + config.brokerUrl(), e);
			throw e;
		}
		logger.log(Level.INFO,"Connected to " + config.brokerUrl());
	}

	/**
	 * Called on component deactivation
	 * @throws Exception
	 */
	@Deactivate
	void deactivate() throws Exception {
		logger.log(Level.INFO, "Deactivating MQTTService");
		close();
		logger.log(Level.INFO, "Closed MQTTService");
	}

	/* 
	 * (non-Javadoc)
	 * @see java.lang.AutoCloseable#close()
	 */
	@Override
	public void close() throws Exception {
		if(mqtt != null)
			mqtt.disconnect();
			mqtt.close();
	}


	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.paho.client.mqttv3.MqttCallback#connectionLost(java.lang.Throwable)
	 */
	@Override
	public void connectionLost(Throwable ex) {
		logger.log(Level.ERROR, "Lost connection to " + url, ex);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.paho.client.mqttv3.MqttCallback#deliveryComplete(org.eclipse.paho.client.mqttv3.IMqttDeliveryToken)
	 */
	@Override
	public void deliveryComplete(IMqttDeliveryToken deliveryComplete) {
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.paho.client.mqttv3.MqttCallback#messageArrived(java.lang.String, org.eclipse.paho.client.mqttv3.MqttMessage)
	 */
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		Iterator<Entry<String, SimplePushEventSource<Message>>> it = subscriptions.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, SimplePushEventSource<Message>> e = it.next();
			String key = e.getKey();
			boolean match = false;
			if (key.endsWith("#")) {
				key = key.replace("#", "");
				match = topic.startsWith(key) || key.equals(topic);
			} else {
				match = key.equals(topic);
			}
			if(!match){
				continue;
			}
			SimplePushEventSource<Message> source = e.getValue();
			if(source.isConnected()){
				try {
					Message msg = fromPahoMessage(message, topic);
					source.publish(msg);
				} catch(Exception ex){
					logger.log(Level.ERROR,"Error receiving message", e);
				}
			}
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.osgi.messaging.MessagingService#subscribe(java.lang.String)
	 */
	@Override
	public PushStream<Message> subscribe(String topic) throws Exception {
		MessagingContext ctx = new MQTTContextBuilder().withQoS(QoS.AT_LEAST_ONE).build();
		return subscribe(topic, ctx);
	}

	@Override
	public PushStream<Message> subscribe(String topic, MessagingContext context) throws Exception {
		QoS qos = QoS.AT_LEAST_ONE;
		if (context != null && context instanceof MQTTContext) {
			MQTTContext ctx = (MQTTContext) context;
			if (ctx.getQoS() != null) {
				qos = ctx.getQoS();
			}
		}
		try {
			mqtt.subscribe(topic, qos.ordinal());
			String filter = topic.replaceAll("\\*", "#"); // replace MQTT # sign with * for filters
			SimplePushEventSource<Message> source = subscriptions.get(filter);
			if(source == null){
				source = provider.buildSimpleEventSource(Message.class).withQueuePolicy(QueuePolicyOption.BLOCK)
						.withBuffer(new ArrayBlockingQueue<PushEvent<? extends Message>>(4000)).build();
				subscriptions.put(filter, source);
			}
			PushStreamBuilder<Message,BlockingQueue<PushEvent<? extends Message>>> buildStream = org.gecko.util.pushstream.PushStreamHelper.configurePushStreamBuilder(source, context);
			return buildStream.build();
		} catch(MqttException e){
			logger.log(Level.ERROR,"Error subscribing to topic " + topic, e);
			throw new Exception(e.getMessage(), e);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.osgi.messaging.MessagingService#publish(java.lang.String, java.nio.ByteBuffer)
	 */
	@Override
	public void publish(String topic, ByteBuffer content) throws Exception {
		MessagingContext ctx = new MQTTContextBuilder().withQoS(QoS.AT_LEAST_ONE).build();
		publish(topic, content, ctx);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.osgi.messaging.MessagingService#publish(java.lang.String, java.nio.ByteBuffer, org.gecko.osgi.messaging.MessagingContext)
	 */
	@Override
	public void publish(String topic, ByteBuffer content, MessagingContext context) throws Exception {
		QoS qos = QoS.AT_LEAST_ONE;
		boolean retained = false;
		if (context != null && context instanceof MQTTContext) {
			MQTTContext ctx = (MQTTContext) context;
			if (ctx.getQoS() != null) {
				qos = ctx.getQoS();
			}
			retained = ctx.isRetained();
		}
		mqtt.publish(topic, content.array(), qos.ordinal(), retained);
	}
	
	/**
	 * Converts a Paho {@link MqttMessage} into an own one
	 * @param msg the original message
	 * @param topic the topic
	 * @return the converted message
	 */
	public static Message fromPahoMessage(MqttMessage msg, String topic) {
		ByteBuffer content = ByteBuffer.wrap(msg.getPayload());
		MessagingContext context = new MQTTContextBuilder().setRetained(msg.isRetained()).withQoS(QoS.values()[msg.getQos()]).build();
		return new SimpleMessage(topic, content, context);
	}

}
