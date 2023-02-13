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
 * A representation of the literals of the enumeration '<em><b>Life Cycle Device Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getLifeCycleDeviceType()
 * @model
 * @generated
 */
@ProviderType
public enum LifeCycleDeviceType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>LOADING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADING_VALUE
	 * @generated
	 * @ordered
	 */
	LOADING(1, "LOADING", "LOADING"),

	/**
	 * The '<em><b>PROVISIONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISIONED_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISIONED(2, "PROVISIONED", "PROVISIONED"),

	/**
	 * The '<em><b>UNPROVISIONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPROVISIONED_VALUE
	 * @generated
	 * @ordered
	 */
	UNPROVISIONED(3, "UNPROVISIONED", "UNPROVISIONED"),

	/**
	 * The '<em><b>RUNNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING(4, "RUNNING", "RUNNING"),

	/**
	 * The '<em><b>ON ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ERROR(6, "ON_ERROR", "ON_ERROR"),

	/**
	 * The '<em><b>EXCEPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTIONAL(5, "EXCEPTIONAL", "EXCEPTIONAL");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>LOADING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOADING_VALUE = 1;

	/**
	 * The '<em><b>PROVISIONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISIONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROVISIONED_VALUE = 2;

	/**
	 * The '<em><b>UNPROVISIONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPROVISIONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNPROVISIONED_VALUE = 3;

	/**
	 * The '<em><b>RUNNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING_VALUE = 4;

	/**
	 * The '<em><b>ON ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_ERROR_VALUE = 6;

	/**
	 * The '<em><b>EXCEPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTIONAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Life Cycle Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifeCycleDeviceType[] VALUES_ARRAY =
		new LifeCycleDeviceType[] {
			NONE,
			LOADING,
			PROVISIONED,
			UNPROVISIONED,
			RUNNING,
			ON_ERROR,
			EXCEPTIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Life Cycle Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifeCycleDeviceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Life Cycle Device Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifeCycleDeviceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifeCycleDeviceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Life Cycle Device Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifeCycleDeviceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifeCycleDeviceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Life Cycle Device Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifeCycleDeviceType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LOADING_VALUE: return LOADING;
			case PROVISIONED_VALUE: return PROVISIONED;
			case UNPROVISIONED_VALUE: return UNPROVISIONED;
			case RUNNING_VALUE: return RUNNING;
			case ON_ERROR_VALUE: return ON_ERROR;
			case EXCEPTIONAL_VALUE: return EXCEPTIONAL;
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
	private LifeCycleDeviceType(int value, String name, String literal) {
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
	
} //LifeCycleDeviceType
