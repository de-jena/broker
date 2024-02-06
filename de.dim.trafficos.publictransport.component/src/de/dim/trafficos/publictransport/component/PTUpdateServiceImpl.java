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

import de.dim.trafficos.publictransport.apis.PTUpdateService;
import de.dim.trafficos.publictransport.apis.index.PTUpdateIndexService;
import de.dim.trafficos.publictransport.component.helper.PTHelper;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 4, 2023
 */
@Component(name = "PTUpdateService", service = PTUpdateService.class, scope = ServiceScope.PROTOTYPE)
public class PTUpdateServiceImpl implements PTUpdateService {
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	@Reference
	PTUpdateIndexService indexService;


	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTUpdateService#savePTUpdate(de.jena.udp.model.trafficos.publictransport.PTUpdate)
	 */
	@Override
	public void savePTUpdate(PTUpdate... ptUpdates) {
		for(PTUpdate ptUpdate : ptUpdates) {
			Objects.requireNonNull(ptUpdate, "Cannot save null PTUpdate");
			boolean isFirstSave = PTHelper.isFirstSave(ptUpdate, publicTransportPackage.getPTUpdate(), repo);
			repo.save(ptUpdate);
			indexService.indexPTUpdate(ptUpdate, isFirstSave);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTUpdateService#getPTUpdate(java.lang.String)
	 */
	@Override
	public PTUpdate getPTUpdate(String ptUpdateId) {
		Objects.requireNonNull(ptUpdateId, "Cannot retrieve PTUpdate with null id");
		return repo.getEObject(publicTransportPackage.getPTUpdate(), ptUpdateId);
	}

}
