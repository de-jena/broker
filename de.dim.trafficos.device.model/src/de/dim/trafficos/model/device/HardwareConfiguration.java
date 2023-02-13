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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.HardwareConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.HardwareConfiguration#getPinConfiguration <em>Pin Configuration</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.HardwareConfiguration#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.HardwareConfiguration#getDeviceConfigurationId <em>Device Configuration Id</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getHardwareConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface HardwareConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getHardwareConfiguration_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.HardwareConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Pin Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.OutputConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Configuration</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getHardwareConfiguration_PinConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputConfiguration> getPinConfiguration();

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getHardwareConfiguration_DeviceId()
	 * @model required="true"
	 * @generated
	 */
	String getDeviceId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.HardwareConfiguration#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(String value);

	/**
	 * Returns the value of the '<em><b>Device Configuration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Configuration Id</em>' attribute.
	 * @see #setDeviceConfigurationId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getHardwareConfiguration_DeviceConfigurationId()
	 * @model required="true"
	 * @generated
	 */
	String getDeviceConfigurationId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.HardwareConfiguration#getDeviceConfigurationId <em>Device Configuration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Configuration Id</em>' attribute.
	 * @see #getDeviceConfigurationId()
	 * @generated
	 */
	void setDeviceConfigurationId(String value);

} // HardwareConfiguration
