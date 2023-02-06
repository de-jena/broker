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
 * A representation of the model object '<em><b>Conflicting Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.ConflictingLane#getConflictingLane <em>Conflicting Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.ConflictingLane#getConflictingLink <em>Conflicting Link</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.ConflictingLane#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.ConflictingLane#getSignalGroups <em>Signal Groups</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getConflictingLane()
 * @model
 * @generated
 */
@ProviderType
public interface ConflictingLane extends Lane {
	/**
	 * Returns the value of the '<em><b>Conflicting Lane</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.ConflictingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicting Lane</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getConflictingLane_ConflictingLane()
	 * @model keys="id"
	 * @generated
	 */
	EList<ConflictingLane> getConflictingLane();

	/**
	 * Returns the value of the '<em><b>Conflicting Link</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicting Link</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getConflictingLane_ConflictingLink()
	 * @model keys="index"
	 * @generated
	 */
	EList<Link> getConflictingLink();

	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' reference.
	 * @see #setSignalGroup(Output)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getConflictingLane_SignalGroup()
	 * @model
	 * @generated
	 */
	Output getSignalGroup();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.ConflictingLane#getSignalGroup <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group</em>' reference.
	 * @see #getSignalGroup()
	 * @generated
	 */
	void setSignalGroup(Output value);

	/**
	 * Returns the value of the '<em><b>Signal Groups</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Groups</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getConflictingLane_SignalGroups()
	 * @model
	 * @generated
	 */
	EList<Output> getSignalGroups();

} // ConflictingLane
