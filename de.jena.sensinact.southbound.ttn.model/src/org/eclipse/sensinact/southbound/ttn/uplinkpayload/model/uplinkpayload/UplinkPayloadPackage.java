/*
 */
package org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

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
 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface UplinkPayloadPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uplinkpayload";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/sensinact/ttn/uplinkpayload/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uplinkpayload";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UplinkPayloadPackage eINSTANCE = org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl <em>Ttn Uplink Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getTtnUplinkPayload()
	 * @generated
	 */
	int TTN_UPLINK_PAYLOAD = 0;

	/**
	 * The feature id for the '<em><b>End Device Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD__END_DEVICE_IDS = 0;

	/**
	 * The feature id for the '<em><b>Correlation Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD__CORRELATION_IDS = 1;

	/**
	 * The feature id for the '<em><b>Uplink Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD__CONFIRMED = 3;

	/**
	 * The feature id for the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD__RETRY = 4;

	/**
	 * The feature id for the '<em><b>Received At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD__RECEIVED_AT = 5;

	/**
	 * The number of structural features of the '<em>Ttn Uplink Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ttn Uplink Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTN_UPLINK_PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.EndDeviceIdsImpl <em>End Device Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.EndDeviceIdsImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getEndDeviceIds()
	 * @generated
	 */
	int END_DEVICE_IDS = 1;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS__DEVICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Application Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS__APPLICATION_IDS = 1;

	/**
	 * The feature id for the '<em><b>Dev Eui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS__DEV_EUI = 2;

	/**
	 * The feature id for the '<em><b>Join Eui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS__JOIN_EUI = 3;

	/**
	 * The feature id for the '<em><b>Dev Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS__DEV_ADDR = 4;

	/**
	 * The number of structural features of the '<em>End Device Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>End Device Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.ApplicationIdsImpl <em>Application Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.ApplicationIdsImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getApplicationIds()
	 * @generated
	 */
	int APPLICATION_IDS = 2;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_IDS__APPLICATION_ID = 0;

	/**
	 * The number of structural features of the '<em>Application Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_IDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.NetworkIdsImpl <em>Network Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.NetworkIdsImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getNetworkIds()
	 * @generated
	 */
	int NETWORK_IDS = 3;

	/**
	 * The feature id for the '<em><b>Net Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IDS__NET_ID = 0;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IDS__TENANT_ID = 1;

	/**
	 * The feature id for the '<em><b>Cluster Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IDS__CLUSTER_ID = 2;

	/**
	 * The feature id for the '<em><b>Cluster Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IDS__CLUSTER_ADDRESS = 3;

	/**
	 * The number of structural features of the '<em>Network Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IDS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkMessageImpl <em>Uplink Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkMessageImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getUplinkMessage()
	 * @generated
	 */
	int UPLINK_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Session Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__SESSION_KEY_ID = 0;

	/**
	 * The feature id for the '<em><b>FPort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__FPORT = 1;

	/**
	 * The feature id for the '<em><b>FCnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__FCNT = 2;

	/**
	 * The feature id for the '<em><b>Frm Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__FRM_PAYLOAD = 3;

	/**
	 * The feature id for the '<em><b>Rx Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__RX_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__SETTINGS = 5;

	/**
	 * The feature id for the '<em><b>Gateway Channel Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX = 6;

	/**
	 * The feature id for the '<em><b>Device Channel Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX = 7;

	/**
	 * The feature id for the '<em><b>Decoded Payload</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__DECODED_PAYLOAD = 8;

	/**
	 * The feature id for the '<em><b>Network Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__NETWORK_IDS = 9;

	/**
	 * The feature id for the '<em><b>Consumed Airtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__CONSUMED_AIRTIME = 10;

	/**
	 * The feature id for the '<em><b>Received At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__RECEIVED_AT = 11;

	/**
	 * The feature id for the '<em><b>Version Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE__VERSION_IDS = 12;

	/**
	 * The number of structural features of the '<em>Uplink Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Uplink Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLINK_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.GatewayIdsImpl <em>Gateway Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.GatewayIdsImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getGatewayIds()
	 * @generated
	 */
	int GATEWAY_IDS = 5;

	/**
	 * The feature id for the '<em><b>Gateway Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_IDS__GATEWAY_ID = 0;

	/**
	 * The feature id for the '<em><b>Eui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_IDS__EUI = 1;

	/**
	 * The number of structural features of the '<em>Gateway Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_IDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gateway Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.RxMetadataImpl <em>Rx Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.RxMetadataImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getRxMetadata()
	 * @generated
	 */
	int RX_METADATA = 6;

	/**
	 * The feature id for the '<em><b>Gateway Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__GATEWAY_IDS = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__TIME = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__RSSI = 3;

	/**
	 * The feature id for the '<em><b>Channel Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__CHANNEL_RSSI = 4;

	/**
	 * The feature id for the '<em><b>Snr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__SNR = 5;

	/**
	 * The feature id for the '<em><b>Uplink Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__UPLINK_TOKEN = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Received At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__RECEIVED_AT = 8;

	/**
	 * The feature id for the '<em><b>Channel Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA__CHANNEL_INDEX = 9;

	/**
	 * The number of structural features of the '<em>Rx Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Rx Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.DataRateImpl <em>Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.DataRateImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getDataRate()
	 * @generated
	 */
	int DATA_RATE = 7;

	/**
	 * The feature id for the '<em><b>Lora</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__LORA = 0;

	/**
	 * The number of structural features of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.LoraImpl <em>Lora</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.LoraImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getLora()
	 * @generated
	 */
	int LORA = 8;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LORA__BANDWIDTH = 0;

	/**
	 * The feature id for the '<em><b>Spreading Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LORA__SPREADING_FACTOR = 1;

	/**
	 * The feature id for the '<em><b>Coding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LORA__CODING_RATE = 2;

	/**
	 * The number of structural features of the '<em>Lora</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LORA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lora</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LORA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.LocationImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.StringToObjectMapImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getStringToObjectMap()
	 * @generated
	 */
	int STRING_TO_OBJECT_MAP = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.VersionIdsImpl <em>Version Ids</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.VersionIdsImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getVersionIds()
	 * @generated
	 */
	int VERSION_IDS = 11;

	/**
	 * The feature id for the '<em><b>Brand Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS__BRAND_ID = 0;

	/**
	 * The feature id for the '<em><b>Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS__MODEL_ID = 1;

	/**
	 * The feature id for the '<em><b>Hardware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS__HARDWARE_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS__FIRMWARE_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Band Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS__BAND_ID = 4;

	/**
	 * The number of structural features of the '<em>Version Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Version Ids</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_IDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.SettingsImpl
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.UplinkPayloadPackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 12;

	/**
	 * The feature id for the '<em><b>Data Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__DATA_RATE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__TIME = 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__FREQUENCY = 3;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload <em>Ttn Uplink Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttn Uplink Payload</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload
	 * @generated
	 */
	EClass getTtnUplinkPayload();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getEndDeviceIds <em>End Device Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Device Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getEndDeviceIds()
	 * @see #getTtnUplinkPayload()
	 * @generated
	 */
	EReference getTtnUplinkPayload_EndDeviceIds();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getCorrelationIds <em>Correlation Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Correlation Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getCorrelationIds()
	 * @see #getTtnUplinkPayload()
	 * @generated
	 */
	EAttribute getTtnUplinkPayload_CorrelationIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getUplinkMessage <em>Uplink Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uplink Message</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getUplinkMessage()
	 * @see #getTtnUplinkPayload()
	 * @generated
	 */
	EReference getTtnUplinkPayload_UplinkMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#isConfirmed <em>Confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#isConfirmed()
	 * @see #getTtnUplinkPayload()
	 * @generated
	 */
	EAttribute getTtnUplinkPayload_Confirmed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#isRetry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#isRetry()
	 * @see #getTtnUplinkPayload()
	 * @generated
	 */
	EAttribute getTtnUplinkPayload_Retry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getReceivedAt <em>Received At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received At</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload#getReceivedAt()
	 * @see #getTtnUplinkPayload()
	 * @generated
	 */
	EAttribute getTtnUplinkPayload_ReceivedAt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds <em>End Device Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds
	 * @generated
	 */
	EClass getEndDeviceIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getDeviceId <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getDeviceId()
	 * @see #getEndDeviceIds()
	 * @generated
	 */
	EAttribute getEndDeviceIds_DeviceId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getApplicationIds <em>Application Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getApplicationIds()
	 * @see #getEndDeviceIds()
	 * @generated
	 */
	EReference getEndDeviceIds_ApplicationIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getDevEui <em>Dev Eui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev Eui</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getDevEui()
	 * @see #getEndDeviceIds()
	 * @generated
	 */
	EAttribute getEndDeviceIds_DevEui();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getJoinEui <em>Join Eui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Eui</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getJoinEui()
	 * @see #getEndDeviceIds()
	 * @generated
	 */
	EAttribute getEndDeviceIds_JoinEui();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getDevAddr <em>Dev Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev Addr</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds#getDevAddr()
	 * @see #getEndDeviceIds()
	 * @generated
	 */
	EAttribute getEndDeviceIds_DevAddr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds <em>Application Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds
	 * @generated
	 */
	EClass getApplicationIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds#getApplicationId()
	 * @see #getApplicationIds()
	 * @generated
	 */
	EAttribute getApplicationIds_ApplicationId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds <em>Network Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds
	 * @generated
	 */
	EClass getNetworkIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getNetId <em>Net Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getNetId()
	 * @see #getNetworkIds()
	 * @generated
	 */
	EAttribute getNetworkIds_NetId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getTenantId()
	 * @see #getNetworkIds()
	 * @generated
	 */
	EAttribute getNetworkIds_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getClusterId <em>Cluster Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getClusterId()
	 * @see #getNetworkIds()
	 * @generated
	 */
	EAttribute getNetworkIds_ClusterId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getClusterAddress <em>Cluster Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Address</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.NetworkIds#getClusterAddress()
	 * @see #getNetworkIds()
	 * @generated
	 */
	EAttribute getNetworkIds_ClusterAddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage <em>Uplink Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uplink Message</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage
	 * @generated
	 */
	EClass getUplinkMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getSessionKeyId <em>Session Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Key Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getSessionKeyId()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_SessionKeyId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getFPort <em>FPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FPort</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getFPort()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_FPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getFCnt <em>FCnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FCnt</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getFCnt()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_FCnt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getFrmPayload <em>Frm Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frm Payload</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getFrmPayload()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_FrmPayload();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getRxMetadata <em>Rx Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rx Metadata</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getRxMetadata()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EReference getUplinkMessage_RxMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getSettings()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EReference getUplinkMessage_Settings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getGatewayChannelIndex <em>Gateway Channel Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Channel Index</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getGatewayChannelIndex()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_GatewayChannelIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getDeviceChannelIndex <em>Device Channel Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Channel Index</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getDeviceChannelIndex()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_DeviceChannelIndex();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getDecodedPayload <em>Decoded Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Decoded Payload</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getDecodedPayload()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EReference getUplinkMessage_DecodedPayload();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getNetworkIds <em>Network Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getNetworkIds()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EReference getUplinkMessage_NetworkIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getConsumedAirtime <em>Consumed Airtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed Airtime</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getConsumedAirtime()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_ConsumedAirtime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getReceivedAt <em>Received At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received At</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getReceivedAt()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EAttribute getUplinkMessage_ReceivedAt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getVersionIds <em>Version Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage#getVersionIds()
	 * @see #getUplinkMessage()
	 * @generated
	 */
	EReference getUplinkMessage_VersionIds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds <em>Gateway Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds
	 * @generated
	 */
	EClass getGatewayIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getGatewayId <em>Gateway Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getGatewayId()
	 * @see #getGatewayIds()
	 * @generated
	 */
	EAttribute getGatewayIds_GatewayId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getEui <em>Eui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eui</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getEui()
	 * @see #getGatewayIds()
	 * @generated
	 */
	EAttribute getGatewayIds_Eui();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata <em>Rx Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rx Metadata</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata
	 * @generated
	 */
	EClass getRxMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getGatewayIds <em>Gateway Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gateway Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getGatewayIds()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EReference getRxMetadata_GatewayIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getTime()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getTimestamp()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getRssi <em>Rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getRssi()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_Rssi();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getChannelRssi <em>Channel Rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Rssi</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getChannelRssi()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_ChannelRssi();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getSnr <em>Snr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snr</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getSnr()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_Snr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getUplinkToken <em>Uplink Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uplink Token</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getUplinkToken()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_UplinkToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getLocation()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EReference getRxMetadata_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getReceivedAt <em>Received At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received At</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getReceivedAt()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_ReceivedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getChannelIndex <em>Channel Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Index</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.RxMetadata#getChannelIndex()
	 * @see #getRxMetadata()
	 * @generated
	 */
	EAttribute getRxMetadata_ChannelIndex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Rate</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.DataRate
	 * @generated
	 */
	EClass getDataRate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.DataRate#getLora <em>Lora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lora</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.DataRate#getLora()
	 * @see #getDataRate()
	 * @generated
	 */
	EReference getDataRate_Lora();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora <em>Lora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lora</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora
	 * @generated
	 */
	EClass getLora();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora#getBandwidth()
	 * @see #getLora()
	 * @generated
	 */
	EAttribute getLora_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora#getSpreadingFactor <em>Spreading Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spreading Factor</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora#getSpreadingFactor()
	 * @see #getLora()
	 * @generated
	 */
	EAttribute getLora_SpreadingFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora#getCodingRate <em>Coding Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coding Rate</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Lora#getCodingRate()
	 * @see #getLora()
	 * @generated
	 */
	EAttribute getLora_CodingRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getAltitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Location#getSource()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Source();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	EClass getStringToObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds <em>Version Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Ids</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds
	 * @generated
	 */
	EClass getVersionIds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getBrandId <em>Brand Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getBrandId()
	 * @see #getVersionIds()
	 * @generated
	 */
	EAttribute getVersionIds_BrandId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getModelId <em>Model Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getModelId()
	 * @see #getVersionIds()
	 * @generated
	 */
	EAttribute getVersionIds_ModelId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getHardwareVersion <em>Hardware Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Version</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getHardwareVersion()
	 * @see #getVersionIds()
	 * @generated
	 */
	EAttribute getVersionIds_HardwareVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getFirmwareVersion <em>Firmware Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware Version</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getFirmwareVersion()
	 * @see #getVersionIds()
	 * @generated
	 */
	EAttribute getVersionIds_FirmwareVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getBandId <em>Band Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Band Id</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.VersionIds#getBandId()
	 * @see #getVersionIds()
	 * @generated
	 */
	EAttribute getVersionIds_BandId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getDataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Rate</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getDataRate()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_DataRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getTimestamp()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getTime()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.Settings#getFrequency()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_Frequency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UplinkPayloadFactory getUplinkPayloadFactory();

} //UplinkPayloadPackage
