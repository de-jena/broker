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
package de.jena.sensinact.ocpp.structures;

import org.eclipse.emf.ecore.EFactory;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage
 * @generated
 */
@ProviderType
public interface OcppStructuresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppStructuresFactory eINSTANCE = de.jena.sensinact.ocpp.structures.impl.OcppStructuresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Measurement Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Notification</em>'.
	 * @generated
	 */
	MeasurementNotification createMeasurementNotification();

	/**
	 * Returns a new object of class '<em>State Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Notification</em>'.
	 * @generated
	 */
	StateNotification createStateNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OcppStructuresPackage getOcppStructuresPackage();

} //OcppStructuresFactory
