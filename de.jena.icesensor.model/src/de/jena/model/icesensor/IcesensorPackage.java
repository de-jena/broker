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
package de.jena.model.icesensor;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.jena.model.icesensor.IcesensorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = IcesensorPackage.eNS_URI, genModel = "/model/icesensor.genmodel", genModelSourceLocations = {"model/icesensor.genmodel","de.jena.icesensor.model/model/icesensor.genmodel"}, ecore="/model/icesensor.ecore", ecoreSourceLocations="/model/icesensor.ecore")
public interface IcesensorPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "icesensor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jena.de/models/icesensor/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "icesensor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IcesensorPackage eINSTANCE = de.jena.model.icesensor.impl.IcesensorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.model.icesensor.impl.IceSENSORImpl <em>Ice SENSOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.icesensor.impl.IceSENSORImpl
	 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getIceSENSOR()
	 * @generated
	 */
	int ICE_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Ice id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__ICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Coords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__COORDS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__DATA = 2;

	/**
	 * The feature id for the '<em><b>Has beacon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__HAS_BEACON = 3;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR__DETAIL = 4;

	/**
	 * The number of structural features of the '<em>Ice SENSOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ice SENSOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.icesensor.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.icesensor.impl.DataImpl
	 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getData()
	 * @generated
	 */
	int DATA = 1;

	/**
	 * The feature id for the '<em><b>H2sugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__H2SUGM3 = 0;

	/**
	 * The feature id for the '<em><b>Cougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__COUGM3 = 1;

	/**
	 * The feature id for the '<em><b>Nougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NOUGM3 = 2;

	/**
	 * The feature id for the '<em><b>O3ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__O3UGM3 = 3;

	/**
	 * The feature id for the '<em><b>1p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__1P = 4;

	/**
	 * The feature id for the '<em><b>Aqi criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AQI_CRITERIA = 5;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TEMPERATURE = 6;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HUMIDITY = 7;

	/**
	 * The feature id for the '<em><b>10p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__10P = 8;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PRESSURE = 9;

	/**
	 * The feature id for the '<em><b>No2ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NO2UGM3 = 10;

	/**
	 * The feature id for the '<em><b>Aqi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AQI = 11;

	/**
	 * The feature id for the '<em><b>25p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__25P = 12;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.icesensor.impl.CoordsImpl <em>Coords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.icesensor.impl.CoordsImpl
	 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getCoords()
	 * @generated
	 */
	int COORDS = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDS__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDS__LONGITUDE = 1;

	/**
	 * The number of structural features of the '<em>Coords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.icesensor.impl.SensorDataImpl <em>Sensor Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.icesensor.impl.SensorDataImpl
	 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getSensorData()
	 * @generated
	 */
	int SENSOR_DATA = 3;

	/**
	 * The feature id for the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__GATEWAY = 1;

	/**
	 * The feature id for the '<em><b>Sensor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSOR_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__AVG = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MIN = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MAX = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__UNIT = 6;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__VALIDITY = 7;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__CREATED_AT = 8;

	/**
	 * The feature id for the '<em><b>Str data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__STR_DATA = 9;

	/**
	 * The number of structural features of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.model.icesensor.impl.SensorMessageImpl <em>Sensor Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.icesensor.impl.SensorMessageImpl
	 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getSensorMessage()
	 * @generated
	 */
	int SENSOR_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MESSAGE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MESSAGE__STREAM = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MESSAGE__DATA = 2;

	/**
	 * The number of structural features of the '<em>Sensor Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MESSAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.model.icesensor.IceSENSOR <em>Ice SENSOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ice SENSOR</em>'.
	 * @see de.jena.model.icesensor.IceSENSOR
	 * @generated
	 */
	EClass getIceSENSOR();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.IceSENSOR#getIce_id <em>Ice id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ice id</em>'.
	 * @see de.jena.model.icesensor.IceSENSOR#getIce_id()
	 * @see #getIceSENSOR()
	 * @generated
	 */
	EAttribute getIceSENSOR_Ice_id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.IceSENSOR#getCoords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coords</em>'.
	 * @see de.jena.model.icesensor.IceSENSOR#getCoords()
	 * @see #getIceSENSOR()
	 * @generated
	 */
	EReference getIceSENSOR_Coords();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.IceSENSOR#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.jena.model.icesensor.IceSENSOR#getData()
	 * @see #getIceSENSOR()
	 * @generated
	 */
	EReference getIceSENSOR_Data();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.IceSENSOR#isHas_beacon <em>Has beacon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has beacon</em>'.
	 * @see de.jena.model.icesensor.IceSENSOR#isHas_beacon()
	 * @see #getIceSENSOR()
	 * @generated
	 */
	EAttribute getIceSENSOR_Has_beacon();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.IceSENSOR#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see de.jena.model.icesensor.IceSENSOR#getDetail()
	 * @see #getIceSENSOR()
	 * @generated
	 */
	EAttribute getIceSENSOR_Detail();

	/**
	 * Returns the meta object for class '{@link de.jena.model.icesensor.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.jena.model.icesensor.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getH2sugm3 <em>H2sugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H2sugm3</em>'.
	 * @see de.jena.model.icesensor.Data#getH2sugm3()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_H2sugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getCougm3 <em>Cougm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cougm3</em>'.
	 * @see de.jena.model.icesensor.Data#getCougm3()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Cougm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getNougm3 <em>Nougm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nougm3</em>'.
	 * @see de.jena.model.icesensor.Data#getNougm3()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Nougm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getO3ugm3 <em>O3ugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>O3ugm3</em>'.
	 * @see de.jena.model.icesensor.Data#getO3ugm3()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_O3ugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#get_1p <em>1p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>1p</em>'.
	 * @see de.jena.model.icesensor.Data#get_1p()
	 * @see #getData()
	 * @generated
	 */
	EReference getData__1p();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getAqi_criteria <em>Aqi criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aqi criteria</em>'.
	 * @see de.jena.model.icesensor.Data#getAqi_criteria()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Aqi_criteria();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temperature</em>'.
	 * @see de.jena.model.icesensor.Data#getTemperature()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Temperature();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getHumidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Humidity</em>'.
	 * @see de.jena.model.icesensor.Data#getHumidity()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Humidity();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#get_10p <em>10p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>10p</em>'.
	 * @see de.jena.model.icesensor.Data#get_10p()
	 * @see #getData()
	 * @generated
	 */
	EReference getData__10p();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pressure</em>'.
	 * @see de.jena.model.icesensor.Data#getPressure()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Pressure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getNo2ugm3 <em>No2ugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No2ugm3</em>'.
	 * @see de.jena.model.icesensor.Data#getNo2ugm3()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_No2ugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#getAqi <em>Aqi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aqi</em>'.
	 * @see de.jena.model.icesensor.Data#getAqi()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Aqi();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.Data#get_2_5p <em>25p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>25p</em>'.
	 * @see de.jena.model.icesensor.Data#get_2_5p()
	 * @see #getData()
	 * @generated
	 */
	EReference getData__2_5p();

	/**
	 * Returns the meta object for class '{@link de.jena.model.icesensor.Coords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coords</em>'.
	 * @see de.jena.model.icesensor.Coords
	 * @generated
	 */
	EClass getCoords();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.Coords#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.jena.model.icesensor.Coords#getLatitude()
	 * @see #getCoords()
	 * @generated
	 */
	EAttribute getCoords_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.Coords#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.jena.model.icesensor.Coords#getLongitude()
	 * @see #getCoords()
	 * @generated
	 */
	EAttribute getCoords_Longitude();

	/**
	 * Returns the meta object for class '{@link de.jena.model.icesensor.SensorData <em>Sensor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data</em>'.
	 * @see de.jena.model.icesensor.SensorData
	 * @generated
	 */
	EClass getSensorData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getSensor_type <em>Sensor type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor type</em>'.
	 * @see de.jena.model.icesensor.SensorData#getSensor_type()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Sensor_type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see de.jena.model.icesensor.SensorData#getGateway()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getSensor_model <em>Sensor model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor model</em>'.
	 * @see de.jena.model.icesensor.SensorData#getSensor_model()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Sensor_model();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getAvg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg</em>'.
	 * @see de.jena.model.icesensor.SensorData#getAvg()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Avg();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.jena.model.icesensor.SensorData#getMin()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.jena.model.icesensor.SensorData#getMax()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.jena.model.icesensor.SensorData#getUnit()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see de.jena.model.icesensor.SensorData#getValidity()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Validity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see de.jena.model.icesensor.SensorData#getCreated_at()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorData#getStr_data <em>Str data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str data</em>'.
	 * @see de.jena.model.icesensor.SensorData#getStr_data()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Str_data();

	/**
	 * Returns the meta object for class '{@link de.jena.model.icesensor.SensorMessage <em>Sensor Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Message</em>'.
	 * @see de.jena.model.icesensor.SensorMessage
	 * @generated
	 */
	EClass getSensorMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.model.icesensor.SensorMessage#getType()
	 * @see #getSensorMessage()
	 * @generated
	 */
	EAttribute getSensorMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.icesensor.SensorMessage#getStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream</em>'.
	 * @see de.jena.model.icesensor.SensorMessage#getStream()
	 * @see #getSensorMessage()
	 * @generated
	 */
	EAttribute getSensorMessage_Stream();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.icesensor.SensorMessage#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.jena.model.icesensor.SensorMessage#getData()
	 * @see #getSensorMessage()
	 * @generated
	 */
	EReference getSensorMessage_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IcesensorFactory getIcesensorFactory();

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
		 * The meta object literal for the '{@link de.jena.model.icesensor.impl.IceSENSORImpl <em>Ice SENSOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.icesensor.impl.IceSENSORImpl
		 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getIceSENSOR()
		 * @generated
		 */
		EClass ICE_SENSOR = eINSTANCE.getIceSENSOR();

		/**
		 * The meta object literal for the '<em><b>Ice id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICE_SENSOR__ICE_ID = eINSTANCE.getIceSENSOR_Ice_id();

		/**
		 * The meta object literal for the '<em><b>Coords</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__COORDS = eINSTANCE.getIceSENSOR_Coords();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_SENSOR__DATA = eINSTANCE.getIceSENSOR_Data();

		/**
		 * The meta object literal for the '<em><b>Has beacon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICE_SENSOR__HAS_BEACON = eINSTANCE.getIceSENSOR_Has_beacon();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICE_SENSOR__DETAIL = eINSTANCE.getIceSENSOR_Detail();

		/**
		 * The meta object literal for the '{@link de.jena.model.icesensor.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.icesensor.impl.DataImpl
		 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>H2sugm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__H2SUGM3 = eINSTANCE.getData_H2sugm3();

		/**
		 * The meta object literal for the '<em><b>Cougm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__COUGM3 = eINSTANCE.getData_Cougm3();

		/**
		 * The meta object literal for the '<em><b>Nougm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__NOUGM3 = eINSTANCE.getData_Nougm3();

		/**
		 * The meta object literal for the '<em><b>O3ugm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__O3UGM3 = eINSTANCE.getData_O3ugm3();

		/**
		 * The meta object literal for the '<em><b>1p</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__1P = eINSTANCE.getData__1p();

		/**
		 * The meta object literal for the '<em><b>Aqi criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__AQI_CRITERIA = eINSTANCE.getData_Aqi_criteria();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TEMPERATURE = eINSTANCE.getData_Temperature();

		/**
		 * The meta object literal for the '<em><b>Humidity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__HUMIDITY = eINSTANCE.getData_Humidity();

		/**
		 * The meta object literal for the '<em><b>10p</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__10P = eINSTANCE.getData__10p();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PRESSURE = eINSTANCE.getData_Pressure();

		/**
		 * The meta object literal for the '<em><b>No2ugm3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__NO2UGM3 = eINSTANCE.getData_No2ugm3();

		/**
		 * The meta object literal for the '<em><b>Aqi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__AQI = eINSTANCE.getData_Aqi();

		/**
		 * The meta object literal for the '<em><b>25p</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__25P = eINSTANCE.getData__2_5p();

		/**
		 * The meta object literal for the '{@link de.jena.model.icesensor.impl.CoordsImpl <em>Coords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.icesensor.impl.CoordsImpl
		 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getCoords()
		 * @generated
		 */
		EClass COORDS = eINSTANCE.getCoords();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDS__LATITUDE = eINSTANCE.getCoords_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDS__LONGITUDE = eINSTANCE.getCoords_Longitude();

		/**
		 * The meta object literal for the '{@link de.jena.model.icesensor.impl.SensorDataImpl <em>Sensor Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.icesensor.impl.SensorDataImpl
		 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getSensorData()
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

		/**
		 * The meta object literal for the '{@link de.jena.model.icesensor.impl.SensorMessageImpl <em>Sensor Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.model.icesensor.impl.SensorMessageImpl
		 * @see de.jena.model.icesensor.impl.IcesensorPackageImpl#getSensorMessage()
		 * @generated
		 */
		EClass SENSOR_MESSAGE = eINSTANCE.getSensorMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MESSAGE__TYPE = eINSTANCE.getSensorMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MESSAGE__STREAM = eINSTANCE.getSensorMessage_Stream();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_MESSAGE__DATA = eINSTANCE.getSensorMessage_Data();

	}

} //IcesensorPackage
