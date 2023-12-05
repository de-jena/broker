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
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel Reservation Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the CancelReservation.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getCancelReservationResponse()
 * @model extendedMetaData="name='CancelReservationResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CancelReservationResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(CancelReservationStatus)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getCancelReservationResponse_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelReservationStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CancelReservationStatus value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(CancelReservationStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(CancelReservationStatus)
	 * @generated
	 */
	boolean isSetStatus();

} // CancelReservationResponse
