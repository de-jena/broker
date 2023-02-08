/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TL Module Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLModuleType()
 * @model
 * @generated
 */
@ProviderType
public enum TLModuleType implements Enumerator {
	/**
	 * The '<em><b>LML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LML_VALUE
	 * @generated
	 * @ordered
	 */
	LML(0, "LML", "LML"),

	/**
	 * The '<em><b>FDL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FDL_VALUE
	 * @generated
	 * @ordered
	 */
	FDL(1, "FDL", "FDL");

	/**
	 * The '<em><b>LML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LML_VALUE = 0;

	/**
	 * The '<em><b>FDL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FDL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FDL_VALUE = 1;

	/**
	 * An array of all the '<em><b>TL Module Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TLModuleType[] VALUES_ARRAY =
		new TLModuleType[] {
			LML,
			FDL,
		};

	/**
	 * A public read-only list of all the '<em><b>TL Module Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TLModuleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TL Module Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TLModuleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TLModuleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TL Module Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TLModuleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TLModuleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TL Module Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TLModuleType get(int value) {
		switch (value) {
			case LML_VALUE: return LML;
			case FDL_VALUE: return FDL;
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
	private TLModuleType(int value, String name, String literal) {
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
	
} //TLModuleType
