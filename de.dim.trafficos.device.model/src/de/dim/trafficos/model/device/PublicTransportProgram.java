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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportProgram#getDataEntry <em>Data Entry</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportProgram()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportProgram extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Data Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportDataEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Entry</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportProgram_DataEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportDataEntry> getDataEntry();

} // PublicTransportProgram
