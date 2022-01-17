/**
 * Copyright (c) 2012 - 2019 Data In Motion and others.
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

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import de.dim.trafficos.model.device.CacheDataEntry;
import de.dim.trafficos.model.device.ClearArea;
import de.dim.trafficos.model.device.ClearAreaType;
import de.dim.trafficos.model.device.ConflictingLane;
import de.dim.trafficos.model.device.DataValue;
import de.dim.trafficos.model.device.DirectionType;
import de.dim.trafficos.model.device.IncomingLane;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.Lane;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.Parameter;
import de.dim.trafficos.model.device.ParameterDataType;
import de.dim.trafficos.model.device.PedestrianLane;
import de.dim.trafficos.model.device.Phase;
import de.dim.trafficos.model.device.PhaseGroup;
import de.dim.trafficos.model.device.Program;
import de.dim.trafficos.model.device.ProgramEntry;
import de.dim.trafficos.model.device.ProgramTransition;
import de.dim.trafficos.model.device.Road;
import de.dim.trafficos.model.device.ScheduleModeType;
import de.dim.trafficos.model.device.SignalTable;
import de.dim.trafficos.model.device.TOSDeviceFactory;
import de.dim.trafficos.model.device.TimeTable;
import de.dim.trafficos.model.device.TimeTableEntry;
import de.dim.trafficos.model.device.TimeTableModeType;
import de.dim.trafficos.model.device.Transition;
import de.dim.trafficos.simulator.api.SignalPlanConstants;
import de.dim.trafficos.simulator.api.SignalPlanService;

/**
 * This service provides some useful methods to build the SignalPrograms for the SignalGroup of an Intersection.
 * 
 * @author ilenia
 * @since Jun 17, 2019
 */
@Component(service=SignalPlanService.class, scope=ServiceScope.PROTOTYPE)
public class SignalPlanServiceImpl implements SignalPlanService {

	private Logger logger = Logger.getLogger(SignalPlanServiceImpl.class.getName());

