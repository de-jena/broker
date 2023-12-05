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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Values Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.MeterValuesRequestImpl#getMeterValue <em>Meter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterValuesRequestImpl extends MinimalEObjectImpl.Container implements MeterValuesRequest {
	/**
	 * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected int connectorId = CONNECTOR_ID_EDEFAULT;

	/**
	 * This is true if the Connector Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectorIdESet;

	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected int transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * This is true if the Transaction Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionIdESet;

	/**
	 * The cached value of the '{@link #getMeterValue() <em>Meter Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> meterValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterValuesRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.METER_VALUES_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectorId() {
		return connectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorId(int newConnectorId) {
		int oldConnectorId = connectorId;
		connectorId = newConnectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.METER_VALUES_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectorId() {
		int oldConnectorId = connectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorId = CONNECTOR_ID_EDEFAULT;
		connectorIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.METER_VALUES_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectorId() {
		return connectorIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(int newTransactionId) {
		int oldTransactionId = transactionId;
		transactionId = newTransactionId;
		boolean oldTransactionIdESet = transactionIdESet;
		transactionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.METER_VALUES_REQUEST__TRANSACTION_ID, oldTransactionId, transactionId, !oldTransactionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTransactionId() {
		int oldTransactionId = transactionId;
		boolean oldTransactionIdESet = transactionIdESet;
		transactionId = TRANSACTION_ID_EDEFAULT;
		transactionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.METER_VALUES_REQUEST__TRANSACTION_ID, oldTransactionId, TRANSACTION_ID_EDEFAULT, oldTransactionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTransactionId() {
		return transactionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getMeterValue() {
		if (meterValue == null) {
			meterValue = new EDataTypeEList<Object>(Object.class, this, OcppCentralSystemPackage.METER_VALUES_REQUEST__METER_VALUE);
		}
		return meterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__CONNECTOR_ID:
				return getConnectorId();
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__TRANSACTION_ID:
				return getTransactionId();
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__METER_VALUE:
				return getMeterValue();
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
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
				return;
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__TRANSACTION_ID:
				setTransactionId((Integer)newValue);
				return;
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__METER_VALUE:
				getMeterValue().clear();
				getMeterValue().addAll((Collection<? extends Object>)newValue);
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
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
				return;
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__TRANSACTION_ID:
				unsetTransactionId();
				return;
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__METER_VALUE:
				getMeterValue().clear();
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
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__TRANSACTION_ID:
				return isSetTransactionId();
			case OcppCentralSystemPackage.METER_VALUES_REQUEST__METER_VALUE:
				return meterValue != null && !meterValue.isEmpty();
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
		result.append(" (connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(", transactionId: ");
		if (transactionIdESet) result.append(transactionId); else result.append("<unset>");
		result.append(", meterValue: ");
		result.append(meterValue);
		result.append(')');
		return result.toString();
	}

} //MeterValuesRequestImpl
