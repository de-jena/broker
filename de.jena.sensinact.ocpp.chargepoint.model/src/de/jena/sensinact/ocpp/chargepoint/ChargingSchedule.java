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

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charging Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getStartSchedule <em>Start Schedule</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingRateUnit <em>Charging Rate Unit</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingSchedulePeriod <em>Charging Schedule Period</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getMinChargingRate <em>Min Charging Rate</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedule()
 * @model extendedMetaData="name='ChargingSchedule' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChargingSchedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedule_Duration()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(int)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(int)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>Start Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Schedule</em>' attribute.
	 * @see #setStartSchedule(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedule_StartSchedule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='startSchedule' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartSchedule();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getStartSchedule <em>Start Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Schedule</em>' attribute.
	 * @see #getStartSchedule()
	 * @generated
	 */
	void setStartSchedule(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Charging Rate Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Rate Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @see #isSetChargingRateUnit()
	 * @see #unsetChargingRateUnit()
	 * @see #setChargingRateUnit(ChargingRateUnitType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedule_ChargingRateUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='chargingRateUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingRateUnitType getChargingRateUnit();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingRateUnit <em>Charging Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Rate Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @see #isSetChargingRateUnit()
	 * @see #unsetChargingRateUnit()
	 * @see #getChargingRateUnit()
	 * @generated
	 */
	void setChargingRateUnit(ChargingRateUnitType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingRateUnit <em>Charging Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargingRateUnit()
	 * @see #getChargingRateUnit()
	 * @see #setChargingRateUnit(ChargingRateUnitType)
	 * @generated
	 */
	void unsetChargingRateUnit();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getChargingRateUnit <em>Charging Rate Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charging Rate Unit</em>' attribute is set.
	 * @see #unsetChargingRateUnit()
	 * @see #getChargingRateUnit()
	 * @see #setChargingRateUnit(ChargingRateUnitType)
	 * @generated
	 */
	boolean isSetChargingRateUnit();

	/**
	 * Returns the value of the '<em><b>Charging Schedule Period</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Schedule Period</em>' containment reference list.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedule_ChargingSchedulePeriod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='chargingSchedulePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChargingSchedulePeriod> getChargingSchedulePeriod();

	/**
	 * Returns the value of the '<em><b>Min Charging Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Charging Rate</em>' attribute.
	 * @see #setMinChargingRate(BigDecimal)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedule_MinChargingRate()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.DecimalOne"
	 *        extendedMetaData="kind='element' name='minChargingRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getMinChargingRate();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedule#getMinChargingRate <em>Min Charging Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Charging Rate</em>' attribute.
	 * @see #getMinChargingRate()
	 * @generated
	 */
	void setMinChargingRate(BigDecimal value);

} // ChargingSchedule
