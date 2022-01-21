/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.AuthorizationData;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest;
import de.jena.sensinact.ocpp.chargepoint.UpdateType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Local List Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl#getListVersion <em>List Version</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl#getLocalAuthorizationList <em>Local Authorization List</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.SendLocalListRequestImpl#getUpdateType <em>Update Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendLocalListRequestImpl extends MinimalEObjectImpl.Container implements SendLocalListRequest {
	/**
	 * The default value of the '{@link #getListVersion() <em>List Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int LIST_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getListVersion() <em>List Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListVersion()
	 * @generated
	 * @ordered
	 */
	protected int listVersion = LIST_VERSION_EDEFAULT;

	/**
	 * This is true if the List Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean listVersionESet;

	/**
	 * The cached value of the '{@link #getLocalAuthorizationList() <em>Local Authorization List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAuthorizationList()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthorizationData> localAuthorizationList;

	/**
	 * The default value of the '{@link #getUpdateType() <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateType UPDATE_TYPE_EDEFAULT = UpdateType.DIFFERENTIAL;

	/**
	 * The cached value of the '{@link #getUpdateType() <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType()
	 * @generated
	 * @ordered
	 */
	protected UpdateType updateType = UPDATE_TYPE_EDEFAULT;

	/**
	 * This is true if the Update Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendLocalListRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.SEND_LOCAL_LIST_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getListVersion() {
		return listVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListVersion(int newListVersion) {
		int oldListVersion = listVersion;
		listVersion = newListVersion;
		boolean oldListVersionESet = listVersionESet;
		listVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LIST_VERSION, oldListVersion, listVersion, !oldListVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetListVersion() {
		int oldListVersion = listVersion;
		boolean oldListVersionESet = listVersionESet;
		listVersion = LIST_VERSION_EDEFAULT;
		listVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LIST_VERSION, oldListVersion, LIST_VERSION_EDEFAULT, oldListVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetListVersion() {
		return listVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuthorizationData> getLocalAuthorizationList() {
		if (localAuthorizationList == null) {
			localAuthorizationList = new EObjectContainmentEList<AuthorizationData>(AuthorizationData.class, this, OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST);
		}
		return localAuthorizationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType getUpdateType() {
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateType(UpdateType newUpdateType) {
		UpdateType oldUpdateType = updateType;
		updateType = newUpdateType == null ? UPDATE_TYPE_EDEFAULT : newUpdateType;
		boolean oldUpdateTypeESet = updateTypeESet;
		updateTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE, oldUpdateType, updateType, !oldUpdateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUpdateType() {
		UpdateType oldUpdateType = updateType;
		boolean oldUpdateTypeESet = updateTypeESet;
		updateType = UPDATE_TYPE_EDEFAULT;
		updateTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE, oldUpdateType, UPDATE_TYPE_EDEFAULT, oldUpdateTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUpdateType() {
		return updateTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST:
				return ((InternalEList<?>)getLocalAuthorizationList()).basicRemove(otherEnd, msgs);
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
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LIST_VERSION:
				return getListVersion();
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST:
				return getLocalAuthorizationList();
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE:
				return getUpdateType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LIST_VERSION:
				setListVersion((Integer)newValue);
				return;
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST:
				getLocalAuthorizationList().clear();
				getLocalAuthorizationList().addAll((Collection<? extends AuthorizationData>)newValue);
				return;
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE:
				setUpdateType((UpdateType)newValue);
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
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LIST_VERSION:
				unsetListVersion();
				return;
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST:
				getLocalAuthorizationList().clear();
				return;
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE:
				unsetUpdateType();
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
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LIST_VERSION:
				return isSetListVersion();
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__LOCAL_AUTHORIZATION_LIST:
				return localAuthorizationList != null && !localAuthorizationList.isEmpty();
			case OcppChargePointPackage.SEND_LOCAL_LIST_REQUEST__UPDATE_TYPE:
				return isSetUpdateType();
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
		result.append(" (listVersion: ");
		if (listVersionESet) result.append(listVersion); else result.append("<unset>");
		result.append(", updateType: ");
		if (updateTypeESet) result.append(updateType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SendLocalListRequestImpl
