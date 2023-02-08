/*
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Data Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportDataEntry#getDataValue <em>Data Value</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataEntry()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportDataEntry extends AbstractDataEntry {
	/**
	 * Returns the value of the '<em><b>Data Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportDataValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Value</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataEntry_DataValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportDataValue> getDataValue();

} // PublicTransportDataEntry
