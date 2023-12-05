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
 * A representation of the model object '<em><b>Get Composite Schedule Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the GetCompositeSchedule.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getChargingSchedule <em>Charging Schedule</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleResponse()
 * @model extendedMetaData="name='GetCompositeScheduleResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetCompositeScheduleResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(GetCompositeScheduleStatus)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleResponse_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCompositeScheduleStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GetCompositeScheduleStatus value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(GetCompositeScheduleStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(GetCompositeScheduleStatus)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleResponse_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getConnectorId <em>Connector Id</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getConnectorId <em>Connector Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Schedule Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Start</em>' attribute.
	 * @see #setScheduleStart(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleResponse_ScheduleStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='scheduleStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getScheduleStart();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getScheduleStart <em>Schedule Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Start</em>' attribute.
	 * @see #getScheduleStart()
	 * @generated
	 */
	void setScheduleStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Charging Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Schedule</em>' containment reference.
	 * @see #setChargingSchedule(ChargingSchedule)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleResponse_ChargingSchedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chargingSchedule' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingSchedule getChargingSchedule();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getChargingSchedule <em>Charging Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Schedule</em>' containment reference.
	 * @see #getChargingSchedule()
	 * @generated
	 */
	void setChargingSchedule(ChargingSchedule value);

} // GetCompositeScheduleResponse
