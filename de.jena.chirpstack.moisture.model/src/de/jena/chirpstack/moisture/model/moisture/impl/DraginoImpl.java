/*
 */
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.Device;
import de.jena.chirpstack.moisture.model.moisture.Dragino;
import de.jena.chirpstack.moisture.model.moisture.Sensor;
import de.jena.chirpstack.moisture.model.moisture.Soil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ProviderImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dragino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl#getSoil <em>Soil</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DraginoImpl extends ProviderImpl implements Dragino {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The cached value of the '{@link #getSoil() <em>Soil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoil()
	 * @generated
	 * @ordered
	 */
	protected Soil soil;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DraginoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.DRAGINO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(Sensor newSensor, NotificationChain msgs) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DRAGINO__SENSOR, oldSensor, newSensor);
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
	public void setSensor(Sensor newSensor) {
		if (newSensor != sensor) {
			NotificationChain msgs = null;
			if (sensor != null)
				msgs = ((InternalEObject)sensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackMoisturePackage.DRAGINO__SENSOR, null, msgs);
			if (newSensor != null)
				msgs = ((InternalEObject)newSensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackMoisturePackage.DRAGINO__SENSOR, null, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DRAGINO__SENSOR, newSensor, newSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Soil getSoil() {
		return soil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoil(Soil newSoil, NotificationChain msgs) {
		Soil oldSoil = soil;
		soil = newSoil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DRAGINO__SOIL, oldSoil, newSoil);
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
	public void setSoil(Soil newSoil) {
		if (newSoil != soil) {
			NotificationChain msgs = null;
			if (soil != null)
				msgs = ((InternalEObject)soil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackMoisturePackage.DRAGINO__SOIL, null, msgs);
			if (newSoil != null)
				msgs = ((InternalEObject)newSoil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackMoisturePackage.DRAGINO__SOIL, null, msgs);
			msgs = basicSetSoil(newSoil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DRAGINO__SOIL, newSoil, newSoil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DRAGINO__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChirpstackMoisturePackage.DRAGINO__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChirpstackMoisturePackage.DRAGINO__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DRAGINO__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChirpstackMoisturePackage.DRAGINO__SENSOR:
				return basicSetSensor(null, msgs);
			case ChirpstackMoisturePackage.DRAGINO__SOIL:
				return basicSetSoil(null, msgs);
			case ChirpstackMoisturePackage.DRAGINO__DEVICE:
				return basicSetDevice(null, msgs);
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
			case ChirpstackMoisturePackage.DRAGINO__SENSOR:
				return getSensor();
			case ChirpstackMoisturePackage.DRAGINO__SOIL:
				return getSoil();
			case ChirpstackMoisturePackage.DRAGINO__DEVICE:
				return getDevice();
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
			case ChirpstackMoisturePackage.DRAGINO__SENSOR:
				setSensor((Sensor)newValue);
				return;
			case ChirpstackMoisturePackage.DRAGINO__SOIL:
				setSoil((Soil)newValue);
				return;
			case ChirpstackMoisturePackage.DRAGINO__DEVICE:
				setDevice((Device)newValue);
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
			case ChirpstackMoisturePackage.DRAGINO__SENSOR:
				setSensor((Sensor)null);
				return;
			case ChirpstackMoisturePackage.DRAGINO__SOIL:
				setSoil((Soil)null);
				return;
			case ChirpstackMoisturePackage.DRAGINO__DEVICE:
				setDevice((Device)null);
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
			case ChirpstackMoisturePackage.DRAGINO__SENSOR:
				return sensor != null;
			case ChirpstackMoisturePackage.DRAGINO__SOIL:
				return soil != null;
			case ChirpstackMoisturePackage.DRAGINO__DEVICE:
				return device != null;
		}
		return super.eIsSet(featureID);
	}

} //DraginoImpl
