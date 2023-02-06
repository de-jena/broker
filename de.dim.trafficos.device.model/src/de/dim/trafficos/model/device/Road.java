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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Road#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Road#isMainRoad <em>Main Road</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Road#getIncomingLane <em>Incoming Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Road#getOutgoingLane <em>Outgoing Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Road#getPedestrianLane <em>Pedestrian Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Road#getCycleLane <em>Cycle Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.Road#getPublicTransportLane <em>Public Transport Lane</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad()
 * @model
 * @generated
 */
@ProviderType
public interface Road extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Road#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Main Road</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Road</em>' attribute.
	 * @see #setMainRoad(boolean)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_MainRoad()
	 * @model required="true"
	 * @generated
	 */
	boolean isMainRoad();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Road#isMainRoad <em>Main Road</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Road</em>' attribute.
	 * @see #isMainRoad()
	 * @generated
	 */
	void setMainRoad(boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.IncomingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Lane</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_IncomingLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<IncomingLane> getIncomingLane();

	/**
	 * Returns the value of the '<em><b>Outgoing Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.OutgoingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Lane</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_OutgoingLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<OutgoingLane> getOutgoingLane();

	/**
	 * Returns the value of the '<em><b>Pedestrian Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PedestrianLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedestrian Lane</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_PedestrianLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<PedestrianLane> getPedestrianLane();

	/**
	 * Returns the value of the '<em><b>Cycle Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.CycleLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Lane</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_CycleLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CycleLane> getCycleLane();

	/**
	 * Returns the value of the '<em><b>Public Transport Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Transport Lane</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getRoad_PublicTransportLane()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<PublicTransportLane> getPublicTransportLane();

} // Road
