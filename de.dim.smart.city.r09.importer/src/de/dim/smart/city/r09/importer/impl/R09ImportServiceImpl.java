/**
 * Copyright (c) 2012 - 2020 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.smart.city.r09.importer.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.smart.city.r09.importer.api.R09ImportService;
import de.dim.trafficos.model.device.Position;
import de.dim.trafficos.model.device.PublicTransportDataEntry;
import de.dim.trafficos.model.device.PublicTransportDataValue;
import de.dim.trafficos.model.device.PublicTransportDataValueType;
import de.dim.trafficos.model.device.PublicTransportDoorChange;
import de.dim.trafficos.model.device.PublicTransportDoorChangeType;
import de.dim.trafficos.model.device.PublicTransportLine;
import de.dim.trafficos.model.device.PublicTransportLocMsg;
import de.dim.trafficos.model.device.PublicTransportPosition;
import de.dim.trafficos.model.device.TOSDeviceFactory;
import de.dim.trafficos.model.device.TOSDevicePackage;

/**
 * 
 * @author ilenia
 * @since Jul 30, 2020
 */
@Component(name = "R09ImportService")
public class R09ImportServiceImpl implements R09ImportService {

	@Reference
	ComponentServiceObjects<EMFRepository> repoObjects;

	private Map<Date, PublicTransportDataEntry> dataEntryMap;

	PublicTransportLine ptLine;

	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd'|'HHmmss", Locale.GERMAN);

	private static final Logger logger = Logger.getLogger(R09ImportServiceImpl.class.getName());

	private static final String DOOR_OPEN_KEYWORD = "Tuer auf an";

	private static final String DOOR_CLOSE_KEYWORD = "Tuer zu an";

	private static final String POSITION_KEYWORD = "New ref coor";
	
	private static final String LOC_KEYWORD = "|LOC|";
	
	private static final String LOC_HEADER = "Li /Ku /Ro /Fahrt /Umlauf/Kilometer|PosState/Rleft|";
	
	private static final String DASHED = "-----------------";

	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.r09.importer.api.R09ImportService#importR09(java.lang.String, de.dim.trafficos.model.device.PublicTransportLine)
	 */
	@Override
	public void importR09(String pathToFiles, PublicTransportLine ptLine) throws IOException, ParseException {
		File folder = new File(pathToFiles);
		importR09(folder, ptLine);
	}
	
