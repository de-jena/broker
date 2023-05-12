/**
 */
package de.jena.model.ttn.util;

import de.jena.model.ttn.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.model.ttn.TTNPackage
 * @generated
 */
public class TTNSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TTNPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTNSwitch() {
		if (modelPackage == null) {
			modelPackage = TTNPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TTNPackage.TTN_UPLINK_PAYLOAD: {
				TtnUplinkPayload ttnUplinkPayload = (TtnUplinkPayload)theEObject;
				T result = caseTtnUplinkPayload(ttnUplinkPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.END_DEVICE_IDS: {
				EndDeviceIds endDeviceIds = (EndDeviceIds)theEObject;
				T result = caseEndDeviceIds(endDeviceIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.APPLICATION_ID: {
				ApplicationId applicationId = (ApplicationId)theEObject;
				T result = caseApplicationId(applicationId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.NETWORK_IDS: {
				NetworkIds networkIds = (NetworkIds)theEObject;
				T result = caseNetworkIds(networkIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.UPLINK_MESSAGE: {
				UplinkMessage uplinkMessage = (UplinkMessage)theEObject;
				T result = caseUplinkMessage(uplinkMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.GATEWAY_IDS: {
				GatewayIds gatewayIds = (GatewayIds)theEObject;
				T result = caseGatewayIds(gatewayIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.RX_METADATA: {
				RxMetadata rxMetadata = (RxMetadata)theEObject;
				T result = caseRxMetadata(rxMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.DATA_RATE: {
				DataRate dataRate = (DataRate)theEObject;
				T result = caseDataRate(dataRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.LORA: {
				Lora lora = (Lora)theEObject;
				T result = caseLora(lora);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.STRING_TO_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Object> stringToObjectMap = (Map.Entry<String, Object>)theEObject;
				T result = caseStringToObjectMap(stringToObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.VERSION_IDS: {
				VersionIds versionIds = (VersionIds)theEObject;
				T result = caseVersionIds(versionIds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TTNPackage.SETTINGS: {
				Settings settings = (Settings)theEObject;
				T result = caseSettings(settings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ttn Uplink Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ttn Uplink Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtnUplinkPayload(TtnUplinkPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceIds(EndDeviceIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationId(ApplicationId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkIds(NetworkIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uplink Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uplink Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUplinkMessage(UplinkMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGatewayIds(GatewayIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rx Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rx Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRxMetadata(RxMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRate(DataRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lora</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lora</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLora(Lora object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToObjectMap(Map.Entry<String, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Ids</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Ids</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionIds(VersionIds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettings(Settings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TTNSwitch
