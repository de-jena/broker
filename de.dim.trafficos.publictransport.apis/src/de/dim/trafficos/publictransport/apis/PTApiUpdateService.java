/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.publictransport.apis;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport_api.Update;

/**
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
@ProviderType
public interface PTApiUpdateService {

	Update getLatestUpdateByTypeAndVehicle(String vehicleRef, PTUpdateValueType updateType);
	
	List<Update> getLatestUpdatesByType(PTUpdateValueType updateType);
}
