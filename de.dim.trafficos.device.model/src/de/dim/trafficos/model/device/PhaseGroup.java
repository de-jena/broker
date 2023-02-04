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
 * A representation of the model object '<em><b>Phase Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PhaseGroup#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PhaseGroup#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PhaseGroup#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhaseGroup()
 * @model
 * @generated
 */
@ProviderType
public interface PhaseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhaseGroup_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PhaseGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Penalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a value which takes into account how many times the same lane is present in more than a Phase of the group. A penalty term of 0 means no lane is repeated more than once, a penalty term of 1 means a lane is present in two phases of the group, a penalty term of 2 means a lane is present in three phases or two lanes are present in two phases, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penalty</em>' attribute.
	 * @see #setPenalty(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhaseGroup_Penalty()
	 * @model required="true"
	 * @generated
	 */
	int getPenalty();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PhaseGroup#getPenalty <em>Penalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty</em>' attribute.
	 * @see #getPenalty()
	 * @generated
	 */
	void setPenalty(int value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Phase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhaseGroup_Phase()
	 * @model required="true"
	 * @generated
	 */
	EList<Phase> getPhase();

} // PhaseGroup
