/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changed State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState#getChannel <em>Channel</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState#getColor <em>Color</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState#isOn <em>On</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getChangedState()
 * @model
 * @generated
 */
@ProviderType
public interface ChangedState extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(String)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getChangedState_Channel()
	 * @model
	 * @generated
	 */
	String getChannel();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getChangedState_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(boolean)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getChangedState_On()
	 * @model
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

} // ChangedState
