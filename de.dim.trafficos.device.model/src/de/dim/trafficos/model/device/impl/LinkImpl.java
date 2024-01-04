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

import de.dim.trafficos.model.device.Lane;
import de.dim.trafficos.model.device.Link;
import de.dim.trafficos.model.device.OutgoingLane;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.LinkImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.LinkImpl#getRefIncomingLane <em>Ref Incoming Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.LinkImpl#getRefOutgoingLane <em>Ref Outgoing Lane</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefIncomingLane() <em>Ref Incoming Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefIncomingLane()
	 * @generated
	 * @ordered
	 */
	protected Lane refIncomingLane;

	/**
	 * The cached value of the '{@link #getRefOutgoingLane() <em>Ref Outgoing Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefOutgoingLane()
	 * @generated
	 * @ordered
	 */
	protected OutgoingLane refOutgoingLane;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.LINK__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane getRefIncomingLane() {
		if (refIncomingLane != null && refIncomingLane.eIsProxy()) {
			InternalEObject oldRefIncomingLane = (InternalEObject)refIncomingLane;
			refIncomingLane = (Lane)eResolveProxy(oldRefIncomingLane);
			if (refIncomingLane != oldRefIncomingLane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.LINK__REF_INCOMING_LANE, oldRefIncomingLane, refIncomingLane));
			}
		}
		return refIncomingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane basicGetRefIncomingLane() {
		return refIncomingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefIncomingLane(Lane newRefIncomingLane) {
		Lane oldRefIncomingLane = refIncomingLane;
		refIncomingLane = newRefIncomingLane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.LINK__REF_INCOMING_LANE, oldRefIncomingLane, refIncomingLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutgoingLane getRefOutgoingLane() {
		if (refOutgoingLane != null && refOutgoingLane.eIsProxy()) {
			InternalEObject oldRefOutgoingLane = (InternalEObject)refOutgoingLane;
			refOutgoingLane = (OutgoingLane)eResolveProxy(oldRefOutgoingLane);
			if (refOutgoingLane != oldRefOutgoingLane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.LINK__REF_OUTGOING_LANE, oldRefOutgoingLane, refOutgoingLane));
			}
		}
		return refOutgoingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingLane basicGetRefOutgoingLane() {
		return refOutgoingLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefOutgoingLane(OutgoingLane newRefOutgoingLane) {
		OutgoingLane oldRefOutgoingLane = refOutgoingLane;
		refOutgoingLane = newRefOutgoingLane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.LINK__REF_OUTGOING_LANE, oldRefOutgoingLane, refOutgoingLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.LINK__INDEX:
				return getIndex();
			case TOSDevicePackage.LINK__REF_INCOMING_LANE:
				if (resolve) return getRefIncomingLane();
				return basicGetRefIncomingLane();
			case TOSDevicePackage.LINK__REF_OUTGOING_LANE:
				if (resolve) return getRefOutgoingLane();
				return basicGetRefOutgoingLane();
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
			case TOSDevicePackage.LINK__INDEX:
				setIndex((String)newValue);
				return;
			case TOSDevicePackage.LINK__REF_INCOMING_LANE:
				setRefIncomingLane((Lane)newValue);
				return;
			case TOSDevicePackage.LINK__REF_OUTGOING_LANE:
				setRefOutgoingLane((OutgoingLane)newValue);
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
			case TOSDevicePackage.LINK__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case TOSDevicePackage.LINK__REF_INCOMING_LANE:
				setRefIncomingLane((Lane)null);
				return;
			case TOSDevicePackage.LINK__REF_OUTGOING_LANE:
				setRefOutgoingLane((OutgoingLane)null);
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
			case TOSDevicePackage.LINK__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case TOSDevicePackage.LINK__REF_INCOMING_LANE:
				return refIncomingLane != null;
			case TOSDevicePackage.LINK__REF_OUTGOING_LANE:
				return refOutgoingLane != null;
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
