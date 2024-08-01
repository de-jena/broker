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
package de.jena.model.sensinact.ibis.impl;

import de.jena.model.sensinact.ibis.CustomerInfoCurrentAnnouncementData;
import de.jena.model.sensinact.ibis.IbisSensinactPackage;

import java.time.Instant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Info Current Announcement Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentAnnouncementDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentAnnouncementDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentAnnouncementDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentAnnouncementDataImpl#getAnnouncementRef <em>Announcement Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentAnnouncementDataImpl#getAnnouncementText <em>Announcement Text</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.CustomerInfoCurrentAnnouncementDataImpl#getAnnouncementTTSText <em>Announcement TTS Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerInfoCurrentAnnouncementDataImpl extends ServiceImpl implements CustomerInfoCurrentAnnouncementData {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceOperation() <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceOperation() <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOperation()
	 * @generated
	 * @ordered
	 */
	protected String serviceOperation = SERVICE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Instant TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnouncementRef() <em>Announcement Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOUNCEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnouncementRef() <em>Announcement Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementRef()
	 * @generated
	 * @ordered
	 */
	protected String announcementRef = ANNOUNCEMENT_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnouncementText() <em>Announcement Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> announcementText;

	/**
	 * The cached value of the '{@link #getAnnouncementTTSText() <em>Announcement TTS Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementTTSText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> announcementTTSText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerInfoCurrentAnnouncementDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceOperation() {
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceOperation(String newServiceOperation) {
		String oldServiceOperation = serviceOperation;
		serviceOperation = newServiceOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Instant newTimestamp) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnouncementRef() {
		return announcementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnouncementRef(String newAnnouncementRef) {
		String oldAnnouncementRef = announcementRef;
		announcementRef = newAnnouncementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_REF, oldAnnouncementRef, announcementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnnouncementText() {
		if (announcementText == null) {
			announcementText = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TEXT);
		}
		return announcementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnnouncementTTSText() {
		if (announcementTTSText == null) {
			announcementTTSText = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TTS_TEXT);
		}
		return announcementTTSText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_REF:
				return getAnnouncementRef();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TEXT:
				return getAnnouncementText();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TTS_TEXT:
				return getAnnouncementTTSText();
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_REF:
				setAnnouncementRef((String)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TEXT:
				getAnnouncementText().clear();
				getAnnouncementText().addAll((Collection<? extends String>)newValue);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TTS_TEXT:
				getAnnouncementTTSText().clear();
				getAnnouncementTTSText().addAll((Collection<? extends String>)newValue);
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_REF:
				setAnnouncementRef(ANNOUNCEMENT_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TEXT:
				getAnnouncementText().clear();
				return;
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TTS_TEXT:
				getAnnouncementTTSText().clear();
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
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_REF:
				return ANNOUNCEMENT_REF_EDEFAULT == null ? announcementRef != null : !ANNOUNCEMENT_REF_EDEFAULT.equals(announcementRef);
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TEXT:
				return announcementText != null && !announcementText.isEmpty();
			case IbisSensinactPackage.CUSTOMER_INFO_CURRENT_ANNOUNCEMENT_DATA__ANNOUNCEMENT_TTS_TEXT:
				return announcementTTSText != null && !announcementTTSText.isEmpty();
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
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", serviceOperation: ");
		result.append(serviceOperation);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", announcementRef: ");
		result.append(announcementRef);
		result.append(", announcementText: ");
		result.append(announcementText);
		result.append(", announcementTTSText: ");
		result.append(announcementTTSText);
		result.append(')');
		return result.toString();
	}

} //CustomerInfoCurrentAnnouncementDataImpl
