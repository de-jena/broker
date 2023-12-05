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
package de.jena.sensinact.hsmw;

import org.eclipse.sensinact.core.annotation.dto.Data;
import org.eclipse.sensinact.core.annotation.dto.Model;
import org.eclipse.sensinact.core.annotation.dto.Provider;
import org.eclipse.sensinact.core.annotation.dto.Resource;
import org.eclipse.sensinact.core.annotation.dto.Service;

/**
 * 
 * @author Juergen Albert
 * @since 22 Oct 2021
 */
public class DoublePacket {

	@Model
	public String model;
	@Provider
	public String providerId;
	@Service
    public String serviceId;
	@Resource
    public String resourceId;
	@Data
    public Double payload;
    
    public DoublePacket(String model, String providerId, String serviceId, String resourceId, Double data) {
        this.model = model;
		this.providerId = providerId;
        this.serviceId = serviceId.replace("_", "");
        this.resourceId = resourceId;
        this.payload = data;
    }

    public String getProviderId() {
        return providerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public Double getPayload() {
        return payload;
    }
    
	public String getModel() {
		return model;
	}

	/* 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GenericPacket [model=" + model + ", providerId=" + providerId + ", serviceId=" + serviceId
				+ ", resourceId=" + resourceId + ", payload=" + payload + "]";
	}
	
	
}
