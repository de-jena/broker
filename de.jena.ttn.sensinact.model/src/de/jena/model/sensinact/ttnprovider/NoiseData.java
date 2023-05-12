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

import java.math.BigDecimal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noise Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.NoiseData#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.NoiseData#getDecible <em>Decible</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.NoiseData#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.NoiseData#getTemperatureBoard <em>Temperature Board</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getNoiseData()
 * @model
 * @generated
 */
@ProviderType
public interface NoiseData extends TtnService {
	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(BigDecimal)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getNoiseData_Battery()
	 * @model annotation="Metadata unit='dB' sensorthings.unit.name='dB' sensorthings.datastream.type='noise'"
	 * @generated
	 */
	BigDecimal getBattery();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Decible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decible</em>' attribute.
	 * @see #setDecible(int)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getNoiseData_Decible()
	 * @model annotation="Metadata unit='%' sensorthings.unit.name='%' sensorthings.datastream.type='noise'"
	 * @generated
	 */
	int getDecible();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getDecible <em>Decible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decible</em>' attribute.
	 * @see #getDecible()
	 * @generated
	 */
	void setDecible(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getNoiseData_Status()
	 * @model
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Temperature Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Board</em>' attribute.
	 * @see #setTemperatureBoard(int)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getNoiseData_TemperatureBoard()
	 * @model annotation="Metadata unit='\260C' sensorthings.unit.name='\260C' sensorthings.datastream.type='noise'"
	 * @generated
	 */
	int getTemperatureBoard();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.NoiseData#getTemperatureBoard <em>Temperature Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Board</em>' attribute.
	 * @see #getTemperatureBoard()
	 * @generated
	 */
	void setTemperatureBoard(int value);

} // NoiseData
