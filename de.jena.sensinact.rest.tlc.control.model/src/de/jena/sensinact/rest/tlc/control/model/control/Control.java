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
package de.jena.sensinact.rest.tlc.control.model.control;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.Control#getPhaseId <em>Phase Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getControl()
 * @model
 * @generated
 */
@ProviderType
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Id</em>' attribute.
	 * @see #setPhaseId(String)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getControl_PhaseId()
	 * @model required="true"
	 * @generated
	 */
	String getPhaseId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.Control#getPhaseId <em>Phase Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Id</em>' attribute.
	 * @see #getPhaseId()
	 * @generated
	 */
	void setPhaseId(String value);

} // Control
