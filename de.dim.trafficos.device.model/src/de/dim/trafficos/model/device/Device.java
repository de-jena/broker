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
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Device#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Device#getActivationState <em>Activation State</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Device#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Device#getDeviceInformation <em>Device Information</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Device#getSystemInformation <em>System Information</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Device#getLifeCycleType <em>Life Cycle Type</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice()
 * @model
 * @generated
 */
@ProviderType
public interface Device extends Localizable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Device#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Activation State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.DeviceActivationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation State</em>' attribute.
	 * @see de.dim.trafficos.model.device.DeviceActivationType
	 * @see #setActivationState(DeviceActivationType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice_ActivationState()
	 * @model
	 * @generated
	 */
	DeviceActivationType getActivationState();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Device#getActivationState <em>Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation State</em>' attribute.
	 * @see de.dim.trafficos.model.device.DeviceActivationType
	 * @see #getActivationState()
	 * @generated
	 */
	void setActivationState(DeviceActivationType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(DeviceConfiguration)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice_Configuration()
	 * @model
	 * @generated
	 */
	DeviceConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Device#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(DeviceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Device Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Information</em>' containment reference.
	 * @see #setDeviceInformation(DeviceInfo)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice_DeviceInformation()
	 * @model containment="true"
	 * @generated
	 */
	DeviceInfo getDeviceInformation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Device#getDeviceInformation <em>Device Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Information</em>' containment reference.
	 * @see #getDeviceInformation()
	 * @generated
	 */
	void setDeviceInformation(DeviceInfo value);

	/**
	 * Returns the value of the '<em><b>System Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Information</em>' containment reference.
	 * @see #setSystemInformation(SystemInfo)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice_SystemInformation()
	 * @model containment="true"
	 * @generated
	 */
	SystemInfo getSystemInformation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Device#getSystemInformation <em>System Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Information</em>' containment reference.
	 * @see #getSystemInformation()
	 * @generated
	 */
	void setSystemInformation(SystemInfo value);

	/**
	 * Returns the value of the '<em><b>Life Cycle Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.LifeCycleDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.LifeCycleDeviceType
	 * @see #setLifeCycleType(LifeCycleDeviceType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDevice_LifeCycleType()
	 * @model
	 * @generated
	 */
	LifeCycleDeviceType getLifeCycleType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Device#getLifeCycleType <em>Life Cycle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.LifeCycleDeviceType
	 * @see #getLifeCycleType()
	 * @generated
	 */
	void setLifeCycleType(LifeCycleDeviceType value);

} // Device
