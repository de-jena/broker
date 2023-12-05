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
package de.jena.sensinact.ocpp.centralsystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest;
import de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse;
import de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.DataTransferRequest;
import de.jena.sensinact.ocpp.centralsystem.DataTransferResponse;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.DocumentRoot;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest;
import de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse;
import de.jena.sensinact.ocpp.centralsystem.IdTagInfo;
import de.jena.sensinact.ocpp.centralsystem.MeterValue;
import de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest;
import de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.SampledValue;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse;

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
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage
 * @generated
 */
public class OcppCentralSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OcppCentralSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppCentralSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = OcppCentralSystemPackage.eINSTANCE;
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
			case OcppCentralSystemPackage.AUTHORIZE_REQUEST: {
				AuthorizeRequest authorizeRequest = (AuthorizeRequest)theEObject;
				T result = caseAuthorizeRequest(authorizeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.AUTHORIZE_RESPONSE: {
				AuthorizeResponse authorizeResponse = (AuthorizeResponse)theEObject;
				T result = caseAuthorizeResponse(authorizeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST: {
				BootNotificationRequest bootNotificationRequest = (BootNotificationRequest)theEObject;
				T result = caseBootNotificationRequest(bootNotificationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE: {
				BootNotificationResponse bootNotificationResponse = (BootNotificationResponse)theEObject;
				T result = caseBootNotificationResponse(bootNotificationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST: {
				DataTransferRequest dataTransferRequest = (DataTransferRequest)theEObject;
				T result = caseDataTransferRequest(dataTransferRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.DATA_TRANSFER_RESPONSE: {
				DataTransferResponse dataTransferResponse = (DataTransferResponse)theEObject;
				T result = caseDataTransferResponse(dataTransferResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST: {
				DiagnosticsStatusNotificationRequest diagnosticsStatusNotificationRequest = (DiagnosticsStatusNotificationRequest)theEObject;
				T result = caseDiagnosticsStatusNotificationRequest(diagnosticsStatusNotificationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE: {
				DiagnosticsStatusNotificationResponse diagnosticsStatusNotificationResponse = (DiagnosticsStatusNotificationResponse)theEObject;
				T result = caseDiagnosticsStatusNotificationResponse(diagnosticsStatusNotificationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.FIRMWARE_STATUS_NOTIFICATION_REQUEST: {
				FirmwareStatusNotificationRequest firmwareStatusNotificationRequest = (FirmwareStatusNotificationRequest)theEObject;
				T result = caseFirmwareStatusNotificationRequest(firmwareStatusNotificationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.FIRMWARE_STATUS_NOTIFICATION_RESPONSE: {
				FirmwareStatusNotificationResponse firmwareStatusNotificationResponse = (FirmwareStatusNotificationResponse)theEObject;
				T result = caseFirmwareStatusNotificationResponse(firmwareStatusNotificationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.HEARTBEAT_REQUEST: {
				HeartbeatRequest heartbeatRequest = (HeartbeatRequest)theEObject;
				T result = caseHeartbeatRequest(heartbeatRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.HEARTBEAT_RESPONSE: {
				HeartbeatResponse heartbeatResponse = (HeartbeatResponse)theEObject;
				T result = caseHeartbeatResponse(heartbeatResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.ID_TAG_INFO: {
				IdTagInfo idTagInfo = (IdTagInfo)theEObject;
				T result = caseIdTagInfo(idTagInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.METER_VALUE: {
				MeterValue meterValue = (MeterValue)theEObject;
				T result = caseMeterValue(meterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.METER_VALUES_REQUEST: {
				MeterValuesRequest meterValuesRequest = (MeterValuesRequest)theEObject;
				T result = caseMeterValuesRequest(meterValuesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.METER_VALUES_RESPONSE: {
				MeterValuesResponse meterValuesResponse = (MeterValuesResponse)theEObject;
				T result = caseMeterValuesResponse(meterValuesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.SAMPLED_VALUE: {
				SampledValue sampledValue = (SampledValue)theEObject;
				T result = caseSampledValue(sampledValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST: {
				StartTransactionRequest startTransactionRequest = (StartTransactionRequest)theEObject;
				T result = caseStartTransactionRequest(startTransactionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE: {
				StartTransactionResponse startTransactionResponse = (StartTransactionResponse)theEObject;
				T result = caseStartTransactionResponse(startTransactionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST: {
				StatusNotificationRequest statusNotificationRequest = (StatusNotificationRequest)theEObject;
				T result = caseStatusNotificationRequest(statusNotificationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_RESPONSE: {
				StatusNotificationResponse statusNotificationResponse = (StatusNotificationResponse)theEObject;
				T result = caseStatusNotificationResponse(statusNotificationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST: {
				StopTransactionRequest stopTransactionRequest = (StopTransactionRequest)theEObject;
				T result = caseStopTransactionRequest(stopTransactionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE: {
				StopTransactionResponse stopTransactionResponse = (StopTransactionResponse)theEObject;
				T result = caseStopTransactionResponse(stopTransactionResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorize Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorize Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizeRequest(AuthorizeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorize Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorize Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizeResponse(AuthorizeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boot Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boot Notification Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootNotificationRequest(BootNotificationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boot Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boot Notification Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootNotificationResponse(BootNotificationResponse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostics Status Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostics Status Notification Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticsStatusNotificationRequest(DiagnosticsStatusNotificationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostics Status Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostics Status Notification Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticsStatusNotificationResponse(DiagnosticsStatusNotificationResponse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Firmware Status Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmware Status Notification Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmwareStatusNotificationRequest(FirmwareStatusNotificationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmware Status Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmware Status Notification Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmwareStatusNotificationResponse(FirmwareStatusNotificationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heartbeat Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heartbeat Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartbeatRequest(HeartbeatRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heartbeat Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heartbeat Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartbeatResponse(HeartbeatResponse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Meter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterValue(MeterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Values Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Values Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterValuesRequest(MeterValuesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Values Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Values Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterValuesResponse(MeterValuesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledValue(SampledValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Transaction Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartTransactionRequest(StartTransactionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Transaction Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartTransactionResponse(StartTransactionResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Notification Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusNotificationRequest(StatusNotificationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Notification Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusNotificationResponse(StatusNotificationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Transaction Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopTransactionRequest(StopTransactionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Transaction Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopTransactionResponse(StopTransactionResponse object) {
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

} //OcppCentralSystemSwitch
