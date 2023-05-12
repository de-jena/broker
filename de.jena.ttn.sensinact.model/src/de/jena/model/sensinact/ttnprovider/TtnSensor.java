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

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ttn Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.TtnSensor#isHas_beacon <em>Has beacon</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.TtnSensor#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnSensor()
 * @model
 * @generated
 */
@ProviderType
public interface TtnSensor extends Provider {
	/**
	 * Returns the value of the '<em><b>Has beacon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has beacon</em>' attribute.
	 * @see #setHas_beacon(boolean)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnSensor_Has_beacon()
	 * @model required="true"
	 * @generated
	 */
	boolean isHas_beacon();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.TtnSensor#isHas_beacon <em>Has beacon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has beacon</em>' attribute.
	 * @see #isHas_beacon()
	 * @generated
	 */
	void setHas_beacon(boolean value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(SensorData)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnSensor_Data()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getData();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.TtnSensor#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(SensorData value);

} // TtnSensor
