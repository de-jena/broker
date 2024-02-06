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
package de.dim.trafficos.gtfs.component.helper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
public class GTFSConverterHelper {
	
	public static int getColumnIndex(String columnName, String tableHeader, String columnSeparator) {
		String[] columnNames = tableHeader.split(columnSeparator);
		for(int i = 0; i < columnNames.length; i++) {
			if(columnName.equals(columnNames[i].replace("\"", ""))) return i;
		}
		return -1;
	}

	//	This is to retrieve at which column the info we need are located in the file, since it might not always be in the same order.
	public static Map<EStructuralFeature, List<Integer>> getValuesMap(String tableHeader, String columnSeparator, Map<String, EStructuralFeature> featuresMap) {
		Map<EStructuralFeature, List<Integer>> valuesMap = new HashMap<>();
		String[] columnNames = tableHeader.split(columnSeparator);
		for(int i = 0; i < columnNames.length; i++) {
			if(featuresMap.containsKey(columnNames[i].replace("\"", ""))) {
				if(!valuesMap.containsKey(featuresMap.get(columnNames[i].replace("\"", "")))) {
					valuesMap.put(featuresMap.get(columnNames[i].replace("\"", "")), new ArrayList<Integer>());
				}
				valuesMap.get(featuresMap.get(columnNames[i].replace("\"", ""))).add(i);
			}
		}
		return valuesMap;
	}
	
//	This does the same but for the calendar info, which we just have as a Pojo and not as an EObject because we do not want to store it in the db
	public static Map<Field, List<Integer>> getFieldValuesMap(String tableHeader, String columnSeparator, Map<String, Field> featuresMap) {
		Map<Field, List<Integer>> valuesMap = new HashMap<>();
		String[] columnNames = tableHeader.split(columnSeparator);
		for(int i = 0; i < columnNames.length; i++) {
			if(featuresMap.containsKey(columnNames[i].replace("\"", ""))) {
				if(!valuesMap.containsKey(featuresMap.get(columnNames[i].replace("\"", "")))) {
					valuesMap.put(featuresMap.get(columnNames[i].replace("\"", "")), new ArrayList<Integer>());
				}
				valuesMap.get(featuresMap.get(columnNames[i].replace("\"", ""))).add(i);
			}
		}
		return valuesMap;
	}

}
