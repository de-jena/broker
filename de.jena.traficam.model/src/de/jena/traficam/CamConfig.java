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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cam Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.CamConfig#getCalibration <em>Calibration</em>}</li>
 *   <li>{@link de.jena.traficam.CamConfig#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.traficam.CamConfig#getFieldOfView <em>Field Of View</em>}</li>
 *   <li>{@link de.jena.traficam.CamConfig#getScene <em>Scene</em>}</li>
 *   <li>{@link de.jena.traficam.CamConfig#getClassMap <em>Class Map</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getCamConfig()
 * @model
 * @generated
 */
@ProviderType
public interface CamConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(Calibration)
	 * @see de.jena.traficam.TrafiCamPackage#getCamConfig_Calibration()
	 * @model containment="true"
	 * @generated
	 */
	Calibration getCalibration();

	/**
	 * Sets the value of the '{@link de.jena.traficam.CamConfig#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(Calibration value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(GpsCoordinates)
	 * @see de.jena.traficam.TrafiCamPackage#getCamConfig_Location()
	 * @model containment="true"
	 * @generated
	 */
	GpsCoordinates getLocation();

	/**
	 * Sets the value of the '{@link de.jena.traficam.CamConfig#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GpsCoordinates value);

	/**
	 * Returns the value of the '<em><b>Field Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Of View</em>' containment reference.
	 * @see #setFieldOfView(FieldOfView)
	 * @see de.jena.traficam.TrafiCamPackage#getCamConfig_FieldOfView()
	 * @model containment="true"
	 * @generated
	 */
	FieldOfView getFieldOfView();

	/**
	 * Sets the value of the '{@link de.jena.traficam.CamConfig#getFieldOfView <em>Field Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View</em>' containment reference.
	 * @see #getFieldOfView()
	 * @generated
	 */
	void setFieldOfView(FieldOfView value);

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference.
	 * @see #setScene(Scene)
	 * @see de.jena.traficam.TrafiCamPackage#getCamConfig_Scene()
	 * @model containment="true"
	 * @generated
	 */
	Scene getScene();

	/**
	 * Sets the value of the '{@link de.jena.traficam.CamConfig#getScene <em>Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' containment reference.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(Scene value);

	/**
	 * Returns the value of the '<em><b>Class Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Map</em>' map.
	 * @see de.jena.traficam.TrafiCamPackage#getCamConfig_ClassMap()
	 * @model mapType="de.jena.traficam.ClassMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getClassMap();

} // CamConfig
