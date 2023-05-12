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

import de.jena.model.sensinact.ttnprovider.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
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
public class TtnSensorSensinactFactoryImpl extends EFactoryImpl implements TtnSensorSensinactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TtnSensorSensinactFactory init() {
		try {
			TtnSensorSensinactFactory theTtnSensorSensinactFactory = (TtnSensorSensinactFactory)EPackage.Registry.INSTANCE.getEFactory(TtnSensorSensinactPackage.eNS_URI);
			if (theTtnSensorSensinactFactory != null) {
				return theTtnSensorSensinactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TtnSensorSensinactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtnSensorSensinactFactoryImpl() {
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
			case TtnSensorSensinactPackage.ABSTRACT_TTN_PROVIDER: return createAbstractTtnProvider();
			case TtnSensorSensinactPackage.TTN_SENSOR: return createTtnSensor();
			case TtnSensorSensinactPackage.SENSOR_DATA: return createSensorData();
			case TtnSensorSensinactPackage.TTN_SERVICE: return createTtnService();
			case TtnSensorSensinactPackage.GATEWAY_DATA: return createGatewayData();
			case TtnSensorSensinactPackage.STRING_TO_OBJECT_MAP: return (EObject)createStringToObjectMap();
			case TtnSensorSensinactPackage.TTN_NOISE_SENSOR: return createTtnNoiseSensor();
			case TtnSensorSensinactPackage.NOISE_DATA: return createNoiseData();
			case TtnSensorSensinactPackage.TTN_TEMPERATURE_SENSOR: return createTtnTemperatureSensor();
			case TtnSensorSensinactPackage.TEMPERATUR_DATA: return createTemperaturData();
			case TtnSensorSensinactPackage.TTN_SOIL_MOISTURE_SENSOR: return createTtnSoilMoistureSensor();
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA: return createSoilMoistureData();
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
	public AbstractTtnProvider createAbstractTtnProvider() {
		AbstractTtnProviderImpl abstractTtnProvider = new AbstractTtnProviderImpl();
		return abstractTtnProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnSensor createTtnSensor() {
		TtnSensorImpl ttnSensor = new TtnSensorImpl();
		return ttnSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData createSensorData() {
		SensorDataImpl sensorData = new SensorDataImpl();
		return sensorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnService createTtnService() {
		TtnServiceImpl ttnService = new TtnServiceImpl();
		return ttnService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayData createGatewayData() {
		GatewayDataImpl gatewayData = new GatewayDataImpl();
		return gatewayData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Object> createStringToObjectMap() {
		StringToObjectMapImpl stringToObjectMap = new StringToObjectMapImpl();
		return stringToObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnNoiseSensor createTtnNoiseSensor() {
		TtnNoiseSensorImpl ttnNoiseSensor = new TtnNoiseSensorImpl();
		return ttnNoiseSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoiseData createNoiseData() {
		NoiseDataImpl noiseData = new NoiseDataImpl();
		return noiseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnTemperatureSensor createTtnTemperatureSensor() {
		TtnTemperatureSensorImpl ttnTemperatureSensor = new TtnTemperatureSensorImpl();
		return ttnTemperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemperaturData createTemperaturData() {
		TemperaturDataImpl temperaturData = new TemperaturDataImpl();
		return temperaturData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnSoilMoistureSensor createTtnSoilMoistureSensor() {
		TtnSoilMoistureSensorImpl ttnSoilMoistureSensor = new TtnSoilMoistureSensorImpl();
		return ttnSoilMoistureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoilMoistureData createSoilMoistureData() {
		SoilMoistureDataImpl soilMoistureData = new SoilMoistureDataImpl();
		return soilMoistureData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtnSensorSensinactPackage getTtnSensorSensinactPackage() {
		return (TtnSensorSensinactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TtnSensorSensinactPackage getPackage() {
		return TtnSensorSensinactPackage.eINSTANCE;
	}

} //TtnSensorSensinactFactoryImpl
