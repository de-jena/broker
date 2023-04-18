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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light Module FDL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightModuleFDL#getD <em>D</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleFDL()
 * @model
 * @generated
 */
@ProviderType
public interface TrafficLightModuleFDL extends TrafficLightModuleLML {
	/**
	 * Returns the value of the '<em><b>D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' reference.
	 * @see #setD(TrafficLightSignalTransmitter)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleFDL_D()
	 * @model
	 * @generated
	 */
	TrafficLightSignalTransmitter getD();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightModuleFDL#getD <em>D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' reference.
	 * @see #getD()
	 * @generated
	 */
	void setD(TrafficLightSignalTransmitter value);

} // TrafficLightModuleFDL
