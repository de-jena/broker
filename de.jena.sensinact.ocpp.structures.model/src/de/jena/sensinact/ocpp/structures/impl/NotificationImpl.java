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
package de.jena.sensinact.ocpp.structures.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.structures.Notification;
import de.jena.sensinact.ocpp.structures.OcppStructuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.structures.impl.NotificationImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.structures.impl.NotificationImpl#getSource_id <em>Source id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NotificationImpl extends MinimalEObjectImpl.Container implements Notification {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource_id() <em>Source id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource_id() <em>Source id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_id()
	 * @generated
	 * @ordered
	 */
	protected String source_id = SOURCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppStructuresPackage.Literals.NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Long newTimestamp) {
		Long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, OcppStructuresPackage.NOTIFICATION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource_id() {
		return source_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource_id(String newSource_id) {
		String oldSource_id = source_id;
		source_id = newSource_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, OcppStructuresPackage.NOTIFICATION__SOURCE_ID, oldSource_id, source_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppStructuresPackage.NOTIFICATION__TIMESTAMP:
				return getTimestamp();
			case OcppStructuresPackage.NOTIFICATION__SOURCE_ID:
				return getSource_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OcppStructuresPackage.NOTIFICATION__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case OcppStructuresPackage.NOTIFICATION__SOURCE_ID:
				setSource_id((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OcppStructuresPackage.NOTIFICATION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case OcppStructuresPackage.NOTIFICATION__SOURCE_ID:
				setSource_id(SOURCE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OcppStructuresPackage.NOTIFICATION__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case OcppStructuresPackage.NOTIFICATION__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? source_id != null : !SOURCE_ID_EDEFAULT.equals(source_id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", source_id: ");
		result.append(source_id);
		result.append(')');
		return result.toString();
	}

} //NotificationImpl
