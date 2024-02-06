/**
 */
package de.jena.model.ttn.util;

import de.jena.model.ttn.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.ttn.TTNPackage
 * @generated
 */
public class TTNAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTNPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTNAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TTNPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTNSwitch<Adapter> modelSwitch =
		new TTNSwitch<Adapter>() {
			@Override
			public Adapter caseTtnUplinkPayload(TtnUplinkPayload object) {
				return createTtnUplinkPayloadAdapter();
			}
			@Override
			public Adapter caseEndDeviceIds(EndDeviceIds object) {
				return createEndDeviceIdsAdapter();
			}
			@Override
			public Adapter caseApplicationId(ApplicationId object) {
				return createApplicationIdAdapter();
			}
			@Override
			public Adapter caseNetworkIds(NetworkIds object) {
				return createNetworkIdsAdapter();
			}
			@Override
			public Adapter caseUplinkMessage(UplinkMessage object) {
				return createUplinkMessageAdapter();
			}
			@Override
			public Adapter caseGatewayIds(GatewayIds object) {
				return createGatewayIdsAdapter();
			}
			@Override
			public Adapter caseRxMetadata(RxMetadata object) {
				return createRxMetadataAdapter();
			}
			@Override
			public Adapter caseDataRate(DataRate object) {
				return createDataRateAdapter();
			}
			@Override
			public Adapter caseLora(Lora object) {
				return createLoraAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseStringToObjectMap(Map.Entry<String, Object> object) {
				return createStringToObjectMapAdapter();
			}
			@Override
			public Adapter caseVersionIds(VersionIds object) {
				return createVersionIdsAdapter();
			}
			@Override
			public Adapter caseSettings(Settings object) {
				return createSettingsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.TtnUplinkPayload <em>Ttn Uplink Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.TtnUplinkPayload
	 * @generated
	 */
	public Adapter createTtnUplinkPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.EndDeviceIds <em>End Device Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.EndDeviceIds
	 * @generated
	 */
	public Adapter createEndDeviceIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.ApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.ApplicationId
	 * @generated
	 */
	public Adapter createApplicationIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.NetworkIds <em>Network Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.NetworkIds
	 * @generated
	 */
	public Adapter createNetworkIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.UplinkMessage <em>Uplink Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.UplinkMessage
	 * @generated
	 */
	public Adapter createUplinkMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.GatewayIds <em>Gateway Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.GatewayIds
	 * @generated
	 */
	public Adapter createGatewayIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.RxMetadata <em>Rx Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.RxMetadata
	 * @generated
	 */
	public Adapter createRxMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.DataRate
	 * @generated
	 */
	public Adapter createDataRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.Lora <em>Lora</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.Lora
	 * @generated
	 */
	public Adapter createLoraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.VersionIds <em>Version Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.VersionIds
	 * @generated
	 */
	public Adapter createVersionIdsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.model.ttn.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.model.ttn.Settings
	 * @generated
	 */
	public Adapter createSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TTNAdapterFactory
