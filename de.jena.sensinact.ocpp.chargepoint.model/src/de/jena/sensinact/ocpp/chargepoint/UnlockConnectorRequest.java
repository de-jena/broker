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
 * A representation of the model object '<em><b>Unlock Connector Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the UnlockConnector.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest#getConnectorId <em>Connector Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUnlockConnectorRequest()
 * @model extendedMetaData="name='UnlockConnectorRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnlockConnectorRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUnlockConnectorRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector Id</em>' attribute is set.
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	boolean isSetConnectorId();

} // UnlockConnectorRequest
