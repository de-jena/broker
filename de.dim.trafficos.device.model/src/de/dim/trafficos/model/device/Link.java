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
package de.dim.trafficos.model.device;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Link#getIndex <em>Index</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Link#getRefIncomingLane <em>Ref Incoming Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Link#getRefOutgoingLane <em>Ref Outgoing Lane</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getLink()
 * @model
 * @generated
 */
@ProviderType
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getLink_Index()
	 * @model required="true"
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Link#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Ref Incoming Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Incoming Lane</em>' reference.
	 * @see #setRefIncomingLane(Lane)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getLink_RefIncomingLane()
	 * @model
	 * @generated
	 */
	Lane getRefIncomingLane();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Link#getRefIncomingLane <em>Ref Incoming Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Incoming Lane</em>' reference.
	 * @see #getRefIncomingLane()
	 * @generated
	 */
	void setRefIncomingLane(Lane value);

	/**
	 * Returns the value of the '<em><b>Ref Outgoing Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Outgoing Lane</em>' reference.
	 * @see #setRefOutgoingLane(OutgoingLane)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getLink_RefOutgoingLane()
	 * @model
	 * @generated
	 */
	OutgoingLane getRefOutgoingLane();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Link#getRefOutgoingLane <em>Ref Outgoing Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Outgoing Lane</em>' reference.
	 * @see #getRefOutgoingLane()
	 * @generated
	 */
	void setRefOutgoingLane(OutgoingLane value);

} // Link
