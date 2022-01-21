/**
 */
package de.jena.sensinact.ocpp.centralsystem.util;

import de.jena.sensinact.ocpp.centralsystem.*;

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
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage
 * @generated
 */
public class OcppCentralSystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OcppCentralSystemValidator INSTANCE = new OcppCentralSystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.jena.sensinact.ocpp.centralsystem";

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
	public OcppCentralSystemValidator() {
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
	  return OcppCentralSystemPackage.eINSTANCE;
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
			case OcppCentralSystemPackage.AUTHORIZE_REQUEST:
				return validateAuthorizeRequest((AuthorizeRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.AUTHORIZE_RESPONSE:
				return validateAuthorizeResponse((AuthorizeResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST:
				return validateBootNotificationRequest((BootNotificationRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE:
				return validateBootNotificationResponse((BootNotificationResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST:
				return validateDataTransferRequest((DataTransferRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.DATA_TRANSFER_RESPONSE:
				return validateDataTransferResponse((DataTransferResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST:
				return validateDiagnosticsStatusNotificationRequest((DiagnosticsStatusNotificationRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE:
				return validateDiagnosticsStatusNotificationResponse((DiagnosticsStatusNotificationResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OcppCentralSystemPackage.FIRMWARE_STATUS_NOTIFICATION_REQUEST:
				return validateFirmwareStatusNotificationRequest((FirmwareStatusNotificationRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.FIRMWARE_STATUS_NOTIFICATION_RESPONSE:
				return validateFirmwareStatusNotificationResponse((FirmwareStatusNotificationResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.HEARTBEAT_REQUEST:
				return validateHeartbeatRequest((HeartbeatRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.HEARTBEAT_RESPONSE:
				return validateHeartbeatResponse((HeartbeatResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.ID_TAG_INFO:
				return validateIdTagInfo((IdTagInfo)value, diagnostics, context);
			case OcppCentralSystemPackage.METER_VALUE:
				return validateMeterValue((MeterValue)value, diagnostics, context);
			case OcppCentralSystemPackage.METER_VALUES_REQUEST:
				return validateMeterValuesRequest((MeterValuesRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.METER_VALUES_RESPONSE:
				return validateMeterValuesResponse((MeterValuesResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.SAMPLED_VALUE:
				return validateSampledValue((SampledValue)value, diagnostics, context);
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST:
				return validateStartTransactionRequest((StartTransactionRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE:
				return validateStartTransactionResponse((StartTransactionResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST:
				return validateStatusNotificationRequest((StatusNotificationRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_RESPONSE:
				return validateStatusNotificationResponse((StatusNotificationResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST:
				return validateStopTransactionRequest((StopTransactionRequest)value, diagnostics, context);
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE:
				return validateStopTransactionResponse((StopTransactionResponse)value, diagnostics, context);
			case OcppCentralSystemPackage.AUTHORIZATION_STATUS:
				return validateAuthorizationStatus((AuthorizationStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.CHARGE_POINT_ERROR_CODE:
				return validateChargePointErrorCode((ChargePointErrorCode)value, diagnostics, context);
			case OcppCentralSystemPackage.CHARGE_POINT_STATUS:
				return validateChargePointStatus((ChargePointStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.DATA_TRANSFER_STATUS:
				return validateDataTransferStatus((DataTransferStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS:
				return validateDiagnosticsStatus((DiagnosticsStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.FIRMWARE_STATUS:
				return validateFirmwareStatus((FirmwareStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case OcppCentralSystemPackage.MEASURAND:
				return validateMeasurand((Measurand)value, diagnostics, context);
			case OcppCentralSystemPackage.PHASE:
				return validatePhase((Phase)value, diagnostics, context);
			case OcppCentralSystemPackage.READING_CONTEXT:
				return validateReadingContext((ReadingContext)value, diagnostics, context);
			case OcppCentralSystemPackage.REASON:
				return validateReason((Reason)value, diagnostics, context);
			case OcppCentralSystemPackage.REGISTRATION_STATUS:
				return validateRegistrationStatus((RegistrationStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.UNIT_OF_MEASURE:
				return validateUnitOfMeasure((UnitOfMeasure)value, diagnostics, context);
			case OcppCentralSystemPackage.VALUE_FORMAT:
				return validateValueFormat((ValueFormat)value, diagnostics, context);
			case OcppCentralSystemPackage.AUTHORIZATION_STATUS_OBJECT:
				return validateAuthorizationStatusObject((AuthorizationStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.CHARGE_POINT_ERROR_CODE_OBJECT:
				return validateChargePointErrorCodeObject((ChargePointErrorCode)value, diagnostics, context);
			case OcppCentralSystemPackage.CHARGE_POINT_STATUS_OBJECT:
				return validateChargePointStatusObject((ChargePointStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.CI_STRING20_TYPE:
				return validateCiString20Type((String)value, diagnostics, context);
			case OcppCentralSystemPackage.CI_STRING255_TYPE:
				return validateCiString255Type((String)value, diagnostics, context);
			case OcppCentralSystemPackage.CI_STRING25_TYPE:
				return validateCiString25Type((String)value, diagnostics, context);
			case OcppCentralSystemPackage.CI_STRING500_TYPE:
				return validateCiString500Type((String)value, diagnostics, context);
			case OcppCentralSystemPackage.CI_STRING50_TYPE:
				return validateCiString50Type((String)value, diagnostics, context);
			case OcppCentralSystemPackage.DATA_TRANSFER_STATUS_OBJECT:
				return validateDataTransferStatusObject((DataTransferStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.DIAGNOSTICS_STATUS_OBJECT:
				return validateDiagnosticsStatusObject((DiagnosticsStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.FIRMWARE_STATUS_OBJECT:
				return validateFirmwareStatusObject((FirmwareStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.ID_TOKEN:
				return validateIdToken((String)value, diagnostics, context);
			case OcppCentralSystemPackage.LOCATION_OBJECT:
				return validateLocationObject((Location)value, diagnostics, context);
			case OcppCentralSystemPackage.MEASURAND_OBJECT:
				return validateMeasurandObject((Measurand)value, diagnostics, context);
			case OcppCentralSystemPackage.PHASE_OBJECT:
				return validatePhaseObject((Phase)value, diagnostics, context);
			case OcppCentralSystemPackage.READING_CONTEXT_OBJECT:
				return validateReadingContextObject((ReadingContext)value, diagnostics, context);
			case OcppCentralSystemPackage.REASON_OBJECT:
				return validateReasonObject((Reason)value, diagnostics, context);
			case OcppCentralSystemPackage.REGISTRATION_STATUS_OBJECT:
				return validateRegistrationStatusObject((RegistrationStatus)value, diagnostics, context);
			case OcppCentralSystemPackage.UNIT_OF_MEASURE_OBJECT:
				return validateUnitOfMeasureObject((UnitOfMeasure)value, diagnostics, context);
			case OcppCentralSystemPackage.VALUE_FORMAT_OBJECT:
				return validateValueFormatObject((ValueFormat)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizeRequest(AuthorizeRequest authorizeRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorizeRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizeResponse(AuthorizeResponse authorizeResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorizeResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootNotificationRequest(BootNotificationRequest bootNotificationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootNotificationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootNotificationResponse(BootNotificationResponse bootNotificationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootNotificationResponse, diagnostics, context);
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
	public boolean validateDiagnosticsStatusNotificationRequest(DiagnosticsStatusNotificationRequest diagnosticsStatusNotificationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticsStatusNotificationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticsStatusNotificationResponse(DiagnosticsStatusNotificationResponse diagnosticsStatusNotificationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticsStatusNotificationResponse, diagnostics, context);
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
	public boolean validateFirmwareStatusNotificationRequest(FirmwareStatusNotificationRequest firmwareStatusNotificationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firmwareStatusNotificationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirmwareStatusNotificationResponse(FirmwareStatusNotificationResponse firmwareStatusNotificationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firmwareStatusNotificationResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartbeatRequest(HeartbeatRequest heartbeatRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(heartbeatRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeartbeatResponse(HeartbeatResponse heartbeatResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(heartbeatResponse, diagnostics, context);
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
	public boolean validateMeterValue(MeterValue meterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meterValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeterValuesRequest(MeterValuesRequest meterValuesRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meterValuesRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeterValuesResponse(MeterValuesResponse meterValuesResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meterValuesResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValue(SampledValue sampledValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTransactionRequest(StartTransactionRequest startTransactionRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startTransactionRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTransactionResponse(StartTransactionResponse startTransactionResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startTransactionResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusNotificationRequest(StatusNotificationRequest statusNotificationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusNotificationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusNotificationResponse(StatusNotificationResponse statusNotificationResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusNotificationResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopTransactionRequest(StopTransactionRequest stopTransactionRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopTransactionRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopTransactionResponse(StopTransactionResponse stopTransactionResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopTransactionResponse, diagnostics, context);
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
	public boolean validateChargePointErrorCode(ChargePointErrorCode chargePointErrorCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargePointStatus(ChargePointStatus chargePointStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateDiagnosticsStatus(DiagnosticsStatus diagnosticsStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirmwareStatus(FirmwareStatus firmwareStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurand(Measurand measurand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhase(Phase phase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadingContext(ReadingContext readingContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReason(Reason reason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrationStatus(RegistrationStatus registrationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasure(UnitOfMeasure unitOfMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueFormat(ValueFormat valueFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateChargePointErrorCodeObject(ChargePointErrorCode chargePointErrorCodeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargePointStatusObject(ChargePointStatus chargePointStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			reportMaxLengthViolation(OcppCentralSystemPackage.Literals.CI_STRING20_TYPE, ciString20Type, length, 20, diagnostics, context);
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
			reportMaxLengthViolation(OcppCentralSystemPackage.Literals.CI_STRING255_TYPE, ciString255Type, length, 255, diagnostics, context);
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
			reportMaxLengthViolation(OcppCentralSystemPackage.Literals.CI_STRING25_TYPE, ciString25Type, length, 25, diagnostics, context);
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
			reportMaxLengthViolation(OcppCentralSystemPackage.Literals.CI_STRING500_TYPE, ciString500Type, length, 500, diagnostics, context);
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
			reportMaxLengthViolation(OcppCentralSystemPackage.Literals.CI_STRING50_TYPE, ciString50Type, length, 50, diagnostics, context);
		return result;
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
	public boolean validateDiagnosticsStatusObject(DiagnosticsStatus diagnosticsStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirmwareStatusObject(FirmwareStatus firmwareStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			reportMaxLengthViolation(OcppCentralSystemPackage.Literals.ID_TOKEN, idToken, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationObject(Location locationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurandObject(Measurand measurandObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseObject(Phase phaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadingContextObject(ReadingContext readingContextObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonObject(Reason reasonObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrationStatusObject(RegistrationStatus registrationStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasureObject(UnitOfMeasure unitOfMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueFormatObject(ValueFormat valueFormatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //OcppCentralSystemValidator
