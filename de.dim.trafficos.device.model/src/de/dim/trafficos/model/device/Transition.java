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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Transition#getRefNextPhase <em>Ref Next Phase</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Transition#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Transition#getUnchangedLane <em>Unchanged Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Transition#getChangedLane <em>Changed Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Transition#getClearArea <em>Clear Area</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTransition()
 * @model
 * @generated
 */
@ProviderType
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Next Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Next Phase</em>' reference.
	 * @see #setRefNextPhase(Phase)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTransition_RefNextPhase()
	 * @model required="true"
	 * @generated
	 */
	Phase getRefNextPhase();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Transition#getRefNextPhase <em>Ref Next Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Next Phase</em>' reference.
	 * @see #getRefNextPhase()
	 * @generated
	 */
	void setRefNextPhase(Phase value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTransition_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Unchanged Lane</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.ConflictingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchanged Lane</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTransition_UnchangedLane()
	 * @model
	 * @generated
	 */
	EList<ConflictingLane> getUnchangedLane();

	/**
	 * Returns the value of the '<em><b>Changed Lane</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.ConflictingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Lane</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTransition_ChangedLane()
	 * @model
	 * @generated
	 */
	EList<ConflictingLane> getChangedLane();

	/**
	 * Returns the value of the '<em><b>Clear Area</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.ClearArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Area</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTransition_ClearArea()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClearArea> getClearArea();

} // Transition
