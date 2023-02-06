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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getIndex <em>Index</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getMode <em>Mode</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getBegin <em>Begin</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractTimeTableEntry()
 * @model
 * @generated
 */
@ProviderType
public interface AbstractTimeTableEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractTimeTableEntry_Index()
	 * @model required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.ScheduleModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.dim.trafficos.model.device.ScheduleModeType
	 * @see #setMode(ScheduleModeType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractTimeTableEntry_Mode()
	 * @model
	 * @generated
	 */
	ScheduleModeType getMode();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.dim.trafficos.model.device.ScheduleModeType
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ScheduleModeType value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minute of the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(long)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractTimeTableEntry_Begin()
	 * @model required="true"
	 * @generated
	 */
	long getBegin();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minute of the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractTimeTableEntry_End()
	 * @model required="true"
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractTimeTableEntry#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

} // AbstractTimeTableEntry
