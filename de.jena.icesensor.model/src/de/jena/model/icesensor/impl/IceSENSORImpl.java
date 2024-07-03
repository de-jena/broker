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
package de.jena.model.icesensor.impl;

import de.jena.model.icesensor.Coords;
import de.jena.model.icesensor.Data;
import de.jena.model.icesensor.IceSENSOR;
import de.jena.model.icesensor.IcesensorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ice SENSOR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.icesensor.impl.IceSENSORImpl#getIce_id <em>Ice id</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.IceSENSORImpl#getCoords <em>Coords</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.IceSENSORImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.IceSENSORImpl#isHas_beacon <em>Has beacon</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.IceSENSORImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IceSENSORImpl extends MinimalEObjectImpl.Container implements IceSENSOR {
	/**
	 * The default value of the '{@link #getIce_id() <em>Ice id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIce_id()
	 * @generated
	 * @ordered
	 */
	protected static final String ICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIce_id() <em>Ice id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIce_id()
	 * @generated
	 * @ordered
	 */
	protected String ice_id = ICE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoords() <em>Coords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoords()
	 * @generated
	 * @ordered
	 */
	protected Coords coords;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

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
	 * The default value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected String detail = DETAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IceSENSORImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IcesensorPackage.Literals.ICE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIce_id() {
		return ice_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIce_id(String newIce_id) {
		String oldIce_id = ice_id;
		ice_id = newIce_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__ICE_ID, oldIce_id, ice_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coords getCoords() {
		return coords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoords(Coords newCoords, NotificationChain msgs) {
		Coords oldCoords = coords;
		coords = newCoords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__COORDS, oldCoords, newCoords);
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
	public void setCoords(Coords newCoords) {
		if (newCoords != coords) {
			NotificationChain msgs = null;
			if (coords != null)
				msgs = ((InternalEObject)coords).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensorPackage.ICE_SENSOR__COORDS, null, msgs);
			if (newCoords != null)
				msgs = ((InternalEObject)newCoords).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensorPackage.ICE_SENSOR__COORDS, null, msgs);
			msgs = basicSetCoords(newCoords, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__COORDS, newCoords, newCoords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__DATA, oldData, newData);
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
	public void setData(Data newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensorPackage.ICE_SENSOR__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensorPackage.ICE_SENSOR__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__DATA, newData, newData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__HAS_BEACON, oldHas_beacon, has_beacon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetail(String newDetail) {
		String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.ICE_SENSOR__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IcesensorPackage.ICE_SENSOR__COORDS:
				return basicSetCoords(null, msgs);
			case IcesensorPackage.ICE_SENSOR__DATA:
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
			case IcesensorPackage.ICE_SENSOR__ICE_ID:
				return getIce_id();
			case IcesensorPackage.ICE_SENSOR__COORDS:
				return getCoords();
			case IcesensorPackage.ICE_SENSOR__DATA:
				return getData();
			case IcesensorPackage.ICE_SENSOR__HAS_BEACON:
				return isHas_beacon();
			case IcesensorPackage.ICE_SENSOR__DETAIL:
				return getDetail();
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
			case IcesensorPackage.ICE_SENSOR__ICE_ID:
				setIce_id((String)newValue);
				return;
			case IcesensorPackage.ICE_SENSOR__COORDS:
				setCoords((Coords)newValue);
				return;
			case IcesensorPackage.ICE_SENSOR__DATA:
				setData((Data)newValue);
				return;
			case IcesensorPackage.ICE_SENSOR__HAS_BEACON:
				setHas_beacon((Boolean)newValue);
				return;
			case IcesensorPackage.ICE_SENSOR__DETAIL:
				setDetail((String)newValue);
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
			case IcesensorPackage.ICE_SENSOR__ICE_ID:
				setIce_id(ICE_ID_EDEFAULT);
				return;
			case IcesensorPackage.ICE_SENSOR__COORDS:
				setCoords((Coords)null);
				return;
			case IcesensorPackage.ICE_SENSOR__DATA:
				setData((Data)null);
				return;
			case IcesensorPackage.ICE_SENSOR__HAS_BEACON:
				setHas_beacon(HAS_BEACON_EDEFAULT);
				return;
			case IcesensorPackage.ICE_SENSOR__DETAIL:
				setDetail(DETAIL_EDEFAULT);
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
			case IcesensorPackage.ICE_SENSOR__ICE_ID:
				return ICE_ID_EDEFAULT == null ? ice_id != null : !ICE_ID_EDEFAULT.equals(ice_id);
			case IcesensorPackage.ICE_SENSOR__COORDS:
				return coords != null;
			case IcesensorPackage.ICE_SENSOR__DATA:
				return data != null;
			case IcesensorPackage.ICE_SENSOR__HAS_BEACON:
				return has_beacon != HAS_BEACON_EDEFAULT;
			case IcesensorPackage.ICE_SENSOR__DETAIL:
				return DETAIL_EDEFAULT == null ? detail != null : !DETAIL_EDEFAULT.equals(detail);
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
		result.append(" (ice_id: ");
		result.append(ice_id);
		result.append(", has_beacon: ");
		result.append(has_beacon);
		result.append(", detail: ");
		result.append(detail);
		result.append(')');
		return result.toString();
	}

} //IceSENSORImpl
