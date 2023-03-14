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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sensinact.model.core.SensiNactPackage;

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
public interface IcesensoreSensinactPackage extends EPackage {
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
	 * The meta object id for the '{@link de.jena.model.sensinact.iceprovider.impl.IceSensoreImpl <em>Ice Sensore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.model.sensinact.iceprovider.impl.IceSensoreImpl
	 * @see de.jena.model.sensinact.iceprovider.impl.IcesensoreSensinactPackageImpl#getIceSensore()
	 * @generated
	 */
	int ICE_SENSORE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__ID = SensiNactPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__ADMIN = SensiNactPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__LINKED_PROVIDERS = SensiNactPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Has beacon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__HAS_BEACON = SensiNactPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>H2sugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__H2SUGM3 = SensiNactPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__COUGM3 = SensiNactPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__NOUGM3 = SensiNactPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>O3ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__O3UGM3 = SensiNactPackage.PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>1p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__1P = SensiNactPackage.PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aqi criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__AQI_CRITERIA = SensiNactPackage.PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__TEMPERATURE = SensiNactPackage.PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__HUMIDITY = SensiNactPackage.PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>10p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__10P = SensiNactPackage.PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__PRESSURE = SensiNactPackage.PROVIDER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>No2ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__NO2UGM3 = SensiNactPackage.PROVIDER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Aqi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__AQI = SensiNactPackage.PROVIDER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>25p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE__25P = SensiNactPackage.PROVIDER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Ice Sensore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE_FEATURE_COUNT = SensiNactPackage.PROVIDER_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Ice Sensore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_SENSORE_OPERATION_COUNT = SensiNactPackage.PROVIDER_OPERATION_COUNT + 0;

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
	int SENSOR_DATA__METADATA = SensiNactPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSOR_TYPE = SensiNactPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__GATEWAY = SensiNactPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSOR_MODEL = SensiNactPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__AVG = SensiNactPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MIN = SensiNactPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MAX = SensiNactPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__UNIT = SensiNactPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__VALIDITY = SensiNactPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__CREATED_AT = SensiNactPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Str data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__STR_DATA = SensiNactPackage.SERVICE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_FEATURE_COUNT = SensiNactPackage.SERVICE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_OPERATION_COUNT = SensiNactPackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.model.sensinact.iceprovider.IceSensore <em>Ice Sensore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ice Sensore</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore
	 * @generated
	 */
	EClass getIceSensore();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.model.sensinact.iceprovider.IceSensore#isHas_beacon <em>Has beacon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has beacon</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#isHas_beacon()
	 * @see #getIceSensore()
	 * @generated
	 */
	EAttribute getIceSensore_Has_beacon();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getH2sugm3 <em>H2sugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H2sugm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getH2sugm3()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_H2sugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getCougm3 <em>Cougm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cougm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getCougm3()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Cougm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getNougm3 <em>Nougm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nougm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getNougm3()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Nougm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getO3ugm3 <em>O3ugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>O3ugm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getO3ugm3()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_O3ugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#get_1p <em>1p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>1p</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#get_1p()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore__1p();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getAqi_criteria <em>Aqi criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aqi criteria</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getAqi_criteria()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Aqi_criteria();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temperature</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getTemperature()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Temperature();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getHumidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Humidity</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getHumidity()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Humidity();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#get_10p <em>10p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>10p</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#get_10p()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore__10p();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pressure</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getPressure()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Pressure();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getNo2ugm3 <em>No2ugm3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No2ugm3</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getNo2ugm3()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_No2ugm3();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#getAqi <em>Aqi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aqi</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#getAqi()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore_Aqi();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.model.sensinact.iceprovider.IceSensore#get_2_5p <em>25p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>25p</em>'.
	 * @see de.jena.model.sensinact.iceprovider.IceSensore#get_2_5p()
	 * @see #getIceSensore()
	 * @generated
	 */
	EReference getIceSensore__2_5p();

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

} //IcesensoreSensinactPackage
