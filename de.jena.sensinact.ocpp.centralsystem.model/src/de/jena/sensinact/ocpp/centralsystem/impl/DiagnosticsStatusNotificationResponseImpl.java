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
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostics Status Notification Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DiagnosticsStatusNotificationResponseImpl extends MinimalEObjectImpl.Container implements DiagnosticsStatusNotificationResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticsStatusNotificationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE;
	}

} //DiagnosticsStatusNotificationResponseImpl
