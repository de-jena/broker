/*
 */
package de.dim.trafficos.intersection.model.intersection;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage
 * @generated
 */
@ProviderType
public interface TOSIntersectionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSIntersectionFactory eINSTANCE = de.dim.trafficos.intersection.model.intersection.impl.TOSIntersectionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection</em>'.
	 * @generated
	 */
	Intersection createIntersection();

	/**
	 * Returns a new object of class '<em>Road</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road</em>'.
	 * @generated
	 */
	Road createRoad();

	/**
	 * Returns a new object of class '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane</em>'.
	 * @generated
	 */
	Lane createLane();

	/**
	 * Returns a new object of class '<em>Conflicting Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflicting Lane</em>'.
	 * @generated
	 */
	ConflictingLane createConflictingLane();

	/**
	 * Returns a new object of class '<em>Incoming Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Lane</em>'.
	 * @generated
	 */
	IncomingLane createIncomingLane();

	/**
	 * Returns a new object of class '<em>Outgoing Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Lane</em>'.
	 * @generated
	 */
	OutgoingLane createOutgoingLane();

	/**
	 * Returns a new object of class '<em>Pedestrian Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedestrian Lane</em>'.
	 * @generated
	 */
	PedestrianLane createPedestrianLane();

	/**
	 * Returns a new object of class '<em>Public Transport Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Lane</em>'.
	 * @generated
	 */
	PublicTransportLane createPublicTransportLane();

	/**
	 * Returns a new object of class '<em>Cycle Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cycle Lane</em>'.
	 * @generated
	 */
	CycleLane createCycleLane();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase</em>'.
	 * @generated
	 */
	Phase createPhase();

	/**
	 * Returns a new object of class '<em>Program Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Entry</em>'.
	 * @generated
	 */
	ProgramEntry createProgramEntry();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Program Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Transition</em>'.
	 * @generated
	 */
	ProgramTransition createProgramTransition();

	/**
	 * Returns a new object of class '<em>Clear Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Area</em>'.
	 * @generated
	 */
	ClearArea createClearArea();

	/**
	 * Returns a new object of class '<em>Phase Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Group</em>'.
	 * @generated
	 */
	PhaseGroup createPhaseGroup();

	/**
	 * Returns a new object of class '<em>Time Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Table</em>'.
	 * @generated
	 */
	TimeTable createTimeTable();

	/**
	 * Returns a new object of class '<em>Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Table Entry</em>'.
	 * @generated
	 */
	TimeTableEntry createTimeTableEntry();

	/**
	 * Returns a new object of class '<em>Signal Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Table</em>'.
	 * @generated
	 */
	SignalTable createSignalTable();

	/**
	 * Returns a new object of class '<em>Cache Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Data Entry</em>'.
	 * @generated
	 */
	CacheDataEntry createCacheDataEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TOSIntersectionPackage getTOSIntersectionPackage();

} //TOSIntersectionFactory
