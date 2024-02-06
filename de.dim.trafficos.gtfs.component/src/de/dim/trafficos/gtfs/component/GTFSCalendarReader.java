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
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.dim.trafficos.gtfs.component.helper.GTFSCalendar;
import de.dim.trafficos.gtfs.component.helper.GTFSCalendarDate;
import de.dim.trafficos.gtfs.component.helper.GTFSConverterHelper;

/**
 * 
 * @author ilenia
 * @since Jul 6, 2023
 */
@Component(name = "GTFSCalendarReader", immediate = true, service = GTFSCalendarReader.class)
public class GTFSCalendarReader {
	
//	This regex should match all the commas that are not within quotes
	private static final String COLUMN_SEPARATOR = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
	private Map<String, Field> CALENDAR_FIELD_MAP;
	private Map<String, Field> CALENDAR_DATES_FIELD_MAP;

	
	@Activate
	public void activate() throws NoSuchFieldException, SecurityException {
		CALENDAR_FIELD_MAP = Map.ofEntries(
				Map.entry("service_id", GTFSCalendar.class.getDeclaredField("serviceId")),
				Map.entry("monday", GTFSCalendar.class.getDeclaredField("monday")),
				Map.entry("tuesday", GTFSCalendar.class.getDeclaredField("tuesday")),
				Map.entry("wednesday", GTFSCalendar.class.getDeclaredField("wednesday")),
				Map.entry("thursday", GTFSCalendar.class.getDeclaredField("thursday")),
				Map.entry("friday", GTFSCalendar.class.getDeclaredField("friday")),
				Map.entry("saturday", GTFSCalendar.class.getDeclaredField("saturday")),
				Map.entry("sunday", GTFSCalendar.class.getDeclaredField("sunday")),
				Map.entry("start_date", GTFSCalendar.class.getDeclaredField("start")),
				Map.entry("end_date", GTFSCalendar.class.getDeclaredField("end")));
		
		CALENDAR_DATES_FIELD_MAP = Map.ofEntries(
				Map.entry("service_id", GTFSCalendarDate.class.getDeclaredField("serviceId")),
				Map.entry("date", GTFSCalendarDate.class.getDeclaredField("date")),
				Map.entry("exception_type", GTFSCalendarDate.class.getDeclaredField("exceptionType")));
	}
	

	public List<GTFSCalendar> extractGTFSCalendarFromFiles(String calendarGTFSFile, String calendarDatesGTFSFile) {
		List<GTFSCalendar> calendars = extractCalendars(calendarGTFSFile);
		addExceptionDates(calendars, calendarDatesGTFSFile);
		return calendars;
	}
	
	
	private void addExceptionDates(List<GTFSCalendar> calendars, String calendarDatesGTFSFile) {
		List<GTFSCalendarDate> calendarDates = extractCalendarDates(calendarDatesGTFSFile);
		calendars.forEach(c -> {
			List<GTFSCalendarDate> exceptionDates = calendarDates.stream().filter(cd -> cd.getServiceId().equals(c.getServiceId())).toList();
			exceptionDates.forEach(ed -> {
				if(ed.getExceptionType() == 1) c.getIncluded().add(ed.getDate());
				else if(ed.getExceptionType() == 2) c.getExcluded().add(ed.getDate());
			});
		});
		
	}

	private List<GTFSCalendarDate> extractCalendarDates(String calendarDatesGTFSFile) {
		List<GTFSCalendarDate> calendarDates = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(calendarDatesGTFSFile))) {
			String line = in.readLine(); //This is the header
			Map<Field, List<Integer>> valuesMap = GTFSConverterHelper.getFieldValuesMap(line, COLUMN_SEPARATOR, CALENDAR_DATES_FIELD_MAP);
			while((line = in.readLine()) !=null){
				String[] columnValues = line.split(COLUMN_SEPARATOR);
				GTFSCalendarDate calendarDate = new GTFSCalendarDate();
				valuesMap.forEach((k,v) -> {
					String[] values = new String[v.size()];
					for(int i = 0; i < v.size(); i++) {
						values[i] = columnValues[v.get(i)];
					}			
					try {
						setCalendarField(k, calendarDate, values);
					} catch(Exception e) {
						e.printStackTrace();
					}
				});
				calendarDates.add(calendarDate);
			}
		} catch(IOException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
		return calendarDates;
	}

	private List<GTFSCalendar> extractCalendars(String calendarGTFSFile) {
		List<GTFSCalendar> calendars = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(calendarGTFSFile))) {
			String line = in.readLine(); //This is the header
			Map<Field, List<Integer>> valuesMap = GTFSConverterHelper.getFieldValuesMap(line, COLUMN_SEPARATOR, CALENDAR_FIELD_MAP);
			while((line = in.readLine()) !=null){
				String[] columnValues = line.split(COLUMN_SEPARATOR);
				GTFSCalendar calendar = new GTFSCalendar();
				valuesMap.forEach((k,v) -> {
					String[] values = new String[v.size()];
					for(int i = 0; i < v.size(); i++) {
						values[i] = columnValues[v.get(i)];
					}			
					try {
						setCalendarField(k, calendar, values);
					} catch(Exception e) {
						e.printStackTrace();
					}
				});
				calendars.add(calendar);
			}
		} catch(IOException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
		return calendars;
	}
	
	private void setCalendarField(Field field, Object calendar, String... values) throws IllegalArgumentException, IllegalAccessException {
		if(values.length != 1) 	throw new IllegalStateException(String.format("Field with multiple values not yet implemented for GTFSCalendarReader"));
		String value = values[0].replace("\"", "").trim();
		field.setAccessible(true);
		if(String.class.equals(field.getType())) {
			field.set(calendar, value);
			return;
		}
		if(boolean.class.equals(field.getType())) {
			field.setBoolean(calendar, value.equals("0") ? false : true);
			return;
		}
		if(LocalDate.class.equals(field.getType())) {
			field.set(calendar, LocalDate.parse(value, DATE_TIME_FORMATTER));
			return;
		}
		if(int.class.equals(field.getType())) {
			if(value.isEmpty()) field.setInt(calendar, -1);
			else field.setInt(calendar, Integer.parseInt(value));
			return;
		}
		throw new IllegalStateException(String.format("Field type %s not yet implemented for GTFSCalendarReader", field.getType().getName()));
	}
	
	
}
