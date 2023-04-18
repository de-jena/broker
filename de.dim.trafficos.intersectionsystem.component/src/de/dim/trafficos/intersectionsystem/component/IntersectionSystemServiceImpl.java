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
package de.dim.trafficos.intersectionsystem.component;

import java.util.List;
import java.util.Objects;

import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.apis.IntersectionSystemService;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage;

@Component(name = "IntersectionSystemService", scope = ServiceScope.PROTOTYPE)
public class IntersectionSystemServiceImpl implements IntersectionSystemService{
	
	@Reference(target = "(repo_id=test.test)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSIntersectionSystemPackage intersectionSystemPackage;

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.IntersectionSystemService#saveIntersectionSystem(de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem)
	 */
	@Override
	public IntersectionSystem saveIntersectionSystem(IntersectionSystem intersectionSystem) {
		Objects.requireNonNull(intersectionSystem, "Canno save null IntersectionSystem!");
		Objects.requireNonNull(intersectionSystem.getIntersectionId(), "Cannot save IntersectionSystem with null intersection id!");
		repo.save(intersectionSystem);
		return intersectionSystem;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.IntersectionSystemService#getIntersectionSystemByIntersection(java.lang.String)
	 */
	@Override
	public IntersectionSystem getIntersectionSystemByIntersection(String intersectionId) {
		Objects.requireNonNull(intersectionId, "Canno retrieve IntersectionSystem by null intersection id!");
		IQuery query = repo.createQueryBuilder().column(intersectionSystemPackage.getIntersectionSystem_IntersectionId()).simpleValue(intersectionId).build();
		return repo.getEObjectByQuery(intersectionSystemPackage.getIntersectionSystem(), query, null);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.IntersectionSystemService#getAllIntersectionSystems()
	 */
	@Override
	public List<IntersectionSystem> getAllIntersectionSystems() {
		return repo.getAllEObjects(intersectionSystemPackage.getIntersectionSystem(), null);
	}


}
