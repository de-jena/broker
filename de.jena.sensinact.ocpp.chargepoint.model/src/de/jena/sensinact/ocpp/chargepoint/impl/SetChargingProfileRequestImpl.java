/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.ChargingProfile;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.SetChargingProfileRequest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Charging Profile Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.SetChargingProfileRequestImpl#getCsChargingProfiles <em>Cs Charging Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetChargingProfileRequestImpl extends MinimalEObjectImpl.Container implements SetChargingProfileRequest {
	/**
	 * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected int connectorId = CONNECTOR_ID_EDEFAULT;

	/**
	 * This is true if the Connector Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectorIdESet;

	/**
	 * The cached value of the '{@link #getCsChargingProfiles() <em>Cs Charging Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsChargingProfiles()
	 * @generated
	 * @ordered
	 */
	protected ChargingProfile csChargingProfiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetChargingProfileRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.SET_CHARGING_PROFILE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectorId() {
		return connectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorId(int newConnectorId) {
		int oldConnectorId = connectorId;
		connectorId = newConnectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectorId() {
		int oldConnectorId = connectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorId = CONNECTOR_ID_EDEFAULT;
		connectorIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectorId() {
		return connectorIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingProfile getCsChargingProfiles() {
		return csChargingProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsChargingProfiles(ChargingProfile newCsChargingProfiles, NotificationChain msgs) {
		ChargingProfile oldCsChargingProfiles = csChargingProfiles;
		csChargingProfiles = newCsChargingProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES, oldCsChargingProfiles, newCsChargingProfiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsChargingProfiles(ChargingProfile newCsChargingProfiles) {
		if (newCsChargingProfiles != csChargingProfiles) {
			NotificationChain msgs = null;
			if (csChargingProfiles != null)
				msgs = ((InternalEObject)csChargingProfiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES, null, msgs);
			if (newCsChargingProfiles != null)
				msgs = ((InternalEObject)newCsChargingProfiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES, null, msgs);
			msgs = basicSetCsChargingProfiles(newCsChargingProfiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES, newCsChargingProfiles, newCsChargingProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES:
				return basicSetCsChargingProfiles(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES:
				return getCsChargingProfiles();
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
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES:
				setCsChargingProfiles((ChargingProfile)newValue);
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
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES:
				setCsChargingProfiles((ChargingProfile)null);
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
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppChargePointPackage.SET_CHARGING_PROFILE_REQUEST__CS_CHARGING_PROFILES:
				return csChargingProfiles != null;
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
		result.append(" (connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SetChargingProfileRequestImpl
