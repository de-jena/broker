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
 * A representation of the literals of the enumeration '<em><b>Public Transport Door Change Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getPublicTransportDoorChangeType()
 * @model
 * @generated
 */
@ProviderType
public enum PublicTransportDoorChangeType implements Enumerator {
	/**
	 * The '<em><b>DOOR CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	DOOR_CLOSE(0, "DOOR_CLOSE", "DOOR_CLOSE"),

	/**
	 * The '<em><b>DOOR OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	DOOR_OPEN(1, "DOOR_OPEN", "DOOR_OPEN");

	/**
	 * The '<em><b>DOOR CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_CLOSE_VALUE = 0;

	/**
	 * The '<em><b>DOOR OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_OPEN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Public Transport Door Change Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PublicTransportDoorChangeType[] VALUES_ARRAY =
		new PublicTransportDoorChangeType[] {
			DOOR_CLOSE,
			DOOR_OPEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Public Transport Door Change Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PublicTransportDoorChangeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Public Transport Door Change Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicTransportDoorChangeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublicTransportDoorChangeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Public Transport Door Change Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicTransportDoorChangeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PublicTransportDoorChangeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Public Transport Door Change Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PublicTransportDoorChangeType get(int value) {
		switch (value) {
			case DOOR_CLOSE_VALUE: return DOOR_CLOSE;
			case DOOR_OPEN_VALUE: return DOOR_OPEN;
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
	private PublicTransportDoorChangeType(int value, String name, String literal) {
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
	
} //PublicTransportDoorChangeType