	private void importR09(File pathToFiles, PublicTransportLine ptLine) {
		this.ptLine = ptLine;
		dataEntryMap = new HashMap<>();
		long start = System.currentTimeMillis();
		// Populates the array with names of files and directories
		String[] files = pathToFiles.list();
		List<String> result = Arrays.asList(files);

		EMFRepository repo = repoObjects.getService(); 
		try {
			result.forEach(fileName -> {
				logger.info("-----------------------------");
				logger.info("Processing File " + fileName);
				fileName = pathToFiles + "/" + fileName;
				try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
					stream
					.filter(l->l.contains(DOOR_CLOSE_KEYWORD) || l.contains(DOOR_OPEN_KEYWORD) || l.contains(POSITION_KEYWORD))
					.forEach(l->processLine(l));
				} catch (IOException e3) {
					logger.severe("Error finding file " + fileName);
					e3.printStackTrace();
				}
			});
			
			repo.save(ptLine);
			
			
			int index = 0;
			List<PublicTransportDataEntry> sortedDataEntry = dataEntryMap.values().stream().sorted((e1,e2) -> e1.getTimestamp().compareTo(e2.getTimestamp())).collect(Collectors.toList());
			for(PublicTransportDataEntry e : sortedDataEntry) {
				repo.save(e);
				index++;
				if(index % 1000 == 0) {
					System.out.println("Saved " + index + " entries over " + dataEntryMap.size());
				}
				if(index == 10000) {
					break;
				}
			}
			System.out.println("Complete import took " + ((System.currentTimeMillis()-start)/1000));	
		} finally {
			repoObjects.ungetService(repo);
		}
		
	}


	/**
	 * @param l
	 * @return
	 * @throws ParseException 
	 */
	private void processLine(String l) {

		Date date = extractTimestamp(l);
		if(date == null) {
			logger.severe("Cannot assign null as DataEntry timestamp!");
			throw new IllegalStateException("Cannot assign null as DataEntry timestamp!");
		}
		if(l.contains(DOOR_CLOSE_KEYWORD)) {
			createDoorChangeValue(date, l, false);
		}
		else if(l.contains(DOOR_OPEN_KEYWORD)) {
			createDoorChangeValue(date, l, true);
		}
		else if(l.contains(POSITION_KEYWORD)) {
			createPositionValue(date, l);
		}
		else if(l.contains(LOC_KEYWORD) && !l.contains(DASHED) && !l.contains(LOC_HEADER)) {
			createLocationValue(date, l);
		}
	}


	/**
	 * @param date
	 * @param l
	 */
	private void createLocationValue(Date date, String l) {
		PublicTransportDataEntry entry;
		if(dataEntryMap.containsKey(date)) {
			entry = dataEntryMap.get(date);
		}
		else {
			entry = TOSDeviceFactory.eINSTANCE.createPublicTransportDataEntry();
			entry.setTimestamp(date);
			entry.setId(UUID.randomUUID().toString());
			dataEntryMap.put(date, entry);
		}

		PublicTransportDataValue dv = TOSDeviceFactory.eINSTANCE.createPublicTransportDataValue();
		dv.setType(PublicTransportDataValueType.LOCATION_MESSAGE);
		
		PublicTransportLocMsg locMsg = TOSDeviceFactory.eINSTANCE.createPublicTransportLocMsg();
		String[] splitLine = l.split("\\|");
		if(splitLine.length < 6) {
			return;
		}
		for(int i = 5; i < splitLine.length; i++) {
			String portion = splitLine[i].trim();
			switch(i) {
			case 5:
				String[] subPortion = portion.split("/");
				for(int j = 0; j < subPortion.length; j++) {
					String sp = subPortion[j].trim();
					switch(j) {
					case 0:
						locMsg.setLineNum(sp);
						break;
					case 1:
						locMsg.setTripNum(sp);
						break;
					case 2:
						locMsg.setRouteNum(sp);
						break;
					case 3:
						locMsg.setTravelNum(sp);
						break;
					case 4:
						locMsg.setCounter(Integer.parseInt(sp));
						break;
					case 5:
						locMsg.setKilometer(Integer.parseInt(sp));
						break;
					default:
						logger.warning("Unknown sub portion of Location Message " + portion);
						break;
					}
				}
				break;
			case 6:
				locMsg.setPosState(portion);
				break;
			case 7:
				locMsg.setLastStop(portion);
				break;
			case 8:
				locMsg.setNextStop(portion);
				break;
			case 9:
				subPortion = portion.split("/");
				for(int j = 0; j < subPortion.length; j++) {
					String sp = subPortion[j].trim();
					switch(j) {
					case 0:
						locMsg.setActualTime(Integer.parseInt(sp));
						break;
					case 1:
						locMsg.setExpectedTime(Integer.parseInt(sp));
						break;
					default:
						logger.warning("Unknown sub portion of Location Message " + portion);
						break;
					}
				}
				break;
			case 10:
				subPortion = portion.split("/");
				for(int j = 0; j < subPortion.length; j++) {
					String sp = subPortion[j].trim();
					switch(j) {
					case 0:
						locMsg.setGps(sp);
						break;
					case 1:
						locMsg.setOdo(sp);
						break;
					case 2:
						locMsg.setDoor(sp);
						break;
					default:
						logger.warning("Unknown sub portion of Location Message " + portion);
						break;
					}
				}
				break;
			default:
				logger.warning("Unknown segment of Location Message " + portion);
				break;
			}
		}
		dv.setLineRef(ptLine);
		dv.setValue(locMsg);
		entry.getDataValue().add(dv);
		dataEntryMap.put(date, entry);		
	}


	/**
	 * @param date
	 * @param l
	 */
	private void createPositionValue(Date date, String l) {
		PublicTransportDataEntry entry;
		if(dataEntryMap.containsKey(date)) {
			entry = dataEntryMap.get(date);
		}
		else {
			entry = TOSDeviceFactory.eINSTANCE.createPublicTransportDataEntry();
			entry.setTimestamp(date);
			entry.setId(UUID.randomUUID().toString());
			dataEntryMap.put(date, entry);
		}

		PublicTransportDataValue dv = TOSDeviceFactory.eINSTANCE.createPublicTransportDataValue();
		dv.setType(PublicTransportDataValueType.GEO_INFO);

		PublicTransportPosition ptp = TOSDeviceFactory.eINSTANCE.createPublicTransportPosition();
		String id = UUID.randomUUID().toString();
		ptp.setId(id);
		ptp.setName(id);

		Position pos = createPosition(l, "long:", "latt:", "latt:", "");
		if(pos == null) {
			return;
		}
		ptp.setPosition(pos);
		dv.setValue(ptp);
		dv.setLineRef(ptLine);

		entry.getDataValue().add(dv);
		dataEntryMap.put(date, entry);		
	}


	/**
	 * @param date
	 * @param l
	 * @param b
	 */
	private void createDoorChangeValue(Date date, String l, boolean isDoorOpen) {
		PublicTransportDataEntry entry;
		if(dataEntryMap.containsKey(date)) {
			entry = dataEntryMap.get(date);
		}
		else {
			entry = TOSDeviceFactory.eINSTANCE.createPublicTransportDataEntry();
			entry.setTimestamp(date);
			entry.setId(UUID.randomUUID().toString());
			dataEntryMap.put(date, entry);
		}

		PublicTransportDataValue dv = TOSDeviceFactory.eINSTANCE.createPublicTransportDataValue();
		dv.setType(PublicTransportDataValueType.DOOR_CHANGE);

		PublicTransportDoorChange dc = TOSDeviceFactory.eINSTANCE.createPublicTransportDoorChange();
		String id = UUID.randomUUID().toString();
		dc.setId(id);
		dc.setName(id);
		dc.setType(isDoorOpen ? PublicTransportDoorChangeType.DOOR_OPEN : PublicTransportDoorChangeType.DOOR_CLOSE);
		Position pos = createPosition(l, "longitude", "latitude", "latitude", ",");
		if(pos == null) {
			return;
		}
		dc.setPosition(pos);
		dv.setValue(dc);
		dv.setLineRef(ptLine);

		entry.getDataValue().add(dv);
		dataEntryMap.put(date, entry);
	}


	/**
	 * @param l
	 * @return
	 */
	private Position createPosition(String l, String startLon, String endLon, String startLat, String endLat) {
		Position pos = TOSDeviceFactory.eINSTANCE.createPosition();
		String lonStr = l.substring(l.indexOf(startLon), l.indexOf(endLon));
		String latStr = null;
		if(endLat == null || endLat.isEmpty()) {
			latStr = l.substring(l.indexOf(startLat));
		} else {
			latStr = l.substring(l.indexOf(startLat), l.indexOf(endLat));
		}


		lonStr = lonStr.replace(startLon, "");
		lonStr = lonStr.trim();

		latStr = latStr.replace(startLat, "");
		latStr = latStr.trim();

		lonStr = lonStr.substring(0, 2) + "." + lonStr.substring(2);
		latStr = latStr.substring(0, 2) + "." + latStr.substring(2);

		try {
			double lon = Double.parseDouble(lonStr);
			double lat = Double.parseDouble(latStr);

			pos.setLongitude(lon);
			pos.setLatitude(lat);
		} catch(NumberFormatException e) {
			logger.severe("Error creating position from lon/lat String " + lonStr + " - " + latStr);
			return null;
		}		
		return pos;
	}


	/**
	 * @param l
	 * @return
	 */
	private Date extractTimestamp(String l) {
		String dateStr = l.substring(0, l.indexOf("|", l.indexOf("|") +1));
		Date date;
		try {
			date = SDF.parse(dateStr);
		} catch (ParseException e) {
			logger.severe("Error parsing Date " + dateStr);
			return null;
		}
		return date;
	}


	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.r09.importer.api.R09ImportService#importSingleR09(java.lang.String, de.dim.trafficos.model.device.PublicTransportLine, java.util.Map)
	 */
	@Override
	public Map<Date, PublicTransportDataEntry> importSingleR09(String line, PublicTransportLine ptLine,
			Map<Date, PublicTransportDataEntry> dataEntryMap) {
		EMFRepository repo = repoObjects.getService();
		try {
			return importSingleR09(line, ptLine, dataEntryMap, repo);
		} finally {
			repoObjects.ungetService(repo);
		}
	}

	public Map<Date, PublicTransportDataEntry> importSingleR09(String line, PublicTransportLine ptLine,
			Map<Date, PublicTransportDataEntry> dataEntryMap, EMFRepository repo) {

		if(dataEntryMap != null) {
			this.dataEntryMap = dataEntryMap;
		}
		else {
			this.dataEntryMap = new HashMap<>();
		}

		PublicTransportLine ptLineDB = repo.getEObject(TOSDevicePackage.Literals.PUBLIC_TRANSPORT_LINE, ptLine.getId());
		if(ptLineDB == null) {
			repo.save(ptLine);
		}
		
		processLine(line);
		return this.dataEntryMap;
	}


	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.r09.importer.api.R09ImportService#savePublicTransportDataEntry(java.util.Map)
	 */
	@Override
	public void savePublicTransportDataEntry(Map<Date, PublicTransportDataEntry> dataEntryMap) {
		EMFRepository repo = repoObjects.getService();
		try {
			savePublicTransportDataEntry(dataEntryMap, repo);
		} finally {
			repoObjects.ungetService(repo);
		}
	}

	public void savePublicTransportDataEntry(Map<Date, PublicTransportDataEntry> dataEntryMap, EMFRepository repo) {
		
		int index = 0;
		List<PublicTransportDataEntry> sortedDataEntry = dataEntryMap.values().stream().sorted((e1,e2) -> e1.getTimestamp().compareTo(e2.getTimestamp())).collect(Collectors.toList());
		for(PublicTransportDataEntry e : sortedDataEntry) {
			repo.save(e);
			index++;
			if(index % 1000 == 0) {
				System.out.println("Saved " + index + " entries over " + dataEntryMap.size());
			}
			if(index == 10000) {
				break;
			}
		}		
	}
}
