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
package de.jena.model.sensinact.ibis;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#getLineName <em>Line Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#getTripNumber <em>Trip Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#isAtStop <em>At Stop</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TripInfo#getStopName <em>Stop Name</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo()
 * @model
 * @generated
 */
@ProviderType
public interface TripInfo extends Service {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see #setDeviceType(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_DeviceType()
	 * @model required="true"
	 * @generated
	 */
	String getDeviceType();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(String value);

	/**
	 * Returns the value of the '<em><b>Line Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Name</em>' attribute.
	 * @see #setLineName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_LineName()
	 * @model
	 * @generated
	 */
	String getLineName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#getLineName <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Name</em>' attribute.
	 * @see #getLineName()
	 * @generated
	 */
	void setLineName(String value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_LineNumber()
	 * @model
	 * @generated
	 */
	int getLineNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(int value);

	/**
	 * Returns the value of the '<em><b>Trip Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Number</em>' attribute.
	 * @see #setTripNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_TripNumber()
	 * @model
	 * @generated
	 */
	int getTripNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#getTripNumber <em>Trip Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Number</em>' attribute.
	 * @see #getTripNumber()
	 * @generated
	 */
	void setTripNumber(int value);

	/**
	 * Returns the value of the '<em><b>Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Number</em>' attribute.
	 * @see #setDeviceNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_DeviceNumber()
	 * @model
	 * @generated
	 */
	int getDeviceNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#getDeviceNumber <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Number</em>' attribute.
	 * @see #getDeviceNumber()
	 * @generated
	 */
	void setDeviceNumber(int value);

	/**
	 * Returns the value of the '<em><b>At Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Stop</em>' attribute.
	 * @see #setAtStop(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_AtStop()
	 * @model
	 * @generated
	 */
	boolean isAtStop();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#isAtStop <em>At Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Stop</em>' attribute.
	 * @see #isAtStop()
	 * @generated
	 */
	void setAtStop(boolean value);

	/**
	 * Returns the value of the '<em><b>Stop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Name</em>' attribute.
	 * @see #setStopName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTripInfo_StopName()
	 * @model
	 * @generated
	 */
	String getStopName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TripInfo#getStopName <em>Stop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Name</em>' attribute.
	 * @see #getStopName()
	 * @generated
	 */
	void setStopName(String value);

} // TripInfo
