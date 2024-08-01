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
 * A representation of the model object '<em><b>Customer Info Trip Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getVehicleRef <em>Vehicle Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getTripRef <em>Trip Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getLocationState <em>Location State</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getTimetableDelay <em>Timetable Delay</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getRouteDirection <em>Route Direction</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getPatternNumber <em>Pattern Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getPathDestinationNumber <em>Path Destination Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg <em>Additional Text Msg</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg1 <em>Additional Text Msg1</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg2 <em>Additional Text Msg2</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg3 <em>Additional Text Msg3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg4 <em>Additional Text Msg4</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg5 <em>Additional Text Msg5</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg6 <em>Additional Text Msg6</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg7 <em>Additional Text Msg7</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg8 <em>Additional Text Msg8</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg9 <em>Additional Text Msg9</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData()
 * @model
 * @generated
 */
@ProviderType
public interface CustomerInfoTripData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getServiceName <em>Service Name</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getServiceOperation <em>Service Operation</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant" required="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_VehicleRef()
	 * @model required="true"
	 * @generated
	 */
	String getVehicleRef();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getVehicleRef <em>Vehicle Ref</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_DefaultLanguage()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultLanguage();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getDefaultLanguage <em>Default Language</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_CurrentStopIndex()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getCurrentStopIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getCurrentStopIndex <em>Current Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Stop Index</em>' attribute.
	 * @see #getCurrentStopIndex()
	 * @generated
	 */
	void setCurrentStopIndex(int value);

	/**
	 * Returns the value of the '<em><b>Trip Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Ref</em>' attribute.
	 * @see #setTripRef(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_TripRef()
	 * @model required="true"
	 * @generated
	 */
	String getTripRef();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getTripRef <em>Trip Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Ref</em>' attribute.
	 * @see #getTripRef()
	 * @generated
	 */
	void setTripRef(String value);

	/**
	 * Returns the value of the '<em><b>Location State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location State</em>' attribute.
	 * @see #setLocationState(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_LocationState()
	 * @model
	 * @generated
	 */
	String getLocationState();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getLocationState <em>Location State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location State</em>' attribute.
	 * @see #getLocationState()
	 * @generated
	 */
	void setLocationState(String value);

	/**
	 * Returns the value of the '<em><b>Timetable Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delay in seconds. Earlier times wrt schedule are represented by negative numbers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timetable Delay</em>' attribute.
	 * @see #setTimetableDelay(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_TimetableDelay()
	 * @model
	 * @generated
	 */
	int getTimetableDelay();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getTimetableDelay <em>Timetable Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable Delay</em>' attribute.
	 * @see #getTimetableDelay()
	 * @generated
	 */
	void setTimetableDelay(int value);

	/**
	 * Returns the value of the '<em><b>Route Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Direction</em>' attribute.
	 * @see #setRouteDirection(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_RouteDirection()
	 * @model
	 * @generated
	 */
	String getRouteDirection();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getRouteDirection <em>Route Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Direction</em>' attribute.
	 * @see #getRouteDirection()
	 * @generated
	 */
	void setRouteDirection(String value);

	/**
	 * Returns the value of the '<em><b>Run Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Number</em>' attribute.
	 * @see #setRunNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_RunNumber()
	 * @model default="-1"
	 * @generated
	 */
	int getRunNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getRunNumber <em>Run Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Number</em>' attribute.
	 * @see #getRunNumber()
	 * @generated
	 */
	void setRunNumber(int value);

	/**
	 * Returns the value of the '<em><b>Pattern Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Number</em>' attribute.
	 * @see #setPatternNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_PatternNumber()
	 * @model default="-1"
	 * @generated
	 */
	int getPatternNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getPatternNumber <em>Pattern Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Number</em>' attribute.
	 * @see #getPatternNumber()
	 * @generated
	 */
	void setPatternNumber(int value);

	/**
	 * Returns the value of the '<em><b>Path Destination Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Destination Number</em>' attribute.
	 * @see #setPathDestinationNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_PathDestinationNumber()
	 * @model default="-1"
	 * @generated
	 */
	int getPathDestinationNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getPathDestinationNumber <em>Path Destination Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Destination Number</em>' attribute.
	 * @see #getPathDestinationNumber()
	 * @generated
	 */
	void setPathDestinationNumber(int value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg</em>' attribute.
	 * @see #setAdditionalTextMsg(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg()
	 * @model default=""
	 * @generated
	 */
	String getAdditionalTextMsg();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg <em>Additional Text Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg</em>' attribute.
	 * @see #getAdditionalTextMsg()
	 * @generated
	 */
	void setAdditionalTextMsg(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg1</em>' attribute.
	 * @see #setAdditionalTextMsg1(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg1()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg1();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg1 <em>Additional Text Msg1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg1</em>' attribute.
	 * @see #getAdditionalTextMsg1()
	 * @generated
	 */
	void setAdditionalTextMsg1(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg2</em>' attribute.
	 * @see #setAdditionalTextMsg2(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg2()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg2();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg2 <em>Additional Text Msg2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg2</em>' attribute.
	 * @see #getAdditionalTextMsg2()
	 * @generated
	 */
	void setAdditionalTextMsg2(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg3</em>' attribute.
	 * @see #setAdditionalTextMsg3(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg3()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg3();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg3 <em>Additional Text Msg3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg3</em>' attribute.
	 * @see #getAdditionalTextMsg3()
	 * @generated
	 */
	void setAdditionalTextMsg3(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg4</em>' attribute.
	 * @see #setAdditionalTextMsg4(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg4()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg4();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg4 <em>Additional Text Msg4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg4</em>' attribute.
	 * @see #getAdditionalTextMsg4()
	 * @generated
	 */
	void setAdditionalTextMsg4(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg5</em>' attribute.
	 * @see #setAdditionalTextMsg5(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg5()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg5();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg5 <em>Additional Text Msg5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg5</em>' attribute.
	 * @see #getAdditionalTextMsg5()
	 * @generated
	 */
	void setAdditionalTextMsg5(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg6</em>' attribute.
	 * @see #setAdditionalTextMsg6(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg6()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg6();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg6 <em>Additional Text Msg6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg6</em>' attribute.
	 * @see #getAdditionalTextMsg6()
	 * @generated
	 */
	void setAdditionalTextMsg6(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg7</em>' attribute.
	 * @see #setAdditionalTextMsg7(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg7()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg7();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg7 <em>Additional Text Msg7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg7</em>' attribute.
	 * @see #getAdditionalTextMsg7()
	 * @generated
	 */
	void setAdditionalTextMsg7(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg8</em>' attribute.
	 * @see #setAdditionalTextMsg8(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg8()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg8();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg8 <em>Additional Text Msg8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg8</em>' attribute.
	 * @see #getAdditionalTextMsg8()
	 * @generated
	 */
	void setAdditionalTextMsg8(String value);

	/**
	 * Returns the value of the '<em><b>Additional Text Msg9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Text Msg9</em>' attribute.
	 * @see #setAdditionalTextMsg9(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoTripData_AdditionalTextMsg9()
	 * @model
	 * @generated
	 */
	String getAdditionalTextMsg9();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoTripData#getAdditionalTextMsg9 <em>Additional Text Msg9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Text Msg9</em>' attribute.
	 * @see #getAdditionalTextMsg9()
	 * @generated
	 */
	void setAdditionalTextMsg9(String value);

} // CustomerInfoTripData
