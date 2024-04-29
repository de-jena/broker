/**
 */
package de.jena.ilsa.sensinact.model.ilsa.impl;

import de.jena.ilsa.sensinact.model.ilsa.Ilsa;
import de.jena.ilsa.sensinact.model.ilsa.IlsaFactory;
import de.jena.ilsa.sensinact.model.ilsa.IlsaPackage;
import de.jena.ilsa.sensinact.model.ilsa.Signal;
import de.jena.ilsa.sensinact.model.ilsa.Thermal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IlsaPackageImpl extends EPackageImpl implements IlsaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thermalEClass = null;

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
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IlsaPackageImpl() {
		super(eNS_URI, IlsaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IlsaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IlsaPackage init() {
		if (isInited) return (IlsaPackage)EPackage.Registry.INSTANCE.getEPackage(IlsaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIlsaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IlsaPackageImpl theIlsaPackage = registeredIlsaPackage instanceof IlsaPackageImpl ? (IlsaPackageImpl)registeredIlsaPackage : new IlsaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIlsaPackage.createPackageContents();

		// Initialize created meta-data
		theIlsaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIlsaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IlsaPackage.eNS_URI, theIlsaPackage);
		return theIlsaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIlsa() {
		return ilsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIlsa_Thermal() {
		return (EReference)ilsaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_Color() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_Type() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_SignalGroup() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignal_ObservedArea() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThermal() {
		return thermalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThermal_Temperature() {
		return (EAttribute)thermalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IlsaFactory getIlsaFactory() {
		return (IlsaFactory)getEFactoryInstance();
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
		ilsaEClass = createEClass(ILSA);
		createEReference(ilsaEClass, ILSA__THERMAL);

		signalEClass = createEClass(SIGNAL);
		createEAttribute(signalEClass, SIGNAL__COLOR);
		createEAttribute(signalEClass, SIGNAL__TYPE);
		createEAttribute(signalEClass, SIGNAL__SIGNAL_GROUP);
		createEAttribute(signalEClass, SIGNAL__OBSERVED_AREA);

		thermalEClass = createEClass(THERMAL);
		createEAttribute(thermalEClass, THERMAL__TEMPERATURE);
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
		ProviderPackage theProviderPackage = (ProviderPackage)EPackage.Registry.INSTANCE.getEPackage(ProviderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ilsaEClass.getESuperTypes().add(theProviderPackage.getDynamicProvider());
		signalEClass.getESuperTypes().add(theProviderPackage.getService());
		thermalEClass.getESuperTypes().add(theProviderPackage.getAdmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(ilsaEClass, Ilsa.class, "Ilsa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIlsa_Thermal(), this.getThermal(), null, "thermal", null, 0, 1, Ilsa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_Color(), ecorePackage.getEString(), "color", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_Type(), ecorePackage.getEString(), "type", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_SignalGroup(), ecorePackage.getEString(), "signalGroup", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_ObservedArea(), theProviderPackage.getEGeoJsonObject(), "observedArea", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thermalEClass, Thermal.class, "Thermal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThermal_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, Thermal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// Metadata
		createMetadataAnnotations();
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
	 * Initializes the annotations for <b>Metadata</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetadataAnnotations() {
		String source = "Metadata";
		addAnnotation
		  (getSignal_Color(),
		   source,
		   new String[] {
			   "sensorthings.unit.name", "Farbe"
		   });
		addAnnotation
		  (getSignal_Type(),
		   source,
		   new String[] {
			   "sensorthings.sensor.metadata", null,
			   "sensorthings.unit.name", "Signaltyp"
		   });
		addAnnotation
		  (getSignal_SignalGroup(),
		   source,
		   new String[] {
			   "sensorthings.unit.name", "Signalgruppe"
		   });
		addAnnotation
		  (getSignal_ObservedArea(),
		   source,
		   new String[] {
			   "sensorthings.observedArea", "true"
		   });
	}

} //IlsaPackageImpl
