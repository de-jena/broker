/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.jena.sensinact.rest.tlc.control.model.control;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = TlcControlPackage.eNS_URI, genModel = "/model/tlc-control-api.genmodel", genModelSourceLocations = {"model/tlc-control-api.genmodel","de.jena.sensinact.rest.tlc.control.model/model/tlc-control-api.genmodel"}, ecore="/model/tlc-control-api.ecore", ecoreSourceLocations="/model/tlc-control-api.ecore")
public interface TlcControlPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "control";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jena.de/models/tlc/control/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tlcControl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TlcControlPackage eINSTANCE = de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.TlcImpl <em>Tlc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getTlc()
	 * @generated
	 */
	int TLC = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Tlc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tlc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.LocationImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.PhaseImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__CODE = 3;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.ControlImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Phase Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PHASE_ID = 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.IdsListReponseImpl <em>Ids List Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.IdsListReponseImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getIdsListReponse()
	 * @generated
	 */
	int IDS_LIST_REPONSE = 4;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDS_LIST_REPONSE__IDS = 0;

	/**
	 * The number of structural features of the '<em>Ids List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDS_LIST_REPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ids List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDS_LIST_REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.PhasesListReponseImpl <em>Phases List Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.PhasesListReponseImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getPhasesListReponse()
	 * @generated
	 */
	int PHASES_LIST_REPONSE = 5;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASES_LIST_REPONSE__PHASES = 0;

	/**
	 * The number of structural features of the '<em>Phases List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASES_LIST_REPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Phases List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASES_LIST_REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.rest.tlc.control.model.control.impl.TlcHolderImpl <em>Tlc Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcHolderImpl
	 * @see de.jena.sensinact.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getTlcHolder()
	 * @generated
	 */
	int TLC_HOLDER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Tlc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__TLC = 1;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__PHASES = 2;

	/**
	 * The feature id for the '<em><b>Current Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__CURRENT_CONTROL = 3;

	/**
	 * The number of structural features of the '<em>Tlc Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tlc Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc <em>Tlc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tlc</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Tlc
	 * @generated
	 */
	EClass getTlc();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Tlc#getId()
	 * @see #getTlc()
	 * @generated
	 */
	EAttribute getTlc_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Tlc#getName()
	 * @see #getTlc()
	 * @generated
	 */
	EAttribute getTlc_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Tlc#getDescription()
	 * @see #getTlc()
	 * @generated
	 */
	EAttribute getTlc_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Tlc#getLocation()
	 * @see #getTlc()
	 * @generated
	 */
	EReference getTlc_Location();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Phase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Phase#getId()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Phase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Phase#getName()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Phase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Phase#getDescription()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Phase#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Phase#getCode()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Code();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.Control#getPhaseId <em>Phase Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Id</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.Control#getPhaseId()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_PhaseId();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.IdsListReponse <em>Ids List Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ids List Reponse</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.IdsListReponse
	 * @generated
	 */
	EClass getIdsListReponse();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.rest.tlc.control.model.control.IdsListReponse#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.IdsListReponse#getIds()
	 * @see #getIdsListReponse()
	 * @generated
	 */
	EAttribute getIdsListReponse_Ids();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.PhasesListReponse <em>Phases List Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phases List Reponse</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.PhasesListReponse
	 * @generated
	 */
	EClass getPhasesListReponse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.rest.tlc.control.model.control.PhasesListReponse#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.PhasesListReponse#getPhases()
	 * @see #getPhasesListReponse()
	 * @generated
	 */
	EReference getPhasesListReponse_Phases();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder <em>Tlc Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tlc Holder</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcHolder
	 * @generated
	 */
	EClass getTlcHolder();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getId()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EAttribute getTlcHolder_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getTlc <em>Tlc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tlc</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getTlc()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EReference getTlcHolder_Tlc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getPhases()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EReference getTlcHolder_Phases();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getCurrentControl <em>Current Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Control</em>'.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getCurrentControl()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EReference getTlcHolder_CurrentControl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TlcControlFactory getTlcControlFactory();

} //TlcControlPackage
