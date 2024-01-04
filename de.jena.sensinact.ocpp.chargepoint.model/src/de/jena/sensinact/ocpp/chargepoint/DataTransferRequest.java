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
 * A representation of the model object '<em><b>Data Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the DataTransfer.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getVendorId <em>Vendor Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDataTransferRequest()
 * @model extendedMetaData="name='DataTransferRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataTransferRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Id</em>' attribute.
	 * @see #setVendorId(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDataTransferRequest_VendorId()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString255Type" required="true"
	 *        extendedMetaData="kind='element' name='vendorId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getVendorId <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Id</em>' attribute.
	 * @see #getVendorId()
	 * @generated
	 */
	void setVendorId(String value);

	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDataTransferRequest_MessageId()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString50Type"
	 *        extendedMetaData="kind='element' name='messageId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDataTransferRequest_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DataTransferRequest#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // DataTransferRequest
