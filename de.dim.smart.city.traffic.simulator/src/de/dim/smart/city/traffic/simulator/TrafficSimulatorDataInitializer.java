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
package de.dim.smart.city.traffic.simulator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.annotation.bundle.Capabilities;
import org.osgi.annotation.bundle.Capability;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.namespace.service.ServiceNamespace;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

import de.dim.smart.city.csv.api.CSVImportService;
import de.dim.smart.city.r09.importer.api.R09ImportService;
import de.dim.trafficos.model.device.ConflictingLane;
import de.dim.trafficos.model.device.CycleLane;
import de.dim.trafficos.model.device.DirectionType;
import de.dim.trafficos.model.device.IncomingLane;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.Link;
import de.dim.trafficos.model.device.OutgoingLane;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.Parameter;
import de.dim.trafficos.model.device.Position;
import de.dim.trafficos.model.device.PublicTransportLane;
import de.dim.trafficos.model.device.PublicTransportLine;
import de.dim.trafficos.model.device.Road;
import de.dim.trafficos.model.device.TOSDeviceFactory;
import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.simulator.api.IntersectionConstants;
import de.dim.trafficos.simulator.api.IntersectionService;

@Component
@Capabilities({
	@Capability(namespace = ServiceNamespace.SERVICE_NAMESPACE, attribute = ServiceNamespace.CAPABILITY_OBJECTCLASS_ATTRIBUTE + ":List<String>=\"de.dim.trafficos.model.device.Intersection,org.eclipse.emf.EObject\""),
	@Capability(namespace = ServiceNamespace.SERVICE_NAMESPACE, attribute = ServiceNamespace.CAPABILITY_OBJECTCLASS_ATTRIBUTE + ":List<String>=\"de.dim.trafficos.model.device.PublicTransportLine,org.eclipse.emf.EObject\"")
})
public class TrafficSimulatorDataInitializer {

	/** TRAM_L5 */
	private static final String TRAM_L5_ID = "Tram-L5";
	private static final String INTERSECTION_ID = "Intersection-Erlanger-Allee";

	@Reference
	R09ImportService r09Importer;

	@Reference
	ComponentServiceObjects<EMFRepository> repoObjects;
	
	@Reference
	TOSDevicePackage tosPackage;
	
	@Reference
	IntersectionService intersectionService;

	@Reference
	CSVImportService csvImporter;
	
	ExecutorService executors = Executors.newCachedThreadPool();
	
	PromiseFactory promiseFactory = new PromiseFactory(executors);

	private BundleContext ctx;
	
	List<ServiceRegistration<? extends Object>> registrations = new ArrayList<ServiceRegistration<? extends Object>>();
	
	@Activate
	public void activate(BundleContext ctx) {
		this.ctx = ctx;
		promiseFactory
		.submit(() -> {
			EMFRepository repo =  repoObjects.getService();
			PublicTransportLine line = repo.getEObject(tosPackage.getPublicTransportLine(), TRAM_L5_ID);
			repoObjects.ungetService(repo);
			return line;
		})
		.then(this::handleLine).onSuccess(this::register).onFailure(Throwable::printStackTrace);

		promiseFactory
		.submit(() -> {
			EMFRepository repo =  repoObjects.getService();
			Intersection intersection = repo.getEObject(tosPackage.getIntersection(), INTERSECTION_ID);
			repoObjects.ungetService(repo);
			return intersection;
		})
		.then(intersection -> {
			if(intersection.getValue() == null) {
				return promiseFactory
						.submit(() -> {
							try(InputStream is = new FileInputStream("data/12_124_2020.07.06_00-00_2020.07.08_00-00- alles.csv")){
								csvImporter.importCSV(is);
							}
							return true;
						})
						.then(i -> {
							return promiseFactory.submit(this::createIntersection);
						});
			} else {
				return intersection;
			}
		})
		.onSuccess(this::register).onFailure(Throwable::printStackTrace);
	}

