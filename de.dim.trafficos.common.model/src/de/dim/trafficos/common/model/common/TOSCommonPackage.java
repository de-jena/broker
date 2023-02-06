/**
 */
package de.dim.trafficos.common.model.common;

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
 * @see de.dim.trafficos.common.model.common.TOSCommonFactory
 * @model kind="package"
 * @generated
 */
public interface TOSCommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datainmotion.de/trafficos/common/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSCommonPackage eINSTANCE = de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.IdNameElementImpl <em>Id Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.IdNameElementImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getIdNameElement()
	 * @generated
	 */
	int ID_NAME_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Id Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Id Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.AbstractDataEntryImpl <em>Abstract Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.AbstractDataEntryImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getAbstractDataEntry()
	 * @generated
	 */
	int ABSTRACT_DATA_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY__INDEX = 2;

	/**
	 * The number of structural features of the '<em>Abstract Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.AbstractTimeTableEntryImpl <em>Abstract Time Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.AbstractTimeTableEntryImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getAbstractTimeTableEntry()
	 * @generated
	 */
	int ABSTRACT_TIME_TABLE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__MODE = 1;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__BEGIN = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY__END = 3;

	/**
	 * The number of structural features of the '<em>Abstract Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Time Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_TABLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.LocalizableImpl <em>Localizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.LocalizableImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getLocalizable()
	 * @generated
	 */
	int LOCALIZABLE = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZABLE__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Localizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Localizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.LocationImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.NetworkLocationImpl <em>Network Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.NetworkLocationImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getNetworkLocation()
	 * @generated
	 */
	int NETWORK_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Ip4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__IP4_ADDRESS = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__IP6_ADDRESS = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION__HOSTNAME = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Network Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.PositionImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LATITUDE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LONGITUDE = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ALTITUDE = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ORIENTATION = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bearing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__BEARING = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.AddressLocationImpl <em>Address Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.AddressLocationImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getAddressLocation()
	 * @generated
	 */
	int ADDRESS_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__LOCATION = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__STREET = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__ZIP = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION__DISTRICT = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Address Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Address Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.DataEntryImpl <em>Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.DataEntryImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getDataEntry()
	 * @generated
	 */
	int DATA_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__ID = ABSTRACT_DATA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__TIMESTAMP = ABSTRACT_DATA_ENTRY__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__INDEX = ABSTRACT_DATA_ENTRY__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__VALUE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__CONFIGURATION = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__DEVICE = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY_FEATURE_COUNT = ABSTRACT_DATA_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY_OPERATION_COUNT = ABSTRACT_DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.DataValueImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__ELEMENT_REF = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__DURATION = 3;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.OutputImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LOCATION = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = ID_NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DEFAULT_VALUE = ID_NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.impl.ParameterImpl
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = ID_NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ID_NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_TYPE = ID_NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ID_NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ID_NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.ParameterDataType <em>Parameter Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.ParameterDataType
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getParameterDataType()
	 * @generated
	 */
	int PARAMETER_DATA_TYPE = 12;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.DirectionType
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 13;

	/**
	 * The meta object id for the '{@link de.dim.trafficos.common.model.common.ScheduleModeType <em>Schedule Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dim.trafficos.common.model.common.ScheduleModeType
	 * @see de.dim.trafficos.common.model.common.impl.TOSCommonPackageImpl#getScheduleModeType()
	 * @generated
	 */
	int SCHEDULE_MODE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.IdNameElement <em>Id Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Name Element</em>'.
	 * @see de.dim.trafficos.common.model.common.IdNameElement
	 * @generated
	 */
	EClass getIdNameElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.IdNameElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.common.model.common.IdNameElement#getId()
	 * @see #getIdNameElement()
	 * @generated
	 */
	EAttribute getIdNameElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.IdNameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dim.trafficos.common.model.common.IdNameElement#getName()
	 * @see #getIdNameElement()
	 * @generated
	 */
	EAttribute getIdNameElement_Name();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.AbstractDataEntry <em>Abstract Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Entry</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractDataEntry
	 * @generated
	 */
	EClass getAbstractDataEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractDataEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractDataEntry#getId()
	 * @see #getAbstractDataEntry()
	 * @generated
	 */
	EAttribute getAbstractDataEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractDataEntry#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractDataEntry#getTimestamp()
	 * @see #getAbstractDataEntry()
	 * @generated
	 */
	EAttribute getAbstractDataEntry_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractDataEntry#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractDataEntry#getIndex()
	 * @see #getAbstractDataEntry()
	 * @generated
	 */
	EAttribute getAbstractDataEntry_Index();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry <em>Abstract Time Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time Table Entry</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractTimeTableEntry
	 * @generated
	 */
	EClass getAbstractTimeTableEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getIndex()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_Index();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getMode()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_Mode();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getBegin()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_Begin();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getEnd()
	 * @see #getAbstractTimeTableEntry()
	 * @generated
	 */
	EAttribute getAbstractTimeTableEntry_End();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.Localizable <em>Localizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localizable</em>'.
	 * @see de.dim.trafficos.common.model.common.Localizable
	 * @generated
	 */
	EClass getLocalizable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.common.model.common.Localizable#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see de.dim.trafficos.common.model.common.Localizable#getLocation()
	 * @see #getLocalizable()
	 * @generated
	 */
	EReference getLocalizable_Location();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.dim.trafficos.common.model.common.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dim.trafficos.common.model.common.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.NetworkLocation <em>Network Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Location</em>'.
	 * @see de.dim.trafficos.common.model.common.NetworkLocation
	 * @generated
	 */
	EClass getNetworkLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.NetworkLocation#getIp4Address <em>Ip4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip4 Address</em>'.
	 * @see de.dim.trafficos.common.model.common.NetworkLocation#getIp4Address()
	 * @see #getNetworkLocation()
	 * @generated
	 */
	EAttribute getNetworkLocation_Ip4Address();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.NetworkLocation#getIp6Address <em>Ip6 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip6 Address</em>'.
	 * @see de.dim.trafficos.common.model.common.NetworkLocation#getIp6Address()
	 * @see #getNetworkLocation()
	 * @generated
	 */
	EAttribute getNetworkLocation_Ip6Address();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.NetworkLocation#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see de.dim.trafficos.common.model.common.NetworkLocation#getHostname()
	 * @see #getNetworkLocation()
	 * @generated
	 */
	EAttribute getNetworkLocation_Hostname();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see de.dim.trafficos.common.model.common.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Position#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.dim.trafficos.common.model.common.Position#getLatitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Position#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.dim.trafficos.common.model.common.Position#getLongitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Position#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see de.dim.trafficos.common.model.common.Position#getAltitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Position#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see de.dim.trafficos.common.model.common.Position#getOrientation()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Position#getBearing <em>Bearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearing</em>'.
	 * @see de.dim.trafficos.common.model.common.Position#getBearing()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Bearing();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.AddressLocation <em>Address Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Location</em>'.
	 * @see de.dim.trafficos.common.model.common.AddressLocation
	 * @generated
	 */
	EClass getAddressLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AddressLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.dim.trafficos.common.model.common.AddressLocation#getLocation()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AddressLocation#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see de.dim.trafficos.common.model.common.AddressLocation#getStreet()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_Street();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AddressLocation#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see de.dim.trafficos.common.model.common.AddressLocation#getZip()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_Zip();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.AddressLocation#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see de.dim.trafficos.common.model.common.AddressLocation#getDistrict()
	 * @see #getAddressLocation()
	 * @generated
	 */
	EAttribute getAddressLocation_District();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.DataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Entry</em>'.
	 * @see de.dim.trafficos.common.model.common.DataEntry
	 * @generated
	 */
	EClass getDataEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dim.trafficos.common.model.common.DataEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.dim.trafficos.common.model.common.DataEntry#getValue()
	 * @see #getDataEntry()
	 * @generated
	 */
	EReference getDataEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.DataEntry#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see de.dim.trafficos.common.model.common.DataEntry#getConfiguration()
	 * @see #getDataEntry()
	 * @generated
	 */
	EAttribute getDataEntry_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.DataEntry#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see de.dim.trafficos.common.model.common.DataEntry#getDevice()
	 * @see #getDataEntry()
	 * @generated
	 */
	EAttribute getDataEntry_Device();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see de.dim.trafficos.common.model.common.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.DataValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dim.trafficos.common.model.common.DataValue#getValue()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.dim.trafficos.common.model.common.DataValue#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see de.dim.trafficos.common.model.common.DataValue#getElement()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_Element();

	/**
	 * Returns the meta object for the reference '{@link de.dim.trafficos.common.model.common.DataValue#getElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Ref</em>'.
	 * @see de.dim.trafficos.common.model.common.DataValue#getElementRef()
	 * @see #getDataValue()
	 * @generated
	 */
	EReference getDataValue_ElementRef();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.DataValue#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dim.trafficos.common.model.common.DataValue#getDuration()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Duration();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see de.dim.trafficos.common.model.common.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Output#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dim.trafficos.common.model.common.Output#getDescription()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dim.trafficos.common.model.common.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Output#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.dim.trafficos.common.model.common.Output#getDefaultValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_DefaultValue();

	/**
	 * Returns the meta object for class '{@link de.dim.trafficos.common.model.common.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.dim.trafficos.common.model.common.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.dim.trafficos.common.model.common.Parameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see de.dim.trafficos.common.model.common.Parameter#getDataType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DataType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.common.model.common.ParameterDataType <em>Parameter Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Data Type</em>'.
	 * @see de.dim.trafficos.common.model.common.ParameterDataType
	 * @generated
	 */
	EEnum getParameterDataType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.common.model.common.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see de.dim.trafficos.common.model.common.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link de.dim.trafficos.common.model.common.ScheduleModeType <em>Schedule Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schedule Mode Type</em>'.
	 * @see de.dim.trafficos.common.model.common.ScheduleModeType
	 * @generated
	 */
	EEnum getScheduleModeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TOSCommonFactory getTOSCommonFactory();

} //TOSCommonPackage
