/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.ApplicationId;
import de.jena.model.ttn.EndDeviceIds;
import de.jena.model.ttn.TTNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Ids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.EndDeviceIdsImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.EndDeviceIdsImpl#getApplicationIds <em>Application Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.EndDeviceIdsImpl#getDevEui <em>Dev Eui</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.EndDeviceIdsImpl#getJoinEui <em>Join Eui</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.EndDeviceIdsImpl#getDevAddr <em>Dev Addr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceIdsImpl extends MinimalEObjectImpl.Container implements EndDeviceIds {
	/**
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected String deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationIds() <em>Application Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationIds()
	 * @generated
	 * @ordered
	 */
	protected ApplicationId applicationIds;

	/**
	 * The default value of the '{@link #getDevEui() <em>Dev Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevEui()
	 * @generated
	 * @ordered
	 */
	protected static final String DEV_EUI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevEui() <em>Dev Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevEui()
	 * @generated
	 * @ordered
	 */
	protected String devEui = DEV_EUI_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinEui() <em>Join Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinEui()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_EUI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinEui() <em>Join Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinEui()
	 * @generated
	 * @ordered
	 */
	protected String joinEui = JOIN_EUI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevAddr() <em>Dev Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String DEV_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevAddr() <em>Dev Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevAddr()
	 * @generated
	 * @ordered
	 */
	protected String devAddr = DEV_ADDR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceIdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getEndDeviceIds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceId(String newDeviceId) {
		String oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.END_DEVICE_IDS__DEVICE_ID, oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationId getApplicationIds() {
		return applicationIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationIds(ApplicationId newApplicationIds, NotificationChain msgs) {
		ApplicationId oldApplicationIds = applicationIds;
		applicationIds = newApplicationIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.END_DEVICE_IDS__APPLICATION_IDS, oldApplicationIds, newApplicationIds);
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
	public void setApplicationIds(ApplicationId newApplicationIds) {
		if (newApplicationIds != applicationIds) {
			NotificationChain msgs = null;
			if (applicationIds != null)
				msgs = ((InternalEObject)applicationIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.END_DEVICE_IDS__APPLICATION_IDS, null, msgs);
			if (newApplicationIds != null)
				msgs = ((InternalEObject)newApplicationIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.END_DEVICE_IDS__APPLICATION_IDS, null, msgs);
			msgs = basicSetApplicationIds(newApplicationIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.END_DEVICE_IDS__APPLICATION_IDS, newApplicationIds, newApplicationIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevEui() {
		return devEui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevEui(String newDevEui) {
		String oldDevEui = devEui;
		devEui = newDevEui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.END_DEVICE_IDS__DEV_EUI, oldDevEui, devEui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJoinEui() {
		return joinEui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinEui(String newJoinEui) {
		String oldJoinEui = joinEui;
		joinEui = newJoinEui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.END_DEVICE_IDS__JOIN_EUI, oldJoinEui, joinEui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevAddr() {
		return devAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevAddr(String newDevAddr) {
		String oldDevAddr = devAddr;
		devAddr = newDevAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.END_DEVICE_IDS__DEV_ADDR, oldDevAddr, devAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTNPackage.END_DEVICE_IDS__APPLICATION_IDS:
				return basicSetApplicationIds(null, msgs);
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
			case TTNPackage.END_DEVICE_IDS__DEVICE_ID:
				return getDeviceId();
			case TTNPackage.END_DEVICE_IDS__APPLICATION_IDS:
				return getApplicationIds();
			case TTNPackage.END_DEVICE_IDS__DEV_EUI:
				return getDevEui();
			case TTNPackage.END_DEVICE_IDS__JOIN_EUI:
				return getJoinEui();
			case TTNPackage.END_DEVICE_IDS__DEV_ADDR:
				return getDevAddr();
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
			case TTNPackage.END_DEVICE_IDS__DEVICE_ID:
				setDeviceId((String)newValue);
				return;
			case TTNPackage.END_DEVICE_IDS__APPLICATION_IDS:
				setApplicationIds((ApplicationId)newValue);
				return;
			case TTNPackage.END_DEVICE_IDS__DEV_EUI:
				setDevEui((String)newValue);
				return;
			case TTNPackage.END_DEVICE_IDS__JOIN_EUI:
				setJoinEui((String)newValue);
				return;
			case TTNPackage.END_DEVICE_IDS__DEV_ADDR:
				setDevAddr((String)newValue);
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
			case TTNPackage.END_DEVICE_IDS__DEVICE_ID:
				setDeviceId(DEVICE_ID_EDEFAULT);
				return;
			case TTNPackage.END_DEVICE_IDS__APPLICATION_IDS:
				setApplicationIds((ApplicationId)null);
				return;
			case TTNPackage.END_DEVICE_IDS__DEV_EUI:
				setDevEui(DEV_EUI_EDEFAULT);
				return;
			case TTNPackage.END_DEVICE_IDS__JOIN_EUI:
				setJoinEui(JOIN_EUI_EDEFAULT);
				return;
			case TTNPackage.END_DEVICE_IDS__DEV_ADDR:
				setDevAddr(DEV_ADDR_EDEFAULT);
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
			case TTNPackage.END_DEVICE_IDS__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
			case TTNPackage.END_DEVICE_IDS__APPLICATION_IDS:
				return applicationIds != null;
			case TTNPackage.END_DEVICE_IDS__DEV_EUI:
				return DEV_EUI_EDEFAULT == null ? devEui != null : !DEV_EUI_EDEFAULT.equals(devEui);
			case TTNPackage.END_DEVICE_IDS__JOIN_EUI:
				return JOIN_EUI_EDEFAULT == null ? joinEui != null : !JOIN_EUI_EDEFAULT.equals(joinEui);
			case TTNPackage.END_DEVICE_IDS__DEV_ADDR:
				return DEV_ADDR_EDEFAULT == null ? devAddr != null : !DEV_ADDR_EDEFAULT.equals(devAddr);
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
		result.append(" (deviceId: ");
		result.append(deviceId);
		result.append(", devEui: ");
		result.append(devEui);
		result.append(", joinEui: ");
		result.append(joinEui);
		result.append(", devAddr: ");
		result.append(devAddr);
		result.append(')');
		return result.toString();
	}

} //EndDeviceIdsImpl
