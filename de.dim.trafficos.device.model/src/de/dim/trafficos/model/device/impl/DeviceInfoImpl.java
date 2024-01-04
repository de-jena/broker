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

import de.dim.trafficos.model.device.DeviceInfo;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceInfoImpl#getTechnicalName <em>Technical Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceInfoImpl#getHumanReadableName <em>Human Readable Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceInfoImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceInfoImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceInfoImpl extends MinimalEObjectImpl.Container implements DeviceInfo {
	/**
	 * The default value of the '{@link #getTechnicalName() <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalName() <em>Technical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalName()
	 * @generated
	 * @ordered
	 */
	protected String technicalName = TECHNICAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanReadableName() <em>Human Readable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanReadableName()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMAN_READABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumanReadableName() <em>Human Readable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanReadableName()
	 * @generated
	 * @ordered
	 */
	protected String humanReadableName = HUMAN_READABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.DEVICE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTechnicalName() {
		return technicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnicalName(String newTechnicalName) {
		String oldTechnicalName = technicalName;
		technicalName = newTechnicalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_INFO__TECHNICAL_NAME, oldTechnicalName, technicalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHumanReadableName() {
		return humanReadableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanReadableName(String newHumanReadableName) {
		String oldHumanReadableName = humanReadableName;
		humanReadableName = newHumanReadableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_INFO__HUMAN_READABLE_NAME, oldHumanReadableName, humanReadableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_INFO__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_INFO__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.DEVICE_INFO__TECHNICAL_NAME:
				return getTechnicalName();
			case TOSDevicePackage.DEVICE_INFO__HUMAN_READABLE_NAME:
				return getHumanReadableName();
			case TOSDevicePackage.DEVICE_INFO__SHORT_NAME:
				return getShortName();
			case TOSDevicePackage.DEVICE_INFO__DESCRIPTION:
				return getDescription();
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
			case TOSDevicePackage.DEVICE_INFO__TECHNICAL_NAME:
				setTechnicalName((String)newValue);
				return;
			case TOSDevicePackage.DEVICE_INFO__HUMAN_READABLE_NAME:
				setHumanReadableName((String)newValue);
				return;
			case TOSDevicePackage.DEVICE_INFO__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case TOSDevicePackage.DEVICE_INFO__DESCRIPTION:
				setDescription((String)newValue);
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
			case TOSDevicePackage.DEVICE_INFO__TECHNICAL_NAME:
				setTechnicalName(TECHNICAL_NAME_EDEFAULT);
				return;
			case TOSDevicePackage.DEVICE_INFO__HUMAN_READABLE_NAME:
				setHumanReadableName(HUMAN_READABLE_NAME_EDEFAULT);
				return;
			case TOSDevicePackage.DEVICE_INFO__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case TOSDevicePackage.DEVICE_INFO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case TOSDevicePackage.DEVICE_INFO__TECHNICAL_NAME:
				return TECHNICAL_NAME_EDEFAULT == null ? technicalName != null : !TECHNICAL_NAME_EDEFAULT.equals(technicalName);
			case TOSDevicePackage.DEVICE_INFO__HUMAN_READABLE_NAME:
				return HUMAN_READABLE_NAME_EDEFAULT == null ? humanReadableName != null : !HUMAN_READABLE_NAME_EDEFAULT.equals(humanReadableName);
			case TOSDevicePackage.DEVICE_INFO__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case TOSDevicePackage.DEVICE_INFO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (technicalName: ");
		result.append(technicalName);
		result.append(", humanReadableName: ");
		result.append(humanReadableName);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DeviceInfoImpl
