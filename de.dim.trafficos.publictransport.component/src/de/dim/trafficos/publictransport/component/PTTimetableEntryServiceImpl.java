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

import java.time.Duration;
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

import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.apis.index.PTTimetableEntryIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@Component(name = "PTTimetableEntryService", service = PTTimetableEntryService.class, scope = ServiceScope.PROTOTYPE)
public class PTTimetableEntryServiceImpl implements PTTimetableEntryService {

	private static final Logger LOGGER = Logger.getLogger(PTTimetableEntryServiceImpl.class.getName());
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	@Reference
	PTTimetableEntryIndexService indexService;
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTTimetableEntryService#savePTTimetableEntry(de.jena.udp.model.trafficos.publictransport.PTTimetableEntry)
	 */
	@Override
	public void savePTTimetableEntry(PTTimetableEntry... ptTimetableEntries) {
		Map<EObject, Boolean> objToBeSaved = new HashMap<>();
		int counter = 1;
		for(PTTimetableEntry ptTimetableEntry : ptTimetableEntries) {
			Objects.requireNonNull(ptTimetableEntry, "Cannot save null PTTimetableEntry");
			boolean isFirstSave = PTHelper.isFirstSave(ptTimetableEntry, publicTransportPackage.getPTTimetableEntry(), repo);
			computeDwellTime(ptTimetableEntry);
			objToBeSaved.put((EObject) ptTimetableEntry, isFirstSave);
			if(objToBeSaved.size() == 100) {
				LOGGER.info(String.format("Saving %d PTTimetableEntry", 100*counter));
				counter++;
				repo.save(objToBeSaved.keySet());
				objToBeSaved.forEach((k,v) -> indexService.indexPTTimetableEntry((PTTimetableEntry) k, v));
				objToBeSaved.keySet().forEach(obj -> repo.detach(obj));
				objToBeSaved.clear();		
			}
		}
		if(!objToBeSaved.isEmpty()) {
			LOGGER.info(String.format("Saving %d PTTimetableEntry", objToBeSaved.size()));
			repo.save(objToBeSaved.keySet());
			objToBeSaved.forEach((k,v) -> indexService.indexPTTimetableEntry((PTTimetableEntry) k, v));
			objToBeSaved.keySet().forEach(obj -> repo.detach(obj));
			objToBeSaved.clear();		
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTTimetableEntryService#getPTTimetableEntry(java.lang.String)
	 */
	@Override
	public PTTimetableEntry getPTTimetableEntry(String ptTimetableEntryId) {
		Objects.requireNonNull(ptTimetableEntryId, "Cannot retrieve PTTimetableEntry with null id");
		return repo.getEObject(publicTransportPackage.getPTTimetableEntry(), ptTimetableEntryId);
	}

	private void computeDwellTime(PTTimetableEntry ptTimetableEntry) {
		if(ptTimetableEntry.getScheduledArrivalTime() != null && ptTimetableEntry.getScheduledDepartureTime() != null) {
			Duration duration = Duration.between(ptTimetableEntry.getScheduledArrivalTime(), ptTimetableEntry.getScheduledDepartureTime());
			ptTimetableEntry.setDwellTime((int) duration.toMinutes());
		}
	}
}
