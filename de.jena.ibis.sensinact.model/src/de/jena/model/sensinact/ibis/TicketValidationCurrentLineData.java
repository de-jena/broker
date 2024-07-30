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
package de.jena.model.sensinact.ibis;

import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket Validation Current Line Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getServiceOperation <em>Service Operation</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineRef <em>Line Ref</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineName <em>Line Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineShortName <em>Line Short Name</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineCode <em>Line Code</em>}</li>
 * </ul>
 *
 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData()
 * @model
 * @generated
 */
@ProviderType
public interface TicketValidationCurrentLineData extends Service {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Operation</em>' attribute.
	 * @see #setServiceOperation(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_ServiceOperation()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOperation();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getServiceOperation <em>Service Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Operation</em>' attribute.
	 * @see #getServiceOperation()
	 * @generated
	 */
	void setServiceOperation(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Instant)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_Timestamp()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EInstant"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Line Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Ref</em>' attribute.
	 * @see #setLineRef(String)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_LineRef()
	 * @model required="true"
	 * @generated
	 */
	String getLineRef();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineRef <em>Line Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Ref</em>' attribute.
	 * @see #getLineRef()
	 * @generated
	 */
	void setLineRef(String value);

	/**
	 * Returns the value of the '<em><b>Line Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Name</em>' attribute list.
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_LineName()
	 * @model
	 * @generated
	 */
	EList<String> getLineName();

	/**
	 * Returns the value of the '<em><b>Line Short Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Short Name</em>' attribute list.
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_LineShortName()
	 * @model
	 * @generated
	 */
	EList<String> getLineShortName();

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_LineNumber()
	 * @model default="-1"
	 * @generated
	 */
	int getLineNumber();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(int value);

	/**
	 * Returns the value of the '<em><b>Line Code</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Code</em>' attribute.
	 * @see #setLineCode(int)
	 * @see de.jena.model.sensinact.ibis.IbisSensinactPackage#getTicketValidationCurrentLineData_LineCode()
	 * @model default="-1"
	 * @generated
	 */
	int getLineCode();

	/**
	 * Sets the value of the '{@link de.jena.model.sensinact.ibis.TicketValidationCurrentLineData#getLineCode <em>Line Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Code</em>' attribute.
	 * @see #getLineCode()
	 * @generated
	 */
	void setLineCode(int value);

} // TicketValidationCurrentLineData
