/**
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.common.model.common.TOSCommonPackage;

import de.dim.trafficos.intersection.model.intersection.CacheDataEntry;
import de.dim.trafficos.intersection.model.intersection.ClearArea;
import de.dim.trafficos.intersection.model.intersection.ClearAreaType;
import de.dim.trafficos.intersection.model.intersection.ConflictingLane;
import de.dim.trafficos.intersection.model.intersection.CycleLane;
import de.dim.trafficos.intersection.model.intersection.IncomingLane;
import de.dim.trafficos.intersection.model.intersection.Intersection;
import de.dim.trafficos.intersection.model.intersection.IntersectionStateType;
import de.dim.trafficos.intersection.model.intersection.Lane;
import de.dim.trafficos.intersection.model.intersection.Link;
import de.dim.trafficos.intersection.model.intersection.OutgoingLane;
import de.dim.trafficos.intersection.model.intersection.PedestrianLane;
import de.dim.trafficos.intersection.model.intersection.Phase;
import de.dim.trafficos.intersection.model.intersection.PhaseGroup;
import de.dim.trafficos.intersection.model.intersection.Program;
import de.dim.trafficos.intersection.model.intersection.ProgramEntry;
import de.dim.trafficos.intersection.model.intersection.ProgramTransition;
import de.dim.trafficos.intersection.model.intersection.PublicTransportLane;
import de.dim.trafficos.intersection.model.intersection.Road;
import de.dim.trafficos.intersection.model.intersection.RoadType;
import de.dim.trafficos.intersection.model.intersection.SignalTable;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionFactory;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;
import de.dim.trafficos.intersection.model.intersection.TimeTable;
import de.dim.trafficos.intersection.model.intersection.TimeTableEntry;
import de.dim.trafficos.intersection.model.intersection.TimeTableModeType;
import de.dim.trafficos.intersection.model.intersection.Transition;

import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TOSIntersectionPackageImpl extends EPackageImpl implements TOSIntersectionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictingLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedestrianLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cycleLaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheDataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeTableModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intersectionStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clearAreaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roadTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TOSIntersectionPackageImpl() {
		super(eNS_URI, TOSIntersectionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TOSIntersectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TOSIntersectionPackage init() {
		if (isInited) return (TOSIntersectionPackage)EPackage.Registry.INSTANCE.getEPackage(TOSIntersectionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTOSIntersectionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TOSIntersectionPackageImpl theTOSIntersectionPackage = registeredTOSIntersectionPackage instanceof TOSIntersectionPackageImpl ? (TOSIntersectionPackageImpl)registeredTOSIntersectionPackage : new TOSIntersectionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TOSCommonPackage.eINSTANCE.eClass();
		TOSTrafficLightPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTOSIntersectionPackage.createPackageContents();

		// Initialize created meta-data
		theTOSIntersectionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTOSIntersectionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TOSIntersectionPackage.eNS_URI, theTOSIntersectionPackage);
		return theTOSIntersectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntersection() {
		return intersectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_Id() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Road() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Link() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Phase() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_PhaseGroup() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_TimeTable() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Output() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Program() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Parameter() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_State() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_Name() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_Description() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoad() {
		return roadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoad_Id() {
		return (EAttribute)roadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoad_MainRoad() {
		return (EAttribute)roadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoad_Type() {
		return (EAttribute)roadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_IncomingLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_OutgoingLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_PedestrianLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_CycleLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_PublicTransportLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_TrafficLightModule() {
		return (EReference)roadEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_Id() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_RefRoadId() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_Link() {
		return (EReference)laneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_Road() {
		return (EReference)laneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_SubLane() {
		return (EReference)laneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_ParentLane() {
		return (EReference)laneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_Index() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_Direction() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_Detector() {
		return (EReference)laneEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConflictingLane() {
		return conflictingLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConflictingLane_ConflictingLane() {
		return (EReference)conflictingLaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConflictingLane_ConflictingLink() {
		return (EReference)conflictingLaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConflictingLane_SignalGroup() {
		return (EReference)conflictingLaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConflictingLane_SignalGroups() {
		return (EReference)conflictingLaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncomingLane() {
		return incomingLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutgoingLane() {
		return outgoingLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPedestrianLane() {
		return pedestrianLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportLane() {
		return publicTransportLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCycleLane() {
		return cycleLaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Index() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_RefIncomingLane() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_RefOutgoingLane() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhase_Id() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhase_Lane() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhase_Transition() {
		return (EReference)phaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhase_WeightMin() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhase_WeightMax() {
		return (EAttribute)phaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramEntry() {
		return programEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramEntry_Begin() {
		return (EAttribute)programEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramEntry_End() {
		return (EAttribute)programEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramEntry_Duration() {
		return (EAttribute)programEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramEntry_RefPhase() {
		return (EReference)programEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgram_Length() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_OutputEntry() {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_SignalTable() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_RefNextPhase() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Id() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_UnchangedLane() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_ChangedLane() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_ClearArea() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramTransition() {
		return programTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramTransition_Transition() {
		return (EReference)programTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearArea() {
		return clearAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearArea_Type() {
		return (EAttribute)clearAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhaseGroup() {
		return phaseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhaseGroup_Id() {
		return (EAttribute)phaseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhaseGroup_Penalty() {
		return (EAttribute)phaseGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhaseGroup_Phase() {
		return (EReference)phaseGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeTable() {
		return timeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeTable_Entry() {
		return (EReference)timeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeTable_DefaultMode() {
		return (EAttribute)timeTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeTableEntry() {
		return timeTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeTableEntry_Program() {
		return (EReference)timeTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalTable() {
		return signalTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignalTable_CacheDataEntry() {
		return (EReference)signalTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCacheDataEntry() {
		return cacheDataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeTableModeType() {
		return timeTableModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIntersectionStateType() {
		return intersectionStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClearAreaType() {
		return clearAreaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRoadType() {
		return roadTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSIntersectionFactory getTOSIntersectionFactory() {
		return (TOSIntersectionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intersectionEClass = createEClass(INTERSECTION);
		createEAttribute(intersectionEClass, INTERSECTION__ID);
		createEReference(intersectionEClass, INTERSECTION__ROAD);
		createEReference(intersectionEClass, INTERSECTION__LINK);
		createEReference(intersectionEClass, INTERSECTION__PHASE);
		createEReference(intersectionEClass, INTERSECTION__PHASE_GROUP);
		createEReference(intersectionEClass, INTERSECTION__TIME_TABLE);
		createEReference(intersectionEClass, INTERSECTION__OUTPUT);
		createEReference(intersectionEClass, INTERSECTION__PROGRAM);
		createEReference(intersectionEClass, INTERSECTION__PARAMETER);
		createEAttribute(intersectionEClass, INTERSECTION__STATE);
		createEAttribute(intersectionEClass, INTERSECTION__NAME);
		createEAttribute(intersectionEClass, INTERSECTION__DESCRIPTION);

		roadEClass = createEClass(ROAD);
		createEAttribute(roadEClass, ROAD__ID);
		createEAttribute(roadEClass, ROAD__MAIN_ROAD);
		createEAttribute(roadEClass, ROAD__TYPE);
		createEReference(roadEClass, ROAD__INCOMING_LANE);
		createEReference(roadEClass, ROAD__OUTGOING_LANE);
		createEReference(roadEClass, ROAD__PEDESTRIAN_LANE);
		createEReference(roadEClass, ROAD__CYCLE_LANE);
		createEReference(roadEClass, ROAD__PUBLIC_TRANSPORT_LANE);
		createEReference(roadEClass, ROAD__TRAFFIC_LIGHT_MODULE);

		laneEClass = createEClass(LANE);
		createEAttribute(laneEClass, LANE__ID);
		createEAttribute(laneEClass, LANE__REF_ROAD_ID);
		createEReference(laneEClass, LANE__LINK);
		createEReference(laneEClass, LANE__ROAD);
		createEReference(laneEClass, LANE__SUB_LANE);
		createEReference(laneEClass, LANE__PARENT_LANE);
		createEAttribute(laneEClass, LANE__INDEX);
		createEAttribute(laneEClass, LANE__DIRECTION);
		createEReference(laneEClass, LANE__DETECTOR);

		conflictingLaneEClass = createEClass(CONFLICTING_LANE);
		createEReference(conflictingLaneEClass, CONFLICTING_LANE__CONFLICTING_LANE);
		createEReference(conflictingLaneEClass, CONFLICTING_LANE__CONFLICTING_LINK);
		createEReference(conflictingLaneEClass, CONFLICTING_LANE__SIGNAL_GROUP);
		createEReference(conflictingLaneEClass, CONFLICTING_LANE__SIGNAL_GROUPS);

		incomingLaneEClass = createEClass(INCOMING_LANE);

		outgoingLaneEClass = createEClass(OUTGOING_LANE);

		pedestrianLaneEClass = createEClass(PEDESTRIAN_LANE);

		publicTransportLaneEClass = createEClass(PUBLIC_TRANSPORT_LANE);

		cycleLaneEClass = createEClass(CYCLE_LANE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__INDEX);
		createEReference(linkEClass, LINK__REF_INCOMING_LANE);
		createEReference(linkEClass, LINK__REF_OUTGOING_LANE);

		phaseEClass = createEClass(PHASE);
		createEAttribute(phaseEClass, PHASE__ID);
		createEReference(phaseEClass, PHASE__LANE);
		createEReference(phaseEClass, PHASE__TRANSITION);
		createEAttribute(phaseEClass, PHASE__WEIGHT_MIN);
		createEAttribute(phaseEClass, PHASE__WEIGHT_MAX);

		programEntryEClass = createEClass(PROGRAM_ENTRY);
		createEAttribute(programEntryEClass, PROGRAM_ENTRY__BEGIN);
		createEAttribute(programEntryEClass, PROGRAM_ENTRY__END);
		createEAttribute(programEntryEClass, PROGRAM_ENTRY__DURATION);
		createEReference(programEntryEClass, PROGRAM_ENTRY__REF_PHASE);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__LENGTH);
		createEReference(programEClass, PROGRAM__OUTPUT_ENTRY);
		createEReference(programEClass, PROGRAM__SIGNAL_TABLE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__REF_NEXT_PHASE);
		createEAttribute(transitionEClass, TRANSITION__ID);
		createEReference(transitionEClass, TRANSITION__UNCHANGED_LANE);
		createEReference(transitionEClass, TRANSITION__CHANGED_LANE);
		createEReference(transitionEClass, TRANSITION__CLEAR_AREA);

		programTransitionEClass = createEClass(PROGRAM_TRANSITION);
		createEReference(programTransitionEClass, PROGRAM_TRANSITION__TRANSITION);

		clearAreaEClass = createEClass(CLEAR_AREA);
		createEAttribute(clearAreaEClass, CLEAR_AREA__TYPE);

		phaseGroupEClass = createEClass(PHASE_GROUP);
		createEAttribute(phaseGroupEClass, PHASE_GROUP__ID);
		createEAttribute(phaseGroupEClass, PHASE_GROUP__PENALTY);
		createEReference(phaseGroupEClass, PHASE_GROUP__PHASE);

		timeTableEClass = createEClass(TIME_TABLE);
		createEReference(timeTableEClass, TIME_TABLE__ENTRY);
		createEAttribute(timeTableEClass, TIME_TABLE__DEFAULT_MODE);

		timeTableEntryEClass = createEClass(TIME_TABLE_ENTRY);
		createEReference(timeTableEntryEClass, TIME_TABLE_ENTRY__PROGRAM);

		signalTableEClass = createEClass(SIGNAL_TABLE);
		createEReference(signalTableEClass, SIGNAL_TABLE__CACHE_DATA_ENTRY);

		cacheDataEntryEClass = createEClass(CACHE_DATA_ENTRY);

		// Create enums
		timeTableModeTypeEEnum = createEEnum(TIME_TABLE_MODE_TYPE);
		intersectionStateTypeEEnum = createEEnum(INTERSECTION_STATE_TYPE);
		clearAreaTypeEEnum = createEEnum(CLEAR_AREA_TYPE);
		roadTypeEEnum = createEEnum(ROAD_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TOSCommonPackage theTOSCommonPackage = (TOSCommonPackage)EPackage.Registry.INSTANCE.getEPackage(TOSCommonPackage.eNS_URI);
		TOSTrafficLightPackage theTOSTrafficLightPackage = (TOSTrafficLightPackage)EPackage.Registry.INSTANCE.getEPackage(TOSTrafficLightPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conflictingLaneEClass.getESuperTypes().add(this.getLane());
		incomingLaneEClass.getESuperTypes().add(this.getConflictingLane());
		outgoingLaneEClass.getESuperTypes().add(this.getLane());
		pedestrianLaneEClass.getESuperTypes().add(this.getConflictingLane());
		publicTransportLaneEClass.getESuperTypes().add(this.getConflictingLane());
		cycleLaneEClass.getESuperTypes().add(this.getConflictingLane());
		programEClass.getESuperTypes().add(theTOSCommonPackage.getIdNameElement());
		programTransitionEClass.getESuperTypes().add(this.getProgramEntry());
		timeTableEClass.getESuperTypes().add(theTOSCommonPackage.getIdNameElement());
		timeTableEntryEClass.getESuperTypes().add(theTOSCommonPackage.getAbstractTimeTableEntry());
		cacheDataEntryEClass.getESuperTypes().add(theTOSCommonPackage.getDataEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(intersectionEClass, Intersection.class, "Intersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntersection_Id(), ecorePackage.getEString(), "id", null, 1, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_Road(), this.getRoad(), null, "road", null, 1, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntersection_Road().getEKeys().add(this.getRoad_Id());
		initEReference(getIntersection_Link(), this.getLink(), null, "link", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntersection_Link().getEKeys().add(this.getLink_Index());
		initEReference(getIntersection_Phase(), this.getPhase(), null, "phase", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_PhaseGroup(), this.getPhaseGroup(), null, "phaseGroup", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_TimeTable(), this.getTimeTable(), null, "timeTable", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_Output(), theTOSCommonPackage.getOutput(), null, "output", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_Program(), this.getProgram(), null, "program", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_Parameter(), theTOSCommonPackage.getParameter(), null, "parameter", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersection_State(), this.getIntersectionStateType(), "state", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersection_Description(), ecorePackage.getEString(), "description", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roadEClass, Road.class, "Road", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoad_Id(), ecorePackage.getEString(), "id", null, 1, 1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoad_MainRoad(), ecorePackage.getEBoolean(), "mainRoad", null, 1, 1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoad_Type(), this.getRoadType(), "type", null, 0, 1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoad_IncomingLane(), this.getIncomingLane(), null, "incomingLane", null, 0, -1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoad_IncomingLane().getEKeys().add(this.getLane_Id());
		initEReference(getRoad_OutgoingLane(), this.getOutgoingLane(), null, "outgoingLane", null, 0, -1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoad_OutgoingLane().getEKeys().add(this.getLane_Id());
		initEReference(getRoad_PedestrianLane(), this.getPedestrianLane(), null, "pedestrianLane", null, 0, -1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoad_PedestrianLane().getEKeys().add(this.getLane_Id());
		initEReference(getRoad_CycleLane(), this.getCycleLane(), null, "cycleLane", null, 0, -1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoad_CycleLane().getEKeys().add(this.getLane_Id());
		initEReference(getRoad_PublicTransportLane(), this.getPublicTransportLane(), null, "publicTransportLane", null, 0, -1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoad_PublicTransportLane().getEKeys().add(this.getLane_Id());
		initEReference(getRoad_TrafficLightModule(), theTOSTrafficLightPackage.getTLModule(), null, "trafficLightModule", null, 0, -1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLane_Id(), ecorePackage.getEString(), "id", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_RefRoadId(), ecorePackage.getEString(), "refRoadId", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Link(), this.getLink(), null, "link", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLane_Link().getEKeys().add(this.getLink_Index());
		initEReference(getLane_Road(), this.getRoad(), null, "road", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLane_Road().getEKeys().add(this.getRoad_Id());
		initEReference(getLane_SubLane(), this.getLane(), this.getLane_ParentLane(), "subLane", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLane_SubLane().getEKeys().add(this.getLane_Id());
		initEReference(getLane_ParentLane(), this.getLane(), this.getLane_SubLane(), "parentLane", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLane_ParentLane().getEKeys().add(this.getLane_Id());
		initEAttribute(getLane_Index(), ecorePackage.getEInt(), "index", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_Direction(), theTOSCommonPackage.getDirectionType(), "direction", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Detector(), theTOSCommonPackage.getOutput(), null, "detector", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictingLaneEClass, ConflictingLane.class, "ConflictingLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflictingLane_ConflictingLane(), this.getConflictingLane(), null, "conflictingLane", null, 0, -1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConflictingLane_ConflictingLane().getEKeys().add(this.getLane_Id());
		initEReference(getConflictingLane_ConflictingLink(), this.getLink(), null, "conflictingLink", null, 0, -1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConflictingLane_ConflictingLink().getEKeys().add(this.getLink_Index());
		initEReference(getConflictingLane_SignalGroup(), theTOSCommonPackage.getOutput(), null, "signalGroup", null, 0, 1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictingLane_SignalGroups(), theTOSCommonPackage.getOutput(), null, "signalGroups", null, 0, -1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomingLaneEClass, IncomingLane.class, "IncomingLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outgoingLaneEClass, OutgoingLane.class, "OutgoingLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pedestrianLaneEClass, PedestrianLane.class, "PedestrianLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicTransportLaneEClass, PublicTransportLane.class, "PublicTransportLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cycleLaneEClass, CycleLane.class, "CycleLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Index(), ecorePackage.getEString(), "index", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_RefIncomingLane(), this.getLane(), null, "refIncomingLane", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_RefOutgoingLane(), this.getOutgoingLane(), null, "refOutgoingLane", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhase_Id(), ecorePackage.getEString(), "id", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Lane(), this.getConflictingLane(), null, "lane", null, 1, -1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_Transition(), this.getTransition(), null, "transition", null, 0, -1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_WeightMin(), ecorePackage.getEInt(), "weightMin", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_WeightMax(), ecorePackage.getEInt(), "weightMax", null, 1, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEntryEClass, ProgramEntry.class, "ProgramEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramEntry_Begin(), ecorePackage.getEInt(), "begin", null, 1, 1, ProgramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramEntry_End(), ecorePackage.getEInt(), "end", null, 1, 1, ProgramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramEntry_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, ProgramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramEntry_RefPhase(), this.getPhase(), null, "refPhase", null, 1, 1, ProgramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Length(), ecorePackage.getEInt(), "length", null, 1, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_OutputEntry(), this.getProgramEntry(), null, "outputEntry", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_SignalTable(), this.getSignalTable(), null, "signalTable", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_RefNextPhase(), this.getPhase(), null, "refNextPhase", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Id(), ecorePackage.getEString(), "id", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_UnchangedLane(), this.getConflictingLane(), null, "unchangedLane", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ChangedLane(), this.getConflictingLane(), null, "changedLane", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ClearArea(), this.getClearArea(), null, "clearArea", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programTransitionEClass, ProgramTransition.class, "ProgramTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramTransition_Transition(), this.getTransition(), null, "transition", null, 1, 1, ProgramTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearAreaEClass, ClearArea.class, "ClearArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClearArea_Type(), this.getClearAreaType(), "type", null, 0, 1, ClearArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseGroupEClass, PhaseGroup.class, "PhaseGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhaseGroup_Id(), ecorePackage.getEString(), "id", null, 1, 1, PhaseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseGroup_Penalty(), ecorePackage.getEInt(), "penalty", null, 1, 1, PhaseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhaseGroup_Phase(), this.getPhase(), null, "phase", null, 1, -1, PhaseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTableEClass, TimeTable.class, "TimeTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeTable_Entry(), this.getTimeTableEntry(), null, "entry", null, 0, -1, TimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTable_DefaultMode(), this.getTimeTableModeType(), "defaultMode", null, 0, 1, TimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTableEntryEClass, TimeTableEntry.class, "TimeTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeTableEntry_Program(), this.getProgram(), null, "program", null, 1, 1, TimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalTableEClass, SignalTable.class, "SignalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalTable_CacheDataEntry(), this.getCacheDataEntry(), null, "cacheDataEntry", null, 0, -1, SignalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheDataEntryEClass, CacheDataEntry.class, "CacheDataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timeTableModeTypeEEnum, TimeTableModeType.class, "TimeTableModeType");
		addEEnumLiteral(timeTableModeTypeEEnum, TimeTableModeType.OFF);

		initEEnum(intersectionStateTypeEEnum, IntersectionStateType.class, "IntersectionStateType");
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.UNKNOWN);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.NONE);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.ENABLED);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_DARK);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_FLASH_SECONDARY);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_FLASH_ALL);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_DEFAULT);

		initEEnum(clearAreaTypeEEnum, ClearAreaType.class, "ClearAreaType");
		addEEnumLiteral(clearAreaTypeEEnum, ClearAreaType.CLEAR_PEDESTRIAN);
		addEEnumLiteral(clearAreaTypeEEnum, ClearAreaType.CLEAR_MAIN);
		addEEnumLiteral(clearAreaTypeEEnum, ClearAreaType.CLEAR_SECONDARY);

		initEEnum(roadTypeEEnum, RoadType.class, "RoadType");
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT_RIGHT_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT_RIGHT_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT_LEFT_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT_LEFT_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_LEFT_RIGHT_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_LEFT_RIGHT_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT_TURNS_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.MAIN_STRAIGHT_TURNS_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_STRAIGHT_RIGHT_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_STRAIGHT_RIGHT_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_STRAIGHT_LEFT_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_STRAIGHT_LEFT_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_LEFT_RIGHT_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_LEFT_RIGHT_MERGE);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_STRAIGHT_TURNS_SEP);
		addEEnumLiteral(roadTypeEEnum, RoadType.SEC_STRAIGHT_TURNS_MERGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getPhase_Lane(),
		   source,
		   new String[] {
			   "documentation", "These are all the lanes which have the green at the same time, namely non-conflicting with each other."
		   });
		addAnnotation
		  (getPhaseGroup_Penalty(),
		   source,
		   new String[] {
			   "documentation", "This is a value which takes into account how many times the same lane is present in more than a Phase of the group. A penalty term of 0 means no lane is repeated more than once, a penalty term of 1 means a lane is present in two phases of the group, a penalty term of 2 means a lane is present in three phases or two lanes are present in two phases, etc."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Main road. There is just one lane and it is for going straight. No other direction is possible."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go both straight and turn right, and there are separated lanes for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go both straight and turn right, and there is just one common lane for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go both straight and turn left, and there are separated lanes for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go both straight and turn left, and there is just one common lane for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Main road. You can turn either right or left and there are two separated lanes for the two directions. You cannot go straight."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Main road. You can turn either right or left and there is just a common lane for the two directions. You cannot go straight."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go straight and turn either right or left and there are threee separated lanes for the three directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go straight or turn either right or left and there is just a common lane for the three directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Main road. You can go both straight and turn right, and there are separated lanes for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can go both straight and turn right, and there is just one common lane for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can go both straight and turn left, and there are separated lanes for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can go both straight and turn left, and there is just one common lane for the two directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can turn either right or left and there are two separated lanes for the two directions. You cannot go straight."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can turn either right or left and there is just a common lane for the two directions. You cannot go straight."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(15),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can go straight and turn either right or left and there are threee separated lanes for the three directions."
		   });
		addAnnotation
		  (roadTypeEEnum.getELiterals().get(16),
		   source,
		   new String[] {
			   "documentation", "Secondary road. You can go straight or turn either right or left and there is just a common lane for the three directions."
		   });
	}

} //TOSIntersectionPackageImpl
