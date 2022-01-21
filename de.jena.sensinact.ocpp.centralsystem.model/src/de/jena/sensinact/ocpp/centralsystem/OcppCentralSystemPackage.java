/**
 */
package de.jena.sensinact.ocpp.centralsystem;

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
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemFactory
 * @model kind="package"
 * @generated
 */
public interface OcppCentralSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "centralsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn://Ocpp/Cs/2015/10/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OcppCentralSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppCentralSystemPackage eINSTANCE = de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeRequestImpl <em>Authorize Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizeRequest()
	 * @generated
	 */
	int AUTHORIZE_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZE_REQUEST__ID_TAG = 0;

	/**
	 * The number of structural features of the '<em>Authorize Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZE_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authorize Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeResponseImpl <em>Authorize Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizeResponse()
	 * @generated
	 */
	int AUTHORIZE_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Id Tag Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZE_RESPONSE__ID_TAG_INFO = 0;

	/**
	 * The number of structural features of the '<em>Authorize Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZE_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authorize Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl <em>Boot Notification Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getBootNotificationRequest()
	 * @generated
	 */
	int BOOT_NOTIFICATION_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Charge Point Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR = 0;

	/**
	 * The feature id for the '<em><b>Charge Point Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Charge Point Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Charge Box Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Iccid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__ICCID = 5;

	/**
	 * The feature id for the '<em><b>Imsi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__IMSI = 6;

	/**
	 * The feature id for the '<em><b>Meter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__METER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Meter Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER = 8;

	/**
	 * The number of structural features of the '<em>Boot Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Boot Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl <em>Boot Notification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getBootNotificationResponse()
	 * @generated
	 */
	int BOOT_NOTIFICATION_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_RESPONSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_RESPONSE__INTERVAL = 2;

	/**
	 * The number of structural features of the '<em>Boot Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boot Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOT_NOTIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl <em>Data Transfer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferRequest()
	 * @generated
	 */
	int DATA_TRANSFER_REQUEST = 4;

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
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferResponseImpl <em>Data Transfer Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.DataTransferResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferResponse()
	 * @generated
	 */
	int DATA_TRANSFER_RESPONSE = 5;

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
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationRequestImpl <em>Diagnostics Status Notification Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatusNotificationRequest()
	 * @generated
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Diagnostics Status Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagnostics Status Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationResponseImpl <em>Diagnostics Status Notification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatusNotificationResponse()
	 * @generated
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE = 7;

	/**
	 * The number of structural features of the '<em>Diagnostics Status Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Diagnostics Status Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

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
	 * The feature id for the '<em><b>Authorize Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHORIZE_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Authorize Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHORIZE_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Boot Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Boot Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Charge Box Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHARGE_BOX_IDENTITY = 7;

	/**
	 * The feature id for the '<em><b>Data Transfer Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_TRANSFER_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Data Transfer Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Diagnostics Status Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST = 10;

	/**
	 * The feature id for the '<em><b>Diagnostics Status Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Firmware Status Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Firmware Status Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Heartbeat Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEARTBEAT_REQUEST = 14;

	/**
	 * The feature id for the '<em><b>Heartbeat Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEARTBEAT_RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Meter Values Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METER_VALUES_REQUEST = 16;

	/**
	 * The feature id for the '<em><b>Meter Values Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METER_VALUES_RESPONSE = 17;

	/**
	 * The feature id for the '<em><b>Start Transaction Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_TRANSACTION_REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Start Transaction Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_TRANSACTION_RESPONSE = 19;

	/**
	 * The feature id for the '<em><b>Status Notification Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST = 20;

	/**
	 * The feature id for the '<em><b>Status Notification Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE = 21;

	/**
	 * The feature id for the '<em><b>Stop Transaction Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST = 22;

	/**
	 * The feature id for the '<em><b>Stop Transaction Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE = 23;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationRequestImpl <em>Firmware Status Notification Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatusNotificationRequest()
	 * @generated
	 */
	int FIRMWARE_STATUS_NOTIFICATION_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_STATUS_NOTIFICATION_REQUEST__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Firmware Status Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_STATUS_NOTIFICATION_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Firmware Status Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_STATUS_NOTIFICATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationResponseImpl <em>Firmware Status Notification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatusNotificationResponse()
	 * @generated
	 */
	int FIRMWARE_STATUS_NOTIFICATION_RESPONSE = 10;

	/**
	 * The number of structural features of the '<em>Firmware Status Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_STATUS_NOTIFICATION_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Firmware Status Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_STATUS_NOTIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatRequestImpl <em>Heartbeat Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getHeartbeatRequest()
	 * @generated
	 */
	int HEARTBEAT_REQUEST = 11;

	/**
	 * The number of structural features of the '<em>Heartbeat Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTBEAT_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Heartbeat Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTBEAT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatResponseImpl <em>Heartbeat Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getHeartbeatResponse()
	 * @generated
	 */
	int HEARTBEAT_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTBEAT_RESPONSE__CURRENT_TIME = 0;

	/**
	 * The number of structural features of the '<em>Heartbeat Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTBEAT_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Heartbeat Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTBEAT_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.IdTagInfoImpl <em>Id Tag Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.IdTagInfoImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getIdTagInfo()
	 * @generated
	 */
	int ID_TAG_INFO = 13;

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
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValueImpl <em>Meter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.MeterValueImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeterValue()
	 * @generated
	 */
	int METER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Sampled Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUE__SAMPLED_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl <em>Meter Values Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeterValuesRequest()
	 * @generated
	 */
	int METER_VALUES_REQUEST = 15;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_REQUEST__TRANSACTION_ID = 1;

	/**
	 * The feature id for the '<em><b>Meter Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_REQUEST__METER_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Meter Values Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meter Values Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesResponseImpl <em>Meter Values Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeterValuesResponse()
	 * @generated
	 */
	int METER_VALUES_RESPONSE = 16;

	/**
	 * The number of structural features of the '<em>Meter Values Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Meter Values Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_VALUES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.SampledValueImpl <em>Sampled Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.SampledValueImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getSampledValue()
	 * @generated
	 */
	int SAMPLED_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__MEASURAND = 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__PHASE = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE__UNIT = 6;

	/**
	 * The number of structural features of the '<em>Sampled Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Sampled Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl <em>Start Transaction Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStartTransactionRequest()
	 * @generated
	 */
	int START_TRANSACTION_REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST__ID_TAG = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Meter Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST__METER_START = 3;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST__RESERVATION_ID = 4;

	/**
	 * The number of structural features of the '<em>Start Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Start Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionResponseImpl <em>Start Transaction Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStartTransactionResponse()
	 * @generated
	 */
	int START_TRANSACTION_RESPONSE = 19;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_RESPONSE__TRANSACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Id Tag Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_RESPONSE__ID_TAG_INFO = 1;

	/**
	 * The number of structural features of the '<em>Start Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Start Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TRANSACTION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl <em>Status Notification Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStatusNotificationRequest()
	 * @generated
	 */
	int STATUS_NOTIFICATION_REQUEST = 20;

	/**
	 * The feature id for the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__ERROR_CODE = 2;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__INFO = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__VENDOR_ID = 5;

	/**
	 * The feature id for the '<em><b>Vendor Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE = 6;

	/**
	 * The number of structural features of the '<em>Status Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Status Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationResponseImpl <em>Status Notification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStatusNotificationResponse()
	 * @generated
	 */
	int STATUS_NOTIFICATION_RESPONSE = 21;

	/**
	 * The number of structural features of the '<em>Status Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Status Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_NOTIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl <em>Stop Transaction Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStopTransactionRequest()
	 * @generated
	 */
	int STOP_TRANSACTION_REQUEST = 22;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST__TRANSACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST__ID_TAG = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Meter Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST__METER_STOP = 3;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST__REASON = 4;

	/**
	 * The feature id for the '<em><b>Transaction Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST__TRANSACTION_DATA = 5;

	/**
	 * The number of structural features of the '<em>Stop Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stop Transaction Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionResponseImpl <em>Stop Transaction Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionResponseImpl
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStopTransactionResponse()
	 * @generated
	 */
	int STOP_TRANSACTION_RESPONSE = 23;

	/**
	 * The feature id for the '<em><b>Id Tag Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_RESPONSE__ID_TAG_INFO = 0;

	/**
	 * The number of structural features of the '<em>Stop Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stop Transaction Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TRANSACTION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus <em>Authorization Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizationStatus()
	 * @generated
	 */
	int AUTHORIZATION_STATUS = 24;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode <em>Charge Point Error Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointErrorCode()
	 * @generated
	 */
	int CHARGE_POINT_ERROR_CODE = 25;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointStatus <em>Charge Point Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointStatus()
	 * @generated
	 */
	int CHARGE_POINT_STATUS = 26;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferStatus <em>Data Transfer Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferStatus()
	 * @generated
	 */
	int DATA_TRANSFER_STATUS = 27;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus <em>Diagnostics Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatus()
	 * @generated
	 */
	int DIAGNOSTICS_STATUS = 28;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatus <em>Firmware Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatus()
	 * @generated
	 */
	int FIRMWARE_STATUS = 29;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Location
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 30;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.Measurand <em>Measurand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Measurand
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeasurand()
	 * @generated
	 */
	int MEASURAND = 31;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.Phase <em>Phase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Phase
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 32;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.ReadingContext <em>Reading Context</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ReadingContext
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReadingContext()
	 * @generated
	 */
	int READING_CONTEXT = 33;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.Reason <em>Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Reason
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReason()
	 * @generated
	 */
	int REASON = 34;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.RegistrationStatus <em>Registration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.RegistrationStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getRegistrationStatus()
	 * @generated
	 */
	int REGISTRATION_STATUS = 35;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure <em>Unit Of Measure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getUnitOfMeasure()
	 * @generated
	 */
	int UNIT_OF_MEASURE = 36;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.ocpp.centralsystem.ValueFormat <em>Value Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ValueFormat
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getValueFormat()
	 * @generated
	 */
	int VALUE_FORMAT = 37;

	/**
	 * The meta object id for the '<em>Authorization Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizationStatusObject()
	 * @generated
	 */
	int AUTHORIZATION_STATUS_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Charge Point Error Code Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointErrorCodeObject()
	 * @generated
	 */
	int CHARGE_POINT_ERROR_CODE_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Charge Point Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointStatusObject()
	 * @generated
	 */
	int CHARGE_POINT_STATUS_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Ci String20 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString20Type()
	 * @generated
	 */
	int CI_STRING20_TYPE = 41;

	/**
	 * The meta object id for the '<em>Ci String255 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString255Type()
	 * @generated
	 */
	int CI_STRING255_TYPE = 42;

	/**
	 * The meta object id for the '<em>Ci String25 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString25Type()
	 * @generated
	 */
	int CI_STRING25_TYPE = 43;

	/**
	 * The meta object id for the '<em>Ci String500 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString500Type()
	 * @generated
	 */
	int CI_STRING500_TYPE = 44;

	/**
	 * The meta object id for the '<em>Ci String50 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString50Type()
	 * @generated
	 */
	int CI_STRING50_TYPE = 45;

	/**
	 * The meta object id for the '<em>Data Transfer Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferStatusObject()
	 * @generated
	 */
	int DATA_TRANSFER_STATUS_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Diagnostics Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatusObject()
	 * @generated
	 */
	int DIAGNOSTICS_STATUS_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Firmware Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatusObject()
	 * @generated
	 */
	int FIRMWARE_STATUS_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Id Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getIdToken()
	 * @generated
	 */
	int ID_TOKEN = 49;

	/**
	 * The meta object id for the '<em>Location Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Location
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getLocationObject()
	 * @generated
	 */
	int LOCATION_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Measurand Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Measurand
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeasurandObject()
	 * @generated
	 */
	int MEASURAND_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Phase Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Phase
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getPhaseObject()
	 * @generated
	 */
	int PHASE_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Reading Context Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ReadingContext
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReadingContextObject()
	 * @generated
	 */
	int READING_CONTEXT_OBJECT = 53;

	/**
	 * The meta object id for the '<em>Reason Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.Reason
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReasonObject()
	 * @generated
	 */
	int REASON_OBJECT = 54;

	/**
	 * The meta object id for the '<em>Registration Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.RegistrationStatus
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getRegistrationStatusObject()
	 * @generated
	 */
	int REGISTRATION_STATUS_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Unit Of Measure Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getUnitOfMeasureObject()
	 * @generated
	 */
	int UNIT_OF_MEASURE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Value Format Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.ocpp.centralsystem.ValueFormat
	 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getValueFormatObject()
	 * @generated
	 */
	int VALUE_FORMAT_OBJECT = 57;


	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest <em>Authorize Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorize Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest
	 * @generated
	 */
	EClass getAuthorizeRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest#getIdTag <em>Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest#getIdTag()
	 * @see #getAuthorizeRequest()
	 * @generated
	 */
	EAttribute getAuthorizeRequest_IdTag();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse <em>Authorize Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorize Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse
	 * @generated
	 */
	EClass getAuthorizeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse#getIdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag Info</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse#getIdTagInfo()
	 * @see #getAuthorizeResponse()
	 * @generated
	 */
	EAttribute getAuthorizeResponse_IdTagInfo();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest <em>Boot Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boot Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest
	 * @generated
	 */
	EClass getBootNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointVendor <em>Charge Point Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Point Vendor</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointVendor()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_ChargePointVendor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointModel <em>Charge Point Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Point Model</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointModel()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_ChargePointModel();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointSerialNumber <em>Charge Point Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Point Serial Number</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargePointSerialNumber()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_ChargePointSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargeBoxSerialNumber <em>Charge Box Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Box Serial Number</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getChargeBoxSerialNumber()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_ChargeBoxSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getFirmwareVersion <em>Firmware Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware Version</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getFirmwareVersion()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_FirmwareVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getIccid <em>Iccid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iccid</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getIccid()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_Iccid();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getImsi <em>Imsi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imsi</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getImsi()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_Imsi();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterType <em>Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Type</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterType()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_MeterType();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterSerialNumber <em>Meter Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Serial Number</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest#getMeterSerialNumber()
	 * @see #getBootNotificationRequest()
	 * @generated
	 */
	EAttribute getBootNotificationRequest_MeterSerialNumber();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse <em>Boot Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boot Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse
	 * @generated
	 */
	EClass getBootNotificationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getStatus()
	 * @see #getBootNotificationResponse()
	 * @generated
	 */
	EAttribute getBootNotificationResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getCurrentTime()
	 * @see #getBootNotificationResponse()
	 * @generated
	 */
	EAttribute getBootNotificationResponse_CurrentTime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse#getInterval()
	 * @see #getBootNotificationResponse()
	 * @generated
	 */
	EAttribute getBootNotificationResponse_Interval();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest <em>Data Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfer Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferRequest
	 * @generated
	 */
	EClass getDataTransferRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getVendorId <em>Vendor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getVendorId()
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	EAttribute getDataTransferRequest_VendorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getMessageId()
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	EAttribute getDataTransferRequest_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getData()
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	EAttribute getDataTransferRequest_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferResponse <em>Data Transfer Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfer Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferResponse
	 * @generated
	 */
	EClass getDataTransferResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferResponse#getStatus()
	 * @see #getDataTransferResponse()
	 * @generated
	 */
	EAttribute getDataTransferResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferResponse#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferResponse#getData()
	 * @see #getDataTransferResponse()
	 * @generated
	 */
	EAttribute getDataTransferResponse_Data();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest <em>Diagnostics Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostics Status Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest
	 * @generated
	 */
	EClass getDiagnosticsStatusNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest#getStatus()
	 * @see #getDiagnosticsStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getDiagnosticsStatusNotificationRequest_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse <em>Diagnostics Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostics Status Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse
	 * @generated
	 */
	EClass getDiagnosticsStatusNotificationResponse();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeRequest <em>Authorize Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorize Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AuthorizeRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeResponse <em>Authorize Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorize Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getAuthorizeResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AuthorizeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationRequest <em>Boot Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BootNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationResponse <em>Boot Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getBootNotificationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BootNotificationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getChargeBoxIdentity <em>Charge Box Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Box Identity</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getChargeBoxIdentity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ChargeBoxIdentity();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferRequest <em>Data Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Transfer Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataTransferRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferResponse <em>Data Transfer Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Transfer Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDataTransferResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DataTransferResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationRequest <em>Diagnostics Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostics Status Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiagnosticsStatusNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationResponse <em>Diagnostics Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnostics Status Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getDiagnosticsStatusNotificationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DiagnosticsStatusNotificationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationRequest <em>Firmware Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware Status Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FirmwareStatusNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationResponse <em>Firmware Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware Status Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getFirmwareStatusNotificationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FirmwareStatusNotificationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatRequest <em>Heartbeat Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heartbeat Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HeartbeatRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatResponse <em>Heartbeat Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heartbeat Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getHeartbeatResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HeartbeatResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesRequest <em>Meter Values Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Values Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MeterValuesRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesResponse <em>Meter Values Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Values Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getMeterValuesResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MeterValuesResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionRequest <em>Start Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartTransactionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionResponse <em>Start Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStartTransactionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartTransactionResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationRequest <em>Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StatusNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationResponse <em>Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStatusNotificationResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StatusNotificationResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionRequest <em>Stop Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionRequest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StopTransactionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionResponse <em>Stop Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot#getStopTransactionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StopTransactionResponse();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest <em>Firmware Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmware Status Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest
	 * @generated
	 */
	EClass getFirmwareStatusNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest#getStatus()
	 * @see #getFirmwareStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getFirmwareStatusNotificationRequest_Status();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse <em>Firmware Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmware Status Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse
	 * @generated
	 */
	EClass getFirmwareStatusNotificationResponse();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest <em>Heartbeat Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heartbeat Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest
	 * @generated
	 */
	EClass getHeartbeatRequest();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse <em>Heartbeat Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heartbeat Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse
	 * @generated
	 */
	EClass getHeartbeatResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse#getCurrentTime()
	 * @see #getHeartbeatResponse()
	 * @generated
	 */
	EAttribute getHeartbeatResponse_CurrentTime();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Tag Info</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.IdTagInfo
	 * @generated
	 */
	EClass getIdTagInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getStatus()
	 * @see #getIdTagInfo()
	 * @generated
	 */
	EAttribute getIdTagInfo_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getExpiryDate()
	 * @see #getIdTagInfo()
	 * @generated
	 */
	EAttribute getIdTagInfo_ExpiryDate();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getParentIdTag <em>Parent Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getParentIdTag()
	 * @see #getIdTagInfo()
	 * @generated
	 */
	EAttribute getIdTagInfo_ParentIdTag();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.MeterValue <em>Meter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Value</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValue
	 * @generated
	 */
	EClass getMeterValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.MeterValue#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValue#getTimestamp()
	 * @see #getMeterValue()
	 * @generated
	 */
	EAttribute getMeterValue_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.centralsystem.MeterValue#getSampledValue <em>Sampled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sampled Value</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValue#getSampledValue()
	 * @see #getMeterValue()
	 * @generated
	 */
	EAttribute getMeterValue_SampledValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest <em>Meter Values Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Values Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest
	 * @generated
	 */
	EClass getMeterValuesRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest#getConnectorId()
	 * @see #getMeterValuesRequest()
	 * @generated
	 */
	EAttribute getMeterValuesRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest#getTransactionId()
	 * @see #getMeterValuesRequest()
	 * @generated
	 */
	EAttribute getMeterValuesRequest_TransactionId();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest#getMeterValue <em>Meter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Meter Value</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest#getMeterValue()
	 * @see #getMeterValuesRequest()
	 * @generated
	 */
	EAttribute getMeterValuesRequest_MeterValue();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse <em>Meter Values Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Values Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse
	 * @generated
	 */
	EClass getMeterValuesResponse();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue <em>Sampled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampled Value</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue
	 * @generated
	 */
	EClass getSampledValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getValue()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getContext()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Context();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getFormat()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Format();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getMeasurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurand</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getMeasurand()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Measurand();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getPhase()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Phase();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getLocation()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue#getUnit()
	 * @see #getSampledValue()
	 * @generated
	 */
	EAttribute getSampledValue_Unit();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest <em>Start Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest
	 * @generated
	 */
	EClass getStartTransactionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getConnectorId()
	 * @see #getStartTransactionRequest()
	 * @generated
	 */
	EAttribute getStartTransactionRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getIdTag <em>Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getIdTag()
	 * @see #getStartTransactionRequest()
	 * @generated
	 */
	EAttribute getStartTransactionRequest_IdTag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getTimestamp()
	 * @see #getStartTransactionRequest()
	 * @generated
	 */
	EAttribute getStartTransactionRequest_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getMeterStart <em>Meter Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Start</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getMeterStart()
	 * @see #getStartTransactionRequest()
	 * @generated
	 */
	EAttribute getStartTransactionRequest_MeterStart();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getReservationId <em>Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest#getReservationId()
	 * @see #getStartTransactionRequest()
	 * @generated
	 */
	EAttribute getStartTransactionRequest_ReservationId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse <em>Start Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse
	 * @generated
	 */
	EClass getStartTransactionResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getTransactionId()
	 * @see #getStartTransactionResponse()
	 * @generated
	 */
	EAttribute getStartTransactionResponse_TransactionId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getIdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag Info</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getIdTagInfo()
	 * @see #getStartTransactionResponse()
	 * @generated
	 */
	EAttribute getStartTransactionResponse_IdTagInfo();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest <em>Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Notification Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest
	 * @generated
	 */
	EClass getStatusNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getConnectorId <em>Connector Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getConnectorId()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_ConnectorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getStatus()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getErrorCode()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getInfo()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_Info();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getTimestamp()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getVendorId <em>Vendor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getVendorId()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_VendorId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getVendorErrorCode <em>Vendor Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Error Code</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest#getVendorErrorCode()
	 * @see #getStatusNotificationRequest()
	 * @generated
	 */
	EAttribute getStatusNotificationRequest_VendorErrorCode();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse <em>Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Notification Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse
	 * @generated
	 */
	EClass getStatusNotificationResponse();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest <em>Stop Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Transaction Request</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest
	 * @generated
	 */
	EClass getStopTransactionRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionId()
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	EAttribute getStopTransactionRequest_TransactionId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getIdTag <em>Id Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getIdTag()
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	EAttribute getStopTransactionRequest_IdTag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTimestamp()
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	EAttribute getStopTransactionRequest_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getMeterStop <em>Meter Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Stop</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getMeterStop()
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	EAttribute getStopTransactionRequest_MeterStop();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getReason()
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	EAttribute getStopTransactionRequest_Reason();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionData <em>Transaction Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transaction Data</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionData()
	 * @see #getStopTransactionRequest()
	 * @generated
	 */
	EAttribute getStopTransactionRequest_TransactionData();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse <em>Stop Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Transaction Response</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse
	 * @generated
	 */
	EClass getStopTransactionResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse#getIdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tag Info</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse#getIdTagInfo()
	 * @see #getStopTransactionResponse()
	 * @generated
	 */
	EAttribute getStopTransactionResponse_IdTagInfo();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus <em>Authorization Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authorization Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus
	 * @generated
	 */
	EEnum getAuthorizationStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode <em>Charge Point Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Point Error Code</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode
	 * @generated
	 */
	EEnum getChargePointErrorCode();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointStatus <em>Charge Point Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Point Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointStatus
	 * @generated
	 */
	EEnum getChargePointStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferStatus <em>Data Transfer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Transfer Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferStatus
	 * @generated
	 */
	EEnum getDataTransferStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus <em>Diagnostics Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostics Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus
	 * @generated
	 */
	EEnum getDiagnosticsStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatus <em>Firmware Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Firmware Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatus
	 * @generated
	 */
	EEnum getFirmwareStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Location
	 * @generated
	 */
	EEnum getLocation();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.Measurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurand</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Measurand
	 * @generated
	 */
	EEnum getMeasurand();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phase</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Phase
	 * @generated
	 */
	EEnum getPhase();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.ReadingContext <em>Reading Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reading Context</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ReadingContext
	 * @generated
	 */
	EEnum getReadingContext();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.Reason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Reason
	 * @generated
	 */
	EEnum getReason();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.RegistrationStatus <em>Registration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Registration Status</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.RegistrationStatus
	 * @generated
	 */
	EEnum getRegistrationStatus();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Of Measure</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure
	 * @generated
	 */
	EEnum getUnitOfMeasure();

	/**
	 * Returns the meta object for enum '{@link de.jena.sensinact.ocpp.centralsystem.ValueFormat <em>Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Format</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ValueFormat
	 * @generated
	 */
	EEnum getValueFormat();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus <em>Authorization Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Authorization Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus"
	 *        extendedMetaData="name='AuthorizationStatus:Object' baseType='AuthorizationStatus'"
	 * @generated
	 */
	EDataType getAuthorizationStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode <em>Charge Point Error Code Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charge Point Error Code Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode"
	 *        extendedMetaData="name='ChargePointErrorCode:Object' baseType='ChargePointErrorCode'"
	 * @generated
	 */
	EDataType getChargePointErrorCodeObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointStatus <em>Charge Point Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charge Point Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.ChargePointStatus"
	 *        extendedMetaData="name='ChargePointStatus:Object' baseType='ChargePointStatus'"
	 * @generated
	 */
	EDataType getChargePointStatusObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ci String20 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * String of maximum 20 printable characters. To be treated as case insensitive.
     *             
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
     *             
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
     *             
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
     *             
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
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ci String50 Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CiString50Type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
	 * @generated
	 */
	EDataType getCiString50Type();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferStatus <em>Data Transfer Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Transfer Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.DataTransferStatus"
	 *        extendedMetaData="name='DataTransferStatus:Object' baseType='DataTransferStatus'"
	 * @generated
	 */
	EDataType getDataTransferStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus <em>Diagnostics Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Diagnostics Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus"
	 *        extendedMetaData="name='DiagnosticsStatus:Object' baseType='DiagnosticsStatus'"
	 * @generated
	 */
	EDataType getDiagnosticsStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatus <em>Firmware Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Firmware Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.FirmwareStatus"
	 *        extendedMetaData="name='FirmwareStatus:Object' baseType='FirmwareStatus'"
	 * @generated
	 */
	EDataType getFirmwareStatusObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of string defining identification token, e.g. RFID or credit card number. To be
     *                 treated as case insensitive.
     *             
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Id Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IdToken' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='20'"
	 * @generated
	 */
	EDataType getIdToken();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.Location <em>Location Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Location Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Location
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.Location"
	 *        extendedMetaData="name='Location:Object' baseType='Location'"
	 * @generated
	 */
	EDataType getLocationObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.Measurand <em>Measurand Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Measurand Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Measurand
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.Measurand"
	 *        extendedMetaData="name='Measurand:Object' baseType='Measurand'"
	 * @generated
	 */
	EDataType getMeasurandObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.Phase <em>Phase Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phase Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Phase
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.Phase"
	 *        extendedMetaData="name='Phase:Object' baseType='Phase'"
	 * @generated
	 */
	EDataType getPhaseObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.ReadingContext <em>Reading Context Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reading Context Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ReadingContext
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.ReadingContext"
	 *        extendedMetaData="name='ReadingContext:Object' baseType='ReadingContext'"
	 * @generated
	 */
	EDataType getReadingContextObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.Reason <em>Reason Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reason Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.Reason
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.Reason"
	 *        extendedMetaData="name='Reason:Object' baseType='Reason'"
	 * @generated
	 */
	EDataType getReasonObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.RegistrationStatus <em>Registration Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registration Status Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.RegistrationStatus
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.RegistrationStatus"
	 *        extendedMetaData="name='RegistrationStatus:Object' baseType='RegistrationStatus'"
	 * @generated
	 */
	EDataType getRegistrationStatusObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure <em>Unit Of Measure Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit Of Measure Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure"
	 *        extendedMetaData="name='UnitOfMeasure:Object' baseType='UnitOfMeasure'"
	 * @generated
	 */
	EDataType getUnitOfMeasureObject();

	/**
	 * Returns the meta object for data type '{@link de.jena.sensinact.ocpp.centralsystem.ValueFormat <em>Value Format Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Format Object</em>'.
	 * @see de.jena.sensinact.ocpp.centralsystem.ValueFormat
	 * @model instanceClass="de.jena.sensinact.ocpp.centralsystem.ValueFormat"
	 *        extendedMetaData="name='ValueFormat:Object' baseType='ValueFormat'"
	 * @generated
	 */
	EDataType getValueFormatObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OcppCentralSystemFactory getOcppCentralSystemFactory();

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
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeRequestImpl <em>Authorize Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizeRequest()
		 * @generated
		 */
		EClass AUTHORIZE_REQUEST = eINSTANCE.getAuthorizeRequest();

		/**
		 * The meta object literal for the '<em><b>Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZE_REQUEST__ID_TAG = eINSTANCE.getAuthorizeRequest_IdTag();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeResponseImpl <em>Authorize Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.AuthorizeResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizeResponse()
		 * @generated
		 */
		EClass AUTHORIZE_RESPONSE = eINSTANCE.getAuthorizeResponse();

		/**
		 * The meta object literal for the '<em><b>Id Tag Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZE_RESPONSE__ID_TAG_INFO = eINSTANCE.getAuthorizeResponse_IdTagInfo();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl <em>Boot Notification Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getBootNotificationRequest()
		 * @generated
		 */
		EClass BOOT_NOTIFICATION_REQUEST = eINSTANCE.getBootNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Charge Point Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR = eINSTANCE.getBootNotificationRequest_ChargePointVendor();

		/**
		 * The meta object literal for the '<em><b>Charge Point Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL = eINSTANCE.getBootNotificationRequest_ChargePointModel();

		/**
		 * The meta object literal for the '<em><b>Charge Point Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER = eINSTANCE.getBootNotificationRequest_ChargePointSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Charge Box Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER = eINSTANCE.getBootNotificationRequest_ChargeBoxSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Firmware Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION = eINSTANCE.getBootNotificationRequest_FirmwareVersion();

		/**
		 * The meta object literal for the '<em><b>Iccid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__ICCID = eINSTANCE.getBootNotificationRequest_Iccid();

		/**
		 * The meta object literal for the '<em><b>Imsi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__IMSI = eINSTANCE.getBootNotificationRequest_Imsi();

		/**
		 * The meta object literal for the '<em><b>Meter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__METER_TYPE = eINSTANCE.getBootNotificationRequest_MeterType();

		/**
		 * The meta object literal for the '<em><b>Meter Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER = eINSTANCE.getBootNotificationRequest_MeterSerialNumber();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl <em>Boot Notification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getBootNotificationResponse()
		 * @generated
		 */
		EClass BOOT_NOTIFICATION_RESPONSE = eINSTANCE.getBootNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_RESPONSE__STATUS = eINSTANCE.getBootNotificationResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME = eINSTANCE.getBootNotificationResponse_CurrentTime();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOT_NOTIFICATION_RESPONSE__INTERVAL = eINSTANCE.getBootNotificationResponse_Interval();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl <em>Data Transfer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferRequest()
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
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferResponseImpl <em>Data Transfer Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.DataTransferResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferResponse()
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
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationRequestImpl <em>Diagnostics Status Notification Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatusNotificationRequest()
		 * @generated
		 */
		EClass DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST = eINSTANCE.getDiagnosticsStatusNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST__STATUS = eINSTANCE.getDiagnosticsStatusNotificationRequest_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationResponseImpl <em>Diagnostics Status Notification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.DiagnosticsStatusNotificationResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatusNotificationResponse()
		 * @generated
		 */
		EClass DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE = eINSTANCE.getDiagnosticsStatusNotificationResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.DocumentRootImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Authorize Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUTHORIZE_REQUEST = eINSTANCE.getDocumentRoot_AuthorizeRequest();

		/**
		 * The meta object literal for the '<em><b>Authorize Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUTHORIZE_RESPONSE = eINSTANCE.getDocumentRoot_AuthorizeResponse();

		/**
		 * The meta object literal for the '<em><b>Boot Notification Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST = eINSTANCE.getDocumentRoot_BootNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Boot Notification Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE = eINSTANCE.getDocumentRoot_BootNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Charge Box Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CHARGE_BOX_IDENTITY = eINSTANCE.getDocumentRoot_ChargeBoxIdentity();

		/**
		 * The meta object literal for the '<em><b>Data Transfer Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_TRANSFER_REQUEST = eINSTANCE.getDocumentRoot_DataTransferRequest();

		/**
		 * The meta object literal for the '<em><b>Data Transfer Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE = eINSTANCE.getDocumentRoot_DataTransferResponse();

		/**
		 * The meta object literal for the '<em><b>Diagnostics Status Notification Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST = eINSTANCE.getDocumentRoot_DiagnosticsStatusNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Diagnostics Status Notification Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE = eINSTANCE.getDocumentRoot_DiagnosticsStatusNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Firmware Status Notification Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST = eINSTANCE.getDocumentRoot_FirmwareStatusNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Firmware Status Notification Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE = eINSTANCE.getDocumentRoot_FirmwareStatusNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Heartbeat Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HEARTBEAT_REQUEST = eINSTANCE.getDocumentRoot_HeartbeatRequest();

		/**
		 * The meta object literal for the '<em><b>Heartbeat Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HEARTBEAT_RESPONSE = eINSTANCE.getDocumentRoot_HeartbeatResponse();

		/**
		 * The meta object literal for the '<em><b>Meter Values Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__METER_VALUES_REQUEST = eINSTANCE.getDocumentRoot_MeterValuesRequest();

		/**
		 * The meta object literal for the '<em><b>Meter Values Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__METER_VALUES_RESPONSE = eINSTANCE.getDocumentRoot_MeterValuesResponse();

		/**
		 * The meta object literal for the '<em><b>Start Transaction Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_TRANSACTION_REQUEST = eINSTANCE.getDocumentRoot_StartTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Start Transaction Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_TRANSACTION_RESPONSE = eINSTANCE.getDocumentRoot_StartTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Status Notification Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST = eINSTANCE.getDocumentRoot_StatusNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Status Notification Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE = eINSTANCE.getDocumentRoot_StatusNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Stop Transaction Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST = eINSTANCE.getDocumentRoot_StopTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Stop Transaction Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE = eINSTANCE.getDocumentRoot_StopTransactionResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationRequestImpl <em>Firmware Status Notification Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatusNotificationRequest()
		 * @generated
		 */
		EClass FIRMWARE_STATUS_NOTIFICATION_REQUEST = eINSTANCE.getFirmwareStatusNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMWARE_STATUS_NOTIFICATION_REQUEST__STATUS = eINSTANCE.getFirmwareStatusNotificationRequest_Status();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationResponseImpl <em>Firmware Status Notification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.FirmwareStatusNotificationResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatusNotificationResponse()
		 * @generated
		 */
		EClass FIRMWARE_STATUS_NOTIFICATION_RESPONSE = eINSTANCE.getFirmwareStatusNotificationResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatRequestImpl <em>Heartbeat Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getHeartbeatRequest()
		 * @generated
		 */
		EClass HEARTBEAT_REQUEST = eINSTANCE.getHeartbeatRequest();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatResponseImpl <em>Heartbeat Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.HeartbeatResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getHeartbeatResponse()
		 * @generated
		 */
		EClass HEARTBEAT_RESPONSE = eINSTANCE.getHeartbeatResponse();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEARTBEAT_RESPONSE__CURRENT_TIME = eINSTANCE.getHeartbeatResponse_CurrentTime();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.IdTagInfoImpl <em>Id Tag Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.IdTagInfoImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getIdTagInfo()
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
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValueImpl <em>Meter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.MeterValueImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeterValue()
		 * @generated
		 */
		EClass METER_VALUE = eINSTANCE.getMeterValue();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_VALUE__TIMESTAMP = eINSTANCE.getMeterValue_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Sampled Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_VALUE__SAMPLED_VALUE = eINSTANCE.getMeterValue_SampledValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl <em>Meter Values Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeterValuesRequest()
		 * @generated
		 */
		EClass METER_VALUES_REQUEST = eINSTANCE.getMeterValuesRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_VALUES_REQUEST__CONNECTOR_ID = eINSTANCE.getMeterValuesRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_VALUES_REQUEST__TRANSACTION_ID = eINSTANCE.getMeterValuesRequest_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Meter Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_VALUES_REQUEST__METER_VALUE = eINSTANCE.getMeterValuesRequest_MeterValue();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesResponseImpl <em>Meter Values Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeterValuesResponse()
		 * @generated
		 */
		EClass METER_VALUES_RESPONSE = eINSTANCE.getMeterValuesResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.SampledValueImpl <em>Sampled Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.SampledValueImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getSampledValue()
		 * @generated
		 */
		EClass SAMPLED_VALUE = eINSTANCE.getSampledValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__VALUE = eINSTANCE.getSampledValue_Value();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__CONTEXT = eINSTANCE.getSampledValue_Context();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__FORMAT = eINSTANCE.getSampledValue_Format();

		/**
		 * The meta object literal for the '<em><b>Measurand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__MEASURAND = eINSTANCE.getSampledValue_Measurand();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__PHASE = eINSTANCE.getSampledValue_Phase();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__LOCATION = eINSTANCE.getSampledValue_Location();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLED_VALUE__UNIT = eINSTANCE.getSampledValue_Unit();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl <em>Start Transaction Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStartTransactionRequest()
		 * @generated
		 */
		EClass START_TRANSACTION_REQUEST = eINSTANCE.getStartTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_REQUEST__CONNECTOR_ID = eINSTANCE.getStartTransactionRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_REQUEST__ID_TAG = eINSTANCE.getStartTransactionRequest_IdTag();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_REQUEST__TIMESTAMP = eINSTANCE.getStartTransactionRequest_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Meter Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_REQUEST__METER_START = eINSTANCE.getStartTransactionRequest_MeterStart();

		/**
		 * The meta object literal for the '<em><b>Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_REQUEST__RESERVATION_ID = eINSTANCE.getStartTransactionRequest_ReservationId();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionResponseImpl <em>Start Transaction Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStartTransactionResponse()
		 * @generated
		 */
		EClass START_TRANSACTION_RESPONSE = eINSTANCE.getStartTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_RESPONSE__TRANSACTION_ID = eINSTANCE.getStartTransactionResponse_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Id Tag Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TRANSACTION_RESPONSE__ID_TAG_INFO = eINSTANCE.getStartTransactionResponse_IdTagInfo();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl <em>Status Notification Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStatusNotificationRequest()
		 * @generated
		 */
		EClass STATUS_NOTIFICATION_REQUEST = eINSTANCE.getStatusNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID = eINSTANCE.getStatusNotificationRequest_ConnectorId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__STATUS = eINSTANCE.getStatusNotificationRequest_Status();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__ERROR_CODE = eINSTANCE.getStatusNotificationRequest_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__INFO = eINSTANCE.getStatusNotificationRequest_Info();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__TIMESTAMP = eINSTANCE.getStatusNotificationRequest_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Vendor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__VENDOR_ID = eINSTANCE.getStatusNotificationRequest_VendorId();

		/**
		 * The meta object literal for the '<em><b>Vendor Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE = eINSTANCE.getStatusNotificationRequest_VendorErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationResponseImpl <em>Status Notification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStatusNotificationResponse()
		 * @generated
		 */
		EClass STATUS_NOTIFICATION_RESPONSE = eINSTANCE.getStatusNotificationResponse();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl <em>Stop Transaction Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStopTransactionRequest()
		 * @generated
		 */
		EClass STOP_TRANSACTION_REQUEST = eINSTANCE.getStopTransactionRequest();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_REQUEST__TRANSACTION_ID = eINSTANCE.getStopTransactionRequest_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Id Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_REQUEST__ID_TAG = eINSTANCE.getStopTransactionRequest_IdTag();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_REQUEST__TIMESTAMP = eINSTANCE.getStopTransactionRequest_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Meter Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_REQUEST__METER_STOP = eINSTANCE.getStopTransactionRequest_MeterStop();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_REQUEST__REASON = eINSTANCE.getStopTransactionRequest_Reason();

		/**
		 * The meta object literal for the '<em><b>Transaction Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_REQUEST__TRANSACTION_DATA = eINSTANCE.getStopTransactionRequest_TransactionData();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionResponseImpl <em>Stop Transaction Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionResponseImpl
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getStopTransactionResponse()
		 * @generated
		 */
		EClass STOP_TRANSACTION_RESPONSE = eINSTANCE.getStopTransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Id Tag Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TRANSACTION_RESPONSE__ID_TAG_INFO = eINSTANCE.getStopTransactionResponse_IdTagInfo();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus <em>Authorization Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizationStatus()
		 * @generated
		 */
		EEnum AUTHORIZATION_STATUS = eINSTANCE.getAuthorizationStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode <em>Charge Point Error Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointErrorCode()
		 * @generated
		 */
		EEnum CHARGE_POINT_ERROR_CODE = eINSTANCE.getChargePointErrorCode();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.ChargePointStatus <em>Charge Point Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointStatus()
		 * @generated
		 */
		EEnum CHARGE_POINT_STATUS = eINSTANCE.getChargePointStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferStatus <em>Data Transfer Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferStatus()
		 * @generated
		 */
		EEnum DATA_TRANSFER_STATUS = eINSTANCE.getDataTransferStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus <em>Diagnostics Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatus()
		 * @generated
		 */
		EEnum DIAGNOSTICS_STATUS = eINSTANCE.getDiagnosticsStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatus <em>Firmware Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatus()
		 * @generated
		 */
		EEnum FIRMWARE_STATUS = eINSTANCE.getFirmwareStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.Location <em>Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Location
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getLocation()
		 * @generated
		 */
		EEnum LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.Measurand <em>Measurand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Measurand
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeasurand()
		 * @generated
		 */
		EEnum MEASURAND = eINSTANCE.getMeasurand();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.Phase <em>Phase</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Phase
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getPhase()
		 * @generated
		 */
		EEnum PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.ReadingContext <em>Reading Context</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ReadingContext
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReadingContext()
		 * @generated
		 */
		EEnum READING_CONTEXT = eINSTANCE.getReadingContext();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.Reason <em>Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Reason
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReason()
		 * @generated
		 */
		EEnum REASON = eINSTANCE.getReason();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.RegistrationStatus <em>Registration Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.RegistrationStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getRegistrationStatus()
		 * @generated
		 */
		EEnum REGISTRATION_STATUS = eINSTANCE.getRegistrationStatus();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure <em>Unit Of Measure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getUnitOfMeasure()
		 * @generated
		 */
		EEnum UNIT_OF_MEASURE = eINSTANCE.getUnitOfMeasure();

		/**
		 * The meta object literal for the '{@link de.jena.sensinact.ocpp.centralsystem.ValueFormat <em>Value Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ValueFormat
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getValueFormat()
		 * @generated
		 */
		EEnum VALUE_FORMAT = eINSTANCE.getValueFormat();

		/**
		 * The meta object literal for the '<em>Authorization Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getAuthorizationStatusObject()
		 * @generated
		 */
		EDataType AUTHORIZATION_STATUS_OBJECT = eINSTANCE.getAuthorizationStatusObject();

		/**
		 * The meta object literal for the '<em>Charge Point Error Code Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointErrorCodeObject()
		 * @generated
		 */
		EDataType CHARGE_POINT_ERROR_CODE_OBJECT = eINSTANCE.getChargePointErrorCodeObject();

		/**
		 * The meta object literal for the '<em>Charge Point Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ChargePointStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getChargePointStatusObject()
		 * @generated
		 */
		EDataType CHARGE_POINT_STATUS_OBJECT = eINSTANCE.getChargePointStatusObject();

		/**
		 * The meta object literal for the '<em>Ci String20 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString20Type()
		 * @generated
		 */
		EDataType CI_STRING20_TYPE = eINSTANCE.getCiString20Type();

		/**
		 * The meta object literal for the '<em>Ci String255 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString255Type()
		 * @generated
		 */
		EDataType CI_STRING255_TYPE = eINSTANCE.getCiString255Type();

		/**
		 * The meta object literal for the '<em>Ci String25 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString25Type()
		 * @generated
		 */
		EDataType CI_STRING25_TYPE = eINSTANCE.getCiString25Type();

		/**
		 * The meta object literal for the '<em>Ci String500 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString500Type()
		 * @generated
		 */
		EDataType CI_STRING500_TYPE = eINSTANCE.getCiString500Type();

		/**
		 * The meta object literal for the '<em>Ci String50 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getCiString50Type()
		 * @generated
		 */
		EDataType CI_STRING50_TYPE = eINSTANCE.getCiString50Type();

		/**
		 * The meta object literal for the '<em>Data Transfer Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDataTransferStatusObject()
		 * @generated
		 */
		EDataType DATA_TRANSFER_STATUS_OBJECT = eINSTANCE.getDataTransferStatusObject();

		/**
		 * The meta object literal for the '<em>Diagnostics Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getDiagnosticsStatusObject()
		 * @generated
		 */
		EDataType DIAGNOSTICS_STATUS_OBJECT = eINSTANCE.getDiagnosticsStatusObject();

		/**
		 * The meta object literal for the '<em>Firmware Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getFirmwareStatusObject()
		 * @generated
		 */
		EDataType FIRMWARE_STATUS_OBJECT = eINSTANCE.getFirmwareStatusObject();

		/**
		 * The meta object literal for the '<em>Id Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getIdToken()
		 * @generated
		 */
		EDataType ID_TOKEN = eINSTANCE.getIdToken();

		/**
		 * The meta object literal for the '<em>Location Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Location
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getLocationObject()
		 * @generated
		 */
		EDataType LOCATION_OBJECT = eINSTANCE.getLocationObject();

		/**
		 * The meta object literal for the '<em>Measurand Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Measurand
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getMeasurandObject()
		 * @generated
		 */
		EDataType MEASURAND_OBJECT = eINSTANCE.getMeasurandObject();

		/**
		 * The meta object literal for the '<em>Phase Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Phase
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getPhaseObject()
		 * @generated
		 */
		EDataType PHASE_OBJECT = eINSTANCE.getPhaseObject();

		/**
		 * The meta object literal for the '<em>Reading Context Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ReadingContext
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReadingContextObject()
		 * @generated
		 */
		EDataType READING_CONTEXT_OBJECT = eINSTANCE.getReadingContextObject();

		/**
		 * The meta object literal for the '<em>Reason Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.Reason
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getReasonObject()
		 * @generated
		 */
		EDataType REASON_OBJECT = eINSTANCE.getReasonObject();

		/**
		 * The meta object literal for the '<em>Registration Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.RegistrationStatus
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getRegistrationStatusObject()
		 * @generated
		 */
		EDataType REGISTRATION_STATUS_OBJECT = eINSTANCE.getRegistrationStatusObject();

		/**
		 * The meta object literal for the '<em>Unit Of Measure Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getUnitOfMeasureObject()
		 * @generated
		 */
		EDataType UNIT_OF_MEASURE_OBJECT = eINSTANCE.getUnitOfMeasureObject();

		/**
		 * The meta object literal for the '<em>Value Format Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.sensinact.ocpp.centralsystem.ValueFormat
		 * @see de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemPackageImpl#getValueFormatObject()
		 * @generated
		 */
		EDataType VALUE_FORMAT_OBJECT = eINSTANCE.getValueFormatObject();

	}

} //OcppCentralSystemPackage
