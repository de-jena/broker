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

import de.jena.model.sensinact.ibis.GNSSLocationData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GNSS Location Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getLatitudeDegree <em>Latitude Degree</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getLongitudeDegree <em>Longitude Degree</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getLatitudeDirection <em>Latitude Direction</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getLongitudeDirection <em>Longitude Direction</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getSpeedOverGround <em>Speed Over Ground</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getSignalQuality <em>Signal Quality</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getHorizontalDilutionOfPrecision <em>Horizontal Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getTrackDegreeTrue <em>Track Degree True</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getGNSSType <em>GNSS Type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.GNSSLocationDataImpl#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNSSLocationDataImpl extends ServiceImpl implements GNSSLocationData {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Instant DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Instant date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Instant TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Instant time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitudeDegree() <em>Latitude Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDegree()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_DEGREE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitudeDegree() <em>Latitude Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDegree()
	 * @generated
	 * @ordered
	 */
	protected double latitudeDegree = LATITUDE_DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudeDegree() <em>Longitude Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDegree()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_DEGREE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudeDegree() <em>Longitude Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDegree()
	 * @generated
	 * @ordered
	 */
	protected double longitudeDegree = LONGITUDE_DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitudeDirection() <em>Latitude Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String LATITUDE_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatitudeDirection() <em>Latitude Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDirection()
	 * @generated
	 * @ordered
	 */
	protected String latitudeDirection = LATITUDE_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudeDirection() <em>Longitude Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDE_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudeDirection() <em>Longitude Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDirection()
	 * @generated
	 * @ordered
	 */
	protected String longitudeDirection = LONGITUDE_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected double altitude = ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedOverGround() <em>Speed Over Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverGround()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_OVER_GROUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeedOverGround() <em>Speed Over Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverGround()
	 * @generated
	 * @ordered
	 */
	protected double speedOverGround = SPEED_OVER_GROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalQuality() <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalQuality() <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalQuality()
	 * @generated
	 * @ordered
	 */
	protected String signalQuality = SIGNAL_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSatellites() <em>Number Of Satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSatellites()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SATELLITES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSatellites() <em>Number Of Satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSatellites()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSatellites = NUMBER_OF_SATELLITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalDilutionOfPrecision() <em>Horizontal Dilution Of Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDilutionOfPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_DILUTION_OF_PRECISION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalDilutionOfPrecision() <em>Horizontal Dilution Of Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDilutionOfPrecision()
	 * @generated
	 * @ordered
	 */
	protected double horizontalDilutionOfPrecision = HORIZONTAL_DILUTION_OF_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalDilutionOfPrecision() <em>Vertical Dilution Of Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDilutionOfPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_DILUTION_OF_PRECISION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerticalDilutionOfPrecision() <em>Vertical Dilution Of Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDilutionOfPrecision()
	 * @generated
	 * @ordered
	 */
	protected double verticalDilutionOfPrecision = VERTICAL_DILUTION_OF_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackDegreeTrue() <em>Track Degree True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackDegreeTrue()
	 * @generated
	 * @ordered
	 */
	protected static final double TRACK_DEGREE_TRUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrackDegreeTrue() <em>Track Degree True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackDegreeTrue()
	 * @generated
	 * @ordered
	 */
	protected double trackDegreeTrue = TRACK_DEGREE_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackDegreeMagnetic() <em>Track Degree Magnetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackDegreeMagnetic()
	 * @generated
	 * @ordered
	 */
	protected static final double TRACK_DEGREE_MAGNETIC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrackDegreeMagnetic() <em>Track Degree Magnetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackDegreeMagnetic()
	 * @generated
	 * @ordered
	 */
	protected double trackDegreeMagnetic = TRACK_DEGREE_MAGNETIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getGNSSType() <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSType()
	 * @generated
	 * @ordered
	 */
	protected static final String GNSS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGNSSType() <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSType()
	 * @generated
	 * @ordered
	 */
	protected String gNSSType = GNSS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGNSSCoordinateSystem() <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String GNSS_COORDINATE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGNSSCoordinateSystem() <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected String gNSSCoordinateSystem = GNSS_COORDINATE_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNSSLocationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.GNSS_LOCATION_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Instant newDate) {
		Instant oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Instant newTime) {
		Instant oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLatitudeDegree() {
		return latitudeDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitudeDegree(double newLatitudeDegree) {
		double oldLatitudeDegree = latitudeDegree;
		latitudeDegree = newLatitudeDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DEGREE, oldLatitudeDegree, latitudeDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLongitudeDegree() {
		return longitudeDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitudeDegree(double newLongitudeDegree) {
		double oldLongitudeDegree = longitudeDegree;
		longitudeDegree = newLongitudeDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DEGREE, oldLongitudeDegree, longitudeDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLatitudeDirection() {
		return latitudeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitudeDirection(String newLatitudeDirection) {
		String oldLatitudeDirection = latitudeDirection;
		latitudeDirection = newLatitudeDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DIRECTION, oldLatitudeDirection, latitudeDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongitudeDirection() {
		return longitudeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitudeDirection(String newLongitudeDirection) {
		String oldLongitudeDirection = longitudeDirection;
		longitudeDirection = newLongitudeDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DIRECTION, oldLongitudeDirection, longitudeDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltitude(double newAltitude) {
		double oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpeedOverGround() {
		return speedOverGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeedOverGround(double newSpeedOverGround) {
		double oldSpeedOverGround = speedOverGround;
		speedOverGround = newSpeedOverGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__SPEED_OVER_GROUND, oldSpeedOverGround, speedOverGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignalQuality() {
		return signalQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalQuality(String newSignalQuality) {
		String oldSignalQuality = signalQuality;
		signalQuality = newSignalQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__SIGNAL_QUALITY, oldSignalQuality, signalQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfSatellites() {
		return numberOfSatellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfSatellites(int newNumberOfSatellites) {
		int oldNumberOfSatellites = numberOfSatellites;
		numberOfSatellites = newNumberOfSatellites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES, oldNumberOfSatellites, numberOfSatellites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHorizontalDilutionOfPrecision() {
		return horizontalDilutionOfPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalDilutionOfPrecision(double newHorizontalDilutionOfPrecision) {
		double oldHorizontalDilutionOfPrecision = horizontalDilutionOfPrecision;
		horizontalDilutionOfPrecision = newHorizontalDilutionOfPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__HORIZONTAL_DILUTION_OF_PRECISION, oldHorizontalDilutionOfPrecision, horizontalDilutionOfPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVerticalDilutionOfPrecision() {
		return verticalDilutionOfPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDilutionOfPrecision(double newVerticalDilutionOfPrecision) {
		double oldVerticalDilutionOfPrecision = verticalDilutionOfPrecision;
		verticalDilutionOfPrecision = newVerticalDilutionOfPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION, oldVerticalDilutionOfPrecision, verticalDilutionOfPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTrackDegreeTrue() {
		return trackDegreeTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackDegreeTrue(double newTrackDegreeTrue) {
		double oldTrackDegreeTrue = trackDegreeTrue;
		trackDegreeTrue = newTrackDegreeTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE, oldTrackDegreeTrue, trackDegreeTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTrackDegreeMagnetic() {
		return trackDegreeMagnetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackDegreeMagnetic(double newTrackDegreeMagnetic) {
		double oldTrackDegreeMagnetic = trackDegreeMagnetic;
		trackDegreeMagnetic = newTrackDegreeMagnetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC, oldTrackDegreeMagnetic, trackDegreeMagnetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGNSSType() {
		return gNSSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGNSSType(String newGNSSType) {
		String oldGNSSType = gNSSType;
		gNSSType = newGNSSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_TYPE, oldGNSSType, gNSSType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGNSSCoordinateSystem() {
		return gNSSCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGNSSCoordinateSystem(String newGNSSCoordinateSystem) {
		String oldGNSSCoordinateSystem = gNSSCoordinateSystem;
		gNSSCoordinateSystem = newGNSSCoordinateSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM, oldGNSSCoordinateSystem, gNSSCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__DATE:
				return getDate();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIME:
				return getTime();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DEGREE:
				return getLatitudeDegree();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DEGREE:
				return getLongitudeDegree();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DIRECTION:
				return getLatitudeDirection();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DIRECTION:
				return getLongitudeDirection();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__ALTITUDE:
				return getAltitude();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SPEED_OVER_GROUND:
				return getSpeedOverGround();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SIGNAL_QUALITY:
				return getSignalQuality();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES:
				return getNumberOfSatellites();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__HORIZONTAL_DILUTION_OF_PRECISION:
				return getHorizontalDilutionOfPrecision();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION:
				return getVerticalDilutionOfPrecision();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE:
				return getTrackDegreeTrue();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC:
				return getTrackDegreeMagnetic();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_TYPE:
				return getGNSSType();
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM:
				return getGNSSCoordinateSystem();
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
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__DATE:
				setDate((Instant)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIME:
				setTime((Instant)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DEGREE:
				setLatitudeDegree((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DEGREE:
				setLongitudeDegree((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DIRECTION:
				setLatitudeDirection((String)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DIRECTION:
				setLongitudeDirection((String)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SPEED_OVER_GROUND:
				setSpeedOverGround((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SIGNAL_QUALITY:
				setSignalQuality((String)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES:
				setNumberOfSatellites((Integer)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__HORIZONTAL_DILUTION_OF_PRECISION:
				setHorizontalDilutionOfPrecision((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION:
				setVerticalDilutionOfPrecision((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE:
				setTrackDegreeTrue((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC:
				setTrackDegreeMagnetic((Double)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_TYPE:
				setGNSSType((String)newValue);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM:
				setGNSSCoordinateSystem((String)newValue);
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
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DEGREE:
				setLatitudeDegree(LATITUDE_DEGREE_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DEGREE:
				setLongitudeDegree(LONGITUDE_DEGREE_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DIRECTION:
				setLatitudeDirection(LATITUDE_DIRECTION_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DIRECTION:
				setLongitudeDirection(LONGITUDE_DIRECTION_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SPEED_OVER_GROUND:
				setSpeedOverGround(SPEED_OVER_GROUND_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SIGNAL_QUALITY:
				setSignalQuality(SIGNAL_QUALITY_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES:
				setNumberOfSatellites(NUMBER_OF_SATELLITES_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__HORIZONTAL_DILUTION_OF_PRECISION:
				setHorizontalDilutionOfPrecision(HORIZONTAL_DILUTION_OF_PRECISION_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION:
				setVerticalDilutionOfPrecision(VERTICAL_DILUTION_OF_PRECISION_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE:
				setTrackDegreeTrue(TRACK_DEGREE_TRUE_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC:
				setTrackDegreeMagnetic(TRACK_DEGREE_MAGNETIC_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_TYPE:
				setGNSSType(GNSS_TYPE_EDEFAULT);
				return;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM:
				setGNSSCoordinateSystem(GNSS_COORDINATE_SYSTEM_EDEFAULT);
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
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DEGREE:
				return latitudeDegree != LATITUDE_DEGREE_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DEGREE:
				return longitudeDegree != LONGITUDE_DEGREE_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LATITUDE_DIRECTION:
				return LATITUDE_DIRECTION_EDEFAULT == null ? latitudeDirection != null : !LATITUDE_DIRECTION_EDEFAULT.equals(latitudeDirection);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__LONGITUDE_DIRECTION:
				return LONGITUDE_DIRECTION_EDEFAULT == null ? longitudeDirection != null : !LONGITUDE_DIRECTION_EDEFAULT.equals(longitudeDirection);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SPEED_OVER_GROUND:
				return speedOverGround != SPEED_OVER_GROUND_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__SIGNAL_QUALITY:
				return SIGNAL_QUALITY_EDEFAULT == null ? signalQuality != null : !SIGNAL_QUALITY_EDEFAULT.equals(signalQuality);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__NUMBER_OF_SATELLITES:
				return numberOfSatellites != NUMBER_OF_SATELLITES_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__HORIZONTAL_DILUTION_OF_PRECISION:
				return horizontalDilutionOfPrecision != HORIZONTAL_DILUTION_OF_PRECISION_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__VERTICAL_DILUTION_OF_PRECISION:
				return verticalDilutionOfPrecision != VERTICAL_DILUTION_OF_PRECISION_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_TRUE:
				return trackDegreeTrue != TRACK_DEGREE_TRUE_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__TRACK_DEGREE_MAGNETIC:
				return trackDegreeMagnetic != TRACK_DEGREE_MAGNETIC_EDEFAULT;
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_TYPE:
				return GNSS_TYPE_EDEFAULT == null ? gNSSType != null : !GNSS_TYPE_EDEFAULT.equals(gNSSType);
			case IbisSensinactPackage.GNSS_LOCATION_DATA__GNSS_COORDINATE_SYSTEM:
				return GNSS_COORDINATE_SYSTEM_EDEFAULT == null ? gNSSCoordinateSystem != null : !GNSS_COORDINATE_SYSTEM_EDEFAULT.equals(gNSSCoordinateSystem);
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
		result.append(", date: ");
		result.append(date);
		result.append(", time: ");
		result.append(time);
		result.append(", latitudeDegree: ");
		result.append(latitudeDegree);
		result.append(", longitudeDegree: ");
		result.append(longitudeDegree);
		result.append(", latitudeDirection: ");
		result.append(latitudeDirection);
		result.append(", longitudeDirection: ");
		result.append(longitudeDirection);
		result.append(", altitude: ");
		result.append(altitude);
		result.append(", speedOverGround: ");
		result.append(speedOverGround);
		result.append(", signalQuality: ");
		result.append(signalQuality);
		result.append(", numberOfSatellites: ");
		result.append(numberOfSatellites);
		result.append(", horizontalDilutionOfPrecision: ");
		result.append(horizontalDilutionOfPrecision);
		result.append(", verticalDilutionOfPrecision: ");
		result.append(verticalDilutionOfPrecision);
		result.append(", trackDegreeTrue: ");
		result.append(trackDegreeTrue);
		result.append(", trackDegreeMagnetic: ");
		result.append(trackDegreeMagnetic);
		result.append(", gNSSType: ");
		result.append(gNSSType);
		result.append(", gNSSCoordinateSystem: ");
		result.append(gNSSCoordinateSystem);
		result.append(')');
		return result.toString();
	}

} //GNSSLocationDataImpl
