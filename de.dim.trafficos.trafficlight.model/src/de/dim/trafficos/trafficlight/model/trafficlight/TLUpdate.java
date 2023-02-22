/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate#getChangedStates <em>Changed States</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface TLUpdate extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(int)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLUpdate_Address()
	 * @model
	 * @generated
	 */
	int getAddress();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLUpdate_Timestamp()
	 * @model
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLUpdate#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Changed States</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.trafficlight.model.trafficlight.ChangedState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed States</em>' containment reference list.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLUpdate_ChangedStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangedState> getChangedStates();

} // TLUpdate
