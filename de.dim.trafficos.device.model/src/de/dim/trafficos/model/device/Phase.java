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
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Phase#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Phase#getLane <em>Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Phase#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Phase#getWeightMin <em>Weight Min</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Phase#getWeightMax <em>Weight Max</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhase()
 * @model
 * @generated
 */
@ProviderType
public interface Phase extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhase_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Phase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lane</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.ConflictingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the lanes which have the green at the same time, namely non-conflicting with each other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lane</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhase_Lane()
	 * @model required="true"
	 * @generated
	 */
	EList<ConflictingLane> getLane();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhase_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Weight Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Min</em>' attribute.
	 * @see #setWeightMin(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhase_WeightMin()
	 * @model required="true"
	 * @generated
	 */
	int getWeightMin();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Phase#getWeightMin <em>Weight Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Min</em>' attribute.
	 * @see #getWeightMin()
	 * @generated
	 */
	void setWeightMin(int value);

	/**
	 * Returns the value of the '<em><b>Weight Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Max</em>' attribute.
	 * @see #setWeightMax(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPhase_WeightMax()
	 * @model required="true"
	 * @generated
	 */
	int getWeightMax();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Phase#getWeightMax <em>Weight Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Max</em>' attribute.
	 * @see #getWeightMax()
	 * @generated
	 */
	void setWeightMax(int value);

} // Phase
