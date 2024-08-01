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
package de.jena.model.sensinact.ibis;

import java.time.Instant;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Info Current Display Content Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentDisplayContentData()
 * @model
 * @generated
 */
@ProviderType
public interface CustomerInfoCurrentDisplayContentData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentDisplayContentData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Operation</em>' attribute.
	 * @see #setServiceOperation(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentDisplayContentData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData#getServiceOperation <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Operation</em>' attribute.
	 * @see #getServiceOperation()
	 * @generated
	 */
	void setServiceOperation(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getCustomerInfoCurrentDisplayContentData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant" required="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.CustomerInfoCurrentDisplayContentData#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

} // CustomerInfoCurrentDisplayContentData
