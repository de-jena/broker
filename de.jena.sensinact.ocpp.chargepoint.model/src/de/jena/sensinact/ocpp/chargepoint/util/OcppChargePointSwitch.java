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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.jena.sensinact.ocpp.chargepoint.AuthorizationData;
import de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest;
import de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse;
import de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest;
import de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse;
import de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest;
import de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfile;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedule;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod;
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
import de.jena.sensinact.ocpp.chargepoint.IdTagInfo;
import de.jena.sensinact.ocpp.chargepoint.KeyValue;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage
 * @generated
 */
public class OcppChargePointSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OcppChargePointPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppChargePointSwitch() {
		if (modelPackage == null) {
			modelPackage = OcppChargePointPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OcppChargePointPackage.AUTHORIZATION_DATA: {
				AuthorizationData authorizationData = (AuthorizationData)theEObject;
				T result = caseAuthorizationData(authorizationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST: {
				CancelReservationRequest cancelReservationRequest = (CancelReservationRequest)theEObject;
				T result = caseCancelReservationRequest(cancelReservationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CANCEL_RESERVATION_RESPONSE: {
				CancelReservationResponse cancelReservationResponse = (CancelReservationResponse)theEObject;
				T result = caseCancelReservationResponse(cancelReservationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHANGE_AVAILABILITY_REQUEST: {
				ChangeAvailabilityRequest changeAvailabilityRequest = (ChangeAvailabilityRequest)theEObject;
				T result = caseChangeAvailabilityRequest(changeAvailabilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHANGE_AVAILABILITY_RESPONSE: {
				ChangeAvailabilityResponse changeAvailabilityResponse = (ChangeAvailabilityResponse)theEObject;
				T result = caseChangeAvailabilityResponse(changeAvailabilityResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHANGE_CONFIGURATION_REQUEST: {
				ChangeConfigurationRequest changeConfigurationRequest = (ChangeConfigurationRequest)theEObject;
				T result = caseChangeConfigurationRequest(changeConfigurationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHANGE_CONFIGURATION_RESPONSE: {
				ChangeConfigurationResponse changeConfigurationResponse = (ChangeConfigurationResponse)theEObject;
				T result = caseChangeConfigurationResponse(changeConfigurationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHARGING_PROFILE: {
				ChargingProfile chargingProfile = (ChargingProfile)theEObject;
				T result = caseChargingProfile(chargingProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHARGING_SCHEDULE: {
				ChargingSchedule chargingSchedule = (ChargingSchedule)theEObject;
				T result = caseChargingSchedule(chargingSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CHARGING_SCHEDULE_PERIOD: {
				ChargingSchedulePeriod chargingSchedulePeriod = (ChargingSchedulePeriod)theEObject;
				T result = caseChargingSchedulePeriod(chargingSchedulePeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CLEAR_CACHE_REQUEST: {
				ClearCacheRequest clearCacheRequest = (ClearCacheRequest)theEObject;
				T result = caseClearCacheRequest(clearCacheRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CLEAR_CACHE_RESPONSE: {
				ClearCacheResponse clearCacheResponse = (ClearCacheResponse)theEObject;
				T result = caseClearCacheResponse(clearCacheResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_REQUEST: {
				ClearChargingProfileRequest clearChargingProfileRequest = (ClearChargingProfileRequest)theEObject;
				T result = caseClearChargingProfileRequest(clearChargingProfileRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.CLEAR_CHARGING_PROFILE_RESPONSE: {
				ClearChargingProfileResponse clearChargingProfileResponse = (ClearChargingProfileResponse)theEObject;
				T result = caseClearChargingProfileResponse(clearChargingProfileResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST: {
				DataTransferRequest dataTransferRequest = (DataTransferRequest)theEObject;
				T result = caseDataTransferRequest(dataTransferRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.DATA_TRANSFER_RESPONSE: {
				DataTransferResponse dataTransferResponse = (DataTransferResponse)theEObject;
				T result = caseDataTransferResponse(dataTransferResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_REQUEST: {
				GetCompositeScheduleRequest getCompositeScheduleRequest = (GetCompositeScheduleRequest)theEObject;
				T result = caseGetCompositeScheduleRequest(getCompositeScheduleRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE: {
				GetCompositeScheduleResponse getCompositeScheduleResponse = (GetCompositeScheduleResponse)theEObject;
				T result = caseGetCompositeScheduleResponse(getCompositeScheduleResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_CONFIGURATION_REQUEST: {
				GetConfigurationRequest getConfigurationRequest = (GetConfigurationRequest)theEObject;
				T result = caseGetConfigurationRequest(getConfigurationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE: {
				GetConfigurationResponse getConfigurationResponse = (GetConfigurationResponse)theEObject;
				T result = caseGetConfigurationResponse(getConfigurationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST: {
				GetDiagnosticsRequest getDiagnosticsRequest = (GetDiagnosticsRequest)theEObject;
				T result = caseGetDiagnosticsRequest(getDiagnosticsRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_DIAGNOSTICS_RESPONSE: {
				GetDiagnosticsResponse getDiagnosticsResponse = (GetDiagnosticsResponse)theEObject;
				T result = caseGetDiagnosticsResponse(getDiagnosticsResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_REQUEST: {
				GetLocalListVersionRequest getLocalListVersionRequest = (GetLocalListVersionRequest)theEObject;
				T result = caseGetLocalListVersionRequest(getLocalListVersionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE: {
				GetLocalListVersionResponse getLocalListVersionResponse = (GetLocalListVersionResponse)theEObject;
				T result = caseGetLocalListVersionResponse(getLocalListVersionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.ID_TAG_INFO: {
				IdTagInfo idTagInfo = (IdTagInfo)theEObject;
				T result = caseIdTagInfo(idTagInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.KEY_VALUE: {
				KeyValue keyValue = (KeyValue)theEObject;
				T result = caseKeyValue(keyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.REMOTE_START_TRANSACTION_REQUEST: {
				RemoteStartTransactionRequest remoteStartTransactionRequest = (RemoteStartTransactionRequest)theEObject;
				T result = caseRemoteStartTransactionRequest(remoteStartTransactionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.REMOTE_START_TRANSACTION_RESPONSE: {
				RemoteStartTransactionResponse remoteStartTransactionResponse = (RemoteStartTransactionResponse)theEObject;
				T result = caseRemoteStartTransactionResponse(remoteStartTransactionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.REMOTE_STOP_TRANSACTION_REQUEST: {
				RemoteStopTransactionRequest remoteStopTransactionRequest = (RemoteStopTransactionRequest)theEObject;
				T result = caseRemoteStopTransactionRequest(remoteStopTransactionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.REMOTE_STOP_TRANSACTION_RESPONSE: {
				RemoteStopTransactionResponse remoteStopTransactionResponse = (RemoteStopTransactionResponse)theEObject;
				T result = caseRemoteStopTransactionResponse(remoteStopTransactionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.RESERVE_NOW_REQUEST: {
				ReserveNowRequest reserveNowRequest = (ReserveNowRequest)theEObject;
				T result = caseReserveNowRequest(reserveNowRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.RESERVE_NOW_RESPONSE: {
				ReserveNowResponse reserveNowResponse = (ReserveNowResponse)theEObject;
				T result = caseReserveNowResponse(reserveNowResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.RESET_REQUEST: {
				ResetRequest resetRequest = (ResetRequest)theEObject;
				T result = caseResetRequest(resetRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.RESET_RESPONSE: {
				ResetResponse resetResponse = (ResetResponse)theEObject;
				T result = caseResetResponse(resetResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST: {
				SendLocalListRequest sendLocalListRequest = (SendLocalListRequest)theEObject;
				T result = caseSendLocalListRequest(sendLocalListRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.SEND_LOCAL_LIST_RESPONSE: {
				SendLocalListResponse sendLocalListResponse = (SendLocalListResponse)theEObject;
				T result = caseSendLocalListResponse(sendLocalListResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST: {
				SetChargingProfileRequest setChargingProfileRequest = (SetChargingProfileRequest)theEObject;
				T result = caseSetChargingProfileRequest(setChargingProfileRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.SET_CHARGING_PROFILE_RESPONSE: {
				SetChargingProfileResponse setChargingProfileResponse = (SetChargingProfileResponse)theEObject;
				T result = caseSetChargingProfileResponse(setChargingProfileResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST: {
				TriggerMessageRequest triggerMessageRequest = (TriggerMessageRequest)theEObject;
				T result = caseTriggerMessageRequest(triggerMessageRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.TRIGGER_MESSAGE_RESPONSE: {
				TriggerMessageResponse triggerMessageResponse = (TriggerMessageResponse)theEObject;
				T result = caseTriggerMessageResponse(triggerMessageResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.UNLOCK_CONNECTOR_REQUEST: {
				UnlockConnectorRequest unlockConnectorRequest = (UnlockConnectorRequest)theEObject;
				T result = caseUnlockConnectorRequest(unlockConnectorRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.UNLOCK_CONNECTOR_RESPONSE: {
				UnlockConnectorResponse unlockConnectorResponse = (UnlockConnectorResponse)theEObject;
				T result = caseUnlockConnectorResponse(unlockConnectorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST: {
				UpdateFirmwareRequest updateFirmwareRequest = (UpdateFirmwareRequest)theEObject;
				T result = caseUpdateFirmwareRequest(updateFirmwareRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppChargePointPackage.UPDATE_FIRMWARE_RESPONSE: {
				UpdateFirmwareResponse updateFirmwareResponse = (UpdateFirmwareResponse)theEObject;
				T result = caseUpdateFirmwareResponse(updateFirmwareResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationData(AuthorizationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Reservation Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Reservation Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelReservationRequest(CancelReservationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Reservation Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Reservation Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelReservationResponse(CancelReservationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Availability Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Availability Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAvailabilityRequest(ChangeAvailabilityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Availability Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Availability Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAvailabilityResponse(ChangeAvailabilityResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Configuration Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Configuration Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeConfigurationRequest(ChangeConfigurationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Configuration Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Configuration Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeConfigurationResponse(ChangeConfigurationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charging Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charging Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargingProfile(ChargingProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charging Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charging Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargingSchedule(ChargingSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charging Schedule Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charging Schedule Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargingSchedulePeriod(ChargingSchedulePeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Cache Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Cache Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearCacheRequest(ClearCacheRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Cache Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Cache Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearCacheResponse(ClearCacheResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Charging Profile Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Charging Profile Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearChargingProfileRequest(ClearChargingProfileRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Charging Profile Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Charging Profile Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearChargingProfileResponse(ClearChargingProfileResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transfer Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transfer Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransferRequest(DataTransferRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transfer Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transfer Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransferResponse(DataTransferResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Composite Schedule Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Composite Schedule Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCompositeScheduleRequest(GetCompositeScheduleRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Composite Schedule Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Composite Schedule Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCompositeScheduleResponse(GetCompositeScheduleResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Configuration Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Configuration Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConfigurationRequest(GetConfigurationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Configuration Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Configuration Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetConfigurationResponse(GetConfigurationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Diagnostics Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Diagnostics Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDiagnosticsRequest(GetDiagnosticsRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Diagnostics Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Diagnostics Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDiagnosticsResponse(GetDiagnosticsResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Local List Version Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Local List Version Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetLocalListVersionRequest(GetLocalListVersionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Local List Version Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Local List Version Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetLocalListVersionResponse(GetLocalListVersionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Tag Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Tag Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdTagInfo(IdTagInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValue(KeyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Start Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Start Transaction Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteStartTransactionRequest(RemoteStartTransactionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Start Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Start Transaction Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteStartTransactionResponse(RemoteStartTransactionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Stop Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Stop Transaction Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteStopTransactionRequest(RemoteStopTransactionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Stop Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Stop Transaction Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteStopTransactionResponse(RemoteStopTransactionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Now Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Now Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserveNowRequest(ReserveNowRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Now Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Now Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserveNowResponse(ReserveNowResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetRequest(ResetRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetResponse(ResetResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Local List Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Local List Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendLocalListRequest(SendLocalListRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Local List Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Local List Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendLocalListResponse(SendLocalListResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Charging Profile Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Charging Profile Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetChargingProfileRequest(SetChargingProfileRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Charging Profile Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Charging Profile Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetChargingProfileResponse(SetChargingProfileResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Message Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Message Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerMessageRequest(TriggerMessageRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Message Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Message Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerMessageResponse(TriggerMessageResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlock Connector Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlock Connector Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlockConnectorRequest(UnlockConnectorRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlock Connector Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlock Connector Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlockConnectorResponse(UnlockConnectorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Firmware Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Firmware Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateFirmwareRequest(UpdateFirmwareRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Firmware Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Firmware Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateFirmwareResponse(UpdateFirmwareResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OcppChargePointSwitch
