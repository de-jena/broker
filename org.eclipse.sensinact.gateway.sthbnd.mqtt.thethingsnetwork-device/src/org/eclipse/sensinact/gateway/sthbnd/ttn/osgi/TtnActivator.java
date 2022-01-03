/*
* Copyright (c) 2020 Kentyou.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*    Kentyou - initial API and implementation
 */

package org.eclipse.sensinact.gateway.sthbnd.ttn.osgi;

import java.util.ArrayList;

import org.eclipse.sensinact.gateway.common.annotation.Property;
import org.eclipse.sensinact.gateway.core.SensiNactResourceModelConfiguration.BuildPolicy;
import org.eclipse.sensinact.gateway.generic.BasisActivator;
import org.eclipse.sensinact.gateway.generic.annotation.SensiNactBridgeConfiguration;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttPacket;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttAuthentication;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttBroker;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.api.MqttTopic;
import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnActivationListener;
import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnDownlinkListener;
import org.eclipse.sensinact.gateway.sthbnd.ttn.listener.TtnUplinkListener;
import org.osgi.annotation.bundle.Header;
import org.osgi.framework.Constants;

@SensiNactBridgeConfiguration(
	startAtInitializationTime = true,
	resourceDefinition = "ttn-resource.xml",
	endpointType = MqttProtocolStackEndpoint.class,
	resourceBuildPolicy = { BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION, BuildPolicy.BUILD_NON_DESCRIBED},
	serviceBuildPolicy = { BuildPolicy.BUILD_COMPLETE_ON_DESCRIPTION, BuildPolicy.BUILD_NON_DESCRIBED})
//@Header(name = Constants.BUNDLE_ACTIVATOR, value = "${@class}")
public class TtnActivator extends BasisActivator<MqttPacket> {

    @Property(name = "the.things.network.application.id")
    public String appId;

    @Property(name = "the.things.network.application.key")
    public String appKey;

    @Property(name = "the.things.network.broker.host")
    public String brokerHost;

    @Property(name = "the.things.network.broker.port",defaultValue = "8883")
    public Integer brokerPort;

    @Property(name = "the.things.network.broker.protocol",defaultValue = "SSL")
    public String brokerProtocol;
   
    @Override
    public void configure() {  
    	if(appId == null || appKey == null)
    		return;
        MqttAuthentication authentication = new MqttAuthentication.Builder()
                .username(appId)
                .password(appKey)
                .build();

        final TtnDownlinkListener ttnDownlinkListener = new TtnDownlinkListener();

        final MqttTopic messageTopic = new MqttTopic("+/devices/+/up",
                new TtnUplinkListener(ttnDownlinkListener, (MqttProtocolStackEndpoint) super.endpoint));

        final MqttTopic activationTopic = new MqttTopic("+/devices/+/events/activations",
                new TtnActivationListener((MqttProtocolStackEndpoint) super.endpoint));
        
        MqttBroker broker = new MqttBroker.Builder()
            .host(brokerHost)
            .port(brokerPort)
            .protocol(MqttBroker.Protocol.valueOf(brokerProtocol))
            .authentication(authentication)
            .topics(new ArrayList<MqttTopic>() {{
                add(activationTopic);
                add(messageTopic);
            }}).build();
        
        ttnDownlinkListener.setBroker(broker);
        ((MqttProtocolStackEndpoint)super.endpoint).addBroker(broker);
    }
}