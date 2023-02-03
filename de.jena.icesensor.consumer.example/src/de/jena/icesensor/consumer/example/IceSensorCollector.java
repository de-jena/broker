/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.icesensor.consumer.example;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.SensorData;

@Component(service = IceSensorCollector.class, scope = ServiceScope.SINGLETON, immediate = true)
public class IceSensorCollector {

	private static final Logger logger = System.getLogger(IceSensorCollector.class.getName());

	@Reference
	private IceSensorService service;
	private int eventCounter = 0;
	private List<SensorData> sensors = new ArrayList<>();
	private Map<String, Consumer<SensorData>> consumers = new HashMap<>();

	private PushStream<SensorData> subcribtion;

	@Activate
	public void activate() {
		subcribtion = service.subcribe();
		subcribtion.forEachEvent(this::handle);
		IceWebSocket.setCollector(this);
		logger.log(Level.INFO, "IceSensorCollector started.");
	}

	@Deactivate
	public void deactivate() {
		subcribtion.close();
		logger.log(Level.INFO, "IceSensorCollector stopped.");
	}

	private long handle(PushEvent<? extends SensorData> event) {
		logger.log(Level.INFO, "Eventcounter: {0}", ++eventCounter);
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			readData(event);
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	/**
	 * @param event
	 */
	private void readData(PushEvent<? extends SensorData> event) {
		try {
			SensorData sensor = event.getData();
			sensors.add(sensor);
			consumers.values().forEach(c -> c.accept(sensor));
//			Coords coords = sensor.getCoords();
//			logger.log(Level.INFO, "Sensor: {0} long: {1} lat: {2} Temp: {3}", sensor.getGateway(),
//					coords.getLongitude(), coords.getLatitude(), sensor.getAvg());
		} catch (Throwable e) {
			logger.log(Level.ERROR, "Error while reading data.", e);
		}
	}

	public String register(Consumer<SensorData> c) {
		sensors.forEach(c);
		String id = c.toString();
		consumers.put(id, c);
		return id;
	}

	public void deregister(String id) {
		consumers.remove(id);
	}

}
