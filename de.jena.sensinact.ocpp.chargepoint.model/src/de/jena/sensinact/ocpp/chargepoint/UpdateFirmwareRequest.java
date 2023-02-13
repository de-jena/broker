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
 * A representation of the model object '<em><b>Update Firmware Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the UpdateFirmware.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetrieveDate <em>Retrieve Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetries <em>Retries</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUpdateFirmwareRequest()
 * @model extendedMetaData="name='UpdateFirmwareRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateFirmwareRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Retrieve Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrieve Date</em>' attribute.
	 * @see #setRetrieveDate(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUpdateFirmwareRequest_RetrieveDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='retrieveDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRetrieveDate();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetrieveDate <em>Retrieve Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retrieve Date</em>' attribute.
	 * @see #getRetrieveDate()
	 * @generated
	 */
	void setRetrieveDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUpdateFirmwareRequest_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' attribute.
	 * @see #isSetRetries()
	 * @see #unsetRetries()
	 * @see #setRetries(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUpdateFirmwareRequest_Retries()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='retries' namespace='##targetNamespace'"
	 * @generated
	 */
	int getRetries();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetries <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries</em>' attribute.
	 * @see #isSetRetries()
	 * @see #unsetRetries()
	 * @see #getRetries()
	 * @generated
	 */
	void setRetries(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetries <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetries()
	 * @see #getRetries()
	 * @see #setRetries(int)
	 * @generated
	 */
	void unsetRetries();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetries <em>Retries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retries</em>' attribute is set.
	 * @see #unsetRetries()
	 * @see #getRetries()
	 * @see #setRetries(int)
	 * @generated
	 */
	boolean isSetRetries();

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #isSetRetryInterval()
	 * @see #unsetRetryInterval()
	 * @see #setRetryInterval(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUpdateFirmwareRequest_RetryInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='retryInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	int getRetryInterval();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #isSetRetryInterval()
	 * @see #unsetRetryInterval()
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryInterval()
	 * @see #getRetryInterval()
	 * @see #setRetryInterval(int)
	 * @generated
	 */
	void unsetRetryInterval();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetryInterval <em>Retry Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Interval</em>' attribute is set.
	 * @see #unsetRetryInterval()
	 * @see #getRetryInterval()
	 * @see #setRetryInterval(int)
	 * @generated
	 */
	boolean isSetRetryInterval();

} // UpdateFirmwareRequest
