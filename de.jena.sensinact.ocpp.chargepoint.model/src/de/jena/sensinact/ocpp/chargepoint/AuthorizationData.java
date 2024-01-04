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
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTagInfo <em>Id Tag Info</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getAuthorizationData()
 * @model extendedMetaData="name='AuthorizationData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuthorizationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag</em>' attribute.
	 * @see #setIdTag(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getAuthorizationData_IdTag()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.IdToken" required="true"
	 *        extendedMetaData="kind='element' name='idTag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTag <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag</em>' attribute.
	 * @see #getIdTag()
	 * @generated
	 */
	void setIdTag(String value);

	/**
	 * Returns the value of the '<em><b>Id Tag Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag Info</em>' containment reference.
	 * @see #setIdTagInfo(IdTagInfo)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getAuthorizationData_IdTagInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='idTagInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	IdTagInfo getIdTagInfo();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData#getIdTagInfo <em>Id Tag Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag Info</em>' containment reference.
	 * @see #getIdTagInfo()
	 * @generated
	 */
	void setIdTagInfo(IdTagInfo value);

} // AuthorizationData
