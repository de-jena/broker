/**
 */
package de.dim.trafficos.common.model.common.impl;

import de.dim.trafficos.common.model.common.AbstractDataEntry;
import de.dim.trafficos.common.model.common.AbstractTimeTableEntry;
import de.dim.trafficos.common.model.common.AddressLocation;
import de.dim.trafficos.common.model.common.DataEntry;
import de.dim.trafficos.common.model.common.DataValue;
import de.dim.trafficos.common.model.common.DirectionType;
import de.dim.trafficos.common.model.common.IdNameElement;
import de.dim.trafficos.common.model.common.Localizable;
import de.dim.trafficos.common.model.common.Location;
import de.dim.trafficos.common.model.common.NetworkLocation;
import de.dim.trafficos.common.model.common.Output;
import de.dim.trafficos.common.model.common.Parameter;
import de.dim.trafficos.common.model.common.ParameterDataType;
import de.dim.trafficos.common.model.common.Position;
import de.dim.trafficos.common.model.common.ScheduleModeType;
import de.dim.trafficos.common.model.common.TOSCommonFactory;
import de.dim.trafficos.common.model.common.TOSCommonPackage;

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
public class TOSCommonPackageImpl extends EPackageImpl implements TOSCommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idNameElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scheduleModeTypeEEnum = null;

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
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TOSCommonPackageImpl() {
		super(eNS_URI, TOSCommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TOSCommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TOSCommonPackage init() {
		if (isInited) return (TOSCommonPackage)EPackage.Registry.INSTANCE.getEPackage(TOSCommonPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTOSCommonPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TOSCommonPackageImpl theTOSCommonPackage = registeredTOSCommonPackage instanceof TOSCommonPackageImpl ? (TOSCommonPackageImpl)registeredTOSCommonPackage : new TOSCommonPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTOSCommonPackage.createPackageContents();

		// Initialize created meta-data
		theTOSCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTOSCommonPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TOSCommonPackage.eNS_URI, theTOSCommonPackage);
		return theTOSCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdNameElement() {
		return idNameElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdNameElement_Id() {
		return (EAttribute)idNameElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdNameElement_Name() {
		return (EAttribute)idNameElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDataEntry() {
		return abstractDataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDataEntry_Id() {
		return (EAttribute)abstractDataEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDataEntry_Timestamp() {
		return (EAttribute)abstractDataEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDataEntry_Index() {
		return (EAttribute)abstractDataEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTimeTableEntry() {
		return abstractTimeTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_Index() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_Mode() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_Begin() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTimeTableEntry_End() {
		return (EAttribute)abstractTimeTableEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalizable() {
		return localizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalizable_Location() {
		return (EReference)localizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Id() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkLocation() {
		return networkLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLocation_Ip4Address() {
		return (EAttribute)networkLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLocation_Ip6Address() {
		return (EAttribute)networkLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkLocation_Hostname() {
		return (EAttribute)networkLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Latitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Longitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Altitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Orientation() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Bearing() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressLocation() {
		return addressLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_Location() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_Street() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_Zip() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressLocation_District() {
		return (EAttribute)addressLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataEntry() {
		return dataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataEntry_Value() {
		return (EReference)dataEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataEntry_Configuration() {
		return (EAttribute)dataEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataEntry_Device() {
		return (EAttribute)dataEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_Value() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataValue_Element() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataValue_ElementRef() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_Duration() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Description() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Type() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_DefaultValue() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_DataType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParameterDataType() {
		return parameterDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScheduleModeType() {
		return scheduleModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSCommonFactory getTOSCommonFactory() {
		return (TOSCommonFactory)getEFactoryInstance();
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
		idNameElementEClass = createEClass(ID_NAME_ELEMENT);
		createEAttribute(idNameElementEClass, ID_NAME_ELEMENT__ID);
		createEAttribute(idNameElementEClass, ID_NAME_ELEMENT__NAME);

		abstractDataEntryEClass = createEClass(ABSTRACT_DATA_ENTRY);
		createEAttribute(abstractDataEntryEClass, ABSTRACT_DATA_ENTRY__ID);
		createEAttribute(abstractDataEntryEClass, ABSTRACT_DATA_ENTRY__TIMESTAMP);
		createEAttribute(abstractDataEntryEClass, ABSTRACT_DATA_ENTRY__INDEX);

		abstractTimeTableEntryEClass = createEClass(ABSTRACT_TIME_TABLE_ENTRY);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__INDEX);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__MODE);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__BEGIN);
		createEAttribute(abstractTimeTableEntryEClass, ABSTRACT_TIME_TABLE_ENTRY__END);

		localizableEClass = createEClass(LOCALIZABLE);
		createEReference(localizableEClass, LOCALIZABLE__LOCATION);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ID);

		networkLocationEClass = createEClass(NETWORK_LOCATION);
		createEAttribute(networkLocationEClass, NETWORK_LOCATION__IP4_ADDRESS);
		createEAttribute(networkLocationEClass, NETWORK_LOCATION__IP6_ADDRESS);
		createEAttribute(networkLocationEClass, NETWORK_LOCATION__HOSTNAME);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__LATITUDE);
		createEAttribute(positionEClass, POSITION__LONGITUDE);
		createEAttribute(positionEClass, POSITION__ALTITUDE);
		createEAttribute(positionEClass, POSITION__ORIENTATION);
		createEAttribute(positionEClass, POSITION__BEARING);

		addressLocationEClass = createEClass(ADDRESS_LOCATION);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__LOCATION);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__STREET);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__ZIP);
		createEAttribute(addressLocationEClass, ADDRESS_LOCATION__DISTRICT);

		dataEntryEClass = createEClass(DATA_ENTRY);
		createEReference(dataEntryEClass, DATA_ENTRY__VALUE);
		createEAttribute(dataEntryEClass, DATA_ENTRY__CONFIGURATION);
		createEAttribute(dataEntryEClass, DATA_ENTRY__DEVICE);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__VALUE);
		createEReference(dataValueEClass, DATA_VALUE__ELEMENT);
		createEReference(dataValueEClass, DATA_VALUE__ELEMENT_REF);
		createEAttribute(dataValueEClass, DATA_VALUE__DURATION);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__DESCRIPTION);
		createEAttribute(outputEClass, OUTPUT__TYPE);
		createEAttribute(outputEClass, OUTPUT__DEFAULT_VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DATA_TYPE);

		// Create enums
		parameterDataTypeEEnum = createEEnum(PARAMETER_DATA_TYPE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		scheduleModeTypeEEnum = createEEnum(SCHEDULE_MODE_TYPE);
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
		networkLocationEClass.getESuperTypes().add(this.getLocation());
		positionEClass.getESuperTypes().add(this.getLocation());
		addressLocationEClass.getESuperTypes().add(this.getLocation());
		dataEntryEClass.getESuperTypes().add(this.getAbstractDataEntry());
		outputEClass.getESuperTypes().add(this.getIdNameElement());
		outputEClass.getESuperTypes().add(this.getLocalizable());
		parameterEClass.getESuperTypes().add(this.getIdNameElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(idNameElementEClass, IdNameElement.class, "IdNameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdNameElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdNameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdNameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDataEntryEClass, AbstractDataEntry.class, "AbstractDataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDataEntry_Id(), ecorePackage.getEString(), "id", null, 1, 1, AbstractDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDataEntry_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, AbstractDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDataEntry_Index(), ecorePackage.getELong(), "index", null, 1, 1, AbstractDataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTimeTableEntryEClass, AbstractTimeTableEntry.class, "AbstractTimeTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTimeTableEntry_Index(), ecorePackage.getEInt(), "index", null, 1, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTimeTableEntry_Mode(), this.getScheduleModeType(), "mode", null, 0, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTimeTableEntry_Begin(), ecorePackage.getELong(), "begin", null, 1, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTimeTableEntry_End(), ecorePackage.getELong(), "end", null, 1, 1, AbstractTimeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizableEClass, Localizable.class, "Localizable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalizable_Location(), this.getLocation(), null, "location", null, 0, -1, Localizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLocationEClass, NetworkLocation.class, "NetworkLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLocation_Ip4Address(), ecorePackage.getEString(), "ip4Address", null, 0, 1, NetworkLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLocation_Ip6Address(), ecorePackage.getEString(), "ip6Address", null, 0, 1, NetworkLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLocation_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, NetworkLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Latitude(), ecorePackage.getEDouble(), "latitude", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Longitude(), ecorePackage.getEDouble(), "longitude", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Altitude(), ecorePackage.getEDouble(), "altitude", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Orientation(), this.getDirectionType(), "orientation", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Bearing(), ecorePackage.getEInt(), "bearing", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressLocationEClass, AddressLocation.class, "AddressLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressLocation_Location(), ecorePackage.getEString(), "location", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressLocation_Street(), ecorePackage.getEString(), "street", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressLocation_Zip(), ecorePackage.getEString(), "zip", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressLocation_District(), ecorePackage.getEString(), "district", null, 0, 1, AddressLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEntryEClass, DataEntry.class, "DataEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataEntry_Value(), this.getDataValue(), null, "value", null, 0, -1, DataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntry_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1, DataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntry_Device(), ecorePackage.getEString(), "device", null, 0, 1, DataEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValue_Element(), this.getIdNameElement(), null, "element", null, 1, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValue_ElementRef(), this.getIdNameElement(), null, "elementRef", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Type(), ecorePackage.getEString(), "type", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_DataType(), this.getParameterDataType(), "dataType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterDataTypeEEnum, ParameterDataType.class, "ParameterDataType");
		addEEnumLiteral(parameterDataTypeEEnum, ParameterDataType.STRING);
		addEEnumLiteral(parameterDataTypeEEnum, ParameterDataType.INTEGER);
		addEEnumLiteral(parameterDataTypeEEnum, ParameterDataType.DATE);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.TURN_RIGHT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.TURN_LEFT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.OTHER);
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT_TURNS);
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT_LEFT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.STRAIGHT_RIGHT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.LEFT_RIGHT);

		initEEnum(scheduleModeTypeEEnum, ScheduleModeType.class, "ScheduleModeType");
		addEEnumLiteral(scheduleModeTypeEEnum, ScheduleModeType.EVERY_DAY);
		addEEnumLiteral(scheduleModeTypeEEnum, ScheduleModeType.WEEKEND);
		addEEnumLiteral(scheduleModeTypeEEnum, ScheduleModeType.WORKING_DAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
		  (getAbstractTimeTableEntry_Begin(),
		   source,
		   new String[] {
			   "documentation", "Minute of the day"
		   });
		addAnnotation
		  (getAbstractTimeTableEntry_End(),
		   source,
		   new String[] {
			   "documentation", "Minute of the day"
		   });
	}

} //TOSCommonPackageImpl
