/**
 */
package de.jena.sensinact.ocpp.structures;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.structures.Notification#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.structures.Notification#getSource_id <em>Source id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getNotification()
 * @model abstract="true"
 * @generated
 */
public interface Notification extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Long)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getNotification_Timestamp()
	 * @model
	 * @generated
	 */
	Long getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.Notification#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Long value);

	/**
	 * Returns the value of the '<em><b>Source id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source id</em>' attribute.
	 * @see #setSource_id(String)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getNotification_Source_id()
	 * @model
	 * @generated
	 */
	String getSource_id();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.Notification#getSource_id <em>Source id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source id</em>' attribute.
	 * @see #getSource_id()
	 * @generated
	 */
	void setSource_id(String value);

} // Notification
