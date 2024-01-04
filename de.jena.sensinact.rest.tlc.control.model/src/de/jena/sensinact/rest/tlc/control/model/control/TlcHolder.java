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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tlc Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getTlc <em>Tlc</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getPhases <em>Phases</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getCurrentControl <em>Current Control</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlcHolder()
 * @model
 * @generated
 */
@ProviderType
public interface TlcHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlcHolder_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tlc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tlc</em>' containment reference.
	 * @see #setTlc(Tlc)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlcHolder_Tlc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tlc getTlc();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getTlc <em>Tlc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tlc</em>' containment reference.
	 * @see #getTlc()
	 * @generated
	 */
	void setTlc(Tlc value);

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.sensinact.rest.tlc.control.model.control.Phase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' containment reference list.
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlcHolder_Phases()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Phase> getPhases();

	/**
	 * Returns the value of the '<em><b>Current Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Control</em>' containment reference.
	 * @see #setCurrentControl(Control)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlcHolder_CurrentControl()
	 * @model containment="true"
	 * @generated
	 */
	Control getCurrentControl();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.TlcHolder#getCurrentControl <em>Current Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Control</em>' containment reference.
	 * @see #getCurrentControl()
	 * @generated
	 */
	void setCurrentControl(Control value);

} // TlcHolder
