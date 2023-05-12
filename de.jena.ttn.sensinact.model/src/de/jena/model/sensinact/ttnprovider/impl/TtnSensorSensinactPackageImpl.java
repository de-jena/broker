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
package de.jena.model.sensinact.ttnprovider.impl;

import de.jena.model.sensinact.ttnprovider.AbstractTtnProvider;
import de.jena.model.sensinact.ttnprovider.GatewayData;
import de.jena.model.sensinact.ttnprovider.NoiseData;
import de.jena.model.sensinact.ttnprovider.SensorData;
import de.jena.model.sensinact.ttnprovider.SoilMoistureData;
import de.jena.model.sensinact.ttnprovider.TemperaturData;
import de.jena.model.sensinact.ttnprovider.TtnNoiseSensor;
import de.jena.model.sensinact.ttnprovider.TtnSensor;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactFactory;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;
import de.jena.model.sensinact.ttnprovider.TtnService;
import de.jena.model.sensinact.ttnprovider.TtnSoilMoistureSensor;
import de.jena.model.sensinact.ttnprovider.TtnTemperatureSensor;

import java.util.Map;

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
public class TtnSensorSensinactPackageImpl extends EPackageImpl implements TtnSensorSensinactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTtnProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttnSensorEClass = null;

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
	private EClass ttnServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttnNoiseSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noiseDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttnTemperatureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperaturDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttnSoilMoistureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soilMoistureDataEClass = null;

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
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TtnSensorSensinactPackageImpl() {
		super(eNS_URI, TtnSensorSensinactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TtnSensorSensinactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TtnSensorSensinactPackage init() {
		if (isInited) return (TtnSensorSensinactPackage)EPackage.Registry.INSTANCE.getEPackage(TtnSensorSensinactPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTtnSensorSensinactPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TtnSensorSensinactPackageImpl theTtnSensorSensinactPackage = registeredTtnSensorSensinactPackage instanceof TtnSensorSensinactPackageImpl ? (TtnSensorSensinactPackageImpl)registeredTtnSensorSensinactPackage : new TtnSensorSensinactPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTtnSensorSensinactPackage.createPackageContents();

		// Initialize created meta-data
		theTtnSensorSensinactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTtnSensorSensinactPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TtnSensorSensinactPackage.eNS_URI, theTtnSensorSensinactPackage);
		return theTtnSensorSensinactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTtnProvider() {
		return abstractTtnProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTtnProvider_Gateway() {
		return (EReference)abstractTtnProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtnSensor() {
		return ttnSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtnSensor_Has_beacon() {
		return (EAttribute)ttnSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTtnSensor_Data() {
		return (EReference)ttnSensorEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSensorData_RawPayload() {
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
	public EReference getSensorData_Payload() {
		return (EReference)sensorDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtnService() {
		return ttnServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtnService_RawPayload() {
		return (EAttribute)ttnServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayData() {
		return gatewayDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayData_Gateway() {
		return (EAttribute)gatewayDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayData_ApplicationId() {
		return (EAttribute)gatewayDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToObjectMap() {
		return stringToObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToObjectMap_Key() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToObjectMap_Value() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtnNoiseSensor() {
		return ttnNoiseSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTtnNoiseSensor_Data() {
		return (EReference)ttnNoiseSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoiseData() {
		return noiseDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoiseData_Battery() {
		return (EAttribute)noiseDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoiseData_Decible() {
		return (EAttribute)noiseDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoiseData_Status() {
		return (EAttribute)noiseDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoiseData_TemperatureBoard() {
		return (EAttribute)noiseDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtnTemperatureSensor() {
		return ttnTemperatureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTtnTemperatureSensor_Data() {
		return (EReference)ttnTemperatureSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemperaturData() {
		return temperaturDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemperaturData_Temperature() {
		return (EAttribute)temperaturDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtnSoilMoistureSensor() {
		return ttnSoilMoistureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTtnSoilMoistureSensor_Data() {
		return (EReference)ttnSoilMoistureSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoilMoistureData() {
		return soilMoistureDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoilMoistureData_Temperature() {
		return (EAttribute)soilMoistureDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoilMoistureData_Battery() {
		return (EAttribute)soilMoistureDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoilMoistureData_Ph() {
		return (EAttribute)soilMoistureDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoilMoistureData_Water() {
		return (EAttribute)soilMoistureDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoilMoistureData_Conductivity() {
		return (EAttribute)soilMoistureDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnSensorSensinactFactory getTtnSensorSensinactFactory() {
		return (TtnSensorSensinactFactory)getEFactoryInstance();
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
		abstractTtnProviderEClass = createEClass(ABSTRACT_TTN_PROVIDER);
		createEReference(abstractTtnProviderEClass, ABSTRACT_TTN_PROVIDER__GATEWAY);

		ttnSensorEClass = createEClass(TTN_SENSOR);
		createEAttribute(ttnSensorEClass, TTN_SENSOR__HAS_BEACON);
		createEReference(ttnSensorEClass, TTN_SENSOR__DATA);

		sensorDataEClass = createEClass(SENSOR_DATA);
		createEAttribute(sensorDataEClass, SENSOR_DATA__RAW_PAYLOAD);
		createEAttribute(sensorDataEClass, SENSOR_DATA__GATEWAY);
		createEReference(sensorDataEClass, SENSOR_DATA__PAYLOAD);

		ttnServiceEClass = createEClass(TTN_SERVICE);
		createEAttribute(ttnServiceEClass, TTN_SERVICE__RAW_PAYLOAD);

		gatewayDataEClass = createEClass(GATEWAY_DATA);
		createEAttribute(gatewayDataEClass, GATEWAY_DATA__GATEWAY);
		createEAttribute(gatewayDataEClass, GATEWAY_DATA__APPLICATION_ID);

		stringToObjectMapEClass = createEClass(STRING_TO_OBJECT_MAP);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__KEY);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__VALUE);

		ttnNoiseSensorEClass = createEClass(TTN_NOISE_SENSOR);
		createEReference(ttnNoiseSensorEClass, TTN_NOISE_SENSOR__DATA);

		noiseDataEClass = createEClass(NOISE_DATA);
		createEAttribute(noiseDataEClass, NOISE_DATA__BATTERY);
		createEAttribute(noiseDataEClass, NOISE_DATA__DECIBLE);
		createEAttribute(noiseDataEClass, NOISE_DATA__STATUS);
		createEAttribute(noiseDataEClass, NOISE_DATA__TEMPERATURE_BOARD);

		ttnTemperatureSensorEClass = createEClass(TTN_TEMPERATURE_SENSOR);
		createEReference(ttnTemperatureSensorEClass, TTN_TEMPERATURE_SENSOR__DATA);

		temperaturDataEClass = createEClass(TEMPERATUR_DATA);
		createEAttribute(temperaturDataEClass, TEMPERATUR_DATA__TEMPERATURE);

		ttnSoilMoistureSensorEClass = createEClass(TTN_SOIL_MOISTURE_SENSOR);
		createEReference(ttnSoilMoistureSensorEClass, TTN_SOIL_MOISTURE_SENSOR__DATA);

		soilMoistureDataEClass = createEClass(SOIL_MOISTURE_DATA);
		createEAttribute(soilMoistureDataEClass, SOIL_MOISTURE_DATA__TEMPERATURE);
		createEAttribute(soilMoistureDataEClass, SOIL_MOISTURE_DATA__BATTERY);
		createEAttribute(soilMoistureDataEClass, SOIL_MOISTURE_DATA__PH);
		createEAttribute(soilMoistureDataEClass, SOIL_MOISTURE_DATA__WATER);
		createEAttribute(soilMoistureDataEClass, SOIL_MOISTURE_DATA__CONDUCTIVITY);
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
		abstractTtnProviderEClass.getESuperTypes().add(theProviderPackage.getProvider());
		ttnSensorEClass.getESuperTypes().add(theProviderPackage.getProvider());
		sensorDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ttnServiceEClass.getESuperTypes().add(theProviderPackage.getService());
		gatewayDataEClass.getESuperTypes().add(theProviderPackage.getService());
		ttnNoiseSensorEClass.getESuperTypes().add(this.getAbstractTtnProvider());
		noiseDataEClass.getESuperTypes().add(this.getTtnService());
		ttnTemperatureSensorEClass.getESuperTypes().add(this.getAbstractTtnProvider());
		temperaturDataEClass.getESuperTypes().add(this.getTtnService());
		ttnSoilMoistureSensorEClass.getESuperTypes().add(this.getAbstractTtnProvider());
		soilMoistureDataEClass.getESuperTypes().add(this.getTtnService());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTtnProviderEClass, AbstractTtnProvider.class, "AbstractTtnProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTtnProvider_Gateway(), this.getGatewayData(), null, "gateway", null, 0, 1, AbstractTtnProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttnSensorEClass, TtnSensor.class, "TtnSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTtnSensor_Has_beacon(), ecorePackage.getEBoolean(), "has_beacon", null, 1, 1, TtnSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTtnSensor_Data(), this.getSensorData(), null, "data", null, 0, 1, TtnSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorDataEClass, SensorData.class, "SensorData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorData_RawPayload(), ecorePackage.getEString(), "rawPayload", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Gateway(), ecorePackage.getEString(), "gateway", null, 1, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorData_Payload(), this.getStringToObjectMap(), null, "payload", null, 0, -1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttnServiceEClass, TtnService.class, "TtnService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTtnService_RawPayload(), ecorePackage.getEString(), "rawPayload", null, 0, 1, TtnService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayDataEClass, GatewayData.class, "GatewayData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGatewayData_Gateway(), ecorePackage.getEString(), "gateway", null, 1, 1, GatewayData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayData_ApplicationId(), ecorePackage.getEString(), "applicationId", null, 1, 1, GatewayData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToObjectMapEClass, Map.Entry.class, "StringToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToObjectMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToObjectMap_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttnNoiseSensorEClass, TtnNoiseSensor.class, "TtnNoiseSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTtnNoiseSensor_Data(), this.getNoiseData(), null, "data", null, 0, 1, TtnNoiseSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noiseDataEClass, NoiseData.class, "NoiseData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoiseData_Battery(), ecorePackage.getEBigDecimal(), "battery", null, 0, 1, NoiseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoiseData_Decible(), ecorePackage.getEInt(), "decible", null, 0, 1, NoiseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoiseData_Status(), ecorePackage.getEInt(), "status", null, 0, 1, NoiseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoiseData_TemperatureBoard(), ecorePackage.getEInt(), "temperatureBoard", null, 0, 1, NoiseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttnTemperatureSensorEClass, TtnTemperatureSensor.class, "TtnTemperatureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTtnTemperatureSensor_Data(), this.getTemperaturData(), null, "data", null, 0, 1, TtnTemperatureSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperaturDataEClass, TemperaturData.class, "TemperaturData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemperaturData_Temperature(), ecorePackage.getEInt(), "temperature", null, 0, 1, TemperaturData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttnSoilMoistureSensorEClass, TtnSoilMoistureSensor.class, "TtnSoilMoistureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTtnSoilMoistureSensor_Data(), this.getSoilMoistureData(), null, "data", null, 0, 1, TtnSoilMoistureSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soilMoistureDataEClass, SoilMoistureData.class, "SoilMoistureData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoilMoistureData_Temperature(), ecorePackage.getEInt(), "temperature", null, 0, 1, SoilMoistureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoilMoistureData_Battery(), ecorePackage.getEBigDecimal(), "battery", null, 0, 1, SoilMoistureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoilMoistureData_Ph(), ecorePackage.getEString(), "ph", null, 0, 1, SoilMoistureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoilMoistureData_Water(), ecorePackage.getEString(), "water", null, 0, 1, SoilMoistureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoilMoistureData_Conductivity(), ecorePackage.getEInt(), "conductivity", null, 0, 1, SoilMoistureData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// Metadata
		createMetadataAnnotations();
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
	 * Initializes the annotations for <b>Metadata</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetadataAnnotations() {
		String source = "Metadata";
		addAnnotation
		  (getNoiseData_Battery(),
		   source,
		   new String[] {
			   "unit", "dB",
			   "sensorthings.unit.name", "dB",
			   "sensorthings.datastream.type", "noise"
		   });
		addAnnotation
		  (getNoiseData_Decible(),
		   source,
		   new String[] {
			   "unit", "%",
			   "sensorthings.unit.name", "%",
			   "sensorthings.datastream.type", "noise"
		   });
		addAnnotation
		  (getNoiseData_TemperatureBoard(),
		   source,
		   new String[] {
			   "unit", "\u00b0C",
			   "sensorthings.unit.name", "\u00b0C",
			   "sensorthings.datastream.type", "noise"
		   });
		addAnnotation
		  (getTemperaturData_Temperature(),
		   source,
		   new String[] {
			   "unit", "\u00b0C",
			   "sensorthings.unit.name", "\u00b0C",
			   "sensorthings.datastream.type", "air_temprature"
		   });
		addAnnotation
		  (getSoilMoistureData_Temperature(),
		   source,
		   new String[] {
			   "unit", "\u00b0C",
			   "sensorthings.unit.name", "\u00b0C",
			   "sensorthings.datastream.type", "soil_moisture"
		   });
		addAnnotation
		  (getSoilMoistureData_Battery(),
		   source,
		   new String[] {
			   "unit", "%",
			   "sensorthings.unit.name", "%",
			   "sensorthings.datastream.type", "soil_moisture"
		   });
		addAnnotation
		  (getSoilMoistureData_Ph(),
		   source,
		   new String[] {
			   "unit", "pH",
			   "sensorthings.unit.name", "pH",
			   "sensorthings.datastream.type", "soil_moisture"
		   });
		addAnnotation
		  (getSoilMoistureData_Water(),
		   source,
		   new String[] {
			   "unit", "%",
			   "sensorthings.unit.name", "%",
			   "sensorthings.datastream.type", "soil_moisture"
		   });
		addAnnotation
		  (getSoilMoistureData_Conductivity(),
		   source,
		   new String[] {
			   "unit", "EC",
			   "sensorthings.unit.name", "EC",
			   "sensorthings.datastream.type", "soil_moisture"
		   });
	}

} //TtnSensorSensinactPackageImpl
