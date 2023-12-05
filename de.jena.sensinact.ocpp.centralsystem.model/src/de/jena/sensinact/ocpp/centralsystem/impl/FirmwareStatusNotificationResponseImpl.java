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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firmware Status Notification Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FirmwareStatusNotificationResponseImpl extends MinimalEObjectImpl.Container implements FirmwareStatusNotificationResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirmwareStatusNotificationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.FIRMWARE_STATUS_NOTIFICATION_RESPONSE;
	}

} //FirmwareStatusNotificationResponseImpl
