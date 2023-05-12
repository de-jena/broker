/**
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.ApplicationId;
import de.jena.model.ttn.DataRate;
import de.jena.model.ttn.EndDeviceIds;
import de.jena.model.ttn.GatewayIds;
import de.jena.model.ttn.Location;
import de.jena.model.ttn.Lora;
import de.jena.model.ttn.NetworkIds;
import de.jena.model.ttn.RxMetadata;
import de.jena.model.ttn.Settings;
import de.jena.model.ttn.TTNFactory;
import de.jena.model.ttn.TTNPackage;
import de.jena.model.ttn.TtnUplinkPayload;
import de.jena.model.ttn.UplinkMessage;
import de.jena.model.ttn.VersionIds;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTNPackageImpl extends EPackageImpl implements TTNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttnUplinkPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uplinkMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rxMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionIdsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsEClass = null;

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
	 * @see de.jena.model.ttn.TTNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TTNPackageImpl() {
		super(eNS_URI, TTNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TTNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TTNPackage init() {
		if (isInited) return (TTNPackage)EPackage.Registry.INSTANCE.getEPackage(TTNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTTNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TTNPackageImpl theTTNPackage = registeredTTNPackage instanceof TTNPackageImpl ? (TTNPackageImpl)registeredTTNPackage : new TTNPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTTNPackage.createPackageContents();

		// Initialize created meta-data
		theTTNPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTTNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TTNPackage.eNS_URI, theTTNPackage);
		return theTTNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTtnUplinkPayload() {
		return ttnUplinkPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTtnUplinkPayload_EndDeviceIds() {
		return (EReference)ttnUplinkPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtnUplinkPayload_CorrelationIds() {
		return (EAttribute)ttnUplinkPayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTtnUplinkPayload_UplinkMessage() {
		return (EReference)ttnUplinkPayloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtnUplinkPayload_Confirmed() {
		return (EAttribute)ttnUplinkPayloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtnUplinkPayload_Retry() {
		return (EAttribute)ttnUplinkPayloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTtnUplinkPayload_ReceivedAt() {
		return (EAttribute)ttnUplinkPayloadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndDeviceIds() {
		return endDeviceIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndDeviceIds_DeviceId() {
		return (EAttribute)endDeviceIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndDeviceIds_ApplicationIds() {
		return (EReference)endDeviceIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndDeviceIds_DevEui() {
		return (EAttribute)endDeviceIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndDeviceIds_JoinEui() {
		return (EAttribute)endDeviceIdsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndDeviceIds_DevAddr() {
		return (EAttribute)endDeviceIdsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationId() {
		return applicationIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationId_ApplicationId() {
		return (EAttribute)applicationIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkIds() {
		return networkIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkIds_NetId() {
		return (EAttribute)networkIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkIds_TenantId() {
		return (EAttribute)networkIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkIds_ClusterId() {
		return (EAttribute)networkIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkIds_ClusterAddress() {
		return (EAttribute)networkIdsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUplinkMessage() {
		return uplinkMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_SessionKeyId() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_FPort() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_FCnt() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_FrmPayload() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUplinkMessage_RxMetadata() {
		return (EReference)uplinkMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUplinkMessage_Settings() {
		return (EReference)uplinkMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_GatewayChannelIndex() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_DeviceChannelIndex() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUplinkMessage_DecodedPayload() {
		return (EReference)uplinkMessageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUplinkMessage_NetworkIds() {
		return (EReference)uplinkMessageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_ConsumedAirtime() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUplinkMessage_ReceivedAt() {
		return (EAttribute)uplinkMessageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUplinkMessage_VersionIds() {
		return (EReference)uplinkMessageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGatewayIds() {
		return gatewayIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayIds_GatewayId() {
		return (EAttribute)gatewayIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGatewayIds_Eui() {
		return (EAttribute)gatewayIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRxMetadata() {
		return rxMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRxMetadata_GatewayIds() {
		return (EReference)rxMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_Time() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_Timestamp() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_Rssi() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_ChannelRssi() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_Snr() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_UplinkToken() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRxMetadata_Location() {
		return (EReference)rxMetadataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_ReceivedAt() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRxMetadata_ChannelIndex() {
		return (EAttribute)rxMetadataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRate() {
		return dataRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRate_Lora() {
		return (EReference)dataRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLora() {
		return loraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLora_Bandwidth() {
		return (EAttribute)loraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLora_SpreadingFactor() {
		return (EAttribute)loraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLora_CodingRate() {
		return (EAttribute)loraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Altitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Source() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToObjectMap() {
		return stringToObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToObjectMap_Key() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToObjectMap_Value() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionIds() {
		return versionIdsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionIds_BrandId() {
		return (EAttribute)versionIdsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionIds_ModelId() {
		return (EAttribute)versionIdsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionIds_HardwareVersion() {
		return (EAttribute)versionIdsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionIds_FirmwareVersion() {
		return (EAttribute)versionIdsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionIds_BandId() {
		return (EAttribute)versionIdsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSettings() {
		return settingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSettings_DataRate() {
		return (EReference)settingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettings_Timestamp() {
		return (EAttribute)settingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettings_Time() {
		return (EAttribute)settingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettings_Frequency() {
		return (EAttribute)settingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTNFactory getTTNFactory() {
		return (TTNFactory)getEFactoryInstance();
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
		ttnUplinkPayloadEClass = createEClass(TTN_UPLINK_PAYLOAD);
		createEReference(ttnUplinkPayloadEClass, TTN_UPLINK_PAYLOAD__END_DEVICE_IDS);
		createEAttribute(ttnUplinkPayloadEClass, TTN_UPLINK_PAYLOAD__CORRELATION_IDS);
		createEReference(ttnUplinkPayloadEClass, TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE);
		createEAttribute(ttnUplinkPayloadEClass, TTN_UPLINK_PAYLOAD__CONFIRMED);
		createEAttribute(ttnUplinkPayloadEClass, TTN_UPLINK_PAYLOAD__RETRY);
		createEAttribute(ttnUplinkPayloadEClass, TTN_UPLINK_PAYLOAD__RECEIVED_AT);

		endDeviceIdsEClass = createEClass(END_DEVICE_IDS);
		createEAttribute(endDeviceIdsEClass, END_DEVICE_IDS__DEVICE_ID);
		createEReference(endDeviceIdsEClass, END_DEVICE_IDS__APPLICATION_IDS);
		createEAttribute(endDeviceIdsEClass, END_DEVICE_IDS__DEV_EUI);
		createEAttribute(endDeviceIdsEClass, END_DEVICE_IDS__JOIN_EUI);
		createEAttribute(endDeviceIdsEClass, END_DEVICE_IDS__DEV_ADDR);

		applicationIdEClass = createEClass(APPLICATION_ID);
		createEAttribute(applicationIdEClass, APPLICATION_ID__APPLICATION_ID);

		networkIdsEClass = createEClass(NETWORK_IDS);
		createEAttribute(networkIdsEClass, NETWORK_IDS__NET_ID);
		createEAttribute(networkIdsEClass, NETWORK_IDS__TENANT_ID);
		createEAttribute(networkIdsEClass, NETWORK_IDS__CLUSTER_ID);
		createEAttribute(networkIdsEClass, NETWORK_IDS__CLUSTER_ADDRESS);

		uplinkMessageEClass = createEClass(UPLINK_MESSAGE);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__SESSION_KEY_ID);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__FPORT);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__FCNT);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__FRM_PAYLOAD);
		createEReference(uplinkMessageEClass, UPLINK_MESSAGE__RX_METADATA);
		createEReference(uplinkMessageEClass, UPLINK_MESSAGE__SETTINGS);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX);
		createEReference(uplinkMessageEClass, UPLINK_MESSAGE__DECODED_PAYLOAD);
		createEReference(uplinkMessageEClass, UPLINK_MESSAGE__NETWORK_IDS);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__CONSUMED_AIRTIME);
		createEAttribute(uplinkMessageEClass, UPLINK_MESSAGE__RECEIVED_AT);
		createEReference(uplinkMessageEClass, UPLINK_MESSAGE__VERSION_IDS);

		gatewayIdsEClass = createEClass(GATEWAY_IDS);
		createEAttribute(gatewayIdsEClass, GATEWAY_IDS__GATEWAY_ID);
		createEAttribute(gatewayIdsEClass, GATEWAY_IDS__EUI);

		rxMetadataEClass = createEClass(RX_METADATA);
		createEReference(rxMetadataEClass, RX_METADATA__GATEWAY_IDS);
		createEAttribute(rxMetadataEClass, RX_METADATA__TIME);
		createEAttribute(rxMetadataEClass, RX_METADATA__TIMESTAMP);
		createEAttribute(rxMetadataEClass, RX_METADATA__RSSI);
		createEAttribute(rxMetadataEClass, RX_METADATA__CHANNEL_RSSI);
		createEAttribute(rxMetadataEClass, RX_METADATA__SNR);
		createEAttribute(rxMetadataEClass, RX_METADATA__UPLINK_TOKEN);
		createEReference(rxMetadataEClass, RX_METADATA__LOCATION);
		createEAttribute(rxMetadataEClass, RX_METADATA__RECEIVED_AT);
		createEAttribute(rxMetadataEClass, RX_METADATA__CHANNEL_INDEX);

		dataRateEClass = createEClass(DATA_RATE);
		createEReference(dataRateEClass, DATA_RATE__LORA);

		loraEClass = createEClass(LORA);
		createEAttribute(loraEClass, LORA__BANDWIDTH);
		createEAttribute(loraEClass, LORA__SPREADING_FACTOR);
		createEAttribute(loraEClass, LORA__CODING_RATE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEAttribute(locationEClass, LOCATION__ALTITUDE);
		createEAttribute(locationEClass, LOCATION__SOURCE);

		stringToObjectMapEClass = createEClass(STRING_TO_OBJECT_MAP);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__KEY);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__VALUE);

		versionIdsEClass = createEClass(VERSION_IDS);
		createEAttribute(versionIdsEClass, VERSION_IDS__BRAND_ID);
		createEAttribute(versionIdsEClass, VERSION_IDS__MODEL_ID);
		createEAttribute(versionIdsEClass, VERSION_IDS__HARDWARE_VERSION);
		createEAttribute(versionIdsEClass, VERSION_IDS__FIRMWARE_VERSION);
		createEAttribute(versionIdsEClass, VERSION_IDS__BAND_ID);

		settingsEClass = createEClass(SETTINGS);
		createEReference(settingsEClass, SETTINGS__DATA_RATE);
		createEAttribute(settingsEClass, SETTINGS__TIMESTAMP);
		createEAttribute(settingsEClass, SETTINGS__TIME);
		createEAttribute(settingsEClass, SETTINGS__FREQUENCY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ttnUplinkPayloadEClass, TtnUplinkPayload.class, "TtnUplinkPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTtnUplinkPayload_EndDeviceIds(), this.getEndDeviceIds(), null, "endDeviceIds", null, 0, 1, TtnUplinkPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtnUplinkPayload_CorrelationIds(), ecorePackage.getEString(), "correlationIds", null, 0, -1, TtnUplinkPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTtnUplinkPayload_UplinkMessage(), this.getUplinkMessage(), null, "uplinkMessage", null, 0, 1, TtnUplinkPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtnUplinkPayload_Confirmed(), ecorePackage.getEBoolean(), "confirmed", null, 0, 1, TtnUplinkPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtnUplinkPayload_Retry(), ecorePackage.getEBoolean(), "retry", null, 0, 1, TtnUplinkPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtnUplinkPayload_ReceivedAt(), ecorePackage.getEString(), "receivedAt", null, 0, 1, TtnUplinkPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endDeviceIdsEClass, EndDeviceIds.class, "EndDeviceIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndDeviceIds_DeviceId(), ecorePackage.getEString(), "deviceId", null, 0, 1, EndDeviceIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndDeviceIds_ApplicationIds(), this.getApplicationId(), null, "applicationIds", null, 0, 1, EndDeviceIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndDeviceIds_DevEui(), ecorePackage.getEString(), "devEui", null, 0, 1, EndDeviceIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndDeviceIds_JoinEui(), ecorePackage.getEString(), "joinEui", null, 0, 1, EndDeviceIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndDeviceIds_DevAddr(), ecorePackage.getEString(), "devAddr", null, 0, 1, EndDeviceIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationIdEClass, ApplicationId.class, "ApplicationId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationId_ApplicationId(), ecorePackage.getEString(), "applicationId", null, 0, 1, ApplicationId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkIdsEClass, NetworkIds.class, "NetworkIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkIds_NetId(), ecorePackage.getEString(), "netId", null, 0, 1, NetworkIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkIds_TenantId(), ecorePackage.getEString(), "tenantId", null, 0, 1, NetworkIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkIds_ClusterId(), ecorePackage.getEString(), "clusterId", null, 0, 1, NetworkIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkIds_ClusterAddress(), ecorePackage.getEString(), "clusterAddress", null, 0, 1, NetworkIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uplinkMessageEClass, UplinkMessage.class, "UplinkMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUplinkMessage_SessionKeyId(), ecorePackage.getEString(), "sessionKeyId", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_FPort(), ecorePackage.getEInt(), "fPort", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_FCnt(), ecorePackage.getEInt(), "fCnt", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_FrmPayload(), ecorePackage.getEString(), "frmPayload", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUplinkMessage_RxMetadata(), this.getRxMetadata(), null, "rxMetadata", null, 0, -1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUplinkMessage_Settings(), this.getSettings(), null, "settings", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_GatewayChannelIndex(), ecorePackage.getEInt(), "gatewayChannelIndex", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_DeviceChannelIndex(), ecorePackage.getEInt(), "deviceChannelIndex", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUplinkMessage_DecodedPayload(), this.getStringToObjectMap(), null, "decodedPayload", null, 0, -1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUplinkMessage_NetworkIds(), this.getNetworkIds(), null, "networkIds", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_ConsumedAirtime(), ecorePackage.getEString(), "consumedAirtime", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUplinkMessage_ReceivedAt(), ecorePackage.getEString(), "receivedAt", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUplinkMessage_VersionIds(), this.getVersionIds(), null, "versionIds", null, 0, 1, UplinkMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayIdsEClass, GatewayIds.class, "GatewayIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGatewayIds_GatewayId(), ecorePackage.getEString(), "gatewayId", null, 0, 1, GatewayIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatewayIds_Eui(), ecorePackage.getEString(), "eui", null, 0, 1, GatewayIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rxMetadataEClass, RxMetadata.class, "RxMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRxMetadata_GatewayIds(), this.getGatewayIds(), null, "gatewayIds", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_Time(), ecorePackage.getEString(), "time", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_Rssi(), ecorePackage.getEInt(), "rssi", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_ChannelRssi(), ecorePackage.getEInt(), "channelRssi", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_Snr(), ecorePackage.getEDouble(), "snr", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_UplinkToken(), ecorePackage.getEString(), "uplinkToken", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRxMetadata_Location(), this.getLocation(), null, "location", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_ReceivedAt(), ecorePackage.getEString(), "receivedAt", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxMetadata_ChannelIndex(), ecorePackage.getEInt(), "channelIndex", null, 0, 1, RxMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRateEClass, DataRate.class, "DataRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRate_Lora(), this.getLora(), null, "lora", null, 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loraEClass, Lora.class, "Lora", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLora_Bandwidth(), ecorePackage.getELong(), "bandwidth", null, 0, 1, Lora.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLora_SpreadingFactor(), ecorePackage.getEInt(), "spreadingFactor", null, 0, 1, Lora.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLora_CodingRate(), ecorePackage.getEString(), "codingRate", null, 0, 1, Lora.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Latitude(), ecorePackage.getEDouble(), "latitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEDouble(), "longitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Altitude(), ecorePackage.getEDouble(), "altitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Source(), ecorePackage.getEString(), "source", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToObjectMapEClass, Map.Entry.class, "StringToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToObjectMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToObjectMap_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionIdsEClass, VersionIds.class, "VersionIds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionIds_BrandId(), ecorePackage.getEString(), "brandId", null, 0, 1, VersionIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionIds_ModelId(), ecorePackage.getEString(), "modelId", null, 0, 1, VersionIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionIds_HardwareVersion(), ecorePackage.getEString(), "hardwareVersion", null, 0, 1, VersionIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionIds_FirmwareVersion(), ecorePackage.getEString(), "firmwareVersion", null, 0, 1, VersionIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionIds_BandId(), ecorePackage.getEString(), "bandId", null, 0, 1, VersionIds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingsEClass, Settings.class, "Settings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettings_DataRate(), this.getDataRate(), null, "dataRate", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_Time(), ecorePackage.getEString(), "time", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_Frequency(), ecorePackage.getEString(), "frequency", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getTtnUplinkPayload_EndDeviceIds(),
		   source,
		   new String[] {
			   "name", "end_device_ids",
			   "kind", "element"
		   });
		addAnnotation
		  (getTtnUplinkPayload_CorrelationIds(),
		   source,
		   new String[] {
			   "name", "correlation_ids",
			   "kind", "element"
		   });
		addAnnotation
		  (getTtnUplinkPayload_UplinkMessage(),
		   source,
		   new String[] {
			   "name", "uplink_message",
			   "kind", "element"
		   });
		addAnnotation
		  (getTtnUplinkPayload_Retry(),
		   source,
		   new String[] {
			   "name", "is_retry",
			   "kind", "element"
		   });
		addAnnotation
		  (getTtnUplinkPayload_ReceivedAt(),
		   source,
		   new String[] {
			   "name", "received_at",
			   "kind", "element"
		   });
		addAnnotation
		  (getEndDeviceIds_DeviceId(),
		   source,
		   new String[] {
			   "name", "device_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getEndDeviceIds_ApplicationIds(),
		   source,
		   new String[] {
			   "name", "application_ids",
			   "kind", "element"
		   });
		addAnnotation
		  (getEndDeviceIds_DevEui(),
		   source,
		   new String[] {
			   "name", "dev_eui",
			   "kind", "element"
		   });
		addAnnotation
		  (getEndDeviceIds_JoinEui(),
		   source,
		   new String[] {
			   "name", "join_eui",
			   "kind", "element"
		   });
		addAnnotation
		  (getEndDeviceIds_DevAddr(),
		   source,
		   new String[] {
			   "name", "dev_addr",
			   "kind", "element"
		   });
		addAnnotation
		  (getApplicationId_ApplicationId(),
		   source,
		   new String[] {
			   "name", "application_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getNetworkIds_NetId(),
		   source,
		   new String[] {
			   "name", "net_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getNetworkIds_TenantId(),
		   source,
		   new String[] {
			   "name", "tenant_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getNetworkIds_ClusterId(),
		   source,
		   new String[] {
			   "name", "cluster_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getNetworkIds_ClusterAddress(),
		   source,
		   new String[] {
			   "name", "cluster_address",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_SessionKeyId(),
		   source,
		   new String[] {
			   "name", "session_key_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_FPort(),
		   source,
		   new String[] {
			   "name", "f_port",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_FCnt(),
		   source,
		   new String[] {
			   "name", "f_cnt",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_FrmPayload(),
		   source,
		   new String[] {
			   "name", "frm_payload",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_RxMetadata(),
		   source,
		   new String[] {
			   "name", "rx_metadata",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_GatewayChannelIndex(),
		   source,
		   new String[] {
			   "name", "gateway_channel_index",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_DeviceChannelIndex(),
		   source,
		   new String[] {
			   "name", "device_channel_index",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_DecodedPayload(),
		   source,
		   new String[] {
			   "name", "decoded_payload",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_NetworkIds(),
		   source,
		   new String[] {
			   "name", "network_ids",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_ConsumedAirtime(),
		   source,
		   new String[] {
			   "name", "consumed_airtime",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_ReceivedAt(),
		   source,
		   new String[] {
			   "name", "received_at",
			   "kind", "element"
		   });
		addAnnotation
		  (getUplinkMessage_VersionIds(),
		   source,
		   new String[] {
			   "name", "version_ids",
			   "kind", "element"
		   });
		addAnnotation
		  (getGatewayIds_GatewayId(),
		   source,
		   new String[] {
			   "name", "gateway_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getRxMetadata_GatewayIds(),
		   source,
		   new String[] {
			   "name", "gateway_ids",
			   "kind", "element"
		   });
		addAnnotation
		  (getRxMetadata_ChannelRssi(),
		   source,
		   new String[] {
			   "name", "channel_rssi",
			   "kind", "element"
		   });
		addAnnotation
		  (getRxMetadata_UplinkToken(),
		   source,
		   new String[] {
			   "name", "uplink_token",
			   "kind", "element"
		   });
		addAnnotation
		  (getRxMetadata_ReceivedAt(),
		   source,
		   new String[] {
			   "name", "received_at",
			   "kind", "element"
		   });
		addAnnotation
		  (getRxMetadata_ChannelIndex(),
		   source,
		   new String[] {
			   "name", "channel_index",
			   "kind", "element"
		   });
		addAnnotation
		  (getLora_SpreadingFactor(),
		   source,
		   new String[] {
			   "name", "spreading_factor",
			   "kind", "element"
		   });
		addAnnotation
		  (getLora_CodingRate(),
		   source,
		   new String[] {
			   "name", "coding_rate",
			   "kind", "element"
		   });
		addAnnotation
		  (getVersionIds_BrandId(),
		   source,
		   new String[] {
			   "name", "brand_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getVersionIds_ModelId(),
		   source,
		   new String[] {
			   "name", "model_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getVersionIds_HardwareVersion(),
		   source,
		   new String[] {
			   "name", "hardware_version",
			   "kind", "element"
		   });
		addAnnotation
		  (getVersionIds_FirmwareVersion(),
		   source,
		   new String[] {
			   "name", "firmware_version",
			   "kind", "element"
		   });
		addAnnotation
		  (getVersionIds_BandId(),
		   source,
		   new String[] {
			   "name", "band_id",
			   "kind", "element"
		   });
		addAnnotation
		  (getSettings_DataRate(),
		   source,
		   new String[] {
			   "name", "data_rate",
			   "kind", "element"
		   });
	}

} //TTNPackageImpl
