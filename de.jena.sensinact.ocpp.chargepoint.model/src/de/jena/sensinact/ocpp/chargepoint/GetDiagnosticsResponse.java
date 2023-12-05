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
 * A representation of the model object '<em><b>Get Diagnostics Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the GetDiagnostics.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsResponse()
 * @model extendedMetaData="name='GetDiagnosticsResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetDiagnosticsResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetDiagnosticsResponse_FileName()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString255Type"
	 *        extendedMetaData="kind='element' name='fileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetDiagnosticsResponse#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // GetDiagnosticsResponse
