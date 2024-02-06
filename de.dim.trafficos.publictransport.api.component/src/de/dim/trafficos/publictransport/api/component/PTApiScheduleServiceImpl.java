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
package de.dim.trafficos.publictransport.api.component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.publictransport.api.component.helper.PTApiHelper;
import de.dim.trafficos.publictransport.apis.PTApiScheduleService;
import de.dim.trafficos.publictransport.apis.search.PTScheduleSearchService;
import de.dim.trafficos.publictransport.apis.search.PTStopSearchService;
import de.dim.trafficos.publictransport.apis.search.PTTimetableEntrySearchService;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport_api.Schedule;
import de.jena.udp.model.trafficos.publictransport_api.ScheduleEntry;
import de.jena.udp.model.trafficos.publictransport_api.StopInformation;

@Component(name = "PTApiScheduleService", service = PTApiScheduleService.class, scope = ServiceScope.PROTOTYPE)
public class PTApiScheduleServiceImpl implements PTApiScheduleService {
	
	@Reference(target = ("(transformator.id=publictransportToApi)"))
	private ModelTransformator modelTransformator;
	
	@Reference
	PTScheduleSearchService scheduleSearchService;
	
	@Reference
	PTTimetableEntrySearchService timetableEntrySearchService;
	
	@Reference
	PTStopSearchService stopSearchService;
		

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.PTApiScheduleService#getScheduleById(java.lang.String)
	 */
	@Override
	public Schedule getScheduleById(String scheduleId) {
		PTSchedule schedule = scheduleSearchService.searchScheduleById(scheduleId);
		if(schedule == null) return null;
		return constructApiSchedule(schedule, LocalDate.now());
	}	

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTApiScheduleService#getScheduleByDay(java.time.LocalDate)
	 */
	@Override
	public List<Schedule> getScheduleByDay(LocalDate day) {
		return constructApiSchedule(scheduleSearchService.searchScheduleByDay(day), day);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTApiScheduleService#getScheduleByDayAndLine(java.time.LocalDate, int[])
	 */
	@Override
	public List<Schedule> getScheduleByDayAndLine(LocalDate day, int... lines) {
		return constructApiSchedule(scheduleSearchService.searchScheduleByDayAndLine(day, lines), day);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTApiScheduleService#getScheduleByDayAndTime(java.time.LocalDate, java.time.LocalTime, java.time.LocalTime)
	 */
	@Override
	public List<Schedule> getScheduleByDayAndTime(LocalDate day, LocalTime startTime, LocalTime endTime) {
		return constructApiSchedule(scheduleSearchService.searchScheduleByDayAndTime(day, startTime, endTime), day);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTApiScheduleService#getScheduleByDayAndStopDHID(java.time.LocalDate, java.lang.String[])
	 */
	@Override
	public List<Schedule> getScheduleByDayAndStopDHID(LocalDate day, String... stopDHIDs) {
		return constructApiSchedule(scheduleSearchService.searchScheduleByDayAndStopDHIds(day, stopDHIDs), day);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.PTApiScheduleService#getScheduleByDayAndStopName(java.time.LocalDate, java.lang.String[])
	 */
	@Override
	public List<Schedule> getScheduleByDayAndStopName(LocalDate day, String... stopNames) {
		return constructApiSchedule(scheduleSearchService.searchScheduleByDayAndStopNames(day, stopNames), day);
	}
	
	@SuppressWarnings("unchecked")
	private List<Schedule> constructApiSchedule(List<PTSchedule> schedules, LocalDate day) {
		if(schedules == null || schedules.isEmpty()) {
			return Collections.emptyList();
		}
		List<Schedule> apiSchedules = (List<Schedule>) modelTransformator.doTransformation(schedules);
		apiSchedules.forEach(schedule -> {
			constructApiSchedule(schedule, day);
		});
		return apiSchedules;
	}
	
	@SuppressWarnings("unchecked")
	private Schedule constructApiSchedule(PTSchedule schedule, LocalDate day) {
		Schedule apiSchedule = (Schedule) modelTransformator.doTransformation(schedule);
		List<PTTimetableEntry> ttEntries = timetableEntrySearchService.searchTimetableEntryBySchedule(apiSchedule.getScheduleId());
		List<ScheduleEntry> apiEntries = (List<ScheduleEntry>) modelTransformator.doTransformation(ttEntries);
		
		List<String> stopIds = ttEntries.stream().map(e -> e.getRefStopId()).toList();
		List<PTStop> stops = stopSearchService.searchStopByStopId(stopIds.toArray(size -> new String[size]));
		List<StopInformation> apiStops = (List<StopInformation>) modelTransformator.doTransformation(stops);
		apiEntries.forEach(e -> {
			e.setRefStop(apiStops.stream().filter(s -> e.getRefStopId().equals(s.getStopId())).findFirst().orElse(null));
			e.setArrivalScheduled(PTApiHelper.adjustTimeToUTCZone(day, e.getArrivalScheduled()));
			e.setDepartureScheduled(PTApiHelper.adjustTimeToUTCZone(day, e.getDepartureScheduled()));
		});
		apiSchedule.getScheduleEntry().addAll(apiEntries);
		return apiSchedule;
	}
	
	@SuppressWarnings("unchecked")
	private void constructApiSchedule(Schedule apiSchedule, LocalDate day) {
		List<PTTimetableEntry> ttEntries = timetableEntrySearchService.searchTimetableEntryBySchedule(apiSchedule.getScheduleId());
		List<ScheduleEntry> apiEntries = (List<ScheduleEntry>) modelTransformator.doTransformation(ttEntries);
		
		List<String> stopIds = ttEntries.stream().map(e -> e.getRefStopId()).toList();
		List<PTStop> stops = stopSearchService.searchStopByStopId(stopIds.toArray(size -> new String[size]));
		List<StopInformation> apiStops = (List<StopInformation>) modelTransformator.doTransformation(stops);
		apiEntries.forEach(e -> {
			e.setRefStop(apiStops.stream().filter(s -> e.getRefStopId().equals(s.getStopId())).findFirst().orElse(null));
			e.setArrivalScheduled(PTApiHelper.adjustTimeToUTCZone(day, e.getArrivalScheduled()));
			e.setDepartureScheduled(PTApiHelper.adjustTimeToUTCZone(day, e.getDepartureScheduled()));
		});
		apiSchedule.getScheduleEntry().addAll(apiEntries);
	}


}
