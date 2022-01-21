/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Availability Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the ChangeAvailability.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChangeAvailabilityRequest()
 * @model extendedMetaData="name='ChangeAvailabilityRequest' kind='elementOnly'"
 * @generated
 */
public interface ChangeAvailabilityRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChangeAvailabilityRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getConnectorId <em>Connector Id</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector Id</em>' attribute is set.
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	boolean isSetConnectorId();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.AvailabilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(AvailabilityType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChangeAvailabilityRequest_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	AvailabilityType getType();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.AvailabilityType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(AvailabilityType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(AvailabilityType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChangeAvailabilityRequest#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(AvailabilityType)
	 * @generated
	 */
	boolean isSetType();

} // ChangeAvailabilityRequest
