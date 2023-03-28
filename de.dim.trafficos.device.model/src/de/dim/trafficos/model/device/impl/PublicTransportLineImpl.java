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

import de.dim.trafficos.model.device.PublicTransportLine;
import de.dim.trafficos.model.device.PublicTransportTimeTable;
import de.dim.trafficos.model.device.PublicTransportType;
import de.dim.trafficos.model.device.TOSDevicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Transport Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLineImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLineImpl#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.PublicTransportLineImpl#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicTransportLineImpl extends IdNameElementImpl implements PublicTransportLine {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PublicTransportType TYPE_EDEFAULT = PublicTransportType.TRAM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PublicTransportType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeTable() <em>Time Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTable()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicTransportTimeTable> timeTable;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected String lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicTransportLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.PUBLIC_TRANSPORT_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicTransportType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PublicTransportType newType) {
		PublicTransportType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicTransportTimeTable> getTimeTable() {
		if (timeTable == null) {
			timeTable = new EObjectContainmentEList<PublicTransportTimeTable>(PublicTransportTimeTable.class, this, TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TIME_TABLE);
		}
		return timeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineNumber(String newLineNumber) {
		String oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.PUBLIC_TRANSPORT_LINE__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TIME_TABLE:
				return ((InternalEList<?>)getTimeTable()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TYPE:
				return getType();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TIME_TABLE:
				return getTimeTable();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__LINE_NUMBER:
				return getLineNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TYPE:
				setType((PublicTransportType)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TIME_TABLE:
				getTimeTable().clear();
				getTimeTable().addAll((Collection<? extends PublicTransportTimeTable>)newValue);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__LINE_NUMBER:
				setLineNumber((String)newValue);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TIME_TABLE:
				getTimeTable().clear();
				return;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
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
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TYPE:
				return type != TYPE_EDEFAULT;
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__TIME_TABLE:
				return timeTable != null && !timeTable.isEmpty();
			case TOSDevicePackage.PUBLIC_TRANSPORT_LINE__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? lineNumber != null : !LINE_NUMBER_EDEFAULT.equals(lineNumber);
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
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(')');
		return result.toString();
	}

} //PublicTransportLineImpl
