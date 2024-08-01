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

import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Info Current Stop Point Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getArrivalExpected <em>Arrival Expected</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getDepartureExpected <em>Departure Expected</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getRecordedArrivalTime <em>Recorded Arrival Time</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getDistanceToNextStop <em>Distance To Next Stop</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopPointDataImpl#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInfoCurrentStopPointDataImpl extends ServiceImpl implements CustomerInfoCurrentStopPointData {
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
	 * The default value of the '{@link #getStopIndex() <em>Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int STOP_INDEX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getStopIndex() <em>Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopIndex()
	 * @generated
	 * @ordered
	 */
	protected int stopIndex = STOP_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopRef() <em>Stop Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRef()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopRef() <em>Stop Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRef()
	 * @generated
	 * @ordered
	 */
	protected String stopRef = STOP_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStopName() <em>Stop Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stopName;

	/**
	 * The cached value of the '{@link #getStopAlternativeName() <em>Stop Alternative Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopAlternativeName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stopAlternativeName;

	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalScheduled() <em>Arrival Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalScheduled()
	 * @generated
	 * @ordered
	 */
	protected static final Instant ARRIVAL_SCHEDULED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalScheduled() <em>Arrival Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalScheduled()
	 * @generated
	 * @ordered
	 */
	protected Instant arrivalScheduled = ARRIVAL_SCHEDULED_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalExpected() <em>Arrival Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalExpected()
	 * @generated
	 * @ordered
	 */
	protected static final Instant ARRIVAL_EXPECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalExpected() <em>Arrival Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalExpected()
	 * @generated
	 * @ordered
	 */
	protected Instant arrivalExpected = ARRIVAL_EXPECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartureScheduled() <em>Departure Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureScheduled()
	 * @generated
	 * @ordered
	 */
	protected static final Instant DEPARTURE_SCHEDULED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartureScheduled() <em>Departure Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureScheduled()
	 * @generated
	 * @ordered
	 */
	protected Instant departureScheduled = DEPARTURE_SCHEDULED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartureExpected() <em>Departure Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureExpected()
	 * @generated
	 * @ordered
	 */
	protected static final Instant DEPARTURE_EXPECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartureExpected() <em>Departure Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureExpected()
	 * @generated
	 * @ordered
	 */
	protected Instant departureExpected = DEPARTURE_EXPECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordedArrivalTime() <em>Recorded Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final Instant RECORDED_ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordedArrivalTime() <em>Recorded Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected Instant recordedArrivalTime = RECORDED_ARRIVAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceToNextStop() <em>Distance To Next Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceToNextStop()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_TO_NEXT_STOP_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDistanceToNextStop() <em>Distance To Next Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceToNextStop()
	 * @generated
	 * @ordered
	 */
	protected int distanceToNextStop = DISTANCE_TO_NEXT_STOP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFareZone() <em>Fare Zone</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareZone()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fareZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInfoCurrentStopPointDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStopIndex() {
		return stopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopIndex(int newStopIndex) {
		int oldStopIndex = stopIndex;
		stopIndex = newStopIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_INDEX, oldStopIndex, stopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStopRef() {
		return stopRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopRef(String newStopRef) {
		String oldStopRef = stopRef;
		stopRef = newStopRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_REF, oldStopRef, stopRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStopName() {
		if (stopName == null) {
			stopName = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_NAME);
		}
		return stopName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStopAlternativeName() {
		if (stopAlternativeName == null) {
			stopAlternativeName = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_ALTERNATIVE_NAME);
		}
		return stopAlternativeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getArrivalScheduled() {
		return arrivalScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrivalScheduled(Instant newArrivalScheduled) {
		Instant oldArrivalScheduled = arrivalScheduled;
		arrivalScheduled = newArrivalScheduled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_SCHEDULED, oldArrivalScheduled, arrivalScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getArrivalExpected() {
		return arrivalExpected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrivalExpected(Instant newArrivalExpected) {
		Instant oldArrivalExpected = arrivalExpected;
		arrivalExpected = newArrivalExpected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_EXPECTED, oldArrivalExpected, arrivalExpected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getDepartureScheduled() {
		return departureScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartureScheduled(Instant newDepartureScheduled) {
		Instant oldDepartureScheduled = departureScheduled;
		departureScheduled = newDepartureScheduled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_SCHEDULED, oldDepartureScheduled, departureScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getDepartureExpected() {
		return departureExpected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartureExpected(Instant newDepartureExpected) {
		Instant oldDepartureExpected = departureExpected;
		departureExpected = newDepartureExpected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_EXPECTED, oldDepartureExpected, departureExpected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getRecordedArrivalTime() {
		return recordedArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordedArrivalTime(Instant newRecordedArrivalTime) {
		Instant oldRecordedArrivalTime = recordedArrivalTime;
		recordedArrivalTime = newRecordedArrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__RECORDED_ARRIVAL_TIME, oldRecordedArrivalTime, recordedArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDistanceToNextStop() {
		return distanceToNextStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistanceToNextStop(int newDistanceToNextStop) {
		int oldDistanceToNextStop = distanceToNextStop;
		distanceToNextStop = newDistanceToNextStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DISTANCE_TO_NEXT_STOP, oldDistanceToNextStop, distanceToNextStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFareZone() {
		if (fareZone == null) {
			fareZone = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__FARE_ZONE);
		}
		return fareZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_INDEX:
				return getStopIndex();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_REF:
				return getStopRef();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_NAME:
				return getStopName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_ALTERNATIVE_NAME:
				return getStopAlternativeName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__PLATFORM:
				return getPlatform();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_SCHEDULED:
				return getArrivalScheduled();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_EXPECTED:
				return getArrivalExpected();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_SCHEDULED:
				return getDepartureScheduled();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_EXPECTED:
				return getDepartureExpected();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__RECORDED_ARRIVAL_TIME:
				return getRecordedArrivalTime();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DISTANCE_TO_NEXT_STOP:
				return getDistanceToNextStop();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__FARE_ZONE:
				return getFareZone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_INDEX:
				setStopIndex((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_REF:
				setStopRef((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_NAME:
				getStopName().clear();
				getStopName().addAll((Collection<? extends String>)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				getStopAlternativeName().addAll((Collection<? extends String>)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__PLATFORM:
				setPlatform((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_SCHEDULED:
				setArrivalScheduled((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_EXPECTED:
				setArrivalExpected((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_SCHEDULED:
				setDepartureScheduled((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_EXPECTED:
				setDepartureExpected((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__RECORDED_ARRIVAL_TIME:
				setRecordedArrivalTime((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DISTANCE_TO_NEXT_STOP:
				setDistanceToNextStop((Integer)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__FARE_ZONE:
				getFareZone().clear();
				getFareZone().addAll((Collection<? extends String>)newValue);
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_INDEX:
				setStopIndex(STOP_INDEX_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_REF:
				setStopRef(STOP_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_NAME:
				getStopName().clear();
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_ALTERNATIVE_NAME:
				getStopAlternativeName().clear();
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_SCHEDULED:
				setArrivalScheduled(ARRIVAL_SCHEDULED_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_EXPECTED:
				setArrivalExpected(ARRIVAL_EXPECTED_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_SCHEDULED:
				setDepartureScheduled(DEPARTURE_SCHEDULED_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_EXPECTED:
				setDepartureExpected(DEPARTURE_EXPECTED_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__RECORDED_ARRIVAL_TIME:
				setRecordedArrivalTime(RECORDED_ARRIVAL_TIME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DISTANCE_TO_NEXT_STOP:
				setDistanceToNextStop(DISTANCE_TO_NEXT_STOP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__FARE_ZONE:
				getFareZone().clear();
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_INDEX:
				return stopIndex != STOP_INDEX_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_REF:
				return STOP_REF_EDEFAULT == null ? stopRef != null : !STOP_REF_EDEFAULT.equals(stopRef);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_NAME:
				return stopName != null && !stopName.isEmpty();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__STOP_ALTERNATIVE_NAME:
				return stopAlternativeName != null && !stopAlternativeName.isEmpty();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_SCHEDULED:
				return ARRIVAL_SCHEDULED_EDEFAULT == null ? arrivalScheduled != null : !ARRIVAL_SCHEDULED_EDEFAULT.equals(arrivalScheduled);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__ARRIVAL_EXPECTED:
				return ARRIVAL_EXPECTED_EDEFAULT == null ? arrivalExpected != null : !ARRIVAL_EXPECTED_EDEFAULT.equals(arrivalExpected);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_SCHEDULED:
				return DEPARTURE_SCHEDULED_EDEFAULT == null ? departureScheduled != null : !DEPARTURE_SCHEDULED_EDEFAULT.equals(departureScheduled);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DEPARTURE_EXPECTED:
				return DEPARTURE_EXPECTED_EDEFAULT == null ? departureExpected != null : !DEPARTURE_EXPECTED_EDEFAULT.equals(departureExpected);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__RECORDED_ARRIVAL_TIME:
				return RECORDED_ARRIVAL_TIME_EDEFAULT == null ? recordedArrivalTime != null : !RECORDED_ARRIVAL_TIME_EDEFAULT.equals(recordedArrivalTime);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__DISTANCE_TO_NEXT_STOP:
				return distanceToNextStop != DISTANCE_TO_NEXT_STOP_EDEFAULT;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_POINT_DATA__FARE_ZONE:
				return fareZone != null && !fareZone.isEmpty();
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
		result.append(", stopIndex: ");
		result.append(stopIndex);
		result.append(", stopRef: ");
		result.append(stopRef);
		result.append(", stopName: ");
		result.append(stopName);
		result.append(", stopAlternativeName: ");
		result.append(stopAlternativeName);
		result.append(", platform: ");
		result.append(platform);
		result.append(", arrivalScheduled: ");
		result.append(arrivalScheduled);
		result.append(", arrivalExpected: ");
		result.append(arrivalExpected);
		result.append(", departureScheduled: ");
		result.append(departureScheduled);
		result.append(", departureExpected: ");
		result.append(departureExpected);
		result.append(", recordedArrivalTime: ");
		result.append(recordedArrivalTime);
		result.append(", distanceToNextStop: ");
		result.append(distanceToNextStop);
		result.append(", fareZone: ");
		result.append(fareZone);
		result.append(')');
		return result.toString();
	}

} //CustomerInfoCurrentStopPointDataImpl
