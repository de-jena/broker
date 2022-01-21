/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.AuthorizationData;
import de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus;
import de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus;
import de.jena.sensinact.ocpp.chargepoint.AvailabilityType;
import de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest;
import de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse;
import de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus;
import de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest;
import de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse;
import de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest;
import de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfile;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus;
import de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedule;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod;
import de.jena.sensinact.ocpp.chargepoint.ClearCacheRequest;
import de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse;
import de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus;
import de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest;
import de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse;
import de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus;
import de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus;
import de.jena.sensinact.ocpp.chargepoint.DataTransferRequest;
import de.jena.sensinact.ocpp.chargepoint.DataTransferResponse;
import de.jena.sensinact.ocpp.chargepoint.DataTransferStatus;
import de.jena.sensinact.ocpp.chargepoint.DocumentRoot;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus;
import de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest;
import de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse;
import de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest;
import de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse;
import de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest;
import de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse;
import de.jena.sensinact.ocpp.chargepoint.IdTagInfo;
import de.jena.sensinact.ocpp.chargepoint.KeyValue;
import de.jena.sensinact.ocpp.chargepoint.MessageTrigger;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointFactory;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType;
import de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus;
import de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest;
import de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse;
import de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest;
import de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse;
import de.jena.sensinact.ocpp.chargepoint.ReservationStatus;
import de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest;
import de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse;
import de.jena.sensinact.ocpp.chargepoint.ResetRequest;
import de.jena.sensinact.ocpp.chargepoint.ResetResponse;
import de.jena.sensinact.ocpp.chargepoint.ResetStatus;
import de.jena.sensinact.ocpp.chargepoint.ResetType;
import de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest;
import de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse;
import de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest;
import de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse;
import de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest;
import de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse;
import de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus;
import de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest;
import de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse;
import de.jena.sensinact.ocpp.chargepoint.UnlockStatus;
import de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest;
import de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse;
import de.jena.sensinact.ocpp.chargepoint.UpdateStatus;
import de.jena.sensinact.ocpp.chargepoint.UpdateType;

