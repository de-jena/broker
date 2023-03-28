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
package de.jena.sensinact.rest.tlc.control.model.control.impl;

import de.jena.sensinact.rest.tlc.control.model.control.Control;
import de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.impl.ControlImpl#getPhaseId <em>Phase Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control {
	/**
	 * The default value of the '{@link #getPhaseId() <em>Phase Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseId()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseId() <em>Phase Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseId()
	 * @generated
	 * @ordered
	 */
	protected String phaseId = PHASE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TlcControlPackage.eINSTANCE.getControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhaseId() {
		return phaseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhaseId(String newPhaseId) {
		String oldPhaseId = phaseId;
		phaseId = newPhaseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TlcControlPackage.CONTROL__PHASE_ID, oldPhaseId, phaseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TlcControlPackage.CONTROL__PHASE_ID:
				return getPhaseId();
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
			case TlcControlPackage.CONTROL__PHASE_ID:
				setPhaseId((String)newValue);
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
			case TlcControlPackage.CONTROL__PHASE_ID:
				setPhaseId(PHASE_ID_EDEFAULT);
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
			case TlcControlPackage.CONTROL__PHASE_ID:
				return PHASE_ID_EDEFAULT == null ? phaseId != null : !PHASE_ID_EDEFAULT.equals(phaseId);
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
		result.append(" (phaseId: ");
		result.append(phaseId);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
