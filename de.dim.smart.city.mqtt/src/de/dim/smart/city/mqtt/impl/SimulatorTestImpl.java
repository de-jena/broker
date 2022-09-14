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
package de.dim.smart.city.mqtt.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.IQueryBuilder;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

import de.dim.smart.city.mqtt.api.SenderTestService;
import de.dim.smart.city.mqtt.api.SimulatorTestService;
import de.dim.trafficos.model.device.DataEntry;
import de.dim.trafficos.model.device.PublicTransportDataEntry;
import de.dim.trafficos.model.device.PublicTransportLine;
import de.dim.trafficos.model.device.TOSDevicePackage;

/**
 * 
 * @author ilenia
 * @since Jul 27, 2020
 */
@Component
public class SimulatorTestImpl implements SimulatorTestService {
	
	@Reference
	SenderTestService senderService;
	
	@Reference(target = "(repo_id=test.test)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	ComponentServiceObjects<EMFRepository> repoObjects;
	
	private static final Logger logger = Logger.getLogger(SimulatorTestImpl.class.getName());
	
	private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.GERMAN);
	
	private final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
	private ScheduledFuture<?> simulationFuture;
	private ReentrantLock simLock = new ReentrantLock(true);
	private int counter = 0;
	
	private Date startDate;
	private Date endDate;
	
	private Map<Long, DataEntry> dataEntryMap = new HashMap<>();
	private Map<Long, PublicTransportDataEntry> ptDataEntryMap = new HashMap<>();
	
	@Deactivate
	public void deactivate() {
		stopSimulation();
		ses.shutdown(); 
		try {
			if (!ses.awaitTermination(60, TimeUnit.SECONDS)) {
				ses.shutdownNow(); 
			}
		} catch (InterruptedException ie) {
			ses.shutdownNow();
			Thread.currentThread().interrupt();
		}	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.mqtt.api.SimulatorTestService#startSimulation()
	 */
	@Override
	public void startSimulation() {
		if(simulationFuture != null && !simulationFuture.isDone()) {
			logger.warning("Simulation is still running. Can't start a second one");
			return;
		}
		dataEntryMap.clear();
		ptDataEntryMap.clear();
		
		try {
			startDate = SDF.parse("2020-07-06 07:30:00.000+0200");
			endDate = SDF.parse("2020-07-06 09:00:00.000+0200");			
		} catch (ParseException e) {
			logger.severe("Error parsing starting date");
			return;
		}
		
		EMFRepository repo = repoObjects.getService();
		
		QueryRepository queryRepo = (QueryRepository) repo;
		IQueryBuilder builder = queryRepo.createQueryBuilder();
		IQuery query = builder.rangeQuery().column(TOSDevicePackage.Literals.ABSTRACT_DATA_ENTRY__TIMESTAMP).startValue(startDate).endValue(endDate).build();
		List<DataEntry> cachedDataEntry = queryRepo.getEObjectsByQuery(TOSDevicePackage.Literals.DATA_ENTRY, query, null);
		List<PublicTransportDataEntry> cachedPTDataEntry = queryRepo.getEObjectsByQuery(TOSDevicePackage.Literals.PUBLIC_TRANSPORT_DATA_ENTRY, query, null);
		for(DataEntry e : cachedDataEntry) {
			Long time = e.getTimestamp().getTime();
			if(!dataEntryMap.containsKey(time)) {
				dataEntryMap.put(time, e);
			}		
			else {
				System.out.println("Duplicate Data Entry for " + time);
			}
		}
		for(PublicTransportDataEntry e : cachedPTDataEntry) {
			Long time = e.getTimestamp().getTime();
			if(!ptDataEntryMap.containsKey(time)) {
				ptDataEntryMap.put(time, e);
			}	
			else {
				System.out.println("Duplicate PT Data Entry for " + time);
			}
		}
		counter = 0;
		repoObjects.ungetService(repo);
		logger.info("Scheduling Simluation");
		simulationFuture = ses.scheduleAtFixedRate(this::simulate, 0, 1, TimeUnit.SECONDS);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.mqtt.api.SimulatorTestService#stopSimulation()
	 */
	@Override
	public void stopSimulation() {
		simulationFuture.cancel(true);
		while(!simulationFuture.isDone()) {
			try {
				Thread.sleep(50l);
			} catch (InterruptedException e) {
				logger.severe(String.format("[%s] Simulation stopping was interrupted"));
			}
		}
		logger.info("Simulation stopped");
	}
	
	private void simulate() {
		if(counter > 500) {
			System.out.println("Restarting simulation");
			stopSimulation();
			ses.submit(this::startSimulation);
		}
		else if (simLock.tryLock()) {
			try {
				doSimulate();
			} finally {
				simLock.unlock();
			}
		} else {
			logger.warning(String.format("[%s] Simulation step is currently in progress, waiting"));
		}		
	}


	/**
	 * @param counter
	 */
	private void doSimulate() {
		
		Date d1 = new Date(startDate.getTime()+counter*1000);
		Date d2 = new Date(startDate.getTime()+(counter+1)*1000);
		Long t1 = d1.getTime();
		Long t2 = d2.getTime();
		
		List<DataEntry> entries = dataEntryMap.keySet().stream().filter(f->(f>=t1 && f<t2)).map(k->dataEntryMap.get(k))
				.collect(Collectors.toList());
		
		List<PublicTransportDataEntry> ptEntries = ptDataEntryMap.keySet().stream().filter(f->(f>=t1 && f<t2)).map(k->ptDataEntryMap.get(k))
				.collect(Collectors.toList());
		
		System.out.println("Simualting for timestamp " + counter + " timestamp " + d1 + " DataEntry " + entries.size() + " PT Entries " + ptEntries.size());
		for(DataEntry de : entries) {
			senderService.sendEObject(de, "intersection/data/entry");
		}
		for(PublicTransportDataEntry pde : ptEntries) {
			PublicTransportDataEntry eObject = EcoreUtil.copy(pde);
			eObject.getDataValue().forEach(v -> {
				PublicTransportLine line = (PublicTransportLine) v.getLineRef();
				v.setLineRef(null);
				v.getValue().setName(line.getName());
			});
			senderService.sendEObject(eObject, "public/transport/data/entry");			
		}
		counter++;
	}

}
