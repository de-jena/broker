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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Time Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getFirstStation <em>First Station</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getLastStation <em>Last Station</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getStops <em>Stops</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTableEntry()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportTimeTableEntry extends AbstractTimeTableEntry {
	/**
	 * Returns the value of the '<em><b>First Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Station</em>' containment reference.
	 * @see #setFirstStation(PublicTransportStation)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTableEntry_FirstStation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PublicTransportStation getFirstStation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getFirstStation <em>First Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Station</em>' containment reference.
	 * @see #getFirstStation()
	 * @generated
	 */
	void setFirstStation(PublicTransportStation value);

	/**
	 * Returns the value of the '<em><b>Last Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Station</em>' containment reference.
	 * @see #setLastStation(PublicTransportStation)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTableEntry_LastStation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PublicTransportStation getLastStation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportTimeTableEntry#getLastStation <em>Last Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Station</em>' containment reference.
	 * @see #getLastStation()
	 * @generated
	 */
	void setLastStation(PublicTransportStation value);

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportStop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportTimeTableEntry_Stops()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportStop> getStops();

} // PublicTransportTimeTableEntry
