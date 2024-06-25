/**
 */
package de.jena.conflict.sensinact.model.conflictProvider.impl;

import de.jena.conflict.sensinact.model.conflictProvider.Conflict;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictFactory;
import de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin;
import de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider;

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
public class ConflictPackageImpl extends EPackageImpl implements ConflictPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficConflictProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficConflictAdminEClass = null;

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
	 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConflictPackageImpl() {
		super(eNS_URI, ConflictFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConflictPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConflictPackage init() {
		if (isInited) return (ConflictPackage)EPackage.Registry.INSTANCE.getEPackage(ConflictPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConflictPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConflictPackageImpl theConflictPackage = registeredConflictPackage instanceof ConflictPackageImpl ? (ConflictPackageImpl)registeredConflictPackage : new ConflictPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ProviderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConflictPackage.createPackageContents();

		// Initialize created meta-data
		theConflictPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConflictPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConflictPackage.eNS_URI, theConflictPackage);
		return theConflictPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafficConflictProvider() {
		return trafficConflictProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficConflictProvider_Conflict() {
		return (EReference)trafficConflictProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConflict() {
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConflict_Conflict() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConflict_BikeId() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafficConflictAdmin() {
		return trafficConflictAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafficConflictAdmin_Viewport() {
		return (EAttribute)trafficConflictAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConflictFactory getConflictFactory() {
		return (ConflictFactory)getEFactoryInstance();
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
		trafficConflictProviderEClass = createEClass(TRAFFIC_CONFLICT_PROVIDER);
		createEReference(trafficConflictProviderEClass, TRAFFIC_CONFLICT_PROVIDER__CONFLICT);

		conflictEClass = createEClass(CONFLICT);
		createEAttribute(conflictEClass, CONFLICT__CONFLICT);
		createEAttribute(conflictEClass, CONFLICT__BIKE_ID);

		trafficConflictAdminEClass = createEClass(TRAFFIC_CONFLICT_ADMIN);
		createEAttribute(trafficConflictAdminEClass, TRAFFIC_CONFLICT_ADMIN__VIEWPORT);
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
		trafficConflictProviderEClass.getESuperTypes().add(theProviderPackage.getProvider());
		conflictEClass.getESuperTypes().add(theProviderPackage.getService());
		trafficConflictAdminEClass.getESuperTypes().add(theProviderPackage.getAdmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(trafficConflictProviderEClass, TrafficConflictProvider.class, "TrafficConflictProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrafficConflictProvider_Conflict(), this.getConflict(), null, "conflict", null, 0, 1, TrafficConflictProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictEClass, Conflict.class, "Conflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConflict_Conflict(), ecorePackage.getEBoolean(), "conflict", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflict_BikeId(), ecorePackage.getELongObject(), "bikeId", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafficConflictAdminEClass, TrafficConflictAdmin.class, "TrafficConflictAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafficConflictAdmin_Viewport(), theProviderPackage.getEGeoJsonObject(), "viewport", null, 0, 1, TrafficConflictAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getTrafficConflictAdmin_Viewport(),
		   source,
		   new String[] {
			   "sensorthings.observedArea", "true"
		   });
	}

} //ConflictPackageImpl
