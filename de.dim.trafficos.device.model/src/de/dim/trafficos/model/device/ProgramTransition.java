/**
 */
package de.dim.trafficos.model.device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.ProgramTransition#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getProgramTransition()
 * @model
 * @generated
 */
public interface ProgramTransition extends ProgramEntry {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getProgramTransition_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.ProgramTransition#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // ProgramTransition
