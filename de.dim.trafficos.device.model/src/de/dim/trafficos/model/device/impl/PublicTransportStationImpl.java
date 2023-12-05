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
package de.dim.trafficos.model.device.impl;

import org.eclipse.emf.ecore.EClass;

import de.dim.trafficos.model.device.PublicTransportStation;
import de.dim.trafficos.model.device.TOSDevicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Transport Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PublicTransportStationImpl extends IdNameElementImpl implements PublicTransportStation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportStationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_STATION;
	}

} //PublicTransportStationImpl
