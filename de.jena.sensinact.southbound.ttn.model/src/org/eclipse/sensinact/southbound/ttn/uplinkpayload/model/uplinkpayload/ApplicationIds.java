/*
 */
package org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds#getApplicationId <em>Application Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getApplicationIds()
 * @model
 * @generated
 */
@ProviderType
public interface ApplicationIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(String)
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getApplicationIds_ApplicationId()
	 * @model extendedMetaData="name='application_id' kind='element'"
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Sets the value of the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.ApplicationIds#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(String value);

} // ApplicationIds
