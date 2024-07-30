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

import de.jena.model.sensinact.ibis.CustomerInfoTripData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Info Trip Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getTripRef <em>Trip Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getLocationState <em>Location State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getTimetableDelay <em>Timetable Delay</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getRouteDirection <em>Route Direction</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getPathDestinationNumber <em>Path Destination Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg <em>Additional Text Msg</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg1 <em>Additional Text Msg1</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg2 <em>Additional Text Msg2</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg3 <em>Additional Text Msg3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg4 <em>Additional Text Msg4</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg5 <em>Additional Text Msg5</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg6 <em>Additional Text Msg6</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg7 <em>Additional Text Msg7</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg8 <em>Additional Text Msg8</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoTripDataImpl#getAdditionalTextMsg9 <em>Additional Text Msg9</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInfoTripDataImpl extends ServiceImpl implements CustomerInfoTripData {
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
	 * The default value of the '{@link #getTripRef() <em>Trip Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripRef() <em>Trip Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripRef()
	 * @generated
	 * @ordered
	 */
	protected String tripRef = TRIP_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationState() <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationState()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationState() <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationState()
	 * @generated
	 * @ordered
	 */
	protected String locationState = LOCATION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimetableDelay() <em>Timetable Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMETABLE_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimetableDelay() <em>Timetable Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableDelay()
	 * @generated
	 * @ordered
	 */
	protected int timetableDelay = TIMETABLE_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteDirection() <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteDirection() <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDirection()
	 * @generated
	 * @ordered
	 */
	protected String routeDirection = ROUTE_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunNumber() <em>Run Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int RUN_NUMBER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getRunNumber() <em>Run Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunNumber()
	 * @generated
	 * @ordered
	 */
	protected int runNumber = RUN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PATTERN_NUMBER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPatternNumber() <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternNumber()
	 * @generated
	 * @ordered
	 */
	protected int patternNumber = PATTERN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathDestinationNumber() <em>Path Destination Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathDestinationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PATH_DESTINATION_NUMBER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPathDestinationNumber() <em>Path Destination Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathDestinationNumber()
	 * @generated
	 * @ordered
	 */
	protected int pathDestinationNumber = PATH_DESTINATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg() <em>Additional Text Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg() <em>Additional Text Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg = ADDITIONAL_TEXT_MSG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg1() <em>Additional Text Msg1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg1() <em>Additional Text Msg1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg1()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg1 = ADDITIONAL_TEXT_MSG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg2() <em>Additional Text Msg2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg2() <em>Additional Text Msg2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg2()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg2 = ADDITIONAL_TEXT_MSG2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg3() <em>Additional Text Msg3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg3()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg3() <em>Additional Text Msg3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg3()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg3 = ADDITIONAL_TEXT_MSG3_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg4() <em>Additional Text Msg4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg4()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg4() <em>Additional Text Msg4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg4()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg4 = ADDITIONAL_TEXT_MSG4_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg5() <em>Additional Text Msg5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg5()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg5() <em>Additional Text Msg5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg5()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg5 = ADDITIONAL_TEXT_MSG5_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg6() <em>Additional Text Msg6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg6()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg6() <em>Additional Text Msg6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg6()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg6 = ADDITIONAL_TEXT_MSG6_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg7() <em>Additional Text Msg7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg7()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG7_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg7() <em>Additional Text Msg7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg7()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg7 = ADDITIONAL_TEXT_MSG7_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg8() <em>Additional Text Msg8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg8()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg8() <em>Additional Text Msg8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg8()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg8 = ADDITIONAL_TEXT_MSG8_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalTextMsg9() <em>Additional Text Msg9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg9()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_TEXT_MSG9_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalTextMsg9() <em>Additional Text Msg9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalTextMsg9()
	 * @generated
	 * @ordered
	 */
	protected String additionalTextMsg9 = ADDITIONAL_TEXT_MSG9_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInfoTripDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.CUSTOMER_INFO_TRIP_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__VEHICLE_REF, oldVehicleRef, vehicleRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__DEFAULT_LANGUAGE, oldDefaultLanguage, defaultLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__CURRENT_STOP_INDEX, oldCurrentStopIndex, currentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTripRef() {
		return tripRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripRef(String newTripRef) {
		String oldTripRef = tripRef;
		tripRef = newTripRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TRIP_REF, oldTripRef, tripRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationState() {
		return locationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationState(String newLocationState) {
		String oldLocationState = locationState;
		locationState = newLocationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__LOCATION_STATE, oldLocationState, locationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimetableDelay() {
		return timetableDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimetableDelay(int newTimetableDelay) {
		int oldTimetableDelay = timetableDelay;
		timetableDelay = newTimetableDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMETABLE_DELAY, oldTimetableDelay, timetableDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteDirection() {
		return routeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteDirection(String newRouteDirection) {
		String oldRouteDirection = routeDirection;
		routeDirection = newRouteDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ROUTE_DIRECTION, oldRouteDirection, routeDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRunNumber() {
		return runNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunNumber(int newRunNumber) {
		int oldRunNumber = runNumber;
		runNumber = newRunNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__RUN_NUMBER, oldRunNumber, runNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPatternNumber() {
		return patternNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternNumber(int newPatternNumber) {
		int oldPatternNumber = patternNumber;
		patternNumber = newPatternNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATTERN_NUMBER, oldPatternNumber, patternNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPathDestinationNumber() {
		return pathDestinationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathDestinationNumber(int newPathDestinationNumber) {
		int oldPathDestinationNumber = pathDestinationNumber;
		pathDestinationNumber = newPathDestinationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATH_DESTINATION_NUMBER, oldPathDestinationNumber, pathDestinationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg() {
		return additionalTextMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg(String newAdditionalTextMsg) {
		String oldAdditionalTextMsg = additionalTextMsg;
		additionalTextMsg = newAdditionalTextMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG, oldAdditionalTextMsg, additionalTextMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg1() {
		return additionalTextMsg1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg1(String newAdditionalTextMsg1) {
		String oldAdditionalTextMsg1 = additionalTextMsg1;
		additionalTextMsg1 = newAdditionalTextMsg1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG1, oldAdditionalTextMsg1, additionalTextMsg1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg2() {
		return additionalTextMsg2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg2(String newAdditionalTextMsg2) {
		String oldAdditionalTextMsg2 = additionalTextMsg2;
		additionalTextMsg2 = newAdditionalTextMsg2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG2, oldAdditionalTextMsg2, additionalTextMsg2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg3() {
		return additionalTextMsg3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg3(String newAdditionalTextMsg3) {
		String oldAdditionalTextMsg3 = additionalTextMsg3;
		additionalTextMsg3 = newAdditionalTextMsg3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG3, oldAdditionalTextMsg3, additionalTextMsg3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg4() {
		return additionalTextMsg4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg4(String newAdditionalTextMsg4) {
		String oldAdditionalTextMsg4 = additionalTextMsg4;
		additionalTextMsg4 = newAdditionalTextMsg4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG4, oldAdditionalTextMsg4, additionalTextMsg4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg5() {
		return additionalTextMsg5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg5(String newAdditionalTextMsg5) {
		String oldAdditionalTextMsg5 = additionalTextMsg5;
		additionalTextMsg5 = newAdditionalTextMsg5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG5, oldAdditionalTextMsg5, additionalTextMsg5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg6() {
		return additionalTextMsg6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg6(String newAdditionalTextMsg6) {
		String oldAdditionalTextMsg6 = additionalTextMsg6;
		additionalTextMsg6 = newAdditionalTextMsg6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG6, oldAdditionalTextMsg6, additionalTextMsg6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg7() {
		return additionalTextMsg7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg7(String newAdditionalTextMsg7) {
		String oldAdditionalTextMsg7 = additionalTextMsg7;
		additionalTextMsg7 = newAdditionalTextMsg7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG7, oldAdditionalTextMsg7, additionalTextMsg7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg8() {
		return additionalTextMsg8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg8(String newAdditionalTextMsg8) {
		String oldAdditionalTextMsg8 = additionalTextMsg8;
		additionalTextMsg8 = newAdditionalTextMsg8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG8, oldAdditionalTextMsg8, additionalTextMsg8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalTextMsg9() {
		return additionalTextMsg9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalTextMsg9(String newAdditionalTextMsg9) {
		String oldAdditionalTextMsg9 = additionalTextMsg9;
		additionalTextMsg9 = newAdditionalTextMsg9;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG9, oldAdditionalTextMsg9, additionalTextMsg9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__VEHICLE_REF:
				return getVehicleRef();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__DEFAULT_LANGUAGE:
				return getDefaultLanguage();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TRIP_REF:
				return getTripRef();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__LOCATION_STATE:
				return getLocationState();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMETABLE_DELAY:
				return getTimetableDelay();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ROUTE_DIRECTION:
				return getRouteDirection();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__RUN_NUMBER:
				return getRunNumber();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATTERN_NUMBER:
				return getPatternNumber();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATH_DESTINATION_NUMBER:
				return getPathDestinationNumber();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG:
				return getAdditionalTextMsg();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG1:
				return getAdditionalTextMsg1();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG2:
				return getAdditionalTextMsg2();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG3:
				return getAdditionalTextMsg3();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG4:
				return getAdditionalTextMsg4();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG5:
				return getAdditionalTextMsg5();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG6:
				return getAdditionalTextMsg6();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG7:
				return getAdditionalTextMsg7();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG8:
				return getAdditionalTextMsg8();
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG9:
				return getAdditionalTextMsg9();
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
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__VEHICLE_REF:
				setVehicleRef((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TRIP_REF:
				setTripRef((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__LOCATION_STATE:
				setLocationState((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMETABLE_DELAY:
				setTimetableDelay((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ROUTE_DIRECTION:
				setRouteDirection((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__RUN_NUMBER:
				setRunNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATTERN_NUMBER:
				setPatternNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATH_DESTINATION_NUMBER:
				setPathDestinationNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG:
				setAdditionalTextMsg((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG1:
				setAdditionalTextMsg1((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG2:
				setAdditionalTextMsg2((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG3:
				setAdditionalTextMsg3((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG4:
				setAdditionalTextMsg4((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG5:
				setAdditionalTextMsg5((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG6:
				setAdditionalTextMsg6((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG7:
				setAdditionalTextMsg7((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG8:
				setAdditionalTextMsg8((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG9:
				setAdditionalTextMsg9((String)newValue);
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
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__VEHICLE_REF:
				setVehicleRef(VEHICLE_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__DEFAULT_LANGUAGE:
				setDefaultLanguage(DEFAULT_LANGUAGE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex(CURRENT_STOP_INDEX_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TRIP_REF:
				setTripRef(TRIP_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__LOCATION_STATE:
				setLocationState(LOCATION_STATE_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMETABLE_DELAY:
				setTimetableDelay(TIMETABLE_DELAY_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ROUTE_DIRECTION:
				setRouteDirection(ROUTE_DIRECTION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__RUN_NUMBER:
				setRunNumber(RUN_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATTERN_NUMBER:
				setPatternNumber(PATTERN_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATH_DESTINATION_NUMBER:
				setPathDestinationNumber(PATH_DESTINATION_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG:
				setAdditionalTextMsg(ADDITIONAL_TEXT_MSG_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG1:
				setAdditionalTextMsg1(ADDITIONAL_TEXT_MSG1_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG2:
				setAdditionalTextMsg2(ADDITIONAL_TEXT_MSG2_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG3:
				setAdditionalTextMsg3(ADDITIONAL_TEXT_MSG3_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG4:
				setAdditionalTextMsg4(ADDITIONAL_TEXT_MSG4_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG5:
				setAdditionalTextMsg5(ADDITIONAL_TEXT_MSG5_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG6:
				setAdditionalTextMsg6(ADDITIONAL_TEXT_MSG6_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG7:
				setAdditionalTextMsg7(ADDITIONAL_TEXT_MSG7_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG8:
				setAdditionalTextMsg8(ADDITIONAL_TEXT_MSG8_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG9:
				setAdditionalTextMsg9(ADDITIONAL_TEXT_MSG9_EDEFAULT);
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
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__VEHICLE_REF:
				return VEHICLE_REF_EDEFAULT == null ? vehicleRef != null : !VEHICLE_REF_EDEFAULT.equals(vehicleRef);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__DEFAULT_LANGUAGE:
				return DEFAULT_LANGUAGE_EDEFAULT == null ? defaultLanguage != null : !DEFAULT_LANGUAGE_EDEFAULT.equals(defaultLanguage);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__CURRENT_STOP_INDEX:
				return currentStopIndex != CURRENT_STOP_INDEX_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TRIP_REF:
				return TRIP_REF_EDEFAULT == null ? tripRef != null : !TRIP_REF_EDEFAULT.equals(tripRef);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__LOCATION_STATE:
				return LOCATION_STATE_EDEFAULT == null ? locationState != null : !LOCATION_STATE_EDEFAULT.equals(locationState);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__TIMETABLE_DELAY:
				return timetableDelay != TIMETABLE_DELAY_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ROUTE_DIRECTION:
				return ROUTE_DIRECTION_EDEFAULT == null ? routeDirection != null : !ROUTE_DIRECTION_EDEFAULT.equals(routeDirection);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__RUN_NUMBER:
				return runNumber != RUN_NUMBER_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATTERN_NUMBER:
				return patternNumber != PATTERN_NUMBER_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__PATH_DESTINATION_NUMBER:
				return pathDestinationNumber != PATH_DESTINATION_NUMBER_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG:
				return ADDITIONAL_TEXT_MSG_EDEFAULT == null ? additionalTextMsg != null : !ADDITIONAL_TEXT_MSG_EDEFAULT.equals(additionalTextMsg);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG1:
				return ADDITIONAL_TEXT_MSG1_EDEFAULT == null ? additionalTextMsg1 != null : !ADDITIONAL_TEXT_MSG1_EDEFAULT.equals(additionalTextMsg1);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG2:
				return ADDITIONAL_TEXT_MSG2_EDEFAULT == null ? additionalTextMsg2 != null : !ADDITIONAL_TEXT_MSG2_EDEFAULT.equals(additionalTextMsg2);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG3:
				return ADDITIONAL_TEXT_MSG3_EDEFAULT == null ? additionalTextMsg3 != null : !ADDITIONAL_TEXT_MSG3_EDEFAULT.equals(additionalTextMsg3);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG4:
				return ADDITIONAL_TEXT_MSG4_EDEFAULT == null ? additionalTextMsg4 != null : !ADDITIONAL_TEXT_MSG4_EDEFAULT.equals(additionalTextMsg4);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG5:
				return ADDITIONAL_TEXT_MSG5_EDEFAULT == null ? additionalTextMsg5 != null : !ADDITIONAL_TEXT_MSG5_EDEFAULT.equals(additionalTextMsg5);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG6:
				return ADDITIONAL_TEXT_MSG6_EDEFAULT == null ? additionalTextMsg6 != null : !ADDITIONAL_TEXT_MSG6_EDEFAULT.equals(additionalTextMsg6);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG7:
				return ADDITIONAL_TEXT_MSG7_EDEFAULT == null ? additionalTextMsg7 != null : !ADDITIONAL_TEXT_MSG7_EDEFAULT.equals(additionalTextMsg7);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG8:
				return ADDITIONAL_TEXT_MSG8_EDEFAULT == null ? additionalTextMsg8 != null : !ADDITIONAL_TEXT_MSG8_EDEFAULT.equals(additionalTextMsg8);
			case IbisSensinactPackage.CUSTOMER_INFO_TRIP_DATA__ADDITIONAL_TEXT_MSG9:
				return ADDITIONAL_TEXT_MSG9_EDEFAULT == null ? additionalTextMsg9 != null : !ADDITIONAL_TEXT_MSG9_EDEFAULT.equals(additionalTextMsg9);
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
		result.append(", tripRef: ");
		result.append(tripRef);
		result.append(", locationState: ");
		result.append(locationState);
		result.append(", timetableDelay: ");
		result.append(timetableDelay);
		result.append(", routeDirection: ");
		result.append(routeDirection);
		result.append(", runNumber: ");
		result.append(runNumber);
		result.append(", patternNumber: ");
		result.append(patternNumber);
		result.append(", pathDestinationNumber: ");
		result.append(pathDestinationNumber);
		result.append(", additionalTextMsg: ");
		result.append(additionalTextMsg);
		result.append(", additionalTextMsg1: ");
		result.append(additionalTextMsg1);
		result.append(", additionalTextMsg2: ");
		result.append(additionalTextMsg2);
		result.append(", additionalTextMsg3: ");
		result.append(additionalTextMsg3);
		result.append(", additionalTextMsg4: ");
		result.append(additionalTextMsg4);
		result.append(", additionalTextMsg5: ");
		result.append(additionalTextMsg5);
		result.append(", additionalTextMsg6: ");
		result.append(additionalTextMsg6);
		result.append(", additionalTextMsg7: ");
		result.append(additionalTextMsg7);
		result.append(", additionalTextMsg8: ");
		result.append(additionalTextMsg8);
		result.append(", additionalTextMsg9: ");
		result.append(additionalTextMsg9);
		result.append(')');
		return result.toString();
	}

} //CustomerInfoTripDataImpl
