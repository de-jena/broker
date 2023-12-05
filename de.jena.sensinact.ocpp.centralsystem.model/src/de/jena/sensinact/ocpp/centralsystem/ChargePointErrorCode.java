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
 * A representation of the literals of the enumeration '<em><b>Charge Point Error Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the charge-point-error-value
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getChargePointErrorCode()
 * @model extendedMetaData="name='ChargePointErrorCode'"
 * @generated
 */
@ProviderType
public enum ChargePointErrorCode implements Enumerator {
	/**
	 * The '<em><b>Connector Lock Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_LOCK_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR_LOCK_FAILURE(0, "ConnectorLockFailure", "ConnectorLockFailure"),

	/**
	 * The '<em><b>EV Communication Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EV_COMMUNICATION_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	EV_COMMUNICATION_ERROR(1, "EVCommunicationError", "EVCommunicationError"),

	/**
	 * The '<em><b>Ground Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND_FAILURE(2, "GroundFailure", "GroundFailure"),

	/**
	 * The '<em><b>High Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_TEMPERATURE(3, "HighTemperature", "HighTemperature"),

	/**
	 * The '<em><b>Internal Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_ERROR(4, "InternalError", "InternalError"),

	/**
	 * The '<em><b>Local List Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_LIST_CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_LIST_CONFLICT(5, "LocalListConflict", "LocalListConflict"),

	/**
	 * The '<em><b>No Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ERROR(6, "NoError", "NoError"),

	/**
	 * The '<em><b>Other Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_ERROR(7, "OtherError", "OtherError"),

	/**
	 * The '<em><b>Over Current Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_CURRENT_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	OVER_CURRENT_FAILURE(8, "OverCurrentFailure", "OverCurrentFailure"),

	/**
	 * The '<em><b>Over Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	OVER_VOLTAGE(9, "OverVoltage", "OverVoltage"),

	/**
	 * The '<em><b>Power Meter Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_METER_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_METER_FAILURE(10, "PowerMeterFailure", "PowerMeterFailure"),

	/**
	 * The '<em><b>Power Switch Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_SWITCH_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_SWITCH_FAILURE(11, "PowerSwitchFailure", "PowerSwitchFailure"),

	/**
	 * The '<em><b>Reader Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READER_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	READER_FAILURE(12, "ReaderFailure", "ReaderFailure"),

	/**
	 * The '<em><b>Reset Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	RESET_FAILURE(13, "ResetFailure", "ResetFailure"),

	/**
	 * The '<em><b>Under Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDER_VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDER_VOLTAGE(14, "UnderVoltage", "UnderVoltage"),

	/**
	 * The '<em><b>Weak Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK_SIGNAL(15, "WeakSignal", "WeakSignal");

	/**
	 * The '<em><b>Connector Lock Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_LOCK_FAILURE
	 * @model name="ConnectorLockFailure"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_LOCK_FAILURE_VALUE = 0;

	/**
	 * The '<em><b>EV Communication Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EV_COMMUNICATION_ERROR
	 * @model name="EVCommunicationError"
	 * @generated
	 * @ordered
	 */
	public static final int EV_COMMUNICATION_ERROR_VALUE = 1;

	/**
	 * The '<em><b>Ground Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_FAILURE
	 * @model name="GroundFailure"
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_FAILURE_VALUE = 2;

	/**
	 * The '<em><b>High Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_TEMPERATURE
	 * @model name="HighTemperature"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_TEMPERATURE_VALUE = 3;

	/**
	 * The '<em><b>Internal Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_ERROR
	 * @model name="InternalError"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_ERROR_VALUE = 4;

	/**
	 * The '<em><b>Local List Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_LIST_CONFLICT
	 * @model name="LocalListConflict"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_LIST_CONFLICT_VALUE = 5;

	/**
	 * The '<em><b>No Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ERROR
	 * @model name="NoError"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ERROR_VALUE = 6;

	/**
	 * The '<em><b>Other Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_ERROR
	 * @model name="OtherError"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_ERROR_VALUE = 7;

	/**
	 * The '<em><b>Over Current Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_CURRENT_FAILURE
	 * @model name="OverCurrentFailure"
	 * @generated
	 * @ordered
	 */
	public static final int OVER_CURRENT_FAILURE_VALUE = 8;

