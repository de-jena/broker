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
 * A representation of the model object '<em><b>GNSS Location Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getDate <em>Date</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLatitudeDegree <em>Latitude Degree</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLongitudeDegree <em>Longitude Degree</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLatitudeDirection <em>Latitude Direction</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLongitudeDirection <em>Longitude Direction</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getSpeedOverGround <em>Speed Over Ground</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getSignalQuality <em>Signal Quality</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getHorizontalDilutionOfPrecision <em>Horizontal Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTrackDegreeTrue <em>Track Degree True</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getGNSSType <em>GNSS Type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.GNSSLocationData#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData()
 * @model
 * @generated
 */
@ProviderType
public interface GNSSLocationData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getServiceName <em>Service Name</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getServiceOperation <em>Service Operation</em>}' attribute.
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
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_Date()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getDate();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Instant value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_Time()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getTime();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Instant value);

	/**
	 * Returns the value of the '<em><b>Latitude Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude Degree</em>' attribute.
	 * @see #setLatitudeDegree(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_LatitudeDegree()
	 * @model required="true"
	 * @generated
	 */
	double getLatitudeDegree();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLatitudeDegree <em>Latitude Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Degree</em>' attribute.
	 * @see #getLatitudeDegree()
	 * @generated
	 */
	void setLatitudeDegree(double value);

	/**
	 * Returns the value of the '<em><b>Longitude Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude Degree</em>' attribute.
	 * @see #setLongitudeDegree(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_LongitudeDegree()
	 * @model required="true"
	 * @generated
	 */
	double getLongitudeDegree();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLongitudeDegree <em>Longitude Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Degree</em>' attribute.
	 * @see #getLongitudeDegree()
	 * @generated
	 */
	void setLongitudeDegree(double value);

	/**
	 * Returns the value of the '<em><b>Latitude Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude Direction</em>' attribute.
	 * @see #setLatitudeDirection(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_LatitudeDirection()
	 * @model required="true"
	 * @generated
	 */
	String getLatitudeDirection();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLatitudeDirection <em>Latitude Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude Direction</em>' attribute.
	 * @see #getLatitudeDirection()
	 * @generated
	 */
	void setLatitudeDirection(String value);

	/**
	 * Returns the value of the '<em><b>Longitude Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude Direction</em>' attribute.
	 * @see #setLongitudeDirection(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_LongitudeDirection()
	 * @model required="true"
	 * @generated
	 */
	String getLongitudeDirection();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getLongitudeDirection <em>Longitude Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude Direction</em>' attribute.
	 * @see #getLongitudeDirection()
	 * @generated
	 */
	void setLongitudeDirection(String value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_Altitude()
	 * @model
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Speed Over Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Over Ground</em>' attribute.
	 * @see #setSpeedOverGround(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_SpeedOverGround()
	 * @model
	 * @generated
	 */
	double getSpeedOverGround();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getSpeedOverGround <em>Speed Over Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Over Ground</em>' attribute.
	 * @see #getSpeedOverGround()
	 * @generated
	 */
	void setSpeedOverGround(double value);

	/**
	 * Returns the value of the '<em><b>Signal Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Quality</em>' attribute.
	 * @see #setSignalQuality(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_SignalQuality()
	 * @model
	 * @generated
	 */
	String getSignalQuality();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getSignalQuality <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Quality</em>' attribute.
	 * @see #getSignalQuality()
	 * @generated
	 */
	void setSignalQuality(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Satellites</em>' attribute.
	 * @see #setNumberOfSatellites(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_NumberOfSatellites()
	 * @model
	 * @generated
	 */
	int getNumberOfSatellites();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getNumberOfSatellites <em>Number Of Satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Satellites</em>' attribute.
	 * @see #getNumberOfSatellites()
	 * @generated
	 */
	void setNumberOfSatellites(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Dilution Of Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Dilution Of Precision</em>' attribute.
	 * @see #setHorizontalDilutionOfPrecision(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_HorizontalDilutionOfPrecision()
	 * @model
	 * @generated
	 */
	double getHorizontalDilutionOfPrecision();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getHorizontalDilutionOfPrecision <em>Horizontal Dilution Of Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Dilution Of Precision</em>' attribute.
	 * @see #getHorizontalDilutionOfPrecision()
	 * @generated
	 */
	void setHorizontalDilutionOfPrecision(double value);

	/**
	 * Returns the value of the '<em><b>Vertical Dilution Of Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Dilution Of Precision</em>' attribute.
	 * @see #setVerticalDilutionOfPrecision(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_VerticalDilutionOfPrecision()
	 * @model
	 * @generated
	 */
	double getVerticalDilutionOfPrecision();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Dilution Of Precision</em>' attribute.
	 * @see #getVerticalDilutionOfPrecision()
	 * @generated
	 */
	void setVerticalDilutionOfPrecision(double value);

	/**
	 * Returns the value of the '<em><b>Track Degree True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Degree True</em>' attribute.
	 * @see #setTrackDegreeTrue(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_TrackDegreeTrue()
	 * @model
	 * @generated
	 */
	double getTrackDegreeTrue();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTrackDegreeTrue <em>Track Degree True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Degree True</em>' attribute.
	 * @see #getTrackDegreeTrue()
	 * @generated
	 */
	void setTrackDegreeTrue(double value);

	/**
	 * Returns the value of the '<em><b>Track Degree Magnetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Degree Magnetic</em>' attribute.
	 * @see #setTrackDegreeMagnetic(double)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_TrackDegreeMagnetic()
	 * @model
	 * @generated
	 */
	double getTrackDegreeMagnetic();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Degree Magnetic</em>' attribute.
	 * @see #getTrackDegreeMagnetic()
	 * @generated
	 */
	void setTrackDegreeMagnetic(double value);

	/**
	 * Returns the value of the '<em><b>GNSS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNSS Type</em>' attribute.
	 * @see #setGNSSType(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_GNSSType()
	 * @model required="true"
	 * @generated
	 */
	String getGNSSType();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getGNSSType <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Type</em>' attribute.
	 * @see #getGNSSType()
	 * @generated
	 */
	void setGNSSType(String value);

	/**
	 * Returns the value of the '<em><b>GNSS Coordinate System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNSS Coordinate System</em>' attribute.
	 * @see #setGNSSCoordinateSystem(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getGNSSLocationData_GNSSCoordinateSystem()
	 * @model
	 * @generated
	 */
	String getGNSSCoordinateSystem();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.GNSSLocationData#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Coordinate System</em>' attribute.
	 * @see #getGNSSCoordinateSystem()
	 * @generated
	 */
	void setGNSSCoordinateSystem(String value);

} // GNSSLocationData
