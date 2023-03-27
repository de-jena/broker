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
package de.dim.trafficos.example.intersectionsystem.component;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.trafficos.apis.IntersectionService;
import de.dim.trafficos.apis.IntersectionSystemService;
import de.dim.trafficos.apis.TLService;
import de.dim.trafficos.intersection.model.intersection.Intersection;
import de.dim.trafficos.intersection.model.intersection.RoadType;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage;
import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

@Component(immediate=true, name = "ExampleIntersectionSystemComponent", service=ExampleIntersectionSystemComponent.class)
public class ExampleIntersectionSystemComponent {

	@Reference
	IntersectionService intersectionService;
	
	@Reference
	TLService tlService;
	
	@Reference
	TOSTrafficLightPackage tlPackage;
	
	@Reference
	TOSIntersectionSystemPackage intersectionSystemPackage;
	
	@Reference
	IntersectionSystemService intersectionSystemService;

	@Activate
	public void activate() {
		if(intersectionService.getIntersectionByName("Felsenkeller") == null) {
			buildAndSaveSampleIntersectionSystem();
		} else {
			System.out.println("Test Intersection already exists!");
		}
			
	}
	
	private void buildAndSaveSampleIntersectionSystem() {
		Intersection intersection = createIntersection();
		TLModule module = createTLModule();	
		IntersectionSystem intersectionSystem = createIntersectionSystem(intersection, module);
		System.out.println("IntersectionSystem properly saved with id " + intersectionSystem.getId());		
	}
	
	private IntersectionSystem createIntersectionSystem(Intersection intersection, TLModule ...modules) {
		IntersectionSystem intersectionSystem = intersectionSystemPackage.getTOSIntersectionSystemFactory().createIntersectionSystem();
		intersectionSystem.setIntersectionId(intersection.getId());
		intersectionSystem.setIntersectionName(intersection.getName());
		for(TLModule module : modules) intersectionSystem.getTlModuleIds().add(module.getId());
		intersectionSystem = intersectionSystemService.saveIntersectionSystem(intersectionSystem);
		return intersectionSystem;
	}
	
	private TLModule createTLModule() {
		TLModule module = tlPackage.getTOSTrafficLightFactory().createTLModule();
		module.setAddress(6);
		TLSignalGroup signalGroup = tlPackage.getTOSTrafficLightFactory().createTLSignalGroup();
		signalGroup.setId("SK");
		
		TLSignalTransmitter channelA = createTransmitter("a", EcoreUtil.copy(signalGroup));
		channelA.getLightSignal().add(createLightSignal(SignalValueType.RED, false));
		channelA.getLightSignal().add(createLightSignal(SignalValueType.AMBER, false));
		channelA.getLightSignal().add(createLightSignal(SignalValueType.GREEN, false));
		
		TLSignalTransmitter channelB = createTransmitter("b", EcoreUtil.copy(signalGroup));
		channelB.getLightSignal().add(createLightSignal(SignalValueType.RED, false));
		channelB.getLightSignal().add(createLightSignal(SignalValueType.AMBER, false));
		channelB.getLightSignal().add(createLightSignal(SignalValueType.GREEN, false));
		
		TLSignalTransmitter channelC = createTransmitter("c", EcoreUtil.copy(signalGroup));
		channelC.getLightSignal().add(createLightSignal(SignalValueType.RED, false));
		channelC.getLightSignal().add(createLightSignal(SignalValueType.GREEN, false));
		
		module.getSignalTransmitter().add(channelA);
		module.getSignalTransmitter().add(channelB);
		module.getSignalTransmitter().add(channelC);
		
		module = tlService.saveTLModule(module);
		return module;
	}
	
	private TLSignalTransmitter createTransmitter(String name, TLSignalGroup signalGroup) {
		TLSignalTransmitter transmitter = tlPackage.getTOSTrafficLightFactory().createTLSignalTransmitter();
		transmitter.setName(name);
		transmitter.setSignalGroup(signalGroup);
		return transmitter;
	}
	
	private LightSignal createLightSignal(SignalValueType color, boolean isBlinking) {
		LightSignal light = tlPackage.getTOSTrafficLightFactory().createLightSignal();
		light.setBlinking(isBlinking);
		light.setValue(color);
		return light;
	}

	/**
	 * @return
	 */
	private Intersection createIntersection() {
		Map<Integer, RoadType> roadMaps = new HashMap<>();
		roadMaps.put(0, RoadType.MAIN_STRAIGHT_RIGHT_MERGE);
		roadMaps.put(1, RoadType.MAIN_STRAIGHT_LEFT_SEP);
		roadMaps.put(2, RoadType.SEC_LEFT_RIGHT_SEP);
		Intersection intersection = intersectionService.createIntersection(roadMaps);
		intersection.setName("Felsenkeller");
		intersection = intersectionService.saveIntersection(intersection);
		return intersection;
	}

}
