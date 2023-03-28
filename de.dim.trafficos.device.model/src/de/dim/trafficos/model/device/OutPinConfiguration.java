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
 * A representation of the model object '<em><b>Out Pin Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.OutPinConfiguration#getPin <em>Pin</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.OutPinConfiguration#getGpio <em>Gpio</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.OutPinConfiguration#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.OutPinConfiguration#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutPinConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface OutPinConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutPinConfiguration_Pin()
	 * @model required="true"
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.OutPinConfiguration#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

	/**
	 * Returns the value of the '<em><b>Gpio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpio</em>' attribute.
	 * @see #setGpio(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutPinConfiguration_Gpio()
	 * @model required="true"
	 * @generated
	 */
	int getGpio();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.OutPinConfiguration#getGpio <em>Gpio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpio</em>' attribute.
	 * @see #getGpio()
	 * @generated
	 */
	void setGpio(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.OutputElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.OutputElementType
	 * @see #setType(OutputElementType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutPinConfiguration_Type()
	 * @model
	 * @generated
	 */
	OutputElementType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.OutPinConfiguration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.OutputElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(OutputElementType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutPinConfiguration_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.OutPinConfiguration#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // OutPinConfiguration
