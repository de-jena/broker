/*
 */
package de.jena.nahverkehr.station.rectifier;


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
 * @see de.jena.nahverkehr.station.rectifier.RectifierFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
@ProviderType
@EPackage(uri = RectifierPackage.eNS_URI, genModel = "/model/rectifier.genmodel", genModelSourceLocations = {"model/rectifier.genmodel","de.jena.nahverkehr.station.rectifier.model/model/rectifier.genmodel"}, ecore="/model/rectifier.ecore", ecoreSourceLocations="/model/rectifier.ecore")
public interface RectifierPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rectifier";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://upd.jena.de/model/nahverkehr/rectifier/substation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rectifier";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RectifierPackage eINSTANCE = de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.SubstationImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getSubstation()
	 * @generated
	 */
	int SUBSTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__VOLTAGE = 5;

	/**
	 * The feature id for the '<em><b>Outgoing Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__OUTGOING_LINES = 6;

	/**
	 * The feature id for the '<em><b>Disconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__DISCONNECTORS = 7;

	/**
	 * The feature id for the '<em><b>Mittelspannungsfelder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__MITTELSPANNUNGSFELDER = 8;

	/**
	 * The feature id for the '<em><b>Overground Calbes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__OVERGROUND_CALBES = 9;

	/**
	 * The number of structural features of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.ValueImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.BooleanValueImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.RegsiterMessageImpl <em>Regsiter Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.RegsiterMessageImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getRegsiterMessage()
	 * @generated
	 */
	int REGSITER_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGSITER_MESSAGE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGSITER_MESSAGE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGSITER_MESSAGE__ACTIVE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGSITER_MESSAGE__DESCRIPTION = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regsiter Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGSITER_MESSAGE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Regsiter Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGSITER_MESSAGE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.MeasurementValueImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getMeasurementValue()
	 * @generated
	 */
	int MEASUREMENT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE__UNIT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl <em>Over Ground Cabel Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getOverGroundCabelDistribution()
	 * @generated
	 */
	int OVER_GROUND_CABEL_DISTRIBUTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_GROUND_CABEL_DISTRIBUTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Cables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_GROUND_CABEL_DISTRIBUTION__CABLES = 1;

	/**
	 * The feature id for the '<em><b>Disconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR = 2;

	/**
	 * The number of structural features of the '<em>Over Ground Cabel Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_GROUND_CABEL_DISTRIBUTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Over Ground Cabel Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVER_GROUND_CABEL_DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.CabelImpl <em>Cabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.CabelImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getCabel()
	 * @generated
	 */
	int CABEL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Alarms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABEL__ALARMS = 1;

	/**
	 * The number of structural features of the '<em>Cabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl <em>Outgoing Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getOutgoingLine()
	 * @generated
	 */
	int OUTGOING_LINE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE__ID = 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE__POWER = 1;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE__FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Breaker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE__BREAKER = 3;

	/**
	 * The feature id for the '<em><b>Thermal Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE__THERMAL_LOAD = 4;

	/**
	 * The feature id for the '<em><b>Cables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE__CABLES = 5;

	/**
	 * The number of structural features of the '<em>Outgoing Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Outgoing Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.BreakerImpl <em>Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.BreakerImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getBreaker()
	 * @generated
	 */
	int BREAKER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ID = 0;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__ALARM = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__STATE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl <em>Mittelspannungsfeld</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getMittelspannungsfeld()
	 * @generated
	 */
	int MITTELSPANNUNGSFELD = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITTELSPANNUNGSFELD__ID = 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITTELSPANNUNGSFELD__POWER = 1;

	/**
	 * The feature id for the '<em><b>Circuite Breaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITTELSPANNUNGSFELD__CIRCUITE_BREAKER = 2;

	/**
	 * The number of structural features of the '<em>Mittelspannungsfeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITTELSPANNUNGSFELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mittelspannungsfeld</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITTELSPANNUNGSFELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.StateValueImpl <em>State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.StateValueImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getStateValue()
	 * @generated
	 */
	int STATE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__STATE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.AlarmImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__TIMESTAMP = VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__DESCRIPTION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ACTIVE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.CircuitBreakerImpl <em>Circuit Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.CircuitBreakerImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getCircuitBreaker()
	 * @generated
	 */
	int CIRCUIT_BREAKER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__ID = BREAKER__ID;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__ALARM = BREAKER__ALARM;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__STATE = BREAKER__STATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__VALUE = BREAKER__VALUE;

	/**
	 * The number of structural features of the '<em>Circuit Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_FEATURE_COUNT = BREAKER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circuit Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_OPERATION_COUNT = BREAKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.impl.DisconnectorImpl <em>Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.impl.DisconnectorImpl
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getDisconnector()
	 * @generated
	 */
	int DISCONNECTOR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ID = BREAKER__ID;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__ALARM = BREAKER__ALARM;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__STATE = BREAKER__STATE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__VALUE = BREAKER__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__NAME = BREAKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR__TYPE = BREAKER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR_FEATURE_COUNT = BREAKER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTOR_OPERATION_COUNT = BREAKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.UNIT <em>UNIT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.UNIT
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getUNIT()
	 * @generated
	 */
	int UNIT = 14;

	/**
	 * The meta object id for the '{@link de.jena.nahverkehr.station.rectifier.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.nahverkehr.station.rectifier.State
	 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getState()
	 * @generated
	 */
	int STATE = 15;


	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation
	 * @generated
	 */
	EClass getSubstation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Substation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getName()
	 * @see #getSubstation()
	 * @generated
	 */
	EAttribute getSubstation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Substation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getDescription()
	 * @see #getSubstation()
	 * @generated
	 */
	EAttribute getSubstation_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Substation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getId()
	 * @see #getSubstation()
	 * @generated
	 */
	EAttribute getSubstation_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Substation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getLocation()
	 * @see #getSubstation()
	 * @generated
	 */
	EAttribute getSubstation_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Substation#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getRevision()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Revision();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Substation#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Voltage</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getVoltage()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Voltage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.Substation#getOutgoingLines <em>Outgoing Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Lines</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getOutgoingLines()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_OutgoingLines();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.Substation#getDisconnectors <em>Disconnectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disconnectors</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getDisconnectors()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Disconnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.Substation#getMittelspannungsfelder <em>Mittelspannungsfelder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mittelspannungsfelder</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getMittelspannungsfelder()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Mittelspannungsfelder();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Substation#getOvergroundCalbes <em>Overground Calbes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overground Calbes</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Substation#getOvergroundCalbes()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_OvergroundCalbes();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Value#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Value#getId()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Value#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Value#getTimestamp()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.RegsiterMessage <em>Regsiter Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regsiter Message</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.RegsiterMessage
	 * @generated
	 */
	EClass getRegsiterMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.RegsiterMessage#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.RegsiterMessage#isActive()
	 * @see #getRegsiterMessage()
	 * @generated
	 */
	EAttribute getRegsiterMessage_Active();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.RegsiterMessage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.RegsiterMessage#getDescription()
	 * @see #getRegsiterMessage()
	 * @generated
	 */
	EAttribute getRegsiterMessage_Description();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.MeasurementValue
	 * @generated
	 */
	EClass getMeasurementValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.MeasurementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.MeasurementValue#getValue()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EAttribute getMeasurementValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.MeasurementValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.MeasurementValue#getUnit()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	EAttribute getMeasurementValue_Unit();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution <em>Over Ground Cabel Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Over Ground Cabel Distribution</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution
	 * @generated
	 */
	EClass getOverGroundCabelDistribution();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getId()
	 * @see #getOverGroundCabelDistribution()
	 * @generated
	 */
	EAttribute getOverGroundCabelDistribution_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getCables <em>Cables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cables</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getCables()
	 * @see #getOverGroundCabelDistribution()
	 * @generated
	 */
	EReference getOverGroundCabelDistribution_Cables();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getDisconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disconnector</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getDisconnector()
	 * @see #getOverGroundCabelDistribution()
	 * @generated
	 */
	EReference getOverGroundCabelDistribution_Disconnector();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Cabel <em>Cabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cabel</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Cabel
	 * @generated
	 */
	EClass getCabel();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Cabel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Cabel#getId()
	 * @see #getCabel()
	 * @generated
	 */
	EAttribute getCabel_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.Cabel#getAlarms <em>Alarms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarms</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Cabel#getAlarms()
	 * @see #getCabel()
	 * @generated
	 */
	EReference getCabel_Alarms();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine <em>Outgoing Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Line</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine
	 * @generated
	 */
	EClass getOutgoingLine();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine#getId()
	 * @see #getOutgoingLine()
	 * @generated
	 */
	EAttribute getOutgoingLine_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine#getPower()
	 * @see #getOutgoingLine()
	 * @generated
	 */
	EReference getOutgoingLine_Power();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#isFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine#isFailure()
	 * @see #getOutgoingLine()
	 * @generated
	 */
	EAttribute getOutgoingLine_Failure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getBreaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Breaker</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine#getBreaker()
	 * @see #getOutgoingLine()
	 * @generated
	 */
	EReference getOutgoingLine_Breaker();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getThermalLoad <em>Thermal Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thermal Load</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine#getThermalLoad()
	 * @see #getOutgoingLine()
	 * @generated
	 */
	EReference getOutgoingLine_ThermalLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getCables <em>Cables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cables</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine#getCables()
	 * @see #getOutgoingLine()
	 * @generated
	 */
	EReference getOutgoingLine_Cables();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Breaker
	 * @generated
	 */
	EClass getBreaker();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Breaker#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Breaker#getId()
	 * @see #getBreaker()
	 * @generated
	 */
	EAttribute getBreaker_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.nahverkehr.station.rectifier.Breaker#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Breaker#getAlarm()
	 * @see #getBreaker()
	 * @generated
	 */
	EReference getBreaker_Alarm();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Breaker#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Breaker#getState()
	 * @see #getBreaker()
	 * @generated
	 */
	EReference getBreaker_State();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Breaker#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Breaker#getValue()
	 * @see #getBreaker()
	 * @generated
	 */
	EReference getBreaker_Value();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld <em>Mittelspannungsfeld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mittelspannungsfeld</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld
	 * @generated
	 */
	EClass getMittelspannungsfeld();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getId()
	 * @see #getMittelspannungsfeld()
	 * @generated
	 */
	EAttribute getMittelspannungsfeld_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getPower()
	 * @see #getMittelspannungsfeld()
	 * @generated
	 */
	EReference getMittelspannungsfeld_Power();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getCircuiteBreaker <em>Circuite Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circuite Breaker</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getCircuiteBreaker()
	 * @see #getMittelspannungsfeld()
	 * @generated
	 */
	EReference getMittelspannungsfeld_CircuiteBreaker();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.StateValue <em>State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Value</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.StateValue
	 * @generated
	 */
	EClass getStateValue();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.StateValue#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.StateValue#getState()
	 * @see #getStateValue()
	 * @generated
	 */
	EAttribute getStateValue_State();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Alarm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Alarm#getDescription()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Alarm#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Alarm#isActive()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Active();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.CircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Breaker</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.CircuitBreaker
	 * @generated
	 */
	EClass getCircuitBreaker();

	/**
	 * Returns the meta object for class '{@link de.jena.nahverkehr.station.rectifier.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnector</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Disconnector
	 * @generated
	 */
	EClass getDisconnector();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Disconnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Disconnector#getName()
	 * @see #getDisconnector()
	 * @generated
	 */
	EAttribute getDisconnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.nahverkehr.station.rectifier.Disconnector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.Disconnector#getType()
	 * @see #getDisconnector()
	 * @generated
	 */
	EAttribute getDisconnector_Type();

	/**
	 * Returns the meta object for enum '{@link de.jena.nahverkehr.station.rectifier.UNIT <em>UNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UNIT</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.UNIT
	 * @generated
	 */
	EEnum getUNIT();

	/**
	 * Returns the meta object for enum '{@link de.jena.nahverkehr.station.rectifier.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see de.jena.nahverkehr.station.rectifier.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RectifierFactory getRectifierFactory();

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
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.SubstationImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getSubstation()
		 * @generated
		 */
		EClass SUBSTATION = eINSTANCE.getSubstation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTATION__NAME = eINSTANCE.getSubstation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTATION__DESCRIPTION = eINSTANCE.getSubstation_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTATION__ID = eINSTANCE.getSubstation_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTATION__LOCATION = eINSTANCE.getSubstation_Location();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__REVISION = eINSTANCE.getSubstation_Revision();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__VOLTAGE = eINSTANCE.getSubstation_Voltage();

		/**
		 * The meta object literal for the '<em><b>Outgoing Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__OUTGOING_LINES = eINSTANCE.getSubstation_OutgoingLines();

		/**
		 * The meta object literal for the '<em><b>Disconnectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__DISCONNECTORS = eINSTANCE.getSubstation_Disconnectors();

		/**
		 * The meta object literal for the '<em><b>Mittelspannungsfelder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__MITTELSPANNUNGSFELDER = eINSTANCE.getSubstation_Mittelspannungsfelder();

		/**
		 * The meta object literal for the '<em><b>Overground Calbes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__OVERGROUND_CALBES = eINSTANCE.getSubstation_OvergroundCalbes();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.ValueImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__ID = eINSTANCE.getValue_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__TIMESTAMP = eINSTANCE.getValue_Timestamp();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.BooleanValueImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.RegsiterMessageImpl <em>Regsiter Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.RegsiterMessageImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getRegsiterMessage()
		 * @generated
		 */
		EClass REGSITER_MESSAGE = eINSTANCE.getRegsiterMessage();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGSITER_MESSAGE__ACTIVE = eINSTANCE.getRegsiterMessage_Active();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGSITER_MESSAGE__DESCRIPTION = eINSTANCE.getRegsiterMessage_Description();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.MeasurementValueImpl <em>Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.MeasurementValueImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getMeasurementValue()
		 * @generated
		 */
		EClass MEASUREMENT_VALUE = eINSTANCE.getMeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_VALUE__VALUE = eINSTANCE.getMeasurementValue_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_VALUE__UNIT = eINSTANCE.getMeasurementValue_Unit();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl <em>Over Ground Cabel Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getOverGroundCabelDistribution()
		 * @generated
		 */
		EClass OVER_GROUND_CABEL_DISTRIBUTION = eINSTANCE.getOverGroundCabelDistribution();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVER_GROUND_CABEL_DISTRIBUTION__ID = eINSTANCE.getOverGroundCabelDistribution_Id();

		/**
		 * The meta object literal for the '<em><b>Cables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVER_GROUND_CABEL_DISTRIBUTION__CABLES = eINSTANCE.getOverGroundCabelDistribution_Cables();

		/**
		 * The meta object literal for the '<em><b>Disconnector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR = eINSTANCE.getOverGroundCabelDistribution_Disconnector();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.CabelImpl <em>Cabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.CabelImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getCabel()
		 * @generated
		 */
		EClass CABEL = eINSTANCE.getCabel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABEL__ID = eINSTANCE.getCabel_Id();

		/**
		 * The meta object literal for the '<em><b>Alarms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABEL__ALARMS = eINSTANCE.getCabel_Alarms();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl <em>Outgoing Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.OutgoingLineImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getOutgoingLine()
		 * @generated
		 */
		EClass OUTGOING_LINE = eINSTANCE.getOutgoingLine();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_LINE__ID = eINSTANCE.getOutgoingLine_Id();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_LINE__POWER = eINSTANCE.getOutgoingLine_Power();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_LINE__FAILURE = eINSTANCE.getOutgoingLine_Failure();

		/**
		 * The meta object literal for the '<em><b>Breaker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_LINE__BREAKER = eINSTANCE.getOutgoingLine_Breaker();

		/**
		 * The meta object literal for the '<em><b>Thermal Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_LINE__THERMAL_LOAD = eINSTANCE.getOutgoingLine_ThermalLoad();

		/**
		 * The meta object literal for the '<em><b>Cables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_LINE__CABLES = eINSTANCE.getOutgoingLine_Cables();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.BreakerImpl <em>Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.BreakerImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getBreaker()
		 * @generated
		 */
		EClass BREAKER = eINSTANCE.getBreaker();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKER__ID = eINSTANCE.getBreaker_Id();

		/**
		 * The meta object literal for the '<em><b>Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKER__ALARM = eINSTANCE.getBreaker_Alarm();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKER__STATE = eINSTANCE.getBreaker_State();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKER__VALUE = eINSTANCE.getBreaker_Value();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl <em>Mittelspannungsfeld</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.MittelspannungsfeldImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getMittelspannungsfeld()
		 * @generated
		 */
		EClass MITTELSPANNUNGSFELD = eINSTANCE.getMittelspannungsfeld();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MITTELSPANNUNGSFELD__ID = eINSTANCE.getMittelspannungsfeld_Id();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MITTELSPANNUNGSFELD__POWER = eINSTANCE.getMittelspannungsfeld_Power();

		/**
		 * The meta object literal for the '<em><b>Circuite Breaker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MITTELSPANNUNGSFELD__CIRCUITE_BREAKER = eINSTANCE.getMittelspannungsfeld_CircuiteBreaker();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.StateValueImpl <em>State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.StateValueImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getStateValue()
		 * @generated
		 */
		EClass STATE_VALUE = eINSTANCE.getStateValue();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VALUE__STATE = eINSTANCE.getStateValue_State();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.AlarmImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__DESCRIPTION = eINSTANCE.getAlarm_Description();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__ACTIVE = eINSTANCE.getAlarm_Active();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.CircuitBreakerImpl <em>Circuit Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.CircuitBreakerImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getCircuitBreaker()
		 * @generated
		 */
		EClass CIRCUIT_BREAKER = eINSTANCE.getCircuitBreaker();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.impl.DisconnectorImpl <em>Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.impl.DisconnectorImpl
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getDisconnector()
		 * @generated
		 */
		EClass DISCONNECTOR = eINSTANCE.getDisconnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECTOR__NAME = eINSTANCE.getDisconnector_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECTOR__TYPE = eINSTANCE.getDisconnector_Type();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.UNIT <em>UNIT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.UNIT
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getUNIT()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUNIT();

		/**
		 * The meta object literal for the '{@link de.jena.nahverkehr.station.rectifier.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.nahverkehr.station.rectifier.State
		 * @see de.jena.nahverkehr.station.rectifier.impl.RectifierPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

	}

} //RectifierPackage
