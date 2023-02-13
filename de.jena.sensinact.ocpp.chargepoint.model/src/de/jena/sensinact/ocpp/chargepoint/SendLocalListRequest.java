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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Local List Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the SendLocalList.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getListVersion <em>List Version</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getLocalAuthorizationList <em>Local Authorization List</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getUpdateType <em>Update Type</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getSendLocalListRequest()
 * @model extendedMetaData="name='SendLocalListRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SendLocalListRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>List Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Version</em>' attribute.
	 * @see #isSetListVersion()
	 * @see #unsetListVersion()
	 * @see #setListVersion(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getSendLocalListRequest_ListVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='listVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	int getListVersion();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getListVersion <em>List Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Version</em>' attribute.
	 * @see #isSetListVersion()
	 * @see #unsetListVersion()
	 * @see #getListVersion()
	 * @generated
	 */
	void setListVersion(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getListVersion <em>List Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListVersion()
	 * @see #getListVersion()
	 * @see #setListVersion(int)
	 * @generated
	 */
	void unsetListVersion();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getListVersion <em>List Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Version</em>' attribute is set.
	 * @see #unsetListVersion()
	 * @see #getListVersion()
	 * @see #setListVersion(int)
	 * @generated
	 */
	boolean isSetListVersion();

	/**
	 * Returns the value of the '<em><b>Local Authorization List</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.sensinact.ocpp.chargepoint.AuthorizationData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Authorization List</em>' containment reference list.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getSendLocalListRequest_LocalAuthorizationList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='localAuthorizationList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuthorizationData> getLocalAuthorizationList();

	/**
	 * Returns the value of the '<em><b>Update Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.UpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Type</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
	 * @see #isSetUpdateType()
	 * @see #unsetUpdateType()
	 * @see #setUpdateType(UpdateType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getSendLocalListRequest_UpdateType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='updateType' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdateType();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getUpdateType <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Type</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.UpdateType
	 * @see #isSetUpdateType()
	 * @see #unsetUpdateType()
	 * @see #getUpdateType()
	 * @generated
	 */
	void setUpdateType(UpdateType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getUpdateType <em>Update Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateType()
	 * @see #getUpdateType()
	 * @see #setUpdateType(UpdateType)
	 * @generated
	 */
	void unsetUpdateType();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.SendLocalListRequest#getUpdateType <em>Update Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Type</em>' attribute is set.
	 * @see #unsetUpdateType()
	 * @see #getUpdateType()
	 * @see #setUpdateType(UpdateType)
	 * @generated
	 */
	boolean isSetUpdateType();

} // SendLocalListRequest
