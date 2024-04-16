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

import de.jena.traficam.MessagType;
import de.jena.traficam.TrafiCam;
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
 * An implementation of the model object '<em><b>Trafi Cam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.TrafiCamImpl#getDataNumber <em>Data Number</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamImpl#getObject <em>Object</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.traficam.impl.TrafiCamImpl#getIntervalTime <em>Interval Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafiCamImpl extends MinimalEObjectImpl.Container implements TrafiCam {
	/**
	 * The default value of the '{@link #getDataNumber() <em>Data Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataNumber() <em>Data Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNumber()
	 * @generated
	 * @ordered
	 */
	protected long dataNumber = DATA_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final MessagType MESSAGE_TYPE_EDEFAULT = MessagType.DATA;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessagType messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafiCamObject> object;

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
	 * The default value of the '{@link #getIntervalTime() <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalTime()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERVAL_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIntervalTime() <em>Interval Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalTime()
	 * @generated
	 * @ordered
	 */
	protected double intervalTime = INTERVAL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafiCamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.TRAFI_CAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDataNumber() {
		return dataNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataNumber(long newDataNumber) {
		long oldDataNumber = dataNumber;
		dataNumber = newDataNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM__DATA_NUMBER, oldDataNumber, dataNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessagType getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageType(MessagType newMessageType) {
		MessagType oldMessageType = messageType;
		messageType = newMessageType == null ? MESSAGE_TYPE_EDEFAULT : newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafiCamObject> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<TrafiCamObject>(TrafiCamObject.class, this, TrafiCamPackage.TRAFI_CAM__OBJECT);
		}
		return object;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIntervalTime() {
		return intervalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalTime(double newIntervalTime) {
		double oldIntervalTime = intervalTime;
		intervalTime = newIntervalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.TRAFI_CAM__INTERVAL_TIME, oldIntervalTime, intervalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrafiCamPackage.TRAFI_CAM__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case TrafiCamPackage.TRAFI_CAM__DATA_NUMBER:
				return getDataNumber();
			case TrafiCamPackage.TRAFI_CAM__TYPE:
				return getType();
			case TrafiCamPackage.TRAFI_CAM__MESSAGE_TYPE:
				return getMessageType();
			case TrafiCamPackage.TRAFI_CAM__OBJECT:
				return getObject();
			case TrafiCamPackage.TRAFI_CAM__TIME:
				return getTime();
			case TrafiCamPackage.TRAFI_CAM__INTERVAL_TIME:
				return getIntervalTime();
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
			case TrafiCamPackage.TRAFI_CAM__DATA_NUMBER:
				setDataNumber((Long)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM__TYPE:
				setType((String)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM__MESSAGE_TYPE:
				setMessageType((MessagType)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends TrafiCamObject>)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM__TIME:
				setTime((Date)newValue);
				return;
			case TrafiCamPackage.TRAFI_CAM__INTERVAL_TIME:
				setIntervalTime((Double)newValue);
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
			case TrafiCamPackage.TRAFI_CAM__DATA_NUMBER:
				setDataNumber(DATA_NUMBER_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM__MESSAGE_TYPE:
				setMessageType(MESSAGE_TYPE_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM__OBJECT:
				getObject().clear();
				return;
			case TrafiCamPackage.TRAFI_CAM__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case TrafiCamPackage.TRAFI_CAM__INTERVAL_TIME:
				setIntervalTime(INTERVAL_TIME_EDEFAULT);
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
			case TrafiCamPackage.TRAFI_CAM__DATA_NUMBER:
				return dataNumber != DATA_NUMBER_EDEFAULT;
			case TrafiCamPackage.TRAFI_CAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TrafiCamPackage.TRAFI_CAM__MESSAGE_TYPE:
				return messageType != MESSAGE_TYPE_EDEFAULT;
			case TrafiCamPackage.TRAFI_CAM__OBJECT:
				return object != null && !object.isEmpty();
			case TrafiCamPackage.TRAFI_CAM__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case TrafiCamPackage.TRAFI_CAM__INTERVAL_TIME:
				return intervalTime != INTERVAL_TIME_EDEFAULT;
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
		result.append(" (dataNumber: ");
		result.append(dataNumber);
		result.append(", type: ");
		result.append(type);
		result.append(", messageType: ");
		result.append(messageType);
		result.append(", time: ");
		result.append(time);
		result.append(", intervalTime: ");
		result.append(intervalTime);
		result.append(')');
		return result.toString();
	}

} //TrafiCamImpl
