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

import de.jena.traficam.Coordinates;
import de.jena.traficam.TrafiCamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getX <em>X</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getXConfidence <em>XConfidence</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getY <em>Y</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getYConfidence <em>YConfidence</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getZ <em>Z</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getHeading3d <em>Heading3d</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CoordinatesImpl#getHeading3dConfidence <em>Heading3d Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatesImpl extends MinimalEObjectImpl.Container implements Coordinates {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getXConfidence() <em>XConfidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final short XCONFIDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXConfidence() <em>XConfidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXConfidence()
	 * @generated
	 * @ordered
	 */
	protected short xConfidence = XCONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getYConfidence() <em>YConfidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final short YCONFIDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYConfidence() <em>YConfidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYConfidence()
	 * @generated
	 * @ordered
	 */
	protected short yConfidence = YCONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final double Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected double z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeading3d() <em>Heading3d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading3d()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING3D_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeading3d() <em>Heading3d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading3d()
	 * @generated
	 * @ordered
	 */
	protected double heading3d = HEADING3D_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeading3dConfidence() <em>Heading3d Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading3dConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final short HEADING3D_CONFIDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeading3dConfidence() <em>Heading3d Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading3dConfidence()
	 * @generated
	 * @ordered
	 */
	protected short heading3dConfidence = HEADING3D_CONFIDENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getXConfidence() {
		return xConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXConfidence(short newXConfidence) {
		short oldXConfidence = xConfidence;
		xConfidence = newXConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__XCONFIDENCE, oldXConfidence, xConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getYConfidence() {
		return yConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYConfidence(short newYConfidence) {
		short oldYConfidence = yConfidence;
		yConfidence = newYConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__YCONFIDENCE, oldYConfidence, yConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ(double newZ) {
		double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeading3d() {
		return heading3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeading3d(double newHeading3d) {
		double oldHeading3d = heading3d;
		heading3d = newHeading3d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__HEADING3D, oldHeading3d, heading3d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getHeading3dConfidence() {
		return heading3dConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeading3dConfidence(short newHeading3dConfidence) {
		short oldHeading3dConfidence = heading3dConfidence;
		heading3dConfidence = newHeading3dConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.COORDINATES__HEADING3D_CONFIDENCE, oldHeading3dConfidence, heading3dConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafiCamPackage.COORDINATES__X:
				return getX();
			case TrafiCamPackage.COORDINATES__XCONFIDENCE:
				return getXConfidence();
			case TrafiCamPackage.COORDINATES__Y:
				return getY();
			case TrafiCamPackage.COORDINATES__YCONFIDENCE:
				return getYConfidence();
			case TrafiCamPackage.COORDINATES__Z:
				return getZ();
			case TrafiCamPackage.COORDINATES__HEADING3D:
				return getHeading3d();
			case TrafiCamPackage.COORDINATES__HEADING3D_CONFIDENCE:
				return getHeading3dConfidence();
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
			case TrafiCamPackage.COORDINATES__X:
				setX((Double)newValue);
				return;
			case TrafiCamPackage.COORDINATES__XCONFIDENCE:
				setXConfidence((Short)newValue);
				return;
			case TrafiCamPackage.COORDINATES__Y:
				setY((Double)newValue);
				return;
			case TrafiCamPackage.COORDINATES__YCONFIDENCE:
				setYConfidence((Short)newValue);
				return;
			case TrafiCamPackage.COORDINATES__Z:
				setZ((Double)newValue);
				return;
			case TrafiCamPackage.COORDINATES__HEADING3D:
				setHeading3d((Double)newValue);
				return;
			case TrafiCamPackage.COORDINATES__HEADING3D_CONFIDENCE:
				setHeading3dConfidence((Short)newValue);
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
			case TrafiCamPackage.COORDINATES__X:
				setX(X_EDEFAULT);
				return;
			case TrafiCamPackage.COORDINATES__XCONFIDENCE:
				setXConfidence(XCONFIDENCE_EDEFAULT);
				return;
			case TrafiCamPackage.COORDINATES__Y:
				setY(Y_EDEFAULT);
				return;
			case TrafiCamPackage.COORDINATES__YCONFIDENCE:
				setYConfidence(YCONFIDENCE_EDEFAULT);
				return;
			case TrafiCamPackage.COORDINATES__Z:
				setZ(Z_EDEFAULT);
				return;
			case TrafiCamPackage.COORDINATES__HEADING3D:
				setHeading3d(HEADING3D_EDEFAULT);
				return;
			case TrafiCamPackage.COORDINATES__HEADING3D_CONFIDENCE:
				setHeading3dConfidence(HEADING3D_CONFIDENCE_EDEFAULT);
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
			case TrafiCamPackage.COORDINATES__X:
				return x != X_EDEFAULT;
			case TrafiCamPackage.COORDINATES__XCONFIDENCE:
				return xConfidence != XCONFIDENCE_EDEFAULT;
			case TrafiCamPackage.COORDINATES__Y:
				return y != Y_EDEFAULT;
			case TrafiCamPackage.COORDINATES__YCONFIDENCE:
				return yConfidence != YCONFIDENCE_EDEFAULT;
			case TrafiCamPackage.COORDINATES__Z:
				return z != Z_EDEFAULT;
			case TrafiCamPackage.COORDINATES__HEADING3D:
				return heading3d != HEADING3D_EDEFAULT;
			case TrafiCamPackage.COORDINATES__HEADING3D_CONFIDENCE:
				return heading3dConfidence != HEADING3D_CONFIDENCE_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", xConfidence: ");
		result.append(xConfidence);
		result.append(", y: ");
		result.append(y);
		result.append(", yConfidence: ");
		result.append(yConfidence);
		result.append(", z: ");
		result.append(z);
		result.append(", heading3d: ");
		result.append(heading3d);
		result.append(", heading3dConfidence: ");
		result.append(heading3dConfidence);
		result.append(')');
		return result.toString();
	}

} //CoordinatesImpl
