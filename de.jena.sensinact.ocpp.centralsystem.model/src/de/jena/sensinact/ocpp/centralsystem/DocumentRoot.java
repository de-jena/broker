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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeRequest <em>Authorize Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeResponse <em>Authorize Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationRequest <em>Boot Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationResponse <em>Boot Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getChargeBoxIdentity <em>Charge Box Identity</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferRequest <em>Data Transfer Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferResponse <em>Data Transfer Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationRequest <em>Diagnostics Status Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationResponse <em>Diagnostics Status Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationRequest <em>Firmware Status Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationResponse <em>Firmware Status Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatRequest <em>Heartbeat Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatResponse <em>Heartbeat Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesRequest <em>Meter Values Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesResponse <em>Meter Values Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionRequest <em>Start Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionResponse <em>Start Transaction Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationRequest <em>Status Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationResponse <em>Status Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionRequest <em>Stop Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionResponse <em>Stop Transaction Response</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Authorize Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorize Request</em>' attribute.
	 * @see #setAuthorizeRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_AuthorizeRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorizeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAuthorizeRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeRequest <em>Authorize Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorize Request</em>' attribute.
	 * @see #getAuthorizeRequest()
	 * @generated
	 */
	void setAuthorizeRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Authorize Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorize Response</em>' attribute.
	 * @see #setAuthorizeResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_AuthorizeResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorizeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAuthorizeResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeResponse <em>Authorize Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorize Response</em>' attribute.
	 * @see #getAuthorizeResponse()
	 * @generated
	 */
	void setAuthorizeResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Boot Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot Notification Request</em>' attribute.
	 * @see #setBootNotificationRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_BootNotificationRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bootNotificationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBootNotificationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationRequest <em>Boot Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot Notification Request</em>' attribute.
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	void setBootNotificationRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Boot Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot Notification Response</em>' attribute.
	 * @see #setBootNotificationResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_BootNotificationResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bootNotificationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBootNotificationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationResponse <em>Boot Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot Notification Response</em>' attribute.
	 * @see #getBootNotificationResponse()
	 * @generated
	 */
	void setBootNotificationResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Charge Box Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Box Identity</em>' attribute.
	 * @see #setChargeBoxIdentity(String)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_ChargeBoxIdentity()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chargeBoxIdentity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChargeBoxIdentity();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getChargeBoxIdentity <em>Charge Box Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Box Identity</em>' attribute.
	 * @see #getChargeBoxIdentity()
	 * @generated
	 */
	void setChargeBoxIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Data Transfer Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Transfer Request</em>' attribute.
	 * @see #setDataTransferRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_DataTransferRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataTransferRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDataTransferRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferRequest <em>Data Transfer Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transfer Request</em>' attribute.
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	void setDataTransferRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Data Transfer Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Transfer Response</em>' attribute.
	 * @see #setDataTransferResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_DataTransferResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataTransferResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDataTransferResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferResponse <em>Data Transfer Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transfer Response</em>' attribute.
	 * @see #getDataTransferResponse()
	 * @generated
	 */
	void setDataTransferResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Diagnostics Status Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics Status Notification Request</em>' attribute.
	 * @see #setDiagnosticsStatusNotificationRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_DiagnosticsStatusNotificationRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagnosticsStatusNotificationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDiagnosticsStatusNotificationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationRequest <em>Diagnostics Status Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics Status Notification Request</em>' attribute.
	 * @see #getDiagnosticsStatusNotificationRequest()
	 * @generated
	 */
	void setDiagnosticsStatusNotificationRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Diagnostics Status Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics Status Notification Response</em>' attribute.
	 * @see #setDiagnosticsStatusNotificationResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_DiagnosticsStatusNotificationResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagnosticsStatusNotificationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDiagnosticsStatusNotificationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationResponse <em>Diagnostics Status Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics Status Notification Response</em>' attribute.
	 * @see #getDiagnosticsStatusNotificationResponse()
	 * @generated
	 */
	void setDiagnosticsStatusNotificationResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Firmware Status Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware Status Notification Request</em>' attribute.
	 * @see #setFirmwareStatusNotificationRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_FirmwareStatusNotificationRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firmwareStatusNotificationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFirmwareStatusNotificationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationRequest <em>Firmware Status Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware Status Notification Request</em>' attribute.
	 * @see #getFirmwareStatusNotificationRequest()
	 * @generated
	 */
	void setFirmwareStatusNotificationRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Firmware Status Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware Status Notification Response</em>' attribute.
	 * @see #setFirmwareStatusNotificationResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_FirmwareStatusNotificationResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firmwareStatusNotificationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFirmwareStatusNotificationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationResponse <em>Firmware Status Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware Status Notification Response</em>' attribute.
	 * @see #getFirmwareStatusNotificationResponse()
	 * @generated
	 */
	void setFirmwareStatusNotificationResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Heartbeat Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heartbeat Request</em>' attribute.
	 * @see #setHeartbeatRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_HeartbeatRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='heartbeatRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getHeartbeatRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatRequest <em>Heartbeat Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat Request</em>' attribute.
	 * @see #getHeartbeatRequest()
	 * @generated
	 */
	void setHeartbeatRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Heartbeat Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heartbeat Response</em>' attribute.
	 * @see #setHeartbeatResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_HeartbeatResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='heartbeatResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getHeartbeatResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatResponse <em>Heartbeat Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat Response</em>' attribute.
	 * @see #getHeartbeatResponse()
	 * @generated
	 */
	void setHeartbeatResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Meter Values Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Values Request</em>' attribute.
	 * @see #setMeterValuesRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_MeterValuesRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='meterValuesRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMeterValuesRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesRequest <em>Meter Values Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Values Request</em>' attribute.
	 * @see #getMeterValuesRequest()
	 * @generated
	 */
	void setMeterValuesRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Meter Values Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Values Response</em>' attribute.
	 * @see #setMeterValuesResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_MeterValuesResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='meterValuesResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMeterValuesResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesResponse <em>Meter Values Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Values Response</em>' attribute.
	 * @see #getMeterValuesResponse()
	 * @generated
	 */
	void setMeterValuesResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Start Transaction Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Transaction Request</em>' attribute.
	 * @see #setStartTransactionRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_StartTransactionRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='startTransactionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStartTransactionRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionRequest <em>Start Transaction Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Transaction Request</em>' attribute.
	 * @see #getStartTransactionRequest()
	 * @generated
	 */
	void setStartTransactionRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Start Transaction Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Transaction Response</em>' attribute.
	 * @see #setStartTransactionResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_StartTransactionResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='startTransactionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStartTransactionResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionResponse <em>Start Transaction Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Transaction Response</em>' attribute.
	 * @see #getStartTransactionResponse()
	 * @generated
	 */
	void setStartTransactionResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Status Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Notification Request</em>' attribute.
	 * @see #setStatusNotificationRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_StatusNotificationRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='statusNotificationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStatusNotificationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationRequest <em>Status Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Notification Request</em>' attribute.
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	void setStatusNotificationRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Status Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Notification Response</em>' attribute.
	 * @see #setStatusNotificationResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_StatusNotificationResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='statusNotificationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStatusNotificationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationResponse <em>Status Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Notification Response</em>' attribute.
	 * @see #getStatusNotificationResponse()
	 * @generated
	 */
	void setStatusNotificationResponse(Object value);

	/**
	 * Returns the value of the '<em><b>Stop Transaction Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Transaction Request</em>' attribute.
	 * @see #setStopTransactionRequest(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_StopTransactionRequest()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stopTransactionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStopTransactionRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionRequest <em>Stop Transaction Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Transaction Request</em>' attribute.
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	void setStopTransactionRequest(Object value);

	/**
	 * Returns the value of the '<em><b>Stop Transaction Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Transaction Response</em>' attribute.
	 * @see #setStopTransactionResponse(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDocumentRoot_StopTransactionResponse()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stopTransactionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStopTransactionResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionResponse <em>Stop Transaction Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Transaction Response</em>' attribute.
	 * @see #getStopTransactionResponse()
	 * @generated
	 */
	void setStopTransactionResponse(Object value);

} // DocumentRoot
