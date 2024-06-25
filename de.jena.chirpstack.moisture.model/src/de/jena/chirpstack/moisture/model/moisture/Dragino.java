/*
 */
package de.jena.chirpstack.moisture.model.moisture;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dragino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSoil <em>Soil</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDragino()
 * @model annotation="model name='Dragino_LSE01'"
 * @generated
 */
@ProviderType
public interface Dragino extends Provider {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(Sensor)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDragino_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Soil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil</em>' containment reference.
	 * @see #setSoil(Soil)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDragino_Soil()
	 * @model containment="true"
	 * @generated
	 */
	Soil getSoil();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getSoil <em>Soil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil</em>' containment reference.
	 * @see #getSoil()
	 * @generated
	 */
	void setSoil(Soil value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDragino_Device()
	 * @model containment="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Dragino#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

} // Dragino
