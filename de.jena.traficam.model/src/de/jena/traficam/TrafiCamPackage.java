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
package de.jena.traficam;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.traficam.TrafiCamFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.jena'"
 * @generated
 */
@ProviderType
@EPackage(uri = TrafiCamPackage.eNS_URI, genModel = "/model/traficam.genmodel", genModelSourceLocations = {"model/traficam.genmodel","de.jena.traficam.model/model/traficam.genmodel"}, ecore="/model/traficam.ecore", ecoreSourceLocations="/model/traficam.ecore")
public interface TrafiCamPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traficam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jena.de/models/traficam/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traficam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrafiCamPackage eINSTANCE = de.jena.traficam.impl.TrafiCamPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.TrafiCamImpl <em>Trafi Cam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.TrafiCamImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getTrafiCam()
	 * @generated
	 */
	int TRAFI_CAM = 0;

	/**
	 * The feature id for the '<em><b>Data Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__DATA_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__MESSAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__TIME = 4;

	/**
	 * The feature id for the '<em><b>Interval Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__INTERVAL_TIME = 5;

	/**
	 * The number of structural features of the '<em>Trafi Cam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Trafi Cam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.TrafiCamObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.TrafiCamObjectImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getTrafiCamObject()
	 * @generated
	 */
	int TRAFI_CAM_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__CLASS_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__ID = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__TIME = 2;

	/**
	 * The feature id for the '<em><b>Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__LIFETIME = 3;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__SPEED = 4;

	/**
	 * The feature id for the '<em><b>Speed Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__SPEED_CONFIDENCE = 5;

	/**
	 * The feature id for the '<em><b>Gps Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__GPS_COORDINATES = 6;

	/**
	 * The feature id for the '<em><b>Image Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__IMAGE_COORDINATES = 7;

	/**
	 * The feature id for the '<em><b>World Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT__WORLD_COORDINATES = 8;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.GpsCoordinatesImpl <em>Gps Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.GpsCoordinatesImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getGpsCoordinates()
	 * @generated
	 */
	int GPS_COORDINATES = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORDINATES__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORDINATES__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORDINATES__HEADING = 2;

	/**
	 * The number of structural features of the '<em>Gps Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gps Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.CoordinatesImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__X = 0;

	/**
	 * The feature id for the '<em><b>XConfidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__XCONFIDENCE = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__Y = 2;

	/**
	 * The feature id for the '<em><b>YConfidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__YCONFIDENCE = 3;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__Z = 4;

	/**
	 * The feature id for the '<em><b>Heading3d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__HEADING3D = 5;

	/**
	 * The feature id for the '<em><b>Heading3d Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__HEADING3D_CONFIDENCE = 6;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.CamConfigImpl <em>Cam Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.CamConfigImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getCamConfig()
	 * @generated
	 */
	int CAM_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG__CALIBRATION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Field Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG__FIELD_OF_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG__SCENE = 3;

	/**
	 * The feature id for the '<em><b>Class Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG__CLASS_MAP = 4;

	/**
	 * The number of structural features of the '<em>Cam Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cam Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.CalibrationImpl <em>Calibration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.CalibrationImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getCalibration()
	 * @generated
	 */
	int CALIBRATION = 5;

	/**
	 * The feature id for the '<em><b>Focal Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__FOCAL_DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__PAN_ANGLE = 2;

	/**
	 * The feature id for the '<em><b>Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__ROLL_ANGLE = 3;

	/**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__TILT_ANGLE = 4;

	/**
	 * The number of structural features of the '<em>Calibration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Calibration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.FieldOfViewImpl <em>Field Of View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.FieldOfViewImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getFieldOfView()
	 * @generated
	 */
	int FIELD_OF_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Hfov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW__HFOV = 0;

	/**
	 * The feature id for the '<em><b>Vfov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW__VFOV = 1;

	/**
	 * The number of structural features of the '<em>Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Of View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.SceneImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 7;

	/**
	 * The feature id for the '<em><b>Left Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__LEFT_BOTTOM = 0;

	/**
	 * The feature id for the '<em><b>Left Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__LEFT_TOP = 1;

	/**
	 * The feature id for the '<em><b>Right Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__RIGHT_BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Right Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__RIGHT_TOP = 3;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.impl.ClassMapImpl <em>Class Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.impl.ClassMapImpl
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getClassMap()
	 * @generated
	 */
	int CLASS_MAP = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Class Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.MessagType <em>Messag Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.MessagType
	 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getMessagType()
	 * @generated
	 */
	int MESSAG_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link de.jena.traficam.TrafiCam <em>Trafi Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trafi Cam</em>'.
	 * @see de.jena.traficam.TrafiCam
	 * @generated
	 */
	EClass getTrafiCam();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCam#getDataNumber <em>Data Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Number</em>'.
	 * @see de.jena.traficam.TrafiCam#getDataNumber()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_DataNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.traficam.TrafiCam#getType()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCam#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see de.jena.traficam.TrafiCam#getMessageType()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_MessageType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.traficam.TrafiCam#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see de.jena.traficam.TrafiCam#getObject()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EReference getTrafiCam_Object();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCam#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.jena.traficam.TrafiCam#getTime()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCam#getIntervalTime <em>Interval Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Time</em>'.
	 * @see de.jena.traficam.TrafiCam#getIntervalTime()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_IntervalTime();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.TrafiCamObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see de.jena.traficam.TrafiCamObject
	 * @generated
	 */
	EClass getTrafiCamObject();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCamObject#getClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Id</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getClassId()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_ClassId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCamObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getId()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCamObject#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getTime()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCamObject#getLifetime <em>Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifetime</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getLifetime()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Lifetime();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCamObject#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getSpeed()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Speed();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.TrafiCamObject#getSpeedConfidence <em>Speed Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Confidence</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getSpeedConfidence()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_SpeedConfidence();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.traficam.TrafiCamObject#getGpsCoordinates <em>Gps Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gps Coordinates</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getGpsCoordinates()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EReference getTrafiCamObject_GpsCoordinates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.traficam.TrafiCamObject#getImageCoordinates <em>Image Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Coordinates</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getImageCoordinates()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EReference getTrafiCamObject_ImageCoordinates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.traficam.TrafiCamObject#getWorldCoordinates <em>World Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>World Coordinates</em>'.
	 * @see de.jena.traficam.TrafiCamObject#getWorldCoordinates()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EReference getTrafiCamObject_WorldCoordinates();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.GpsCoordinates <em>Gps Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Coordinates</em>'.
	 * @see de.jena.traficam.GpsCoordinates
	 * @generated
	 */
	EClass getGpsCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.GpsCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.jena.traficam.GpsCoordinates#getLatitude()
	 * @see #getGpsCoordinates()
	 * @generated
	 */
	EAttribute getGpsCoordinates_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.GpsCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.jena.traficam.GpsCoordinates#getLongitude()
	 * @see #getGpsCoordinates()
	 * @generated
	 */
	EAttribute getGpsCoordinates_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.GpsCoordinates#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see de.jena.traficam.GpsCoordinates#getHeading()
	 * @see #getGpsCoordinates()
	 * @generated
	 */
	EAttribute getGpsCoordinates_Heading();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see de.jena.traficam.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.jena.traficam.Coordinates#getX()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_X();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getXConfidence <em>XConfidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XConfidence</em>'.
	 * @see de.jena.traficam.Coordinates#getXConfidence()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_XConfidence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.jena.traficam.Coordinates#getY()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getYConfidence <em>YConfidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YConfidence</em>'.
	 * @see de.jena.traficam.Coordinates#getYConfidence()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_YConfidence();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.jena.traficam.Coordinates#getZ()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Z();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getHeading3d <em>Heading3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading3d</em>'.
	 * @see de.jena.traficam.Coordinates#getHeading3d()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Heading3d();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Coordinates#getHeading3dConfidence <em>Heading3d Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading3d Confidence</em>'.
	 * @see de.jena.traficam.Coordinates#getHeading3dConfidence()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Heading3dConfidence();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.CamConfig <em>Cam Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cam Config</em>'.
	 * @see de.jena.traficam.CamConfig
	 * @generated
	 */
	EClass getCamConfig();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.CamConfig#getCalibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibration</em>'.
	 * @see de.jena.traficam.CamConfig#getCalibration()
	 * @see #getCamConfig()
	 * @generated
	 */
	EReference getCamConfig_Calibration();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.CamConfig#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.jena.traficam.CamConfig#getLocation()
	 * @see #getCamConfig()
	 * @generated
	 */
	EReference getCamConfig_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.CamConfig#getFieldOfView <em>Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Of View</em>'.
	 * @see de.jena.traficam.CamConfig#getFieldOfView()
	 * @see #getCamConfig()
	 * @generated
	 */
	EReference getCamConfig_FieldOfView();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.CamConfig#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scene</em>'.
	 * @see de.jena.traficam.CamConfig#getScene()
	 * @see #getCamConfig()
	 * @generated
	 */
	EReference getCamConfig_Scene();

	/**
	 * Returns the meta object for the map '{@link de.jena.traficam.CamConfig#getClassMap <em>Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Class Map</em>'.
	 * @see de.jena.traficam.CamConfig#getClassMap()
	 * @see #getCamConfig()
	 * @generated
	 */
	EReference getCamConfig_ClassMap();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.Calibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calibration</em>'.
	 * @see de.jena.traficam.Calibration
	 * @generated
	 */
	EClass getCalibration();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Calibration#getFocalDistance <em>Focal Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Distance</em>'.
	 * @see de.jena.traficam.Calibration#getFocalDistance()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_FocalDistance();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Calibration#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.jena.traficam.Calibration#getHeight()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Calibration#getPanAngle <em>Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan Angle</em>'.
	 * @see de.jena.traficam.Calibration#getPanAngle()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_PanAngle();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Calibration#getRollAngle <em>Roll Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll Angle</em>'.
	 * @see de.jena.traficam.Calibration#getRollAngle()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_RollAngle();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.Calibration#getTiltAngle <em>Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Angle</em>'.
	 * @see de.jena.traficam.Calibration#getTiltAngle()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_TiltAngle();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.FieldOfView <em>Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Of View</em>'.
	 * @see de.jena.traficam.FieldOfView
	 * @generated
	 */
	EClass getFieldOfView();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.FieldOfView#getHfov <em>Hfov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hfov</em>'.
	 * @see de.jena.traficam.FieldOfView#getHfov()
	 * @see #getFieldOfView()
	 * @generated
	 */
	EAttribute getFieldOfView_Hfov();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.FieldOfView#getVfov <em>Vfov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vfov</em>'.
	 * @see de.jena.traficam.FieldOfView#getVfov()
	 * @see #getFieldOfView()
	 * @generated
	 */
	EAttribute getFieldOfView_Vfov();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see de.jena.traficam.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.Scene#getLeftBottom <em>Left Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Bottom</em>'.
	 * @see de.jena.traficam.Scene#getLeftBottom()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_LeftBottom();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.Scene#getLeftTop <em>Left Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Top</em>'.
	 * @see de.jena.traficam.Scene#getLeftTop()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_LeftTop();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.Scene#getRightBottom <em>Right Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Bottom</em>'.
	 * @see de.jena.traficam.Scene#getRightBottom()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_RightBottom();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.traficam.Scene#getRightTop <em>Right Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Top</em>'.
	 * @see de.jena.traficam.Scene#getRightTop()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_RightTop();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getClassMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getClassMap()
	 * @generated
	 */
	EAttribute getClassMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getClassMap()
	 * @generated
	 */
	EAttribute getClassMap_Value();

	/**
	 * Returns the meta object for enum '{@link de.jena.traficam.MessagType <em>Messag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Messag Type</em>'.
	 * @see de.jena.traficam.MessagType
	 * @generated
	 */
	EEnum getMessagType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrafiCamFactory getTrafiCamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.TrafiCamImpl <em>Trafi Cam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.TrafiCamImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getTrafiCam()
		 * @generated
		 */
		EClass TRAFI_CAM = eINSTANCE.getTrafiCam();

		/**
		 * The meta object literal for the '<em><b>Data Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM__DATA_NUMBER = eINSTANCE.getTrafiCam_DataNumber();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM__TYPE = eINSTANCE.getTrafiCam_Type();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM__MESSAGE_TYPE = eINSTANCE.getTrafiCam_MessageType();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFI_CAM__OBJECT = eINSTANCE.getTrafiCam_Object();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM__TIME = eINSTANCE.getTrafiCam_Time();

		/**
		 * The meta object literal for the '<em><b>Interval Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM__INTERVAL_TIME = eINSTANCE.getTrafiCam_IntervalTime();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.TrafiCamObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.TrafiCamObjectImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getTrafiCamObject()
		 * @generated
		 */
		EClass TRAFI_CAM_OBJECT = eINSTANCE.getTrafiCamObject();

		/**
		 * The meta object literal for the '<em><b>Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM_OBJECT__CLASS_ID = eINSTANCE.getTrafiCamObject_ClassId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM_OBJECT__ID = eINSTANCE.getTrafiCamObject_Id();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM_OBJECT__TIME = eINSTANCE.getTrafiCamObject_Time();

		/**
		 * The meta object literal for the '<em><b>Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM_OBJECT__LIFETIME = eINSTANCE.getTrafiCamObject_Lifetime();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM_OBJECT__SPEED = eINSTANCE.getTrafiCamObject_Speed();

		/**
		 * The meta object literal for the '<em><b>Speed Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM_OBJECT__SPEED_CONFIDENCE = eINSTANCE.getTrafiCamObject_SpeedConfidence();

		/**
		 * The meta object literal for the '<em><b>Gps Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFI_CAM_OBJECT__GPS_COORDINATES = eINSTANCE.getTrafiCamObject_GpsCoordinates();

		/**
		 * The meta object literal for the '<em><b>Image Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFI_CAM_OBJECT__IMAGE_COORDINATES = eINSTANCE.getTrafiCamObject_ImageCoordinates();

		/**
		 * The meta object literal for the '<em><b>World Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFI_CAM_OBJECT__WORLD_COORDINATES = eINSTANCE.getTrafiCamObject_WorldCoordinates();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.GpsCoordinatesImpl <em>Gps Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.GpsCoordinatesImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getGpsCoordinates()
		 * @generated
		 */
		EClass GPS_COORDINATES = eINSTANCE.getGpsCoordinates();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_COORDINATES__LATITUDE = eINSTANCE.getGpsCoordinates_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_COORDINATES__LONGITUDE = eINSTANCE.getGpsCoordinates_Longitude();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_COORDINATES__HEADING = eINSTANCE.getGpsCoordinates_Heading();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.CoordinatesImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__X = eINSTANCE.getCoordinates_X();

		/**
		 * The meta object literal for the '<em><b>XConfidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__XCONFIDENCE = eINSTANCE.getCoordinates_XConfidence();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__Y = eINSTANCE.getCoordinates_Y();

		/**
		 * The meta object literal for the '<em><b>YConfidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__YCONFIDENCE = eINSTANCE.getCoordinates_YConfidence();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__Z = eINSTANCE.getCoordinates_Z();

		/**
		 * The meta object literal for the '<em><b>Heading3d</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__HEADING3D = eINSTANCE.getCoordinates_Heading3d();

		/**
		 * The meta object literal for the '<em><b>Heading3d Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__HEADING3D_CONFIDENCE = eINSTANCE.getCoordinates_Heading3dConfidence();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.CamConfigImpl <em>Cam Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.CamConfigImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getCamConfig()
		 * @generated
		 */
		EClass CAM_CONFIG = eINSTANCE.getCamConfig();

		/**
		 * The meta object literal for the '<em><b>Calibration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_CONFIG__CALIBRATION = eINSTANCE.getCamConfig_Calibration();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_CONFIG__LOCATION = eINSTANCE.getCamConfig_Location();

		/**
		 * The meta object literal for the '<em><b>Field Of View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_CONFIG__FIELD_OF_VIEW = eINSTANCE.getCamConfig_FieldOfView();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_CONFIG__SCENE = eINSTANCE.getCamConfig_Scene();

		/**
		 * The meta object literal for the '<em><b>Class Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_CONFIG__CLASS_MAP = eINSTANCE.getCamConfig_ClassMap();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.CalibrationImpl <em>Calibration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.CalibrationImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getCalibration()
		 * @generated
		 */
		EClass CALIBRATION = eINSTANCE.getCalibration();

		/**
		 * The meta object literal for the '<em><b>Focal Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__FOCAL_DISTANCE = eINSTANCE.getCalibration_FocalDistance();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__HEIGHT = eINSTANCE.getCalibration_Height();

		/**
		 * The meta object literal for the '<em><b>Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__PAN_ANGLE = eINSTANCE.getCalibration_PanAngle();

		/**
		 * The meta object literal for the '<em><b>Roll Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__ROLL_ANGLE = eINSTANCE.getCalibration_RollAngle();

		/**
		 * The meta object literal for the '<em><b>Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__TILT_ANGLE = eINSTANCE.getCalibration_TiltAngle();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.FieldOfViewImpl <em>Field Of View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.FieldOfViewImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getFieldOfView()
		 * @generated
		 */
		EClass FIELD_OF_VIEW = eINSTANCE.getFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Hfov</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW__HFOV = eINSTANCE.getFieldOfView_Hfov();

		/**
		 * The meta object literal for the '<em><b>Vfov</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW__VFOV = eINSTANCE.getFieldOfView_Vfov();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.SceneImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Left Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__LEFT_BOTTOM = eINSTANCE.getScene_LeftBottom();

		/**
		 * The meta object literal for the '<em><b>Left Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__LEFT_TOP = eINSTANCE.getScene_LeftTop();

		/**
		 * The meta object literal for the '<em><b>Right Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__RIGHT_BOTTOM = eINSTANCE.getScene_RightBottom();

		/**
		 * The meta object literal for the '<em><b>Right Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__RIGHT_TOP = eINSTANCE.getScene_RightTop();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.impl.ClassMapImpl <em>Class Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.impl.ClassMapImpl
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getClassMap()
		 * @generated
		 */
		EClass CLASS_MAP = eINSTANCE.getClassMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MAP__KEY = eINSTANCE.getClassMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MAP__VALUE = eINSTANCE.getClassMap_Value();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.MessagType <em>Messag Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.MessagType
		 * @see de.jena.traficam.impl.TrafiCamPackageImpl#getMessagType()
		 * @generated
		 */
		EEnum MESSAG_TYPE = eINSTANCE.getMessagType();

	}

} //TrafiCamPackage
