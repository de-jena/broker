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
import de.jena.model.sensinact.ibis.TicketValidationVehicleData;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticket Validation Vehicle Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#isMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationVehicleDataImpl#getDriverNumber <em>Driver Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TicketValidationVehicleDataImpl extends ServiceImpl implements TicketValidationVehicleData {
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
	 * The default value of the '{@link #getDriverNumber() <em>Driver Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriverNumber() <em>Driver Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverNumber()
	 * @generated
	 * @ordered
	 */
	protected String driverNumber = DRIVER_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketValidationVehicleDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.TICKET_VALIDATION_VEHICLE_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_REF, oldVehicleRef, vehicleRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__ROUTE_DEVIATION, oldRouteDeviation, routeDeviation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DOOR_STATE, oldDoorState, doorState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__MOVING_DIRECTION_FORWARD, oldMovingDirectionForward, movingDirectionForward));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_MODE, oldVehicleMode, vehicleMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriverNumber() {
		return driverNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverNumber(String newDriverNumber) {
		String oldDriverNumber = driverNumber;
		driverNumber = newDriverNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DRIVER_NUMBER, oldDriverNumber, driverNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_REF:
				return getVehicleRef();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__ROUTE_DEVIATION:
				return getRouteDeviation();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DOOR_STATE:
				return getDoorState();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				return isMovingDirectionForward();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_MODE:
				return getVehicleMode();
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DRIVER_NUMBER:
				return getDriverNumber();
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
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_REF:
				setVehicleRef((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__ROUTE_DEVIATION:
				setRouteDeviation((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DOOR_STATE:
				setDoorState((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward((Boolean)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_MODE:
				setVehicleMode((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DRIVER_NUMBER:
				setDriverNumber((String)newValue);
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
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_REF:
				setVehicleRef(VEHICLE_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__ROUTE_DEVIATION:
				setRouteDeviation(ROUTE_DEVIATION_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DOOR_STATE:
				setDoorState(DOOR_STATE_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				setMovingDirectionForward(MOVING_DIRECTION_FORWARD_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_MODE:
				setVehicleMode(VEHICLE_MODE_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DRIVER_NUMBER:
				setDriverNumber(DRIVER_NUMBER_EDEFAULT);
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
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_REF:
				return VEHICLE_REF_EDEFAULT == null ? vehicleRef != null : !VEHICLE_REF_EDEFAULT.equals(vehicleRef);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__ROUTE_DEVIATION:
				return ROUTE_DEVIATION_EDEFAULT == null ? routeDeviation != null : !ROUTE_DEVIATION_EDEFAULT.equals(routeDeviation);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DOOR_STATE:
				return DOOR_STATE_EDEFAULT == null ? doorState != null : !DOOR_STATE_EDEFAULT.equals(doorState);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__MOVING_DIRECTION_FORWARD:
				return movingDirectionForward != MOVING_DIRECTION_FORWARD_EDEFAULT;
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__VEHICLE_MODE:
				return VEHICLE_MODE_EDEFAULT == null ? vehicleMode != null : !VEHICLE_MODE_EDEFAULT.equals(vehicleMode);
			case IbisSensinactPackage.TICKET_VALIDATION_VEHICLE_DATA__DRIVER_NUMBER:
				return DRIVER_NUMBER_EDEFAULT == null ? driverNumber != null : !DRIVER_NUMBER_EDEFAULT.equals(driverNumber);
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
		result.append(", routeDeviation: ");
		result.append(routeDeviation);
		result.append(", doorState: ");
		result.append(doorState);
		result.append(", movingDirectionForward: ");
		result.append(movingDirectionForward);
		result.append(", vehicleMode: ");
		result.append(vehicleMode);
		result.append(", driverNumber: ");
		result.append(driverNumber);
		result.append(')');
		return result.toString();
	}

} //TicketValidationVehicleDataImpl