	/**
	 * The '<em><b>Over Voltage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_VOLTAGE
	 * @model name="OverVoltage"
	 * @generated
	 * @ordered
	 */
	public static final int OVER_VOLTAGE_VALUE = 9;

	/**
	 * The '<em><b>Power Meter Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_METER_FAILURE
	 * @model name="PowerMeterFailure"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_METER_FAILURE_VALUE = 10;

	/**
	 * The '<em><b>Power Switch Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_SWITCH_FAILURE
	 * @model name="PowerSwitchFailure"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SWITCH_FAILURE_VALUE = 11;

	/**
	 * The '<em><b>Reader Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READER_FAILURE
	 * @model name="ReaderFailure"
	 * @generated
	 * @ordered
	 */
	public static final int READER_FAILURE_VALUE = 12;

	/**
	 * The '<em><b>Reset Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_FAILURE
	 * @model name="ResetFailure"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_FAILURE_VALUE = 13;

	/**
	 * The '<em><b>Under Voltage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDER_VOLTAGE
	 * @model name="UnderVoltage"
	 * @generated
	 * @ordered
	 */
	public static final int UNDER_VOLTAGE_VALUE = 14;

	/**
	 * The '<em><b>Weak Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_SIGNAL
	 * @model name="WeakSignal"
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_SIGNAL_VALUE = 15;

	/**
	 * An array of all the '<em><b>Charge Point Error Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChargePointErrorCode[] VALUES_ARRAY =
		new ChargePointErrorCode[] {
			CONNECTOR_LOCK_FAILURE,
			EV_COMMUNICATION_ERROR,
			GROUND_FAILURE,
			HIGH_TEMPERATURE,
			INTERNAL_ERROR,
			LOCAL_LIST_CONFLICT,
			NO_ERROR,
			OTHER_ERROR,
			OVER_CURRENT_FAILURE,
			OVER_VOLTAGE,
			POWER_METER_FAILURE,
			POWER_SWITCH_FAILURE,
			READER_FAILURE,
			RESET_FAILURE,
			UNDER_VOLTAGE,
			WEAK_SIGNAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Charge Point Error Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChargePointErrorCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Charge Point Error Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargePointErrorCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargePointErrorCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Point Error Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargePointErrorCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargePointErrorCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Point Error Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargePointErrorCode get(int value) {
		switch (value) {
			case CONNECTOR_LOCK_FAILURE_VALUE: return CONNECTOR_LOCK_FAILURE;
			case EV_COMMUNICATION_ERROR_VALUE: return EV_COMMUNICATION_ERROR;
			case GROUND_FAILURE_VALUE: return GROUND_FAILURE;
			case HIGH_TEMPERATURE_VALUE: return HIGH_TEMPERATURE;
			case INTERNAL_ERROR_VALUE: return INTERNAL_ERROR;
			case LOCAL_LIST_CONFLICT_VALUE: return LOCAL_LIST_CONFLICT;
			case NO_ERROR_VALUE: return NO_ERROR;
			case OTHER_ERROR_VALUE: return OTHER_ERROR;
			case OVER_CURRENT_FAILURE_VALUE: return OVER_CURRENT_FAILURE;
			case OVER_VOLTAGE_VALUE: return OVER_VOLTAGE;
			case POWER_METER_FAILURE_VALUE: return POWER_METER_FAILURE;
			case POWER_SWITCH_FAILURE_VALUE: return POWER_SWITCH_FAILURE;
			case READER_FAILURE_VALUE: return READER_FAILURE;
			case RESET_FAILURE_VALUE: return RESET_FAILURE;
			case UNDER_VOLTAGE_VALUE: return UNDER_VOLTAGE;
			case WEAK_SIGNAL_VALUE: return WEAK_SIGNAL;
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
	private ChargePointErrorCode(int value, String name, String literal) {
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
	
} //ChargePointErrorCode
