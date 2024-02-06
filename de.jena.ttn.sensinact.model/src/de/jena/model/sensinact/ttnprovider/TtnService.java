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
package de.jena.model.sensinact.ttnprovider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ttn Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.TtnService#getRawPayload <em>Raw Payload</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnService()
 * @model
 * @generated
 */
@ProviderType
public interface TtnService extends Service {
	/**
	 * Returns the value of the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Payload</em>' attribute.
	 * @see #setRawPayload(String)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getTtnService_RawPayload()
	 * @model
	 * @generated
	 */
	String getRawPayload();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.TtnService#getRawPayload <em>Raw Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Payload</em>' attribute.
	 * @see #getRawPayload()
	 * @generated
	 */
	void setRawPayload(String value);

} // TtnService
