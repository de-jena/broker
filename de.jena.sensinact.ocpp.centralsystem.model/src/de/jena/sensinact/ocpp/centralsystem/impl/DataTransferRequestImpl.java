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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.centralsystem.DataTransferRequest;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl#getVendorId <em>Vendor Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.DataTransferRequestImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTransferRequestImpl extends MinimalEObjectImpl.Container implements DataTransferRequest {
	/**
	 * The default value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected static final Object VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected Object vendorId = VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected static final Object MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected Object messageId = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransferRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.DATA_TRANSFER_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVendorId() {
		return vendorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorId(Object newVendorId) {
		Object oldVendorId = vendorId;
		vendorId = newVendorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__VENDOR_ID, oldVendorId, vendorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMessageId() {
		return messageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageId(Object newMessageId) {
		Object oldMessageId = messageId;
		messageId = newMessageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID, oldMessageId, messageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				return getVendorId();
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				return getMessageId();
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__DATA:
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
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				setVendorId(newValue);
				return;
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				setMessageId(newValue);
				return;
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__DATA:
				setData((String)newValue);
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
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				setVendorId(VENDOR_ID_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
				return;
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__DATA:
				setData(DATA_EDEFAULT);
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
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorId != null : !VENDOR_ID_EDEFAULT.equals(vendorId);
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
			case OcppCentralSystemPackage.DATA_TRANSFER_REQUEST__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
		result.append(" (vendorId: ");
		result.append(vendorId);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //DataTransferRequestImpl
