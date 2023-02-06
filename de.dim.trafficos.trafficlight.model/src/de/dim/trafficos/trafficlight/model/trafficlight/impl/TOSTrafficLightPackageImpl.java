/**
 */
package de.dim.trafficos.trafficlight.model.trafficlight.impl;

import de.dim.trafficos.common.model.common.TOSCommonPackage;

import de.dim.trafficos.trafficlight.model.trafficlight.LightSignal;
import de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModule;
import de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup;
import de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightFactory;
import de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage;

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
public class TOSTrafficLightPackageImpl extends EPackageImpl implements TOSTrafficLightPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlSignalTransmitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlSignalGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tlModuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalValueTypeEEnum = null;

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
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TOSTrafficLightPackageImpl() {
		super(eNS_URI, TOSTrafficLightFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TOSTrafficLightPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TOSTrafficLightPackage init() {
		if (isInited) return (TOSTrafficLightPackage)EPackage.Registry.INSTANCE.getEPackage(TOSTrafficLightPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTOSTrafficLightPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TOSTrafficLightPackageImpl theTOSTrafficLightPackage = registeredTOSTrafficLightPackage instanceof TOSTrafficLightPackageImpl ? (TOSTrafficLightPackageImpl)registeredTOSTrafficLightPackage : new TOSTrafficLightPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TOSCommonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTOSTrafficLightPackage.createPackageContents();

		// Initialize created meta-data
		theTOSTrafficLightPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTOSTrafficLightPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TOSTrafficLightPackage.eNS_URI, theTOSTrafficLightPackage);
		return theTOSTrafficLightPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLModule() {
		return tlModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLModule_Address() {
		return (EAttribute)tlModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLModule_Type() {
		return (EAttribute)tlModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLModule_SignalTransmitter() {
		return (EReference)tlModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLSignalTransmitter() {
		return tlSignalTransmitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLSignalTransmitter_SignalGroup() {
		return (EReference)tlSignalTransmitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLSignalTransmitter_LightSignal() {
		return (EReference)tlSignalTransmitterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLSignalGroup() {
		return tlSignalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLSignalGroup_Id() {
		return (EAttribute)tlSignalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightSignal() {
		return lightSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSignal_Bliking() {
		return (EAttribute)lightSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSignal_Value() {
		return (EAttribute)lightSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSignal_On() {
		return (EAttribute)lightSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTLModuleType() {
		return tlModuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSignalValueType() {
		return signalValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSTrafficLightFactory getTOSTrafficLightFactory() {
		return (TOSTrafficLightFactory)getEFactoryInstance();
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
		tlModuleEClass = createEClass(TL_MODULE);
		createEAttribute(tlModuleEClass, TL_MODULE__ADDRESS);
		createEAttribute(tlModuleEClass, TL_MODULE__TYPE);
		createEReference(tlModuleEClass, TL_MODULE__SIGNAL_TRANSMITTER);

		tlSignalTransmitterEClass = createEClass(TL_SIGNAL_TRANSMITTER);
		createEReference(tlSignalTransmitterEClass, TL_SIGNAL_TRANSMITTER__SIGNAL_GROUP);
		createEReference(tlSignalTransmitterEClass, TL_SIGNAL_TRANSMITTER__LIGHT_SIGNAL);

		tlSignalGroupEClass = createEClass(TL_SIGNAL_GROUP);
		createEAttribute(tlSignalGroupEClass, TL_SIGNAL_GROUP__ID);

		lightSignalEClass = createEClass(LIGHT_SIGNAL);
		createEAttribute(lightSignalEClass, LIGHT_SIGNAL__BLIKING);
		createEAttribute(lightSignalEClass, LIGHT_SIGNAL__VALUE);
		createEAttribute(lightSignalEClass, LIGHT_SIGNAL__ON);

		// Create enums
		tlModuleTypeEEnum = createEEnum(TL_MODULE_TYPE);
		signalValueTypeEEnum = createEEnum(SIGNAL_VALUE_TYPE);
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

		// Obtain other dependent packages
		TOSCommonPackage theTOSCommonPackage = (TOSCommonPackage)EPackage.Registry.INSTANCE.getEPackage(TOSCommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tlSignalTransmitterEClass.getESuperTypes().add(theTOSCommonPackage.getOutput());

		// Initialize classes, features, and operations; add parameters
		initEClass(tlModuleEClass, TLModule.class, "TLModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLModule_Address(), ecorePackage.getEInt(), "address", null, 0, 1, TLModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLModule_Type(), this.getTLModuleType(), "type", null, 0, 1, TLModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLModule_SignalTransmitter(), this.getTLSignalTransmitter(), null, "signalTransmitter", null, 0, -1, TLModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlSignalTransmitterEClass, TLSignalTransmitter.class, "TLSignalTransmitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLSignalTransmitter_SignalGroup(), this.getTLSignalGroup(), null, "signalGroup", null, 0, 1, TLSignalTransmitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLSignalTransmitter_LightSignal(), this.getLightSignal(), null, "lightSignal", null, 0, -1, TLSignalTransmitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlSignalGroupEClass, TLSignalGroup.class, "TLSignalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLSignalGroup_Id(), ecorePackage.getEString(), "id", null, 1, 1, TLSignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightSignalEClass, LightSignal.class, "LightSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLightSignal_Bliking(), ecorePackage.getEBoolean(), "bliking", null, 0, 1, LightSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightSignal_Value(), this.getSignalValueType(), "value", null, 0, 1, LightSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightSignal_On(), ecorePackage.getEBoolean(), "on", null, 0, 1, LightSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tlModuleTypeEEnum, TLModuleType.class, "TLModuleType");
		addEEnumLiteral(tlModuleTypeEEnum, TLModuleType.LML);
		addEEnumLiteral(tlModuleTypeEEnum, TLModuleType.FDL);

		initEEnum(signalValueTypeEEnum, SignalValueType.class, "SignalValueType");
		addEEnumLiteral(signalValueTypeEEnum, SignalValueType.RED);
		addEEnumLiteral(signalValueTypeEEnum, SignalValueType.AMBER);
		addEEnumLiteral(signalValueTypeEEnum, SignalValueType.GREEN);
		addEEnumLiteral(signalValueTypeEEnum, SignalValueType.SIGNAL_IS_COMING);
		addEEnumLiteral(signalValueTypeEEnum, SignalValueType.ORIENTATION_SOUND);

		// Create resource
		createResource(eNS_URI);
	}

} //TOSTrafficLightPackageImpl
