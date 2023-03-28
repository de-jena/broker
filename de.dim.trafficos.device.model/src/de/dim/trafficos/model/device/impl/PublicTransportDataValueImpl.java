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
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.IdNameElement;
import de.dim.trafficos.model.device.PublicTransportDataValue;
import de.dim.trafficos.model.device.PublicTransportDataValueObject;
import de.dim.trafficos.model.device.PublicTransportDataValueType;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Transport Data Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl#getLineRef <em>Line Ref</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportDataValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicTransportDataValueImpl extends MinimalEObjectImpl.Container implements PublicTransportDataValue {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PublicTransportDataValueType TYPE_EDEFAULT = PublicTransportDataValueType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PublicTransportDataValueType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLineRef() <em>Line Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRef()
	 * @generated
	 * @ordered
	 */
	protected IdNameElement lineRef;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PublicTransportDataValueObject value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportDataValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_DATA_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportDataValueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PublicTransportDataValueType newType) {
		PublicTransportDataValueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdNameElement getLineRef() {
		if (lineRef != null && lineRef.eIsProxy()) {
			InternalEObject oldLineRef = (InternalEObject)lineRef;
			lineRef = (IdNameElement)eResolveProxy(oldLineRef);
			if (lineRef != oldLineRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF, oldLineRef, lineRef));
			}
		}
		return lineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdNameElement basicGetLineRef() {
		return lineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineRef(IdNameElement newLineRef) {
		IdNameElement oldLineRef = lineRef;
		lineRef = newLineRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF, oldLineRef, lineRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportDataValueObject getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(PublicTransportDataValueObject newValue, NotificationChain msgs) {
		PublicTransportDataValueObject oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(PublicTransportDataValueObject newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__TYPE:
				return getType();
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF:
				if (resolve) return getLineRef();
				return basicGetLineRef();
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE:
				return getValue();
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__TYPE:
				setType((PublicTransportDataValueType)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF:
				setLineRef((IdNameElement)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE:
				setValue((PublicTransportDataValueObject)newValue);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF:
				setLineRef((IdNameElement)null);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE:
				setValue((PublicTransportDataValueObject)null);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__TYPE:
				return type != TYPE_EDEFAULT;
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__LINE_REF:
				return lineRef != null;
			case TOSDevicePackage.PUBLIC_TRANSPORT_DATA_VALUE__VALUE:
				return value != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PublicTransportDataValueImpl
