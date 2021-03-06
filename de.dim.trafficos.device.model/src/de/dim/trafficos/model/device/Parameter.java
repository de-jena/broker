/**
 */
package de.dim.trafficos.model.device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.Parameter#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.ParameterDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.ParameterDataType
	 * @see #setDataType(ParameterDataType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getParameter_DataType()
	 * @model
	 * @generated
	 */
	ParameterDataType getDataType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.Parameter#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.ParameterDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ParameterDataType value);

} // Parameter
