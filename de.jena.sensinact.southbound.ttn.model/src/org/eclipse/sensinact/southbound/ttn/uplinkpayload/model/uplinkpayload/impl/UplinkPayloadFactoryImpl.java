/**
 */
package org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UplinkPayloadFactoryImpl extends EFactoryImpl implements UplinkPayloadFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UplinkPayloadFactory init() {
		try {
			UplinkPayloadFactory theUplinkPayloadFactory = (UplinkPayloadFactory)EPackage.Registry.INSTANCE.getEFactory(UplinkPayloadPackage.eNS_URI);
			if (theUplinkPayloadFactory != null) {
				return theUplinkPayloadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UplinkPayloadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UplinkPayloadFactoryImpl() {
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
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD: return createTtnUplinkPayload();
			case UplinkPayloadPackage.END_DEVICE_IDS: return createEndDeviceIds();
			case UplinkPayloadPackage.APPLICATION_IDS: return createApplicationIds();
			case UplinkPayloadPackage.NETWORK_IDS: return createNetworkIds();
			case UplinkPayloadPackage.UPLINK_MESSAGE: return createUplinkMessage();
			case UplinkPayloadPackage.GATEWAY_IDS: return createGatewayIds();
			case UplinkPayloadPackage.RX_METADATA: return createRxMetadata();
			case UplinkPayloadPackage.DATA_RATE: return createDataRate();
			case UplinkPayloadPackage.LORA: return createLora();
			case UplinkPayloadPackage.LOCATION: return createLocation();
			case UplinkPayloadPackage.STRING_TO_OBJECT_MAP: return (EObject)createStringToObjectMap();
			case UplinkPayloadPackage.VERSION_IDS: return createVersionIds();
			case UplinkPayloadPackage.SETTINGS: return createSettings();
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
	public TtnUplinkPayload createTtnUplinkPayload() {
		TtnUplinkPayloadImpl ttnUplinkPayload = new TtnUplinkPayloadImpl();
		return ttnUplinkPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndDeviceIds createEndDeviceIds() {
		EndDeviceIdsImpl endDeviceIds = new EndDeviceIdsImpl();
		return endDeviceIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationIds createApplicationIds() {
		ApplicationIdsImpl applicationIds = new ApplicationIdsImpl();
		return applicationIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkIds createNetworkIds() {
		NetworkIdsImpl networkIds = new NetworkIdsImpl();
		return networkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UplinkMessage createUplinkMessage() {
		UplinkMessageImpl uplinkMessage = new UplinkMessageImpl();
		return uplinkMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayIds createGatewayIds() {
		GatewayIdsImpl gatewayIds = new GatewayIdsImpl();
		return gatewayIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RxMetadata createRxMetadata() {
		RxMetadataImpl rxMetadata = new RxMetadataImpl();
		return rxMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRate createDataRate() {
		DataRateImpl dataRate = new DataRateImpl();
		return dataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lora createLora() {
		LoraImpl lora = new LoraImpl();
		return lora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Object> createStringToObjectMap() {
		StringToObjectMapImpl stringToObjectMap = new StringToObjectMapImpl();
		return stringToObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionIds createVersionIds() {
		VersionIdsImpl versionIds = new VersionIdsImpl();
		return versionIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Settings createSettings() {
		SettingsImpl settings = new SettingsImpl();
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UplinkPayloadPackage getUplinkPayloadPackage() {
		return (UplinkPayloadPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UplinkPayloadPackage getPackage() {
		return UplinkPayloadPackage.eINSTANCE;
	}

} //UplinkPayloadFactoryImpl