import de.jena.sensinact.ocpp.chargepoint.util.OcppChargePointValidator;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcppChargePointPackageImpl extends EPackageImpl implements OcppChargePointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelReservationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelReservationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAvailabilityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAvailabilityResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeConfigurationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeConfigurationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargingProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargingScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargingSchedulePeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearCacheRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearCacheResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearChargingProfileRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearChargingProfileResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransferRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransferResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCompositeScheduleRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCompositeScheduleResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConfigurationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getConfigurationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDiagnosticsRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDiagnosticsResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getLocalListVersionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getLocalListVersionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idTagInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteStartTransactionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteStartTransactionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteStopTransactionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteStopTransactionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveNowRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveNowResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendLocalListRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendLocalListResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setChargingProfileRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setChargingProfileResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerMessageRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerMessageResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockConnectorRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockConnectorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateFirmwareRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateFirmwareResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorizationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum availabilityStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum availabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cancelReservationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargingProfileKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargingProfilePurposeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargingProfileStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargingRateUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clearCacheStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clearChargingProfileStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum configurationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTransferStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum getCompositeScheduleStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTriggerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recurrencyKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum remoteStartStopStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resetStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerMessageStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unlockStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authorizationStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType availabilityStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType availabilityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cancelReservationStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chargingProfileKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chargingProfilePurposeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chargingProfileStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chargingRateUnitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString20TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString255TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString25TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString500TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString50TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clearCacheStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clearChargingProfileStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType configurationStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTransferStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalOneEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType getCompositeScheduleStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageTriggerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType recurrencyKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType remoteStartStopStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reservationStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resetStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resetTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType triggerMessageStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlockStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OcppChargePointPackageImpl() {
		super(eNS_URI, OcppChargePointFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OcppChargePointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OcppChargePointPackage init() {
		if (isInited) return (OcppChargePointPackage)EPackage.Registry.INSTANCE.getEPackage(OcppChargePointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOcppChargePointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OcppChargePointPackageImpl theOcppChargePointPackage = registeredOcppChargePointPackage instanceof OcppChargePointPackageImpl ? (OcppChargePointPackageImpl)registeredOcppChargePointPackage : new OcppChargePointPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOcppChargePointPackage.createPackageContents();

		// Initialize created meta-data
		theOcppChargePointPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOcppChargePointPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OcppChargePointValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOcppChargePointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OcppChargePointPackage.eNS_URI, theOcppChargePointPackage);
		return theOcppChargePointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizationData() {
		return authorizationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizationData_IdTag() {
		return (EAttribute)authorizationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationData_IdTagInfo() {
		return (EReference)authorizationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCancelReservationRequest() {
		return cancelReservationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelReservationRequest_ReservationId() {
		return (EAttribute)cancelReservationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCancelReservationResponse() {
		return cancelReservationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelReservationResponse_Status() {
		return (EAttribute)cancelReservationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeAvailabilityRequest() {
		return changeAvailabilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeAvailabilityRequest_ConnectorId() {
		return (EAttribute)changeAvailabilityRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeAvailabilityRequest_Type() {
		return (EAttribute)changeAvailabilityRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeAvailabilityResponse() {
		return changeAvailabilityResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeAvailabilityResponse_Status() {
		return (EAttribute)changeAvailabilityResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeConfigurationRequest() {
		return changeConfigurationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeConfigurationRequest_Key() {
		return (EAttribute)changeConfigurationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeConfigurationRequest_Value() {
		return (EAttribute)changeConfigurationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeConfigurationResponse() {
		return changeConfigurationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeConfigurationResponse_Status() {
		return (EAttribute)changeConfigurationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChargingProfile() {
		return chargingProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_ChargingProfileId() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_TransactionId() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_StackLevel() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_ChargingProfilePurpose() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_ChargingProfileKind() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_RecurrencyKind() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_ValidFrom() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingProfile_ValidTo() {
		return (EAttribute)chargingProfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChargingProfile_ChargingSchedule() {
		return (EReference)chargingProfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChargingSchedule() {
		return chargingScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedule_Duration() {
		return (EAttribute)chargingScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedule_StartSchedule() {
		return (EAttribute)chargingScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedule_ChargingRateUnit() {
		return (EAttribute)chargingScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChargingSchedule_ChargingSchedulePeriod() {
		return (EReference)chargingScheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedule_MinChargingRate() {
		return (EAttribute)chargingScheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChargingSchedulePeriod() {
		return chargingSchedulePeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedulePeriod_StartPeriod() {
		return (EAttribute)chargingSchedulePeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedulePeriod_Limit() {
		return (EAttribute)chargingSchedulePeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChargingSchedulePeriod_NumberPhases() {
		return (EAttribute)chargingSchedulePeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearCacheRequest() {
		return clearCacheRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearCacheResponse() {
		return clearCacheResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearCacheResponse_Status() {
		return (EAttribute)clearCacheResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearChargingProfileRequest() {
		return clearChargingProfileRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearChargingProfileRequest_Id() {
		return (EAttribute)clearChargingProfileRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearChargingProfileRequest_ConnectorId() {
		return (EAttribute)clearChargingProfileRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearChargingProfileRequest_ChargingProfilePurpose() {
		return (EAttribute)clearChargingProfileRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearChargingProfileRequest_StackLevel() {
		return (EAttribute)clearChargingProfileRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearChargingProfileResponse() {
		return clearChargingProfileResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearChargingProfileResponse_Status() {
		return (EAttribute)clearChargingProfileResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTransferRequest() {
		return dataTransferRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferRequest_VendorId() {
		return (EAttribute)dataTransferRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferRequest_MessageId() {
		return (EAttribute)dataTransferRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferRequest_Data() {
		return (EAttribute)dataTransferRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTransferResponse() {
		return dataTransferResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferResponse_Status() {
		return (EAttribute)dataTransferResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferResponse_Data() {
		return (EAttribute)dataTransferResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CancelReservationRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CancelReservationResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ChangeAvailabilityRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ChangeAvailabilityResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ChangeConfigurationRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ChangeConfigurationResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ChargeBoxIdentity() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ClearCacheRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ClearCacheResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ClearChargingProfileRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ClearChargingProfileResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DataTransferRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DataTransferResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCompositeScheduleRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetCompositeScheduleResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConfigurationRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetConfigurationResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetDiagnosticsRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetDiagnosticsResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetLocalListVersionRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GetLocalListVersionResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RemoteStartTransactionRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RemoteStartTransactionResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RemoteStopTransactionRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RemoteStopTransactionResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReserveNowRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReserveNowResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ResetRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ResetResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SendLocalListRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SendLocalListResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SetChargingProfileRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SetChargingProfileResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TriggerMessageRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TriggerMessageResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnlockConnectorRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnlockConnectorResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UpdateFirmwareRequest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UpdateFirmwareResponse() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCompositeScheduleRequest() {
		return getCompositeScheduleRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCompositeScheduleRequest_ConnectorId() {
		return (EAttribute)getCompositeScheduleRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCompositeScheduleRequest_Duration() {
		return (EAttribute)getCompositeScheduleRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCompositeScheduleRequest_ChargingRateUnit() {
		return (EAttribute)getCompositeScheduleRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetCompositeScheduleResponse() {
		return getCompositeScheduleResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCompositeScheduleResponse_Status() {
		return (EAttribute)getCompositeScheduleResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCompositeScheduleResponse_ConnectorId() {
		return (EAttribute)getCompositeScheduleResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetCompositeScheduleResponse_ScheduleStart() {
		return (EAttribute)getCompositeScheduleResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetCompositeScheduleResponse_ChargingSchedule() {
		return (EReference)getCompositeScheduleResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConfigurationRequest() {
		return getConfigurationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConfigurationRequest_Key() {
		return (EAttribute)getConfigurationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetConfigurationResponse() {
		return getConfigurationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetConfigurationResponse_ConfigurationKey() {
		return (EReference)getConfigurationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetConfigurationResponse_UnknownKey() {
		return (EAttribute)getConfigurationResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetDiagnosticsRequest() {
		return getDiagnosticsRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDiagnosticsRequest_Location() {
		return (EAttribute)getDiagnosticsRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDiagnosticsRequest_StartTime() {
		return (EAttribute)getDiagnosticsRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDiagnosticsRequest_StopTime() {
		return (EAttribute)getDiagnosticsRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDiagnosticsRequest_Retries() {
		return (EAttribute)getDiagnosticsRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDiagnosticsRequest_RetryInterval() {
		return (EAttribute)getDiagnosticsRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetDiagnosticsResponse() {
		return getDiagnosticsResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetDiagnosticsResponse_FileName() {
		return (EAttribute)getDiagnosticsResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetLocalListVersionRequest() {
		return getLocalListVersionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetLocalListVersionResponse() {
		return getLocalListVersionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetLocalListVersionResponse_ListVersion() {
		return (EAttribute)getLocalListVersionResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdTagInfo() {
		return idTagInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdTagInfo_Status() {
		return (EAttribute)idTagInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdTagInfo_ExpiryDate() {
		return (EAttribute)idTagInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdTagInfo_ParentIdTag() {
		return (EAttribute)idTagInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValue() {
		return keyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValue_Key() {
		return (EAttribute)keyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValue_Readonly() {
		return (EAttribute)keyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValue_Value() {
		return (EAttribute)keyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteStartTransactionRequest() {
		return remoteStartTransactionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteStartTransactionRequest_ConnectorId() {
		return (EAttribute)remoteStartTransactionRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteStartTransactionRequest_IdTag() {
		return (EAttribute)remoteStartTransactionRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRemoteStartTransactionRequest_ChargingProfile() {
		return (EReference)remoteStartTransactionRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteStartTransactionResponse() {
		return remoteStartTransactionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteStartTransactionResponse_Status() {
		return (EAttribute)remoteStartTransactionResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteStopTransactionRequest() {
		return remoteStopTransactionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteStopTransactionRequest_TransactionId() {
		return (EAttribute)remoteStopTransactionRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteStopTransactionResponse() {
		return remoteStopTransactionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRemoteStopTransactionResponse_Status() {
		return (EAttribute)remoteStopTransactionResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReserveNowRequest() {
		return reserveNowRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveNowRequest_ConnectorId() {
		return (EAttribute)reserveNowRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveNowRequest_ExpiryDate() {
		return (EAttribute)reserveNowRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveNowRequest_IdTag() {
		return (EAttribute)reserveNowRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveNowRequest_ParentIdTag() {
		return (EAttribute)reserveNowRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveNowRequest_ReservationId() {
		return (EAttribute)reserveNowRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReserveNowResponse() {
		return reserveNowResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReserveNowResponse_Status() {
		return (EAttribute)reserveNowResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResetRequest() {
		return resetRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResetRequest_Type() {
		return (EAttribute)resetRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResetResponse() {
		return resetResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResetResponse_Status() {
		return (EAttribute)resetResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendLocalListRequest() {
		return sendLocalListRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendLocalListRequest_ListVersion() {
		return (EAttribute)sendLocalListRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendLocalListRequest_LocalAuthorizationList() {
		return (EReference)sendLocalListRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendLocalListRequest_UpdateType() {
		return (EAttribute)sendLocalListRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendLocalListResponse() {
		return sendLocalListResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendLocalListResponse_Status() {
		return (EAttribute)sendLocalListResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetChargingProfileRequest() {
		return setChargingProfileRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetChargingProfileRequest_ConnectorId() {
		return (EAttribute)setChargingProfileRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetChargingProfileRequest_CsChargingProfiles() {
		return (EReference)setChargingProfileRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetChargingProfileResponse() {
		return setChargingProfileResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetChargingProfileResponse_Status() {
		return (EAttribute)setChargingProfileResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerMessageRequest() {
		return triggerMessageRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerMessageRequest_RequestedMessage() {
		return (EAttribute)triggerMessageRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerMessageRequest_ConnectorId() {
		return (EAttribute)triggerMessageRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerMessageResponse() {
		return triggerMessageResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerMessageResponse_Status() {
		return (EAttribute)triggerMessageResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnlockConnectorRequest() {
		return unlockConnectorRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnlockConnectorRequest_ConnectorId() {
		return (EAttribute)unlockConnectorRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnlockConnectorResponse() {
		return unlockConnectorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnlockConnectorResponse_Status() {
		return (EAttribute)unlockConnectorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateFirmwareRequest() {
		return updateFirmwareRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateFirmwareRequest_RetrieveDate() {
		return (EAttribute)updateFirmwareRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateFirmwareRequest_Location() {
		return (EAttribute)updateFirmwareRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateFirmwareRequest_Retries() {
		return (EAttribute)updateFirmwareRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdateFirmwareRequest_RetryInterval() {
		return (EAttribute)updateFirmwareRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdateFirmwareResponse() {
		return updateFirmwareResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthorizationStatus() {
		return authorizationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAvailabilityStatus() {
		return availabilityStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAvailabilityType() {
		return availabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCancelReservationStatus() {
		return cancelReservationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargingProfileKindType() {
		return chargingProfileKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargingProfilePurposeType() {
		return chargingProfilePurposeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargingProfileStatus() {
		return chargingProfileStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargingRateUnitType() {
		return chargingRateUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClearCacheStatus() {
		return clearCacheStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClearChargingProfileStatus() {
		return clearChargingProfileStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConfigurationStatus() {
		return configurationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTransferStatus() {
		return dataTransferStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGetCompositeScheduleStatus() {
		return getCompositeScheduleStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageTrigger() {
		return messageTriggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRecurrencyKindType() {
		return recurrencyKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRemoteStartStopStatus() {
		return remoteStartStopStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReservationStatus() {
		return reservationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResetStatus() {
		return resetStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResetType() {
		return resetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerMessageStatus() {
		return triggerMessageStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnlockStatus() {
		return unlockStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateStatus() {
		return updateStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUpdateType() {
		return updateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAuthorizationStatusObject() {
		return authorizationStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAvailabilityStatusObject() {
		return availabilityStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAvailabilityTypeObject() {
		return availabilityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCancelReservationStatusObject() {
		return cancelReservationStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChargingProfileKindTypeObject() {
		return chargingProfileKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChargingProfilePurposeTypeObject() {
		return chargingProfilePurposeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChargingProfileStatusObject() {
		return chargingProfileStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChargingRateUnitTypeObject() {
		return chargingRateUnitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString20Type() {
		return ciString20TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString255Type() {
		return ciString255TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString25Type() {
		return ciString25TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString500Type() {
		return ciString500TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString50Type() {
		return ciString50TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getClearCacheStatusObject() {
		return clearCacheStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getClearChargingProfileStatusObject() {
		return clearChargingProfileStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConfigurationStatusObject() {
		return configurationStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataTransferStatusObject() {
		return dataTransferStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecimalOne() {
		return decimalOneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGetCompositeScheduleStatusObject() {
		return getCompositeScheduleStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdToken() {
		return idTokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMessageTriggerObject() {
		return messageTriggerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRecurrencyKindTypeObject() {
		return recurrencyKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRemoteStartStopStatusObject() {
		return remoteStartStopStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReservationStatusObject() {
		return reservationStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getResetStatusObject() {
		return resetStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getResetTypeObject() {
		return resetTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTriggerMessageStatusObject() {
		return triggerMessageStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnlockStatusObject() {
		return unlockStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateStatusObject() {
		return updateStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUpdateTypeObject() {
		return updateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcppChargePointFactory getOcppChargePointFactory() {
		return (OcppChargePointFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorizationDataEClass = createEClass(AUTHORIZATION_DATA);
		createEAttribute(authorizationDataEClass, AUTHORIZATION_DATA__ID_TAG);
		createEReference(authorizationDataEClass, AUTHORIZATION_DATA__ID_TAG_INFO);

		cancelReservationRequestEClass = createEClass(CANCEL_RESERVATION_REQUEST);
		createEAttribute(cancelReservationRequestEClass, CANCEL_RESERVATION_REQUEST__RESERVATION_ID);

		cancelReservationResponseEClass = createEClass(CANCEL_RESERVATION_RESPONSE);
		createEAttribute(cancelReservationResponseEClass, CANCEL_RESERVATION_RESPONSE__STATUS);

		changeAvailabilityRequestEClass = createEClass(CHANGE_AVAILABILITY_REQUEST);
		createEAttribute(changeAvailabilityRequestEClass, CHANGE_AVAILABILITY_REQUEST__CONNECTOR_ID);
		createEAttribute(changeAvailabilityRequestEClass, CHANGE_AVAILABILITY_REQUEST__TYPE);

		changeAvailabilityResponseEClass = createEClass(CHANGE_AVAILABILITY_RESPONSE);
		createEAttribute(changeAvailabilityResponseEClass, CHANGE_AVAILABILITY_RESPONSE__STATUS);

		changeConfigurationRequestEClass = createEClass(CHANGE_CONFIGURATION_REQUEST);
		createEAttribute(changeConfigurationRequestEClass, CHANGE_CONFIGURATION_REQUEST__KEY);
		createEAttribute(changeConfigurationRequestEClass, CHANGE_CONFIGURATION_REQUEST__VALUE);

		changeConfigurationResponseEClass = createEClass(CHANGE_CONFIGURATION_RESPONSE);
		createEAttribute(changeConfigurationResponseEClass, CHANGE_CONFIGURATION_RESPONSE__STATUS);

		chargingProfileEClass = createEClass(CHARGING_PROFILE);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__CHARGING_PROFILE_ID);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__TRANSACTION_ID);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__STACK_LEVEL);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__CHARGING_PROFILE_KIND);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__RECURRENCY_KIND);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__VALID_FROM);
		createEAttribute(chargingProfileEClass, CHARGING_PROFILE__VALID_TO);
		createEReference(chargingProfileEClass, CHARGING_PROFILE__CHARGING_SCHEDULE);

		chargingScheduleEClass = createEClass(CHARGING_SCHEDULE);
		createEAttribute(chargingScheduleEClass, CHARGING_SCHEDULE__DURATION);
		createEAttribute(chargingScheduleEClass, CHARGING_SCHEDULE__START_SCHEDULE);
		createEAttribute(chargingScheduleEClass, CHARGING_SCHEDULE__CHARGING_RATE_UNIT);
		createEReference(chargingScheduleEClass, CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD);
		createEAttribute(chargingScheduleEClass, CHARGING_SCHEDULE__MIN_CHARGING_RATE);

		chargingSchedulePeriodEClass = createEClass(CHARGING_SCHEDULE_PERIOD);
		createEAttribute(chargingSchedulePeriodEClass, CHARGING_SCHEDULE_PERIOD__START_PERIOD);
		createEAttribute(chargingSchedulePeriodEClass, CHARGING_SCHEDULE_PERIOD__LIMIT);
		createEAttribute(chargingSchedulePeriodEClass, CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES);

		clearCacheRequestEClass = createEClass(CLEAR_CACHE_REQUEST);

		clearCacheResponseEClass = createEClass(CLEAR_CACHE_RESPONSE);
		createEAttribute(clearCacheResponseEClass, CLEAR_CACHE_RESPONSE__STATUS);

		clearChargingProfileRequestEClass = createEClass(CLEAR_CHARGING_PROFILE_REQUEST);
		createEAttribute(clearChargingProfileRequestEClass, CLEAR_CHARGING_PROFILE_REQUEST__ID);
		createEAttribute(clearChargingProfileRequestEClass, CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID);
		createEAttribute(clearChargingProfileRequestEClass, CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE);
		createEAttribute(clearChargingProfileRequestEClass, CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL);

		clearChargingProfileResponseEClass = createEClass(CLEAR_CHARGING_PROFILE_RESPONSE);
		createEAttribute(clearChargingProfileResponseEClass, CLEAR_CHARGING_PROFILE_RESPONSE__STATUS);

		dataTransferRequestEClass = createEClass(DATA_TRANSFER_REQUEST);
		createEAttribute(dataTransferRequestEClass, DATA_TRANSFER_REQUEST__VENDOR_ID);
		createEAttribute(dataTransferRequestEClass, DATA_TRANSFER_REQUEST__MESSAGE_ID);
		createEAttribute(dataTransferRequestEClass, DATA_TRANSFER_REQUEST__DATA);

		dataTransferResponseEClass = createEClass(DATA_TRANSFER_RESPONSE);
		createEAttribute(dataTransferResponseEClass, DATA_TRANSFER_RESPONSE__STATUS);
		createEAttribute(dataTransferResponseEClass, DATA_TRANSFER_RESPONSE__DATA);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CHARGE_BOX_IDENTITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLEAR_CACHE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_TRANSFER_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESERVE_NOW_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESERVE_NOW_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESET_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESET_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE);

		getCompositeScheduleRequestEClass = createEClass(GET_COMPOSITE_SCHEDULE_REQUEST);
		createEAttribute(getCompositeScheduleRequestEClass, GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID);
		createEAttribute(getCompositeScheduleRequestEClass, GET_COMPOSITE_SCHEDULE_REQUEST__DURATION);
		createEAttribute(getCompositeScheduleRequestEClass, GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT);

		getCompositeScheduleResponseEClass = createEClass(GET_COMPOSITE_SCHEDULE_RESPONSE);
		createEAttribute(getCompositeScheduleResponseEClass, GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS);
		createEAttribute(getCompositeScheduleResponseEClass, GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID);
		createEAttribute(getCompositeScheduleResponseEClass, GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START);
		createEReference(getCompositeScheduleResponseEClass, GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE);

		getConfigurationRequestEClass = createEClass(GET_CONFIGURATION_REQUEST);
		createEAttribute(getConfigurationRequestEClass, GET_CONFIGURATION_REQUEST__KEY);

		getConfigurationResponseEClass = createEClass(GET_CONFIGURATION_RESPONSE);
		createEReference(getConfigurationResponseEClass, GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY);
		createEAttribute(getConfigurationResponseEClass, GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY);

		getDiagnosticsRequestEClass = createEClass(GET_DIAGNOSTICS_REQUEST);
		createEAttribute(getDiagnosticsRequestEClass, GET_DIAGNOSTICS_REQUEST__LOCATION);
		createEAttribute(getDiagnosticsRequestEClass, GET_DIAGNOSTICS_REQUEST__START_TIME);
		createEAttribute(getDiagnosticsRequestEClass, GET_DIAGNOSTICS_REQUEST__STOP_TIME);
		createEAttribute(getDiagnosticsRequestEClass, GET_DIAGNOSTICS_REQUEST__RETRIES);
		createEAttribute(getDiagnosticsRequestEClass, GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL);

		getDiagnosticsResponseEClass = createEClass(GET_DIAGNOSTICS_RESPONSE);
		createEAttribute(getDiagnosticsResponseEClass, GET_DIAGNOSTICS_RESPONSE__FILE_NAME);

		getLocalListVersionRequestEClass = createEClass(GET_LOCAL_LIST_VERSION_REQUEST);

		getLocalListVersionResponseEClass = createEClass(GET_LOCAL_LIST_VERSION_RESPONSE);
		createEAttribute(getLocalListVersionResponseEClass, GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION);

		idTagInfoEClass = createEClass(ID_TAG_INFO);
		createEAttribute(idTagInfoEClass, ID_TAG_INFO__STATUS);
		createEAttribute(idTagInfoEClass, ID_TAG_INFO__EXPIRY_DATE);
		createEAttribute(idTagInfoEClass, ID_TAG_INFO__PARENT_ID_TAG);

		keyValueEClass = createEClass(KEY_VALUE);
		createEAttribute(keyValueEClass, KEY_VALUE__KEY);
		createEAttribute(keyValueEClass, KEY_VALUE__READONLY);
		createEAttribute(keyValueEClass, KEY_VALUE__VALUE);

		remoteStartTransactionRequestEClass = createEClass(REMOTE_START_TRANSACTION_REQUEST);
		createEAttribute(remoteStartTransactionRequestEClass, REMOTE_START_TRANSACTION_REQUEST__CONNECTOR_ID);
		createEAttribute(remoteStartTransactionRequestEClass, REMOTE_START_TRANSACTION_REQUEST__ID_TAG);
		createEReference(remoteStartTransactionRequestEClass, REMOTE_START_TRANSACTION_REQUEST__CHARGING_PROFILE);

		remoteStartTransactionResponseEClass = createEClass(REMOTE_START_TRANSACTION_RESPONSE);
		createEAttribute(remoteStartTransactionResponseEClass, REMOTE_START_TRANSACTION_RESPONSE__STATUS);

		remoteStopTransactionRequestEClass = createEClass(REMOTE_STOP_TRANSACTION_REQUEST);
		createEAttribute(remoteStopTransactionRequestEClass, REMOTE_STOP_TRANSACTION_REQUEST__TRANSACTION_ID);

		remoteStopTransactionResponseEClass = createEClass(REMOTE_STOP_TRANSACTION_RESPONSE);
		createEAttribute(remoteStopTransactionResponseEClass, REMOTE_STOP_TRANSACTION_RESPONSE__STATUS);

		reserveNowRequestEClass = createEClass(RESERVE_NOW_REQUEST);
		createEAttribute(reserveNowRequestEClass, RESERVE_NOW_REQUEST__CONNECTOR_ID);
		createEAttribute(reserveNowRequestEClass, RESERVE_NOW_REQUEST__EXPIRY_DATE);
		createEAttribute(reserveNowRequestEClass, RESERVE_NOW_REQUEST__ID_TAG);
		createEAttribute(reserveNowRequestEClass, RESERVE_NOW_REQUEST__PARENT_ID_TAG);
		createEAttribute(reserveNowRequestEClass, RESERVE_NOW_REQUEST__RESERVATION_ID);

		reserveNowResponseEClass = createEClass(RESERVE_NOW_RESPONSE);
		createEAttribute(reserveNowResponseEClass, RESERVE_NOW_RESPONSE__STATUS);

		resetRequestEClass = createEClass(RESET_REQUEST);
		createEAttribute(resetRequestEClass, RESET_REQUEST__TYPE);

		resetResponseEClass = createEClass(RESET_RESPONSE);
		createEAttribute(resetResponseEClass, RESET_RESPONSE__STATUS);

		sendLocalListRequestEClass = createEClass(SEND_LOCAL_LIST_REQUEST);
		createEAttribute(sendLocalListRequestEClass, SEND_LOCAL_LIST_REQUEST__LIST_VERSION);
		createEReference(sendLocalListRequestEClass, SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST);
		createEAttribute(sendLocalListRequestEClass, SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE);

		sendLocalListResponseEClass = createEClass(SEND_LOCAL_LIST_RESPONSE);
		createEAttribute(sendLocalListResponseEClass, SEND_LOCAL_LIST_RESPONSE__STATUS);

		setChargingProfileRequestEClass = createEClass(SET_CHARGING_PROFILE_REQUEST);
		createEAttribute(setChargingProfileRequestEClass, SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID);
		createEReference(setChargingProfileRequestEClass, SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES);

		setChargingProfileResponseEClass = createEClass(SET_CHARGING_PROFILE_RESPONSE);
		createEAttribute(setChargingProfileResponseEClass, SET_CHARGING_PROFILE_RESPONSE__STATUS);

		triggerMessageRequestEClass = createEClass(TRIGGER_MESSAGE_REQUEST);
		createEAttribute(triggerMessageRequestEClass, TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE);
		createEAttribute(triggerMessageRequestEClass, TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID);

		triggerMessageResponseEClass = createEClass(TRIGGER_MESSAGE_RESPONSE);
		createEAttribute(triggerMessageResponseEClass, TRIGGER_MESSAGE_RESPONSE__STATUS);

		unlockConnectorRequestEClass = createEClass(UNLOCK_CONNECTOR_REQUEST);
		createEAttribute(unlockConnectorRequestEClass, UNLOCK_CONNECTOR_REQUEST__CONNECTOR_ID);

		unlockConnectorResponseEClass = createEClass(UNLOCK_CONNECTOR_RESPONSE);
		createEAttribute(unlockConnectorResponseEClass, UNLOCK_CONNECTOR_RESPONSE__STATUS);

		updateFirmwareRequestEClass = createEClass(UPDATE_FIRMWARE_REQUEST);
		createEAttribute(updateFirmwareRequestEClass, UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE);
		createEAttribute(updateFirmwareRequestEClass, UPDATE_FIRMWARE_REQUEST__LOCATION);
		createEAttribute(updateFirmwareRequestEClass, UPDATE_FIRMWARE_REQUEST__RETRIES);
		createEAttribute(updateFirmwareRequestEClass, UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL);

		updateFirmwareResponseEClass = createEClass(UPDATE_FIRMWARE_RESPONSE);

		// Create enums
		authorizationStatusEEnum = createEEnum(AUTHORIZATION_STATUS);
		availabilityStatusEEnum = createEEnum(AVAILABILITY_STATUS);
		availabilityTypeEEnum = createEEnum(AVAILABILITY_TYPE);
		cancelReservationStatusEEnum = createEEnum(CANCEL_RESERVATION_STATUS);
		chargingProfileKindTypeEEnum = createEEnum(CHARGING_PROFILE_KIND_TYPE);
		chargingProfilePurposeTypeEEnum = createEEnum(CHARGING_PROFILE_PURPOSE_TYPE);
		chargingProfileStatusEEnum = createEEnum(CHARGING_PROFILE_STATUS);
		chargingRateUnitTypeEEnum = createEEnum(CHARGING_RATE_UNIT_TYPE);
		clearCacheStatusEEnum = createEEnum(CLEAR_CACHE_STATUS);
		clearChargingProfileStatusEEnum = createEEnum(CLEAR_CHARGING_PROFILE_STATUS);
		configurationStatusEEnum = createEEnum(CONFIGURATION_STATUS);
		dataTransferStatusEEnum = createEEnum(DATA_TRANSFER_STATUS);
		getCompositeScheduleStatusEEnum = createEEnum(GET_COMPOSITE_SCHEDULE_STATUS);
		messageTriggerEEnum = createEEnum(MESSAGE_TRIGGER);
		recurrencyKindTypeEEnum = createEEnum(RECURRENCY_KIND_TYPE);
		remoteStartStopStatusEEnum = createEEnum(REMOTE_START_STOP_STATUS);
		reservationStatusEEnum = createEEnum(RESERVATION_STATUS);
		resetStatusEEnum = createEEnum(RESET_STATUS);
		resetTypeEEnum = createEEnum(RESET_TYPE);
		triggerMessageStatusEEnum = createEEnum(TRIGGER_MESSAGE_STATUS);
		unlockStatusEEnum = createEEnum(UNLOCK_STATUS);
		updateStatusEEnum = createEEnum(UPDATE_STATUS);
		updateTypeEEnum = createEEnum(UPDATE_TYPE);

		// Create data types
		authorizationStatusObjectEDataType = createEDataType(AUTHORIZATION_STATUS_OBJECT);
		availabilityStatusObjectEDataType = createEDataType(AVAILABILITY_STATUS_OBJECT);
		availabilityTypeObjectEDataType = createEDataType(AVAILABILITY_TYPE_OBJECT);
		cancelReservationStatusObjectEDataType = createEDataType(CANCEL_RESERVATION_STATUS_OBJECT);
		chargingProfileKindTypeObjectEDataType = createEDataType(CHARGING_PROFILE_KIND_TYPE_OBJECT);
		chargingProfilePurposeTypeObjectEDataType = createEDataType(CHARGING_PROFILE_PURPOSE_TYPE_OBJECT);
		chargingProfileStatusObjectEDataType = createEDataType(CHARGING_PROFILE_STATUS_OBJECT);
		chargingRateUnitTypeObjectEDataType = createEDataType(CHARGING_RATE_UNIT_TYPE_OBJECT);
		ciString20TypeEDataType = createEDataType(CI_STRING20_TYPE);
		ciString255TypeEDataType = createEDataType(CI_STRING255_TYPE);
		ciString25TypeEDataType = createEDataType(CI_STRING25_TYPE);
		ciString500TypeEDataType = createEDataType(CI_STRING500_TYPE);
		ciString50TypeEDataType = createEDataType(CI_STRING50_TYPE);
		clearCacheStatusObjectEDataType = createEDataType(CLEAR_CACHE_STATUS_OBJECT);
		clearChargingProfileStatusObjectEDataType = createEDataType(CLEAR_CHARGING_PROFILE_STATUS_OBJECT);
		configurationStatusObjectEDataType = createEDataType(CONFIGURATION_STATUS_OBJECT);
		dataTransferStatusObjectEDataType = createEDataType(DATA_TRANSFER_STATUS_OBJECT);
		decimalOneEDataType = createEDataType(DECIMAL_ONE);
		getCompositeScheduleStatusObjectEDataType = createEDataType(GET_COMPOSITE_SCHEDULE_STATUS_OBJECT);
		idTokenEDataType = createEDataType(ID_TOKEN);
		messageTriggerObjectEDataType = createEDataType(MESSAGE_TRIGGER_OBJECT);
		recurrencyKindTypeObjectEDataType = createEDataType(RECURRENCY_KIND_TYPE_OBJECT);
		remoteStartStopStatusObjectEDataType = createEDataType(REMOTE_START_STOP_STATUS_OBJECT);
		reservationStatusObjectEDataType = createEDataType(RESERVATION_STATUS_OBJECT);
		resetStatusObjectEDataType = createEDataType(RESET_STATUS_OBJECT);
		resetTypeObjectEDataType = createEDataType(RESET_TYPE_OBJECT);
		triggerMessageStatusObjectEDataType = createEDataType(TRIGGER_MESSAGE_STATUS_OBJECT);
		unlockStatusObjectEDataType = createEDataType(UNLOCK_STATUS_OBJECT);
		updateStatusObjectEDataType = createEDataType(UPDATE_STATUS_OBJECT);
		updateTypeObjectEDataType = createEDataType(UPDATE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(authorizationDataEClass, AuthorizationData.class, "AuthorizationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationData_IdTag(), this.getIdToken(), "idTag", null, 1, 1, AuthorizationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationData_IdTagInfo(), this.getIdTagInfo(), null, "idTagInfo", null, 0, 1, AuthorizationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelReservationRequestEClass, CancelReservationRequest.class, "CancelReservationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCancelReservationRequest_ReservationId(), theXMLTypePackage.getInt(), "reservationId", null, 1, 1, CancelReservationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelReservationResponseEClass, CancelReservationResponse.class, "CancelReservationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCancelReservationResponse_Status(), this.getCancelReservationStatus(), "status", null, 1, 1, CancelReservationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeAvailabilityRequestEClass, ChangeAvailabilityRequest.class, "ChangeAvailabilityRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeAvailabilityRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, ChangeAvailabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeAvailabilityRequest_Type(), this.getAvailabilityType(), "type", null, 1, 1, ChangeAvailabilityRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeAvailabilityResponseEClass, ChangeAvailabilityResponse.class, "ChangeAvailabilityResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeAvailabilityResponse_Status(), this.getAvailabilityStatus(), "status", null, 1, 1, ChangeAvailabilityResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeConfigurationRequestEClass, ChangeConfigurationRequest.class, "ChangeConfigurationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeConfigurationRequest_Key(), this.getCiString50Type(), "key", null, 1, 1, ChangeConfigurationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeConfigurationRequest_Value(), this.getCiString500Type(), "value", null, 1, 1, ChangeConfigurationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeConfigurationResponseEClass, ChangeConfigurationResponse.class, "ChangeConfigurationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeConfigurationResponse_Status(), this.getConfigurationStatus(), "status", null, 1, 1, ChangeConfigurationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chargingProfileEClass, ChargingProfile.class, "ChargingProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChargingProfile_ChargingProfileId(), theXMLTypePackage.getInt(), "chargingProfileId", null, 1, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_TransactionId(), theXMLTypePackage.getInt(), "transactionId", null, 0, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_StackLevel(), theXMLTypePackage.getInt(), "stackLevel", null, 1, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_ChargingProfilePurpose(), this.getChargingProfilePurposeType(), "chargingProfilePurpose", null, 1, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_ChargingProfileKind(), this.getChargingProfileKindType(), "chargingProfileKind", null, 1, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_RecurrencyKind(), this.getRecurrencyKindType(), "recurrencyKind", null, 0, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_ValidFrom(), theXMLTypePackage.getDateTime(), "validFrom", null, 0, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingProfile_ValidTo(), theXMLTypePackage.getDateTime(), "validTo", null, 0, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChargingProfile_ChargingSchedule(), this.getChargingSchedule(), null, "chargingSchedule", null, 1, 1, ChargingProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chargingScheduleEClass, ChargingSchedule.class, "ChargingSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChargingSchedule_Duration(), theXMLTypePackage.getInt(), "duration", null, 0, 1, ChargingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingSchedule_StartSchedule(), theXMLTypePackage.getDateTime(), "startSchedule", null, 0, 1, ChargingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingSchedule_ChargingRateUnit(), this.getChargingRateUnitType(), "chargingRateUnit", null, 1, 1, ChargingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChargingSchedule_ChargingSchedulePeriod(), this.getChargingSchedulePeriod(), null, "chargingSchedulePeriod", null, 1, -1, ChargingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingSchedule_MinChargingRate(), this.getDecimalOne(), "minChargingRate", null, 0, 1, ChargingSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chargingSchedulePeriodEClass, ChargingSchedulePeriod.class, "ChargingSchedulePeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChargingSchedulePeriod_StartPeriod(), theXMLTypePackage.getInt(), "startPeriod", null, 1, 1, ChargingSchedulePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingSchedulePeriod_Limit(), this.getDecimalOne(), "limit", null, 1, 1, ChargingSchedulePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingSchedulePeriod_NumberPhases(), theXMLTypePackage.getInt(), "numberPhases", null, 0, 1, ChargingSchedulePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearCacheRequestEClass, ClearCacheRequest.class, "ClearCacheRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearCacheResponseEClass, ClearCacheResponse.class, "ClearCacheResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClearCacheResponse_Status(), this.getClearCacheStatus(), "status", null, 1, 1, ClearCacheResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearChargingProfileRequestEClass, ClearChargingProfileRequest.class, "ClearChargingProfileRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClearChargingProfileRequest_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, ClearChargingProfileRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClearChargingProfileRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 0, 1, ClearChargingProfileRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClearChargingProfileRequest_ChargingProfilePurpose(), this.getChargingProfilePurposeType(), "chargingProfilePurpose", null, 0, 1, ClearChargingProfileRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClearChargingProfileRequest_StackLevel(), theXMLTypePackage.getInt(), "stackLevel", null, 0, 1, ClearChargingProfileRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearChargingProfileResponseEClass, ClearChargingProfileResponse.class, "ClearChargingProfileResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClearChargingProfileResponse_Status(), this.getClearChargingProfileStatus(), "status", null, 1, 1, ClearChargingProfileResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTransferRequestEClass, DataTransferRequest.class, "DataTransferRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTransferRequest_VendorId(), this.getCiString255Type(), "vendorId", null, 1, 1, DataTransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTransferRequest_MessageId(), this.getCiString50Type(), "messageId", null, 0, 1, DataTransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTransferRequest_Data(), theXMLTypePackage.getString(), "data", null, 0, 1, DataTransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTransferResponseEClass, DataTransferResponse.class, "DataTransferResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTransferResponse_Status(), this.getDataTransferStatus(), "status", null, 1, 1, DataTransferResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTransferResponse_Data(), theXMLTypePackage.getString(), "data", null, 0, 1, DataTransferResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CancelReservationRequest(), this.getCancelReservationRequest(), null, "cancelReservationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CancelReservationResponse(), this.getCancelReservationResponse(), null, "cancelReservationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeAvailabilityRequest(), this.getChangeAvailabilityRequest(), null, "changeAvailabilityRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeAvailabilityResponse(), this.getChangeAvailabilityResponse(), null, "changeAvailabilityResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeConfigurationRequest(), this.getChangeConfigurationRequest(), null, "changeConfigurationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeConfigurationResponse(), this.getChangeConfigurationResponse(), null, "changeConfigurationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ChargeBoxIdentity(), theXMLTypePackage.getString(), "chargeBoxIdentity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClearCacheRequest(), this.getClearCacheRequest(), null, "clearCacheRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClearCacheResponse(), this.getClearCacheResponse(), null, "clearCacheResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClearChargingProfileRequest(), this.getClearChargingProfileRequest(), null, "clearChargingProfileRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClearChargingProfileResponse(), this.getClearChargingProfileResponse(), null, "clearChargingProfileResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataTransferRequest(), this.getDataTransferRequest(), null, "dataTransferRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataTransferResponse(), this.getDataTransferResponse(), null, "dataTransferResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCompositeScheduleRequest(), this.getGetCompositeScheduleRequest(), null, "getCompositeScheduleRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetCompositeScheduleResponse(), this.getGetCompositeScheduleResponse(), null, "getCompositeScheduleResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConfigurationRequest(), this.getGetConfigurationRequest(), null, "getConfigurationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetConfigurationResponse(), this.getGetConfigurationResponse(), null, "getConfigurationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetDiagnosticsRequest(), this.getGetDiagnosticsRequest(), null, "getDiagnosticsRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetDiagnosticsResponse(), this.getGetDiagnosticsResponse(), null, "getDiagnosticsResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetLocalListVersionRequest(), this.getGetLocalListVersionRequest(), null, "getLocalListVersionRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GetLocalListVersionResponse(), this.getGetLocalListVersionResponse(), null, "getLocalListVersionResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoteStartTransactionRequest(), this.getRemoteStartTransactionRequest(), null, "remoteStartTransactionRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoteStartTransactionResponse(), this.getRemoteStartTransactionResponse(), null, "remoteStartTransactionResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoteStopTransactionRequest(), this.getRemoteStopTransactionRequest(), null, "remoteStopTransactionRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemoteStopTransactionResponse(), this.getRemoteStopTransactionResponse(), null, "remoteStopTransactionResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReserveNowRequest(), this.getReserveNowRequest(), null, "reserveNowRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReserveNowResponse(), this.getReserveNowResponse(), null, "reserveNowResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ResetRequest(), this.getResetRequest(), null, "resetRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ResetResponse(), this.getResetResponse(), null, "resetResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SendLocalListRequest(), this.getSendLocalListRequest(), null, "sendLocalListRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SendLocalListResponse(), this.getSendLocalListResponse(), null, "sendLocalListResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SetChargingProfileRequest(), this.getSetChargingProfileRequest(), null, "setChargingProfileRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SetChargingProfileResponse(), this.getSetChargingProfileResponse(), null, "setChargingProfileResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TriggerMessageRequest(), this.getTriggerMessageRequest(), null, "triggerMessageRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TriggerMessageResponse(), this.getTriggerMessageResponse(), null, "triggerMessageResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnlockConnectorRequest(), this.getUnlockConnectorRequest(), null, "unlockConnectorRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UnlockConnectorResponse(), this.getUnlockConnectorResponse(), null, "unlockConnectorResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdateFirmwareRequest(), this.getUpdateFirmwareRequest(), null, "updateFirmwareRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdateFirmwareResponse(), this.getUpdateFirmwareResponse(), null, "updateFirmwareResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(getCompositeScheduleRequestEClass, GetCompositeScheduleRequest.class, "GetCompositeScheduleRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetCompositeScheduleRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, GetCompositeScheduleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCompositeScheduleRequest_Duration(), theXMLTypePackage.getInt(), "duration", null, 1, 1, GetCompositeScheduleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCompositeScheduleRequest_ChargingRateUnit(), this.getChargingRateUnitType(), "chargingRateUnit", null, 0, 1, GetCompositeScheduleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getCompositeScheduleResponseEClass, GetCompositeScheduleResponse.class, "GetCompositeScheduleResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetCompositeScheduleResponse_Status(), this.getGetCompositeScheduleStatus(), "status", null, 1, 1, GetCompositeScheduleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCompositeScheduleResponse_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 0, 1, GetCompositeScheduleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetCompositeScheduleResponse_ScheduleStart(), theXMLTypePackage.getDateTime(), "scheduleStart", null, 0, 1, GetCompositeScheduleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetCompositeScheduleResponse_ChargingSchedule(), this.getChargingSchedule(), null, "chargingSchedule", null, 0, 1, GetCompositeScheduleResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConfigurationRequestEClass, GetConfigurationRequest.class, "GetConfigurationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetConfigurationRequest_Key(), this.getCiString50Type(), "key", null, 0, -1, GetConfigurationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getConfigurationResponseEClass, GetConfigurationResponse.class, "GetConfigurationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetConfigurationResponse_ConfigurationKey(), this.getKeyValue(), null, "configurationKey", null, 0, -1, GetConfigurationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetConfigurationResponse_UnknownKey(), this.getCiString50Type(), "unknownKey", null, 0, -1, GetConfigurationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDiagnosticsRequestEClass, GetDiagnosticsRequest.class, "GetDiagnosticsRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetDiagnosticsRequest_Location(), theXMLTypePackage.getAnyURI(), "location", null, 1, 1, GetDiagnosticsRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetDiagnosticsRequest_StartTime(), theXMLTypePackage.getDateTime(), "startTime", null, 0, 1, GetDiagnosticsRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetDiagnosticsRequest_StopTime(), theXMLTypePackage.getDateTime(), "stopTime", null, 0, 1, GetDiagnosticsRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetDiagnosticsRequest_Retries(), theXMLTypePackage.getInt(), "retries", null, 0, 1, GetDiagnosticsRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetDiagnosticsRequest_RetryInterval(), theXMLTypePackage.getInt(), "retryInterval", null, 0, 1, GetDiagnosticsRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getDiagnosticsResponseEClass, GetDiagnosticsResponse.class, "GetDiagnosticsResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetDiagnosticsResponse_FileName(), this.getCiString255Type(), "fileName", null, 0, 1, GetDiagnosticsResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getLocalListVersionRequestEClass, GetLocalListVersionRequest.class, "GetLocalListVersionRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getLocalListVersionResponseEClass, GetLocalListVersionResponse.class, "GetLocalListVersionResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetLocalListVersionResponse_ListVersion(), theXMLTypePackage.getInt(), "listVersion", null, 1, 1, GetLocalListVersionResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idTagInfoEClass, IdTagInfo.class, "IdTagInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdTagInfo_Status(), this.getAuthorizationStatus(), "status", null, 1, 1, IdTagInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdTagInfo_ExpiryDate(), theXMLTypePackage.getDateTime(), "expiryDate", null, 0, 1, IdTagInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdTagInfo_ParentIdTag(), this.getIdToken(), "parentIdTag", null, 0, 1, IdTagInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValue_Key(), this.getCiString50Type(), "key", null, 1, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValue_Readonly(), theXMLTypePackage.getBoolean(), "readonly", null, 1, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValue_Value(), this.getCiString500Type(), "value", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteStartTransactionRequestEClass, RemoteStartTransactionRequest.class, "RemoteStartTransactionRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteStartTransactionRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 0, 1, RemoteStartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteStartTransactionRequest_IdTag(), this.getIdToken(), "idTag", null, 1, 1, RemoteStartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteStartTransactionRequest_ChargingProfile(), this.getChargingProfile(), null, "chargingProfile", null, 0, 1, RemoteStartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteStartTransactionResponseEClass, RemoteStartTransactionResponse.class, "RemoteStartTransactionResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteStartTransactionResponse_Status(), this.getRemoteStartStopStatus(), "status", null, 1, 1, RemoteStartTransactionResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteStopTransactionRequestEClass, RemoteStopTransactionRequest.class, "RemoteStopTransactionRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteStopTransactionRequest_TransactionId(), theXMLTypePackage.getInt(), "transactionId", null, 1, 1, RemoteStopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteStopTransactionResponseEClass, RemoteStopTransactionResponse.class, "RemoteStopTransactionResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteStopTransactionResponse_Status(), this.getRemoteStartStopStatus(), "status", null, 1, 1, RemoteStopTransactionResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reserveNowRequestEClass, ReserveNowRequest.class, "ReserveNowRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReserveNowRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, ReserveNowRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveNowRequest_ExpiryDate(), theXMLTypePackage.getDateTime(), "expiryDate", null, 1, 1, ReserveNowRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveNowRequest_IdTag(), this.getIdToken(), "idTag", null, 1, 1, ReserveNowRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveNowRequest_ParentIdTag(), this.getIdToken(), "parentIdTag", null, 0, 1, ReserveNowRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserveNowRequest_ReservationId(), theXMLTypePackage.getInt(), "reservationId", null, 1, 1, ReserveNowRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reserveNowResponseEClass, ReserveNowResponse.class, "ReserveNowResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReserveNowResponse_Status(), this.getReservationStatus(), "status", null, 1, 1, ReserveNowResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetRequestEClass, ResetRequest.class, "ResetRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResetRequest_Type(), this.getResetType(), "type", null, 1, 1, ResetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetResponseEClass, ResetResponse.class, "ResetResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResetResponse_Status(), this.getResetStatus(), "status", null, 1, 1, ResetResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendLocalListRequestEClass, SendLocalListRequest.class, "SendLocalListRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendLocalListRequest_ListVersion(), theXMLTypePackage.getInt(), "listVersion", null, 1, 1, SendLocalListRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendLocalListRequest_LocalAuthorizationList(), this.getAuthorizationData(), null, "localAuthorizationList", null, 0, -1, SendLocalListRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendLocalListRequest_UpdateType(), this.getUpdateType(), "updateType", null, 1, 1, SendLocalListRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendLocalListResponseEClass, SendLocalListResponse.class, "SendLocalListResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendLocalListResponse_Status(), this.getUpdateStatus(), "status", null, 1, 1, SendLocalListResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setChargingProfileRequestEClass, SetChargingProfileRequest.class, "SetChargingProfileRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetChargingProfileRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, SetChargingProfileRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetChargingProfileRequest_CsChargingProfiles(), this.getChargingProfile(), null, "csChargingProfiles", null, 1, 1, SetChargingProfileRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setChargingProfileResponseEClass, SetChargingProfileResponse.class, "SetChargingProfileResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetChargingProfileResponse_Status(), this.getChargingProfileStatus(), "status", null, 1, 1, SetChargingProfileResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerMessageRequestEClass, TriggerMessageRequest.class, "TriggerMessageRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerMessageRequest_RequestedMessage(), this.getMessageTrigger(), "requestedMessage", null, 1, 1, TriggerMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerMessageRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 0, 1, TriggerMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerMessageResponseEClass, TriggerMessageResponse.class, "TriggerMessageResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerMessageResponse_Status(), this.getTriggerMessageStatus(), "status", null, 1, 1, TriggerMessageResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockConnectorRequestEClass, UnlockConnectorRequest.class, "UnlockConnectorRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnlockConnectorRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, UnlockConnectorRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockConnectorResponseEClass, UnlockConnectorResponse.class, "UnlockConnectorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnlockConnectorResponse_Status(), this.getUnlockStatus(), "status", null, 1, 1, UnlockConnectorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateFirmwareRequestEClass, UpdateFirmwareRequest.class, "UpdateFirmwareRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateFirmwareRequest_RetrieveDate(), theXMLTypePackage.getDateTime(), "retrieveDate", null, 1, 1, UpdateFirmwareRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateFirmwareRequest_Location(), theXMLTypePackage.getAnyURI(), "location", null, 1, 1, UpdateFirmwareRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateFirmwareRequest_Retries(), theXMLTypePackage.getInt(), "retries", null, 0, 1, UpdateFirmwareRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateFirmwareRequest_RetryInterval(), theXMLTypePackage.getInt(), "retryInterval", null, 0, 1, UpdateFirmwareRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateFirmwareResponseEClass, UpdateFirmwareResponse.class, "UpdateFirmwareResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(authorizationStatusEEnum, AuthorizationStatus.class, "AuthorizationStatus");
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.ACCEPTED);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.BLOCKED);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.EXPIRED);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.INVALID);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.CONCURRENT_TX);

		initEEnum(availabilityStatusEEnum, AvailabilityStatus.class, "AvailabilityStatus");
		addEEnumLiteral(availabilityStatusEEnum, AvailabilityStatus.ACCEPTED);
		addEEnumLiteral(availabilityStatusEEnum, AvailabilityStatus.REJECTED);
		addEEnumLiteral(availabilityStatusEEnum, AvailabilityStatus.SCHEDULED);

		initEEnum(availabilityTypeEEnum, AvailabilityType.class, "AvailabilityType");
		addEEnumLiteral(availabilityTypeEEnum, AvailabilityType.INOPERATIVE);
		addEEnumLiteral(availabilityTypeEEnum, AvailabilityType.OPERATIVE);

		initEEnum(cancelReservationStatusEEnum, CancelReservationStatus.class, "CancelReservationStatus");
		addEEnumLiteral(cancelReservationStatusEEnum, CancelReservationStatus.ACCEPTED);
		addEEnumLiteral(cancelReservationStatusEEnum, CancelReservationStatus.REJECTED);

		initEEnum(chargingProfileKindTypeEEnum, ChargingProfileKindType.class, "ChargingProfileKindType");
		addEEnumLiteral(chargingProfileKindTypeEEnum, ChargingProfileKindType.ABSOLUTE);
		addEEnumLiteral(chargingProfileKindTypeEEnum, ChargingProfileKindType.RECURRING);
		addEEnumLiteral(chargingProfileKindTypeEEnum, ChargingProfileKindType.RELATIVE);

		initEEnum(chargingProfilePurposeTypeEEnum, ChargingProfilePurposeType.class, "ChargingProfilePurposeType");
		addEEnumLiteral(chargingProfilePurposeTypeEEnum, ChargingProfilePurposeType.CHARGE_POINT_MAX_PROFILE);
		addEEnumLiteral(chargingProfilePurposeTypeEEnum, ChargingProfilePurposeType.TX_DEFAULT_PROFILE);
		addEEnumLiteral(chargingProfilePurposeTypeEEnum, ChargingProfilePurposeType.TX_PROFILE);

		initEEnum(chargingProfileStatusEEnum, ChargingProfileStatus.class, "ChargingProfileStatus");
		addEEnumLiteral(chargingProfileStatusEEnum, ChargingProfileStatus.ACCEPTED);
		addEEnumLiteral(chargingProfileStatusEEnum, ChargingProfileStatus.REJECTED);
		addEEnumLiteral(chargingProfileStatusEEnum, ChargingProfileStatus.NOT_SUPPORTED);

		initEEnum(chargingRateUnitTypeEEnum, ChargingRateUnitType.class, "ChargingRateUnitType");
		addEEnumLiteral(chargingRateUnitTypeEEnum, ChargingRateUnitType.W);
		addEEnumLiteral(chargingRateUnitTypeEEnum, ChargingRateUnitType.A);

		initEEnum(clearCacheStatusEEnum, ClearCacheStatus.class, "ClearCacheStatus");
		addEEnumLiteral(clearCacheStatusEEnum, ClearCacheStatus.ACCEPTED);
		addEEnumLiteral(clearCacheStatusEEnum, ClearCacheStatus.REJECTED);

		initEEnum(clearChargingProfileStatusEEnum, ClearChargingProfileStatus.class, "ClearChargingProfileStatus");
		addEEnumLiteral(clearChargingProfileStatusEEnum, ClearChargingProfileStatus.ACCEPTED);
		addEEnumLiteral(clearChargingProfileStatusEEnum, ClearChargingProfileStatus.UNKNOWN);

		initEEnum(configurationStatusEEnum, ConfigurationStatus.class, "ConfigurationStatus");
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.ACCEPTED);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.NOT_SUPPORTED);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.REBOOT_REQUIRED);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.REJECTED);

		initEEnum(dataTransferStatusEEnum, DataTransferStatus.class, "DataTransferStatus");
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.ACCEPTED);
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.REJECTED);
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.UNKNOWN_MESSAGE_ID);
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.UNKNOWN_VENDOR_ID);

		initEEnum(getCompositeScheduleStatusEEnum, GetCompositeScheduleStatus.class, "GetCompositeScheduleStatus");
		addEEnumLiteral(getCompositeScheduleStatusEEnum, GetCompositeScheduleStatus.ACCEPTED);
		addEEnumLiteral(getCompositeScheduleStatusEEnum, GetCompositeScheduleStatus.REJECTED);

		initEEnum(messageTriggerEEnum, MessageTrigger.class, "MessageTrigger");
		addEEnumLiteral(messageTriggerEEnum, MessageTrigger.BOOT_NOTIFICATION);
		addEEnumLiteral(messageTriggerEEnum, MessageTrigger.DIAGNOSTICS_STATUS_NOTIFICATION);
		addEEnumLiteral(messageTriggerEEnum, MessageTrigger.FIRMWARE_STATUS_NOTIFICATION);
		addEEnumLiteral(messageTriggerEEnum, MessageTrigger.HEARTBEAT);
		addEEnumLiteral(messageTriggerEEnum, MessageTrigger.METER_VALUES);
		addEEnumLiteral(messageTriggerEEnum, MessageTrigger.STATUS_NOTIFICATION);

		initEEnum(recurrencyKindTypeEEnum, RecurrencyKindType.class, "RecurrencyKindType");
		addEEnumLiteral(recurrencyKindTypeEEnum, RecurrencyKindType.DAILY);
		addEEnumLiteral(recurrencyKindTypeEEnum, RecurrencyKindType.WEEKLY);

		initEEnum(remoteStartStopStatusEEnum, RemoteStartStopStatus.class, "RemoteStartStopStatus");
		addEEnumLiteral(remoteStartStopStatusEEnum, RemoteStartStopStatus.ACCEPTED);
		addEEnumLiteral(remoteStartStopStatusEEnum, RemoteStartStopStatus.REJECTED);

		initEEnum(reservationStatusEEnum, ReservationStatus.class, "ReservationStatus");
		addEEnumLiteral(reservationStatusEEnum, ReservationStatus.ACCEPTED);
		addEEnumLiteral(reservationStatusEEnum, ReservationStatus.FAULTED);
		addEEnumLiteral(reservationStatusEEnum, ReservationStatus.OCCUPIED);
		addEEnumLiteral(reservationStatusEEnum, ReservationStatus.REJECTED);
		addEEnumLiteral(reservationStatusEEnum, ReservationStatus.UNAVAILABLE);

		initEEnum(resetStatusEEnum, ResetStatus.class, "ResetStatus");
		addEEnumLiteral(resetStatusEEnum, ResetStatus.ACCEPTED);
		addEEnumLiteral(resetStatusEEnum, ResetStatus.REJECTED);

		initEEnum(resetTypeEEnum, ResetType.class, "ResetType");
		addEEnumLiteral(resetTypeEEnum, ResetType.HARD);
		addEEnumLiteral(resetTypeEEnum, ResetType.SOFT);

		initEEnum(triggerMessageStatusEEnum, TriggerMessageStatus.class, "TriggerMessageStatus");
		addEEnumLiteral(triggerMessageStatusEEnum, TriggerMessageStatus.ACCEPTED);
		addEEnumLiteral(triggerMessageStatusEEnum, TriggerMessageStatus.REJECTED);
		addEEnumLiteral(triggerMessageStatusEEnum, TriggerMessageStatus.NOT_IMPLEMENTED);

		initEEnum(unlockStatusEEnum, UnlockStatus.class, "UnlockStatus");
		addEEnumLiteral(unlockStatusEEnum, UnlockStatus.UNLOCKED);
		addEEnumLiteral(unlockStatusEEnum, UnlockStatus.UNLOCK_FAILED);
		addEEnumLiteral(unlockStatusEEnum, UnlockStatus.NOT_SUPPORTED);

		initEEnum(updateStatusEEnum, UpdateStatus.class, "UpdateStatus");
		addEEnumLiteral(updateStatusEEnum, UpdateStatus.ACCEPTED);
		addEEnumLiteral(updateStatusEEnum, UpdateStatus.FAILED);
		addEEnumLiteral(updateStatusEEnum, UpdateStatus.NOT_SUPPORTED);
		addEEnumLiteral(updateStatusEEnum, UpdateStatus.VERSION_MISMATCH);

		initEEnum(updateTypeEEnum, UpdateType.class, "UpdateType");
		addEEnumLiteral(updateTypeEEnum, UpdateType.DIFFERENTIAL);
		addEEnumLiteral(updateTypeEEnum, UpdateType.FULL);

		// Initialize data types
		initEDataType(authorizationStatusObjectEDataType, AuthorizationStatus.class, "AuthorizationStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(availabilityStatusObjectEDataType, AvailabilityStatus.class, "AvailabilityStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(availabilityTypeObjectEDataType, AvailabilityType.class, "AvailabilityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cancelReservationStatusObjectEDataType, CancelReservationStatus.class, "CancelReservationStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chargingProfileKindTypeObjectEDataType, ChargingProfileKindType.class, "ChargingProfileKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chargingProfilePurposeTypeObjectEDataType, ChargingProfilePurposeType.class, "ChargingProfilePurposeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chargingProfileStatusObjectEDataType, ChargingProfileStatus.class, "ChargingProfileStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chargingRateUnitTypeObjectEDataType, ChargingRateUnitType.class, "ChargingRateUnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString20TypeEDataType, String.class, "CiString20Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString255TypeEDataType, String.class, "CiString255Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString25TypeEDataType, String.class, "CiString25Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString500TypeEDataType, String.class, "CiString500Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString50TypeEDataType, String.class, "CiString50Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(clearCacheStatusObjectEDataType, ClearCacheStatus.class, "ClearCacheStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(clearChargingProfileStatusObjectEDataType, ClearChargingProfileStatus.class, "ClearChargingProfileStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(configurationStatusObjectEDataType, ConfigurationStatus.class, "ConfigurationStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataTransferStatusObjectEDataType, DataTransferStatus.class, "DataTransferStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decimalOneEDataType, BigDecimal.class, "DecimalOne", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(getCompositeScheduleStatusObjectEDataType, GetCompositeScheduleStatus.class, "GetCompositeScheduleStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idTokenEDataType, String.class, "IdToken", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageTriggerObjectEDataType, MessageTrigger.class, "MessageTriggerObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(recurrencyKindTypeObjectEDataType, RecurrencyKindType.class, "RecurrencyKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(remoteStartStopStatusObjectEDataType, RemoteStartStopStatus.class, "RemoteStartStopStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reservationStatusObjectEDataType, ReservationStatus.class, "ReservationStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resetStatusObjectEDataType, ResetStatus.class, "ResetStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resetTypeObjectEDataType, ResetType.class, "ResetTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(triggerMessageStatusObjectEDataType, TriggerMessageStatus.class, "TriggerMessageStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlockStatusObjectEDataType, UnlockStatus.class, "UnlockStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updateStatusObjectEDataType, UpdateStatus.class, "UpdateStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updateTypeObjectEDataType, UpdateType.class, "UpdateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (authorizationDataEClass,
		   source,
		   new String[] {
			   "name", "AuthorizationData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuthorizationData_IdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAuthorizationData_IdTagInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTagInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (authorizationStatusEEnum,
		   source,
		   new String[] {
			   "name", "AuthorizationStatus"
		   });
		addAnnotation
		  (authorizationStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "AuthorizationStatus:Object",
			   "baseType", "AuthorizationStatus"
		   });
		addAnnotation
		  (availabilityStatusEEnum,
		   source,
		   new String[] {
			   "name", "AvailabilityStatus"
		   });
		addAnnotation
		  (availabilityStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "AvailabilityStatus:Object",
			   "baseType", "AvailabilityStatus"
		   });
		addAnnotation
		  (availabilityTypeEEnum,
		   source,
		   new String[] {
			   "name", "AvailabilityType"
		   });
		addAnnotation
		  (availabilityTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "AvailabilityType:Object",
			   "baseType", "AvailabilityType"
		   });
		addAnnotation
		  (cancelReservationRequestEClass,
		   source,
		   new String[] {
			   "name", "CancelReservationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCancelReservationRequest_ReservationId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reservationId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cancelReservationResponseEClass,
		   source,
		   new String[] {
			   "name", "CancelReservationResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCancelReservationResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cancelReservationStatusEEnum,
		   source,
		   new String[] {
			   "name", "CancelReservationStatus"
		   });
		addAnnotation
		  (cancelReservationStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "CancelReservationStatus:Object",
			   "baseType", "CancelReservationStatus"
		   });
		addAnnotation
		  (changeAvailabilityRequestEClass,
		   source,
		   new String[] {
			   "name", "ChangeAvailabilityRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChangeAvailabilityRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChangeAvailabilityRequest_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (changeAvailabilityResponseEClass,
		   source,
		   new String[] {
			   "name", "ChangeAvailabilityResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChangeAvailabilityResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (changeConfigurationRequestEClass,
		   source,
		   new String[] {
			   "name", "ChangeConfigurationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChangeConfigurationRequest_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChangeConfigurationRequest_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (changeConfigurationResponseEClass,
		   source,
		   new String[] {
			   "name", "ChangeConfigurationResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChangeConfigurationResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (chargingProfileEClass,
		   source,
		   new String[] {
			   "name", "ChargingProfile",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChargingProfile_ChargingProfileId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingProfileId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_TransactionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transactionId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_StackLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stackLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_ChargingProfilePurpose(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingProfilePurpose",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_ChargingProfileKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingProfileKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_RecurrencyKind(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "recurrencyKind",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_ValidFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validFrom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_ValidTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "validTo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingProfile_ChargingSchedule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingSchedule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (chargingProfileKindTypeEEnum,
		   source,
		   new String[] {
			   "name", "ChargingProfileKindType"
		   });
		addAnnotation
		  (chargingProfileKindTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChargingProfileKindType:Object",
			   "baseType", "ChargingProfileKindType"
		   });
		addAnnotation
		  (chargingProfilePurposeTypeEEnum,
		   source,
		   new String[] {
			   "name", "ChargingProfilePurposeType"
		   });
		addAnnotation
		  (chargingProfilePurposeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChargingProfilePurposeType:Object",
			   "baseType", "ChargingProfilePurposeType"
		   });
		addAnnotation
		  (chargingProfileStatusEEnum,
		   source,
		   new String[] {
			   "name", "ChargingProfileStatus"
		   });
		addAnnotation
		  (chargingProfileStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChargingProfileStatus:Object",
			   "baseType", "ChargingProfileStatus"
		   });
		addAnnotation
		  (chargingRateUnitTypeEEnum,
		   source,
		   new String[] {
			   "name", "ChargingRateUnitType"
		   });
		addAnnotation
		  (chargingRateUnitTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChargingRateUnitType:Object",
			   "baseType", "ChargingRateUnitType"
		   });
		addAnnotation
		  (chargingScheduleEClass,
		   source,
		   new String[] {
			   "name", "ChargingSchedule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChargingSchedule_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingSchedule_StartSchedule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startSchedule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingSchedule_ChargingRateUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingRateUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingSchedule_ChargingSchedulePeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingSchedulePeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingSchedule_MinChargingRate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "minChargingRate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (chargingSchedulePeriodEClass,
		   source,
		   new String[] {
			   "name", "ChargingSchedulePeriod",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getChargingSchedulePeriod_StartPeriod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startPeriod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingSchedulePeriod_Limit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "limit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getChargingSchedulePeriod_NumberPhases(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "numberPhases",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ciString20TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString20Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "20"
		   });
		addAnnotation
		  (ciString255TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString255Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (ciString25TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString25Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "25"
		   });
		addAnnotation
		  (ciString500TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString500Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "500"
		   });
		addAnnotation
		  (ciString50TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString50Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "50"
		   });
		addAnnotation
		  (clearCacheRequestEClass,
		   source,
		   new String[] {
			   "name", "ClearCacheRequest",
			   "kind", "empty"
		   });
		addAnnotation
		  (clearCacheResponseEClass,
		   source,
		   new String[] {
			   "name", "ClearCacheResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getClearCacheResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (clearCacheStatusEEnum,
		   source,
		   new String[] {
			   "name", "ClearCacheStatus"
		   });
		addAnnotation
		  (clearCacheStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ClearCacheStatus:Object",
			   "baseType", "ClearCacheStatus"
		   });
		addAnnotation
		  (clearChargingProfileRequestEClass,
		   source,
		   new String[] {
			   "name", "ClearChargingProfileRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getClearChargingProfileRequest_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getClearChargingProfileRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getClearChargingProfileRequest_ChargingProfilePurpose(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingProfilePurpose",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getClearChargingProfileRequest_StackLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stackLevel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (clearChargingProfileResponseEClass,
		   source,
		   new String[] {
			   "name", "ClearChargingProfileResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getClearChargingProfileResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (clearChargingProfileStatusEEnum,
		   source,
		   new String[] {
			   "name", "ClearChargingProfileStatus"
		   });
		addAnnotation
		  (clearChargingProfileStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ClearChargingProfileStatus:Object",
			   "baseType", "ClearChargingProfileStatus"
		   });
		addAnnotation
		  (configurationStatusEEnum,
		   source,
		   new String[] {
			   "name", "ConfigurationStatus"
		   });
		addAnnotation
		  (configurationStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ConfigurationStatus:Object",
			   "baseType", "ConfigurationStatus"
		   });
		addAnnotation
		  (dataTransferRequestEClass,
		   source,
		   new String[] {
			   "name", "DataTransferRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataTransferRequest_VendorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vendorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTransferRequest_MessageId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "messageId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTransferRequest_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataTransferResponseEClass,
		   source,
		   new String[] {
			   "name", "DataTransferResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataTransferResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTransferResponse_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataTransferStatusEEnum,
		   source,
		   new String[] {
			   "name", "DataTransferStatus"
		   });
		addAnnotation
		  (dataTransferStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "DataTransferStatus:Object",
			   "baseType", "DataTransferStatus"
		   });
		addAnnotation
		  (decimalOneEDataType,
		   source,
		   new String[] {
			   "name", "DecimalOne",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "fractionDigits", "1"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_CancelReservationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cancelReservationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CancelReservationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cancelReservationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ChangeAvailabilityRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "changeAvailabilityRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ChangeAvailabilityResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "changeAvailabilityResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ChangeConfigurationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "changeConfigurationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ChangeConfigurationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "changeConfigurationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ChargeBoxIdentity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargeBoxIdentity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ClearCacheRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clearCacheRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ClearCacheResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clearCacheResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ClearChargingProfileRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clearChargingProfileRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ClearChargingProfileResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "clearChargingProfileResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataTransferRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataTransferRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataTransferResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataTransferResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCompositeScheduleRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCompositeScheduleRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetCompositeScheduleResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getCompositeScheduleResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConfigurationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConfigurationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetConfigurationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getConfigurationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetDiagnosticsRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getDiagnosticsRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetDiagnosticsResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getDiagnosticsResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetLocalListVersionRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getLocalListVersionRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_GetLocalListVersionResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "getLocalListVersionResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RemoteStartTransactionRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "remoteStartTransactionRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RemoteStartTransactionResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "remoteStartTransactionResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RemoteStopTransactionRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "remoteStopTransactionRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_RemoteStopTransactionResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "remoteStopTransactionResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ReserveNowRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reserveNowRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ReserveNowResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reserveNowResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ResetRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "resetRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ResetResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "resetResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SendLocalListRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sendLocalListRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SendLocalListResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sendLocalListResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SetChargingProfileRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "setChargingProfileRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SetChargingProfileResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "setChargingProfileResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TriggerMessageRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "triggerMessageRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_TriggerMessageResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "triggerMessageResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnlockConnectorRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unlockConnectorRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UnlockConnectorResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unlockConnectorResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UpdateFirmwareRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateFirmwareRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_UpdateFirmwareResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateFirmwareResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompositeScheduleRequestEClass,
		   source,
		   new String[] {
			   "name", "GetCompositeScheduleRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCompositeScheduleRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetCompositeScheduleRequest_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetCompositeScheduleRequest_ChargingRateUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingRateUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompositeScheduleResponseEClass,
		   source,
		   new String[] {
			   "name", "GetCompositeScheduleResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetCompositeScheduleResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetCompositeScheduleResponse_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetCompositeScheduleResponse_ScheduleStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scheduleStart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetCompositeScheduleResponse_ChargingSchedule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingSchedule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompositeScheduleStatusEEnum,
		   source,
		   new String[] {
			   "name", "GetCompositeScheduleStatus"
		   });
		addAnnotation
		  (getCompositeScheduleStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "GetCompositeScheduleStatus:Object",
			   "baseType", "GetCompositeScheduleStatus"
		   });
		addAnnotation
		  (getConfigurationRequestEClass,
		   source,
		   new String[] {
			   "name", "GetConfigurationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConfigurationRequest_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConfigurationResponseEClass,
		   source,
		   new String[] {
			   "name", "GetConfigurationResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetConfigurationResponse_ConfigurationKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "configurationKey",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetConfigurationResponse_UnknownKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unknownKey",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDiagnosticsRequestEClass,
		   source,
		   new String[] {
			   "name", "GetDiagnosticsRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetDiagnosticsRequest_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetDiagnosticsRequest_StartTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetDiagnosticsRequest_StopTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stopTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetDiagnosticsRequest_Retries(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "retries",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGetDiagnosticsRequest_RetryInterval(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "retryInterval",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDiagnosticsResponseEClass,
		   source,
		   new String[] {
			   "name", "GetDiagnosticsResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetDiagnosticsResponse_FileName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fileName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLocalListVersionRequestEClass,
		   source,
		   new String[] {
			   "name", "GetLocalListVersionRequest",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLocalListVersionResponseEClass,
		   source,
		   new String[] {
			   "name", "GetLocalListVersionResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGetLocalListVersionResponse_ListVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (idTagInfoEClass,
		   source,
		   new String[] {
			   "name", "IdTagInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdTagInfo_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdTagInfo_ExpiryDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expiryDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdTagInfo_ParentIdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parentIdTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (idTokenEDataType,
		   source,
		   new String[] {
			   "name", "IdToken",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "20"
		   });
		addAnnotation
		  (keyValueEClass,
		   source,
		   new String[] {
			   "name", "KeyValue",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKeyValue_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyValue_Readonly(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "readonly",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyValue_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (messageTriggerEEnum,
		   source,
		   new String[] {
			   "name", "MessageTrigger"
		   });
		addAnnotation
		  (messageTriggerObjectEDataType,
		   source,
		   new String[] {
			   "name", "MessageTrigger:Object",
			   "baseType", "MessageTrigger"
		   });
		addAnnotation
		  (recurrencyKindTypeEEnum,
		   source,
		   new String[] {
			   "name", "RecurrencyKindType"
		   });
		addAnnotation
		  (recurrencyKindTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "RecurrencyKindType:Object",
			   "baseType", "RecurrencyKindType"
		   });
		addAnnotation
		  (remoteStartStopStatusEEnum,
		   source,
		   new String[] {
			   "name", "RemoteStartStopStatus"
		   });
		addAnnotation
		  (remoteStartStopStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "RemoteStartStopStatus:Object",
			   "baseType", "RemoteStartStopStatus"
		   });
		addAnnotation
		  (remoteStartTransactionRequestEClass,
		   source,
		   new String[] {
			   "name", "RemoteStartTransactionRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRemoteStartTransactionRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteStartTransactionRequest_IdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRemoteStartTransactionRequest_ChargingProfile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargingProfile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (remoteStartTransactionResponseEClass,
		   source,
		   new String[] {
			   "name", "RemoteStartTransactionResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRemoteStartTransactionResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (remoteStopTransactionRequestEClass,
		   source,
		   new String[] {
			   "name", "RemoteStopTransactionRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRemoteStopTransactionRequest_TransactionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transactionId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (remoteStopTransactionResponseEClass,
		   source,
		   new String[] {
			   "name", "RemoteStopTransactionResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRemoteStopTransactionResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reservationStatusEEnum,
		   source,
		   new String[] {
			   "name", "ReservationStatus"
		   });
		addAnnotation
		  (reservationStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ReservationStatus:Object",
			   "baseType", "ReservationStatus"
		   });
		addAnnotation
		  (reserveNowRequestEClass,
		   source,
		   new String[] {
			   "name", "ReserveNowRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReserveNowRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReserveNowRequest_ExpiryDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expiryDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReserveNowRequest_IdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReserveNowRequest_ParentIdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parentIdTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getReserveNowRequest_ReservationId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reservationId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (reserveNowResponseEClass,
		   source,
		   new String[] {
			   "name", "ReserveNowResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReserveNowResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resetRequestEClass,
		   source,
		   new String[] {
			   "name", "ResetRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResetRequest_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resetResponseEClass,
		   source,
		   new String[] {
			   "name", "ResetResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getResetResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (resetStatusEEnum,
		   source,
		   new String[] {
			   "name", "ResetStatus"
		   });
		addAnnotation
		  (resetStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ResetStatus:Object",
			   "baseType", "ResetStatus"
		   });
		addAnnotation
		  (resetTypeEEnum,
		   source,
		   new String[] {
			   "name", "ResetType"
		   });
		addAnnotation
		  (resetTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ResetType:Object",
			   "baseType", "ResetType"
		   });
		addAnnotation
		  (sendLocalListRequestEClass,
		   source,
		   new String[] {
			   "name", "SendLocalListRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSendLocalListRequest_ListVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "listVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSendLocalListRequest_LocalAuthorizationList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "localAuthorizationList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSendLocalListRequest_UpdateType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "updateType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sendLocalListResponseEClass,
		   source,
		   new String[] {
			   "name", "SendLocalListResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSendLocalListResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (setChargingProfileRequestEClass,
		   source,
		   new String[] {
			   "name", "SetChargingProfileRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSetChargingProfileRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSetChargingProfileRequest_CsChargingProfiles(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "csChargingProfiles",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (setChargingProfileResponseEClass,
		   source,
		   new String[] {
			   "name", "SetChargingProfileResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSetChargingProfileResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (triggerMessageRequestEClass,
		   source,
		   new String[] {
			   "name", "TriggerMessageRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTriggerMessageRequest_RequestedMessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requestedMessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTriggerMessageRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (triggerMessageResponseEClass,
		   source,
		   new String[] {
			   "name", "TriggerMessageResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTriggerMessageResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (triggerMessageStatusEEnum,
		   source,
		   new String[] {
			   "name", "TriggerMessageStatus"
		   });
		addAnnotation
		  (triggerMessageStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "TriggerMessageStatus:Object",
			   "baseType", "TriggerMessageStatus"
		   });
		addAnnotation
		  (unlockConnectorRequestEClass,
		   source,
		   new String[] {
			   "name", "UnlockConnectorRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnlockConnectorRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unlockConnectorResponseEClass,
		   source,
		   new String[] {
			   "name", "UnlockConnectorResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnlockConnectorResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unlockStatusEEnum,
		   source,
		   new String[] {
			   "name", "UnlockStatus"
		   });
		addAnnotation
		  (unlockStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "UnlockStatus:Object",
			   "baseType", "UnlockStatus"
		   });
		addAnnotation
		  (updateFirmwareRequestEClass,
		   source,
		   new String[] {
			   "name", "UpdateFirmwareRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUpdateFirmwareRequest_RetrieveDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "retrieveDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateFirmwareRequest_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateFirmwareRequest_Retries(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "retries",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUpdateFirmwareRequest_RetryInterval(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "retryInterval",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (updateFirmwareResponseEClass,
		   source,
		   new String[] {
			   "name", "UpdateFirmwareResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (updateStatusEEnum,
		   source,
		   new String[] {
			   "name", "UpdateStatus"
		   });
		addAnnotation
		  (updateStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "UpdateStatus:Object",
			   "baseType", "UpdateStatus"
		   });
		addAnnotation
		  (updateTypeEEnum,
		   source,
		   new String[] {
			   "name", "UpdateType"
		   });
		addAnnotation
		  (updateTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "UpdateType:Object",
			   "baseType", "UpdateType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (authorizationStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the authorization-status-value"
		   });
		addAnnotation
		  (availabilityStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the availability-status-value"
		   });
		addAnnotation
		  (availabilityTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the availability-type-value"
		   });
		addAnnotation
		  (cancelReservationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the CancelReservation.req PDU"
		   });
		addAnnotation
		  (cancelReservationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the CancelReservation.conf PDU"
		   });
		addAnnotation
		  (changeAvailabilityRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ChangeAvailability.req PDU"
		   });
		addAnnotation
		  (changeAvailabilityResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ChangeAvailability.conf PDU"
		   });
		addAnnotation
		  (changeConfigurationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ChangeConfiguration.req PDU"
		   });
		addAnnotation
		  (changeConfigurationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ChangeConfiguration.conf PDU"
		   });
		addAnnotation
		  (chargingProfilePurposeTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the charging-profile-purpose-type-value"
		   });
		addAnnotation
		  (ciString20TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 20 printable characters. To be treated as case insensitive."
		   });
		addAnnotation
		  (ciString255TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 255 printable characters. To be treated as case insensitive."
		   });
		addAnnotation
		  (ciString25TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 25 printable characters. To be treated as case insensitive."
		   });
		addAnnotation
		  (ciString500TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 500 printable characters. To be treated as case insensitive."
		   });
		addAnnotation
		  (ciString50TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 50 printable characters. To be treated as case insensitive."
		   });
		addAnnotation
		  (clearCacheRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ClearCache.req PDU"
		   });
		addAnnotation
		  (clearCacheResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ClearCache.conf PDU"
		   });
		addAnnotation
		  (clearCacheStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the clear-cache-status-value"
		   });
		addAnnotation
		  (clearChargingProfileRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ClearChargingProfile.req PDU"
		   });
		addAnnotation
		  (clearChargingProfileResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ClearChargingProfile.conf PDU"
		   });
		addAnnotation
		  (clearChargingProfileStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the clear-charging-profile-status-value"
		   });
		addAnnotation
		  (configurationStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the configuration-status-value"
		   });
		addAnnotation
		  (dataTransferRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the DataTransfer.req PDU"
		   });
		addAnnotation
		  (dataTransferResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the DataTransfer.conf PDU"
		   });
		addAnnotation
		  (dataTransferStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the status returned in DataTransfer.conf"
		   });
		addAnnotation
		  (decimalOneEDataType,
		   source,
		   new String[] {
			   "documentation", "Decimal with one digit fraction"
		   });
		addAnnotation
		  (getCompositeScheduleRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetCompositeSchedule.req PDU"
		   });
		addAnnotation
		  (getCompositeScheduleResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetCompositeSchedule.conf PDU"
		   });
		addAnnotation
		  (getConfigurationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetConfiguration.req PDU"
		   });
		addAnnotation
		  (getConfigurationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetConfiguration.req PDU"
		   });
		addAnnotation
		  (getDiagnosticsRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetDiagnostics.req PDU"
		   });
		addAnnotation
		  (getDiagnosticsResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetDiagnostics.conf PDU"
		   });
		addAnnotation
		  (getLocalListVersionRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetLocalListVersion.req PDU"
		   });
		addAnnotation
		  (getLocalListVersionResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the GetLocalListVersion.conf PDU"
		   });
		addAnnotation
		  (idTokenEDataType,
		   source,
		   new String[] {
			   "documentation", "Type of string defining identification token, e.g. RFID or credit card number. To be treated as case insensitive."
		   });
		addAnnotation
		  (keyValueEClass,
		   source,
		   new String[] {
			   "documentation", "Key-Value pairs returned by GetConfiguration.conf PDU"
		   });
		addAnnotation
		  (remoteStartStopStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the remote-start-stop-status-value"
		   });
		addAnnotation
		  (remoteStartTransactionRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the RemoteStartTransaction.req PDU"
		   });
		addAnnotation
		  (remoteStartTransactionResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the RemoteStartTransaction.conf PDU"
		   });
		addAnnotation
		  (remoteStopTransactionRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the RemoteStopTransaction.req PDU"
		   });
		addAnnotation
		  (remoteStopTransactionResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the RemoteStopTransaction.conf PDU"
		   });
		addAnnotation
		  (reserveNowRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ReserveNow.req PDU"
		   });
		addAnnotation
		  (reserveNowResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the ReserveNow.conf PDU"
		   });
		addAnnotation
		  (resetRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the Reset.req PDU"
		   });
		addAnnotation
		  (resetStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the reset-status-value"
		   });
		addAnnotation
		  (resetTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the reset-type-value"
		   });
		addAnnotation
		  (sendLocalListRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the SendLocalList.req PDU"
		   });
		addAnnotation
		  (sendLocalListResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the SendLocalList.conf PDU"
		   });
		addAnnotation
		  (setChargingProfileRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the SetChargingProfile.req PDU"
		   });
		addAnnotation
		  (setChargingProfileResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the SetChargingProfile.conf PDU"
		   });
		addAnnotation
		  (triggerMessageRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the TriggerMessage.req PDU"
		   });
		addAnnotation
		  (triggerMessageResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the TriggerMessage.conf PDU"
		   });
		addAnnotation
		  (unlockConnectorRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the UnlockConnector.req PDU"
		   });
		addAnnotation
		  (unlockConnectorResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the UnlockConnector.conf PDU"
		   });
		addAnnotation
		  (unlockStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the unlock-status-value"
		   });
		addAnnotation
		  (updateFirmwareRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the UpdateFirmware.req PDU"
		   });
		addAnnotation
		  (updateFirmwareResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the UpdateFirmware.conf PDU"
		   });
	}

} //OcppChargePointPackageImpl
