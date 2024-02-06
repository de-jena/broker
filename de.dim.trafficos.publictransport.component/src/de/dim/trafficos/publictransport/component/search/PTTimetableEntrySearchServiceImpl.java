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

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.trafficos.publictransport.apis.search.PTTimetableEntrySearchService;
import de.dim.trafficos.publictransport.component.index.helper.PTTimetableEntryIndexHelper;
import de.dim.trafficos.publictransport.component.search.helper.PTSearchHelper;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 7, 2023
 */
@Component(name = "PTTimetableEntrySearchService", service = PTTimetableEntrySearchService.class)
public class PTTimetableEntrySearchServiceImpl implements PTTimetableEntrySearchService {
	
	@Reference(target = "(id=pttimetableentry)")
	private ComponentServiceObjects<IndexSearcher> searcherSO;
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))")
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTTimetableEntrySearchService#searchTimetableEntryBySchedule(java.lang.String)
	 */
	@Override
	public List<PTTimetableEntry> searchTimetableEntryBySchedule(String scheduleId) {
		Query q = new BooleanQuery.Builder().add(new TermQuery(new Term(PTTimetableEntryIndexHelper.PT_ENTRY_SCHEDULE_REF, scheduleId)), Occur.MUST).build();
		IndexSearcher searcher = searcherSO.getService();	
		try {
			return PTSearchHelper.executeQuery(q, publicTransportPackage.getPTTimetableEntry(), searcher, repo);
		} finally {
			searcherSO.ungetService(searcher);
		}
	}


	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTTimetableEntrySearchService#searchTimetableEntryByScheduleAndTime(java.lang.String, java.time.LocalTime, java.time.LocalTime)
	 */
	@Override
	public List<PTTimetableEntry> searchTimetableEntryByScheduleAndTime(String scheduleId, LocalTime startTime, LocalTime endTime) {
		List<PTTimetableEntry> entries = searchTimetableEntryBySchedule(scheduleId);
		entries = entries.stream().sorted((e1, e2) -> Integer.valueOf(e1.getEntryIndex()).compareTo(Integer.valueOf(e2.getEntryIndex()))).toList();
		if(entries.isEmpty()) return Collections.emptyList();
//		If the trip ends in a subsequent day wrt the one asked, then we should return an empty list.
		if(entries.get(entries.size()-1).getArrivalDayAfterScheduleStart() > 0) return Collections.emptyList();
		if((startTime.isBefore(entries.get(0).getScheduledArrivalTime()) || startTime.equals(entries.get(0).getScheduledArrivalTime())) && 
				((endTime.isAfter(entries.get(entries.size()-1).getScheduledDepartureTime()) || endTime.equals(entries.get(entries.size()-1).getScheduledDepartureTime())))) {
				return entries;
			}
		return Collections.emptyList();		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTTimetableEntrySearchService#searchTimetableEntryByScheduleAndStop(java.lang.String, java.lang.String[])
	 */
	@Override
	public List<PTTimetableEntry> searchTimetableEntryByScheduleAndStop(String scheduleId, String... stopIds) {
		BooleanQuery.Builder builder = new BooleanQuery.Builder();
		for(String stopId : stopIds) {
			builder.add(new TermQuery(new Term(PTTimetableEntryIndexHelper.PT_ENTRY_STOP_REF, stopId)), Occur.SHOULD);
		}
		Query q1 = builder.build();
		Query q = new BooleanQuery.Builder().add(q1, Occur.MUST).add(new TermQuery(new Term(PTTimetableEntryIndexHelper.PT_ENTRY_SCHEDULE_REF, scheduleId)), Occur.MUST).build();
		IndexSearcher searcher = searcherSO.getService();	
		try {
			return PTSearchHelper.executeQuery(q, publicTransportPackage.getPTTimetableEntry(), searcher, repo);
		} finally {
			searcherSO.ungetService(searcher);
		}	
	}
}
