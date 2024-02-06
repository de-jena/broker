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

import de.dim.trafficos.gtfs.component.helper.GTFSConverterHelper;
import de.dim.trafficos.gtfs.component.helper.XMLReader;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTStopConverter;
import de.jena.udp.model.trafficos.common.Position;
import de.jena.udp.model.trafficos.common.TOSCommonFactory;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
@Component(name = "GTFSPTStopConverter", service = GTFSToPTStopConverter.class)
public class GTFSToPTStopConverterImpl implements GTFSToPTStopConverter {

	private static final Logger LOGGER = Logger.getLogger(GTFSToPTStopConverterImpl.class.getName());
	private static final String COLUMN_SEPARATOR = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
	private Map<String, EStructuralFeature> FEATURES_MAP;

	@Activate
	public GTFSToPTStopConverterImpl(@Reference TOSPublicTransportPackage ptPackage) {
		FEATURES_MAP = Map.ofEntries(
				Map.entry("stop_id", ptPackage.getPTStop_StopId()),
				Map.entry("stop_name", ptPackage.getPTStop_Name()),
				Map.entry("stop_lat", ptPackage.getPTStop_Position()),
				Map.entry("stop_lon", ptPackage.getPTStop_Position()));
	}


	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.gtfs.GTFSPTStopConverter#convertGTFSToPTStopFromFile(java.lang.String)
	 */
	@Override
	public List<PTStop> convertGTFSToPTStopFromFile(String pathToZHVFile, String pathToGTFSFile, String ...municipalities) {
		List<String> stopDHIDs = XMLReader.extractStopsDHIDsFromXML(pathToZHVFile, municipalities);
		List<PTStop> stops = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(pathToGTFSFile))) {
			String line = in.readLine(); //This is the header
			Map<EStructuralFeature, List<Integer>> valuesMap = GTFSConverterHelper.getValuesMap(line, COLUMN_SEPARATOR, FEATURES_MAP);
			int stopIdIndex = GTFSConverterHelper.getColumnIndex("stop_id", line, COLUMN_SEPARATOR);
			while((line = in.readLine()) !=null){
				String[] columnValues = line.split(COLUMN_SEPARATOR);
				String stopId = columnValues[stopIdIndex].replace("\"", "").trim().split("::")[0]; //sometimes the stop_id in stops.txt file is de:xxxx:xxxxx::xxxxxx while in the xml is always de:xxxx:xxxxx so we have to cut out the part after ::
				if(!stopDHIDs.isEmpty() && !stopDHIDs.contains(stopId)) continue;
				PTStop stop = TOSPublicTransportFactory.eINSTANCE.createPTStop();
				valuesMap.forEach((k,v) -> {
					String[] values = new String[v.size()];
					for(int i = 0; i < v.size(); i++) {
						values[i] = columnValues[v.get(i)];
					}
					stop.eSet(k, getEStrucutralFeatureValue(k.getEType(), values));
				});
				
				stop.setDHID(stop.getStopId());
				stops.add(stop);
			}
		} catch(IOException e) {
			LOGGER.log(Level.SEVERE, "IOException when converting Stops. Probably no stops.txt file has been found. You would need first to download it!", e);
			return Collections.emptyList();
		}
		return stops;
	}

	private Object getEStrucutralFeatureValue(EClassifier featureType, String ...values) {
		if(values.length == 1) return getEStrucutralFeatureValue(values[0], featureType);
		if(Position.class.equals(featureType.getInstanceClass()) && values.length == 2) {
			if(values[0].replace("\"", "").trim().isEmpty() || values[1].replace("\"", "").trim().isEmpty()) return null;
			Position position = TOSCommonFactory.eINSTANCE.createPosition();
			position.setLatitude(Double.parseDouble(values[0].replace("\"", "").trim()));
			position.setLongitude(Double.parseDouble(values[1].replace("\"", "").trim()));
			return position;
		}
		
		throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTStopConverter", featureType.getInstanceClassName()));
	}
	
	private Object getEStrucutralFeatureValue(String value, EClassifier featureType) {
		value = value.replace("\"", "").trim(); 
		if(String.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return null;			
//			This is to remove leading 0s in stopId from GTFS data
			while(value.startsWith("0")) value = value.replaceFirst("0", "");
			return value;
		}
		if(Double.class.equals(featureType.getInstanceClass()) || double.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return -1.;
			return Double.parseDouble(value);
		}		
		throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTStopConverter", featureType.getInstanceClassName()));
	}

}
