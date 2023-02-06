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
 * A representation of the model object '<em><b>Device Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the digitial twin
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.DeviceInfo#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DeviceInfo#getHumanReadableName <em>Human Readable Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DeviceInfo#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DeviceInfo#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceInfo()
 * @model
 * @generated
 */
@ProviderType
public interface DeviceInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Technical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Name</em>' attribute.
	 * @see #setTechnicalName(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceInfo_TechnicalName()
	 * @model
	 * @generated
	 */
	String getTechnicalName();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DeviceInfo#getTechnicalName <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Name</em>' attribute.
	 * @see #getTechnicalName()
	 * @generated
	 */
	void setTechnicalName(String value);

	/**
	 * Returns the value of the '<em><b>Human Readable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Readable Name</em>' attribute.
	 * @see #setHumanReadableName(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceInfo_HumanReadableName()
	 * @model
	 * @generated
	 */
	String getHumanReadableName();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DeviceInfo#getHumanReadableName <em>Human Readable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Readable Name</em>' attribute.
	 * @see #getHumanReadableName()
	 * @generated
	 */
	void setHumanReadableName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceInfo_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DeviceInfo#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceInfo_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DeviceInfo#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DeviceInfo
