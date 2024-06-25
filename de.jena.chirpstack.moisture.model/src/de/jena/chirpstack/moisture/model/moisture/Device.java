/*
 */
package de.jena.chirpstack.moisture.model.moisture;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getDevEUI <em>Dev EUI</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileId <em>Profile Id</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationName <em>Application Name</em>}</li>
 * </ul>
 *
 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice()
 * @model
 * @generated
 */
@ProviderType
public interface Device extends Service {
	/**
	 * Returns the value of the '<em><b>Dev EUI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev EUI</em>' attribute.
	 * @see #setDevEUI(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_DevEUI()
	 * @model
	 * @generated
	 */
	String getDevEUI();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getDevEUI <em>Dev EUI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev EUI</em>' attribute.
	 * @see #getDevEUI()
	 * @generated
	 */
	void setDevEUI(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Profile Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Id</em>' attribute.
	 * @see #setProfileId(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_ProfileId()
	 * @model
	 * @generated
	 */
	String getProfileId();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileId <em>Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Id</em>' attribute.
	 * @see #getProfileId()
	 * @generated
	 */
	void setProfileId(String value);

	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #setProfileName(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_ProfileName()
	 * @model
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see #setTenantId(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_TenantId()
	 * @model
	 * @generated
	 */
	String getTenantId();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantId <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' attribute.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Name</em>' attribute.
	 * @see #setTenantName(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_TenantName()
	 * @model
	 * @generated
	 */
	String getTenantName();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getTenantName <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Name</em>' attribute.
	 * @see #getTenantName()
	 * @generated
	 */
	void setTenantName(String value);

	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_ApplicationId()
	 * @model
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(String value);

	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage#getDevice_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link de.jena.chirpstack.moisture.model.moisture.Device#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

} // Device
