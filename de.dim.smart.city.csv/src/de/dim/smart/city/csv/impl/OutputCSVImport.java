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
package de.dim.smart.city.csv.impl;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;

import de.dim.smart.city.csv.api.CSVImportService;
import de.dim.smart.city.csv.helper.CSVUtil;
import de.dim.smart.city.csv.helper.IdGenerator;
import de.dim.trafficos.model.device.DataEntry;
import de.dim.trafficos.model.device.DataValue;
import de.dim.trafficos.model.device.IdNameElement;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.Parameter;
import de.dim.trafficos.model.device.ParameterDataType;
import de.dim.trafficos.model.device.TOSDeviceFactory;

@Component(immediate = true, name = "OutputCSVImport")
public class OutputCSVImport implements CSVImportService{

	@Reference(target = "(repo_id=test.test)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	EMFRepository repo;

	private Map<String, IdNameElement> outputMap;

	private Map<String, DataEntry> dataEntryMap;

	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.GERMAN);

	private static final Logger logger = Logger.getLogger(OutputCSVImport.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.csv.api.CSVImportService#importCSV(java.io.InputStream)
	 */
	@Override
	public void importCSV(InputStream is) throws IOException, ParseException {

		long start = System.currentTimeMillis();

		List<String[]> allData = CSVUtil.readFromCSV(is, ';', 0);
		PushStreamProvider psp = new PushStreamProvider();
		PushStream<String[]> pushStream = psp.streamOf(allData.stream());
		outputMap = new HashMap<>();
		dataEntryMap = new HashMap<>();

		pushStream.forEach(r-> {
			try {
				createObjects(r);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		});


		outputMap.values().stream().forEach(o-> {
			repo.save(o);
		});

		System.out.println("Total Data Entry to be saved " + dataEntryMap.size());
		int index = 0;
		List<DataEntry> sortedDataEntry = dataEntryMap.values().stream().sorted((e1,e2) -> e1.getTimestamp().compareTo(e2.getTimestamp())).collect(Collectors.toList());
		for(DataEntry e : sortedDataEntry) {			
			index++;
//			if(index > 10000) {
				repo.save(e);
//			}
			if(index % 1000 == 0) {
				System.out.println("Saved " + index + " entries over " + dataEntryMap.size());
			}
			if(index == 20000) {
				break;
			}
		}
		System.out.println("Import of 20000 entries took " + ((System.currentTimeMillis()-start)/1000) + " sec");		
	}

	private void createObjects(String[] row) throws ParseException {

		if(row[0].isEmpty() || "RELKNOTEN_STATUS".equals(row[0]) || "AMLI_R09".equals(row[0])) {
			return;
		}
		IdNameElement obj = null;
		if("AP_RELKNOTEN".equals(row[0])) { //We need to build a Parameter
			obj = createParameter(row);
		}
		else {
			obj = createOutput(row);			
		}
		outputMap.put(obj.getId(), obj);
		createDataEntry(obj, row);	
	}

	/**
	 * @param obj
	 * @param row
	 * @throws ParseException 
	 */
	private void createDataEntry(IdNameElement obj, String[] row) throws ParseException {
		for(int j = 3; j < row.length; j += 3) {

			if(!row[j].isEmpty()) {
				String timeStr = row[j];
				DataEntry entry = null;
				if(dataEntryMap.containsKey(timeStr)) {
					entry = dataEntryMap.get(timeStr);
				}
				else {
					entry = TOSDeviceFactory.eINSTANCE.createDataEntry();
					entry.setId(UUID.randomUUID().toString());
					Date timestamp = SDF.parse(timeStr);
					entry.setTimestamp(timestamp);
					dataEntryMap.put(timeStr, entry);
				}
				
				DataValue dataValue = TOSDeviceFactory.eINSTANCE.createDataValue();
				dataValue.setElement(EcoreUtil.copy(obj));
				dataValue.setElementRef(obj);
				if(!row[j+1].isEmpty()) {
					String value = null;
					if(obj instanceof Output) {
						Output output = (Output) obj;
						switch(output.getType()) {
						case "SGR":
							value = CSVUtil.getSignalGroupStateTypeFromOcit(Integer.parseInt(row[j+1]));
							break;
						case "DET":
							value = CSVUtil.getOutputStateTypeFromOcit(Integer.parseInt(row[j+1]));
							break;
						default:
							value = row[j+1];
							break;
						}						
					}					
					else {
						value = row[j+1];
					}			
					if(j+3 < row.length && !row[j+3].isEmpty()) {
						Date timestamp = SDF.parse(row[j+3]);
						long diffInMillies = Math.abs(timestamp.getTime() - entry.getTimestamp().getTime());
						long diff = TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);
						dataValue.setDuration((int)diff);
					}
					dataValue.setValue(value);
				}
				entry.getValue().add(dataValue);	
				dataEntryMap.put(timeStr, entry);
			}				
		}
	}

	/**
	 * @param row
	 * @return
	 */
	private Output createOutput(String[] row) {

		Output output = TOSDeviceFactory.eINSTANCE.createOutput();		
		output.setType(row[0]);		

		if(!row[1].isEmpty()) {
			output.setDescription(row[1]);
			String id = IdGenerator.generateId(row[1], output.getType());
			if(!id.isEmpty()) {
				output.setId(id);
			}
			else {
				logger.warning("Failed to construct id for Output. Generating a random one.");
				String genId = UUID.randomUUID().toString();
				output.setId(genId);
			}	
		}
		else {
			logger.warning("Failed to construct id for Output. Generating a random one.");
			String genId = UUID.randomUUID().toString();
			output.setId(genId);
		}		
		if(!row[2].isEmpty()) {
			output.setName(row[2]);
		}
		else {
			output.setName(output.getId());
		}
		return output;
	}

	/**
	 * @param row
	 * @return
	 */
	private Parameter createParameter(String[] row) {
		Parameter par = TOSDeviceFactory.eINSTANCE.createParameter();
		if(!row[1].isEmpty()) {			
			String id = IdGenerator.generateId(row[1], "AP_RELKNOTEN");
			if(!id.isEmpty()) {
				par.setId(id);
				par.setName(id.substring(id.lastIndexOf(".") +1));
				switch(par.getName()) {
				case "TX":
				case "SPLTU":
					par.setDataType(ParameterDataType.INTEGER);
					break;
				}
			}
			else {
				logger.warning("Failed to construct id for Parameter. Generating a random one.");
				String genId = UUID.randomUUID().toString();
				par.setId(genId);
				par.setName(genId);
			}

		}
		else {
			logger.warning("Failed to construct id for Parameter. Generating a random one.");
			String genId = UUID.randomUUID().toString();
			par.setId(genId);
			par.setName(genId);
		}
		return par;
	}
}
