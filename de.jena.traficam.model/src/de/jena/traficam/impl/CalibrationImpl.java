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

import de.jena.traficam.Calibration;
import de.jena.traficam.TrafiCamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calibration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.CalibrationImpl#getFocalDistance <em>Focal Distance</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CalibrationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CalibrationImpl#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CalibrationImpl#getRollAngle <em>Roll Angle</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CalibrationImpl#getTiltAngle <em>Tilt Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalibrationImpl extends MinimalEObjectImpl.Container implements Calibration {
	/**
	 * The default value of the '{@link #getFocalDistance() <em>Focal Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double FOCAL_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFocalDistance() <em>Focal Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDistance()
	 * @generated
	 * @ordered
	 */
	protected double focalDistance = FOCAL_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanAngle() <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double PAN_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPanAngle() <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanAngle()
	 * @generated
	 * @ordered
	 */
	protected double panAngle = PAN_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected double rollAngle = ROLL_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected double tiltAngle = TILT_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalibrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.CALIBRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFocalDistance() {
		return focalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFocalDistance(double newFocalDistance) {
		double oldFocalDistance = focalDistance;
		focalDistance = newFocalDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CALIBRATION__FOCAL_DISTANCE, oldFocalDistance, focalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CALIBRATION__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPanAngle() {
		return panAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPanAngle(double newPanAngle) {
		double oldPanAngle = panAngle;
		panAngle = newPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CALIBRATION__PAN_ANGLE, oldPanAngle, panAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRollAngle() {
		return rollAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRollAngle(double newRollAngle) {
		double oldRollAngle = rollAngle;
		rollAngle = newRollAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CALIBRATION__ROLL_ANGLE, oldRollAngle, rollAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTiltAngle() {
		return tiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTiltAngle(double newTiltAngle) {
		double oldTiltAngle = tiltAngle;
		tiltAngle = newTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CALIBRATION__TILT_ANGLE, oldTiltAngle, tiltAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafiCamPackage.CALIBRATION__FOCAL_DISTANCE:
				return getFocalDistance();
			case TrafiCamPackage.CALIBRATION__HEIGHT:
				return getHeight();
			case TrafiCamPackage.CALIBRATION__PAN_ANGLE:
				return getPanAngle();
			case TrafiCamPackage.CALIBRATION__ROLL_ANGLE:
				return getRollAngle();
			case TrafiCamPackage.CALIBRATION__TILT_ANGLE:
				return getTiltAngle();
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
			case TrafiCamPackage.CALIBRATION__FOCAL_DISTANCE:
				setFocalDistance((Double)newValue);
				return;
			case TrafiCamPackage.CALIBRATION__HEIGHT:
				setHeight((Double)newValue);
				return;
			case TrafiCamPackage.CALIBRATION__PAN_ANGLE:
				setPanAngle((Double)newValue);
				return;
			case TrafiCamPackage.CALIBRATION__ROLL_ANGLE:
				setRollAngle((Double)newValue);
				return;
			case TrafiCamPackage.CALIBRATION__TILT_ANGLE:
				setTiltAngle((Double)newValue);
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
			case TrafiCamPackage.CALIBRATION__FOCAL_DISTANCE:
				setFocalDistance(FOCAL_DISTANCE_EDEFAULT);
				return;
			case TrafiCamPackage.CALIBRATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case TrafiCamPackage.CALIBRATION__PAN_ANGLE:
				setPanAngle(PAN_ANGLE_EDEFAULT);
				return;
			case TrafiCamPackage.CALIBRATION__ROLL_ANGLE:
				setRollAngle(ROLL_ANGLE_EDEFAULT);
				return;
			case TrafiCamPackage.CALIBRATION__TILT_ANGLE:
				setTiltAngle(TILT_ANGLE_EDEFAULT);
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
			case TrafiCamPackage.CALIBRATION__FOCAL_DISTANCE:
				return focalDistance != FOCAL_DISTANCE_EDEFAULT;
			case TrafiCamPackage.CALIBRATION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case TrafiCamPackage.CALIBRATION__PAN_ANGLE:
				return panAngle != PAN_ANGLE_EDEFAULT;
			case TrafiCamPackage.CALIBRATION__ROLL_ANGLE:
				return rollAngle != ROLL_ANGLE_EDEFAULT;
			case TrafiCamPackage.CALIBRATION__TILT_ANGLE:
				return tiltAngle != TILT_ANGLE_EDEFAULT;
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
		result.append(" (focalDistance: ");
		result.append(focalDistance);
		result.append(", height: ");
		result.append(height);
		result.append(", panAngle: ");
		result.append(panAngle);
		result.append(", rollAngle: ");
		result.append(rollAngle);
		result.append(", tiltAngle: ");
		result.append(tiltAngle);
		result.append(')');
		return result.toString();
	}

} //CalibrationImpl
