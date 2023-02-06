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

import de.jena.sensinact.ocpp.chargepoint.ChargingSchedule;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleResponse;
import de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleStatus;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Composite Schedule Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetCompositeScheduleResponseImpl#getChargingSchedule <em>Charging Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetCompositeScheduleResponseImpl extends MinimalEObjectImpl.Container implements GetCompositeScheduleResponse {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GetCompositeScheduleStatus STATUS_EDEFAULT = GetCompositeScheduleStatus.ACCEPTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GetCompositeScheduleStatus status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

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
	 * The default value of the '{@link #getScheduleStart() <em>Schedule Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SCHEDULE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleStart() <em>Schedule Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar scheduleStart = SCHEDULE_START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChargingSchedule() <em>Charging Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingSchedule()
	 * @generated
	 * @ordered
	 */
	protected ChargingSchedule chargingSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetCompositeScheduleResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.GET_COMPOSITE_SCHEDULE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCompositeScheduleStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(GetCompositeScheduleStatus newStatus) {
		GetCompositeScheduleStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStatus() {
		GetCompositeScheduleStatus oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStatus() {
		return statusESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
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
	public XMLGregorianCalendar getScheduleStart() {
		return scheduleStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduleStart(XMLGregorianCalendar newScheduleStart) {
		XMLGregorianCalendar oldScheduleStart = scheduleStart;
		scheduleStart = newScheduleStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START, oldScheduleStart, scheduleStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingSchedule getChargingSchedule() {
		return chargingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargingSchedule(ChargingSchedule newChargingSchedule, NotificationChain msgs) {
		ChargingSchedule oldChargingSchedule = chargingSchedule;
		chargingSchedule = newChargingSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE, oldChargingSchedule, newChargingSchedule);
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
	public void setChargingSchedule(ChargingSchedule newChargingSchedule) {
		if (newChargingSchedule != chargingSchedule) {
			NotificationChain msgs = null;
			if (chargingSchedule != null)
				msgs = ((InternalEObject)chargingSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE, null, msgs);
			if (newChargingSchedule != null)
				msgs = ((InternalEObject)newChargingSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE, null, msgs);
			msgs = basicSetChargingSchedule(newChargingSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE, newChargingSchedule, newChargingSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE:
				return basicSetChargingSchedule(null, msgs);
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS:
				return getStatus();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID:
				return getConnectorId();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START:
				return getScheduleStart();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE:
				return getChargingSchedule();
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS:
				setStatus((GetCompositeScheduleStatus)newValue);
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START:
				setScheduleStart((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE:
				setChargingSchedule((ChargingSchedule)newValue);
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS:
				unsetStatus();
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START:
				setScheduleStart(SCHEDULE_START_EDEFAULT);
				return;
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE:
				setChargingSchedule((ChargingSchedule)null);
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
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__STATUS:
				return isSetStatus();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__SCHEDULE_START:
				return SCHEDULE_START_EDEFAULT == null ? scheduleStart != null : !SCHEDULE_START_EDEFAULT.equals(scheduleStart);
			case OcppChargePointPackage.GET_COMPOSITE_SCHEDULE_RESPONSE__CHARGING_SCHEDULE:
				return chargingSchedule != null;
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
		result.append(" (status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(", scheduleStart: ");
		result.append(scheduleStart);
		result.append(')');
		return result.toString();
	}

} //GetCompositeScheduleResponseImpl
