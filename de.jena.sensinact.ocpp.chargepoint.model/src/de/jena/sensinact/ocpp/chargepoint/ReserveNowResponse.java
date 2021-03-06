/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve Now Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the ReserveNow.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowResponse()
 * @model extendedMetaData="name='ReserveNowResponse' kind='elementOnly'"
 * @generated
 */
public interface ReserveNowResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ReservationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(ReservationStatus)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getReserveNowResponse_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ReservationStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ReservationStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ReservationStatus value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ReservationStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ReserveNowResponse#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ReservationStatus)
	 * @generated
	 */
	boolean isSetStatus();

} // ReserveNowResponse
