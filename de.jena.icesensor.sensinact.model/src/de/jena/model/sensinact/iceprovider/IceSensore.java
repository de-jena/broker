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

import org.eclipse.sensinact.model.core.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ice Sensore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#isHas_beacon <em>Has beacon</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getH2sugm3 <em>H2sugm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getCougm3 <em>Cougm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getNougm3 <em>Nougm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getO3ugm3 <em>O3ugm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#get_1p <em>1p</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getAqi_criteria <em>Aqi criteria</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#get_10p <em>10p</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getPressure <em>Pressure</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getNo2ugm3 <em>No2ugm3</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#getAqi <em>Aqi</em>}</li>
 *   <li>{@link de.jena.model.sensinact.iceprovider.IceSensore#get_2_5p <em>25p</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore()
 * @model
 * @generated
 */
@ProviderType
public interface IceSensore extends Provider {
	/**
	 * Returns the value of the '<em><b>Has beacon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has beacon</em>' attribute.
	 * @see #setHas_beacon(boolean)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Has_beacon()
	 * @model required="true"
	 * @generated
	 */
	boolean isHas_beacon();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#isHas_beacon <em>Has beacon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has beacon</em>' attribute.
	 * @see #isHas_beacon()
	 * @generated
	 */
	void setHas_beacon(boolean value);

	/**
	 * Returns the value of the '<em><b>H2sugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2sugm3</em>' containment reference.
	 * @see #setH2sugm3(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_H2sugm3()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getH2sugm3();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getH2sugm3 <em>H2sugm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H2sugm3</em>' containment reference.
	 * @see #getH2sugm3()
	 * @generated
	 */
	void setH2sugm3(SensorData value);

	/**
	 * Returns the value of the '<em><b>Cougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cougm3</em>' containment reference.
	 * @see #setCougm3(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Cougm3()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getCougm3();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getCougm3 <em>Cougm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cougm3</em>' containment reference.
	 * @see #getCougm3()
	 * @generated
	 */
	void setCougm3(SensorData value);

	/**
	 * Returns the value of the '<em><b>Nougm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nougm3</em>' containment reference.
	 * @see #setNougm3(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Nougm3()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getNougm3();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getNougm3 <em>Nougm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nougm3</em>' containment reference.
	 * @see #getNougm3()
	 * @generated
	 */
	void setNougm3(SensorData value);

	/**
	 * Returns the value of the '<em><b>O3ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O3ugm3</em>' containment reference.
	 * @see #setO3ugm3(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_O3ugm3()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getO3ugm3();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getO3ugm3 <em>O3ugm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O3ugm3</em>' containment reference.
	 * @see #getO3ugm3()
	 * @generated
	 */
	void setO3ugm3(SensorData value);

	/**
	 * Returns the value of the '<em><b>1p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>1p</em>' containment reference.
	 * @see #set_1p(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore__1p()
	 * @model containment="true"
	 * @generated
	 */
	SensorData get_1p();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#get_1p <em>1p</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>1p</em>' containment reference.
	 * @see #get_1p()
	 * @generated
	 */
	void set_1p(SensorData value);

	/**
	 * Returns the value of the '<em><b>Aqi criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aqi criteria</em>' containment reference.
	 * @see #setAqi_criteria(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Aqi_criteria()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getAqi_criteria();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getAqi_criteria <em>Aqi criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aqi criteria</em>' containment reference.
	 * @see #getAqi_criteria()
	 * @generated
	 */
	void setAqi_criteria(SensorData value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Temperature()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getTemperature();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(SensorData value);

	/**
	 * Returns the value of the '<em><b>Humidity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidity</em>' containment reference.
	 * @see #setHumidity(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Humidity()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getHumidity();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getHumidity <em>Humidity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidity</em>' containment reference.
	 * @see #getHumidity()
	 * @generated
	 */
	void setHumidity(SensorData value);

	/**
	 * Returns the value of the '<em><b>10p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>10p</em>' containment reference.
	 * @see #set_10p(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore__10p()
	 * @model containment="true"
	 * @generated
	 */
	SensorData get_10p();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#get_10p <em>10p</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>10p</em>' containment reference.
	 * @see #get_10p()
	 * @generated
	 */
	void set_10p(SensorData value);

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure</em>' containment reference.
	 * @see #setPressure(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Pressure()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getPressure();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getPressure <em>Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' containment reference.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(SensorData value);

	/**
	 * Returns the value of the '<em><b>No2ugm3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No2ugm3</em>' containment reference.
	 * @see #setNo2ugm3(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_No2ugm3()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getNo2ugm3();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getNo2ugm3 <em>No2ugm3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No2ugm3</em>' containment reference.
	 * @see #getNo2ugm3()
	 * @generated
	 */
	void setNo2ugm3(SensorData value);

	/**
	 * Returns the value of the '<em><b>Aqi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aqi</em>' containment reference.
	 * @see #setAqi(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore_Aqi()
	 * @model containment="true"
	 * @generated
	 */
	SensorData getAqi();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#getAqi <em>Aqi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aqi</em>' containment reference.
	 * @see #getAqi()
	 * @generated
	 */
	void setAqi(SensorData value);

	/**
	 * Returns the value of the '<em><b>25p</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>25p</em>' containment reference.
	 * @see #set_2_5p(SensorData)
	 * @see de.jena.model.sensinact.iceprovider.IcesensoreSensinactPackage#getIceSensore__2_5p()
	 * @model containment="true"
	 * @generated
	 */
	SensorData get_2_5p();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.iceprovider.IceSensore#get_2_5p <em>25p</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>25p</em>' containment reference.
	 * @see #get_2_5p()
	 * @generated
	 */
	void set_2_5p(SensorData value);

} // IceSensore
