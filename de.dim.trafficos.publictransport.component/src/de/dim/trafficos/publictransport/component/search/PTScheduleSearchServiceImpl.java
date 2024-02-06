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

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.LongPoint;
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

import de.dim.trafficos.publictransport.apis.search.PTScheduleSearchService;
import de.dim.trafficos.publictransport.apis.search.PTStopSearchService;
import de.dim.trafficos.publictransport.apis.search.PTTimetableEntrySearchService;
import de.dim.trafficos.publictransport.component.index.helper.PTScheduleIndexHelper;
import de.dim.trafficos.publictransport.component.search.helper.PTSearchHelper;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 7, 2023
 */
@Component(name = "PTScheduleSearchService", service = PTScheduleSearchService.class)
public class PTScheduleSearchServiceImpl implements PTScheduleSearchService {
	
	@Reference(target = "(id=ptschedule)")
	private ComponentServiceObjects<IndexSearcher> searcherSO;
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))")
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	@Reference
	PTTimetableEntrySearchService timetableEntrySearchService;
	
	@Reference
	PTStopSearchService stopSearchService;
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.search.PTScheduleSearchService#searchScheduleById(java.lang.String)
	 */
	@Override
	public PTSchedule searchScheduleById(String scheduleId) {
		Query q = new TermQuery(new Term(PTScheduleIndexHelper.PT_SCHEDULE_ID, scheduleId));
		IndexSearcher searcher = searcherSO.getService();	
		try {
			List<PTSchedule> schedules = PTSearchHelper.executeQuery(q, publicTransportPackage.getPTSchedule(), searcher, repo);
			if(schedules.isEmpty()) return null;
			return schedules.get(0);
		} finally {
			searcherSO.ungetService(searcher);
		}	
	}


	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTScheduleSearchService#searchScheduleByDay(java.time.LocalDate)
	 */
	@Override
	public List<PTSchedule> searchScheduleByDay(LocalDate day) {
		IndexSearcher searcher = searcherSO.getService();	
		try {
			return PTSearchHelper.executeQuery(buildQueryForScheduleByDay(day), 
					publicTransportPackage.getPTSchedule(), searcher, repo);
		} finally {
			searcherSO.ungetService(searcher);
		}	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTScheduleSearchService#searchScheduleByDayAndLine(java.time.LocalDate, int[])
	 */
	@Override
	public List<PTSchedule> searchScheduleByDayAndLine(LocalDate day, int... lineNumbers) {
		
		Query q0 = buildQueryForScheduleByDay(day);
		BooleanQuery.Builder builder = new BooleanQuery.Builder();
		for(int lineNumber : lineNumbers) {
			builder.add(new TermQuery(new Term(PTScheduleIndexHelper.PT_SCHEDULE_ROUTE_NUM_REF, String.valueOf(lineNumber))), Occur.SHOULD);
		}
		Query q = new BooleanQuery.Builder().add(q0, Occur.MUST).add(builder.build(), Occur.MUST).build();
		IndexSearcher searcher = searcherSO.getService();	
		try {
			return PTSearchHelper.executeQuery(q, publicTransportPackage.getPTSchedule(), searcher, repo);
		} finally {
			searcherSO.ungetService(searcher);
		}	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTScheduleSearchService#searchScheduleByDayAndTime(java.time.LocalDate, java.time.LocalTime, java.time.LocalTime)
	 */
	@Override
	public List<PTSchedule> searchScheduleByDayAndTime(LocalDate day, LocalTime startTime, LocalTime endTime) {
		List<PTSchedule> schedulesByDay = searchScheduleByDay(day);
		List<PTSchedule> schedulesByDayAndTime = new ArrayList<>();
		schedulesByDay.forEach(s -> {
			if(!timetableEntrySearchService.searchTimetableEntryByScheduleAndTime(s.getScheduleId(), startTime, endTime).isEmpty()) {
				schedulesByDayAndTime.add(s);	
			}
		});
		return schedulesByDayAndTime;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTScheduleSearchService#searchScheduleByDayAndStopDHIds(java.time.LocalDate, java.lang.String[])
	 */
	@Override
	public List<PTSchedule> searchScheduleByDayAndStopDHIds(LocalDate day, String... stopDHIds) {
		List<PTSchedule> schedulesByDay = searchScheduleByDay(day);
		List<PTStop> stops = stopSearchService.searchStopByDHID(stopDHIds);
		List<PTSchedule> schedulesByDayStopDHIDs = new ArrayList<>();
		schedulesByDay.forEach(s -> {
			if(!timetableEntrySearchService.searchTimetableEntryByScheduleAndStop(s.getScheduleId(), stops.stream().map(stop -> stop.getStopId()).toArray(size -> new String[size])).isEmpty()) {
				schedulesByDayStopDHIDs.add(s);	
			}
		});
		return schedulesByDayStopDHIDs;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTScheduleSearchService#searchScheduleByDayAndStopNames(java.time.LocalDate, java.lang.String[])
	 */
	@Override
	public List<PTSchedule> searchScheduleByDayAndStopNames(LocalDate day, String... stopNames) {
		List<PTSchedule> schedulesByDay = searchScheduleByDay(day);
		List<PTStop> stops = stopSearchService.searchStopByName(stopNames);
		List<PTSchedule> schedulesByDayStopNames = new ArrayList<>();
		schedulesByDay.forEach(s -> {
			if(!timetableEntrySearchService.searchTimetableEntryByScheduleAndStop(s.getScheduleId(), stops.stream().map(stop -> stop.getStopId()).toArray(size -> new String[size])).isEmpty()) {
				schedulesByDayStopNames.add(s);	
			}
		});
		return schedulesByDayStopNames;
	}
	
	private Query buildQueryForScheduleByDay(LocalDate day) {
//		start <= day <= end
		Query q10 = LongPoint.newRangeQuery(PTScheduleIndexHelper.PT_SCHEDULE_START, Long.MIN_VALUE, day.atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli());
		Query q11 = LongPoint.newRangeQuery(PTScheduleIndexHelper.PT_SCHEDULE_END, day.atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli(), Long.MAX_VALUE);
		Query q1 = new BooleanQuery.Builder().add(q10, Occur.MUST).add(q11, Occur.MUST).build();
		
//		day belongs to frequency days OR day belongs to included days
		Query q20 = new TermQuery(new Term(PTScheduleIndexHelper.PT_SCHEDULE_FREQUENY_DAYS, day.getDayOfWeek().toString()));
		Query q21 = new TermQuery(new Term(PTScheduleIndexHelper.PT_SCHEDULE_INCLUDED_DAYS, day.format(PTScheduleIndexHelper.DATE_TIME_FORMATTER)));
		Query q2 = new BooleanQuery.Builder().add(q20, Occur.SHOULD).add(q21, Occur.SHOULD).build();
		
//		day should NOT belong to excluded days
		Query q30 = new TermQuery(new Term(PTScheduleIndexHelper.PT_SCHEDULE_EXCLUDED_DAYS, day.format(PTScheduleIndexHelper.DATE_TIME_FORMATTER)));
		
//		Global query is an AND of q1, q2 and q3
		Query q = new BooleanQuery.Builder().add(q1, Occur.MUST).add(q2, Occur.MUST).add(q30, Occur.MUST_NOT).build();
		return q;
	}

	
}
