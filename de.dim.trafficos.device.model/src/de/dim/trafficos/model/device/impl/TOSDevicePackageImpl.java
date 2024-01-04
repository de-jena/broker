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
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.AbstractDataEntry;
import de.dim.trafficos.model.device.AbstractTimeTableEntry;
import de.dim.trafficos.model.device.AddressLocation;
import de.dim.trafficos.model.device.CacheDataEntry;
import de.dim.trafficos.model.device.ClearArea;
import de.dim.trafficos.model.device.ClearAreaType;
import de.dim.trafficos.model.device.ConflictingLane;
import de.dim.trafficos.model.device.CycleLane;
import de.dim.trafficos.model.device.DataEntry;
import de.dim.trafficos.model.device.DataValue;
import de.dim.trafficos.model.device.Device;
import de.dim.trafficos.model.device.DeviceActivationType;
import de.dim.trafficos.model.device.DeviceConfiguration;
import de.dim.trafficos.model.device.DeviceGroup;
import de.dim.trafficos.model.device.DeviceInfo;
import de.dim.trafficos.model.device.DirectionType;
import de.dim.trafficos.model.device.HardwareConfiguration;
import de.dim.trafficos.model.device.IdNameElement;
import de.dim.trafficos.model.device.IncomingLane;
import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.IntersectionStateType;
import de.dim.trafficos.model.device.Lane;
import de.dim.trafficos.model.device.LifeCycleDeviceType;
import de.dim.trafficos.model.device.Link;
import de.dim.trafficos.model.device.Localizable;
import de.dim.trafficos.model.device.Location;
import de.dim.trafficos.model.device.NetworkLocation;
import de.dim.trafficos.model.device.OutPinConfiguration;
import de.dim.trafficos.model.device.OutgoingLane;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.OutputConfiguration;
import de.dim.trafficos.model.device.OutputElementType;
import de.dim.trafficos.model.device.Parameter;
import de.dim.trafficos.model.device.ParameterDataType;
import de.dim.trafficos.model.device.PedestrianLane;
import de.dim.trafficos.model.device.Phase;
import de.dim.trafficos.model.device.PhaseGroup;
import de.dim.trafficos.model.device.Position;
import de.dim.trafficos.model.device.Program;
import de.dim.trafficos.model.device.ProgramEntry;
import de.dim.trafficos.model.device.ProgramTransition;
import de.dim.trafficos.model.device.PublicTransportConfiguration;
import de.dim.trafficos.model.device.PublicTransportDataEntry;
import de.dim.trafficos.model.device.PublicTransportDataValue;
import de.dim.trafficos.model.device.PublicTransportDataValueObject;
import de.dim.trafficos.model.device.PublicTransportDataValueType;
import de.dim.trafficos.model.device.PublicTransportDoorChange;
import de.dim.trafficos.model.device.PublicTransportDoorChangeType;
import de.dim.trafficos.model.device.PublicTransportLane;
import de.dim.trafficos.model.device.PublicTransportLine;
import de.dim.trafficos.model.device.PublicTransportLocMsg;
import de.dim.trafficos.model.device.PublicTransportPosition;
import de.dim.trafficos.model.device.PublicTransportProgram;
import de.dim.trafficos.model.device.PublicTransportStation;
import de.dim.trafficos.model.device.PublicTransportStop;
import de.dim.trafficos.model.device.PublicTransportTelegram;
import de.dim.trafficos.model.device.PublicTransportTimeTable;
import de.dim.trafficos.model.device.PublicTransportTimeTableEntry;
import de.dim.trafficos.model.device.PublicTransportType;
import de.dim.trafficos.model.device.Road;
import de.dim.trafficos.model.device.ScheduleModeType;
import de.dim.trafficos.model.device.SignalTable;
import de.dim.trafficos.model.device.SystemInfo;
import de.dim.trafficos.model.device.TOSDeviceFactory;
import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.TimeTable;
import de.dim.trafficos.model.device.TimeTableEntry;
import de.dim.trafficos.model.device.TimeTableModeType;
import de.dim.trafficos.model.device.Transition;

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
public class TOSDevicePackageImpl extends EPackageImpl implements TOSDevicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceConfigurationEClass = null;

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
	private EClass idNameElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLocationEClass = null;

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
	private EClass dataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

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
	private EClass signalTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPinConfigurationEClass = null;

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
	private EClass abstractDataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportTimeTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportTimeTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportDataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportDataValueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportTelegramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportDoorChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicTransportLocMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceActivationTypeEEnum = null;

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
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scheduleModeTypeEEnum = null;

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
	private EEnum parameterDataTypeEEnum = null;

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
	private EEnum lifeCycleDeviceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outputElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicTransportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicTransportDataValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicTransportDoorChangeTypeEEnum = null;

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
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TOSDevicePackageImpl() {
		super(eNS_URI, TOSDeviceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TOSDevicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TOSDevicePackage init() {
		if (isInited) return (TOSDevicePackage)EPackage.Registry.INSTANCE.getEPackage(TOSDevicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTOSDevicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TOSDevicePackageImpl theTOSDevicePackage = registeredTOSDevicePackage instanceof TOSDevicePackageImpl ? (TOSDevicePackageImpl)registeredTOSDevicePackage : new TOSDevicePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTOSDevicePackage.createPackageContents();

		// Initialize created meta-data
		theTOSDevicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTOSDevicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TOSDevicePackage.eNS_URI, theTOSDevicePackage);
		return theTOSDevicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceGroup() {
		return deviceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceGroup_Device() {
		return (EReference)deviceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Id() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_ActivationState() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevice_Configuration() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevice_DeviceInformation() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevice_SystemInformation() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_LifeCycleType() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemInfo() {
		return systemInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_HardwareType() {
		return (EAttribute)systemInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_HardwareRev() {
		return (EAttribute)systemInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_OsType() {
		return (EAttribute)systemInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_OsRev() {
		return (EAttribute)systemInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_SoftwareType() {
		return (EAttribute)systemInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_SoftwareRev() {
		return (EAttribute)systemInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceInfo() {
		return deviceInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInfo_TechnicalName() {
		return (EAttribute)deviceInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInfo_HumanReadableName() {
		return (EAttribute)deviceInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInfo_ShortName() {
		return (EAttribute)deviceInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceInfo_Description() {
		return (EAttribute)deviceInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceConfiguration() {
		return deviceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviceConfiguration_Id() {
		return (EAttribute)deviceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_Intersection() {
		return (EReference)deviceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceConfiguration_CurrentIntersection() {
		return (EReference)deviceConfigurationEClass.getEStructuralFeatures().get(2);
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
	public EReference getIntersection_Road() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Link() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Phase() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_PhaseGroup() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_TimeTable() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Output() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Program() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersection_Parameter() {
		return (EReference)intersectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_State() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_Name() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersection_Description() {
		return (EAttribute)intersectionEClass.getEStructuralFeatures().get(10);
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
	public EReference getRoad_IncomingLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_OutgoingLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_PedestrianLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_CycleLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoad_PublicTransportLane() {
		return (EReference)roadEClass.getEStructuralFeatures().get(6);
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
	public EClass getIdNameElement() {
		return idNameElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdNameElement_Id() {
		return (EAttribute)idNameElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdNameElement_Name() {
		return (EAttribute)idNameElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Description() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Type() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_DefaultValue() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalizable() {
		return localizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalizable_Location() {
		return (EReference)localizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Id() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkLocation() {
		return networkLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLocation_Ip4Address() {
		return (EAttribute)networkLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLocation_Ip6Address() {
		return (EAttribute)networkLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLocation_Hostname() {
		return (EAttribute)networkLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Latitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Longitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Altitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Orientation() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Bearing() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressLocation() {
		return addressLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_Location() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_Street() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_Zip() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_District() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(3);
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
	public EClass getDataEntry() {
		return dataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataEntry_Value() {
		return (EReference)dataEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataEntry_Configuration() {
		return (EAttribute)dataEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataEntry_Device() {
		return (EAttribute)dataEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_Value() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataValue_Element() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataValue_ElementRef() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_Duration() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_DataType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
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
	public EClass getHardwareConfiguration() {
		return hardwareConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHardwareConfiguration_Id() {
		return (EAttribute)hardwareConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardwareConfiguration_PinConfiguration() {
		return (EReference)hardwareConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHardwareConfiguration_DeviceId() {
		return (EAttribute)hardwareConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHardwareConfiguration_DeviceConfigurationId() {
		return (EAttribute)hardwareConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputConfiguration() {
		return outputConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputConfiguration_Output() {
		return (EReference)outputConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputConfiguration_Pin() {
		return (EReference)outputConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutPinConfiguration() {
		return outPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutPinConfiguration_Pin() {
		return (EAttribute)outPinConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutPinConfiguration_Gpio() {
		return (EAttribute)outPinConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutPinConfiguration_Type() {
		return (EAttribute)outPinConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutPinConfiguration_Comment() {
		return (EAttribute)outPinConfigurationEClass.getEStructuralFeatures().get(3);
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
	public EClass getAbstractDataEntry() {
		return abstractDataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDataEntry_Id() {
		return (EAttribute)abstractDataEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDataEntry_Timestamp() {
		return (EAttribute)abstractDataEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDataEntry_Index() {
		return (EAttribute)abstractDataEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportStation() {
		return publicTransportStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportTimeTable() {
		return publicTransportTimeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportTimeTable_Entry() {
		return (EReference)publicTransportTimeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportTimeTable_Type() {
		return (EAttribute)publicTransportTimeTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTimeTableEntry() {
		return abstractTimeTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_Index() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_Mode() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_Begin() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_End() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportTimeTableEntry() {
		return publicTransportTimeTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportTimeTableEntry_FirstStation() {
		return (EReference)publicTransportTimeTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportTimeTableEntry_LastStation() {
		return (EReference)publicTransportTimeTableEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportTimeTableEntry_Stops() {
		return (EReference)publicTransportTimeTableEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportProgram() {
		return publicTransportProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportProgram_DataEntry() {
		return (EReference)publicTransportProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportLine() {
		return publicTransportLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLine_Type() {
		return (EAttribute)publicTransportLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportLine_TimeTable() {
		return (EReference)publicTransportLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLine_LineNumber() {
		return (EAttribute)publicTransportLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportConfiguration() {
		return publicTransportConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportConfiguration_PublicTransport() {
		return (EReference)publicTransportConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportDataEntry() {
		return publicTransportDataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportDataEntry_DataValue() {
		return (EReference)publicTransportDataEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportDataValue() {
		return publicTransportDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportDataValue_Type() {
		return (EAttribute)publicTransportDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportDataValue_LineRef() {
		return (EReference)publicTransportDataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportDataValue_Value() {
		return (EReference)publicTransportDataValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportDataValueObject() {
		return publicTransportDataValueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportTelegram() {
		return publicTransportTelegramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportPosition() {
		return publicTransportPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportPosition_Position() {
		return (EReference)publicTransportPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportDoorChange() {
		return publicTransportDoorChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportDoorChange_Type() {
		return (EAttribute)publicTransportDoorChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportStop() {
		return publicTransportStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicTransportStop_Station() {
		return (EReference)publicTransportStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicTransportLocMsg() {
		return publicTransportLocMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_LineNum() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_TripNum() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_RouteNum() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_TravelNum() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_Counter() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_Kilometer() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_PosState() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_LastStop() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_NextStop() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_ActualTime() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_ExpectedTime() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_Gps() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_Odo() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicTransportLocMsg_Door() {
		return (EAttribute)publicTransportLocMsgEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceActivationType() {
		return deviceActivationTypeEEnum;
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
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScheduleModeType() {
		return scheduleModeTypeEEnum;
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
	public EEnum getParameterDataType() {
		return parameterDataTypeEEnum;
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
	public EEnum getLifeCycleDeviceType() {
		return lifeCycleDeviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOutputElementType() {
		return outputElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPublicTransportType() {
		return publicTransportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPublicTransportDataValueType() {
		return publicTransportDataValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPublicTransportDoorChangeType() {
		return publicTransportDoorChangeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSDeviceFactory getTOSDeviceFactory() {
		return (TOSDeviceFactory)getEFactoryInstance();
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
		deviceGroupEClass = createEClass(DEVICE_GROUP);
		createEReference(deviceGroupEClass, DEVICE_GROUP__DEVICE);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__ID);
		createEAttribute(deviceEClass, DEVICE__ACTIVATION_STATE);
		createEReference(deviceEClass, DEVICE__CONFIGURATION);
		createEReference(deviceEClass, DEVICE__DEVICE_INFORMATION);
		createEReference(deviceEClass, DEVICE__SYSTEM_INFORMATION);
		createEAttribute(deviceEClass, DEVICE__LIFE_CYCLE_TYPE);

		systemInfoEClass = createEClass(SYSTEM_INFO);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__HARDWARE_TYPE);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__HARDWARE_REV);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__OS_TYPE);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__OS_REV);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__SOFTWARE_TYPE);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__SOFTWARE_REV);

		deviceInfoEClass = createEClass(DEVICE_INFO);
		createEAttribute(deviceInfoEClass, DEVICE_INFO__TECHNICAL_NAME);
		createEAttribute(deviceInfoEClass, DEVICE_INFO__HUMAN_READABLE_NAME);
		createEAttribute(deviceInfoEClass, DEVICE_INFO__SHORT_NAME);
		createEAttribute(deviceInfoEClass, DEVICE_INFO__DESCRIPTION);

		deviceConfigurationEClass = createEClass(DEVICE_CONFIGURATION);
		createEAttribute(deviceConfigurationEClass, DEVICE_CONFIGURATION__ID);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__INTERSECTION);
		createEReference(deviceConfigurationEClass, DEVICE_CONFIGURATION__CURRENT_INTERSECTION);

		intersectionEClass = createEClass(INTERSECTION);
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
		createEReference(roadEClass, ROAD__INCOMING_LANE);
		createEReference(roadEClass, ROAD__OUTGOING_LANE);
		createEReference(roadEClass, ROAD__PEDESTRIAN_LANE);
		createEReference(roadEClass, ROAD__CYCLE_LANE);
		createEReference(roadEClass, ROAD__PUBLIC_TRANSPORT_LANE);

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

		idNameElementEClass = createEClass(ID_NAME_ELEMENT);
		createEAttribute(idNameElementEClass, ID_NAME_ELEMENT__ID);
		createEAttribute(idNameElementEClass, ID_NAME_ELEMENT__NAME);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__DESCRIPTION);
		createEAttribute(outputEClass, OUTPUT__TYPE);
		createEAttribute(outputEClass, OUTPUT__DEFAULT_VALUE);

		localizableEClass = createEClass(LOCALIZABLE);
		createEReference(localizableEClass, LOCALIZABLE__LOCATION);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ID);

		networkLocationEClass = createEClass(NETWORK_LOCATION);
		createEAttribute(networkLocationEClass, NETWORK_LOCATION__IP4_ADDRESS);
		createEAttribute(networkLocationEClass, NETWORK_LOCATION__IP6_ADDRESS);
		createEAttribute(networkLocationEClass, NETWORK_LOCATION__HOSTNAME);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__LATITUDE);
		createEAttribute(positionEClass, POSITION__LONGITUDE);
		createEAttribute(positionEClass, POSITION__ALTITUDE);
		createEAttribute(positionEClass, POSITION__ORIENTATION);
		createEAttribute(positionEClass, POSITION__BEARING);

		addressLocationEClass = createEClass(ADDRESS_LOCATION);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__LOCATION);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__STREET);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__ZIP);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__DISTRICT);

		timeTableEClass = createEClass(TIME_TABLE);
		createEReference(timeTableEClass, TIME_TABLE__ENTRY);
		createEAttribute(timeTableEClass, TIME_TABLE__DEFAULT_MODE);

		timeTableEntryEClass = createEClass(TIME_TABLE_ENTRY);
		createEReference(timeTableEntryEClass, TIME_TABLE_ENTRY__PROGRAM);

		dataEntryEClass = createEClass(DATA_ENTRY);
		createEReference(dataEntryEClass, DATA_ENTRY__VALUE);
		createEAttribute(dataEntryEClass, DATA_ENTRY__CONFIGURATION);
		createEAttribute(dataEntryEClass, DATA_ENTRY__DEVICE);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__VALUE);
		createEReference(dataValueEClass, DATA_VALUE__ELEMENT);
		createEReference(dataValueEClass, DATA_VALUE__ELEMENT_REF);
		createEAttribute(dataValueEClass, DATA_VALUE__DURATION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DATA_TYPE);

		cacheDataEntryEClass = createEClass(CACHE_DATA_ENTRY);

		signalTableEClass = createEClass(SIGNAL_TABLE);
		createEReference(signalTableEClass, SIGNAL_TABLE__CACHE_DATA_ENTRY);

		hardwareConfigurationEClass = createEClass(HARDWARE_CONFIGURATION);
		createEAttribute(hardwareConfigurationEClass, HARDWARE_CONFIGURATION__ID);
		createEReference(hardwareConfigurationEClass, HARDWARE_CONFIGURATION__PIN_CONFIGURATION);
		createEAttribute(hardwareConfigurationEClass, HARDWARE_CONFIGURATION__DEVICE_ID);
		createEAttribute(hardwareConfigurationEClass, HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID);

		outputConfigurationEClass = createEClass(OUTPUT_CONFIGURATION);
		createEReference(outputConfigurationEClass, OUTPUT_CONFIGURATION__OUTPUT);
		createEReference(outputConfigurationEClass, OUTPUT_CONFIGURATION__PIN);

		outPinConfigurationEClass = createEClass(OUT_PIN_CONFIGURATION);
		createEAttribute(outPinConfigurationEClass, OUT_PIN_CONFIGURATION__PIN);
		createEAttribute(outPinConfigurationEClass, OUT_PIN_CONFIGURATION__GPIO);
		createEAttribute(outPinConfigurationEClass, OUT_PIN_CONFIGURATION__TYPE);
		createEAttribute(outPinConfigurationEClass, OUT_PIN_CONFIGURATION__COMMENT);

		publicTransportLaneEClass = createEClass(PUBLIC_TRANSPORT_LANE);

		cycleLaneEClass = createEClass(CYCLE_LANE);

		abstractDataEntryEClass = createEClass(ABSTRACT_DATA_ENTRY);
		createEAttribute(abstractDataEntryEClass, ABSTRACT_DATA_ENTRY__ID);
		createEAttribute(abstractDataEntryEClass, ABSTRACT_DATA_ENTRY__TIMESTAMP);
		createEAttribute(abstractDataEntryEClass, ABSTRACT_DATA_ENTRY__INDEX);

		publicTransportStationEClass = createEClass(PUBLIC_TRANSPORT_STATION);

		publicTransportTimeTableEClass = createEClass(PUBLIC_TRANSPORT_TIME_TABLE);
		createEReference(publicTransportTimeTableEClass, PUBLIC_TRANSPORT_TIME_TABLE__ENTRY);
		createEAttribute(publicTransportTimeTableEClass, PUBLIC_TRANSPORT_TIME_TABLE__TYPE);

		abstractTimeTableEntryEClass = createEClass(ABSTRACT_TIME_TABLE_ENTRY);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__INDEX);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__MODE);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__BEGIN);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__END);

		publicTransportTimeTableEntryEClass = createEClass(PUBLIC_TRANSPORT_TIME_TABLE_ENTRY);
		createEReference(publicTransportTimeTableEntryEClass, PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION);
		createEReference(publicTransportTimeTableEntryEClass, PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION);
		createEReference(publicTransportTimeTableEntryEClass, PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS);

		publicTransportProgramEClass = createEClass(PUBLIC_TRANSPORT_PROGRAM);
		createEReference(publicTransportProgramEClass, PUBLIC_TRANSPORT_PROGRAM__DATA_ENTRY);

		publicTransportLineEClass = createEClass(PUBLIC_TRANSPORT_LINE);
		createEAttribute(publicTransportLineEClass, PUBLIC_TRANSPORT_LINE__TYPE);
		createEReference(publicTransportLineEClass, PUBLIC_TRANSPORT_LINE__TIME_TABLE);
		createEAttribute(publicTransportLineEClass, PUBLIC_TRANSPORT_LINE__LINE_NUMBER);

		publicTransportConfigurationEClass = createEClass(PUBLIC_TRANSPORT_CONFIGURATION);
		createEReference(publicTransportConfigurationEClass, PUBLIC_TRANSPORT_CONFIGURATION__PUBLIC_TRANSPORT);

		publicTransportDataEntryEClass = createEClass(PUBLIC_TRANSPORT_DATA_ENTRY);
		createEReference(publicTransportDataEntryEClass, PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE);

		publicTransportDataValueEClass = createEClass(PUBLIC_TRANSPORT_DATA_VALUE);
		createEAttribute(publicTransportDataValueEClass, PUBLIC_TRANSPORT_DATA_VALUE__TYPE);
		createEReference(publicTransportDataValueEClass, PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF);
		createEReference(publicTransportDataValueEClass, PUBLIC_TRANSPORT_DATA_VALUE__VALUE);

		publicTransportDataValueObjectEClass = createEClass(PUBLIC_TRANSPORT_DATA_VALUE_OBJECT);

		publicTransportTelegramEClass = createEClass(PUBLIC_TRANSPORT_TELEGRAM);

		publicTransportPositionEClass = createEClass(PUBLIC_TRANSPORT_POSITION);
		createEReference(publicTransportPositionEClass, PUBLIC_TRANSPORT_POSITION__POSITION);

		publicTransportDoorChangeEClass = createEClass(PUBLIC_TRANSPORT_DOOR_CHANGE);
		createEAttribute(publicTransportDoorChangeEClass, PUBLIC_TRANSPORT_DOOR_CHANGE__TYPE);

		publicTransportStopEClass = createEClass(PUBLIC_TRANSPORT_STOP);
		createEReference(publicTransportStopEClass, PUBLIC_TRANSPORT_STOP__STATION);

		publicTransportLocMsgEClass = createEClass(PUBLIC_TRANSPORT_LOC_MSG);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__COUNTER);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__KILOMETER);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__POS_STATE);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__GPS);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__ODO);
		createEAttribute(publicTransportLocMsgEClass, PUBLIC_TRANSPORT_LOC_MSG__DOOR);

		// Create enums
		deviceActivationTypeEEnum = createEEnum(DEVICE_ACTIVATION_TYPE);
		clearAreaTypeEEnum = createEEnum(CLEAR_AREA_TYPE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		scheduleModeTypeEEnum = createEEnum(SCHEDULE_MODE_TYPE);
		timeTableModeTypeEEnum = createEEnum(TIME_TABLE_MODE_TYPE);
		parameterDataTypeEEnum = createEEnum(PARAMETER_DATA_TYPE);
		intersectionStateTypeEEnum = createEEnum(INTERSECTION_STATE_TYPE);
		lifeCycleDeviceTypeEEnum = createEEnum(LIFE_CYCLE_DEVICE_TYPE);
		outputElementTypeEEnum = createEEnum(OUTPUT_ELEMENT_TYPE);
		publicTransportTypeEEnum = createEEnum(PUBLIC_TRANSPORT_TYPE);
		publicTransportDataValueTypeEEnum = createEEnum(PUBLIC_TRANSPORT_DATA_VALUE_TYPE);
		publicTransportDoorChangeTypeEEnum = createEEnum(PUBLIC_TRANSPORT_DOOR_CHANGE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deviceGroupEClass.getESuperTypes().add(this.getDevice());
		deviceEClass.getESuperTypes().add(this.getLocalizable());
		intersectionEClass.getESuperTypes().add(this.getAbstractDataEntry());
		conflictingLaneEClass.getESuperTypes().add(this.getLane());
		incomingLaneEClass.getESuperTypes().add(this.getConflictingLane());
		outgoingLaneEClass.getESuperTypes().add(this.getLane());
		pedestrianLaneEClass.getESuperTypes().add(this.getConflictingLane());
		programEClass.getESuperTypes().add(this.getIdNameElement());
		programTransitionEClass.getESuperTypes().add(this.getProgramEntry());
		outputEClass.getESuperTypes().add(this.getIdNameElement());
		outputEClass.getESuperTypes().add(this.getLocalizable());
		networkLocationEClass.getESuperTypes().add(this.getLocation());
		positionEClass.getESuperTypes().add(this.getLocation());
		addressLocationEClass.getESuperTypes().add(this.getLocation());
		timeTableEClass.getESuperTypes().add(this.getIdNameElement());
		timeTableEntryEClass.getESuperTypes().add(this.getAbstractTimeTableEntry());
		dataEntryEClass.getESuperTypes().add(this.getAbstractDataEntry());
		parameterEClass.getESuperTypes().add(this.getIdNameElement());
		cacheDataEntryEClass.getESuperTypes().add(this.getDataEntry());
		publicTransportLaneEClass.getESuperTypes().add(this.getConflictingLane());
		cycleLaneEClass.getESuperTypes().add(this.getConflictingLane());
		publicTransportStationEClass.getESuperTypes().add(this.getIdNameElement());
		publicTransportTimeTableEClass.getESuperTypes().add(this.getIdNameElement());
		publicTransportTimeTableEntryEClass.getESuperTypes().add(this.getAbstractTimeTableEntry());
		publicTransportProgramEClass.getESuperTypes().add(this.getIdNameElement());
		publicTransportLineEClass.getESuperTypes().add(this.getIdNameElement());
		publicTransportConfigurationEClass.getESuperTypes().add(this.getIdNameElement());
		publicTransportDataEntryEClass.getESuperTypes().add(this.getAbstractDataEntry());
		publicTransportDataValueObjectEClass.getESuperTypes().add(this.getIdNameElement());
		publicTransportTelegramEClass.getESuperTypes().add(this.getPublicTransportDataValueObject());
		publicTransportPositionEClass.getESuperTypes().add(this.getPublicTransportDataValueObject());
		publicTransportDoorChangeEClass.getESuperTypes().add(this.getPublicTransportPosition());
		publicTransportLocMsgEClass.getESuperTypes().add(this.getPublicTransportDataValueObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceGroupEClass, DeviceGroup.class, "DeviceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceGroup_Device(), this.getDevice(), null, "device", null, 0, -1, DeviceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDeviceGroup_Device().getEKeys().add(this.getDevice_Id());

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Id(), ecorePackage.getEString(), "id", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ActivationState(), this.getDeviceActivationType(), "activationState", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Configuration(), this.getDeviceConfiguration(), null, "configuration", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_DeviceInformation(), this.getDeviceInfo(), null, "deviceInformation", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_SystemInformation(), this.getSystemInfo(), null, "systemInformation", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_LifeCycleType(), this.getLifeCycleDeviceType(), "lifeCycleType", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemInfoEClass, SystemInfo.class, "SystemInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemInfo_HardwareType(), ecorePackage.getEString(), "hardwareType", null, 0, 1, SystemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_HardwareRev(), ecorePackage.getEString(), "hardwareRev", null, 0, 1, SystemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_OsType(), ecorePackage.getEString(), "osType", null, 0, 1, SystemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_OsRev(), ecorePackage.getEString(), "osRev", null, 0, 1, SystemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_SoftwareType(), ecorePackage.getEString(), "softwareType", null, 0, 1, SystemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_SoftwareRev(), ecorePackage.getEString(), "softwareRev", null, 0, 1, SystemInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInfoEClass, DeviceInfo.class, "DeviceInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceInfo_TechnicalName(), ecorePackage.getEString(), "technicalName", null, 0, 1, DeviceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceInfo_HumanReadableName(), ecorePackage.getEString(), "humanReadableName", null, 0, 1, DeviceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceInfo_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, DeviceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceInfo_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeviceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceConfigurationEClass, DeviceConfiguration.class, "DeviceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceConfiguration_Id(), ecorePackage.getEString(), "id", null, 0, 1, DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfiguration_Intersection(), this.getIntersection(), null, "intersection", null, 1, -1, DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceConfiguration_CurrentIntersection(), this.getIntersection(), null, "currentIntersection", null, 0, 1, DeviceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intersectionEClass, Intersection.class, "Intersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntersection_Road(), this.getRoad(), null, "road", null, 1, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntersection_Road().getEKeys().add(this.getRoad_Id());
		initEReference(getIntersection_Link(), this.getLink(), null, "link", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntersection_Link().getEKeys().add(this.getLink_Index());
		initEReference(getIntersection_Phase(), this.getPhase(), null, "phase", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_PhaseGroup(), this.getPhaseGroup(), null, "phaseGroup", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_TimeTable(), this.getTimeTable(), null, "timeTable", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntersection_TimeTable().getEKeys().add(this.getIdNameElement_Id());
		initEReference(getIntersection_Output(), this.getOutput(), null, "output", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_Program(), this.getProgram(), null, "program", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntersection_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersection_State(), this.getIntersectionStateType(), "state", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersection_Description(), ecorePackage.getEString(), "description", null, 0, 1, Intersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roadEClass, Road.class, "Road", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoad_Id(), ecorePackage.getEString(), "id", null, 1, 1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoad_MainRoad(), ecorePackage.getEBoolean(), "mainRoad", null, 1, 1, Road.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getLane_Direction(), this.getDirectionType(), "direction", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Detector(), this.getOutput(), null, "detector", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictingLaneEClass, ConflictingLane.class, "ConflictingLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflictingLane_ConflictingLane(), this.getConflictingLane(), null, "conflictingLane", null, 0, -1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConflictingLane_ConflictingLane().getEKeys().add(this.getLane_Id());
		initEReference(getConflictingLane_ConflictingLink(), this.getLink(), null, "conflictingLink", null, 0, -1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConflictingLane_ConflictingLink().getEKeys().add(this.getLink_Index());
		initEReference(getConflictingLane_SignalGroup(), this.getOutput(), null, "signalGroup", null, 0, 1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictingLane_SignalGroups(), this.getOutput(), null, "signalGroups", null, 0, -1, ConflictingLane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomingLaneEClass, IncomingLane.class, "IncomingLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outgoingLaneEClass, OutgoingLane.class, "OutgoingLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pedestrianLaneEClass, PedestrianLane.class, "PedestrianLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(idNameElementEClass, IdNameElement.class, "IdNameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdNameElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdNameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdNameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Type(), ecorePackage.getEString(), "type", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizableEClass, Localizable.class, "Localizable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalizable_Location(), this.getLocation(), null, "location", null, 0, -1, Localizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLocationEClass, NetworkLocation.class, "NetworkLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLocation_Ip4Address(), ecorePackage.getEString(), "ip4Address", null, 0, 1, NetworkLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLocation_Ip6Address(), ecorePackage.getEString(), "ip6Address", null, 0, 1, NetworkLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLocation_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, NetworkLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Latitude(), ecorePackage.getEDouble(), "latitude", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Longitude(), ecorePackage.getEDouble(), "longitude", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Altitude(), ecorePackage.getEDouble(), "altitude", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Orientation(), this.getDirectionType(), "orientation", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Bearing(), ecorePackage.getEInt(), "bearing", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressLocationEClass, AddressLocation.class, "AddressLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressLocation_Location(), ecorePackage.getEString(), "location", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressLocation_Street(), ecorePackage.getEString(), "street", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressLocation_Zip(), ecorePackage.getEString(), "zip", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressLocation_District(), ecorePackage.getEString(), "district", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTableEClass, TimeTable.class, "TimeTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeTable_Entry(), this.getTimeTableEntry(), null, "entry", null, 0, -1, TimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTable_DefaultMode(), this.getTimeTableModeType(), "defaultMode", null, 0, 1, TimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTableEntryEClass, TimeTableEntry.class, "TimeTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeTableEntry_Program(), this.getProgram(), null, "program", null, 1, 1, TimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTimeTableEntry_Program().getEKeys().add(this.getIdNameElement_Id());

		initEClass(dataEntryEClass, DataEntry.class, "DataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataEntry_Value(), this.getDataValue(), null, "value", null, 0, -1, DataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntry_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1, DataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntry_Device(), ecorePackage.getEString(), "device", null, 0, 1, DataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValue_Element(), this.getIdNameElement(), null, "element", null, 1, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValue_ElementRef(), this.getIdNameElement(), null, "elementRef", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_DataType(), this.getParameterDataType(), "dataType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheDataEntryEClass, CacheDataEntry.class, "CacheDataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalTableEClass, SignalTable.class, "SignalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalTable_CacheDataEntry(), this.getCacheDataEntry(), null, "cacheDataEntry", null, 0, -1, SignalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareConfigurationEClass, HardwareConfiguration.class, "HardwareConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareConfiguration_Id(), ecorePackage.getEString(), "id", null, 0, 1, HardwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareConfiguration_PinConfiguration(), this.getOutputConfiguration(), null, "pinConfiguration", null, 0, -1, HardwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareConfiguration_DeviceId(), ecorePackage.getEString(), "deviceId", null, 1, 1, HardwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareConfiguration_DeviceConfigurationId(), ecorePackage.getEString(), "deviceConfigurationId", null, 1, 1, HardwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputConfigurationEClass, OutputConfiguration.class, "OutputConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputConfiguration_Output(), this.getOutput(), null, "output", null, 1, 1, OutputConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputConfiguration_Pin(), this.getOutPinConfiguration(), null, "pin", null, 2, 3, OutputConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outPinConfigurationEClass, OutPinConfiguration.class, "OutPinConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutPinConfiguration_Pin(), ecorePackage.getEInt(), "pin", null, 1, 1, OutPinConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutPinConfiguration_Gpio(), ecorePackage.getEInt(), "gpio", null, 1, 1, OutPinConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutPinConfiguration_Type(), this.getOutputElementType(), "type", null, 0, 1, OutPinConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutPinConfiguration_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, OutPinConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportLaneEClass, PublicTransportLane.class, "PublicTransportLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cycleLaneEClass, CycleLane.class, "CycleLane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractDataEntryEClass, AbstractDataEntry.class, "AbstractDataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDataEntry_Id(), ecorePackage.getEString(), "id", null, 1, 1, AbstractDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDataEntry_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, AbstractDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDataEntry_Index(), ecorePackage.getELong(), "index", null, 1, 1, AbstractDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportStationEClass, PublicTransportStation.class, "PublicTransportStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicTransportTimeTableEClass, PublicTransportTimeTable.class, "PublicTransportTimeTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportTimeTable_Entry(), this.getPublicTransportTimeTableEntry(), null, "entry", null, 0, -1, PublicTransportTimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportTimeTable_Type(), this.getScheduleModeType(), "type", null, 0, 1, PublicTransportTimeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTimeTableEntryEClass, AbstractTimeTableEntry.class, "AbstractTimeTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTimeTableEntry_Index(), ecorePackage.getEInt(), "index", null, 1, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTimeTableEntry_Mode(), this.getScheduleModeType(), "mode", null, 0, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTimeTableEntry_Begin(), ecorePackage.getELong(), "begin", null, 1, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTimeTableEntry_End(), ecorePackage.getELong(), "end", null, 1, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportTimeTableEntryEClass, PublicTransportTimeTableEntry.class, "PublicTransportTimeTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportTimeTableEntry_FirstStation(), this.getPublicTransportStation(), null, "firstStation", null, 1, 1, PublicTransportTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicTransportTimeTableEntry_LastStation(), this.getPublicTransportStation(), null, "lastStation", null, 1, 1, PublicTransportTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicTransportTimeTableEntry_Stops(), this.getPublicTransportStop(), null, "stops", null, 0, -1, PublicTransportTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportProgramEClass, PublicTransportProgram.class, "PublicTransportProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportProgram_DataEntry(), this.getPublicTransportDataEntry(), null, "dataEntry", null, 0, -1, PublicTransportProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportLineEClass, PublicTransportLine.class, "PublicTransportLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicTransportLine_Type(), this.getPublicTransportType(), "type", null, 0, 1, PublicTransportLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicTransportLine_TimeTable(), this.getPublicTransportTimeTable(), null, "timeTable", null, 0, -1, PublicTransportLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLine_LineNumber(), ecorePackage.getEString(), "lineNumber", null, 0, 1, PublicTransportLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportConfigurationEClass, PublicTransportConfiguration.class, "PublicTransportConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportConfiguration_PublicTransport(), this.getPublicTransportLine(), null, "publicTransport", null, 0, -1, PublicTransportConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportDataEntryEClass, PublicTransportDataEntry.class, "PublicTransportDataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportDataEntry_DataValue(), this.getPublicTransportDataValue(), null, "dataValue", null, 0, -1, PublicTransportDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportDataValueEClass, PublicTransportDataValue.class, "PublicTransportDataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicTransportDataValue_Type(), this.getPublicTransportDataValueType(), "type", null, 0, 1, PublicTransportDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicTransportDataValue_LineRef(), this.getIdNameElement(), null, "lineRef", null, 0, 1, PublicTransportDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicTransportDataValue_Value(), this.getPublicTransportDataValueObject(), null, "value", null, 0, 1, PublicTransportDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportDataValueObjectEClass, PublicTransportDataValueObject.class, "PublicTransportDataValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicTransportTelegramEClass, PublicTransportTelegram.class, "PublicTransportTelegram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicTransportPositionEClass, PublicTransportPosition.class, "PublicTransportPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportPosition_Position(), this.getPosition(), null, "position", null, 0, 1, PublicTransportPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportDoorChangeEClass, PublicTransportDoorChange.class, "PublicTransportDoorChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicTransportDoorChange_Type(), this.getPublicTransportDoorChangeType(), "type", null, 0, 1, PublicTransportDoorChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportStopEClass, PublicTransportStop.class, "PublicTransportStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicTransportStop_Station(), this.getPublicTransportStation(), null, "station", null, 0, 1, PublicTransportStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicTransportLocMsgEClass, PublicTransportLocMsg.class, "PublicTransportLocMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicTransportLocMsg_LineNum(), ecorePackage.getEString(), "lineNum", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_TripNum(), ecorePackage.getEString(), "tripNum", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_RouteNum(), ecorePackage.getEString(), "routeNum", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_TravelNum(), ecorePackage.getEString(), "travelNum", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_Counter(), ecorePackage.getEInt(), "counter", null, 1, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_Kilometer(), ecorePackage.getEInt(), "kilometer", null, 1, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_PosState(), ecorePackage.getEString(), "posState", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_LastStop(), ecorePackage.getEString(), "lastStop", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_NextStop(), ecorePackage.getEString(), "nextStop", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_ActualTime(), ecorePackage.getEInt(), "actualTime", null, 1, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_ExpectedTime(), ecorePackage.getEInt(), "expectedTime", null, 1, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_Gps(), ecorePackage.getEString(), "gps", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_Odo(), ecorePackage.getEString(), "odo", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicTransportLocMsg_Door(), ecorePackage.getEString(), "door", null, 0, 1, PublicTransportLocMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deviceActivationTypeEEnum, DeviceActivationType.class, "DeviceActivationType");
		addEEnumLiteral(deviceActivationTypeEEnum, DeviceActivationType.INACTIVE);
		addEEnumLiteral(deviceActivationTypeEEnum, DeviceActivationType.ACTIVE);
		addEEnumLiteral(deviceActivationTypeEEnum, DeviceActivationType.DELETED);
		addEEnumLiteral(deviceActivationTypeEEnum, DeviceActivationType.UNKNOWN);

		initEEnum(clearAreaTypeEEnum, ClearAreaType.class, "ClearAreaType");
		addEEnumLiteral(clearAreaTypeEEnum, ClearAreaType.CLEAR_PEDESTRIAN);
		addEEnumLiteral(clearAreaTypeEEnum, ClearAreaType.CLEAR_MAIN);
		addEEnumLiteral(clearAreaTypeEEnum, ClearAreaType.CLEAR_SECONDARY);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.TURN_RIGHT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.TURN_LEFT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.OTHER);
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT_TURNS);
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT_LEFT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT_RIGHT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.LEFT_RIGHT);

		initEEnum(scheduleModeTypeEEnum, ScheduleModeType.class, "ScheduleModeType");
		addEEnumLiteral(scheduleModeTypeEEnum, ScheduleModeType.EVERY_DAY);
		addEEnumLiteral(scheduleModeTypeEEnum, ScheduleModeType.WEEKEND);
		addEEnumLiteral(scheduleModeTypeEEnum, ScheduleModeType.WORKING_DAY);

		initEEnum(timeTableModeTypeEEnum, TimeTableModeType.class, "TimeTableModeType");
		addEEnumLiteral(timeTableModeTypeEEnum, TimeTableModeType.OFF);

		initEEnum(parameterDataTypeEEnum, ParameterDataType.class, "ParameterDataType");
		addEEnumLiteral(parameterDataTypeEEnum, ParameterDataType.STRING);
		addEEnumLiteral(parameterDataTypeEEnum, ParameterDataType.INTEGER);
		addEEnumLiteral(parameterDataTypeEEnum, ParameterDataType.DATE);

		initEEnum(intersectionStateTypeEEnum, IntersectionStateType.class, "IntersectionStateType");
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.UNKNOWN);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.NONE);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.ENABLED);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_DARK);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_FLASH_SECONDARY);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_FLASH_ALL);
		addEEnumLiteral(intersectionStateTypeEEnum, IntersectionStateType.DISABLED_DEFAULT);

		initEEnum(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.class, "LifeCycleDeviceType");
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.NONE);
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.LOADING);
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.PROVISIONED);
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.UNPROVISIONED);
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.RUNNING);
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.ON_ERROR);
		addEEnumLiteral(lifeCycleDeviceTypeEEnum, LifeCycleDeviceType.EXCEPTIONAL);

		initEEnum(outputElementTypeEEnum, OutputElementType.class, "OutputElementType");
		addEEnumLiteral(outputElementTypeEEnum, OutputElementType.OTHER);
		addEEnumLiteral(outputElementTypeEEnum, OutputElementType.RED);
		addEEnumLiteral(outputElementTypeEEnum, OutputElementType.AMBER);
		addEEnumLiteral(outputElementTypeEEnum, OutputElementType.GREEN);
		addEEnumLiteral(outputElementTypeEEnum, OutputElementType.BEEP);

		initEEnum(publicTransportTypeEEnum, PublicTransportType.class, "PublicTransportType");
		addEEnumLiteral(publicTransportTypeEEnum, PublicTransportType.TRAM);
		addEEnumLiteral(publicTransportTypeEEnum, PublicTransportType.BUS);

		initEEnum(publicTransportDataValueTypeEEnum, PublicTransportDataValueType.class, "PublicTransportDataValueType");
		addEEnumLiteral(publicTransportDataValueTypeEEnum, PublicTransportDataValueType.UNKNOWN);
		addEEnumLiteral(publicTransportDataValueTypeEEnum, PublicTransportDataValueType.DOOR_CHANGE);
		addEEnumLiteral(publicTransportDataValueTypeEEnum, PublicTransportDataValueType.TELEGRAM);
		addEEnumLiteral(publicTransportDataValueTypeEEnum, PublicTransportDataValueType.GEO_INFO);
		addEEnumLiteral(publicTransportDataValueTypeEEnum, PublicTransportDataValueType.LOCATION_MESSAGE);

		initEEnum(publicTransportDoorChangeTypeEEnum, PublicTransportDoorChangeType.class, "PublicTransportDoorChangeType");
		addEEnumLiteral(publicTransportDoorChangeTypeEEnum, PublicTransportDoorChangeType.DOOR_CLOSE);
		addEEnumLiteral(publicTransportDoorChangeTypeEEnum, PublicTransportDoorChangeType.DOOR_OPEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //TOSDevicePackageImpl
