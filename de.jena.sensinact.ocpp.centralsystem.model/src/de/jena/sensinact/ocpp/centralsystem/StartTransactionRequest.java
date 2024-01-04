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
package de.jena.sensinact.ocpp.centralsystem;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Transaction Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the StartTransaction.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getMeterStart <em>Meter Start</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getReservationId <em>Reservation Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionRequest()
 * @model extendedMetaData="name='StartTransactionRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StartTransactionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getConnectorId <em>Connector Id</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag</em>' attribute.
	 * @see #setIdTag(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionRequest_IdTag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='idTag' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getIdTag <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag</em>' attribute.
	 * @see #getIdTag()
	 * @generated
	 */
	void setIdTag(Object value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionRequest_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Meter Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Start</em>' attribute.
	 * @see #isSetMeterStart()
	 * @see #unsetMeterStart()
	 * @see #setMeterStart(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionRequest_MeterStart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='meterStart' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMeterStart();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getMeterStart <em>Meter Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Start</em>' attribute.
	 * @see #isSetMeterStart()
	 * @see #unsetMeterStart()
	 * @see #getMeterStart()
	 * @generated
	 */
	void setMeterStart(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getMeterStart <em>Meter Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeterStart()
	 * @see #getMeterStart()
	 * @see #setMeterStart(int)
	 * @generated
	 */
	void unsetMeterStart();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getMeterStart <em>Meter Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Meter Start</em>' attribute is set.
	 * @see #unsetMeterStart()
	 * @see #getMeterStart()
	 * @see #setMeterStart(int)
	 * @generated
	 */
	boolean isSetMeterStart();

	/**
	 * Returns the value of the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Id</em>' attribute.
	 * @see #isSetReservationId()
	 * @see #unsetReservationId()
	 * @see #setReservationId(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionRequest_ReservationId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='reservationId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getReservationId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getReservationId <em>Reservation Id</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReservationId()
	 * @see #getReservationId()
	 * @see #setReservationId(int)
	 * @generated
	 */
	void unsetReservationId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getReservationId <em>Reservation Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reservation Id</em>' attribute is set.
	 * @see #unsetReservationId()
	 * @see #getReservationId()
	 * @see #setReservationId(int)
	 * @generated
	 */
	boolean isSetReservationId();

} // StartTransactionRequest
