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

import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.UpdateFirmwareResponse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Firmware Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UpdateFirmwareResponseImpl extends MinimalEObjectImpl.Container implements UpdateFirmwareResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateFirmwareResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.UPDATE_FIRMWARE_RESPONSE;
	}

} //UpdateFirmwareResponseImpl
