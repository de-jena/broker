/*
 */
package de.jena.conflict.sensinact.model.conflictProvider;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = ConflictPackage.eNS_URI, genModel = "/model/conflict.genmodel", genModelSourceLocations = {"model/conflict.genmodel","de.jena.conflict.sensinact.model/model/conflict.genmodel"}, ecore="/model/conflict.ecore", ecoreSourceLocations="/model/conflict.ecore")
public interface ConflictPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conflictProvider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.data.jena.de/sensinact/trafficConflict/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conflictProvider";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConflictPackage eINSTANCE = de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictProviderImpl <em>Traffic Conflict Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictProviderImpl
	 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl#getTrafficConflictProvider()
	 * @generated
	 */
	int TRAFFIC_CONFLICT_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER__ID = ProviderPackage.PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER__ADMIN = ProviderPackage.PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER__LINKED_PROVIDERS = ProviderPackage.PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER__CONFLICT = ProviderPackage.PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traffic Conflict Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER_FEATURE_COUNT = ProviderPackage.PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER___GET_SERVICE__STRING = ProviderPackage.PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER___GET_SERVICE_ECLASS__STRING = ProviderPackage.PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Traffic Conflict Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_PROVIDER_OPERATION_COUNT = ProviderPackage.PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictImpl
	 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__CONFLICT = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bike Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__BIKE_ID = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictAdminImpl <em>Traffic Conflict Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictAdminImpl
	 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl#getTrafficConflictAdmin()
	 * @generated
	 */
	int TRAFFIC_CONFLICT_ADMIN = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN__METADATA = ProviderPackage.ADMIN__METADATA;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN__FRIENDLY_NAME = ProviderPackage.ADMIN__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN__LOCATION = ProviderPackage.ADMIN__LOCATION;

	/**
	 * The feature id for the '<em><b>Model Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN__MODEL_PACKAGE_URI = ProviderPackage.ADMIN__MODEL_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN__MODEL = ProviderPackage.ADMIN__MODEL;

	/**
	 * The feature id for the '<em><b>Viewport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN__VIEWPORT = ProviderPackage.ADMIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traffic Conflict Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN_FEATURE_COUNT = ProviderPackage.ADMIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.ADMIN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Traffic Conflict Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONFLICT_ADMIN_OPERATION_COUNT = ProviderPackage.ADMIN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider <em>Traffic Conflict Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Conflict Provider</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider
	 * @generated
	 */
	EClass getTrafficConflictProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conflict</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider#getConflict()
	 * @see #getTrafficConflictProvider()
	 * @generated
	 */
	EReference getTrafficConflictProvider_Conflict();

	/**
	 * Returns the meta object for class '{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#isConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conflict</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.Conflict#isConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Conflict();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#getBikeId <em>Bike Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bike Id</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.Conflict#getBikeId()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_BikeId();

	/**
	 * Returns the meta object for class '{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin <em>Traffic Conflict Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Conflict Admin</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin
	 * @generated
	 */
	EClass getTrafficConflictAdmin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin#getViewport <em>Viewport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewport</em>'.
	 * @see de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictAdmin#getViewport()
	 * @see #getTrafficConflictAdmin()
	 * @generated
	 */
	EAttribute getTrafficConflictAdmin_Viewport();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConflictFactory getConflictFactory();

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
		 * The meta object literal for the '{@link de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictProviderImpl <em>Traffic Conflict Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictProviderImpl
		 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl#getTrafficConflictProvider()
		 * @generated
		 */
		EClass TRAFFIC_CONFLICT_PROVIDER = eINSTANCE.getTrafficConflictProvider();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_CONFLICT_PROVIDER__CONFLICT = eINSTANCE.getTrafficConflictProvider_Conflict();

		/**
		 * The meta object literal for the '{@link de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictImpl
		 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__CONFLICT = eINSTANCE.getConflict_Conflict();

		/**
		 * The meta object literal for the '<em><b>Bike Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__BIKE_ID = eINSTANCE.getConflict_BikeId();

		/**
		 * The meta object literal for the '{@link de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictAdminImpl <em>Traffic Conflict Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.TrafficConflictAdminImpl
		 * @see de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictPackageImpl#getTrafficConflictAdmin()
		 * @generated
		 */
		EClass TRAFFIC_CONFLICT_ADMIN = eINSTANCE.getTrafficConflictAdmin();

		/**
		 * The meta object literal for the '<em><b>Viewport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_CONFLICT_ADMIN__VIEWPORT = eINSTANCE.getTrafficConflictAdmin_Viewport();

	}

} //ConflictPackage
