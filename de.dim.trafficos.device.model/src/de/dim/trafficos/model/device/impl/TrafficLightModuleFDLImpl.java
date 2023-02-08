/*
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.TrafficLightModuleFDL;
import de.dim.trafficos.model.device.TrafficLightSignalTransmitter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light Module FDL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightModuleFDLImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightModuleFDLImpl extends TrafficLightModuleLMLImpl implements TrafficLightModuleFDL {
	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightSignalTransmitter d;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightModuleFDLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.TRAFFIC_LIGHT_MODULE_FDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSignalTransmitter getD() {
		if (d != null && d.eIsProxy()) {
			InternalEObject oldD = (InternalEObject)d;
			d = (TrafficLightSignalTransmitter)eResolveProxy(oldD);
			if (d != oldD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_FDL__D, oldD, d));
			}
		}
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSignalTransmitter basicGetD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setD(TrafficLightSignalTransmitter newD) {
		TrafficLightSignalTransmitter oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_FDL__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_FDL__D:
				if (resolve) return getD();
				return basicGetD();
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
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_FDL__D:
				setD((TrafficLightSignalTransmitter)newValue);
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
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_FDL__D:
				setD((TrafficLightSignalTransmitter)null);
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
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_FDL__D:
				return d != null;
		}
		return super.eIsSet(featureID);
	}

} //TrafficLightModuleFDLImpl
