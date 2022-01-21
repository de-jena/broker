/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heartbeat Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the Heartbeat.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse#getCurrentTime <em>Current Time</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getHeartbeatResponse()
 * @model extendedMetaData="name='HeartbeatResponse' kind='elementOnly'"
 * @generated
 */
public interface HeartbeatResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getHeartbeatResponse_CurrentTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='currentTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCurrentTime();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse#getCurrentTime <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */
	void setCurrentTime(XMLGregorianCalendar value);

} // HeartbeatResponse
