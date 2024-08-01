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
package de.jena.model.sensinact.ibis.impl;

import de.jena.model.sensinact.ibis.IbisSensinactPackage;
import de.jena.model.sensinact.ibis.TripInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#getLineName <em>Line Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#getTripNumber <em>Trip Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#isAtStop <em>At Stop</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TripInfoImpl#getStopName <em>Stop Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripInfoImpl extends ServiceImpl implements TripInfo {
	/**
	 * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected String deviceType = DEVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected String lineName = LINE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected int lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTripNumber() <em>Trip Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int TRIP_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTripNumber() <em>Trip Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripNumber()
	 * @generated
	 * @ordered
	 */
	protected int tripNumber = TRIP_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int DEVICE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected int deviceNumber = DEVICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAtStop() <em>At Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtStop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AT_STOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtStop() <em>At Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtStop()
	 * @generated
	 * @ordered
	 */
	protected boolean atStop = AT_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopName() <em>Stop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopName()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopName() <em>Stop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopName()
	 * @generated
	 * @ordered
	 */
	protected String stopName = STOP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.TRIP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceType(String newDeviceType) {
		String oldDeviceType = deviceType;
		deviceType = newDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__DEVICE_TYPE, oldDeviceType, deviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineName() {
		return lineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineName(String newLineName) {
		String oldLineName = lineName;
		lineName = newLineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__LINE_NAME, oldLineName, lineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineNumber(int newLineNumber) {
		int oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTripNumber() {
		return tripNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripNumber(int newTripNumber) {
		int oldTripNumber = tripNumber;
		tripNumber = newTripNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__TRIP_NUMBER, oldTripNumber, tripNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceNumber(int newDeviceNumber) {
		int oldDeviceNumber = deviceNumber;
		deviceNumber = newDeviceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__DEVICE_NUMBER, oldDeviceNumber, deviceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAtStop() {
		return atStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtStop(boolean newAtStop) {
		boolean oldAtStop = atStop;
		atStop = newAtStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__AT_STOP, oldAtStop, atStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStopName() {
		return stopName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopName(String newStopName) {
		String oldStopName = stopName;
		stopName = newStopName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TRIP_INFO__STOP_NAME, oldStopName, stopName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.TRIP_INFO__DEVICE_TYPE:
				return getDeviceType();
			case IbisSensinactPackage.TRIP_INFO__LINE_NAME:
				return getLineName();
			case IbisSensinactPackage.TRIP_INFO__LINE_NUMBER:
				return getLineNumber();
			case IbisSensinactPackage.TRIP_INFO__TRIP_NUMBER:
				return getTripNumber();
			case IbisSensinactPackage.TRIP_INFO__DEVICE_NUMBER:
				return getDeviceNumber();
			case IbisSensinactPackage.TRIP_INFO__AT_STOP:
				return isAtStop();
			case IbisSensinactPackage.TRIP_INFO__STOP_NAME:
				return getStopName();
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
			case IbisSensinactPackage.TRIP_INFO__DEVICE_TYPE:
				setDeviceType((String)newValue);
				return;
			case IbisSensinactPackage.TRIP_INFO__LINE_NAME:
				setLineName((String)newValue);
				return;
			case IbisSensinactPackage.TRIP_INFO__LINE_NUMBER:
				setLineNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.TRIP_INFO__TRIP_NUMBER:
				setTripNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.TRIP_INFO__DEVICE_NUMBER:
				setDeviceNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.TRIP_INFO__AT_STOP:
				setAtStop((Boolean)newValue);
				return;
			case IbisSensinactPackage.TRIP_INFO__STOP_NAME:
				setStopName((String)newValue);
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
			case IbisSensinactPackage.TRIP_INFO__DEVICE_TYPE:
				setDeviceType(DEVICE_TYPE_EDEFAULT);
				return;
			case IbisSensinactPackage.TRIP_INFO__LINE_NAME:
				setLineName(LINE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.TRIP_INFO__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.TRIP_INFO__TRIP_NUMBER:
				setTripNumber(TRIP_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.TRIP_INFO__DEVICE_NUMBER:
				setDeviceNumber(DEVICE_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.TRIP_INFO__AT_STOP:
				setAtStop(AT_STOP_EDEFAULT);
				return;
			case IbisSensinactPackage.TRIP_INFO__STOP_NAME:
				setStopName(STOP_NAME_EDEFAULT);
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
			case IbisSensinactPackage.TRIP_INFO__DEVICE_TYPE:
				return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
			case IbisSensinactPackage.TRIP_INFO__LINE_NAME:
				return LINE_NAME_EDEFAULT == null ? lineName != null : !LINE_NAME_EDEFAULT.equals(lineName);
			case IbisSensinactPackage.TRIP_INFO__LINE_NUMBER:
				return lineNumber != LINE_NUMBER_EDEFAULT;
			case IbisSensinactPackage.TRIP_INFO__TRIP_NUMBER:
				return tripNumber != TRIP_NUMBER_EDEFAULT;
			case IbisSensinactPackage.TRIP_INFO__DEVICE_NUMBER:
				return deviceNumber != DEVICE_NUMBER_EDEFAULT;
			case IbisSensinactPackage.TRIP_INFO__AT_STOP:
				return atStop != AT_STOP_EDEFAULT;
			case IbisSensinactPackage.TRIP_INFO__STOP_NAME:
				return STOP_NAME_EDEFAULT == null ? stopName != null : !STOP_NAME_EDEFAULT.equals(stopName);
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
		result.append(" (deviceType: ");
		result.append(deviceType);
		result.append(", lineName: ");
		result.append(lineName);
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(", tripNumber: ");
		result.append(tripNumber);
		result.append(", deviceNumber: ");
		result.append(deviceNumber);
		result.append(", atStop: ");
		result.append(atStop);
		result.append(", stopName: ");
		result.append(stopName);
		result.append(')');
		return result.toString();
	}

} //TripInfoImpl
