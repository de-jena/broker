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
package de.jena.sensinact.ocpp.chargepoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionRequest;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Local List Version Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GetLocalListVersionRequestImpl extends MinimalEObjectImpl.Container implements GetLocalListVersionRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetLocalListVersionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.GET_LOCAL_LIST_VERSION_REQUEST;
	}

} //GetLocalListVersionRequestImpl
