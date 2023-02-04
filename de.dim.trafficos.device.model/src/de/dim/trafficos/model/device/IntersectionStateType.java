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
 * A representation of the literals of the enumeration '<em><b>Intersection State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getIntersectionStateType()
 * @model
 * @generated
 */
@ProviderType
public enum IntersectionStateType implements Enumerator {
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
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "NONE", "NONE"),

	/**
	 * The '<em><b>ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLED(2, "ENABLED", "ENABLED"),

	/**
	 * The '<em><b>DISABLED DARK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_DARK_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED_DARK(3, "DISABLED_DARK", "DISABLED_DARK"),

	/**
	 * The '<em><b>DISABLED FLASH SECONDARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_FLASH_SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED_FLASH_SECONDARY(4, "DISABLED_FLASH_SECONDARY", "DISABLED_FLASH_SECONDARY"),

	/**
	 * The '<em><b>DISABLED FLASH ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_FLASH_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED_FLASH_ALL(5, "DISABLED_FLASH_ALL", "DISABLED_FLASH_ALL"),

	/**
	 * The '<em><b>DISABLED DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED_DEFAULT(6, "DISABLED_DEFAULT", "DISABLED_DEFAULT");

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
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENABLED_VALUE = 2;

	/**
	 * The '<em><b>DISABLED DARK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_DARK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_DARK_VALUE = 3;

	/**
	 * The '<em><b>DISABLED FLASH SECONDARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_FLASH_SECONDARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_FLASH_SECONDARY_VALUE = 4;

	/**
	 * The '<em><b>DISABLED FLASH ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_FLASH_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_FLASH_ALL_VALUE = 5;

	/**
	 * The '<em><b>DISABLED DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_DEFAULT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Intersection State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntersectionStateType[] VALUES_ARRAY =
		new IntersectionStateType[] {
			UNKNOWN,
			NONE,
			ENABLED,
			DISABLED_DARK,
			DISABLED_FLASH_SECONDARY,
			DISABLED_FLASH_ALL,
			DISABLED_DEFAULT,
		};

	/**
	 * A public read-only list of all the '<em><b>Intersection State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntersectionStateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Intersection State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntersectionStateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntersectionStateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intersection State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntersectionStateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntersectionStateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intersection State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntersectionStateType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NONE_VALUE: return NONE;
			case ENABLED_VALUE: return ENABLED;
			case DISABLED_DARK_VALUE: return DISABLED_DARK;
			case DISABLED_FLASH_SECONDARY_VALUE: return DISABLED_FLASH_SECONDARY;
			case DISABLED_FLASH_ALL_VALUE: return DISABLED_FLASH_ALL;
			case DISABLED_DEFAULT_VALUE: return DISABLED_DEFAULT;
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
	private IntersectionStateType(int value, String name, String literal) {
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
	
} //IntersectionStateType
