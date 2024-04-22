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
package de.jena.model.sensinact.iceprovider;


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
 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = IcesensoreSensinactPackage.eNS_URI, genModel = "/model/icesensor.genmodel", genModelSourceLocations = {"model/icesensor.genmodel","de.jena.icesensor.sensinact.model/model/icesensor.genmodel"}, ecore="/model/icesensor.ecore", ecoreSourceLocations="/model/icesensor.ecore")
public interface IcesensoreSensinactPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iceprovider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jena.de/models/icesensor/sensinact/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iceprovider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IcesensoreSensinactPackage eINSTANCE = de.jena.model.sensinact.iceprovider.impl.IcesensoreSensinactPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl <em>Ice Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.iceprovider.impl.IceSensorImpl
	 * @see de.jena.model.sensinact.iceprovider.impl.IcesensoreSensinactPackageImpl#getIceSensor()
	 * @generated
	 */
	int ICE_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>H2sugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__H2SUGM3 = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__COUGM3 = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__NOUGM3 = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>O3ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__O3UGM3 = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>1p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__1P = ProviderPackage.PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aqi criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__AQI_CRITERIA = ProviderPackage.PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__TEMPERATURE = ProviderPackage.PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__HUMIDITY = ProviderPackage.PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>10p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__10P = ProviderPackage.PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__PRESSURE = ProviderPackage.PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>No2ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__NO2UGM3 = ProviderPackage.PROVIDER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Aqi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__AQI = ProviderPackage.PROVIDER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>25p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__25P = ProviderPackage.PROVIDER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Ice Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Ice Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl <em>Sensor Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.iceprovider.impl.SensorDataImpl
	 * @see de.jena.model.sensinact.iceprovider.impl.IcesensoreSensinactPackageImpl#getSensorData()
	 * @generated
	 */
	int SENSOR_DATA = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSOR_TYPE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__GATEWAY = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSOR_MODEL = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__AVG = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MIN = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MAX = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__UNIT = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__VALIDITY = ProviderPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__CREATED_AT = ProviderPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Str data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__STR_DATA = ProviderPackage.SERVICE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 10;

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
	 * Returns the meta object for class '{@link de.jena.model.sensinact.iceprovider.IceSensor <em>Ice Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ice Sensor</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor
	 * @generated
	 */
	EClass getIceSensor();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getH2sugm3 <em>H2sugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H2sugm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getH2sugm3()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_H2sugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getCougm3 <em>Cougm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cougm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getCougm3()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Cougm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getNougm3 <em>Nougm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nougm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getNougm3()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Nougm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getO3ugm3 <em>O3ugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>O3ugm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getO3ugm3()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_O3ugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#get_1p <em>1p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>1p</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#get_1p()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor__1p();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getAqi_criteria <em>Aqi criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aqi criteria</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getAqi_criteria()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Aqi_criteria();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temperature</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getTemperature()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Temperature();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getHumidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Humidity</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getHumidity()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Humidity();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#get_10p <em>10p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>10p</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#get_10p()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor__10p();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pressure</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getPressure()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Pressure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getNo2ugm3 <em>No2ugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No2ugm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getNo2ugm3()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_No2ugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#getAqi <em>Aqi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aqi</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#getAqi()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor_Aqi();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensor#get_2_5p <em>25p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>25p</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensor#get_2_5p()
	 * @see #getIceSensor()
	 * @generated
	 */
	EReference getIceSensor__2_5p();

	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.iceprovider.SensorData <em>Sensor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData
	 * @generated
	 */
	EClass getSensorData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getSensor_type <em>Sensor type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor type</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getSensor_type()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Sensor_type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getGateway()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getSensor_model <em>Sensor model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor model</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getSensor_model()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Sensor_model();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getAvg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getAvg()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Avg();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getMin()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getMax()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getUnit()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getValidity()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Validity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getCreated_at()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.SensorData#getStr_data <em>Str data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str data</em>'.
	 * @see de.jena.model.sensinact.iceprovider.SensorData#getStr_data()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Str_data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IcesensoreSensinactFactory getIcesensoreSensinactFactory();

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
		 * The meta object literal for the '{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl <em>Ice Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.sensinact.iceprovider.impl.IceSensorImpl
		 * @see de.jena.model.sensinact.iceprovider.impl.IcesensoreSensinactPackageImpl#getIceSensor()
		 * @generated
		 */
		EClass ICE_SENSOR = eINSTANCE.getIceSensor();

		/**
		 * The meta object literal for the '<em><b>H2sugm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__H2SUGM3 = eINSTANCE.getIceSensor_H2sugm3();

		/**
		 * The meta object literal for the '<em><b>Cougm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__COUGM3 = eINSTANCE.getIceSensor_Cougm3();

		/**
		 * The meta object literal for the '<em><b>Nougm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__NOUGM3 = eINSTANCE.getIceSensor_Nougm3();

		/**
		 * The meta object literal for the '<em><b>O3ugm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__O3UGM3 = eINSTANCE.getIceSensor_O3ugm3();

		/**
		 * The meta object literal for the '<em><b>1p</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__1P = eINSTANCE.getIceSensor__1p();

		/**
		 * The meta object literal for the '<em><b>Aqi criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__AQI_CRITERIA = eINSTANCE.getIceSensor_Aqi_criteria();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__TEMPERATURE = eINSTANCE.getIceSensor_Temperature();

		/**
		 * The meta object literal for the '<em><b>Humidity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__HUMIDITY = eINSTANCE.getIceSensor_Humidity();

		/**
		 * The meta object literal for the '<em><b>10p</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__10P = eINSTANCE.getIceSensor__10p();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__PRESSURE = eINSTANCE.getIceSensor_Pressure();

		/**
		 * The meta object literal for the '<em><b>No2ugm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__NO2UGM3 = eINSTANCE.getIceSensor_No2ugm3();

		/**
		 * The meta object literal for the '<em><b>Aqi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__AQI = eINSTANCE.getIceSensor_Aqi();

		/**
		 * The meta object literal for the '<em><b>25p</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__25P = eINSTANCE.getIceSensor__2_5p();

		/**
		 * The meta object literal for the '{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl <em>Sensor Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.sensinact.iceprovider.impl.SensorDataImpl
		 * @see de.jena.model.sensinact.iceprovider.impl.IcesensoreSensinactPackageImpl#getSensorData()
		 * @generated
		 */
		EClass SENSOR_DATA = eINSTANCE.getSensorData();

		/**
		 * The meta object literal for the '<em><b>Sensor type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__SENSOR_TYPE = eINSTANCE.getSensorData_Sensor_type();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__GATEWAY = eINSTANCE.getSensorData_Gateway();

		/**
		 * The meta object literal for the '<em><b>Sensor model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__SENSOR_MODEL = eINSTANCE.getSensorData_Sensor_model();

		/**
		 * The meta object literal for the '<em><b>Avg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__AVG = eINSTANCE.getSensorData_Avg();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__MIN = eINSTANCE.getSensorData_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__MAX = eINSTANCE.getSensorData_Max();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__UNIT = eINSTANCE.getSensorData_Unit();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__VALIDITY = eINSTANCE.getSensorData_Validity();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__CREATED_AT = eINSTANCE.getSensorData_Created_at();

		/**
		 * The meta object literal for the '<em><b>Str data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__STR_DATA = eINSTANCE.getSensorData_Str_data();

	}

} //IcesensoreSensinactPackage
