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
package de.dim.trafficos.apis;

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

import de.dim.trafficos.intersection.model.intersection.Intersection;
import de.dim.trafficos.intersection.model.intersection.RoadType;

/**
 * 
 * @author ilenia
 * @since Feb 13, 2023
 */
@ProviderType
public interface IntersectionService {
	
	Intersection createIntersection(Map<Integer, RoadType> roadsMap);
	
	Intersection saveIntersection(Intersection intersection);
	
	Intersection getIntersectionById(String intersectionId);
	
	Intersection getIntersectionByName(String intersectionName);
}
