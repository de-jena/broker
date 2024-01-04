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

import de.dim.trafficos.model.device.Phase;
import de.dim.trafficos.model.device.ProgramEntry;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.ProgramEntryImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.ProgramEntryImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.ProgramEntryImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.ProgramEntryImpl#getRefPhase <em>Ref Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramEntryImpl extends MinimalEObjectImpl.Container implements ProgramEntry {
	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final int BEGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected int begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefPhase() <em>Ref Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPhase()
	 * @generated
	 * @ordered
	 */
	protected Phase refPhase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PROGRAM_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(int newBegin) {
		int oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PROGRAM_ENTRY__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PROGRAM_ENTRY__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PROGRAM_ENTRY__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Phase getRefPhase() {
		if (refPhase != null && refPhase.eIsProxy()) {
			InternalEObject oldRefPhase = (InternalEObject)refPhase;
			refPhase = (Phase)eResolveProxy(oldRefPhase);
			if (refPhase != oldRefPhase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.PROGRAM_ENTRY__REF_PHASE, oldRefPhase, refPhase));
			}
		}
		return refPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase basicGetRefPhase() {
		return refPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefPhase(Phase newRefPhase) {
		Phase oldRefPhase = refPhase;
		refPhase = newRefPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PROGRAM_ENTRY__REF_PHASE, oldRefPhase, refPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.PROGRAM_ENTRY__BEGIN:
				return getBegin();
			case TOSDevicePackage.PROGRAM_ENTRY__END:
				return getEnd();
			case TOSDevicePackage.PROGRAM_ENTRY__DURATION:
				return getDuration();
			case TOSDevicePackage.PROGRAM_ENTRY__REF_PHASE:
				if (resolve) return getRefPhase();
				return basicGetRefPhase();
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
			case TOSDevicePackage.PROGRAM_ENTRY__BEGIN:
				setBegin((Integer)newValue);
				return;
			case TOSDevicePackage.PROGRAM_ENTRY__END:
				setEnd((Integer)newValue);
				return;
			case TOSDevicePackage.PROGRAM_ENTRY__DURATION:
				setDuration((Integer)newValue);
				return;
			case TOSDevicePackage.PROGRAM_ENTRY__REF_PHASE:
				setRefPhase((Phase)newValue);
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
			case TOSDevicePackage.PROGRAM_ENTRY__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case TOSDevicePackage.PROGRAM_ENTRY__END:
				setEnd(END_EDEFAULT);
				return;
			case TOSDevicePackage.PROGRAM_ENTRY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TOSDevicePackage.PROGRAM_ENTRY__REF_PHASE:
				setRefPhase((Phase)null);
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
			case TOSDevicePackage.PROGRAM_ENTRY__BEGIN:
				return begin != BEGIN_EDEFAULT;
			case TOSDevicePackage.PROGRAM_ENTRY__END:
				return end != END_EDEFAULT;
			case TOSDevicePackage.PROGRAM_ENTRY__DURATION:
				return duration != DURATION_EDEFAULT;
			case TOSDevicePackage.PROGRAM_ENTRY__REF_PHASE:
				return refPhase != null;
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
		result.append(" (begin: ");
		result.append(begin);
		result.append(", end: ");
		result.append(end);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ProgramEntryImpl
