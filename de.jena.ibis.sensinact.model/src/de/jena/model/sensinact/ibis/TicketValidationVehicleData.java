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
package de.jena.model.sensinact.ibis;

import java.time.Instant;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket Validation Vehicle Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#isMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getDriverNumber <em>Driver Number</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData()
 * @model
 * @generated
 */
@ProviderType
public interface TicketValidationVehicleData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Operation</em>' attribute.
	 * @see #setServiceOperation(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getServiceOperation <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Operation</em>' attribute.
	 * @see #getServiceOperation()
	 * @generated
	 */
	void setServiceOperation(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant" required="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Vehicle Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Ref</em>' attribute.
	 * @see #setVehicleRef(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_VehicleRef()
	 * @model required="true"
	 * @generated
	 */
	String getVehicleRef();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getVehicleRef <em>Vehicle Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Ref</em>' attribute.
	 * @see #getVehicleRef()
	 * @generated
	 */
	void setVehicleRef(String value);

	/**
	 * Returns the value of the '<em><b>Route Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Deviation</em>' attribute.
	 * @see #setRouteDeviation(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_RouteDeviation()
	 * @model
	 * @generated
	 */
	String getRouteDeviation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getRouteDeviation <em>Route Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Deviation</em>' attribute.
	 * @see #getRouteDeviation()
	 * @generated
	 */
	void setRouteDeviation(String value);

	/**
	 * Returns the value of the '<em><b>Door State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door State</em>' attribute.
	 * @see #setDoorState(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_DoorState()
	 * @model
	 * @generated
	 */
	String getDoorState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getDoorState <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door State</em>' attribute.
	 * @see #getDoorState()
	 * @generated
	 */
	void setDoorState(String value);

	/**
	 * Returns the value of the '<em><b>Moving Direction Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moving Direction Forward</em>' attribute.
	 * @see #setMovingDirectionForward(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_MovingDirectionForward()
	 * @model
	 * @generated
	 */
	boolean isMovingDirectionForward();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#isMovingDirectionForward <em>Moving Direction Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving Direction Forward</em>' attribute.
	 * @see #isMovingDirectionForward()
	 * @generated
	 */
	void setMovingDirectionForward(boolean value);

	/**
	 * Returns the value of the '<em><b>Vehicle Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Mode</em>' attribute.
	 * @see #setVehicleMode(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_VehicleMode()
	 * @model
	 * @generated
	 */
	String getVehicleMode();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getVehicleMode <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Mode</em>' attribute.
	 * @see #getVehicleMode()
	 * @generated
	 */
	void setVehicleMode(String value);

	/**
	 * Returns the value of the '<em><b>Driver Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Number</em>' attribute.
	 * @see #setDriverNumber(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationVehicleData_DriverNumber()
	 * @model
	 * @generated
	 */
	String getDriverNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationVehicleData#getDriverNumber <em>Driver Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Number</em>' attribute.
	 * @see #getDriverNumber()
	 * @generated
	 */
	void setDriverNumber(String value);

} // TicketValidationVehicleData
