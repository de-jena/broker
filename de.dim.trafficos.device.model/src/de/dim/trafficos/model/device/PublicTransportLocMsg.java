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
package de.dim.trafficos.model.device;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Loc Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getLineNum <em>Line Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getTripNum <em>Trip Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getRouteNum <em>Route Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getTravelNum <em>Travel Num</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getCounter <em>Counter</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getKilometer <em>Kilometer</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getPosState <em>Pos State</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getLastStop <em>Last Stop</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getNextStop <em>Next Stop</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getActualTime <em>Actual Time</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getExpectedTime <em>Expected Time</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getGps <em>Gps</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getOdo <em>Odo</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportLocMsg extends PublicTransportDataValueObject {
	/**
	 * Returns the value of the '<em><b>Line Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Num</em>' attribute.
	 * @see #setLineNum(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_LineNum()
	 * @model
	 * @generated
	 */
	String getLineNum();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getLineNum <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Num</em>' attribute.
	 * @see #getLineNum()
	 * @generated
	 */
	void setLineNum(String value);

	/**
	 * Returns the value of the '<em><b>Trip Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Num</em>' attribute.
	 * @see #setTripNum(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_TripNum()
	 * @model
	 * @generated
	 */
	String getTripNum();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getTripNum <em>Trip Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Num</em>' attribute.
	 * @see #getTripNum()
	 * @generated
	 */
	void setTripNum(String value);

	/**
	 * Returns the value of the '<em><b>Route Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Num</em>' attribute.
	 * @see #setRouteNum(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_RouteNum()
	 * @model
	 * @generated
	 */
	String getRouteNum();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getRouteNum <em>Route Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Num</em>' attribute.
	 * @see #getRouteNum()
	 * @generated
	 */
	void setRouteNum(String value);

	/**
	 * Returns the value of the '<em><b>Travel Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Num</em>' attribute.
	 * @see #setTravelNum(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_TravelNum()
	 * @model
	 * @generated
	 */
	String getTravelNum();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getTravelNum <em>Travel Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Num</em>' attribute.
	 * @see #getTravelNum()
	 * @generated
	 */
	void setTravelNum(String value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_Counter()
	 * @model required="true"
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

	/**
	 * Returns the value of the '<em><b>Kilometer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kilometer</em>' attribute.
	 * @see #setKilometer(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_Kilometer()
	 * @model required="true"
	 * @generated
	 */
	int getKilometer();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getKilometer <em>Kilometer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kilometer</em>' attribute.
	 * @see #getKilometer()
	 * @generated
	 */
	void setKilometer(int value);

	/**
	 * Returns the value of the '<em><b>Pos State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos State</em>' attribute.
	 * @see #setPosState(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_PosState()
	 * @model
	 * @generated
	 */
	String getPosState();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getPosState <em>Pos State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos State</em>' attribute.
	 * @see #getPosState()
	 * @generated
	 */
	void setPosState(String value);

	/**
	 * Returns the value of the '<em><b>Last Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Stop</em>' attribute.
	 * @see #setLastStop(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_LastStop()
	 * @model
	 * @generated
	 */
	String getLastStop();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getLastStop <em>Last Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Stop</em>' attribute.
	 * @see #getLastStop()
	 * @generated
	 */
	void setLastStop(String value);

	/**
	 * Returns the value of the '<em><b>Next Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Stop</em>' attribute.
	 * @see #setNextStop(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_NextStop()
	 * @model
	 * @generated
	 */
	String getNextStop();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getNextStop <em>Next Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Stop</em>' attribute.
	 * @see #getNextStop()
	 * @generated
	 */
	void setNextStop(String value);

	/**
	 * Returns the value of the '<em><b>Actual Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Time</em>' attribute.
	 * @see #setActualTime(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_ActualTime()
	 * @model required="true"
	 * @generated
	 */
	int getActualTime();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getActualTime <em>Actual Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Time</em>' attribute.
	 * @see #getActualTime()
	 * @generated
	 */
	void setActualTime(int value);

	/**
	 * Returns the value of the '<em><b>Expected Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Time</em>' attribute.
	 * @see #setExpectedTime(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_ExpectedTime()
	 * @model required="true"
	 * @generated
	 */
	int getExpectedTime();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getExpectedTime <em>Expected Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Time</em>' attribute.
	 * @see #getExpectedTime()
	 * @generated
	 */
	void setExpectedTime(int value);

	/**
	 * Returns the value of the '<em><b>Gps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' attribute.
	 * @see #setGps(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_Gps()
	 * @model
	 * @generated
	 */
	String getGps();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getGps <em>Gps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' attribute.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(String value);

	/**
	 * Returns the value of the '<em><b>Odo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odo</em>' attribute.
	 * @see #setOdo(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_Odo()
	 * @model
	 * @generated
	 */
	String getOdo();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getOdo <em>Odo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odo</em>' attribute.
	 * @see #getOdo()
	 * @generated
	 */
	void setOdo(String value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' attribute.
	 * @see #setDoor(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportLocMsg_Door()
	 * @model
	 * @generated
	 */
	String getDoor();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportLocMsg#getDoor <em>Door</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' attribute.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(String value);

} // PublicTransportLocMsg
