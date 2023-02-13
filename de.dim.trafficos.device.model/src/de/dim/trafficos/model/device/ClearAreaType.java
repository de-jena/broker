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
 * A representation of the literals of the enumeration '<em><b>Clear Area Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getClearAreaType()
 * @model
 * @generated
 */
@ProviderType
public enum ClearAreaType implements Enumerator {
	/**
	 * The '<em><b>Clear Pedestrian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_PEDESTRIAN_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR_PEDESTRIAN(0, "ClearPedestrian", "ClearPedestrian"),

	/**
	 * The '<em><b>Clear Main</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_MAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR_MAIN(1, "ClearMain", "ClearMain"),

	/**
	 * The '<em><b>Clear Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR_SECONDARY(2, "ClearSecondary", "ClearSecondary");

	/**
	 * The '<em><b>Clear Pedestrian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_PEDESTRIAN
	 * @model name="ClearPedestrian"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_PEDESTRIAN_VALUE = 0;

	/**
	 * The '<em><b>Clear Main</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_MAIN
	 * @model name="ClearMain"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_MAIN_VALUE = 1;

	/**
	 * The '<em><b>Clear Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_SECONDARY
	 * @model name="ClearSecondary"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_SECONDARY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Clear Area Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClearAreaType[] VALUES_ARRAY =
		new ClearAreaType[] {
			CLEAR_PEDESTRIAN,
			CLEAR_MAIN,
			CLEAR_SECONDARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Clear Area Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClearAreaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Clear Area Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClearAreaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClearAreaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clear Area Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClearAreaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClearAreaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clear Area Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClearAreaType get(int value) {
		switch (value) {
			case CLEAR_PEDESTRIAN_VALUE: return CLEAR_PEDESTRIAN;
			case CLEAR_MAIN_VALUE: return CLEAR_MAIN;
			case CLEAR_SECONDARY_VALUE: return CLEAR_SECONDARY;
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
	private ClearAreaType(int value, String name, String literal) {
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
	
} //ClearAreaType
