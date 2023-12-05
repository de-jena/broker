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
package de.jena.sensinact.ocpp.chargepoint.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Firmware Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl#getRetrieveDate <em>Retrieve Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.UpdateFirmwareRequestImpl#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateFirmwareRequestImpl extends MinimalEObjectImpl.Container implements UpdateFirmwareRequest {
	/**
	 * The default value of the '{@link #getRetrieveDate() <em>Retrieve Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetrieveDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RETRIEVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetrieveDate() <em>Retrieve Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetrieveDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar retrieveDate = RETRIEVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected int retries = RETRIES_EDEFAULT;

	/**
	 * This is true if the Retries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retriesESet;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected int retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Retry Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retryIntervalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateFirmwareRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.UPDATE_FIRMWARE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRetrieveDate() {
		return retrieveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetrieveDate(XMLGregorianCalendar newRetrieveDate) {
		XMLGregorianCalendar oldRetrieveDate = retrieveDate;
		retrieveDate = newRetrieveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE, oldRetrieveDate, retrieveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetries() {
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetries(int newRetries) {
		int oldRetries = retries;
		retries = newRetries;
		boolean oldRetriesESet = retriesESet;
		retriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIES, oldRetries, retries, !oldRetriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRetries() {
		int oldRetries = retries;
		boolean oldRetriesESet = retriesESet;
		retries = RETRIES_EDEFAULT;
		retriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIES, oldRetries, RETRIES_EDEFAULT, oldRetriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRetries() {
		return retriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryInterval(int newRetryInterval) {
		int oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		boolean oldRetryIntervalESet = retryIntervalESet;
		retryIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL, oldRetryInterval, retryInterval, !oldRetryIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRetryInterval() {
		int oldRetryInterval = retryInterval;
		boolean oldRetryIntervalESet = retryIntervalESet;
		retryInterval = RETRY_INTERVAL_EDEFAULT;
		retryIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL, oldRetryInterval, RETRY_INTERVAL_EDEFAULT, oldRetryIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRetryInterval() {
		return retryIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE:
				return getRetrieveDate();
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__LOCATION:
				return getLocation();
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIES:
				return getRetries();
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL:
				return getRetryInterval();
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
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE:
				setRetrieveDate((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__LOCATION:
				setLocation((String)newValue);
				return;
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIES:
				setRetries((Integer)newValue);
				return;
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL:
				setRetryInterval((Integer)newValue);
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
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE:
				setRetrieveDate(RETRIEVE_DATE_EDEFAULT);
				return;
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIES:
				unsetRetries();
				return;
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL:
				unsetRetryInterval();
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
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIEVE_DATE:
				return RETRIEVE_DATE_EDEFAULT == null ? retrieveDate != null : !RETRIEVE_DATE_EDEFAULT.equals(retrieveDate);
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRIES:
				return isSetRetries();
			case OcppChargePointPackage.UPDATE_FIRMWARE_REQUEST__RETRY_INTERVAL:
				return isSetRetryInterval();
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
		result.append(" (retrieveDate: ");
		result.append(retrieveDate);
		result.append(", location: ");
		result.append(location);
		result.append(", retries: ");
		if (retriesESet) result.append(retries); else result.append("<unset>");
		result.append(", retryInterval: ");
		if (retryIntervalESet) result.append(retryInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UpdateFirmwareRequestImpl
