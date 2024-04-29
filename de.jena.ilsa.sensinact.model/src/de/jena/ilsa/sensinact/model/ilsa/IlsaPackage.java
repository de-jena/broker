/*
 */
package de.jena.ilsa.sensinact.model.ilsa;


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
	 * The feature id for the '<em><b>Thermal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA__THERMAL = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ilsa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILSA_FEATURE_COUNT = ProviderPackage.DYNAMIC_PROVIDER_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Observed Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OBSERVED_AREA = ProviderPackage.SERVICE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link de.jena.ilsa.sensinact.model.ilsa.impl.ThermalImpl <em>Thermal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.ilsa.sensinact.model.ilsa.impl.ThermalImpl
	 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl#getThermal()
	 * @generated
	 */
	int THERMAL = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL__METADATA = ProviderPackage.ADMIN__METADATA;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL__FRIENDLY_NAME = ProviderPackage.ADMIN__FRIENDLY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL__LOCATION = ProviderPackage.ADMIN__LOCATION;

	/**
	 * The feature id for the '<em><b>Model Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL__MODEL_PACKAGE_URI = ProviderPackage.ADMIN__MODEL_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL__MODEL = ProviderPackage.ADMIN__MODEL;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL__TEMPERATURE = ProviderPackage.ADMIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thermal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_FEATURE_COUNT = ProviderPackage.ADMIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL___EIS_SET__ESTRUCTURALFEATURE = ProviderPackage.ADMIN___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>Thermal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THERMAL_OPERATION_COUNT = ProviderPackage.ADMIN_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link de.jena.ilsa.sensinact.model.ilsa.Ilsa#getThermal <em>Thermal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Ilsa#getThermal()
	 * @see #getIlsa()
	 * @generated
	 */
	EReference getIlsa_Thermal();

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
	 * Returns the meta object for the attribute '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getObservedArea <em>Observed Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observed Area</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Signal#getObservedArea()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_ObservedArea();

	/**
	 * Returns the meta object for class '{@link de.jena.ilsa.sensinact.model.ilsa.Thermal <em>Thermal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thermal</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Thermal
	 * @generated
	 */
	EClass getThermal();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.ilsa.sensinact.model.ilsa.Thermal#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see de.jena.ilsa.sensinact.model.ilsa.Thermal#getTemperature()
	 * @see #getThermal()
	 * @generated
	 */
	EAttribute getThermal_Temperature();

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
		 * The meta object literal for the '<em><b>Thermal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ILSA__THERMAL = eINSTANCE.getIlsa_Thermal();

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
		 * The meta object literal for the '<em><b>Observed Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__OBSERVED_AREA = eINSTANCE.getSignal_ObservedArea();

		/**
		 * The meta object literal for the '{@link de.jena.ilsa.sensinact.model.ilsa.impl.ThermalImpl <em>Thermal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.ilsa.sensinact.model.ilsa.impl.ThermalImpl
		 * @see de.jena.ilsa.sensinact.model.ilsa.impl.IlsaPackageImpl#getThermal()
		 * @generated
		 */
		EClass THERMAL = eINSTANCE.getThermal();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THERMAL__TEMPERATURE = eINSTANCE.getThermal_Temperature();

	}

} //IlsaPackage
