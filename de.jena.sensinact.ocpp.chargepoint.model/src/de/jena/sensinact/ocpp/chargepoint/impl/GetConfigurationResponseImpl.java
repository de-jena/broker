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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse;
import de.jena.sensinact.ocpp.chargepoint.KeyValue;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Configuration Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationResponseImpl#getConfigurationKey <em>Configuration Key</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.GetConfigurationResponseImpl#getUnknownKey <em>Unknown Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetConfigurationResponseImpl extends MinimalEObjectImpl.Container implements GetConfigurationResponse {
	/**
	 * The cached value of the '{@link #getConfigurationKey() <em>Configuration Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKey()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValue> configurationKey;

	/**
	 * The cached value of the '{@link #getUnknownKey() <em>Unknown Key</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownKey()
	 * @generated
	 * @ordered
	 */
	protected EList<String> unknownKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetConfigurationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.GET_CONFIGURATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValue> getConfigurationKey() {
		if (configurationKey == null) {
			configurationKey = new EObjectContainmentEList<KeyValue>(KeyValue.class, this, OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY);
		}
		return configurationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUnknownKey() {
		if (unknownKey == null) {
			unknownKey = new EDataTypeEList<String>(String.class, this, OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY);
		}
		return unknownKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY:
				return ((InternalEList<?>)getConfigurationKey()).basicRemove(otherEnd, msgs);
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
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY:
				return getConfigurationKey();
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY:
				return getUnknownKey();
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
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY:
				getConfigurationKey().clear();
				getConfigurationKey().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY:
				getUnknownKey().clear();
				getUnknownKey().addAll((Collection<? extends String>)newValue);
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
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY:
				getConfigurationKey().clear();
				return;
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY:
				getUnknownKey().clear();
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
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__CONFIGURATION_KEY:
				return configurationKey != null && !configurationKey.isEmpty();
			case OcppChargePointPackage.GET_CONFIGURATION_RESPONSE__UNKNOWN_KEY:
				return unknownKey != null && !unknownKey.isEmpty();
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
		result.append(" (unknownKey: ");
		result.append(unknownKey);
		result.append(')');
		return result.toString();
	}

} //GetConfigurationResponseImpl
