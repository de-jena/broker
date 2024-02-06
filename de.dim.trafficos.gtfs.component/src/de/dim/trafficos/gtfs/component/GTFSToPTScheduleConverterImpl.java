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
package de.dim.trafficos.gtfs.component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.trafficos.gtfs.component.helper.GTFSCalendar;
import de.dim.trafficos.gtfs.component.helper.GTFSConverterHelper;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTScheduleConverter;
import de.jena.udp.model.trafficos.publictransport.PTFrequencyType;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTTripDirectionType;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
@Component(name = "GTFSToPTScheduleConverter", service = GTFSToPTScheduleConverter.class)
public class GTFSToPTScheduleConverterImpl implements GTFSToPTScheduleConverter {
	
	@Reference
	GTFSCalendarReader calendarReader;
	
	private static final String COLUMN_SEPARATOR = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
	private static final Logger LOGGER = Logger.getLogger(GTFSToPTScheduleConverterImpl.class.getName());
	private Map<String, EStructuralFeature> FEATURES_MAP;

	@Activate
	public GTFSToPTScheduleConverterImpl(@Reference TOSPublicTransportPackage ptPackage) {
		FEATURES_MAP = Map.ofEntries(
				Map.entry("trip_id", ptPackage.getPTSchedule_ScheduleId()),
				Map.entry("route_id", ptPackage.getPTSchedule_RefRouteId()),
				Map.entry("direction_id", ptPackage.getPTSchedule_TripDirection()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTScheduleConverter#convertGTFSToPTScheduleFromFile(java.lang.String, java.lang.String, java.lang.String, java.lang.String[])
	 */
	@Override
	public List<PTSchedule> convertGTFSToPTScheduleFromFile(String pathToGTFSFile, String pathToGTFSCaledarFile,
			String pathToGTFSCalendarDatesFile, String... tripIds) {
		if(tripIds == null) tripIds = new String[0];
		List<GTFSCalendar> calendars = calendarReader.extractGTFSCalendarFromFiles(pathToGTFSCaledarFile, pathToGTFSCalendarDatesFile);
		List<PTSchedule> schedules = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(pathToGTFSFile))) {
			String line = in.readLine(); //This is the header
			int serviceIdIndex = GTFSConverterHelper.getColumnIndex("service_id", line, COLUMN_SEPARATOR);
			int tripIdIndex = GTFSConverterHelper.getColumnIndex("trip_id", line, COLUMN_SEPARATOR);
			Map<EStructuralFeature, List<Integer>> valuesMap = GTFSConverterHelper.getValuesMap(line, COLUMN_SEPARATOR, FEATURES_MAP);
			while((line = in.readLine()) !=null){
				String[] columnValues = line.split(COLUMN_SEPARATOR);
				String tripId = columnValues[tripIdIndex].replace("\"", "").trim(); 
				if(tripIds.length > 0 && !List.of(tripIds).contains(tripId)) continue;
				PTSchedule schedule = TOSPublicTransportFactory.eINSTANCE.createPTSchedule();
				valuesMap.forEach((k,v) -> {
					String[] values = new String[v.size()];
					for(int i = 0; i < v.size(); i++) {
						values[i] = columnValues[v.get(i)];
					}
					schedule.eSet(k, getEStrucutralFeatureValue(k.getEType(), values));
				});
//				Add the frequency to the schedule through the calendar info
				if(serviceIdIndex != -1) {
					String serviceId = columnValues[serviceIdIndex].replace("\"", "").trim();
					GTFSCalendar calendar = calendars.stream().filter(c -> serviceId.equals(c.getServiceId())).findFirst()
							.orElseThrow(() -> new IllegalStateException(String.format("No GTFSCalendar corresponding to serviceId %s found!", serviceId)));
					if(calendar != null) {
						schedule.setStartDate(calendar.getStart());
						schedule.setEndDate(calendar.getEnd());
						schedule.getIncludedDate().addAll(calendar.getIncluded());
						schedule.getExcludedDate().addAll(calendar.getExcluded());
						addFrequencyDays(schedule, calendar);
					} 
				} else {
					throw new IllegalStateException("No service_id column found in calendar file!");
				}
				schedules.add(schedule);
			}
		} catch(IOException e) {
			LOGGER.log(Level.SEVERE, "Error converting GTFS t0 PTRoute from " + pathToGTFSFile, e);
			return Collections.emptyList();
		}
		return schedules;
	}
	
	
	private void addFrequencyDays(PTSchedule schedule, GTFSCalendar calendar) {
		if(calendar.isMonday()) schedule.getFrequencyDays().add(PTFrequencyType.MONDAY);
		if(calendar.isTuesday()) schedule.getFrequencyDays().add(PTFrequencyType.TUESDAY);
		if(calendar.isWednesday()) schedule.getFrequencyDays().add(PTFrequencyType.WEDNESDAY);
		if(calendar.isThursday()) schedule.getFrequencyDays().add(PTFrequencyType.THURSDAY);
		if(calendar.isFriday()) schedule.getFrequencyDays().add(PTFrequencyType.FRIDAY);
		if(calendar.isSaturday()) schedule.getFrequencyDays().add(PTFrequencyType.SATURDAY);
		if(calendar.isSunday()) schedule.getFrequencyDays().add(PTFrequencyType.SUNDAY);		
	}

	private Object getEStrucutralFeatureValue(EClassifier featureType, String... values) {
		if(values.length != 1) throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTScheduleConverter", featureType.getInstanceClassName()));
		String value = values[0].replace("\"", "").trim();
		if(String.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return null;
			return value;
		}
		if(PTTripDirectionType.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return getTypeFromNum(100);
			return getTypeFromNum(Integer.parseInt(value));
		}
		throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTScheduleConverter", featureType.getInstanceClassName()));
	}
	
	private PTTripDirectionType getTypeFromNum(int number) {
		switch(number) {
		case 0: default: return PTTripDirectionType.OUTBOUND;
		case 1: return PTTripDirectionType.INBOUND;
		}
	}
}
