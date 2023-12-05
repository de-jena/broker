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
 * A representation of the model object '<em><b>Boot Notification Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the BootNotification.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationResponse()
 * @model extendedMetaData="name='BootNotificationResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BootNotificationResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationResponse_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Object value);

	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationResponse_CurrentTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='currentTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCurrentTime();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getCurrentTime <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */
	void setCurrentTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #isSetInterval()
	 * @see #unsetInterval()
	 * @see #setInterval(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationResponse_Interval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='interval' namespace='##targetNamespace'"
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #isSetInterval()
	 * @see #unsetInterval()
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterval()
	 * @see #getInterval()
	 * @see #setInterval(int)
	 * @generated
	 */
	void unsetInterval();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getInterval <em>Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval</em>' attribute is set.
	 * @see #unsetInterval()
	 * @see #getInterval()
	 * @see #setInterval(int)
	 * @generated
	 */
	boolean isSetInterval();

} // BootNotificationResponse
