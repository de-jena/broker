/**
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
package de.jena.sensinact.ocpp.chargepoint.util;

import de.jena.sensinact.ocpp.chargepoint.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage
 * @generated
 */
public class OcppChargePointValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OcppChargePointValidator INSTANCE = new OcppChargePointValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.jena.sensinact.ocpp.chargepoint";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppChargePointValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OcppChargePointPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OcppChargePointPackage.AUTHORIZATION_DATA:
				return validateAuthorizationData((AuthorizationData)value, diagnostics, context);
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST:
				return validateCancelReservationRequest((CancelReservationRequest)value, diagnostics, context);
			case OcppChargePointPackage.CANCEL_RESERVATION_RESPONSE:
				return validateCancelReservationResponse((CancelReservationResponse)value, diagnostics, context);
			case OcppChargePointPackage.CHANGE_AVAILABILITY_REQUEST:
				return validateChangeAvailabilityRequest((ChangeAvailabilityRequest)value, diagnostics, context);
			case OcppChargePointPackage.CHANGE_AVAILABILITY_RESPONSE:
				return validateChangeAvailabilityResponse((ChangeAvailabilityResponse)value, diagnostics, context);
			case OcppChargePointPackage.CHANGE_CONFIGURATION_REQUEST:
				return validateChangeConfigurationRequest((ChangeConfigurationRequest)value, diagnostics, context);
			case OcppChargePointPackage.CHANGE_CONFIGURATION_RESPONSE:
				return validateChangeConfigurationResponse((ChangeConfigurationResponse)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE:
				return validateChargingProfile((ChargingProfile)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_SCHEDULE:
				return validateChargingSchedule((ChargingSchedule)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD:
				return validateChargingSchedulePeriod((ChargingSchedulePeriod)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CACHE_REQUEST:
				return validateClearCacheRequest((ClearCacheRequest)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CACHE_RESPONSE:
				return validateClearCacheResponse((ClearCacheResponse)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST:
				return validateClearChargingProfileRequest((ClearChargingProfileRequest)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_RESPONSE:
				return validateClearChargingProfileResponse((ClearChargingProfileResponse)value, diagnostics, context);
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST:
				return validateDataTransferRequest((DataTransferRequest)value, diagnostics, context);
			case OcppChargePointPackage.DATA_TRANSFER_RESPONSE:
				return validateDataTransferResponse((DataTransferResponse)value, diagnostics, context);
			case OcppChargePointPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST:
				return validateGetCompositeScheduleRequest((GetCompositeScheduleRequest)value, diagnostics, context);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE:
				return validateGetCompositeScheduleResponse((GetCompositeScheduleResponse)value, diagnostics, context);
			case OcppChargePointPackage.GET_CONFIGURATION_REQUEST:
				return validateGetConfigurationRequest((GetConfigurationRequest)value, diagnostics, context);
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE:
				return validateGetConfigurationResponse((GetConfigurationResponse)value, diagnostics, context);
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST:
				return validateGetDiagnosticsRequest((GetDiagnosticsRequest)value, diagnostics, context);
			case OcppChargePointPackage.GET_DIAGNOSTICS_RESPONSE:
				return validateGetDiagnosticsResponse((GetDiagnosticsResponse)value, diagnostics, context);
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_REQUEST:
				return validateGetLocalListVersionRequest((GetLocalListVersionRequest)value, diagnostics, context);
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE:
				return validateGetLocalListVersionResponse((GetLocalListVersionResponse)value, diagnostics, context);
			case OcppChargePointPackage.ID_TAG_INFO:
				return validateIdTagInfo((IdTagInfo)value, diagnostics, context);
			case OcppChargePointPackage.KEY_VALUE:
				return validateKeyValue((KeyValue)value, diagnostics, context);
			case OcppChargePointPackage.REMOTE_START_TRANSACTION_REQUEST:
				return validateRemoteStartTransactionRequest((RemoteStartTransactionRequest)value, diagnostics, context);
			case OcppChargePointPackage.REMOTE_START_TRANSACTION_RESPONSE:
				return validateRemoteStartTransactionResponse((RemoteStartTransactionResponse)value, diagnostics, context);
			case OcppChargePointPackage.REMOTE_STOP_TRANSACTION_REQUEST:
				return validateRemoteStopTransactionRequest((RemoteStopTransactionRequest)value, diagnostics, context);
			case OcppChargePointPackage.REMOTE_STOP_TRANSACTION_RESPONSE:
				return validateRemoteStopTransactionResponse((RemoteStopTransactionResponse)value, diagnostics, context);
			case OcppChargePointPackage.RESERVE_NOW_REQUEST:
				return validateReserveNowRequest((ReserveNowRequest)value, diagnostics, context);
			case OcppChargePointPackage.RESERVE_NOW_RESPONSE:
				return validateReserveNowResponse((ReserveNowResponse)value, diagnostics, context);
			case OcppChargePointPackage.RESET_REQUEST:
				return validateResetRequest((ResetRequest)value, diagnostics, context);
			case OcppChargePointPackage.RESET_RESPONSE:
				return validateResetResponse((ResetResponse)value, diagnostics, context);
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST:
				return validateSendLocalListRequest((SendLocalListRequest)value, diagnostics, context);
			case OcppChargePointPackage.SEND_LOCAL_LIST_RESPONSE:
				return validateSendLocalListResponse((SendLocalListResponse)value, diagnostics, context);
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST:
				return validateSetChargingProfileRequest((SetChargingProfileRequest)value, diagnostics, context);
			case OcppChargePointPackage.SET_CHARGING_PROFILE_RESPONSE:
				return validateSetChargingProfileResponse((SetChargingProfileResponse)value, diagnostics, context);
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST:
				return validateTriggerMessageRequest((TriggerMessageRequest)value, diagnostics, context);
			case OcppChargePointPackage.TRIGGER_MESSAGE_RESPONSE:
				return validateTriggerMessageResponse((TriggerMessageResponse)value, diagnostics, context);
			case OcppChargePointPackage.UNLOCK_CONNECTOR_REQUEST:
				return validateUnlockConnectorRequest((UnlockConnectorRequest)value, diagnostics, context);
			case OcppChargePointPackage.UNLOCK_CONNECTOR_RESPONSE:
				return validateUnlockConnectorResponse((UnlockConnectorResponse)value, diagnostics, context);
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST:
				return validateUpdateFirmwareRequest((UpdateFirmwareRequest)value, diagnostics, context);
			case OcppChargePointPackage.UPDATE_FIRMWARE_RESPONSE:
				return validateUpdateFirmwareResponse((UpdateFirmwareResponse)value, diagnostics, context);
			case OcppChargePointPackage.AUTHORIZATION_STATUS:
				return validateAuthorizationStatus((AuthorizationStatus)value, diagnostics, context);
			case OcppChargePointPackage.AVAILABILITY_STATUS:
				return validateAvailabilityStatus((AvailabilityStatus)value, diagnostics, context);
			case OcppChargePointPackage.AVAILABILITY_TYPE:
				return validateAvailabilityType((AvailabilityType)value, diagnostics, context);
			case OcppChargePointPackage.CANCEL_RESERVATION_STATUS:
				return validateCancelReservationStatus((CancelReservationStatus)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE_KIND_TYPE:
				return validateChargingProfileKindType((ChargingProfileKindType)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE_PURPOSE_TYPE:
				return validateChargingProfilePurposeType((ChargingProfilePurposeType)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE_STATUS:
				return validateChargingProfileStatus((ChargingProfileStatus)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_RATE_UNIT_TYPE:
				return validateChargingRateUnitType((ChargingRateUnitType)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CACHE_STATUS:
				return validateClearCacheStatus((ClearCacheStatus)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_STATUS:
				return validateClearChargingProfileStatus((ClearChargingProfileStatus)value, diagnostics, context);
			case OcppChargePointPackage.CONFIGURATION_STATUS:
				return validateConfigurationStatus((ConfigurationStatus)value, diagnostics, context);
			case OcppChargePointPackage.DATA_TRANSFER_STATUS:
				return validateDataTransferStatus((DataTransferStatus)value, diagnostics, context);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_STATUS:
				return validateGetCompositeScheduleStatus((GetCompositeScheduleStatus)value, diagnostics, context);
			case OcppChargePointPackage.MESSAGE_TRIGGER:
				return validateMessageTrigger((MessageTrigger)value, diagnostics, context);
			case OcppChargePointPackage.RECURRENCY_KIND_TYPE:
				return validateRecurrencyKindType((RecurrencyKindType)value, diagnostics, context);
			case OcppChargePointPackage.REMOTE_START_STOP_STATUS:
				return validateRemoteStartStopStatus((RemoteStartStopStatus)value, diagnostics, context);
			case OcppChargePointPackage.RESERVATION_STATUS:
				return validateReservationStatus((ReservationStatus)value, diagnostics, context);
			case OcppChargePointPackage.RESET_STATUS:
				return validateResetStatus((ResetStatus)value, diagnostics, context);
			case OcppChargePointPackage.RESET_TYPE:
				return validateResetType((ResetType)value, diagnostics, context);
			case OcppChargePointPackage.TRIGGER_MESSAGE_STATUS:
				return validateTriggerMessageStatus((TriggerMessageStatus)value, diagnostics, context);
			case OcppChargePointPackage.UNLOCK_STATUS:
				return validateUnlockStatus((UnlockStatus)value, diagnostics, context);
			case OcppChargePointPackage.UPDATE_STATUS:
				return validateUpdateStatus((UpdateStatus)value, diagnostics, context);
			case OcppChargePointPackage.UPDATE_TYPE:
				return validateUpdateType((UpdateType)value, diagnostics, context);
			case OcppChargePointPackage.AUTHORIZATION_STATUS_OBJECT:
				return validateAuthorizationStatusObject((AuthorizationStatus)value, diagnostics, context);
			case OcppChargePointPackage.AVAILABILITY_STATUS_OBJECT:
				return validateAvailabilityStatusObject((AvailabilityStatus)value, diagnostics, context);
			case OcppChargePointPackage.AVAILABILITY_TYPE_OBJECT:
				return validateAvailabilityTypeObject((AvailabilityType)value, diagnostics, context);
			case OcppChargePointPackage.CANCEL_RESERVATION_STATUS_OBJECT:
				return validateCancelReservationStatusObject((CancelReservationStatus)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE_KIND_TYPE_OBJECT:
				return validateChargingProfileKindTypeObject((ChargingProfileKindType)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE_PURPOSE_TYPE_OBJECT:
				return validateChargingProfilePurposeTypeObject((ChargingProfilePurposeType)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_PROFILE_STATUS_OBJECT:
				return validateChargingProfileStatusObject((ChargingProfileStatus)value, diagnostics, context);
			case OcppChargePointPackage.CHARGING_RATE_UNIT_TYPE_OBJECT:
				return validateChargingRateUnitTypeObject((ChargingRateUnitType)value, diagnostics, context);
			case OcppChargePointPackage.CI_STRING20_TYPE:
				return validateCiString20Type((String)value, diagnostics, context);
			case OcppChargePointPackage.CI_STRING255_TYPE:
				return validateCiString255Type((String)value, diagnostics, context);
			case OcppChargePointPackage.CI_STRING25_TYPE:
				return validateCiString25Type((String)value, diagnostics, context);
			case OcppChargePointPackage.CI_STRING500_TYPE:
				return validateCiString500Type((String)value, diagnostics, context);
			case OcppChargePointPackage.CI_STRING50_TYPE:
				return validateCiString50Type((String)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CACHE_STATUS_OBJECT:
				return validateClearCacheStatusObject((ClearCacheStatus)value, diagnostics, context);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_STATUS_OBJECT:
				return validateClearChargingProfileStatusObject((ClearChargingProfileStatus)value, diagnostics, context);
			case OcppChargePointPackage.CONFIGURATION_STATUS_OBJECT:
				return validateConfigurationStatusObject((ConfigurationStatus)value, diagnostics, context);
			case OcppChargePointPackage.DATA_TRANSFER_STATUS_OBJECT:
				return validateDataTransferStatusObject((DataTransferStatus)value, diagnostics, context);
			case OcppChargePointPackage.DECIMAL_ONE:
				return validateDecimalOne((BigDecimal)value, diagnostics, context);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_STATUS_OBJECT:
				return validateGetCompositeScheduleStatusObject((GetCompositeScheduleStatus)value, diagnostics, context);
			case OcppChargePointPackage.ID_TOKEN:
				return validateIdToken((String)value, diagnostics, context);
			case OcppChargePointPackage.MESSAGE_TRIGGER_OBJECT:
				return validateMessageTriggerObject((MessageTrigger)value, diagnostics, context);
			case OcppChargePointPackage.RECURRENCY_KIND_TYPE_OBJECT:
				return validateRecurrencyKindTypeObject((RecurrencyKindType)value, diagnostics, context);
			case OcppChargePointPackage.REMOTE_START_STOP_STATUS_OBJECT:
				return validateRemoteStartStopStatusObject((RemoteStartStopStatus)value, diagnostics, context);
			case OcppChargePointPackage.RESERVATION_STATUS_OBJECT:
				return validateReservationStatusObject((ReservationStatus)value, diagnostics, context);
			case OcppChargePointPackage.RESET_STATUS_OBJECT:
				return validateResetStatusObject((ResetStatus)value, diagnostics, context);
			case OcppChargePointPackage.RESET_TYPE_OBJECT:
				return validateResetTypeObject((ResetType)value, diagnostics, context);
			case OcppChargePointPackage.TRIGGER_MESSAGE_STATUS_OBJECT:
				return validateTriggerMessageStatusObject((TriggerMessageStatus)value, diagnostics, context);
			case OcppChargePointPackage.UNLOCK_STATUS_OBJECT:
				return validateUnlockStatusObject((UnlockStatus)value, diagnostics, context);
			case OcppChargePointPackage.UPDATE_STATUS_OBJECT:
				return validateUpdateStatusObject((UpdateStatus)value, diagnostics, context);
			case OcppChargePointPackage.UPDATE_TYPE_OBJECT:
				return validateUpdateTypeObject((UpdateType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationData(AuthorizationData authorizationData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorizationData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelReservationRequest(CancelReservationRequest cancelReservationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelReservationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelReservationResponse(CancelReservationResponse cancelReservationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelReservationResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeAvailabilityRequest(ChangeAvailabilityRequest changeAvailabilityRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeAvailabilityRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeAvailabilityResponse(ChangeAvailabilityResponse changeAvailabilityResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeAvailabilityResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeConfigurationRequest(ChangeConfigurationRequest changeConfigurationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeConfigurationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeConfigurationResponse(ChangeConfigurationResponse changeConfigurationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeConfigurationResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfile(ChargingProfile chargingProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargingProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingSchedule(ChargingSchedule chargingSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargingSchedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingSchedulePeriod(ChargingSchedulePeriod chargingSchedulePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargingSchedulePeriod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearCacheRequest(ClearCacheRequest clearCacheRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearCacheRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearCacheResponse(ClearCacheResponse clearCacheResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearCacheResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearChargingProfileRequest(ClearChargingProfileRequest clearChargingProfileRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearChargingProfileRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearChargingProfileResponse(ClearChargingProfileResponse clearChargingProfileResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearChargingProfileResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTransferRequest(DataTransferRequest dataTransferRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTransferRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTransferResponse(DataTransferResponse dataTransferResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTransferResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetCompositeScheduleRequest(GetCompositeScheduleRequest getCompositeScheduleRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getCompositeScheduleRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetCompositeScheduleResponse(GetCompositeScheduleResponse getCompositeScheduleResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getCompositeScheduleResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetConfigurationRequest(GetConfigurationRequest getConfigurationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getConfigurationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetConfigurationResponse(GetConfigurationResponse getConfigurationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getConfigurationResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDiagnosticsRequest(GetDiagnosticsRequest getDiagnosticsRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getDiagnosticsRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDiagnosticsResponse(GetDiagnosticsResponse getDiagnosticsResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getDiagnosticsResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetLocalListVersionRequest(GetLocalListVersionRequest getLocalListVersionRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getLocalListVersionRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetLocalListVersionResponse(GetLocalListVersionResponse getLocalListVersionResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getLocalListVersionResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdTagInfo(IdTagInfo idTagInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idTagInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyValue(KeyValue keyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteStartTransactionRequest(RemoteStartTransactionRequest remoteStartTransactionRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteStartTransactionRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteStartTransactionResponse(RemoteStartTransactionResponse remoteStartTransactionResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteStartTransactionResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteStopTransactionRequest(RemoteStopTransactionRequest remoteStopTransactionRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteStopTransactionRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteStopTransactionResponse(RemoteStopTransactionResponse remoteStopTransactionResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remoteStopTransactionResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserveNowRequest(ReserveNowRequest reserveNowRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reserveNowRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserveNowResponse(ReserveNowResponse reserveNowResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reserveNowResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetRequest(ResetRequest resetRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resetRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetResponse(ResetResponse resetResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resetResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendLocalListRequest(SendLocalListRequest sendLocalListRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendLocalListRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendLocalListResponse(SendLocalListResponse sendLocalListResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendLocalListResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetChargingProfileRequest(SetChargingProfileRequest setChargingProfileRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setChargingProfileRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetChargingProfileResponse(SetChargingProfileResponse setChargingProfileResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setChargingProfileResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerMessageRequest(TriggerMessageRequest triggerMessageRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerMessageRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerMessageResponse(TriggerMessageResponse triggerMessageResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerMessageResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockConnectorRequest(UnlockConnectorRequest unlockConnectorRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlockConnectorRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockConnectorResponse(UnlockConnectorResponse unlockConnectorResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlockConnectorResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateFirmwareRequest(UpdateFirmwareRequest updateFirmwareRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateFirmwareRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateFirmwareResponse(UpdateFirmwareResponse updateFirmwareResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateFirmwareResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationStatus(AuthorizationStatus authorizationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityStatus(AvailabilityStatus availabilityStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityType(AvailabilityType availabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelReservationStatus(CancelReservationStatus cancelReservationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfileKindType(ChargingProfileKindType chargingProfileKindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfilePurposeType(ChargingProfilePurposeType chargingProfilePurposeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfileStatus(ChargingProfileStatus chargingProfileStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingRateUnitType(ChargingRateUnitType chargingRateUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearCacheStatus(ClearCacheStatus clearCacheStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearChargingProfileStatus(ClearChargingProfileStatus clearChargingProfileStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationStatus(ConfigurationStatus configurationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTransferStatus(DataTransferStatus dataTransferStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetCompositeScheduleStatus(GetCompositeScheduleStatus getCompositeScheduleStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTrigger(MessageTrigger messageTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurrencyKindType(RecurrencyKindType recurrencyKindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteStartStopStatus(RemoteStartStopStatus remoteStartStopStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationStatus(ReservationStatus reservationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetStatus(ResetStatus resetStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetType(ResetType resetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerMessageStatus(TriggerMessageStatus triggerMessageStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockStatus(UnlockStatus unlockStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateStatus(UpdateStatus updateStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateType(UpdateType updateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationStatusObject(AuthorizationStatus authorizationStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityStatusObject(AvailabilityStatus availabilityStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityTypeObject(AvailabilityType availabilityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelReservationStatusObject(CancelReservationStatus cancelReservationStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfileKindTypeObject(ChargingProfileKindType chargingProfileKindTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfilePurposeTypeObject(ChargingProfilePurposeType chargingProfilePurposeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingProfileStatusObject(ChargingProfileStatus chargingProfileStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargingRateUnitTypeObject(ChargingRateUnitType chargingRateUnitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString20Type(String ciString20Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCiString20Type_MaxLength(ciString20Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ci String20 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString20Type_MaxLength(String ciString20Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ciString20Type.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OcppChargePointPackage.Literals.CI_STRING20_TYPE, ciString20Type, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString255Type(String ciString255Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCiString255Type_MaxLength(ciString255Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ci String255 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString255Type_MaxLength(String ciString255Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ciString255Type.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OcppChargePointPackage.Literals.CI_STRING255_TYPE, ciString255Type, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString25Type(String ciString25Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCiString25Type_MaxLength(ciString25Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ci String25 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString25Type_MaxLength(String ciString25Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ciString25Type.length();
		boolean result = length <= 25;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OcppChargePointPackage.Literals.CI_STRING25_TYPE, ciString25Type, length, 25, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString500Type(String ciString500Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCiString500Type_MaxLength(ciString500Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ci String500 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString500Type_MaxLength(String ciString500Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ciString500Type.length();
		boolean result = length <= 500;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OcppChargePointPackage.Literals.CI_STRING500_TYPE, ciString500Type, length, 500, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString50Type(String ciString50Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCiString50Type_MaxLength(ciString50Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ci String50 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiString50Type_MaxLength(String ciString50Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ciString50Type.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OcppChargePointPackage.Literals.CI_STRING50_TYPE, ciString50Type, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearCacheStatusObject(ClearCacheStatus clearCacheStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearChargingProfileStatusObject(ClearChargingProfileStatus clearChargingProfileStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationStatusObject(ConfigurationStatus configurationStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTransferStatusObject(DataTransferStatus dataTransferStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalOne(BigDecimal decimalOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalOne_FractionDigits(decimalOne, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Decimal One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalOne_FractionDigits(BigDecimal decimalOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimalOne.scale() <= 1;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(OcppChargePointPackage.Literals.DECIMAL_ONE, decimalOne, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetCompositeScheduleStatusObject(GetCompositeScheduleStatus getCompositeScheduleStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdToken(String idToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdToken_MaxLength(idToken, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Id Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdToken_MaxLength(String idToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idToken.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OcppChargePointPackage.Literals.ID_TOKEN, idToken, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTriggerObject(MessageTrigger messageTriggerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecurrencyKindTypeObject(RecurrencyKindType recurrencyKindTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteStartStopStatusObject(RemoteStartStopStatus remoteStartStopStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationStatusObject(ReservationStatus reservationStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetStatusObject(ResetStatus resetStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetTypeObject(ResetType resetTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerMessageStatusObject(TriggerMessageStatus triggerMessageStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockStatusObject(UnlockStatus unlockStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateStatusObject(UpdateStatus updateStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateTypeObject(UpdateType updateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OcppChargePointValidator
