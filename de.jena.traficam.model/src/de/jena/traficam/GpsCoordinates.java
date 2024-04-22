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
package de.jena.traficam;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gps Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.GpsCoordinates#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.jena.traficam.GpsCoordinates#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.jena.traficam.GpsCoordinates#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getGpsCoordinates()
 * @model
 * @generated
 */
@ProviderType
public interface GpsCoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see de.jena.traficam.TrafiCamPackage#getGpsCoordinates_Latitude()
	 * @model required="true"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link de.jena.traficam.GpsCoordinates#getLatitude <em>Latitude</em>}' attribute.
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
	 * @see de.jena.traficam.TrafiCamPackage#getGpsCoordinates_Longitude()
	 * @model required="true"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link de.jena.traficam.GpsCoordinates#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(double)
	 * @see de.jena.traficam.TrafiCamPackage#getGpsCoordinates_Heading()
	 * @model
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link de.jena.traficam.GpsCoordinates#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

} // GpsCoordinates
