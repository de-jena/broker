/**
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TOSIntersectionFactoryImpl extends EFactoryImpl implements TOSIntersectionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TOSIntersectionFactory init() {
		try {
			TOSIntersectionFactory theTOSIntersectionFactory = (TOSIntersectionFactory)EPackage.Registry.INSTANCE.getEFactory(TOSIntersectionPackage.eNS_URI);
			if (theTOSIntersectionFactory != null) {
				return theTOSIntersectionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TOSIntersectionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSIntersectionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TOSIntersectionPackage.INTERSECTION: return createIntersection();
			case TOSIntersectionPackage.ROAD: return createRoad();
			case TOSIntersectionPackage.LANE: return createLane();
			case TOSIntersectionPackage.CONFLICTING_LANE: return createConflictingLane();
			case TOSIntersectionPackage.INCOMING_LANE: return createIncomingLane();
			case TOSIntersectionPackage.OUTGOING_LANE: return createOutgoingLane();
			case TOSIntersectionPackage.PEDESTRIAN_LANE: return createPedestrianLane();
			case TOSIntersectionPackage.PUBLIC_TRANSPORT_LANE: return createPublicTransportLane();
			case TOSIntersectionPackage.CYCLE_LANE: return createCycleLane();
			case TOSIntersectionPackage.LINK: return createLink();
			case TOSIntersectionPackage.PHASE: return createPhase();
			case TOSIntersectionPackage.PROGRAM_ENTRY: return createProgramEntry();
			case TOSIntersectionPackage.PROGRAM: return createProgram();
			case TOSIntersectionPackage.TRANSITION: return createTransition();
			case TOSIntersectionPackage.PROGRAM_TRANSITION: return createProgramTransition();
			case TOSIntersectionPackage.CLEAR_AREA: return createClearArea();
			case TOSIntersectionPackage.PHASE_GROUP: return createPhaseGroup();
			case TOSIntersectionPackage.TIME_TABLE: return createTimeTable();
			case TOSIntersectionPackage.TIME_TABLE_ENTRY: return createTimeTableEntry();
			case TOSIntersectionPackage.SIGNAL_TABLE: return createSignalTable();
			case TOSIntersectionPackage.CACHE_DATA_ENTRY: return createCacheDataEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TOSIntersectionPackage.TIME_TABLE_MODE_TYPE:
				return createTimeTableModeTypeFromString(eDataType, initialValue);
			case TOSIntersectionPackage.INTERSECTION_STATE_TYPE:
				return createIntersectionStateTypeFromString(eDataType, initialValue);
			case TOSIntersectionPackage.CLEAR_AREA_TYPE:
				return createClearAreaTypeFromString(eDataType, initialValue);
			case TOSIntersectionPackage.ROAD_TYPE:
				return createRoadTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TOSIntersectionPackage.TIME_TABLE_MODE_TYPE:
				return convertTimeTableModeTypeToString(eDataType, instanceValue);
			case TOSIntersectionPackage.INTERSECTION_STATE_TYPE:
				return convertIntersectionStateTypeToString(eDataType, instanceValue);
			case TOSIntersectionPackage.CLEAR_AREA_TYPE:
				return convertClearAreaTypeToString(eDataType, instanceValue);
			case TOSIntersectionPackage.ROAD_TYPE:
				return convertRoadTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intersection createIntersection() {
		IntersectionImpl intersection = new IntersectionImpl();
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Road createRoad() {
		RoadImpl road = new RoadImpl();
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConflictingLane createConflictingLane() {
		ConflictingLaneImpl conflictingLane = new ConflictingLaneImpl();
		return conflictingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncomingLane createIncomingLane() {
		IncomingLaneImpl incomingLane = new IncomingLaneImpl();
		return incomingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutgoingLane createOutgoingLane() {
		OutgoingLaneImpl outgoingLane = new OutgoingLaneImpl();
		return outgoingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PedestrianLane createPedestrianLane() {
		PedestrianLaneImpl pedestrianLane = new PedestrianLaneImpl();
		return pedestrianLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportLane createPublicTransportLane() {
		PublicTransportLaneImpl publicTransportLane = new PublicTransportLaneImpl();
		return publicTransportLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CycleLane createCycleLane() {
		CycleLaneImpl cycleLane = new CycleLaneImpl();
		return cycleLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramEntry createProgramEntry() {
		ProgramEntryImpl programEntry = new ProgramEntryImpl();
		return programEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramTransition createProgramTransition() {
		ProgramTransitionImpl programTransition = new ProgramTransitionImpl();
		return programTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearArea createClearArea() {
		ClearAreaImpl clearArea = new ClearAreaImpl();
		return clearArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhaseGroup createPhaseGroup() {
		PhaseGroupImpl phaseGroup = new PhaseGroupImpl();
		return phaseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTable createTimeTable() {
		TimeTableImpl timeTable = new TimeTableImpl();
		return timeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTableEntry createTimeTableEntry() {
		TimeTableEntryImpl timeTableEntry = new TimeTableEntryImpl();
		return timeTableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalTable createSignalTable() {
		SignalTableImpl signalTable = new SignalTableImpl();
		return signalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataEntry createCacheDataEntry() {
		CacheDataEntryImpl cacheDataEntry = new CacheDataEntryImpl();
		return cacheDataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTableModeType createTimeTableModeTypeFromString(EDataType eDataType, String initialValue) {
		TimeTableModeType result = TimeTableModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTableModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectionStateType createIntersectionStateTypeFromString(EDataType eDataType, String initialValue) {
		IntersectionStateType result = IntersectionStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntersectionStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAreaType createClearAreaTypeFromString(EDataType eDataType, String initialValue) {
		ClearAreaType result = ClearAreaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClearAreaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadType createRoadTypeFromString(EDataType eDataType, String initialValue) {
		RoadType result = RoadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSIntersectionPackage getTOSIntersectionPackage() {
		return (TOSIntersectionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TOSIntersectionPackage getPackage() {
		return TOSIntersectionPackage.eINSTANCE;
	}

} //TOSIntersectionFactoryImpl
