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
package de.jena.traficam.impl;

import de.jena.traficam.Coordinates;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.TrafiCamPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getClassId <em>Class Id</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getSpeedConfidence <em>Speed Confidence</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getGpsCoordinates <em>Gps Coordinates</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getImageCoordinates <em>Image Coordinates</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamObjectImpl#getWorldCoordinates <em>World Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafiCamObjectImpl extends MinimalEObjectImpl.Container implements TrafiCamObject {
	/**
	 * The default value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassId()
	 * @generated
	 * @ordered
	 */
	protected static final short CLASS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassId()
	 * @generated
	 * @ordered
	 */
	protected short classId = CLASS_ID_EDEFAULT;

	/**
	 * This is true if the Class Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classIdESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final double LIFETIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetime()
	 * @generated
	 * @ordered
	 */
	protected double lifetime = LIFETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedConfidence() <em>Speed Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final short SPEED_CONFIDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeedConfidence() <em>Speed Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedConfidence()
	 * @generated
	 * @ordered
	 */
	protected short speedConfidence = SPEED_CONFIDENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGpsCoordinates() <em>Gps Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpsCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<GpsCoordinates> gpsCoordinates;

	/**
	 * The cached value of the '{@link #getImageCoordinates() <em>Image Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordinates> imageCoordinates;

	/**
	 * The cached value of the '{@link #getWorldCoordinates() <em>World Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordinates> worldCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafiCamObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.TRAFI_CAM_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getClassId() {
		return classId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassId(short newClassId) {
		short oldClassId = classId;
		classId = newClassId;
		boolean oldClassIdESet = classIdESet;
		classIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_OBJECT__CLASS_ID, oldClassId, classId, !oldClassIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetClassId() {
		short oldClassId = classId;
		boolean oldClassIdESet = classIdESet;
		classId = CLASS_ID_EDEFAULT;
		classIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TrafiCamPackage.TRAFI_CAM_OBJECT__CLASS_ID, oldClassId, CLASS_ID_EDEFAULT, oldClassIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetClassId() {
		return classIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_OBJECT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLifetime() {
		return lifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifetime(double newLifetime) {
		double oldLifetime = lifetime;
		lifetime = newLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_OBJECT__LIFETIME, oldLifetime, lifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getSpeedConfidence() {
		return speedConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeedConfidence(short newSpeedConfidence) {
		short oldSpeedConfidence = speedConfidence;
		speedConfidence = newSpeedConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED_CONFIDENCE, oldSpeedConfidence, speedConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GpsCoordinates> getGpsCoordinates() {
		if (gpsCoordinates == null) {
			gpsCoordinates = new EObjectContainmentEList<GpsCoordinates>(GpsCoordinates.class, this, TrafiCamPackage.TRAFI_CAM_OBJECT__GPS_COORDINATES);
		}
		return gpsCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coordinates> getImageCoordinates() {
		if (imageCoordinates == null) {
			imageCoordinates = new EObjectContainmentEList<Coordinates>(Coordinates.class, this, TrafiCamPackage.TRAFI_CAM_OBJECT__IMAGE_COORDINATES);
		}
		return imageCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coordinates> getWorldCoordinates() {
		if (worldCoordinates == null) {
			worldCoordinates = new EObjectContainmentEList<Coordinates>(Coordinates.class, this, TrafiCamPackage.TRAFI_CAM_OBJECT__WORLD_COORDINATES);
		}
		return worldCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrafiCamPackage.TRAFI_CAM_OBJECT__GPS_COORDINATES:
				return ((InternalEList<?>)getGpsCoordinates()).basicRemove(otherEnd, msgs);
			case TrafiCamPackage.TRAFI_CAM_OBJECT__IMAGE_COORDINATES:
				return ((InternalEList<?>)getImageCoordinates()).basicRemove(otherEnd, msgs);
			case TrafiCamPackage.TRAFI_CAM_OBJECT__WORLD_COORDINATES:
				return ((InternalEList<?>)getWorldCoordinates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafiCamPackage.TRAFI_CAM_OBJECT__CLASS_ID:
				return getClassId();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__ID:
				return getId();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__TIME:
				return getTime();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__LIFETIME:
				return getLifetime();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED:
				return getSpeed();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED_CONFIDENCE:
				return getSpeedConfidence();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__GPS_COORDINATES:
				return getGpsCoordinates();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__IMAGE_COORDINATES:
				return getImageCoordinates();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__WORLD_COORDINATES:
				return getWorldCoordinates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrafiCamPackage.TRAFI_CAM_OBJECT__CLASS_ID:
				setClassId((Short)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__ID:
				setId((Long)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__TIME:
				setTime((Date)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__LIFETIME:
				setLifetime((Double)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED:
				setSpeed((Double)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED_CONFIDENCE:
				setSpeedConfidence((Short)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__GPS_COORDINATES:
				getGpsCoordinates().clear();
				getGpsCoordinates().addAll((Collection<? extends GpsCoordinates>)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__IMAGE_COORDINATES:
				getImageCoordinates().clear();
				getImageCoordinates().addAll((Collection<? extends Coordinates>)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__WORLD_COORDINATES:
				getWorldCoordinates().clear();
				getWorldCoordinates().addAll((Collection<? extends Coordinates>)newValue);
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
			case TrafiCamPackage.TRAFI_CAM_OBJECT__CLASS_ID:
				unsetClassId();
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__LIFETIME:
				setLifetime(LIFETIME_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED_CONFIDENCE:
				setSpeedConfidence(SPEED_CONFIDENCE_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__GPS_COORDINATES:
				getGpsCoordinates().clear();
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__IMAGE_COORDINATES:
				getImageCoordinates().clear();
				return;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__WORLD_COORDINATES:
				getWorldCoordinates().clear();
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
			case TrafiCamPackage.TRAFI_CAM_OBJECT__CLASS_ID:
				return isSetClassId();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__ID:
				return id != ID_EDEFAULT;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case TrafiCamPackage.TRAFI_CAM_OBJECT__LIFETIME:
				return lifetime != LIFETIME_EDEFAULT;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED:
				return speed != SPEED_EDEFAULT;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__SPEED_CONFIDENCE:
				return speedConfidence != SPEED_CONFIDENCE_EDEFAULT;
			case TrafiCamPackage.TRAFI_CAM_OBJECT__GPS_COORDINATES:
				return gpsCoordinates != null && !gpsCoordinates.isEmpty();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__IMAGE_COORDINATES:
				return imageCoordinates != null && !imageCoordinates.isEmpty();
			case TrafiCamPackage.TRAFI_CAM_OBJECT__WORLD_COORDINATES:
				return worldCoordinates != null && !worldCoordinates.isEmpty();
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
		result.append(" (classId: ");
		if (classIdESet) result.append(classId); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", time: ");
		result.append(time);
		result.append(", lifetime: ");
		result.append(lifetime);
		result.append(", speed: ");
		result.append(speed);
		result.append(", speedConfidence: ");
		result.append(speedConfidence);
		result.append(')');
		return result.toString();
	}

} //TrafiCamObjectImpl
