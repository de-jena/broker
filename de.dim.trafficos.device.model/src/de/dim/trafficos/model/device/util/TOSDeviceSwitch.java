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
 * @see de.dim.trafficos.model.device.TOSDevicePackage
 * @generated
 */
public class TOSDeviceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TOSDevicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSDeviceSwitch() {
		if (modelPackage == null) {
			modelPackage = TOSDevicePackage.eINSTANCE;
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
			case TOSDevicePackage.DEVICE_GROUP: {
				DeviceGroup deviceGroup = (DeviceGroup)theEObject;
				T result = caseDeviceGroup(deviceGroup);
				if (result == null) result = caseDevice(deviceGroup);
				if (result == null) result = caseLocalizable(deviceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseLocalizable(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.SYSTEM_INFO: {
				SystemInfo systemInfo = (SystemInfo)theEObject;
				T result = caseSystemInfo(systemInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.DEVICE_INFO: {
				DeviceInfo deviceInfo = (DeviceInfo)theEObject;
				T result = caseDeviceInfo(deviceInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.DEVICE_CONFIGURATION: {
				DeviceConfiguration deviceConfiguration = (DeviceConfiguration)theEObject;
				T result = caseDeviceConfiguration(deviceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.INTERSECTION: {
				Intersection intersection = (Intersection)theEObject;
				T result = caseIntersection(intersection);
				if (result == null) result = caseAbstractDataEntry(intersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.ROAD: {
				Road road = (Road)theEObject;
				T result = caseRoad(road);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.LANE: {
				Lane lane = (Lane)theEObject;
				T result = caseLane(lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.CONFLICTING_LANE: {
				ConflictingLane conflictingLane = (ConflictingLane)theEObject;
				T result = caseConflictingLane(conflictingLane);
				if (result == null) result = caseLane(conflictingLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.INCOMING_LANE: {
				IncomingLane incomingLane = (IncomingLane)theEObject;
				T result = caseIncomingLane(incomingLane);
				if (result == null) result = caseConflictingLane(incomingLane);
				if (result == null) result = caseLane(incomingLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.OUTGOING_LANE: {
				OutgoingLane outgoingLane = (OutgoingLane)theEObject;
				T result = caseOutgoingLane(outgoingLane);
				if (result == null) result = caseLane(outgoingLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PEDESTRIAN_LANE: {
				PedestrianLane pedestrianLane = (PedestrianLane)theEObject;
				T result = casePedestrianLane(pedestrianLane);
				if (result == null) result = caseConflictingLane(pedestrianLane);
				if (result == null) result = caseLane(pedestrianLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PHASE: {
				Phase phase = (Phase)theEObject;
				T result = casePhase(phase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PROGRAM_ENTRY: {
				ProgramEntry programEntry = (ProgramEntry)theEObject;
				T result = caseProgramEntry(programEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PROGRAM: {
				Program program = (Program)theEObject;
				T result = caseProgram(program);
				if (result == null) result = caseIdNameElement(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PROGRAM_TRANSITION: {
				ProgramTransition programTransition = (ProgramTransition)theEObject;
				T result = caseProgramTransition(programTransition);
				if (result == null) result = caseProgramEntry(programTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.CLEAR_AREA: {
				ClearArea clearArea = (ClearArea)theEObject;
				T result = caseClearArea(clearArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PHASE_GROUP: {
				PhaseGroup phaseGroup = (PhaseGroup)theEObject;
				T result = casePhaseGroup(phaseGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.ID_NAME_ELEMENT: {
				IdNameElement idNameElement = (IdNameElement)theEObject;
				T result = caseIdNameElement(idNameElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseIdNameElement(output);
				if (result == null) result = caseLocalizable(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.LOCALIZABLE: {
				Localizable localizable = (Localizable)theEObject;
				T result = caseLocalizable(localizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.NETWORK_LOCATION: {
				NetworkLocation networkLocation = (NetworkLocation)theEObject;
				T result = caseNetworkLocation(networkLocation);
				if (result == null) result = caseLocation(networkLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = caseLocation(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.ADDRESS_LOCATION: {
				AddressLocation addressLocation = (AddressLocation)theEObject;
				T result = caseAddressLocation(addressLocation);
				if (result == null) result = caseLocation(addressLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.TIME_TABLE: {
				TimeTable timeTable = (TimeTable)theEObject;
				T result = caseTimeTable(timeTable);
				if (result == null) result = caseIdNameElement(timeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.TIME_TABLE_ENTRY: {
				TimeTableEntry timeTableEntry = (TimeTableEntry)theEObject;
				T result = caseTimeTableEntry(timeTableEntry);
				if (result == null) result = caseAbstractTimeTableEntry(timeTableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.DATA_ENTRY: {
				DataEntry dataEntry = (DataEntry)theEObject;
				T result = caseDataEntry(dataEntry);
				if (result == null) result = caseAbstractDataEntry(dataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseIdNameElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.CACHE_DATA_ENTRY: {
				CacheDataEntry cacheDataEntry = (CacheDataEntry)theEObject;
				T result = caseCacheDataEntry(cacheDataEntry);
				if (result == null) result = caseDataEntry(cacheDataEntry);
				if (result == null) result = caseAbstractDataEntry(cacheDataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.SIGNAL_TABLE: {
				SignalTable signalTable = (SignalTable)theEObject;
				T result = caseSignalTable(signalTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.HARDWARE_CONFIGURATION: {
				HardwareConfiguration hardwareConfiguration = (HardwareConfiguration)theEObject;
				T result = caseHardwareConfiguration(hardwareConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.OUTPUT_CONFIGURATION: {
				OutputConfiguration outputConfiguration = (OutputConfiguration)theEObject;
				T result = caseOutputConfiguration(outputConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.OUT_PIN_CONFIGURATION: {
				OutPinConfiguration outPinConfiguration = (OutPinConfiguration)theEObject;
				T result = caseOutPinConfiguration(outPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_LANE: {
				PublicTransportLane publicTransportLane = (PublicTransportLane)theEObject;
				T result = casePublicTransportLane(publicTransportLane);
				if (result == null) result = caseConflictingLane(publicTransportLane);
				if (result == null) result = caseLane(publicTransportLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.CYCLE_LANE: {
				CycleLane cycleLane = (CycleLane)theEObject;
				T result = caseCycleLane(cycleLane);
				if (result == null) result = caseConflictingLane(cycleLane);
				if (result == null) result = caseLane(cycleLane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.ABSTRACT_DATA_ENTRY: {
				AbstractDataEntry abstractDataEntry = (AbstractDataEntry)theEObject;
				T result = caseAbstractDataEntry(abstractDataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_STATION: {
				PublicTransportStation publicTransportStation = (PublicTransportStation)theEObject;
				T result = casePublicTransportStation(publicTransportStation);
				if (result == null) result = caseIdNameElement(publicTransportStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE: {
				PublicTransportTimeTable publicTransportTimeTable = (PublicTransportTimeTable)theEObject;
				T result = casePublicTransportTimeTable(publicTransportTimeTable);
				if (result == null) result = caseIdNameElement(publicTransportTimeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.ABSTRACT_TIME_TABLE_ENTRY: {
				AbstractTimeTableEntry abstractTimeTableEntry = (AbstractTimeTableEntry)theEObject;
				T result = caseAbstractTimeTableEntry(abstractTimeTableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY: {
				PublicTransportTimeTableEntry publicTransportTimeTableEntry = (PublicTransportTimeTableEntry)theEObject;
				T result = casePublicTransportTimeTableEntry(publicTransportTimeTableEntry);
				if (result == null) result = caseAbstractTimeTableEntry(publicTransportTimeTableEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_PROGRAM: {
				PublicTransportProgram publicTransportProgram = (PublicTransportProgram)theEObject;
				T result = casePublicTransportProgram(publicTransportProgram);
				if (result == null) result = caseIdNameElement(publicTransportProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE: {
				PublicTransportLine publicTransportLine = (PublicTransportLine)theEObject;
				T result = casePublicTransportLine(publicTransportLine);
				if (result == null) result = caseIdNameElement(publicTransportLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_CONFIGURATION: {
				PublicTransportConfiguration publicTransportConfiguration = (PublicTransportConfiguration)theEObject;
				T result = casePublicTransportConfiguration(publicTransportConfiguration);
				if (result == null) result = caseIdNameElement(publicTransportConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY: {
				PublicTransportDataEntry publicTransportDataEntry = (PublicTransportDataEntry)theEObject;
				T result = casePublicTransportDataEntry(publicTransportDataEntry);
				if (result == null) result = caseAbstractDataEntry(publicTransportDataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE: {
				PublicTransportDataValue publicTransportDataValue = (PublicTransportDataValue)theEObject;
				T result = casePublicTransportDataValue(publicTransportDataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE_OBJECT: {
				PublicTransportDataValueObject publicTransportDataValueObject = (PublicTransportDataValueObject)theEObject;
				T result = casePublicTransportDataValueObject(publicTransportDataValueObject);
				if (result == null) result = caseIdNameElement(publicTransportDataValueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_TELEGRAM: {
				PublicTransportTelegram publicTransportTelegram = (PublicTransportTelegram)theEObject;
				T result = casePublicTransportTelegram(publicTransportTelegram);
				if (result == null) result = casePublicTransportDataValueObject(publicTransportTelegram);
				if (result == null) result = caseIdNameElement(publicTransportTelegram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_POSITION: {
				PublicTransportPosition publicTransportPosition = (PublicTransportPosition)theEObject;
				T result = casePublicTransportPosition(publicTransportPosition);
				if (result == null) result = casePublicTransportDataValueObject(publicTransportPosition);
				if (result == null) result = caseIdNameElement(publicTransportPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_DOOR_CHANGE: {
				PublicTransportDoorChange publicTransportDoorChange = (PublicTransportDoorChange)theEObject;
				T result = casePublicTransportDoorChange(publicTransportDoorChange);
				if (result == null) result = casePublicTransportPosition(publicTransportDoorChange);
				if (result == null) result = casePublicTransportDataValueObject(publicTransportDoorChange);
				if (result == null) result = caseIdNameElement(publicTransportDoorChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP: {
				PublicTransportStop publicTransportStop = (PublicTransportStop)theEObject;
				T result = casePublicTransportStop(publicTransportStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG: {
				PublicTransportLocMsg publicTransportLocMsg = (PublicTransportLocMsg)theEObject;
				T result = casePublicTransportLocMsg(publicTransportLocMsg);
				if (result == null) result = casePublicTransportDataValueObject(publicTransportLocMsg);
				if (result == null) result = caseIdNameElement(publicTransportLocMsg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceGroup(DeviceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInfo(SystemInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceInfo(DeviceInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceConfiguration(DeviceConfiguration object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalizable(Localizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLocation(NetworkLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressLocation(AddressLocation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareConfiguration(HardwareConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputConfiguration(OutputConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPinConfiguration(OutPinConfiguration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportStation(PublicTransportStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Time Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Time Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportTimeTable(PublicTransportTimeTable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Time Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Time Table Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportTimeTableEntry(PublicTransportTimeTableEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportProgram(PublicTransportProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportLine(PublicTransportLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportConfiguration(PublicTransportConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Data Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportDataEntry(PublicTransportDataEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportDataValue(PublicTransportDataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Data Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Data Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportDataValueObject(PublicTransportDataValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Telegram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Telegram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportTelegram(PublicTransportTelegram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportPosition(PublicTransportPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Door Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Door Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportDoorChange(PublicTransportDoorChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportStop(PublicTransportStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Transport Loc Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Transport Loc Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicTransportLocMsg(PublicTransportLocMsg object) {
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

} //TOSDeviceSwitch
