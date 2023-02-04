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
package de.dim.trafficos.model.device;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLine#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLine#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLine#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLine()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportLine extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.PublicTransportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.PublicTransportType
	 * @see #setType(PublicTransportType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLine_Type()
	 * @model
	 * @generated
	 */
	PublicTransportType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.PublicTransportType
	 * @see #getType()
	 * @generated
	 */
	void setType(PublicTransportType value);

	/**
	 * Returns the value of the '<em><b>Time Table</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportTimeTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Table</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLine_TimeTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportTimeTable> getTimeTable();

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLine_LineNumber()
	 * @model
	 * @generated
	 */
	String getLineNumber();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLine#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(String value);

} // PublicTransportLine
