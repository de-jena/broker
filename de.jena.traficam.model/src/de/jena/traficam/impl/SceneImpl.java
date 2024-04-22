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

import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.SceneImpl#getLeftBottom <em>Left Bottom</em>}</li>
 *   <li>{@link de.jena.traficam.impl.SceneImpl#getLeftTop <em>Left Top</em>}</li>
 *   <li>{@link de.jena.traficam.impl.SceneImpl#getRightBottom <em>Right Bottom</em>}</li>
 *   <li>{@link de.jena.traficam.impl.SceneImpl#getRightTop <em>Right Top</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneImpl extends MinimalEObjectImpl.Container implements Scene {
	/**
	 * The cached value of the '{@link #getLeftBottom() <em>Left Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBottom()
	 * @generated
	 * @ordered
	 */
	protected GpsCoordinates leftBottom;

	/**
	 * The cached value of the '{@link #getLeftTop() <em>Left Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTop()
	 * @generated
	 * @ordered
	 */
	protected GpsCoordinates leftTop;

	/**
	 * The cached value of the '{@link #getRightBottom() <em>Right Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBottom()
	 * @generated
	 * @ordered
	 */
	protected GpsCoordinates rightBottom;

	/**
	 * The cached value of the '{@link #getRightTop() <em>Right Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTop()
	 * @generated
	 * @ordered
	 */
	protected GpsCoordinates rightTop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpsCoordinates getLeftBottom() {
		return leftBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftBottom(GpsCoordinates newLeftBottom, NotificationChain msgs) {
		GpsCoordinates oldLeftBottom = leftBottom;
		leftBottom = newLeftBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__LEFT_BOTTOM, oldLeftBottom, newLeftBottom);
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
	public void setLeftBottom(GpsCoordinates newLeftBottom) {
		if (newLeftBottom != leftBottom) {
			NotificationChain msgs = null;
			if (leftBottom != null)
				msgs = ((InternalEObject)leftBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__LEFT_BOTTOM, null, msgs);
			if (newLeftBottom != null)
				msgs = ((InternalEObject)newLeftBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__LEFT_BOTTOM, null, msgs);
			msgs = basicSetLeftBottom(newLeftBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__LEFT_BOTTOM, newLeftBottom, newLeftBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpsCoordinates getLeftTop() {
		return leftTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftTop(GpsCoordinates newLeftTop, NotificationChain msgs) {
		GpsCoordinates oldLeftTop = leftTop;
		leftTop = newLeftTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__LEFT_TOP, oldLeftTop, newLeftTop);
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
	public void setLeftTop(GpsCoordinates newLeftTop) {
		if (newLeftTop != leftTop) {
			NotificationChain msgs = null;
			if (leftTop != null)
				msgs = ((InternalEObject)leftTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__LEFT_TOP, null, msgs);
			if (newLeftTop != null)
				msgs = ((InternalEObject)newLeftTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__LEFT_TOP, null, msgs);
			msgs = basicSetLeftTop(newLeftTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__LEFT_TOP, newLeftTop, newLeftTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpsCoordinates getRightBottom() {
		return rightBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightBottom(GpsCoordinates newRightBottom, NotificationChain msgs) {
		GpsCoordinates oldRightBottom = rightBottom;
		rightBottom = newRightBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__RIGHT_BOTTOM, oldRightBottom, newRightBottom);
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
	public void setRightBottom(GpsCoordinates newRightBottom) {
		if (newRightBottom != rightBottom) {
			NotificationChain msgs = null;
			if (rightBottom != null)
				msgs = ((InternalEObject)rightBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__RIGHT_BOTTOM, null, msgs);
			if (newRightBottom != null)
				msgs = ((InternalEObject)newRightBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__RIGHT_BOTTOM, null, msgs);
			msgs = basicSetRightBottom(newRightBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__RIGHT_BOTTOM, newRightBottom, newRightBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpsCoordinates getRightTop() {
		return rightTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightTop(GpsCoordinates newRightTop, NotificationChain msgs) {
		GpsCoordinates oldRightTop = rightTop;
		rightTop = newRightTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__RIGHT_TOP, oldRightTop, newRightTop);
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
	public void setRightTop(GpsCoordinates newRightTop) {
		if (newRightTop != rightTop) {
			NotificationChain msgs = null;
			if (rightTop != null)
				msgs = ((InternalEObject)rightTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__RIGHT_TOP, null, msgs);
			if (newRightTop != null)
				msgs = ((InternalEObject)newRightTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.SCENE__RIGHT_TOP, null, msgs);
			msgs = basicSetRightTop(newRightTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.SCENE__RIGHT_TOP, newRightTop, newRightTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrafiCamPackage.SCENE__LEFT_BOTTOM:
				return basicSetLeftBottom(null, msgs);
			case TrafiCamPackage.SCENE__LEFT_TOP:
				return basicSetLeftTop(null, msgs);
			case TrafiCamPackage.SCENE__RIGHT_BOTTOM:
				return basicSetRightBottom(null, msgs);
			case TrafiCamPackage.SCENE__RIGHT_TOP:
				return basicSetRightTop(null, msgs);
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
			case TrafiCamPackage.SCENE__LEFT_BOTTOM:
				return getLeftBottom();
			case TrafiCamPackage.SCENE__LEFT_TOP:
				return getLeftTop();
			case TrafiCamPackage.SCENE__RIGHT_BOTTOM:
				return getRightBottom();
			case TrafiCamPackage.SCENE__RIGHT_TOP:
				return getRightTop();
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
			case TrafiCamPackage.SCENE__LEFT_BOTTOM:
				setLeftBottom((GpsCoordinates)newValue);
				return;
			case TrafiCamPackage.SCENE__LEFT_TOP:
				setLeftTop((GpsCoordinates)newValue);
				return;
			case TrafiCamPackage.SCENE__RIGHT_BOTTOM:
				setRightBottom((GpsCoordinates)newValue);
				return;
			case TrafiCamPackage.SCENE__RIGHT_TOP:
				setRightTop((GpsCoordinates)newValue);
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
			case TrafiCamPackage.SCENE__LEFT_BOTTOM:
				setLeftBottom((GpsCoordinates)null);
				return;
			case TrafiCamPackage.SCENE__LEFT_TOP:
				setLeftTop((GpsCoordinates)null);
				return;
			case TrafiCamPackage.SCENE__RIGHT_BOTTOM:
				setRightBottom((GpsCoordinates)null);
				return;
			case TrafiCamPackage.SCENE__RIGHT_TOP:
				setRightTop((GpsCoordinates)null);
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
			case TrafiCamPackage.SCENE__LEFT_BOTTOM:
				return leftBottom != null;
			case TrafiCamPackage.SCENE__LEFT_TOP:
				return leftTop != null;
			case TrafiCamPackage.SCENE__RIGHT_BOTTOM:
				return rightBottom != null;
			case TrafiCamPackage.SCENE__RIGHT_TOP:
				return rightTop != null;
		}
		return super.eIsSet(featureID);
	}

} //SceneImpl
