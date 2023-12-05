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
package de.jena.sensinact.ocpp.centralsystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus;
import de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest;
import de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse;
import de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode;
import de.jena.sensinact.ocpp.centralsystem.ChargePointStatus;
import de.jena.sensinact.ocpp.centralsystem.DataTransferRequest;
import de.jena.sensinact.ocpp.centralsystem.DataTransferResponse;
import de.jena.sensinact.ocpp.centralsystem.DataTransferStatus;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.DocumentRoot;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatus;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest;
import de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse;
import de.jena.sensinact.ocpp.centralsystem.IdTagInfo;
import de.jena.sensinact.ocpp.centralsystem.Location;
import de.jena.sensinact.ocpp.centralsystem.Measurand;
import de.jena.sensinact.ocpp.centralsystem.MeterValue;
import de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest;
import de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemFactory;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.Phase;
import de.jena.sensinact.ocpp.centralsystem.ReadingContext;
import de.jena.sensinact.ocpp.centralsystem.Reason;
import de.jena.sensinact.ocpp.centralsystem.RegistrationStatus;
import de.jena.sensinact.ocpp.centralsystem.SampledValue;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse;
import de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure;
import de.jena.sensinact.ocpp.centralsystem.ValueFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcppCentralSystemFactoryImpl extends EFactoryImpl implements OcppCentralSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OcppCentralSystemFactory init() {
		try {
			OcppCentralSystemFactory theOcppCentralSystemFactory = (OcppCentralSystemFactory)EPackage.Registry.INSTANCE.getEFactory(OcppCentralSystemPackage.eNS_URI);
			if (theOcppCentralSystemFactory != null) {
				return theOcppCentralSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OcppCentralSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppCentralSystemFactoryImpl() {
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
			case OcppCentralSystemPackage.AUTHORIZE_REQUEST: return createAuthorizeRequest();
			case OcppCentralSystemPackage.AUTHORIZE_RESPONSE: return createAuthorizeResponse();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST: return createBootNotificationRequest();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE: return createBootNotificationResponse();
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST: return createDataTransferRequest();
			case OcppCentralSystemPackage.DATA_TRANSFER_RESPONSE: return createDataTransferResponse();
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST: return createDiagnosticsStatusNotificationRequest();
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE: return createDiagnosticsStatusNotificationResponse();
			case OcppCentralSystemPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OcppCentralSystemPackage.FIRMWARE_STATUS_NOTIFICATION_REQUEST: return createFirmwareStatusNotificationRequest();
			case OcppCentralSystemPackage.FIRMWARE_STATUS_NOTIFICATION_RESPONSE: return createFirmwareStatusNotificationResponse();
			case OcppCentralSystemPackage.HEARTBEAT_REQUEST: return createHeartbeatRequest();
			case OcppCentralSystemPackage.HEARTBEAT_RESPONSE: return createHeartbeatResponse();
			case OcppCentralSystemPackage.ID_TAG_INFO: return createIdTagInfo();
			case OcppCentralSystemPackage.METER_VALUE: return createMeterValue();
			case OcppCentralSystemPackage.METER_VALUES_REQUEST: return createMeterValuesRequest();
			case OcppCentralSystemPackage.METER_VALUES_RESPONSE: return createMeterValuesResponse();
			case OcppCentralSystemPackage.SAMPLED_VALUE: return createSampledValue();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST: return createStartTransactionRequest();
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE: return createStartTransactionResponse();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST: return createStatusNotificationRequest();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_RESPONSE: return createStatusNotificationResponse();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST: return createStopTransactionRequest();
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE: return createStopTransactionResponse();
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
			case OcppCentralSystemPackage.AUTHORIZATION_STATUS:
				return createAuthorizationStatusFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CHARGE_POINT_ERROR_CODE:
				return createChargePointErrorCodeFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CHARGE_POINT_STATUS:
				return createChargePointStatusFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.DATA_TRANSFER_STATUS:
				return createDataTransferStatusFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS:
				return createDiagnosticsStatusFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.FIRMWARE_STATUS:
				return createFirmwareStatusFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.LOCATION:
				return createLocationFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.MEASURAND:
				return createMeasurandFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.PHASE:
				return createPhaseFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.READING_CONTEXT:
				return createReadingContextFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.REASON:
				return createReasonFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.REGISTRATION_STATUS:
				return createRegistrationStatusFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.UNIT_OF_MEASURE:
				return createUnitOfMeasureFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.VALUE_FORMAT:
				return createValueFormatFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.AUTHORIZATION_STATUS_OBJECT:
				return createAuthorizationStatusObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CHARGE_POINT_ERROR_CODE_OBJECT:
				return createChargePointErrorCodeObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CHARGE_POINT_STATUS_OBJECT:
				return createChargePointStatusObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CI_STRING20_TYPE:
				return createCiString20TypeFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CI_STRING255_TYPE:
				return createCiString255TypeFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CI_STRING25_TYPE:
				return createCiString25TypeFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CI_STRING500_TYPE:
				return createCiString500TypeFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.CI_STRING50_TYPE:
				return createCiString50TypeFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.DATA_TRANSFER_STATUS_OBJECT:
				return createDataTransferStatusObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_OBJECT:
				return createDiagnosticsStatusObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.FIRMWARE_STATUS_OBJECT:
				return createFirmwareStatusObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.ID_TOKEN:
				return createIdTokenFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.LOCATION_OBJECT:
				return createLocationObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.MEASURAND_OBJECT:
				return createMeasurandObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.PHASE_OBJECT:
				return createPhaseObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.READING_CONTEXT_OBJECT:
				return createReadingContextObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.REASON_OBJECT:
				return createReasonObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.REGISTRATION_STATUS_OBJECT:
				return createRegistrationStatusObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.UNIT_OF_MEASURE_OBJECT:
				return createUnitOfMeasureObjectFromString(eDataType, initialValue);
			case OcppCentralSystemPackage.VALUE_FORMAT_OBJECT:
				return createValueFormatObjectFromString(eDataType, initialValue);
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
			case OcppCentralSystemPackage.AUTHORIZATION_STATUS:
				return convertAuthorizationStatusToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CHARGE_POINT_ERROR_CODE:
				return convertChargePointErrorCodeToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CHARGE_POINT_STATUS:
				return convertChargePointStatusToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.DATA_TRANSFER_STATUS:
				return convertDataTransferStatusToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS:
				return convertDiagnosticsStatusToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.FIRMWARE_STATUS:
				return convertFirmwareStatusToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.LOCATION:
				return convertLocationToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.MEASURAND:
				return convertMeasurandToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.PHASE:
				return convertPhaseToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.READING_CONTEXT:
				return convertReadingContextToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.REASON:
				return convertReasonToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.REGISTRATION_STATUS:
				return convertRegistrationStatusToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.UNIT_OF_MEASURE:
				return convertUnitOfMeasureToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.VALUE_FORMAT:
				return convertValueFormatToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.AUTHORIZATION_STATUS_OBJECT:
				return convertAuthorizationStatusObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CHARGE_POINT_ERROR_CODE_OBJECT:
				return convertChargePointErrorCodeObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CHARGE_POINT_STATUS_OBJECT:
				return convertChargePointStatusObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CI_STRING20_TYPE:
				return convertCiString20TypeToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CI_STRING255_TYPE:
				return convertCiString255TypeToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CI_STRING25_TYPE:
				return convertCiString25TypeToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CI_STRING500_TYPE:
				return convertCiString500TypeToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.CI_STRING50_TYPE:
				return convertCiString50TypeToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.DATA_TRANSFER_STATUS_OBJECT:
				return convertDataTransferStatusObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_OBJECT:
				return convertDiagnosticsStatusObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.FIRMWARE_STATUS_OBJECT:
				return convertFirmwareStatusObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.ID_TOKEN:
				return convertIdTokenToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.LOCATION_OBJECT:
				return convertLocationObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.MEASURAND_OBJECT:
				return convertMeasurandObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.PHASE_OBJECT:
				return convertPhaseObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.READING_CONTEXT_OBJECT:
				return convertReadingContextObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.REASON_OBJECT:
				return convertReasonObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.REGISTRATION_STATUS_OBJECT:
				return convertRegistrationStatusObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.UNIT_OF_MEASURE_OBJECT:
				return convertUnitOfMeasureObjectToString(eDataType, instanceValue);
			case OcppCentralSystemPackage.VALUE_FORMAT_OBJECT:
				return convertValueFormatObjectToString(eDataType, instanceValue);
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
	public AuthorizeRequest createAuthorizeRequest() {
		AuthorizeRequestImpl authorizeRequest = new AuthorizeRequestImpl();
		return authorizeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizeResponse createAuthorizeResponse() {
		AuthorizeResponseImpl authorizeResponse = new AuthorizeResponseImpl();
		return authorizeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootNotificationRequest createBootNotificationRequest() {
		BootNotificationRequestImpl bootNotificationRequest = new BootNotificationRequestImpl();
		return bootNotificationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootNotificationResponse createBootNotificationResponse() {
		BootNotificationResponseImpl bootNotificationResponse = new BootNotificationResponseImpl();
		return bootNotificationResponse;
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
	public DiagnosticsStatusNotificationRequest createDiagnosticsStatusNotificationRequest() {
		DiagnosticsStatusNotificationRequestImpl diagnosticsStatusNotificationRequest = new DiagnosticsStatusNotificationRequestImpl();
		return diagnosticsStatusNotificationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticsStatusNotificationResponse createDiagnosticsStatusNotificationResponse() {
		DiagnosticsStatusNotificationResponseImpl diagnosticsStatusNotificationResponse = new DiagnosticsStatusNotificationResponseImpl();
		return diagnosticsStatusNotificationResponse;
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
	public FirmwareStatusNotificationRequest createFirmwareStatusNotificationRequest() {
		FirmwareStatusNotificationRequestImpl firmwareStatusNotificationRequest = new FirmwareStatusNotificationRequestImpl();
		return firmwareStatusNotificationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirmwareStatusNotificationResponse createFirmwareStatusNotificationResponse() {
		FirmwareStatusNotificationResponseImpl firmwareStatusNotificationResponse = new FirmwareStatusNotificationResponseImpl();
		return firmwareStatusNotificationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeartbeatRequest createHeartbeatRequest() {
		HeartbeatRequestImpl heartbeatRequest = new HeartbeatRequestImpl();
		return heartbeatRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeartbeatResponse createHeartbeatResponse() {
		HeartbeatResponseImpl heartbeatResponse = new HeartbeatResponseImpl();
		return heartbeatResponse;
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
	public MeterValue createMeterValue() {
		MeterValueImpl meterValue = new MeterValueImpl();
		return meterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeterValuesRequest createMeterValuesRequest() {
		MeterValuesRequestImpl meterValuesRequest = new MeterValuesRequestImpl();
		return meterValuesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeterValuesResponse createMeterValuesResponse() {
		MeterValuesResponseImpl meterValuesResponse = new MeterValuesResponseImpl();
		return meterValuesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledValue createSampledValue() {
		SampledValueImpl sampledValue = new SampledValueImpl();
		return sampledValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartTransactionRequest createStartTransactionRequest() {
		StartTransactionRequestImpl startTransactionRequest = new StartTransactionRequestImpl();
		return startTransactionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartTransactionResponse createStartTransactionResponse() {
		StartTransactionResponseImpl startTransactionResponse = new StartTransactionResponseImpl();
		return startTransactionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusNotificationRequest createStatusNotificationRequest() {
		StatusNotificationRequestImpl statusNotificationRequest = new StatusNotificationRequestImpl();
		return statusNotificationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusNotificationResponse createStatusNotificationResponse() {
		StatusNotificationResponseImpl statusNotificationResponse = new StatusNotificationResponseImpl();
		return statusNotificationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopTransactionRequest createStopTransactionRequest() {
		StopTransactionRequestImpl stopTransactionRequest = new StopTransactionRequestImpl();
		return stopTransactionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopTransactionResponse createStopTransactionResponse() {
		StopTransactionResponseImpl stopTransactionResponse = new StopTransactionResponseImpl();
		return stopTransactionResponse;
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
	public ChargePointErrorCode createChargePointErrorCodeFromString(EDataType eDataType, String initialValue) {
		ChargePointErrorCode result = ChargePointErrorCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargePointErrorCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargePointStatus createChargePointStatusFromString(EDataType eDataType, String initialValue) {
		ChargePointStatus result = ChargePointStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargePointStatusToString(EDataType eDataType, Object instanceValue) {
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
	public DiagnosticsStatus createDiagnosticsStatusFromString(EDataType eDataType, String initialValue) {
		DiagnosticsStatus result = DiagnosticsStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticsStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareStatus createFirmwareStatusFromString(EDataType eDataType, String initialValue) {
		FirmwareStatus result = FirmwareStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirmwareStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocationFromString(EDataType eDataType, String initialValue) {
		Location result = Location.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurand createMeasurandFromString(EDataType eDataType, String initialValue) {
		Measurand result = Measurand.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhaseFromString(EDataType eDataType, String initialValue) {
		Phase result = Phase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingContext createReadingContextFromString(EDataType eDataType, String initialValue) {
		ReadingContext result = ReadingContext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadingContextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reason createReasonFromString(EDataType eDataType, String initialValue) {
		Reason result = Reason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationStatus createRegistrationStatusFromString(EDataType eDataType, String initialValue) {
		RegistrationStatus result = RegistrationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasure createUnitOfMeasureFromString(EDataType eDataType, String initialValue) {
		UnitOfMeasure result = UnitOfMeasure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitOfMeasureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFormat createValueFormatFromString(EDataType eDataType, String initialValue) {
		ValueFormat result = ValueFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationStatus createAuthorizationStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createAuthorizationStatusFromString(OcppCentralSystemPackage.Literals.AUTHORIZATION_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorizationStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuthorizationStatusToString(OcppCentralSystemPackage.Literals.AUTHORIZATION_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargePointErrorCode createChargePointErrorCodeObjectFromString(EDataType eDataType, String initialValue) {
		return createChargePointErrorCodeFromString(OcppCentralSystemPackage.Literals.CHARGE_POINT_ERROR_CODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargePointErrorCodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargePointErrorCodeToString(OcppCentralSystemPackage.Literals.CHARGE_POINT_ERROR_CODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargePointStatus createChargePointStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createChargePointStatusFromString(OcppCentralSystemPackage.Literals.CHARGE_POINT_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargePointStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargePointStatusToString(OcppCentralSystemPackage.Literals.CHARGE_POINT_STATUS, instanceValue);
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
	public DataTransferStatus createDataTransferStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTransferStatusFromString(OcppCentralSystemPackage.Literals.DATA_TRANSFER_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTransferStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTransferStatusToString(OcppCentralSystemPackage.Literals.DATA_TRANSFER_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticsStatus createDiagnosticsStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticsStatusFromString(OcppCentralSystemPackage.Literals.DIAGNOSTICS_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticsStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticsStatusToString(OcppCentralSystemPackage.Literals.DIAGNOSTICS_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmwareStatus createFirmwareStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createFirmwareStatusFromString(OcppCentralSystemPackage.Literals.FIRMWARE_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirmwareStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFirmwareStatusToString(OcppCentralSystemPackage.Literals.FIRMWARE_STATUS, instanceValue);
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
	public Location createLocationObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationFromString(OcppCentralSystemPackage.Literals.LOCATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationToString(OcppCentralSystemPackage.Literals.LOCATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurand createMeasurandObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasurandFromString(OcppCentralSystemPackage.Literals.MEASURAND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurandObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasurandToString(OcppCentralSystemPackage.Literals.MEASURAND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhaseObjectFromString(EDataType eDataType, String initialValue) {
		return createPhaseFromString(OcppCentralSystemPackage.Literals.PHASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPhaseToString(OcppCentralSystemPackage.Literals.PHASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingContext createReadingContextObjectFromString(EDataType eDataType, String initialValue) {
		return createReadingContextFromString(OcppCentralSystemPackage.Literals.READING_CONTEXT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadingContextObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadingContextToString(OcppCentralSystemPackage.Literals.READING_CONTEXT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reason createReasonObjectFromString(EDataType eDataType, String initialValue) {
		return createReasonFromString(OcppCentralSystemPackage.Literals.REASON, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReasonToString(OcppCentralSystemPackage.Literals.REASON, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationStatus createRegistrationStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createRegistrationStatusFromString(OcppCentralSystemPackage.Literals.REGISTRATION_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrationStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRegistrationStatusToString(OcppCentralSystemPackage.Literals.REGISTRATION_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasure createUnitOfMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitOfMeasureFromString(OcppCentralSystemPackage.Literals.UNIT_OF_MEASURE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitOfMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitOfMeasureToString(OcppCentralSystemPackage.Literals.UNIT_OF_MEASURE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFormat createValueFormatObjectFromString(EDataType eDataType, String initialValue) {
		return createValueFormatFromString(OcppCentralSystemPackage.Literals.VALUE_FORMAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueFormatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueFormatToString(OcppCentralSystemPackage.Literals.VALUE_FORMAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcppCentralSystemPackage getOcppCentralSystemPackage() {
		return (OcppCentralSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OcppCentralSystemPackage getPackage() {
		return OcppCentralSystemPackage.eINSTANCE;
	}

} //OcppCentralSystemFactoryImpl
