/*
 */
package de.jena.ilsa.sensinact.model.ilsa;


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
 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = IlsaPackage.eNS_URI, genModel = "/model/ilsa.genmodel", genModelSourceLocations = {"model/ilsa.genmodel","de.jena.ilsa.sensinact.model/model/ilsa.genmodel"}, ecore="/model/ilsa.ecore", ecoreSourceLocations="/model/ilsa.ecore")
public interface IlsaPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ilsa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.data.jena.de/sensinact/ilsa/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ilsa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlsaPackage eINSTANCE = de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.ilsa.sensinact.model.ilsa.impl.IlsaImpl <em>Ilsa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaImpl
	 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl#getIlsa()
	 * @generated
	 */
	int ILSA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA__ID = ProviderPackage.DYNAMIC_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA__ADMIN = ProviderPackage.DYNAMIC_PROVIDER__ADMIN;

	/**
	 * The feature id for the '<em><b>Linked Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA__LINKED_PROVIDERS = ProviderPackage.DYNAMIC_PROVIDER__LINKED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA__SERVICES = ProviderPackage.DYNAMIC_PROVIDER__SERVICES;

	/**
	 * The number of structural features of the '<em>Ilsa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA_FEATURE_COUNT = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA___GET_SERVICE__STRING = ProviderPackage.DYNAMIC_PROVIDER___GET_SERVICE__STRING;

	/**
	 * The operation id for the '<em>Get Service EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA___GET_SERVICE_ECLASS__STRING = ProviderPackage.DYNAMIC_PROVIDER___GET_SERVICE_ECLASS__STRING;

	/**
	 * The number of operations of the '<em>Ilsa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA_OPERATION_COUNT = ProviderPackage.DYNAMIC_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.jena.ilsa.sensinact.model.ilsa.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.ilsa.sensinact.model.ilsa.impl.SignalImpl
	 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__METADATA = ProviderPackage.SERVICE__METADATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__COLOR = ProviderPackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TYPE = ProviderPackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIGNAL_GROUP = ProviderPackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Oberserved Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OBERSERVED_AREA = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = ProviderPackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.SERVICE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = ProviderPackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.jena.ilsa.sensinact.model.ilsa.Ilsa <em>Ilsa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ilsa</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Ilsa
	 * @generated
	 */
	EClass getIlsa();

	/**
	 * Returns the meta object for class '{@link de.jena.ilsa.sensinact.model.ilsa.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Signal#getColor()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Color();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Signal#getType()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Group</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Signal#getSignalGroup()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_SignalGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getOberservedArea <em>Oberserved Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oberserved Area</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Signal#getOberservedArea()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_OberservedArea();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IlsaFactory getIlsaFactory();

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
		 * The meta object literal for the '{@link de.jena.ilsa.sensinact.model.ilsa.impl.IlsaImpl <em>Ilsa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaImpl
		 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl#getIlsa()
		 * @generated
		 */
		EClass ILSA = eINSTANCE.getIlsa();

		/**
		 * The meta object literal for the '{@link de.jena.ilsa.sensinact.model.ilsa.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.ilsa.sensinact.model.ilsa.impl.SignalImpl
		 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__COLOR = eINSTANCE.getSignal_Color();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__TYPE = eINSTANCE.getSignal_Type();

		/**
		 * The meta object literal for the '<em><b>Signal Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__SIGNAL_GROUP = eINSTANCE.getSignal_SignalGroup();

		/**
		 * The meta object literal for the '<em><b>Oberserved Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__OBERSERVED_AREA = eINSTANCE.getSignal_OberservedArea();

	}

} //IlsaPackage
