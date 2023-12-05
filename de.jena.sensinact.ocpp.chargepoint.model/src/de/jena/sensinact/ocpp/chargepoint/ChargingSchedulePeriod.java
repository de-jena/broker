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

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charging Schedule Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getStartPeriod <em>Start Period</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getLimit <em>Limit</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getNumberPhases <em>Number Phases</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedulePeriod()
 * @model extendedMetaData="name='ChargingSchedulePeriod' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChargingSchedulePeriod extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Period</em>' attribute.
	 * @see #isSetStartPeriod()
	 * @see #unsetStartPeriod()
	 * @see #setStartPeriod(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedulePeriod_StartPeriod()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='startPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	int getStartPeriod();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getStartPeriod <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Period</em>' attribute.
	 * @see #isSetStartPeriod()
	 * @see #unsetStartPeriod()
	 * @see #getStartPeriod()
	 * @generated
	 */
	void setStartPeriod(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getStartPeriod <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartPeriod()
	 * @see #getStartPeriod()
	 * @see #setStartPeriod(int)
	 * @generated
	 */
	void unsetStartPeriod();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getStartPeriod <em>Start Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Period</em>' attribute is set.
	 * @see #unsetStartPeriod()
	 * @see #getStartPeriod()
	 * @see #setStartPeriod(int)
	 * @generated
	 */
	boolean isSetStartPeriod();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(BigDecimal)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedulePeriod_Limit()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.DecimalOne" required="true"
	 *        extendedMetaData="kind='element' name='limit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getLimit();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Number Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Phases</em>' attribute.
	 * @see #isSetNumberPhases()
	 * @see #unsetNumberPhases()
	 * @see #setNumberPhases(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingSchedulePeriod_NumberPhases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='numberPhases' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumberPhases();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getNumberPhases <em>Number Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Phases</em>' attribute.
	 * @see #isSetNumberPhases()
	 * @see #unsetNumberPhases()
	 * @see #getNumberPhases()
	 * @generated
	 */
	void setNumberPhases(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getNumberPhases <em>Number Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberPhases()
	 * @see #getNumberPhases()
	 * @see #setNumberPhases(int)
	 * @generated
	 */
	void unsetNumberPhases();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ChargingSchedulePeriod#getNumberPhases <em>Number Phases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Phases</em>' attribute is set.
	 * @see #unsetNumberPhases()
	 * @see #getNumberPhases()
	 * @see #setNumberPhases(int)
	 * @generated
	 */
	boolean isSetNumberPhases();

} // ChargingSchedulePeriod
