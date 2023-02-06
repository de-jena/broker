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
 * A representation of the model object '<em><b>Public Transport Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportDataValue#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportDataValue#getLineRef <em>Line Ref</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportDataValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataValue()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportDataValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.PublicTransportDataValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValueType
	 * @see #setType(PublicTransportDataValueType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataValue_Type()
	 * @model
	 * @generated
	 */
	PublicTransportDataValueType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportDataValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.PublicTransportDataValueType
	 * @see #getType()
	 * @generated
	 */
	void setType(PublicTransportDataValueType value);

	/**
	 * Returns the value of the '<em><b>Line Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Ref</em>' reference.
	 * @see #setLineRef(IdNameElement)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataValue_LineRef()
	 * @model
	 * @generated
	 */
	IdNameElement getLineRef();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportDataValue#getLineRef <em>Line Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Ref</em>' reference.
	 * @see #getLineRef()
	 * @generated
	 */
	void setLineRef(IdNameElement value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(PublicTransportDataValueObject)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	PublicTransportDataValueObject getValue();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportDataValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PublicTransportDataValueObject value);

} // PublicTransportDataValue
