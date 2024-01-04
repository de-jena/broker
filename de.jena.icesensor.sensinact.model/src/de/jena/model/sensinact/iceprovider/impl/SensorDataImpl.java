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
package de.jena.model.sensinact.iceprovider.impl;

import de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage;
import de.jena.model.sensinact.iceprovider.SensorData;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getSensor_type <em>Sensor type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getSensor_model <em>Sensor model</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getAvg <em>Avg</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getMin <em>Min</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getMax <em>Max</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.SensorDataImpl#getStr_data <em>Str data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDataImpl extends ServiceImpl implements SensorData {
	/**
	 * The default value of the '{@link #getSensor_type() <em>Sensor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor_type()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensor_type() <em>Sensor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor_type()
	 * @generated
	 * @ordered
	 */
	protected String sensor_type = SENSOR_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSensor_model() <em>Sensor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor_model()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensor_model() <em>Sensor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor_model()
	 * @generated
	 * @ordered
	 */
	protected String sensor_model = SENSOR_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvg() <em>Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvg() <em>Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg()
	 * @generated
	 * @ordered
	 */
	protected double avg = AVG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final int VALIDITY_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected int validity = VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected Date created_at = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStr_data() <em>Str data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr_data()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStr_data() <em>Str data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr_data()
	 * @generated
	 * @ordered
	 */
	protected String str_data = STR_DATA_EDEFAULT;

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
		return IcesensoreSensinactPackage.Literals.SENSOR_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensor_type() {
		return sensor_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor_type(String newSensor_type) {
		String oldSensor_type = sensor_type;
		sensor_type = newSensor_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_TYPE, oldSensor_type, sensor_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensor_model() {
		return sensor_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor_model(String newSensor_model) {
		String oldSensor_model = sensor_model;
		sensor_model = newSensor_model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_MODEL, oldSensor_model, sensor_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAvg() {
		return avg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvg(double newAvg) {
		double oldAvg = avg;
		avg = newAvg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__AVG, oldAvg, avg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidity(int newValidity) {
		int oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__VALIDITY, oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated_at(Date newCreated_at) {
		Date oldCreated_at = created_at;
		created_at = newCreated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStr_data() {
		return str_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStr_data(String newStr_data) {
		String oldStr_data = str_data;
		str_data = newStr_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.SENSOR_DATA__STR_DATA, oldStr_data, str_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_TYPE:
				return getSensor_type();
			case IcesensoreSensinactPackage.SENSOR_DATA__GATEWAY:
				return getGateway();
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_MODEL:
				return getSensor_model();
			case IcesensoreSensinactPackage.SENSOR_DATA__AVG:
				return getAvg();
			case IcesensoreSensinactPackage.SENSOR_DATA__MIN:
				return getMin();
			case IcesensoreSensinactPackage.SENSOR_DATA__MAX:
				return getMax();
			case IcesensoreSensinactPackage.SENSOR_DATA__UNIT:
				return getUnit();
			case IcesensoreSensinactPackage.SENSOR_DATA__VALIDITY:
				return getValidity();
			case IcesensoreSensinactPackage.SENSOR_DATA__CREATED_AT:
				return getCreated_at();
			case IcesensoreSensinactPackage.SENSOR_DATA__STR_DATA:
				return getStr_data();
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
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_TYPE:
				setSensor_type((String)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__GATEWAY:
				setGateway((String)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_MODEL:
				setSensor_model((String)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__AVG:
				setAvg((Double)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__MIN:
				setMin((Double)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__MAX:
				setMax((Double)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__UNIT:
				setUnit((String)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__VALIDITY:
				setValidity((Integer)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__CREATED_AT:
				setCreated_at((Date)newValue);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__STR_DATA:
				setStr_data((String)newValue);
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
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_TYPE:
				setSensor_type(SENSOR_TYPE_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__GATEWAY:
				setGateway(GATEWAY_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_MODEL:
				setSensor_model(SENSOR_MODEL_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__AVG:
				setAvg(AVG_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__VALIDITY:
				setValidity(VALIDITY_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case IcesensoreSensinactPackage.SENSOR_DATA__STR_DATA:
				setStr_data(STR_DATA_EDEFAULT);
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
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_TYPE:
				return SENSOR_TYPE_EDEFAULT == null ? sensor_type != null : !SENSOR_TYPE_EDEFAULT.equals(sensor_type);
			case IcesensoreSensinactPackage.SENSOR_DATA__GATEWAY:
				return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
			case IcesensoreSensinactPackage.SENSOR_DATA__SENSOR_MODEL:
				return SENSOR_MODEL_EDEFAULT == null ? sensor_model != null : !SENSOR_MODEL_EDEFAULT.equals(sensor_model);
			case IcesensoreSensinactPackage.SENSOR_DATA__AVG:
				return avg != AVG_EDEFAULT;
			case IcesensoreSensinactPackage.SENSOR_DATA__MIN:
				return min != MIN_EDEFAULT;
			case IcesensoreSensinactPackage.SENSOR_DATA__MAX:
				return max != MAX_EDEFAULT;
			case IcesensoreSensinactPackage.SENSOR_DATA__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case IcesensoreSensinactPackage.SENSOR_DATA__VALIDITY:
				return validity != VALIDITY_EDEFAULT;
			case IcesensoreSensinactPackage.SENSOR_DATA__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case IcesensoreSensinactPackage.SENSOR_DATA__STR_DATA:
				return STR_DATA_EDEFAULT == null ? str_data != null : !STR_DATA_EDEFAULT.equals(str_data);
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
		result.append(" (sensor_type: ");
		result.append(sensor_type);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(", sensor_model: ");
		result.append(sensor_model);
		result.append(", avg: ");
		result.append(avg);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", unit: ");
		result.append(unit);
		result.append(", validity: ");
		result.append(validity);
		result.append(", created_at: ");
		result.append(created_at);
		result.append(", str_data: ");
		result.append(str_data);
		result.append(')');
		return result.toString();
	}

} //SensorDataImpl
