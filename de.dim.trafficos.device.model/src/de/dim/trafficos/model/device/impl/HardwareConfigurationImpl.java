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

import de.dim.trafficos.model.device.HardwareConfiguration;
import de.dim.trafficos.model.device.OutputConfiguration;
import de.dim.trafficos.model.device.TOSDevicePackage;

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
 * An implementation of the model object '<em><b>Hardware Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.HardwareConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.HardwareConfigurationImpl#getPinConfiguration <em>Pin Configuration</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.HardwareConfigurationImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.HardwareConfigurationImpl#getDeviceConfigurationId <em>Device Configuration Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareConfigurationImpl extends MinimalEObjectImpl.Container implements HardwareConfiguration {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPinConfiguration() <em>Pin Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputConfiguration> pinConfiguration;

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
	 * The default value of the '{@link #getDeviceConfigurationId() <em>Device Configuration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceConfigurationId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_CONFIGURATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceConfigurationId() <em>Device Configuration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceConfigurationId()
	 * @generated
	 * @ordered
	 */
	protected String deviceConfigurationId = DEVICE_CONFIGURATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.HARDWARE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.HARDWARE_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputConfiguration> getPinConfiguration() {
		if (pinConfiguration == null) {
			pinConfiguration = new EObjectContainmentEList<OutputConfiguration>(OutputConfiguration.class, this, TOSDevicePackage.HARDWARE_CONFIGURATION__PIN_CONFIGURATION);
		}
		return pinConfiguration;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_ID, oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceConfigurationId() {
		return deviceConfigurationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceConfigurationId(String newDeviceConfigurationId) {
		String oldDeviceConfigurationId = deviceConfigurationId;
		deviceConfigurationId = newDeviceConfigurationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID, oldDeviceConfigurationId, deviceConfigurationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.HARDWARE_CONFIGURATION__PIN_CONFIGURATION:
				return ((InternalEList<?>)getPinConfiguration()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.HARDWARE_CONFIGURATION__ID:
				return getId();
			case TOSDevicePackage.HARDWARE_CONFIGURATION__PIN_CONFIGURATION:
				return getPinConfiguration();
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_ID:
				return getDeviceId();
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID:
				return getDeviceConfigurationId();
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
			case TOSDevicePackage.HARDWARE_CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case TOSDevicePackage.HARDWARE_CONFIGURATION__PIN_CONFIGURATION:
				getPinConfiguration().clear();
				getPinConfiguration().addAll((Collection<? extends OutputConfiguration>)newValue);
				return;
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_ID:
				setDeviceId((String)newValue);
				return;
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID:
				setDeviceConfigurationId((String)newValue);
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
			case TOSDevicePackage.HARDWARE_CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSDevicePackage.HARDWARE_CONFIGURATION__PIN_CONFIGURATION:
				getPinConfiguration().clear();
				return;
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_ID:
				setDeviceId(DEVICE_ID_EDEFAULT);
				return;
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID:
				setDeviceConfigurationId(DEVICE_CONFIGURATION_ID_EDEFAULT);
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
			case TOSDevicePackage.HARDWARE_CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSDevicePackage.HARDWARE_CONFIGURATION__PIN_CONFIGURATION:
				return pinConfiguration != null && !pinConfiguration.isEmpty();
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
			case TOSDevicePackage.HARDWARE_CONFIGURATION__DEVICE_CONFIGURATION_ID:
				return DEVICE_CONFIGURATION_ID_EDEFAULT == null ? deviceConfigurationId != null : !DEVICE_CONFIGURATION_ID_EDEFAULT.equals(deviceConfigurationId);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", deviceId: ");
		result.append(deviceId);
		result.append(", deviceConfigurationId: ");
		result.append(deviceConfigurationId);
		result.append(')');
		return result.toString();
	}

} //HardwareConfigurationImpl
