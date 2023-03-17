/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.VersionIds#getBrandId <em>Brand Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.VersionIds#getModelId <em>Model Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.VersionIds#getHardwareVersion <em>Hardware Version</em>}</li>
 *   <li>{@link de.jena.model.ttn.VersionIds#getFirmwareVersion <em>Firmware Version</em>}</li>
 *   <li>{@link de.jena.model.ttn.VersionIds#getBandId <em>Band Id</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getVersionIds()
 * @model
 * @generated
 */
@ProviderType
public interface VersionIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Brand Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand Id</em>' attribute.
	 * @see #setBrandId(String)
	 * @see de.jena.model.ttn.TTNPackage#getVersionIds_BrandId()
	 * @model extendedMetaData="name='brand_id' kind='element'"
	 * @generated
	 */
	String getBrandId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.VersionIds#getBrandId <em>Brand Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand Id</em>' attribute.
	 * @see #getBrandId()
	 * @generated
	 */
	void setBrandId(String value);

	/**
	 * Returns the value of the '<em><b>Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Id</em>' attribute.
	 * @see #setModelId(String)
	 * @see de.jena.model.ttn.TTNPackage#getVersionIds_ModelId()
	 * @model extendedMetaData="name='model_id' kind='element'"
	 * @generated
	 */
	String getModelId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.VersionIds#getModelId <em>Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Id</em>' attribute.
	 * @see #getModelId()
	 * @generated
	 */
	void setModelId(String value);

	/**
	 * Returns the value of the '<em><b>Hardware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Version</em>' attribute.
	 * @see #setHardwareVersion(String)
	 * @see de.jena.model.ttn.TTNPackage#getVersionIds_HardwareVersion()
	 * @model extendedMetaData="name='hardware_version' kind='element'"
	 * @generated
	 */
	String getHardwareVersion();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.VersionIds#getHardwareVersion <em>Hardware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Version</em>' attribute.
	 * @see #getHardwareVersion()
	 * @generated
	 */
	void setHardwareVersion(String value);

	/**
	 * Returns the value of the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware Version</em>' attribute.
	 * @see #setFirmwareVersion(String)
	 * @see de.jena.model.ttn.TTNPackage#getVersionIds_FirmwareVersion()
	 * @model extendedMetaData="name='firmware_version' kind='element'"
	 * @generated
	 */
	String getFirmwareVersion();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.VersionIds#getFirmwareVersion <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware Version</em>' attribute.
	 * @see #getFirmwareVersion()
	 * @generated
	 */
	void setFirmwareVersion(String value);

	/**
	 * Returns the value of the '<em><b>Band Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Id</em>' attribute.
	 * @see #setBandId(String)
	 * @see de.jena.model.ttn.TTNPackage#getVersionIds_BandId()
	 * @model extendedMetaData="name='band_id' kind='element'"
	 * @generated
	 */
	String getBandId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.VersionIds#getBandId <em>Band Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band Id</em>' attribute.
	 * @see #getBandId()
	 * @generated
	 */
	void setBandId(String value);

} // VersionIds
