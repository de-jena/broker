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
package de.jena.sensinact.ocpp.chargepoint.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus;
import de.jena.sensinact.ocpp.chargepoint.IdTagInfo;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Tag Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.IdTagInfoImpl#getParentIdTag <em>Parent Id Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdTagInfoImpl extends MinimalEObjectImpl.Container implements IdTagInfo {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AuthorizationStatus STATUS_EDEFAULT = AuthorizationStatus.ACCEPTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationStatus status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentIdTag() <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentIdTag()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_ID_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentIdTag() <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentIdTag()
	 * @generated
	 * @ordered
	 */
	protected String parentIdTag = PARENT_ID_TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdTagInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.ID_TAG_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(AuthorizationStatus newStatus) {
		AuthorizationStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.ID_TAG_INFO__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStatus() {
		AuthorizationStatus oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.ID_TAG_INFO__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiryDate(XMLGregorianCalendar newExpiryDate) {
		XMLGregorianCalendar oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.ID_TAG_INFO__EXPIRY_DATE, oldExpiryDate, expiryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentIdTag() {
		return parentIdTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentIdTag(String newParentIdTag) {
		String oldParentIdTag = parentIdTag;
		parentIdTag = newParentIdTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.ID_TAG_INFO__PARENT_ID_TAG, oldParentIdTag, parentIdTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.ID_TAG_INFO__STATUS:
				return getStatus();
			case OcppChargePointPackage.ID_TAG_INFO__EXPIRY_DATE:
				return getExpiryDate();
			case OcppChargePointPackage.ID_TAG_INFO__PARENT_ID_TAG:
				return getParentIdTag();
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
			case OcppChargePointPackage.ID_TAG_INFO__STATUS:
				setStatus((AuthorizationStatus)newValue);
				return;
			case OcppChargePointPackage.ID_TAG_INFO__EXPIRY_DATE:
				setExpiryDate((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.ID_TAG_INFO__PARENT_ID_TAG:
				setParentIdTag((String)newValue);
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
			case OcppChargePointPackage.ID_TAG_INFO__STATUS:
				unsetStatus();
				return;
			case OcppChargePointPackage.ID_TAG_INFO__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
				return;
			case OcppChargePointPackage.ID_TAG_INFO__PARENT_ID_TAG:
				setParentIdTag(PARENT_ID_TAG_EDEFAULT);
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
			case OcppChargePointPackage.ID_TAG_INFO__STATUS:
				return isSetStatus();
			case OcppChargePointPackage.ID_TAG_INFO__EXPIRY_DATE:
				return EXPIRY_DATE_EDEFAULT == null ? expiryDate != null : !EXPIRY_DATE_EDEFAULT.equals(expiryDate);
			case OcppChargePointPackage.ID_TAG_INFO__PARENT_ID_TAG:
				return PARENT_ID_TAG_EDEFAULT == null ? parentIdTag != null : !PARENT_ID_TAG_EDEFAULT.equals(parentIdTag);
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
		result.append(" (status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", expiryDate: ");
		result.append(expiryDate);
		result.append(", parentIdTag: ");
		result.append(parentIdTag);
		result.append(')');
		return result.toString();
	}

} //IdTagInfoImpl
