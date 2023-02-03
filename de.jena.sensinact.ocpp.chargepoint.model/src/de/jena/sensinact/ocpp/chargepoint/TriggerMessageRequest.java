/*
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Message Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the TriggerMessage.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getRequestedMessage <em>Requested Message</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getConnectorId <em>Connector Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getTriggerMessageRequest()
 * @model extendedMetaData="name='TriggerMessageRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TriggerMessageRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Requested Message</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.MessageTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Message</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
	 * @see #isSetRequestedMessage()
	 * @see #unsetRequestedMessage()
	 * @see #setRequestedMessage(MessageTrigger)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getTriggerMessageRequest_RequestedMessage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='requestedMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageTrigger getRequestedMessage();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getRequestedMessage <em>Requested Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Message</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.MessageTrigger
	 * @see #isSetRequestedMessage()
	 * @see #unsetRequestedMessage()
	 * @see #getRequestedMessage()
	 * @generated
	 */
	void setRequestedMessage(MessageTrigger value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getRequestedMessage <em>Requested Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedMessage()
	 * @see #getRequestedMessage()
	 * @see #setRequestedMessage(MessageTrigger)
	 * @generated
	 */
	void unsetRequestedMessage();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getRequestedMessage <em>Requested Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Message</em>' attribute is set.
	 * @see #unsetRequestedMessage()
	 * @see #getRequestedMessage()
	 * @see #setRequestedMessage(MessageTrigger)
	 * @generated
	 */
	boolean isSetRequestedMessage();

	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getTriggerMessageRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector Id</em>' attribute is set.
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	boolean isSetConnectorId();

} // TriggerMessageRequest
