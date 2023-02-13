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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.SignalTable#getCacheDataEntry <em>Cache Data Entry</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSignalTable()
 * @model
 * @generated
 */
@ProviderType
public interface SignalTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Cache Data Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.CacheDataEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Data Entry</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSignalTable_CacheDataEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<CacheDataEntry> getCacheDataEntry();

} // SignalTable
