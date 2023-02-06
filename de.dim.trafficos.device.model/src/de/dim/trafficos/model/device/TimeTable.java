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
 * A representation of the model object '<em><b>Time Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.TimeTable#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TimeTable#getDefaultMode <em>Default Mode</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTimeTable()
 * @model
 * @generated
 */
@ProviderType
public interface TimeTable extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.TimeTableEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTimeTable_Entry()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeTableEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Default Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.TimeTableModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mode</em>' attribute.
	 * @see de.dim.trafficos.model.device.TimeTableModeType
	 * @see #setDefaultMode(TimeTableModeType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTimeTable_DefaultMode()
	 * @model
	 * @generated
	 */
	TimeTableModeType getDefaultMode();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TimeTable#getDefaultMode <em>Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Mode</em>' attribute.
	 * @see de.dim.trafficos.model.device.TimeTableModeType
	 * @see #getDefaultMode()
	 * @generated
	 */
	void setDefaultMode(TimeTableModeType value);

} // TimeTable
