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
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Position#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Position#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Position#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Position#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Position#getBearing <em>Bearing</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPosition()
 * @model
 * @generated
 */
@ProviderType
public interface Position extends Location {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPosition_Latitude()
	 * @model required="true"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Position#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPosition_Longitude()
	 * @model required="true"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Position#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPosition_Altitude()
	 * @model required="true"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Position#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see de.dim.trafficos.model.device.DirectionType
	 * @see #setOrientation(DirectionType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPosition_Orientation()
	 * @model
	 * @generated
	 */
	DirectionType getOrientation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Position#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see de.dim.trafficos.model.device.DirectionType
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Bearing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearing</em>' attribute.
	 * @see #setBearing(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPosition_Bearing()
	 * @model required="true"
	 * @generated
	 */
	int getBearing();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Position#getBearing <em>Bearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearing</em>' attribute.
	 * @see #getBearing()
	 * @generated
	 */
	void setBearing(int value);

} // Position
