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
package de.jena.model.sensinact.ttnprovider.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

import de.jena.model.sensinact.ttnprovider.SensorData;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SensorDataImpl#getRawPayload <em>Raw Payload</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SensorDataImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SensorDataImpl#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDataImpl extends ServiceImpl implements SensorData {
	/**
	 * The default value of the '{@link #getRawPayload() <em>Raw Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawPayload()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_PAYLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawPayload() <em>Raw Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawPayload()
	 * @generated
	 * @ordered
	 */
	protected String rawPayload = RAW_PAYLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Object> payload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtnSensorSensinactPackage.eINSTANCE.getSensorData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRawPayload() {
		return rawPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRawPayload(String newRawPayload) {
		String oldRawPayload = rawPayload;
		rawPayload = newRawPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SENSOR_DATA__RAW_PAYLOAD, oldRawPayload, rawPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGateway(String newGateway) {
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SENSOR_DATA__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Object> getPayload() {
		if (payload == null) {
			payload = new EcoreEMap<String,Object>(TtnSensorSensinactPackage.eINSTANCE.getStringToObjectMap(), StringToObjectMapImpl.class, this, TtnSensorSensinactPackage.SENSOR_DATA__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtnSensorSensinactPackage.SENSOR_DATA__PAYLOAD:
				return ((InternalEList<?>)getPayload()).basicRemove(otherEnd, msgs);
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
			case TtnSensorSensinactPackage.SENSOR_DATA__RAW_PAYLOAD:
				return getRawPayload();
			case TtnSensorSensinactPackage.SENSOR_DATA__GATEWAY:
				return getGateway();
			case TtnSensorSensinactPackage.SENSOR_DATA__PAYLOAD:
				if (coreType) return getPayload();
				else return getPayload().map();
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
			case TtnSensorSensinactPackage.SENSOR_DATA__RAW_PAYLOAD:
				setRawPayload((String)newValue);
				return;
			case TtnSensorSensinactPackage.SENSOR_DATA__GATEWAY:
				setGateway((String)newValue);
				return;
			case TtnSensorSensinactPackage.SENSOR_DATA__PAYLOAD:
				((EStructuralFeature.Setting)getPayload()).set(newValue);
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
			case TtnSensorSensinactPackage.SENSOR_DATA__RAW_PAYLOAD:
				setRawPayload(RAW_PAYLOAD_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.SENSOR_DATA__GATEWAY:
				setGateway(GATEWAY_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.SENSOR_DATA__PAYLOAD:
				getPayload().clear();
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
			case TtnSensorSensinactPackage.SENSOR_DATA__RAW_PAYLOAD:
				return RAW_PAYLOAD_EDEFAULT == null ? rawPayload != null : !RAW_PAYLOAD_EDEFAULT.equals(rawPayload);
			case TtnSensorSensinactPackage.SENSOR_DATA__GATEWAY:
				return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
			case TtnSensorSensinactPackage.SENSOR_DATA__PAYLOAD:
				return payload != null && !payload.isEmpty();
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
		result.append(" (rawPayload: ");
		result.append(rawPayload);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(')');
		return result.toString();
	}

} //SensorDataImpl
