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
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.DocumentRoot;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getAuthorizeRequest <em>Authorize Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getAuthorizeResponse <em>Authorize Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getBootNotificationRequest <em>Boot Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getBootNotificationResponse <em>Boot Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getChargeBoxIdentity <em>Charge Box Identity</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getDataTransferRequest <em>Data Transfer Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getDataTransferResponse <em>Data Transfer Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getDiagnosticsStatusNotificationRequest <em>Diagnostics Status Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getDiagnosticsStatusNotificationResponse <em>Diagnostics Status Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getFirmwareStatusNotificationRequest <em>Firmware Status Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getFirmwareStatusNotificationResponse <em>Firmware Status Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getHeartbeatRequest <em>Heartbeat Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getHeartbeatResponse <em>Heartbeat Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getMeterValuesRequest <em>Meter Values Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getMeterValuesResponse <em>Meter Values Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getStartTransactionRequest <em>Start Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getStartTransactionResponse <em>Start Transaction Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getStatusNotificationRequest <em>Status Notification Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getStatusNotificationResponse <em>Status Notification Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getStopTransactionRequest <em>Stop Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl#getStopTransactionResponse <em>Stop Transaction Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAuthorizeRequest() <em>Authorize Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizeRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUTHORIZE_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthorizeResponse() <em>Authorize Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizeResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object AUTHORIZE_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBootNotificationRequest() <em>Boot Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootNotificationRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object BOOT_NOTIFICATION_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBootNotificationResponse() <em>Boot Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootNotificationResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object BOOT_NOTIFICATION_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getChargeBoxIdentity() <em>Charge Box Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeBoxIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGE_BOX_IDENTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDataTransferRequest() <em>Data Transfer Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransferRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATA_TRANSFER_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDataTransferResponse() <em>Data Transfer Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransferResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATA_TRANSFER_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDiagnosticsStatusNotificationRequest() <em>Diagnostics Status Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticsStatusNotificationRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDiagnosticsStatusNotificationResponse() <em>Diagnostics Status Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticsStatusNotificationResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFirmwareStatusNotificationRequest() <em>Firmware Status Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareStatusNotificationRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIRMWARE_STATUS_NOTIFICATION_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFirmwareStatusNotificationResponse() <em>Firmware Status Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareStatusNotificationResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIRMWARE_STATUS_NOTIFICATION_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHeartbeatRequest() <em>Heartbeat Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEARTBEAT_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHeartbeatResponse() <em>Heartbeat Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object HEARTBEAT_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMeterValuesRequest() <em>Meter Values Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterValuesRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object METER_VALUES_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMeterValuesResponse() <em>Meter Values Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterValuesResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object METER_VALUES_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartTransactionRequest() <em>Start Transaction Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTransactionRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_TRANSACTION_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartTransactionResponse() <em>Start Transaction Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTransactionResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_TRANSACTION_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatusNotificationRequest() <em>Status Notification Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusNotificationRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_NOTIFICATION_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatusNotificationResponse() <em>Status Notification Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusNotificationResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_NOTIFICATION_RESPONSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStopTransactionRequest() <em>Stop Transaction Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTransactionRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Object STOP_TRANSACTION_REQUEST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStopTransactionResponse() <em>Stop Transaction Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTransactionResponse()
	 * @generated
	 * @ordered
	 */
	protected static final Object STOP_TRANSACTION_RESPONSE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OcppCentralSystemPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OcppCentralSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OcppCentralSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAuthorizeRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__AUTHORIZE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizeRequest(Object newAuthorizeRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__AUTHORIZE_REQUEST, newAuthorizeRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAuthorizeResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__AUTHORIZE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizeResponse(Object newAuthorizeResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__AUTHORIZE_RESPONSE, newAuthorizeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBootNotificationRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBootNotificationRequest(Object newBootNotificationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST, newBootNotificationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBootNotificationResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBootNotificationResponse(Object newBootNotificationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE, newBootNotificationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChargeBoxIdentity() {
		return (String)getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargeBoxIdentity(String newChargeBoxIdentity) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY, newChargeBoxIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDataTransferRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTransferRequest(Object newDataTransferRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST, newDataTransferRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDataTransferResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTransferResponse(Object newDataTransferResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE, newDataTransferResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDiagnosticsStatusNotificationRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticsStatusNotificationRequest(Object newDiagnosticsStatusNotificationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST, newDiagnosticsStatusNotificationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDiagnosticsStatusNotificationResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticsStatusNotificationResponse(Object newDiagnosticsStatusNotificationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE, newDiagnosticsStatusNotificationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFirmwareStatusNotificationRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirmwareStatusNotificationRequest(Object newFirmwareStatusNotificationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST, newFirmwareStatusNotificationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFirmwareStatusNotificationResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirmwareStatusNotificationResponse(Object newFirmwareStatusNotificationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE, newFirmwareStatusNotificationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getHeartbeatRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__HEARTBEAT_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeartbeatRequest(Object newHeartbeatRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__HEARTBEAT_REQUEST, newHeartbeatRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getHeartbeatResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__HEARTBEAT_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeartbeatResponse(Object newHeartbeatResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__HEARTBEAT_RESPONSE, newHeartbeatResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMeterValuesRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__METER_VALUES_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterValuesRequest(Object newMeterValuesRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__METER_VALUES_REQUEST, newMeterValuesRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMeterValuesResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__METER_VALUES_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterValuesResponse(Object newMeterValuesResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__METER_VALUES_RESPONSE, newMeterValuesResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStartTransactionRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__START_TRANSACTION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTransactionRequest(Object newStartTransactionRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__START_TRANSACTION_REQUEST, newStartTransactionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStartTransactionResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__START_TRANSACTION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTransactionResponse(Object newStartTransactionResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__START_TRANSACTION_RESPONSE, newStartTransactionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStatusNotificationRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusNotificationRequest(Object newStatusNotificationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST, newStatusNotificationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStatusNotificationResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusNotificationResponse(Object newStatusNotificationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE, newStatusNotificationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStopTransactionRequest() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopTransactionRequest(Object newStopTransactionRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST, newStopTransactionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStopTransactionResponse() {
		return getMixed().get(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopTransactionResponse(Object newStopTransactionResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppCentralSystemPackage.Literals.DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE, newStopTransactionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppCentralSystemPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_REQUEST:
				return getAuthorizeRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_RESPONSE:
				return getAuthorizeResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST:
				return getBootNotificationRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE:
				return getBootNotificationResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				return getChargeBoxIdentity();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				return getDataTransferRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				return getDataTransferResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST:
				return getDiagnosticsStatusNotificationRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE:
				return getDiagnosticsStatusNotificationResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST:
				return getFirmwareStatusNotificationRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE:
				return getFirmwareStatusNotificationResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_REQUEST:
				return getHeartbeatRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_RESPONSE:
				return getHeartbeatResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_REQUEST:
				return getMeterValuesRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_RESPONSE:
				return getMeterValuesResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_REQUEST:
				return getStartTransactionRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_RESPONSE:
				return getStartTransactionResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST:
				return getStatusNotificationRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE:
				return getStatusNotificationResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST:
				return getStopTransactionRequest();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE:
				return getStopTransactionResponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OcppCentralSystemPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_REQUEST:
				setAuthorizeRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_RESPONSE:
				setAuthorizeResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST:
				setBootNotificationRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE:
				setBootNotificationResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				setChargeBoxIdentity((String)newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				setDataTransferRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				setDataTransferResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST:
				setDiagnosticsStatusNotificationRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE:
				setDiagnosticsStatusNotificationResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST:
				setFirmwareStatusNotificationRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE:
				setFirmwareStatusNotificationResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_REQUEST:
				setHeartbeatRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_RESPONSE:
				setHeartbeatResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_REQUEST:
				setMeterValuesRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_RESPONSE:
				setMeterValuesResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_REQUEST:
				setStartTransactionRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_RESPONSE:
				setStartTransactionResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST:
				setStatusNotificationRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE:
				setStatusNotificationResponse(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST:
				setStopTransactionRequest(newValue);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE:
				setStopTransactionResponse(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OcppCentralSystemPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_REQUEST:
				setAuthorizeRequest(AUTHORIZE_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_RESPONSE:
				setAuthorizeResponse(AUTHORIZE_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST:
				setBootNotificationRequest(BOOT_NOTIFICATION_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE:
				setBootNotificationResponse(BOOT_NOTIFICATION_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				setChargeBoxIdentity(CHARGE_BOX_IDENTITY_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				setDataTransferRequest(DATA_TRANSFER_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				setDataTransferResponse(DATA_TRANSFER_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST:
				setDiagnosticsStatusNotificationRequest(DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE:
				setDiagnosticsStatusNotificationResponse(DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST:
				setFirmwareStatusNotificationRequest(FIRMWARE_STATUS_NOTIFICATION_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE:
				setFirmwareStatusNotificationResponse(FIRMWARE_STATUS_NOTIFICATION_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_REQUEST:
				setHeartbeatRequest(HEARTBEAT_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_RESPONSE:
				setHeartbeatResponse(HEARTBEAT_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_REQUEST:
				setMeterValuesRequest(METER_VALUES_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_RESPONSE:
				setMeterValuesResponse(METER_VALUES_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_REQUEST:
				setStartTransactionRequest(START_TRANSACTION_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_RESPONSE:
				setStartTransactionResponse(START_TRANSACTION_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST:
				setStatusNotificationRequest(STATUS_NOTIFICATION_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE:
				setStatusNotificationResponse(STATUS_NOTIFICATION_RESPONSE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST:
				setStopTransactionRequest(STOP_TRANSACTION_REQUEST_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE:
				setStopTransactionResponse(STOP_TRANSACTION_RESPONSE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OcppCentralSystemPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_REQUEST:
				return AUTHORIZE_REQUEST_EDEFAULT == null ? getAuthorizeRequest() != null : !AUTHORIZE_REQUEST_EDEFAULT.equals(getAuthorizeRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__AUTHORIZE_RESPONSE:
				return AUTHORIZE_RESPONSE_EDEFAULT == null ? getAuthorizeResponse() != null : !AUTHORIZE_RESPONSE_EDEFAULT.equals(getAuthorizeResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST:
				return BOOT_NOTIFICATION_REQUEST_EDEFAULT == null ? getBootNotificationRequest() != null : !BOOT_NOTIFICATION_REQUEST_EDEFAULT.equals(getBootNotificationRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE:
				return BOOT_NOTIFICATION_RESPONSE_EDEFAULT == null ? getBootNotificationResponse() != null : !BOOT_NOTIFICATION_RESPONSE_EDEFAULT.equals(getBootNotificationResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				return CHARGE_BOX_IDENTITY_EDEFAULT == null ? getChargeBoxIdentity() != null : !CHARGE_BOX_IDENTITY_EDEFAULT.equals(getChargeBoxIdentity());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				return DATA_TRANSFER_REQUEST_EDEFAULT == null ? getDataTransferRequest() != null : !DATA_TRANSFER_REQUEST_EDEFAULT.equals(getDataTransferRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				return DATA_TRANSFER_RESPONSE_EDEFAULT == null ? getDataTransferResponse() != null : !DATA_TRANSFER_RESPONSE_EDEFAULT.equals(getDataTransferResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST:
				return DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST_EDEFAULT == null ? getDiagnosticsStatusNotificationRequest() != null : !DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST_EDEFAULT.equals(getDiagnosticsStatusNotificationRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE:
				return DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE_EDEFAULT == null ? getDiagnosticsStatusNotificationResponse() != null : !DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE_EDEFAULT.equals(getDiagnosticsStatusNotificationResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST:
				return FIRMWARE_STATUS_NOTIFICATION_REQUEST_EDEFAULT == null ? getFirmwareStatusNotificationRequest() != null : !FIRMWARE_STATUS_NOTIFICATION_REQUEST_EDEFAULT.equals(getFirmwareStatusNotificationRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE:
				return FIRMWARE_STATUS_NOTIFICATION_RESPONSE_EDEFAULT == null ? getFirmwareStatusNotificationResponse() != null : !FIRMWARE_STATUS_NOTIFICATION_RESPONSE_EDEFAULT.equals(getFirmwareStatusNotificationResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_REQUEST:
				return HEARTBEAT_REQUEST_EDEFAULT == null ? getHeartbeatRequest() != null : !HEARTBEAT_REQUEST_EDEFAULT.equals(getHeartbeatRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__HEARTBEAT_RESPONSE:
				return HEARTBEAT_RESPONSE_EDEFAULT == null ? getHeartbeatResponse() != null : !HEARTBEAT_RESPONSE_EDEFAULT.equals(getHeartbeatResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_REQUEST:
				return METER_VALUES_REQUEST_EDEFAULT == null ? getMeterValuesRequest() != null : !METER_VALUES_REQUEST_EDEFAULT.equals(getMeterValuesRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__METER_VALUES_RESPONSE:
				return METER_VALUES_RESPONSE_EDEFAULT == null ? getMeterValuesResponse() != null : !METER_VALUES_RESPONSE_EDEFAULT.equals(getMeterValuesResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_REQUEST:
				return START_TRANSACTION_REQUEST_EDEFAULT == null ? getStartTransactionRequest() != null : !START_TRANSACTION_REQUEST_EDEFAULT.equals(getStartTransactionRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__START_TRANSACTION_RESPONSE:
				return START_TRANSACTION_RESPONSE_EDEFAULT == null ? getStartTransactionResponse() != null : !START_TRANSACTION_RESPONSE_EDEFAULT.equals(getStartTransactionResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST:
				return STATUS_NOTIFICATION_REQUEST_EDEFAULT == null ? getStatusNotificationRequest() != null : !STATUS_NOTIFICATION_REQUEST_EDEFAULT.equals(getStatusNotificationRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE:
				return STATUS_NOTIFICATION_RESPONSE_EDEFAULT == null ? getStatusNotificationResponse() != null : !STATUS_NOTIFICATION_RESPONSE_EDEFAULT.equals(getStatusNotificationResponse());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST:
				return STOP_TRANSACTION_REQUEST_EDEFAULT == null ? getStopTransactionRequest() != null : !STOP_TRANSACTION_REQUEST_EDEFAULT.equals(getStopTransactionRequest());
			case OcppCentralSystemPackage.DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE:
				return STOP_TRANSACTION_RESPONSE_EDEFAULT == null ? getStopTransactionResponse() != null : !STOP_TRANSACTION_RESPONSE_EDEFAULT.equals(getStopTransactionResponse());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
