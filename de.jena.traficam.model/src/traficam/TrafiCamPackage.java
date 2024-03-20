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
package traficam;


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
 * @see traficam.TrafiCamFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
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
	TrafiCamPackage eINSTANCE = traficam.impl.TrafiCamPackageImpl.init();

	/**
	 * The meta object id for the '{@link traficam.impl.TrafiCamImpl <em>Trafi Cam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traficam.impl.TrafiCamImpl
	 * @see traficam.impl.TrafiCamPackageImpl#getTrafiCam()
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
	 * The feature id for the '<em><b>Cam Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM__CAM_ID = 6;

	/**
	 * The number of structural features of the '<em>Trafi Cam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Trafi Cam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFI_CAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link traficam.impl.TrafiCamObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traficam.impl.TrafiCamObjectImpl
	 * @see traficam.impl.TrafiCamPackageImpl#getTrafiCamObject()
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
	 * The meta object id for the '{@link traficam.impl.GpsCoordinatesImpl <em>Gps Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traficam.impl.GpsCoordinatesImpl
	 * @see traficam.impl.TrafiCamPackageImpl#getGpsCoordinates()
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
	 * The meta object id for the '{@link traficam.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traficam.impl.CoordinatesImpl
	 * @see traficam.impl.TrafiCamPackageImpl#getCoordinates()
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
	 * The meta object id for the '{@link traficam.MessagType <em>Messag Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traficam.MessagType
	 * @see traficam.impl.TrafiCamPackageImpl#getMessagType()
	 * @generated
	 */
	int MESSAG_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link traficam.TrafiCam <em>Trafi Cam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trafi Cam</em>'.
	 * @see traficam.TrafiCam
	 * @generated
	 */
	EClass getTrafiCam();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCam#getDataNumber <em>Data Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Number</em>'.
	 * @see traficam.TrafiCam#getDataNumber()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_DataNumber();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see traficam.TrafiCam#getType()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_Type();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCam#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see traficam.TrafiCam#getMessageType()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_MessageType();

	/**
	 * Returns the meta object for the containment reference list '{@link traficam.TrafiCam#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see traficam.TrafiCam#getObject()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EReference getTrafiCam_Object();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCam#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see traficam.TrafiCam#getTime()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_Time();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCam#getIntervalTime <em>Interval Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Time</em>'.
	 * @see traficam.TrafiCam#getIntervalTime()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_IntervalTime();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCam#getCamId <em>Cam Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cam Id</em>'.
	 * @see traficam.TrafiCam#getCamId()
	 * @see #getTrafiCam()
	 * @generated
	 */
	EAttribute getTrafiCam_CamId();

	/**
	 * Returns the meta object for class '{@link traficam.TrafiCamObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see traficam.TrafiCamObject
	 * @generated
	 */
	EClass getTrafiCamObject();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCamObject#getClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Id</em>'.
	 * @see traficam.TrafiCamObject#getClassId()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_ClassId();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCamObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see traficam.TrafiCamObject#getId()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCamObject#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see traficam.TrafiCamObject#getTime()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Time();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCamObject#getLifetime <em>Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifetime</em>'.
	 * @see traficam.TrafiCamObject#getLifetime()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Lifetime();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCamObject#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see traficam.TrafiCamObject#getSpeed()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_Speed();

	/**
	 * Returns the meta object for the attribute '{@link traficam.TrafiCamObject#getSpeedConfidence <em>Speed Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Confidence</em>'.
	 * @see traficam.TrafiCamObject#getSpeedConfidence()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EAttribute getTrafiCamObject_SpeedConfidence();

	/**
	 * Returns the meta object for the containment reference list '{@link traficam.TrafiCamObject#getGpsCoordinates <em>Gps Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gps Coordinates</em>'.
	 * @see traficam.TrafiCamObject#getGpsCoordinates()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EReference getTrafiCamObject_GpsCoordinates();

	/**
	 * Returns the meta object for the containment reference list '{@link traficam.TrafiCamObject#getImageCoordinates <em>Image Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Coordinates</em>'.
	 * @see traficam.TrafiCamObject#getImageCoordinates()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EReference getTrafiCamObject_ImageCoordinates();

	/**
	 * Returns the meta object for the containment reference list '{@link traficam.TrafiCamObject#getWorldCoordinates <em>World Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>World Coordinates</em>'.
	 * @see traficam.TrafiCamObject#getWorldCoordinates()
	 * @see #getTrafiCamObject()
	 * @generated
	 */
	EReference getTrafiCamObject_WorldCoordinates();

	/**
	 * Returns the meta object for class '{@link traficam.GpsCoordinates <em>Gps Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Coordinates</em>'.
	 * @see traficam.GpsCoordinates
	 * @generated
	 */
	EClass getGpsCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link traficam.GpsCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see traficam.GpsCoordinates#getLatitude()
	 * @see #getGpsCoordinates()
	 * @generated
	 */
	EAttribute getGpsCoordinates_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link traficam.GpsCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see traficam.GpsCoordinates#getLongitude()
	 * @see #getGpsCoordinates()
	 * @generated
	 */
	EAttribute getGpsCoordinates_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link traficam.GpsCoordinates#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see traficam.GpsCoordinates#getHeading()
	 * @see #getGpsCoordinates()
	 * @generated
	 */
	EAttribute getGpsCoordinates_Heading();

	/**
	 * Returns the meta object for class '{@link traficam.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see traficam.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see traficam.Coordinates#getX()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_X();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getXConfidence <em>XConfidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XConfidence</em>'.
	 * @see traficam.Coordinates#getXConfidence()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_XConfidence();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see traficam.Coordinates#getY()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Y();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getYConfidence <em>YConfidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YConfidence</em>'.
	 * @see traficam.Coordinates#getYConfidence()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_YConfidence();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see traficam.Coordinates#getZ()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Z();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getHeading3d <em>Heading3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading3d</em>'.
	 * @see traficam.Coordinates#getHeading3d()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Heading3d();

	/**
	 * Returns the meta object for the attribute '{@link traficam.Coordinates#getHeading3dConfidence <em>Heading3d Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading3d Confidence</em>'.
	 * @see traficam.Coordinates#getHeading3dConfidence()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Heading3dConfidence();

	/**
	 * Returns the meta object for enum '{@link traficam.MessagType <em>Messag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Messag Type</em>'.
	 * @see traficam.MessagType
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
		 * The meta object literal for the '{@link traficam.impl.TrafiCamImpl <em>Trafi Cam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traficam.impl.TrafiCamImpl
		 * @see traficam.impl.TrafiCamPackageImpl#getTrafiCam()
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
		 * The meta object literal for the '<em><b>Cam Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFI_CAM__CAM_ID = eINSTANCE.getTrafiCam_CamId();

		/**
		 * The meta object literal for the '{@link traficam.impl.TrafiCamObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traficam.impl.TrafiCamObjectImpl
		 * @see traficam.impl.TrafiCamPackageImpl#getTrafiCamObject()
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
		 * The meta object literal for the '{@link traficam.impl.GpsCoordinatesImpl <em>Gps Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traficam.impl.GpsCoordinatesImpl
		 * @see traficam.impl.TrafiCamPackageImpl#getGpsCoordinates()
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
		 * The meta object literal for the '{@link traficam.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traficam.impl.CoordinatesImpl
		 * @see traficam.impl.TrafiCamPackageImpl#getCoordinates()
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
		 * The meta object literal for the '{@link traficam.MessagType <em>Messag Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traficam.MessagType
		 * @see traficam.impl.TrafiCamPackageImpl#getMessagType()
		 * @generated
		 */
		EEnum MESSAG_TYPE = eINSTANCE.getMessagType();

	}

} //TrafiCamPackage
