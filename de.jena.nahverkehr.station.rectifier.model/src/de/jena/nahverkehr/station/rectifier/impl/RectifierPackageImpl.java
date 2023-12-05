/**
 */
package de.jena.nahverkehr.station.rectifier.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.jena.nahverkehr.station.rectifier.Alarm;
import de.jena.nahverkehr.station.rectifier.BooleanValue;
import de.jena.nahverkehr.station.rectifier.Breaker;
import de.jena.nahverkehr.station.rectifier.Cabel;
import de.jena.nahverkehr.station.rectifier.CircuitBreaker;
import de.jena.nahverkehr.station.rectifier.Disconnector;
import de.jena.nahverkehr.station.rectifier.MeasurementValue;
import de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld;
import de.jena.nahverkehr.station.rectifier.OutgoingLine;
import de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution;
import de.jena.nahverkehr.station.rectifier.RectifierFactory;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;
import de.jena.nahverkehr.station.rectifier.RegsiterMessage;
import de.jena.nahverkehr.station.rectifier.State;
import de.jena.nahverkehr.station.rectifier.StateValue;
import de.jena.nahverkehr.station.rectifier.Substation;
import de.jena.nahverkehr.station.rectifier.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RectifierPackageImpl extends EPackageImpl implements RectifierPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regsiterMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overGroundCabelDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mittelspannungsfeldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitBreakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

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
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RectifierPackageImpl() {
		super(eNS_URI, RectifierFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RectifierPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RectifierPackage init() {
		if (isInited) return (RectifierPackage)EPackage.Registry.INSTANCE.getEPackage(RectifierPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRectifierPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RectifierPackageImpl theRectifierPackage = registeredRectifierPackage instanceof RectifierPackageImpl ? (RectifierPackageImpl)registeredRectifierPackage : new RectifierPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRectifierPackage.createPackageContents();

		// Initialize created meta-data
		theRectifierPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRectifierPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RectifierPackage.eNS_URI, theRectifierPackage);
		return theRectifierPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstation() {
		return substationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstation_Name() {
		return (EAttribute)substationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstation_Description() {
		return (EAttribute)substationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstation_Id() {
		return (EAttribute)substationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstation_Location() {
		return (EAttribute)substationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Revision() {
		return (EReference)substationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Voltage() {
		return (EReference)substationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_OutgoingLines() {
		return (EReference)substationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Disconnectors() {
		return (EReference)substationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Mittelspannungsfelder() {
		return (EReference)substationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_OvergroundCalbes() {
		return (EReference)substationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Id() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Timestamp() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegsiterMessage() {
		return regsiterMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegsiterMessage_Active() {
		return (EAttribute)regsiterMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegsiterMessage_Description() {
		return (EAttribute)regsiterMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementValue() {
		return measurementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValue_Value() {
		return (EAttribute)measurementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementValue_Unit() {
		return (EAttribute)measurementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverGroundCabelDistribution() {
		return overGroundCabelDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverGroundCabelDistribution_Id() {
		return (EAttribute)overGroundCabelDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverGroundCabelDistribution_Cables() {
		return (EReference)overGroundCabelDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverGroundCabelDistribution_Disconnector() {
		return (EReference)overGroundCabelDistributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCabel() {
		return cabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabel_Id() {
		return (EAttribute)cabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabel_Alarms() {
		return (EReference)cabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingLine() {
		return outgoingLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingLine_Id() {
		return (EAttribute)outgoingLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingLine_Power() {
		return (EReference)outgoingLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingLine_Failure() {
		return (EAttribute)outgoingLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingLine_Breaker() {
		return (EReference)outgoingLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingLine_ThermalLoad() {
		return (EReference)outgoingLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingLine_Cables() {
		return (EReference)outgoingLineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreaker() {
		return breakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreaker_Id() {
		return (EAttribute)breakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreaker_Alarm() {
		return (EReference)breakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreaker_State() {
		return (EReference)breakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreaker_Value() {
		return (EReference)breakerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMittelspannungsfeld() {
		return mittelspannungsfeldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMittelspannungsfeld_Id() {
		return (EAttribute)mittelspannungsfeldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMittelspannungsfeld_Power() {
		return (EReference)mittelspannungsfeldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMittelspannungsfeld_CircuiteBreaker() {
		return (EReference)mittelspannungsfeldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateValue() {
		return stateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateValue_State() {
		return (EAttribute)stateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarm() {
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarm_Description() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarm_Active() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitBreaker() {
		return circuitBreakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnector() {
		return disconnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnector_Name() {
		return (EAttribute)disconnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnector_Type() {
		return (EAttribute)disconnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUNIT() {
		return unitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierFactory getRectifierFactory() {
		return (RectifierFactory)getEFactoryInstance();
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
		substationEClass = createEClass(SUBSTATION);
		createEAttribute(substationEClass, SUBSTATION__NAME);
		createEAttribute(substationEClass, SUBSTATION__DESCRIPTION);
		createEAttribute(substationEClass, SUBSTATION__ID);
		createEAttribute(substationEClass, SUBSTATION__LOCATION);
		createEReference(substationEClass, SUBSTATION__REVISION);
		createEReference(substationEClass, SUBSTATION__VOLTAGE);
		createEReference(substationEClass, SUBSTATION__OUTGOING_LINES);
		createEReference(substationEClass, SUBSTATION__DISCONNECTORS);
		createEReference(substationEClass, SUBSTATION__MITTELSPANNUNGSFELDER);
		createEReference(substationEClass, SUBSTATION__OVERGROUND_CALBES);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__ID);
		createEAttribute(valueEClass, VALUE__TIMESTAMP);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		regsiterMessageEClass = createEClass(REGSITER_MESSAGE);
		createEAttribute(regsiterMessageEClass, REGSITER_MESSAGE__ACTIVE);
		createEAttribute(regsiterMessageEClass, REGSITER_MESSAGE__DESCRIPTION);

		measurementValueEClass = createEClass(MEASUREMENT_VALUE);
		createEAttribute(measurementValueEClass, MEASUREMENT_VALUE__VALUE);
		createEAttribute(measurementValueEClass, MEASUREMENT_VALUE__UNIT);

		overGroundCabelDistributionEClass = createEClass(OVER_GROUND_CABEL_DISTRIBUTION);
		createEAttribute(overGroundCabelDistributionEClass, OVER_GROUND_CABEL_DISTRIBUTION__ID);
		createEReference(overGroundCabelDistributionEClass, OVER_GROUND_CABEL_DISTRIBUTION__CABLES);
		createEReference(overGroundCabelDistributionEClass, OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR);

		cabelEClass = createEClass(CABEL);
		createEAttribute(cabelEClass, CABEL__ID);
		createEReference(cabelEClass, CABEL__ALARMS);

		outgoingLineEClass = createEClass(OUTGOING_LINE);
		createEAttribute(outgoingLineEClass, OUTGOING_LINE__ID);
		createEReference(outgoingLineEClass, OUTGOING_LINE__POWER);
		createEAttribute(outgoingLineEClass, OUTGOING_LINE__FAILURE);
		createEReference(outgoingLineEClass, OUTGOING_LINE__BREAKER);
		createEReference(outgoingLineEClass, OUTGOING_LINE__THERMAL_LOAD);
		createEReference(outgoingLineEClass, OUTGOING_LINE__CABLES);

		breakerEClass = createEClass(BREAKER);
		createEAttribute(breakerEClass, BREAKER__ID);
		createEReference(breakerEClass, BREAKER__ALARM);
		createEReference(breakerEClass, BREAKER__STATE);
		createEReference(breakerEClass, BREAKER__VALUE);

		mittelspannungsfeldEClass = createEClass(MITTELSPANNUNGSFELD);
		createEAttribute(mittelspannungsfeldEClass, MITTELSPANNUNGSFELD__ID);
		createEReference(mittelspannungsfeldEClass, MITTELSPANNUNGSFELD__POWER);
		createEReference(mittelspannungsfeldEClass, MITTELSPANNUNGSFELD__CIRCUITE_BREAKER);

		stateValueEClass = createEClass(STATE_VALUE);
		createEAttribute(stateValueEClass, STATE_VALUE__STATE);

		alarmEClass = createEClass(ALARM);
		createEAttribute(alarmEClass, ALARM__DESCRIPTION);
		createEAttribute(alarmEClass, ALARM__ACTIVE);

		circuitBreakerEClass = createEClass(CIRCUIT_BREAKER);

		disconnectorEClass = createEClass(DISCONNECTOR);
		createEAttribute(disconnectorEClass, DISCONNECTOR__NAME);
		createEAttribute(disconnectorEClass, DISCONNECTOR__TYPE);

		// Create enums
		unitEEnum = createEEnum(UNIT);
		stateEEnum = createEEnum(STATE);
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
		booleanValueEClass.getESuperTypes().add(this.getValue());
		regsiterMessageEClass.getESuperTypes().add(this.getValue());
		measurementValueEClass.getESuperTypes().add(this.getValue());
		stateValueEClass.getESuperTypes().add(this.getValue());
		alarmEClass.getESuperTypes().add(this.getValue());
		circuitBreakerEClass.getESuperTypes().add(this.getBreaker());
		disconnectorEClass.getESuperTypes().add(this.getBreaker());

		// Initialize classes, features, and operations; add parameters
		initEClass(substationEClass, Substation.class, "Substation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstation_Id(), ecorePackage.getEString(), "id", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstation_Location(), ecorePackage.getEString(), "location", null, 0, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstation_Revision(), this.getBooleanValue(), null, "revision", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstation_Voltage(), this.getMeasurementValue(), null, "voltage", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstation_OutgoingLines(), this.getOutgoingLine(), null, "outgoingLines", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_Disconnectors(), this.getDisconnector(), null, "disconnectors", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_Mittelspannungsfelder(), this.getMittelspannungsfeld(), null, "mittelspannungsfelder", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_OvergroundCalbes(), this.getOverGroundCabelDistribution(), null, "overgroundCalbes", null, 0, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Id(), ecorePackage.getEString(), "id", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regsiterMessageEClass, RegsiterMessage.class, "RegsiterMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegsiterMessage_Active(), ecorePackage.getEBoolean(), "active", null, 1, 1, RegsiterMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegsiterMessage_Description(), ecorePackage.getEString(), "description", null, 0, 1, RegsiterMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementValueEClass, MeasurementValue.class, "MeasurementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurementValue_Value(), ecorePackage.getEDoubleObject(), "value", null, 1, 1, MeasurementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementValue_Unit(), this.getUNIT(), "unit", null, 1, 1, MeasurementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overGroundCabelDistributionEClass, OverGroundCabelDistribution.class, "OverGroundCabelDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverGroundCabelDistribution_Id(), ecorePackage.getEString(), "id", null, 1, 1, OverGroundCabelDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverGroundCabelDistribution_Cables(), this.getCabel(), null, "cables", null, 0, -1, OverGroundCabelDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOverGroundCabelDistribution_Disconnector(), this.getDisconnector(), null, "disconnector", null, 1, 1, OverGroundCabelDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cabelEClass, Cabel.class, "Cabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabel_Id(), ecorePackage.getEString(), "id", null, 1, 1, Cabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabel_Alarms(), this.getRegsiterMessage(), null, "alarms", null, 0, -1, Cabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outgoingLineEClass, OutgoingLine.class, "OutgoingLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutgoingLine_Id(), ecorePackage.getEString(), "id", null, 1, 1, OutgoingLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoingLine_Power(), this.getMeasurementValue(), null, "power", null, 1, 1, OutgoingLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutgoingLine_Failure(), ecorePackage.getEBoolean(), "failure", null, 1, 1, OutgoingLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoingLine_Breaker(), this.getBreaker(), null, "breaker", null, 0, -1, OutgoingLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutgoingLine_ThermalLoad(), this.getMeasurementValue(), null, "thermalLoad", null, 1, 1, OutgoingLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoingLine_Cables(), this.getCabel(), null, "cables", null, 0, -1, OutgoingLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(breakerEClass, Breaker.class, "Breaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreaker_Id(), ecorePackage.getEString(), "id", null, 1, 1, Breaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreaker_Alarm(), this.getRegsiterMessage(), null, "alarm", null, 0, -1, Breaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBreaker_State(), this.getStateValue(), null, "state", null, 1, 1, Breaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreaker_Value(), this.getMeasurementValue(), null, "value", null, 0, 1, Breaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mittelspannungsfeldEClass, Mittelspannungsfeld.class, "Mittelspannungsfeld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMittelspannungsfeld_Id(), ecorePackage.getEString(), "id", null, 1, 1, Mittelspannungsfeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMittelspannungsfeld_Power(), this.getMeasurementValue(), null, "power", null, 1, 1, Mittelspannungsfeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMittelspannungsfeld_CircuiteBreaker(), this.getCircuitBreaker(), null, "circuiteBreaker", null, 1, 1, Mittelspannungsfeld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateValueEClass, StateValue.class, "StateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateValue_State(), this.getState(), "state", null, 1, 1, StateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alarmEClass, Alarm.class, "Alarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlarm_Description(), ecorePackage.getEString(), "description", null, 1, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarm_Active(), ecorePackage.getEBoolean(), "active", null, 1, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circuitBreakerEClass, CircuitBreaker.class, "CircuitBreaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disconnectorEClass, Disconnector.class, "Disconnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisconnector_Name(), ecorePackage.getEString(), "name", null, 1, 1, Disconnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisconnector_Type(), ecorePackage.getEString(), "type", null, 1, 1, Disconnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unitEEnum, de.jena.nahverkehr.station.rectifier.UNIT.class, "UNIT");
		addEEnumLiteral(unitEEnum, de.jena.nahverkehr.station.rectifier.UNIT.UNDEFINED);
		addEEnumLiteral(unitEEnum, de.jena.nahverkehr.station.rectifier.UNIT.AMPER);
		addEEnumLiteral(unitEEnum, de.jena.nahverkehr.station.rectifier.UNIT.PERCENTAGE);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.UNDEFINED);
		addEEnumLiteral(stateEEnum, State.ON);
		addEEnumLiteral(stateEEnum, State.OFF);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
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
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getSubstation_OutgoingLines(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getSubstation_Disconnectors(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getSubstation_Mittelspannungsfelder(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getOverGroundCabelDistribution_Cables(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCabel_Alarms(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getOutgoingLine_Breaker(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getOutgoingLine_Cables(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getBreaker_Alarm(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //RectifierPackageImpl