	/**
	 * @param line
	 * @return
	 * @throws InterruptedException 
	 * @throws InvocationTargetException 
	 */
	private Promise<PublicTransportLine> handleLine(Promise<PublicTransportLine> line) throws InvocationTargetException, InterruptedException {
		Promise<PublicTransportLine> result = null; 
		if(line.getValue() == null) {
			result = promiseFactory.submit(() -> importR09());
		} else {
			result = line;
		}
		return result;
	}
	
	@Deactivate
	public void deactivate() {
		executors.shutdownNow();
		registrations.forEach(ServiceRegistration::unregister);
	}
	

	private void register(EObject service) {
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put("simluate", "true");
		props.put("id", EcoreUtil.getID(service));
		ServiceRegistration<?> registration = ctx.registerService(new String[] {service.eClass().getInstanceClass().getName(), EObject.class.getName()}, service, props);
		registrations.add(registration);
		System.out.println("Registgered " + registration.getReference() + " with props " + props);
	}
	
	private PublicTransportLine importR09() throws IOException, ParseException {
		String[] folderSuffix = {"072425", "075105", "081526", "084503", "090854", "094109", "100332", "103321",
				"105940", "112607", "115407", "122105", "124351", "131150", "133528", "140430", "142910", "145646",
				"152632", "155131", "161530", "164349", "170859", "173336", "175939", "182634", "185149", "191750",
				"193949", "201536", "203926", "205011"};
				
		PublicTransportLine line = TOSDeviceFactory.eINSTANCE.createPublicTransportLine();
		line.setId(TRAM_L5_ID);
		line.setName("Test Tram L5");
		line.setLineNumber("5");	
		for(String suffix : folderSuffix) {
			
			String folder = "data/logger_200706_"+suffix+"/logger";
			File theFolder = new File(folder);
			System.out.println("----------------------------");
			System.out.println("Processing Folder " + theFolder.getAbsolutePath());
			r09Importer.importR09(folder, line);
		}
		return line;
	}
	
	
	public Intersection createIntersection() {
		EMFRepository repo =  repoObjects.getService();
		Map<Integer, String> options = new HashMap<Integer, String>();
		options.put(0, IntersectionConstants.MAIN_STRAIGHT_TURNS_SEP);
		options.put(1, IntersectionConstants.SEC_STRAIGHT_LEFT_MERGE);
		options.put(2, IntersectionConstants.MAIN_STRAIGHT_RIGHT_MERGE);
		options.put(3, IntersectionConstants.SEC_STRAIGHT_RIGHT_MERGE);
		Intersection intersection = intersectionService.createIntersection(options);
		intersection.setId(INTERSECTION_ID);
		repo.attach(intersection);
		List<Parameter> parameters = repo.getAllEObjects(TOSDevicePackage.Literals.PARAMETER);
		intersection.getParameter().addAll(parameters);
		
		List<Output> realOutput = repo.getAllEObjects(TOSDevicePackage.Literals.OUTPUT);
		String[] tlIds = {"K1", "K2", "K3", "K4", "K5", "K6", "KRi6", "RF1", "RF2", "RF4", "RF5", "F3", "F6", "H1", "H2", "S1", "S2"};
		List<String> tlIdsList = Arrays.asList(tlIds);
		List<Output> realTL = realOutput.stream().filter(o->tlIdsList.contains(o.getName())).collect(Collectors.toList());

		String[] detIds = {"IS6", "IS7", "IS8", "IS9", "IS10", "RD1", "RD2", "IS1", "IS2", "IS3", "IP14", "IS4", "IS5"};
		List<String> detIdsList = Arrays.asList(detIds);
		List<Output> realDet = realOutput.stream().filter(o->detIdsList.contains(o.getName())).collect(Collectors.toList());

		//		Combine each lane with the right signal group
		List<ConflictingLane> lanes = new LinkedList<>();
		OutgoingLane out00 = null;
		for(Road r : intersection.getRoad()) {
			if("0".equals(r.getId())) { //ADD Bike lane and PT lane
				out00 = r.getOutgoingLane().get(0);

				CycleLane bikeL1 = TOSDeviceFactory.eINSTANCE.createCycleLane();
				bikeL1.setId("B_0_0");
				bikeL1.setDirection(DirectionType.STRAIGHT);
				bikeL1.setRoad(r);
				bikeL1.setRefRoadId(r.getId());
				bikeL1.getConflictingLane().addAll(r.getIncomingLane().stream().filter(l->"0_1".equals(l.getId())).findFirst().get().getConflictingLane());
				bikeL1.getConflictingLink().addAll(r.getIncomingLane().stream().filter(l->"0_1".equals(l.getId())).findFirst().get().getConflictingLink());

				OutgoingLane outBikeL1 = TOSDeviceFactory.eINSTANCE.createOutgoingLane();
				outBikeL1.setId("-B_0_0");
				outBikeL1.setDirection(DirectionType.STRAIGHT);
				outBikeL1.setRoad(r);
				outBikeL1.setRefRoadId(r.getId());
				Link link = TOSDeviceFactory.eINSTANCE.createLink();
				link.setRefIncomingLane(bikeL1);
				link.setRefOutgoingLane(outBikeL1);

				outBikeL1.getLink().add(link);
				bikeL1.getLink().add(link);

				r.getCycleLane().add(bikeL1);
				r.getOutgoingLane().add(outBikeL1);

				PublicTransportLane ptLane = TOSDeviceFactory.eINSTANCE.createPublicTransportLane();
				ptLane.setId("PT_0_0");
				ptLane.setDirection(DirectionType.STRAIGHT);
				ptLane.setRoad(r);
				ptLane.setRefRoadId(r.getId());
				ptLane.getConflictingLane().addAll(r.getIncomingLane().stream().filter(l->"0_1".equals(l.getId())).findFirst().get().getConflictingLane());
				ptLane.getConflictingLink().addAll(r.getIncomingLane().stream().filter(l->"0_1".equals(l.getId())).findFirst().get().getConflictingLink());

				OutgoingLane outPT = TOSDeviceFactory.eINSTANCE.createOutgoingLane();
				outPT.setId("-PT_0_0");
				outPT.setDirection(DirectionType.STRAIGHT);
				outPT.setRoad(r);
				outPT.setRefRoadId(r.getId());

				Link ptLink = TOSDeviceFactory.eINSTANCE.createLink();
				ptLink.setRefIncomingLane(ptLane);
				ptLink.setRefOutgoingLane(outPT);

				r.getPublicTransportLane().add(ptLane);
				r.getOutgoingLane().add(outPT);

				intersection.getLink().add(link);
				intersection.getLink().add(ptLink);

				for(Road r1 : intersection.getRoad()) {
					for(IncomingLane il : r1.getIncomingLane()) {
						ConflictingLane cl = il.getConflictingLane().stream().filter(l->"0_1".equals(l.getId())).findFirst().orElse(null);
						if(cl != null) {
							il.getConflictingLane().add(bikeL1);
							il.getConflictingLink().add(link);
						}
						if((il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-0") || 
								il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-1")) &&
								(il.getId().startsWith("0") || 
										il.getId().startsWith("3"))) {
							il.getConflictingLink().add(ptLink);
							il.getConflictingLane().add(ptLane);
						}
						else if((il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-2") || 
								il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-3")) &&
								(il.getId().startsWith("1") || 
										il.getId().startsWith("2"))) {
							il.getConflictingLink().add(ptLink);
							il.getConflictingLane().add(ptLane);
						}
					}
				}
			}
			else if("2".equals(r.getId())) { //ADD Bike lane and PT lane
				CycleLane bikeL2 = TOSDeviceFactory.eINSTANCE.createCycleLane();
				bikeL2.setId("B_2_0");
				bikeL2.setDirection(DirectionType.STRAIGHT);
				bikeL2.setRoad(r);
				bikeL2.setRefRoadId(r.getId());
				bikeL2.getConflictingLane().addAll(r.getIncomingLane().stream().filter(l->"2_1".equals(l.getId())).findFirst().get().getConflictingLane());
				bikeL2.getConflictingLink().addAll(r.getIncomingLane().stream().filter(l->"2_1".equals(l.getId())).findFirst().get().getConflictingLink());

				OutgoingLane outBikeL2 = TOSDeviceFactory.eINSTANCE.createOutgoingLane();
				outBikeL2.setId("-B_2_0");
				outBikeL2.setDirection(DirectionType.STRAIGHT);
				outBikeL2.setRoad(r);
				outBikeL2.setRefRoadId(r.getId());
				Link link = TOSDeviceFactory.eINSTANCE.createLink();
				link.setRefIncomingLane(bikeL2);
				link.setRefOutgoingLane(outBikeL2);

				outBikeL2.getLink().add(link);
				bikeL2.getLink().add(link);

				r.getCycleLane().add(bikeL2);
				r.getOutgoingLane().add(outBikeL2);

				PublicTransportLane ptLane = TOSDeviceFactory.eINSTANCE.createPublicTransportLane();
				ptLane.setId("PT_2_0");
				ptLane.setDirection(DirectionType.STRAIGHT);
				ptLane.setRoad(r);
				ptLane.setRefRoadId(r.getId());
				ptLane.getConflictingLane().addAll(r.getIncomingLane().stream().filter(l->"2_1".equals(l.getId())).findFirst().get().getConflictingLane());
				ptLane.getConflictingLink().addAll(r.getIncomingLane().stream().filter(l->"2_1".equals(l.getId())).findFirst().get().getConflictingLink());

				OutgoingLane outPT = TOSDeviceFactory.eINSTANCE.createOutgoingLane();
				outPT.setId("-PT_2_0");
				outPT.setDirection(DirectionType.STRAIGHT);
				outPT.setRoad(r);
				outPT.setRefRoadId(r.getId());

				Link ptLink = TOSDeviceFactory.eINSTANCE.createLink();
				ptLink.setRefIncomingLane(ptLane);
				ptLink.setRefOutgoingLane(outPT);

				r.getPublicTransportLane().add(ptLane);
				r.getOutgoingLane().add(outPT);

				intersection.getLink().add(link);
				intersection.getLink().add(ptLink);

				for(Road r1 : intersection.getRoad()) {
					for(IncomingLane il : r1.getIncomingLane()) {
						ConflictingLane cl = il.getConflictingLane().stream().filter(l->"2_1".equals(l.getId())).findFirst().orElse(null);
						if(cl != null) {
							il.getConflictingLane().add(bikeL2);
							il.getConflictingLink().add(link);
						}

						if((il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-0") || 
								il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-1")) &&
								(il.getId().startsWith("0") || 
										il.getId().startsWith("3"))) {
							il.getConflictingLink().add(ptLink);
							il.getConflictingLane().add(ptLane);
						}
						else if((il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-2") || 
								il.getLink().get(0).getRefOutgoingLane().getId().startsWith("-3")) &&
								(il.getId().startsWith("1") || 
										il.getId().startsWith("2"))) {
							il.getConflictingLink().add(ptLink);
							il.getConflictingLane().add(ptLane);
						}
					}
				}

			}
			lanes.addAll(r.getIncomingLane());
			lanes.addAll(r.getPedestrianLane());
			lanes.addAll(r.getCycleLane());
			lanes.addAll(r.getPublicTransportLane());
		}

		intersection.getOutput().clear();
		intersection.getOutput().addAll(realTL);
		intersection.getOutput().addAll(realDet);

		for(Output out : intersection.getOutput()) {
			out.getLocation().clear();
			switch(out.getName()) {
			case "K1":
				out.getLocation().add(createPosition("K1/1", 11.6236577,50.8822944));
				out.getLocation().add(createPosition("K1/2", 11.6236423,50.8822491));
				break;
			case "K2":
				out.getLocation().add(createPosition("K2", 11.6236356,50.8822119));
				break;
			case "K3":
				out.getLocation().add(createPosition("K3/1", 11.6233721,50.8820092));
				out.getLocation().add(createPosition("K3/2", 11.6232963,50.8820139));
				break;
			case "K4":
				out.getLocation().add(createPosition("K4/1", 11.6230907,50.8821072));
				out.getLocation().add(createPosition("K4/2", 11.6231135,50.8821512));
				break;
			case "K5":
				out.getLocation().add(createPosition("K5", 11.6231276,50.8821783));
				break;
			case "K6":
				out.getLocation().add(createPosition("K6/1", 11.6234002,50.8823941));
				out.getLocation().add(createPosition("K6/2", 11.6234499,50.8823912));
				out.getLocation().add(createPosition("K6/3", 11.6235511,50.8823756));
				break;
			case "KRi6":
				out.getLocation().add(createPosition("KRi6", 11.6233768,50.882398));
				break;
			case "RF1":
				out.getLocation().add(createPosition("RF1/1", 11.6236336,50.8822961));
				out.getLocation().add(createPosition("RF1/2", 11.6236034,50.8822123));
				break;
			case "RF2":
				out.getLocation().add(createPosition("RF2/1", 11.6235665,50.8821044));
				out.getLocation().add(createPosition("RF2/2", 11.623537,50.882033));
				break;
			case "F3":
				out.getLocation().add(createPosition("F3/1", 11.6233864,50.8819961));
				out.getLocation().add(createPosition("F3/2", 11.6231692,50.8820295));
				break;
			case "F6":
				out.getLocation().add(createPosition("F6/1", 11.62337,50.8823816));
				out.getLocation().add(createPosition("F6/2", 11.6235624,50.8823503));
				break;
			case "RF4":
				out.getLocation().add(createPosition("RF4/1", 11.6231212,50.8820736));
				out.getLocation().add(createPosition("RF4/2", 11.623185,50.8821903));
				break;
			case "RF5":
				out.getLocation().add(createPosition("RF5/1", 11.6232338,50.8822698));
				out.getLocation().add(createPosition("RF5/2", 11.6232607,50.8823604));
				break;
			case "H1":
				out.getLocation().add(createPosition("H1/1", 11.6235906,50.8821895));
				out.getLocation().add(createPosition("H1/2", 11.6235638,50.8821248));
				break;
			case "H2":
				out.getLocation().add(createPosition("H2/1", 11.6231736,50.882209));
				out.getLocation().add(createPosition("H2/2", 11.6232077,50.8822623));
				break;
			case "S1":
				out.getLocation().add(createPosition("S1", 11.6236293,50.8821877));
				break;
			case "S2":
				out.getLocation().add(createPosition("S2", 11.6231377,50.8822173));
				break;
			case "IS1":
				out.getLocation().add(createPosition("IS1", 11.624178,50.8821662));
				break;
			case "IS2":
				out.getLocation().add(createPosition("IS2", 11.6241739,50.8821358));
				break;
			case "IS3":
				out.getLocation().add(createPosition("IS3", 11.6237273,50.8822119));
				break;
			case "IS4":
				out.getLocation().add(createPosition("IS4", 11.6232998,50.8818881));
				break;
			case "IS5":
				out.getLocation().add(createPosition("IS5", 11.623261,50.8818991));
				break;
			case "IS6":
				out.getLocation().add(createPosition("IS6", 11.622659,50.882208));
				break;
			case "IS7":
				out.getLocation().add(createPosition("IS7", 11.6224104,50.8823219));
				break;
			case "IS8":
				out.getLocation().add(createPosition("IS8", 11.6224251,50.882349));
				break;
			case "IS9":
				out.getLocation().add(createPosition("IS9", 11.6230541,50.8821933));
				break;
			case "IS10":
				out.getLocation().add(createPosition("IS10", 11.6231225,50.8823304));
				break;
			case "IP14":
				out.getLocation().add(createPosition("IP14", 11.6235423,50.8821789));
				break;
			case "RD1":
				out.getLocation().add(createPosition("RD1", 11.6234135,50.8823989));
				break;
			case "RD2":
				out.getLocation().add(createPosition("RD2", 11.6234363,50.8823981));
				break;
			}
		}

		for(ConflictingLane l : lanes) {
			l.setSignalGroup(null);
			switch(l.getId()) {
			case "0_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K4".equals(o.getName())).findFirst().get());	
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS6".equals(o.getName())).findFirst().get());	
				break;
			case "0_1":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K4".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS7".equals(o.getName())).findFirst().get());	
				break;
			case "0_2":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K5".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS8".equals(o.getName())).findFirst().get());	
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS9".equals(o.getName())).findFirst().get());	
				break;
			case "1_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"KRi6".equals(o.getName())).findFirst().get());
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K6".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"RD1".equals(o.getName())).findFirst().get());	
				l.getDetector().add(intersection.getOutput().stream().filter(o->"RD2".equals(o.getName())).findFirst().get());	
				break;
			case "1_1":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K6".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"RD1".equals(o.getName())).findFirst().get());	
				l.getDetector().add(intersection.getOutput().stream().filter(o->"RD2".equals(o.getName())).findFirst().get());	
				break;
			case "2_1":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K1".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS1".equals(o.getName())).findFirst().get());	
				break;
			case "2_2":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K2".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS2".equals(o.getName())).findFirst().get());	
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS3".equals(o.getName())).findFirst().get());	
				break;
			case "3_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K3".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS4".equals(o.getName())).findFirst().get());	
				break;
			case "3_2":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K3".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IS5".equals(o.getName())).findFirst().get());	
				break;
			case "P_0_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"RF4".equals(o.getName())).findFirst().get());
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"RF5".equals(o.getName())).findFirst().get());
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"H2".equals(o.getName())).findFirst().get());
				break;
			case "P_1_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"F6".equals(o.getName())).findFirst().get());
				break;
			case "P_2_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"RF1".equals(o.getName())).findFirst().get());
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"RF2".equals(o.getName())).findFirst().get());
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"H1".equals(o.getName())).findFirst().get());
				break;
			case "P_3_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"F3".equals(o.getName())).findFirst().get());
				break;
			case "B_0_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K4".equals(o.getName())).findFirst().get());	
				break;
			case "B_2_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"K1".equals(o.getName())).findFirst().get());	
				break;	
			case "PT_0_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"S2".equals(o.getName())).findFirst().get());	
				break;	
			case "PT_2_0":
				l.getSignalGroups().add(intersection.getOutput().stream().filter(o->"S1".equals(o.getName())).findFirst().get());
				l.getDetector().add(intersection.getOutput().stream().filter(o->"IP14".equals(o.getName())).findFirst().get());	
				break;	
			}
		}

		out00.getDetector().add(intersection.getOutput().stream().filter(o->"IS10".equals(o.getName())).findFirst().get());	

		List<EObject> toSave = new ArrayList<EObject>();
		
		for(Output out : realTL) {
			toSave.add(EcoreUtil.copy(out));
		}
		for(Output out : realDet) {
			toSave.add(EcoreUtil.copy(out));
		}
		for(Output out : intersection.getOutput()) {
			toSave.add(EcoreUtil.copy(out));
		}
		toSave.add(intersection);
		repo.save(toSave);
		repoObjects.ungetService(repo);
		
		return intersection;
	}

	private Position createPosition(String id, double lon, double lat) {
		Position p = TOSDeviceFactory.eINSTANCE.createPosition();
		p.setLatitude(lat);
		p.setLongitude(lon);
		p.setId(id);
		return p;
	}
	
}
