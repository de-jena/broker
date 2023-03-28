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

import de.dim.trafficos.model.device.PublicTransportStation;
import de.dim.trafficos.model.device.PublicTransportStop;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Transport Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportStopImpl#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicTransportStopImpl extends MinimalEObjectImpl.Container implements PublicTransportStop {
	/**
	 * The cached value of the '{@link #getStation() <em>Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected PublicTransportStation station;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportStopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportStation getStation() {
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStation(PublicTransportStation newStation, NotificationChain msgs) {
		PublicTransportStation oldStation = station;
		station = newStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION, oldStation, newStation);
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
	public void setStation(PublicTransportStation newStation) {
		if (newStation != station) {
			NotificationChain msgs = null;
			if (station != null)
				msgs = ((InternalEObject)station).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION, null, msgs);
			if (newStation != null)
				msgs = ((InternalEObject)newStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION, null, msgs);
			msgs = basicSetStation(newStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION, newStation, newStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION:
				return basicSetStation(null, msgs);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION:
				return getStation();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION:
				setStation((PublicTransportStation)newValue);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION:
				setStation((PublicTransportStation)null);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_STOP__STATION:
				return station != null;
		}
		return super.eIsSet(featureID);
	}

} //PublicTransportStopImpl
