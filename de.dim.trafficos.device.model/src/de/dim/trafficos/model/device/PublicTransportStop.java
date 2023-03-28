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
package de.dim.trafficos.model.device;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportStop#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportStop()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportStop extends EObject {
	/**
	 * Returns the value of the '<em><b>Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' containment reference.
	 * @see #setStation(PublicTransportStation)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportStop_Station()
	 * @model containment="true"
	 * @generated
	 */
	PublicTransportStation getStation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportStop#getStation <em>Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' containment reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(PublicTransportStation value);

} // PublicTransportStop
