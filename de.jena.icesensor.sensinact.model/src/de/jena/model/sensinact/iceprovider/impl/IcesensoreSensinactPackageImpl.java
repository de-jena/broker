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
package de.jena.model.sensinact.iceprovider.impl;

import de.jena.model.sensinact.iceprovider.IceSensor;
import de.jena.model.sensinact.iceprovider.IcesensoreSensinactFactory;
import de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage;
import de.jena.model.sensinact.iceprovider.SensorData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IcesensoreSensinactPackageImpl extends EPackageImpl implements IcesensoreSensinactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDataEClass = null;

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
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IcesensoreSensinactPackageImpl() {
		super(eNS_URI, IcesensoreSensinactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IcesensoreSensinactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IcesensoreSensinactPackage init() {
		if (isInited) return (IcesensoreSensinactPackage)EPackage.Registry.INSTANCE.getEPackage(IcesensoreSensinactPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIcesensoreSensinactPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IcesensoreSensinactPackageImpl theIcesensoreSensinactPackage = registeredIcesensoreSensinactPackage instanceof IcesensoreSensinactPackageImpl ? (IcesensoreSensinactPackageImpl)registeredIcesensoreSensinactPackage : new IcesensoreSensinactPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIcesensoreSensinactPackage.createPackageContents();

		// Initialize created meta-data
		theIcesensoreSensinactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIcesensoreSensinactPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IcesensoreSensinactPackage.eNS_URI, theIcesensoreSensinactPackage);
		return theIcesensoreSensinactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIceSensor() {
		return iceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_H2sugm3() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Cougm3() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Nougm3() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_O3ugm3() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor__1p() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Aqi_criteria() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Temperature() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Humidity() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor__10p() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Pressure() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_No2ugm3() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor_Aqi() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIceSensor__2_5p() {
		return (EReference)iceSensorEClass.getEStructuralFeatures().get(12);
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
	public IcesensoreSensinactFactory getIcesensoreSensinactFactory() {
		return (IcesensoreSensinactFactory)getEFactoryInstance();
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
		iceSensorEClass = createEClass(ICE_SENSOR);
		createEReference(iceSensorEClass, ICE_SENSOR__H2SUGM3);
		createEReference(iceSensorEClass, ICE_SENSOR__COUGM3);
		createEReference(iceSensorEClass, ICE_SENSOR__NOUGM3);
		createEReference(iceSensorEClass, ICE_SENSOR__O3UGM3);
		createEReference(iceSensorEClass, ICE_SENSOR__1P);
		createEReference(iceSensorEClass, ICE_SENSOR__AQI_CRITERIA);
		createEReference(iceSensorEClass, ICE_SENSOR__TEMPERATURE);
		createEReference(iceSensorEClass, ICE_SENSOR__HUMIDITY);
		createEReference(iceSensorEClass, ICE_SENSOR__10P);
		createEReference(iceSensorEClass, ICE_SENSOR__PRESSURE);
		createEReference(iceSensorEClass, ICE_SENSOR__NO2UGM3);
		createEReference(iceSensorEClass, ICE_SENSOR__AQI);
		createEReference(iceSensorEClass, ICE_SENSOR__25P);

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

		// Obtain other dependent packages
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iceSensorEClass.getESuperTypes().add(theProviderPackage.getProvider());
		sensorDataEClass.getESuperTypes().add(theProviderPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(iceSensorEClass, IceSensor.class, "IceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIceSensor_H2sugm3(), this.getSensorData(), null, "h2sugm3", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Cougm3(), this.getSensorData(), null, "cougm3", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Nougm3(), this.getSensorData(), null, "nougm3", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_O3ugm3(), this.getSensorData(), null, "o3ugm3", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor__1p(), this.getSensorData(), null, "_1p", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Aqi_criteria(), this.getSensorData(), null, "aqi_criteria", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Temperature(), this.getSensorData(), null, "temperature", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Humidity(), this.getSensorData(), null, "humidity", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor__10p(), this.getSensorData(), null, "_10p", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Pressure(), this.getSensorData(), null, "pressure", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_No2ugm3(), this.getSensorData(), null, "no2ugm3", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor_Aqi(), this.getSensorData(), null, "aqi", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIceSensor__2_5p(), this.getSensorData(), null, "_2_5p", null, 0, 1, IceSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorDataEClass, SensorData.class, "SensorData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorData_Sensor_type(), ecorePackage.getEString(), "sensor_type", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Gateway(), ecorePackage.getEString(), "gateway", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Sensor_model(), ecorePackage.getEString(), "sensor_model", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Avg(), ecorePackage.getEDouble(), "avg", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Min(), ecorePackage.getEDouble(), "min", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Max(), ecorePackage.getEDouble(), "max", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Validity(), ecorePackage.getEInt(), "validity", "-1", 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Created_at(), ecorePackage.getEDate(), "created_at", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Str_data(), ecorePackage.getEString(), "str_data", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //IcesensoreSensinactPackageImpl
