/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.sensinact.tlc.control.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.sensinact.rest.tlc.control.model.control.Control;
import de.jena.sensinact.rest.tlc.control.model.control.Phase;
import de.jena.sensinact.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.rest.tlc.control.model.control.TlcControlFactory;
import de.jena.sensinact.tlc.control.service.api.TlcControl;
import de.jena.udp.model.trafficos.trafficlight.TLConfiguration;
import de.jena.udp.model.trafficos.trafficlight.TLPhase;
import de.jena.udp.model.trafficos.trafficlight.TLPhaseState;
import de.jena.udp.model.trafficos.trafficlight.TOSTrafficLightPackage;

/**
 * 
 * @author grune
 * @since Jun 17, 2024
 */
@Component(service = TlcControl.class, enabled = true, scope = ServiceScope.PROTOTYPE)
public class MQTTTlcControlImpl implements TlcControl {
	private static final Logger logger = System.getLogger(MQTTTlcControlImpl.class.getName());
	private static final String CONFIG_TOPIC = "5g/ilsa/+/config/#";
	private static final String PHASE_TOPIC = "5g/ilsa/+/phase/#";

	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;
	
	@Reference(target = "(id=full)")
	private MessagingService messaging;
	
	@Reference
	private TOSTrafficLightPackage tlPackage;
	@Reference
	private TlcControlFactory tlCfactory;

	private PushStream<Message> configSubscription;
	private Map<String, TLConfiguration> tlConfigs = new HashMap<>();
	private PushStream<Message> phaseSubscription;
	private Map<String, Integer> currentPhase;

	@Activate
	public void activate() {
		try {
			configSubscription = messaging.subscribe(CONFIG_TOPIC);
			configSubscription.forEachEvent(this::handleConfig);
			phaseSubscription = messaging.subscribe(PHASE_TOPIC);
			phaseSubscription.forEachEvent(this::handlePhase);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error subscribing mqtt {0}.\n{1}", CONFIG_TOPIC, e);
		}
		logger.log(Level.INFO, "Sensinact Traffic Light started.");
	}

	@Deactivate
	private void deactivate() {
		configSubscription.close();
	}

	private long handleConfig(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			loadConfig(event.getData());
			break;
		case ERROR:
			logger.log(Level.ERROR, "Error while handling message from {0} topic.\n{1}", CONFIG_TOPIC,
					event.getFailure());
			break;
		}
		return 0;
	}

	private long handlePhase(PushEvent<? extends Message> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			loadPhase(event.getData());
			break;
		case ERROR:
			logger.log(Level.ERROR, "Error while handling message from {0} topic.\n{1}", PHASE_TOPIC,
					event.getFailure());
			break;
		}
		return 0;
	}

	private void loadConfig(Message message) {
		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI("dummy_config"), "application/json");
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()),
					Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, tlPackage.getTLConfiguration()));
			TLConfiguration config = (TLConfiguration) resource.getContents().get(0);
			tlConfigs.put(config.getIntersectionId(), config);
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error loading intersection configuration from {0}.\n{1}", message.topic(), e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}

	}

	private void loadPhase(Message message) {
		String tlcId = message.topic().split("/")[2];
		String payload = StandardCharsets.UTF_8.decode(message.payload()).toString();
		int phase = Integer.parseInt(payload);
		currentPhase.put(tlcId, phase);

		ResourceSet resourceSet = serviceObjects.getService();
		Resource resource = resourceSet.createResource(URI.createURI("dummy_phase_"+tlcId), "application/json");
		try {
			resource.load(new ByteArrayInputStream(message.payload().array()),
					Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, tlPackage.getTLConfiguration()));
			TLConfiguration config = (TLConfiguration) resource.getContents().get(0);
			tlConfigs.put(config.getIntersectionId(), config);
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error loading intersection configuration from {0}.\n{1}", message.topic(), e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}

	}

	@Override
	public List<String> getTlcIds() {
		return new ArrayList<>(tlConfigs.keySet());
	}

	@Override
	public Optional<Tlc> getTlc(String tlcId) {
		TLConfiguration config = tlConfigs.get(tlcId);
		if (config == null) {
			return Optional.empty();
		}
		Tlc tlc = tlCfactory.createTlc();
		tlc.setId(config.getIntersectionId());
		tlc.setName(config.getIntersectionName());
		return Optional.of(tlc);
	}

	@Override
	public List<Phase> getPhases(String tlcId) {
		TLConfiguration config = tlConfigs.get(tlcId);
		if (config == null) {
			return Collections.emptyList();
		}
		EList<TLPhase> phases = config.getPhases();
		return phases.stream().map(this::convertPhase).toList();
	}

	private Phase convertPhase(TLPhase tlPhase) {
		Phase phase = tlCfactory.createPhase();
		phase.setId("" + tlPhase.getPhase());
		phase.setCode(tlPhase.getPhase());
		StringBuilder sb = new StringBuilder();
		EList<TLPhaseState> states = tlPhase.getStates();
		for (TLPhaseState state : states) {
			sb.append(state.getSignalGroup()).append('(').append(state.getState()).append(") ");
		}
		phase.setDescription(sb.toString());
		return phase;
	}

	@Override
	public boolean tlcExists(String tlcId) {
		return tlConfigs.containsKey(tlcId);
	}

	@Override
	public void savePhase(String tlcId, Phase phase) {
		currentPhase.put(tlcId, phase.getCode());
		String topic = "5g/ilsa/" + tlcId + "/targetPhase";
		try {
			ByteBuffer buffer = ByteBuffer.wrap((phase.getCode() + "").getBytes());
			messaging.publish(topic, buffer);
		} catch (Exception e) {
			logger.log(Level.ERROR, "Error publishing phase {0} to {1}.\n{2}",phase.getCode(), topic, e);
		}
	}

	@Override
	public Optional<Phase> getPhase(String tlcId, String phaseId) {
		Integer phase = currentPhase.get(tlcId);
		if (phase == null) {
			return Optional.empty();
		}
		TLConfiguration configuration = tlConfigs.get(tlcId);
		return configuration.getPhases().stream().filter(p -> p.getPhase() == phase).map(this::convertPhase)
				.findFirst();
	}

	@Override
	public boolean removePhase(String tlcId, String PhaseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Control> getControlPhase(String tlcId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void setControlPhase(String tlcId, Control control) {
		// TODO Auto-generated method stub

	}

}
