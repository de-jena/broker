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

import org.eclipse.emf.ecore.EFactory;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage
 * @generated
 */
@ProviderType
public interface OcppChargePointFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppChargePointFactory eINSTANCE = de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Authorization Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Data</em>'.
	 * @generated
	 */
	AuthorizationData createAuthorizationData();

	/**
	 * Returns a new object of class '<em>Cancel Reservation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel Reservation Request</em>'.
	 * @generated
	 */
	CancelReservationRequest createCancelReservationRequest();

	/**
	 * Returns a new object of class '<em>Cancel Reservation Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel Reservation Response</em>'.
	 * @generated
	 */
	CancelReservationResponse createCancelReservationResponse();

	/**
	 * Returns a new object of class '<em>Change Availability Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Availability Request</em>'.
	 * @generated
	 */
	ChangeAvailabilityRequest createChangeAvailabilityRequest();

	/**
	 * Returns a new object of class '<em>Change Availability Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Availability Response</em>'.
	 * @generated
	 */
	ChangeAvailabilityResponse createChangeAvailabilityResponse();

	/**
	 * Returns a new object of class '<em>Change Configuration Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Configuration Request</em>'.
	 * @generated
	 */
	ChangeConfigurationRequest createChangeConfigurationRequest();

	/**
	 * Returns a new object of class '<em>Change Configuration Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Configuration Response</em>'.
	 * @generated
	 */
	ChangeConfigurationResponse createChangeConfigurationResponse();

	/**
	 * Returns a new object of class '<em>Charging Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charging Profile</em>'.
	 * @generated
	 */
	ChargingProfile createChargingProfile();

	/**
	 * Returns a new object of class '<em>Charging Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charging Schedule</em>'.
	 * @generated
	 */
	ChargingSchedule createChargingSchedule();

	/**
	 * Returns a new object of class '<em>Charging Schedule Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charging Schedule Period</em>'.
	 * @generated
	 */
	ChargingSchedulePeriod createChargingSchedulePeriod();

	/**
	 * Returns a new object of class '<em>Clear Cache Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Cache Request</em>'.
	 * @generated
	 */
	ClearCacheRequest createClearCacheRequest();

	/**
	 * Returns a new object of class '<em>Clear Cache Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Cache Response</em>'.
	 * @generated
	 */
	ClearCacheResponse createClearCacheResponse();

	/**
	 * Returns a new object of class '<em>Clear Charging Profile Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Charging Profile Request</em>'.
	 * @generated
	 */
	ClearChargingProfileRequest createClearChargingProfileRequest();

	/**
	 * Returns a new object of class '<em>Clear Charging Profile Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Charging Profile Response</em>'.
	 * @generated
	 */
	ClearChargingProfileResponse createClearChargingProfileResponse();

	/**
	 * Returns a new object of class '<em>Data Transfer Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Transfer Request</em>'.
	 * @generated
	 */
	DataTransferRequest createDataTransferRequest();

	/**
	 * Returns a new object of class '<em>Data Transfer Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Transfer Response</em>'.
	 * @generated
	 */
	DataTransferResponse createDataTransferResponse();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Get Composite Schedule Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Composite Schedule Request</em>'.
	 * @generated
	 */
	GetCompositeScheduleRequest createGetCompositeScheduleRequest();

	/**
	 * Returns a new object of class '<em>Get Composite Schedule Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Composite Schedule Response</em>'.
	 * @generated
	 */
	GetCompositeScheduleResponse createGetCompositeScheduleResponse();

	/**
	 * Returns a new object of class '<em>Get Configuration Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Configuration Request</em>'.
	 * @generated
	 */
	GetConfigurationRequest createGetConfigurationRequest();

	/**
	 * Returns a new object of class '<em>Get Configuration Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Configuration Response</em>'.
	 * @generated
	 */
	GetConfigurationResponse createGetConfigurationResponse();

	/**
	 * Returns a new object of class '<em>Get Diagnostics Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Diagnostics Request</em>'.
	 * @generated
	 */
	GetDiagnosticsRequest createGetDiagnosticsRequest();

	/**
	 * Returns a new object of class '<em>Get Diagnostics Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Diagnostics Response</em>'.
	 * @generated
	 */
	GetDiagnosticsResponse createGetDiagnosticsResponse();

	/**
	 * Returns a new object of class '<em>Get Local List Version Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Local List Version Request</em>'.
	 * @generated
	 */
	GetLocalListVersionRequest createGetLocalListVersionRequest();

	/**
	 * Returns a new object of class '<em>Get Local List Version Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Local List Version Response</em>'.
	 * @generated
	 */
	GetLocalListVersionResponse createGetLocalListVersionResponse();

	/**
	 * Returns a new object of class '<em>Id Tag Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Tag Info</em>'.
	 * @generated
	 */
	IdTagInfo createIdTagInfo();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	KeyValue createKeyValue();

	/**
	 * Returns a new object of class '<em>Remote Start Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Start Transaction Request</em>'.
	 * @generated
	 */
	RemoteStartTransactionRequest createRemoteStartTransactionRequest();

	/**
	 * Returns a new object of class '<em>Remote Start Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Start Transaction Response</em>'.
	 * @generated
	 */
	RemoteStartTransactionResponse createRemoteStartTransactionResponse();

	/**
	 * Returns a new object of class '<em>Remote Stop Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Stop Transaction Request</em>'.
	 * @generated
	 */
	RemoteStopTransactionRequest createRemoteStopTransactionRequest();

	/**
	 * Returns a new object of class '<em>Remote Stop Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Stop Transaction Response</em>'.
	 * @generated
	 */
	RemoteStopTransactionResponse createRemoteStopTransactionResponse();

	/**
	 * Returns a new object of class '<em>Reserve Now Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserve Now Request</em>'.
	 * @generated
	 */
	ReserveNowRequest createReserveNowRequest();

	/**
	 * Returns a new object of class '<em>Reserve Now Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserve Now Response</em>'.
	 * @generated
	 */
	ReserveNowResponse createReserveNowResponse();

	/**
	 * Returns a new object of class '<em>Reset Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Request</em>'.
	 * @generated
	 */
	ResetRequest createResetRequest();

	/**
	 * Returns a new object of class '<em>Reset Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Response</em>'.
	 * @generated
	 */
	ResetResponse createResetResponse();

	/**
	 * Returns a new object of class '<em>Send Local List Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Local List Request</em>'.
	 * @generated
	 */
	SendLocalListRequest createSendLocalListRequest();

	/**
	 * Returns a new object of class '<em>Send Local List Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Local List Response</em>'.
	 * @generated
	 */
	SendLocalListResponse createSendLocalListResponse();

	/**
	 * Returns a new object of class '<em>Set Charging Profile Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Charging Profile Request</em>'.
	 * @generated
	 */
	SetChargingProfileRequest createSetChargingProfileRequest();

	/**
	 * Returns a new object of class '<em>Set Charging Profile Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Charging Profile Response</em>'.
	 * @generated
	 */
	SetChargingProfileResponse createSetChargingProfileResponse();

	/**
	 * Returns a new object of class '<em>Trigger Message Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Message Request</em>'.
	 * @generated
	 */
	TriggerMessageRequest createTriggerMessageRequest();

	/**
	 * Returns a new object of class '<em>Trigger Message Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Message Response</em>'.
	 * @generated
	 */
	TriggerMessageResponse createTriggerMessageResponse();

	/**
	 * Returns a new object of class '<em>Unlock Connector Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlock Connector Request</em>'.
	 * @generated
	 */
	UnlockConnectorRequest createUnlockConnectorRequest();

	/**
	 * Returns a new object of class '<em>Unlock Connector Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlock Connector Response</em>'.
	 * @generated
	 */
	UnlockConnectorResponse createUnlockConnectorResponse();

	/**
	 * Returns a new object of class '<em>Update Firmware Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Firmware Request</em>'.
	 * @generated
	 */
	UpdateFirmwareRequest createUpdateFirmwareRequest();

	/**
	 * Returns a new object of class '<em>Update Firmware Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Firmware Response</em>'.
	 * @generated
	 */
	UpdateFirmwareResponse createUpdateFirmwareResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OcppChargePointPackage getOcppChargePointPackage();

} //OcppChargePointFactory
