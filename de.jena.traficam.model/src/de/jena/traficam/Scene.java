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
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.Scene#getLeftBottom <em>Left Bottom</em>}</li>
 *   <li>{@link de.jena.traficam.Scene#getLeftTop <em>Left Top</em>}</li>
 *   <li>{@link de.jena.traficam.Scene#getRightBottom <em>Right Bottom</em>}</li>
 *   <li>{@link de.jena.traficam.Scene#getRightTop <em>Right Top</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getScene()
 * @model
 * @generated
 */
@ProviderType
public interface Scene extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Bottom</em>' containment reference.
	 * @see #setLeftBottom(GpsCoordinates)
	 * @see de.jena.traficam.TrafiCamPackage#getScene_LeftBottom()
	 * @model containment="true"
	 * @generated
	 */
	GpsCoordinates getLeftBottom();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Scene#getLeftBottom <em>Left Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Bottom</em>' containment reference.
	 * @see #getLeftBottom()
	 * @generated
	 */
	void setLeftBottom(GpsCoordinates value);

	/**
	 * Returns the value of the '<em><b>Left Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Top</em>' containment reference.
	 * @see #setLeftTop(GpsCoordinates)
	 * @see de.jena.traficam.TrafiCamPackage#getScene_LeftTop()
	 * @model containment="true"
	 * @generated
	 */
	GpsCoordinates getLeftTop();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Scene#getLeftTop <em>Left Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Top</em>' containment reference.
	 * @see #getLeftTop()
	 * @generated
	 */
	void setLeftTop(GpsCoordinates value);

	/**
	 * Returns the value of the '<em><b>Right Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Bottom</em>' containment reference.
	 * @see #setRightBottom(GpsCoordinates)
	 * @see de.jena.traficam.TrafiCamPackage#getScene_RightBottom()
	 * @model containment="true"
	 * @generated
	 */
	GpsCoordinates getRightBottom();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Scene#getRightBottom <em>Right Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Bottom</em>' containment reference.
	 * @see #getRightBottom()
	 * @generated
	 */
	void setRightBottom(GpsCoordinates value);

	/**
	 * Returns the value of the '<em><b>Right Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Top</em>' containment reference.
	 * @see #setRightTop(GpsCoordinates)
	 * @see de.jena.traficam.TrafiCamPackage#getScene_RightTop()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	GpsCoordinates getRightTop();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Scene#getRightTop <em>Right Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Top</em>' containment reference.
	 * @see #getRightTop()
	 * @generated
	 */
	void setRightTop(GpsCoordinates value);

} // Scene
