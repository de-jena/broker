/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isBlinking <em>Blinking</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#getValue <em>Value</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isOn <em>On</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getLightSignal()
 * @model
 * @generated
 */
@ProviderType
public interface LightSignal extends EObject {
	/**
	 * Returns the value of the '<em><b>Blinking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blinking</em>' attribute.
	 * @see #setBlinking(boolean)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getLightSignal_Blinking()
	 * @model
	 * @generated
	 */
	boolean isBlinking();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isBlinking <em>Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blinking</em>' attribute.
	 * @see #isBlinking()
	 * @generated
	 */
	void setBlinking(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType
	 * @see #setValue(SignalValueType)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getLightSignal_Value()
	 * @model
	 * @generated
	 */
	SignalValueType getValue();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.SignalValueType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SignalValueType value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(boolean)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getLightSignal_On()
	 * @model
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

} // LightSignal
