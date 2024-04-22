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
package de.jena.traficam;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Of View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.FieldOfView#getHfov <em>Hfov</em>}</li>
 *   <li>{@link de.jena.traficam.FieldOfView#getVfov <em>Vfov</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.TrafiCamPackage#getFieldOfView()
 * @model
 * @generated
 */
@ProviderType
public interface FieldOfView extends EObject {
	/**
	 * Returns the value of the '<em><b>Hfov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hfov</em>' attribute.
	 * @see #setHfov(double)
	 * @see de.jena.traficam.TrafiCamPackage#getFieldOfView_Hfov()
	 * @model
	 * @generated
	 */
	double getHfov();

	/**
	 * Sets the value of the '{@link de.jena.traficam.FieldOfView#getHfov <em>Hfov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hfov</em>' attribute.
	 * @see #getHfov()
	 * @generated
	 */
	void setHfov(double value);

	/**
	 * Returns the value of the '<em><b>Vfov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vfov</em>' attribute.
	 * @see #setVfov(double)
	 * @see de.jena.traficam.TrafiCamPackage#getFieldOfView_Vfov()
	 * @model
	 * @generated
	 */
	double getVfov();

	/**
	 * Sets the value of the '{@link de.jena.traficam.FieldOfView#getVfov <em>Vfov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vfov</em>' attribute.
	 * @see #getVfov()
	 * @generated
	 */
	void setVfov(double value);

} // FieldOfView
