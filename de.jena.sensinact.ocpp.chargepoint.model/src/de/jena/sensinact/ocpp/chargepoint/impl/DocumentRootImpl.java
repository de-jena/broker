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
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest;
import de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse;
import de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest;
import de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse;
import de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest;
import de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse;
import de.jena.sensinact.ocpp.chargepoint.ClearCacheRequest;
import de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse;
import de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest;
import de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse;
import de.jena.sensinact.ocpp.chargepoint.DataTransferRequest;
import de.jena.sensinact.ocpp.chargepoint.DataTransferResponse;
import de.jena.sensinact.ocpp.chargepoint.DocumentRoot;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse;
import de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest;
import de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse;
import de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest;
import de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse;
import de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest;
import de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest;
import de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse;
import de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest;
import de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse;
import de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest;
import de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse;
import de.jena.sensinact.ocpp.chargepoint.ResetRequest;
import de.jena.sensinact.ocpp.chargepoint.ResetResponse;
import de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest;
import de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse;
import de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest;
import de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse;
import de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest;
import de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse;
import de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest;
import de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse;
import de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest;
import de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse;

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
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getCancelReservationRequest <em>Cancel Reservation Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getCancelReservationResponse <em>Cancel Reservation Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getChangeAvailabilityRequest <em>Change Availability Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getChangeAvailabilityResponse <em>Change Availability Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getChangeConfigurationRequest <em>Change Configuration Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getChangeConfigurationResponse <em>Change Configuration Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getChargeBoxIdentity <em>Charge Box Identity</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getClearCacheRequest <em>Clear Cache Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getClearCacheResponse <em>Clear Cache Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getClearChargingProfileRequest <em>Clear Charging Profile Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getClearChargingProfileResponse <em>Clear Charging Profile Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getDataTransferRequest <em>Data Transfer Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getDataTransferResponse <em>Data Transfer Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetCompositeScheduleRequest <em>Get Composite Schedule Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetCompositeScheduleResponse <em>Get Composite Schedule Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetConfigurationRequest <em>Get Configuration Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetConfigurationResponse <em>Get Configuration Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetDiagnosticsRequest <em>Get Diagnostics Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetDiagnosticsResponse <em>Get Diagnostics Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetLocalListVersionRequest <em>Get Local List Version Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getGetLocalListVersionResponse <em>Get Local List Version Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getRemoteStartTransactionRequest <em>Remote Start Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getRemoteStartTransactionResponse <em>Remote Start Transaction Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getRemoteStopTransactionRequest <em>Remote Stop Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getRemoteStopTransactionResponse <em>Remote Stop Transaction Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getReserveNowRequest <em>Reserve Now Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getReserveNowResponse <em>Reserve Now Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getResetRequest <em>Reset Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getResetResponse <em>Reset Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getSendLocalListRequest <em>Send Local List Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getSendLocalListResponse <em>Send Local List Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getSetChargingProfileRequest <em>Set Charging Profile Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getSetChargingProfileResponse <em>Set Charging Profile Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getTriggerMessageRequest <em>Trigger Message Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getTriggerMessageResponse <em>Trigger Message Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getUnlockConnectorRequest <em>Unlock Connector Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getUnlockConnectorResponse <em>Unlock Connector Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getUpdateFirmwareRequest <em>Update Firmware Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl#getUpdateFirmwareResponse <em>Update Firmware Response</em>}</li>
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
	 * The default value of the '{@link #getChargeBoxIdentity() <em>Charge Box Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeBoxIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGE_BOX_IDENTITY_EDEFAULT = null;

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
		return OcppChargePointPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OcppChargePointPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OcppChargePointPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OcppChargePointPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelReservationRequest getCancelReservationRequest() {
		return (CancelReservationRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelReservationRequest(CancelReservationRequest newCancelReservationRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST, newCancelReservationRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelReservationRequest(CancelReservationRequest newCancelReservationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST, newCancelReservationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelReservationResponse getCancelReservationResponse() {
		return (CancelReservationResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelReservationResponse(CancelReservationResponse newCancelReservationResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE, newCancelReservationResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelReservationResponse(CancelReservationResponse newCancelReservationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE, newCancelReservationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeAvailabilityRequest getChangeAvailabilityRequest() {
		return (ChangeAvailabilityRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeAvailabilityRequest(ChangeAvailabilityRequest newChangeAvailabilityRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST, newChangeAvailabilityRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeAvailabilityRequest(ChangeAvailabilityRequest newChangeAvailabilityRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST, newChangeAvailabilityRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeAvailabilityResponse getChangeAvailabilityResponse() {
		return (ChangeAvailabilityResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeAvailabilityResponse(ChangeAvailabilityResponse newChangeAvailabilityResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE, newChangeAvailabilityResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeAvailabilityResponse(ChangeAvailabilityResponse newChangeAvailabilityResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE, newChangeAvailabilityResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeConfigurationRequest getChangeConfigurationRequest() {
		return (ChangeConfigurationRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeConfigurationRequest(ChangeConfigurationRequest newChangeConfigurationRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST, newChangeConfigurationRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeConfigurationRequest(ChangeConfigurationRequest newChangeConfigurationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST, newChangeConfigurationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeConfigurationResponse getChangeConfigurationResponse() {
		return (ChangeConfigurationResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeConfigurationResponse(ChangeConfigurationResponse newChangeConfigurationResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE, newChangeConfigurationResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeConfigurationResponse(ChangeConfigurationResponse newChangeConfigurationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE, newChangeConfigurationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChargeBoxIdentity() {
		return (String)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargeBoxIdentity(String newChargeBoxIdentity) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY, newChargeBoxIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearCacheRequest getClearCacheRequest() {
		return (ClearCacheRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearCacheRequest(ClearCacheRequest newClearCacheRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST, newClearCacheRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearCacheRequest(ClearCacheRequest newClearCacheRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST, newClearCacheRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearCacheResponse getClearCacheResponse() {
		return (ClearCacheResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearCacheResponse(ClearCacheResponse newClearCacheResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE, newClearCacheResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearCacheResponse(ClearCacheResponse newClearCacheResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE, newClearCacheResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearChargingProfileRequest getClearChargingProfileRequest() {
		return (ClearChargingProfileRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearChargingProfileRequest(ClearChargingProfileRequest newClearChargingProfileRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST, newClearChargingProfileRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearChargingProfileRequest(ClearChargingProfileRequest newClearChargingProfileRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST, newClearChargingProfileRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearChargingProfileResponse getClearChargingProfileResponse() {
		return (ClearChargingProfileResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearChargingProfileResponse(ClearChargingProfileResponse newClearChargingProfileResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE, newClearChargingProfileResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearChargingProfileResponse(ClearChargingProfileResponse newClearChargingProfileResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE, newClearChargingProfileResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransferRequest getDataTransferRequest() {
		return (DataTransferRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTransferRequest(DataTransferRequest newDataTransferRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST, newDataTransferRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTransferRequest(DataTransferRequest newDataTransferRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST, newDataTransferRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransferResponse getDataTransferResponse() {
		return (DataTransferResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTransferResponse(DataTransferResponse newDataTransferResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE, newDataTransferResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTransferResponse(DataTransferResponse newDataTransferResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE, newDataTransferResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCompositeScheduleRequest getGetCompositeScheduleRequest() {
		return (GetCompositeScheduleRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCompositeScheduleRequest(GetCompositeScheduleRequest newGetCompositeScheduleRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST, newGetCompositeScheduleRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCompositeScheduleRequest(GetCompositeScheduleRequest newGetCompositeScheduleRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST, newGetCompositeScheduleRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCompositeScheduleResponse getGetCompositeScheduleResponse() {
		return (GetCompositeScheduleResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCompositeScheduleResponse(GetCompositeScheduleResponse newGetCompositeScheduleResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE, newGetCompositeScheduleResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCompositeScheduleResponse(GetCompositeScheduleResponse newGetCompositeScheduleResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE, newGetCompositeScheduleResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConfigurationRequest getGetConfigurationRequest() {
		return (GetConfigurationRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConfigurationRequest(GetConfigurationRequest newGetConfigurationRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST, newGetConfigurationRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConfigurationRequest(GetConfigurationRequest newGetConfigurationRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST, newGetConfigurationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConfigurationResponse getGetConfigurationResponse() {
		return (GetConfigurationResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetConfigurationResponse(GetConfigurationResponse newGetConfigurationResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE, newGetConfigurationResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetConfigurationResponse(GetConfigurationResponse newGetConfigurationResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE, newGetConfigurationResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDiagnosticsRequest getGetDiagnosticsRequest() {
		return (GetDiagnosticsRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDiagnosticsRequest(GetDiagnosticsRequest newGetDiagnosticsRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST, newGetDiagnosticsRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetDiagnosticsRequest(GetDiagnosticsRequest newGetDiagnosticsRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST, newGetDiagnosticsRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDiagnosticsResponse getGetDiagnosticsResponse() {
		return (GetDiagnosticsResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDiagnosticsResponse(GetDiagnosticsResponse newGetDiagnosticsResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE, newGetDiagnosticsResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetDiagnosticsResponse(GetDiagnosticsResponse newGetDiagnosticsResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE, newGetDiagnosticsResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetLocalListVersionRequest getGetLocalListVersionRequest() {
		return (GetLocalListVersionRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetLocalListVersionRequest(GetLocalListVersionRequest newGetLocalListVersionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST, newGetLocalListVersionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetLocalListVersionRequest(GetLocalListVersionRequest newGetLocalListVersionRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST, newGetLocalListVersionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetLocalListVersionResponse getGetLocalListVersionResponse() {
		return (GetLocalListVersionResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetLocalListVersionResponse(GetLocalListVersionResponse newGetLocalListVersionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE, newGetLocalListVersionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetLocalListVersionResponse(GetLocalListVersionResponse newGetLocalListVersionResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE, newGetLocalListVersionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStartTransactionRequest getRemoteStartTransactionRequest() {
		return (RemoteStartTransactionRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteStartTransactionRequest(RemoteStartTransactionRequest newRemoteStartTransactionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST, newRemoteStartTransactionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteStartTransactionRequest(RemoteStartTransactionRequest newRemoteStartTransactionRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST, newRemoteStartTransactionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStartTransactionResponse getRemoteStartTransactionResponse() {
		return (RemoteStartTransactionResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteStartTransactionResponse(RemoteStartTransactionResponse newRemoteStartTransactionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE, newRemoteStartTransactionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteStartTransactionResponse(RemoteStartTransactionResponse newRemoteStartTransactionResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE, newRemoteStartTransactionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStopTransactionRequest getRemoteStopTransactionRequest() {
		return (RemoteStopTransactionRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteStopTransactionRequest(RemoteStopTransactionRequest newRemoteStopTransactionRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST, newRemoteStopTransactionRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteStopTransactionRequest(RemoteStopTransactionRequest newRemoteStopTransactionRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST, newRemoteStopTransactionRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStopTransactionResponse getRemoteStopTransactionResponse() {
		return (RemoteStopTransactionResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteStopTransactionResponse(RemoteStopTransactionResponse newRemoteStopTransactionResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE, newRemoteStopTransactionResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteStopTransactionResponse(RemoteStopTransactionResponse newRemoteStopTransactionResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE, newRemoteStopTransactionResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReserveNowRequest getReserveNowRequest() {
		return (ReserveNowRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESERVE_NOW_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveNowRequest(ReserveNowRequest newReserveNowRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESERVE_NOW_REQUEST, newReserveNowRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveNowRequest(ReserveNowRequest newReserveNowRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESERVE_NOW_REQUEST, newReserveNowRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReserveNowResponse getReserveNowResponse() {
		return (ReserveNowResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveNowResponse(ReserveNowResponse newReserveNowResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE, newReserveNowResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveNowResponse(ReserveNowResponse newReserveNowResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE, newReserveNowResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetRequest getResetRequest() {
		return (ResetRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESET_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResetRequest(ResetRequest newResetRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESET_REQUEST, newResetRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetRequest(ResetRequest newResetRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESET_REQUEST, newResetRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetResponse getResetResponse() {
		return (ResetResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESET_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResetResponse(ResetResponse newResetResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESET_RESPONSE, newResetResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetResponse(ResetResponse newResetResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__RESET_RESPONSE, newResetResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendLocalListRequest getSendLocalListRequest() {
		return (SendLocalListRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendLocalListRequest(SendLocalListRequest newSendLocalListRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST, newSendLocalListRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendLocalListRequest(SendLocalListRequest newSendLocalListRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST, newSendLocalListRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendLocalListResponse getSendLocalListResponse() {
		return (SendLocalListResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendLocalListResponse(SendLocalListResponse newSendLocalListResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE, newSendLocalListResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendLocalListResponse(SendLocalListResponse newSendLocalListResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE, newSendLocalListResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetChargingProfileRequest getSetChargingProfileRequest() {
		return (SetChargingProfileRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetChargingProfileRequest(SetChargingProfileRequest newSetChargingProfileRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST, newSetChargingProfileRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetChargingProfileRequest(SetChargingProfileRequest newSetChargingProfileRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST, newSetChargingProfileRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetChargingProfileResponse getSetChargingProfileResponse() {
		return (SetChargingProfileResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetChargingProfileResponse(SetChargingProfileResponse newSetChargingProfileResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE, newSetChargingProfileResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetChargingProfileResponse(SetChargingProfileResponse newSetChargingProfileResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE, newSetChargingProfileResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerMessageRequest getTriggerMessageRequest() {
		return (TriggerMessageRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerMessageRequest(TriggerMessageRequest newTriggerMessageRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST, newTriggerMessageRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerMessageRequest(TriggerMessageRequest newTriggerMessageRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST, newTriggerMessageRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerMessageResponse getTriggerMessageResponse() {
		return (TriggerMessageResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerMessageResponse(TriggerMessageResponse newTriggerMessageResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE, newTriggerMessageResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerMessageResponse(TriggerMessageResponse newTriggerMessageResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE, newTriggerMessageResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlockConnectorRequest getUnlockConnectorRequest() {
		return (UnlockConnectorRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlockConnectorRequest(UnlockConnectorRequest newUnlockConnectorRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST, newUnlockConnectorRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnlockConnectorRequest(UnlockConnectorRequest newUnlockConnectorRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST, newUnlockConnectorRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlockConnectorResponse getUnlockConnectorResponse() {
		return (UnlockConnectorResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlockConnectorResponse(UnlockConnectorResponse newUnlockConnectorResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE, newUnlockConnectorResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnlockConnectorResponse(UnlockConnectorResponse newUnlockConnectorResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE, newUnlockConnectorResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateFirmwareRequest getUpdateFirmwareRequest() {
		return (UpdateFirmwareRequest)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateFirmwareRequest(UpdateFirmwareRequest newUpdateFirmwareRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST, newUpdateFirmwareRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateFirmwareRequest(UpdateFirmwareRequest newUpdateFirmwareRequest) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST, newUpdateFirmwareRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateFirmwareResponse getUpdateFirmwareResponse() {
		return (UpdateFirmwareResponse)getMixed().get(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateFirmwareResponse(UpdateFirmwareResponse newUpdateFirmwareResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE, newUpdateFirmwareResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateFirmwareResponse(UpdateFirmwareResponse newUpdateFirmwareResponse) {
		((FeatureMap.Internal)getMixed()).set(OcppChargePointPackage.Literals.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE, newUpdateFirmwareResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST:
				return basicSetCancelReservationRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE:
				return basicSetCancelReservationResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST:
				return basicSetChangeAvailabilityRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE:
				return basicSetChangeAvailabilityResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST:
				return basicSetChangeConfigurationRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE:
				return basicSetChangeConfigurationResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST:
				return basicSetClearCacheRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE:
				return basicSetClearCacheResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST:
				return basicSetClearChargingProfileRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE:
				return basicSetClearChargingProfileResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				return basicSetDataTransferRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				return basicSetDataTransferResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST:
				return basicSetGetCompositeScheduleRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE:
				return basicSetGetCompositeScheduleResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST:
				return basicSetGetConfigurationRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE:
				return basicSetGetConfigurationResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST:
				return basicSetGetDiagnosticsRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE:
				return basicSetGetDiagnosticsResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST:
				return basicSetGetLocalListVersionRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE:
				return basicSetGetLocalListVersionResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST:
				return basicSetRemoteStartTransactionRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE:
				return basicSetRemoteStartTransactionResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST:
				return basicSetRemoteStopTransactionRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE:
				return basicSetRemoteStopTransactionResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_REQUEST:
				return basicSetReserveNowRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE:
				return basicSetReserveNowResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_REQUEST:
				return basicSetResetRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_RESPONSE:
				return basicSetResetResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST:
				return basicSetSendLocalListRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE:
				return basicSetSendLocalListResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST:
				return basicSetSetChargingProfileRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE:
				return basicSetSetChargingProfileResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST:
				return basicSetTriggerMessageRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE:
				return basicSetTriggerMessageResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST:
				return basicSetUnlockConnectorRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE:
				return basicSetUnlockConnectorResponse(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST:
				return basicSetUpdateFirmwareRequest(null, msgs);
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE:
				return basicSetUpdateFirmwareResponse(null, msgs);
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
			case OcppChargePointPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OcppChargePointPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OcppChargePointPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST:
				return getCancelReservationRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE:
				return getCancelReservationResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST:
				return getChangeAvailabilityRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE:
				return getChangeAvailabilityResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST:
				return getChangeConfigurationRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE:
				return getChangeConfigurationResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				return getChargeBoxIdentity();
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST:
				return getClearCacheRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE:
				return getClearCacheResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST:
				return getClearChargingProfileRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE:
				return getClearChargingProfileResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				return getDataTransferRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				return getDataTransferResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST:
				return getGetCompositeScheduleRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE:
				return getGetCompositeScheduleResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST:
				return getGetConfigurationRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE:
				return getGetConfigurationResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST:
				return getGetDiagnosticsRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE:
				return getGetDiagnosticsResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST:
				return getGetLocalListVersionRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE:
				return getGetLocalListVersionResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST:
				return getRemoteStartTransactionRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE:
				return getRemoteStartTransactionResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST:
				return getRemoteStopTransactionRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE:
				return getRemoteStopTransactionResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_REQUEST:
				return getReserveNowRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE:
				return getReserveNowResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_REQUEST:
				return getResetRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_RESPONSE:
				return getResetResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST:
				return getSendLocalListRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE:
				return getSendLocalListResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST:
				return getSetChargingProfileRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE:
				return getSetChargingProfileResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST:
				return getTriggerMessageRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE:
				return getTriggerMessageResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST:
				return getUnlockConnectorRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE:
				return getUnlockConnectorResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST:
				return getUpdateFirmwareRequest();
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE:
				return getUpdateFirmwareResponse();
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
			case OcppChargePointPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST:
				setCancelReservationRequest((CancelReservationRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE:
				setCancelReservationResponse((CancelReservationResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST:
				setChangeAvailabilityRequest((ChangeAvailabilityRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE:
				setChangeAvailabilityResponse((ChangeAvailabilityResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST:
				setChangeConfigurationRequest((ChangeConfigurationRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE:
				setChangeConfigurationResponse((ChangeConfigurationResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				setChargeBoxIdentity((String)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST:
				setClearCacheRequest((ClearCacheRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE:
				setClearCacheResponse((ClearCacheResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST:
				setClearChargingProfileRequest((ClearChargingProfileRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE:
				setClearChargingProfileResponse((ClearChargingProfileResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				setDataTransferRequest((DataTransferRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				setDataTransferResponse((DataTransferResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST:
				setGetCompositeScheduleRequest((GetCompositeScheduleRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE:
				setGetCompositeScheduleResponse((GetCompositeScheduleResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST:
				setGetConfigurationRequest((GetConfigurationRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE:
				setGetConfigurationResponse((GetConfigurationResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST:
				setGetDiagnosticsRequest((GetDiagnosticsRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE:
				setGetDiagnosticsResponse((GetDiagnosticsResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST:
				setGetLocalListVersionRequest((GetLocalListVersionRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE:
				setGetLocalListVersionResponse((GetLocalListVersionResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST:
				setRemoteStartTransactionRequest((RemoteStartTransactionRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE:
				setRemoteStartTransactionResponse((RemoteStartTransactionResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST:
				setRemoteStopTransactionRequest((RemoteStopTransactionRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE:
				setRemoteStopTransactionResponse((RemoteStopTransactionResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_REQUEST:
				setReserveNowRequest((ReserveNowRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE:
				setReserveNowResponse((ReserveNowResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_REQUEST:
				setResetRequest((ResetRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_RESPONSE:
				setResetResponse((ResetResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST:
				setSendLocalListRequest((SendLocalListRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE:
				setSendLocalListResponse((SendLocalListResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST:
				setSetChargingProfileRequest((SetChargingProfileRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE:
				setSetChargingProfileResponse((SetChargingProfileResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST:
				setTriggerMessageRequest((TriggerMessageRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE:
				setTriggerMessageResponse((TriggerMessageResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST:
				setUnlockConnectorRequest((UnlockConnectorRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE:
				setUnlockConnectorResponse((UnlockConnectorResponse)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST:
				setUpdateFirmwareRequest((UpdateFirmwareRequest)newValue);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE:
				setUpdateFirmwareResponse((UpdateFirmwareResponse)newValue);
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
			case OcppChargePointPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST:
				setCancelReservationRequest((CancelReservationRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE:
				setCancelReservationResponse((CancelReservationResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST:
				setChangeAvailabilityRequest((ChangeAvailabilityRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE:
				setChangeAvailabilityResponse((ChangeAvailabilityResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST:
				setChangeConfigurationRequest((ChangeConfigurationRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE:
				setChangeConfigurationResponse((ChangeConfigurationResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				setChargeBoxIdentity(CHARGE_BOX_IDENTITY_EDEFAULT);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST:
				setClearCacheRequest((ClearCacheRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE:
				setClearCacheResponse((ClearCacheResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST:
				setClearChargingProfileRequest((ClearChargingProfileRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE:
				setClearChargingProfileResponse((ClearChargingProfileResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				setDataTransferRequest((DataTransferRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				setDataTransferResponse((DataTransferResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST:
				setGetCompositeScheduleRequest((GetCompositeScheduleRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE:
				setGetCompositeScheduleResponse((GetCompositeScheduleResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST:
				setGetConfigurationRequest((GetConfigurationRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE:
				setGetConfigurationResponse((GetConfigurationResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST:
				setGetDiagnosticsRequest((GetDiagnosticsRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE:
				setGetDiagnosticsResponse((GetDiagnosticsResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST:
				setGetLocalListVersionRequest((GetLocalListVersionRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE:
				setGetLocalListVersionResponse((GetLocalListVersionResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST:
				setRemoteStartTransactionRequest((RemoteStartTransactionRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE:
				setRemoteStartTransactionResponse((RemoteStartTransactionResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST:
				setRemoteStopTransactionRequest((RemoteStopTransactionRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE:
				setRemoteStopTransactionResponse((RemoteStopTransactionResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_REQUEST:
				setReserveNowRequest((ReserveNowRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE:
				setReserveNowResponse((ReserveNowResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_REQUEST:
				setResetRequest((ResetRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_RESPONSE:
				setResetResponse((ResetResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST:
				setSendLocalListRequest((SendLocalListRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE:
				setSendLocalListResponse((SendLocalListResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST:
				setSetChargingProfileRequest((SetChargingProfileRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE:
				setSetChargingProfileResponse((SetChargingProfileResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST:
				setTriggerMessageRequest((TriggerMessageRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE:
				setTriggerMessageResponse((TriggerMessageResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST:
				setUnlockConnectorRequest((UnlockConnectorRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE:
				setUnlockConnectorResponse((UnlockConnectorResponse)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST:
				setUpdateFirmwareRequest((UpdateFirmwareRequest)null);
				return;
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE:
				setUpdateFirmwareResponse((UpdateFirmwareResponse)null);
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
			case OcppChargePointPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OcppChargePointPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OcppChargePointPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST:
				return getCancelReservationRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE:
				return getCancelReservationResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST:
				return getChangeAvailabilityRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE:
				return getChangeAvailabilityResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST:
				return getChangeConfigurationRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE:
				return getChangeConfigurationResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CHARGE_BOX_IDENTITY:
				return CHARGE_BOX_IDENTITY_EDEFAULT == null ? getChargeBoxIdentity() != null : !CHARGE_BOX_IDENTITY_EDEFAULT.equals(getChargeBoxIdentity());
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_REQUEST:
				return getClearCacheRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE:
				return getClearCacheResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST:
				return getClearChargingProfileRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE:
				return getClearChargingProfileResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_REQUEST:
				return getDataTransferRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE:
				return getDataTransferResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST:
				return getGetCompositeScheduleRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE:
				return getGetCompositeScheduleResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST:
				return getGetConfigurationRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE:
				return getGetConfigurationResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST:
				return getGetDiagnosticsRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE:
				return getGetDiagnosticsResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST:
				return getGetLocalListVersionRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE:
				return getGetLocalListVersionResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST:
				return getRemoteStartTransactionRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE:
				return getRemoteStartTransactionResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST:
				return getRemoteStopTransactionRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE:
				return getRemoteStopTransactionResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_REQUEST:
				return getReserveNowRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESERVE_NOW_RESPONSE:
				return getReserveNowResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_REQUEST:
				return getResetRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__RESET_RESPONSE:
				return getResetResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST:
				return getSendLocalListRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE:
				return getSendLocalListResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST:
				return getSetChargingProfileRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE:
				return getSetChargingProfileResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST:
				return getTriggerMessageRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE:
				return getTriggerMessageResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST:
				return getUnlockConnectorRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE:
				return getUnlockConnectorResponse() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST:
				return getUpdateFirmwareRequest() != null;
			case OcppChargePointPackage.DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE:
				return getUpdateFirmwareResponse() != null;
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
