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
 * A representation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.Coordinates#getX <em>X</em>}</li>
 *   <li>{@link de.jena.traficam.Coordinates#getXConfidence <em>XConfidence</em>}</li>
 *   <li>{@link de.jena.traficam.Coordinates#getY <em>Y</em>}</li>
 *   <li>{@link de.jena.traficam.Coordinates#getYConfidence <em>YConfidence</em>}</li>
 *   <li>{@link de.jena.traficam.Coordinates#getZ <em>Z</em>}</li>
 *   <li>{@link de.jena.traficam.Coordinates#getHeading3d <em>Heading3d</em>}</li>
 *   <li>{@link de.jena.traficam.Coordinates#getHeading3dConfidence <em>Heading3d Confidence</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getCoordinates()
 * @model
 * @generated
 */
@ProviderType
public interface Coordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>XConfidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XConfidence</em>' attribute.
	 * @see #setXConfidence(short)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_XConfidence()
	 * @model
	 * @generated
	 */
	short getXConfidence();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getXConfidence <em>XConfidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XConfidence</em>' attribute.
	 * @see #getXConfidence()
	 * @generated
	 */
	void setXConfidence(short value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>YConfidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YConfidence</em>' attribute.
	 * @see #setYConfidence(short)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_YConfidence()
	 * @model
	 * @generated
	 */
	short getYConfidence();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getYConfidence <em>YConfidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YConfidence</em>' attribute.
	 * @see #getYConfidence()
	 * @generated
	 */
	void setYConfidence(short value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_Z()
	 * @model
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

	/**
	 * Returns the value of the '<em><b>Heading3d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading3d</em>' attribute.
	 * @see #setHeading3d(double)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_Heading3d()
	 * @model required="true"
	 * @generated
	 */
	double getHeading3d();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getHeading3d <em>Heading3d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading3d</em>' attribute.
	 * @see #getHeading3d()
	 * @generated
	 */
	void setHeading3d(double value);

	/**
	 * Returns the value of the '<em><b>Heading3d Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading3d Confidence</em>' attribute.
	 * @see #setHeading3dConfidence(short)
	 * @see de.jena.traficam.TrafiCamPackage#getCoordinates_Heading3dConfidence()
	 * @model
	 * @generated
	 */
	short getHeading3dConfidence();

	/**
	 * Sets the value of the '{@link de.jena.traficam.Coordinates#getHeading3dConfidence <em>Heading3d Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading3d Confidence</em>' attribute.
	 * @see #getHeading3dConfidence()
	 * @generated
	 */
	void setHeading3dConfidence(short value);

} // Coordinates
