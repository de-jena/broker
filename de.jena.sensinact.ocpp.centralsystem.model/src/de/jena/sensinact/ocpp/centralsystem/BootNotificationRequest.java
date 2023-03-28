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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boot Notification Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the BootNotification.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointVendor <em>Charge Point Vendor</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointModel <em>Charge Point Model</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointSerialNumber <em>Charge Point Serial Number</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargeBoxSerialNumber <em>Charge Box Serial Number</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getFirmwareVersion <em>Firmware Version</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getIccid <em>Iccid</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getImsi <em>Imsi</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterType <em>Meter Type</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterSerialNumber <em>Meter Serial Number</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest()
 * @model extendedMetaData="name='BootNotificationRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BootNotificationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Charge Point Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Point Vendor</em>' attribute.
	 * @see #setChargePointVendor(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_ChargePointVendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='chargePointVendor' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getChargePointVendor();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointVendor <em>Charge Point Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Point Vendor</em>' attribute.
	 * @see #getChargePointVendor()
	 * @generated
	 */
	void setChargePointVendor(Object value);

	/**
	 * Returns the value of the '<em><b>Charge Point Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Point Model</em>' attribute.
	 * @see #setChargePointModel(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_ChargePointModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='chargePointModel' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getChargePointModel();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointModel <em>Charge Point Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Point Model</em>' attribute.
	 * @see #getChargePointModel()
	 * @generated
	 */
	void setChargePointModel(Object value);

	/**
	 * Returns the value of the '<em><b>Charge Point Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Point Serial Number</em>' attribute.
	 * @see #setChargePointSerialNumber(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_ChargePointSerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='chargePointSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getChargePointSerialNumber();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointSerialNumber <em>Charge Point Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Point Serial Number</em>' attribute.
	 * @see #getChargePointSerialNumber()
	 * @generated
	 */
	void setChargePointSerialNumber(Object value);

	/**
	 * Returns the value of the '<em><b>Charge Box Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Box Serial Number</em>' attribute.
	 * @see #setChargeBoxSerialNumber(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_ChargeBoxSerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='chargeBoxSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getChargeBoxSerialNumber();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargeBoxSerialNumber <em>Charge Box Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Box Serial Number</em>' attribute.
	 * @see #getChargeBoxSerialNumber()
	 * @generated
	 */
	void setChargeBoxSerialNumber(Object value);

	/**
	 * Returns the value of the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware Version</em>' attribute.
	 * @see #setFirmwareVersion(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_FirmwareVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='firmwareVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFirmwareVersion();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getFirmwareVersion <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware Version</em>' attribute.
	 * @see #getFirmwareVersion()
	 * @generated
	 */
	void setFirmwareVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Iccid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iccid</em>' attribute.
	 * @see #setIccid(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_Iccid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='iccid' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIccid();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getIccid <em>Iccid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iccid</em>' attribute.
	 * @see #getIccid()
	 * @generated
	 */
	void setIccid(Object value);

	/**
	 * Returns the value of the '<em><b>Imsi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imsi</em>' attribute.
	 * @see #setImsi(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_Imsi()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='imsi' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getImsi();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getImsi <em>Imsi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imsi</em>' attribute.
	 * @see #getImsi()
	 * @generated
	 */
	void setImsi(Object value);

	/**
	 * Returns the value of the '<em><b>Meter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Type</em>' attribute.
	 * @see #setMeterType(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_MeterType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='meterType' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMeterType();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterType <em>Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Type</em>' attribute.
	 * @see #getMeterType()
	 * @generated
	 */
	void setMeterType(Object value);

	/**
	 * Returns the value of the '<em><b>Meter Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Serial Number</em>' attribute.
	 * @see #setMeterSerialNumber(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getBootNotificationRequest_MeterSerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='meterSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMeterSerialNumber();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterSerialNumber <em>Meter Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Serial Number</em>' attribute.
	 * @see #getMeterSerialNumber()
	 * @generated
	 */
	void setMeterSerialNumber(Object value);

} // BootNotificationRequest
