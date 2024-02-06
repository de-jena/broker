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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage
 * @generated
 */
@ProviderType
public interface TtnSensorSensinactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtnSensorSensinactFactory eINSTANCE = de.jena.model.sensinact.ttnprovider.impl.TtnSensorSensinactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Ttn Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Ttn Provider</em>'.
	 * @generated
	 */
	AbstractTtnProvider createAbstractTtnProvider();

	/**
	 * Returns a new object of class '<em>Ttn Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttn Sensor</em>'.
	 * @generated
	 */
	TtnSensor createTtnSensor();

	/**
	 * Returns a new object of class '<em>Sensor Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Data</em>'.
	 * @generated
	 */
	SensorData createSensorData();

	/**
	 * Returns a new object of class '<em>Ttn Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttn Service</em>'.
	 * @generated
	 */
	TtnService createTtnService();

	/**
	 * Returns a new object of class '<em>Gateway Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Data</em>'.
	 * @generated
	 */
	GatewayData createGatewayData();

	/**
	 * Returns a new object of class '<em>Ttn Noise Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttn Noise Sensor</em>'.
	 * @generated
	 */
	TtnNoiseSensor createTtnNoiseSensor();

	/**
	 * Returns a new object of class '<em>Noise Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noise Data</em>'.
	 * @generated
	 */
	NoiseData createNoiseData();

	/**
	 * Returns a new object of class '<em>Ttn Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttn Temperature Sensor</em>'.
	 * @generated
	 */
	TtnTemperatureSensor createTtnTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Temperatur Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperatur Data</em>'.
	 * @generated
	 */
	TemperaturData createTemperaturData();

	/**
	 * Returns a new object of class '<em>Ttn Soil Moisture Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttn Soil Moisture Sensor</em>'.
	 * @generated
	 */
	TtnSoilMoistureSensor createTtnSoilMoistureSensor();

	/**
	 * Returns a new object of class '<em>Soil Moisture Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soil Moisture Data</em>'.
	 * @generated
	 */
	SoilMoistureData createSoilMoistureData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TtnSensorSensinactPackage getTtnSensorSensinactPackage();

} //TtnSensorSensinactFactory
