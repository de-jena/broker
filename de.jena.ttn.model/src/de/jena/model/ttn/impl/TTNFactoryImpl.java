/**
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTNFactoryImpl extends EFactoryImpl implements TTNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTNFactory init() {
		try {
			TTNFactory theTTNFactory = (TTNFactory)EPackage.Registry.INSTANCE.getEFactory(TTNPackage.eNS_URI);
			if (theTTNFactory != null) {
				return theTTNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TTNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTNFactoryImpl() {
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
			case TTNPackage.TTN_UPLINK_PAYLOAD: return createTtnUplinkPayload();
			case TTNPackage.END_DEVICE_IDS: return createEndDeviceIds();
			case TTNPackage.APPLICATION_ID: return createApplicationId();
			case TTNPackage.NETWORK_IDS: return createNetworkIds();
			case TTNPackage.UPLINK_MESSAGE: return createUplinkMessage();
			case TTNPackage.GATEWAY_IDS: return createGatewayIds();
			case TTNPackage.RX_METADATA: return createRxMetadata();
			case TTNPackage.DATA_RATE: return createDataRate();
			case TTNPackage.LORA: return createLora();
			case TTNPackage.LOCATION: return createLocation();
			case TTNPackage.STRING_TO_OBJECT_MAP: return (EObject)createStringToObjectMap();
			case TTNPackage.VERSION_IDS: return createVersionIds();
			case TTNPackage.SETTINGS: return createSettings();
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
	public ApplicationId createApplicationId() {
		ApplicationIdImpl applicationId = new ApplicationIdImpl();
		return applicationId;
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
	public TTNPackage getTTNPackage() {
		return (TTNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TTNPackage getPackage() {
		return TTNPackage.eINSTANCE;
	}

} //TTNFactoryImpl
