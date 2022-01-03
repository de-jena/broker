/**
 */
package de.dim.trafficos.model.device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportPosition#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportPosition()
 * @model
 * @generated
 */
public interface PublicTransportPosition extends PublicTransportDataValueObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportPosition_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportPosition#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // PublicTransportPosition
