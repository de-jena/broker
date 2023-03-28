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
 * A representation of the model object '<em><b>Device Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grouping devices, but also inheriting from device to make all meta information also available
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.DeviceGroup#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceGroup()
 * @model
 * @generated
 */
@ProviderType
public interface DeviceGroup extends Device {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceGroup_Device()
	 * @model keys="id"
	 * @generated
	 */
	EList<Device> getDevice();

} // DeviceGroup
