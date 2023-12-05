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
import de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Transaction Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl#getMeterStart <em>Meter Start</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionRequestImpl#getReservationId <em>Reservation Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartTransactionRequestImpl extends MinimalEObjectImpl.Container implements StartTransactionRequest {
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
	 * The default value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected Object idTag = ID_TAG_EDEFAULT;

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
	 * The default value of the '{@link #getMeterStart() <em>Meter Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterStart()
	 * @generated
	 * @ordered
	 */
	protected static final int METER_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeterStart() <em>Meter Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterStart()
	 * @generated
	 * @ordered
	 */
	protected int meterStart = METER_START_EDEFAULT;

	/**
	 * This is true if the Meter Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meterStartESet;

	/**
	 * The default value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected int reservationId = RESERVATION_ID_EDEFAULT;

	/**
	 * This is true if the Reservation Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reservationIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTransactionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.START_TRANSACTION_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
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
	public Object getIdTag() {
		return idTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTag(Object newIdTag) {
		Object oldIdTag = idTag;
		idTag = newIdTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__ID_TAG, oldIdTag, idTag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMeterStart() {
		return meterStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterStart(int newMeterStart) {
		int oldMeterStart = meterStart;
		meterStart = newMeterStart;
		boolean oldMeterStartESet = meterStartESet;
		meterStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__METER_START, oldMeterStart, meterStart, !oldMeterStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMeterStart() {
		int oldMeterStart = meterStart;
		boolean oldMeterStartESet = meterStartESet;
		meterStart = METER_START_EDEFAULT;
		meterStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__METER_START, oldMeterStart, METER_START_EDEFAULT, oldMeterStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMeterStart() {
		return meterStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReservationId() {
		return reservationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservationId(int newReservationId) {
		int oldReservationId = reservationId;
		reservationId = newReservationId;
		boolean oldReservationIdESet = reservationIdESet;
		reservationIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__RESERVATION_ID, oldReservationId, reservationId, !oldReservationIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReservationId() {
		int oldReservationId = reservationId;
		boolean oldReservationIdESet = reservationIdESet;
		reservationId = RESERVATION_ID_EDEFAULT;
		reservationIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.START_TRANSACTION_REQUEST__RESERVATION_ID, oldReservationId, RESERVATION_ID_EDEFAULT, oldReservationIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReservationId() {
		return reservationIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__ID_TAG:
				return getIdTag();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__TIMESTAMP:
				return getTimestamp();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__METER_START:
				return getMeterStart();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__RESERVATION_ID:
				return getReservationId();
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
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__ID_TAG:
				setIdTag(newValue);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__METER_START:
				setMeterStart((Integer)newValue);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__RESERVATION_ID:
				setReservationId((Integer)newValue);
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
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__ID_TAG:
				setIdTag(ID_TAG_EDEFAULT);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__METER_START:
				unsetMeterStart();
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__RESERVATION_ID:
				unsetReservationId();
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
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__ID_TAG:
				return ID_TAG_EDEFAULT == null ? idTag != null : !ID_TAG_EDEFAULT.equals(idTag);
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__METER_START:
				return isSetMeterStart();
			case OcppCentralSystemPackage.START_TRANSACTION_REQUEST__RESERVATION_ID:
				return isSetReservationId();
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
		result.append(", idTag: ");
		result.append(idTag);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", meterStart: ");
		if (meterStartESet) result.append(meterStart); else result.append("<unset>");
		result.append(", reservationId: ");
		if (reservationIdESet) result.append(reservationId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StartTransactionRequestImpl
