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

import java.util.List;
import java.util.Objects;

import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.apis.index.PTStopIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@Component(name = "PTStopService", service = PTStopService.class, scope = ServiceScope.PROTOTYPE)
public class PTStopServiceImpl implements PTStopService {
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	PTStopIndexService indexService;

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTStopService#savePTStop(de.jena.udp.model.trafficos.publictransport.PTStop)
	 */
	@Override
	public void savePTStop(PTStop... ptStops) {
		for(PTStop ptStop : ptStops) {
			Objects.requireNonNull(ptStop, "Cannot save null PTStop");
			boolean isFirstSave = PTHelper.isFirstSave(ptStop, TOSPublicTransportPackage.eINSTANCE.getPTStop(), TOSPublicTransportPackage.eINSTANCE.getPTStop_StopId(), repo);
			repo.save(ptStop);
			indexService.indexPTStop(ptStop, isFirstSave);
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTStopService#getPTStop(java.lang.String)
	 */
	@Override
	public PTStop getPTStop(String ptStopId) {
		Objects.requireNonNull(ptStopId, "Cannot retrieve PTStop with null id");
		return repo.getEObject(TOSPublicTransportPackage.eINSTANCE.getPTStop(), ptStopId);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.PTStopService#getAllPTStop()
	 */
	@Override
	public List<PTStop> getAllPTStop() {
		return repo.getAllEObjects(TOSPublicTransportPackage.eINSTANCE.getPTStop());
	}

}
