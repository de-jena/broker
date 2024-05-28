/*
 */
package de.jena.traficam.sensinact.model.traficamprovider;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.sensinact.model.core.provider.ProviderPackage;

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
 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = TraficamproviderPackage.eNS_URI, genModel = "/model/traficam.genmodel", genModelSourceLocations = {"model/traficam.genmodel","de.jena.traficam.sensinact.model/model/traficam.genmodel"}, ecore="/model/traficam.ecore", ecoreSourceLocations="/model/traficam.ecore")
public interface TraficamproviderPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traficamprovider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/sensinact/traficam/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traficamprovider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraficamproviderPackage eINSTANCE = de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamProviderImpl <em>Traficam Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamProviderImpl
	 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl#getTraficamProvider()
	 * @generated
	 */
	int TRAFICAM_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER__ID = ProviderPackage.DYNAMIC_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER__ADMIN = ProviderPackage.DYNAMIC_PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER__LINKED_PROVIDERS = ProviderPackage.DYNAMIC_PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER__SERVICES = ProviderPackage.DYNAMIC_PROVIDER__SERVICES;

	/**
	 * The number of structural features of the '<em>Traficam Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER_FEATURE_COUNT = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER___GET_SERVICE__STRING = ProviderPackage.DYNAMIC_PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER___GET_SERVICE_ECLASS__STRING = ProviderPackage.DYNAMIC_PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Traficam Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_PROVIDER_OPERATION_COUNT = ProviderPackage.DYNAMIC_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamAdminImpl <em>Traficam Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamAdminImpl
	 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl#getTraficamAdmin()
	 * @generated
	 */
	int TRAFICAM_ADMIN = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN__METADATA = ProviderPackage.ADMIN__METADATA;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN__FRIENDLY_NAME = ProviderPackage.ADMIN__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN__LOCATION = ProviderPackage.ADMIN__LOCATION;

	/**
	 * The feature id for the '<em><b>Model Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN__MODEL_PACKAGE_URI = ProviderPackage.ADMIN__MODEL_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN__MODEL = ProviderPackage.ADMIN__MODEL;

	/**
	 * The feature id for the '<em><b>Viewport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN__VIEWPORT = ProviderPackage.ADMIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traficam Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN_FEATURE_COUNT = ProviderPackage.ADMIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.ADMIN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Traficam Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFICAM_ADMIN_OPERATION_COUNT = ProviderPackage.ADMIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.traficam.sensinact.model.traficamprovider.impl.ObservedObjectsImpl <em>Observed Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.ObservedObjectsImpl
	 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl#getObservedObjects()
	 * @generated
	 */
	int OBSERVED_OBJECTS = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_OBJECTS__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_OBJECTS__OBJECTS = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_OBJECTS__CLASSIFICATION_NAME = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observed Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_OBJECTS_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_OBJECTS___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Observed Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_OBJECTS_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider <em>Traficam Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traficam Provider</em>'.
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamProvider
	 * @generated
	 */
	EClass getTraficamProvider();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin <em>Traficam Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traficam Admin</em>'.
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin
	 * @generated
	 */
	EClass getTraficamAdmin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin#getViewport <em>Viewport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewport</em>'.
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin#getViewport()
	 * @see #getTraficamAdmin()
	 * @generated
	 */
	EAttribute getTraficamAdmin_Viewport();

	/**
	 * Returns the meta object for class '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects <em>Observed Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observed Objects</em>'.
	 * @see de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects
	 * @generated
	 */
	EClass getObservedObjects();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects</em>'.
	 * @see de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getObjects()
	 * @see #getObservedObjects()
	 * @generated
	 */
	EAttribute getObservedObjects_Objects();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getClassificationName <em>Classification Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Name</em>'.
	 * @see de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getClassificationName()
	 * @see #getObservedObjects()
	 * @generated
	 */
	EAttribute getObservedObjects_ClassificationName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraficamproviderFactory getTraficamproviderFactory();

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
		 * The meta object literal for the '{@link de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamProviderImpl <em>Traficam Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamProviderImpl
		 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl#getTraficamProvider()
		 * @generated
		 */
		EClass TRAFICAM_PROVIDER = eINSTANCE.getTraficamProvider();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamAdminImpl <em>Traficam Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamAdminImpl
		 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl#getTraficamAdmin()
		 * @generated
		 */
		EClass TRAFICAM_ADMIN = eINSTANCE.getTraficamAdmin();

		/**
		 * The meta object literal for the '<em><b>Viewport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFICAM_ADMIN__VIEWPORT = eINSTANCE.getTraficamAdmin_Viewport();

		/**
		 * The meta object literal for the '{@link de.jena.traficam.sensinact.model.traficamprovider.impl.ObservedObjectsImpl <em>Observed Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.ObservedObjectsImpl
		 * @see de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderPackageImpl#getObservedObjects()
		 * @generated
		 */
		EClass OBSERVED_OBJECTS = eINSTANCE.getObservedObjects();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVED_OBJECTS__OBJECTS = eINSTANCE.getObservedObjects_Objects();

		/**
		 * The meta object literal for the '<em><b>Classification Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVED_OBJECTS__CLASSIFICATION_NAME = eINSTANCE.getObservedObjects_ClassificationName();

	}

} //TraficamproviderPackage
