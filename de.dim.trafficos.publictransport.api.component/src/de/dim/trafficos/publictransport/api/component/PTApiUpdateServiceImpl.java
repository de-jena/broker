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
package de.dim.trafficos.publictransport.api.component;

import java.util.Collections;
import java.util.List;

import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.publictransport.apis.PTApiScheduleService;
import de.dim.trafficos.publictransport.apis.PTApiUpdateService;
import de.dim.trafficos.publictransport.apis.search.PTUpdateSearchService;
import de.jena.udp.model.trafficos.publictransport.PTTripUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport_api.Schedule;
import de.jena.udp.model.trafficos.publictransport_api.TripUpdate;
import de.jena.udp.model.trafficos.publictransport_api.Update;

/**
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
@Component(name = "PTApiUpdateService", service = PTApiUpdateService.class, scope = ServiceScope.PROTOTYPE)
public class PTApiUpdateServiceImpl implements PTApiUpdateService {
	
	@Reference(target = ("(transformator.id=publictransportToApi)"))
	private ModelTransformator modelTransformator;
	
	@Reference
	PTUpdateSearchService updateSearchService;
	
	@Reference
	PTApiScheduleService apiScheduleService;
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.PTApiUpdateService#getLatestUpdateByTypeAndVehicle(java.lang.String, de.jena.udp.model.trafficos.publictransport.PTUpdateValueType)
	 */
	@Override
	public Update getLatestUpdateByTypeAndVehicle(String vehicleRef, PTUpdateValueType updateType) {
		
		PTUpdate update = updateSearchService.getLatestUpdateByTypeAndVehicle(vehicleRef, updateType);
		if(update == null) return null;
		
		Update apiUpdate = (Update) modelTransformator.doTransformation(update);
		if(apiUpdate == null) return null;
		
		if(update.getValue() instanceof PTTripUpdate tripUpdate) {
			Schedule schedule = apiScheduleService.getScheduleById(tripUpdate.getRefScheduleId());
			((TripUpdate) apiUpdate).setCurrentSchedule(schedule);
		}
		return apiUpdate;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.PTApiUpdateService#getLatestUpdatesByType(de.jena.udp.model.trafficos.publictransport.PTUpdateValueType)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Update> getLatestUpdatesByType(PTUpdateValueType updateType) {
		List<PTUpdate> updates = updateSearchService.getLatestUpdatesByType(updateType);
		if(updates.isEmpty()) return Collections.emptyList();
		return (List<Update>) modelTransformator.doTransformation(updates);
	}

}
