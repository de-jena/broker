/**
 */
package de.dim.trafficos.intersection.model.intersection.util;

import de.dim.trafficos.common.model.common.AbstractDataEntry;
import de.dim.trafficos.common.model.common.AbstractTimeTableEntry;
import de.dim.trafficos.common.model.common.DataEntry;
import de.dim.trafficos.common.model.common.IdNameElement;

import de.dim.trafficos.intersection.model.intersection.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage
 * @generated
 */
public class TOSIntersectionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TOSIntersectionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSIntersectionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TOSIntersectionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOSIntersectionSwitch<Adapter> modelSwitch =
		new TOSIntersectionSwitch<Adapter>() {
			@Override
			public Adapter caseIntersection(Intersection object) {
				return createIntersectionAdapter();
			}
			@Override
			public Adapter caseRoad(Road object) {
				return createRoadAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseConflictingLane(ConflictingLane object) {
				return createConflictingLaneAdapter();
			}
			@Override
			public Adapter caseIncomingLane(IncomingLane object) {
				return createIncomingLaneAdapter();
			}
			@Override
			public Adapter caseOutgoingLane(OutgoingLane object) {
				return createOutgoingLaneAdapter();
			}
			@Override
			public Adapter casePedestrianLane(PedestrianLane object) {
				return createPedestrianLaneAdapter();
			}
			@Override
			public Adapter casePublicTransportLane(PublicTransportLane object) {
				return createPublicTransportLaneAdapter();
			}
			@Override
			public Adapter caseCycleLane(CycleLane object) {
				return createCycleLaneAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter casePhase(Phase object) {
				return createPhaseAdapter();
			}
			@Override
			public Adapter caseProgramEntry(ProgramEntry object) {
				return createProgramEntryAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseProgramTransition(ProgramTransition object) {
				return createProgramTransitionAdapter();
			}
			@Override
			public Adapter caseClearArea(ClearArea object) {
				return createClearAreaAdapter();
			}
			@Override
			public Adapter casePhaseGroup(PhaseGroup object) {
				return createPhaseGroupAdapter();
			}
			@Override
			public Adapter caseTimeTable(TimeTable object) {
				return createTimeTableAdapter();
			}
			@Override
			public Adapter caseTimeTableEntry(TimeTableEntry object) {
				return createTimeTableEntryAdapter();
			}
			@Override
			public Adapter caseSignalTable(SignalTable object) {
				return createSignalTableAdapter();
			}
			@Override
			public Adapter caseCacheDataEntry(CacheDataEntry object) {
				return createCacheDataEntryAdapter();
			}
			@Override
			public Adapter caseIdNameElement(IdNameElement object) {
				return createIdNameElementAdapter();
			}
			@Override
			public Adapter caseAbstractTimeTableEntry(AbstractTimeTableEntry object) {
				return createAbstractTimeTableEntryAdapter();
			}
			@Override
			public Adapter caseAbstractDataEntry(AbstractDataEntry object) {
				return createAbstractDataEntryAdapter();
			}
			@Override
			public Adapter caseDataEntry(DataEntry object) {
				return createDataEntryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Intersection
	 * @generated
	 */
	public Adapter createIntersectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Road
	 * @generated
	 */
	public Adapter createRoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane <em>Conflicting Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.ConflictingLane
	 * @generated
	 */
	public Adapter createConflictingLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.IncomingLane <em>Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.IncomingLane
	 * @generated
	 */
	public Adapter createIncomingLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.OutgoingLane <em>Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.OutgoingLane
	 * @generated
	 */
	public Adapter createOutgoingLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.PedestrianLane <em>Pedestrian Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.PedestrianLane
	 * @generated
	 */
	public Adapter createPedestrianLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.PublicTransportLane <em>Public Transport Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.PublicTransportLane
	 * @generated
	 */
	public Adapter createPublicTransportLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.CycleLane <em>Cycle Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.CycleLane
	 * @generated
	 */
	public Adapter createCycleLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry <em>Program Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramEntry
	 * @generated
	 */
	public Adapter createProgramEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.ProgramTransition <em>Program Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.ProgramTransition
	 * @generated
	 */
	public Adapter createProgramTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.ClearArea <em>Clear Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.ClearArea
	 * @generated
	 */
	public Adapter createClearAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.PhaseGroup <em>Phase Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.PhaseGroup
	 * @generated
	 */
	public Adapter createPhaseGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.TimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTable
	 * @generated
	 */
	public Adapter createTimeTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.TimeTableEntry <em>Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableEntry
	 * @generated
	 */
	public Adapter createTimeTableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.SignalTable <em>Signal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.SignalTable
	 * @generated
	 */
	public Adapter createSignalTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.intersection.model.intersection.CacheDataEntry <em>Cache Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.intersection.model.intersection.CacheDataEntry
	 * @generated
	 */
	public Adapter createCacheDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.IdNameElement <em>Id Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.IdNameElement
	 * @generated
	 */
	public Adapter createIdNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry <em>Abstract Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.AbstractTimeTableEntry
	 * @generated
	 */
	public Adapter createAbstractTimeTableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.AbstractDataEntry <em>Abstract Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.AbstractDataEntry
	 * @generated
	 */
	public Adapter createAbstractDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.DataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.DataEntry
	 * @generated
	 */
	public Adapter createDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TOSIntersectionAdapterFactory
