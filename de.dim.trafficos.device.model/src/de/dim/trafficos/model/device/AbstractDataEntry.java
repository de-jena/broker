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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.AbstractDataEntry#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AbstractDataEntry#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AbstractDataEntry#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractDataEntry()
 * @model
 * @generated
 */
@ProviderType
public interface AbstractDataEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractDataEntry_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractDataEntry#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractDataEntry_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractDataEntry#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(long)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAbstractDataEntry_Index()
	 * @model required="true"
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AbstractDataEntry#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

} // AbstractDataEntry
