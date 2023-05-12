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

import de.jena.model.sensinact.ttnprovider.SoilMoistureData;
import de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soil Moisture Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl#getPh <em>Ph</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl#getWater <em>Water</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.impl.SoilMoistureDataImpl#getConductivity <em>Conductivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoilMoistureDataImpl extends TtnServiceImpl implements SoilMoistureData {
	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPERATURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected int temperature = TEMPERATURE_EDEFAULT;

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
	 * The default value of the '{@link #getPh() <em>Ph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPh()
	 * @generated
	 * @ordered
	 */
	protected static final String PH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPh() <em>Ph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPh()
	 * @generated
	 * @ordered
	 */
	protected String ph = PH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWater() <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected String water = WATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConductivity() <em>Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductivity()
	 * @generated
	 * @ordered
	 */
	protected static final int CONDUCTIVITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConductivity() <em>Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductivity()
	 * @generated
	 * @ordered
	 */
	protected int conductivity = CONDUCTIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoilMoistureDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtnSensorSensinactPackage.eINSTANCE.getSoilMoistureData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(int newTemperature) {
		int oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__TEMPERATURE, oldTemperature, temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPh() {
		return ph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPh(String newPh) {
		String oldPh = ph;
		ph = newPh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__PH, oldPh, ph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWater() {
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWater(String newWater) {
		String oldWater = water;
		water = newWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__WATER, oldWater, water));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConductivity() {
		return conductivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConductivity(int newConductivity) {
		int oldConductivity = conductivity;
		conductivity = newConductivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__CONDUCTIVITY, oldConductivity, conductivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__TEMPERATURE:
				return getTemperature();
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__BATTERY:
				return getBattery();
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__PH:
				return getPh();
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__WATER:
				return getWater();
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__CONDUCTIVITY:
				return getConductivity();
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
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__TEMPERATURE:
				setTemperature((Integer)newValue);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__BATTERY:
				setBattery((BigDecimal)newValue);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__PH:
				setPh((String)newValue);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__WATER:
				setWater((String)newValue);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__CONDUCTIVITY:
				setConductivity((Integer)newValue);
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
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__BATTERY:
				setBattery(BATTERY_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__PH:
				setPh(PH_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__WATER:
				setWater(WATER_EDEFAULT);
				return;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__CONDUCTIVITY:
				setConductivity(CONDUCTIVITY_EDEFAULT);
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
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__BATTERY:
				return BATTERY_EDEFAULT == null ? battery != null : !BATTERY_EDEFAULT.equals(battery);
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__PH:
				return PH_EDEFAULT == null ? ph != null : !PH_EDEFAULT.equals(ph);
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__WATER:
				return WATER_EDEFAULT == null ? water != null : !WATER_EDEFAULT.equals(water);
			case TtnSensorSensinactPackage.SOIL_MOISTURE_DATA__CONDUCTIVITY:
				return conductivity != CONDUCTIVITY_EDEFAULT;
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
		result.append(" (temperature: ");
		result.append(temperature);
		result.append(", battery: ");
		result.append(battery);
		result.append(", ph: ");
		result.append(ph);
		result.append(", water: ");
		result.append(water);
		result.append(", conductivity: ");
		result.append(conductivity);
		result.append(')');
		return result.toString();
	}

} //SoilMoistureDataImpl
