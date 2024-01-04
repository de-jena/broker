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

import de.dim.trafficos.model.device.Device;
import de.dim.trafficos.model.device.DeviceActivationType;
import de.dim.trafficos.model.device.DeviceConfiguration;
import de.dim.trafficos.model.device.DeviceInfo;
import de.dim.trafficos.model.device.LifeCycleDeviceType;
import de.dim.trafficos.model.device.SystemInfo;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceImpl#getActivationState <em>Activation State</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceImpl#getDeviceInformation <em>Device Information</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceImpl#getSystemInformation <em>System Information</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceImpl#getLifeCycleType <em>Life Cycle Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends LocalizableImpl implements Device {
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
	 * The default value of the '{@link #getActivationState() <em>Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationState()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceActivationType ACTIVATION_STATE_EDEFAULT = DeviceActivationType.INACTIVE;

	/**
	 * The cached value of the '{@link #getActivationState() <em>Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationState()
	 * @generated
	 * @ordered
	 */
	protected DeviceActivationType activationState = ACTIVATION_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected DeviceConfiguration configuration;

	/**
	 * The cached value of the '{@link #getDeviceInformation() <em>Device Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceInformation()
	 * @generated
	 * @ordered
	 */
	protected DeviceInfo deviceInformation;

	/**
	 * The cached value of the '{@link #getSystemInformation() <em>System Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemInformation()
	 * @generated
	 * @ordered
	 */
	protected SystemInfo systemInformation;

	/**
	 * The default value of the '{@link #getLifeCycleType() <em>Life Cycle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleType()
	 * @generated
	 * @ordered
	 */
	protected static final LifeCycleDeviceType LIFE_CYCLE_TYPE_EDEFAULT = LifeCycleDeviceType.NONE;

	/**
	 * The cached value of the '{@link #getLifeCycleType() <em>Life Cycle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleType()
	 * @generated
	 * @ordered
	 */
	protected LifeCycleDeviceType lifeCycleType = LIFE_CYCLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceActivationType getActivationState() {
		return activationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationState(DeviceActivationType newActivationState) {
		DeviceActivationType oldActivationState = activationState;
		activationState = newActivationState == null ? ACTIVATION_STATE_EDEFAULT : newActivationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__ACTIVATION_STATE, oldActivationState, activationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceConfiguration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (DeviceConfiguration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.DEVICE__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceConfiguration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(DeviceConfiguration newConfiguration) {
		DeviceConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceInfo getDeviceInformation() {
		return deviceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceInformation(DeviceInfo newDeviceInformation, NotificationChain msgs) {
		DeviceInfo oldDeviceInformation = deviceInformation;
		deviceInformation = newDeviceInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__DEVICE_INFORMATION, oldDeviceInformation, newDeviceInformation);
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
	public void setDeviceInformation(DeviceInfo newDeviceInformation) {
		if (newDeviceInformation != deviceInformation) {
			NotificationChain msgs = null;
			if (deviceInformation != null)
				msgs = ((InternalEObject)deviceInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.DEVICE__DEVICE_INFORMATION, null, msgs);
			if (newDeviceInformation != null)
				msgs = ((InternalEObject)newDeviceInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.DEVICE__DEVICE_INFORMATION, null, msgs);
			msgs = basicSetDeviceInformation(newDeviceInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__DEVICE_INFORMATION, newDeviceInformation, newDeviceInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInfo getSystemInformation() {
		return systemInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemInformation(SystemInfo newSystemInformation, NotificationChain msgs) {
		SystemInfo oldSystemInformation = systemInformation;
		systemInformation = newSystemInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__SYSTEM_INFORMATION, oldSystemInformation, newSystemInformation);
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
	public void setSystemInformation(SystemInfo newSystemInformation) {
		if (newSystemInformation != systemInformation) {
			NotificationChain msgs = null;
			if (systemInformation != null)
				msgs = ((InternalEObject)systemInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.DEVICE__SYSTEM_INFORMATION, null, msgs);
			if (newSystemInformation != null)
				msgs = ((InternalEObject)newSystemInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.DEVICE__SYSTEM_INFORMATION, null, msgs);
			msgs = basicSetSystemInformation(newSystemInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__SYSTEM_INFORMATION, newSystemInformation, newSystemInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifeCycleDeviceType getLifeCycleType() {
		return lifeCycleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifeCycleType(LifeCycleDeviceType newLifeCycleType) {
		LifeCycleDeviceType oldLifeCycleType = lifeCycleType;
		lifeCycleType = newLifeCycleType == null ? LIFE_CYCLE_TYPE_EDEFAULT : newLifeCycleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE__LIFE_CYCLE_TYPE, oldLifeCycleType, lifeCycleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.DEVICE__DEVICE_INFORMATION:
				return basicSetDeviceInformation(null, msgs);
			case TOSDevicePackage.DEVICE__SYSTEM_INFORMATION:
				return basicSetSystemInformation(null, msgs);
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
			case TOSDevicePackage.DEVICE__ID:
				return getId();
			case TOSDevicePackage.DEVICE__ACTIVATION_STATE:
				return getActivationState();
			case TOSDevicePackage.DEVICE__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case TOSDevicePackage.DEVICE__DEVICE_INFORMATION:
				return getDeviceInformation();
			case TOSDevicePackage.DEVICE__SYSTEM_INFORMATION:
				return getSystemInformation();
			case TOSDevicePackage.DEVICE__LIFE_CYCLE_TYPE:
				return getLifeCycleType();
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
			case TOSDevicePackage.DEVICE__ID:
				setId((String)newValue);
				return;
			case TOSDevicePackage.DEVICE__ACTIVATION_STATE:
				setActivationState((DeviceActivationType)newValue);
				return;
			case TOSDevicePackage.DEVICE__CONFIGURATION:
				setConfiguration((DeviceConfiguration)newValue);
				return;
			case TOSDevicePackage.DEVICE__DEVICE_INFORMATION:
				setDeviceInformation((DeviceInfo)newValue);
				return;
			case TOSDevicePackage.DEVICE__SYSTEM_INFORMATION:
				setSystemInformation((SystemInfo)newValue);
				return;
			case TOSDevicePackage.DEVICE__LIFE_CYCLE_TYPE:
				setLifeCycleType((LifeCycleDeviceType)newValue);
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
			case TOSDevicePackage.DEVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSDevicePackage.DEVICE__ACTIVATION_STATE:
				setActivationState(ACTIVATION_STATE_EDEFAULT);
				return;
			case TOSDevicePackage.DEVICE__CONFIGURATION:
				setConfiguration((DeviceConfiguration)null);
				return;
			case TOSDevicePackage.DEVICE__DEVICE_INFORMATION:
				setDeviceInformation((DeviceInfo)null);
				return;
			case TOSDevicePackage.DEVICE__SYSTEM_INFORMATION:
				setSystemInformation((SystemInfo)null);
				return;
			case TOSDevicePackage.DEVICE__LIFE_CYCLE_TYPE:
				setLifeCycleType(LIFE_CYCLE_TYPE_EDEFAULT);
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
			case TOSDevicePackage.DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSDevicePackage.DEVICE__ACTIVATION_STATE:
				return activationState != ACTIVATION_STATE_EDEFAULT;
			case TOSDevicePackage.DEVICE__CONFIGURATION:
				return configuration != null;
			case TOSDevicePackage.DEVICE__DEVICE_INFORMATION:
				return deviceInformation != null;
			case TOSDevicePackage.DEVICE__SYSTEM_INFORMATION:
				return systemInformation != null;
			case TOSDevicePackage.DEVICE__LIFE_CYCLE_TYPE:
				return lifeCycleType != LIFE_CYCLE_TYPE_EDEFAULT;
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
		result.append(", activationState: ");
		result.append(activationState);
		result.append(", lifeCycleType: ");
		result.append(lifeCycleType);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
