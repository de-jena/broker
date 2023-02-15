/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.intersection.component.helper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import de.dim.trafficos.common.model.common.Output;
import de.dim.trafficos.common.model.common.DirectionType;
import de.dim.trafficos.common.model.common.Position;
import de.dim.trafficos.common.model.common.TOSCommonPackage;
import de.dim.trafficos.intersection.model.intersection.ConflictingLane;
import de.dim.trafficos.intersection.model.intersection.IncomingLane;
import de.dim.trafficos.intersection.model.intersection.Intersection;
import de.dim.trafficos.intersection.model.intersection.Lane;
import de.dim.trafficos.intersection.model.intersection.Link;
import de.dim.trafficos.intersection.model.intersection.OutgoingLane;
import de.dim.trafficos.intersection.model.intersection.PedestrianLane;
import de.dim.trafficos.intersection.model.intersection.Road;
import de.dim.trafficos.intersection.model.intersection.RoadType;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;



/**
 * 
 * @author ilenia
 * @since Feb 13, 2023
 */
public class IntersectionHelper {
	
	public static String LEFT_RIGHT_PREFIX = "LEFT_RIGHT";
	
	public static String STRAIGHT_LEFT_PREFIX = "STRAIGHT_LEFT";
	
	public static String STRAIGHT_RIGHT_PREFIX = "STRAIGHT_RIGHT";
	
	public static String TURNS_PREFIX = "TURNS";
	
	public static String MERGE_PREFIX = "MERGE";
	
	public static String SEP_PREFIX = "SEP";
	
	private static int laneIndex;
	
