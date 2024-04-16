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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getClassId <em>Class Id</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getSpeedConfidence <em>Speed Confidence</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getGpsCoordinates <em>Gps Coordinates</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getImageCoordinates <em>Image Coordinates</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCamObject#getWorldCoordinates <em>World Coordinates</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject()
 * @model
 * @generated
 */
@ProviderType
public interface TrafiCamObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Id</em>' attribute.
	 * @see #isSetClassId()
	 * @see #unsetClassId()
	 * @see #setClassId(short)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_ClassId()
	 * @model unsettable="true"
	 * @generated
	 */
	short getClassId();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamObject#getClassId <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Id</em>' attribute.
	 * @see #isSetClassId()
	 * @see #unsetClassId()
	 * @see #getClassId()
	 * @generated
	 */
	void setClassId(short value);

	/**
	 * Unsets the value of the '{@link de.jena.traficam.TrafiCamObject#getClassId <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassId()
	 * @see #getClassId()
	 * @see #setClassId(short)
	 * @generated
	 */
	void unsetClassId();

	/**
	 * Returns whether the value of the '{@link de.jena.traficam.TrafiCamObject#getClassId <em>Class Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Id</em>' attribute is set.
	 * @see #unsetClassId()
	 * @see #getClassId()
	 * @see #setClassId(short)
	 * @generated
	 */
	boolean isSetClassId();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamObject#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifetime</em>' attribute.
	 * @see #setLifetime(double)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_Lifetime()
	 * @model
	 * @generated
	 */
	double getLifetime();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamObject#getLifetime <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime</em>' attribute.
	 * @see #getLifetime()
	 * @generated
	 */
	void setLifetime(double value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_Speed()
	 * @model
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamObject#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Speed Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Confidence</em>' attribute.
	 * @see #setSpeedConfidence(short)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_SpeedConfidence()
	 * @model
	 * @generated
	 */
	short getSpeedConfidence();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCamObject#getSpeedConfidence <em>Speed Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Confidence</em>' attribute.
	 * @see #getSpeedConfidence()
	 * @generated
	 */
	void setSpeedConfidence(short value);

	/**
	 * Returns the value of the '<em><b>Gps Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.traficam.GpsCoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps Coordinates</em>' containment reference list.
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_GpsCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<GpsCoordinates> getGpsCoordinates();

	/**
	 * Returns the value of the '<em><b>Image Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.traficam.Coordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Coordinates</em>' containment reference list.
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_ImageCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coordinates> getImageCoordinates();

	/**
	 * Returns the value of the '<em><b>World Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.traficam.Coordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World Coordinates</em>' containment reference list.
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCamObject_WorldCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coordinates> getWorldCoordinates();

} // TrafiCamObject
