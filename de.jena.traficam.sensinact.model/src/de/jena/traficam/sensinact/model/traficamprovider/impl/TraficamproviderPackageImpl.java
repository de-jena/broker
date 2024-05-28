/**
 */
package de.jena.traficam.sensinact.model.traficamprovider.impl;

import de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderFactory;
import de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraficamproviderPackageImpl extends EPackageImpl implements TraficamproviderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traficamProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traficamAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observedObjectsEClass = null;

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
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraficamproviderPackageImpl() {
		super(eNS_URI, TraficamproviderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraficamproviderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraficamproviderPackage init() {
		if (isInited) return (TraficamproviderPackage)EPackage.Registry.INSTANCE.getEPackage(TraficamproviderPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraficamproviderPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraficamproviderPackageImpl theTraficamproviderPackage = registeredTraficamproviderPackage instanceof TraficamproviderPackageImpl ? (TraficamproviderPackageImpl)registeredTraficamproviderPackage : new TraficamproviderPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTraficamproviderPackage.createPackageContents();

		// Initialize created meta-data
		theTraficamproviderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraficamproviderPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraficamproviderPackage.eNS_URI, theTraficamproviderPackage);
		return theTraficamproviderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraficamProvider() {
		return traficamProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraficamAdmin() {
		return traficamAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraficamAdmin_Viewport() {
		return (EAttribute)traficamAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservedObjects() {
		return observedObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservedObjects_Objects() {
		return (EAttribute)observedObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservedObjects_ClassificationName() {
		return (EAttribute)observedObjectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficamproviderFactory getTraficamproviderFactory() {
		return (TraficamproviderFactory)getEFactoryInstance();
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
		traficamProviderEClass = createEClass(TRAFICAM_PROVIDER);

		traficamAdminEClass = createEClass(TRAFICAM_ADMIN);
		createEAttribute(traficamAdminEClass, TRAFICAM_ADMIN__VIEWPORT);

		observedObjectsEClass = createEClass(OBSERVED_OBJECTS);
		createEAttribute(observedObjectsEClass, OBSERVED_OBJECTS__OBJECTS);
		createEAttribute(observedObjectsEClass, OBSERVED_OBJECTS__CLASSIFICATION_NAME);
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
		traficamProviderEClass.getESuperTypes().add(theProviderPackage.getDynamicProvider());
		traficamAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());
		observedObjectsEClass.getESuperTypes().add(theProviderPackage.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(traficamProviderEClass, TraficamProvider.class, "TraficamProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traficamAdminEClass, TraficamAdmin.class, "TraficamAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraficamAdmin_Viewport(), theProviderPackage.getEGeoJsonObject(), "viewport", null, 0, 1, TraficamAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observedObjectsEClass, ObservedObjects.class, "ObservedObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservedObjects_Objects(), theProviderPackage.getEGeoJsonObject(), "objects", null, 0, 1, ObservedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservedObjects_ClassificationName(), ecorePackage.getEString(), "classificationName", null, 0, 1, ObservedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getTraficamAdmin_Viewport(),
		   source,
		   new String[] {
			   "sensorthings.observedArea", "true"
		   });
	}

} //TraficamproviderPackageImpl
