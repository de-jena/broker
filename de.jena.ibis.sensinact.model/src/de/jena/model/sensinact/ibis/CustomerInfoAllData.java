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
 * A representation of the model object '<em><b>Customer Info All Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getRouteDeviation <em>Route Deviation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getDoorState <em>Door State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isInPanic <em>In Panic</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isVehicleStopRequested <em>Vehicle Stop Requested</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getExitSide <em>Exit Side</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isMovingDirectionForward <em>Moving Direction Forward</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getVehicleMode <em>Vehicle Mode</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isSpeakerActive <em>Speaker Active</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isStopInformationActive <em>Stop Information Active</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getTripState <em>Trip State</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData()
 * @model
 * @generated
 */
@ProviderType
public interface CustomerInfoAllData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getServiceName <em>Service Name</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getServiceOperation <em>Service Operation</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant" required="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_VehicleRef()
	 * @model required="true"
	 * @generated
	 */
	String getVehicleRef();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getVehicleRef <em>Vehicle Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Ref</em>' attribute.
	 * @see #getVehicleRef()
	 * @generated
	 */
	void setVehicleRef(String value);

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Language</em>' attribute.
	 * @see #setDefaultLanguage(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_DefaultLanguage()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultLanguage();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getDefaultLanguage <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Language</em>' attribute.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Current Stop Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Stop Index</em>' attribute.
	 * @see #setCurrentStopIndex(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_CurrentStopIndex()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getCurrentStopIndex <em>Current Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index</em>' attribute.
	 * @see #getCurrentStopIndex()
	 * @generated
	 */
	void setCurrentStopIndex(int value);

	/**
	 * Returns the value of the '<em><b>Route Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Deviation</em>' attribute.
	 * @see #setRouteDeviation(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_RouteDeviation()
	 * @model required="true"
	 * @generated
	 */
	String getRouteDeviation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getRouteDeviation <em>Route Deviation</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_DoorState()
	 * @model
	 * @generated
	 */
	String getDoorState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getDoorState <em>Door State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door State</em>' attribute.
	 * @see #getDoorState()
	 * @generated
	 */
	void setDoorState(String value);

	/**
	 * Returns the value of the '<em><b>In Panic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Panic</em>' attribute.
	 * @see #setInPanic(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_InPanic()
	 * @model
	 * @generated
	 */
	boolean isInPanic();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isInPanic <em>In Panic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Panic</em>' attribute.
	 * @see #isInPanic()
	 * @generated
	 */
	void setInPanic(boolean value);

	/**
	 * Returns the value of the '<em><b>Vehicle Stop Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Stop Requested</em>' attribute.
	 * @see #setVehicleStopRequested(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_VehicleStopRequested()
	 * @model
	 * @generated
	 */
	boolean isVehicleStopRequested();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isVehicleStopRequested <em>Vehicle Stop Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Stop Requested</em>' attribute.
	 * @see #isVehicleStopRequested()
	 * @generated
	 */
	void setVehicleStopRequested(boolean value);

	/**
	 * Returns the value of the '<em><b>Exit Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Side</em>' attribute.
	 * @see #setExitSide(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_ExitSide()
	 * @model
	 * @generated
	 */
	String getExitSide();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getExitSide <em>Exit Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Side</em>' attribute.
	 * @see #getExitSide()
	 * @generated
	 */
	void setExitSide(String value);

	/**
	 * Returns the value of the '<em><b>Moving Direction Forward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moving Direction Forward</em>' attribute.
	 * @see #setMovingDirectionForward(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_MovingDirectionForward()
	 * @model
	 * @generated
	 */
	boolean isMovingDirectionForward();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isMovingDirectionForward <em>Moving Direction Forward</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_VehicleMode()
	 * @model
	 * @generated
	 */
	String getVehicleMode();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getVehicleMode <em>Vehicle Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Mode</em>' attribute.
	 * @see #getVehicleMode()
	 * @generated
	 */
	void setVehicleMode(String value);

	/**
	 * Returns the value of the '<em><b>Speaker Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker Active</em>' attribute.
	 * @see #setSpeakerActive(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_SpeakerActive()
	 * @model
	 * @generated
	 */
	boolean isSpeakerActive();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isSpeakerActive <em>Speaker Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker Active</em>' attribute.
	 * @see #isSpeakerActive()
	 * @generated
	 */
	void setSpeakerActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Stop Information Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Information Active</em>' attribute.
	 * @see #setStopInformationActive(boolean)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_StopInformationActive()
	 * @model
	 * @generated
	 */
	boolean isStopInformationActive();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#isStopInformationActive <em>Stop Information Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Information Active</em>' attribute.
	 * @see #isStopInformationActive()
	 * @generated
	 */
	void setStopInformationActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Trip State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip State</em>' attribute.
	 * @see #setTripState(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoAllData_TripState()
	 * @model
	 * @generated
	 */
	String getTripState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoAllData#getTripState <em>Trip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip State</em>' attribute.
	 * @see #getTripState()
	 * @generated
	 */
	void setTripState(String value);

} // CustomerInfoAllData
