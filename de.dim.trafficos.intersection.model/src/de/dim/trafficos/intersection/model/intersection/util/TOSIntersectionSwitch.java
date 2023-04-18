/**
 */
package de.dim.trafficos.intersection.model.intersection.util;

import de.dim.trafficos.common.model.common.AbstractDataEntry;
import de.dim.trafficos.common.model.common.AbstractTimeTableEntry;
import de.dim.trafficos.common.model.common.DataEntry;
import de.dim.trafficos.common.model.common.IdNameElement;

import de.dim.trafficos.intersection.model.intersection.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage
 * @generated
 */
public class TOSIntersectionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TOSIntersectionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSIntersectionSwitch() {
		if (modelPackage == null) {
			modelPackage = TOSIntersectionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TOSIntersectionPackage.INTERSECTION: {
				Intersection intersection = (Intersection)theEObject;
				T result = caseIntersection(intersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.ROAD: {
				Road road = (Road)theEObject;
				T result = caseRoad(road);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.LANE: {
				Lane lane = (Lane)theEObject;
				T result = caseLane(lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.CONFLICTING_LANE: {
				ConflictingLane conflictingLane = (ConflictingLane)theEObject;
				T result = caseConflictingLane(conflictingLane);
				if (result == null) result = caseLane(conflictingLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.INCOMING_LANE: {
				IncomingLane incomingLane = (IncomingLane)theEObject;
				T result = caseIncomingLane(incomingLane);
				if (result == null) result = caseConflictingLane(incomingLane);
				if (result == null) result = caseLane(incomingLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.OUTGOING_LANE: {
				OutgoingLane outgoingLane = (OutgoingLane)theEObject;
				T result = caseOutgoingLane(outgoingLane);
				if (result == null) result = caseLane(outgoingLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PEDESTRIAN_LANE: {
				PedestrianLane pedestrianLane = (PedestrianLane)theEObject;
				T result = casePedestrianLane(pedestrianLane);
				if (result == null) result = caseConflictingLane(pedestrianLane);
				if (result == null) result = caseLane(pedestrianLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PUBLIC_TRANSPORT_LANE: {
				PublicTransportLane publicTransportLane = (PublicTransportLane)theEObject;
				T result = casePublicTransportLane(publicTransportLane);
				if (result == null) result = caseConflictingLane(publicTransportLane);
				if (result == null) result = caseLane(publicTransportLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.CYCLE_LANE: {
				CycleLane cycleLane = (CycleLane)theEObject;
				T result = caseCycleLane(cycleLane);
				if (result == null) result = caseConflictingLane(cycleLane);
				if (result == null) result = caseLane(cycleLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PHASE: {
				Phase phase = (Phase)theEObject;
				T result = casePhase(phase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PROGRAM_ENTRY: {
				ProgramEntry programEntry = (ProgramEntry)theEObject;
				T result = caseProgramEntry(programEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PROGRAM: {
				Program program = (Program)theEObject;
				T result = caseProgram(program);
				if (result == null) result = caseIdNameElement(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PROGRAM_TRANSITION: {
				ProgramTransition programTransition = (ProgramTransition)theEObject;
				T result = caseProgramTransition(programTransition);
				if (result == null) result = caseProgramEntry(programTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.CLEAR_AREA: {
				ClearArea clearArea = (ClearArea)theEObject;
				T result = caseClearArea(clearArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.PHASE_GROUP: {
				PhaseGroup phaseGroup = (PhaseGroup)theEObject;
				T result = casePhaseGroup(phaseGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.TIME_TABLE: {
				TimeTable timeTable = (TimeTable)theEObject;
				T result = caseTimeTable(timeTable);
				if (result == null) result = caseIdNameElement(timeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.TIME_TABLE_ENTRY: {
				TimeTableEntry timeTableEntry = (TimeTableEntry)theEObject;
				T result = caseTimeTableEntry(timeTableEntry);
				if (result == null) result = caseAbstractTimeTableEntry(timeTableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.SIGNAL_TABLE: {
				SignalTable signalTable = (SignalTable)theEObject;
				T result = caseSignalTable(signalTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSIntersectionPackage.CACHE_DATA_ENTRY: {
				CacheDataEntry cacheDataEntry = (CacheDataEntry)theEObject;
				T result = caseCacheDataEntry(cacheDataEntry);
				if (result == null) result = caseDataEntry(cacheDataEntry);
				if (result == null) result = caseAbstractDataEntry(cacheDataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersection(Intersection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Road</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Road</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoad(Road object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflicting Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflicting Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflictingLane(ConflictingLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingLane(IncomingLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingLane(OutgoingLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pedestrian Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pedestrian Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePedestrianLane(PedestrianLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportLane(PublicTransportLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cycle Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cycle Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCycleLane(CycleLane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhase(Phase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramEntry(ProgramEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramTransition(ProgramTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearArea(ClearArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseGroup(PhaseGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTable(TimeTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Table Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTableEntry(TimeTableEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalTable(SignalTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Data Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheDataEntry(CacheDataEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Name Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdNameElement(IdNameElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Table Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimeTableEntry(AbstractTimeTableEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Data Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDataEntry(AbstractDataEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEntry(DataEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TOSIntersectionSwitch
