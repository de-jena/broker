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

import org.eclipse.sensinact.gateway.generic.packet.Packet;
import org.eclipse.sensinact.gateway.generic.packet.annotation.Data;
import org.eclipse.sensinact.gateway.generic.packet.annotation.GoodbyeMessage;
import org.eclipse.sensinact.gateway.generic.packet.annotation.HelloMessage;
import org.eclipse.sensinact.gateway.generic.packet.annotation.ResourceID;
import org.eclipse.sensinact.gateway.generic.packet.annotation.ServiceID;
import org.eclipse.sensinact.gateway.generic.packet.annotation.ServiceProviderID;

/**
 * 
 * @author ungei
 * @since 22 Oct 2021
 */
public class GenericPacket implements Packet {


	protected String providerId;
    protected String serviceId;
    protected String resourceId;
    protected String payload;
    
    @HelloMessage
    private boolean helloMessage;
    @GoodbyeMessage
    private boolean goodbyeMessage;

    /**
     * Creates a new instance.
     * @param providerId
     * @param serviceId
     * @param resourceId
     * @param data
     */
    public GenericPacket(String providerId) {
    	this.providerId = providerId;
    	helloMessage = true;
    }
    
    public GenericPacket(String providerId, String serviceId, String resourceId, String data) {
        this.providerId = providerId;
        this.serviceId = serviceId;
        this.resourceId = resourceId;
        this.payload = data;
    }

    @ServiceProviderID
    public String getProviderId() {
        return providerId;
    }

    @ServiceID
    public String getServiceId() {
        return serviceId;
    }

    @ResourceID
    public String getResourceId() {
        return resourceId;
    }

    @Data
    public String getPayload() {
        return payload;
    }

    @Override
    public byte[] getBytes() {
        return null;
    }

    public void setHelloMessage(boolean helloMessage) {
        this.helloMessage = helloMessage;
    }

    public void setGoodbyeMessage(boolean goodbyeMessage) {
        this.goodbyeMessage = goodbyeMessage;
    }
	
}
