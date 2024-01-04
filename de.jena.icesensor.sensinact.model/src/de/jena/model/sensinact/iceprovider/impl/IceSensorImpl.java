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

import de.jena.model.sensinact.iceprovider.IceSensor;
import de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage;
import de.jena.model.sensinact.iceprovider.SensorData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ice Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getH2sugm3 <em>H2sugm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getCougm3 <em>Cougm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getNougm3 <em>Nougm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getO3ugm3 <em>O3ugm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#get_1p <em>1p</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getAqi_criteria <em>Aqi criteria</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#get_10p <em>10p</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getNo2ugm3 <em>No2ugm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#getAqi <em>Aqi</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.impl.IceSensorImpl#get_2_5p <em>25p</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IceSensorImpl extends ProviderImpl implements IceSensor {
	/**
	 * The cached value of the '{@link #getH2sugm3() <em>H2sugm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH2sugm3()
	 * @generated
	 * @ordered
	 */
	protected SensorData h2sugm3;

	/**
	 * The cached value of the '{@link #getCougm3() <em>Cougm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCougm3()
	 * @generated
	 * @ordered
	 */
	protected SensorData cougm3;

	/**
	 * The cached value of the '{@link #getNougm3() <em>Nougm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNougm3()
	 * @generated
	 * @ordered
	 */
	protected SensorData nougm3;

	/**
	 * The cached value of the '{@link #getO3ugm3() <em>O3ugm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO3ugm3()
	 * @generated
	 * @ordered
	 */
	protected SensorData o3ugm3;

	/**
	 * The cached value of the '{@link #get_1p() <em>1p</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_1p()
	 * @generated
	 * @ordered
	 */
	protected SensorData _1p;

	/**
	 * The cached value of the '{@link #getAqi_criteria() <em>Aqi criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAqi_criteria()
	 * @generated
	 * @ordered
	 */
	protected SensorData aqi_criteria;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected SensorData temperature;

	/**
	 * The cached value of the '{@link #getHumidity() <em>Humidity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected SensorData humidity;

	/**
	 * The cached value of the '{@link #get_10p() <em>10p</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_10p()
	 * @generated
	 * @ordered
	 */
	protected SensorData _10p;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected SensorData pressure;

	/**
	 * The cached value of the '{@link #getNo2ugm3() <em>No2ugm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo2ugm3()
	 * @generated
	 * @ordered
	 */
	protected SensorData no2ugm3;

	/**
	 * The cached value of the '{@link #getAqi() <em>Aqi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAqi()
	 * @generated
	 * @ordered
	 */
	protected SensorData aqi;

	/**
	 * The cached value of the '{@link #get_2_5p() <em>25p</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_2_5p()
	 * @generated
	 * @ordered
	 */
	protected SensorData _2_5p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IceSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IcesensoreSensinactPackage.Literals.ICE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getH2sugm3() {
		return h2sugm3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH2sugm3(SensorData newH2sugm3, NotificationChain msgs) {
		SensorData oldH2sugm3 = h2sugm3;
		h2sugm3 = newH2sugm3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3, oldH2sugm3, newH2sugm3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH2sugm3(SensorData newH2sugm3) {
		if (newH2sugm3 != h2sugm3) {
			NotificationChain msgs = null;
			if (h2sugm3 != null)
				msgs = ((InternalEObject)h2sugm3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3, null, msgs);
			if (newH2sugm3 != null)
				msgs = ((InternalEObject)newH2sugm3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3, null, msgs);
			msgs = basicSetH2sugm3(newH2sugm3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3, newH2sugm3, newH2sugm3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getCougm3() {
		return cougm3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCougm3(SensorData newCougm3, NotificationChain msgs) {
		SensorData oldCougm3 = cougm3;
		cougm3 = newCougm3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__COUGM3, oldCougm3, newCougm3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCougm3(SensorData newCougm3) {
		if (newCougm3 != cougm3) {
			NotificationChain msgs = null;
			if (cougm3 != null)
				msgs = ((InternalEObject)cougm3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__COUGM3, null, msgs);
			if (newCougm3 != null)
				msgs = ((InternalEObject)newCougm3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__COUGM3, null, msgs);
			msgs = basicSetCougm3(newCougm3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__COUGM3, newCougm3, newCougm3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getNougm3() {
		return nougm3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNougm3(SensorData newNougm3, NotificationChain msgs) {
		SensorData oldNougm3 = nougm3;
		nougm3 = newNougm3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3, oldNougm3, newNougm3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNougm3(SensorData newNougm3) {
		if (newNougm3 != nougm3) {
			NotificationChain msgs = null;
			if (nougm3 != null)
				msgs = ((InternalEObject)nougm3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3, null, msgs);
			if (newNougm3 != null)
				msgs = ((InternalEObject)newNougm3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3, null, msgs);
			msgs = basicSetNougm3(newNougm3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3, newNougm3, newNougm3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getO3ugm3() {
		return o3ugm3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetO3ugm3(SensorData newO3ugm3, NotificationChain msgs) {
		SensorData oldO3ugm3 = o3ugm3;
		o3ugm3 = newO3ugm3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3, oldO3ugm3, newO3ugm3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setO3ugm3(SensorData newO3ugm3) {
		if (newO3ugm3 != o3ugm3) {
			NotificationChain msgs = null;
			if (o3ugm3 != null)
				msgs = ((InternalEObject)o3ugm3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3, null, msgs);
			if (newO3ugm3 != null)
				msgs = ((InternalEObject)newO3ugm3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3, null, msgs);
			msgs = basicSetO3ugm3(newO3ugm3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3, newO3ugm3, newO3ugm3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData get_1p() {
		return _1p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_1p(SensorData new_1p, NotificationChain msgs) {
		SensorData old_1p = _1p;
		_1p = new_1p;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__1P, old_1p, new_1p);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_1p(SensorData new_1p) {
		if (new_1p != _1p) {
			NotificationChain msgs = null;
			if (_1p != null)
				msgs = ((InternalEObject)_1p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__1P, null, msgs);
			if (new_1p != null)
				msgs = ((InternalEObject)new_1p).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__1P, null, msgs);
			msgs = basicSet_1p(new_1p, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__1P, new_1p, new_1p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getAqi_criteria() {
		return aqi_criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAqi_criteria(SensorData newAqi_criteria, NotificationChain msgs) {
		SensorData oldAqi_criteria = aqi_criteria;
		aqi_criteria = newAqi_criteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA, oldAqi_criteria, newAqi_criteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAqi_criteria(SensorData newAqi_criteria) {
		if (newAqi_criteria != aqi_criteria) {
			NotificationChain msgs = null;
			if (aqi_criteria != null)
				msgs = ((InternalEObject)aqi_criteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA, null, msgs);
			if (newAqi_criteria != null)
				msgs = ((InternalEObject)newAqi_criteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA, null, msgs);
			msgs = basicSetAqi_criteria(newAqi_criteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA, newAqi_criteria, newAqi_criteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(SensorData newTemperature, NotificationChain msgs) {
		SensorData oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE, oldTemperature, newTemperature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(SensorData newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject)temperature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject)newTemperature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE, newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getHumidity() {
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHumidity(SensorData newHumidity, NotificationChain msgs) {
		SensorData oldHumidity = humidity;
		humidity = newHumidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY, oldHumidity, newHumidity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumidity(SensorData newHumidity) {
		if (newHumidity != humidity) {
			NotificationChain msgs = null;
			if (humidity != null)
				msgs = ((InternalEObject)humidity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY, null, msgs);
			if (newHumidity != null)
				msgs = ((InternalEObject)newHumidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY, null, msgs);
			msgs = basicSetHumidity(newHumidity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY, newHumidity, newHumidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData get_10p() {
		return _10p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_10p(SensorData new_10p, NotificationChain msgs) {
		SensorData old_10p = _10p;
		_10p = new_10p;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__10P, old_10p, new_10p);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_10p(SensorData new_10p) {
		if (new_10p != _10p) {
			NotificationChain msgs = null;
			if (_10p != null)
				msgs = ((InternalEObject)_10p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__10P, null, msgs);
			if (new_10p != null)
				msgs = ((InternalEObject)new_10p).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__10P, null, msgs);
			msgs = basicSet_10p(new_10p, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__10P, new_10p, new_10p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressure(SensorData newPressure, NotificationChain msgs) {
		SensorData oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE, oldPressure, newPressure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPressure(SensorData newPressure) {
		if (newPressure != pressure) {
			NotificationChain msgs = null;
			if (pressure != null)
				msgs = ((InternalEObject)pressure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE, null, msgs);
			if (newPressure != null)
				msgs = ((InternalEObject)newPressure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE, null, msgs);
			msgs = basicSetPressure(newPressure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE, newPressure, newPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getNo2ugm3() {
		return no2ugm3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNo2ugm3(SensorData newNo2ugm3, NotificationChain msgs) {
		SensorData oldNo2ugm3 = no2ugm3;
		no2ugm3 = newNo2ugm3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3, oldNo2ugm3, newNo2ugm3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNo2ugm3(SensorData newNo2ugm3) {
		if (newNo2ugm3 != no2ugm3) {
			NotificationChain msgs = null;
			if (no2ugm3 != null)
				msgs = ((InternalEObject)no2ugm3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3, null, msgs);
			if (newNo2ugm3 != null)
				msgs = ((InternalEObject)newNo2ugm3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3, null, msgs);
			msgs = basicSetNo2ugm3(newNo2ugm3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3, newNo2ugm3, newNo2ugm3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData getAqi() {
		return aqi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAqi(SensorData newAqi, NotificationChain msgs) {
		SensorData oldAqi = aqi;
		aqi = newAqi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__AQI, oldAqi, newAqi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAqi(SensorData newAqi) {
		if (newAqi != aqi) {
			NotificationChain msgs = null;
			if (aqi != null)
				msgs = ((InternalEObject)aqi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__AQI, null, msgs);
			if (newAqi != null)
				msgs = ((InternalEObject)newAqi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__AQI, null, msgs);
			msgs = basicSetAqi(newAqi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__AQI, newAqi, newAqi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData get_2_5p() {
		return _2_5p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_2_5p(SensorData new_2_5p, NotificationChain msgs) {
		SensorData old_2_5p = _2_5p;
		_2_5p = new_2_5p;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__25P, old_2_5p, new_2_5p);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_2_5p(SensorData new_2_5p) {
		if (new_2_5p != _2_5p) {
			NotificationChain msgs = null;
			if (_2_5p != null)
				msgs = ((InternalEObject)_2_5p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__25P, null, msgs);
			if (new_2_5p != null)
				msgs = ((InternalEObject)new_2_5p).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IcesensoreSensinactPackage.ICE_SENSOR__25P, null, msgs);
			msgs = basicSet_2_5p(new_2_5p, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IcesensoreSensinactPackage.ICE_SENSOR__25P, new_2_5p, new_2_5p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3:
				return basicSetH2sugm3(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__COUGM3:
				return basicSetCougm3(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3:
				return basicSetNougm3(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3:
				return basicSetO3ugm3(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__1P:
				return basicSet_1p(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA:
				return basicSetAqi_criteria(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE:
				return basicSetTemperature(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY:
				return basicSetHumidity(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__10P:
				return basicSet_10p(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE:
				return basicSetPressure(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3:
				return basicSetNo2ugm3(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI:
				return basicSetAqi(null, msgs);
			case IcesensoreSensinactPackage.ICE_SENSOR__25P:
				return basicSet_2_5p(null, msgs);
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
			case IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3:
				return getH2sugm3();
			case IcesensoreSensinactPackage.ICE_SENSOR__COUGM3:
				return getCougm3();
			case IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3:
				return getNougm3();
			case IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3:
				return getO3ugm3();
			case IcesensoreSensinactPackage.ICE_SENSOR__1P:
				return get_1p();
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA:
				return getAqi_criteria();
			case IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE:
				return getTemperature();
			case IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY:
				return getHumidity();
			case IcesensoreSensinactPackage.ICE_SENSOR__10P:
				return get_10p();
			case IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE:
				return getPressure();
			case IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3:
				return getNo2ugm3();
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI:
				return getAqi();
			case IcesensoreSensinactPackage.ICE_SENSOR__25P:
				return get_2_5p();
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
			case IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3:
				setH2sugm3((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__COUGM3:
				setCougm3((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3:
				setNougm3((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3:
				setO3ugm3((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__1P:
				set_1p((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA:
				setAqi_criteria((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE:
				setTemperature((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY:
				setHumidity((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__10P:
				set_10p((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE:
				setPressure((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3:
				setNo2ugm3((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI:
				setAqi((SensorData)newValue);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__25P:
				set_2_5p((SensorData)newValue);
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
			case IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3:
				setH2sugm3((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__COUGM3:
				setCougm3((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3:
				setNougm3((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3:
				setO3ugm3((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__1P:
				set_1p((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA:
				setAqi_criteria((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE:
				setTemperature((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY:
				setHumidity((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__10P:
				set_10p((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE:
				setPressure((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3:
				setNo2ugm3((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI:
				setAqi((SensorData)null);
				return;
			case IcesensoreSensinactPackage.ICE_SENSOR__25P:
				set_2_5p((SensorData)null);
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
			case IcesensoreSensinactPackage.ICE_SENSOR__H2SUGM3:
				return h2sugm3 != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__COUGM3:
				return cougm3 != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__NOUGM3:
				return nougm3 != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__O3UGM3:
				return o3ugm3 != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__1P:
				return _1p != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI_CRITERIA:
				return aqi_criteria != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__TEMPERATURE:
				return temperature != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__HUMIDITY:
				return humidity != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__10P:
				return _10p != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__PRESSURE:
				return pressure != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__NO2UGM3:
				return no2ugm3 != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__AQI:
				return aqi != null;
			case IcesensoreSensinactPackage.ICE_SENSOR__25P:
				return _2_5p != null;
		}
		return super.eIsSet(featureID);
	}

} //IceSensorImpl
