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
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.DataValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DataValue#getElement <em>Element</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DataValue#getElementRef <em>Element Ref</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DataValue#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDataValue()
 * @model
 * @generated
 */
@ProviderType
public interface DataValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDataValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DataValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(IdNameElement)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDataValue_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdNameElement getElement();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DataValue#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(IdNameElement value);

	/**
	 * Returns the value of the '<em><b>Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Ref</em>' reference.
	 * @see #setElementRef(IdNameElement)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDataValue_ElementRef()
	 * @model
	 * @generated
	 */
	IdNameElement getElementRef();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DataValue#getElementRef <em>Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Ref</em>' reference.
	 * @see #getElementRef()
	 * @generated
	 */
	void setElementRef(IdNameElement value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDataValue_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DataValue#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // DataValue
