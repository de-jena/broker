/*
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.TrafficLightModuleLML;
import de.dim.trafficos.model.device.TrafficLightSignalTransmitter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light Module LML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightModuleLMLImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightModuleLMLImpl#getA <em>A</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightModuleLMLImpl#getB <em>B</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.TrafficLightModuleLMLImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightModuleLMLImpl extends MinimalEObjectImpl.Container implements TrafficLightModuleLML {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected int address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightSignalTransmitter a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightSignalTransmitter b;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightSignalTransmitter c;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightModuleLMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.TRAFFIC_LIGHT_MODULE_LML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(int newAddress) {
		int oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSignalTransmitter getA() {
		if (a != null && a.eIsProxy()) {
			InternalEObject oldA = (InternalEObject)a;
			a = (TrafficLightSignalTransmitter)eResolveProxy(oldA);
			if (a != oldA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSignalTransmitter basicGetA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setA(TrafficLightSignalTransmitter newA) {
		TrafficLightSignalTransmitter oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSignalTransmitter getB() {
		if (b != null && b.eIsProxy()) {
			InternalEObject oldB = (InternalEObject)b;
			b = (TrafficLightSignalTransmitter)eResolveProxy(oldB);
			if (b != oldB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__B, oldB, b));
			}
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSignalTransmitter basicGetB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setB(TrafficLightSignalTransmitter newB) {
		TrafficLightSignalTransmitter oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSignalTransmitter getC() {
		if (c != null && c.eIsProxy()) {
			InternalEObject oldC = (InternalEObject)c;
			c = (TrafficLightSignalTransmitter)eResolveProxy(oldC);
			if (c != oldC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__C, oldC, c));
			}
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSignalTransmitter basicGetC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setC(TrafficLightSignalTransmitter newC) {
		TrafficLightSignalTransmitter oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__ADDRESS:
				return getAddress();
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__A:
				if (resolve) return getA();
				return basicGetA();
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__B:
				if (resolve) return getB();
				return basicGetB();
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__C:
				if (resolve) return getC();
				return basicGetC();
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
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__ADDRESS:
				setAddress((Integer)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__A:
				setA((TrafficLightSignalTransmitter)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__B:
				setB((TrafficLightSignalTransmitter)newValue);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__C:
				setC((TrafficLightSignalTransmitter)newValue);
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
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__A:
				setA((TrafficLightSignalTransmitter)null);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__B:
				setB((TrafficLightSignalTransmitter)null);
				return;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__C:
				setC((TrafficLightSignalTransmitter)null);
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
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__ADDRESS:
				return address != ADDRESS_EDEFAULT;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__A:
				return a != null;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__B:
				return b != null;
			case TOSDevicePackage.TRAFFIC_LIGHT_MODULE_LML__C:
				return c != null;
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
		result.append(" (address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //TrafficLightModuleLMLImpl
