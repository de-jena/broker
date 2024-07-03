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
package de.jena.model.icesensor.impl;

import de.jena.model.icesensor.IcesensorPackage;
import de.jena.model.icesensor.SensorData;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getSensor_type <em>Sensor type</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getSensor_model <em>Sensor model</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getAvg <em>Avg</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getMin <em>Min</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getMax <em>Max</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link de.jena.model.icesensor.impl.SensorDataImpl#getStr_data <em>Str data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDataImpl extends MinimalEObjectImpl.Container implements SensorData {
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
	 * This is true if the Sensor type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensor_typeESet;

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
	 * This is true if the Gateway attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gatewayESet;

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
	 * This is true if the Sensor model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensor_modelESet;

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
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final int VALIDITY_EDEFAULT = 0;

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
	 * This is true if the Validity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validityESet;

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
	 * This is true if the Created at attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean created_atESet;

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
	 * This is true if the Str data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean str_dataESet;

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
		return IcesensorPackage.Literals.SENSOR_DATA;
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
		boolean oldSensor_typeESet = sensor_typeESet;
		sensor_typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__SENSOR_TYPE, oldSensor_type, sensor_type, !oldSensor_typeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSensor_type() {
		String oldSensor_type = sensor_type;
		boolean oldSensor_typeESet = sensor_typeESet;
		sensor_type = SENSOR_TYPE_EDEFAULT;
		sensor_typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__SENSOR_TYPE, oldSensor_type, SENSOR_TYPE_EDEFAULT, oldSensor_typeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSensor_type() {
		return sensor_typeESet;
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
		boolean oldGatewayESet = gatewayESet;
		gatewayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__GATEWAY, oldGateway, gateway, !oldGatewayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGateway() {
		String oldGateway = gateway;
		boolean oldGatewayESet = gatewayESet;
		gateway = GATEWAY_EDEFAULT;
		gatewayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__GATEWAY, oldGateway, GATEWAY_EDEFAULT, oldGatewayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGateway() {
		return gatewayESet;
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
		boolean oldSensor_modelESet = sensor_modelESet;
		sensor_modelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__SENSOR_MODEL, oldSensor_model, sensor_model, !oldSensor_modelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSensor_model() {
		String oldSensor_model = sensor_model;
		boolean oldSensor_modelESet = sensor_modelESet;
		sensor_model = SENSOR_MODEL_EDEFAULT;
		sensor_modelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__SENSOR_MODEL, oldSensor_model, SENSOR_MODEL_EDEFAULT, oldSensor_modelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSensor_model() {
		return sensor_modelESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__AVG, oldAvg, avg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__MIN, oldMin, min));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__MAX, oldMax, max));
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
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnit() {
		String oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnit() {
		return unitESet;
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
		boolean oldValidityESet = validityESet;
		validityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__VALIDITY, oldValidity, validity, !oldValidityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValidity() {
		int oldValidity = validity;
		boolean oldValidityESet = validityESet;
		validity = VALIDITY_EDEFAULT;
		validityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__VALIDITY, oldValidity, VALIDITY_EDEFAULT, oldValidityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValidity() {
		return validityESet;
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
		boolean oldCreated_atESet = created_atESet;
		created_atESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__CREATED_AT, oldCreated_at, created_at, !oldCreated_atESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCreated_at() {
		Date oldCreated_at = created_at;
		boolean oldCreated_atESet = created_atESet;
		created_at = CREATED_AT_EDEFAULT;
		created_atESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__CREATED_AT, oldCreated_at, CREATED_AT_EDEFAULT, oldCreated_atESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCreated_at() {
		return created_atESet;
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
		boolean oldStr_dataESet = str_dataESet;
		str_dataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensorPackage.SENSOR_DATA__STR_DATA, oldStr_data, str_data, !oldStr_dataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStr_data() {
		String oldStr_data = str_data;
		boolean oldStr_dataESet = str_dataESet;
		str_data = STR_DATA_EDEFAULT;
		str_dataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IcesensorPackage.SENSOR_DATA__STR_DATA, oldStr_data, STR_DATA_EDEFAULT, oldStr_dataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStr_data() {
		return str_dataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IcesensorPackage.SENSOR_DATA__SENSOR_TYPE:
				return getSensor_type();
			case IcesensorPackage.SENSOR_DATA__GATEWAY:
				return getGateway();
			case IcesensorPackage.SENSOR_DATA__SENSOR_MODEL:
				return getSensor_model();
			case IcesensorPackage.SENSOR_DATA__AVG:
				return getAvg();
			case IcesensorPackage.SENSOR_DATA__MIN:
				return getMin();
			case IcesensorPackage.SENSOR_DATA__MAX:
				return getMax();
			case IcesensorPackage.SENSOR_DATA__UNIT:
				return getUnit();
			case IcesensorPackage.SENSOR_DATA__VALIDITY:
				return getValidity();
			case IcesensorPackage.SENSOR_DATA__CREATED_AT:
				return getCreated_at();
			case IcesensorPackage.SENSOR_DATA__STR_DATA:
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
			case IcesensorPackage.SENSOR_DATA__SENSOR_TYPE:
				setSensor_type((String)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__GATEWAY:
				setGateway((String)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__SENSOR_MODEL:
				setSensor_model((String)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__AVG:
				setAvg((Double)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__MIN:
				setMin((Double)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__MAX:
				setMax((Double)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__UNIT:
				setUnit((String)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__VALIDITY:
				setValidity((Integer)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__CREATED_AT:
				setCreated_at((Date)newValue);
				return;
			case IcesensorPackage.SENSOR_DATA__STR_DATA:
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
			case IcesensorPackage.SENSOR_DATA__SENSOR_TYPE:
				unsetSensor_type();
				return;
			case IcesensorPackage.SENSOR_DATA__GATEWAY:
				unsetGateway();
				return;
			case IcesensorPackage.SENSOR_DATA__SENSOR_MODEL:
				unsetSensor_model();
				return;
			case IcesensorPackage.SENSOR_DATA__AVG:
				setAvg(AVG_EDEFAULT);
				return;
			case IcesensorPackage.SENSOR_DATA__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case IcesensorPackage.SENSOR_DATA__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case IcesensorPackage.SENSOR_DATA__UNIT:
				unsetUnit();
				return;
			case IcesensorPackage.SENSOR_DATA__VALIDITY:
				unsetValidity();
				return;
			case IcesensorPackage.SENSOR_DATA__CREATED_AT:
				unsetCreated_at();
				return;
			case IcesensorPackage.SENSOR_DATA__STR_DATA:
				unsetStr_data();
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
			case IcesensorPackage.SENSOR_DATA__SENSOR_TYPE:
				return isSetSensor_type();
			case IcesensorPackage.SENSOR_DATA__GATEWAY:
				return isSetGateway();
			case IcesensorPackage.SENSOR_DATA__SENSOR_MODEL:
				return isSetSensor_model();
			case IcesensorPackage.SENSOR_DATA__AVG:
				return avg != AVG_EDEFAULT;
			case IcesensorPackage.SENSOR_DATA__MIN:
				return min != MIN_EDEFAULT;
			case IcesensorPackage.SENSOR_DATA__MAX:
				return max != MAX_EDEFAULT;
			case IcesensorPackage.SENSOR_DATA__UNIT:
				return isSetUnit();
			case IcesensorPackage.SENSOR_DATA__VALIDITY:
				return isSetValidity();
			case IcesensorPackage.SENSOR_DATA__CREATED_AT:
				return isSetCreated_at();
			case IcesensorPackage.SENSOR_DATA__STR_DATA:
				return isSetStr_data();
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
		if (sensor_typeESet) result.append(sensor_type); else result.append("<unset>");
		result.append(", gateway: ");
		if (gatewayESet) result.append(gateway); else result.append("<unset>");
		result.append(", sensor_model: ");
		if (sensor_modelESet) result.append(sensor_model); else result.append("<unset>");
		result.append(", avg: ");
		result.append(avg);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(", validity: ");
		if (validityESet) result.append(validity); else result.append("<unset>");
		result.append(", created_at: ");
		if (created_atESet) result.append(created_at); else result.append("<unset>");
		result.append(", str_data: ");
		if (str_dataESet) result.append(str_data); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SensorDataImpl
