/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
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

import de.dim.trafficos.publictransport.apis.PTVehicleService;
import de.dim.trafficos.publictransport.apis.index.PTVehicleIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.jena.udp.model.trafficos.publictransport.PTVehicle;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

@Component(name = "PTVehicleService", service = PTVehicleService.class, scope = ServiceScope.PROTOTYPE)
public class PTVehicleServiceImpl implements PTVehicleService {
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	@Reference
	PTVehicleIndexService indexService;


	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTVehicleService#savePTVehicle(de.jena.udp.model.trafficos.publictransport.PTVehicle)
	 */
	@Override
	public void savePTVehicle(PTVehicle... publicTransports) {
		for(PTVehicle publicTransport : publicTransports) {
			Objects.requireNonNull(publicTransport, "Cannot save null PTVehicle");
			boolean isFirstSave = PTHelper.isFirstSave(publicTransport, publicTransportPackage.getPTVehicle(), repo);
			repo.save(publicTransport);
			indexService.indexPTVehicle(publicTransport, isFirstSave);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTVehicleService#getPTVehicle(java.lang.String)
	 */
	@Override
	public PTVehicle getPTVehicle(String publicTransportId) {
		Objects.requireNonNull(publicTransportId, "Cannot retrieve PTVehicle with null id");
		return repo.getEObject(publicTransportPackage.getPTVehicle(), publicTransportId);
	}

}
