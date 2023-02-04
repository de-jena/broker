/**
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.dim.trafficos.model.device.util;

import de.dim.trafficos.model.device.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage
 * @generated
 */
public class TOSDeviceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TOSDevicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSDeviceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TOSDevicePackage.eINSTANCE;
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
	protected TOSDeviceSwitch<Adapter> modelSwitch =
		new TOSDeviceSwitch<Adapter>() {
			@Override
			public Adapter caseDeviceGroup(DeviceGroup object) {
				return createDeviceGroupAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseSystemInfo(SystemInfo object) {
				return createSystemInfoAdapter();
			}
			@Override
			public Adapter caseDeviceInfo(DeviceInfo object) {
				return createDeviceInfoAdapter();
			}
			@Override
			public Adapter caseDeviceConfiguration(DeviceConfiguration object) {
				return createDeviceConfigurationAdapter();
			}
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
			public Adapter caseIdNameElement(IdNameElement object) {
				return createIdNameElementAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseLocalizable(Localizable object) {
				return createLocalizableAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseNetworkLocation(NetworkLocation object) {
				return createNetworkLocationAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseAddressLocation(AddressLocation object) {
				return createAddressLocationAdapter();
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
			public Adapter caseDataEntry(DataEntry object) {
				return createDataEntryAdapter();
			}
			@Override
			public Adapter caseDataValue(DataValue object) {
				return createDataValueAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseCacheDataEntry(CacheDataEntry object) {
				return createCacheDataEntryAdapter();
			}
			@Override
			public Adapter caseSignalTable(SignalTable object) {
				return createSignalTableAdapter();
			}
			@Override
			public Adapter caseHardwareConfiguration(HardwareConfiguration object) {
				return createHardwareConfigurationAdapter();
			}
			@Override
			public Adapter caseOutputConfiguration(OutputConfiguration object) {
				return createOutputConfigurationAdapter();
			}
			@Override
			public Adapter caseOutPinConfiguration(OutPinConfiguration object) {
				return createOutPinConfigurationAdapter();
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
			public Adapter caseAbstractDataEntry(AbstractDataEntry object) {
				return createAbstractDataEntryAdapter();
			}
			@Override
			public Adapter casePublicTransportStation(PublicTransportStation object) {
				return createPublicTransportStationAdapter();
			}
			@Override
			public Adapter casePublicTransportTimeTable(PublicTransportTimeTable object) {
				return createPublicTransportTimeTableAdapter();
			}
			@Override
			public Adapter caseAbstractTimeTableEntry(AbstractTimeTableEntry object) {
				return createAbstractTimeTableEntryAdapter();
			}
			@Override
			public Adapter casePublicTransportTimeTableEntry(PublicTransportTimeTableEntry object) {
				return createPublicTransportTimeTableEntryAdapter();
			}
			@Override
			public Adapter casePublicTransportProgram(PublicTransportProgram object) {
				return createPublicTransportProgramAdapter();
			}
			@Override
			public Adapter casePublicTransportLine(PublicTransportLine object) {
				return createPublicTransportLineAdapter();
			}
			@Override
			public Adapter casePublicTransportConfiguration(PublicTransportConfiguration object) {
				return createPublicTransportConfigurationAdapter();
			}
			@Override
			public Adapter casePublicTransportDataEntry(PublicTransportDataEntry object) {
				return createPublicTransportDataEntryAdapter();
			}
			@Override
			public Adapter casePublicTransportDataValue(PublicTransportDataValue object) {
				return createPublicTransportDataValueAdapter();
			}
			@Override
			public Adapter casePublicTransportDataValueObject(PublicTransportDataValueObject object) {
				return createPublicTransportDataValueObjectAdapter();
			}
			@Override
			public Adapter casePublicTransportTelegram(PublicTransportTelegram object) {
				return createPublicTransportTelegramAdapter();
			}
			@Override
			public Adapter casePublicTransportPosition(PublicTransportPosition object) {
				return createPublicTransportPositionAdapter();
			}
			@Override
			public Adapter casePublicTransportDoorChange(PublicTransportDoorChange object) {
				return createPublicTransportDoorChangeAdapter();
			}
			@Override
			public Adapter casePublicTransportStop(PublicTransportStop object) {
				return createPublicTransportStopAdapter();
			}
			@Override
			public Adapter casePublicTransportLocMsg(PublicTransportLocMsg object) {
				return createPublicTransportLocMsgAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.DeviceGroup <em>Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.DeviceGroup
	 * @generated
	 */
	public Adapter createDeviceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.SystemInfo <em>System Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.SystemInfo
	 * @generated
	 */
	public Adapter createSystemInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.DeviceInfo <em>Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.DeviceInfo
	 * @generated
	 */
	public Adapter createDeviceInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.DeviceConfiguration <em>Device Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.DeviceConfiguration
	 * @generated
	 */
	public Adapter createDeviceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Intersection
	 * @generated
	 */
	public Adapter createIntersectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Road
	 * @generated
	 */
	public Adapter createRoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.ConflictingLane <em>Conflicting Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.ConflictingLane
	 * @generated
	 */
	public Adapter createConflictingLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.IncomingLane <em>Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.IncomingLane
	 * @generated
	 */
	public Adapter createIncomingLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.OutgoingLane <em>Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.OutgoingLane
	 * @generated
	 */
	public Adapter createOutgoingLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PedestrianLane <em>Pedestrian Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PedestrianLane
	 * @generated
	 */
	public Adapter createPedestrianLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.ProgramEntry <em>Program Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.ProgramEntry
	 * @generated
	 */
	public Adapter createProgramEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.ProgramTransition <em>Program Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.ProgramTransition
	 * @generated
	 */
	public Adapter createProgramTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.ClearArea <em>Clear Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.ClearArea
	 * @generated
	 */
	public Adapter createClearAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PhaseGroup <em>Phase Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PhaseGroup
	 * @generated
	 */
	public Adapter createPhaseGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.IdNameElement <em>Id Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.IdNameElement
	 * @generated
	 */
	public Adapter createIdNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Localizable <em>Localizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Localizable
	 * @generated
	 */
	public Adapter createLocalizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.NetworkLocation <em>Network Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.NetworkLocation
	 * @generated
	 */
	public Adapter createNetworkLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.AddressLocation <em>Address Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.AddressLocation
	 * @generated
	 */
	public Adapter createAddressLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.TimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.TimeTable
	 * @generated
	 */
	public Adapter createTimeTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.TimeTableEntry <em>Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.TimeTableEntry
	 * @generated
	 */
	public Adapter createTimeTableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.DataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.DataEntry
	 * @generated
	 */
	public Adapter createDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.CacheDataEntry <em>Cache Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.CacheDataEntry
	 * @generated
	 */
	public Adapter createCacheDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.SignalTable <em>Signal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.SignalTable
	 * @generated
	 */
	public Adapter createSignalTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.HardwareConfiguration <em>Hardware Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.HardwareConfiguration
	 * @generated
	 */
	public Adapter createHardwareConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.OutputConfiguration <em>Output Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.OutputConfiguration
	 * @generated
	 */
	public Adapter createOutputConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.OutPinConfiguration <em>Out Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.OutPinConfiguration
	 * @generated
	 */
	public Adapter createOutPinConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportLane <em>Public Transport Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportLane
	 * @generated
	 */
	public Adapter createPublicTransportLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.CycleLane <em>Cycle Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.CycleLane
	 * @generated
	 */
	public Adapter createCycleLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.AbstractDataEntry <em>Abstract Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.AbstractDataEntry
	 * @generated
	 */
	public Adapter createAbstractDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportStation <em>Public Transport Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportStation
	 * @generated
	 */
	public Adapter createPublicTransportStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportTimeTable <em>Public Transport Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTable
	 * @generated
	 */
	public Adapter createPublicTransportTimeTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry <em>Abstract Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.AbstractTimeTableEntry
	 * @generated
	 */
	public Adapter createAbstractTimeTableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry <em>Public Transport Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTableEntry
	 * @generated
	 */
	public Adapter createPublicTransportTimeTableEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportProgram <em>Public Transport Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportProgram
	 * @generated
	 */
	public Adapter createPublicTransportProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportLine <em>Public Transport Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportLine
	 * @generated
	 */
	public Adapter createPublicTransportLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportConfiguration <em>Public Transport Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportConfiguration
	 * @generated
	 */
	public Adapter createPublicTransportConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportDataEntry <em>Public Transport Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportDataEntry
	 * @generated
	 */
	public Adapter createPublicTransportDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportDataValue <em>Public Transport Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValue
	 * @generated
	 */
	public Adapter createPublicTransportDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportDataValueObject <em>Public Transport Data Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValueObject
	 * @generated
	 */
	public Adapter createPublicTransportDataValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportTelegram <em>Public Transport Telegram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportTelegram
	 * @generated
	 */
	public Adapter createPublicTransportTelegramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportPosition <em>Public Transport Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportPosition
	 * @generated
	 */
	public Adapter createPublicTransportPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportDoorChange <em>Public Transport Door Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChange
	 * @generated
	 */
	public Adapter createPublicTransportDoorChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportStop <em>Public Transport Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportStop
	 * @generated
	 */
	public Adapter createPublicTransportStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.model.device.PublicTransportLocMsg <em>Public Transport Loc Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg
	 * @generated
	 */
	public Adapter createPublicTransportLocMsgAdapter() {
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

} //TOSDeviceAdapterFactory
