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
import de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTRouteConverter;
import de.jena.udp.model.trafficos.publictransport.PTRoute;
import de.jena.udp.model.trafficos.publictransport.PTRouteType;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportFactory;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

@Component(name = "GTFSToPTRouteConverter", service = GTFSToPTRouteConverter.class)
public class GTFSToPTRouteConverterImpl implements GTFSToPTRouteConverter {

	private static final String COLUMN_SEPARATOR = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
	private static final Logger LOGGER = Logger.getLogger(GTFSToPTRouteConverterImpl.class.getName());

	private Map<String, EStructuralFeature> FEATURES_MAP;
	
	@Activate
	public GTFSToPTRouteConverterImpl(@Reference TOSPublicTransportPackage ptPackage) {
		FEATURES_MAP = Map.ofEntries(
				Map.entry("route_id", ptPackage.getPTRoute_RouteId()),
				Map.entry("route_short_name", ptPackage.getPTRoute_ShortName()),
				Map.entry("route_long_name", ptPackage.getPTRoute_LongName()),
				Map.entry("route_desc", ptPackage.getPTRoute_Description()),
				Map.entry("route_type", ptPackage.getPTRoute_Type()),
				Map.entry("route_color", ptPackage.getPTRoute_Color()));
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSToPTRouteConverter#convertGTFSToPTRouteFromFile(java.lang.String, java.lang.String[])
	 */
	@Override
	public List<PTRoute> convertGTFSToPTRouteFromFile(String pathToGTFSFile, String... routeIds) {
		if(routeIds == null) routeIds = new String[0];
		List<PTRoute> routes = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(pathToGTFSFile))) {
			String line = in.readLine(); //This is the header
			Map<EStructuralFeature, List<Integer>> valuesMap = GTFSConverterHelper.getValuesMap(line, COLUMN_SEPARATOR, FEATURES_MAP);
			int routeIdIndex = GTFSConverterHelper.getColumnIndex("route_id", line, COLUMN_SEPARATOR);
			while((line = in.readLine()) !=null){
				String[] columnValues = line.split(COLUMN_SEPARATOR);
				String routeId = columnValues[routeIdIndex].replace("\"", "").trim(); 
				if(routeIds.length > 0 && !List.of(routeIds).contains(routeId)) continue;
				PTRoute route = TOSPublicTransportFactory.eINSTANCE.createPTRoute();
				valuesMap.forEach((k,v) -> {
					String[] values = new String[v.size()];
					for(int i = 0; i < v.size(); i++) {
						values[i] = columnValues[v.get(i)];
					}
					route.eSet(k, getEStrucutralFeatureValue(k.getEType(), values));
				});
				routes.add(route);
			}
		} catch(IOException e) {
			LOGGER.log(Level.SEVERE, "Error converting GTFS t0 PTRoute from " + pathToGTFSFile, e);
			return Collections.emptyList();
		}
		return routes;
	}


	private Object getEStrucutralFeatureValue(EClassifier featureType, String... values) {
		if(values.length != 1) throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTRouteConverter", featureType.getInstanceClassName()));
		String value = values[0].replace("\"", "").trim();
		if(String.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return null;
			return value;
		}
		if(PTRouteType.class.equals(featureType.getInstanceClass())) {
			if(value.isEmpty()) return getTypeFromNum(100);
			return getTypeFromNum(Integer.parseInt(value));
		}
		
		throw new IllegalStateException(String.format("Data type %s not yet implemented for GTFSToPTRouteConverter", featureType.getInstanceClassName()));
	}
	
	private PTRouteType getTypeFromNum(int number) {
		switch(number) {
		case 0: return PTRouteType.TRAM;
		case 1: return PTRouteType.SUBWAY;
		case 2: return PTRouteType.RAIL;
		case 3: return PTRouteType.BUS;
		case 4: return PTRouteType.FERRY;
		case 5: return PTRouteType.CABLE_TRAM;
		case 6: return PTRouteType.AERIAL_LIFT;
		case 7: return PTRouteType.FUNICULAR;
		case 11: return PTRouteType.TROLLEY_BUS;
		case 12: return PTRouteType.MONORAIL;
		default: return PTRouteType.OTHER;	
		}
	}
}
