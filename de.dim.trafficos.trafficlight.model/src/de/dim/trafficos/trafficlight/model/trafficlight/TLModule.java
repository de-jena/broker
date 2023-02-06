/**
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getSignalTransmitter <em>Signal Transmitter</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLModule()
 * @model
 * @generated
 */
public interface TLModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(int)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLModule_Address()
	 * @model
	 * @generated
	 */
	int getAddress();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType
	 * @see #setType(TLModuleType)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLModule_Type()
	 * @model
	 * @generated
	 */
	TLModuleType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(TLModuleType value);

	/**
	 * Returns the value of the '<em><b>Signal Transmitter</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Transmitter</em>' containment reference list.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLModule_SignalTransmitter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TLSignalTransmitter> getSignalTransmitter();

} // TLModule