	@Activate
	public void activate() {
		logger.fine("SignalPlanService activated!");
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.simulator.api.SignalPlanService#createPhases(de.dim.tim.trafficos.simulator.model.TIMSimulator.Intersection, java.lang.String)
	 */
	@Override
	public List<Phase> createPhases(Intersection intersection, String strategy) {
		
		List<Phase> phases = new LinkedList<Phase>();
		if(SignalPlanConstants.ALL_PHASES.equals(strategy)) {
			phases = createAllPhases(intersection);
		}
		if(SignalPlanConstants.PHASES_WITHOUT_PEDESTRIAN.equals(strategy)) {
			phases = createPhasesWOPed(intersection);
		}
		if(SignalPlanConstants.PHASES_NOT_ONLY_PEDESTRIAN.equals(strategy)) {
			phases = createPhasesNotOnlyPed(intersection);
		}		
		createTransitions(phases);
		intersection.getPhase().addAll(phases);
		return phases;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.simulator.api.SignalPlanService#createPhaseGroups(de.dim.tim.trafficos.simulator.model.TIMSimulator.Intersection)
	 */
	@Override
	public void createPhaseGroups(Intersection intersection) {
		int key = 0;
		List<ConflictingLane> allLanes = new LinkedList<ConflictingLane>();
		List<ConflictingLane> combLanes = new LinkedList<ConflictingLane>();
		for(Road r : intersection.getRoad()) {
			allLanes.addAll(r.getIncomingLane());
			allLanes.addAll(r.getPedestrianLane());
		}
		for(Phase phase : intersection.getPhase()) {
			List<Phase> combPhases = new LinkedList<Phase>();
			combPhases.add(phase);
			combLanes.clear();
			combLanes.addAll(phase.getLane());
			int totPenalty = 0;
			while(!combLanes.containsAll(allLanes)) {
				totPenalty += findProperPhase(intersection, combPhases, combLanes);				
			}	
			combPhases = combPhases.stream().sorted(Comparator.comparing(Phase::getId)).collect(Collectors.toList());
			boolean sameGroup = false;
			for(PhaseGroup pg : intersection.getPhaseGroup()) {
				if(pg.getPhase().containsAll(combPhases) && pg.getPhase().size() == combPhases.size()) {					
					sameGroup = true;
					break;
				}
			}
			if(!sameGroup) {
				PhaseGroup phaseGroup = TOSDeviceFactory.eINSTANCE.createPhaseGroup();
				phaseGroup.setId("PG_" + String.valueOf(key));
				phaseGroup.setPenalty(totPenalty);
				phaseGroup.getPhase().addAll(combPhases);
				intersection.getPhaseGroup().add(phaseGroup);
				key++;
			}
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.simulator.api.SignalPlanService#createFixTimeProgram(de.dim.tim.trafficos.simulator.model.TIMSimulator.Intersection, java.lang.String, int)
	 */
	@Override
	public Program createFixTimeProgram(PhaseGroup phaseGroup, String programId, int duration) {
		
		Program program = TOSDeviceFactory.eINSTANCE.createProgram();
		program.setId(programId);
		program.setLength(duration);
		
		List<Phase> phases = phaseGroup.getPhase().stream().sorted(Comparator.comparing(Phase::getId))
				.collect(Collectors.toList());
		List<ProgramTransition> progTransitions = createProgramTransitions(phases);
		int totTransDur = 0;
		for(ProgramTransition pt : progTransitions) {
			totTransDur += pt.getDuration();
		}
		int totPhaseDur = duration-totTransDur;
		int start = 0;
		for(Phase p : phases) {
			ProgramEntry pe = TOSDeviceFactory.eINSTANCE.createProgramEntry();
			pe.setRefPhase(p);
			pe.setDuration(p.getWeightMin()*totPhaseDur/100);
			pe.setBegin(start);
			pe.setEnd(start+pe.getDuration()-1);
			start = pe.getEnd() + 1;
			program.getOutputEntry().add(pe);
			
			List<ProgramTransition> trans = progTransitions.stream().filter(t->(t.getRefPhase().equals(p)))
					.collect(Collectors.toList());
			if(trans.size() == 1) {
				ProgramTransition t = trans.get(0);
				t.setBegin(start);
				t.setEnd(start + t.getDuration() -1);				
				start = t.getEnd() + 1;
				
				if(phases.indexOf(p) == phases.size()-1) {
					if(duration > start) {
						logger.warning("Required Program Duration was : " + duration);
						logger.warning("Effective Program Duration is : " + start);
						logger.warning("The remaining seconds will be assigned to the last phase.");
						pe.setEnd(pe.getEnd() + (duration-start));
						pe.setDuration(pe.getDuration() + (duration-start));
						t.setBegin(t.getBegin() + (duration-start));
						t.setEnd(t.getEnd() + (duration-start));
					}					
				}
				program.getOutputEntry().add(pe);
				program.getOutputEntry().add(t);				
			}			
		}
		return program;
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.simulator.api.SignalPlanService#applyProgram(de.dim.tim.trafficos.simulator.model.TIMSimulator.Intersection, de.dim.tim.trafficos.simulator.model.TIMSimulator.Program, de.dim.tim.trafficos.simulator.model.TIMSimulator.ScheduleModeType)
	 */
	@Override
	public Map<Integer, Map<ConflictingLane, String>> applyProgram(Intersection intersection, Program program, ScheduleModeType scheduleType) {
		
		List<ConflictingLane> allLanes = new LinkedList<ConflictingLane>();
		for(Phase p : intersection.getPhase()) {
			allLanes.addAll(p.getLane());
		}
		
		Map<Integer, Map<ConflictingLane, String>> programMap = new HashMap<Integer, Map<ConflictingLane, String>>();
		
		for(ProgramEntry pe : program.getOutputEntry()) {			
			for(int i = pe.getBegin(); i <= pe.getEnd(); i++) {
				if(pe instanceof ProgramTransition) {
					programMap.put(i, runTransition(i, (ProgramTransition) pe));
				}
				else {
					programMap.put(i, runPhase(pe.getRefPhase(), allLanes));
				}		
			}
		}
//		Create TX DataValue
		Parameter p = TOSDeviceFactory.eINSTANCE.createParameter();
		p.setDataType(ParameterDataType.INTEGER);
		p.setId("tx");
		p.setName("Cycle Counter");
		intersection.getParameter().add(p);
		createSignalTable(program, programMap, p);
		createTimeTable(intersection, program, scheduleType);
		intersection.getProgram().add(program);
		return programMap;
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.simulator.api.SignalPlanService#addCacheDataValueDurations(de.dim.trafficos.model.device.Program)
	 */
	@Override
	public void addCacheDataValueDurations(Program program) {
		
		if(program == null) {
			logger.severe("Program is null");
			return;
		}
		if(program.getSignalTable() == null) {
			logger.severe(String.format("[%s] There is no SignalTable for this program.", program.getId()));
			return;
		}
		List<CacheDataEntry> entries = program.getSignalTable().getCacheDataEntry();
		if(entries.isEmpty()) {
			logger.warning(String.format("[%s] There are no cached DataEntry for this program.", program.getId()));
		}
		entries = entries.stream().sorted(Comparator.comparing(CacheDataEntry::getId)).collect(Collectors.toList());
		
		Map<String, Map<String, DataValue>> valuesMap = new HashMap<String, Map<String, DataValue>>();
		for(CacheDataEntry de : entries) {
			for(DataValue dv : de.getValue()) {
				if(dv.getElement() instanceof Output) {
					if(!valuesMap.containsKey(dv.getElement().getId())) {
						Map<String, DataValue> dvMap = new HashMap<String, DataValue>();
						valuesMap.put(dv.getElement().getId(), dvMap);		
					}
					valuesMap.get(dv.getElement().getId()).put(de.getId(), dv);
				}
			}
		}
		valuesMap.keySet().forEach(sg->{
			Map<String, DataValue> dvMap = valuesMap.get(sg);
			for(int i = 0; i < dvMap.size(); i++) {
				int index = 1;
				DataValue dv = dvMap.get(String.valueOf(i));

				if(i == dvMap.size() -1) {
					for(int j2 = 0; j2 < i; j2++) {
						DataValue dv3 = dvMap.get(String.valueOf(j2));
						if(dv.getValue().equals(dv3.getValue())) {
							index++;
						}
						else {	
							DataValue v = dvMap.get(String.valueOf(i));
							v.setDuration(index);
							index--;
							break;
						}
					}
				}				
				for(int j = i+1; j < dvMap.size(); j++) {
					DataValue dv2 = dvMap.get(String.valueOf(j));
					if(dv.getValue().equals(dv2.getValue())) {
						index++;
						if(j == dvMap.size()-1) {
							for(int j2 = 0; j2 < i; j2++) {
								DataValue dv3 = dvMap.get(String.valueOf(j2));
								if(dv.getValue().equals(dv3.getValue())) {
									index++;
								}
								else {
									for(int k = i; k < j; k++) {
										DataValue v = dvMap.get(String.valueOf(k));
										v.setDuration(index);
										index--;
									}
								break;
								}
							}
						i = j-1;
						break;
						}
					}
					else {
						for(int k = i; k < j; k++) {
							DataValue v = dvMap.get(String.valueOf(k));
							v.setDuration(index);
							index--;
						}
					i = j-1;
					break;
					}
				}				
			}			
		});
	}
	

	/**
	 * @param phases
	 * @return
	 */
	private List<ProgramTransition> createProgramTransitions(List<Phase> phases) {
		
		List<ProgramTransition> progTransitions = new LinkedList<ProgramTransition>();
		List<ConflictingLane> nextLanes = new LinkedList<ConflictingLane>();
		
		for(int i = 0; i < phases.size(); i++) {
			Phase p = phases.get(i);
			Phase nextPhase;
			nextLanes.clear();
			if(i == phases.size()-1) {
				nextLanes.clear();
				nextLanes.addAll(phases.get(0).getLane());
				nextPhase = phases.get(0);
			}
			else {
				nextLanes.clear();
				nextLanes.addAll(phases.get(i+1).getLane());
				nextPhase = phases.get(i+1);
			}
			
			ProgramTransition trans = TOSDeviceFactory.eINSTANCE.createProgramTransition();
			trans.setRefPhase(p);
			for(Transition t : p.getTransition()) {
				if(nextPhase.equals(t.getRefNextPhase())) {
					trans.setTransition(t);
				}
			}
//			variable to indicate whether from this Phase to the next one there is a PedestrianLane change
			boolean isPedTrans = false;		
//			variable to indicate whether from this Phase to the next one there is a Lane of a Main Road change
			boolean isMainTrans = false;
//			variable to indicate whether from this Phase to the next one there is a Lane of a Secondary Road change
			boolean isSecTrans = false;
		
//			this is to avoid having green for too long
			for(ConflictingLane cl : p.getLane()) {			
				if((cl instanceof PedestrianLane) && !nextLanes.contains(cl)) {
					isPedTrans = true;
				}
				if((cl instanceof ConflictingLane) && cl.getRoad().isMainRoad() && !nextLanes.contains(cl)) {
					isMainTrans = true;
				}
				if((cl instanceof ConflictingLane) && !cl.getRoad().isMainRoad() && !nextLanes.contains(cl)) {
					isSecTrans = true;
				}
			}
			if(isPedTrans) {
				trans.setDuration(SignalPlanConstants.PED_CLEAR_TIME);
				ClearArea ca = TOSDeviceFactory.eINSTANCE.createClearArea();
				ca.setType(ClearAreaType.CLEAR_PEDESTRIAN);
				trans.getTransition().getClearArea().add(ca);
				if(isMainTrans) {
					ClearArea ca2 = TOSDeviceFactory.eINSTANCE.createClearArea();
					ca2.setType(ClearAreaType.CLEAR_MAIN);
					trans.getTransition().getClearArea().add(ca2);
					if(isSecTrans) {
						ClearArea ca3 = TOSDeviceFactory.eINSTANCE.createClearArea();
						ca3.setType(ClearAreaType.CLEAR_SECONDARY);
						trans.getTransition().getClearArea().add(ca3);
					}
				}
			}
			else if (isMainTrans) {
				trans.setDuration(SignalPlanConstants.MAIN_CLEAR_TIME);
				ClearArea ca = TOSDeviceFactory.eINSTANCE.createClearArea();
				ca.setType(ClearAreaType.CLEAR_MAIN);
				trans.getTransition().getClearArea().add(ca);
				if(isSecTrans) {
					ClearArea ca2 = TOSDeviceFactory.eINSTANCE.createClearArea();
					ca2.setType(ClearAreaType.CLEAR_SECONDARY);
					trans.getTransition().getClearArea().add(ca2);
				}
			}
			else if(isSecTrans) {
				trans.setDuration(SignalPlanConstants.SEC_CLEAR_TIME);
				ClearArea ca2 = TOSDeviceFactory.eINSTANCE.createClearArea();
				ca2.setType(ClearAreaType.CLEAR_SECONDARY);
				trans.getTransition().getClearArea().add(ca2);
			}
			else {
				trans.setDuration(SignalPlanConstants.RELEASE_STOP_TRANS_TIME);
			}
		progTransitions.add(trans);	
		}		
		return progTransitions;
	}

	/**
	 * Adds a TimeTableEntry with this Program
	 * @param intersection
	 * @param program
	 */
	private void createTimeTable(Intersection intersection, Program program, ScheduleModeType scheduleType) {
		if(intersection.getTimeTable() == null) {
			TimeTable tt = TOSDeviceFactory.eINSTANCE.createTimeTable();
			tt.setDefaultMode(TimeTableModeType.OFF);
			tt.setId(UUID.randomUUID().toString());
			intersection.setTimeTable(tt);
		}
		
		TimeTableEntry tte = TOSDeviceFactory.eINSTANCE.createTimeTableEntry();
		tte.setProgram(program);
		tte.setMode(scheduleType);
		intersection.getTimeTable().getEntry().add(tte);		
	}


	/**
	 * Creates the SignalTable for this program.
	 * @param program
	 * @param programMap
	 */
	private void createSignalTable(Program program, Map<Integer, Map<ConflictingLane, String>> programMap, Parameter tx) {
		
		for(int i = 0; i < programMap.size(); i++) {
			CacheDataEntry dataEntry = TOSDeviceFactory.eINSTANCE.createCacheDataEntry();
			dataEntry.setId(String.valueOf(i));
			dataEntry.setIndex(i);
			
			DataValue txValue = TOSDeviceFactory.eINSTANCE.createDataValue();
			txValue.setElement(EcoreUtil.copy(tx));
			txValue.setElementRef(tx);
			txValue.setValue(String.valueOf(i));
			dataEntry.getValue().add(txValue);
			
//			Create Output DataValue
			Map<ConflictingLane, String> statusMap = programMap.get(i);
			statusMap.entrySet().forEach(e->{
				
				ConflictingLane lane = e.getKey();
				String status = e.getValue();
				DataValue value = TOSDeviceFactory.eINSTANCE.createDataValue();
				
				value.setElement(EcoreUtil.copy(lane.getSignalGroup()));
				value.setElementRef(lane.getSignalGroup());
				value.setValue(status);
				dataEntry.getValue().add(value);
			});
			
			if(program.getSignalTable() == null) {
				SignalTable sigTable = TOSDeviceFactory.eINSTANCE.createSignalTable();
				program.setSignalTable(sigTable);
			}			
			program.getSignalTable().getCacheDataEntry().add(dataEntry);
		}		
	}


	/**
	 * Creates all the possible distinguished Phases, taking into account both cars and pedestrians
	 * 
	 * @param intersection the Intersection object
	 * @return the list of Phases or an empty list if an error occurred
	 */
	private List<Phase> createAllPhases(Intersection intersection) {

		List<Phase> phases = new LinkedList<Phase>();
		if(intersection == null) {
			logger.severe("Cannot create phases for null intersection");
			return phases;
		}		
		List<ConflictingLane> allLanes = new LinkedList<ConflictingLane>();
		for(Road road : intersection.getRoad()) {
			allLanes.addAll(road.getIncomingLane());	
		}
		allLanes = allLanes.stream().sorted(Comparator.comparing(ConflictingLane::getIndex)).collect(Collectors.toList());		
		for(Road road : intersection.getRoad()) {
			allLanes.addAll(road.getPedestrianLane());
		}
		
		int numLanes = allLanes.size();
		int phaseId = 0;		
		List<ConflictingLane> phaseLanes = new LinkedList<ConflictingLane>();
		List<ConflictingLane> allLanes2 = new LinkedList<ConflictingLane>();
		allLanes2.addAll(allLanes);
		for(int j = 0; j < numLanes; j++) {
			ConflictingLane l = allLanes2.get(j);			
			for(int i = 0; i < numLanes; i++) {
				phaseLanes.clear();
				phaseLanes.add(l);
				List<ConflictingLane> copyAllLanes = new LinkedList<ConflictingLane>();
				if(i != 0) {
					ConflictingLane firstLane = allLanes. remove(0);
					allLanes.add(allLanes.size(), firstLane);						
				}
				copyAllLanes.addAll(allLanes);
				for(ConflictingLane  l2 : copyAllLanes) {
					if(l.equals(l2)) {
						continue;
					}
					if(l2 instanceof PedestrianLane) {
						if(!isInConflictPed((PedestrianLane) l2, phaseLanes)) {
							phaseLanes.add(l2);
						}
					}
					else {
						if(!isInConflict(l2, phaseLanes)) {
							phaseLanes.add(l2);
						}					
					}
				}
				if(!phaseLanes.isEmpty()) {
					boolean samePhase = false;
					for(Phase p : phases) {
						if(p.getLane().containsAll(phaseLanes)) {
							samePhase = true;
							break;
						}
					}
					if(!samePhase) {
						Phase phase = TOSDeviceFactory.eINSTANCE.createPhase();
						phase.setId("PH_"+phaseId);
						phase.getLane().addAll(phaseLanes);	
						phases.add(phase);
						phaseId++;
					}
				}
			}			
		}
		
		return phases;
	}

	/**
	 * Creates all possible phases and then filters them to remove the PedestrianLanes checking if this produces
	 * duplicate Phases and, in case, removes them.
	 * @param intersection
	 * @return the list of all possible distinguished Phases without PedestrianLane
	 */
	private List<Phase> createPhasesWOPed(Intersection intersection) {
		List<Phase> phases = createAllPhases(intersection);
		List<ConflictingLane> lanes = new LinkedList<ConflictingLane>();		
		int sizeBef = phases.size();
		for(Phase p : phases) {
			lanes.clear();
			lanes.addAll(p.getLane());
			for(ConflictingLane l : p.getLane()) {
				if(l instanceof PedestrianLane) {
					lanes.remove(l);
				}
			}
			if(p.getLane().size() != lanes.size()) {
				p.getLane().clear();
				p.getLane().addAll(lanes);
			}
		}
		List<Phase> duplicatePhases = new LinkedList<Phase>();
		for(Phase p : phases) {
			if(p.getLane().isEmpty()) {
				duplicatePhases.add(p);
			}
			else {
				for(Phase p2 : phases) {
					if(p.equals(p2)) {
						continue;
					}				
					if(p.getLane().containsAll(p2.getLane())) {
						duplicatePhases.add(p2);
					}
				}			
			}			
		}
		if(!duplicatePhases.isEmpty()) {
			phases.removeAll(duplicatePhases);
		}
		if(phases.size() < sizeBef) {
			reorderPhaseId(phases);
		}
		return phases;
	}
	
	/**
	 * @param intersection
	 * @return
	 */
	private List<Phase> createPhasesNotOnlyPed(Intersection intersection) {
		
		List<Phase> phases = createAllPhases(intersection);
		int sizeBef = phases.size();
		if(phases.isEmpty()) {
			return phases;
		}
		List<Phase> copyPhases = new LinkedList<Phase>();
		copyPhases.addAll(phases);
		for(Phase p : copyPhases) {
			List<ConflictingLane> pedLanes = p.getLane().stream().filter(l->(l instanceof PedestrianLane))
					.collect(Collectors.toList());
			if(pedLanes.size() == p.getLane().size()) {
				phases.remove(p);
			}
		}
		if(phases.size() < sizeBef) {
			reorderPhaseId(phases);
		}
		return phases;
	}

	/**
	 * Reorders the Phase ID names, in case some Phases have been removed from the original list
	 * @param phases
	 */
	private void reorderPhaseId(List<Phase> phases) {
		
		for(int i = 0; i < phases.size(); i++) {
			phases.get(i).setId("PH_"+String.valueOf(i));
		}		
	}
	
	/**
	 * Check if a Lane is in conflicts with the lanes already in the Phase
	 * @param lane the Lane to check
	 * @param phaseLanes the list of Lanes already in the current Phase
	 * @return <code>true<code> if the Lane is in conflict, <code>false<code> otherwise
	 */
	private boolean isInConflict(ConflictingLane lane, List<ConflictingLane> phaseLanes) {
		
		for(ConflictingLane l : phaseLanes) {
			if(l.getConflictingLane().contains(lane)) {
				return true;
			}
			if(l instanceof IncomingLane && l.getSubLane().isEmpty() && !lane.getSubLane().isEmpty()) {
				for(Lane sl : lane.getSubLane()) {
					if(l.getConflictingLane().contains(sl)) {
						return true;
					}
				}
			}
			if(!l.getSubLane().isEmpty() && lane.getSubLane().isEmpty()) {
				for(Lane sl : l.getSubLane()) {
					if(sl instanceof ConflictingLane) {
						ConflictingLane csl = (ConflictingLane) sl;
						if(csl.getConflictingLane().contains(lane)) {
							return true;
						}
					}
				}
			}
		}
		return false;		
	}
	
	/**
	 * Checks if a Pedestrian Lane is in conflict with the Lanes already in the Phase 
	 * @param pl the PedestrianLane to check
	 * @param phaseLanes the list of Lanes already in the current Phase
	 * @return <code>true<code> if the PedestrianLane is in conflict, <code>false<code> otherwise
	 */
	private boolean isInConflictPed(PedestrianLane pl, List<ConflictingLane> phaseLanes) {
					
		for(ConflictingLane cl : phaseLanes) {
//					if the pedestrian lane is the same of one of the phases lanes do not include it
			if(cl.getRoad().getPedestrianLane().contains(pl)) {
				return true;
			}
//					if the pedestrian lane is in the same road as the output of one of the lane in the phases 
//					check if this has its own signal group or not
			if(cl.getLink().get(0).getRefOutgoingLane().getRoad().equals(pl.getRoad())) {
//						if is the main direction that we cannot have pedestrian and lane at the same time
				if(DirectionType.STRAIGHT.equals(cl.getDirection())) {
					return true;
				}
//				if the lane has its own signal group then we cannot have the pedestrian at the same time
				if(cl.getSubLane().isEmpty()) {
					return true;
				}
			}
		}
	
		return false;
	}

	
	/**
	 * Creates the transitions between a phase and all the others and add them to it.
	 * @param phases
	 */
	private void createTransitions(List<Phase> phases) {
		
		List<ConflictingLane> allLanes = new LinkedList<ConflictingLane>();
		for(Phase p : phases) {
			for(ConflictingLane cl : p.getLane()) {
				if(!allLanes.contains(cl)) {
					allLanes.add(cl);
				}
			}			
		}		
		for(Phase p1 : phases) {
			for(Phase p2 : phases) {
				if(p1.equals(p2)) {
					continue;
				}
				Transition transition = TOSDeviceFactory.eINSTANCE.createTransition();
				transition.setId(p1.getId()+"_"+p2.getId());
				transition.setRefNextPhase(p2);
				for(ConflictingLane cl : allLanes) {
					if(p1.getLane().contains(cl) && p2.getLane().contains(cl)) {
						transition.getUnchangedLane().add(cl);
					}
					else if(!p1.getLane().contains(cl) && !p2.getLane().contains(cl)) {
						transition.getUnchangedLane().add(cl);
					}
					else {
						transition.getChangedLane().add(cl);
					}
				}	
				p1.getTransition().add(transition);
			}
		}		
	}
	
	/**
	 * @param refPhase
	 * @return
	 */
	private Map<ConflictingLane, String> runPhase(Phase refPhase, List<ConflictingLane> allLanes) {
		
		Map<ConflictingLane, String> statusMap = new TreeMap<>(
                (Comparator<ConflictingLane>) (o1, o2) -> o2.getId().compareTo(o1.getId())
        );
		
		for(ConflictingLane cl : allLanes) {
			if(refPhase.getLane().contains(cl)) {
				statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
			}
			else {
				statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
			}
		}		
		return statusMap;
	}

	
	/**
	 * @param transition
	 * @return
	 */
	private Map<ConflictingLane, String> runTransition(int tx, ProgramTransition progTrans) {
		
		Map<ConflictingLane, String> statusMap = new TreeMap<>(
                (Comparator<ConflictingLane>) (o1, o2) -> o2.getId().compareTo(o1.getId())
        );
		Transition transition = progTrans.getTransition();
		Phase refPhase = progTrans.getRefPhase();
		List<ClearAreaType> clearAreas = new LinkedList<ClearAreaType>();
		for(ClearArea ca : transition.getClearArea()) {
			clearAreas.add(ca.getType());
		}
		int start = progTrans.getBegin();
		int end = progTrans.getEnd();
		for(ConflictingLane cl : transition.getUnchangedLane()) {
			if(refPhase.getLane().contains(cl)) {
				statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
			}
			else {
				statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
			}
		}
		
		for(ConflictingLane cl : transition.getChangedLane()) {
			if(cl instanceof PedestrianLane) {
				if(refPhase.getLane().contains(cl)) {
					statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
				}
				else {
					if(cl.getRoad().isMainRoad() && clearAreas.contains(ClearAreaType.CLEAR_MAIN)) {
						if(tx >= start + SignalPlanConstants.MAIN_CLEAR_TIME -1) {							
							statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
						}
						else {
							statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
						}
					}
					else if(!cl.getRoad().isMainRoad() && clearAreas.contains(ClearAreaType.CLEAR_SECONDARY)) {
						if(tx >= start + SignalPlanConstants.SEC_CLEAR_TIME - 1) {
							statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
						}
						else {
							statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
						}
					}
					else {
						statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
					}
				}
			}
			else {
				if(refPhase.getLane().contains(cl)) {					
					if(tx < start+SignalPlanConstants.RELEASE_STOP_TRANS_TIME) {
						statusMap.put(cl, SignalPlanConstants.RELEASE_STOP_TRANS_STATUS);
					}
					else {
						statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
					}
				}
//				car lane which was red and has to be switched to green
				else {
					if(clearAreas.contains(ClearAreaType.CLEAR_PEDESTRIAN)) {
						boolean isItsPed = false;
						for(ConflictingLane l : refPhase.getLane()) {
							if(l instanceof PedestrianLane && 
									cl.getLink().get(0).getRefOutgoingLane().equals(l.getLink().get(0).getRefOutgoingLane()) ) {
								isItsPed = true;
								break;
							}
						}
						if(isItsPed) {
							if(tx > end-SignalPlanConstants.STOP_RELEASE_TRANS_TIME) {
								statusMap.put(cl, SignalPlanConstants.STOP_RELEASE_TRANS_STATUS);
							}
							else {
								statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
							}
						}
						else if(clearAreas.contains(ClearAreaType.CLEAR_MAIN)) {						
							
							if(tx < start+SignalPlanConstants.MAIN_CLEAR_TIME) {
								statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
							}
							else if(tx >= start+SignalPlanConstants.MAIN_CLEAR_TIME
									&& tx < start+SignalPlanConstants.MAIN_CLEAR_TIME+SignalPlanConstants.STOP_RELEASE_TRANS_TIME) {
								statusMap.put(cl, SignalPlanConstants.STOP_RELEASE_TRANS_STATUS);
							}
							else  {
								statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
							}
						}
						else if(clearAreas.contains(ClearAreaType.CLEAR_SECONDARY)) {						
							
							if(tx < start+SignalPlanConstants.SEC_CLEAR_TIME) {
								statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
							}
							else if(tx >= start+SignalPlanConstants.MAIN_CLEAR_TIME
									&& tx < start+SignalPlanConstants.MAIN_CLEAR_TIME+SignalPlanConstants.STOP_RELEASE_TRANS_TIME) {
								statusMap.put(cl, SignalPlanConstants.STOP_RELEASE_TRANS_STATUS);
							}
							else  {
								statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
							}
							
						}
						else {
							if(tx < start+SignalPlanConstants.STOP_RELEASE_TRANS_TIME) {
								statusMap.put(cl, SignalPlanConstants.STOP_RELEASE_TRANS_STATUS);
							}
							else {
								statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
							}
						}
						
					}					
					else if(clearAreas.contains(ClearAreaType.CLEAR_MAIN) ||
							clearAreas.contains(ClearAreaType.CLEAR_SECONDARY)) {						
						
						if(tx > end-SignalPlanConstants.STOP_RELEASE_TRANS_TIME) {
							statusMap.put(cl, SignalPlanConstants.STOP_RELEASE_TRANS_STATUS);
						}
						else {
							statusMap.put(cl, SignalPlanConstants.STOP_STATUS);
						}
					}
					else {
						if(tx < start+SignalPlanConstants.STOP_RELEASE_TRANS_TIME) {
							statusMap.put(cl, SignalPlanConstants.STOP_RELEASE_TRANS_STATUS);
						}
						else {
							statusMap.put(cl, SignalPlanConstants.RELEASE_STATUS);
						}
					}
				}
			}
		}		
		return statusMap;
	}


	/**
	 * @param intersection
	 * @param combPhases
	 * @return
	 */
	private int findProperPhase(Intersection intersection, List<Phase> combPhases, List<ConflictingLane> combLanes) {
		int maxPenalty = 99999;
		int penalty = 0;
		Phase propPhase = null;
		for(Phase phase : intersection.getPhase()) {
			if(combPhases.contains(phase)) {
				continue;
			}
			penalty = 0;
			for(ConflictingLane l : phase.getLane()) {
				if(combLanes.contains(l)) {
					penalty += 1;
				}
			}
			if(penalty < maxPenalty) {
				maxPenalty = penalty;
				propPhase = phase;
			}
		}
		if(propPhase != null) {
			combPhases.add(propPhase);
			combLanes.addAll(propPhase.getLane());
		}
		return maxPenalty;
	}

	
}
