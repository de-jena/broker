/**
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
import de.jena.traficam.Coordinates;
import de.jena.traficam.FieldOfView;
import de.jena.traficam.GpsCoordinates;
import de.jena.traficam.MessagType;
import de.jena.traficam.Scene;
import de.jena.traficam.TrafiCam;
import de.jena.traficam.TrafiCamFactory;
import de.jena.traficam.TrafiCamObject;
import de.jena.traficam.TrafiCamPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafiCamPackageImpl extends EPackageImpl implements TrafiCamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafiCamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafiCamObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass camConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calibrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messagTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.traficam.TrafiCamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrafiCamPackageImpl() {
		super(eNS_URI, TrafiCamFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TrafiCamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrafiCamPackage init() {
		if (isInited) return (TrafiCamPackage)EPackage.Registry.INSTANCE.getEPackage(TrafiCamPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTrafiCamPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TrafiCamPackageImpl theTrafiCamPackage = registeredTrafiCamPackage instanceof TrafiCamPackageImpl ? (TrafiCamPackageImpl)registeredTrafiCamPackage : new TrafiCamPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTrafiCamPackage.createPackageContents();

		// Initialize created meta-data
		theTrafiCamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrafiCamPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrafiCamPackage.eNS_URI, theTrafiCamPackage);
		return theTrafiCamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafiCam() {
		return trafiCamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCam_DataNumber() {
		return (EAttribute)trafiCamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCam_Type() {
		return (EAttribute)trafiCamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCam_MessageType() {
		return (EAttribute)trafiCamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafiCam_Object() {
		return (EReference)trafiCamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCam_Time() {
		return (EAttribute)trafiCamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCam_IntervalTime() {
		return (EAttribute)trafiCamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafiCamObject() {
		return trafiCamObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCamObject_ClassId() {
		return (EAttribute)trafiCamObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCamObject_Id() {
		return (EAttribute)trafiCamObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCamObject_Time() {
		return (EAttribute)trafiCamObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCamObject_Lifetime() {
		return (EAttribute)trafiCamObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCamObject_Speed() {
		return (EAttribute)trafiCamObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafiCamObject_SpeedConfidence() {
		return (EAttribute)trafiCamObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafiCamObject_GpsCoordinates() {
		return (EReference)trafiCamObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafiCamObject_ImageCoordinates() {
		return (EReference)trafiCamObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafiCamObject_WorldCoordinates() {
		return (EReference)trafiCamObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGpsCoordinates() {
		return gpsCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGpsCoordinates_Latitude() {
		return (EAttribute)gpsCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGpsCoordinates_Longitude() {
		return (EAttribute)gpsCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGpsCoordinates_Heading() {
		return (EAttribute)gpsCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinates() {
		return coordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_X() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_XConfidence() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Y() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_YConfidence() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Z() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Heading3d() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Heading3dConfidence() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCamConfig() {
		return camConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCamConfig_Calibration() {
		return (EReference)camConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCamConfig_Location() {
		return (EReference)camConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCamConfig_FieldOfView() {
		return (EReference)camConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCamConfig_Scene() {
		return (EReference)camConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCamConfig_ClassMap() {
		return (EReference)camConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalibration() {
		return calibrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalibration_FocalDistance() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalibration_Height() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalibration_PanAngle() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalibration_RollAngle() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalibration_TiltAngle() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldOfView() {
		return fieldOfViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFieldOfView_Hfov() {
		return (EAttribute)fieldOfViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFieldOfView_Vfov() {
		return (EAttribute)fieldOfViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScene() {
		return sceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScene_LeftBottom() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScene_LeftTop() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScene_RightBottom() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScene_RightTop() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassMap() {
		return classMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassMap_Key() {
		return (EAttribute)classMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassMap_Value() {
		return (EAttribute)classMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessagType() {
		return messagTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafiCamFactory getTrafiCamFactory() {
		return (TrafiCamFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		trafiCamEClass = createEClass(TRAFI_CAM);
		createEAttribute(trafiCamEClass, TRAFI_CAM__DATA_NUMBER);
		createEAttribute(trafiCamEClass, TRAFI_CAM__TYPE);
		createEAttribute(trafiCamEClass, TRAFI_CAM__MESSAGE_TYPE);
		createEReference(trafiCamEClass, TRAFI_CAM__OBJECT);
		createEAttribute(trafiCamEClass, TRAFI_CAM__TIME);
		createEAttribute(trafiCamEClass, TRAFI_CAM__INTERVAL_TIME);

		trafiCamObjectEClass = createEClass(TRAFI_CAM_OBJECT);
		createEAttribute(trafiCamObjectEClass, TRAFI_CAM_OBJECT__CLASS_ID);
		createEAttribute(trafiCamObjectEClass, TRAFI_CAM_OBJECT__ID);
		createEAttribute(trafiCamObjectEClass, TRAFI_CAM_OBJECT__TIME);
		createEAttribute(trafiCamObjectEClass, TRAFI_CAM_OBJECT__LIFETIME);
		createEAttribute(trafiCamObjectEClass, TRAFI_CAM_OBJECT__SPEED);
		createEAttribute(trafiCamObjectEClass, TRAFI_CAM_OBJECT__SPEED_CONFIDENCE);
		createEReference(trafiCamObjectEClass, TRAFI_CAM_OBJECT__GPS_COORDINATES);
		createEReference(trafiCamObjectEClass, TRAFI_CAM_OBJECT__IMAGE_COORDINATES);
		createEReference(trafiCamObjectEClass, TRAFI_CAM_OBJECT__WORLD_COORDINATES);

		gpsCoordinatesEClass = createEClass(GPS_COORDINATES);
		createEAttribute(gpsCoordinatesEClass, GPS_COORDINATES__LATITUDE);
		createEAttribute(gpsCoordinatesEClass, GPS_COORDINATES__LONGITUDE);
		createEAttribute(gpsCoordinatesEClass, GPS_COORDINATES__HEADING);

		coordinatesEClass = createEClass(COORDINATES);
		createEAttribute(coordinatesEClass, COORDINATES__X);
		createEAttribute(coordinatesEClass, COORDINATES__XCONFIDENCE);
		createEAttribute(coordinatesEClass, COORDINATES__Y);
		createEAttribute(coordinatesEClass, COORDINATES__YCONFIDENCE);
		createEAttribute(coordinatesEClass, COORDINATES__Z);
		createEAttribute(coordinatesEClass, COORDINATES__HEADING3D);
		createEAttribute(coordinatesEClass, COORDINATES__HEADING3D_CONFIDENCE);

		camConfigEClass = createEClass(CAM_CONFIG);
		createEReference(camConfigEClass, CAM_CONFIG__CALIBRATION);
		createEReference(camConfigEClass, CAM_CONFIG__LOCATION);
		createEReference(camConfigEClass, CAM_CONFIG__FIELD_OF_VIEW);
		createEReference(camConfigEClass, CAM_CONFIG__SCENE);
		createEReference(camConfigEClass, CAM_CONFIG__CLASS_MAP);

		calibrationEClass = createEClass(CALIBRATION);
		createEAttribute(calibrationEClass, CALIBRATION__FOCAL_DISTANCE);
		createEAttribute(calibrationEClass, CALIBRATION__HEIGHT);
		createEAttribute(calibrationEClass, CALIBRATION__PAN_ANGLE);
		createEAttribute(calibrationEClass, CALIBRATION__ROLL_ANGLE);
		createEAttribute(calibrationEClass, CALIBRATION__TILT_ANGLE);

		fieldOfViewEClass = createEClass(FIELD_OF_VIEW);
		createEAttribute(fieldOfViewEClass, FIELD_OF_VIEW__HFOV);
		createEAttribute(fieldOfViewEClass, FIELD_OF_VIEW__VFOV);

		sceneEClass = createEClass(SCENE);
		createEReference(sceneEClass, SCENE__LEFT_BOTTOM);
		createEReference(sceneEClass, SCENE__LEFT_TOP);
		createEReference(sceneEClass, SCENE__RIGHT_BOTTOM);
		createEReference(sceneEClass, SCENE__RIGHT_TOP);

		classMapEClass = createEClass(CLASS_MAP);
		createEAttribute(classMapEClass, CLASS_MAP__KEY);
		createEAttribute(classMapEClass, CLASS_MAP__VALUE);

		// Create enums
		messagTypeEEnum = createEEnum(MESSAG_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(trafiCamEClass, TrafiCam.class, "TrafiCam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafiCam_DataNumber(), ecorePackage.getELong(), "dataNumber", null, 0, 1, TrafiCam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCam_Type(), ecorePackage.getEString(), "type", null, 0, 1, TrafiCam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCam_MessageType(), this.getMessagType(), "messageType", null, 0, 1, TrafiCam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafiCam_Object(), this.getTrafiCamObject(), null, "object", null, 0, -1, TrafiCam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCam_Time(), ecorePackage.getEDate(), "time", null, 0, 1, TrafiCam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCam_IntervalTime(), ecorePackage.getEDouble(), "intervalTime", null, 0, 1, TrafiCam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafiCamObjectEClass, TrafiCamObject.class, "TrafiCamObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafiCamObject_ClassId(), ecorePackage.getEShort(), "classId", null, 0, 1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCamObject_Id(), ecorePackage.getELong(), "id", null, 0, 1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCamObject_Time(), ecorePackage.getEDate(), "time", null, 0, 1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCamObject_Lifetime(), ecorePackage.getEDouble(), "lifetime", null, 0, 1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCamObject_Speed(), ecorePackage.getEDouble(), "speed", null, 0, 1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafiCamObject_SpeedConfidence(), ecorePackage.getEShort(), "speedConfidence", null, 0, 1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafiCamObject_GpsCoordinates(), this.getGpsCoordinates(), null, "gpsCoordinates", null, 0, -1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafiCamObject_ImageCoordinates(), this.getCoordinates(), null, "imageCoordinates", null, 0, -1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafiCamObject_WorldCoordinates(), this.getCoordinates(), null, "worldCoordinates", null, 0, -1, TrafiCamObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsCoordinatesEClass, GpsCoordinates.class, "GpsCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGpsCoordinates_Latitude(), ecorePackage.getEDouble(), "latitude", null, 1, 1, GpsCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpsCoordinates_Longitude(), ecorePackage.getEDouble(), "longitude", null, 1, 1, GpsCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpsCoordinates_Heading(), ecorePackage.getEDouble(), "heading", null, 0, 1, GpsCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinates_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_XConfidence(), ecorePackage.getEShort(), "xConfidence", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_YConfidence(), ecorePackage.getEShort(), "yConfidence", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_Heading3d(), ecorePackage.getEDouble(), "heading3d", null, 1, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_Heading3dConfidence(), ecorePackage.getEShort(), "heading3dConfidence", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camConfigEClass, CamConfig.class, "CamConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCamConfig_Calibration(), this.getCalibration(), null, "calibration", null, 0, 1, CamConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamConfig_Location(), this.getGpsCoordinates(), null, "location", null, 0, 1, CamConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamConfig_FieldOfView(), this.getFieldOfView(), null, "fieldOfView", null, 0, 1, CamConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamConfig_Scene(), this.getScene(), null, "scene", null, 0, 1, CamConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCamConfig_ClassMap(), this.getClassMap(), null, "classMap", null, 0, -1, CamConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calibrationEClass, Calibration.class, "Calibration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalibration_FocalDistance(), ecorePackage.getEDouble(), "focalDistance", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalibration_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalibration_PanAngle(), ecorePackage.getEDouble(), "panAngle", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalibration_RollAngle(), ecorePackage.getEDouble(), "rollAngle", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalibration_TiltAngle(), ecorePackage.getEDouble(), "tiltAngle", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldOfViewEClass, FieldOfView.class, "FieldOfView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldOfView_Hfov(), ecorePackage.getEDouble(), "hfov", null, 0, 1, FieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldOfView_Vfov(), ecorePackage.getEDouble(), "vfov", null, 0, 1, FieldOfView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sceneEClass, Scene.class, "Scene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScene_LeftBottom(), this.getGpsCoordinates(), null, "leftBottom", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_LeftTop(), this.getGpsCoordinates(), null, "leftTop", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_RightBottom(), this.getGpsCoordinates(), null, "rightBottom", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_RightTop(), this.getGpsCoordinates(), null, "rightTop", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classMapEClass, Map.Entry.class, "ClassMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messagTypeEEnum, MessagType.class, "MessagType");
		addEEnumLiteral(messagTypeEEnum, MessagType.DATA);
		addEEnumLiteral(messagTypeEEnum, MessagType.EVENT);
		addEEnumLiteral(messagTypeEEnum, MessagType.SUBSCRIPTION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "basePackage", "de.jena"
		   });
	}

} //TrafiCamPackageImpl
