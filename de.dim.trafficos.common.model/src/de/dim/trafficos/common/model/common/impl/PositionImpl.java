/*
 */
package de.dim.trafficos.common.model.common.impl;

import de.dim.trafficos.common.model.common.DirectionType;
import de.dim.trafficos.common.model.common.Position;
import de.dim.trafficos.common.model.common.TOSCommonPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.common.model.common.impl.PositionImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.impl.PositionImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.impl.PositionImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.impl.PositionImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.impl.PositionImpl#getBearing <em>Bearing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends LocationImpl implements Position {
	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType ORIENTATION_EDEFAULT = DirectionType.STRAIGHT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected DirectionType orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBearing() <em>Bearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearing()
	 * @generated
	 * @ordered
	 */
	protected static final int BEARING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBearing() <em>Bearing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearing()
	 * @generated
	 * @ordered
	 */
	protected int bearing = BEARING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCommonPackage.eINSTANCE.getPosition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCommonPackage.POSITION__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCommonPackage.POSITION__LONGITUDE, oldLongitude, longitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCommonPackage.POSITION__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(DirectionType newOrientation) {
		DirectionType oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCommonPackage.POSITION__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBearing() {
		return bearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBearing(int newBearing) {
		int oldBearing = bearing;
		bearing = newBearing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCommonPackage.POSITION__BEARING, oldBearing, bearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSCommonPackage.POSITION__LATITUDE:
				return getLatitude();
			case TOSCommonPackage.POSITION__LONGITUDE:
				return getLongitude();
			case TOSCommonPackage.POSITION__ALTITUDE:
				return getAltitude();
			case TOSCommonPackage.POSITION__ORIENTATION:
				return getOrientation();
			case TOSCommonPackage.POSITION__BEARING:
				return getBearing();
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
			case TOSCommonPackage.POSITION__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case TOSCommonPackage.POSITION__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case TOSCommonPackage.POSITION__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case TOSCommonPackage.POSITION__ORIENTATION:
				setOrientation((DirectionType)newValue);
				return;
			case TOSCommonPackage.POSITION__BEARING:
				setBearing((Integer)newValue);
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
			case TOSCommonPackage.POSITION__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case TOSCommonPackage.POSITION__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case TOSCommonPackage.POSITION__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case TOSCommonPackage.POSITION__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case TOSCommonPackage.POSITION__BEARING:
				setBearing(BEARING_EDEFAULT);
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
			case TOSCommonPackage.POSITION__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case TOSCommonPackage.POSITION__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case TOSCommonPackage.POSITION__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case TOSCommonPackage.POSITION__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case TOSCommonPackage.POSITION__BEARING:
				return bearing != BEARING_EDEFAULT;
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
		result.append(" (latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", altitude: ");
		result.append(altitude);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", bearing: ");
		result.append(bearing);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
