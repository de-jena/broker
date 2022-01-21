/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointFactory
 * @model kind="package"
 * @generated
 */
public interface OcppChargePointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chargepoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn://Ocpp/Cp/2015/10/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OcppChargePoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppChargePointPackage eINSTANCE = de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.AuthorizationDataImpl <em>Authorization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.AuthorizationDataImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAuthorizationData()
	 * @generated
	 */
	int AUTHORIZATION_DATA = 0;

	/**
	 * The feature id for the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA__ID_TAG = 0;

	/**
	 * The feature id for the '<em><b>Id Tag Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA__ID_TAG_INFO = 1;

	/**
	 * The number of structural features of the '<em>Authorization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authorization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationRequestImpl <em>Cancel Reservation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationRequest()
	 * @generated
	 */
	int CANCEL_RESERVATION_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_RESERVATION_REQUEST__RESERVATION_ID = 0;

	/**
	 * The number of structural features of the '<em>Cancel Reservation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_RESERVATION_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cancel Reservation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_RESERVATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationResponseImpl <em>Cancel Reservation Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationResponse()
	 * @generated
	 */
	int CANCEL_RESERVATION_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_RESERVATION_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Cancel Reservation Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_RESERVATION_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cancel Reservation Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_RESERVATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityRequestImpl <em>Change Availability Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeAvailabilityRequest()
	 * @generated
	 */
	int CHANGE_AVAILABILITY_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_REQUEST__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Change Availability Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Change Availability Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityResponseImpl <em>Change Availability Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeAvailabilityResponse()
	 * @generated
	 */
	int CHANGE_AVAILABILITY_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Change Availability Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Change Availability Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AVAILABILITY_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationRequestImpl <em>Change Configuration Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeConfigurationRequest()
	 * @generated
	 */
	int CHANGE_CONFIGURATION_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_REQUEST__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_REQUEST__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Change Configuration Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Change Configuration Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationResponseImpl <em>Change Configuration Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeConfigurationResponse()
	 * @generated
	 */
	int CHANGE_CONFIGURATION_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Change Configuration Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Change Configuration Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CONFIGURATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl <em>Charging Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfile()
	 * @generated
	 */
	int CHARGING_PROFILE = 7;

	/**
	 * The feature id for the '<em><b>Charging Profile Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__CHARGING_PROFILE_ID = 0;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__TRANSACTION_ID = 1;

	/**
	 * The feature id for the '<em><b>Stack Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__STACK_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Charging Profile Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE = 3;

	/**
	 * The feature id for the '<em><b>Charging Profile Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__CHARGING_PROFILE_KIND = 4;

	/**
	 * The feature id for the '<em><b>Recurrency Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__RECURRENCY_KIND = 5;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__VALID_FROM = 6;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__VALID_TO = 7;

	/**
	 * The feature id for the '<em><b>Charging Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE__CHARGING_SCHEDULE = 8;

	/**
	 * The number of structural features of the '<em>Charging Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Charging Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl <em>Charging Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingSchedule()
	 * @generated
	 */
	int CHARGING_SCHEDULE = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Start Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE__START_SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Charging Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE__CHARGING_RATE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Charging Schedule Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD = 3;

	/**
	 * The feature id for the '<em><b>Min Charging Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE__MIN_CHARGING_RATE = 4;

	/**
	 * The number of structural features of the '<em>Charging Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Charging Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl <em>Charging Schedule Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingSchedulePeriod()
	 * @generated
	 */
	int CHARGING_SCHEDULE_PERIOD = 9;

	/**
	 * The feature id for the '<em><b>Start Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_PERIOD__START_PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_PERIOD__LIMIT = 1;

	/**
	 * The feature id for the '<em><b>Number Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES = 2;

	/**
	 * The number of structural features of the '<em>Charging Schedule Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_PERIOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Charging Schedule Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_SCHEDULE_PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheRequestImpl <em>Clear Cache Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheRequest()
	 * @generated
	 */
	int CLEAR_CACHE_REQUEST = 10;

	/**
	 * The number of structural features of the '<em>Clear Cache Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CACHE_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Clear Cache Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CACHE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheResponseImpl <em>Clear Cache Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheResponse()
	 * @generated
	 */
	int CLEAR_CACHE_RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CACHE_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Clear Cache Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CACHE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clear Cache Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CACHE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl <em>Clear Charging Profile Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileRequest()
	 * @generated
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Charging Profile Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Stack Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Clear Charging Profile Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Clear Charging Profile Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileResponseImpl <em>Clear Charging Profile Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileResponse()
	 * @generated
	 */
	int CLEAR_CHARGING_PROFILE_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Clear Charging Profile Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clear Charging Profile Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_CHARGING_PROFILE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl <em>Data Transfer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferRequest()
	 * @generated
	 */
	int DATA_TRANSFER_REQUEST = 14;

	/**
	 * The feature id for the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_REQUEST__VENDOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_REQUEST__MESSAGE_ID = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_REQUEST__DATA = 2;

	/**
	 * The number of structural features of the '<em>Data Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferResponseImpl <em>Data Transfer Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.DataTransferResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferResponse()
	 * @generated
	 */
	int DATA_TRANSFER_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_RESPONSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_RESPONSE__DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Transfer Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Transfer Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Cancel Reservation Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Cancel Reservation Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Change Availability Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Change Availability Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Change Configuration Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Change Configuration Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Charge Box Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHARGE_BOX_IDENTITY = 9;

	/**
	 * The feature id for the '<em><b>Clear Cache Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLEAR_CACHE_REQUEST = 10;

	/**
	 * The feature id for the '<em><b>Clear Cache Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Clear Charging Profile Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Clear Charging Profile Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Data Transfer Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_TRANSFER_REQUEST = 14;

	/**
	 * The feature id for the '<em><b>Data Transfer Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Get Composite Schedule Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST = 16;

	/**
	 * The feature id for the '<em><b>Get Composite Schedule Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE = 17;

	/**
	 * The feature id for the '<em><b>Get Configuration Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Get Configuration Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE = 19;

	/**
	 * The feature id for the '<em><b>Get Diagnostics Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST = 20;

	/**
	 * The feature id for the '<em><b>Get Diagnostics Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE = 21;

	/**
	 * The feature id for the '<em><b>Get Local List Version Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST = 22;

	/**
	 * The feature id for the '<em><b>Get Local List Version Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE = 23;

	/**
	 * The feature id for the '<em><b>Remote Start Transaction Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST = 24;

	/**
	 * The feature id for the '<em><b>Remote Start Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE = 25;

	/**
	 * The feature id for the '<em><b>Remote Stop Transaction Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST = 26;

	/**
	 * The feature id for the '<em><b>Remote Stop Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE = 27;

	/**
	 * The feature id for the '<em><b>Reserve Now Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESERVE_NOW_REQUEST = 28;

	/**
	 * The feature id for the '<em><b>Reserve Now Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESERVE_NOW_RESPONSE = 29;

	/**
	 * The feature id for the '<em><b>Reset Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESET_REQUEST = 30;

	/**
	 * The feature id for the '<em><b>Reset Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESET_RESPONSE = 31;

	/**
	 * The feature id for the '<em><b>Send Local List Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST = 32;

	/**
	 * The feature id for the '<em><b>Send Local List Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE = 33;

	/**
	 * The feature id for the '<em><b>Set Charging Profile Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST = 34;

	/**
	 * The feature id for the '<em><b>Set Charging Profile Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE = 35;

	/**
	 * The feature id for the '<em><b>Trigger Message Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST = 36;

	/**
	 * The feature id for the '<em><b>Trigger Message Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE = 37;

	/**
	 * The feature id for the '<em><b>Unlock Connector Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST = 38;

	/**
	 * The feature id for the '<em><b>Unlock Connector Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE = 39;

	/**
	 * The feature id for the '<em><b>Update Firmware Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST = 40;

	/**
	 * The feature id for the '<em><b>Update Firmware Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE = 41;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl <em>Get Composite Schedule Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleRequest()
	 * @generated
	 */
	int GET_COMPOSITE_SCHEDULE_REQUEST = 17;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_REQUEST__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Charging Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Get Composite Schedule Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Get Composite Schedule Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl <em>Get Composite Schedule Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleResponse()
	 * @generated
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE = 18;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Schedule Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START = 2;

	/**
	 * The feature id for the '<em><b>Charging Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE = 3;

	/**
	 * The number of structural features of the '<em>Get Composite Schedule Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Composite Schedule Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COMPOSITE_SCHEDULE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationRequestImpl <em>Get Configuration Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetConfigurationRequest()
	 * @generated
	 */
	int GET_CONFIGURATION_REQUEST = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_REQUEST__KEY = 0;

	/**
	 * The number of structural features of the '<em>Get Configuration Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Configuration Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationResponseImpl <em>Get Configuration Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetConfigurationResponse()
	 * @generated
	 */
	int GET_CONFIGURATION_RESPONSE = 20;

	/**
	 * The feature id for the '<em><b>Configuration Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY = 0;

	/**
	 * The feature id for the '<em><b>Unknown Key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY = 1;

	/**
	 * The number of structural features of the '<em>Get Configuration Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Get Configuration Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONFIGURATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl <em>Get Diagnostics Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetDiagnosticsRequest()
	 * @generated
	 */
	int GET_DIAGNOSTICS_REQUEST = 21;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST__STOP_TIME = 2;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST__RETRIES = 3;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL = 4;

	/**
	 * The number of structural features of the '<em>Get Diagnostics Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Get Diagnostics Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsResponseImpl <em>Get Diagnostics Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetDiagnosticsResponse()
	 * @generated
	 */
	int GET_DIAGNOSTICS_RESPONSE = 22;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_RESPONSE__FILE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Get Diagnostics Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Diagnostics Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_DIAGNOSTICS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionRequestImpl <em>Get Local List Version Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetLocalListVersionRequest()
	 * @generated
	 */
	int GET_LOCAL_LIST_VERSION_REQUEST = 23;

	/**
	 * The number of structural features of the '<em>Get Local List Version Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOCAL_LIST_VERSION_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get Local List Version Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOCAL_LIST_VERSION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionResponseImpl <em>Get Local List Version Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetLocalListVersionResponse()
	 * @generated
	 */
	int GET_LOCAL_LIST_VERSION_RESPONSE = 24;

	/**
	 * The feature id for the '<em><b>List Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION = 0;

	/**
	 * The number of structural features of the '<em>Get Local List Version Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOCAL_LIST_VERSION_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get Local List Version Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOCAL_LIST_VERSION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl <em>Id Tag Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getIdTagInfo()
	 * @generated
	 */
	int ID_TAG_INFO = 25;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TAG_INFO__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TAG_INFO__EXPIRY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Parent Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TAG_INFO__PARENT_ID_TAG = 2;

	/**
	 * The number of structural features of the '<em>Id Tag Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TAG_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Id Tag Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_TAG_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.KeyValueImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__READONLY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionRequestImpl <em>Remote Start Transaction Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartTransactionRequest()
	 * @generated
	 */
	int REMOTE_START_TRANSACTION_REQUEST = 27;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_REQUEST__ID_TAG = 1;

	/**
	 * The feature id for the '<em><b>Charging Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_REQUEST__CHARGING_PROFILE = 2;

	/**
	 * The number of structural features of the '<em>Remote Start Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Remote Start Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionResponseImpl <em>Remote Start Transaction Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartTransactionResponse()
	 * @generated
	 */
	int REMOTE_START_TRANSACTION_RESPONSE = 28;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Remote Start Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Remote Start Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_START_TRANSACTION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionRequestImpl <em>Remote Stop Transaction Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStopTransactionRequest()
	 * @generated
	 */
	int REMOTE_STOP_TRANSACTION_REQUEST = 29;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_STOP_TRANSACTION_REQUEST__TRANSACTION_ID = 0;

	/**
	 * The number of structural features of the '<em>Remote Stop Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_STOP_TRANSACTION_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Remote Stop Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_STOP_TRANSACTION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionResponseImpl <em>Remote Stop Transaction Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStopTransactionResponse()
	 * @generated
	 */
	int REMOTE_STOP_TRANSACTION_RESPONSE = 30;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_STOP_TRANSACTION_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Remote Stop Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_STOP_TRANSACTION_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Remote Stop Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_STOP_TRANSACTION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl <em>Reserve Now Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReserveNowRequest()
	 * @generated
	 */
	int RESERVE_NOW_REQUEST = 31;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST__EXPIRY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST__ID_TAG = 2;

	/**
	 * The feature id for the '<em><b>Parent Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST__PARENT_ID_TAG = 3;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST__RESERVATION_ID = 4;

	/**
	 * The number of structural features of the '<em>Reserve Now Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reserve Now Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowResponseImpl <em>Reserve Now Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReserveNowResponse()
	 * @generated
	 */
	int RESERVE_NOW_RESPONSE = 32;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Reserve Now Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reserve Now Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_NOW_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ResetRequestImpl <em>Reset Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ResetRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetRequest()
	 * @generated
	 */
	int RESET_REQUEST = 33;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REQUEST__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Reset Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reset Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ResetResponseImpl <em>Reset Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.ResetResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetResponse()
	 * @generated
	 */
	int RESET_RESPONSE = 34;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Reset Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reset Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl <em>Send Local List Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSendLocalListRequest()
	 * @generated
	 */
	int SEND_LOCAL_LIST_REQUEST = 35;

	/**
	 * The feature id for the '<em><b>List Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_REQUEST__LIST_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Local Authorization List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST = 1;

	/**
	 * The feature id for the '<em><b>Update Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Send Local List Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Send Local List Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListResponseImpl <em>Send Local List Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSendLocalListResponse()
	 * @generated
	 */
	int SEND_LOCAL_LIST_RESPONSE = 36;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Send Local List Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Send Local List Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_LOCAL_LIST_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileRequestImpl <em>Set Charging Profile Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSetChargingProfileRequest()
	 * @generated
	 */
	int SET_CHARGING_PROFILE_REQUEST = 37;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Cs Charging Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES = 1;

	/**
	 * The number of structural features of the '<em>Set Charging Profile Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set Charging Profile Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileResponseImpl <em>Set Charging Profile Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSetChargingProfileResponse()
	 * @generated
	 */
	int SET_CHARGING_PROFILE_RESPONSE = 38;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Set Charging Profile Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set Charging Profile Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CHARGING_PROFILE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageRequestImpl <em>Trigger Message Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageRequest()
	 * @generated
	 */
	int TRIGGER_MESSAGE_REQUEST = 39;

	/**
	 * The feature id for the '<em><b>Requested Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID = 1;

	/**
	 * The number of structural features of the '<em>Trigger Message Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger Message Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageResponseImpl <em>Trigger Message Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageResponse()
	 * @generated
	 */
	int TRIGGER_MESSAGE_RESPONSE = 40;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Trigger Message Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger Message Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_MESSAGE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorRequestImpl <em>Unlock Connector Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockConnectorRequest()
	 * @generated
	 */
	int UNLOCK_CONNECTOR_REQUEST = 41;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CONNECTOR_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The number of structural features of the '<em>Unlock Connector Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CONNECTOR_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unlock Connector Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CONNECTOR_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorResponseImpl <em>Unlock Connector Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockConnectorResponse()
	 * @generated
	 */
	int UNLOCK_CONNECTOR_RESPONSE = 42;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CONNECTOR_RESPONSE__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Unlock Connector Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CONNECTOR_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unlock Connector Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CONNECTOR_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl <em>Update Firmware Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateFirmwareRequest()
	 * @generated
	 */
	int UPDATE_FIRMWARE_REQUEST = 43;

	/**
	 * The feature id for the '<em><b>Retrieve Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_REQUEST__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_REQUEST__RETRIES = 2;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL = 3;

	/**
	 * The number of structural features of the '<em>Update Firmware Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Update Firmware Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareResponseImpl <em>Update Firmware Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareResponseImpl
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateFirmwareResponse()
	 * @generated
	 */
	int UPDATE_FIRMWARE_RESPONSE = 44;

	/**
	 * The number of structural features of the '<em>Update Firmware Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Update Firmware Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIRMWARE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus <em>Authorization Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAuthorizationStatus()
	 * @generated
	 */
	int AUTHORIZATION_STATUS = 45;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus <em>Availability Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityStatus()
	 * @generated
	 */
	int AVAILABILITY_STATUS = 46;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityType <em>Availability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityType()
	 * @generated
	 */
	int AVAILABILITY_TYPE = 47;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus <em>Cancel Reservation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationStatus()
	 * @generated
	 */
	int CANCEL_RESERVATION_STATUS = 48;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType <em>Charging Profile Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileKindType()
	 * @generated
	 */
	int CHARGING_PROFILE_KIND_TYPE = 49;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType <em>Charging Profile Purpose Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfilePurposeType()
	 * @generated
	 */
	int CHARGING_PROFILE_PURPOSE_TYPE = 50;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus <em>Charging Profile Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileStatus()
	 * @generated
	 */
	int CHARGING_PROFILE_STATUS = 51;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType <em>Charging Rate Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingRateUnitType()
	 * @generated
	 */
	int CHARGING_RATE_UNIT_TYPE = 52;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus <em>Clear Cache Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheStatus()
	 * @generated
	 */
	int CLEAR_CACHE_STATUS = 53;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus <em>Clear Charging Profile Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileStatus()
	 * @generated
	 */
	int CLEAR_CHARGING_PROFILE_STATUS = 54;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus <em>Configuration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getConfigurationStatus()
	 * @generated
	 */
	int CONFIGURATION_STATUS = 55;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferStatus <em>Data Transfer Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferStatus()
	 * @generated
	 */
	int DATA_TRANSFER_STATUS = 56;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus <em>Get Composite Schedule Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleStatus()
	 * @generated
	 */
	int GET_COMPOSITE_SCHEDULE_STATUS = 57;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.MessageTrigger <em>Message Trigger</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getMessageTrigger()
	 * @generated
	 */
	int MESSAGE_TRIGGER = 58;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType <em>Recurrency Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRecurrencyKindType()
	 * @generated
	 */
	int RECURRENCY_KIND_TYPE = 59;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus <em>Remote Start Stop Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartStopStatus()
	 * @generated
	 */
	int REMOTE_START_STOP_STATUS = 60;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ReservationStatus <em>Reservation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReservationStatus()
	 * @generated
	 */
	int RESERVATION_STATUS = 61;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ResetStatus <em>Reset Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetStatus()
	 * @generated
	 */
	int RESET_STATUS = 62;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.ResetType <em>Reset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetType()
	 * @generated
	 */
	int RESET_TYPE = 63;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus <em>Trigger Message Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageStatus()
	 * @generated
	 */
	int TRIGGER_MESSAGE_STATUS = 64;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockStatus <em>Unlock Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockStatus()
	 * @generated
	 */
	int UNLOCK_STATUS = 65;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateStatus <em>Update Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateStatus()
	 * @generated
	 */
	int UPDATE_STATUS = 66;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateType <em>Update Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 67;

	/**
	 * The meta object id for the '<em>Authorization Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAuthorizationStatusObject()
	 * @generated
	 */
	int AUTHORIZATION_STATUS_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Availability Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityStatusObject()
	 * @generated
	 */
	int AVAILABILITY_STATUS_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Availability Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityTypeObject()
	 * @generated
	 */
	int AVAILABILITY_TYPE_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Cancel Reservation Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationStatusObject()
	 * @generated
	 */
	int CANCEL_RESERVATION_STATUS_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Charging Profile Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileKindTypeObject()
	 * @generated
	 */
	int CHARGING_PROFILE_KIND_TYPE_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Charging Profile Purpose Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfilePurposeTypeObject()
	 * @generated
	 */
	int CHARGING_PROFILE_PURPOSE_TYPE_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Charging Profile Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileStatusObject()
	 * @generated
	 */
	int CHARGING_PROFILE_STATUS_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Charging Rate Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingRateUnitTypeObject()
	 * @generated
	 */
	int CHARGING_RATE_UNIT_TYPE_OBJECT = 75;

	/**
	 * The meta object id for the '<em>Ci String20 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString20Type()
	 * @generated
	 */
	int CI_STRING20_TYPE = 76;

	/**
	 * The meta object id for the '<em>Ci String255 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString255Type()
	 * @generated
	 */
	int CI_STRING255_TYPE = 77;

	/**
	 * The meta object id for the '<em>Ci String25 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString25Type()
	 * @generated
	 */
	int CI_STRING25_TYPE = 78;

	/**
	 * The meta object id for the '<em>Ci String500 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString500Type()
	 * @generated
	 */
	int CI_STRING500_TYPE = 79;

	/**
	 * The meta object id for the '<em>Ci String50 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString50Type()
	 * @generated
	 */
	int CI_STRING50_TYPE = 80;

	/**
	 * The meta object id for the '<em>Clear Cache Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheStatusObject()
	 * @generated
	 */
	int CLEAR_CACHE_STATUS_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Clear Charging Profile Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileStatusObject()
	 * @generated
	 */
	int CLEAR_CHARGING_PROFILE_STATUS_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Configuration Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getConfigurationStatusObject()
	 * @generated
	 */
	int CONFIGURATION_STATUS_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Data Transfer Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferStatusObject()
	 * @generated
	 */
	int DATA_TRANSFER_STATUS_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Decimal One</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDecimalOne()
	 * @generated
	 */
	int DECIMAL_ONE = 85;

	/**
	 * The meta object id for the '<em>Get Composite Schedule Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleStatusObject()
	 * @generated
	 */
	int GET_COMPOSITE_SCHEDULE_STATUS_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Id Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getIdToken()
	 * @generated
	 */
	int ID_TOKEN = 87;

	/**
	 * The meta object id for the '<em>Message Trigger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getMessageTriggerObject()
	 * @generated
	 */
	int MESSAGE_TRIGGER_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Recurrency Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRecurrencyKindTypeObject()
	 * @generated
	 */
	int RECURRENCY_KIND_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Remote Start Stop Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartStopStatusObject()
	 * @generated
	 */
	int REMOTE_START_STOP_STATUS_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Reservation Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReservationStatusObject()
	 * @generated
	 */
	int RESERVATION_STATUS_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Reset Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetStatusObject()
	 * @generated
	 */
	int RESET_STATUS_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Reset Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetTypeObject()
	 * @generated
	 */
	int RESET_TYPE_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Trigger Message Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageStatusObject()
	 * @generated
	 */
	int TRIGGER_MESSAGE_STATUS_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Unlock Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockStatusObject()
	 * @generated
	 */
	int UNLOCK_STATUS_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Update Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateStatus
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateStatusObject()
	 * @generated
	 */
	int UPDATE_STATUS_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Update Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
	 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateTypeObject()
	 * @generated
	 */
	int UPDATE_TYPE_OBJECT = 97;


	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData <em>Authorization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Data</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationData
	 * @generated
	 */
	EClass getAuthorizationData();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTag <em>Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTag()
	 * @see #getAuthorizationData()
	 * @generated
	 */
	EAttribute getAuthorizationData_IdTag();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Tag Info</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTagInfo()
	 * @see #getAuthorizationData()
	 * @generated
	 */
	EReference getAuthorizationData_IdTagInfo();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest <em>Cancel Reservation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Reservation Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest
	 * @generated
	 */
	EClass getCancelReservationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest#getReservationId <em>Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest#getReservationId()
	 * @see #getCancelReservationRequest()
	 * @generated
	 */
	EAttribute getCancelReservationRequest_ReservationId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse <em>Cancel Reservation Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Reservation Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse
	 * @generated
	 */
	EClass getCancelReservationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationResponse#getStatus()
	 * @see #getCancelReservationResponse()
	 * @generated
	 */
	EAttribute getCancelReservationResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest <em>Change Availability Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Availability Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest
	 * @generated
	 */
	EClass getChangeAvailabilityRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getConnectorId()
	 * @see #getChangeAvailabilityRequest()
	 * @generated
	 */
	EAttribute getChangeAvailabilityRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getType()
	 * @see #getChangeAvailabilityRequest()
	 * @generated
	 */
	EAttribute getChangeAvailabilityRequest_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse <em>Change Availability Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Availability Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse
	 * @generated
	 */
	EClass getChangeAvailabilityResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityResponse#getStatus()
	 * @see #getChangeAvailabilityResponse()
	 * @generated
	 */
	EAttribute getChangeAvailabilityResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest <em>Change Configuration Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Configuration Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest
	 * @generated
	 */
	EClass getChangeConfigurationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getKey()
	 * @see #getChangeConfigurationRequest()
	 * @generated
	 */
	EAttribute getChangeConfigurationRequest_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getValue()
	 * @see #getChangeConfigurationRequest()
	 * @generated
	 */
	EAttribute getChangeConfigurationRequest_Value();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse <em>Change Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Configuration Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse
	 * @generated
	 */
	EClass getChangeConfigurationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationResponse#getStatus()
	 * @see #getChangeConfigurationResponse()
	 * @generated
	 */
	EAttribute getChangeConfigurationResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile <em>Charging Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charging Profile</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile
	 * @generated
	 */
	EClass getChargingProfile();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileId <em>Charging Profile Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Profile Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileId()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_ChargingProfileId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getTransactionId()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_TransactionId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getStackLevel <em>Stack Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Level</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getStackLevel()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_StackLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfilePurpose <em>Charging Profile Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Profile Purpose</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfilePurpose()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_ChargingProfilePurpose();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileKind <em>Charging Profile Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Profile Kind</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileKind()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_ChargingProfileKind();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getRecurrencyKind <em>Recurrency Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrency Kind</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getRecurrencyKind()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_RecurrencyKind();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidFrom()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidTo()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EAttribute getChargingProfile_ValidTo();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingSchedule <em>Charging Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Charging Schedule</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingSchedule()
	 * @see #getChargingProfile()
	 * @generated
	 */
	EReference getChargingProfile_ChargingSchedule();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule <em>Charging Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charging Schedule</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule
	 * @generated
	 */
	EClass getChargingSchedule();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getDuration()
	 * @see #getChargingSchedule()
	 * @generated
	 */
	EAttribute getChargingSchedule_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getStartSchedule <em>Start Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Schedule</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getStartSchedule()
	 * @see #getChargingSchedule()
	 * @generated
	 */
	EAttribute getChargingSchedule_StartSchedule();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingRateUnit <em>Charging Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Rate Unit</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingRateUnit()
	 * @see #getChargingSchedule()
	 * @generated
	 */
	EAttribute getChargingSchedule_ChargingRateUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingSchedulePeriod <em>Charging Schedule Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charging Schedule Period</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingSchedulePeriod()
	 * @see #getChargingSchedule()
	 * @generated
	 */
	EReference getChargingSchedule_ChargingSchedulePeriod();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getMinChargingRate <em>Min Charging Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Charging Rate</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getMinChargingRate()
	 * @see #getChargingSchedule()
	 * @generated
	 */
	EAttribute getChargingSchedule_MinChargingRate();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod <em>Charging Schedule Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charging Schedule Period</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod
	 * @generated
	 */
	EClass getChargingSchedulePeriod();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getStartPeriod <em>Start Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Period</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getStartPeriod()
	 * @see #getChargingSchedulePeriod()
	 * @generated
	 */
	EAttribute getChargingSchedulePeriod_StartPeriod();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getLimit()
	 * @see #getChargingSchedulePeriod()
	 * @generated
	 */
	EAttribute getChargingSchedulePeriod_Limit();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getNumberPhases <em>Number Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Phases</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getNumberPhases()
	 * @see #getChargingSchedulePeriod()
	 * @generated
	 */
	EAttribute getChargingSchedulePeriod_NumberPhases();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheRequest <em>Clear Cache Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Cache Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheRequest
	 * @generated
	 */
	EClass getClearCacheRequest();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse <em>Clear Cache Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Cache Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse
	 * @generated
	 */
	EClass getClearCacheResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheResponse#getStatus()
	 * @see #getClearCacheResponse()
	 * @generated
	 */
	EAttribute getClearCacheResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest <em>Clear Charging Profile Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Charging Profile Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest
	 * @generated
	 */
	EClass getClearChargingProfileRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getId()
	 * @see #getClearChargingProfileRequest()
	 * @generated
	 */
	EAttribute getClearChargingProfileRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getConnectorId()
	 * @see #getClearChargingProfileRequest()
	 * @generated
	 */
	EAttribute getClearChargingProfileRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getChargingProfilePurpose <em>Charging Profile Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Profile Purpose</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getChargingProfilePurpose()
	 * @see #getClearChargingProfileRequest()
	 * @generated
	 */
	EAttribute getClearChargingProfileRequest_ChargingProfilePurpose();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getStackLevel <em>Stack Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Level</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getStackLevel()
	 * @see #getClearChargingProfileRequest()
	 * @generated
	 */
	EAttribute getClearChargingProfileRequest_StackLevel();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse <em>Clear Charging Profile Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Charging Profile Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse
	 * @generated
	 */
	EClass getClearChargingProfileResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileResponse#getStatus()
	 * @see #getClearChargingProfileResponse()
	 * @generated
	 */
	EAttribute getClearChargingProfileResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest <em>Data Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfer Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferRequest
	 * @generated
	 */
	EClass getDataTransferRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getVendorId <em>Vendor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getVendorId()
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	EAttribute getDataTransferRequest_VendorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getMessageId()
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	EAttribute getDataTransferRequest_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getData()
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	EAttribute getDataTransferRequest_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferResponse <em>Data Transfer Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfer Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferResponse
	 * @generated
	 */
	EClass getDataTransferResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferResponse#getStatus()
	 * @see #getDataTransferResponse()
	 * @generated
	 */
	EAttribute getDataTransferResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferResponse#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferResponse#getData()
	 * @see #getDataTransferResponse()
	 * @generated
	 */
	EAttribute getDataTransferResponse_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationRequest <em>Cancel Reservation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Reservation Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CancelReservationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationResponse <em>Cancel Reservation Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Reservation Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CancelReservationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityRequest <em>Change Availability Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Availability Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeAvailabilityRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityResponse <em>Change Availability Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Availability Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeAvailabilityResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationRequest <em>Change Configuration Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Configuration Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeConfigurationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationResponse <em>Change Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Configuration Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChangeConfigurationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChargeBoxIdentity <em>Charge Box Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Box Identity</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChargeBoxIdentity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ChargeBoxIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheRequest <em>Clear Cache Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clear Cache Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClearCacheRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheResponse <em>Clear Cache Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clear Cache Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClearCacheResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileRequest <em>Clear Charging Profile Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clear Charging Profile Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClearChargingProfileRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileResponse <em>Clear Charging Profile Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clear Charging Profile Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClearChargingProfileResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferRequest <em>Data Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Transfer Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataTransferRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferResponse <em>Data Transfer Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Transfer Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataTransferResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleRequest <em>Get Composite Schedule Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Composite Schedule Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCompositeScheduleRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleResponse <em>Get Composite Schedule Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Composite Schedule Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCompositeScheduleResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationRequest <em>Get Configuration Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Configuration Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConfigurationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationResponse <em>Get Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Configuration Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetConfigurationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsRequest <em>Get Diagnostics Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Diagnostics Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetDiagnosticsRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsResponse <em>Get Diagnostics Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Diagnostics Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetDiagnosticsResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionRequest <em>Get Local List Version Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Local List Version Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetLocalListVersionRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionResponse <em>Get Local List Version Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Local List Version Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetLocalListVersionResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionRequest <em>Remote Start Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Start Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoteStartTransactionRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionResponse <em>Remote Start Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Start Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoteStartTransactionResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionRequest <em>Remote Stop Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Stop Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoteStopTransactionRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionResponse <em>Remote Stop Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remote Stop Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RemoteStopTransactionResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowRequest <em>Reserve Now Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserve Now Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReserveNowRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowResponse <em>Reserve Now Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserve Now Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReserveNowResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetRequest <em>Reset Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reset Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResetRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetResponse <em>Reset Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reset Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResetResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListRequest <em>Send Local List Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Local List Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SendLocalListRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListResponse <em>Send Local List Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Local List Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SendLocalListResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileRequest <em>Set Charging Profile Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Charging Profile Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SetChargingProfileRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileResponse <em>Set Charging Profile Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Charging Profile Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SetChargingProfileResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageRequest <em>Trigger Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Message Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TriggerMessageRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageResponse <em>Trigger Message Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Message Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TriggerMessageResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorRequest <em>Unlock Connector Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unlock Connector Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnlockConnectorRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorResponse <em>Unlock Connector Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unlock Connector Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnlockConnectorResponse();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareRequest <em>Update Firmware Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Firmware Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateFirmwareRequest();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareResponse <em>Update Firmware Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Firmware Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateFirmwareResponse();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest <em>Get Composite Schedule Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Composite Schedule Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest
	 * @generated
	 */
	EClass getGetCompositeScheduleRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getConnectorId()
	 * @see #getGetCompositeScheduleRequest()
	 * @generated
	 */
	EAttribute getGetCompositeScheduleRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getDuration()
	 * @see #getGetCompositeScheduleRequest()
	 * @generated
	 */
	EAttribute getGetCompositeScheduleRequest_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getChargingRateUnit <em>Charging Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Rate Unit</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getChargingRateUnit()
	 * @see #getGetCompositeScheduleRequest()
	 * @generated
	 */
	EAttribute getGetCompositeScheduleRequest_ChargingRateUnit();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse <em>Get Composite Schedule Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Composite Schedule Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse
	 * @generated
	 */
	EClass getGetCompositeScheduleResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getStatus()
	 * @see #getGetCompositeScheduleResponse()
	 * @generated
	 */
	EAttribute getGetCompositeScheduleResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getConnectorId()
	 * @see #getGetCompositeScheduleResponse()
	 * @generated
	 */
	EAttribute getGetCompositeScheduleResponse_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getScheduleStart <em>Schedule Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Start</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getScheduleStart()
	 * @see #getGetCompositeScheduleResponse()
	 * @generated
	 */
	EAttribute getGetCompositeScheduleResponse_ScheduleStart();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getChargingSchedule <em>Charging Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Charging Schedule</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse#getChargingSchedule()
	 * @see #getGetCompositeScheduleResponse()
	 * @generated
	 */
	EReference getGetCompositeScheduleResponse_ChargingSchedule();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest <em>Get Configuration Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Configuration Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest
	 * @generated
	 */
	EClass getGetConfigurationRequest();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest#getKey()
	 * @see #getGetConfigurationRequest()
	 * @generated
	 */
	EAttribute getGetConfigurationRequest_Key();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse <em>Get Configuration Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Configuration Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse
	 * @generated
	 */
	EClass getGetConfigurationResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse#getConfigurationKey <em>Configuration Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Key</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse#getConfigurationKey()
	 * @see #getGetConfigurationResponse()
	 * @generated
	 */
	EReference getGetConfigurationResponse_ConfigurationKey();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse#getUnknownKey <em>Unknown Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unknown Key</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse#getUnknownKey()
	 * @see #getGetConfigurationResponse()
	 * @generated
	 */
	EAttribute getGetConfigurationResponse_UnknownKey();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest <em>Get Diagnostics Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Diagnostics Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest
	 * @generated
	 */
	EClass getGetDiagnosticsRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getLocation()
	 * @see #getGetDiagnosticsRequest()
	 * @generated
	 */
	EAttribute getGetDiagnosticsRequest_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStartTime()
	 * @see #getGetDiagnosticsRequest()
	 * @generated
	 */
	EAttribute getGetDiagnosticsRequest_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Time</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getStopTime()
	 * @see #getGetDiagnosticsRequest()
	 * @generated
	 */
	EAttribute getGetDiagnosticsRequest_StopTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retries</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetries()
	 * @see #getGetDiagnosticsRequest()
	 * @generated
	 */
	EAttribute getGetDiagnosticsRequest_Retries();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest#getRetryInterval()
	 * @see #getGetDiagnosticsRequest()
	 * @generated
	 */
	EAttribute getGetDiagnosticsRequest_RetryInterval();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse <em>Get Diagnostics Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Diagnostics Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse
	 * @generated
	 */
	EClass getGetDiagnosticsResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse#getFileName()
	 * @see #getGetDiagnosticsResponse()
	 * @generated
	 */
	EAttribute getGetDiagnosticsResponse_FileName();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest <em>Get Local List Version Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Local List Version Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest
	 * @generated
	 */
	EClass getGetLocalListVersionRequest();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse <em>Get Local List Version Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Local List Version Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse
	 * @generated
	 */
	EClass getGetLocalListVersionResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse#getListVersion <em>List Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Version</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse#getListVersion()
	 * @see #getGetLocalListVersionResponse()
	 * @generated
	 */
	EAttribute getGetLocalListVersionResponse_ListVersion();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Tag Info</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.IdTagInfo
	 * @generated
	 */
	EClass getIdTagInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getStatus()
	 * @see #getIdTagInfo()
	 * @generated
	 */
	EAttribute getIdTagInfo_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getExpiryDate()
	 * @see #getIdTagInfo()
	 * @generated
	 */
	EAttribute getIdTagInfo_ExpiryDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getParentIdTag <em>Parent Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getParentIdTag()
	 * @see #getIdTagInfo()
	 * @generated
	 */
	EAttribute getIdTagInfo_ParentIdTag();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.KeyValue#getKey()
	 * @see #getKeyValue()
	 * @generated
	 */
	EAttribute getKeyValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.KeyValue#isReadonly()
	 * @see #getKeyValue()
	 * @generated
	 */
	EAttribute getKeyValue_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.KeyValue#getValue()
	 * @see #getKeyValue()
	 * @generated
	 */
	EAttribute getKeyValue_Value();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest <em>Remote Start Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Start Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest
	 * @generated
	 */
	EClass getRemoteStartTransactionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest#getConnectorId()
	 * @see #getRemoteStartTransactionRequest()
	 * @generated
	 */
	EAttribute getRemoteStartTransactionRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest#getIdTag <em>Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest#getIdTag()
	 * @see #getRemoteStartTransactionRequest()
	 * @generated
	 */
	EAttribute getRemoteStartTransactionRequest_IdTag();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest#getChargingProfile <em>Charging Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Charging Profile</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionRequest#getChargingProfile()
	 * @see #getRemoteStartTransactionRequest()
	 * @generated
	 */
	EReference getRemoteStartTransactionRequest_ChargingProfile();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse <em>Remote Start Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Start Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse
	 * @generated
	 */
	EClass getRemoteStartTransactionResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartTransactionResponse#getStatus()
	 * @see #getRemoteStartTransactionResponse()
	 * @generated
	 */
	EAttribute getRemoteStartTransactionResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest <em>Remote Stop Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Stop Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest
	 * @generated
	 */
	EClass getRemoteStopTransactionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest#getTransactionId()
	 * @see #getRemoteStopTransactionRequest()
	 * @generated
	 */
	EAttribute getRemoteStopTransactionRequest_TransactionId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse <em>Remote Stop Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Stop Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse
	 * @generated
	 */
	EClass getRemoteStopTransactionResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionResponse#getStatus()
	 * @see #getRemoteStopTransactionResponse()
	 * @generated
	 */
	EAttribute getRemoteStopTransactionResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest <em>Reserve Now Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserve Now Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest
	 * @generated
	 */
	EClass getReserveNowRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getConnectorId()
	 * @see #getReserveNowRequest()
	 * @generated
	 */
	EAttribute getReserveNowRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getExpiryDate()
	 * @see #getReserveNowRequest()
	 * @generated
	 */
	EAttribute getReserveNowRequest_ExpiryDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getIdTag <em>Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getIdTag()
	 * @see #getReserveNowRequest()
	 * @generated
	 */
	EAttribute getReserveNowRequest_IdTag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getParentIdTag <em>Parent Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getParentIdTag()
	 * @see #getReserveNowRequest()
	 * @generated
	 */
	EAttribute getReserveNowRequest_ParentIdTag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getReservationId <em>Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest#getReservationId()
	 * @see #getReserveNowRequest()
	 * @generated
	 */
	EAttribute getReserveNowRequest_ReservationId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse <em>Reserve Now Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserve Now Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse
	 * @generated
	 */
	EClass getReserveNowResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse#getStatus()
	 * @see #getReserveNowResponse()
	 * @generated
	 */
	EAttribute getReserveNowResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest <em>Reset Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetRequest
	 * @generated
	 */
	EClass getResetRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetRequest#getType()
	 * @see #getResetRequest()
	 * @generated
	 */
	EAttribute getResetRequest_Type();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.ResetResponse <em>Reset Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetResponse
	 * @generated
	 */
	EClass getResetResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.ResetResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetResponse#getStatus()
	 * @see #getResetResponse()
	 * @generated
	 */
	EAttribute getResetResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest <em>Send Local List Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Local List Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest
	 * @generated
	 */
	EClass getSendLocalListRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getListVersion <em>List Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Version</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getListVersion()
	 * @see #getSendLocalListRequest()
	 * @generated
	 */
	EAttribute getSendLocalListRequest_ListVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getLocalAuthorizationList <em>Local Authorization List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Authorization List</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getLocalAuthorizationList()
	 * @see #getSendLocalListRequest()
	 * @generated
	 */
	EReference getSendLocalListRequest_LocalAuthorizationList();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getUpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getUpdateType()
	 * @see #getSendLocalListRequest()
	 * @generated
	 */
	EAttribute getSendLocalListRequest_UpdateType();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse <em>Send Local List Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Local List Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse
	 * @generated
	 */
	EClass getSendLocalListResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SendLocalListResponse#getStatus()
	 * @see #getSendLocalListResponse()
	 * @generated
	 */
	EAttribute getSendLocalListResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest <em>Set Charging Profile Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Charging Profile Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest
	 * @generated
	 */
	EClass getSetChargingProfileRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest#getConnectorId()
	 * @see #getSetChargingProfileRequest()
	 * @generated
	 */
	EAttribute getSetChargingProfileRequest_ConnectorId();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest#getCsChargingProfiles <em>Cs Charging Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cs Charging Profiles</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest#getCsChargingProfiles()
	 * @see #getSetChargingProfileRequest()
	 * @generated
	 */
	EReference getSetChargingProfileRequest_CsChargingProfiles();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse <em>Set Charging Profile Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Charging Profile Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse
	 * @generated
	 */
	EClass getSetChargingProfileResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.SetChargingProfileResponse#getStatus()
	 * @see #getSetChargingProfileResponse()
	 * @generated
	 */
	EAttribute getSetChargingProfileResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest <em>Trigger Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Message Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest
	 * @generated
	 */
	EClass getTriggerMessageRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getRequestedMessage <em>Requested Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requested Message</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getRequestedMessage()
	 * @see #getTriggerMessageRequest()
	 * @generated
	 */
	EAttribute getTriggerMessageRequest_RequestedMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getConnectorId()
	 * @see #getTriggerMessageRequest()
	 * @generated
	 */
	EAttribute getTriggerMessageRequest_ConnectorId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse <em>Trigger Message Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Message Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse
	 * @generated
	 */
	EClass getTriggerMessageResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageResponse#getStatus()
	 * @see #getTriggerMessageResponse()
	 * @generated
	 */
	EAttribute getTriggerMessageResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest <em>Unlock Connector Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlock Connector Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest
	 * @generated
	 */
	EClass getUnlockConnectorRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest#getConnectorId()
	 * @see #getUnlockConnectorRequest()
	 * @generated
	 */
	EAttribute getUnlockConnectorRequest_ConnectorId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse <em>Unlock Connector Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlock Connector Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse
	 * @generated
	 */
	EClass getUnlockConnectorResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse#getStatus()
	 * @see #getUnlockConnectorResponse()
	 * @generated
	 */
	EAttribute getUnlockConnectorResponse_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest <em>Update Firmware Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Firmware Request</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest
	 * @generated
	 */
	EClass getUpdateFirmwareRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetrieveDate <em>Retrieve Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retrieve Date</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetrieveDate()
	 * @see #getUpdateFirmwareRequest()
	 * @generated
	 */
	EAttribute getUpdateFirmwareRequest_RetrieveDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getLocation()
	 * @see #getUpdateFirmwareRequest()
	 * @generated
	 */
	EAttribute getUpdateFirmwareRequest_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retries</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetries()
	 * @see #getUpdateFirmwareRequest()
	 * @generated
	 */
	EAttribute getUpdateFirmwareRequest_Retries();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest#getRetryInterval()
	 * @see #getUpdateFirmwareRequest()
	 * @generated
	 */
	EAttribute getUpdateFirmwareRequest_RetryInterval();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse <em>Update Firmware Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Firmware Response</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse
	 * @generated
	 */
	EClass getUpdateFirmwareResponse();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus <em>Authorization Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authorization Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
	 * @generated
	 */
	EEnum getAuthorizationStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus <em>Availability Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus
	 * @generated
	 */
	EEnum getAvailabilityStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityType <em>Availability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
	 * @generated
	 */
	EEnum getAvailabilityType();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus <em>Cancel Reservation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cancel Reservation Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
	 * @generated
	 */
	EEnum getCancelReservationStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType <em>Charging Profile Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charging Profile Kind Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
	 * @generated
	 */
	EEnum getChargingProfileKindType();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType <em>Charging Profile Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charging Profile Purpose Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @generated
	 */
	EEnum getChargingProfilePurposeType();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus <em>Charging Profile Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charging Profile Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus
	 * @generated
	 */
	EEnum getChargingProfileStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType <em>Charging Rate Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charging Rate Unit Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @generated
	 */
	EEnum getChargingRateUnitType();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus <em>Clear Cache Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clear Cache Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus
	 * @generated
	 */
	EEnum getClearCacheStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus <em>Clear Charging Profile Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clear Charging Profile Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus
	 * @generated
	 */
	EEnum getClearChargingProfileStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus <em>Configuration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Configuration Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus
	 * @generated
	 */
	EEnum getConfigurationStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferStatus <em>Data Transfer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Transfer Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferStatus
	 * @generated
	 */
	EEnum getDataTransferStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus <em>Get Composite Schedule Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Get Composite Schedule Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
	 * @generated
	 */
	EEnum getGetCompositeScheduleStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.MessageTrigger <em>Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Trigger</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
	 * @generated
	 */
	EEnum getMessageTrigger();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType <em>Recurrency Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recurrency Kind Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
	 * @generated
	 */
	EEnum getRecurrencyKindType();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus <em>Remote Start Stop Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Remote Start Stop Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus
	 * @generated
	 */
	EEnum getRemoteStartStopStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ReservationStatus <em>Reservation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
	 * @generated
	 */
	EEnum getReservationStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ResetStatus <em>Reset Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reset Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetStatus
	 * @generated
	 */
	EEnum getResetStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reset Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
	 * @generated
	 */
	EEnum getResetType();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus <em>Trigger Message Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Message Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus
	 * @generated
	 */
	EEnum getTriggerMessageStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.UnlockStatus <em>Unlock Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unlock Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
	 * @generated
	 */
	EEnum getUnlockStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.UpdateStatus <em>Update Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Status</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateStatus
	 * @generated
	 */
	EEnum getUpdateStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.chargepoint.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Type</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
	 * @generated
	 */
	EEnum getUpdateType();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus <em>Authorization Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Authorization Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus"
	 *        extendedMetaData="name='AuthorizationStatus:Object' baseType='AuthorizationStatus'"
	 * @generated
	 */
	EDataType getAuthorizationStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus <em>Availability Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Availability Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus"
	 *        extendedMetaData="name='AvailabilityStatus:Object' baseType='AvailabilityStatus'"
	 * @generated
	 */
	EDataType getAvailabilityStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityType <em>Availability Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Availability Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.AvailabilityType"
	 *        extendedMetaData="name='AvailabilityType:Object' baseType='AvailabilityType'"
	 * @generated
	 */
	EDataType getAvailabilityTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus <em>Cancel Reservation Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cancel Reservation Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus"
	 *        extendedMetaData="name='CancelReservationStatus:Object' baseType='CancelReservationStatus'"
	 * @generated
	 */
	EDataType getCancelReservationStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType <em>Charging Profile Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charging Profile Kind Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType"
	 *        extendedMetaData="name='ChargingProfileKindType:Object' baseType='ChargingProfileKindType'"
	 * @generated
	 */
	EDataType getChargingProfileKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType <em>Charging Profile Purpose Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charging Profile Purpose Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType"
	 *        extendedMetaData="name='ChargingProfilePurposeType:Object' baseType='ChargingProfilePurposeType'"
	 * @generated
	 */
	EDataType getChargingProfilePurposeTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus <em>Charging Profile Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charging Profile Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus"
	 *        extendedMetaData="name='ChargingProfileStatus:Object' baseType='ChargingProfileStatus'"
	 * @generated
	 */
	EDataType getChargingProfileStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType <em>Charging Rate Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charging Rate Unit Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType"
	 *        extendedMetaData="name='ChargingRateUnitType:Object' baseType='ChargingRateUnitType'"
	 * @generated
	 */
	EDataType getChargingRateUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ci String20 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * String of maximum 20 printable characters. To be treated as case insensitive.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ci String20 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CiString20Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='20'"
	 * @generated
	 */
	EDataType getCiString20Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ci String255 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * String of maximum 255 printable characters. To be treated as case insensitive.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ci String255 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CiString255Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='255'"
	 * @generated
	 */
	EDataType getCiString255Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ci String25 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * String of maximum 25 printable characters. To be treated as case insensitive.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ci String25 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CiString25Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='25'"
	 * @generated
	 */
	EDataType getCiString25Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ci String500 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * String of maximum 500 printable characters. To be treated as case insensitive.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ci String500 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CiString500Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='500'"
	 * @generated
	 */
	EDataType getCiString500Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ci String50 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * String of maximum 50 printable characters. To be treated as case insensitive.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ci String50 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CiString50Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
	 * @generated
	 */
	EDataType getCiString50Type();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus <em>Clear Cache Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Clear Cache Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus"
	 *        extendedMetaData="name='ClearCacheStatus:Object' baseType='ClearCacheStatus'"
	 * @generated
	 */
	EDataType getClearCacheStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus <em>Clear Charging Profile Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Clear Charging Profile Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus"
	 *        extendedMetaData="name='ClearChargingProfileStatus:Object' baseType='ClearChargingProfileStatus'"
	 * @generated
	 */
	EDataType getClearChargingProfileStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus <em>Configuration Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Configuration Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus"
	 *        extendedMetaData="name='ConfigurationStatus:Object' baseType='ConfigurationStatus'"
	 * @generated
	 */
	EDataType getConfigurationStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferStatus <em>Data Transfer Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Transfer Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.DataTransferStatus"
	 *        extendedMetaData="name='DataTransferStatus:Object' baseType='DataTransferStatus'"
	 * @generated
	 */
	EDataType getDataTransferStatusObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Decimal One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Decimal with one digit fraction
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Decimal One</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='DecimalOne' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' fractionDigits='1'"
	 * @generated
	 */
	EDataType getDecimalOne();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus <em>Get Composite Schedule Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Get Composite Schedule Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus"
	 *        extendedMetaData="name='GetCompositeScheduleStatus:Object' baseType='GetCompositeScheduleStatus'"
	 * @generated
	 */
	EDataType getGetCompositeScheduleStatusObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of string defining identification token, e.g. RFID or credit card number. To be treated as case insensitive.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Id Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IdToken' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='20'"
	 * @generated
	 */
	EDataType getIdToken();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.MessageTrigger <em>Message Trigger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Trigger Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.MessageTrigger"
	 *        extendedMetaData="name='MessageTrigger:Object' baseType='MessageTrigger'"
	 * @generated
	 */
	EDataType getMessageTriggerObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType <em>Recurrency Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Recurrency Kind Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType"
	 *        extendedMetaData="name='RecurrencyKindType:Object' baseType='RecurrencyKindType'"
	 * @generated
	 */
	EDataType getRecurrencyKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus <em>Remote Start Stop Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Remote Start Stop Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus"
	 *        extendedMetaData="name='RemoteStartStopStatus:Object' baseType='RemoteStartStopStatus'"
	 * @generated
	 */
	EDataType getRemoteStartStopStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ReservationStatus <em>Reservation Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reservation Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ReservationStatus"
	 *        extendedMetaData="name='ReservationStatus:Object' baseType='ReservationStatus'"
	 * @generated
	 */
	EDataType getReservationStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ResetStatus <em>Reset Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reset Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ResetStatus"
	 *        extendedMetaData="name='ResetStatus:Object' baseType='ResetStatus'"
	 * @generated
	 */
	EDataType getResetStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.ResetType <em>Reset Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reset Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.ResetType"
	 *        extendedMetaData="name='ResetType:Object' baseType='ResetType'"
	 * @generated
	 */
	EDataType getResetTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus <em>Trigger Message Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trigger Message Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus"
	 *        extendedMetaData="name='TriggerMessageStatus:Object' baseType='TriggerMessageStatus'"
	 * @generated
	 */
	EDataType getTriggerMessageStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.UnlockStatus <em>Unlock Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlock Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.UnlockStatus"
	 *        extendedMetaData="name='UnlockStatus:Object' baseType='UnlockStatus'"
	 * @generated
	 */
	EDataType getUnlockStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.UpdateStatus <em>Update Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.UpdateStatus"
	 *        extendedMetaData="name='UpdateStatus:Object' baseType='UpdateStatus'"
	 * @generated
	 */
	EDataType getUpdateStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.chargepoint.UpdateType <em>Update Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Update Type Object</em>'.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
	 * @model instanceClass="de.jena.sensinact.ocpp.chargepoint.UpdateType"
	 *        extendedMetaData="name='UpdateType:Object' baseType='UpdateType'"
	 * @generated
	 */
	EDataType getUpdateTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OcppChargePointFactory getOcppChargePointFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.AuthorizationDataImpl <em>Authorization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.AuthorizationDataImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAuthorizationData()
		 * @generated
		 */
		EClass AUTHORIZATION_DATA = eINSTANCE.getAuthorizationData();

		/**
		 * The meta object literal for the '<em><b>Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_DATA__ID_TAG = eINSTANCE.getAuthorizationData_IdTag();

		/**
		 * The meta object literal for the '<em><b>Id Tag Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_DATA__ID_TAG_INFO = eINSTANCE.getAuthorizationData_IdTagInfo();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationRequestImpl <em>Cancel Reservation Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationRequest()
		 * @generated
		 */
		EClass CANCEL_RESERVATION_REQUEST = eINSTANCE.getCancelReservationRequest();

		/**
		 * The meta object literal for the '<em><b>Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_RESERVATION_REQUEST__RESERVATION_ID = eINSTANCE.getCancelReservationRequest_ReservationId();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationResponseImpl <em>Cancel Reservation Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationResponse()
		 * @generated
		 */
		EClass CANCEL_RESERVATION_RESPONSE = eINSTANCE.getCancelReservationResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_RESERVATION_RESPONSE__STATUS = eINSTANCE.getCancelReservationResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityRequestImpl <em>Change Availability Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeAvailabilityRequest()
		 * @generated
		 */
		EClass CHANGE_AVAILABILITY_REQUEST = eINSTANCE.getChangeAvailabilityRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_AVAILABILITY_REQUEST__CONNECTOR_ID = eINSTANCE.getChangeAvailabilityRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_AVAILABILITY_REQUEST__TYPE = eINSTANCE.getChangeAvailabilityRequest_Type();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityResponseImpl <em>Change Availability Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeAvailabilityResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeAvailabilityResponse()
		 * @generated
		 */
		EClass CHANGE_AVAILABILITY_RESPONSE = eINSTANCE.getChangeAvailabilityResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_AVAILABILITY_RESPONSE__STATUS = eINSTANCE.getChangeAvailabilityResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationRequestImpl <em>Change Configuration Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeConfigurationRequest()
		 * @generated
		 */
		EClass CHANGE_CONFIGURATION_REQUEST = eINSTANCE.getChangeConfigurationRequest();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CONFIGURATION_REQUEST__KEY = eINSTANCE.getChangeConfigurationRequest_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CONFIGURATION_REQUEST__VALUE = eINSTANCE.getChangeConfigurationRequest_Value();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationResponseImpl <em>Change Configuration Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChangeConfigurationResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChangeConfigurationResponse()
		 * @generated
		 */
		EClass CHANGE_CONFIGURATION_RESPONSE = eINSTANCE.getChangeConfigurationResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CONFIGURATION_RESPONSE__STATUS = eINSTANCE.getChangeConfigurationResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl <em>Charging Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfile()
		 * @generated
		 */
		EClass CHARGING_PROFILE = eINSTANCE.getChargingProfile();

		/**
		 * The meta object literal for the '<em><b>Charging Profile Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__CHARGING_PROFILE_ID = eINSTANCE.getChargingProfile_ChargingProfileId();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__TRANSACTION_ID = eINSTANCE.getChargingProfile_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Stack Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__STACK_LEVEL = eINSTANCE.getChargingProfile_StackLevel();

		/**
		 * The meta object literal for the '<em><b>Charging Profile Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE = eINSTANCE.getChargingProfile_ChargingProfilePurpose();

		/**
		 * The meta object literal for the '<em><b>Charging Profile Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__CHARGING_PROFILE_KIND = eINSTANCE.getChargingProfile_ChargingProfileKind();

		/**
		 * The meta object literal for the '<em><b>Recurrency Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__RECURRENCY_KIND = eINSTANCE.getChargingProfile_RecurrencyKind();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__VALID_FROM = eINSTANCE.getChargingProfile_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_PROFILE__VALID_TO = eINSTANCE.getChargingProfile_ValidTo();

		/**
		 * The meta object literal for the '<em><b>Charging Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGING_PROFILE__CHARGING_SCHEDULE = eINSTANCE.getChargingProfile_ChargingSchedule();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl <em>Charging Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChargingScheduleImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingSchedule()
		 * @generated
		 */
		EClass CHARGING_SCHEDULE = eINSTANCE.getChargingSchedule();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE__DURATION = eINSTANCE.getChargingSchedule_Duration();

		/**
		 * The meta object literal for the '<em><b>Start Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE__START_SCHEDULE = eINSTANCE.getChargingSchedule_StartSchedule();

		/**
		 * The meta object literal for the '<em><b>Charging Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE__CHARGING_RATE_UNIT = eINSTANCE.getChargingSchedule_ChargingRateUnit();

		/**
		 * The meta object literal for the '<em><b>Charging Schedule Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGING_SCHEDULE__CHARGING_SCHEDULE_PERIOD = eINSTANCE.getChargingSchedule_ChargingSchedulePeriod();

		/**
		 * The meta object literal for the '<em><b>Min Charging Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE__MIN_CHARGING_RATE = eINSTANCE.getChargingSchedule_MinChargingRate();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl <em>Charging Schedule Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ChargingSchedulePeriodImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingSchedulePeriod()
		 * @generated
		 */
		EClass CHARGING_SCHEDULE_PERIOD = eINSTANCE.getChargingSchedulePeriod();

		/**
		 * The meta object literal for the '<em><b>Start Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE_PERIOD__START_PERIOD = eINSTANCE.getChargingSchedulePeriod_StartPeriod();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE_PERIOD__LIMIT = eINSTANCE.getChargingSchedulePeriod_Limit();

		/**
		 * The meta object literal for the '<em><b>Number Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_SCHEDULE_PERIOD__NUMBER_PHASES = eINSTANCE.getChargingSchedulePeriod_NumberPhases();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheRequestImpl <em>Clear Cache Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheRequest()
		 * @generated
		 */
		EClass CLEAR_CACHE_REQUEST = eINSTANCE.getClearCacheRequest();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheResponseImpl <em>Clear Cache Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearCacheResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheResponse()
		 * @generated
		 */
		EClass CLEAR_CACHE_RESPONSE = eINSTANCE.getClearCacheResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_CACHE_RESPONSE__STATUS = eINSTANCE.getClearCacheResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl <em>Clear Charging Profile Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileRequest()
		 * @generated
		 */
		EClass CLEAR_CHARGING_PROFILE_REQUEST = eINSTANCE.getClearChargingProfileRequest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_CHARGING_PROFILE_REQUEST__ID = eINSTANCE.getClearChargingProfileRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_CHARGING_PROFILE_REQUEST__CONNECTOR_ID = eINSTANCE.getClearChargingProfileRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Charging Profile Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_CHARGING_PROFILE_REQUEST__CHARGING_PROFILE_PURPOSE = eINSTANCE.getClearChargingProfileRequest_ChargingProfilePurpose();

		/**
		 * The meta object literal for the '<em><b>Stack Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_CHARGING_PROFILE_REQUEST__STACK_LEVEL = eINSTANCE.getClearChargingProfileRequest_StackLevel();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileResponseImpl <em>Clear Charging Profile Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ClearChargingProfileResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileResponse()
		 * @generated
		 */
		EClass CLEAR_CHARGING_PROFILE_RESPONSE = eINSTANCE.getClearChargingProfileResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR_CHARGING_PROFILE_RESPONSE__STATUS = eINSTANCE.getClearChargingProfileResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl <em>Data Transfer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferRequest()
		 * @generated
		 */
		EClass DATA_TRANSFER_REQUEST = eINSTANCE.getDataTransferRequest();

		/**
		 * The meta object literal for the '<em><b>Vendor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFER_REQUEST__VENDOR_ID = eINSTANCE.getDataTransferRequest_VendorId();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFER_REQUEST__MESSAGE_ID = eINSTANCE.getDataTransferRequest_MessageId();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFER_REQUEST__DATA = eINSTANCE.getDataTransferRequest_Data();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferResponseImpl <em>Data Transfer Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.DataTransferResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferResponse()
		 * @generated
		 */
		EClass DATA_TRANSFER_RESPONSE = eINSTANCE.getDataTransferResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFER_RESPONSE__STATUS = eINSTANCE.getDataTransferResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFER_RESPONSE__DATA = eINSTANCE.getDataTransferResponse_Data();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.DocumentRootImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Cancel Reservation Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CANCEL_RESERVATION_REQUEST = eINSTANCE.getDocumentRoot_CancelReservationRequest();

		/**
		 * The meta object literal for the '<em><b>Cancel Reservation Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CANCEL_RESERVATION_RESPONSE = eINSTANCE.getDocumentRoot_CancelReservationResponse();

		/**
		 * The meta object literal for the '<em><b>Change Availability Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_AVAILABILITY_REQUEST = eINSTANCE.getDocumentRoot_ChangeAvailabilityRequest();

		/**
		 * The meta object literal for the '<em><b>Change Availability Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_AVAILABILITY_RESPONSE = eINSTANCE.getDocumentRoot_ChangeAvailabilityResponse();

		/**
		 * The meta object literal for the '<em><b>Change Configuration Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_CONFIGURATION_REQUEST = eINSTANCE.getDocumentRoot_ChangeConfigurationRequest();

		/**
		 * The meta object literal for the '<em><b>Change Configuration Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHANGE_CONFIGURATION_RESPONSE = eINSTANCE.getDocumentRoot_ChangeConfigurationResponse();

		/**
		 * The meta object literal for the '<em><b>Charge Box Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CHARGE_BOX_IDENTITY = eINSTANCE.getDocumentRoot_ChargeBoxIdentity();

		/**
		 * The meta object literal for the '<em><b>Clear Cache Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLEAR_CACHE_REQUEST = eINSTANCE.getDocumentRoot_ClearCacheRequest();

		/**
		 * The meta object literal for the '<em><b>Clear Cache Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLEAR_CACHE_RESPONSE = eINSTANCE.getDocumentRoot_ClearCacheResponse();

		/**
		 * The meta object literal for the '<em><b>Clear Charging Profile Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_REQUEST = eINSTANCE.getDocumentRoot_ClearChargingProfileRequest();

		/**
		 * The meta object literal for the '<em><b>Clear Charging Profile Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLEAR_CHARGING_PROFILE_RESPONSE = eINSTANCE.getDocumentRoot_ClearChargingProfileResponse();

		/**
		 * The meta object literal for the '<em><b>Data Transfer Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_TRANSFER_REQUEST = eINSTANCE.getDocumentRoot_DataTransferRequest();

		/**
		 * The meta object literal for the '<em><b>Data Transfer Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE = eINSTANCE.getDocumentRoot_DataTransferResponse();

		/**
		 * The meta object literal for the '<em><b>Get Composite Schedule Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_REQUEST = eINSTANCE.getDocumentRoot_GetCompositeScheduleRequest();

		/**
		 * The meta object literal for the '<em><b>Get Composite Schedule Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_COMPOSITE_SCHEDULE_RESPONSE = eINSTANCE.getDocumentRoot_GetCompositeScheduleResponse();

		/**
		 * The meta object literal for the '<em><b>Get Configuration Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CONFIGURATION_REQUEST = eINSTANCE.getDocumentRoot_GetConfigurationRequest();

		/**
		 * The meta object literal for the '<em><b>Get Configuration Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CONFIGURATION_RESPONSE = eINSTANCE.getDocumentRoot_GetConfigurationResponse();

		/**
		 * The meta object literal for the '<em><b>Get Diagnostics Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_DIAGNOSTICS_REQUEST = eINSTANCE.getDocumentRoot_GetDiagnosticsRequest();

		/**
		 * The meta object literal for the '<em><b>Get Diagnostics Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_DIAGNOSTICS_RESPONSE = eINSTANCE.getDocumentRoot_GetDiagnosticsResponse();

		/**
		 * The meta object literal for the '<em><b>Get Local List Version Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_REQUEST = eINSTANCE.getDocumentRoot_GetLocalListVersionRequest();

		/**
		 * The meta object literal for the '<em><b>Get Local List Version Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_LOCAL_LIST_VERSION_RESPONSE = eINSTANCE.getDocumentRoot_GetLocalListVersionResponse();

		/**
		 * The meta object literal for the '<em><b>Remote Start Transaction Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE_START_TRANSACTION_REQUEST = eINSTANCE.getDocumentRoot_RemoteStartTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Remote Start Transaction Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE_START_TRANSACTION_RESPONSE = eINSTANCE.getDocumentRoot_RemoteStartTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Remote Stop Transaction Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_REQUEST = eINSTANCE.getDocumentRoot_RemoteStopTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Remote Stop Transaction Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REMOTE_STOP_TRANSACTION_RESPONSE = eINSTANCE.getDocumentRoot_RemoteStopTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Reserve Now Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESERVE_NOW_REQUEST = eINSTANCE.getDocumentRoot_ReserveNowRequest();

		/**
		 * The meta object literal for the '<em><b>Reserve Now Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESERVE_NOW_RESPONSE = eINSTANCE.getDocumentRoot_ReserveNowResponse();

		/**
		 * The meta object literal for the '<em><b>Reset Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESET_REQUEST = eINSTANCE.getDocumentRoot_ResetRequest();

		/**
		 * The meta object literal for the '<em><b>Reset Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESET_RESPONSE = eINSTANCE.getDocumentRoot_ResetResponse();

		/**
		 * The meta object literal for the '<em><b>Send Local List Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEND_LOCAL_LIST_REQUEST = eINSTANCE.getDocumentRoot_SendLocalListRequest();

		/**
		 * The meta object literal for the '<em><b>Send Local List Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEND_LOCAL_LIST_RESPONSE = eINSTANCE.getDocumentRoot_SendLocalListResponse();

		/**
		 * The meta object literal for the '<em><b>Set Charging Profile Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SET_CHARGING_PROFILE_REQUEST = eINSTANCE.getDocumentRoot_SetChargingProfileRequest();

		/**
		 * The meta object literal for the '<em><b>Set Charging Profile Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SET_CHARGING_PROFILE_RESPONSE = eINSTANCE.getDocumentRoot_SetChargingProfileResponse();

		/**
		 * The meta object literal for the '<em><b>Trigger Message Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIGGER_MESSAGE_REQUEST = eINSTANCE.getDocumentRoot_TriggerMessageRequest();

		/**
		 * The meta object literal for the '<em><b>Trigger Message Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIGGER_MESSAGE_RESPONSE = eINSTANCE.getDocumentRoot_TriggerMessageResponse();

		/**
		 * The meta object literal for the '<em><b>Unlock Connector Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNLOCK_CONNECTOR_REQUEST = eINSTANCE.getDocumentRoot_UnlockConnectorRequest();

		/**
		 * The meta object literal for the '<em><b>Unlock Connector Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNLOCK_CONNECTOR_RESPONSE = eINSTANCE.getDocumentRoot_UnlockConnectorResponse();

		/**
		 * The meta object literal for the '<em><b>Update Firmware Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATE_FIRMWARE_REQUEST = eINSTANCE.getDocumentRoot_UpdateFirmwareRequest();

		/**
		 * The meta object literal for the '<em><b>Update Firmware Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATE_FIRMWARE_RESPONSE = eINSTANCE.getDocumentRoot_UpdateFirmwareResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl <em>Get Composite Schedule Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleRequest()
		 * @generated
		 */
		EClass GET_COMPOSITE_SCHEDULE_REQUEST = eINSTANCE.getGetCompositeScheduleRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_COMPOSITE_SCHEDULE_REQUEST__CONNECTOR_ID = eINSTANCE.getGetCompositeScheduleRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_COMPOSITE_SCHEDULE_REQUEST__DURATION = eINSTANCE.getGetCompositeScheduleRequest_Duration();

		/**
		 * The meta object literal for the '<em><b>Charging Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_COMPOSITE_SCHEDULE_REQUEST__CHARGING_RATE_UNIT = eINSTANCE.getGetCompositeScheduleRequest_ChargingRateUnit();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl <em>Get Composite Schedule Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleResponse()
		 * @generated
		 */
		EClass GET_COMPOSITE_SCHEDULE_RESPONSE = eINSTANCE.getGetCompositeScheduleResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS = eINSTANCE.getGetCompositeScheduleResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID = eINSTANCE.getGetCompositeScheduleResponse_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Schedule Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START = eINSTANCE.getGetCompositeScheduleResponse_ScheduleStart();

		/**
		 * The meta object literal for the '<em><b>Charging Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE = eINSTANCE.getGetCompositeScheduleResponse_ChargingSchedule();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationRequestImpl <em>Get Configuration Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetConfigurationRequest()
		 * @generated
		 */
		EClass GET_CONFIGURATION_REQUEST = eINSTANCE.getGetConfigurationRequest();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONFIGURATION_REQUEST__KEY = eINSTANCE.getGetConfigurationRequest_Key();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationResponseImpl <em>Get Configuration Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetConfigurationResponse()
		 * @generated
		 */
		EClass GET_CONFIGURATION_RESPONSE = eINSTANCE.getGetConfigurationResponse();

		/**
		 * The meta object literal for the '<em><b>Configuration Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY = eINSTANCE.getGetConfigurationResponse_ConfigurationKey();

		/**
		 * The meta object literal for the '<em><b>Unknown Key</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY = eINSTANCE.getGetConfigurationResponse_UnknownKey();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl <em>Get Diagnostics Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetDiagnosticsRequest()
		 * @generated
		 */
		EClass GET_DIAGNOSTICS_REQUEST = eINSTANCE.getGetDiagnosticsRequest();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DIAGNOSTICS_REQUEST__LOCATION = eINSTANCE.getGetDiagnosticsRequest_Location();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DIAGNOSTICS_REQUEST__START_TIME = eINSTANCE.getGetDiagnosticsRequest_StartTime();

		/**
		 * The meta object literal for the '<em><b>Stop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DIAGNOSTICS_REQUEST__STOP_TIME = eINSTANCE.getGetDiagnosticsRequest_StopTime();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DIAGNOSTICS_REQUEST__RETRIES = eINSTANCE.getGetDiagnosticsRequest_Retries();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL = eINSTANCE.getGetDiagnosticsRequest_RetryInterval();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsResponseImpl <em>Get Diagnostics Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetDiagnosticsResponse()
		 * @generated
		 */
		EClass GET_DIAGNOSTICS_RESPONSE = eINSTANCE.getGetDiagnosticsResponse();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_DIAGNOSTICS_RESPONSE__FILE_NAME = eINSTANCE.getGetDiagnosticsResponse_FileName();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionRequestImpl <em>Get Local List Version Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetLocalListVersionRequest()
		 * @generated
		 */
		EClass GET_LOCAL_LIST_VERSION_REQUEST = eINSTANCE.getGetLocalListVersionRequest();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionResponseImpl <em>Get Local List Version Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetLocalListVersionResponse()
		 * @generated
		 */
		EClass GET_LOCAL_LIST_VERSION_RESPONSE = eINSTANCE.getGetLocalListVersionResponse();

		/**
		 * The meta object literal for the '<em><b>List Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION = eINSTANCE.getGetLocalListVersionResponse_ListVersion();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl <em>Id Tag Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getIdTagInfo()
		 * @generated
		 */
		EClass ID_TAG_INFO = eINSTANCE.getIdTagInfo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TAG_INFO__STATUS = eINSTANCE.getIdTagInfo_Status();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TAG_INFO__EXPIRY_DATE = eINSTANCE.getIdTagInfo_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Parent Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_TAG_INFO__PARENT_ID_TAG = eINSTANCE.getIdTagInfo_ParentIdTag();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.KeyValueImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE__KEY = eINSTANCE.getKeyValue_Key();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE__READONLY = eINSTANCE.getKeyValue_Readonly();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE__VALUE = eINSTANCE.getKeyValue_Value();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionRequestImpl <em>Remote Start Transaction Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartTransactionRequest()
		 * @generated
		 */
		EClass REMOTE_START_TRANSACTION_REQUEST = eINSTANCE.getRemoteStartTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_START_TRANSACTION_REQUEST__CONNECTOR_ID = eINSTANCE.getRemoteStartTransactionRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_START_TRANSACTION_REQUEST__ID_TAG = eINSTANCE.getRemoteStartTransactionRequest_IdTag();

		/**
		 * The meta object literal for the '<em><b>Charging Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_START_TRANSACTION_REQUEST__CHARGING_PROFILE = eINSTANCE.getRemoteStartTransactionRequest_ChargingProfile();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionResponseImpl <em>Remote Start Transaction Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStartTransactionResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartTransactionResponse()
		 * @generated
		 */
		EClass REMOTE_START_TRANSACTION_RESPONSE = eINSTANCE.getRemoteStartTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_START_TRANSACTION_RESPONSE__STATUS = eINSTANCE.getRemoteStartTransactionResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionRequestImpl <em>Remote Stop Transaction Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStopTransactionRequest()
		 * @generated
		 */
		EClass REMOTE_STOP_TRANSACTION_REQUEST = eINSTANCE.getRemoteStopTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_STOP_TRANSACTION_REQUEST__TRANSACTION_ID = eINSTANCE.getRemoteStopTransactionRequest_TransactionId();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionResponseImpl <em>Remote Stop Transaction Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.RemoteStopTransactionResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStopTransactionResponse()
		 * @generated
		 */
		EClass REMOTE_STOP_TRANSACTION_RESPONSE = eINSTANCE.getRemoteStopTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_STOP_TRANSACTION_RESPONSE__STATUS = eINSTANCE.getRemoteStopTransactionResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl <em>Reserve Now Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReserveNowRequest()
		 * @generated
		 */
		EClass RESERVE_NOW_REQUEST = eINSTANCE.getReserveNowRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE_NOW_REQUEST__CONNECTOR_ID = eINSTANCE.getReserveNowRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE_NOW_REQUEST__EXPIRY_DATE = eINSTANCE.getReserveNowRequest_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE_NOW_REQUEST__ID_TAG = eINSTANCE.getReserveNowRequest_IdTag();

		/**
		 * The meta object literal for the '<em><b>Parent Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE_NOW_REQUEST__PARENT_ID_TAG = eINSTANCE.getReserveNowRequest_ParentIdTag();

		/**
		 * The meta object literal for the '<em><b>Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE_NOW_REQUEST__RESERVATION_ID = eINSTANCE.getReserveNowRequest_ReservationId();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowResponseImpl <em>Reserve Now Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReserveNowResponse()
		 * @generated
		 */
		EClass RESERVE_NOW_RESPONSE = eINSTANCE.getReserveNowResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE_NOW_RESPONSE__STATUS = eINSTANCE.getReserveNowResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ResetRequestImpl <em>Reset Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ResetRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetRequest()
		 * @generated
		 */
		EClass RESET_REQUEST = eINSTANCE.getResetRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET_REQUEST__TYPE = eINSTANCE.getResetRequest_Type();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.ResetResponseImpl <em>Reset Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.ResetResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetResponse()
		 * @generated
		 */
		EClass RESET_RESPONSE = eINSTANCE.getResetResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET_RESPONSE__STATUS = eINSTANCE.getResetResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl <em>Send Local List Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSendLocalListRequest()
		 * @generated
		 */
		EClass SEND_LOCAL_LIST_REQUEST = eINSTANCE.getSendLocalListRequest();

		/**
		 * The meta object literal for the '<em><b>List Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_LOCAL_LIST_REQUEST__LIST_VERSION = eINSTANCE.getSendLocalListRequest_ListVersion();

		/**
		 * The meta object literal for the '<em><b>Local Authorization List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST = eINSTANCE.getSendLocalListRequest_LocalAuthorizationList();

		/**
		 * The meta object literal for the '<em><b>Update Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE = eINSTANCE.getSendLocalListRequest_UpdateType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListResponseImpl <em>Send Local List Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSendLocalListResponse()
		 * @generated
		 */
		EClass SEND_LOCAL_LIST_RESPONSE = eINSTANCE.getSendLocalListResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_LOCAL_LIST_RESPONSE__STATUS = eINSTANCE.getSendLocalListResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileRequestImpl <em>Set Charging Profile Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSetChargingProfileRequest()
		 * @generated
		 */
		EClass SET_CHARGING_PROFILE_REQUEST = eINSTANCE.getSetChargingProfileRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID = eINSTANCE.getSetChargingProfileRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Cs Charging Profiles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES = eINSTANCE.getSetChargingProfileRequest_CsChargingProfiles();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileResponseImpl <em>Set Charging Profile Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getSetChargingProfileResponse()
		 * @generated
		 */
		EClass SET_CHARGING_PROFILE_RESPONSE = eINSTANCE.getSetChargingProfileResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_CHARGING_PROFILE_RESPONSE__STATUS = eINSTANCE.getSetChargingProfileResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageRequestImpl <em>Trigger Message Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageRequest()
		 * @generated
		 */
		EClass TRIGGER_MESSAGE_REQUEST = eINSTANCE.getTriggerMessageRequest();

		/**
		 * The meta object literal for the '<em><b>Requested Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE = eINSTANCE.getTriggerMessageRequest_RequestedMessage();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID = eINSTANCE.getTriggerMessageRequest_ConnectorId();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageResponseImpl <em>Trigger Message Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageResponse()
		 * @generated
		 */
		EClass TRIGGER_MESSAGE_RESPONSE = eINSTANCE.getTriggerMessageResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_MESSAGE_RESPONSE__STATUS = eINSTANCE.getTriggerMessageResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorRequestImpl <em>Unlock Connector Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockConnectorRequest()
		 * @generated
		 */
		EClass UNLOCK_CONNECTOR_REQUEST = eINSTANCE.getUnlockConnectorRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLOCK_CONNECTOR_REQUEST__CONNECTOR_ID = eINSTANCE.getUnlockConnectorRequest_ConnectorId();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorResponseImpl <em>Unlock Connector Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.UnlockConnectorResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockConnectorResponse()
		 * @generated
		 */
		EClass UNLOCK_CONNECTOR_RESPONSE = eINSTANCE.getUnlockConnectorResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLOCK_CONNECTOR_RESPONSE__STATUS = eINSTANCE.getUnlockConnectorResponse_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl <em>Update Firmware Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateFirmwareRequest()
		 * @generated
		 */
		EClass UPDATE_FIRMWARE_REQUEST = eINSTANCE.getUpdateFirmwareRequest();

		/**
		 * The meta object literal for the '<em><b>Retrieve Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE = eINSTANCE.getUpdateFirmwareRequest_RetrieveDate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FIRMWARE_REQUEST__LOCATION = eINSTANCE.getUpdateFirmwareRequest_Location();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FIRMWARE_REQUEST__RETRIES = eINSTANCE.getUpdateFirmwareRequest_Retries();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL = eINSTANCE.getUpdateFirmwareRequest_RetryInterval();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareResponseImpl <em>Update Firmware Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareResponseImpl
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateFirmwareResponse()
		 * @generated
		 */
		EClass UPDATE_FIRMWARE_RESPONSE = eINSTANCE.getUpdateFirmwareResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus <em>Authorization Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAuthorizationStatus()
		 * @generated
		 */
		EEnum AUTHORIZATION_STATUS = eINSTANCE.getAuthorizationStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus <em>Availability Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityStatus()
		 * @generated
		 */
		EEnum AVAILABILITY_STATUS = eINSTANCE.getAvailabilityStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.AvailabilityType <em>Availability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityType()
		 * @generated
		 */
		EEnum AVAILABILITY_TYPE = eINSTANCE.getAvailabilityType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus <em>Cancel Reservation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationStatus()
		 * @generated
		 */
		EEnum CANCEL_RESERVATION_STATUS = eINSTANCE.getCancelReservationStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType <em>Charging Profile Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileKindType()
		 * @generated
		 */
		EEnum CHARGING_PROFILE_KIND_TYPE = eINSTANCE.getChargingProfileKindType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType <em>Charging Profile Purpose Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfilePurposeType()
		 * @generated
		 */
		EEnum CHARGING_PROFILE_PURPOSE_TYPE = eINSTANCE.getChargingProfilePurposeType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus <em>Charging Profile Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileStatus()
		 * @generated
		 */
		EEnum CHARGING_PROFILE_STATUS = eINSTANCE.getChargingProfileStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType <em>Charging Rate Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingRateUnitType()
		 * @generated
		 */
		EEnum CHARGING_RATE_UNIT_TYPE = eINSTANCE.getChargingRateUnitType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus <em>Clear Cache Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheStatus()
		 * @generated
		 */
		EEnum CLEAR_CACHE_STATUS = eINSTANCE.getClearCacheStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus <em>Clear Charging Profile Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileStatus()
		 * @generated
		 */
		EEnum CLEAR_CHARGING_PROFILE_STATUS = eINSTANCE.getClearChargingProfileStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus <em>Configuration Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getConfigurationStatus()
		 * @generated
		 */
		EEnum CONFIGURATION_STATUS = eINSTANCE.getConfigurationStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferStatus <em>Data Transfer Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferStatus()
		 * @generated
		 */
		EEnum DATA_TRANSFER_STATUS = eINSTANCE.getDataTransferStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus <em>Get Composite Schedule Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleStatus()
		 * @generated
		 */
		EEnum GET_COMPOSITE_SCHEDULE_STATUS = eINSTANCE.getGetCompositeScheduleStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.MessageTrigger <em>Message Trigger</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getMessageTrigger()
		 * @generated
		 */
		EEnum MESSAGE_TRIGGER = eINSTANCE.getMessageTrigger();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType <em>Recurrency Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRecurrencyKindType()
		 * @generated
		 */
		EEnum RECURRENCY_KIND_TYPE = eINSTANCE.getRecurrencyKindType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus <em>Remote Start Stop Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartStopStatus()
		 * @generated
		 */
		EEnum REMOTE_START_STOP_STATUS = eINSTANCE.getRemoteStartStopStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ReservationStatus <em>Reservation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReservationStatus()
		 * @generated
		 */
		EEnum RESERVATION_STATUS = eINSTANCE.getReservationStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ResetStatus <em>Reset Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ResetStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetStatus()
		 * @generated
		 */
		EEnum RESET_STATUS = eINSTANCE.getResetStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.ResetType <em>Reset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetType()
		 * @generated
		 */
		EEnum RESET_TYPE = eINSTANCE.getResetType();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus <em>Trigger Message Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageStatus()
		 * @generated
		 */
		EEnum TRIGGER_MESSAGE_STATUS = eINSTANCE.getTriggerMessageStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockStatus <em>Unlock Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockStatus()
		 * @generated
		 */
		EEnum UNLOCK_STATUS = eINSTANCE.getUnlockStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateStatus <em>Update Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.UpdateStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateStatus()
		 * @generated
		 */
		EEnum UPDATE_STATUS = eINSTANCE.getUpdateStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.chargepoint.UpdateType <em>Update Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateType()
		 * @generated
		 */
		EEnum UPDATE_TYPE = eINSTANCE.getUpdateType();

		/**
		 * The meta object literal for the '<em>Authorization Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAuthorizationStatusObject()
		 * @generated
		 */
		EDataType AUTHORIZATION_STATUS_OBJECT = eINSTANCE.getAuthorizationStatusObject();

		/**
		 * The meta object literal for the '<em>Availability Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityStatusObject()
		 * @generated
		 */
		EDataType AVAILABILITY_STATUS_OBJECT = eINSTANCE.getAvailabilityStatusObject();

		/**
		 * The meta object literal for the '<em>Availability Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getAvailabilityTypeObject()
		 * @generated
		 */
		EDataType AVAILABILITY_TYPE_OBJECT = eINSTANCE.getAvailabilityTypeObject();

		/**
		 * The meta object literal for the '<em>Cancel Reservation Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.CancelReservationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCancelReservationStatusObject()
		 * @generated
		 */
		EDataType CANCEL_RESERVATION_STATUS_OBJECT = eINSTANCE.getCancelReservationStatusObject();

		/**
		 * The meta object literal for the '<em>Charging Profile Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileKindTypeObject()
		 * @generated
		 */
		EDataType CHARGING_PROFILE_KIND_TYPE_OBJECT = eINSTANCE.getChargingProfileKindTypeObject();

		/**
		 * The meta object literal for the '<em>Charging Profile Purpose Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfilePurposeTypeObject()
		 * @generated
		 */
		EDataType CHARGING_PROFILE_PURPOSE_TYPE_OBJECT = eINSTANCE.getChargingProfilePurposeTypeObject();

		/**
		 * The meta object literal for the '<em>Charging Profile Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingProfileStatusObject()
		 * @generated
		 */
		EDataType CHARGING_PROFILE_STATUS_OBJECT = eINSTANCE.getChargingProfileStatusObject();

		/**
		 * The meta object literal for the '<em>Charging Rate Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getChargingRateUnitTypeObject()
		 * @generated
		 */
		EDataType CHARGING_RATE_UNIT_TYPE_OBJECT = eINSTANCE.getChargingRateUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Ci String20 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString20Type()
		 * @generated
		 */
		EDataType CI_STRING20_TYPE = eINSTANCE.getCiString20Type();

		/**
		 * The meta object literal for the '<em>Ci String255 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString255Type()
		 * @generated
		 */
		EDataType CI_STRING255_TYPE = eINSTANCE.getCiString255Type();

		/**
		 * The meta object literal for the '<em>Ci String25 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString25Type()
		 * @generated
		 */
		EDataType CI_STRING25_TYPE = eINSTANCE.getCiString25Type();

		/**
		 * The meta object literal for the '<em>Ci String500 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString500Type()
		 * @generated
		 */
		EDataType CI_STRING500_TYPE = eINSTANCE.getCiString500Type();

		/**
		 * The meta object literal for the '<em>Ci String50 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getCiString50Type()
		 * @generated
		 */
		EDataType CI_STRING50_TYPE = eINSTANCE.getCiString50Type();

		/**
		 * The meta object literal for the '<em>Clear Cache Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ClearCacheStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearCacheStatusObject()
		 * @generated
		 */
		EDataType CLEAR_CACHE_STATUS_OBJECT = eINSTANCE.getClearCacheStatusObject();

		/**
		 * The meta object literal for the '<em>Clear Charging Profile Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getClearChargingProfileStatusObject()
		 * @generated
		 */
		EDataType CLEAR_CHARGING_PROFILE_STATUS_OBJECT = eINSTANCE.getClearChargingProfileStatusObject();

		/**
		 * The meta object literal for the '<em>Configuration Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ConfigurationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getConfigurationStatusObject()
		 * @generated
		 */
		EDataType CONFIGURATION_STATUS_OBJECT = eINSTANCE.getConfigurationStatusObject();

		/**
		 * The meta object literal for the '<em>Data Transfer Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.DataTransferStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDataTransferStatusObject()
		 * @generated
		 */
		EDataType DATA_TRANSFER_STATUS_OBJECT = eINSTANCE.getDataTransferStatusObject();

		/**
		 * The meta object literal for the '<em>Decimal One</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getDecimalOne()
		 * @generated
		 */
		EDataType DECIMAL_ONE = eINSTANCE.getDecimalOne();

		/**
		 * The meta object literal for the '<em>Get Composite Schedule Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getGetCompositeScheduleStatusObject()
		 * @generated
		 */
		EDataType GET_COMPOSITE_SCHEDULE_STATUS_OBJECT = eINSTANCE.getGetCompositeScheduleStatusObject();

		/**
		 * The meta object literal for the '<em>Id Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getIdToken()
		 * @generated
		 */
		EDataType ID_TOKEN = eINSTANCE.getIdToken();

		/**
		 * The meta object literal for the '<em>Message Trigger Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getMessageTriggerObject()
		 * @generated
		 */
		EDataType MESSAGE_TRIGGER_OBJECT = eINSTANCE.getMessageTriggerObject();

		/**
		 * The meta object literal for the '<em>Recurrency Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRecurrencyKindTypeObject()
		 * @generated
		 */
		EDataType RECURRENCY_KIND_TYPE_OBJECT = eINSTANCE.getRecurrencyKindTypeObject();

		/**
		 * The meta object literal for the '<em>Remote Start Stop Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.RemoteStartStopStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getRemoteStartStopStatusObject()
		 * @generated
		 */
		EDataType REMOTE_START_STOP_STATUS_OBJECT = eINSTANCE.getRemoteStartStopStatusObject();

		/**
		 * The meta object literal for the '<em>Reservation Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getReservationStatusObject()
		 * @generated
		 */
		EDataType RESERVATION_STATUS_OBJECT = eINSTANCE.getReservationStatusObject();

		/**
		 * The meta object literal for the '<em>Reset Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ResetStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetStatusObject()
		 * @generated
		 */
		EDataType RESET_STATUS_OBJECT = eINSTANCE.getResetStatusObject();

		/**
		 * The meta object literal for the '<em>Reset Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getResetTypeObject()
		 * @generated
		 */
		EDataType RESET_TYPE_OBJECT = eINSTANCE.getResetTypeObject();

		/**
		 * The meta object literal for the '<em>Trigger Message Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.TriggerMessageStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getTriggerMessageStatusObject()
		 * @generated
		 */
		EDataType TRIGGER_MESSAGE_STATUS_OBJECT = eINSTANCE.getTriggerMessageStatusObject();

		/**
		 * The meta object literal for the '<em>Unlock Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUnlockStatusObject()
		 * @generated
		 */
		EDataType UNLOCK_STATUS_OBJECT = eINSTANCE.getUnlockStatusObject();

		/**
		 * The meta object literal for the '<em>Update Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.UpdateStatus
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateStatusObject()
		 * @generated
		 */
		EDataType UPDATE_STATUS_OBJECT = eINSTANCE.getUpdateStatusObject();

		/**
		 * The meta object literal for the '<em>Update Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
		 * @see de.jena.sensinact.ocpp.chargepoint.impl.OcppChargePointPackageImpl#getUpdateTypeObject()
		 * @generated
		 */
		EDataType UPDATE_TYPE_OBJECT = eINSTANCE.getUpdateTypeObject();

	}

} //OcppChargePointPackage
