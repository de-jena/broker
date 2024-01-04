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
 * A representation of the model object '<em><b>Cancel Reservation Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the CancelReservation.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest#getReservationId <em>Reservation Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getCancelReservationRequest()
 * @model extendedMetaData="name='CancelReservationRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CancelReservationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Id</em>' attribute.
	 * @see #isSetReservationId()
	 * @see #unsetReservationId()
	 * @see #setReservationId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getCancelReservationRequest_ReservationId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='reservationId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getReservationId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Id</em>' attribute.
	 * @see #isSetReservationId()
	 * @see #unsetReservationId()
	 * @see #getReservationId()
	 * @generated
	 */
	void setReservationId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReservationId()
	 * @see #getReservationId()
	 * @see #setReservationId(int)
	 * @generated
	 */
	void unsetReservationId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest#getReservationId <em>Reservation Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reservation Id</em>' attribute is set.
	 * @see #unsetReservationId()
	 * @see #getReservationId()
	 * @see #setReservationId(int)
	 * @generated
	 */
	boolean isSetReservationId();

} // CancelReservationRequest
