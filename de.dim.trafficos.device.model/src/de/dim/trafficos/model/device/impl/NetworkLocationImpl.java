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
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.NetworkLocation;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.NetworkLocationImpl#getIp4Address <em>Ip4 Address</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.NetworkLocationImpl#getIp6Address <em>Ip6 Address</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.NetworkLocationImpl#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkLocationImpl extends LocationImpl implements NetworkLocation {
	/**
	 * The default value of the '{@link #getIp4Address() <em>Ip4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IP4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp4Address() <em>Ip4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp4Address()
	 * @generated
	 * @ordered
	 */
	protected String ip4Address = IP4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp6Address() <em>Ip6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp6Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IP6_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp6Address() <em>Ip6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp6Address()
	 * @generated
	 * @ordered
	 */
	protected String ip6Address = IP6_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.NETWORK_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp4Address() {
		return ip4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp4Address(String newIp4Address) {
		String oldIp4Address = ip4Address;
		ip4Address = newIp4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.NETWORK_LOCATION__IP4_ADDRESS, oldIp4Address, ip4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp6Address() {
		return ip6Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp6Address(String newIp6Address) {
		String oldIp6Address = ip6Address;
		ip6Address = newIp6Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.NETWORK_LOCATION__IP6_ADDRESS, oldIp6Address, ip6Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.NETWORK_LOCATION__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.NETWORK_LOCATION__IP4_ADDRESS:
				return getIp4Address();
			case TOSDevicePackage.NETWORK_LOCATION__IP6_ADDRESS:
				return getIp6Address();
			case TOSDevicePackage.NETWORK_LOCATION__HOSTNAME:
				return getHostname();
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
			case TOSDevicePackage.NETWORK_LOCATION__IP4_ADDRESS:
				setIp4Address((String)newValue);
				return;
			case TOSDevicePackage.NETWORK_LOCATION__IP6_ADDRESS:
				setIp6Address((String)newValue);
				return;
			case TOSDevicePackage.NETWORK_LOCATION__HOSTNAME:
				setHostname((String)newValue);
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
			case TOSDevicePackage.NETWORK_LOCATION__IP4_ADDRESS:
				setIp4Address(IP4_ADDRESS_EDEFAULT);
				return;
			case TOSDevicePackage.NETWORK_LOCATION__IP6_ADDRESS:
				setIp6Address(IP6_ADDRESS_EDEFAULT);
				return;
			case TOSDevicePackage.NETWORK_LOCATION__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
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
			case TOSDevicePackage.NETWORK_LOCATION__IP4_ADDRESS:
				return IP4_ADDRESS_EDEFAULT == null ? ip4Address != null : !IP4_ADDRESS_EDEFAULT.equals(ip4Address);
			case TOSDevicePackage.NETWORK_LOCATION__IP6_ADDRESS:
				return IP6_ADDRESS_EDEFAULT == null ? ip6Address != null : !IP6_ADDRESS_EDEFAULT.equals(ip6Address);
			case TOSDevicePackage.NETWORK_LOCATION__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
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
		result.append(" (ip4Address: ");
		result.append(ip4Address);
		result.append(", ip6Address: ");
		result.append(ip6Address);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(')');
		return result.toString();
	}

} //NetworkLocationImpl
