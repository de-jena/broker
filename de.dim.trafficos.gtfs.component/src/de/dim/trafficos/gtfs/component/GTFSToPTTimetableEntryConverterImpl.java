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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

import de.dim.trafficos.gtfs.component.helper.GTFSConverterHelper;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTTimetableEntryConverter;
import de.jena.udp.model.trafficos.publictransport.PTPickUpDropOffType;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
@Component(name = "GTFSToPTTimetableEntryConverter", service = GTFSToPTTimetableEntryConverter.class)
public class GTFSToPTTimetableEntryConverterImpl implements GTFSToPTTimetableEntryConverter {
	
	private static final String COLUMN_SEPARATOR = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_TIME;
	private static final Logger LOGGER = Logger.getLogger(GTFSToPTTimetableEntryConverterImpl.class.getName());
	
	private Map<String, EStructuralFeature> FEATURES_MAP;

	@Activate
	public GTFSToPTTimetableEntryConverterImpl(@Reference TOSPublicTransportPackage ptPackage) {
		FEATURES_MAP = Map.ofEntries(
				Map.entry("trip_id", ptPackage.getPTTimetableEntry_RefScheduleId()),
				Map.entry("arrival_time", ptPackage.getPTTimetableEntry_ScheduledArrivalTime()),
				Map.entry("departure_time", ptPackage.getPTTimetableEntry_ScheduledDepartureTime()),
				Map.entry("stop_id", ptPackage.getPTTimetableEntry_RefStopId()),
				Map.entry("stop_sequence", ptPackage.getPTTimetableEntry_EntryIndex()),
				Map.entry("pickup_type", ptPackage.getPTTimetableEntry_PickUpType()),
				Map.entry("drop_off_type", ptPackage.getPTTimetableEntry_DropOffType()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTTimetableEntryConverter#convertGTFSToPTTimetableEntryFromFile(java.lang.String, java.lang.String[])
	 */
	@Override
	public List<PTTimetableEntry> convertGTFSToPTTimetableEntryFromFile(String pathToGTFSFile, String... stopIds) {
		if(stopIds == null) stopIds = new String[0];
		List<PTTimetableEntry> ttEntries = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(pathToGTFSFile))) {
			String line = in.readLine(); //This is the header
			Map<EStructuralFeature, List<Integer>> valuesMap = GTFSConverterHelper.getValuesMap(line, COLUMN_SEPARATOR, FEATURES_MAP);
			Integer stopIdColumnIndex = GTFSConverterHelper.getColumnIndex("stop_id", line, COLUMN_SEPARATOR);
			while((line = in.readLine()) !=null){
				String[] columnValues = line.split(COLUMN_SEPARATOR);
				String stopId = columnValues[stopIdColumnIndex].replace("\"", "").trim(); 
				if(stopIds.length > 0 && !List.of(stopIds).contains(stopId)) continue;
				PTTimetableEntry ttEntry = TOSPublicTransportFactory.eINSTANCE.createPTTimetableEntry();
				valuesMap.forEach((k,v) -> {
					String[] values = new String[v.size()];
					for(int i = 0; i < v.size(); i++) {
						values[i] = columnValues[v.get(i)];
					}
					ttEntry.eSet(k, getEStrucutralFeatureValue(ttEntry, k, values));
				});
				ttEntries.add(ttEntry);
			}
		} catch(IOException e) {
			LOGGER.log(Level.SEVERE, "Error converting GTFS t0 PTTimetableEntry from " + pathToGTFSFile, e);
			return Collections.emptyList();
		}
		return ttEntries;
	}

	
	private Object getEStrucutralFeatureValue(PTTimetableEntry ttEntry, EStructuralFeature feature, String ... values) {
		EClassifier featureType = feature.getEType();
		if(values.length != 1) 	throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTTimetableEntryConverter", featureType.getInstanceClassName()));
		String value = values[0].replace("\"", "").trim(); 
		if(String.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return null;
//			This is to remove leading 0s in stopId from GTFS data
			while(value.startsWith("0")) value = value.replaceFirst("0", "");
			return value;
		}
		if(Integer.class.equals(featureType.getInstanceClass()) || int.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return -1;
			return Integer.parseInt(value);
		}
		if(PTPickUpDropOffType.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return getTypeFromNum(100);
			return getTypeFromNum(Integer.parseInt(value));
		}
		if(LocalTime.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return null;
			if(value.split(":")[0].length() == 1) value = "0".concat(value);
//			We need to adjust times that are > 23h 
			if(Integer.parseInt(value.split(":")[0]) > 23) value = adjustTime(ttEntry, feature, value); 
			return LocalTime.parse(value, DATE_TIME_FORMATTER);
		}
		
		throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTTimetableEntryConverter", featureType.getInstanceClassName()));
	}
	
	private String adjustTime(PTTimetableEntry ttEntry, EStructuralFeature feature, String value) {
		Integer h = Integer.parseInt(value.split(":")[0]);
		Integer mod = h/24;
		value = value.replaceFirst(value.split(":")[0], String.valueOf(h-24*mod));
		if(value.split(":")[0].length() == 1) value = "0".concat(value);
		if(feature.getName().equals(TOSPublicTransportPackage.eINSTANCE.getPTTimetableEntry_ScheduledArrivalTime().getName())) {
			ttEntry.eSet(TOSPublicTransportPackage.eINSTANCE.getPTTimetableEntry_ArrivalDayAfterScheduleStart(), mod);
		} else if(feature.getName().equals(TOSPublicTransportPackage.eINSTANCE.getPTTimetableEntry_ScheduledDepartureTime().getName())) {
			ttEntry.eSet(TOSPublicTransportPackage.eINSTANCE.getPTTimetableEntry_DepartureDayAfterScheduleStart(), mod);
		}
		return value;
	}
	
	private PTPickUpDropOffType getTypeFromNum(int number) {
		switch(number) {
		case 0: default: return PTPickUpDropOffType.REGULARLY_SCHEDULED;
		case 1: return PTPickUpDropOffType.NOT_AVAILABLE;
		case 2: return PTPickUpDropOffType.PHONE_TO_ARRANGE;
		case 3: return PTPickUpDropOffType.COORDINATE_WITH_DRIVER;
		}
	}
}
