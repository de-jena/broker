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
package de.jena.sensinact.ocpp.centralsystem.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import de.jena.sensinact.ocpp.centralsystem.MeterValue;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValueImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValueImpl#getSampledValue <em>Sampled Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterValueImpl extends MinimalEObjectImpl.Container implements MeterValue {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSampledValue() <em>Sampled Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampledValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> sampledValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.METER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.METER_VALUE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getSampledValue() {
		if (sampledValue == null) {
			sampledValue = new EDataTypeEList<Object>(Object.class, this, OcppCentralSystemPackage.METER_VALUE__SAMPLED_VALUE);
		}
		return sampledValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.METER_VALUE__TIMESTAMP:
				return getTimestamp();
			case OcppCentralSystemPackage.METER_VALUE__SAMPLED_VALUE:
				return getSampledValue();
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
			case OcppCentralSystemPackage.METER_VALUE__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case OcppCentralSystemPackage.METER_VALUE__SAMPLED_VALUE:
				getSampledValue().clear();
				getSampledValue().addAll((Collection<? extends Object>)newValue);
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
			case OcppCentralSystemPackage.METER_VALUE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case OcppCentralSystemPackage.METER_VALUE__SAMPLED_VALUE:
				getSampledValue().clear();
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
			case OcppCentralSystemPackage.METER_VALUE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case OcppCentralSystemPackage.METER_VALUE__SAMPLED_VALUE:
				return sampledValue != null && !sampledValue.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", sampledValue: ");
		result.append(sampledValue);
		result.append(')');
		return result.toString();
	}

} //MeterValueImpl
