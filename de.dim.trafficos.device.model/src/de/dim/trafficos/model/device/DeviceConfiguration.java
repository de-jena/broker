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
 * A representation of the model object '<em><b>Device Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.DeviceConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DeviceConfiguration#getIntersection <em>Intersection</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.DeviceConfiguration#getCurrentIntersection <em>Current Intersection</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface DeviceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceConfiguration_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DeviceConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Intersection</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Intersection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersection</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceConfiguration_Intersection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Intersection> getIntersection();

	/**
	 * Returns the value of the '<em><b>Current Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Intersection</em>' containment reference.
	 * @see #setCurrentIntersection(Intersection)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceConfiguration_CurrentIntersection()
	 * @model containment="true"
	 * @generated
	 */
	Intersection getCurrentIntersection();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.DeviceConfiguration#getCurrentIntersection <em>Current Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Intersection</em>' containment reference.
	 * @see #getCurrentIntersection()
	 * @generated
	 */
	void setCurrentIntersection(Intersection value);

} // DeviceConfiguration
