/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Stop Transaction Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the RemoteStopTransaction.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getRemoteStopTransactionRequest()
 * @model extendedMetaData="name='RemoteStopTransactionRequest' kind='elementOnly'"
 * @generated
 */
public interface RemoteStopTransactionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #setTransactionId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getRemoteStopTransactionRequest_TransactionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='transactionId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTransactionId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	void unsetTransactionId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.RemoteStopTransactionRequest#getTransactionId <em>Transaction Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Id</em>' attribute is set.
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	boolean isSetTransactionId();

} // RemoteStopTransactionRequest
