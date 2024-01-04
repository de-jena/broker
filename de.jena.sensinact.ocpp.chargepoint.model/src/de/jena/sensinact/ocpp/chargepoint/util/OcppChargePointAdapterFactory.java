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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage
 * @generated
 */
public class OcppChargePointAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OcppChargePointPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppChargePointAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OcppChargePointPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcppChargePointSwitch<Adapter> modelSwitch =
		new OcppChargePointSwitch<Adapter>() {
			@Override
			public Adapter caseAuthorizationData(AuthorizationData object) {
				return createAuthorizationDataAdapter();
			}
			@Override
			public Adapter caseCancelReservationRequest(CancelReservationRequest object) {
				return createCancelReservationRequestAdapter();
			}
			@Override
			public Adapter caseCancelReservationResponse(CancelReservationResponse object) {
				return createCancelReservationResponseAdapter();
			}
			@Override
			public Adapter caseChangeAvailabilityRequest(ChangeAvailabilityRequest object) {
				return createChangeAvailabilityRequestAdapter();
			}
			@Override
			public Adapter caseChangeAvailabilityResponse(ChangeAvailabilityResponse object) {
				return createChangeAvailabilityResponseAdapter();
			}
			@Override
			public Adapter caseChangeConfigurationRequest(ChangeConfigurationRequest object) {
				return createChangeConfigurationRequestAdapter();
			}
			@Override
			public Adapter caseChangeConfigurationResponse(ChangeConfigurationResponse object) {
				return createChangeConfigurationResponseAdapter();
			}
			@Override
			public Adapter caseChargingProfile(ChargingProfile object) {
				return createChargingProfileAdapter();
			}
			@Override
			public Adapter caseChargingSchedule(ChargingSchedule object) {
				return createChargingScheduleAdapter();
			}
			@Override
			public Adapter caseChargingSchedulePeriod(ChargingSchedulePeriod object) {
				return createChargingSchedulePeriodAdapter();
			}
			@Override
			public Adapter caseClearCacheRequest(ClearCacheRequest object) {
				return createClearCacheRequestAdapter();
			}
			@Override
			public Adapter caseClearCacheResponse(ClearCacheResponse object) {
				return createClearCacheResponseAdapter();
			}
			@Override
			public Adapter caseClearChargingProfileRequest(ClearChargingProfileRequest object) {
				return createClearChargingProfileRequestAdapter();
			}
			@Override
			public Adapter caseClearChargingProfileResponse(ClearChargingProfileResponse object) {
				return createClearChargingProfileResponseAdapter();
			}
			@Override
			public Adapter caseDataTransferRequest(DataTransferRequest object) {
				return createDataTransferRequestAdapter();
			}
			@Override
			public Adapter caseDataTransferResponse(DataTransferResponse object) {
				return createDataTransferResponseAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGetCompositeScheduleRequest(GetCompositeScheduleRequest object) {
				return createGetCompositeScheduleRequestAdapter();
			}
			@Override
			public Adapter caseGetCompositeScheduleResponse(GetCompositeScheduleResponse object) {
				return createGetCompositeScheduleResponseAdapter();
			}
			@Override
			public Adapter caseGetConfigurationRequest(GetConfigurationRequest object) {
				return createGetConfigurationRequestAdapter();
			}
			@Override
			public Adapter caseGetConfigurationResponse(GetConfigurationResponse object) {
				return createGetConfigurationResponseAdapter();
			}
			@Override
			public Adapter caseGetDiagnosticsRequest(GetDiagnosticsRequest object) {
				return createGetDiagnosticsRequestAdapter();
			}
			@Override
			public Adapter caseGetDiagnosticsResponse(GetDiagnosticsResponse object) {
				return createGetDiagnosticsResponseAdapter();
			}
			@Override
			public Adapter caseGetLocalListVersionRequest(GetLocalListVersionRequest object) {
				return createGetLocalListVersionRequestAdapter();
			}
			@Override
			public Adapter caseGetLocalListVersionResponse(GetLocalListVersionResponse object) {
				return createGetLocalListVersionResponseAdapter();
			}
			@Override
			public Adapter caseIdTagInfo(IdTagInfo object) {
				return createIdTagInfoAdapter();
			}
			@Override
			public Adapter caseKeyValue(KeyValue object) {
				return createKeyValueAdapter();
			}
			@Override
			public Adapter caseRemoteStartTransactionRequest(RemoteStartTransactionRequest object) {
				return createRemoteStartTransactionRequestAdapter();
			}
			@Override
			public Adapter caseRemoteStartTransactionResponse(RemoteStartTransactionResponse object) {
				return createRemoteStartTransactionResponseAdapter();
			}
			@Override
			public Adapter caseRemoteStopTransactionRequest(RemoteStopTransactionRequest object) {
				return createRemoteStopTransactionRequestAdapter();
			}
			@Override
			public Adapter caseRemoteStopTransactionResponse(RemoteStopTransactionResponse object) {
				return createRemoteStopTransactionResponseAdapter();
			}
			@Override
			public Adapter caseReserveNowRequest(ReserveNowRequest object) {
				return createReserveNowRequestAdapter();
			}
			@Override
			public Adapter caseReserveNowResponse(ReserveNowResponse object) {
				return createReserveNowResponseAdapter();
			}
			@Override
			public Adapter caseResetRequest(ResetRequest object) {
				return createResetRequestAdapter();
			}
			@Override
			public Adapter caseResetResponse(ResetResponse object) {
				return createResetResponseAdapter();
			}
			@Override
			public Adapter caseSendLocalListRequest(SendLocalListRequest object) {
				return createSendLocalListRequestAdapter();
			}
			@Override
			public Adapter caseSendLocalListResponse(SendLocalListResponse object) {
				return createSendLocalListResponseAdapter();
			}
			@Override
			public Adapter caseSetChargingProfileRequest(SetChargingProfileRequest object) {
				return createSetChargingProfileRequestAdapter();
			}
			@Override
			public Adapter caseSetChargingProfileResponse(SetChargingProfileResponse object) {
				return createSetChargingProfileResponseAdapter();
			}
			@Override
			public Adapter caseTriggerMessageRequest(TriggerMessageRequest object) {
				return createTriggerMessageRequestAdapter();
			}
			@Override
			public Adapter caseTriggerMessageResponse(TriggerMessageResponse object) {
				return createTriggerMessageResponseAdapter();
			}
			@Override
			public Adapter caseUnlockConnectorRequest(UnlockConnectorRequest object) {
				return createUnlockConnectorRequestAdapter();
			}
			@Override
			public Adapter caseUnlockConnectorResponse(UnlockConnectorResponse object) {
				return createUnlockConnectorResponseAdapter();
			}
			@Override
			public Adapter caseUpdateFirmwareRequest(UpdateFirmwareRequest object) {
				return createUpdateFirmwareRequestAdapter();
			}
			@Override
			public Adapter caseUpdateFirmwareResponse(UpdateFirmwareResponse object) {
				return createUpdateFirmwareResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData <em>Authorization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationData
	 * @generated
	 */
	public Adapter createAuthorizationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest <em>Cancel Reservation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest
	 * @generated
	 */
	public Adapter createCancelReservationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse <em>Cancel Reservation Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse
	 * @generated
	 */
	public Adapter createCancelReservationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest <em>Change Availability Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest
	 * @generated
	 */
	public Adapter createChangeAvailabilityRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse <em>Change Availability Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse
	 * @generated
	 */
	public Adapter createChangeAvailabilityResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest <em>Change Configuration Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest
	 * @generated
	 */
	public Adapter createChangeConfigurationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse <em>Change Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse
	 * @generated
	 */
	public Adapter createChangeConfigurationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile <em>Charging Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile
	 * @generated
	 */
	public Adapter createChargingProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule <em>Charging Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule
	 * @generated
	 */
	public Adapter createChargingScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod <em>Charging Schedule Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod
	 * @generated
	 */
	public Adapter createChargingSchedulePeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheRequest <em>Clear Cache Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheRequest
	 * @generated
	 */
	public Adapter createClearCacheRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse <em>Clear Cache Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse
	 * @generated
	 */
	public Adapter createClearCacheResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest <em>Clear Charging Profile Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest
	 * @generated
	 */
	public Adapter createClearChargingProfileRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse <em>Clear Charging Profile Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse
	 * @generated
	 */
	public Adapter createClearChargingProfileResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest <em>Data Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferRequest
	 * @generated
	 */
	public Adapter createDataTransferRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferResponse <em>Data Transfer Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferResponse
	 * @generated
	 */
	public Adapter createDataTransferResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest <em>Get Composite Schedule Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest
	 * @generated
	 */
	public Adapter createGetCompositeScheduleRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse <em>Get Composite Schedule Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse
	 * @generated
	 */
	public Adapter createGetCompositeScheduleResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest <em>Get Configuration Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest
	 * @generated
	 */
	public Adapter createGetConfigurationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse <em>Get Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse
	 * @generated
	 */
	public Adapter createGetConfigurationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest <em>Get Diagnostics Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest
	 * @generated
	 */
	public Adapter createGetDiagnosticsRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse <em>Get Diagnostics Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse
	 * @generated
	 */
	public Adapter createGetDiagnosticsResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest <em>Get Local List Version Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest
	 * @generated
	 */
	public Adapter createGetLocalListVersionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse <em>Get Local List Version Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse
	 * @generated
	 */
	public Adapter createGetLocalListVersionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.IdTagInfo
	 * @generated
	 */
	public Adapter createIdTagInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.KeyValue
	 * @generated
	 */
	public Adapter createKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest <em>Remote Start Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest
	 * @generated
	 */
	public Adapter createRemoteStartTransactionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse <em>Remote Start Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse
	 * @generated
	 */
	public Adapter createRemoteStartTransactionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest <em>Remote Stop Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest
	 * @generated
	 */
	public Adapter createRemoteStopTransactionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse <em>Remote Stop Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse
	 * @generated
	 */
	public Adapter createRemoteStopTransactionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest <em>Reserve Now Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest
	 * @generated
	 */
	public Adapter createReserveNowRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse <em>Reserve Now Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse
	 * @generated
	 */
	public Adapter createReserveNowResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest <em>Reset Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetRequest
	 * @generated
	 */
	public Adapter createResetRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.ResetResponse <em>Reset Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetResponse
	 * @generated
	 */
	public Adapter createResetResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest <em>Send Local List Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest
	 * @generated
	 */
	public Adapter createSendLocalListRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse <em>Send Local List Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse
	 * @generated
	 */
	public Adapter createSendLocalListResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest <em>Set Charging Profile Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest
	 * @generated
	 */
	public Adapter createSetChargingProfileRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse <em>Set Charging Profile Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse
	 * @generated
	 */
	public Adapter createSetChargingProfileResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest <em>Trigger Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest
	 * @generated
	 */
	public Adapter createTriggerMessageRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse <em>Trigger Message Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse
	 * @generated
	 */
	public Adapter createTriggerMessageResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest <em>Unlock Connector Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest
	 * @generated
	 */
	public Adapter createUnlockConnectorRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse <em>Unlock Connector Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse
	 * @generated
	 */
	public Adapter createUnlockConnectorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest <em>Update Firmware Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest
	 * @generated
	 */
	public Adapter createUpdateFirmwareRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse <em>Update Firmware Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse
	 * @generated
	 */
	public Adapter createUpdateFirmwareResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OcppChargePointAdapterFactory
