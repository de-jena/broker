/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.SystemInfo;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.SystemInfoImpl#getHardwareType <em>Hardware Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.SystemInfoImpl#getHardwareRev <em>Hardware Rev</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.SystemInfoImpl#getOsType <em>Os Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.SystemInfoImpl#getOsRev <em>Os Rev</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.SystemInfoImpl#getSoftwareType <em>Software Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.SystemInfoImpl#getSoftwareRev <em>Software Rev</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInfoImpl extends MinimalEObjectImpl.Container implements SystemInfo {
	/**
	 * The default value of the '{@link #getHardwareType() <em>Hardware Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareType()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareType() <em>Hardware Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareType()
	 * @generated
	 * @ordered
	 */
	protected String hardwareType = HARDWARE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareRev() <em>Hardware Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareRev()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareRev() <em>Hardware Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareRev()
	 * @generated
	 * @ordered
	 */
	protected String hardwareRev = HARDWARE_REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsType() <em>Os Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsType()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsType() <em>Os Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsType()
	 * @generated
	 * @ordered
	 */
	protected String osType = OS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsRev() <em>Os Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsRev()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsRev() <em>Os Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsRev()
	 * @generated
	 * @ordered
	 */
	protected String osRev = OS_REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareType() <em>Software Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareType()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareType() <em>Software Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareType()
	 * @generated
	 * @ordered
	 */
	protected String softwareType = SOFTWARE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareRev() <em>Software Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareRev()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareRev() <em>Software Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareRev()
	 * @generated
	 * @ordered
	 */
	protected String softwareRev = SOFTWARE_REV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.SYSTEM_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHardwareType() {
		return hardwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareType(String newHardwareType) {
		String oldHardwareType = hardwareType;
		hardwareType = newHardwareType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.SYSTEM_INFO__HARDWARE_TYPE, oldHardwareType, hardwareType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHardwareRev() {
		return hardwareRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareRev(String newHardwareRev) {
		String oldHardwareRev = hardwareRev;
		hardwareRev = newHardwareRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.SYSTEM_INFO__HARDWARE_REV, oldHardwareRev, hardwareRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOsType() {
		return osType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsType(String newOsType) {
		String oldOsType = osType;
		osType = newOsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.SYSTEM_INFO__OS_TYPE, oldOsType, osType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOsRev() {
		return osRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsRev(String newOsRev) {
		String oldOsRev = osRev;
		osRev = newOsRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.SYSTEM_INFO__OS_REV, oldOsRev, osRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftwareType() {
		return softwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareType(String newSoftwareType) {
		String oldSoftwareType = softwareType;
		softwareType = newSoftwareType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.SYSTEM_INFO__SOFTWARE_TYPE, oldSoftwareType, softwareType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftwareRev() {
		return softwareRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareRev(String newSoftwareRev) {
		String oldSoftwareRev = softwareRev;
		softwareRev = newSoftwareRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.SYSTEM_INFO__SOFTWARE_REV, oldSoftwareRev, softwareRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_TYPE:
				return getHardwareType();
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_REV:
				return getHardwareRev();
			case TOSDevicePackage.SYSTEM_INFO__OS_TYPE:
				return getOsType();
			case TOSDevicePackage.SYSTEM_INFO__OS_REV:
				return getOsRev();
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_TYPE:
				return getSoftwareType();
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_REV:
				return getSoftwareRev();
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
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_TYPE:
				setHardwareType((String)newValue);
				return;
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_REV:
				setHardwareRev((String)newValue);
				return;
			case TOSDevicePackage.SYSTEM_INFO__OS_TYPE:
				setOsType((String)newValue);
				return;
			case TOSDevicePackage.SYSTEM_INFO__OS_REV:
				setOsRev((String)newValue);
				return;
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_TYPE:
				setSoftwareType((String)newValue);
				return;
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_REV:
				setSoftwareRev((String)newValue);
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
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_TYPE:
				setHardwareType(HARDWARE_TYPE_EDEFAULT);
				return;
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_REV:
				setHardwareRev(HARDWARE_REV_EDEFAULT);
				return;
			case TOSDevicePackage.SYSTEM_INFO__OS_TYPE:
				setOsType(OS_TYPE_EDEFAULT);
				return;
			case TOSDevicePackage.SYSTEM_INFO__OS_REV:
				setOsRev(OS_REV_EDEFAULT);
				return;
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_TYPE:
				setSoftwareType(SOFTWARE_TYPE_EDEFAULT);
				return;
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_REV:
				setSoftwareRev(SOFTWARE_REV_EDEFAULT);
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
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_TYPE:
				return HARDWARE_TYPE_EDEFAULT == null ? hardwareType != null : !HARDWARE_TYPE_EDEFAULT.equals(hardwareType);
			case TOSDevicePackage.SYSTEM_INFO__HARDWARE_REV:
				return HARDWARE_REV_EDEFAULT == null ? hardwareRev != null : !HARDWARE_REV_EDEFAULT.equals(hardwareRev);
			case TOSDevicePackage.SYSTEM_INFO__OS_TYPE:
				return OS_TYPE_EDEFAULT == null ? osType != null : !OS_TYPE_EDEFAULT.equals(osType);
			case TOSDevicePackage.SYSTEM_INFO__OS_REV:
				return OS_REV_EDEFAULT == null ? osRev != null : !OS_REV_EDEFAULT.equals(osRev);
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_TYPE:
				return SOFTWARE_TYPE_EDEFAULT == null ? softwareType != null : !SOFTWARE_TYPE_EDEFAULT.equals(softwareType);
			case TOSDevicePackage.SYSTEM_INFO__SOFTWARE_REV:
				return SOFTWARE_REV_EDEFAULT == null ? softwareRev != null : !SOFTWARE_REV_EDEFAULT.equals(softwareRev);
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
		result.append(" (hardwareType: ");
		result.append(hardwareType);
		result.append(", hardwareRev: ");
		result.append(hardwareRev);
		result.append(", osType: ");
		result.append(osType);
		result.append(", osRev: ");
		result.append(osRev);
		result.append(", softwareType: ");
		result.append(softwareType);
		result.append(", softwareRev: ");
		result.append(softwareRev);
		result.append(')');
		return result.toString();
	}

} //SystemInfoImpl
