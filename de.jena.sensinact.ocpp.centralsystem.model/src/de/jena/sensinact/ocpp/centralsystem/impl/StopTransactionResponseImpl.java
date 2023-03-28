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
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Transaction Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionResponseImpl#getIdTagInfo <em>Id Tag Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopTransactionResponseImpl extends MinimalEObjectImpl.Container implements StopTransactionResponse {
	/**
	 * The default value of the '{@link #getIdTagInfo() <em>Id Tag Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTagInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_TAG_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTagInfo() <em>Id Tag Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTagInfo()
	 * @generated
	 * @ordered
	 */
	protected Object idTagInfo = ID_TAG_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopTransactionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.STOP_TRANSACTION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIdTagInfo() {
		return idTagInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTagInfo(Object newIdTagInfo) {
		Object oldIdTagInfo = idTagInfo;
		idTagInfo = newIdTagInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE__ID_TAG_INFO, oldIdTagInfo, idTagInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE__ID_TAG_INFO:
				return getIdTagInfo();
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
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE__ID_TAG_INFO:
				setIdTagInfo(newValue);
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
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE__ID_TAG_INFO:
				setIdTagInfo(ID_TAG_INFO_EDEFAULT);
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
			case OcppCentralSystemPackage.STOP_TRANSACTION_RESPONSE__ID_TAG_INFO:
				return ID_TAG_INFO_EDEFAULT == null ? idTagInfo != null : !ID_TAG_INFO_EDEFAULT.equals(idTagInfo);
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
		result.append(" (idTagInfo: ");
		result.append(idTagInfo);
		result.append(')');
		return result.toString();
	}

} //StopTransactionResponseImpl
