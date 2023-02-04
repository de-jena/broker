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
 * A representation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getRoad <em>Road</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getLink <em>Link</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getPhaseGroup <em>Phase Group</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getOutput <em>Output</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getProgram <em>Program</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getState <em>State</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getName <em>Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Intersection#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection()
 * @model
 * @generated
 */
@ProviderType
public interface Intersection extends AbstractDataEntry {
	/**
	 * Returns the value of the '<em><b>Road</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Road()
	 * @model containment="true" keys="id" required="true"
	 * @generated
	 */
	EList<Road> getRoad();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Link()
	 * @model containment="true" keys="index"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Phase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Phase()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phase> getPhase();

	/**
	 * Returns the value of the '<em><b>Phase Group</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PhaseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Group</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_PhaseGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhaseGroup> getPhaseGroup();

	/**
	 * Returns the value of the '<em><b>Time Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Table</em>' containment reference.
	 * @see #setTimeTable(TimeTable)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_TimeTable()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	TimeTable getTimeTable();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Intersection#getTimeTable <em>Time Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Table</em>' containment reference.
	 * @see #getTimeTable()
	 * @generated
	 */
	void setTimeTable(TimeTable value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Program()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getProgram();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.IntersectionStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.dim.trafficos.model.device.IntersectionStateType
	 * @see #setState(IntersectionStateType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_State()
	 * @model
	 * @generated
	 */
	IntersectionStateType getState();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Intersection#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.dim.trafficos.model.device.IntersectionStateType
	 * @see #getState()
	 * @generated
	 */
	void setState(IntersectionStateType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Intersection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersection_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Intersection#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Intersection
