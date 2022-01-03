/**
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Transport Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.PublicTransportProgram#getDataEntry <em>Data Entry</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportProgram()
 * @model
 * @generated
 */
public interface PublicTransportProgram extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Data Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.PublicTransportDataEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Entry</em>' containment reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportProgram_DataEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicTransportDataEntry> getDataEntry();

} // PublicTransportProgram
