/*
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportConfiguration#getPublicTransport <em>Public Transport</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface PublicTransportConfiguration extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Public Transport</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Transport</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportConfiguration_PublicTransport()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportLine> getPublicTransport();

} // PublicTransportConfiguration
