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
 * A representation of the model object '<em><b>Traffic Light Module LML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getA <em>A</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getB <em>B</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getC <em>C</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleLML()
 * @model
 * @generated
 */
@ProviderType
public interface TrafficLightModuleLML extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(int)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleLML_Address()
	 * @model
	 * @generated
	 */
	int getAddress();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(int value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(TrafficLightSignalTransmitter)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleLML_A()
	 * @model
	 * @generated
	 */
	TrafficLightSignalTransmitter getA();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(TrafficLightSignalTransmitter value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(TrafficLightSignalTransmitter)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleLML_B()
	 * @model
	 * @generated
	 */
	TrafficLightSignalTransmitter getB();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(TrafficLightSignalTransmitter value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' reference.
	 * @see #setC(TrafficLightSignalTransmitter)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleLML_C()
	 * @model
	 * @generated
	 */
	TrafficLightSignalTransmitter getC();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightModuleLML#getC <em>C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(TrafficLightSignalTransmitter value);

} // TrafficLightModuleLML
