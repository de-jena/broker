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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.PromiseFactory;

import de.dim.trafficos.gtfs.component.helper.GTFSHelper;
import de.dim.trafficos.publictransport.apis.PTRouteService;
import de.dim.trafficos.publictransport.apis.PTScheduleService;
import de.dim.trafficos.publictransport.apis.PTStopService;
import de.dim.trafficos.publictransport.apis.PTTimetableEntryService;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTRouteConverter;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTScheduleConverter;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTStopConverter;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTTimetableEntryConverter;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.PTSchedule;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.PTTimetableEntry;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
@Component(name = "GTFSToTOSPublicTransportConverter", service = GTFSToTOSPublicTransportConverter.class, configurationPid = "GTFSToTOSPublicTransportConverter", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class GTFSToTOSPublicTransportConverterImpl implements GTFSToTOSPublicTransportConverter {
	
	@Reference
	GTFSToPTStopConverter stopConverter;
	
	@Reference
	GTFSToPTRouteConverter routeConverter;
	
	@Reference
	GTFSToPTTimetableEntryConverter timetableConverter;
	
	@Reference
	GTFSToPTScheduleConverter scheduleConverter;
	
	@Reference
	PTStopService ptStopService;
	
	@Reference 
	PTRouteService ptRouteService;
	
	@Reference
	PTScheduleService ptScheduleService;
	
	@Reference 
	PTTimetableEntryService ptTimetableService;
	
	public @interface GTFSToTOSPublicTransportConverterConfig {
		String pathToXMLStopFolder() default "deutschlandweite-haltestellendaten-xml/";
		String pathToGTFSScheduleFolder() default "deutschlandweite-sollfahrplandaten-gtfs/";
		String GTFSStopFileName() default "stops.txt";
		String GTFSStopTimesFileName() default "stop_times.txt";
		String GTFSTripsFileName() default "trips.txt";
		String GTFSRoutesFileName() default "routes.txt";
		String GTFSCalendarFileName() default "calendar.txt";
		String GTFSCalendarDatesFileName() default "calendar_dates.txt";	
		String[] municipalities() default {}; 
	}
	
	private static final Logger LOGGER = Logger.getLogger(GTFSToTOSPublicTransportConverterImpl.class.getName());
	private static final SimpleDateFormat SIMPLE_STOP_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat SIMPLE_SCHEDULE_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
	private PromiseFactory factory = new PromiseFactory(Executors.newFixedThreadPool(4));
	private GTFSToTOSPublicTransportConverterConfig config;

	@Activate
	public void activate(GTFSToTOSPublicTransportConverterConfig config) {
		this.config = config;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter#importGTFSAllData()
	 */
	@Override
	public void importGTFSAllData() {
		
		List<PTStop> stops = convertAndSaveStopData();
		LOGGER.info(String.format("Found %d stops", stops.size()));
		if(stops.isEmpty()) return;
		List<String> stopIds = stops.stream().map(s -> s.getStopId()).distinct().toList();
		
		convertAndSaveTimetableData(stopIds);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter#importGTFSStopData()
	 */
	@Override
	public void importGTFSStopData() {
		convertAndSaveStopData();	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSToTOSPublicTransportConverter#importGTFSScheduleData()
	 */
	@Override
	public void importGTFSScheduleData() {
		List<PTStop> stops = ptStopService.getAllPTStop();
		if(stops.isEmpty()) {
			LOGGER.warning(String.format("No PTStop found in the db. Trying to convert them first!"));
			stops = convertAndSaveStopData();
		}
		List<String> stopIds = stops.stream().map(s -> s.getStopId()).distinct().toList();
		convertAndSaveTimetableData(stopIds);		
	}

	private void convertAndSaveTimetableData(List<String> stopIds) {
//		Beschreibung_DELFI-Datensatz_GTFS_20231016.pdf
		Date updateDate = null;
		try {
			Path dateFilePath = 
					Files.list(Path.of(GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder())).
					filter(p -> p.toString().contains("Beschreibung_DELFI-Datensatz_GTFS_")).findFirst().orElse(null);
			String dateFileName = dateFilePath.getFileName().toString().replace(".pdf", "");
			dateFileName = dateFileName.replace("Beschreibung_DELFI-Datensatz_GTFS_", "");
			updateDate = SIMPLE_SCHEDULE_DATE_FORMAT.parse(dateFileName);
		} catch(IOException | ParseException e) {
			LOGGER.log(Level.SEVERE, String.format("Exception when trying to retrieve update date for Timetable Data"), e);
		}
		
		List<PTTimetableEntry> timetables = timetableConverter
				.convertGTFSToPTTimetableEntryFromFile(GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder()+config.GTFSStopTimesFileName(),
						stopIds.toArray(size -> new String[size]));
		LOGGER.info(String.format("Found %d timetables", timetables.size()));
		if(timetables.isEmpty()) return;
		Date updateDate2 = updateDate;
		timetables.forEach(t -> {
			t.setUpdateDate(updateDate2);
			t.setDataSource("OpenData");
		});
		
		List<String> tripIds = timetables.stream().map(tt -> tt.getRefScheduleId()).distinct().toList();

		factory.submit(() -> {
			ptTimetableService.savePTTimetableEntry(timetables.toArray(new PTTimetableEntry[0]));
			return true;
		}).onSuccess(t -> LOGGER.info("Finished saving PTTimetableEntry objects!"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, "Error saving PTTimetableEntry", t));
		
		
		List<PTSchedule> schedules = scheduleConverter
				.convertGTFSToPTScheduleFromFile(GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder()+config.GTFSTripsFileName(),
						GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder()+config.GTFSCalendarFileName(), 
						GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder()+config.GTFSCalendarDatesFileName(), 
				tripIds.toArray(size -> new String[size]));
		LOGGER.info(String.format("Found %d schedules", schedules.size()));
		if(schedules.isEmpty()) return;
		schedules.forEach(s -> {
			s.setUpdateDate(updateDate2);
			s.setDataSource("OpenData");
		});
		
		List<String> routeIds = schedules.stream().map(s -> s.getRefRouteId()).distinct().toList();
		
		factory.submit(() -> {
			ptScheduleService.savePTSchedule(schedules.toArray(new PTSchedule[0]));
			return true;
		}).onSuccess(t -> LOGGER.info("Finished saving PTSchedule objects!"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, "Error saving PTSchedule", t));
		
			
		List<PTRoute> routes = routeConverter
				.convertGTFSToPTRouteFromFile(GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder()+config.GTFSRoutesFileName(), 
						routeIds.toArray(size -> new String[size]));
		LOGGER.info(String.format("Found %d routes", routes.size()));
		if(routes.isEmpty()) return;
		
		routes.forEach(r -> {
			r.setUpdateDate(updateDate2);
			r.setDataSource("OpenData");
		});
		
		factory.submit(() -> {
			ptRouteService.savePTRoute(routes.toArray(new PTRoute[0]));
			return true;
		}).onSuccess(t -> LOGGER.info("Finished saving PTRoute objects!"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, "Error saving PTRoute", t));
	}
	
	private List<PTStop> convertAndSaveStopData() {
		Path xmlStopFilePath =  findXMLStopFile(GTFSHelper.getDataFolder()+config.pathToXMLStopFolder());
		if(xmlStopFilePath == null) {
			throw new IllegalArgumentException(String.format("No xml file found in folder %s, Cannot continue!", GTFSHelper.getDataFolder()+config.pathToXMLStopFolder()));
		}
		String xmlStopFile = xmlStopFilePath.toString();

//		Extract date from xml file assuming this form: zHV_aktuell_xml.2023-10-16.xml
		String fileUpdateDateStr = xmlStopFilePath.getFileName().toString().replace("zHV_aktuell_xml.", "");
		fileUpdateDateStr = fileUpdateDateStr.replace(".xml", "");
		Date fileUpdateDate = null;
		try {
			fileUpdateDate = SIMPLE_STOP_DATE_FORMAT.parse(fileUpdateDateStr);
		} catch (ParseException e) {
			LOGGER.log(Level.SEVERE, String.format("Error parsing update date for Stops from String %s", fileUpdateDateStr), e);
		}
		
		List<PTStop> stops = stopConverter.convertGTFSToPTStopFromFile(xmlStopFile, GTFSHelper.getDataFolder()+config.pathToGTFSScheduleFolder()+config.GTFSStopFileName(), config.municipalities());
		LOGGER.info(String.format("Found %d stops", stops.size()));
		if(stops.isEmpty()) return Collections.emptyList();
		Date updateDate = fileUpdateDate;
		stops.forEach(s -> {
			s.setUpdateDate(updateDate);
			s.setDataSource("OpenData");
		});		
		factory.submit(() -> {
			ptStopService.savePTStop(stops.toArray(new PTStop[0]));
			return true;
		}).onSuccess(t -> LOGGER.info("Finished saving PTStop objects!"))
		.onFailure(t -> LOGGER.log(Level.SEVERE, "Error saving PTRoute", t));
		
		return stops;
	}
	
	private Path findXMLStopFile(String pathToXMLStopFolder) {
		Path folder = Path.of(pathToXMLStopFolder);
		try {
			return Files.list(folder).filter(p -> Files.isRegularFile(p) && p.getFileName().toString().endsWith(".xml")).findFirst().orElse(null);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error finding XMLSTopFile in " + pathToXMLStopFolder, e);
			return null;
		}
	}

	
}
