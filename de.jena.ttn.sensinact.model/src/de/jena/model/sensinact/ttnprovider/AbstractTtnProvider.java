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

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Ttn Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.AbstractTtnProvider#getGateway <em>Gateway</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getAbstractTtnProvider()
 * @model
 * @generated
 */
@ProviderType
public interface AbstractTtnProvider extends Provider {
	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' containment reference.
	 * @see #setGateway(GatewayData)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getAbstractTtnProvider_Gateway()
	 * @model containment="true"
	 * @generated
	 */
	GatewayData getGateway();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.AbstractTtnProvider#getGateway <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' containment reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(GatewayData value);

} // AbstractTtnProvider
