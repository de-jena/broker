/**
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl;

import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlFactory;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage;
import de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TlcControlPackageImpl extends EPackageImpl implements TlcControlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlcEClass = null;

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
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idsListReponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modesListReponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlcHolderEClass = null;

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
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TlcControlPackageImpl() {
		super(eNS_URI, TlcControlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TlcControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TlcControlPackage init() {
		if (isInited) return (TlcControlPackage)EPackage.Registry.INSTANCE.getEPackage(TlcControlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTlcControlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TlcControlPackageImpl theTlcControlPackage = registeredTlcControlPackage instanceof TlcControlPackageImpl ? (TlcControlPackageImpl)registeredTlcControlPackage : new TlcControlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTlcControlPackage.createPackageContents();

		// Initialize created meta-data
		theTlcControlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTlcControlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TlcControlPackage.eNS_URI, theTlcControlPackage);
		return theTlcControlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTlc() {
		return tlcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTlc_Id() {
		return (EAttribute)tlcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTlc_Name() {
		return (EAttribute)tlcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTlc_Description() {
		return (EAttribute)tlcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTlc_Location() {
		return (EReference)tlcEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMode_Id() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMode_Name() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMode_Description() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMode_Code() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Mode() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdsListReponse() {
		return idsListReponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdsListReponse_Ids() {
		return (EAttribute)idsListReponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModesListReponse() {
		return modesListReponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModesListReponse_Modes() {
		return (EReference)modesListReponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTlcHolder() {
		return tlcHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTlcHolder_Id() {
		return (EAttribute)tlcHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTlcHolder_Tlc() {
		return (EReference)tlcHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTlcHolder_Modes() {
		return (EReference)tlcHolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTlcHolder_CurrentControl() {
		return (EReference)tlcHolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TlcControlFactory getTlcControlFactory() {
		return (TlcControlFactory)getEFactoryInstance();
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
		tlcEClass = createEClass(TLC);
		createEAttribute(tlcEClass, TLC__ID);
		createEAttribute(tlcEClass, TLC__NAME);
		createEAttribute(tlcEClass, TLC__DESCRIPTION);
		createEReference(tlcEClass, TLC__LOCATION);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);

		modeEClass = createEClass(MODE);
		createEAttribute(modeEClass, MODE__ID);
		createEAttribute(modeEClass, MODE__NAME);
		createEAttribute(modeEClass, MODE__DESCRIPTION);
		createEAttribute(modeEClass, MODE__CODE);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__MODE);

		idsListReponseEClass = createEClass(IDS_LIST_REPONSE);
		createEAttribute(idsListReponseEClass, IDS_LIST_REPONSE__IDS);

		modesListReponseEClass = createEClass(MODES_LIST_REPONSE);
		createEReference(modesListReponseEClass, MODES_LIST_REPONSE__MODES);

		tlcHolderEClass = createEClass(TLC_HOLDER);
		createEAttribute(tlcHolderEClass, TLC_HOLDER__ID);
		createEReference(tlcHolderEClass, TLC_HOLDER__TLC);
		createEReference(tlcHolderEClass, TLC_HOLDER__MODES);
		createEReference(tlcHolderEClass, TLC_HOLDER__CURRENT_CONTROL);
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
		initEClass(tlcEClass, Tlc.class, "Tlc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTlc_Id(), ecorePackage.getEString(), "id", null, 1, 1, Tlc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTlc_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tlc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTlc_Description(), ecorePackage.getEString(), "description", null, 1, 1, Tlc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTlc_Location(), this.getLocation(), null, "location", null, 1, 1, Tlc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Latitude(), ecorePackage.getEString(), "latitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEString(), "longitude", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMode_Id(), ecorePackage.getEString(), "id", null, 1, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMode_Description(), ecorePackage.getEString(), "description", null, 1, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMode_Code(), ecorePackage.getEBigInteger(), "code", null, 1, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Mode(), ecorePackage.getEString(), "mode", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idsListReponseEClass, IdsListReponse.class, "IdsListReponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdsListReponse_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, IdsListReponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modesListReponseEClass, ModesListReponse.class, "ModesListReponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModesListReponse_Modes(), this.getMode(), null, "modes", null, 0, -1, ModesListReponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tlcHolderEClass, TlcHolder.class, "TlcHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTlcHolder_Id(), ecorePackage.getEString(), "id", null, 1, 1, TlcHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTlcHolder_Tlc(), this.getTlc(), null, "tlc", null, 1, 1, TlcHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTlcHolder_Modes(), this.getMode(), null, "modes", null, 0, -1, TlcHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTlcHolder_CurrentControl(), this.getControl(), null, "currentControl", null, 0, 1, TlcHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		  (tlcEClass,
		   source,
		   new String[] {
			   "documentation", "A small representation of a Traffic Light Controller"
		   });
		addAnnotation
		  (getTlc_Id(),
		   source,
		   new String[] {
			   "documentation", "The system internal identifier"
		   });
		addAnnotation
		  (getTlc_Name(),
		   source,
		   new String[] {
			   "documentation", "The A human readable name"
		   });
		addAnnotation
		  (getTlc_Description(),
		   source,
		   new String[] {
			   "documentation", "An additional description"
		   });
		addAnnotation
		  (getTlc_Location(),
		   source,
		   new String[] {
			   "documentation", "The location of the tlc controller"
		   });
		addAnnotation
		  (locationEClass,
		   source,
		   new String[] {
			   "documentation", "A location represanting geo coordinates in decimal from"
		   });
		addAnnotation
		  (getMode_Id(),
		   source,
		   new String[] {
			   "documentation", "The system internal identifier"
		   });
		addAnnotation
		  (getMode_Name(),
		   source,
		   new String[] {
			   "documentation", "The A human readable name"
		   });
		addAnnotation
		  (getMode_Description(),
		   source,
		   new String[] {
			   "documentation", "An additional description"
		   });
		addAnnotation
		  (getMode_Code(),
		   source,
		   new String[] {
			   "documentation", "Integer that will be mapped on the physical pins in the TLC"
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
		  (getIdsListReponse_Ids(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getModesListReponse_Modes(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getTlcHolder_Modes(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //TlcControlPackageImpl
