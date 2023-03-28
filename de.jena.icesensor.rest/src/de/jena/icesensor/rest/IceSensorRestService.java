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
package de.jena.icesensor.rest;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.SimplePushEventSource;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.Data;
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.icesensor.IcesensorPackage;
import de.jena.model.icesensor.SensorData;

@Component(service = IceSensorService.class, name = "IceSensorServiceRest", configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
@RequireEMFJson
public class IceSensorRestService implements IceSensorService {

	/** ICE_SENSOR_TOKEN */
	private static final String ICE_SENSOR_TOKEN = "sensor.token";

	private static final Logger logger = System.getLogger(IceSensorRestService.class.getName());

	private static final String ALL_URL = "https://jena.smart-city-factory.com/iceapi/v3/iot/lastdata/all/";

	@Reference(target = "(&(emf.resource.configurator.name=" + EMFJs.EMFSJON_CAPABILITY_NAME + "))")
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	IcesensorPackage iceSensorepackage;

	private ScheduledExecutorService executor;
	private PushStreamProvider provider;
	private List<SimplePushEventSource<SensorData>> eventSources = new ArrayList<>();

	private String token;

	public @interface RestConfig {
		String token();

		int interval() default 1;
	}

	@Activate
	public void activate(RestConfig config) {
		token = System.getProperty(ICE_SENSOR_TOKEN, config.token());
		provider = new PushStreamProvider();
		logger.log(Level.INFO, "Rest client activated.");
		executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(this::update, 0, config.interval(), TimeUnit.MINUTES);
	}

	@Deactivate
	public void deactivate() {
		eventSources.forEach(SimplePushEventSource::close);
		executor.shutdown();
		logger.log(Level.INFO, "Rest client stopped.");
	}

	@Override
	public PushStream<SensorData> subcribe() {
		SimplePushEventSource<SensorData> source = provider.buildSimpleEventSource(SensorData.class).build();
		eventSources.add(source);
		return provider.createStream(source);
	}

	private void update() {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI(ALL_URL), "application/json");
		try {
			resource.load(getLoadOptions());
			ArrayList<EObject> sensors = new ArrayList<>(resource.getContents());
			resource.getContents().clear();
			logger.log(Level.INFO, "Sources: {0} sensors: {1}", eventSources.size(), sensors.size());
			publish(sensors);
		} catch (Throwable e) {
			resource.getErrors().forEach(x -> System.out.println(x.getMessage()));
			e.printStackTrace();
		} finally {
			serviceObjects.ungetService(resourceSet);
		}
	}

	private Map<String, Object> getLoadOptions() {
		Map<String, Object> loadOption = new HashMap<>();
		loadOption.put(EMFJs.OPTION_ROOT_ELEMENT, iceSensorepackage.getIceSENSOR());
		loadOption.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, getHeader());
		return loadOption;
	}

	private Map<String, Object> getHeader() {
		Map<String, Object> headers = new HashMap<>();
		headers.put("Authorization", "Token " + token);
		headers.put("Accept", "application/json");
		return headers;
	}

	private void publish(List<EObject> sensors) {
		for (EObject sensor : sensors) {
			Iterator<SimplePushEventSource<SensorData>> it = eventSources.iterator();
			while (it.hasNext()) {
				SimplePushEventSource<SensorData> source = it.next();
				if (source.isConnected()) {
					IceSENSOR iceSensor = (IceSENSOR) EcoreUtil.copy(sensor);
					Data data = iceSensor.getData();
					pub(source, iceSensor, data.getTemperature());
					pub(source, iceSensor, data.getHumidity());
					pub(source, iceSensor, data.getNo2ugm3());
					pub(source, iceSensor, data.getO3ugm3());
					pub(source, iceSensor, data.getPressure());
				} else
					it.remove();
			}
		}
	}

	private void pub(SimplePushEventSource<SensorData> source, IceSENSOR iceSensor, SensorData data) {
		data.setGateway(iceSensor.getIce_id());
		data.setSensor_type(data.eContainingFeature().getName());
		source.publish(data);
	}

}
