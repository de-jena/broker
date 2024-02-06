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
package de.dim.trafficos.publictransport.component.search;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.gecko.emf.repository.query.SortType;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.trafficos.publictransport.apis.search.PTUpdateSearchService;
import de.jena.udp.model.trafficos.common.TOSCommonPackage;
import de.jena.udp.model.trafficos.publictransport.PTUpdate;
import de.jena.udp.model.trafficos.publictransport.PTUpdateValueType;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 12, 2023
 */
@Component(name = "PTUpdateSearchService", service = PTUpdateSearchService.class)
public class PTUpdateSearchServiceImpl implements PTUpdateSearchService {
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))")
	QueryRepository repo;
	

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.search.PTUpdateSearchService#getLatestUpdateByTypeAndVehicle(java.lang.String, de.jena.udp.model.trafficos.publictransport.PTUpdateValueType)
	 */
	@Override
	public PTUpdate getLatestUpdateByTypeAndVehicle(String vehicleId, PTUpdateValueType type) {
	
		IQuery iq1 = repo.createQueryBuilder().column(TOSPublicTransportPackage.eINSTANCE.getPTUpdate_RefVehicleId()).simpleValue(vehicleId).build();
		IQuery iq2 = repo.createQueryBuilder().column(TOSPublicTransportPackage.eINSTANCE.getPTUpdate_Type()).simpleValue(type.toString()).build();
		IQuery iq = repo.createQueryBuilder().allQuery().and(iq1,iq2)
				.sort(TOSCommonPackage.eINSTANCE.getAbstractDataEntry_Timestamp(), SortType.DESCENDING)
				.build();
		
		List<PTUpdate> updates = repo.getEObjectsByQuery(TOSPublicTransportPackage.eINSTANCE.getPTUpdate(), iq);
		if(updates == null || updates.isEmpty()) return null;
		return updates.get(0);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.search.PTUpdateSearchService#getLatestUpdatesByType(de.jena.udp.model.trafficos.publictransport.PTUpdateValueType)
	 */
	@Override
	public List<PTUpdate> getLatestUpdatesByType(PTUpdateValueType type) {
//		Retrieve all updates of the given type sorted by timestamp, and then keep only
//		the ones with different vehicle id. So we should have the latest one for every 
//		vehicle id available.
		IQuery iq1 = repo.createQueryBuilder().column(TOSPublicTransportPackage.eINSTANCE.getPTUpdate_Type()).simpleValue(type.toString()).build();
		IQuery iq = repo.createQueryBuilder().allQuery().and(iq1)
				.sort(TOSCommonPackage.eINSTANCE.getAbstractDataEntry_Timestamp(), SortType.DESCENDING)
				.build();
		List<PTUpdate> updates = repo.getEObjectsByQuery(TOSPublicTransportPackage.eINSTANCE.getPTUpdate(), iq);
		updates = updates.stream().filter(distinctByKey(PTUpdate::getRefVehicleId)).toList();
		return updates;
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	    Set<Object> seen = ConcurrentHashMap.newKeySet();
	    return t -> seen.add(keyExtractor.apply(t));
	}

}
