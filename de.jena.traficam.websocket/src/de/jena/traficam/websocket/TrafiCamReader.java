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
package de.jena.traficam.websocket;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.SimplePushEventSource;

import de.jena.traficam.api.TrafiCamService;
import traficam.TrafiCam;
import traficam.TrafiCamPackage;

@Component(service = { TrafiCamService.class, TrafiCamReader.class }, name = "TrafiCamServiceWebsocket")
@RequireEMFJson
public class TrafiCamReader implements TrafiCamService {

	private PushStreamProvider provider;
	private List<SimplePushEventSource<TrafiCam>> eventSources = new ArrayList<>();
	@Reference(target = "(&(emf.resource.configurator.name=" + EMFJs.EMFSJON_CAPABILITY_NAME + "))")
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	TrafiCamPackage trafiCampackage;

	@Activate
	public void activate() {
		provider = new PushStreamProvider();
	}

	@Deactivate
	public void deactivate() {
		eventSources.forEach(SimplePushEventSource::close);
	}

	@Override
	public PushStream<TrafiCam> subscribe() {
		SimplePushEventSource<TrafiCam> source = provider.buildSimpleEventSource(TrafiCam.class).build();
		eventSources.add(source);
		return provider.createStream(source);
	}

	public void read(String msg) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI("dummy"), "application/json");
		try {
			Map<String, Object> loadOption = new HashMap<>();
			loadOption.put(EMFJs.OPTION_ROOT_ELEMENT, trafiCampackage.getTrafiCam());
			InputStream stream = new ByteArrayInputStream(msg.getBytes(StandardCharsets.UTF_8));

			resource.load(stream, loadOption);
			ArrayList<EObject> sensors = new ArrayList<>(resource.getContents());
			resource.getContents().clear();
			publish(sensors);
		} catch (Throwable e) {
			resource.getErrors().forEach(diag -> System.out.println(diag.getMessage()));
			e.printStackTrace();
		} finally {
			serviceObjects.ungetService(resourceSet);
		}

	}

	private void publish(List<EObject> sensors) {
		for (EObject sensor : sensors) {
			Iterator<SimplePushEventSource<TrafiCam>> it = eventSources.iterator();
			while (it.hasNext()) {
				SimplePushEventSource<TrafiCam> source = it.next();
				if (source.isConnected()) {
					TrafiCam msg = (TrafiCam) EcoreUtil.copy(sensor);
					source.publish(msg);
				} else
					it.remove();
			}
		}
	}
}
