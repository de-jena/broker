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
 * A representation of the model object '<em><b>Address Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.AddressLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AddressLocation#getStreet <em>Street</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AddressLocation#getZip <em>Zip</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.AddressLocation#getDistrict <em>District</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAddressLocation()
 * @model
 * @generated
 */
@ProviderType
public interface AddressLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAddressLocation_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AddressLocation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAddressLocation_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AddressLocation#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAddressLocation_Zip()
	 * @model
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AddressLocation#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Returns the value of the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>District</em>' attribute.
	 * @see #setDistrict(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getAddressLocation_District()
	 * @model
	 * @generated
	 */
	String getDistrict();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.AddressLocation#getDistrict <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' attribute.
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(String value);

} // AddressLocation
