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
 * A representation of the model object '<em><b>Passenger Counting Door Counting State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getDoorId <em>Door Id</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getDoorCountingType <em>Door Counting Type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getIn <em>In</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState()
 * @model
 * @generated
 */
@ProviderType
public interface PassengerCountingDoorCountingState extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getServiceName <em>Service Name</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getServiceOperation <em>Service Operation</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant" required="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Door Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Id</em>' attribute.
	 * @see #setDoorId(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_DoorId()
	 * @model required="true"
	 * @generated
	 */
	String getDoorId();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getDoorId <em>Door Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Id</em>' attribute.
	 * @see #getDoorId()
	 * @generated
	 */
	void setDoorId(String value);

	/**
	 * Returns the value of the '<em><b>Exit Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Side</em>' attribute.
	 * @see #setExitSide(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_ExitSide()
	 * @model
	 * @generated
	 */
	String getExitSide();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getExitSide <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Side</em>' attribute.
	 * @see #getExitSide()
	 * @generated
	 */
	void setExitSide(String value);

	/**
	 * Returns the value of the '<em><b>Door Counting Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Counting Type</em>' attribute.
	 * @see #setDoorCountingType(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_DoorCountingType()
	 * @model
	 * @generated
	 */
	String getDoorCountingType();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getDoorCountingType <em>Door Counting Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Counting Type</em>' attribute.
	 * @see #getDoorCountingType()
	 * @generated
	 */
	void setDoorCountingType(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_In()
	 * @model
	 * @generated
	 */
	int getIn();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(int value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' attribute.
	 * @see #setOut(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getPassengerCountingDoorCountingState_Out()
	 * @model
	 * @generated
	 */
	int getOut();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.PassengerCountingDoorCountingState#getOut <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' attribute.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(int value);

} // PassengerCountingDoorCountingState
