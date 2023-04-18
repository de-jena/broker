/*
 */
package de.dim.trafficos.common.model.common;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.common.model.common.AddressLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.AddressLocation#getStreet <em>Street</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.AddressLocation#getZip <em>Zip</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.AddressLocation#getDistrict <em>District</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAddressLocation()
 * @model
 * @generated
 */
@ProviderType
public interface AddressLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAddressLocation_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AddressLocation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAddressLocation_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AddressLocation#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(String)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAddressLocation_Zip()
	 * @model
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AddressLocation#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Returns the value of the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>District</em>' attribute.
	 * @see #setDistrict(String)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAddressLocation_District()
	 * @model
	 * @generated
	 */
	String getDistrict();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AddressLocation#getDistrict <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' attribute.
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(String value);

} // AddressLocation
