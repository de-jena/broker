/*
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Configuration Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the GetConfiguration.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationRequest#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetConfigurationRequest()
 * @model extendedMetaData="name='GetConfigurationRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetConfigurationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute list.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetConfigurationRequest_Key()
	 * @model unique="false" dataType="de.jena.sensinact.ocpp.chargepoint.CiString50Type"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getKey();

} // GetConfigurationRequest
