/*
 */
package de.jena.chirpstack.moisture.model.moisture;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

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
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoistureFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ChirpstackMoisturePackage.eNS_URI, genModel = "/model/chirpstack-moisture.genmodel", genModelSourceLocations = {"model/chirpstack-moisture.genmodel","de.jena.chirpstack.moisture.model/model/chirpstack-moisture.genmodel"}, ecore="/model/chirpstack-moisture.ecore", ecoreSourceLocations="/model/chirpstack-moisture.ecore")
public interface ChirpstackMoisturePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moisture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/sensinact/chirpstack/moisture/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moisture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChirpstackMoisturePackage eINSTANCE = de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl <em>Dragino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDragino()
	 * @generated
	 */
	int DRAGINO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__SENSOR = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__SOIL = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO__DEVICE = ProviderPackage.PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dragino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Dragino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAGINO_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BATTERY = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IFLAG = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SFLAG = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MOD = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Temperature DS18B20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TEMPERATURE_DS18B20 = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl <em>Soil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSoil()
	 * @generated
	 */
	int SOIL = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__TEMPERATURE = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__WATER = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL__CONDUCT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Soil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Soil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOIL_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl
	 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Dev EUI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEV_EUI = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profile Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROFILE_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROFILE_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TENANT_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TENANT_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__APPLICATION_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__APPLICATION_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Dragino <em>Dragino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dragino</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino
	 * @generated
	 */
	EClass getDragino();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino#getSensor()
	 * @see #getDragino()
	 * @generated
	 */
	EReference getDragino_Sensor();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSoil <em>Soil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soil</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino#getSoil()
	 * @see #getDragino()
	 * @generated
	 */
	EReference getDragino_Soil();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Dragino#getDevice()
	 * @see #getDragino()
	 * @generated
	 */
	EReference getDragino_Device();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getBattery()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Battery();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getIflag <em>Iflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iflag</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getIflag()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Iflag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getSflag <em>Sflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sflag</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getSflag()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Sflag();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mod</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getMod()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Mod();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getTemperatureDS18B20 <em>Temperature DS18B20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature DS18B20</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Sensor#getTemperatureDS18B20()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_TemperatureDS18B20();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Soil <em>Soil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soil</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil
	 * @generated
	 */
	EClass getSoil();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Soil#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil#getTemperature()
	 * @see #getSoil()
	 * @generated
	 */
	EAttribute getSoil_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Soil#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil#getWater()
	 * @see #getSoil()
	 * @generated
	 */
	EAttribute getSoil_Water();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Soil#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Soil#getConduct()
	 * @see #getSoil()
	 * @generated
	 */
	EAttribute getSoil_Conduct();

	/**
	 * Returns the meta object for class '{@link de.jena.chirpstack.moisture.model.moisture.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getDevEUI <em>Dev EUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev EUI</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getDevEUI()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DevEUI();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileId <em>Profile Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Id</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getProfileId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ProfileId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileName <em>Profile Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getProfileName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ProfileName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getTenantId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantName <em>Tenant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getTenantName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_TenantName();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getApplicationId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see de.jena.chirpstack.moisture.model.moisture.Device#getApplicationName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ApplicationName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChirpstackMoistureFactory getChirpstackMoistureFactory();

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
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl <em>Dragino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.DraginoImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDragino()
		 * @generated
		 */
		EClass DRAGINO = eINSTANCE.getDragino();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAGINO__SENSOR = eINSTANCE.getDragino_Sensor();

		/**
		 * The meta object literal for the '<em><b>Soil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAGINO__SOIL = eINSTANCE.getDragino_Soil();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAGINO__DEVICE = eINSTANCE.getDragino_Device();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SensorImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__BATTERY = eINSTANCE.getSensor_Battery();

		/**
		 * The meta object literal for the '<em><b>Iflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__IFLAG = eINSTANCE.getSensor_Iflag();

		/**
		 * The meta object literal for the '<em><b>Sflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SFLAG = eINSTANCE.getSensor_Sflag();

		/**
		 * The meta object literal for the '<em><b>Mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MOD = eINSTANCE.getSensor_Mod();

		/**
		 * The meta object literal for the '<em><b>Temperature DS18B20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TEMPERATURE_DS18B20 = eINSTANCE.getSensor_TemperatureDS18B20();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl <em>Soil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.SoilImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getSoil()
		 * @generated
		 */
		EClass SOIL = eINSTANCE.getSoil();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIL__TEMPERATURE = eINSTANCE.getSoil_Temperature();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIL__WATER = eINSTANCE.getSoil_Water();

		/**
		 * The meta object literal for the '<em><b>Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOIL__CONDUCT = eINSTANCE.getSoil_Conduct();

		/**
		 * The meta object literal for the '{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl
		 * @see de.jena.chirpstack.moisture.model.moisture.impl.ChirpstackMoisturePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Dev EUI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEV_EUI = eINSTANCE.getDevice_DevEUI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Profile Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PROFILE_ID = eINSTANCE.getDevice_ProfileId();

		/**
		 * The meta object literal for the '<em><b>Profile Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PROFILE_NAME = eINSTANCE.getDevice_ProfileName();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TENANT_ID = eINSTANCE.getDevice_TenantId();

		/**
		 * The meta object literal for the '<em><b>Tenant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TENANT_NAME = eINSTANCE.getDevice_TenantName();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__APPLICATION_ID = eINSTANCE.getDevice_ApplicationId();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__APPLICATION_NAME = eINSTANCE.getDevice_ApplicationName();

	}

} //ChirpstackMoisturePackage
