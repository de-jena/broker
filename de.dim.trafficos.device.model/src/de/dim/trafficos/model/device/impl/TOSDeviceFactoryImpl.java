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

import de.dim.trafficos.model.device.*;

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
public class TOSDeviceFactoryImpl extends EFactoryImpl implements TOSDeviceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TOSDeviceFactory init() {
		try {
			TOSDeviceFactory theTOSDeviceFactory = (TOSDeviceFactory)EPackage.Registry.INSTANCE.getEFactory(TOSDevicePackage.eNS_URI);
			if (theTOSDeviceFactory != null) {
				return theTOSDeviceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TOSDeviceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSDeviceFactoryImpl() {
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
			case TOSDevicePackage.DEVICE_GROUP: return createDeviceGroup();
			case TOSDevicePackage.DEVICE: return createDevice();
			case TOSDevicePackage.SYSTEM_INFO: return createSystemInfo();
			case TOSDevicePackage.DEVICE_INFO: return createDeviceInfo();
			case TOSDevicePackage.DEVICE_CONFIGURATION: return createDeviceConfiguration();
			case TOSDevicePackage.INTERSECTION: return createIntersection();
			case TOSDevicePackage.ROAD: return createRoad();
			case TOSDevicePackage.LANE: return createLane();
			case TOSDevicePackage.CONFLICTING_LANE: return createConflictingLane();
			case TOSDevicePackage.INCOMING_LANE: return createIncomingLane();
			case TOSDevicePackage.OUTGOING_LANE: return createOutgoingLane();
			case TOSDevicePackage.PEDESTRIAN_LANE: return createPedestrianLane();
			case TOSDevicePackage.LINK: return createLink();
			case TOSDevicePackage.PHASE: return createPhase();
			case TOSDevicePackage.PROGRAM_ENTRY: return createProgramEntry();
			case TOSDevicePackage.PROGRAM: return createProgram();
			case TOSDevicePackage.TRANSITION: return createTransition();
			case TOSDevicePackage.PROGRAM_TRANSITION: return createProgramTransition();
			case TOSDevicePackage.CLEAR_AREA: return createClearArea();
			case TOSDevicePackage.PHASE_GROUP: return createPhaseGroup();
			case TOSDevicePackage.ID_NAME_ELEMENT: return createIdNameElement();
			case TOSDevicePackage.OUTPUT: return createOutput();
			case TOSDevicePackage.LOCALIZABLE: return createLocalizable();
			case TOSDevicePackage.LOCATION: return createLocation();
			case TOSDevicePackage.NETWORK_LOCATION: return createNetworkLocation();
			case TOSDevicePackage.POSITION: return createPosition();
			case TOSDevicePackage.ADDRESS_LOCATION: return createAddressLocation();
			case TOSDevicePackage.TIME_TABLE: return createTimeTable();
			case TOSDevicePackage.TIME_TABLE_ENTRY: return createTimeTableEntry();
			case TOSDevicePackage.DATA_ENTRY: return createDataEntry();
			case TOSDevicePackage.DATA_VALUE: return createDataValue();
			case TOSDevicePackage.PARAMETER: return createParameter();
			case TOSDevicePackage.CACHE_DATA_ENTRY: return createCacheDataEntry();
			case TOSDevicePackage.SIGNAL_TABLE: return createSignalTable();
			case TOSDevicePackage.HARDWARE_CONFIGURATION: return createHardwareConfiguration();
			case TOSDevicePackage.OUTPUT_CONFIGURATION: return createOutputConfiguration();
			case TOSDevicePackage.OUT_PIN_CONFIGURATION: return createOutPinConfiguration();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LANE: return createPublicTransportLane();
			case TOSDevicePackage.CYCLE_LANE: return createCycleLane();
			case TOSDevicePackage.ABSTRACT_DATA_ENTRY: return createAbstractDataEntry();
			case TOSDevicePackage.PUBLIC_TRANSPORT_STATION: return createPublicTransportStation();
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE: return createPublicTransportTimeTable();
			case TOSDevicePackage.ABSTRACT_TIME_TABLE_ENTRY: return createAbstractTimeTableEntry();
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY: return createPublicTransportTimeTableEntry();
			case TOSDevicePackage.PUBLIC_TRANSPORT_PROGRAM: return createPublicTransportProgram();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE: return createPublicTransportLine();
			case TOSDevicePackage.PUBLIC_TRANSPORT_CONFIGURATION: return createPublicTransportConfiguration();
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_ENTRY: return createPublicTransportDataEntry();
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE: return createPublicTransportDataValue();
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE_OBJECT: return createPublicTransportDataValueObject();
			case TOSDevicePackage.PUBLIC_TRANSPORT_TELEGRAM: return createPublicTransportTelegram();
			case TOSDevicePackage.PUBLIC_TRANSPORT_POSITION: return createPublicTransportPosition();
			case TOSDevicePackage.PUBLIC_TRANSPORT_DOOR_CHANGE: return createPublicTransportDoorChange();
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP: return createPublicTransportStop();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG: return createPublicTransportLocMsg();
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
			case TOSDevicePackage.DEVICE_ACTIVATION_TYPE:
				return createDeviceActivationTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.CLEAR_AREA_TYPE:
				return createClearAreaTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.SCHEDULE_MODE_TYPE:
				return createScheduleModeTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.TIME_TABLE_MODE_TYPE:
				return createTimeTableModeTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.PARAMETER_DATA_TYPE:
				return createParameterDataTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.INTERSECTION_STATE_TYPE:
				return createIntersectionStateTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.LIFE_CYCLE_DEVICE_TYPE:
				return createLifeCycleDeviceTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.OUTPUT_ELEMENT_TYPE:
				return createOutputElementTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.PUBLIC_TRANSPORT_TYPE:
				return createPublicTransportTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE_TYPE:
				return createPublicTransportDataValueTypeFromString(eDataType, initialValue);
			case TOSDevicePackage.PUBLIC_TRANSPORT_DOOR_CHANGE_TYPE:
				return createPublicTransportDoorChangeTypeFromString(eDataType, initialValue);
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
			case TOSDevicePackage.DEVICE_ACTIVATION_TYPE:
				return convertDeviceActivationTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.CLEAR_AREA_TYPE:
				return convertClearAreaTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.SCHEDULE_MODE_TYPE:
				return convertScheduleModeTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.TIME_TABLE_MODE_TYPE:
				return convertTimeTableModeTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.PARAMETER_DATA_TYPE:
				return convertParameterDataTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.INTERSECTION_STATE_TYPE:
				return convertIntersectionStateTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.LIFE_CYCLE_DEVICE_TYPE:
				return convertLifeCycleDeviceTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.OUTPUT_ELEMENT_TYPE:
				return convertOutputElementTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.PUBLIC_TRANSPORT_TYPE:
				return convertPublicTransportTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE_TYPE:
				return convertPublicTransportDataValueTypeToString(eDataType, instanceValue);
			case TOSDevicePackage.PUBLIC_TRANSPORT_DOOR_CHANGE_TYPE:
				return convertPublicTransportDoorChangeTypeToString(eDataType, instanceValue);
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
	public DeviceGroup createDeviceGroup() {
		DeviceGroupImpl deviceGroup = new DeviceGroupImpl();
		return deviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInfo createSystemInfo() {
		SystemInfoImpl systemInfo = new SystemInfoImpl();
		return systemInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInfo createDeviceInfo() {
		DeviceInfoImpl deviceInfo = new DeviceInfoImpl();
		return deviceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConfiguration createDeviceConfiguration() {
		DeviceConfigurationImpl deviceConfiguration = new DeviceConfigurationImpl();
		return deviceConfiguration;
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
	public IdNameElement createIdNameElement() {
		IdNameElementImpl idNameElement = new IdNameElementImpl();
		return idNameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Localizable createLocalizable() {
		LocalizableImpl localizable = new LocalizableImpl();
		return localizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLocation createNetworkLocation() {
		NetworkLocationImpl networkLocation = new NetworkLocationImpl();
		return networkLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressLocation createAddressLocation() {
		AddressLocationImpl addressLocation = new AddressLocationImpl();
		return addressLocation;
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
	public DataEntry createDataEntry() {
		DataEntryImpl dataEntry = new DataEntryImpl();
		return dataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
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
	public HardwareConfiguration createHardwareConfiguration() {
		HardwareConfigurationImpl hardwareConfiguration = new HardwareConfigurationImpl();
		return hardwareConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputConfiguration createOutputConfiguration() {
		OutputConfigurationImpl outputConfiguration = new OutputConfigurationImpl();
		return outputConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutPinConfiguration createOutPinConfiguration() {
		OutPinConfigurationImpl outPinConfiguration = new OutPinConfigurationImpl();
		return outPinConfiguration;
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
	public AbstractDataEntry createAbstractDataEntry() {
		AbstractDataEntryImpl abstractDataEntry = new AbstractDataEntryImpl();
		return abstractDataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportStation createPublicTransportStation() {
		PublicTransportStationImpl publicTransportStation = new PublicTransportStationImpl();
		return publicTransportStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportTimeTable createPublicTransportTimeTable() {
		PublicTransportTimeTableImpl publicTransportTimeTable = new PublicTransportTimeTableImpl();
		return publicTransportTimeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimeTableEntry createAbstractTimeTableEntry() {
		AbstractTimeTableEntryImpl abstractTimeTableEntry = new AbstractTimeTableEntryImpl();
		return abstractTimeTableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportTimeTableEntry createPublicTransportTimeTableEntry() {
		PublicTransportTimeTableEntryImpl publicTransportTimeTableEntry = new PublicTransportTimeTableEntryImpl();
		return publicTransportTimeTableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportProgram createPublicTransportProgram() {
		PublicTransportProgramImpl publicTransportProgram = new PublicTransportProgramImpl();
		return publicTransportProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportLine createPublicTransportLine() {
		PublicTransportLineImpl publicTransportLine = new PublicTransportLineImpl();
		return publicTransportLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportConfiguration createPublicTransportConfiguration() {
		PublicTransportConfigurationImpl publicTransportConfiguration = new PublicTransportConfigurationImpl();
		return publicTransportConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportDataEntry createPublicTransportDataEntry() {
		PublicTransportDataEntryImpl publicTransportDataEntry = new PublicTransportDataEntryImpl();
		return publicTransportDataEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportDataValue createPublicTransportDataValue() {
		PublicTransportDataValueImpl publicTransportDataValue = new PublicTransportDataValueImpl();
		return publicTransportDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportDataValueObject createPublicTransportDataValueObject() {
		PublicTransportDataValueObjectImpl publicTransportDataValueObject = new PublicTransportDataValueObjectImpl();
		return publicTransportDataValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportTelegram createPublicTransportTelegram() {
		PublicTransportTelegramImpl publicTransportTelegram = new PublicTransportTelegramImpl();
		return publicTransportTelegram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportPosition createPublicTransportPosition() {
		PublicTransportPositionImpl publicTransportPosition = new PublicTransportPositionImpl();
		return publicTransportPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportDoorChange createPublicTransportDoorChange() {
		PublicTransportDoorChangeImpl publicTransportDoorChange = new PublicTransportDoorChangeImpl();
		return publicTransportDoorChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportStop createPublicTransportStop() {
		PublicTransportStopImpl publicTransportStop = new PublicTransportStopImpl();
		return publicTransportStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportLocMsg createPublicTransportLocMsg() {
		PublicTransportLocMsgImpl publicTransportLocMsg = new PublicTransportLocMsgImpl();
		return publicTransportLocMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceActivationType createDeviceActivationTypeFromString(EDataType eDataType, String initialValue) {
		DeviceActivationType result = DeviceActivationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceActivationTypeToString(EDataType eDataType, Object instanceValue) {
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
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleModeType createScheduleModeTypeFromString(EDataType eDataType, String initialValue) {
		ScheduleModeType result = ScheduleModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScheduleModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public ParameterDataType createParameterDataTypeFromString(EDataType eDataType, String initialValue) {
		ParameterDataType result = ParameterDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDataTypeToString(EDataType eDataType, Object instanceValue) {
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
	public LifeCycleDeviceType createLifeCycleDeviceTypeFromString(EDataType eDataType, String initialValue) {
		LifeCycleDeviceType result = LifeCycleDeviceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifeCycleDeviceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputElementType createOutputElementTypeFromString(EDataType eDataType, String initialValue) {
		OutputElementType result = OutputElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicTransportType createPublicTransportTypeFromString(EDataType eDataType, String initialValue) {
		PublicTransportType result = PublicTransportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicTransportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicTransportDataValueType createPublicTransportDataValueTypeFromString(EDataType eDataType, String initialValue) {
		PublicTransportDataValueType result = PublicTransportDataValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicTransportDataValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicTransportDoorChangeType createPublicTransportDoorChangeTypeFromString(EDataType eDataType, String initialValue) {
		PublicTransportDoorChangeType result = PublicTransportDoorChangeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicTransportDoorChangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSDevicePackage getTOSDevicePackage() {
		return (TOSDevicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TOSDevicePackage getPackage() {
		return TOSDevicePackage.eINSTANCE;
	}

} //TOSDeviceFactoryImpl
