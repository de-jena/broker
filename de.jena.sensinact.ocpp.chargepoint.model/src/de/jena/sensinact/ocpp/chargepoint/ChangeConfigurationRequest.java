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
 * A representation of the model object '<em><b>Change Configuration Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the ChangeConfiguration.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getKey <em>Key</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChangeConfigurationRequest()
 * @model extendedMetaData="name='ChangeConfigurationRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChangeConfigurationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChangeConfigurationRequest_Key()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString50Type" required="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChangeConfigurationRequest_Value()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString500Type" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeConfigurationRequest#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ChangeConfigurationRequest
