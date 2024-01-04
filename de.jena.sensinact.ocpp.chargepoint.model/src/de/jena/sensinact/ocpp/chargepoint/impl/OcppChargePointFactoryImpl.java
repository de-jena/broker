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
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.*;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcppChargePointFactoryImpl extends EFactoryImpl implements OcppChargePointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OcppChargePointFactory init() {
		try {
			OcppChargePointFactory theOcppChargePointFactory = (OcppChargePointFactory)EPackage.Registry.INSTANCE.getEFactory(OcppChargePointPackage.eNS_URI);
			if (theOcppChargePointFactory != null) {
				return theOcppChargePointFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OcppChargePointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppChargePointFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OcppChargePointPackage.AUTHORIZATION_DATA: return createAuthorizationData();
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST: return createCancelReservationRequest();
			case OcppChargePointPackage.CANCEL_RESERVATION_RESPONSE: return createCancelReservationResponse();
			case OcppChargePointPackage.CHANGE_AVAILABILITY_REQUEST: return createChangeAvailabilityRequest();
			case OcppChargePointPackage.CHANGE_AVAILABILITY_RESPONSE: return createChangeAvailabilityResponse();
			case OcppChargePointPackage.CHANGE_CONFIGURATION_REQUEST: return createChangeConfigurationRequest();
			case OcppChargePointPackage.CHANGE_CONFIGURATION_RESPONSE: return createChangeConfigurationResponse();
			case OcppChargePointPackage.CHARGING_PROFILE: return createChargingProfile();
			case OcppChargePointPackage.CHARGING_SCHEDULE: return createChargingSchedule();
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD: return createChargingSchedulePeriod();
			case OcppChargePointPackage.CLEAR_CACHE_REQUEST: return createClearCacheRequest();
			case OcppChargePointPackage.CLEAR_CACHE_RESPONSE: return createClearCacheResponse();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST: return createClearChargingProfileRequest();
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_RESPONSE: return createClearChargingProfileResponse();
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST: return createDataTransferRequest();
			case OcppChargePointPackage.DATA_TRANSFER_RESPONSE: return createDataTransferResponse();
			case OcppChargePointPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST: return createGetCompositeScheduleRequest();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE: return createGetCompositeScheduleResponse();
			case OcppChargePointPackage.GET_CONFIGURATION_REQUEST: return createGetConfigurationRequest();
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE: return createGetConfigurationResponse();
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST: return createGetDiagnosticsRequest();
			case OcppChargePointPackage.GET_DIAGNOSTICS_RESPONSE: return createGetDiagnosticsResponse();
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_REQUEST: return createGetLocalListVersionRequest();
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE: return createGetLocalListVersionResponse();
			case OcppChargePointPackage.ID_TAG_INFO: return createIdTagInfo();
			case OcppChargePointPackage.KEY_VALUE: return createKeyValue();
			case OcppChargePointPackage.REMOTE_START_TRANSACTION_REQUEST: return createRemoteStartTransactionRequest();
			case OcppChargePointPackage.REMOTE_START_TRANSACTION_RESPONSE: return createRemoteStartTransactionResponse();
			case OcppChargePointPackage.REMOTE_STOP_TRANSACTION_REQUEST: return createRemoteStopTransactionRequest();
			case OcppChargePointPackage.REMOTE_STOP_TRANSACTION_RESPONSE: return createRemoteStopTransactionResponse();
			case OcppChargePointPackage.RESERVE_NOW_REQUEST: return createReserveNowRequest();
			case OcppChargePointPackage.RESERVE_NOW_RESPONSE: return createReserveNowResponse();
			case OcppChargePointPackage.RESET_REQUEST: return createResetRequest();
			case OcppChargePointPackage.RESET_RESPONSE: return createResetResponse();
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST: return createSendLocalListRequest();
			case OcppChargePointPackage.SEND_LOCAL_LIST_RESPONSE: return createSendLocalListResponse();
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST: return createSetChargingProfileRequest();
			case OcppChargePointPackage.SET_CHARGING_PROFILE_RESPONSE: return createSetChargingProfileResponse();
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST: return createTriggerMessageRequest();
			case OcppChargePointPackage.TRIGGER_MESSAGE_RESPONSE: return createTriggerMessageResponse();
			case OcppChargePointPackage.UNLOCK_CONNECTOR_REQUEST: return createUnlockConnectorRequest();
			case OcppChargePointPackage.UNLOCK_CONNECTOR_RESPONSE: return createUnlockConnectorResponse();
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST: return createUpdateFirmwareRequest();
			case OcppChargePointPackage.UPDATE_FIRMWARE_RESPONSE: return createUpdateFirmwareResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OcppChargePointPackage.AUTHORIZATION_STATUS:
				return createAuthorizationStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.AVAILABILITY_STATUS:
				return createAvailabilityStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.AVAILABILITY_TYPE:
				return createAvailabilityTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CANCEL_RESERVATION_STATUS:
				return createCancelReservationStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_PROFILE_KIND_TYPE:
				return createChargingProfileKindTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_PROFILE_PURPOSE_TYPE:
				return createChargingProfilePurposeTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_PROFILE_STATUS:
				return createChargingProfileStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_RATE_UNIT_TYPE:
				return createChargingRateUnitTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CLEAR_CACHE_STATUS:
				return createClearCacheStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_STATUS:
				return createClearChargingProfileStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.CONFIGURATION_STATUS:
				return createConfigurationStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.DATA_TRANSFER_STATUS:
				return createDataTransferStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_STATUS:
				return createGetCompositeScheduleStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.MESSAGE_TRIGGER:
				return createMessageTriggerFromString(eDataType, initialValue);
			case OcppChargePointPackage.RECURRENCY_KIND_TYPE:
				return createRecurrencyKindTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.REMOTE_START_STOP_STATUS:
				return createRemoteStartStopStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.RESERVATION_STATUS:
				return createReservationStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.RESET_STATUS:
				return createResetStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.RESET_TYPE:
				return createResetTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.TRIGGER_MESSAGE_STATUS:
				return createTriggerMessageStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.UNLOCK_STATUS:
				return createUnlockStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.UPDATE_STATUS:
				return createUpdateStatusFromString(eDataType, initialValue);
			case OcppChargePointPackage.UPDATE_TYPE:
				return createUpdateTypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.AUTHORIZATION_STATUS_OBJECT:
				return createAuthorizationStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.AVAILABILITY_STATUS_OBJECT:
				return createAvailabilityStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.AVAILABILITY_TYPE_OBJECT:
				return createAvailabilityTypeObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CANCEL_RESERVATION_STATUS_OBJECT:
				return createCancelReservationStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_PROFILE_KIND_TYPE_OBJECT:
				return createChargingProfileKindTypeObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_PROFILE_PURPOSE_TYPE_OBJECT:
				return createChargingProfilePurposeTypeObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_PROFILE_STATUS_OBJECT:
				return createChargingProfileStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CHARGING_RATE_UNIT_TYPE_OBJECT:
				return createChargingRateUnitTypeObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CI_STRING20_TYPE:
				return createCiString20TypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CI_STRING255_TYPE:
				return createCiString255TypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CI_STRING25_TYPE:
				return createCiString25TypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CI_STRING500_TYPE:
				return createCiString500TypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CI_STRING50_TYPE:
				return createCiString50TypeFromString(eDataType, initialValue);
			case OcppChargePointPackage.CLEAR_CACHE_STATUS_OBJECT:
				return createClearCacheStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_STATUS_OBJECT:
				return createClearChargingProfileStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.CONFIGURATION_STATUS_OBJECT:
				return createConfigurationStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.DATA_TRANSFER_STATUS_OBJECT:
				return createDataTransferStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.DECIMAL_ONE:
				return createDecimalOneFromString(eDataType, initialValue);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_STATUS_OBJECT:
				return createGetCompositeScheduleStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.ID_TOKEN:
				return createIdTokenFromString(eDataType, initialValue);
			case OcppChargePointPackage.MESSAGE_TRIGGER_OBJECT:
				return createMessageTriggerObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.RECURRENCY_KIND_TYPE_OBJECT:
				return createRecurrencyKindTypeObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.REMOTE_START_STOP_STATUS_OBJECT:
				return createRemoteStartStopStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.RESERVATION_STATUS_OBJECT:
				return createReservationStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.RESET_STATUS_OBJECT:
				return createResetStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.RESET_TYPE_OBJECT:
				return createResetTypeObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.TRIGGER_MESSAGE_STATUS_OBJECT:
				return createTriggerMessageStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.UNLOCK_STATUS_OBJECT:
				return createUnlockStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.UPDATE_STATUS_OBJECT:
				return createUpdateStatusObjectFromString(eDataType, initialValue);
			case OcppChargePointPackage.UPDATE_TYPE_OBJECT:
				return createUpdateTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OcppChargePointPackage.AUTHORIZATION_STATUS:
				return convertAuthorizationStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.AVAILABILITY_STATUS:
				return convertAvailabilityStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.AVAILABILITY_TYPE:
				return convertAvailabilityTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CANCEL_RESERVATION_STATUS:
				return convertCancelReservationStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_PROFILE_KIND_TYPE:
				return convertChargingProfileKindTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_PROFILE_PURPOSE_TYPE:
				return convertChargingProfilePurposeTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_PROFILE_STATUS:
				return convertChargingProfileStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_RATE_UNIT_TYPE:
				return convertChargingRateUnitTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CLEAR_CACHE_STATUS:
				return convertClearCacheStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_STATUS:
				return convertClearChargingProfileStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.CONFIGURATION_STATUS:
				return convertConfigurationStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.DATA_TRANSFER_STATUS:
				return convertDataTransferStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_STATUS:
				return convertGetCompositeScheduleStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.MESSAGE_TRIGGER:
				return convertMessageTriggerToString(eDataType, instanceValue);
			case OcppChargePointPackage.RECURRENCY_KIND_TYPE:
				return convertRecurrencyKindTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.REMOTE_START_STOP_STATUS:
				return convertRemoteStartStopStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.RESERVATION_STATUS:
				return convertReservationStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.RESET_STATUS:
				return convertResetStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.RESET_TYPE:
				return convertResetTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.TRIGGER_MESSAGE_STATUS:
				return convertTriggerMessageStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.UNLOCK_STATUS:
				return convertUnlockStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.UPDATE_STATUS:
				return convertUpdateStatusToString(eDataType, instanceValue);
			case OcppChargePointPackage.UPDATE_TYPE:
				return convertUpdateTypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.AUTHORIZATION_STATUS_OBJECT:
				return convertAuthorizationStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.AVAILABILITY_STATUS_OBJECT:
				return convertAvailabilityStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.AVAILABILITY_TYPE_OBJECT:
				return convertAvailabilityTypeObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CANCEL_RESERVATION_STATUS_OBJECT:
				return convertCancelReservationStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_PROFILE_KIND_TYPE_OBJECT:
				return convertChargingProfileKindTypeObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_PROFILE_PURPOSE_TYPE_OBJECT:
				return convertChargingProfilePurposeTypeObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_PROFILE_STATUS_OBJECT:
				return convertChargingProfileStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CHARGING_RATE_UNIT_TYPE_OBJECT:
				return convertChargingRateUnitTypeObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CI_STRING20_TYPE:
				return convertCiString20TypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CI_STRING255_TYPE:
				return convertCiString255TypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CI_STRING25_TYPE:
				return convertCiString25TypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CI_STRING500_TYPE:
				return convertCiString500TypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CI_STRING50_TYPE:
				return convertCiString50TypeToString(eDataType, instanceValue);
			case OcppChargePointPackage.CLEAR_CACHE_STATUS_OBJECT:
				return convertClearCacheStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_STATUS_OBJECT:
				return convertClearChargingProfileStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.CONFIGURATION_STATUS_OBJECT:
				return convertConfigurationStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.DATA_TRANSFER_STATUS_OBJECT:
				return convertDataTransferStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.DECIMAL_ONE:
				return convertDecimalOneToString(eDataType, instanceValue);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_STATUS_OBJECT:
				return convertGetCompositeScheduleStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.ID_TOKEN:
				return convertIdTokenToString(eDataType, instanceValue);
			case OcppChargePointPackage.MESSAGE_TRIGGER_OBJECT:
				return convertMessageTriggerObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.RECURRENCY_KIND_TYPE_OBJECT:
				return convertRecurrencyKindTypeObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.REMOTE_START_STOP_STATUS_OBJECT:
				return convertRemoteStartStopStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.RESERVATION_STATUS_OBJECT:
				return convertReservationStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.RESET_STATUS_OBJECT:
				return convertResetStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.RESET_TYPE_OBJECT:
				return convertResetTypeObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.TRIGGER_MESSAGE_STATUS_OBJECT:
				return convertTriggerMessageStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.UNLOCK_STATUS_OBJECT:
				return convertUnlockStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.UPDATE_STATUS_OBJECT:
				return convertUpdateStatusObjectToString(eDataType, instanceValue);
			case OcppChargePointPackage.UPDATE_TYPE_OBJECT:
				return convertUpdateTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationData createAuthorizationData() {
		AuthorizationDataImpl authorizationData = new AuthorizationDataImpl();
		return authorizationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelReservationRequest createCancelReservationRequest() {
		CancelReservationRequestImpl cancelReservationRequest = new CancelReservationRequestImpl();
		return cancelReservationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelReservationResponse createCancelReservationResponse() {
		CancelReservationResponseImpl cancelReservationResponse = new CancelReservationResponseImpl();
		return cancelReservationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeAvailabilityRequest createChangeAvailabilityRequest() {
		ChangeAvailabilityRequestImpl changeAvailabilityRequest = new ChangeAvailabilityRequestImpl();
		return changeAvailabilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeAvailabilityResponse createChangeAvailabilityResponse() {
		ChangeAvailabilityResponseImpl changeAvailabilityResponse = new ChangeAvailabilityResponseImpl();
		return changeAvailabilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeConfigurationRequest createChangeConfigurationRequest() {
		ChangeConfigurationRequestImpl changeConfigurationRequest = new ChangeConfigurationRequestImpl();
		return changeConfigurationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeConfigurationResponse createChangeConfigurationResponse() {
		ChangeConfigurationResponseImpl changeConfigurationResponse = new ChangeConfigurationResponseImpl();
		return changeConfigurationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingProfile createChargingProfile() {
		ChargingProfileImpl chargingProfile = new ChargingProfileImpl();
		return chargingProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingSchedule createChargingSchedule() {
		ChargingScheduleImpl chargingSchedule = new ChargingScheduleImpl();
		return chargingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingSchedulePeriod createChargingSchedulePeriod() {
		ChargingSchedulePeriodImpl chargingSchedulePeriod = new ChargingSchedulePeriodImpl();
		return chargingSchedulePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearCacheRequest createClearCacheRequest() {
		ClearCacheRequestImpl clearCacheRequest = new ClearCacheRequestImpl();
		return clearCacheRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearCacheResponse createClearCacheResponse() {
		ClearCacheResponseImpl clearCacheResponse = new ClearCacheResponseImpl();
		return clearCacheResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearChargingProfileRequest createClearChargingProfileRequest() {
		ClearChargingProfileRequestImpl clearChargingProfileRequest = new ClearChargingProfileRequestImpl();
		return clearChargingProfileRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearChargingProfileResponse createClearChargingProfileResponse() {
		ClearChargingProfileResponseImpl clearChargingProfileResponse = new ClearChargingProfileResponseImpl();
		return clearChargingProfileResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransferRequest createDataTransferRequest() {
		DataTransferRequestImpl dataTransferRequest = new DataTransferRequestImpl();
		return dataTransferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTransferResponse createDataTransferResponse() {
		DataTransferResponseImpl dataTransferResponse = new DataTransferResponseImpl();
		return dataTransferResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCompositeScheduleRequest createGetCompositeScheduleRequest() {
		GetCompositeScheduleRequestImpl getCompositeScheduleRequest = new GetCompositeScheduleRequestImpl();
		return getCompositeScheduleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCompositeScheduleResponse createGetCompositeScheduleResponse() {
		GetCompositeScheduleResponseImpl getCompositeScheduleResponse = new GetCompositeScheduleResponseImpl();
		return getCompositeScheduleResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConfigurationRequest createGetConfigurationRequest() {
		GetConfigurationRequestImpl getConfigurationRequest = new GetConfigurationRequestImpl();
		return getConfigurationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetConfigurationResponse createGetConfigurationResponse() {
		GetConfigurationResponseImpl getConfigurationResponse = new GetConfigurationResponseImpl();
		return getConfigurationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDiagnosticsRequest createGetDiagnosticsRequest() {
		GetDiagnosticsRequestImpl getDiagnosticsRequest = new GetDiagnosticsRequestImpl();
		return getDiagnosticsRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetDiagnosticsResponse createGetDiagnosticsResponse() {
		GetDiagnosticsResponseImpl getDiagnosticsResponse = new GetDiagnosticsResponseImpl();
		return getDiagnosticsResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetLocalListVersionRequest createGetLocalListVersionRequest() {
		GetLocalListVersionRequestImpl getLocalListVersionRequest = new GetLocalListVersionRequestImpl();
		return getLocalListVersionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetLocalListVersionResponse createGetLocalListVersionResponse() {
		GetLocalListVersionResponseImpl getLocalListVersionResponse = new GetLocalListVersionResponseImpl();
		return getLocalListVersionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdTagInfo createIdTagInfo() {
		IdTagInfoImpl idTagInfo = new IdTagInfoImpl();
		return idTagInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStartTransactionRequest createRemoteStartTransactionRequest() {
		RemoteStartTransactionRequestImpl remoteStartTransactionRequest = new RemoteStartTransactionRequestImpl();
		return remoteStartTransactionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStartTransactionResponse createRemoteStartTransactionResponse() {
		RemoteStartTransactionResponseImpl remoteStartTransactionResponse = new RemoteStartTransactionResponseImpl();
		return remoteStartTransactionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStopTransactionRequest createRemoteStopTransactionRequest() {
		RemoteStopTransactionRequestImpl remoteStopTransactionRequest = new RemoteStopTransactionRequestImpl();
		return remoteStopTransactionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteStopTransactionResponse createRemoteStopTransactionResponse() {
		RemoteStopTransactionResponseImpl remoteStopTransactionResponse = new RemoteStopTransactionResponseImpl();
		return remoteStopTransactionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReserveNowRequest createReserveNowRequest() {
		ReserveNowRequestImpl reserveNowRequest = new ReserveNowRequestImpl();
		return reserveNowRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReserveNowResponse createReserveNowResponse() {
		ReserveNowResponseImpl reserveNowResponse = new ReserveNowResponseImpl();
		return reserveNowResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetRequest createResetRequest() {
		ResetRequestImpl resetRequest = new ResetRequestImpl();
		return resetRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResetResponse createResetResponse() {
		ResetResponseImpl resetResponse = new ResetResponseImpl();
		return resetResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendLocalListRequest createSendLocalListRequest() {
		SendLocalListRequestImpl sendLocalListRequest = new SendLocalListRequestImpl();
		return sendLocalListRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendLocalListResponse createSendLocalListResponse() {
		SendLocalListResponseImpl sendLocalListResponse = new SendLocalListResponseImpl();
		return sendLocalListResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetChargingProfileRequest createSetChargingProfileRequest() {
		SetChargingProfileRequestImpl setChargingProfileRequest = new SetChargingProfileRequestImpl();
		return setChargingProfileRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetChargingProfileResponse createSetChargingProfileResponse() {
		SetChargingProfileResponseImpl setChargingProfileResponse = new SetChargingProfileResponseImpl();
		return setChargingProfileResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerMessageRequest createTriggerMessageRequest() {
		TriggerMessageRequestImpl triggerMessageRequest = new TriggerMessageRequestImpl();
		return triggerMessageRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerMessageResponse createTriggerMessageResponse() {
		TriggerMessageResponseImpl triggerMessageResponse = new TriggerMessageResponseImpl();
		return triggerMessageResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlockConnectorRequest createUnlockConnectorRequest() {
		UnlockConnectorRequestImpl unlockConnectorRequest = new UnlockConnectorRequestImpl();
		return unlockConnectorRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlockConnectorResponse createUnlockConnectorResponse() {
		UnlockConnectorResponseImpl unlockConnectorResponse = new UnlockConnectorResponseImpl();
		return unlockConnectorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateFirmwareRequest createUpdateFirmwareRequest() {
		UpdateFirmwareRequestImpl updateFirmwareRequest = new UpdateFirmwareRequestImpl();
		return updateFirmwareRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateFirmwareResponse createUpdateFirmwareResponse() {
		UpdateFirmwareResponseImpl updateFirmwareResponse = new UpdateFirmwareResponseImpl();
		return updateFirmwareResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationStatus createAuthorizationStatusFromString(EDataType eDataType, String initialValue) {
		AuthorizationStatus result = AuthorizationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorizationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityStatus createAvailabilityStatusFromString(EDataType eDataType, String initialValue) {
		AvailabilityStatus result = AvailabilityStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityType createAvailabilityTypeFromString(EDataType eDataType, String initialValue) {
		AvailabilityType result = AvailabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelReservationStatus createCancelReservationStatusFromString(EDataType eDataType, String initialValue) {
		CancelReservationStatus result = CancelReservationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCancelReservationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingProfileKindType createChargingProfileKindTypeFromString(EDataType eDataType, String initialValue) {
		ChargingProfileKindType result = ChargingProfileKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingProfileKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingProfilePurposeType createChargingProfilePurposeTypeFromString(EDataType eDataType, String initialValue) {
		ChargingProfilePurposeType result = ChargingProfilePurposeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingProfilePurposeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingProfileStatus createChargingProfileStatusFromString(EDataType eDataType, String initialValue) {
		ChargingProfileStatus result = ChargingProfileStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingProfileStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingRateUnitType createChargingRateUnitTypeFromString(EDataType eDataType, String initialValue) {
		ChargingRateUnitType result = ChargingRateUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingRateUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearCacheStatus createClearCacheStatusFromString(EDataType eDataType, String initialValue) {
		ClearCacheStatus result = ClearCacheStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClearCacheStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearChargingProfileStatus createClearChargingProfileStatusFromString(EDataType eDataType, String initialValue) {
		ClearChargingProfileStatus result = ClearChargingProfileStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClearChargingProfileStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationStatus createConfigurationStatusFromString(EDataType eDataType, String initialValue) {
		ConfigurationStatus result = ConfigurationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransferStatus createDataTransferStatusFromString(EDataType eDataType, String initialValue) {
		DataTransferStatus result = DataTransferStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTransferStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCompositeScheduleStatus createGetCompositeScheduleStatusFromString(EDataType eDataType, String initialValue) {
		GetCompositeScheduleStatus result = GetCompositeScheduleStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGetCompositeScheduleStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTrigger createMessageTriggerFromString(EDataType eDataType, String initialValue) {
		MessageTrigger result = MessageTrigger.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTriggerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrencyKindType createRecurrencyKindTypeFromString(EDataType eDataType, String initialValue) {
		RecurrencyKindType result = RecurrencyKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecurrencyKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteStartStopStatus createRemoteStartStopStatusFromString(EDataType eDataType, String initialValue) {
		RemoteStartStopStatus result = RemoteStartStopStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteStartStopStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationStatus createReservationStatusFromString(EDataType eDataType, String initialValue) {
		ReservationStatus result = ReservationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetStatus createResetStatusFromString(EDataType eDataType, String initialValue) {
		ResetStatus result = ResetStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResetStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType createResetTypeFromString(EDataType eDataType, String initialValue) {
		ResetType result = ResetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerMessageStatus createTriggerMessageStatusFromString(EDataType eDataType, String initialValue) {
		TriggerMessageStatus result = TriggerMessageStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerMessageStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlockStatus createUnlockStatusFromString(EDataType eDataType, String initialValue) {
		UnlockStatus result = UnlockStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlockStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatus createUpdateStatusFromString(EDataType eDataType, String initialValue) {
		UpdateStatus result = UpdateStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateTypeFromString(EDataType eDataType, String initialValue) {
		UpdateType result = UpdateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationStatus createAuthorizationStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createAuthorizationStatusFromString(OcppChargePointPackage.Literals.AUTHORIZATION_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorizationStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuthorizationStatusToString(OcppChargePointPackage.Literals.AUTHORIZATION_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityStatus createAvailabilityStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createAvailabilityStatusFromString(OcppChargePointPackage.Literals.AVAILABILITY_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAvailabilityStatusToString(OcppChargePointPackage.Literals.AVAILABILITY_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityType createAvailabilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAvailabilityTypeFromString(OcppChargePointPackage.Literals.AVAILABILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAvailabilityTypeToString(OcppChargePointPackage.Literals.AVAILABILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelReservationStatus createCancelReservationStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createCancelReservationStatusFromString(OcppChargePointPackage.Literals.CANCEL_RESERVATION_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCancelReservationStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCancelReservationStatusToString(OcppChargePointPackage.Literals.CANCEL_RESERVATION_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingProfileKindType createChargingProfileKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChargingProfileKindTypeFromString(OcppChargePointPackage.Literals.CHARGING_PROFILE_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingProfileKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargingProfileKindTypeToString(OcppChargePointPackage.Literals.CHARGING_PROFILE_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingProfilePurposeType createChargingProfilePurposeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChargingProfilePurposeTypeFromString(OcppChargePointPackage.Literals.CHARGING_PROFILE_PURPOSE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingProfilePurposeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargingProfilePurposeTypeToString(OcppChargePointPackage.Literals.CHARGING_PROFILE_PURPOSE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingProfileStatus createChargingProfileStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createChargingProfileStatusFromString(OcppChargePointPackage.Literals.CHARGING_PROFILE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingProfileStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargingProfileStatusToString(OcppChargePointPackage.Literals.CHARGING_PROFILE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingRateUnitType createChargingRateUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChargingRateUnitTypeFromString(OcppChargePointPackage.Literals.CHARGING_RATE_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargingRateUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargingRateUnitTypeToString(OcppChargePointPackage.Literals.CHARGING_RATE_UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCiString20TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCiString20TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCiString255TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCiString255TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCiString25TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCiString25TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCiString500TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCiString500TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCiString50TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCiString50TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearCacheStatus createClearCacheStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createClearCacheStatusFromString(OcppChargePointPackage.Literals.CLEAR_CACHE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClearCacheStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClearCacheStatusToString(OcppChargePointPackage.Literals.CLEAR_CACHE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearChargingProfileStatus createClearChargingProfileStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createClearChargingProfileStatusFromString(OcppChargePointPackage.Literals.CLEAR_CHARGING_PROFILE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClearChargingProfileStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClearChargingProfileStatusToString(OcppChargePointPackage.Literals.CLEAR_CHARGING_PROFILE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationStatus createConfigurationStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createConfigurationStatusFromString(OcppChargePointPackage.Literals.CONFIGURATION_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConfigurationStatusToString(OcppChargePointPackage.Literals.CONFIGURATION_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransferStatus createDataTransferStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTransferStatusFromString(OcppChargePointPackage.Literals.DATA_TRANSFER_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTransferStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTransferStatusToString(OcppChargePointPackage.Literals.DATA_TRANSFER_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalOneFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalOneToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCompositeScheduleStatus createGetCompositeScheduleStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createGetCompositeScheduleStatusFromString(OcppChargePointPackage.Literals.GET_COMPOSITE_SCHEDULE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGetCompositeScheduleStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGetCompositeScheduleStatusToString(OcppChargePointPackage.Literals.GET_COMPOSITE_SCHEDULE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdTokenFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdTokenToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTrigger createMessageTriggerObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageTriggerFromString(OcppChargePointPackage.Literals.MESSAGE_TRIGGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTriggerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageTriggerToString(OcppChargePointPackage.Literals.MESSAGE_TRIGGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrencyKindType createRecurrencyKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRecurrencyKindTypeFromString(OcppChargePointPackage.Literals.RECURRENCY_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecurrencyKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRecurrencyKindTypeToString(OcppChargePointPackage.Literals.RECURRENCY_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteStartStopStatus createRemoteStartStopStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createRemoteStartStopStatusFromString(OcppChargePointPackage.Literals.REMOTE_START_STOP_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteStartStopStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRemoteStartStopStatusToString(OcppChargePointPackage.Literals.REMOTE_START_STOP_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationStatus createReservationStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createReservationStatusFromString(OcppChargePointPackage.Literals.RESERVATION_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReservationStatusToString(OcppChargePointPackage.Literals.RESERVATION_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetStatus createResetStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createResetStatusFromString(OcppChargePointPackage.Literals.RESET_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResetStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResetStatusToString(OcppChargePointPackage.Literals.RESET_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType createResetTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResetTypeFromString(OcppChargePointPackage.Literals.RESET_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResetTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResetTypeToString(OcppChargePointPackage.Literals.RESET_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerMessageStatus createTriggerMessageStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggerMessageStatusFromString(OcppChargePointPackage.Literals.TRIGGER_MESSAGE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerMessageStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggerMessageStatusToString(OcppChargePointPackage.Literals.TRIGGER_MESSAGE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlockStatus createUnlockStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createUnlockStatusFromString(OcppChargePointPackage.Literals.UNLOCK_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlockStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnlockStatusToString(OcppChargePointPackage.Literals.UNLOCK_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateStatus createUpdateStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateStatusFromString(OcppChargePointPackage.Literals.UPDATE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateStatusToString(OcppChargePointPackage.Literals.UPDATE_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateTypeFromString(OcppChargePointPackage.Literals.UPDATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateTypeToString(OcppChargePointPackage.Literals.UPDATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcppChargePointPackage getOcppChargePointPackage() {
		return (OcppChargePointPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OcppChargePointPackage getPackage() {
		return OcppChargePointPackage.eINSTANCE;
	}

} //OcppChargePointFactoryImpl
