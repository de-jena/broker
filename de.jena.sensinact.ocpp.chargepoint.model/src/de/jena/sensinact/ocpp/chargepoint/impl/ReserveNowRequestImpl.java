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
package de.jena.sensinact.ocpp.chargepoint.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.ReserveNowRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve Now Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl#getParentIdTag <em>Parent Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ReserveNowRequestImpl#getReservationId <em>Reservation Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveNowRequestImpl extends MinimalEObjectImpl.Container implements ReserveNowRequest {
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
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected String idTag = ID_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentIdTag() <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentIdTag()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_ID_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentIdTag() <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentIdTag()
	 * @generated
	 * @ordered
	 */
	protected String parentIdTag = PARENT_ID_TAG_EDEFAULT;

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
	protected ReserveNowRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.RESERVE_NOW_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.RESERVE_NOW_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.RESERVE_NOW_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
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
	public XMLGregorianCalendar getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiryDate(XMLGregorianCalendar newExpiryDate) {
		XMLGregorianCalendar oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.RESERVE_NOW_REQUEST__EXPIRY_DATE, oldExpiryDate, expiryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdTag() {
		return idTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTag(String newIdTag) {
		String oldIdTag = idTag;
		idTag = newIdTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.RESERVE_NOW_REQUEST__ID_TAG, oldIdTag, idTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentIdTag() {
		return parentIdTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentIdTag(String newParentIdTag) {
		String oldParentIdTag = parentIdTag;
		parentIdTag = newParentIdTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.RESERVE_NOW_REQUEST__PARENT_ID_TAG, oldParentIdTag, parentIdTag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.RESERVE_NOW_REQUEST__RESERVATION_ID, oldReservationId, reservationId, !oldReservationIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.RESERVE_NOW_REQUEST__RESERVATION_ID, oldReservationId, RESERVATION_ID_EDEFAULT, oldReservationIdESet));
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
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__EXPIRY_DATE:
				return getExpiryDate();
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__ID_TAG:
				return getIdTag();
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__PARENT_ID_TAG:
				return getParentIdTag();
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__RESERVATION_ID:
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
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__EXPIRY_DATE:
				setExpiryDate((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__ID_TAG:
				setIdTag((String)newValue);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__PARENT_ID_TAG:
				setParentIdTag((String)newValue);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__RESERVATION_ID:
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
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__ID_TAG:
				setIdTag(ID_TAG_EDEFAULT);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__PARENT_ID_TAG:
				setParentIdTag(PARENT_ID_TAG_EDEFAULT);
				return;
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__RESERVATION_ID:
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
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__EXPIRY_DATE:
				return EXPIRY_DATE_EDEFAULT == null ? expiryDate != null : !EXPIRY_DATE_EDEFAULT.equals(expiryDate);
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__ID_TAG:
				return ID_TAG_EDEFAULT == null ? idTag != null : !ID_TAG_EDEFAULT.equals(idTag);
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__PARENT_ID_TAG:
				return PARENT_ID_TAG_EDEFAULT == null ? parentIdTag != null : !PARENT_ID_TAG_EDEFAULT.equals(parentIdTag);
			case OcppChargePointPackage.RESERVE_NOW_REQUEST__RESERVATION_ID:
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
		result.append(", expiryDate: ");
		result.append(expiryDate);
		result.append(", idTag: ");
		result.append(idTag);
		result.append(", parentIdTag: ");
		result.append(parentIdTag);
		result.append(", reservationId: ");
		if (reservationIdESet) result.append(reservationId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReserveNowRequestImpl
