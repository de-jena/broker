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
package de.jena.sensinact.ocpp.chargepoint;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charging Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileId <em>Charging Profile Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getStackLevel <em>Stack Level</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfilePurpose <em>Charging Profile Purpose</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileKind <em>Charging Profile Kind</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getRecurrencyKind <em>Recurrency Kind</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingSchedule <em>Charging Schedule</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile()
 * @model extendedMetaData="name='ChargingProfile' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChargingProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Charging Profile Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Profile Id</em>' attribute.
	 * @see #isSetChargingProfileId()
	 * @see #unsetChargingProfileId()
	 * @see #setChargingProfileId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_ChargingProfileId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='chargingProfileId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getChargingProfileId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileId <em>Charging Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Profile Id</em>' attribute.
	 * @see #isSetChargingProfileId()
	 * @see #unsetChargingProfileId()
	 * @see #getChargingProfileId()
	 * @generated
	 */
	void setChargingProfileId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileId <em>Charging Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargingProfileId()
	 * @see #getChargingProfileId()
	 * @see #setChargingProfileId(int)
	 * @generated
	 */
	void unsetChargingProfileId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileId <em>Charging Profile Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charging Profile Id</em>' attribute is set.
	 * @see #unsetChargingProfileId()
	 * @see #getChargingProfileId()
	 * @see #setChargingProfileId(int)
	 * @generated
	 */
	boolean isSetChargingProfileId();

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #setTransactionId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_TransactionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='transactionId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTransactionId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	void unsetTransactionId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getTransactionId <em>Transaction Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Id</em>' attribute is set.
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	boolean isSetTransactionId();

	/**
	 * Returns the value of the '<em><b>Stack Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Level</em>' attribute.
	 * @see #isSetStackLevel()
	 * @see #unsetStackLevel()
	 * @see #setStackLevel(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_StackLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='stackLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getStackLevel();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getStackLevel <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Level</em>' attribute.
	 * @see #isSetStackLevel()
	 * @see #unsetStackLevel()
	 * @see #getStackLevel()
	 * @generated
	 */
	void setStackLevel(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getStackLevel <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStackLevel()
	 * @see #getStackLevel()
	 * @see #setStackLevel(int)
	 * @generated
	 */
	void unsetStackLevel();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getStackLevel <em>Stack Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stack Level</em>' attribute is set.
	 * @see #unsetStackLevel()
	 * @see #getStackLevel()
	 * @see #setStackLevel(int)
	 * @generated
	 */
	boolean isSetStackLevel();

	/**
	 * Returns the value of the '<em><b>Charging Profile Purpose</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Profile Purpose</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @see #isSetChargingProfilePurpose()
	 * @see #unsetChargingProfilePurpose()
	 * @see #setChargingProfilePurpose(ChargingProfilePurposeType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_ChargingProfilePurpose()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='chargingProfilePurpose' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingProfilePurposeType getChargingProfilePurpose();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfilePurpose <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Profile Purpose</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @see #isSetChargingProfilePurpose()
	 * @see #unsetChargingProfilePurpose()
	 * @see #getChargingProfilePurpose()
	 * @generated
	 */
	void setChargingProfilePurpose(ChargingProfilePurposeType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfilePurpose <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargingProfilePurpose()
	 * @see #getChargingProfilePurpose()
	 * @see #setChargingProfilePurpose(ChargingProfilePurposeType)
	 * @generated
	 */
	void unsetChargingProfilePurpose();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfilePurpose <em>Charging Profile Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charging Profile Purpose</em>' attribute is set.
	 * @see #unsetChargingProfilePurpose()
	 * @see #getChargingProfilePurpose()
	 * @see #setChargingProfilePurpose(ChargingProfilePurposeType)
	 * @generated
	 */
	boolean isSetChargingProfilePurpose();

	/**
	 * Returns the value of the '<em><b>Charging Profile Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Profile Kind</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
	 * @see #isSetChargingProfileKind()
	 * @see #unsetChargingProfileKind()
	 * @see #setChargingProfileKind(ChargingProfileKindType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_ChargingProfileKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='chargingProfileKind' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingProfileKindType getChargingProfileKind();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileKind <em>Charging Profile Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Profile Kind</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType
	 * @see #isSetChargingProfileKind()
	 * @see #unsetChargingProfileKind()
	 * @see #getChargingProfileKind()
	 * @generated
	 */
	void setChargingProfileKind(ChargingProfileKindType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileKind <em>Charging Profile Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargingProfileKind()
	 * @see #getChargingProfileKind()
	 * @see #setChargingProfileKind(ChargingProfileKindType)
	 * @generated
	 */
	void unsetChargingProfileKind();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingProfileKind <em>Charging Profile Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charging Profile Kind</em>' attribute is set.
	 * @see #unsetChargingProfileKind()
	 * @see #getChargingProfileKind()
	 * @see #setChargingProfileKind(ChargingProfileKindType)
	 * @generated
	 */
	boolean isSetChargingProfileKind();

	/**
	 * Returns the value of the '<em><b>Recurrency Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrency Kind</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
	 * @see #isSetRecurrencyKind()
	 * @see #unsetRecurrencyKind()
	 * @see #setRecurrencyKind(RecurrencyKindType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_RecurrencyKind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='recurrencyKind' namespace='##targetNamespace'"
	 * @generated
	 */
	RecurrencyKindType getRecurrencyKind();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getRecurrencyKind <em>Recurrency Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrency Kind</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType
	 * @see #isSetRecurrencyKind()
	 * @see #unsetRecurrencyKind()
	 * @see #getRecurrencyKind()
	 * @generated
	 */
	void setRecurrencyKind(RecurrencyKindType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getRecurrencyKind <em>Recurrency Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecurrencyKind()
	 * @see #getRecurrencyKind()
	 * @see #setRecurrencyKind(RecurrencyKindType)
	 * @generated
	 */
	void unsetRecurrencyKind();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getRecurrencyKind <em>Recurrency Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recurrency Kind</em>' attribute is set.
	 * @see #unsetRecurrencyKind()
	 * @see #getRecurrencyKind()
	 * @see #setRecurrencyKind(RecurrencyKindType)
	 * @generated
	 */
	boolean isSetRecurrencyKind();

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_ValidFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='validFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getValidFrom();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid To</em>' attribute.
	 * @see #setValidTo(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_ValidTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='validTo' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getValidTo();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' attribute.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Charging Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Schedule</em>' containment reference.
	 * @see #setChargingSchedule(ChargingSchedule)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfile_ChargingSchedule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='chargingSchedule' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingSchedule getChargingSchedule();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingProfile#getChargingSchedule <em>Charging Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Schedule</em>' containment reference.
	 * @see #getChargingSchedule()
	 * @generated
	 */
	void setChargingSchedule(ChargingSchedule value);

} // ChargingProfile
