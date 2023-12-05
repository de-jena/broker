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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Trigger</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getMessageTrigger()
 * @model extendedMetaData="name='MessageTrigger'"
 * @generated
 */
@ProviderType
public enum MessageTrigger implements Enumerator {
	/**
	 * The '<em><b>Boot Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOT_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	BOOT_NOTIFICATION(0, "BootNotification", "BootNotification"),

	/**
	 * The '<em><b>Diagnostics Status Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTICS_STATUS_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTICS_STATUS_NOTIFICATION(1, "DiagnosticsStatusNotification", "DiagnosticsStatusNotification"),

	/**
	 * The '<em><b>Firmware Status Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE_STATUS_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMWARE_STATUS_NOTIFICATION(2, "FirmwareStatusNotification", "FirmwareStatusNotification"),

	/**
	 * The '<em><b>Heartbeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARTBEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HEARTBEAT(3, "Heartbeat", "Heartbeat"),

	/**
	 * The '<em><b>Meter Values</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	METER_VALUES(4, "MeterValues", "MeterValues"),

	/**
	 * The '<em><b>Status Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_NOTIFICATION(5, "StatusNotification", "StatusNotification");

	/**
	 * The '<em><b>Boot Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOT_NOTIFICATION
	 * @model name="BootNotification"
	 * @generated
	 * @ordered
	 */
	public static final int BOOT_NOTIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Diagnostics Status Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTICS_STATUS_NOTIFICATION
	 * @model name="DiagnosticsStatusNotification"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTICS_STATUS_NOTIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Firmware Status Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE_STATUS_NOTIFICATION
	 * @model name="FirmwareStatusNotification"
	 * @generated
	 * @ordered
	 */
	public static final int FIRMWARE_STATUS_NOTIFICATION_VALUE = 2;

	/**
	 * The '<em><b>Heartbeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEARTBEAT
	 * @model name="Heartbeat"
	 * @generated
	 * @ordered
	 */
	public static final int HEARTBEAT_VALUE = 3;

	/**
	 * The '<em><b>Meter Values</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_VALUES
	 * @model name="MeterValues"
	 * @generated
	 * @ordered
	 */
	public static final int METER_VALUES_VALUE = 4;

	/**
	 * The '<em><b>Status Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_NOTIFICATION
	 * @model name="StatusNotification"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_NOTIFICATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Message Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageTrigger[] VALUES_ARRAY =
		new MessageTrigger[] {
			BOOT_NOTIFICATION,
			DIAGNOSTICS_STATUS_NOTIFICATION,
			FIRMWARE_STATUS_NOTIFICATION,
			HEARTBEAT,
			METER_VALUES,
			STATUS_NOTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageTrigger> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Trigger</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageTrigger get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageTrigger result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Trigger</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageTrigger getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageTrigger result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Trigger</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageTrigger get(int value) {
		switch (value) {
			case BOOT_NOTIFICATION_VALUE: return BOOT_NOTIFICATION;
			case DIAGNOSTICS_STATUS_NOTIFICATION_VALUE: return DIAGNOSTICS_STATUS_NOTIFICATION;
			case FIRMWARE_STATUS_NOTIFICATION_VALUE: return FIRMWARE_STATUS_NOTIFICATION;
			case HEARTBEAT_VALUE: return HEARTBEAT;
			case METER_VALUES_VALUE: return METER_VALUES;
			case STATUS_NOTIFICATION_VALUE: return STATUS_NOTIFICATION;
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
	private MessageTrigger(int value, String name, String literal) {
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
	
} //MessageTrigger
