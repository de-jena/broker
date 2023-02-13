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
package de.dim.trafficos.model.device;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Public Transport Data Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDataValueType()
 * @model
 * @generated
 */
@ProviderType
public enum PublicTransportDataValueType implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>DOOR CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	DOOR_CHANGE(1, "DOOR_CHANGE", "DOOR_CHANGE"),

	/**
	 * The '<em><b>TELEGRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TELEGRAM(2, "TELEGRAM", "TELEGRAM"),

	/**
	 * The '<em><b>GEO INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEO_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	GEO_INFO(3, "GEO_INFO", "GEO_INFO"),

	/**
	 * The '<em><b>LOCATION MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION_MESSAGE(4, "LOCATION_MESSAGE", "LOCATION_MESSAGE");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>DOOR CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_CHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_CHANGE_VALUE = 1;

	/**
	 * The '<em><b>TELEGRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEGRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TELEGRAM_VALUE = 2;

	/**
	 * The '<em><b>GEO INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEO_INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEO_INFO_VALUE = 3;

	/**
	 * The '<em><b>LOCATION MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_MESSAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_MESSAGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Public Transport Data Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PublicTransportDataValueType[] VALUES_ARRAY =
		new PublicTransportDataValueType[] {
			UNKNOWN,
			DOOR_CHANGE,
			TELEGRAM,
			GEO_INFO,
			LOCATION_MESSAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Public Transport Data Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PublicTransportDataValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Public Transport Data Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicTransportDataValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublicTransportDataValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Public Transport Data Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicTransportDataValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublicTransportDataValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Public Transport Data Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicTransportDataValueType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case DOOR_CHANGE_VALUE: return DOOR_CHANGE;
			case TELEGRAM_VALUE: return TELEGRAM;
			case GEO_INFO_VALUE: return GEO_INFO;
			case LOCATION_MESSAGE_VALUE: return LOCATION_MESSAGE;
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
	private PublicTransportDataValueType(int value, String name, String literal) {
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
	
} //PublicTransportDataValueType
