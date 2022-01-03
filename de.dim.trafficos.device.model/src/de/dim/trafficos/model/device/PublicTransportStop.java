/**
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportStop#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportStop()
 * @model
 * @generated
 */
public interface PublicTransportStop extends EObject {
	/**
	 * Returns the value of the '<em><b>Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' containment reference.
	 * @see #setStation(PublicTransportStation)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportStop_Station()
	 * @model containment="true"
	 * @generated
	 */
	PublicTransportStation getStation();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportStop#getStation <em>Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' containment reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(PublicTransportStation value);

} // PublicTransportStop
