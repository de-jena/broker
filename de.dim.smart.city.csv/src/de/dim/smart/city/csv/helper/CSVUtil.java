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
package de.dim.smart.city.csv.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

/**
 * 
 * @author ilenia
 * @since Jul 21, 2020
 */
public class CSVUtil {	
	
	public static List<String[]> readFromCSV(InputStream is, char separator, int linesToSkip) throws IOException {
		
		List<String[]> allData = new ArrayList<String[]>();
		try {
			InputStreamReader reader = new InputStreamReader(is, Charset.forName("UTF-8"));
			CSVParser parser = new CSVParserBuilder().withSeparator(separator).build(); 
			CSVReader csvReader = new CSVReaderBuilder(reader)
					.withCSVParser(parser)
					.withSkipLines(linesToSkip)
					.build(); 
			allData = csvReader.readAll(); 
		} catch (CsvException e) {
			e.printStackTrace();
		}		
		return allData;
	}
	
	public static String getSignalGroupStateTypeFromOcit(int state) throws IllegalArgumentException {
		byte colorState = (byte) (state & 0xFF);
		switch(colorState) {
		case 0x03:
		case 0x43:
			return "RED";
		case 0x0C:
		case 0x4C:
			return "AMBER";
		case 0x30:
		case 0x70:
			return "GREEN";
		case 0x0f:
		case 0x4f:
			return "RED_AMBER";
		case 0x02:
		case 0x42:
		case 0x01:
		case 0x41:
			return "RED_FLASHING";
		case 0x08:
		case 0x48:
		case 0x04:
		case 0x44:
			return "AMBER_FLASHING";
		case 0x20:
		case 0x60:
		case 0x10:
		case 0x50:
			return "GREEN_FLASHING";
		case 0x00:
		case 0x40:
			return "DARK";
		default:
			return "UNKNOWN";
		}
	}
	
	public static String getOutputStateTypeFromOcit(int outputState) throws IllegalArgumentException {
		byte state = (byte)outputState;
		switch(state) {
		case 0x00:
			return "OFF";
		case 0x03:
			return "ON";
		case 0x02:
			return "BLINK_START_ON";
		case 0x42:
			return "BLINK_START_ON_2HZ";
		case (byte) 0xFF:
			return "UNKNOWN";
		case 0x01:
			return "BLINK_START_OFF";
		case 0x41:
			return "BLINK_START_OFF_2HZ";
		default:
			return "UNKNOWN";
		}
	}



}
