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

import de.jena.model.sensinact.ttnprovider.NoiseData;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noise Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.NoiseDataImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.NoiseDataImpl#getDecible <em>Decible</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.NoiseDataImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.NoiseDataImpl#getTemperatureBoard <em>Temperature Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoiseDataImpl extends TtnServiceImpl implements NoiseData {
	/**
	 * The default value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BATTERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal battery = BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecible() <em>Decible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecible()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIBLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecible() <em>Decible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecible()
	 * @generated
	 * @ordered
	 */
	protected int decible = DECIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected int status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureBoard() <em>Temperature Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureBoard()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPERATURE_BOARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTemperatureBoard() <em>Temperature Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureBoard()
	 * @generated
	 * @ordered
	 */
	protected int temperatureBoard = TEMPERATURE_BOARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoiseDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtnSensorSensinactPackage.eINSTANCE.getNoiseData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBattery() {
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBattery(BigDecimal newBattery) {
		BigDecimal oldBattery = battery;
		battery = newBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.NOISE_DATA__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDecible() {
		return decible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecible(int newDecible) {
		int oldDecible = decible;
		decible = newDecible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.NOISE_DATA__DECIBLE, oldDecible, decible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(int newStatus) {
		int oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.NOISE_DATA__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTemperatureBoard() {
		return temperatureBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatureBoard(int newTemperatureBoard) {
		int oldTemperatureBoard = temperatureBoard;
		temperatureBoard = newTemperatureBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.NOISE_DATA__TEMPERATURE_BOARD, oldTemperatureBoard, temperatureBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TtnSensorSensinactPackage.NOISE_DATA__BATTERY:
				return getBattery();
			case TtnSensorSensinactPackage.NOISE_DATA__DECIBLE:
				return getDecible();
			case TtnSensorSensinactPackage.NOISE_DATA__STATUS:
				return getStatus();
			case TtnSensorSensinactPackage.NOISE_DATA__TEMPERATURE_BOARD:
				return getTemperatureBoard();
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
			case TtnSensorSensinactPackage.NOISE_DATA__BATTERY:
				setBattery((BigDecimal)newValue);
				return;
			case TtnSensorSensinactPackage.NOISE_DATA__DECIBLE:
				setDecible((Integer)newValue);
				return;
			case TtnSensorSensinactPackage.NOISE_DATA__STATUS:
				setStatus((Integer)newValue);
				return;
			case TtnSensorSensinactPackage.NOISE_DATA__TEMPERATURE_BOARD:
				setTemperatureBoard((Integer)newValue);
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
			case TtnSensorSensinactPackage.NOISE_DATA__BATTERY:
				setBattery(BATTERY_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.NOISE_DATA__DECIBLE:
				setDecible(DECIBLE_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.NOISE_DATA__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.NOISE_DATA__TEMPERATURE_BOARD:
				setTemperatureBoard(TEMPERATURE_BOARD_EDEFAULT);
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
			case TtnSensorSensinactPackage.NOISE_DATA__BATTERY:
				return BATTERY_EDEFAULT == null ? battery != null : !BATTERY_EDEFAULT.equals(battery);
			case TtnSensorSensinactPackage.NOISE_DATA__DECIBLE:
				return decible != DECIBLE_EDEFAULT;
			case TtnSensorSensinactPackage.NOISE_DATA__STATUS:
				return status != STATUS_EDEFAULT;
			case TtnSensorSensinactPackage.NOISE_DATA__TEMPERATURE_BOARD:
				return temperatureBoard != TEMPERATURE_BOARD_EDEFAULT;
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
		result.append(" (battery: ");
		result.append(battery);
		result.append(", decible: ");
		result.append(decible);
		result.append(", status: ");
		result.append(status);
		result.append(", temperatureBoard: ");
		result.append(temperatureBoard);
		result.append(')');
		return result.toString();
	}

} //NoiseDataImpl
