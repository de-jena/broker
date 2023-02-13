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
package de.jena.model.icesensor;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.icesensor.SensorMessage#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorMessage#getStream <em>Stream</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorMessage#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.jena.model.icesensor.IcesensorPackage#getSensorMessage()
 * @model
 * @generated
 */
@ProviderType
public interface SensorMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorMessage_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorMessage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' attribute.
	 * @see #setStream(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorMessage_Stream()
	 * @model
	 * @generated
	 */
	String getStream();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorMessage#getStream <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream</em>' attribute.
	 * @see #getStream()
	 * @generated
	 */
	void setStream(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(SensorData)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorMessage_Data()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getData();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorMessage#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(SensorData value);

} // SensorMessage
