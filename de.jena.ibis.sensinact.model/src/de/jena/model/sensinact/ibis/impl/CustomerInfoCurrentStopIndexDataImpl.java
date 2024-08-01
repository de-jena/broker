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

import de.jena.model.sensinact.ibis.CustomerInfoCurrentStopIndexData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Info Current Stop Index Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopIndexDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopIndexDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopIndexDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentStopIndexDataImpl#getCurrentStopIndex <em>Current Stop Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInfoCurrentStopIndexDataImpl extends ServiceImpl implements CustomerInfoCurrentStopIndexData {
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
	 * The default value of the '{@link #getCurrentStopIndex() <em>Current Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_STOP_INDEX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getCurrentStopIndex() <em>Current Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStopIndex()
	 * @generated
	 * @ordered
	 */
	protected int currentStopIndex = CURRENT_STOP_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInfoCurrentStopIndexDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentStopIndex() {
		return currentStopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStopIndex(int newCurrentStopIndex) {
		int oldCurrentStopIndex = currentStopIndex;
		currentStopIndex = newCurrentStopIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX, oldCurrentStopIndex, currentStopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				return getCurrentStopIndex();
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex((Integer)newValue);
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				setCurrentStopIndex(CURRENT_STOP_INDEX_EDEFAULT);
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_STOP_INDEX_DATA__CURRENT_STOP_INDEX:
				return currentStopIndex != CURRENT_STOP_INDEX_EDEFAULT;
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
		result.append(", currentStopIndex: ");
		result.append(currentStopIndex);
		result.append(')');
		return result.toString();
	}

} //CustomerInfoCurrentStopIndexDataImpl
