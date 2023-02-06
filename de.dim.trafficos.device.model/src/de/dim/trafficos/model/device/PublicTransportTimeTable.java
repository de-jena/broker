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
 * A representation of the model object '<em><b>Public Transport Time Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportTimeTable#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportTimeTable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTable()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportTimeTable extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTable_Entry()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportTimeTableEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.ScheduleModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.ScheduleModeType
	 * @see #setType(ScheduleModeType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTable_Type()
	 * @model
	 * @generated
	 */
	ScheduleModeType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportTimeTable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.ScheduleModeType
	 * @see #getType()
	 * @generated
	 */
	void setType(ScheduleModeType value);

} // PublicTransportTimeTable
