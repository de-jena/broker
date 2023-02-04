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
import de.dim.trafficos.model.device.PublicTransportTimeTableEntry;
import de.dim.trafficos.model.device.TOSDevicePackage;

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
 * An implementation of the model object '<em><b>Public Transport Time Table Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl#getFirstStation <em>First Station</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl#getLastStation <em>Last Station</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportTimeTableEntryImpl#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicTransportTimeTableEntryImpl extends AbstractTimeTableEntryImpl implements PublicTransportTimeTableEntry {
	/**
	 * The cached value of the '{@link #getFirstStation() <em>First Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstStation()
	 * @generated
	 * @ordered
	 */
	protected PublicTransportStation firstStation;

	/**
	 * The cached value of the '{@link #getLastStation() <em>Last Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStation()
	 * @generated
	 * @ordered
	 */
	protected PublicTransportStation lastStation;

	/**
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicTransportStop> stops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportTimeTableEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportStation getFirstStation() {
		return firstStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstStation(PublicTransportStation newFirstStation, NotificationChain msgs) {
		PublicTransportStation oldFirstStation = firstStation;
		firstStation = newFirstStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION, oldFirstStation, newFirstStation);
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
	public void setFirstStation(PublicTransportStation newFirstStation) {
		if (newFirstStation != firstStation) {
			NotificationChain msgs = null;
			if (firstStation != null)
				msgs = ((InternalEObject)firstStation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION, null, msgs);
			if (newFirstStation != null)
				msgs = ((InternalEObject)newFirstStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION, null, msgs);
			msgs = basicSetFirstStation(newFirstStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION, newFirstStation, newFirstStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportStation getLastStation() {
		return lastStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastStation(PublicTransportStation newLastStation, NotificationChain msgs) {
		PublicTransportStation oldLastStation = lastStation;
		lastStation = newLastStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION, oldLastStation, newLastStation);
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
	public void setLastStation(PublicTransportStation newLastStation) {
		if (newLastStation != lastStation) {
			NotificationChain msgs = null;
			if (lastStation != null)
				msgs = ((InternalEObject)lastStation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION, null, msgs);
			if (newLastStation != null)
				msgs = ((InternalEObject)newLastStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION, null, msgs);
			msgs = basicSetLastStation(newLastStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION, newLastStation, newLastStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicTransportStop> getStops() {
		if (stops == null) {
			stops = new EObjectContainmentEList<PublicTransportStop>(PublicTransportStop.class, this, TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS);
		}
		return stops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION:
				return basicSetFirstStation(null, msgs);
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION:
				return basicSetLastStation(null, msgs);
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS:
				return ((InternalEList<?>)getStops()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION:
				return getFirstStation();
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION:
				return getLastStation();
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS:
				return getStops();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION:
				setFirstStation((PublicTransportStation)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION:
				setLastStation((PublicTransportStation)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends PublicTransportStop>)newValue);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION:
				setFirstStation((PublicTransportStation)null);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION:
				setLastStation((PublicTransportStation)null);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS:
				getStops().clear();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__FIRST_STATION:
				return firstStation != null;
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__LAST_STATION:
				return lastStation != null;
			case TOSDevicePackage.PUBLIC_TRANSPORT_TIME_TABLE_ENTRY__STOPS:
				return stops != null && !stops.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PublicTransportTimeTableEntryImpl
