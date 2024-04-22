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
 * A representation of the model object '<em><b>Calibration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.Calibration#getFocalDistance <em>Focal Distance</em>}</li>
 *   <li>{@link de.jena.traficam.Calibration#getHeight <em>Height</em>}</li>
 *   <li>{@link de.jena.traficam.Calibration#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link de.jena.traficam.Calibration#getRollAngle <em>Roll Angle</em>}</li>
 *   <li>{@link de.jena.traficam.Calibration#getTiltAngle <em>Tilt Angle</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getCalibration()
 * @model
 * @generated
 */
@ProviderType
public interface Calibration extends EObject {
	/**
	 * Returns the value of the '<em><b>Focal Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal Distance</em>' attribute.
	 * @see #setFocalDistance(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCalibration_FocalDistance()
	 * @model
	 * @generated
	 */
	double getFocalDistance();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Calibration#getFocalDistance <em>Focal Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Distance</em>' attribute.
	 * @see #getFocalDistance()
	 * @generated
	 */
	void setFocalDistance(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCalibration_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Calibration#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan Angle</em>' attribute.
	 * @see #setPanAngle(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCalibration_PanAngle()
	 * @model
	 * @generated
	 */
	double getPanAngle();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Calibration#getPanAngle <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan Angle</em>' attribute.
	 * @see #getPanAngle()
	 * @generated
	 */
	void setPanAngle(double value);

	/**
	 * Returns the value of the '<em><b>Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Angle</em>' attribute.
	 * @see #setRollAngle(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCalibration_RollAngle()
	 * @model
	 * @generated
	 */
	double getRollAngle();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Calibration#getRollAngle <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Angle</em>' attribute.
	 * @see #getRollAngle()
	 * @generated
	 */
	void setRollAngle(double value);

	/**
	 * Returns the value of the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt Angle</em>' attribute.
	 * @see #setTiltAngle(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCalibration_TiltAngle()
	 * @model
	 * @generated
	 */
	double getTiltAngle();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Calibration#getTiltAngle <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Angle</em>' attribute.
	 * @see #getTiltAngle()
	 * @generated
	 */
	void setTiltAngle(double value);

} // Calibration
