/*
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
package de.dim.trafficos.model.device;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage
 * @generated
 */
@ProviderType
public interface TOSDeviceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSDeviceFactory eINSTANCE = de.dim.trafficos.model.device.impl.TOSDeviceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Device Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Group</em>'.
	 * @generated
	 */
	DeviceGroup createDeviceGroup();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>System Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Info</em>'.
	 * @generated
	 */
	SystemInfo createSystemInfo();

	/**
	 * Returns a new object of class '<em>Device Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Info</em>'.
	 * @generated
	 */
	DeviceInfo createDeviceInfo();

	/**
	 * Returns a new object of class '<em>Device Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Configuration</em>'.
	 * @generated
	 */
	DeviceConfiguration createDeviceConfiguration();

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
	 * Returns a new object of class '<em>Id Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Name Element</em>'.
	 * @generated
	 */
	IdNameElement createIdNameElement();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Localizable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localizable</em>'.
	 * @generated
	 */
	Localizable createLocalizable();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Network Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Location</em>'.
	 * @generated
	 */
	NetworkLocation createNetworkLocation();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Address Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Location</em>'.
	 * @generated
	 */
	AddressLocation createAddressLocation();

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
	 * Returns a new object of class '<em>Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Entry</em>'.
	 * @generated
	 */
	DataEntry createDataEntry();

	/**
	 * Returns a new object of class '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value</em>'.
	 * @generated
	 */
	DataValue createDataValue();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Cache Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Data Entry</em>'.
	 * @generated
	 */
	CacheDataEntry createCacheDataEntry();

	/**
	 * Returns a new object of class '<em>Signal Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Table</em>'.
	 * @generated
	 */
	SignalTable createSignalTable();

	/**
	 * Returns a new object of class '<em>Hardware Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Configuration</em>'.
	 * @generated
	 */
	HardwareConfiguration createHardwareConfiguration();

	/**
	 * Returns a new object of class '<em>Output Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Configuration</em>'.
	 * @generated
	 */
	OutputConfiguration createOutputConfiguration();

	/**
	 * Returns a new object of class '<em>Out Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Pin Configuration</em>'.
	 * @generated
	 */
	OutPinConfiguration createOutPinConfiguration();

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
	 * Returns a new object of class '<em>Abstract Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Data Entry</em>'.
	 * @generated
	 */
	AbstractDataEntry createAbstractDataEntry();

	/**
	 * Returns a new object of class '<em>Public Transport Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Station</em>'.
	 * @generated
	 */
	PublicTransportStation createPublicTransportStation();

	/**
	 * Returns a new object of class '<em>Public Transport Time Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Time Table</em>'.
	 * @generated
	 */
	PublicTransportTimeTable createPublicTransportTimeTable();

	/**
	 * Returns a new object of class '<em>Abstract Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Time Table Entry</em>'.
	 * @generated
	 */
	AbstractTimeTableEntry createAbstractTimeTableEntry();

	/**
	 * Returns a new object of class '<em>Public Transport Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Time Table Entry</em>'.
	 * @generated
	 */
	PublicTransportTimeTableEntry createPublicTransportTimeTableEntry();

	/**
	 * Returns a new object of class '<em>Public Transport Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Program</em>'.
	 * @generated
	 */
	PublicTransportProgram createPublicTransportProgram();

	/**
	 * Returns a new object of class '<em>Public Transport Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Line</em>'.
	 * @generated
	 */
	PublicTransportLine createPublicTransportLine();

	/**
	 * Returns a new object of class '<em>Public Transport Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Configuration</em>'.
	 * @generated
	 */
	PublicTransportConfiguration createPublicTransportConfiguration();

	/**
	 * Returns a new object of class '<em>Public Transport Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Data Entry</em>'.
	 * @generated
	 */
	PublicTransportDataEntry createPublicTransportDataEntry();

	/**
	 * Returns a new object of class '<em>Public Transport Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Data Value</em>'.
	 * @generated
	 */
	PublicTransportDataValue createPublicTransportDataValue();

	/**
	 * Returns a new object of class '<em>Public Transport Data Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Data Value Object</em>'.
	 * @generated
	 */
	PublicTransportDataValueObject createPublicTransportDataValueObject();

	/**
	 * Returns a new object of class '<em>Public Transport Telegram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Telegram</em>'.
	 * @generated
	 */
	PublicTransportTelegram createPublicTransportTelegram();

	/**
	 * Returns a new object of class '<em>Public Transport Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Position</em>'.
	 * @generated
	 */
	PublicTransportPosition createPublicTransportPosition();

	/**
	 * Returns a new object of class '<em>Public Transport Door Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Door Change</em>'.
	 * @generated
	 */
	PublicTransportDoorChange createPublicTransportDoorChange();

	/**
	 * Returns a new object of class '<em>Public Transport Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Stop</em>'.
	 * @generated
	 */
	PublicTransportStop createPublicTransportStop();

	/**
	 * Returns a new object of class '<em>Public Transport Loc Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Transport Loc Msg</em>'.
	 * @generated
	 */
	PublicTransportLocMsg createPublicTransportLocMsg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TOSDevicePackage getTOSDevicePackage();

} //TOSDeviceFactory
