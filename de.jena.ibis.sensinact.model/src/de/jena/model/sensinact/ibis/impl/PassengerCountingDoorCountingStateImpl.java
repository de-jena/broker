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
import de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Counting Door Counting State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getDoorId <em>Door Id</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getDoorCountingType <em>Door Counting Type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getIn <em>In</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.PassengerCountingDoorCountingStateImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerCountingDoorCountingStateImpl extends ServiceImpl implements PassengerCountingDoorCountingState {
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
	 * The default value of the '{@link #getDoorId() <em>Door Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoorId() <em>Door Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorId()
	 * @generated
	 * @ordered
	 */
	protected String doorId = DOOR_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDoorCountingType() <em>Door Counting Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorCountingType()
	 * @generated
	 * @ordered
	 */
	protected static final String DOOR_COUNTING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoorCountingType() <em>Door Counting Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorCountingType()
	 * @generated
	 * @ordered
	 */
	protected String doorCountingType = DOOR_COUNTING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final int IN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected int in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected static final int OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected int out = OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerCountingDoorCountingStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.PASSENGER_COUNTING_DOOR_COUNTING_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoorId() {
		return doorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoorId(String newDoorId) {
		String oldDoorId = doorId;
		doorId = newDoorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_ID, oldDoorId, doorId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__EXIT_SIDE, oldExitSide, exitSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoorCountingType() {
		return doorCountingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoorCountingType(String newDoorCountingType) {
		String oldDoorCountingType = doorCountingType;
		doorCountingType = newDoorCountingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_COUNTING_TYPE, oldDoorCountingType, doorCountingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIn(int newIn) {
		int oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOut(int newOut) {
		int oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_ID:
				return getDoorId();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__EXIT_SIDE:
				return getExitSide();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_COUNTING_TYPE:
				return getDoorCountingType();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__IN:
				return getIn();
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__OUT:
				return getOut();
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
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_ID:
				setDoorId((String)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__EXIT_SIDE:
				setExitSide((String)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_COUNTING_TYPE:
				setDoorCountingType((String)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__IN:
				setIn((Integer)newValue);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__OUT:
				setOut((Integer)newValue);
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
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_ID:
				setDoorId(DOOR_ID_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__EXIT_SIDE:
				setExitSide(EXIT_SIDE_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_COUNTING_TYPE:
				setDoorCountingType(DOOR_COUNTING_TYPE_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__IN:
				setIn(IN_EDEFAULT);
				return;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__OUT:
				setOut(OUT_EDEFAULT);
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
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_ID:
				return DOOR_ID_EDEFAULT == null ? doorId != null : !DOOR_ID_EDEFAULT.equals(doorId);
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__EXIT_SIDE:
				return EXIT_SIDE_EDEFAULT == null ? exitSide != null : !EXIT_SIDE_EDEFAULT.equals(exitSide);
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__DOOR_COUNTING_TYPE:
				return DOOR_COUNTING_TYPE_EDEFAULT == null ? doorCountingType != null : !DOOR_COUNTING_TYPE_EDEFAULT.equals(doorCountingType);
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__IN:
				return in != IN_EDEFAULT;
			case IbisSensinactPackage.PASSENGER_COUNTING_DOOR_COUNTING_STATE__OUT:
				return out != OUT_EDEFAULT;
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
		result.append(", doorId: ");
		result.append(doorId);
		result.append(", exitSide: ");
		result.append(exitSide);
		result.append(", doorCountingType: ");
		result.append(doorCountingType);
		result.append(", in: ");
		result.append(in);
		result.append(", out: ");
		result.append(out);
		result.append(')');
		return result.toString();
	}

} //PassengerCountingDoorCountingStateImpl
