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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.traficam.TrafiCamPackage
 * @generated
 */
@ProviderType
public interface TrafiCamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrafiCamFactory eINSTANCE = de.jena.traficam.impl.TrafiCamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trafi Cam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trafi Cam</em>'.
	 * @generated
	 */
	TrafiCam createTrafiCam();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	TrafiCamObject createTrafiCamObject();

	/**
	 * Returns a new object of class '<em>Gps Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gps Coordinates</em>'.
	 * @generated
	 */
	GpsCoordinates createGpsCoordinates();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	Coordinates createCoordinates();

	/**
	 * Returns a new object of class '<em>Cam Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cam Config</em>'.
	 * @generated
	 */
	CamConfig createCamConfig();

	/**
	 * Returns a new object of class '<em>Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calibration</em>'.
	 * @generated
	 */
	Calibration createCalibration();

	/**
	 * Returns a new object of class '<em>Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Of View</em>'.
	 * @generated
	 */
	FieldOfView createFieldOfView();

	/**
	 * Returns a new object of class '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene</em>'.
	 * @generated
	 */
	Scene createScene();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TrafiCamPackage getTrafiCamPackage();

} //TrafiCamFactory
