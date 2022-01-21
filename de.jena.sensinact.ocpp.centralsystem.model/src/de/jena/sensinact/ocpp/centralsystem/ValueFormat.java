/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Value Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getValueFormat()
 * @model extendedMetaData="name='ValueFormat'"
 * @generated
 */
public enum ValueFormat implements Enumerator {
	/**
	 * The '<em><b>Raw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_VALUE
	 * @generated
	 * @ordered
	 */
	RAW(0, "Raw", "Raw"),

	/**
	 * The '<em><b>Signed Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED_DATA(1, "SignedData", "SignedData");

	/**
	 * The '<em><b>Raw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW
	 * @model name="Raw"
	 * @generated
	 * @ordered
	 */
	public static final int RAW_VALUE = 0;

	/**
	 * The '<em><b>Signed Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_DATA
	 * @model name="SignedData"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_DATA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Value Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValueFormat[] VALUES_ARRAY =
		new ValueFormat[] {
			RAW,
			SIGNED_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Value Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValueFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Value Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueFormat get(int value) {
		switch (value) {
			case RAW_VALUE: return RAW;
			case SIGNED_DATA_VALUE: return SIGNED_DATA;
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
	private ValueFormat(int value, String name, String literal) {
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
	
} //ValueFormat
