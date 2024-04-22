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
package de.jena.traficam.impl;

import de.jena.traficam.FieldOfView;
import de.jena.traficam.TrafiCamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Of View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.FieldOfViewImpl#getHfov <em>Hfov</em>}</li>
 *   <li>{@link de.jena.traficam.impl.FieldOfViewImpl#getVfov <em>Vfov</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldOfViewImpl extends MinimalEObjectImpl.Container implements FieldOfView {
	/**
	 * The default value of the '{@link #getHfov() <em>Hfov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHfov()
	 * @generated
	 * @ordered
	 */
	protected static final double HFOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHfov() <em>Hfov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHfov()
	 * @generated
	 * @ordered
	 */
	protected double hfov = HFOV_EDEFAULT;

	/**
	 * The default value of the '{@link #getVfov() <em>Vfov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVfov()
	 * @generated
	 * @ordered
	 */
	protected static final double VFOV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVfov() <em>Vfov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVfov()
	 * @generated
	 * @ordered
	 */
	protected double vfov = VFOV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.FIELD_OF_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHfov() {
		return hfov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHfov(double newHfov) {
		double oldHfov = hfov;
		hfov = newHfov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.FIELD_OF_VIEW__HFOV, oldHfov, hfov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVfov() {
		return vfov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVfov(double newVfov) {
		double oldVfov = vfov;
		vfov = newVfov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.FIELD_OF_VIEW__VFOV, oldVfov, vfov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafiCamPackage.FIELD_OF_VIEW__HFOV:
				return getHfov();
			case TrafiCamPackage.FIELD_OF_VIEW__VFOV:
				return getVfov();
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
			case TrafiCamPackage.FIELD_OF_VIEW__HFOV:
				setHfov((Double)newValue);
				return;
			case TrafiCamPackage.FIELD_OF_VIEW__VFOV:
				setVfov((Double)newValue);
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
			case TrafiCamPackage.FIELD_OF_VIEW__HFOV:
				setHfov(HFOV_EDEFAULT);
				return;
			case TrafiCamPackage.FIELD_OF_VIEW__VFOV:
				setVfov(VFOV_EDEFAULT);
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
			case TrafiCamPackage.FIELD_OF_VIEW__HFOV:
				return hfov != HFOV_EDEFAULT;
			case TrafiCamPackage.FIELD_OF_VIEW__VFOV:
				return vfov != VFOV_EDEFAULT;
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
		result.append(" (hfov: ");
		result.append(hfov);
		result.append(", vfov: ");
		result.append(vfov);
		result.append(')');
		return result.toString();
	}

} //FieldOfViewImpl
