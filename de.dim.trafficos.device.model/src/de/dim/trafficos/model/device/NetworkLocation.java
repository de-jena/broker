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
 * A representation of the model object '<em><b>Network Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.NetworkLocation#getIp4Address <em>Ip4 Address</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.NetworkLocation#getIp6Address <em>Ip6 Address</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.NetworkLocation#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getNetworkLocation()
 * @model
 * @generated
 */
@ProviderType
public interface NetworkLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Ip4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip4 Address</em>' attribute.
	 * @see #setIp4Address(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getNetworkLocation_Ip4Address()
	 * @model
	 * @generated
	 */
	String getIp4Address();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.NetworkLocation#getIp4Address <em>Ip4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip4 Address</em>' attribute.
	 * @see #getIp4Address()
	 * @generated
	 */
	void setIp4Address(String value);

	/**
	 * Returns the value of the '<em><b>Ip6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip6 Address</em>' attribute.
	 * @see #setIp6Address(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getNetworkLocation_Ip6Address()
	 * @model
	 * @generated
	 */
	String getIp6Address();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.NetworkLocation#getIp6Address <em>Ip6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip6 Address</em>' attribute.
	 * @see #getIp6Address()
	 * @generated
	 */
	void setIp6Address(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getNetworkLocation_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.NetworkLocation#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

} // NetworkLocation
