/**
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl;

import de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemFactory;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TOSIntersectionSystemPackageImpl extends EPackageImpl implements TOSIntersectionSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionSystemEClass = null;

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
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TOSIntersectionSystemPackageImpl() {
		super(eNS_URI, TOSIntersectionSystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TOSIntersectionSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TOSIntersectionSystemPackage init() {
		if (isInited) return (TOSIntersectionSystemPackage)EPackage.Registry.INSTANCE.getEPackage(TOSIntersectionSystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTOSIntersectionSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TOSIntersectionSystemPackageImpl theTOSIntersectionSystemPackage = registeredTOSIntersectionSystemPackage instanceof TOSIntersectionSystemPackageImpl ? (TOSIntersectionSystemPackageImpl)registeredTOSIntersectionSystemPackage : new TOSIntersectionSystemPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTOSIntersectionSystemPackage.createPackageContents();

		// Initialize created meta-data
		theTOSIntersectionSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTOSIntersectionSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TOSIntersectionSystemPackage.eNS_URI, theTOSIntersectionSystemPackage);
		return theTOSIntersectionSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntersectionSystem() {
		return intersectionSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersectionSystem_Id() {
		return (EAttribute)intersectionSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersectionSystem_IntersectionId() {
		return (EAttribute)intersectionSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersectionSystem_IntersectionName() {
		return (EAttribute)intersectionSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersectionSystem_TlModuleIds() {
		return (EAttribute)intersectionSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntersectionSystem_DetectorIds() {
		return (EAttribute)intersectionSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSIntersectionSystemFactory getTOSIntersectionSystemFactory() {
		return (TOSIntersectionSystemFactory)getEFactoryInstance();
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
		intersectionSystemEClass = createEClass(INTERSECTION_SYSTEM);
		createEAttribute(intersectionSystemEClass, INTERSECTION_SYSTEM__ID);
		createEAttribute(intersectionSystemEClass, INTERSECTION_SYSTEM__INTERSECTION_ID);
		createEAttribute(intersectionSystemEClass, INTERSECTION_SYSTEM__INTERSECTION_NAME);
		createEAttribute(intersectionSystemEClass, INTERSECTION_SYSTEM__TL_MODULE_IDS);
		createEAttribute(intersectionSystemEClass, INTERSECTION_SYSTEM__DETECTOR_IDS);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(intersectionSystemEClass, IntersectionSystem.class, "IntersectionSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntersectionSystem_Id(), ecorePackage.getEString(), "id", null, 1, 1, IntersectionSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersectionSystem_IntersectionId(), ecorePackage.getEString(), "intersectionId", null, 1, 1, IntersectionSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersectionSystem_IntersectionName(), ecorePackage.getEString(), "intersectionName", null, 0, 1, IntersectionSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersectionSystem_TlModuleIds(), ecorePackage.getEString(), "tlModuleIds", null, 0, -1, IntersectionSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntersectionSystem_DetectorIds(), ecorePackage.getEString(), "detectorIds", null, 0, -1, IntersectionSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TOSIntersectionSystemPackageImpl
