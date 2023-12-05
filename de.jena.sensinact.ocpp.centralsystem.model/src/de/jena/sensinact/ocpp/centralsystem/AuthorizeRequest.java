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
package de.jena.sensinact.ocpp.centralsystem;

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorize Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the Authorize.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest#getIdTag <em>Id Tag</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getAuthorizeRequest()
 * @model extendedMetaData="name='AuthorizeRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuthorizeRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag</em>' attribute.
	 * @see #setIdTag(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getAuthorizeRequest_IdTag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='idTag' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest#getIdTag <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag</em>' attribute.
	 * @see #getIdTag()
	 * @generated
	 */
	void setIdTag(Object value);

} // AuthorizeRequest
