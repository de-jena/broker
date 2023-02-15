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
package de.dim.trafficos.intersection.component;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.apis.IntersectionService;
import de.dim.trafficos.common.model.common.TOSCommonPackage;
import de.dim.trafficos.intersection.component.helper.IntersectionHelper;
import de.dim.trafficos.intersection.model.intersection.Intersection;
import de.dim.trafficos.intersection.model.intersection.RoadType;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

/**
 * 
 * @author ilenia
 * @since Feb 14, 2023
 */
@Component(name = "IntersectionService", scope = ServiceScope.PROTOTYPE)
public class IntersectionServiceImpl implements IntersectionService {
	
	@Reference(target = "(repo_id=test.test)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	QueryRepository repo;
	
	@Reference
	TOSIntersectionPackage intersectionPackage;
	
	@Reference
	TOSCommonPackage commonPackage;

	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.IntersectionService#createIntersection(java.util.Map)
	 */
	@Override
	public Intersection createIntersection(Map<Integer, RoadType> roadsMap) {
		try {
			return IntersectionHelper.createIntersection(roadsMap, intersectionPackage, commonPackage);
		} catch(IllegalArgumentException e) {
			return null;
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.IntersectionService#saveIntersection(de.dim.trafficos.intersection.model.intersection.Intersection)
	 */
	@Override
	public Intersection saveIntersection(Intersection intersection) {
		Objects.requireNonNull(intersection, "Cannot save a null Intersection!");
		repo.save(intersection, Collections.singletonMap(Options.OPTION_SERIALIZE_DEFAULT_ATTRIBUTE_VALUES, true));
		return intersection;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.IntersectionService#getIntersectionById(java.lang.String)
	 */
	@Override
	public Intersection getIntersectionById(String intersectionId) {
		Objects.requireNonNull(intersectionId, "Cannot retrieve Intersection by null id!");
		return repo.getEObject(intersectionPackage.getIntersection(), intersectionId);
	}

}
