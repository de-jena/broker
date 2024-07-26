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

import de.jena.model.sensinact.ibis.IbisSensinactPackage;
import de.jena.model.sensinact.ibis.TicketValidationCurrentLineData;

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
 * An implementation of the model object '<em><b>Ticket Validation Current Line Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getLineRef <em>Line Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getLineName <em>Line Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getLineShortName <em>Line Short Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.impl.TicketValidationCurrentLineDataImpl#getLineCode <em>Line Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TicketValidationCurrentLineDataImpl extends ServiceImpl implements TicketValidationCurrentLineData {
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
	 * The default value of the '{@link #getLineRef() <em>Line Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineRef() <em>Line Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRef()
	 * @generated
	 * @ordered
	 */
	protected String lineRef = LINE_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLineName() <em>Line Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lineName;

	/**
	 * The cached value of the '{@link #getLineShortName() <em>Line Short Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lineShortName;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_NUMBER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected int lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineCode() <em>Line Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCode()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_CODE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getLineCode() <em>Line Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCode()
	 * @generated
	 * @ordered
	 */
	protected int lineCode = LINE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketValidationCurrentLineDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisSensinactPackage.Literals.TICKET_VALIDATION_CURRENT_LINE_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_NAME, oldServiceName, serviceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_OPERATION, oldServiceOperation, serviceOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineRef() {
		return lineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineRef(String newLineRef) {
		String oldLineRef = lineRef;
		lineRef = newLineRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_REF, oldLineRef, lineRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLineName() {
		if (lineName == null) {
			lineName = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NAME);
		}
		return lineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLineShortName() {
		if (lineShortName == null) {
			lineShortName = new EDataTypeUniqueEList<String>(String.class, this, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_SHORT_NAME);
		}
		return lineShortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineNumber(int newLineNumber) {
		int oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLineCode() {
		return lineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineCode(int newLineCode) {
		int oldLineCode = lineCode;
		lineCode = newLineCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_CODE, oldLineCode, lineCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_NAME:
				return getServiceName();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_OPERATION:
				return getServiceOperation();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__TIMESTAMP:
				return getTimestamp();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_REF:
				return getLineRef();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NAME:
				return getLineName();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_SHORT_NAME:
				return getLineShortName();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NUMBER:
				return getLineNumber();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_CODE:
				return getLineCode();
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
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_OPERATION:
				setServiceOperation((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_REF:
				setLineRef((String)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NAME:
				getLineName().clear();
				getLineName().addAll((Collection<? extends String>)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_SHORT_NAME:
				getLineShortName().clear();
				getLineShortName().addAll((Collection<? extends String>)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NUMBER:
				setLineNumber((Integer)newValue);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_CODE:
				setLineCode((Integer)newValue);
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
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_OPERATION:
				setServiceOperation(SERVICE_OPERATION_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_REF:
				setLineRef(LINE_REF_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NAME:
				getLineName().clear();
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_SHORT_NAME:
				getLineShortName().clear();
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_CODE:
				setLineCode(LINE_CODE_EDEFAULT);
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
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__SERVICE_OPERATION:
				return SERVICE_OPERATION_EDEFAULT == null ? serviceOperation != null : !SERVICE_OPERATION_EDEFAULT.equals(serviceOperation);
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_REF:
				return LINE_REF_EDEFAULT == null ? lineRef != null : !LINE_REF_EDEFAULT.equals(lineRef);
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NAME:
				return lineName != null && !lineName.isEmpty();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_SHORT_NAME:
				return lineShortName != null && !lineShortName.isEmpty();
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_NUMBER:
				return lineNumber != LINE_NUMBER_EDEFAULT;
			case IbisSensinactPackage.TICKET_VALIDATION_CURRENT_LINE_DATA__LINE_CODE:
				return lineCode != LINE_CODE_EDEFAULT;
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
		result.append(", lineRef: ");
		result.append(lineRef);
		result.append(", lineName: ");
		result.append(lineName);
		result.append(", lineShortName: ");
		result.append(lineShortName);
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(", lineCode: ");
		result.append(lineCode);
		result.append(')');
		return result.toString();
	}

} //TicketValidationCurrentLineDataImpl
