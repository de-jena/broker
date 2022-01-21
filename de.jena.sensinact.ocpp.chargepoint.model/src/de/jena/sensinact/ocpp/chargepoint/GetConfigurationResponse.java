/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Configuration Response</b></em>'.
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
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse#getConfigurationKey <em>Configuration Key</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetConfigurationResponse#getUnknownKey <em>Unknown Key</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetConfigurationResponse()
 * @model extendedMetaData="name='GetConfigurationResponse' kind='elementOnly'"
 * @generated
 */
public interface GetConfigurationResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Key</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.sensinact.ocpp.chargepoint.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Key</em>' containment reference list.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetConfigurationResponse_ConfigurationKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurationKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyValue> getConfigurationKey();

	/**
	 * Returns the value of the '<em><b>Unknown Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Key</em>' attribute list.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetConfigurationResponse_UnknownKey()
	 * @model unique="false" dataType="de.jena.sensinact.ocpp.chargepoint.CiString50Type"
	 *        extendedMetaData="kind='element' name='unknownKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUnknownKey();

} // GetConfigurationResponse
