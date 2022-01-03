package org.gecko.sensinact.rat;

import java.util.Collections;

import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.sensinact.gateway.common.annotation.Property;
import org.eclipse.sensinact.gateway.common.bundle.Mediator;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.ExtModelConfiguration;
import org.eclipse.sensinact.gateway.generic.ExtModelConfigurationBuilder;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttActivator;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttPacket;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttAuthentication;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttBroker;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.listener.MqttTopicMessage;
import org.osgi.framework.BundleContext;

//@Header(name = Constants.BUNDLE_ACTIVATOR, value = "${@class}")
public class Activator extends MqttActivator {

    private MqttProtocolStackEndpoint connector;
    private ExtModelConfiguration<MqttPacket> manager;
    @Property(name = "host")
    String host;
    @Property(name = "username")
    String user;
    @Property(name = "password")
    String pwd;
    @Property(name = "topic")
    String topicString;

    public void doStart() throws Exception {
        if (manager == null) {
            manager = ExtModelConfigurationBuilder.instance(super.mediator, MqttPacket.class
        	).withResourceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION.getPolicy())
        	).withServiceBuildPolicy((byte) (BuildPolicy.BUILD_NON_DESCRIBED.getPolicy() | BuildPolicy.BUILD_ON_DESCRIPTION.getPolicy())
        	).withStartAtInitializationTime(true
        	).build("gpsrat-resource.xml", Collections.<String, String>emptyMap());
            manager.setObserved(Collections.singletonList("/sensor/gpsrat/speed"));
        }        
        if (connector == null) 
            connector = new MqttProtocolStackEndpoint(super.mediator);
        MqttAuthentication auth = new MqttAuthentication.Builder().username(user).password(pwd).build();
//        MqttTopic topic = new MqttTopic(topicString, new MqttTopicMessage() {
//			
//			@Override
//			protected void messageReceived(String arg0, String arg1) {
//				System.err.println("arg0 " + arg0  +", arg1 " + arg1);
//			}
//		});
//        MqttBroker broker = new MqttBroker.Builder().host(host).authentication(auth).topics(Collections.singletonList(topic)).build();
//        connector.addBroker(broker);
//        connector.connect(manager);
//        broker.publish(topicString, "{ id: 'test', speed: 85.0, orientation: 249}");
        
    }

    public void doStop() throws Exception {
        connector.stop();
    }

    public Mediator doInstantiate(BundleContext context) {
        return new Mediator(context);
    }
}
