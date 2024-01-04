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
package de.jena.model.icesensor.impl;

import de.jena.model.icesensor.Coords;
import de.jena.model.icesensor.Data;
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.icesensor.IcesensorFactory;
import de.jena.model.icesensor.IcesensorPackage;
import de.jena.model.icesensor.SensorData;
import de.jena.model.icesensor.SensorMessage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IcesensorPackageImpl extends EPackageImpl implements IcesensorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceSENSOREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorMessageEClass = null;

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
	 * @see de.jena.model.icesensor.IcesensorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IcesensorPackageImpl() {
		super(eNS_URI, IcesensorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IcesensorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IcesensorPackage init() {
		if (isInited) return (IcesensorPackage)EPackage.Registry.INSTANCE.getEPackage(IcesensorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIcesensorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IcesensorPackageImpl theIcesensorPackage = registeredIcesensorPackage instanceof IcesensorPackageImpl ? (IcesensorPackageImpl)registeredIcesensorPackage : new IcesensorPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIcesensorPackage.createPackageContents();

		// Initialize created meta-data
		theIcesensorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIcesensorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IcesensorPackage.eNS_URI, theIcesensorPackage);
		return theIcesensorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIceSENSOR() {
		return iceSENSOREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIceSENSOR_Ice_id() {
		return (EAttribute)iceSENSOREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSENSOR_Coords() {
		return (EReference)iceSENSOREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSENSOR_Data() {
		return (EReference)iceSENSOREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIceSENSOR_Has_beacon() {
		return (EAttribute)iceSENSOREClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIceSENSOR_Detail() {
		return (EAttribute)iceSENSOREClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_H2sugm3() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Cougm3() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Nougm3() {
		return (EReference)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_O3ugm3() {
		return (EReference)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData__1p() {
		return (EReference)dataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Aqi_criteria() {
		return (EReference)dataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Temperature() {
		return (EReference)dataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Humidity() {
		return (EReference)dataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData__10p() {
		return (EReference)dataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Pressure() {
		return (EReference)dataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_No2ugm3() {
		return (EReference)dataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Aqi() {
		return (EReference)dataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData__2_5p() {
		return (EReference)dataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoords() {
		return coordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoords_Latitude() {
		return (EAttribute)coordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoords_Longitude() {
		return (EAttribute)coordsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorData() {
		return sensorDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Sensor_type() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Gateway() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Sensor_model() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Avg() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Min() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Max() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Unit() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Validity() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Created_at() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Str_data() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorMessage() {
		return sensorMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorMessage_Type() {
		return (EAttribute)sensorMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorMessage_Stream() {
		return (EAttribute)sensorMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorMessage_Data() {
		return (EReference)sensorMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IcesensorFactory getIcesensorFactory() {
		return (IcesensorFactory)getEFactoryInstance();
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
		iceSENSOREClass = createEClass(ICE_SENSOR);
		createEAttribute(iceSENSOREClass, ICE_SENSOR__ICE_ID);
		createEReference(iceSENSOREClass, ICE_SENSOR__COORDS);
		createEReference(iceSENSOREClass, ICE_SENSOR__DATA);
		createEAttribute(iceSENSOREClass, ICE_SENSOR__HAS_BEACON);
		createEAttribute(iceSENSOREClass, ICE_SENSOR__DETAIL);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__H2SUGM3);
		createEReference(dataEClass, DATA__COUGM3);
		createEReference(dataEClass, DATA__NOUGM3);
		createEReference(dataEClass, DATA__O3UGM3);
		createEReference(dataEClass, DATA__1P);
		createEReference(dataEClass, DATA__AQI_CRITERIA);
		createEReference(dataEClass, DATA__TEMPERATURE);
		createEReference(dataEClass, DATA__HUMIDITY);
		createEReference(dataEClass, DATA__10P);
		createEReference(dataEClass, DATA__PRESSURE);
		createEReference(dataEClass, DATA__NO2UGM3);
		createEReference(dataEClass, DATA__AQI);
		createEReference(dataEClass, DATA__25P);

		coordsEClass = createEClass(COORDS);
		createEAttribute(coordsEClass, COORDS__LATITUDE);
		createEAttribute(coordsEClass, COORDS__LONGITUDE);

		sensorDataEClass = createEClass(SENSOR_DATA);
		createEAttribute(sensorDataEClass, SENSOR_DATA__SENSOR_TYPE);
		createEAttribute(sensorDataEClass, SENSOR_DATA__GATEWAY);
		createEAttribute(sensorDataEClass, SENSOR_DATA__SENSOR_MODEL);
		createEAttribute(sensorDataEClass, SENSOR_DATA__AVG);
		createEAttribute(sensorDataEClass, SENSOR_DATA__MIN);
		createEAttribute(sensorDataEClass, SENSOR_DATA__MAX);
		createEAttribute(sensorDataEClass, SENSOR_DATA__UNIT);
		createEAttribute(sensorDataEClass, SENSOR_DATA__VALIDITY);
		createEAttribute(sensorDataEClass, SENSOR_DATA__CREATED_AT);
		createEAttribute(sensorDataEClass, SENSOR_DATA__STR_DATA);

		sensorMessageEClass = createEClass(SENSOR_MESSAGE);
		createEAttribute(sensorMessageEClass, SENSOR_MESSAGE__TYPE);
		createEAttribute(sensorMessageEClass, SENSOR_MESSAGE__STREAM);
		createEReference(sensorMessageEClass, SENSOR_MESSAGE__DATA);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(iceSENSOREClass, IceSENSOR.class, "IceSENSOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIceSENSOR_Ice_id(), ecorePackage.getEString(), "ice_id", null, 0, 1, IceSENSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSENSOR_Coords(), this.getCoords(), null, "coords", null, 0, 1, IceSENSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSENSOR_Data(), this.getData(), null, "data", null, 0, 1, IceSENSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIceSENSOR_Has_beacon(), ecorePackage.getEBoolean(), "has_beacon", null, 1, 1, IceSENSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIceSENSOR_Detail(), ecorePackage.getEString(), "detail", null, 0, 1, IceSENSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_H2sugm3(), this.getSensorData(), null, "h2sugm3", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Cougm3(), this.getSensorData(), null, "cougm3", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Nougm3(), this.getSensorData(), null, "nougm3", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_O3ugm3(), this.getSensorData(), null, "o3ugm3", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData__1p(), this.getSensorData(), null, "_1p", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Aqi_criteria(), this.getSensorData(), null, "aqi_criteria", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Temperature(), this.getSensorData(), null, "temperature", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Humidity(), this.getSensorData(), null, "humidity", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData__10p(), this.getSensorData(), null, "_10p", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Pressure(), this.getSensorData(), null, "pressure", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_No2ugm3(), this.getSensorData(), null, "no2ugm3", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Aqi(), this.getSensorData(), null, "aqi", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData__2_5p(), this.getSensorData(), null, "_2_5p", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordsEClass, Coords.class, "Coords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoords_Latitude(), ecorePackage.getEDouble(), "latitude", null, 1, 1, Coords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoords_Longitude(), ecorePackage.getEDouble(), "longitude", null, 1, 1, Coords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorDataEClass, SensorData.class, "SensorData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorData_Sensor_type(), ecorePackage.getEString(), "sensor_type", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Gateway(), ecorePackage.getEString(), "gateway", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Sensor_model(), ecorePackage.getEString(), "sensor_model", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Avg(), ecorePackage.getEDouble(), "avg", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Min(), ecorePackage.getEDouble(), "min", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Max(), ecorePackage.getEDouble(), "max", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Validity(), ecorePackage.getEInt(), "validity", "0", 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Created_at(), ecorePackage.getEDate(), "created_at", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Str_data(), ecorePackage.getEString(), "str_data", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorMessageEClass, SensorMessage.class, "SensorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorMessage_Type(), ecorePackage.getEString(), "type", null, 0, 1, SensorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorMessage_Stream(), ecorePackage.getEString(), "stream", null, 0, 1, SensorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorMessage_Data(), this.getSensorData(), null, "data", null, 0, 1, SensorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// JsonAlias
		createJsonAliasAnnotations();
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

	/**
	 * Initializes the annotations for <b>JsonAlias</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJsonAliasAnnotations() {
		String source = "JsonAlias";
		addAnnotation
		  (getData_H2sugm3(),
		   source,
		   new String[] {
			   "value", "h2s-ugm3"
		   });
		addAnnotation
		  (getData_Cougm3(),
		   source,
		   new String[] {
			   "value", "co-ugm3"
		   });
		addAnnotation
		  (getData_Nougm3(),
		   source,
		   new String[] {
			   "value", "no-ugm3"
		   });
		addAnnotation
		  (getData_O3ugm3(),
		   source,
		   new String[] {
			   "value", "o3-ugm3"
		   });
		addAnnotation
		  (getData__1p(),
		   source,
		   new String[] {
			   "value", "1.0p"
		   });
		addAnnotation
		  (getData_Aqi_criteria(),
		   source,
		   new String[] {
			   "value", "aqu-criteria"
		   });
		addAnnotation
		  (getData__10p(),
		   source,
		   new String[] {
			   "value", "10p"
		   });
		addAnnotation
		  (getData_No2ugm3(),
		   source,
		   new String[] {
			   "value", "no2-ugm3"
		   });
	}

} //IcesensorPackageImpl
