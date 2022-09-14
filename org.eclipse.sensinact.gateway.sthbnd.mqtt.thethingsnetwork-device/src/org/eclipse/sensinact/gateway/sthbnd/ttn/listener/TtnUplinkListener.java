/*
* Copyright (c) 2020-2021 Kentyou.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*    Kentyou - initial API and implementation
 */
package org.eclipse.sensinact.gateway.sthbnd.ttn.listener;

import java.util.List;

import org.eclipse.sensinact.gateway.generic.packet.InvalidPacketException;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.device.MqttProtocolStackEndpoint;
import org.eclipse.sensinact.gateway.sthbnd.mqtt.util.listener.MqttTopicMessage;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnSubPacket;
import org.eclipse.sensinact.gateway.sthbnd.ttn.model.TtnUplinkPayload;
import org.eclipse.sensinact.gateway.sthbnd.ttn.packet.TtnUplinkPacket;
import org.eclipse.sensinact.gateway.util.json.JsonProviderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.json.JsonException;
import jakarta.json.JsonObject;

public class TtnUplinkListener extends MqttTopicMessage {

	private final Logger logger = LoggerFactory.getLogger(TtnUplinkListener.class.getName());
	public static final String DOWNLINK_MARKER = "#DOWNLINK#";
	
    private final MqttProtocolStackEndpoint endpoint;
	private TtnDownlinkListener dowlinkListener;

    public TtnUplinkListener(TtnDownlinkListener downlinkListener, MqttProtocolStackEndpoint endpoint) {
        this.endpoint = endpoint;
        this.dowlinkListener = downlinkListener;
    }

    /* (non-Javadoc)
     * @see org.eclipse.sensinact.gateway.sthbnd.mqtt.util.listener.MqttTopicMessage#messageReceived(java.lang.String, java.lang.String)
     */
    @Override
    public void messageReceived(String topic, String message) {

    	System.out.println("Uplink message " + topic);
    	
        if(logger.isDebugEnabled()) 
            logger.debug("Uplink message: " + message);
        
        String device = topic.split("/")[3];
        JsonObject json = JsonProviderFactory.readObject(message);
        TtnUplinkPayload payload = null;

        try {
            payload = new TtnUplinkPayload(json);
        } catch (JsonException e) {
            logger.error(e.getMessage(),e);
        }
        if (payload != null) {
        	System.out.println("We have a playload ");
        	List<TtnSubPacket> subPackets = payload.getSubPackets();
        	if(subPackets.isEmpty()) {
        		System.out.println("But no subpackages");
        		return;
        	}
        	int i=0;
        	while(i<subPackets.size()) {
        		TtnSubPacket subPacket = subPackets.get(i);
        		if(DOWNLINK_MARKER.equals(subPacket.getMetadata())) {
        			this.dowlinkListener.messageReceived(payload.getApplicationId(),payload.getDeviceId(), subPacket.getValue());
        			subPackets.remove(i);
        			continue;
        		}
        		i++;
        	}       	
        	System.out.println("Creating UplinkPackaget with " + subPackets.size() + " subpackage for " + device);
        	
            TtnUplinkPacket packet = new TtnUplinkPacket(device, subPackets);
            try {
            	System.out.println("Processing UplinkPackaget");
                endpoint.process(packet);
            } catch (InvalidPacketException e) {
                e.printStackTrace();
            }
        }
    }
}
