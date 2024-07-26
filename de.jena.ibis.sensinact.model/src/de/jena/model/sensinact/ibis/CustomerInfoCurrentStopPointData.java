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

import org.eclipse.emf.common.util.EList;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Info Current Stop Point Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getStopName <em>Stop Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getStopAlternativeName <em>Stop Alternative Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getArrivalScheduled <em>Arrival Scheduled</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getArrivalExpected <em>Arrival Expected</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getDepartureScheduled <em>Departure Scheduled</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getDepartureExpected <em>Departure Expected</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getRecordedArrivalTime <em>Recorded Arrival Time</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getDistanceToNextStop <em>Distance To Next Stop</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getFareZone <em>Fare Zone</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData()
 * @model
 * @generated
 */
@ProviderType
public interface CustomerInfoCurrentStopPointData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getServiceName <em>Service Name</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getServiceOperation <em>Service Operation</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant" required="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Stop Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Index</em>' attribute.
	 * @see #setStopIndex(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_StopIndex()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getStopIndex <em>Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Index</em>' attribute.
	 * @see #getStopIndex()
	 * @generated
	 */
	void setStopIndex(int value);

	/**
	 * Returns the value of the '<em><b>Stop Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Ref</em>' attribute.
	 * @see #setStopRef(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_StopRef()
	 * @model required="true"
	 * @generated
	 */
	String getStopRef();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getStopRef <em>Stop Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Ref</em>' attribute.
	 * @see #getStopRef()
	 * @generated
	 */
	void setStopRef(String value);

	/**
	 * Returns the value of the '<em><b>Stop Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Name</em>' attribute list.
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_StopName()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getStopName();

	/**
	 * Returns the value of the '<em><b>Stop Alternative Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Alternative Name</em>' attribute list.
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_StopAlternativeName()
	 * @model
	 * @generated
	 */
	EList<String> getStopAlternativeName();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Arrival Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Scheduled</em>' attribute.
	 * @see #setArrivalScheduled(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_ArrivalScheduled()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getArrivalScheduled();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getArrivalScheduled <em>Arrival Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Scheduled</em>' attribute.
	 * @see #getArrivalScheduled()
	 * @generated
	 */
	void setArrivalScheduled(Instant value);

	/**
	 * Returns the value of the '<em><b>Arrival Expected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Expected</em>' attribute.
	 * @see #setArrivalExpected(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_ArrivalExpected()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getArrivalExpected();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getArrivalExpected <em>Arrival Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Expected</em>' attribute.
	 * @see #getArrivalExpected()
	 * @generated
	 */
	void setArrivalExpected(Instant value);

	/**
	 * Returns the value of the '<em><b>Departure Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Scheduled</em>' attribute.
	 * @see #setDepartureScheduled(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_DepartureScheduled()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getDepartureScheduled();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getDepartureScheduled <em>Departure Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Scheduled</em>' attribute.
	 * @see #getDepartureScheduled()
	 * @generated
	 */
	void setDepartureScheduled(Instant value);

	/**
	 * Returns the value of the '<em><b>Departure Expected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Expected</em>' attribute.
	 * @see #setDepartureExpected(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_DepartureExpected()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getDepartureExpected();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getDepartureExpected <em>Departure Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Expected</em>' attribute.
	 * @see #getDepartureExpected()
	 * @generated
	 */
	void setDepartureExpected(Instant value);

	/**
	 * Returns the value of the '<em><b>Recorded Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Arrival Time</em>' attribute.
	 * @see #setRecordedArrivalTime(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_RecordedArrivalTime()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getRecordedArrivalTime();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getRecordedArrivalTime <em>Recorded Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Arrival Time</em>' attribute.
	 * @see #getRecordedArrivalTime()
	 * @generated
	 */
	void setRecordedArrivalTime(Instant value);

	/**
	 * Returns the value of the '<em><b>Distance To Next Stop</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance To Next Stop</em>' attribute.
	 * @see #setDistanceToNextStop(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_DistanceToNextStop()
	 * @model default="-1"
	 * @generated
	 */
	int getDistanceToNextStop();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentStopPointData#getDistanceToNextStop <em>Distance To Next Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance To Next Stop</em>' attribute.
	 * @see #getDistanceToNextStop()
	 * @generated
	 */
	void setDistanceToNextStop(int value);

	/**
	 * Returns the value of the '<em><b>Fare Zone</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Zone</em>' attribute list.
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentStopPointData_FareZone()
	 * @model
	 * @generated
	 */
	EList<String> getFareZone();

} // CustomerInfoCurrentStopPointData
