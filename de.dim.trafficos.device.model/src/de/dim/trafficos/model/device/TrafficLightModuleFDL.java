/**
 */
package de.dim.trafficos.model.device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light Module FDL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightModuleFDL#getD <em>D</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleFDL()
 * @model
 * @generated
 */
public interface TrafficLightModuleFDL extends TrafficLightModuleLML {
	/**
	 * Returns the value of the '<em><b>D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' reference.
	 * @see #setD(TrafficLightSignalTransmitter)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightModuleFDL_D()
	 * @model
	 * @generated
	 */
	TrafficLightSignalTransmitter getD();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightModuleFDL#getD <em>D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' reference.
	 * @see #getD()
	 * @generated
	 */
	void setD(TrafficLightSignalTransmitter value);

} // TrafficLightModuleFDL
