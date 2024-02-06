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
package de.jena.model.sensinact.ttnprovider;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SensorData#getRawPayload <em>Raw Payload</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SensorData#getGateway <em>Gateway</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ttnprovider.SensorData#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSensorData()
 * @model
 * @generated
 */
@ProviderType
public interface SensorData extends Service {
	/**
	 * Returns the value of the '<em><b>Raw Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Payload</em>' attribute.
	 * @see #setRawPayload(String)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSensorData_RawPayload()
	 * @model
	 * @generated
	 */
	String getRawPayload();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SensorData#getRawPayload <em>Raw Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Payload</em>' attribute.
	 * @see #getRawPayload()
	 * @generated
	 */
	void setRawPayload(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSensorData_Gateway()
	 * @model required="true"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ttnprovider.SensorData#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' map.
	 * @see de.jena.model.sensinact.ttnprovider.TtnSensorSensinactPackage#getSensorData_Payload()
	 * @model mapType="de.jena.model.sensinact.ttnprovider.StringToObjectMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	EMap<String, Object> getPayload();

} // SensorData
