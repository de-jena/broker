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
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.PushbackPolicyOption;
import org.osgi.util.pushstream.QueuePolicyOption;
import org.osgi.util.pushstream.SimplePushEventSource;

import de.jena.traficam.TrafiCam;
import de.jena.traficam.TrafiCamPackage;

// configure using reader config in ConfigurationUpdater#configureReader
@Component(service = TrafiCamReader.class , name = "TrafiCamReader", configurationPolicy = ConfigurationPolicy.REQUIRE)
@RequireEMFJson
public class TrafiCamReader {
	private static final Logger logger = System.getLogger(TrafiCamReader.class.getName());

	private PushStreamProvider provider;
	private SimplePushEventSource<TrafiCam> source;
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference
	TrafiCamPackage trafiCampackage;

	@Activate
	public void activate() {
		provider = new PushStreamProvider();
	}

	@Deactivate
	public void deactivate() {
		if (source != null) {
			source.close();
		}
	}

	public PushStream<TrafiCam> subscribe() {
		if(source != null) {
			source.close();
		}
		source = provider.buildSimpleEventSource(TrafiCam.class).build();
		return provider.buildStream(source).withPushbackPolicy(PushbackPolicyOption.ON_FULL_EXPONENTIAL.getPolicy(1))
				.withQueuePolicy(QueuePolicyOption.BLOCK).withExecutor(Executors.newCachedThreadPool())
				.withBuffer(new ArrayBlockingQueue<>(1000)).build();
	}

	protected void read(String msg) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI("dummy"), "application/json");
		try {
			Map<String, Object> loadOption = new HashMap<>();
			loadOption.put(EMFJs.OPTION_ROOT_ELEMENT, trafiCampackage.getTrafiCam());
			InputStream stream = new ByteArrayInputStream(msg.getBytes(StandardCharsets.UTF_8));
			resource.load(stream, loadOption);
			ArrayList<EObject> camObjects = new ArrayList<>(resource.getContents());
			resource.getContents().clear();
			camObjects.forEach(this::publish);
		} catch (Throwable e) {
			resource.getErrors().forEach(diag -> logger.log(Level.ERROR, diag.getMessage()));
			logger.log(Level.ERROR, "Error while reading camera data", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}

	}

	private void publish(EObject camObject) {
		if (source != null && source.isConnected()) {
			source.publish((TrafiCam) EcoreUtil.copy(camObject));
		}
	}
}
