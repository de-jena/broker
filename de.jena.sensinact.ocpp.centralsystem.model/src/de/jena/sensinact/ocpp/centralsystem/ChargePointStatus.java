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
package de.jena.sensinact.ocpp.centralsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Charge Point Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the charge-point-status-value
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getChargePointStatus()
 * @model extendedMetaData="name='ChargePointStatus'"
 * @generated
 */
@ProviderType
public enum ChargePointStatus implements Enumerator {
	/**
	 * The '<em><b>Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABLE(0, "Available", "Available"),

	/**
	 * The '<em><b>Preparing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARING_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARING(1, "Preparing", "Preparing"),

	/**
	 * The '<em><b>Charging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGING(2, "Charging", "Charging"),

	/**
	 * The '<em><b>Suspended EV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EV_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED_EV(3, "SuspendedEV", "SuspendedEV"),

	/**
	 * The '<em><b>Suspended EVSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EVSE_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED_EVSE(4, "SuspendedEVSE", "SuspendedEVSE"),

	/**
	 * The '<em><b>Finishing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHING_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHING(5, "Finishing", "Finishing"),

	/**
	 * The '<em><b>Reserved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVED(6, "Reserved", "Reserved"),

	/**
	 * The '<em><b>Faulted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAULTED_VALUE
	 * @generated
	 * @ordered
	 */
	FAULTED(7, "Faulted", "Faulted"),

	/**
	 * The '<em><b>Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(8, "Unavailable", "Unavailable");

	/**
	 * The '<em><b>Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABLE
	 * @model name="Available"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABLE_VALUE = 0;

	/**
	 * The '<em><b>Preparing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARING
	 * @model name="Preparing"
	 * @generated
	 * @ordered
	 */
	public static final int PREPARING_VALUE = 1;

	/**
	 * The '<em><b>Charging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGING
	 * @model name="Charging"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGING_VALUE = 2;

	/**
	 * The '<em><b>Suspended EV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EV
	 * @model name="SuspendedEV"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_EV_VALUE = 3;

	/**
	 * The '<em><b>Suspended EVSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_EVSE
	 * @model name="SuspendedEVSE"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_EVSE_VALUE = 4;

	/**
	 * The '<em><b>Finishing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHING
	 * @model name="Finishing"
	 * @generated
	 * @ordered
	 */
	public static final int FINISHING_VALUE = 5;

	/**
	 * The '<em><b>Reserved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED
	 * @model name="Reserved"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVED_VALUE = 6;

	/**
	 * The '<em><b>Faulted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAULTED
	 * @model name="Faulted"
	 * @generated
	 * @ordered
	 */
	public static final int FAULTED_VALUE = 7;

	/**
	 * The '<em><b>Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE
	 * @model name="Unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Charge Point Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChargePointStatus[] VALUES_ARRAY =
		new ChargePointStatus[] {
			AVAILABLE,
			PREPARING,
			CHARGING,
			SUSPENDED_EV,
			SUSPENDED_EVSE,
			FINISHING,
			RESERVED,
			FAULTED,
			UNAVAILABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Charge Point Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChargePointStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Charge Point Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargePointStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargePointStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Point Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargePointStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargePointStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Point Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargePointStatus get(int value) {
		switch (value) {
			case AVAILABLE_VALUE: return AVAILABLE;
			case PREPARING_VALUE: return PREPARING;
			case CHARGING_VALUE: return CHARGING;
			case SUSPENDED_EV_VALUE: return SUSPENDED_EV;
			case SUSPENDED_EVSE_VALUE: return SUSPENDED_EVSE;
			case FINISHING_VALUE: return FINISHING;
			case RESERVED_VALUE: return RESERVED;
			case FAULTED_VALUE: return FAULTED;
			case UNAVAILABLE_VALUE: return UNAVAILABLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ChargePointStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ChargePointStatus
