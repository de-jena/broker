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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDeviceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = TOSDevicePackage.eNS_URI, genModel = "/model/device.genmodel", genModelSourceLocations = {"model/device.genmodel","de.dim.trafficos.device.model/model/device.genmodel"}, ecore="/model/device.ecore", ecoreSourceLocations="/model/device.ecore")
public interface TOSDevicePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "device";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datainmotion.de/trafficos/device/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "device";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "device#1.0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSDevicePackage eINSTANCE = de.dim.trafficos.model.device.impl.TOSDevicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.LocalizableImpl <em>Localizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.LocalizableImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLocalizable()
	 * @generated
	 */
	int LOCALIZABLE = 22;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZABLE__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Localizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Localizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.DeviceImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__LOCATION = LOCALIZABLE__LOCATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = LOCALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ACTIVATION_STATE = LOCALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONFIGURATION = LOCALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_INFORMATION = LOCALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SYSTEM_INFORMATION = LOCALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Life Cycle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__LIFE_CYCLE_TYPE = LOCALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = LOCALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = LOCALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.DeviceGroupImpl <em>Device Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.DeviceGroupImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceGroup()
	 * @generated
	 */
	int DEVICE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__LOCATION = DEVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__ID = DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Activation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__ACTIVATION_STATE = DEVICE__ACTIVATION_STATE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__CONFIGURATION = DEVICE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__DEVICE_INFORMATION = DEVICE__DEVICE_INFORMATION;

	/**
	 * The feature id for the '<em><b>System Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__SYSTEM_INFORMATION = DEVICE__SYSTEM_INFORMATION;

	/**
	 * The feature id for the '<em><b>Life Cycle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__LIFE_CYCLE_TYPE = DEVICE__LIFE_CYCLE_TYPE;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP__DEVICE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_GROUP_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.SystemInfoImpl <em>System Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.SystemInfoImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getSystemInfo()
	 * @generated
	 */
	int SYSTEM_INFO = 2;

	/**
	 * The feature id for the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO__HARDWARE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Hardware Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO__HARDWARE_REV = 1;

	/**
	 * The feature id for the '<em><b>Os Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO__OS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Os Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO__OS_REV = 3;

	/**
	 * The feature id for the '<em><b>Software Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO__SOFTWARE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Software Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO__SOFTWARE_REV = 5;

	/**
	 * The number of structural features of the '<em>System Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>System Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.DeviceInfoImpl <em>Device Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.DeviceInfoImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceInfo()
	 * @generated
	 */
	int DEVICE_INFO = 3;

	/**
	 * The feature id for the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFO__TECHNICAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Human Readable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFO__HUMAN_READABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFO__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFO__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Device Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.DeviceConfigurationImpl <em>Device Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.DeviceConfigurationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceConfiguration()
	 * @generated
	 */
	int DEVICE_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Intersection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__INTERSECTION = 1;

	/**
	 * The feature id for the '<em><b>Current Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION__CURRENT_INTERSECTION = 2;

	/**
	 * The number of structural features of the '<em>Device Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.AbstractDataEntryImpl <em>Abstract Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.AbstractDataEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getAbstractDataEntry()
	 * @generated
	 */
	int ABSTRACT_DATA_ENTRY = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY__INDEX = 2;

	/**
	 * The number of structural features of the '<em>Abstract Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.IntersectionImpl <em>Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.IntersectionImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIntersection()
	 * @generated
	 */
	int INTERSECTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__ID = ABSTRACT_DATA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__TIMESTAMP = ABSTRACT_DATA_ENTRY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__INDEX = ABSTRACT_DATA_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Road</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__ROAD = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__LINK = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PHASE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PHASE_GROUP = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__TIME_TABLE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__OUTPUT = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PROGRAM = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__PARAMETER = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__STATE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__NAME = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__DESCRIPTION = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_FEATURE_COUNT = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_OPERATION_COUNT = ABSTRACT_DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.RoadImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__ID = 0;

	/**
	 * The feature id for the '<em><b>Main Road</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__MAIN_ROAD = 1;

	/**
	 * The feature id for the '<em><b>Incoming Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__INCOMING_LANE = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__OUTGOING_LANE = 3;

	/**
	 * The feature id for the '<em><b>Pedestrian Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__PEDESTRIAN_LANE = 4;

	/**
	 * The feature id for the '<em><b>Cycle Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__CYCLE_LANE = 5;

	/**
	 * The feature id for the '<em><b>Public Transport Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__PUBLIC_TRANSPORT_LANE = 6;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.LaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLane()
	 * @generated
	 */
	int LANE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__REF_ROAD_ID = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ROAD = 3;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__SUB_LANE = 4;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PARENT_LANE = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__INDEX = 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DIRECTION = 7;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DETECTOR = 8;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.ConflictingLaneImpl <em>Conflicting Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.ConflictingLaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getConflictingLane()
	 * @generated
	 */
	int CONFLICTING_LANE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__ID = LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__REF_ROAD_ID = LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__LINK = LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__ROAD = LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__SUB_LANE = LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__PARENT_LANE = LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__INDEX = LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__DIRECTION = LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__DETECTOR = LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__CONFLICTING_LANE = LANE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__CONFLICTING_LINK = LANE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__SIGNAL_GROUP = LANE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE__SIGNAL_GROUPS = LANE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conflicting Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE_FEATURE_COUNT = LANE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Conflicting Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTING_LANE_OPERATION_COUNT = LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.IncomingLaneImpl <em>Incoming Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.IncomingLaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIncomingLane()
	 * @generated
	 */
	int INCOMING_LANE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Incoming Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Incoming Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.OutgoingLaneImpl <em>Outgoing Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.OutgoingLaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutgoingLane()
	 * @generated
	 */
	int OUTGOING_LANE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__ID = LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__REF_ROAD_ID = LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__LINK = LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__ROAD = LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__SUB_LANE = LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__PARENT_LANE = LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__INDEX = LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__DIRECTION = LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE__DETECTOR = LANE__DETECTOR;

	/**
	 * The number of structural features of the '<em>Outgoing Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE_FEATURE_COUNT = LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outgoing Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LANE_OPERATION_COUNT = LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PedestrianLaneImpl <em>Pedestrian Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PedestrianLaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPedestrianLane()
	 * @generated
	 */
	int PEDESTRIAN_LANE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Pedestrian Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pedestrian Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.LinkImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Ref Incoming Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REF_INCOMING_LANE = 1;

	/**
	 * The feature id for the '<em><b>Ref Outgoing Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REF_OUTGOING_LANE = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PhaseImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__LANE = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Weight Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__WEIGHT_MIN = 3;

	/**
	 * The feature id for the '<em><b>Weight Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__WEIGHT_MAX = 4;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.ProgramEntryImpl <em>Program Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.ProgramEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getProgramEntry()
	 * @generated
	 */
	int PROGRAM_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__END = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Ref Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY__REF_PHASE = 3;

	/**
	 * The number of structural features of the '<em>Program Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.IdNameElementImpl <em>Id Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.IdNameElementImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIdNameElement()
	 * @generated
	 */
	int ID_NAME_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Id Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Id Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.ProgramImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LENGTH = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__OUTPUT_ENTRY = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SIGNAL_TABLE = ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.TransitionImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Ref Next Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REF_NEXT_PHASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 1;

	/**
	 * The feature id for the '<em><b>Unchanged Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNCHANGED_LANE = 2;

	/**
	 * The feature id for the '<em><b>Changed Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CHANGED_LANE = 3;

	/**
	 * The feature id for the '<em><b>Clear Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLEAR_AREA = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.ProgramTransitionImpl <em>Program Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.ProgramTransitionImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getProgramTransition()
	 * @generated
	 */
	int PROGRAM_TRANSITION = 17;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__BEGIN = PROGRAM_ENTRY__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__END = PROGRAM_ENTRY__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__DURATION = PROGRAM_ENTRY__DURATION;

	/**
	 * The feature id for the '<em><b>Ref Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__REF_PHASE = PROGRAM_ENTRY__REF_PHASE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION__TRANSITION = PROGRAM_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION_FEATURE_COUNT = PROGRAM_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_TRANSITION_OPERATION_COUNT = PROGRAM_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.ClearAreaImpl <em>Clear Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.ClearAreaImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getClearArea()
	 * @generated
	 */
	int CLEAR_AREA = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_AREA__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Clear Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clear Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PhaseGroupImpl <em>Phase Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PhaseGroupImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPhaseGroup()
	 * @generated
	 */
	int PHASE_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP__PENALTY = 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP__PHASE = 2;

	/**
	 * The number of structural features of the '<em>Phase Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phase Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.OutputImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LOCATION = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DEFAULT_VALUE = ID_NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.LocationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.NetworkLocationImpl <em>Network Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.NetworkLocationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getNetworkLocation()
	 * @generated
	 */
	int NETWORK_LOCATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Ip4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__IP4_ADDRESS = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__IP6_ADDRESS = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__HOSTNAME = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Network Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PositionImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LATITUDE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LONGITUDE = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ALTITUDE = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ORIENTATION = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bearing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__BEARING = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.AddressLocationImpl <em>Address Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.AddressLocationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getAddressLocation()
	 * @generated
	 */
	int ADDRESS_LOCATION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__LOCATION = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__STREET = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__ZIP = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__DISTRICT = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Address Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Address Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.TimeTableImpl <em>Time Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.TimeTableImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTimeTable()
	 * @generated
	 */
	int TIME_TABLE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__ENTRY = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__DEFAULT_MODE = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.AbstractTimeTableEntryImpl <em>Abstract Time Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.AbstractTimeTableEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getAbstractTimeTableEntry()
	 * @generated
	 */
	int ABSTRACT_TIME_TABLE_ENTRY = 42;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__MODE = 1;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__BEGIN = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__END = 3;

	/**
	 * The number of structural features of the '<em>Abstract Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.TimeTableEntryImpl <em>Time Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.TimeTableEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTimeTableEntry()
	 * @generated
	 */
	int TIME_TABLE_ENTRY = 28;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__INDEX = ABSTRACT_TIME_TABLE_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__MODE = ABSTRACT_TIME_TABLE_ENTRY__MODE;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__BEGIN = ABSTRACT_TIME_TABLE_ENTRY__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__END = ABSTRACT_TIME_TABLE_ENTRY__END;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY__PROGRAM = ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY_FEATURE_COUNT = ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_ENTRY_OPERATION_COUNT = ABSTRACT_TIME_TABLE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.DataEntryImpl <em>Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.DataEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDataEntry()
	 * @generated
	 */
	int DATA_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__ID = ABSTRACT_DATA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__TIMESTAMP = ABSTRACT_DATA_ENTRY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__INDEX = ABSTRACT_DATA_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__VALUE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__CONFIGURATION = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__DEVICE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY_FEATURE_COUNT = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY_OPERATION_COUNT = ABSTRACT_DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.DataValueImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__ELEMENT_REF = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__DURATION = 3;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.ParameterImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_TYPE = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.CacheDataEntryImpl <em>Cache Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.CacheDataEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getCacheDataEntry()
	 * @generated
	 */
	int CACHE_DATA_ENTRY = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__ID = DATA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__TIMESTAMP = DATA_ENTRY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__INDEX = DATA_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__VALUE = DATA_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__CONFIGURATION = DATA_ENTRY__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY__DEVICE = DATA_ENTRY__DEVICE;

	/**
	 * The number of structural features of the '<em>Cache Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY_FEATURE_COUNT = DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cache Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_ENTRY_OPERATION_COUNT = DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.SignalTableImpl <em>Signal Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.SignalTableImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getSignalTable()
	 * @generated
	 */
	int SIGNAL_TABLE = 33;

	/**
	 * The feature id for the '<em><b>Cache Data Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TABLE__CACHE_DATA_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Signal Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.HardwareConfigurationImpl <em>Hardware Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.HardwareConfigurationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getHardwareConfiguration()
	 * @generated
	 */
	int HARDWARE_CONFIGURATION = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Pin Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONFIGURATION__PIN_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONFIGURATION__DEVICE_ID = 2;

	/**
	 * The feature id for the '<em><b>Device Configuration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID = 3;

	/**
	 * The number of structural features of the '<em>Hardware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hardware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.OutputConfigurationImpl <em>Output Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.OutputConfigurationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutputConfiguration()
	 * @generated
	 */
	int OUTPUT_CONFIGURATION = 35;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONFIGURATION__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONFIGURATION__PIN = 1;

	/**
	 * The number of structural features of the '<em>Output Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.OutPinConfigurationImpl <em>Out Pin Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.OutPinConfigurationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutPinConfiguration()
	 * @generated
	 */
	int OUT_PIN_CONFIGURATION = 36;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PIN_CONFIGURATION__PIN = 0;

	/**
	 * The feature id for the '<em><b>Gpio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PIN_CONFIGURATION__GPIO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PIN_CONFIGURATION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PIN_CONFIGURATION__COMMENT = 3;

	/**
	 * The number of structural features of the '<em>Out Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PIN_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Out Pin Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PIN_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportLaneImpl <em>Public Transport Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportLaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportLane()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_LANE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Public Transport Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Transport Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.CycleLaneImpl <em>Cycle Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.CycleLaneImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getCycleLane()
	 * @generated
	 */
	int CYCLE_LANE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__ID = CONFLICTING_LANE__ID;

	/**
	 * The feature id for the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__REF_ROAD_ID = CONFLICTING_LANE__REF_ROAD_ID;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__LINK = CONFLICTING_LANE__LINK;

	/**
	 * The feature id for the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__ROAD = CONFLICTING_LANE__ROAD;

	/**
	 * The feature id for the '<em><b>Sub Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__SUB_LANE = CONFLICTING_LANE__SUB_LANE;

	/**
	 * The feature id for the '<em><b>Parent Lane</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__PARENT_LANE = CONFLICTING_LANE__PARENT_LANE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__INDEX = CONFLICTING_LANE__INDEX;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__DIRECTION = CONFLICTING_LANE__DIRECTION;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__DETECTOR = CONFLICTING_LANE__DETECTOR;

	/**
	 * The feature id for the '<em><b>Conflicting Lane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__CONFLICTING_LANE = CONFLICTING_LANE__CONFLICTING_LANE;

	/**
	 * The feature id for the '<em><b>Conflicting Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__CONFLICTING_LINK = CONFLICTING_LANE__CONFLICTING_LINK;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__SIGNAL_GROUP = CONFLICTING_LANE__SIGNAL_GROUP;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE__SIGNAL_GROUPS = CONFLICTING_LANE__SIGNAL_GROUPS;

	/**
	 * The number of structural features of the '<em>Cycle Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE_FEATURE_COUNT = CONFLICTING_LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cycle Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_LANE_OPERATION_COUNT = CONFLICTING_LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportStationImpl <em>Public Transport Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportStationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportStation()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_STATION = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STATION__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STATION__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Public Transport Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STATION_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Transport Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STATION_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableImpl <em>Public Transport Time Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportTimeTableImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportTimeTable()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE__ENTRY = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE__TYPE = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Public Transport Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Public Transport Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl <em>Public Transport Time Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportTimeTableEntry()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY = 43;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__INDEX = ABSTRACT_TIME_TABLE_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__MODE = ABSTRACT_TIME_TABLE_ENTRY__MODE;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__BEGIN = ABSTRACT_TIME_TABLE_ENTRY__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__END = ABSTRACT_TIME_TABLE_ENTRY__END;

	/**
	 * The feature id for the '<em><b>First Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION = ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION = ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS = ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Public Transport Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY_FEATURE_COUNT = ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Public Transport Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TIME_TABLE_ENTRY_OPERATION_COUNT = ABSTRACT_TIME_TABLE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportProgramImpl <em>Public Transport Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportProgramImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportProgram()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_PROGRAM = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_PROGRAM__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_PROGRAM__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_PROGRAM__DATA_ENTRY = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Transport Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_PROGRAM_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Transport Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_PROGRAM_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportLineImpl <em>Public Transport Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportLineImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportLine()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_LINE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE__TYPE = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE__TIME_TABLE = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE__LINE_NUMBER = ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Public Transport Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Public Transport Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LINE_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportConfigurationImpl <em>Public Transport Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportConfigurationImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportConfiguration()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_CONFIGURATION = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_CONFIGURATION__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_CONFIGURATION__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Transport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_CONFIGURATION__PUBLIC_TRANSPORT = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Transport Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_CONFIGURATION_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Transport Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_CONFIGURATION_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDataEntryImpl <em>Public Transport Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportDataEntryImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataEntry()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY__ID = ABSTRACT_DATA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY__TIMESTAMP = ABSTRACT_DATA_ENTRY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY__INDEX = ABSTRACT_DATA_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Data Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Transport Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY_FEATURE_COUNT = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Transport Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_ENTRY_OPERATION_COUNT = ABSTRACT_DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl <em>Public Transport Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataValue()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE = 48;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Line Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Public Transport Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Public Transport Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueObjectImpl <em>Public Transport Data Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportDataValueObjectImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataValueObject()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_OBJECT = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Public Transport Data Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Transport Data Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportTelegramImpl <em>Public Transport Telegram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportTelegramImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportTelegram()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_TELEGRAM = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TELEGRAM__ID = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TELEGRAM__NAME = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Public Transport Telegram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TELEGRAM_FEATURE_COUNT = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Transport Telegram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_TELEGRAM_OPERATION_COUNT = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportPositionImpl <em>Public Transport Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportPositionImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportPosition()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_POSITION = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_POSITION__ID = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_POSITION__NAME = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_POSITION__POSITION = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Transport Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_POSITION_FEATURE_COUNT = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Transport Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_POSITION_OPERATION_COUNT = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDoorChangeImpl <em>Public Transport Door Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportDoorChangeImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDoorChange()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE__ID = PUBLIC_TRANSPORT_POSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE__NAME = PUBLIC_TRANSPORT_POSITION__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE__POSITION = PUBLIC_TRANSPORT_POSITION__POSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE__TYPE = PUBLIC_TRANSPORT_POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Transport Door Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE_FEATURE_COUNT = PUBLIC_TRANSPORT_POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Transport Door Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE_OPERATION_COUNT = PUBLIC_TRANSPORT_POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportStopImpl <em>Public Transport Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportStopImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportStop()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_STOP = 53;

	/**
	 * The feature id for the '<em><b>Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STOP__STATION = 0;

	/**
	 * The number of structural features of the '<em>Public Transport Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STOP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Public Transport Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_STOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl <em>Public Transport Loc Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportLocMsg()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_LOC_MSG = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__ID = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__NAME = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Line Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trip Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Travel Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__COUNTER = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kilometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__KILOMETER = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__POS_STATE = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Last Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Next Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Actual Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Expected Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__GPS = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Odo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__ODO = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Door</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG__DOOR = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Public Transport Loc Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG_FEATURE_COUNT = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Public Transport Loc Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_TRANSPORT_LOC_MSG_OPERATION_COUNT = PUBLIC_TRANSPORT_DATA_VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.DeviceActivationType <em>Device Activation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.DeviceActivationType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceActivationType()
	 * @generated
	 */
	int DEVICE_ACTIVATION_TYPE = 55;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.ClearAreaType <em>Clear Area Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.ClearAreaType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getClearAreaType()
	 * @generated
	 */
	int CLEAR_AREA_TYPE = 56;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.DirectionType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 57;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.ScheduleModeType <em>Schedule Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.ScheduleModeType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getScheduleModeType()
	 * @generated
	 */
	int SCHEDULE_MODE_TYPE = 58;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.TimeTableModeType <em>Time Table Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.TimeTableModeType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTimeTableModeType()
	 * @generated
	 */
	int TIME_TABLE_MODE_TYPE = 59;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.ParameterDataType <em>Parameter Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.ParameterDataType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getParameterDataType()
	 * @generated
	 */
	int PARAMETER_DATA_TYPE = 60;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.IntersectionStateType <em>Intersection State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.IntersectionStateType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIntersectionStateType()
	 * @generated
	 */
	int INTERSECTION_STATE_TYPE = 61;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.LifeCycleDeviceType <em>Life Cycle Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.LifeCycleDeviceType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLifeCycleDeviceType()
	 * @generated
	 */
	int LIFE_CYCLE_DEVICE_TYPE = 62;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.OutputElementType <em>Output Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.OutputElementType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutputElementType()
	 * @generated
	 */
	int OUTPUT_ELEMENT_TYPE = 63;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.PublicTransportType <em>Public Transport Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.PublicTransportType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportType()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_TYPE = 64;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.PublicTransportDataValueType <em>Public Transport Data Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.PublicTransportDataValueType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataValueType()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_DATA_VALUE_TYPE = 65;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.model.device.PublicTransportDoorChangeType <em>Public Transport Door Change Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChangeType
	 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDoorChangeType()
	 * @generated
	 */
	int PUBLIC_TRANSPORT_DOOR_CHANGE_TYPE = 66;


	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.DeviceGroup <em>Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Group</em>'.
	 * @see de.dim.trafficos.model.device.DeviceGroup
	 * @generated
	 */
	EClass getDeviceGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.DeviceGroup#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device</em>'.
	 * @see de.dim.trafficos.model.device.DeviceGroup#getDevice()
	 * @see #getDeviceGroup()
	 * @generated
	 */
	EReference getDeviceGroup_Device();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.dim.trafficos.model.device.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Device#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.Device#getId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Device#getActivationState <em>Activation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation State</em>'.
	 * @see de.dim.trafficos.model.device.Device#getActivationState()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ActivationState();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.Device#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see de.dim.trafficos.model.device.Device#getConfiguration()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.Device#getDeviceInformation <em>Device Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Information</em>'.
	 * @see de.dim.trafficos.model.device.Device#getDeviceInformation()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_DeviceInformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.Device#getSystemInformation <em>System Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Information</em>'.
	 * @see de.dim.trafficos.model.device.Device#getSystemInformation()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_SystemInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Device#getLifeCycleType <em>Life Cycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Cycle Type</em>'.
	 * @see de.dim.trafficos.model.device.Device#getLifeCycleType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_LifeCycleType();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.SystemInfo <em>System Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Info</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo
	 * @generated
	 */
	EClass getSystemInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.SystemInfo#getHardwareType <em>Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Type</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo#getHardwareType()
	 * @see #getSystemInfo()
	 * @generated
	 */
	EAttribute getSystemInfo_HardwareType();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.SystemInfo#getHardwareRev <em>Hardware Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Rev</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo#getHardwareRev()
	 * @see #getSystemInfo()
	 * @generated
	 */
	EAttribute getSystemInfo_HardwareRev();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.SystemInfo#getOsType <em>Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Type</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo#getOsType()
	 * @see #getSystemInfo()
	 * @generated
	 */
	EAttribute getSystemInfo_OsType();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.SystemInfo#getOsRev <em>Os Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Rev</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo#getOsRev()
	 * @see #getSystemInfo()
	 * @generated
	 */
	EAttribute getSystemInfo_OsRev();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.SystemInfo#getSoftwareType <em>Software Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Type</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo#getSoftwareType()
	 * @see #getSystemInfo()
	 * @generated
	 */
	EAttribute getSystemInfo_SoftwareType();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.SystemInfo#getSoftwareRev <em>Software Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Rev</em>'.
	 * @see de.dim.trafficos.model.device.SystemInfo#getSoftwareRev()
	 * @see #getSystemInfo()
	 * @generated
	 */
	EAttribute getSystemInfo_SoftwareRev();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.DeviceInfo <em>Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Info</em>'.
	 * @see de.dim.trafficos.model.device.DeviceInfo
	 * @generated
	 */
	EClass getDeviceInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DeviceInfo#getTechnicalName <em>Technical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Name</em>'.
	 * @see de.dim.trafficos.model.device.DeviceInfo#getTechnicalName()
	 * @see #getDeviceInfo()
	 * @generated
	 */
	EAttribute getDeviceInfo_TechnicalName();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DeviceInfo#getHumanReadableName <em>Human Readable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Readable Name</em>'.
	 * @see de.dim.trafficos.model.device.DeviceInfo#getHumanReadableName()
	 * @see #getDeviceInfo()
	 * @generated
	 */
	EAttribute getDeviceInfo_HumanReadableName();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DeviceInfo#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see de.dim.trafficos.model.device.DeviceInfo#getShortName()
	 * @see #getDeviceInfo()
	 * @generated
	 */
	EAttribute getDeviceInfo_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DeviceInfo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dim.trafficos.model.device.DeviceInfo#getDescription()
	 * @see #getDeviceInfo()
	 * @generated
	 */
	EAttribute getDeviceInfo_Description();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.DeviceConfiguration <em>Device Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Configuration</em>'.
	 * @see de.dim.trafficos.model.device.DeviceConfiguration
	 * @generated
	 */
	EClass getDeviceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DeviceConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.DeviceConfiguration#getId()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EAttribute getDeviceConfiguration_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.DeviceConfiguration#getIntersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intersection</em>'.
	 * @see de.dim.trafficos.model.device.DeviceConfiguration#getIntersection()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_Intersection();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.DeviceConfiguration#getCurrentIntersection <em>Current Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Intersection</em>'.
	 * @see de.dim.trafficos.model.device.DeviceConfiguration#getCurrentIntersection()
	 * @see #getDeviceConfiguration()
	 * @generated
	 */
	EReference getDeviceConfiguration_CurrentIntersection();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection</em>'.
	 * @see de.dim.trafficos.model.device.Intersection
	 * @generated
	 */
	EClass getIntersection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Road</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getRoad()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Road();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getLink()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getPhase()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getPhaseGroup <em>Phase Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase Group</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getPhaseGroup()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_PhaseGroup();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.Intersection#getTimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Table</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getTimeTable()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_TimeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getOutput()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getProgram()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Intersection#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getParameter()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Intersection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getState()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_State();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Intersection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getName()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Intersection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dim.trafficos.model.device.Intersection#getDescription()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_Description();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see de.dim.trafficos.model.device.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Road#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.Road#getId()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Road#isMainRoad <em>Main Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Road</em>'.
	 * @see de.dim.trafficos.model.device.Road#isMainRoad()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_MainRoad();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Road#getIncomingLane <em>Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Lane</em>'.
	 * @see de.dim.trafficos.model.device.Road#getIncomingLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_IncomingLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Road#getOutgoingLane <em>Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Lane</em>'.
	 * @see de.dim.trafficos.model.device.Road#getOutgoingLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_OutgoingLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Road#getPedestrianLane <em>Pedestrian Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pedestrian Lane</em>'.
	 * @see de.dim.trafficos.model.device.Road#getPedestrianLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_PedestrianLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Road#getCycleLane <em>Cycle Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cycle Lane</em>'.
	 * @see de.dim.trafficos.model.device.Road#getCycleLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_CycleLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Road#getPublicTransportLane <em>Public Transport Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Transport Lane</em>'.
	 * @see de.dim.trafficos.model.device.Road#getPublicTransportLane()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_PublicTransportLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see de.dim.trafficos.model.device.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Lane#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getId()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Lane#getRefRoadId <em>Ref Road Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Road Id</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getRefRoadId()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_RefRoadId();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.Lane#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getLink()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Link();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.Lane#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Road</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getRoad()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Road();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Lane#getSubLane <em>Sub Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Lane</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getSubLane()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_SubLane();

	/**
	 * Returns the meta object for the container reference '{@link de.dim.trafficos.model.device.Lane#getParentLane <em>Parent Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Lane</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getParentLane()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_ParentLane();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Lane#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getIndex()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Index();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Lane#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getDirection()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Direction();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.Lane#getDetector <em>Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detector</em>'.
	 * @see de.dim.trafficos.model.device.Lane#getDetector()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Detector();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.ConflictingLane <em>Conflicting Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflicting Lane</em>'.
	 * @see de.dim.trafficos.model.device.ConflictingLane
	 * @generated
	 */
	EClass getConflictingLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.ConflictingLane#getConflictingLane <em>Conflicting Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicting Lane</em>'.
	 * @see de.dim.trafficos.model.device.ConflictingLane#getConflictingLane()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_ConflictingLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.ConflictingLane#getConflictingLink <em>Conflicting Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicting Link</em>'.
	 * @see de.dim.trafficos.model.device.ConflictingLane#getConflictingLink()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_ConflictingLink();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.ConflictingLane#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Group</em>'.
	 * @see de.dim.trafficos.model.device.ConflictingLane#getSignalGroup()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_SignalGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.ConflictingLane#getSignalGroups <em>Signal Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signal Groups</em>'.
	 * @see de.dim.trafficos.model.device.ConflictingLane#getSignalGroups()
	 * @see #getConflictingLane()
	 * @generated
	 */
	EReference getConflictingLane_SignalGroups();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.IncomingLane <em>Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Lane</em>'.
	 * @see de.dim.trafficos.model.device.IncomingLane
	 * @generated
	 */
	EClass getIncomingLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.OutgoingLane <em>Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Lane</em>'.
	 * @see de.dim.trafficos.model.device.OutgoingLane
	 * @generated
	 */
	EClass getOutgoingLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PedestrianLane <em>Pedestrian Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian Lane</em>'.
	 * @see de.dim.trafficos.model.device.PedestrianLane
	 * @generated
	 */
	EClass getPedestrianLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.dim.trafficos.model.device.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Link#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.model.device.Link#getIndex()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Index();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.Link#getRefIncomingLane <em>Ref Incoming Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Incoming Lane</em>'.
	 * @see de.dim.trafficos.model.device.Link#getRefIncomingLane()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_RefIncomingLane();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.Link#getRefOutgoingLane <em>Ref Outgoing Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Outgoing Lane</em>'.
	 * @see de.dim.trafficos.model.device.Link#getRefOutgoingLane()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_RefOutgoingLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see de.dim.trafficos.model.device.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Phase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.Phase#getId()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.Phase#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lane</em>'.
	 * @see de.dim.trafficos.model.device.Phase#getLane()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Lane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Phase#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see de.dim.trafficos.model.device.Phase#getTransition()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Transition();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Phase#getWeightMin <em>Weight Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Min</em>'.
	 * @see de.dim.trafficos.model.device.Phase#getWeightMin()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_WeightMin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Phase#getWeightMax <em>Weight Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Max</em>'.
	 * @see de.dim.trafficos.model.device.Phase#getWeightMax()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_WeightMax();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.ProgramEntry <em>Program Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Entry</em>'.
	 * @see de.dim.trafficos.model.device.ProgramEntry
	 * @generated
	 */
	EClass getProgramEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.ProgramEntry#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see de.dim.trafficos.model.device.ProgramEntry#getBegin()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EAttribute getProgramEntry_Begin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.ProgramEntry#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.dim.trafficos.model.device.ProgramEntry#getEnd()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EAttribute getProgramEntry_End();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.ProgramEntry#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dim.trafficos.model.device.ProgramEntry#getDuration()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EAttribute getProgramEntry_Duration();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.ProgramEntry#getRefPhase <em>Ref Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Phase</em>'.
	 * @see de.dim.trafficos.model.device.ProgramEntry#getRefPhase()
	 * @see #getProgramEntry()
	 * @generated
	 */
	EReference getProgramEntry_RefPhase();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see de.dim.trafficos.model.device.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Program#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.dim.trafficos.model.device.Program#getLength()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Length();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Program#getOutputEntry <em>Output Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Entry</em>'.
	 * @see de.dim.trafficos.model.device.Program#getOutputEntry()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_OutputEntry();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.Program#getSignalTable <em>Signal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Table</em>'.
	 * @see de.dim.trafficos.model.device.Program#getSignalTable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_SignalTable();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.dim.trafficos.model.device.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.Transition#getRefNextPhase <em>Ref Next Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Next Phase</em>'.
	 * @see de.dim.trafficos.model.device.Transition#getRefNextPhase()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RefNextPhase();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.Transition#getUnchangedLane <em>Unchanged Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchanged Lane</em>'.
	 * @see de.dim.trafficos.model.device.Transition#getUnchangedLane()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_UnchangedLane();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.Transition#getChangedLane <em>Changed Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changed Lane</em>'.
	 * @see de.dim.trafficos.model.device.Transition#getChangedLane()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ChangedLane();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Transition#getClearArea <em>Clear Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clear Area</em>'.
	 * @see de.dim.trafficos.model.device.Transition#getClearArea()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClearArea();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.ProgramTransition <em>Program Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Transition</em>'.
	 * @see de.dim.trafficos.model.device.ProgramTransition
	 * @generated
	 */
	EClass getProgramTransition();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.ProgramTransition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see de.dim.trafficos.model.device.ProgramTransition#getTransition()
	 * @see #getProgramTransition()
	 * @generated
	 */
	EReference getProgramTransition_Transition();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.ClearArea <em>Clear Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Area</em>'.
	 * @see de.dim.trafficos.model.device.ClearArea
	 * @generated
	 */
	EClass getClearArea();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.ClearArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.ClearArea#getType()
	 * @see #getClearArea()
	 * @generated
	 */
	EAttribute getClearArea_Type();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PhaseGroup <em>Phase Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Group</em>'.
	 * @see de.dim.trafficos.model.device.PhaseGroup
	 * @generated
	 */
	EClass getPhaseGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PhaseGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.PhaseGroup#getId()
	 * @see #getPhaseGroup()
	 * @generated
	 */
	EAttribute getPhaseGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PhaseGroup#getPenalty <em>Penalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty</em>'.
	 * @see de.dim.trafficos.model.device.PhaseGroup#getPenalty()
	 * @see #getPhaseGroup()
	 * @generated
	 */
	EAttribute getPhaseGroup_Penalty();

	/**
	 * Returns the meta object for the reference list '{@link de.dim.trafficos.model.device.PhaseGroup#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phase</em>'.
	 * @see de.dim.trafficos.model.device.PhaseGroup#getPhase()
	 * @see #getPhaseGroup()
	 * @generated
	 */
	EReference getPhaseGroup_Phase();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.IdNameElement <em>Id Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Name Element</em>'.
	 * @see de.dim.trafficos.model.device.IdNameElement
	 * @generated
	 */
	EClass getIdNameElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.IdNameElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.IdNameElement#getId()
	 * @see #getIdNameElement()
	 * @generated
	 */
	EAttribute getIdNameElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.IdNameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dim.trafficos.model.device.IdNameElement#getName()
	 * @see #getIdNameElement()
	 * @generated
	 */
	EAttribute getIdNameElement_Name();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see de.dim.trafficos.model.device.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Output#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dim.trafficos.model.device.Output#getDescription()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Output#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.dim.trafficos.model.device.Output#getDefaultValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_DefaultValue();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Localizable <em>Localizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localizable</em>'.
	 * @see de.dim.trafficos.model.device.Localizable
	 * @generated
	 */
	EClass getLocalizable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.Localizable#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see de.dim.trafficos.model.device.Localizable#getLocation()
	 * @see #getLocalizable()
	 * @generated
	 */
	EReference getLocalizable_Location();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.dim.trafficos.model.device.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.NetworkLocation <em>Network Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Location</em>'.
	 * @see de.dim.trafficos.model.device.NetworkLocation
	 * @generated
	 */
	EClass getNetworkLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.NetworkLocation#getIp4Address <em>Ip4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip4 Address</em>'.
	 * @see de.dim.trafficos.model.device.NetworkLocation#getIp4Address()
	 * @see #getNetworkLocation()
	 * @generated
	 */
	EAttribute getNetworkLocation_Ip4Address();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.NetworkLocation#getIp6Address <em>Ip6 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip6 Address</em>'.
	 * @see de.dim.trafficos.model.device.NetworkLocation#getIp6Address()
	 * @see #getNetworkLocation()
	 * @generated
	 */
	EAttribute getNetworkLocation_Ip6Address();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.NetworkLocation#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see de.dim.trafficos.model.device.NetworkLocation#getHostname()
	 * @see #getNetworkLocation()
	 * @generated
	 */
	EAttribute getNetworkLocation_Hostname();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see de.dim.trafficos.model.device.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Position#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.dim.trafficos.model.device.Position#getLatitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Position#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.dim.trafficos.model.device.Position#getLongitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Position#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see de.dim.trafficos.model.device.Position#getAltitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Position#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.dim.trafficos.model.device.Position#getOrientation()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Position#getBearing <em>Bearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearing</em>'.
	 * @see de.dim.trafficos.model.device.Position#getBearing()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Bearing();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.AddressLocation <em>Address Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Location</em>'.
	 * @see de.dim.trafficos.model.device.AddressLocation
	 * @generated
	 */
	EClass getAddressLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AddressLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.dim.trafficos.model.device.AddressLocation#getLocation()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AddressLocation#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see de.dim.trafficos.model.device.AddressLocation#getStreet()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_Street();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AddressLocation#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see de.dim.trafficos.model.device.AddressLocation#getZip()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_Zip();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AddressLocation#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see de.dim.trafficos.model.device.AddressLocation#getDistrict()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_District();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.TimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Table</em>'.
	 * @see de.dim.trafficos.model.device.TimeTable
	 * @generated
	 */
	EClass getTimeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.TimeTable#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see de.dim.trafficos.model.device.TimeTable#getEntry()
	 * @see #getTimeTable()
	 * @generated
	 */
	EReference getTimeTable_Entry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.TimeTable#getDefaultMode <em>Default Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Mode</em>'.
	 * @see de.dim.trafficos.model.device.TimeTable#getDefaultMode()
	 * @see #getTimeTable()
	 * @generated
	 */
	EAttribute getTimeTable_DefaultMode();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.TimeTableEntry <em>Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Table Entry</em>'.
	 * @see de.dim.trafficos.model.device.TimeTableEntry
	 * @generated
	 */
	EClass getTimeTableEntry();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.TimeTableEntry#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see de.dim.trafficos.model.device.TimeTableEntry#getProgram()
	 * @see #getTimeTableEntry()
	 * @generated
	 */
	EReference getTimeTableEntry_Program();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.DataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Entry</em>'.
	 * @see de.dim.trafficos.model.device.DataEntry
	 * @generated
	 */
	EClass getDataEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.DataEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.dim.trafficos.model.device.DataEntry#getValue()
	 * @see #getDataEntry()
	 * @generated
	 */
	EReference getDataEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DataEntry#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see de.dim.trafficos.model.device.DataEntry#getConfiguration()
	 * @see #getDataEntry()
	 * @generated
	 */
	EAttribute getDataEntry_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DataEntry#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see de.dim.trafficos.model.device.DataEntry#getDevice()
	 * @see #getDataEntry()
	 * @generated
	 */
	EAttribute getDataEntry_Device();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see de.dim.trafficos.model.device.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dim.trafficos.model.device.DataValue#getValue()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.DataValue#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.dim.trafficos.model.device.DataValue#getElement()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_Element();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.DataValue#getElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Ref</em>'.
	 * @see de.dim.trafficos.model.device.DataValue#getElementRef()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_ElementRef();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.DataValue#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dim.trafficos.model.device.DataValue#getDuration()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Duration();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.dim.trafficos.model.device.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.Parameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.dim.trafficos.model.device.Parameter#getDataType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DataType();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.CacheDataEntry <em>Cache Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Data Entry</em>'.
	 * @see de.dim.trafficos.model.device.CacheDataEntry
	 * @generated
	 */
	EClass getCacheDataEntry();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.SignalTable <em>Signal Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Table</em>'.
	 * @see de.dim.trafficos.model.device.SignalTable
	 * @generated
	 */
	EClass getSignalTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.SignalTable#getCacheDataEntry <em>Cache Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cache Data Entry</em>'.
	 * @see de.dim.trafficos.model.device.SignalTable#getCacheDataEntry()
	 * @see #getSignalTable()
	 * @generated
	 */
	EReference getSignalTable_CacheDataEntry();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.HardwareConfiguration <em>Hardware Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Configuration</em>'.
	 * @see de.dim.trafficos.model.device.HardwareConfiguration
	 * @generated
	 */
	EClass getHardwareConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.HardwareConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.HardwareConfiguration#getId()
	 * @see #getHardwareConfiguration()
	 * @generated
	 */
	EAttribute getHardwareConfiguration_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.HardwareConfiguration#getPinConfiguration <em>Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Configuration</em>'.
	 * @see de.dim.trafficos.model.device.HardwareConfiguration#getPinConfiguration()
	 * @see #getHardwareConfiguration()
	 * @generated
	 */
	EReference getHardwareConfiguration_PinConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.HardwareConfiguration#getDeviceId <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Id</em>'.
	 * @see de.dim.trafficos.model.device.HardwareConfiguration#getDeviceId()
	 * @see #getHardwareConfiguration()
	 * @generated
	 */
	EAttribute getHardwareConfiguration_DeviceId();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.HardwareConfiguration#getDeviceConfigurationId <em>Device Configuration Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Configuration Id</em>'.
	 * @see de.dim.trafficos.model.device.HardwareConfiguration#getDeviceConfigurationId()
	 * @see #getHardwareConfiguration()
	 * @generated
	 */
	EAttribute getHardwareConfiguration_DeviceConfigurationId();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.OutputConfiguration <em>Output Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Configuration</em>'.
	 * @see de.dim.trafficos.model.device.OutputConfiguration
	 * @generated
	 */
	EClass getOutputConfiguration();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.OutputConfiguration#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see de.dim.trafficos.model.device.OutputConfiguration#getOutput()
	 * @see #getOutputConfiguration()
	 * @generated
	 */
	EReference getOutputConfiguration_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.OutputConfiguration#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin</em>'.
	 * @see de.dim.trafficos.model.device.OutputConfiguration#getPin()
	 * @see #getOutputConfiguration()
	 * @generated
	 */
	EReference getOutputConfiguration_Pin();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.OutPinConfiguration <em>Out Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Pin Configuration</em>'.
	 * @see de.dim.trafficos.model.device.OutPinConfiguration
	 * @generated
	 */
	EClass getOutPinConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.OutPinConfiguration#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see de.dim.trafficos.model.device.OutPinConfiguration#getPin()
	 * @see #getOutPinConfiguration()
	 * @generated
	 */
	EAttribute getOutPinConfiguration_Pin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.OutPinConfiguration#getGpio <em>Gpio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpio</em>'.
	 * @see de.dim.trafficos.model.device.OutPinConfiguration#getGpio()
	 * @see #getOutPinConfiguration()
	 * @generated
	 */
	EAttribute getOutPinConfiguration_Gpio();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.OutPinConfiguration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.OutPinConfiguration#getType()
	 * @see #getOutPinConfiguration()
	 * @generated
	 */
	EAttribute getOutPinConfiguration_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.OutPinConfiguration#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.dim.trafficos.model.device.OutPinConfiguration#getComment()
	 * @see #getOutPinConfiguration()
	 * @generated
	 */
	EAttribute getOutPinConfiguration_Comment();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportLane <em>Public Transport Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Lane</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLane
	 * @generated
	 */
	EClass getPublicTransportLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.CycleLane <em>Cycle Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle Lane</em>'.
	 * @see de.dim.trafficos.model.device.CycleLane
	 * @generated
	 */
	EClass getCycleLane();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.AbstractDataEntry <em>Abstract Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Entry</em>'.
	 * @see de.dim.trafficos.model.device.AbstractDataEntry
	 * @generated
	 */
	EClass getAbstractDataEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractDataEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.model.device.AbstractDataEntry#getId()
	 * @see #getAbstractDataEntry()
	 * @generated
	 */
	EAttribute getAbstractDataEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractDataEntry#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dim.trafficos.model.device.AbstractDataEntry#getTimestamp()
	 * @see #getAbstractDataEntry()
	 * @generated
	 */
	EAttribute getAbstractDataEntry_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractDataEntry#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.model.device.AbstractDataEntry#getIndex()
	 * @see #getAbstractDataEntry()
	 * @generated
	 */
	EAttribute getAbstractDataEntry_Index();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportStation <em>Public Transport Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Station</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportStation
	 * @generated
	 */
	EClass getPublicTransportStation();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportTimeTable <em>Public Transport Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Time Table</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTable
	 * @generated
	 */
	EClass getPublicTransportTimeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.PublicTransportTimeTable#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTable#getEntry()
	 * @see #getPublicTransportTimeTable()
	 * @generated
	 */
	EReference getPublicTransportTimeTable_Entry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportTimeTable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTable#getType()
	 * @see #getPublicTransportTimeTable()
	 * @generated
	 */
	EAttribute getPublicTransportTimeTable_Type();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry <em>Abstract Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time Table Entry</em>'.
	 * @see de.dim.trafficos.model.device.AbstractTimeTableEntry
	 * @generated
	 */
	EClass getAbstractTimeTableEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.model.device.AbstractTimeTableEntry#getIndex()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_Index();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.dim.trafficos.model.device.AbstractTimeTableEntry#getMode()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_Mode();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see de.dim.trafficos.model.device.AbstractTimeTableEntry#getBegin()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_Begin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.dim.trafficos.model.device.AbstractTimeTableEntry#getEnd()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_End();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry <em>Public Transport Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Time Table Entry</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTableEntry
	 * @generated
	 */
	EClass getPublicTransportTimeTableEntry();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getFirstStation <em>First Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Station</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getFirstStation()
	 * @see #getPublicTransportTimeTableEntry()
	 * @generated
	 */
	EReference getPublicTransportTimeTableEntry_FirstStation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getLastStation <em>Last Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Station</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getLastStation()
	 * @see #getPublicTransportTimeTableEntry()
	 * @generated
	 */
	EReference getPublicTransportTimeTableEntry_LastStation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getStops()
	 * @see #getPublicTransportTimeTableEntry()
	 * @generated
	 */
	EReference getPublicTransportTimeTableEntry_Stops();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportProgram <em>Public Transport Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Program</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportProgram
	 * @generated
	 */
	EClass getPublicTransportProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.PublicTransportProgram#getDataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Entry</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportProgram#getDataEntry()
	 * @see #getPublicTransportProgram()
	 * @generated
	 */
	EReference getPublicTransportProgram_DataEntry();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportLine <em>Public Transport Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Line</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLine
	 * @generated
	 */
	EClass getPublicTransportLine();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLine#getType()
	 * @see #getPublicTransportLine()
	 * @generated
	 */
	EAttribute getPublicTransportLine_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.PublicTransportLine#getTimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Table</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLine#getTimeTable()
	 * @see #getPublicTransportLine()
	 * @generated
	 */
	EReference getPublicTransportLine_TimeTable();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLine#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLine#getLineNumber()
	 * @see #getPublicTransportLine()
	 * @generated
	 */
	EAttribute getPublicTransportLine_LineNumber();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportConfiguration <em>Public Transport Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Configuration</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportConfiguration
	 * @generated
	 */
	EClass getPublicTransportConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.PublicTransportConfiguration#getPublicTransport <em>Public Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Transport</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportConfiguration#getPublicTransport()
	 * @see #getPublicTransportConfiguration()
	 * @generated
	 */
	EReference getPublicTransportConfiguration_PublicTransport();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportDataEntry <em>Public Transport Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Data Entry</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataEntry
	 * @generated
	 */
	EClass getPublicTransportDataEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.model.device.PublicTransportDataEntry#getDataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Value</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataEntry#getDataValue()
	 * @see #getPublicTransportDataEntry()
	 * @generated
	 */
	EReference getPublicTransportDataEntry_DataValue();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportDataValue <em>Public Transport Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Data Value</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValue
	 * @generated
	 */
	EClass getPublicTransportDataValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportDataValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValue#getType()
	 * @see #getPublicTransportDataValue()
	 * @generated
	 */
	EAttribute getPublicTransportDataValue_Type();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.model.device.PublicTransportDataValue#getLineRef <em>Line Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Ref</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValue#getLineRef()
	 * @see #getPublicTransportDataValue()
	 * @generated
	 */
	EReference getPublicTransportDataValue_LineRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.PublicTransportDataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValue#getValue()
	 * @see #getPublicTransportDataValue()
	 * @generated
	 */
	EReference getPublicTransportDataValue_Value();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportDataValueObject <em>Public Transport Data Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Data Value Object</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValueObject
	 * @generated
	 */
	EClass getPublicTransportDataValueObject();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportTelegram <em>Public Transport Telegram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Telegram</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportTelegram
	 * @generated
	 */
	EClass getPublicTransportTelegram();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportPosition <em>Public Transport Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Position</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportPosition
	 * @generated
	 */
	EClass getPublicTransportPosition();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.PublicTransportPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportPosition#getPosition()
	 * @see #getPublicTransportPosition()
	 * @generated
	 */
	EReference getPublicTransportPosition_Position();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportDoorChange <em>Public Transport Door Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Door Change</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChange
	 * @generated
	 */
	EClass getPublicTransportDoorChange();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportDoorChange#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChange#getType()
	 * @see #getPublicTransportDoorChange()
	 * @generated
	 */
	EAttribute getPublicTransportDoorChange_Type();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportStop <em>Public Transport Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Stop</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportStop
	 * @generated
	 */
	EClass getPublicTransportStop();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.model.device.PublicTransportStop#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportStop#getStation()
	 * @see #getPublicTransportStop()
	 * @generated
	 */
	EReference getPublicTransportStop_Station();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.model.device.PublicTransportLocMsg <em>Public Transport Loc Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Transport Loc Msg</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg
	 * @generated
	 */
	EClass getPublicTransportLocMsg();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getLineNum <em>Line Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Num</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getLineNum()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_LineNum();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getTripNum <em>Trip Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip Num</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getTripNum()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_TripNum();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getRouteNum <em>Route Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Num</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getRouteNum()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_RouteNum();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getTravelNum <em>Travel Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Num</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getTravelNum()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_TravelNum();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getCounter()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_Counter();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getKilometer <em>Kilometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kilometer</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getKilometer()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_Kilometer();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getPosState <em>Pos State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos State</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getPosState()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_PosState();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getLastStop <em>Last Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Stop</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getLastStop()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_LastStop();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getNextStop <em>Next Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Stop</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getNextStop()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_NextStop();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getActualTime <em>Actual Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Time</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getActualTime()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_ActualTime();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getExpectedTime <em>Expected Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Time</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getExpectedTime()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_ExpectedTime();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gps</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getGps()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_Gps();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getOdo <em>Odo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odo</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getOdo()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_Odo();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportLocMsg#getDoor()
	 * @see #getPublicTransportLocMsg()
	 * @generated
	 */
	EAttribute getPublicTransportLocMsg_Door();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.DeviceActivationType <em>Device Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Activation Type</em>'.
	 * @see de.dim.trafficos.model.device.DeviceActivationType
	 * @generated
	 */
	EEnum getDeviceActivationType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.ClearAreaType <em>Clear Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clear Area Type</em>'.
	 * @see de.dim.trafficos.model.device.ClearAreaType
	 * @generated
	 */
	EEnum getClearAreaType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see de.dim.trafficos.model.device.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.ScheduleModeType <em>Schedule Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schedule Mode Type</em>'.
	 * @see de.dim.trafficos.model.device.ScheduleModeType
	 * @generated
	 */
	EEnum getScheduleModeType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.TimeTableModeType <em>Time Table Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Table Mode Type</em>'.
	 * @see de.dim.trafficos.model.device.TimeTableModeType
	 * @generated
	 */
	EEnum getTimeTableModeType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.ParameterDataType <em>Parameter Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Data Type</em>'.
	 * @see de.dim.trafficos.model.device.ParameterDataType
	 * @generated
	 */
	EEnum getParameterDataType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.IntersectionStateType <em>Intersection State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intersection State Type</em>'.
	 * @see de.dim.trafficos.model.device.IntersectionStateType
	 * @generated
	 */
	EEnum getIntersectionStateType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.LifeCycleDeviceType <em>Life Cycle Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Life Cycle Device Type</em>'.
	 * @see de.dim.trafficos.model.device.LifeCycleDeviceType
	 * @generated
	 */
	EEnum getLifeCycleDeviceType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.OutputElementType <em>Output Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Element Type</em>'.
	 * @see de.dim.trafficos.model.device.OutputElementType
	 * @generated
	 */
	EEnum getOutputElementType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.PublicTransportType <em>Public Transport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Public Transport Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportType
	 * @generated
	 */
	EEnum getPublicTransportType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.PublicTransportDataValueType <em>Public Transport Data Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Public Transport Data Value Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValueType
	 * @generated
	 */
	EEnum getPublicTransportDataValueType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.model.device.PublicTransportDoorChangeType <em>Public Transport Door Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Public Transport Door Change Type</em>'.
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChangeType
	 * @generated
	 */
	EEnum getPublicTransportDoorChangeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TOSDeviceFactory getTOSDeviceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.DeviceGroupImpl <em>Device Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.DeviceGroupImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceGroup()
		 * @generated
		 */
		EClass DEVICE_GROUP = eINSTANCE.getDeviceGroup();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_GROUP__DEVICE = eINSTANCE.getDeviceGroup_Device();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.DeviceImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ID = eINSTANCE.getDevice_Id();

		/**
		 * The meta object literal for the '<em><b>Activation State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ACTIVATION_STATE = eINSTANCE.getDevice_ActivationState();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CONFIGURATION = eINSTANCE.getDevice_Configuration();

		/**
		 * The meta object literal for the '<em><b>Device Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DEVICE_INFORMATION = eINSTANCE.getDevice_DeviceInformation();

		/**
		 * The meta object literal for the '<em><b>System Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__SYSTEM_INFORMATION = eINSTANCE.getDevice_SystemInformation();

		/**
		 * The meta object literal for the '<em><b>Life Cycle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__LIFE_CYCLE_TYPE = eINSTANCE.getDevice_LifeCycleType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.SystemInfoImpl <em>System Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.SystemInfoImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getSystemInfo()
		 * @generated
		 */
		EClass SYSTEM_INFO = eINSTANCE.getSystemInfo();

		/**
		 * The meta object literal for the '<em><b>Hardware Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFO__HARDWARE_TYPE = eINSTANCE.getSystemInfo_HardwareType();

		/**
		 * The meta object literal for the '<em><b>Hardware Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFO__HARDWARE_REV = eINSTANCE.getSystemInfo_HardwareRev();

		/**
		 * The meta object literal for the '<em><b>Os Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFO__OS_TYPE = eINSTANCE.getSystemInfo_OsType();

		/**
		 * The meta object literal for the '<em><b>Os Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFO__OS_REV = eINSTANCE.getSystemInfo_OsRev();

		/**
		 * The meta object literal for the '<em><b>Software Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFO__SOFTWARE_TYPE = eINSTANCE.getSystemInfo_SoftwareType();

		/**
		 * The meta object literal for the '<em><b>Software Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFO__SOFTWARE_REV = eINSTANCE.getSystemInfo_SoftwareRev();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.DeviceInfoImpl <em>Device Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.DeviceInfoImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceInfo()
		 * @generated
		 */
		EClass DEVICE_INFO = eINSTANCE.getDeviceInfo();

		/**
		 * The meta object literal for the '<em><b>Technical Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INFO__TECHNICAL_NAME = eINSTANCE.getDeviceInfo_TechnicalName();

		/**
		 * The meta object literal for the '<em><b>Human Readable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INFO__HUMAN_READABLE_NAME = eINSTANCE.getDeviceInfo_HumanReadableName();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INFO__SHORT_NAME = eINSTANCE.getDeviceInfo_ShortName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_INFO__DESCRIPTION = eINSTANCE.getDeviceInfo_Description();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.DeviceConfigurationImpl <em>Device Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.DeviceConfigurationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceConfiguration()
		 * @generated
		 */
		EClass DEVICE_CONFIGURATION = eINSTANCE.getDeviceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONFIGURATION__ID = eINSTANCE.getDeviceConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Intersection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__INTERSECTION = eINSTANCE.getDeviceConfiguration_Intersection();

		/**
		 * The meta object literal for the '<em><b>Current Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_CONFIGURATION__CURRENT_INTERSECTION = eINSTANCE.getDeviceConfiguration_CurrentIntersection();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.IntersectionImpl <em>Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.IntersectionImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIntersection()
		 * @generated
		 */
		EClass INTERSECTION = eINSTANCE.getIntersection();

		/**
		 * The meta object literal for the '<em><b>Road</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__ROAD = eINSTANCE.getIntersection_Road();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__LINK = eINSTANCE.getIntersection_Link();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__PHASE = eINSTANCE.getIntersection_Phase();

		/**
		 * The meta object literal for the '<em><b>Phase Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__PHASE_GROUP = eINSTANCE.getIntersection_PhaseGroup();

		/**
		 * The meta object literal for the '<em><b>Time Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__TIME_TABLE = eINSTANCE.getIntersection_TimeTable();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__OUTPUT = eINSTANCE.getIntersection_Output();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__PROGRAM = eINSTANCE.getIntersection_Program();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__PARAMETER = eINSTANCE.getIntersection_Parameter();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION__STATE = eINSTANCE.getIntersection_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION__NAME = eINSTANCE.getIntersection_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION__DESCRIPTION = eINSTANCE.getIntersection_Description();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.RoadImpl <em>Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.RoadImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getRoad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getRoad();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__ID = eINSTANCE.getRoad_Id();

		/**
		 * The meta object literal for the '<em><b>Main Road</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__MAIN_ROAD = eINSTANCE.getRoad_MainRoad();

		/**
		 * The meta object literal for the '<em><b>Incoming Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__INCOMING_LANE = eINSTANCE.getRoad_IncomingLane();

		/**
		 * The meta object literal for the '<em><b>Outgoing Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__OUTGOING_LANE = eINSTANCE.getRoad_OutgoingLane();

		/**
		 * The meta object literal for the '<em><b>Pedestrian Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__PEDESTRIAN_LANE = eINSTANCE.getRoad_PedestrianLane();

		/**
		 * The meta object literal for the '<em><b>Cycle Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__CYCLE_LANE = eINSTANCE.getRoad_CycleLane();

		/**
		 * The meta object literal for the '<em><b>Public Transport Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__PUBLIC_TRANSPORT_LANE = eINSTANCE.getRoad_PublicTransportLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.LaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__ID = eINSTANCE.getLane_Id();

		/**
		 * The meta object literal for the '<em><b>Ref Road Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__REF_ROAD_ID = eINSTANCE.getLane_RefRoadId();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__LINK = eINSTANCE.getLane_Link();

		/**
		 * The meta object literal for the '<em><b>Road</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__ROAD = eINSTANCE.getLane_Road();

		/**
		 * The meta object literal for the '<em><b>Sub Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__SUB_LANE = eINSTANCE.getLane_SubLane();

		/**
		 * The meta object literal for the '<em><b>Parent Lane</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__PARENT_LANE = eINSTANCE.getLane_ParentLane();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__INDEX = eINSTANCE.getLane_Index();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__DIRECTION = eINSTANCE.getLane_Direction();

		/**
		 * The meta object literal for the '<em><b>Detector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__DETECTOR = eINSTANCE.getLane_Detector();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.ConflictingLaneImpl <em>Conflicting Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.ConflictingLaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getConflictingLane()
		 * @generated
		 */
		EClass CONFLICTING_LANE = eINSTANCE.getConflictingLane();

		/**
		 * The meta object literal for the '<em><b>Conflicting Lane</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTING_LANE__CONFLICTING_LANE = eINSTANCE.getConflictingLane_ConflictingLane();

		/**
		 * The meta object literal for the '<em><b>Conflicting Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTING_LANE__CONFLICTING_LINK = eINSTANCE.getConflictingLane_ConflictingLink();

		/**
		 * The meta object literal for the '<em><b>Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTING_LANE__SIGNAL_GROUP = eINSTANCE.getConflictingLane_SignalGroup();

		/**
		 * The meta object literal for the '<em><b>Signal Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTING_LANE__SIGNAL_GROUPS = eINSTANCE.getConflictingLane_SignalGroups();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.IncomingLaneImpl <em>Incoming Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.IncomingLaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIncomingLane()
		 * @generated
		 */
		EClass INCOMING_LANE = eINSTANCE.getIncomingLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.OutgoingLaneImpl <em>Outgoing Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.OutgoingLaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutgoingLane()
		 * @generated
		 */
		EClass OUTGOING_LANE = eINSTANCE.getOutgoingLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PedestrianLaneImpl <em>Pedestrian Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PedestrianLaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPedestrianLane()
		 * @generated
		 */
		EClass PEDESTRIAN_LANE = eINSTANCE.getPedestrianLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.LinkImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__INDEX = eINSTANCE.getLink_Index();

		/**
		 * The meta object literal for the '<em><b>Ref Incoming Lane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__REF_INCOMING_LANE = eINSTANCE.getLink_RefIncomingLane();

		/**
		 * The meta object literal for the '<em><b>Ref Outgoing Lane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__REF_OUTGOING_LANE = eINSTANCE.getLink_RefOutgoingLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PhaseImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__ID = eINSTANCE.getPhase_Id();

		/**
		 * The meta object literal for the '<em><b>Lane</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__LANE = eINSTANCE.getPhase_Lane();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__TRANSITION = eINSTANCE.getPhase_Transition();

		/**
		 * The meta object literal for the '<em><b>Weight Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__WEIGHT_MIN = eINSTANCE.getPhase_WeightMin();

		/**
		 * The meta object literal for the '<em><b>Weight Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__WEIGHT_MAX = eINSTANCE.getPhase_WeightMax();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.ProgramEntryImpl <em>Program Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.ProgramEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getProgramEntry()
		 * @generated
		 */
		EClass PROGRAM_ENTRY = eINSTANCE.getProgramEntry();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ENTRY__BEGIN = eINSTANCE.getProgramEntry_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ENTRY__END = eINSTANCE.getProgramEntry_End();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ENTRY__DURATION = eINSTANCE.getProgramEntry_Duration();

		/**
		 * The meta object literal for the '<em><b>Ref Phase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ENTRY__REF_PHASE = eINSTANCE.getProgramEntry_RefPhase();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.ProgramImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__LENGTH = eINSTANCE.getProgram_Length();

		/**
		 * The meta object literal for the '<em><b>Output Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__OUTPUT_ENTRY = eINSTANCE.getProgram_OutputEntry();

		/**
		 * The meta object literal for the '<em><b>Signal Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SIGNAL_TABLE = eINSTANCE.getProgram_SignalTable();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.TransitionImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Ref Next Phase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__REF_NEXT_PHASE = eINSTANCE.getTransition_RefNextPhase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ID = eINSTANCE.getTransition_Id();

		/**
		 * The meta object literal for the '<em><b>Unchanged Lane</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__UNCHANGED_LANE = eINSTANCE.getTransition_UnchangedLane();

		/**
		 * The meta object literal for the '<em><b>Changed Lane</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CHANGED_LANE = eINSTANCE.getTransition_ChangedLane();

		/**
		 * The meta object literal for the '<em><b>Clear Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CLEAR_AREA = eINSTANCE.getTransition_ClearArea();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.ProgramTransitionImpl <em>Program Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.ProgramTransitionImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getProgramTransition()
		 * @generated
		 */
		EClass PROGRAM_TRANSITION = eINSTANCE.getProgramTransition();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_TRANSITION__TRANSITION = eINSTANCE.getProgramTransition_Transition();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.ClearAreaImpl <em>Clear Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.ClearAreaImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getClearArea()
		 * @generated
		 */
		EClass CLEAR_AREA = eINSTANCE.getClearArea();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_AREA__TYPE = eINSTANCE.getClearArea_Type();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PhaseGroupImpl <em>Phase Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PhaseGroupImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPhaseGroup()
		 * @generated
		 */
		EClass PHASE_GROUP = eINSTANCE.getPhaseGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_GROUP__ID = eINSTANCE.getPhaseGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Penalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_GROUP__PENALTY = eINSTANCE.getPhaseGroup_Penalty();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_GROUP__PHASE = eINSTANCE.getPhaseGroup_Phase();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.IdNameElementImpl <em>Id Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.IdNameElementImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIdNameElement()
		 * @generated
		 */
		EClass ID_NAME_ELEMENT = eINSTANCE.getIdNameElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NAME_ELEMENT__ID = eINSTANCE.getIdNameElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_NAME_ELEMENT__NAME = eINSTANCE.getIdNameElement_Name();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.OutputImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__DESCRIPTION = eINSTANCE.getOutput_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__DEFAULT_VALUE = eINSTANCE.getOutput_DefaultValue();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.LocalizableImpl <em>Localizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.LocalizableImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLocalizable()
		 * @generated
		 */
		EClass LOCALIZABLE = eINSTANCE.getLocalizable();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZABLE__LOCATION = eINSTANCE.getLocalizable_Location();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.LocationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ID = eINSTANCE.getLocation_Id();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.NetworkLocationImpl <em>Network Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.NetworkLocationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getNetworkLocation()
		 * @generated
		 */
		EClass NETWORK_LOCATION = eINSTANCE.getNetworkLocation();

		/**
		 * The meta object literal for the '<em><b>Ip4 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LOCATION__IP4_ADDRESS = eINSTANCE.getNetworkLocation_Ip4Address();

		/**
		 * The meta object literal for the '<em><b>Ip6 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LOCATION__IP6_ADDRESS = eINSTANCE.getNetworkLocation_Ip6Address();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LOCATION__HOSTNAME = eINSTANCE.getNetworkLocation_Hostname();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PositionImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LATITUDE = eINSTANCE.getPosition_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LONGITUDE = eINSTANCE.getPosition_Longitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ALTITUDE = eINSTANCE.getPosition_Altitude();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ORIENTATION = eINSTANCE.getPosition_Orientation();

		/**
		 * The meta object literal for the '<em><b>Bearing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__BEARING = eINSTANCE.getPosition_Bearing();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.AddressLocationImpl <em>Address Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.AddressLocationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getAddressLocation()
		 * @generated
		 */
		EClass ADDRESS_LOCATION = eINSTANCE.getAddressLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_LOCATION__LOCATION = eINSTANCE.getAddressLocation_Location();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_LOCATION__STREET = eINSTANCE.getAddressLocation_Street();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_LOCATION__ZIP = eINSTANCE.getAddressLocation_Zip();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_LOCATION__DISTRICT = eINSTANCE.getAddressLocation_District();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.TimeTableImpl <em>Time Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.TimeTableImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTimeTable()
		 * @generated
		 */
		EClass TIME_TABLE = eINSTANCE.getTimeTable();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_TABLE__ENTRY = eINSTANCE.getTimeTable_Entry();

		/**
		 * The meta object literal for the '<em><b>Default Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TABLE__DEFAULT_MODE = eINSTANCE.getTimeTable_DefaultMode();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.TimeTableEntryImpl <em>Time Table Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.TimeTableEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTimeTableEntry()
		 * @generated
		 */
		EClass TIME_TABLE_ENTRY = eINSTANCE.getTimeTableEntry();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_TABLE_ENTRY__PROGRAM = eINSTANCE.getTimeTableEntry_Program();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.DataEntryImpl <em>Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.DataEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDataEntry()
		 * @generated
		 */
		EClass DATA_ENTRY = eINSTANCE.getDataEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTRY__VALUE = eINSTANCE.getDataEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTRY__CONFIGURATION = eINSTANCE.getDataEntry_Configuration();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTRY__DEVICE = eINSTANCE.getDataEntry_Device();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.DataValueImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__VALUE = eINSTANCE.getDataValue_Value();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUE__ELEMENT = eINSTANCE.getDataValue_Element();

		/**
		 * The meta object literal for the '<em><b>Element Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VALUE__ELEMENT_REF = eINSTANCE.getDataValue_ElementRef();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__DURATION = eINSTANCE.getDataValue_Duration();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.ParameterImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DATA_TYPE = eINSTANCE.getParameter_DataType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.CacheDataEntryImpl <em>Cache Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.CacheDataEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getCacheDataEntry()
		 * @generated
		 */
		EClass CACHE_DATA_ENTRY = eINSTANCE.getCacheDataEntry();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.SignalTableImpl <em>Signal Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.SignalTableImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getSignalTable()
		 * @generated
		 */
		EClass SIGNAL_TABLE = eINSTANCE.getSignalTable();

		/**
		 * The meta object literal for the '<em><b>Cache Data Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_TABLE__CACHE_DATA_ENTRY = eINSTANCE.getSignalTable_CacheDataEntry();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.HardwareConfigurationImpl <em>Hardware Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.HardwareConfigurationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getHardwareConfiguration()
		 * @generated
		 */
		EClass HARDWARE_CONFIGURATION = eINSTANCE.getHardwareConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CONFIGURATION__ID = eINSTANCE.getHardwareConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Pin Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONFIGURATION__PIN_CONFIGURATION = eINSTANCE.getHardwareConfiguration_PinConfiguration();

		/**
		 * The meta object literal for the '<em><b>Device Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CONFIGURATION__DEVICE_ID = eINSTANCE.getHardwareConfiguration_DeviceId();

		/**
		 * The meta object literal for the '<em><b>Device Configuration Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID = eINSTANCE.getHardwareConfiguration_DeviceConfigurationId();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.OutputConfigurationImpl <em>Output Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.OutputConfigurationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutputConfiguration()
		 * @generated
		 */
		EClass OUTPUT_CONFIGURATION = eINSTANCE.getOutputConfiguration();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CONFIGURATION__OUTPUT = eINSTANCE.getOutputConfiguration_Output();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CONFIGURATION__PIN = eINSTANCE.getOutputConfiguration_Pin();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.OutPinConfigurationImpl <em>Out Pin Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.OutPinConfigurationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutPinConfiguration()
		 * @generated
		 */
		EClass OUT_PIN_CONFIGURATION = eINSTANCE.getOutPinConfiguration();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PIN_CONFIGURATION__PIN = eINSTANCE.getOutPinConfiguration_Pin();

		/**
		 * The meta object literal for the '<em><b>Gpio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PIN_CONFIGURATION__GPIO = eINSTANCE.getOutPinConfiguration_Gpio();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PIN_CONFIGURATION__TYPE = eINSTANCE.getOutPinConfiguration_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PIN_CONFIGURATION__COMMENT = eINSTANCE.getOutPinConfiguration_Comment();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportLaneImpl <em>Public Transport Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportLaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportLane()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_LANE = eINSTANCE.getPublicTransportLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.CycleLaneImpl <em>Cycle Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.CycleLaneImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getCycleLane()
		 * @generated
		 */
		EClass CYCLE_LANE = eINSTANCE.getCycleLane();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.AbstractDataEntryImpl <em>Abstract Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.AbstractDataEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getAbstractDataEntry()
		 * @generated
		 */
		EClass ABSTRACT_DATA_ENTRY = eINSTANCE.getAbstractDataEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DATA_ENTRY__ID = eINSTANCE.getAbstractDataEntry_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DATA_ENTRY__TIMESTAMP = eINSTANCE.getAbstractDataEntry_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DATA_ENTRY__INDEX = eINSTANCE.getAbstractDataEntry_Index();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportStationImpl <em>Public Transport Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportStationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportStation()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_STATION = eINSTANCE.getPublicTransportStation();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableImpl <em>Public Transport Time Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportTimeTableImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportTimeTable()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_TIME_TABLE = eINSTANCE.getPublicTransportTimeTable();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_TIME_TABLE__ENTRY = eINSTANCE.getPublicTransportTimeTable_Entry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_TIME_TABLE__TYPE = eINSTANCE.getPublicTransportTimeTable_Type();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.AbstractTimeTableEntryImpl <em>Abstract Time Table Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.AbstractTimeTableEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getAbstractTimeTableEntry()
		 * @generated
		 */
		EClass ABSTRACT_TIME_TABLE_ENTRY = eINSTANCE.getAbstractTimeTableEntry();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME_TABLE_ENTRY__INDEX = eINSTANCE.getAbstractTimeTableEntry_Index();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME_TABLE_ENTRY__MODE = eINSTANCE.getAbstractTimeTableEntry_Mode();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME_TABLE_ENTRY__BEGIN = eINSTANCE.getAbstractTimeTableEntry_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME_TABLE_ENTRY__END = eINSTANCE.getAbstractTimeTableEntry_End();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl <em>Public Transport Time Table Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportTimeTableEntry()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_TIME_TABLE_ENTRY = eINSTANCE.getPublicTransportTimeTableEntry();

		/**
		 * The meta object literal for the '<em><b>First Station</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION = eINSTANCE.getPublicTransportTimeTableEntry_FirstStation();

		/**
		 * The meta object literal for the '<em><b>Last Station</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION = eINSTANCE.getPublicTransportTimeTableEntry_LastStation();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS = eINSTANCE.getPublicTransportTimeTableEntry_Stops();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportProgramImpl <em>Public Transport Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportProgramImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportProgram()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_PROGRAM = eINSTANCE.getPublicTransportProgram();

		/**
		 * The meta object literal for the '<em><b>Data Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_PROGRAM__DATA_ENTRY = eINSTANCE.getPublicTransportProgram_DataEntry();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportLineImpl <em>Public Transport Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportLineImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportLine()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_LINE = eINSTANCE.getPublicTransportLine();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LINE__TYPE = eINSTANCE.getPublicTransportLine_Type();

		/**
		 * The meta object literal for the '<em><b>Time Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_LINE__TIME_TABLE = eINSTANCE.getPublicTransportLine_TimeTable();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LINE__LINE_NUMBER = eINSTANCE.getPublicTransportLine_LineNumber();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportConfigurationImpl <em>Public Transport Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportConfigurationImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportConfiguration()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_CONFIGURATION = eINSTANCE.getPublicTransportConfiguration();

		/**
		 * The meta object literal for the '<em><b>Public Transport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_CONFIGURATION__PUBLIC_TRANSPORT = eINSTANCE.getPublicTransportConfiguration_PublicTransport();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDataEntryImpl <em>Public Transport Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportDataEntryImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataEntry()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_DATA_ENTRY = eINSTANCE.getPublicTransportDataEntry();

		/**
		 * The meta object literal for the '<em><b>Data Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_DATA_ENTRY__DATA_VALUE = eINSTANCE.getPublicTransportDataEntry_DataValue();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl <em>Public Transport Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataValue()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_DATA_VALUE = eINSTANCE.getPublicTransportDataValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_DATA_VALUE__TYPE = eINSTANCE.getPublicTransportDataValue_Type();

		/**
		 * The meta object literal for the '<em><b>Line Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF = eINSTANCE.getPublicTransportDataValue_LineRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_DATA_VALUE__VALUE = eINSTANCE.getPublicTransportDataValue_Value();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueObjectImpl <em>Public Transport Data Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportDataValueObjectImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataValueObject()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_DATA_VALUE_OBJECT = eINSTANCE.getPublicTransportDataValueObject();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportTelegramImpl <em>Public Transport Telegram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportTelegramImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportTelegram()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_TELEGRAM = eINSTANCE.getPublicTransportTelegram();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportPositionImpl <em>Public Transport Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportPositionImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportPosition()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_POSITION = eINSTANCE.getPublicTransportPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_POSITION__POSITION = eINSTANCE.getPublicTransportPosition_Position();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportDoorChangeImpl <em>Public Transport Door Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportDoorChangeImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDoorChange()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_DOOR_CHANGE = eINSTANCE.getPublicTransportDoorChange();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_DOOR_CHANGE__TYPE = eINSTANCE.getPublicTransportDoorChange_Type();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportStopImpl <em>Public Transport Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportStopImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportStop()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_STOP = eINSTANCE.getPublicTransportStop();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_TRANSPORT_STOP__STATION = eINSTANCE.getPublicTransportStop_Station();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl <em>Public Transport Loc Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportLocMsg()
		 * @generated
		 */
		EClass PUBLIC_TRANSPORT_LOC_MSG = eINSTANCE.getPublicTransportLocMsg();

		/**
		 * The meta object literal for the '<em><b>Line Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM = eINSTANCE.getPublicTransportLocMsg_LineNum();

		/**
		 * The meta object literal for the '<em><b>Trip Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM = eINSTANCE.getPublicTransportLocMsg_TripNum();

		/**
		 * The meta object literal for the '<em><b>Route Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM = eINSTANCE.getPublicTransportLocMsg_RouteNum();

		/**
		 * The meta object literal for the '<em><b>Travel Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM = eINSTANCE.getPublicTransportLocMsg_TravelNum();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__COUNTER = eINSTANCE.getPublicTransportLocMsg_Counter();

		/**
		 * The meta object literal for the '<em><b>Kilometer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__KILOMETER = eINSTANCE.getPublicTransportLocMsg_Kilometer();

		/**
		 * The meta object literal for the '<em><b>Pos State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__POS_STATE = eINSTANCE.getPublicTransportLocMsg_PosState();

		/**
		 * The meta object literal for the '<em><b>Last Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP = eINSTANCE.getPublicTransportLocMsg_LastStop();

		/**
		 * The meta object literal for the '<em><b>Next Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP = eINSTANCE.getPublicTransportLocMsg_NextStop();

		/**
		 * The meta object literal for the '<em><b>Actual Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME = eINSTANCE.getPublicTransportLocMsg_ActualTime();

		/**
		 * The meta object literal for the '<em><b>Expected Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME = eINSTANCE.getPublicTransportLocMsg_ExpectedTime();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__GPS = eINSTANCE.getPublicTransportLocMsg_Gps();

		/**
		 * The meta object literal for the '<em><b>Odo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__ODO = eINSTANCE.getPublicTransportLocMsg_Odo();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_TRANSPORT_LOC_MSG__DOOR = eINSTANCE.getPublicTransportLocMsg_Door();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.DeviceActivationType <em>Device Activation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.DeviceActivationType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDeviceActivationType()
		 * @generated
		 */
		EEnum DEVICE_ACTIVATION_TYPE = eINSTANCE.getDeviceActivationType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.ClearAreaType <em>Clear Area Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.ClearAreaType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getClearAreaType()
		 * @generated
		 */
		EEnum CLEAR_AREA_TYPE = eINSTANCE.getClearAreaType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.DirectionType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.ScheduleModeType <em>Schedule Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.ScheduleModeType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getScheduleModeType()
		 * @generated
		 */
		EEnum SCHEDULE_MODE_TYPE = eINSTANCE.getScheduleModeType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.TimeTableModeType <em>Time Table Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.TimeTableModeType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getTimeTableModeType()
		 * @generated
		 */
		EEnum TIME_TABLE_MODE_TYPE = eINSTANCE.getTimeTableModeType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.ParameterDataType <em>Parameter Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.ParameterDataType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getParameterDataType()
		 * @generated
		 */
		EEnum PARAMETER_DATA_TYPE = eINSTANCE.getParameterDataType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.IntersectionStateType <em>Intersection State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.IntersectionStateType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getIntersectionStateType()
		 * @generated
		 */
		EEnum INTERSECTION_STATE_TYPE = eINSTANCE.getIntersectionStateType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.LifeCycleDeviceType <em>Life Cycle Device Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.LifeCycleDeviceType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getLifeCycleDeviceType()
		 * @generated
		 */
		EEnum LIFE_CYCLE_DEVICE_TYPE = eINSTANCE.getLifeCycleDeviceType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.OutputElementType <em>Output Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.OutputElementType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getOutputElementType()
		 * @generated
		 */
		EEnum OUTPUT_ELEMENT_TYPE = eINSTANCE.getOutputElementType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.PublicTransportType <em>Public Transport Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.PublicTransportType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportType()
		 * @generated
		 */
		EEnum PUBLIC_TRANSPORT_TYPE = eINSTANCE.getPublicTransportType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.PublicTransportDataValueType <em>Public Transport Data Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.PublicTransportDataValueType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDataValueType()
		 * @generated
		 */
		EEnum PUBLIC_TRANSPORT_DATA_VALUE_TYPE = eINSTANCE.getPublicTransportDataValueType();

		/**
		 * The meta object literal for the '{@link de.dim.trafficos.model.device.PublicTransportDoorChangeType <em>Public Transport Door Change Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dim.trafficos.model.device.PublicTransportDoorChangeType
		 * @see de.dim.trafficos.model.device.impl.TOSDevicePackageImpl#getPublicTransportDoorChangeType()
		 * @generated
		 */
		EEnum PUBLIC_TRANSPORT_DOOR_CHANGE_TYPE = eINSTANCE.getPublicTransportDoorChangeType();

	}

} //TOSDevicePackage
