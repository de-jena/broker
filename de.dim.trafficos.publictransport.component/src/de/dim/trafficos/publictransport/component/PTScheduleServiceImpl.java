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
package de.dim.trafficos.publictransport.component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.publictransport.apis.PTScheduleService;
import de.dim.trafficos.publictransport.apis.index.PTScheduleIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@Component(name = "PTScheduleService", service = PTScheduleService.class, scope = ServiceScope.PROTOTYPE)
public class PTScheduleServiceImpl implements PTScheduleService {
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	@Reference
	PTScheduleIndexService indexService;
	
	private static final Logger LOGGER = Logger.getLogger(PTScheduleServiceImpl.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTScheduleService#savePTSchedule(de.jena.udp.model.trafficos.publictransport.PTSchedule)
	 */
	@Override
	public void savePTSchedule(PTSchedule... schedules) {
		Map<EObject, Boolean> objToBeSaved = new HashMap<>();
		int counter = 1;
		for(PTSchedule schedule : schedules) {
			Objects.requireNonNull(schedule, "Cannot save null PTSchedule");
			boolean isFirstSave = PTHelper.isFirstSave(schedule, TOSPublicTransportPackage.eINSTANCE.getPTSchedule(), TOSPublicTransportPackage.eINSTANCE.getPTSchedule_ScheduleId(), repo);
			objToBeSaved.put((EObject) schedule, isFirstSave);
			if(objToBeSaved.size() == 100) {
				LOGGER.info(String.format("Saving %d PTSchedule", 100*counter));
				counter++;
				repo.save(objToBeSaved.keySet());
				objToBeSaved.forEach((k,v) -> indexService.indexPTSchedule((PTSchedule) k, v));
				objToBeSaved.keySet().forEach(obj -> repo.detach(obj));
				objToBeSaved.clear();				
			}
			
		}
		if(!objToBeSaved.isEmpty()) {
			LOGGER.info(String.format("Saving %d PTSchedule", objToBeSaved.size()));
			repo.save(objToBeSaved.keySet());
			objToBeSaved.forEach((k,v) -> indexService.indexPTSchedule((PTSchedule) k, v));
			objToBeSaved.keySet().forEach(obj -> repo.detach(obj));
			objToBeSaved.clear();
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTScheduleService#getPTSchedule(java.lang.String)
	 */
	@Override
	public PTSchedule getPTSchedule(String scheduleId) {
		Objects.requireNonNull(scheduleId, "Cannot retrieve PTSchedule with null id");
		return repo.getEObject(publicTransportPackage.getPTSchedule(), scheduleId);
	}

}
