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

import java.util.Objects;

import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.publictransport.apis.PTRouteService;
import de.dim.trafficos.publictransport.apis.index.PTRouteIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@Component(name = "PTRouteService", service = PTRouteService.class, scope = ServiceScope.PROTOTYPE)
public class PTRouteServiceImpl implements PTRouteService {
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	PTRouteIndexService indexService;

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTRouteService#savePTRoute(de.jena.udp.model.trafficos.publictransport.PTRoute)
	 */
	@Override
	public void savePTRoute(PTRoute... ptRoutes) {
		for(PTRoute ptRoute : ptRoutes) {
			Objects.requireNonNull(ptRoute, "Cannot save null PTRoute");
			boolean isFirstSave = PTHelper.isFirstSave(ptRoute, TOSPublicTransportPackage.eINSTANCE.getPTRoute(), TOSPublicTransportPackage.eINSTANCE.getPTRoute_RouteId(), repo);
			repo.save(ptRoute);
			indexService.indexPTRoute(ptRoute, isFirstSave);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTRouteService#getPTRoute(java.lang.String)
	 */
	@Override
	public PTRoute getPTRoute(String ptRouteId) {
		Objects.requireNonNull(ptRouteId, "Cannot retrieve PTRoute with null id");
		return repo.getEObject(TOSPublicTransportPackage.eINSTANCE.getPTRoute(), ptRouteId);
	}

}
