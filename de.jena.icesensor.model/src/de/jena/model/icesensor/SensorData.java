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
package de.jena.model.icesensor;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.jena.model.icesensor.SensorData#getSensor_type <em>Sensor type</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getGateway <em>Gateway</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getSensor_model <em>Sensor model</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getAvg <em>Avg</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getMin <em>Min</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getMax <em>Max</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getValidity <em>Validity</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link de.jena.model.icesensor.SensorData#getStr_data <em>Str data</em>}</li>
 * </ul>
 *
 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData()
 * @model
 * @generated
 */
@ProviderType
public interface SensorData extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor type</em>' attribute.
	 * @see #isSetSensor_type()
	 * @see #unsetSensor_type()
	 * @see #setSensor_type(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Sensor_type()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSensor_type();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getSensor_type <em>Sensor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor type</em>' attribute.
	 * @see #isSetSensor_type()
	 * @see #unsetSensor_type()
	 * @see #getSensor_type()
	 * @generated
	 */
	void setSensor_type(String value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getSensor_type <em>Sensor type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensor_type()
	 * @see #getSensor_type()
	 * @see #setSensor_type(String)
	 * @generated
	 */
	void unsetSensor_type();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getSensor_type <em>Sensor type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sensor type</em>' attribute is set.
	 * @see #unsetSensor_type()
	 * @see #getSensor_type()
	 * @see #setSensor_type(String)
	 * @generated
	 */
	boolean isSetSensor_type();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #isSetGateway()
	 * @see #unsetGateway()
	 * @see #setGateway(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Gateway()
	 * @model unsettable="true"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #isSetGateway()
	 * @see #unsetGateway()
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGateway()
	 * @see #getGateway()
	 * @see #setGateway(String)
	 * @generated
	 */
	void unsetGateway();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getGateway <em>Gateway</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gateway</em>' attribute is set.
	 * @see #unsetGateway()
	 * @see #getGateway()
	 * @see #setGateway(String)
	 * @generated
	 */
	boolean isSetGateway();

	/**
	 * Returns the value of the '<em><b>Sensor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor model</em>' attribute.
	 * @see #isSetSensor_model()
	 * @see #unsetSensor_model()
	 * @see #setSensor_model(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Sensor_model()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSensor_model();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getSensor_model <em>Sensor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor model</em>' attribute.
	 * @see #isSetSensor_model()
	 * @see #unsetSensor_model()
	 * @see #getSensor_model()
	 * @generated
	 */
	void setSensor_model(String value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getSensor_model <em>Sensor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensor_model()
	 * @see #getSensor_model()
	 * @see #setSensor_model(String)
	 * @generated
	 */
	void unsetSensor_model();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getSensor_model <em>Sensor model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sensor model</em>' attribute is set.
	 * @see #unsetSensor_model()
	 * @see #getSensor_model()
	 * @see #setSensor_model(String)
	 * @generated
	 */
	boolean isSetSensor_model();

	/**
	 * Returns the value of the '<em><b>Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg</em>' attribute.
	 * @see #setAvg(double)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Avg()
	 * @model required="true"
	 * @generated
	 */
	double getAvg();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getAvg <em>Avg</em>}' attribute.
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
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Min()
	 * @model required="true"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getMin <em>Min</em>}' attribute.
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
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Max()
	 * @model required="true"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getMax <em>Max</em>}' attribute.
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
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Unit()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(String)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(String)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #isSetValidity()
	 * @see #unsetValidity()
	 * @see #setValidity(int)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Validity()
	 * @model default="0" unsettable="true"
	 * @generated
	 */
	int getValidity();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #isSetValidity()
	 * @see #unsetValidity()
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(int value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidity()
	 * @see #getValidity()
	 * @see #setValidity(int)
	 * @generated
	 */
	void unsetValidity();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getValidity <em>Validity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validity</em>' attribute is set.
	 * @see #unsetValidity()
	 * @see #getValidity()
	 * @see #setValidity(int)
	 * @generated
	 */
	boolean isSetValidity();

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #isSetCreated_at()
	 * @see #unsetCreated_at()
	 * @see #setCreated_at(Date)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Created_at()
	 * @model unsettable="true"
	 * @generated
	 */
	Date getCreated_at();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #isSetCreated_at()
	 * @see #unsetCreated_at()
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(Date value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreated_at()
	 * @see #getCreated_at()
	 * @see #setCreated_at(Date)
	 * @generated
	 */
	void unsetCreated_at();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getCreated_at <em>Created at</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Created at</em>' attribute is set.
	 * @see #unsetCreated_at()
	 * @see #getCreated_at()
	 * @see #setCreated_at(Date)
	 * @generated
	 */
	boolean isSetCreated_at();

	/**
	 * Returns the value of the '<em><b>Str data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str data</em>' attribute.
	 * @see #isSetStr_data()
	 * @see #unsetStr_data()
	 * @see #setStr_data(String)
	 * @see de.jena.model.icesensor.IcesensorPackage#getSensorData_Str_data()
	 * @model unsettable="true"
	 * @generated
	 */
	String getStr_data();

	/**
	 * Sets the value of the '{@link de.jena.model.icesensor.SensorData#getStr_data <em>Str data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str data</em>' attribute.
	 * @see #isSetStr_data()
	 * @see #unsetStr_data()
	 * @see #getStr_data()
	 * @generated
	 */
	void setStr_data(String value);

	/**
	 * Unsets the value of the '{@link de.jena.model.icesensor.SensorData#getStr_data <em>Str data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStr_data()
	 * @see #getStr_data()
	 * @see #setStr_data(String)
	 * @generated
	 */
	void unsetStr_data();

	/**
	 * Returns whether the value of the '{@link de.jena.model.icesensor.SensorData#getStr_data <em>Str data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Str data</em>' attribute is set.
	 * @see #unsetStr_data()
	 * @see #getStr_data()
	 * @see #setStr_data(String)
	 * @generated
	 */
	boolean isSetStr_data();

} // SensorData
