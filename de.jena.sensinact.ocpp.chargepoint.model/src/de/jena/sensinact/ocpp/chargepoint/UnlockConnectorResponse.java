/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlock Connector Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the UnlockConnector.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUnlockConnectorResponse()
 * @model extendedMetaData="name='UnlockConnectorResponse' kind='elementOnly'"
 * @generated
 */
public interface UnlockConnectorResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.UnlockStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(UnlockStatus)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getUnlockConnectorResponse_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlockStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.UnlockStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(UnlockStatus value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(UnlockStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.UnlockConnectorResponse#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(UnlockStatus)
	 * @generated
	 */
	boolean isSetStatus();

} // UnlockConnectorResponse