	public static Intersection createIntersection(Map<Integer, RoadType> roadsMap, 
			TOSIntersectionPackage intersectionPackage, TOSCommonPackage commonPackage) {
		if(!areOptionsOK(roadsMap)) {
			throw new IllegalArgumentException("Inconsisten roads options! Cannot create Intersection!");
		}
		
		Intersection intersection = intersectionPackage.getTOSIntersectionFactory().createIntersection();
		intersection.setId(UUID.randomUUID().toString());
		
		laneIndex = 0;
		int numRoad = roadsMap.size();
		for(int i = 0; i < numRoad; i++) {
			
			RoadType roadType = roadsMap.get(i);			
			Road road = intersectionPackage.getTOSIntersectionFactory().createRoad();
			road.setType(roadType);
			road.setId(String.valueOf(i));
			if(roadType.getLiteral().startsWith("MAIN")) {
				road.setMainRoad(true);
			}
			else {
				road.setMainRoad(false);
			}
			createConflictingLanes(road, numRoad, roadType, intersectionPackage);
			laneIndex++;
			
//			create outgoing lane
			OutgoingLane outLane = intersectionPackage.getTOSIntersectionFactory().createOutgoingLane();
			outLane.setId("-"+road.getId()+"_0");
			outLane.setRefRoadId(road.getId());
			outLane.setRoad(road);
			road.getOutgoingLane().add(outLane);			
			
//			create pedestrian lane
			PedestrianLane pedLane = intersectionPackage.getTOSIntersectionFactory().createPedestrianLane();
			pedLane.setId("P_"+road.getId()+"_0");
			pedLane.setRefRoadId(road.getId());
			pedLane.setRoad(road);
			pedLane.setIndex(laneIndex);
			laneIndex++;
			road.getPedestrianLane().add(pedLane);
			
//			create link between pedestrian lane and outgoing lane
			Link link = intersectionPackage.getTOSIntersectionFactory().createLink();
			link.setIndex(intersection.getId()+"_"+pedLane.getId()+"_"+outLane.getId());
			link.setRefIncomingLane(pedLane);
			link.setRefOutgoingLane(outLane);
			pedLane.getLink().add(link);
			outLane.getLink().add(link);
			intersection.getLink().add(link);
			
			intersection.getRoad().add(road);
		}
		createLinks(intersection, intersectionPackage);
		computeConflictingLanes(intersection);
		computePedestrianConflicts(intersection);
		createSignalGroups(intersection, commonPackage);
		return intersection;
	}
	
	
	/**
	 * Creates the IncomingLane and eventual SubLane according to the provided options for the Road
	 * @param road
	 * @param numRoad
	 * @param roadOption
	 */
	private static void createConflictingLanes(Road road, int numRoad, RoadType roadOption, TOSIntersectionPackage intersectionPackage) {
		
		if(numRoad == 2) {							
			IncomingLane inLane = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);
			inLane.setDirection(DirectionType.STRAIGHT);
			road.getIncomingLane().add(inLane);				
		}
		else if(numRoad == 3) {
			
			if(roadOption.getLiteral().contains(LEFT_RIGHT_PREFIX)) {
//				logger.fine("Creating Road with option " + roadOption);
				if(roadOption.getLiteral().contains(SEP_PREFIX)) {
					IncomingLane inLane0  = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);		
					inLane0.setDirection(DirectionType.TURN_RIGHT);
					road.getIncomingLane().add(inLane0);
					laneIndex++;	
					
					IncomingLane inLane1  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane1.setDirection(DirectionType.TURN_LEFT);
					road.getIncomingLane().add(inLane1);
				}
				else {
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);	
					subLane.setDirection(DirectionType.TURN_RIGHT);
					laneIndex++;
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane.setDirection(DirectionType.TURN_LEFT);
					inLane.getSubLane().add(subLane);		
					road.getIncomingLane().add(inLane);
				}
			}
			else if(roadOption.getLiteral().contains(STRAIGHT_RIGHT_PREFIX)) {
				if(roadOption.getLiteral().contains(SEP_PREFIX)) {
					IncomingLane inLane0  = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);		
					inLane0.setDirection(DirectionType.TURN_RIGHT);
					road.getIncomingLane().add(inLane0);
					laneIndex++;	
					
					IncomingLane inLane1  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane1.setDirection(DirectionType.STRAIGHT);
					road.getIncomingLane().add(inLane1);
				}
				else {
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);	
					subLane.setDirection(DirectionType.TURN_RIGHT);
					laneIndex++;
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane.setDirection(DirectionType.STRAIGHT);
					inLane.getSubLane().add(subLane);		
					road.getIncomingLane().add(inLane);
				}
			}
			else if(roadOption.getLiteral().contains(STRAIGHT_LEFT_PREFIX)) {
				if(roadOption.getLiteral().contains(SEP_PREFIX)) {
					IncomingLane inLane0  = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);		
					inLane0.setDirection(DirectionType.STRAIGHT);
					road.getIncomingLane().add(inLane0);
					laneIndex++;	
					
					IncomingLane inLane1  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane1.setDirection(DirectionType.TURN_LEFT);
					road.getIncomingLane().add(inLane1);
				}
				else {
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);		
					inLane.setDirection(DirectionType.STRAIGHT);
					laneIndex++;
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);	
					subLane.setDirection(DirectionType.TURN_LEFT);					
					inLane.getSubLane().add(subLane);		
					road.getIncomingLane().add(inLane);
				}
			}			
		}
		else if(numRoad == 4) {
			
			if(roadOption.getLiteral().contains(STRAIGHT_RIGHT_PREFIX)) {
				
				ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);	
				subLane.setDirection(DirectionType.TURN_RIGHT);
				laneIndex++;
				IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
				inLane.setDirection(DirectionType.STRAIGHT);
				inLane.getSubLane().add(subLane);		
				road.getIncomingLane().add(inLane);
				laneIndex++;
				IncomingLane inLane2  = createConflictingLane(road, road.getId()+"_2", laneIndex, intersectionPackage);		
				inLane2.setDirection(DirectionType.TURN_LEFT);
				road.getIncomingLane().add(inLane2);
			}
			else if(roadOption.getLiteral().contains(STRAIGHT_LEFT_PREFIX)) {
				
				IncomingLane inLane  = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);		
				inLane.setDirection(DirectionType.TURN_RIGHT);
				road.getIncomingLane().add(inLane);
				laneIndex++;
				
				IncomingLane inLane2  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
				inLane2.setDirection(DirectionType.STRAIGHT);
				laneIndex++;
				
				ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_2", laneIndex, intersectionPackage);	
				subLane.setDirection(DirectionType.TURN_LEFT);
				inLane2.getSubLane().add(subLane);		
				road.getIncomingLane().add(inLane2);
			}
			else {
				if(roadOption.getLiteral().contains(MERGE_PREFIX)) {
					
					ConflictingLane subLane  = (ConflictingLane) createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);	
					subLane.setDirection(DirectionType.TURN_RIGHT);
					laneIndex++;
					
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane.setDirection(DirectionType.STRAIGHT);
					laneIndex++;
					
					ConflictingLane subLane2  = (ConflictingLane) createConflictingLane(road, road.getId()+"_2", laneIndex, intersectionPackage);	
					subLane2.setDirection(DirectionType.TURN_LEFT);
					
					inLane.getSubLane().add(subLane);
					inLane.getSubLane().add(subLane2);
					road.getIncomingLane().add(inLane);

				}
				else {
					IncomingLane inLane  = createConflictingLane(road, road.getId()+"_0", laneIndex, intersectionPackage);		
					inLane.setDirection(DirectionType.TURN_RIGHT);
					road.getIncomingLane().add(inLane);
					laneIndex++;
					
					IncomingLane inLane2  = createConflictingLane(road, road.getId()+"_1", laneIndex, intersectionPackage);		
					inLane2.setDirection(DirectionType.STRAIGHT);
					road.getIncomingLane().add(inLane2);
					laneIndex++;
					
					IncomingLane inLane3  = createConflictingLane(road, road.getId()+"_2", laneIndex, intersectionPackage);		
					inLane3.setDirection(DirectionType.TURN_LEFT);
					road.getIncomingLane().add(inLane3);
				}				
			}	
		}
	}
	
	private static IncomingLane createConflictingLane(Road road, String id, int index, TOSIntersectionPackage intersectionPackage) {
		IncomingLane lane = intersectionPackage.getTOSIntersectionFactory().createIncomingLane();
		lane.setId(id);
		lane.setIndex(index);
		lane.setRoad(road);
		lane.setRefRoadId(road.getId());
		return lane;
	}
	
	
	

	/**
	 * Checks that the options provided for the Intersection creation are consistent with the number of roads
	 * required. 
	 * @param roadsMap
	 * @return
	 */
	private static boolean areOptionsOK(Map<Integer, RoadType> roadsMap) {

		if(roadsMap == null) {
			return false;
		}
		if(roadsMap.isEmpty()) {
			return false;
		}
		if(roadsMap.size() < 2) {
//			System.out.println("Cannot create an intersection with less than 2 roads.");
			return false;
		}
		Iterator<RoadType> iter = roadsMap.values().iterator();
		if(roadsMap.size() == 2) {			
			while(iter.hasNext()) {
				RoadType next = iter.next();
				if(!RoadType.MAIN_STRAIGHT.equals(next)) {
//					System.out.println("Option " + next + " is not possible for a 2 roads intersection.");
					return false;
				}
			}
		}
		if(roadsMap.size() == 3) {
			List<RoadType> options = new ArrayList<>();
			while(iter.hasNext()) {
				RoadType next = iter.next();
				if(!options.contains(next)) {
					options.add(next);
				}			  
				if(next.getLiteral().contains(TURNS_PREFIX)) {
					System.out.println("Option " + next + " is not possible for the required number of roads.");
					return false;
				}
			}			
			if(options.size() < 3) {
				System.out.println("Options conflicts found.");
				return false;
			}	
		
			for(RoadType op : options) {
				if(!op.getLiteral().contains(LEFT_RIGHT_PREFIX) &&
						!op.getLiteral().contains(STRAIGHT_LEFT_PREFIX) &&
						!op.getLiteral().contains(STRAIGHT_RIGHT_PREFIX)) {
					System.out.println("Option " + op + " is not possible for the required number of roads.");
					return false;
				}
			}
			if(options.get(0).getLiteral().contains(LEFT_RIGHT_PREFIX) &&
					!options.get(1).getLiteral().contains(STRAIGHT_RIGHT_PREFIX)) {
//				logger.warning("Order of roads is inconsistent. Reorganizing it.");
				roadsMap.put(1, options.get(2));
				roadsMap.put(2, options.get(1));
			}
			else if(options.get(0).getLiteral().contains(STRAIGHT_RIGHT_PREFIX) &&
					!options.get(1).getLiteral().contains(STRAIGHT_LEFT_PREFIX)) {
//				logger.warning("Order of roads is inconsistent. Reorganizing it.");
				roadsMap.put(1, options.get(2));
				roadsMap.put(2, options.get(1));
			}
			else if(options.get(0).getLiteral().contains(STRAIGHT_LEFT_PREFIX) &&
					!options.get(1).getLiteral().contains(LEFT_RIGHT_PREFIX)) {
//				logger.warning("Order of roads is inconsistent. Reorganizing it.");
				roadsMap.put(1, options.get(2));
				roadsMap.put(2, options.get(1));
			}			
		}
		if(roadsMap.size() == 4) {
			while(iter.hasNext()) {
				RoadType next = iter.next();
				if((next.getLiteral().contains(STRAIGHT_RIGHT_PREFIX) || 
						next.getLiteral().contains(STRAIGHT_LEFT_PREFIX)) &&
						!next.getLiteral().contains(MERGE_PREFIX)) {
//					System.out.println("Option " + next + " is not possible for the required number of roads.");
					return false;
				}
				if(next.getLiteral().contains(LEFT_RIGHT_PREFIX)) {
//					System.out.println("Option " + next + " is not possible for the required number of roads.");
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
	private static void createSignalGroups(Intersection intersection, TOSCommonPackage commonPackage) {
		for(Road r : intersection.getRoad()) {
			for(IncomingLane il : r.getIncomingLane()) {
				Output sg = commonPackage.getTOSCommonFactory().createOutput();
				sg.setId("SG-"+il.getId());
				sg.setType("SignalGroup");
				Position pos = commonPackage.getTOSCommonFactory().createPosition();
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
				Output sg = commonPackage.getTOSCommonFactory().createOutput();
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
	private static DirectionType setSignalGroupOrientation(IncomingLane il) {
		
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
	private static void computePedestrianConflicts(Intersection intersection) {
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
	private static void computeConflictingLanes(Intersection intersection) {
		
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
	private static void createLinks(Intersection intersection, TOSIntersectionPackage intersectionPackage) {
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
				Link link = intersectionPackage.getTOSIntersectionFactory().createLink();
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
