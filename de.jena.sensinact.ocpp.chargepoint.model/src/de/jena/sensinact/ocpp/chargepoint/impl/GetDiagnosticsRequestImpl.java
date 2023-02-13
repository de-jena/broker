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

import de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsRequest;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Diagnostics Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetDiagnosticsRequestImpl#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetDiagnosticsRequestImpl extends MinimalEObjectImpl.Container implements GetDiagnosticsRequest {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar STOP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar stopTime = STOP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected int retries = RETRIES_EDEFAULT;

	/**
	 * This is true if the Retries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retriesESet;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected int retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Retry Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retryIntervalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetDiagnosticsRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.GET_DIAGNOSTICS_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStopTime() {
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopTime(XMLGregorianCalendar newStopTime) {
		XMLGregorianCalendar oldStopTime = stopTime;
		stopTime = newStopTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__STOP_TIME, oldStopTime, stopTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetries() {
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetries(int newRetries) {
		int oldRetries = retries;
		retries = newRetries;
		boolean oldRetriesESet = retriesESet;
		retriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRIES, oldRetries, retries, !oldRetriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRetries() {
		int oldRetries = retries;
		boolean oldRetriesESet = retriesESet;
		retries = RETRIES_EDEFAULT;
		retriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRIES, oldRetries, RETRIES_EDEFAULT, oldRetriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRetries() {
		return retriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryInterval(int newRetryInterval) {
		int oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		boolean oldRetryIntervalESet = retryIntervalESet;
		retryIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL, oldRetryInterval, retryInterval, !oldRetryIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRetryInterval() {
		int oldRetryInterval = retryInterval;
		boolean oldRetryIntervalESet = retryIntervalESet;
		retryInterval = RETRY_INTERVAL_EDEFAULT;
		retryIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL, oldRetryInterval, RETRY_INTERVAL_EDEFAULT, oldRetryIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRetryInterval() {
		return retryIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__LOCATION:
				return getLocation();
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__START_TIME:
				return getStartTime();
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__STOP_TIME:
				return getStopTime();
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRIES:
				return getRetries();
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL:
				return getRetryInterval();
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
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__LOCATION:
				setLocation((String)newValue);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__STOP_TIME:
				setStopTime((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRIES:
				setRetries((Integer)newValue);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL:
				setRetryInterval((Integer)newValue);
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
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__STOP_TIME:
				setStopTime(STOP_TIME_EDEFAULT);
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRIES:
				unsetRetries();
				return;
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL:
				unsetRetryInterval();
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
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__STOP_TIME:
				return STOP_TIME_EDEFAULT == null ? stopTime != null : !STOP_TIME_EDEFAULT.equals(stopTime);
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRIES:
				return isSetRetries();
			case OcppChargePointPackage.GET_DIAGNOSTICS_REQUEST__RETRY_INTERVAL:
				return isSetRetryInterval();
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
		result.append(" (location: ");
		result.append(location);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", stopTime: ");
		result.append(stopTime);
		result.append(", retries: ");
		if (retriesESet) result.append(retries); else result.append("<unset>");
		result.append(", retryInterval: ");
		if (retryIntervalESet) result.append(retryInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GetDiagnosticsRequestImpl
