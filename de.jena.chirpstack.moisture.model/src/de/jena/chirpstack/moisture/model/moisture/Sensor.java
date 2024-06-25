/*
 */
package de.jena.chirpstack.moisture.model.moisture;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getBattery <em>Battery</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getIflag <em>Iflag</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getSflag <em>Sflag</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getMod <em>Mod</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getTemperatureDS18B20 <em>Temperature DS18B20</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSensor()
 * @model
 * @generated
 */
@ProviderType
public interface Sensor extends Service {
	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSensor_Battery()
	 * @model
	 * @generated
	 */
	double getBattery();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(double value);

	/**
	 * Returns the value of the '<em><b>Iflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iflag</em>' attribute.
	 * @see #setIflag(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSensor_Iflag()
	 * @model
	 * @generated
	 */
	double getIflag();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getIflag <em>Iflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iflag</em>' attribute.
	 * @see #getIflag()
	 * @generated
	 */
	void setIflag(double value);

	/**
	 * Returns the value of the '<em><b>Sflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sflag</em>' attribute.
	 * @see #setSflag(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSensor_Sflag()
	 * @model
	 * @generated
	 */
	double getSflag();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getSflag <em>Sflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sflag</em>' attribute.
	 * @see #getSflag()
	 * @generated
	 */
	void setSflag(double value);

	/**
	 * Returns the value of the '<em><b>Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod</em>' attribute.
	 * @see #setMod(double)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSensor_Mod()
	 * @model
	 * @generated
	 */
	double getMod();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getMod <em>Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod</em>' attribute.
	 * @see #getMod()
	 * @generated
	 */
	void setMod(double value);

	/**
	 * Returns the value of the '<em><b>Temperature DS18B20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature DS18B20</em>' attribute.
	 * @see #setTemperatureDS18B20(float)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getSensor_TemperatureDS18B20()
	 * @model
	 * @generated
	 */
	float getTemperatureDS18B20();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Sensor#getTemperatureDS18B20 <em>Temperature DS18B20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature DS18B20</em>' attribute.
	 * @see #getTemperatureDS18B20()
	 * @generated
	 */
	void setTemperatureDS18B20(float value);

} // Sensor
