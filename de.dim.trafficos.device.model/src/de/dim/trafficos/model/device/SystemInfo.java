/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.dim.trafficos.model.device;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Usually information about the real system out in the field
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.SystemInfo#getHardwareType <em>Hardware Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.SystemInfo#getHardwareRev <em>Hardware Rev</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.SystemInfo#getOsType <em>Os Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.SystemInfo#getOsRev <em>Os Rev</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.SystemInfo#getSoftwareType <em>Software Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.SystemInfo#getSoftwareRev <em>Software Rev</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo()
 * @model
 * @generated
 */
@ProviderType
public interface SystemInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Type</em>' attribute.
	 * @see #setHardwareType(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo_HardwareType()
	 * @model
	 * @generated
	 */
	String getHardwareType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.SystemInfo#getHardwareType <em>Hardware Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Type</em>' attribute.
	 * @see #getHardwareType()
	 * @generated
	 */
	void setHardwareType(String value);

	/**
	 * Returns the value of the '<em><b>Hardware Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Rev</em>' attribute.
	 * @see #setHardwareRev(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo_HardwareRev()
	 * @model
	 * @generated
	 */
	String getHardwareRev();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.SystemInfo#getHardwareRev <em>Hardware Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Rev</em>' attribute.
	 * @see #getHardwareRev()
	 * @generated
	 */
	void setHardwareRev(String value);

	/**
	 * Returns the value of the '<em><b>Os Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Type</em>' attribute.
	 * @see #setOsType(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo_OsType()
	 * @model
	 * @generated
	 */
	String getOsType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.SystemInfo#getOsType <em>Os Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Type</em>' attribute.
	 * @see #getOsType()
	 * @generated
	 */
	void setOsType(String value);

	/**
	 * Returns the value of the '<em><b>Os Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Rev</em>' attribute.
	 * @see #setOsRev(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo_OsRev()
	 * @model
	 * @generated
	 */
	String getOsRev();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.SystemInfo#getOsRev <em>Os Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Rev</em>' attribute.
	 * @see #getOsRev()
	 * @generated
	 */
	void setOsRev(String value);

	/**
	 * Returns the value of the '<em><b>Software Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Type</em>' attribute.
	 * @see #setSoftwareType(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo_SoftwareType()
	 * @model
	 * @generated
	 */
	String getSoftwareType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.SystemInfo#getSoftwareType <em>Software Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Type</em>' attribute.
	 * @see #getSoftwareType()
	 * @generated
	 */
	void setSoftwareType(String value);

	/**
	 * Returns the value of the '<em><b>Software Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Rev</em>' attribute.
	 * @see #setSoftwareRev(String)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getSystemInfo_SoftwareRev()
	 * @model
	 * @generated
	 */
	String getSoftwareRev();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.SystemInfo#getSoftwareRev <em>Software Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Rev</em>' attribute.
	 * @see #getSoftwareRev()
	 * @generated
	 */
	void setSoftwareRev(String value);

} // SystemInfo
