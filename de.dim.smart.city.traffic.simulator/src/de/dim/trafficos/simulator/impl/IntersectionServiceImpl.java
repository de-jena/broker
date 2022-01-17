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
package de.dim.trafficos.simulator.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.model.device.ConflictingLane;
import de.dim.trafficos.model.device.DirectionType;
import de.dim.trafficos.model.device.IncomingLane;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.Lane;
import de.dim.trafficos.model.device.Link;
import de.dim.trafficos.model.device.OutgoingLane;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.PedestrianLane;
import de.dim.trafficos.model.device.Position;
import de.dim.trafficos.model.device.Road;
import de.dim.trafficos.model.device.TOSDeviceFactory;
import de.dim.trafficos.simulator.api.IntersectionConstants;
import de.dim.trafficos.simulator.api.IntersectionService;

@Component(service=IntersectionService.class, scope=ServiceScope.PROTOTYPE)
public class IntersectionServiceImpl implements IntersectionService{
	
	private Logger logger = Logger.getLogger(IntersectionServiceImpl.class.getName());	
	
	private int laneIndex = 0;
	
	@Activate
	public void activate() {
		logger.fine("IntersectionService activated!");
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.simulator.api.IntersectionService#createIntersection(java.util.Map)
	 */
	@Override
	public Intersection createIntersection(Map<Integer, String> optionsMap) {
		if(!areOptionsOK(optionsMap)) {
			logger.severe("Options are inconsistent with number of roads.");
			return null;
		}
		
		Intersection intersection = TOSDeviceFactory.eINSTANCE.createIntersection();
		String intId = UUID.randomUUID().toString();
		intersection.setId(intId);
		laneIndex = 0;
		int numRoad = optionsMap.size();
		for(int i = 0; i < numRoad; i++) {
			
			String roadOption = optionsMap.get(i);
			
			Road road = TOSDeviceFactory.eINSTANCE.createRoad();
			road.setId(String.valueOf(i));
			if(roadOption.startsWith("main")) {
				road.setMainRoad(true);
			}
			else {
				road.setMainRoad(false);
			}
			createConflictingLanes(road, numRoad, roadOption);
			laneIndex++;
			
//			create outgoing lane
			OutgoingLane outLane = TOSDeviceFactory.eINSTANCE.createOutgoingLane();
			outLane.setId("-"+road.getId()+"_0");
			outLane.setRefRoadId(road.getId());
			outLane.setRoad(road);
			road.getOutgoingLane().add(outLane);			
			
//			create pedestrian lane
			PedestrianLane pedLane = TOSDeviceFactory.eINSTANCE.createPedestrianLane();
			pedLane.setId("P_"+road.getId()+"_0");
			pedLane.setRefRoadId(road.getId());
			pedLane.setRoad(road);
			pedLane.setIndex(laneIndex);
			laneIndex++;
			road.getPedestrianLane().add(pedLane);
			
//			create link between pedestrian lane and outgoing lane
			Link link = TOSDeviceFactory.eINSTANCE.createLink();
			link.setIndex(intersection.getId()+"_"+pedLane.getId()+"_"+outLane.getId());
			link.setRefIncomingLane(pedLane);
			link.setRefOutgoingLane(outLane);
			pedLane.getLink().add(link);
			outLane.getLink().add(link);
			intersection.getLink().add(link);
			
			intersection.getRoad().add(road);
		}
		createLinks(intersection);
		computeConflictingLanes(intersection);
		computePedestrianConflicts(intersection);
		createSignalGroups(intersection);
		return intersection;
	}
	
	
	/**
	 * Creates the IncomingLane and eventual SubLane according to the provided options for the Road
	 * @param road
	 * @param numRoad
	 * @param roadOption
	 */
	private void createConflictingLanes(Road road, int numRoad, String roadOption) {
		
		if(numRoad == 2) {							
			IncomingLane inLane = createConflictingLane(road, road.getId()+"_0", laneIndex);
			inLane.setDirection(DirectionType.STRAIGHT);
			road.getIncomingLane().add(inLane);				
		}
		else if(numRoad == 3) {
			
			if(roadOption.contains(IntersectionConstants.LEFT_RIGHT_PREFIX)) {
				logger.fine("Creating Road with option " + roadOption);
				if(roadOption.contains(IntersectionConstants.SEP_PREFIX)) {
					IncomingLane inLane0  = createConflictingLane(road, road.getId()+"_0", laneIndex);		
					inLane0.setDirection(DirectionType.TURN_RIGHT);
					road.getIncomingLane().add(inLane0);
					laneIndex++;	
					
					IncomingLane inLane1  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane1.setDirection(DirectionType.TURN_LEFT);
					road.getIncomingLane().add(inLane1);
				}
				else {
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex);	
					subLane.setDirection(DirectionType.TURN_RIGHT);
					laneIndex++;
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane.setDirection(DirectionType.TURN_LEFT);
					inLane.getSubLane().add(subLane);		
					road.getIncomingLane().add(inLane);
				}
			}
			else if(roadOption.contains(IntersectionConstants.STRAIGHT_RIGHT_PREFIX)) {
				if(roadOption.contains(IntersectionConstants.SEP_PREFIX)) {
					IncomingLane inLane0  = createConflictingLane(road, road.getId()+"_0", laneIndex);		
					inLane0.setDirection(DirectionType.TURN_RIGHT);
					road.getIncomingLane().add(inLane0);
					laneIndex++;	
					
					IncomingLane inLane1  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane1.setDirection(DirectionType.STRAIGHT);
					road.getIncomingLane().add(inLane1);
				}
				else {
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex);	
					subLane.setDirection(DirectionType.TURN_RIGHT);
					laneIndex++;
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane.setDirection(DirectionType.STRAIGHT);
					inLane.getSubLane().add(subLane);		
					road.getIncomingLane().add(inLane);
				}
			}
			else if(roadOption.contains(IntersectionConstants.STRAIGHT_LEFT_PREFIX)) {
				if(roadOption.contains(IntersectionConstants.SEP_PREFIX)) {
					IncomingLane inLane0  = createConflictingLane(road, road.getId()+"_0", laneIndex);		
					inLane0.setDirection(DirectionType.STRAIGHT);
					road.getIncomingLane().add(inLane0);
					laneIndex++;	
					
					IncomingLane inLane1  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane1.setDirection(DirectionType.TURN_LEFT);
					road.getIncomingLane().add(inLane1);
				}
				else {
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_0", laneIndex);		
					inLane.setDirection(DirectionType.STRAIGHT);
					laneIndex++;
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_1", laneIndex);	
					subLane.setDirection(DirectionType.TURN_LEFT);					
					inLane.getSubLane().add(subLane);		
					road.getIncomingLane().add(inLane);
				}
			}			
		}
		else if(numRoad == 4) {
			
			if(roadOption.contains(IntersectionConstants.STRAIGHT_RIGHT_PREFIX)) {
				
				ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex);	
				subLane.setDirection(DirectionType.TURN_RIGHT);
				laneIndex++;
				IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
				inLane.setDirection(DirectionType.STRAIGHT);
				inLane.getSubLane().add(subLane);		
				road.getIncomingLane().add(inLane);
				laneIndex++;
				IncomingLane inLane2  = createConflictingLane(road, road.getId()+"_2", laneIndex);		
				inLane2.setDirection(DirectionType.TURN_LEFT);
				road.getIncomingLane().add(inLane2);
			}
			else if(roadOption.contains(IntersectionConstants.STRAIGHT_LEFT_PREFIX)) {
				
				IncomingLane inLane  = createConflictingLane(road, road.getId()+"_0", laneIndex);		
				inLane.setDirection(DirectionType.TURN_RIGHT);
				road.getIncomingLane().add(inLane);
				laneIndex++;
				
				IncomingLane inLane2  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
				inLane2.setDirection(DirectionType.STRAIGHT);
				laneIndex++;
				
				ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_2", laneIndex);	
				subLane.setDirection(DirectionType.TURN_LEFT);
				inLane2.getSubLane().add(subLane);		
				road.getIncomingLane().add(inLane2);
			}
			else {
				if(roadOption.contains(IntersectionConstants.MERGE_PREFIX)) {
					
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex);	
					subLane.setDirection(DirectionType.TURN_RIGHT);
					laneIndex++;
					
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane.setDirection(DirectionType.STRAIGHT);
					laneIndex++;
					
					ConflictingLane subLane2  = (ConflictingLane) createConflictingLane(road, road.getId()+"_2", laneIndex);	
					subLane2.setDirection(DirectionType.TURN_LEFT);
					
					inLane.getSubLane().add(subLane);
					inLane.getSubLane().add(subLane2);
					road.getIncomingLane().add(inLane);
					
//					ConflictingLane subLane2  = (ConflictingLane) createConflictingLane(road, road.getId()+"_1", laneIndex);	
//					subLane2.setDirection(DirectionType.STRAIGHT);
//					laneIndex++;
//					
//					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_2", laneIndex);		
//					inLane.setDirection(DirectionType.TURN_LEFT);
//					inLane.getSubLane().add(subLane);
//					inLane.getSubLane().add(subLane2);
//					road.getIncomingLane().add(inLane);
				}
				else {
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_0", laneIndex);		
					inLane.setDirection(DirectionType.TURN_RIGHT);
					road.getIncomingLane().add(inLane);
					laneIndex++;
					
					IncomingLane inLane2  = createConflictingLane(road, road.getId()+"_1", laneIndex);		
					inLane2.setDirection(DirectionType.STRAIGHT);
					road.getIncomingLane().add(inLane2);
					laneIndex++;
					
					IncomingLane inLane3  = createConflictingLane(road, road.getId()+"_2", laneIndex);		
					inLane3.setDirection(DirectionType.TURN_LEFT);
					road.getIncomingLane().add(inLane3);
				}				
			}	
		}
	}
	
	private IncomingLane createConflictingLane(Road road, String id, int index) {
		IncomingLane lane = TOSDeviceFactory.eINSTANCE.createIncomingLane();
		lane.setId(id);
		lane.setIndex(index);
		lane.setRoad(road);
		lane.setRefRoadId(road.getId());
		return lane;
	}
	
	
	

	/**
	 * Checks that the options provided for the Intersection creation are consistent with the number of roads
	 * required. 
	 * @param optionsMap
	 * @return
	 */
	private boolean areOptionsOK(Map<Integer, String> optionsMap) {

		if(optionsMap == null) {
			logger.severe("Options Map is null!");
			return false;
		}
		if(optionsMap.isEmpty()) {
			logger.severe("Options Map is empty!");
			return false;
		}
		if(optionsMap.size() < 2) {
			logger.severe("Cannot create an intersection with less than 2 roads.");
			return false;
		}
		Iterator<String> iter = optionsMap.values().iterator();
		if(optionsMap.size() == 2) {			
			while(iter.hasNext()) {
				String next = iter.next();
				if(!IntersectionConstants.MAIN_STRAIGHT.equals(next)) {
					logger.severe("Option " + next + " is not possible for a 2 roads intersection.");
					return false;
				}
			}
		}
		if(optionsMap.size() == 3) {
			List<String> options = new ArrayList<String>();
			while(iter.hasNext()) {
				String next = iter.next();
				if(!options.contains(next)) {
					options.add(next);
				}			    
				if(next.contains(IntersectionConstants.TURNS_PREFIX)) {
					logger.severe("Option " + next + " is not possible for the required number of roads.");
					return false;
				}
			}			
			if(options.size() < 3) {
				logger.severe("Options conflicts found.");
				return false;
			}			
			for(String op : options) {
				if(!op.contains(IntersectionConstants.LEFT_RIGHT_PREFIX) &&
						!op.contains(IntersectionConstants.STRAIGHT_LEFT_PREFIX) &&
						!op.contains(IntersectionConstants.STRAIGHT_RIGHT_PREFIX)) {
					logger.severe("Option " + op + " is not possible for the required number of roads.");
					return false;
				}
			}
			if(options.get(0).contains(IntersectionConstants.LEFT_RIGHT_PREFIX) &&
					!options.get(1).contains(IntersectionConstants.STRAIGHT_RIGHT_PREFIX)) {
				logger.warning("Order of roads is inconsistent. Reorganizing it.");
				optionsMap.put(1, options.get(2));
				optionsMap.put(2, options.get(1));
			}
			else if(options.get(0).contains(IntersectionConstants.STRAIGHT_RIGHT_PREFIX) &&
					!options.get(1).contains(IntersectionConstants.STRAIGHT_LEFT_PREFIX)) {
				logger.warning("Order of roads is inconsistent. Reorganizing it.");
				optionsMap.put(1, options.get(2));
				optionsMap.put(2, options.get(1));
			}
			else if(options.get(0).contains(IntersectionConstants.STRAIGHT_LEFT_PREFIX) &&
					!options.get(1).contains(IntersectionConstants.LEFT_RIGHT_PREFIX)) {
				logger.warning("Order of roads is inconsistent. Reorganizing it.");
				optionsMap.put(1, options.get(2));
				optionsMap.put(2, options.get(1));
			}			
		}
		if(optionsMap.size() == 4) {
			while(iter.hasNext()) {
				String next = iter.next();
				if((next.contains(IntersectionConstants.STRAIGHT_RIGHT_PREFIX) || 
						next.contains(IntersectionConstants.STRAIGHT_LEFT_PREFIX)) &&
						!next.contains(IntersectionConstants.MERGE_PREFIX)) {
					logger.severe("Option " + next + " is not possible for the required number of roads.");
					return false;
				}
				if(next.contains(IntersectionConstants.LEFT_RIGHT_PREFIX)) {
					logger.severe("Option " + next + " is not possible for the required number of roads.");
					return false;
				}
			}
		}		
		return true;
	}


	/**
	 * Creates the SignalGroups for each IncomingLane
	 * @param intersection
	 */
	private void createSignalGroups(Intersection intersection) {
		for(Road r : intersection.getRoad()) {
			for(IncomingLane il : r.getIncomingLane()) {
				Output sg = TOSDeviceFactory.eINSTANCE.createOutput();
				sg.setId("SG-"+il.getId());
				sg.setType("SignalGroup");
				Position pos = TOSDeviceFactory.eINSTANCE.createPosition();
				if(il.getSubLane().isEmpty()) {
					pos.setOrientation(il.getDirection());
				}
				else {
					pos.setOrientation(setSignalGroupOrientation(il));
				}				
				intersection.getOutput().add(sg);
				il.setSignalGroup(sg);
			}
			for(PedestrianLane pl : r.getPedestrianLane()) {
				Output sg = TOSDeviceFactory.eINSTANCE.createOutput();
				sg.setId("SG-"+pl.getId());
				sg.setType("SignalGroup");
				intersection.getOutput().add(sg);
				pl.setSignalGroup(sg);
			}
		}
	}

	/**
	 * @param il
	 * @return
	 */
	private DirectionType setSignalGroupOrientation(IncomingLane il) {
		
		if(DirectionType.STRAIGHT_LEFT.equals(il.getDirection())) {
			return DirectionType.LEFT_RIGHT;
		}
		else if(DirectionType.STRAIGHT.equals(il.getDirection())) {
			if(il.getSubLane().size() > 1) {
				return DirectionType.STRAIGHT_TURNS;
			}
			else {
				if(DirectionType.TURN_LEFT.equals(il.getSubLane().get(0).getDirection())) {
					return DirectionType.STRAIGHT_LEFT;
				}
				else {
					return DirectionType.STRAIGHT_RIGHT;
				}
			}
		}		
		return null;
	}

	/**
	 * Creates the list of ConflictingLane for each PedestrianLane
	 * @param intersection
	 */
	private void computePedestrianConflicts(Intersection intersection) {
		List<Road> roadList = new LinkedList<Road>();
		for(Road r : intersection.getRoad()) {
			roadList.add(r);
		}
		
		for(Road r : intersection.getRoad()) {
			
			for(PedestrianLane pl : r.getPedestrianLane()) {
				
				for(Road or : roadList) {
					
//					build the list of incoming lanes and sub-lanes and order it according to the index
					List<ConflictingLane> lanes = new LinkedList<ConflictingLane>();
					lanes.addAll(or.getIncomingLane());
					for(IncomingLane il : or.getIncomingLane()) {
						if(!il.getSubLane().isEmpty()) {
							for(Lane sl : il.getSubLane()) {
								if(sl instanceof ConflictingLane) {
									lanes.add((ConflictingLane) sl);
								}
							}					
						}
					}
					lanes = lanes.stream().sorted(Comparator.comparing(Lane::getIndex)).collect(Collectors.toList());
					
					for(ConflictingLane il : lanes) {
						if(il.getLink().get(0).getRefOutgoingLane().equals(pl.getRoad().getOutgoingLane().get(0)) || 
								il.getRefRoadId().equals(pl.getRefRoadId())) {
							il.getConflictingLane().add(pl);
							il.getConflictingLink().addAll(pl.getLink());
							pl.getConflictingLane().add(il);
						}
					}					
				}				
			}			
		}		
	}	
	

	/**
	 * Creates for each IncomingLane and each SubLane the list of their ConflictingLane
	 * @param intersection
	 */
	private void computeConflictingLanes(Intersection intersection) {
		
		List<Road> roadList = new LinkedList<Road>();
		for(Road r : intersection.getRoad()) {
			roadList.add(r);
		}
		for(Road r : intersection.getRoad()) {

//			build the list of incoming lanes and sub-lanes for the current road and order it according to the index
			List<ConflictingLane> currLanes = new LinkedList<ConflictingLane>();
			currLanes.addAll(r.getIncomingLane());
			for(IncomingLane il : r.getIncomingLane()) {
				if(!il.getSubLane().isEmpty()) {
					for(Lane sl : il.getSubLane()) {
						if(sl instanceof ConflictingLane) {
							currLanes.add((ConflictingLane) sl);
						}
					}					
				}
			}
			currLanes = currLanes.stream().sorted(Comparator.comparing(Lane::getIndex)).collect(Collectors.toList());
			
			roadList.remove(0); //remove current road which is at the first pos of list
			int roadListSize = roadList.size();
			for(int i = 0; i < roadListSize; i++) {
				
//				build the list of incoming lanes and sub-lanes for the i road and order it according to the index
				List<ConflictingLane> lanes = new LinkedList<ConflictingLane>();
				lanes.addAll(roadList.get(i).getIncomingLane());
				for(IncomingLane il : roadList.get(i).getIncomingLane()) {
					if(!il.getSubLane().isEmpty()) {
						for(Lane sl : il.getSubLane()) {
							if(sl instanceof ConflictingLane) {
								lanes.add((ConflictingLane) sl);
							}
						}					
					}
				}
				lanes = lanes.stream().sorted(Comparator.comparing(Lane::getIndex)).collect(Collectors.toList());
				
				for(int l = 0; l < currLanes.size(); l++) {
					ConflictingLane il = currLanes.get(l);
					//					first lane
					if(l == 0) {
						if(i < roadListSize-1) {
							il.getConflictingLane().add(lanes.get(i+1));
							il.getConflictingLink().addAll(lanes.get(i+1).getLink());
						}						
					}
					//					last lane
					else if(l == currLanes.size()-1) {
						switch(i) {
						case 0:
							List<ConflictingLane> otherLanesList = new LinkedList<ConflictingLane>();
							otherLanesList.addAll(lanes);
							otherLanesList.remove(0);
							il.getConflictingLane().addAll(otherLanesList);
							for(ConflictingLane cl : otherLanesList) {
								il.getConflictingLink().addAll(cl.getLink());
							}
							break;
						default:
							il.getConflictingLane().add(lanes.get(i));
							il.getConflictingLink().addAll(lanes.get(i).getLink());
							il.getConflictingLane().add(lanes.get(i-1));
							il.getConflictingLink().addAll(lanes.get(i-1).getLink());
							break;
						}
					}	
					//					case of Lane closer to first one
					else if(l <= roadListSize/2) {
						if(i == roadListSize-1) {	
							il.getConflictingLane().addAll(lanes);
							for(ConflictingLane cl : lanes) {
								il.getConflictingLink().addAll(cl.getLink());
							}
						}
						else {							
							il.getConflictingLane().add(lanes.get(i+1));
							il.getConflictingLink().addAll(lanes.get(i+1).getLink());
							if(i+2 < lanes.size()) {
								il.getConflictingLane().add(lanes.get(i+2));
								il.getConflictingLink().addAll(lanes.get(i+2).getLink());
							}							
						}
					}	
					//					case of Lane closer to last one
					else {
						if(i == 0 || i == (roadListSize-1)) {
							List<ConflictingLane> otherLanesList = new LinkedList<ConflictingLane>();
							otherLanesList.addAll(lanes);
							otherLanesList.remove(0);
							il.getConflictingLane().addAll(otherLanesList);
							for(ConflictingLane cl : otherLanesList) {
								il.getConflictingLink().addAll(cl.getLink());
							}
						}
						else if((i+1) <= roadListSize/2) {
							il.getConflictingLane().add(lanes.get(i+1));
							il.getConflictingLink().addAll(lanes.get(i+1).getLink());
							il.getConflictingLane().add(lanes.get(i+2));
							il.getConflictingLink().addAll(lanes.get(i+2).getLink());
						}
						else {
							List<ConflictingLane> otherLanesList = new LinkedList<ConflictingLane>();
							otherLanesList.addAll(lanes);
							otherLanesList.remove(otherLanesList.size()-1);
							il.getConflictingLane().addAll(otherLanesList);
							for(ConflictingLane cl : otherLanesList) {
								il.getConflictingLink().addAll(cl.getLink());
							}
						}
					}

				}	

			}
			roadList.add(roadList.size(), r); //add the current road to the end of the list
		}
		
	}

	/**
	 * Creates for each IncomingLane the corresponding Link which links it to the OutgoingLane
	 * @param intersection
	 */
	private void createLinks(Intersection intersection) {
//		creates list of road starting from last one
		List<Road> roadList = new LinkedList<Road>();
		for(Road r : intersection.getRoad()) {
			roadList.add(0, r);
		}
		
		for(Road r : intersection.getRoad()) {
			roadList.remove(roadList.size()-1); //remove last element which is equal to the current id
			
//			build the list of incoming lanes and sub-lanes and order it according to the index
			List<ConflictingLane> lanes = new LinkedList<ConflictingLane>();
			lanes.addAll(r.getIncomingLane());
			for(IncomingLane il : r.getIncomingLane()) {
				if(!il.getSubLane().isEmpty()) {
					for(Lane sl : il.getSubLane()) {
						if(sl instanceof ConflictingLane) {
							lanes.add((ConflictingLane) sl);
						}
					}					
				}
			}
			lanes = lanes.stream().sorted(Comparator.comparing(ConflictingLane::getIndex)).collect(Collectors.toList());
			for(int i = 0; i < lanes.size(); i++) {
				OutgoingLane og = roadList.get(i).getOutgoingLane().get(0);
				Link link = TOSDeviceFactory.eINSTANCE.createLink();
				link.setIndex(intersection.getId()+"_"+lanes.get(i).getId()+"_"+og.getId());
				link.setRefIncomingLane(lanes.get(i));
				link.setRefOutgoingLane(og);
				lanes.get(i).getLink().add(link);
				og.getLink().add(link);
				intersection.getLink().add(link);				
			}
			roadList.add(0, r); //add the current road at the top of the list
		}		
	}	
}
