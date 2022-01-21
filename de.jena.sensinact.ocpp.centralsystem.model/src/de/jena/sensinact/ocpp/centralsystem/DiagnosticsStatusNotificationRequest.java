/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostics Status Notification Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the DiagnosticsStatusNotification.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDiagnosticsStatusNotificationRequest()
 * @model extendedMetaData="name='DiagnosticsStatusNotificationRequest' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticsStatusNotificationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDiagnosticsStatusNotificationRequest_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Object value);

} // DiagnosticsStatusNotificationRequest
