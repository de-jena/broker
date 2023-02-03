/**
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light Signal Transmitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isRed <em>Red</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isYellow <em>Yellow</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isGreen <em>Green</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter()
 * @model
 * @generated
 */
public interface TrafficLightSignalTransmitter extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' reference.
	 * @see #setSignalGroup(TrafficLightSignalGroup)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter_SignalGroup()
	 * @model
	 * @generated
	 */
	TrafficLightSignalGroup getSignalGroup();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#getSignalGroup <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group</em>' reference.
	 * @see #getSignalGroup()
	 * @generated
	 */
	void setSignalGroup(TrafficLightSignalGroup value);

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(boolean)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter_Red()
	 * @model
	 * @generated
	 */
	boolean isRed();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #isRed()
	 * @generated
	 */
	void setRed(boolean value);

	/**
	 * Returns the value of the '<em><b>Yellow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow</em>' attribute.
	 * @see #setYellow(boolean)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter_Yellow()
	 * @model
	 * @generated
	 */
	boolean isYellow();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isYellow <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow</em>' attribute.
	 * @see #isYellow()
	 * @generated
	 */
	void setYellow(boolean value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(boolean)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter_Green()
	 * @model
	 * @generated
	 */
	boolean isGreen();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #isGreen()
	 * @generated
	 */
	void setGreen(boolean value);

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' attribute.
	 * @see #setSwitch(boolean)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTrafficLightSignalTransmitter_Switch()
	 * @model
	 * @generated
	 */
	boolean isSwitch();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TrafficLightSignalTransmitter#isSwitch <em>Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' attribute.
	 * @see #isSwitch()
	 * @generated
	 */
	void setSwitch(boolean value);

} // TrafficLightSignalTransmitter
