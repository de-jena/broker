/**
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import de.dim.trafficos.common.model.common.Output;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Signal Transmitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getLightSignal <em>Light Signal</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLSignalTransmitter()
 * @model
 * @generated
 */
public interface TLSignalTransmitter extends Output {
	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' reference.
	 * @see #setSignalGroup(TLSignalGroup)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLSignalTransmitter_SignalGroup()
	 * @model
	 * @generated
	 */
	TLSignalGroup getSignalGroup();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter#getSignalGroup <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group</em>' reference.
	 * @see #getSignalGroup()
	 * @generated
	 */
	void setSignalGroup(TLSignalGroup value);

	/**
	 * Returns the value of the '<em><b>Light Signal</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Signal</em>' containment reference list.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLSignalTransmitter_LightSignal()
	 * @model containment="true"
	 * @generated
	 */
	EList<LightSignal> getLightSignal();

} // TLSignalTransmitter
