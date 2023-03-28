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
 * A representation of the model object '<em><b>Tlc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A small representation of a Traffic Light Controller
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlc()
 * @model
 * @generated
 */
@ProviderType
public interface Tlc extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system internal identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlc_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The A human readable name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlc_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getName <em>Name</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * An additional description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlc_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the tlc controller
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see de.jena.sensinact.rest.tlc.control.model.control.TlcControlPackage#getTlc_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.rest.tlc.control.model.control.Tlc#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Tlc
