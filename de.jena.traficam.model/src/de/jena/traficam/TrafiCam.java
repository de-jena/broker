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
 * A representation of the model object '<em><b>Trafi Cam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.TrafiCam#getDataNumber <em>Data Number</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCam#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCam#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCam#getObject <em>Object</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCam#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.traficam.TrafiCam#getIntervalTime <em>Interval Time</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam()
 * @model
 * @generated
 */
@ProviderType
public interface TrafiCam extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Number</em>' attribute.
	 * @see #setDataNumber(long)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam_DataNumber()
	 * @model
	 * @generated
	 */
	long getDataNumber();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCam#getDataNumber <em>Data Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Number</em>' attribute.
	 * @see #getDataNumber()
	 * @generated
	 */
	void setDataNumber(long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCam#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.traficam.MessagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see de.jena.traficam.MessagType
	 * @see #setMessageType(MessagType)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam_MessageType()
	 * @model
	 * @generated
	 */
	MessagType getMessageType();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCam#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see de.jena.traficam.MessagType
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessagType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.traficam.TrafiCamObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrafiCamObject> getObject();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCam#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Interval Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Time</em>' attribute.
	 * @see #setIntervalTime(double)
	 * @see de.jena.traficam.TrafiCamPackage#getTrafiCam_IntervalTime()
	 * @model
	 * @generated
	 */
	double getIntervalTime();

	/**
	 * Sets the value of the '{@link de.jena.traficam.TrafiCam#getIntervalTime <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Time</em>' attribute.
	 * @see #getIntervalTime()
	 * @generated
	 */
	void setIntervalTime(double value);

} // TrafiCam
