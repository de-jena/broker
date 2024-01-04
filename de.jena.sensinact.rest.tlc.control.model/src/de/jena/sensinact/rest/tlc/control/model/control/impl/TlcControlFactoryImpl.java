/**
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
package de.jena.sensinact.rest.tlc.control.model.control.impl;

import de.jena.sensinact.rest.tlc.control.model.control.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TlcControlFactoryImpl extends EFactoryImpl implements TlcControlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TlcControlFactory init() {
		try {
			TlcControlFactory theTlcControlFactory = (TlcControlFactory)EPackage.Registry.INSTANCE.getEFactory(TlcControlPackage.eNS_URI);
			if (theTlcControlFactory != null) {
				return theTlcControlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TlcControlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlcControlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TlcControlPackage.TLC: return createTlc();
			case TlcControlPackage.LOCATION: return createLocation();
			case TlcControlPackage.PHASE: return createPhase();
			case TlcControlPackage.CONTROL: return createControl();
			case TlcControlPackage.IDS_LIST_REPONSE: return createIdsListReponse();
			case TlcControlPackage.PHASES_LIST_REPONSE: return createPhasesListReponse();
			case TlcControlPackage.TLC_HOLDER: return createTlcHolder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tlc createTlc() {
		TlcImpl tlc = new TlcImpl();
		return tlc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdsListReponse createIdsListReponse() {
		IdsListReponseImpl idsListReponse = new IdsListReponseImpl();
		return idsListReponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhasesListReponse createPhasesListReponse() {
		PhasesListReponseImpl phasesListReponse = new PhasesListReponseImpl();
		return phasesListReponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TlcHolder createTlcHolder() {
		TlcHolderImpl tlcHolder = new TlcHolderImpl();
		return tlcHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TlcControlPackage getTlcControlPackage() {
		return (TlcControlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TlcControlPackage getPackage() {
		return TlcControlPackage.eINSTANCE;
	}

} //TlcControlFactoryImpl
