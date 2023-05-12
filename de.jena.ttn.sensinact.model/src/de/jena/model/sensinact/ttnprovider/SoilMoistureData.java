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
 * A representation of the model object '<em><b>Soil Moisture Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getPh <em>Ph</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getWater <em>Water</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getConductivity <em>Conductivity</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSoilMoistureData()
 * @model
 * @generated
 */
@ProviderType
public interface SoilMoistureData extends TtnService {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSoilMoistureData_Temperature()
	 * @model annotation="Metadata unit='\260C' sensorthings.unit.name='\260C' sensorthings.datastream.type='soil_moisture'"
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(BigDecimal)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSoilMoistureData_Battery()
	 * @model annotation="Metadata unit='%' sensorthings.unit.name='%' sensorthings.datastream.type='soil_moisture'"
	 * @generated
	 */
	BigDecimal getBattery();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Ph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ph</em>' attribute.
	 * @see #setPh(String)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSoilMoistureData_Ph()
	 * @model annotation="Metadata unit='pH' sensorthings.unit.name='pH' sensorthings.datastream.type='soil_moisture'"
	 * @generated
	 */
	String getPh();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getPh <em>Ph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph</em>' attribute.
	 * @see #getPh()
	 * @generated
	 */
	void setPh(String value);

	/**
	 * Returns the value of the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' attribute.
	 * @see #setWater(String)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSoilMoistureData_Water()
	 * @model annotation="Metadata unit='%' sensorthings.unit.name='%' sensorthings.datastream.type='soil_moisture'"
	 * @generated
	 */
	String getWater();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getWater <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water</em>' attribute.
	 * @see #getWater()
	 * @generated
	 */
	void setWater(String value);

	/**
	 * Returns the value of the '<em><b>Conductivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductivity</em>' attribute.
	 * @see #setConductivity(int)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSoilMoistureData_Conductivity()
	 * @model annotation="Metadata unit='EC' sensorthings.unit.name='EC' sensorthings.datastream.type='soil_moisture'"
	 * @generated
	 */
	int getConductivity();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SoilMoistureData#getConductivity <em>Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductivity</em>' attribute.
	 * @see #getConductivity()
	 * @generated
	 */
	void setConductivity(int value);

} // SoilMoistureData
