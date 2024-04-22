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
import de.jena.traficam.CamConfig;
import de.jena.traficam.FieldOfView;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cam Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.impl.CamConfigImpl#getCalibration <em>Calibration</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CamConfigImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CamConfigImpl#getFieldOfView <em>Field Of View</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CamConfigImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link de.jena.traficam.impl.CamConfigImpl#getClassMap <em>Class Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamConfigImpl extends MinimalEObjectImpl.Container implements CamConfig {
	/**
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected Calibration calibration;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected GpsCoordinates location;

	/**
	 * The cached value of the '{@link #getFieldOfView() <em>Field Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected FieldOfView fieldOfView;

	/**
	 * The cached value of the '{@link #getScene() <em>Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	protected Scene scene;

	/**
	 * The cached value of the '{@link #getClassMap() <em>Class Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> classMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafiCamPackage.Literals.CAM_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calibration getCalibration() {
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibration(Calibration newCalibration, NotificationChain msgs) {
		Calibration oldCalibration = calibration;
		calibration = newCalibration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__CALIBRATION, oldCalibration, newCalibration);
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
	public void setCalibration(Calibration newCalibration) {
		if (newCalibration != calibration) {
			NotificationChain msgs = null;
			if (calibration != null)
				msgs = ((InternalEObject)calibration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__CALIBRATION, null, msgs);
			if (newCalibration != null)
				msgs = ((InternalEObject)newCalibration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__CALIBRATION, null, msgs);
			msgs = basicSetCalibration(newCalibration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__CALIBRATION, newCalibration, newCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GpsCoordinates getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(GpsCoordinates newLocation, NotificationChain msgs) {
		GpsCoordinates oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__LOCATION, oldLocation, newLocation);
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
	public void setLocation(GpsCoordinates newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldOfView getFieldOfView() {
		return fieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldOfView(FieldOfView newFieldOfView, NotificationChain msgs) {
		FieldOfView oldFieldOfView = fieldOfView;
		fieldOfView = newFieldOfView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW, oldFieldOfView, newFieldOfView);
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
	public void setFieldOfView(FieldOfView newFieldOfView) {
		if (newFieldOfView != fieldOfView) {
			NotificationChain msgs = null;
			if (fieldOfView != null)
				msgs = ((InternalEObject)fieldOfView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW, null, msgs);
			if (newFieldOfView != null)
				msgs = ((InternalEObject)newFieldOfView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW, null, msgs);
			msgs = basicSetFieldOfView(newFieldOfView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW, newFieldOfView, newFieldOfView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scene getScene() {
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScene(Scene newScene, NotificationChain msgs) {
		Scene oldScene = scene;
		scene = newScene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__SCENE, oldScene, newScene);
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
	public void setScene(Scene newScene) {
		if (newScene != scene) {
			NotificationChain msgs = null;
			if (scene != null)
				msgs = ((InternalEObject)scene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__SCENE, null, msgs);
			if (newScene != null)
				msgs = ((InternalEObject)newScene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrafiCamPackage.CAM_CONFIG__SCENE, null, msgs);
			msgs = basicSetScene(newScene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafiCamPackage.CAM_CONFIG__SCENE, newScene, newScene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getClassMap() {
		if (classMap == null) {
			classMap = new EcoreEMap<String,String>(TrafiCamPackage.Literals.CLASS_MAP, ClassMapImpl.class, this, TrafiCamPackage.CAM_CONFIG__CLASS_MAP);
		}
		return classMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrafiCamPackage.CAM_CONFIG__CALIBRATION:
				return basicSetCalibration(null, msgs);
			case TrafiCamPackage.CAM_CONFIG__LOCATION:
				return basicSetLocation(null, msgs);
			case TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW:
				return basicSetFieldOfView(null, msgs);
			case TrafiCamPackage.CAM_CONFIG__SCENE:
				return basicSetScene(null, msgs);
			case TrafiCamPackage.CAM_CONFIG__CLASS_MAP:
				return ((InternalEList<?>)getClassMap()).basicRemove(otherEnd, msgs);
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
			case TrafiCamPackage.CAM_CONFIG__CALIBRATION:
				return getCalibration();
			case TrafiCamPackage.CAM_CONFIG__LOCATION:
				return getLocation();
			case TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW:
				return getFieldOfView();
			case TrafiCamPackage.CAM_CONFIG__SCENE:
				return getScene();
			case TrafiCamPackage.CAM_CONFIG__CLASS_MAP:
				if (coreType) return getClassMap();
				else return getClassMap().map();
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
			case TrafiCamPackage.CAM_CONFIG__CALIBRATION:
				setCalibration((Calibration)newValue);
				return;
			case TrafiCamPackage.CAM_CONFIG__LOCATION:
				setLocation((GpsCoordinates)newValue);
				return;
			case TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW:
				setFieldOfView((FieldOfView)newValue);
				return;
			case TrafiCamPackage.CAM_CONFIG__SCENE:
				setScene((Scene)newValue);
				return;
			case TrafiCamPackage.CAM_CONFIG__CLASS_MAP:
				((EStructuralFeature.Setting)getClassMap()).set(newValue);
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
			case TrafiCamPackage.CAM_CONFIG__CALIBRATION:
				setCalibration((Calibration)null);
				return;
			case TrafiCamPackage.CAM_CONFIG__LOCATION:
				setLocation((GpsCoordinates)null);
				return;
			case TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW:
				setFieldOfView((FieldOfView)null);
				return;
			case TrafiCamPackage.CAM_CONFIG__SCENE:
				setScene((Scene)null);
				return;
			case TrafiCamPackage.CAM_CONFIG__CLASS_MAP:
				getClassMap().clear();
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
			case TrafiCamPackage.CAM_CONFIG__CALIBRATION:
				return calibration != null;
			case TrafiCamPackage.CAM_CONFIG__LOCATION:
				return location != null;
			case TrafiCamPackage.CAM_CONFIG__FIELD_OF_VIEW:
				return fieldOfView != null;
			case TrafiCamPackage.CAM_CONFIG__SCENE:
				return scene != null;
			case TrafiCamPackage.CAM_CONFIG__CLASS_MAP:
				return classMap != null && !classMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CamConfigImpl
