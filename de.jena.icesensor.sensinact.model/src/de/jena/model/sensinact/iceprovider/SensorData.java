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
package de.jena.model.sensinact.iceprovider;

import java.util.Date;

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
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getSensor_type <em>Sensor type</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getGateway <em>Gateway</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getSensor_model <em>Sensor model</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getAvg <em>Avg</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getMin <em>Min</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getMax <em>Max</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getValidity <em>Validity</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.SensorData#getStr_data <em>Str data</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData()
 * @model
 * @generated
 */
@ProviderType
public interface SensorData extends Service {
	/**
	 * Returns the value of the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor type</em>' attribute.
	 * @see #setSensor_type(String)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Sensor_type()
	 * @model
	 * @generated
	 */
	String getSensor_type();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getSensor_type <em>Sensor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor type</em>' attribute.
	 * @see #getSensor_type()
	 * @generated
	 */
	void setSensor_type(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Gateway()
	 * @model required="true"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Sensor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor model</em>' attribute.
	 * @see #setSensor_model(String)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Sensor_model()
	 * @model
	 * @generated
	 */
	String getSensor_model();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getSensor_model <em>Sensor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor model</em>' attribute.
	 * @see #getSensor_model()
	 * @generated
	 */
	void setSensor_model(String value);

	/**
	 * Returns the value of the '<em><b>Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg</em>' attribute.
	 * @see #setAvg(double)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Avg()
	 * @model required="true"
	 * @generated
	 */
	double getAvg();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getAvg <em>Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg</em>' attribute.
	 * @see #getAvg()
	 * @generated
	 */
	void setAvg(double value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Min()
	 * @model required="true"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Max()
	 * @model required="true"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(int)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Validity()
	 * @model default="-1"
	 * @generated
	 */
	int getValidity();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(int value);

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(Date)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Created_at()
	 * @model
	 * @generated
	 */
	Date getCreated_at();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(Date value);

	/**
	 * Returns the value of the '<em><b>Str data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str data</em>' attribute.
	 * @see #setStr_data(String)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getSensorData_Str_data()
	 * @model
	 * @generated
	 */
	String getStr_data();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.SensorData#getStr_data <em>Str data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str data</em>' attribute.
	 * @see #getStr_data()
	 * @generated
	 */
	void setStr_data(String value);

} // SensorData
