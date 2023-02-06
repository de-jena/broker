/**
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import de.dim.trafficos.common.model.common.TOSCommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightFactory
 * @model kind="package"
 * @generated
 */
public interface TOSTrafficLightPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trafficlight";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.de/example/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trafficlight";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSTrafficLightPackage eINSTANCE = de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLModuleImpl <em>TL Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TLModuleImpl
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl#getTLModule()
	 * @generated
	 */
	int TL_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_MODULE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_MODULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Signal Transmitter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_MODULE__SIGNAL_TRANSMITTER = 2;

	/**
	 * The number of structural features of the '<em>TL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_MODULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLSignalTransmitterImpl <em>TL Signal Transmitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TLSignalTransmitterImpl
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl#getTLSignalTransmitter()
	 * @generated
	 */
	int TL_SIGNAL_TRANSMITTER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__ID = TOSCommonPackage.OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__NAME = TOSCommonPackage.OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__LOCATION = TOSCommonPackage.OUTPUT__LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__DESCRIPTION = TOSCommonPackage.OUTPUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__TYPE = TOSCommonPackage.OUTPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__DEFAULT_VALUE = TOSCommonPackage.OUTPUT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP = TOSCommonPackage.OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL = TOSCommonPackage.OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TL Signal Transmitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER_FEATURE_COUNT = TOSCommonPackage.OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TL Signal Transmitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_TRANSMITTER_OPERATION_COUNT = TOSCommonPackage.OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.TLSignalGroupImpl <em>TL Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TLSignalGroupImpl
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl#getTLSignalGroup()
	 * @generated
	 */
	int TL_SIGNAL_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_GROUP__ID = 0;

	/**
	 * The number of structural features of the '<em>TL Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TL Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_SIGNAL_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.trafficlight.model.trafficlight.impl.LightSignalImpl <em>Light Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.LightSignalImpl
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl#getLightSignal()
	 * @generated
	 */
	int LIGHT_SIGNAL = 3;

	/**
	 * The feature id for the '<em><b>Bliking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SIGNAL__BLIKING = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SIGNAL__VALUE = 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SIGNAL__ON = 2;

	/**
	 * The number of structural features of the '<em>Light Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SIGNAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Light Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType <em>TL Module Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl#getTLModuleType()
	 * @generated
	 */
	int TL_MODULE_TYPE = 4;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType <em>Signal Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightPackageImpl#getSignalValueType()
	 * @generated
	 */
	int SIGNAL_VALUE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule <em>TL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Module</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModule
	 * @generated
	 */
	EClass getTLModule();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getAddress()
	 * @see #getTLModule()
	 * @generated
	 */
	EAttribute getTLModule_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getType()
	 * @see #getTLModule()
	 * @generated
	 */
	EAttribute getTLModule_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getSignalTransmitter <em>Signal Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Transmitter</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getSignalTransmitter()
	 * @see #getTLModule()
	 * @generated
	 */
	EReference getTLModule_SignalTransmitter();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter <em>TL Signal Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Signal Transmitter</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter
	 * @generated
	 */
	EClass getTLSignalTransmitter();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Group</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getSignalGroup()
	 * @see #getTLSignalTransmitter()
	 * @generated
	 */
	EReference getTLSignalTransmitter_SignalGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getLightSignal <em>Light Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light Signal</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getLightSignal()
	 * @see #getTLSignalTransmitter()
	 * @generated
	 */
	EReference getTLSignalTransmitter_LightSignal();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup <em>TL Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Signal Group</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup
	 * @generated
	 */
	EClass getTLSignalGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup#getId()
	 * @see #getTLSignalGroup()
	 * @generated
	 */
	EAttribute getTLSignalGroup_Id();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal <em>Light Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Signal</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.LightSignal
	 * @generated
	 */
	EClass getLightSignal();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isBliking <em>Bliking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bliking</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isBliking()
	 * @see #getLightSignal()
	 * @generated
	 */
	EAttribute getLightSignal_Bliking();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#getValue()
	 * @see #getLightSignal()
	 * @generated
	 */
	EAttribute getLightSignal_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isOn()
	 * @see #getLightSignal()
	 * @generated
	 */
	EAttribute getLightSignal_On();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType <em>TL Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TL Module Type</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType
	 * @generated
	 */
	EEnum getTLModuleType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType <em>Signal Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Value Type</em>'.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType
	 * @generated
	 */
	EEnum getSignalValueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TOSTrafficLightFactory getTOSTrafficLightFactory();

} //TOSTrafficLightPackage
