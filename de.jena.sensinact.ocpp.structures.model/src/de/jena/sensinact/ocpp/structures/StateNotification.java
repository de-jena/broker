/**
 */
package de.jena.sensinact.ocpp.structures;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.structures.StateNotification#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getStateNotification()
 * @model
 * @generated
 */
public interface StateNotification extends Notification {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.structures.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.jena.sensinact.ocpp.structures.State
	 * @see #setState(State)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getStateNotification_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.StateNotification#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.jena.sensinact.ocpp.structures.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // StateNotification
