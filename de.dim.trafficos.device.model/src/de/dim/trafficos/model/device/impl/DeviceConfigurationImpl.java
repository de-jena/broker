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

import de.dim.trafficos.model.device.DeviceConfiguration;
import de.dim.trafficos.model.device.Intersection;
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
 * An implementation of the model object '<em><b>Device Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceConfigurationImpl#getIntersection <em>Intersection</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.DeviceConfigurationImpl#getCurrentIntersection <em>Current Intersection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceConfigurationImpl extends MinimalEObjectImpl.Container implements DeviceConfiguration {
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
	 * The cached value of the '{@link #getIntersection() <em>Intersection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersection()
	 * @generated
	 * @ordered
	 */
	protected EList<Intersection> intersection;

	/**
	 * The cached value of the '{@link #getCurrentIntersection() <em>Current Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentIntersection()
	 * @generated
	 * @ordered
	 */
	protected Intersection currentIntersection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.DEVICE_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Intersection> getIntersection() {
		if (intersection == null) {
			intersection = new EObjectContainmentEList<Intersection>(Intersection.class, this, TOSDevicePackage.DEVICE_CONFIGURATION__INTERSECTION);
		}
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intersection getCurrentIntersection() {
		return currentIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentIntersection(Intersection newCurrentIntersection, NotificationChain msgs) {
		Intersection oldCurrentIntersection = currentIntersection;
		currentIntersection = newCurrentIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION, oldCurrentIntersection, newCurrentIntersection);
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
	public void setCurrentIntersection(Intersection newCurrentIntersection) {
		if (newCurrentIntersection != currentIntersection) {
			NotificationChain msgs = null;
			if (currentIntersection != null)
				msgs = ((InternalEObject)currentIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION, null, msgs);
			if (newCurrentIntersection != null)
				msgs = ((InternalEObject)newCurrentIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION, null, msgs);
			msgs = basicSetCurrentIntersection(newCurrentIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION, newCurrentIntersection, newCurrentIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.DEVICE_CONFIGURATION__INTERSECTION:
				return ((InternalEList<?>)getIntersection()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION:
				return basicSetCurrentIntersection(null, msgs);
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
			case TOSDevicePackage.DEVICE_CONFIGURATION__ID:
				return getId();
			case TOSDevicePackage.DEVICE_CONFIGURATION__INTERSECTION:
				return getIntersection();
			case TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION:
				return getCurrentIntersection();
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
			case TOSDevicePackage.DEVICE_CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case TOSDevicePackage.DEVICE_CONFIGURATION__INTERSECTION:
				getIntersection().clear();
				getIntersection().addAll((Collection<? extends Intersection>)newValue);
				return;
			case TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION:
				setCurrentIntersection((Intersection)newValue);
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
			case TOSDevicePackage.DEVICE_CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSDevicePackage.DEVICE_CONFIGURATION__INTERSECTION:
				getIntersection().clear();
				return;
			case TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION:
				setCurrentIntersection((Intersection)null);
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
			case TOSDevicePackage.DEVICE_CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSDevicePackage.DEVICE_CONFIGURATION__INTERSECTION:
				return intersection != null && !intersection.isEmpty();
			case TOSDevicePackage.DEVICE_CONFIGURATION__CURRENT_INTERSECTION:
				return currentIntersection != null;
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
		result.append(')');
		return result.toString();
	}

} //DeviceConfigurationImpl
