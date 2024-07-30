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

import de.jena.model.sensinact.ibis.CustomerInfoAllData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Info All Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#isInPanic <em>In Panic</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#isVehicleStopRequested <em>Vehicle Stop Requested</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#isMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#isSpeakerActive <em>Speaker Active</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#isStopInformationActive <em>Stop Information Active</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoAllDataImpl#getTripState <em>Trip State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInfoAllDataImpl extends ServiceImpl implements CustomerInfoAllData {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceOperation() <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceOperation() <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOperation()
	 * @generated
	 * @ordered
	 */
	protected String serviceOperation = SERVICE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Instant TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleRef() <em>Vehicle Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleRef()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleRef() <em>Vehicle Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleRef()
	 * @generated
	 * @ordered
	 */
	protected String vehicleRef = VEHICLE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected String defaultLanguage = DEFAULT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentStopIndex() <em>Current Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_STOP_INDEX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getCurrentStopIndex() <em>Current Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected int currentStopIndex = CURRENT_STOP_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteDeviation() <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_DEVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteDeviation() <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDeviation()
	 * @generated
	 * @ordered
	 */
	protected String routeDeviation = ROUTE_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoorState() <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorState()
	 * @generated
	 * @ordered
	 */
	protected static final String DOOR_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoorState() <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorState()
	 * @generated
	 * @ordered
	 */
	protected String doorState = DOOR_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInPanic() <em>In Panic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInPanic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_PANIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInPanic() <em>In Panic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInPanic()
	 * @generated
	 * @ordered
	 */
	protected boolean inPanic = IN_PANIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isVehicleStopRequested() <em>Vehicle Stop Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVehicleStopRequested()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VEHICLE_STOP_REQUESTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVehicleStopRequested() <em>Vehicle Stop Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVehicleStopRequested()
	 * @generated
	 * @ordered
	 */
	protected boolean vehicleStopRequested = VEHICLE_STOP_REQUESTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExitSide() <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitSide()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExitSide() <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitSide()
	 * @generated
	 * @ordered
	 */
	protected String exitSide = EXIT_SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMovingDirectionForward() <em>Moving Direction Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMovingDirectionForward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVING_DIRECTION_FORWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMovingDirectionForward() <em>Moving Direction Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMovingDirectionForward()
	 * @generated
	 * @ordered
	 */
	protected boolean movingDirectionForward = MOVING_DIRECTION_FORWARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleMode() <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMode()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleMode() <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMode()
	 * @generated
	 * @ordered
	 */
	protected String vehicleMode = VEHICLE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpeakerActive() <em>Speaker Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpeakerActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPEAKER_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpeakerActive() <em>Speaker Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpeakerActive()
	 * @generated
	 * @ordered
	 */
	protected boolean speakerActive = SPEAKER_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStopInformationActive() <em>Stop Information Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopInformationActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOP_INFORMATION_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStopInformationActive() <em>Stop Information Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopInformationActive()
	 * @generated
	 * @ordered
	 */
	protected boolean stopInformationActive = STOP_INFORMATION_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTripState() <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripState()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripState() <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripState()
	 * @generated
	 * @ordered
	 */
	protected String tripState = TRIP_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInfoAllDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.CUSTOMER_INFO_ALL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceOperation() {
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceOperation(String newServiceOperation) {
		String oldServiceOperation = serviceOperation;
		serviceOperation = newServiceOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Instant newTimestamp) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVehicleRef() {
		return vehicleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleRef(String newVehicleRef) {
		String oldVehicleRef = vehicleRef;
		vehicleRef = newVehicleRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_REF, oldVehicleRef, vehicleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLanguage(String newDefaultLanguage) {
		String oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DEFAULT_LANGUAGE, oldDefaultLanguage, defaultLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentStopIndex() {
		return currentStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStopIndex(int newCurrentStopIndex) {
		int oldCurrentStopIndex = currentStopIndex;
		currentStopIndex = newCurrentStopIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__CURRENT_STOP_INDEX, oldCurrentStopIndex, currentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteDeviation() {
		return routeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteDeviation(String newRouteDeviation) {
		String oldRouteDeviation = routeDeviation;
		routeDeviation = newRouteDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__ROUTE_DEVIATION, oldRouteDeviation, routeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoorState() {
		return doorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoorState(String newDoorState) {
		String oldDoorState = doorState;
		doorState = newDoorState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DOOR_STATE, oldDoorState, doorState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInPanic() {
		return inPanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInPanic(boolean newInPanic) {
		boolean oldInPanic = inPanic;
		inPanic = newInPanic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__IN_PANIC, oldInPanic, inPanic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVehicleStopRequested() {
		return vehicleStopRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleStopRequested(boolean newVehicleStopRequested) {
		boolean oldVehicleStopRequested = vehicleStopRequested;
		vehicleStopRequested = newVehicleStopRequested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_STOP_REQUESTED, oldVehicleStopRequested, vehicleStopRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExitSide() {
		return exitSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitSide(String newExitSide) {
		String oldExitSide = exitSide;
		exitSide = newExitSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__EXIT_SIDE, oldExitSide, exitSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMovingDirectionForward() {
		return movingDirectionForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMovingDirectionForward(boolean newMovingDirectionForward) {
		boolean oldMovingDirectionForward = movingDirectionForward;
		movingDirectionForward = newMovingDirectionForward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__MOVING_DIRECTION_FORWARD, oldMovingDirectionForward, movingDirectionForward));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVehicleMode() {
		return vehicleMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleMode(String newVehicleMode) {
		String oldVehicleMode = vehicleMode;
		vehicleMode = newVehicleMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_MODE, oldVehicleMode, vehicleMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSpeakerActive() {
		return speakerActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeakerActive(boolean newSpeakerActive) {
		boolean oldSpeakerActive = speakerActive;
		speakerActive = newSpeakerActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SPEAKER_ACTIVE, oldSpeakerActive, speakerActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStopInformationActive() {
		return stopInformationActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopInformationActive(boolean newStopInformationActive) {
		boolean oldStopInformationActive = stopInformationActive;
		stopInformationActive = newStopInformationActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__STOP_INFORMATION_ACTIVE, oldStopInformationActive, stopInformationActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTripState() {
		return tripState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripState(String newTripState) {
		String oldTripState = tripState;
		tripState = newTripState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TRIP_STATE, oldTripState, tripState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_REF:
				return getVehicleRef();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DEFAULT_LANGUAGE:
				return getDefaultLanguage();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__ROUTE_DEVIATION:
				return getRouteDeviation();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DOOR_STATE:
				return getDoorState();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__IN_PANIC:
				return isInPanic();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_STOP_REQUESTED:
				return isVehicleStopRequested();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__EXIT_SIDE:
				return getExitSide();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__MOVING_DIRECTION_FORWARD:
				return isMovingDirectionForward();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_MODE:
				return getVehicleMode();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SPEAKER_ACTIVE:
				return isSpeakerActive();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__STOP_INFORMATION_ACTIVE:
				return isStopInformationActive();
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TRIP_STATE:
				return getTripState();
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
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_REF:
				setVehicleRef((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__ROUTE_DEVIATION:
				setRouteDeviation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DOOR_STATE:
				setDoorState((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__IN_PANIC:
				setInPanic((Boolean)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_STOP_REQUESTED:
				setVehicleStopRequested((Boolean)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__EXIT_SIDE:
				setExitSide((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward((Boolean)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_MODE:
				setVehicleMode((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SPEAKER_ACTIVE:
				setSpeakerActive((Boolean)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__STOP_INFORMATION_ACTIVE:
				setStopInformationActive((Boolean)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TRIP_STATE:
				setTripState((String)newValue);
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
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_REF:
				setVehicleRef(VEHICLE_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage(DEFAULT_LANGUAGE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex(CURRENT_STOP_INDEX_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__ROUTE_DEVIATION:
				setRouteDeviation(ROUTE_DEVIATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DOOR_STATE:
				setDoorState(DOOR_STATE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__IN_PANIC:
				setInPanic(IN_PANIC_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_STOP_REQUESTED:
				setVehicleStopRequested(VEHICLE_STOP_REQUESTED_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__EXIT_SIDE:
				setExitSide(EXIT_SIDE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward(MOVING_DIRECTION_FORWARD_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_MODE:
				setVehicleMode(VEHICLE_MODE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SPEAKER_ACTIVE:
				setSpeakerActive(SPEAKER_ACTIVE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__STOP_INFORMATION_ACTIVE:
				setStopInformationActive(STOP_INFORMATION_ACTIVE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TRIP_STATE:
				setTripState(TRIP_STATE_EDEFAULT);
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
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_REF:
				return VEHICLE_REF_EDEFAULT == null ? vehicleRef != null : !VEHICLE_REF_EDEFAULT.equals(vehicleRef);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DEFAULT_LANGUAGE:
				return DEFAULT_LANGUAGE_EDEFAULT == null ? defaultLanguage != null : !DEFAULT_LANGUAGE_EDEFAULT.equals(defaultLanguage);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__CURRENT_STOP_INDEX:
				return currentStopIndex != CURRENT_STOP_INDEX_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__ROUTE_DEVIATION:
				return ROUTE_DEVIATION_EDEFAULT == null ? routeDeviation != null : !ROUTE_DEVIATION_EDEFAULT.equals(routeDeviation);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__DOOR_STATE:
				return DOOR_STATE_EDEFAULT == null ? doorState != null : !DOOR_STATE_EDEFAULT.equals(doorState);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__IN_PANIC:
				return inPanic != IN_PANIC_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_STOP_REQUESTED:
				return vehicleStopRequested != VEHICLE_STOP_REQUESTED_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__EXIT_SIDE:
				return EXIT_SIDE_EDEFAULT == null ? exitSide != null : !EXIT_SIDE_EDEFAULT.equals(exitSide);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__MOVING_DIRECTION_FORWARD:
				return movingDirectionForward != MOVING_DIRECTION_FORWARD_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__VEHICLE_MODE:
				return VEHICLE_MODE_EDEFAULT == null ? vehicleMode != null : !VEHICLE_MODE_EDEFAULT.equals(vehicleMode);
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__SPEAKER_ACTIVE:
				return speakerActive != SPEAKER_ACTIVE_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__STOP_INFORMATION_ACTIVE:
				return stopInformationActive != STOP_INFORMATION_ACTIVE_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_ALL_DATA__TRIP_STATE:
				return TRIP_STATE_EDEFAULT == null ? tripState != null : !TRIP_STATE_EDEFAULT.equals(tripState);
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
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", serviceOperation: ");
		result.append(serviceOperation);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", vehicleRef: ");
		result.append(vehicleRef);
		result.append(", defaultLanguage: ");
		result.append(defaultLanguage);
		result.append(", currentStopIndex: ");
		result.append(currentStopIndex);
		result.append(", routeDeviation: ");
		result.append(routeDeviation);
		result.append(", doorState: ");
		result.append(doorState);
		result.append(", inPanic: ");
		result.append(inPanic);
		result.append(", vehicleStopRequested: ");
		result.append(vehicleStopRequested);
		result.append(", exitSide: ");
		result.append(exitSide);
		result.append(", movingDirectionForward: ");
		result.append(movingDirectionForward);
		result.append(", vehicleMode: ");
		result.append(vehicleMode);
		result.append(", speakerActive: ");
		result.append(speakerActive);
		result.append(", stopInformationActive: ");
		result.append(stopInformationActive);
		result.append(", tripState: ");
		result.append(tripState);
		result.append(')');
		return result.toString();
	}

} //CustomerInfoAllDataImpl
