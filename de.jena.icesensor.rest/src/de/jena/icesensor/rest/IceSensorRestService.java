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

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.core.push.dto.GenericDto;
import org.eclipse.sensinact.gateway.geojson.Coordinates;
import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.emf.osgi.constants.EMFUriHandlerConstants;
import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.gecko.qvt.osgi.api.ModelTransformator;
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
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.icesensor.IcesensorPackage;
import de.jena.model.icesensor.SensorData;
import de.jena.model.sensinact.iceprovider.IceSensor;
import de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage;

@Component(service = IceSensorService.class, name = "IceSensorServiceRest", configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
@RequireEMFJson
public class IceSensorRestService implements IceSensorService {

	/** ICE_SENSOR_TOKEN */
	private static final String ICE_SENSOR_TOKEN = "sensor.token";

	private static final Logger logger = System.getLogger(IceSensorRestService.class.getName());

	private static final String ALL_URL = "https://jena.smart-city-factory.com/iceapi/v3/iot/lastdata/all/";

	@Reference(target = "(&(" + EMFNamespaces.EMF_CONFIGURATOR_NAME + "=" + EMFJs.EMFSJON_CAPABILITY_NAME + "))")
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	IcesensorPackage iceSensorepackage;

	@Reference
	DataUpdate sensinact;
	
	@Reference(target = ("(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=icesensore)"))
	private ModelTransformator transformator;
	
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
		for (EObject eObject : sensors) {
			IceSENSOR sensor = (IceSENSOR) eObject;
			IceSensor push = (IceSensor) transformator.doTransformation(sensor);
			
			logger.log(Level.INFO, "Pushing: {0}", push);
			sensinact.pushUpdate(push);
			
			Point point = new Point();
			point.coordinates = new Coordinates();
			point.coordinates.latitude = sensor.getCoords().getLatitude();
			point.coordinates.longitude = sensor.getCoords().getLongitude();
			GenericDto dto = createGenericDto(IcesensoreSensinactPackage.Literals.ICE_SENSOR.getName(), sensor.getIce_id(), "admin", "location", GeoJsonObject.class, point, Instant.now());
			sensinact.pushUpdate(dto);
			logger.log(Level.INFO, "updated Location of: {0}", push.getId());
		}
	}
	
	private void printProvider(EObject eObject) {
		ResourceSet resourceSet = serviceObjects.getService();
        Resource resource = resourceSet.createResource(URI.createURI("file://temp.xmi"));
        resource.getContents().add(EcoreUtil.copy(eObject));
        try {
            resource.save(System.out, null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            resourceSet.getResources().remove(resource);
            serviceObjects.ungetService(resourceSet);
        }
    }
	
	private GenericDto createGenericDto(String model, String provider, String service, String resource, Class<?> type, Object value, Instant timestamp) {
		GenericDto dto = new GenericDto();
		dto.model = model;
		dto.provider = provider;
		dto.service = service;
		dto.resource = resource;
		dto.type = type;
		dto.value = value;
		dto.timestamp = timestamp;
		return dto;	
	}
}
