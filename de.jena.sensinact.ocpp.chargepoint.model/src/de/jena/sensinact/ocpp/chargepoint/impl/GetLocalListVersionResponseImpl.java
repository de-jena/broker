/*
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Local List Version Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetLocalListVersionResponseImpl#getListVersion <em>List Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetLocalListVersionResponseImpl extends MinimalEObjectImpl.Container implements GetLocalListVersionResponse {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetLocalListVersionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.GET_LOCAL_LIST_VERSION_RESPONSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION, oldListVersion, listVersion, !oldListVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION, oldListVersion, LIST_VERSION_EDEFAULT, oldListVersionESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION:
				return getListVersion();
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
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION:
				setListVersion((Integer)newValue);
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
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION:
				unsetListVersion();
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
			case OcppChargePointPackage.GET_LOCAL_LIST_VERSION_RESPONSE__LIST_VERSION:
				return isSetListVersion();
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
		result.append(')');
		return result.toString();
	}

} //GetLocalListVersionResponseImpl
