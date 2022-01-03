/**
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grouping devices, but also inheriting from device to make all meta information also available
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.DeviceGroup#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceGroup()
 * @model
 * @generated
 */
public interface DeviceGroup extends Device {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.model.device.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference list.
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDeviceGroup_Device()
	 * @model keys="id"
	 * @generated
	 */
	EList<Device> getDevice();

} // DeviceGroup
