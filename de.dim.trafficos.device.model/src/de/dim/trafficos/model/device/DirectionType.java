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
 * A representation of the literals of the enumeration '<em><b>Direction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getDirectionType()
 * @model
 * @generated
 */
@ProviderType
public enum DirectionType implements Enumerator {
	/**
	 * The '<em><b>STRAIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT(0, "STRAIGHT", "STRAIGHT"),

	/**
	 * The '<em><b>TURN RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TURN_RIGHT(1, "TURN_RIGHT", "TURN_RIGHT"),

	/**
	 * The '<em><b>TURN LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TURN_LEFT(2, "TURN_LEFT", "TURN_LEFT"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER"),

	/**
	 * The '<em><b>STRAIGHT TURNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_TURNS_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_TURNS(4, "STRAIGHT_TURNS", "STRAIGHT_TURNS"),

	/**
	 * The '<em><b>STRAIGHT LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_LEFT(5, "STRAIGHT_LEFT", "STRAIGHT_LEFT"),

	/**
	 * The '<em><b>STRAIGHT RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_RIGHT(6, "STRAIGHT_RIGHT", "STRAIGHT_RIGHT"),

	/**
	 * The '<em><b>LEFT RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_RIGHT(7, "LEFT_RIGHT", "LEFT_RIGHT");

	/**
	 * The '<em><b>STRAIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_VALUE = 0;

	/**
	 * The '<em><b>TURN RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TURN_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>TURN LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TURN_LEFT_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>STRAIGHT TURNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_TURNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_TURNS_VALUE = 4;

	/**
	 * The '<em><b>STRAIGHT LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_LEFT_VALUE = 5;

	/**
	 * The '<em><b>STRAIGHT RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>LEFT RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_RIGHT_VALUE = 7;

	/**
	 * An array of all the '<em><b>Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DirectionType[] VALUES_ARRAY =
		new DirectionType[] {
			STRAIGHT,
			TURN_RIGHT,
			TURN_LEFT,
			OTHER,
			STRAIGHT_TURNS,
			STRAIGHT_LEFT,
			STRAIGHT_RIGHT,
			LEFT_RIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DirectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DirectionType get(int value) {
		switch (value) {
			case STRAIGHT_VALUE: return STRAIGHT;
			case TURN_RIGHT_VALUE: return TURN_RIGHT;
			case TURN_LEFT_VALUE: return TURN_LEFT;
			case OTHER_VALUE: return OTHER;
			case STRAIGHT_TURNS_VALUE: return STRAIGHT_TURNS;
			case STRAIGHT_LEFT_VALUE: return STRAIGHT_LEFT;
			case STRAIGHT_RIGHT_VALUE: return STRAIGHT_RIGHT;
			case LEFT_RIGHT_VALUE: return LEFT_RIGHT;
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
	private DirectionType(int value, String name, String literal) {
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
	
} //DirectionType
