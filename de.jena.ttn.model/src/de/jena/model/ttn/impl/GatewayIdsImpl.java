/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.GatewayIds;
import de.jena.model.ttn.TTNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway Ids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.GatewayIdsImpl#getGatewayId <em>Gateway Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.GatewayIdsImpl#getEui <em>Eui</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayIdsImpl extends MinimalEObjectImpl.Container implements GatewayIds {
	/**
	 * The default value of the '{@link #getGatewayId() <em>Gateway Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayId()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayId() <em>Gateway Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayId()
	 * @generated
	 * @ordered
	 */
	protected String gatewayId = GATEWAY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEui() <em>Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEui()
	 * @generated
	 * @ordered
	 */
	protected static final String EUI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEui() <em>Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEui()
	 * @generated
	 * @ordered
	 */
	protected String eui = EUI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayIdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getGatewayIds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayId() {
		return gatewayId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayId(String newGatewayId) {
		String oldGatewayId = gatewayId;
		gatewayId = newGatewayId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.GATEWAY_IDS__GATEWAY_ID, oldGatewayId, gatewayId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEui() {
		return eui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEui(String newEui) {
		String oldEui = eui;
		eui = newEui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.GATEWAY_IDS__EUI, oldEui, eui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTNPackage.GATEWAY_IDS__GATEWAY_ID:
				return getGatewayId();
			case TTNPackage.GATEWAY_IDS__EUI:
				return getEui();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TTNPackage.GATEWAY_IDS__GATEWAY_ID:
				setGatewayId((String)newValue);
				return;
			case TTNPackage.GATEWAY_IDS__EUI:
				setEui((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TTNPackage.GATEWAY_IDS__GATEWAY_ID:
				setGatewayId(GATEWAY_ID_EDEFAULT);
				return;
			case TTNPackage.GATEWAY_IDS__EUI:
				setEui(EUI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TTNPackage.GATEWAY_IDS__GATEWAY_ID:
				return GATEWAY_ID_EDEFAULT == null ? gatewayId != null : !GATEWAY_ID_EDEFAULT.equals(gatewayId);
			case TTNPackage.GATEWAY_IDS__EUI:
				return EUI_EDEFAULT == null ? eui != null : !EUI_EDEFAULT.equals(eui);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (gatewayId: ");
		result.append(gatewayId);
		result.append(", eui: ");
		result.append(eui);
		result.append(')');
		return result.toString();
	}

} //GatewayIdsImpl
