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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve Now Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the ReserveNow.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getParentIdTag <em>Parent Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getReservationId <em>Reservation Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowRequest()
 * @model extendedMetaData="name='ReserveNowRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReserveNowRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector Id</em>' attribute is set.
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	boolean isSetConnectorId();

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowRequest_ExpiryDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='expiryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpiryDate();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag</em>' attribute.
	 * @see #setIdTag(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowRequest_IdTag()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.IdToken" required="true"
	 *        extendedMetaData="kind='element' name='idTag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getIdTag <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag</em>' attribute.
	 * @see #getIdTag()
	 * @generated
	 */
	void setIdTag(String value);

	/**
	 * Returns the value of the '<em><b>Parent Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Id Tag</em>' attribute.
	 * @see #setParentIdTag(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowRequest_ParentIdTag()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.IdToken"
	 *        extendedMetaData="kind='element' name='parentIdTag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParentIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getParentIdTag <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Id Tag</em>' attribute.
	 * @see #getParentIdTag()
	 * @generated
	 */
	void setParentIdTag(String value);

	/**
	 * Returns the value of the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Id</em>' attribute.
	 * @see #isSetReservationId()
	 * @see #unsetReservationId()
	 * @see #setReservationId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowRequest_ReservationId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='reservationId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getReservationId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getReservationId <em>Reservation Id</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReservationId()
	 * @see #getReservationId()
	 * @see #setReservationId(int)
	 * @generated
	 */
	void unsetReservationId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getReservationId <em>Reservation Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reservation Id</em>' attribute is set.
	 * @see #unsetReservationId()
	 * @see #getReservationId()
	 * @see #setReservationId(int)
	 * @generated
	 */
	boolean isSetReservationId();

} // ReserveNowRequest
