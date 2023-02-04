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

import de.dim.trafficos.model.device.ClearArea;
import de.dim.trafficos.model.device.ConflictingLane;
import de.dim.trafficos.model.device.Phase;
import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.TransitionImpl#getRefNextPhase <em>Ref Next Phase</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TransitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TransitionImpl#getUnchangedLane <em>Unchanged Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TransitionImpl#getChangedLane <em>Changed Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TransitionImpl#getClearArea <em>Clear Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getRefNextPhase() <em>Ref Next Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefNextPhase()
	 * @generated
	 * @ordered
	 */
	protected Phase refNextPhase;

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
	 * The cached value of the '{@link #getUnchangedLane() <em>Unchanged Lane</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangedLane()
	 * @generated
	 * @ordered
	 */
	protected EList<ConflictingLane> unchangedLane;

	/**
	 * The cached value of the '{@link #getChangedLane() <em>Changed Lane</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedLane()
	 * @generated
	 * @ordered
	 */
	protected EList<ConflictingLane> changedLane;

	/**
	 * The cached value of the '{@link #getClearArea() <em>Clear Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearArea()
	 * @generated
	 * @ordered
	 */
	protected EList<ClearArea> clearArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Phase getRefNextPhase() {
		if (refNextPhase != null && refNextPhase.eIsProxy()) {
			InternalEObject oldRefNextPhase = (InternalEObject)refNextPhase;
			refNextPhase = (Phase)eResolveProxy(oldRefNextPhase);
			if (refNextPhase != oldRefNextPhase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.TRANSITION__REF_NEXT_PHASE, oldRefNextPhase, refNextPhase));
			}
		}
		return refNextPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase basicGetRefNextPhase() {
		return refNextPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefNextPhase(Phase newRefNextPhase) {
		Phase oldRefNextPhase = refNextPhase;
		refNextPhase = newRefNextPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRANSITION__REF_NEXT_PHASE, oldRefNextPhase, refNextPhase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRANSITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConflictingLane> getUnchangedLane() {
		if (unchangedLane == null) {
			unchangedLane = new EObjectResolvingEList<ConflictingLane>(ConflictingLane.class, this, TOSDevicePackage.TRANSITION__UNCHANGED_LANE);
		}
		return unchangedLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConflictingLane> getChangedLane() {
		if (changedLane == null) {
			changedLane = new EObjectResolvingEList<ConflictingLane>(ConflictingLane.class, this, TOSDevicePackage.TRANSITION__CHANGED_LANE);
		}
		return changedLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClearArea> getClearArea() {
		if (clearArea == null) {
			clearArea = new EObjectContainmentEList<ClearArea>(ClearArea.class, this, TOSDevicePackage.TRANSITION__CLEAR_AREA);
		}
		return clearArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.TRANSITION__CLEAR_AREA:
				return ((InternalEList<?>)getClearArea()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.TRANSITION__REF_NEXT_PHASE:
				if (resolve) return getRefNextPhase();
				return basicGetRefNextPhase();
			case TOSDevicePackage.TRANSITION__ID:
				return getId();
			case TOSDevicePackage.TRANSITION__UNCHANGED_LANE:
				return getUnchangedLane();
			case TOSDevicePackage.TRANSITION__CHANGED_LANE:
				return getChangedLane();
			case TOSDevicePackage.TRANSITION__CLEAR_AREA:
				return getClearArea();
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
			case TOSDevicePackage.TRANSITION__REF_NEXT_PHASE:
				setRefNextPhase((Phase)newValue);
				return;
			case TOSDevicePackage.TRANSITION__ID:
				setId((String)newValue);
				return;
			case TOSDevicePackage.TRANSITION__UNCHANGED_LANE:
				getUnchangedLane().clear();
				getUnchangedLane().addAll((Collection<? extends ConflictingLane>)newValue);
				return;
			case TOSDevicePackage.TRANSITION__CHANGED_LANE:
				getChangedLane().clear();
				getChangedLane().addAll((Collection<? extends ConflictingLane>)newValue);
				return;
			case TOSDevicePackage.TRANSITION__CLEAR_AREA:
				getClearArea().clear();
				getClearArea().addAll((Collection<? extends ClearArea>)newValue);
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
			case TOSDevicePackage.TRANSITION__REF_NEXT_PHASE:
				setRefNextPhase((Phase)null);
				return;
			case TOSDevicePackage.TRANSITION__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSDevicePackage.TRANSITION__UNCHANGED_LANE:
				getUnchangedLane().clear();
				return;
			case TOSDevicePackage.TRANSITION__CHANGED_LANE:
				getChangedLane().clear();
				return;
			case TOSDevicePackage.TRANSITION__CLEAR_AREA:
				getClearArea().clear();
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
			case TOSDevicePackage.TRANSITION__REF_NEXT_PHASE:
				return refNextPhase != null;
			case TOSDevicePackage.TRANSITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSDevicePackage.TRANSITION__UNCHANGED_LANE:
				return unchangedLane != null && !unchangedLane.isEmpty();
			case TOSDevicePackage.TRANSITION__CHANGED_LANE:
				return changedLane != null && !changedLane.isEmpty();
			case TOSDevicePackage.TRANSITION__CLEAR_AREA:
				return clearArea != null && !clearArea.isEmpty();
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

} //TransitionImpl
