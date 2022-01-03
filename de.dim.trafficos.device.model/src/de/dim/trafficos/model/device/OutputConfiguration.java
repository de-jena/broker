/**
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.OutputConfiguration#getOutput <em>Output</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.OutputConfiguration#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutputConfiguration()
 * @model
 * @generated
 */
public interface OutputConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutputConfiguration_Output()
	 * @model required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.OutputConfiguration#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.OutPinConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getOutputConfiguration_Pin()
	 * @model containment="true" lower="2" upper="3"
	 * @generated
	 */
	EList<OutPinConfiguration> getPin();

} // OutputConfiguration
