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
package de.jena.model.sensinact.ttnprovider.impl;

import de.jena.model.sensinact.ttnprovider.SensorData;
import de.jena.model.sensinact.ttnprovider.TtnSensor;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ttn Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.TtnSensorImpl#isHas_beacon <em>Has beacon</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.TtnSensorImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TtnSensorImpl extends ProviderImpl implements TtnSensor {
	/**
	 * The default value of the '{@link #isHas_beacon() <em>Has beacon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_beacon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_BEACON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_beacon() <em>Has beacon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_beacon()
	 * @generated
	 * @ordered
	 */
	protected boolean has_beacon = HAS_BEACON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected SensorData data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtnSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtnSensorSensinactPackage.eINSTANCE.getTtnSensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_beacon() {
		return has_beacon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_beacon(boolean newHas_beacon) {
		boolean oldHas_beacon = has_beacon;
		has_beacon = newHas_beacon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.TTN_SENSOR__HAS_BEACON, oldHas_beacon, has_beacon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(SensorData newData, NotificationChain msgs) {
		SensorData oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.TTN_SENSOR__DATA, oldData, newData);
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
	public void setData(SensorData newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TtnSensorSensinactPackage.TTN_SENSOR__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TtnSensorSensinactPackage.TTN_SENSOR__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.TTN_SENSOR__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtnSensorSensinactPackage.TTN_SENSOR__DATA:
				return basicSetData(null, msgs);
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
			case TtnSensorSensinactPackage.TTN_SENSOR__HAS_BEACON:
				return isHas_beacon();
			case TtnSensorSensinactPackage.TTN_SENSOR__DATA:
				return getData();
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
			case TtnSensorSensinactPackage.TTN_SENSOR__HAS_BEACON:
				setHas_beacon((Boolean)newValue);
				return;
			case TtnSensorSensinactPackage.TTN_SENSOR__DATA:
				setData((SensorData)newValue);
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
			case TtnSensorSensinactPackage.TTN_SENSOR__HAS_BEACON:
				setHas_beacon(HAS_BEACON_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.TTN_SENSOR__DATA:
				setData((SensorData)null);
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
			case TtnSensorSensinactPackage.TTN_SENSOR__HAS_BEACON:
				return has_beacon != HAS_BEACON_EDEFAULT;
			case TtnSensorSensinactPackage.TTN_SENSOR__DATA:
				return data != null;
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
		result.append(" (has_beacon: ");
		result.append(has_beacon);
		result.append(')');
		return result.toString();
	}

} //TtnSensorImpl
