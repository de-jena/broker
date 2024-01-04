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
 * A representation of the model object '<em><b>Get Diagnostics Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the GetDiagnostics.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetries <em>Retries</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsRequest()
 * @model extendedMetaData="name='GetDiagnosticsRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetDiagnosticsRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsRequest_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsRequest_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='startTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' attribute.
	 * @see #setStopTime(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsRequest_StopTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='stopTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStopTime();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStopTime <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time</em>' attribute.
	 * @see #getStopTime()
	 * @generated
	 */
	void setStopTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' attribute.
	 * @see #isSetRetries()
	 * @see #unsetRetries()
	 * @see #setRetries(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsRequest_Retries()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='retries' namespace='##targetNamespace'"
	 * @generated
	 */
	int getRetries();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetries <em>Retries</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetries <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetries()
	 * @see #getRetries()
	 * @see #setRetries(int)
	 * @generated
	 */
	void unsetRetries();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetries <em>Retries</em>}' attribute is set.
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
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsRequest_RetryInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='retryInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	int getRetryInterval();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetryInterval <em>Retry Interval</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryInterval()
	 * @see #getRetryInterval()
	 * @see #setRetryInterval(int)
	 * @generated
	 */
	void unsetRetryInterval();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetryInterval <em>Retry Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Interval</em>' attribute is set.
	 * @see #unsetRetryInterval()
	 * @see #getRetryInterval()
	 * @see #setRetryInterval(int)
	 * @generated
	 */
	boolean isSetRetryInterval();

} // GetDiagnosticsRequest
