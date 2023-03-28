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

import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.TimeTable;
import de.dim.trafficos.model.device.TimeTableEntry;
import de.dim.trafficos.model.device.TimeTableModeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.TimeTableImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TimeTableImpl#getDefaultMode <em>Default Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeTableImpl extends IdNameElementImpl implements TimeTable {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeTableEntry> entry;

	/**
	 * The default value of the '{@link #getDefaultMode() <em>Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMode()
	 * @generated
	 * @ordered
	 */
	protected static final TimeTableModeType DEFAULT_MODE_EDEFAULT = TimeTableModeType.OFF;

	/**
	 * The cached value of the '{@link #getDefaultMode() <em>Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMode()
	 * @generated
	 * @ordered
	 */
	protected TimeTableModeType defaultMode = DEFAULT_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.TIME_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeTableEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<TimeTableEntry>(TimeTableEntry.class, this, TOSDevicePackage.TIME_TABLE__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTableModeType getDefaultMode() {
		return defaultMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMode(TimeTableModeType newDefaultMode) {
		TimeTableModeType oldDefaultMode = defaultMode;
		defaultMode = newDefaultMode == null ? DEFAULT_MODE_EDEFAULT : newDefaultMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TIME_TABLE__DEFAULT_MODE, oldDefaultMode, defaultMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.TIME_TABLE__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.TIME_TABLE__ENTRY:
				return getEntry();
			case TOSDevicePackage.TIME_TABLE__DEFAULT_MODE:
				return getDefaultMode();
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
			case TOSDevicePackage.TIME_TABLE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends TimeTableEntry>)newValue);
				return;
			case TOSDevicePackage.TIME_TABLE__DEFAULT_MODE:
				setDefaultMode((TimeTableModeType)newValue);
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
			case TOSDevicePackage.TIME_TABLE__ENTRY:
				getEntry().clear();
				return;
			case TOSDevicePackage.TIME_TABLE__DEFAULT_MODE:
				setDefaultMode(DEFAULT_MODE_EDEFAULT);
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
			case TOSDevicePackage.TIME_TABLE__ENTRY:
				return entry != null && !entry.isEmpty();
			case TOSDevicePackage.TIME_TABLE__DEFAULT_MODE:
				return defaultMode != DEFAULT_MODE_EDEFAULT;
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
		result.append(" (defaultMode: ");
		result.append(defaultMode);
		result.append(')');
		return result.toString();
	}

} //TimeTableImpl
