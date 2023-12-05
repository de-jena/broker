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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Notification Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getVendorId <em>Vendor Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StatusNotificationRequestImpl#getVendorErrorCode <em>Vendor Error Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusNotificationRequestImpl extends MinimalEObjectImpl.Container implements StatusNotificationRequest {
	/**
	 * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected int connectorId = CONNECTOR_ID_EDEFAULT;

	/**
	 * This is true if the Connector Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectorIdESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Object status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected Object errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Object INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Object info = INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

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
	 * The default value of the '{@link #getVendorErrorCode() <em>Vendor Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object VENDOR_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorErrorCode() <em>Vendor Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorErrorCode()
	 * @generated
	 * @ordered
	 */
	protected Object vendorErrorCode = VENDOR_ERROR_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusNotificationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.STATUS_NOTIFICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectorId() {
		return connectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorId(int newConnectorId) {
		int oldConnectorId = connectorId;
		connectorId = newConnectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectorId() {
		int oldConnectorId = connectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorId = CONNECTOR_ID_EDEFAULT;
		connectorIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectorId() {
		return connectorIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Object newStatus) {
		Object oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorCode(Object newErrorCode) {
		Object oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__ERROR_CODE, oldErrorCode, errorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfo(Object newInfo) {
		Object oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ID, oldVendorId, vendorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVendorErrorCode() {
		return vendorErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorErrorCode(Object newVendorErrorCode) {
		Object oldVendorErrorCode = vendorErrorCode;
		vendorErrorCode = newVendorErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE, oldVendorErrorCode, vendorErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__STATUS:
				return getStatus();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__ERROR_CODE:
				return getErrorCode();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__INFO:
				return getInfo();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__TIMESTAMP:
				return getTimestamp();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ID:
				return getVendorId();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE:
				return getVendorErrorCode();
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
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__STATUS:
				setStatus(newValue);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__ERROR_CODE:
				setErrorCode(newValue);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__INFO:
				setInfo(newValue);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ID:
				setVendorId(newValue);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE:
				setVendorErrorCode(newValue);
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
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__INFO:
				setInfo(INFO_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ID:
				setVendorId(VENDOR_ID_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE:
				setVendorErrorCode(VENDOR_ERROR_CODE_EDEFAULT);
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
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__INFO:
				return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorId != null : !VENDOR_ID_EDEFAULT.equals(vendorId);
			case OcppCentralSystemPackage.STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE:
				return VENDOR_ERROR_CODE_EDEFAULT == null ? vendorErrorCode != null : !VENDOR_ERROR_CODE_EDEFAULT.equals(vendorErrorCode);
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
		result.append(" (connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(", status: ");
		result.append(status);
		result.append(", errorCode: ");
		result.append(errorCode);
		result.append(", info: ");
		result.append(info);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", vendorId: ");
		result.append(vendorId);
		result.append(", vendorErrorCode: ");
		result.append(vendorErrorCode);
		result.append(')');
		return result.toString();
	}

} //StatusNotificationRequestImpl
