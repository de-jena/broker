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
 * A representation of the model object '<em><b>Start Transaction Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the StartTransaction.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getIdTagInfo <em>Id Tag Info</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionResponse()
 * @model extendedMetaData="name='StartTransactionResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StartTransactionResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #setTransactionId(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionResponse_TransactionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='transactionId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTransactionId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	void unsetTransactionId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getTransactionId <em>Transaction Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Id</em>' attribute is set.
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	boolean isSetTransactionId();

	/**
	 * Returns the value of the '<em><b>Id Tag Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag Info</em>' attribute.
	 * @see #setIdTagInfo(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStartTransactionResponse_IdTagInfo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='idTagInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIdTagInfo();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse#getIdTagInfo <em>Id Tag Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag Info</em>' attribute.
	 * @see #getIdTagInfo()
	 * @generated
	 */
	void setIdTagInfo(Object value);

} // StartTransactionResponse
