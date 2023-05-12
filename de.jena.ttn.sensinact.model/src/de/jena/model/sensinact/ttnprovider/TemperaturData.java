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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperatur Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.TemperaturData#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTemperaturData()
 * @model
 * @generated
 */
@ProviderType
public interface TemperaturData extends TtnService {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTemperaturData_Temperature()
	 * @model annotation="Metadata unit='\260C' sensorthings.unit.name='\260C' sensorthings.datastream.type='air_temprature'"
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.TemperaturData#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

} // TemperaturData
