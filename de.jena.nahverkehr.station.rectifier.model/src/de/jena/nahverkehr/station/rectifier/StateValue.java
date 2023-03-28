/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.StateValue#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getStateValue()
 * @model
 * @generated
 */
@ProviderType
public interface StateValue extends Value {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.nahverkehr.station.rectifier.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.jena.nahverkehr.station.rectifier.State
	 * @see #setState(State)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getStateValue_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.StateValue#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.jena.nahverkehr.station.rectifier.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // StateValue
