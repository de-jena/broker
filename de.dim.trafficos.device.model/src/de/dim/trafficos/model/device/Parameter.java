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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Parameter#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getParameter()
 * @model
 * @generated
 */
@ProviderType
public interface Parameter extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.ParameterDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.ParameterDataType
	 * @see #setDataType(ParameterDataType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getParameter_DataType()
	 * @model
	 * @generated
	 */
	ParameterDataType getDataType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Parameter#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.ParameterDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ParameterDataType value);

} // Parameter
