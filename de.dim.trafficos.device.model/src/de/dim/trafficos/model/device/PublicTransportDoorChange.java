/*
 */
package de.dim.trafficos.model.device;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Door Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportDoorChange#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDoorChange()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportDoorChange extends PublicTransportPosition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.model.device.PublicTransportDoorChangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChangeType
	 * @see #setType(PublicTransportDoorChangeType)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDoorChange_Type()
	 * @model
	 * @generated
	 */
	PublicTransportDoorChangeType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.PublicTransportDoorChange#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.model.device.PublicTransportDoorChangeType
	 * @see #getType()
	 * @generated
	 */
	void setType(PublicTransportDoorChangeType value);

} // PublicTransportDoorChange
