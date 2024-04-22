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
package de.jena.model.sensinact.ttnprovider;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

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
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = TtnSensorSensinactPackage.eNS_URI, genModel = "/model/ttn.genmodel", genModelSourceLocations = {"model/ttn.genmodel","de.jena.ttn.sensinact.model/model/ttn.genmodel"}, ecore="/model/ttn.ecore", ecoreSourceLocations="/model/ttn.ecore")
public interface TtnSensorSensinactPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ttnprovider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jena.de/models/ttn/sensinact/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ttnprovider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtnSensorSensinactPackage eINSTANCE = de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.AbstractTtnProviderImpl <em>Abstract Ttn Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.AbstractTtnProviderImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getAbstractTtnProvider()
	 * @generated
	 */
	int ABSTRACT_TTN_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER__GATEWAY = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Ttn Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Abstract Ttn Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TTN_PROVIDER_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.TtnSensorImpl <em>Ttn Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getTtnSensor()
	 * @generated
	 */
	int TTN_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Has beacon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR__HAS_BEACON = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR__DATA = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ttn Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Ttn Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SENSOR_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.SensorDataImpl <em>Sensor Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.SensorDataImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getSensorData()
	 * @generated
	 */
	int SENSOR_DATA = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__RAW_PAYLOAD = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__GATEWAY = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__PAYLOAD = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.TtnServiceImpl <em>Ttn Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnServiceImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getTtnService()
	 * @generated
	 */
	int TTN_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SERVICE__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SERVICE__RAW_PAYLOAD = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ttn Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SERVICE_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SERVICE___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Ttn Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SERVICE_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.GatewayDataImpl <em>Gateway Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.GatewayDataImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getGatewayData()
	 * @generated
	 */
	int GATEWAY_DATA = 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_DATA__GATEWAY = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_DATA__APPLICATION_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gateway Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_DATA___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Gateway Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_DATA_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.StringToObjectMapImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getStringToObjectMap()
	 * @generated
	 */
	int STRING_TO_OBJECT_MAP = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.TtnNoiseSensorImpl <em>Ttn Noise Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnNoiseSensorImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getTtnNoiseSensor()
	 * @generated
	 */
	int TTN_NOISE_SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR__ID = ABSTRACT_TTN_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR__ADMIN = ABSTRACT_TTN_PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR__LINKED_PROVIDERS = ABSTRACT_TTN_PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR__GATEWAY = ABSTRACT_TTN_PROVIDER__GATEWAY;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR__DATA = ABSTRACT_TTN_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ttn Noise Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR_FEATURE_COUNT = ABSTRACT_TTN_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR___GET_SERVICE__STRING = ABSTRACT_TTN_PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR___GET_SERVICE_ECLASS__STRING = ABSTRACT_TTN_PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Ttn Noise Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_NOISE_SENSOR_OPERATION_COUNT = ABSTRACT_TTN_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.NoiseDataImpl <em>Noise Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.NoiseDataImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getNoiseData()
	 * @generated
	 */
	int NOISE_DATA = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA__METADATA = TTN_SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA__RAW_PAYLOAD = TTN_SERVICE__RAW_PAYLOAD;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA__BATTERY = TTN_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA__DECIBLE = TTN_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA__STATUS = TTN_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temperature Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA__TEMPERATURE_BOARD = TTN_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Noise Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA_FEATURE_COUNT = TTN_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA___EIS_SET__ESTRUCTURALFEATURE = TTN_SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Noise Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_DATA_OPERATION_COUNT = TTN_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.TtnTemperatureSensorImpl <em>Ttn Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnTemperatureSensorImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getTtnTemperatureSensor()
	 * @generated
	 */
	int TTN_TEMPERATURE_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR__ID = ABSTRACT_TTN_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR__ADMIN = ABSTRACT_TTN_PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR__LINKED_PROVIDERS = ABSTRACT_TTN_PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR__GATEWAY = ABSTRACT_TTN_PROVIDER__GATEWAY;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR__DATA = ABSTRACT_TTN_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ttn Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR_FEATURE_COUNT = ABSTRACT_TTN_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR___GET_SERVICE__STRING = ABSTRACT_TTN_PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR___GET_SERVICE_ECLASS__STRING = ABSTRACT_TTN_PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Ttn Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_TEMPERATURE_SENSOR_OPERATION_COUNT = ABSTRACT_TTN_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.TemperaturDataImpl <em>Temperatur Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.TemperaturDataImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getTemperaturData()
	 * @generated
	 */
	int TEMPERATUR_DATA = 9;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATUR_DATA__METADATA = TTN_SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATUR_DATA__RAW_PAYLOAD = TTN_SERVICE__RAW_PAYLOAD;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATUR_DATA__TEMPERATURE = TTN_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temperatur Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATUR_DATA_FEATURE_COUNT = TTN_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATUR_DATA___EIS_SET__ESTRUCTURALFEATURE = TTN_SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Temperatur Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATUR_DATA_OPERATION_COUNT = TTN_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.TtnSoilMoistureSensorImpl <em>Ttn Soil Moisture Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSoilMoistureSensorImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getTtnSoilMoistureSensor()
	 * @generated
	 */
	int TTN_SOIL_MOISTURE_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR__ID = ABSTRACT_TTN_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR__ADMIN = ABSTRACT_TTN_PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR__LINKED_PROVIDERS = ABSTRACT_TTN_PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR__GATEWAY = ABSTRACT_TTN_PROVIDER__GATEWAY;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR__DATA = ABSTRACT_TTN_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ttn Soil Moisture Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR_FEATURE_COUNT = ABSTRACT_TTN_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR___GET_SERVICE__STRING = ABSTRACT_TTN_PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR___GET_SERVICE_ECLASS__STRING = ABSTRACT_TTN_PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Ttn Soil Moisture Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_SOIL_MOISTURE_SENSOR_OPERATION_COUNT = ABSTRACT_TTN_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl <em>Soil Moisture Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl
	 * @see de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactPackageImpl#getSoilMoistureData()
	 * @generated
	 */
	int SOIL_MOISTURE_DATA = 11;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__METADATA = TTN_SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__RAW_PAYLOAD = TTN_SERVICE__RAW_PAYLOAD;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__TEMPERATURE = TTN_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__BATTERY = TTN_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__PH = TTN_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__WATER = TTN_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conductivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA__CONDUCTIVITY = TTN_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Soil Moisture Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA_FEATURE_COUNT = TTN_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA___EIS_SET__ESTRUCTURALFEATURE = TTN_SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Soil Moisture Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_MOISTURE_DATA_OPERATION_COUNT = TTN_SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.AbstractTtnProvider <em>Abstract Ttn Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Ttn Provider</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.AbstractTtnProvider
	 * @generated
	 */
	EClass getAbstractTtnProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.ttnprovider.AbstractTtnProvider#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gateway</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.AbstractTtnProvider#getGateway()
	 * @see #getAbstractTtnProvider()
	 * @generated
	 */
	EReference getAbstractTtnProvider_Gateway();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.TtnSensor <em>Ttn Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttn Sensor</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensor
	 * @generated
	 */
	EClass getTtnSensor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.TtnSensor#isHas_beacon <em>Has beacon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has beacon</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensor#isHas_beacon()
	 * @see #getTtnSensor()
	 * @generated
	 */
	EAttribute getTtnSensor_Has_beacon();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.ttnprovider.TtnSensor#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensor#getData()
	 * @see #getTtnSensor()
	 * @generated
	 */
	EReference getTtnSensor_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.SensorData <em>Sensor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SensorData
	 * @generated
	 */
	EClass getSensorData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SensorData#getRawPayload <em>Raw Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Payload</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SensorData#getRawPayload()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_RawPayload();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SensorData#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SensorData#getGateway()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Gateway();

	/**
	 * Returns the meta object for the map '{@link de.jena.model.sensinact.ttnprovider.SensorData#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Payload</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SensorData#getPayload()
	 * @see #getSensorData()
	 * @generated
	 */
	EReference getSensorData_Payload();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.TtnService <em>Ttn Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttn Service</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnService
	 * @generated
	 */
	EClass getTtnService();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.TtnService#getRawPayload <em>Raw Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Payload</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnService#getRawPayload()
	 * @see #getTtnService()
	 * @generated
	 */
	EAttribute getTtnService_RawPayload();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.GatewayData <em>Gateway Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.GatewayData
	 * @generated
	 */
	EClass getGatewayData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.GatewayData#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.GatewayData#getGateway()
	 * @see #getGatewayData()
	 * @generated
	 */
	EAttribute getGatewayData_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.GatewayData#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.GatewayData#getApplicationId()
	 * @see #getGatewayData()
	 * @generated
	 */
	EAttribute getGatewayData_ApplicationId();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	EClass getStringToObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.TtnNoiseSensor <em>Ttn Noise Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttn Noise Sensor</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnNoiseSensor
	 * @generated
	 */
	EClass getTtnNoiseSensor();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.ttnprovider.TtnNoiseSensor#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnNoiseSensor#getData()
	 * @see #getTtnNoiseSensor()
	 * @generated
	 */
	EReference getTtnNoiseSensor_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.NoiseData <em>Noise Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noise Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.NoiseData
	 * @generated
	 */
	EClass getNoiseData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.NoiseData#getBattery()
	 * @see #getNoiseData()
	 * @generated
	 */
	EAttribute getNoiseData_Battery();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getDecible <em>Decible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decible</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.NoiseData#getDecible()
	 * @see #getNoiseData()
	 * @generated
	 */
	EAttribute getNoiseData_Decible();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.NoiseData#getStatus()
	 * @see #getNoiseData()
	 * @generated
	 */
	EAttribute getNoiseData_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getTemperatureBoard <em>Temperature Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Board</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.NoiseData#getTemperatureBoard()
	 * @see #getNoiseData()
	 * @generated
	 */
	EAttribute getNoiseData_TemperatureBoard();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor <em>Ttn Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttn Temperature Sensor</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor
	 * @generated
	 */
	EClass getTtnTemperatureSensor();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor#getData()
	 * @see #getTtnTemperatureSensor()
	 * @generated
	 */
	EReference getTtnTemperatureSensor_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.TemperaturData <em>Temperatur Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperatur Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TemperaturData
	 * @generated
	 */
	EClass getTemperaturData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.TemperaturData#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TemperaturData#getTemperature()
	 * @see #getTemperaturData()
	 * @generated
	 */
	EAttribute getTemperaturData_Temperature();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor <em>Ttn Soil Moisture Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttn Soil Moisture Sensor</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor
	 * @generated
	 */
	EClass getTtnSoilMoistureSensor();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor#getData()
	 * @see #getTtnSoilMoistureSensor()
	 * @generated
	 */
	EReference getTtnSoilMoistureSensor_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData <em>Soil Moisture Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soil Moisture Data</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData
	 * @generated
	 */
	EClass getSoilMoistureData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData#getTemperature()
	 * @see #getSoilMoistureData()
	 * @generated
	 */
	EAttribute getSoilMoistureData_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData#getBattery()
	 * @see #getSoilMoistureData()
	 * @generated
	 */
	EAttribute getSoilMoistureData_Battery();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getPh <em>Ph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ph</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData#getPh()
	 * @see #getSoilMoistureData()
	 * @generated
	 */
	EAttribute getSoilMoistureData_Ph();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData#getWater()
	 * @see #getSoilMoistureData()
	 * @generated
	 */
	EAttribute getSoilMoistureData_Water();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getConductivity <em>Conductivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conductivity</em>'.
	 * @see de.jena.model.sensinact.ttnprovider.SoilMoistureData#getConductivity()
	 * @see #getSoilMoistureData()
	 * @generated
	 */
	EAttribute getSoilMoistureData_Conductivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TtnSensorSensinactFactory getTtnSensorSensinactFactory();

} //TtnSensorSensinactPackage
