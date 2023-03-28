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

import de.dim.trafficos.model.device.PublicTransportLocMsg;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Transport Loc Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getLineNum <em>Line Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getTripNum <em>Trip Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getRouteNum <em>Route Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getTravelNum <em>Travel Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getKilometer <em>Kilometer</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getPosState <em>Pos State</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getLastStop <em>Last Stop</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getNextStop <em>Next Stop</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getActualTime <em>Actual Time</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getExpectedTime <em>Expected Time</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getGps <em>Gps</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getOdo <em>Odo</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLocMsgImpl#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicTransportLocMsgImpl extends PublicTransportDataValueObjectImpl implements PublicTransportLocMsg {
	/**
	 * The default value of the '{@link #getLineNum() <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNum()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNum() <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNum()
	 * @generated
	 * @ordered
	 */
	protected String lineNum = LINE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTripNum() <em>Trip Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripNum()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripNum() <em>Trip Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripNum()
	 * @generated
	 * @ordered
	 */
	protected String tripNum = TRIP_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteNum() <em>Route Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteNum()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteNum() <em>Route Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteNum()
	 * @generated
	 * @ordered
	 */
	protected String routeNum = ROUTE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelNum() <em>Travel Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelNum()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAVEL_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTravelNum() <em>Travel Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelNum()
	 * @generated
	 * @ordered
	 */
	protected String travelNum = TRAVEL_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected int counter = COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilometer() <em>Kilometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilometer()
	 * @generated
	 * @ordered
	 */
	protected static final int KILOMETER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKilometer() <em>Kilometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilometer()
	 * @generated
	 * @ordered
	 */
	protected int kilometer = KILOMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosState() <em>Pos State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosState()
	 * @generated
	 * @ordered
	 */
	protected static final String POS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosState() <em>Pos State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosState()
	 * @generated
	 * @ordered
	 */
	protected String posState = POS_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastStop() <em>Last Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStop()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastStop() <em>Last Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStop()
	 * @generated
	 * @ordered
	 */
	protected String lastStop = LAST_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextStop() <em>Next Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStop()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStop() <em>Next Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStop()
	 * @generated
	 * @ordered
	 */
	protected String nextStop = NEXT_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualTime() <em>Actual Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTime()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTUAL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActualTime() <em>Actual Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTime()
	 * @generated
	 * @ordered
	 */
	protected int actualTime = ACTUAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedTime() <em>Expected Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedTime()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPECTED_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpectedTime() <em>Expected Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedTime()
	 * @generated
	 * @ordered
	 */
	protected int expectedTime = EXPECTED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGps() <em>Gps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGps()
	 * @generated
	 * @ordered
	 */
	protected static final String GPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGps() <em>Gps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGps()
	 * @generated
	 * @ordered
	 */
	protected String gps = GPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOdo() <em>Odo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdo()
	 * @generated
	 * @ordered
	 */
	protected static final String ODO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOdo() <em>Odo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdo()
	 * @generated
	 * @ordered
	 */
	protected String odo = ODO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoor() <em>Door</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected static final String DOOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected String door = DOOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportLocMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_LOC_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineNum() {
		return lineNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineNum(String newLineNum) {
		String oldLineNum = lineNum;
		lineNum = newLineNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM, oldLineNum, lineNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTripNum() {
		return tripNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripNum(String newTripNum) {
		String oldTripNum = tripNum;
		tripNum = newTripNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM, oldTripNum, tripNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteNum() {
		return routeNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteNum(String newRouteNum) {
		String oldRouteNum = routeNum;
		routeNum = newRouteNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM, oldRouteNum, routeNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTravelNum() {
		return travelNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTravelNum(String newTravelNum) {
		String oldTravelNum = travelNum;
		travelNum = newTravelNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM, oldTravelNum, travelNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(int newCounter) {
		int oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKilometer() {
		return kilometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKilometer(int newKilometer) {
		int oldKilometer = kilometer;
		kilometer = newKilometer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__KILOMETER, oldKilometer, kilometer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosState() {
		return posState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosState(String newPosState) {
		String oldPosState = posState;
		posState = newPosState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__POS_STATE, oldPosState, posState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastStop() {
		return lastStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastStop(String newLastStop) {
		String oldLastStop = lastStop;
		lastStop = newLastStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP, oldLastStop, lastStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextStop() {
		return nextStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextStop(String newNextStop) {
		String oldNextStop = nextStop;
		nextStop = newNextStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP, oldNextStop, nextStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getActualTime() {
		return actualTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualTime(int newActualTime) {
		int oldActualTime = actualTime;
		actualTime = newActualTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME, oldActualTime, actualTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExpectedTime() {
		return expectedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedTime(int newExpectedTime) {
		int oldExpectedTime = expectedTime;
		expectedTime = newExpectedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME, oldExpectedTime, expectedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGps() {
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGps(String newGps) {
		String oldGps = gps;
		gps = newGps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__GPS, oldGps, gps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOdo() {
		return odo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOdo(String newOdo) {
		String oldOdo = odo;
		odo = newOdo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ODO, oldOdo, odo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoor() {
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoor(String newDoor) {
		String oldDoor = door;
		door = newDoor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__DOOR, oldDoor, door));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM:
				return getLineNum();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM:
				return getTripNum();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM:
				return getRouteNum();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM:
				return getTravelNum();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__COUNTER:
				return getCounter();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__KILOMETER:
				return getKilometer();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__POS_STATE:
				return getPosState();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP:
				return getLastStop();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP:
				return getNextStop();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME:
				return getActualTime();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME:
				return getExpectedTime();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__GPS:
				return getGps();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ODO:
				return getOdo();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__DOOR:
				return getDoor();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM:
				setLineNum((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM:
				setTripNum((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM:
				setRouteNum((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM:
				setTravelNum((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__COUNTER:
				setCounter((Integer)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__KILOMETER:
				setKilometer((Integer)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__POS_STATE:
				setPosState((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP:
				setLastStop((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP:
				setNextStop((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME:
				setActualTime((Integer)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME:
				setExpectedTime((Integer)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__GPS:
				setGps((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ODO:
				setOdo((String)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__DOOR:
				setDoor((String)newValue);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM:
				setLineNum(LINE_NUM_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM:
				setTripNum(TRIP_NUM_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM:
				setRouteNum(ROUTE_NUM_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM:
				setTravelNum(TRAVEL_NUM_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__KILOMETER:
				setKilometer(KILOMETER_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__POS_STATE:
				setPosState(POS_STATE_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP:
				setLastStop(LAST_STOP_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP:
				setNextStop(NEXT_STOP_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME:
				setActualTime(ACTUAL_TIME_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME:
				setExpectedTime(EXPECTED_TIME_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__GPS:
				setGps(GPS_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ODO:
				setOdo(ODO_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__DOOR:
				setDoor(DOOR_EDEFAULT);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LINE_NUM:
				return LINE_NUM_EDEFAULT == null ? lineNum != null : !LINE_NUM_EDEFAULT.equals(lineNum);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRIP_NUM:
				return TRIP_NUM_EDEFAULT == null ? tripNum != null : !TRIP_NUM_EDEFAULT.equals(tripNum);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ROUTE_NUM:
				return ROUTE_NUM_EDEFAULT == null ? routeNum != null : !ROUTE_NUM_EDEFAULT.equals(routeNum);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__TRAVEL_NUM:
				return TRAVEL_NUM_EDEFAULT == null ? travelNum != null : !TRAVEL_NUM_EDEFAULT.equals(travelNum);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__COUNTER:
				return counter != COUNTER_EDEFAULT;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__KILOMETER:
				return kilometer != KILOMETER_EDEFAULT;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__POS_STATE:
				return POS_STATE_EDEFAULT == null ? posState != null : !POS_STATE_EDEFAULT.equals(posState);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__LAST_STOP:
				return LAST_STOP_EDEFAULT == null ? lastStop != null : !LAST_STOP_EDEFAULT.equals(lastStop);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__NEXT_STOP:
				return NEXT_STOP_EDEFAULT == null ? nextStop != null : !NEXT_STOP_EDEFAULT.equals(nextStop);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ACTUAL_TIME:
				return actualTime != ACTUAL_TIME_EDEFAULT;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__EXPECTED_TIME:
				return expectedTime != EXPECTED_TIME_EDEFAULT;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__GPS:
				return GPS_EDEFAULT == null ? gps != null : !GPS_EDEFAULT.equals(gps);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__ODO:
				return ODO_EDEFAULT == null ? odo != null : !ODO_EDEFAULT.equals(odo);
			case TOSDevicePackage.PUBLIC_TRANSPORT_LOC_MSG__DOOR:
				return DOOR_EDEFAULT == null ? door != null : !DOOR_EDEFAULT.equals(door);
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
		result.append(" (lineNum: ");
		result.append(lineNum);
		result.append(", tripNum: ");
		result.append(tripNum);
		result.append(", routeNum: ");
		result.append(routeNum);
		result.append(", travelNum: ");
		result.append(travelNum);
		result.append(", counter: ");
		result.append(counter);
		result.append(", kilometer: ");
		result.append(kilometer);
		result.append(", posState: ");
		result.append(posState);
		result.append(", lastStop: ");
		result.append(lastStop);
		result.append(", nextStop: ");
		result.append(nextStop);
		result.append(", actualTime: ");
		result.append(actualTime);
		result.append(", expectedTime: ");
		result.append(expectedTime);
		result.append(", gps: ");
		result.append(gps);
		result.append(", odo: ");
		result.append(odo);
		result.append(", door: ");
		result.append(door);
		result.append(')');
		return result.toString();
	}

} //PublicTransportLocMsgImpl
