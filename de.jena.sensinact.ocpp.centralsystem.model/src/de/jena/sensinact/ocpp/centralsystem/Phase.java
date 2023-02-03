/*
 */
package de.jena.sensinact.ocpp.centralsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phase</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getPhase()
 * @model extendedMetaData="name='Phase'"
 * @generated
 */
@ProviderType
public enum Phase implements Enumerator {
	/**
	 * The '<em><b>L1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1_VALUE
	 * @generated
	 * @ordered
	 */
	L1(0, "L1", "L1"),

	/**
	 * The '<em><b>L2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2_VALUE
	 * @generated
	 * @ordered
	 */
	L2(1, "L2", "L2"),

	/**
	 * The '<em><b>L3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3_VALUE
	 * @generated
	 * @ordered
	 */
	L3(2, "L3", "L3"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(3, "N", "N"),

	/**
	 * The '<em><b>L1N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1N_VALUE
	 * @generated
	 * @ordered
	 */
	L1N(4, "L1N", "L1-N"),

	/**
	 * The '<em><b>L2N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2N_VALUE
	 * @generated
	 * @ordered
	 */
	L2N(5, "L2N", "L2-N"),

	/**
	 * The '<em><b>L3N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3N_VALUE
	 * @generated
	 * @ordered
	 */
	L3N(6, "L3N", "L3-N"),

	/**
	 * The '<em><b>L1L2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1L2_VALUE
	 * @generated
	 * @ordered
	 */
	L1L2(7, "L1L2", "L1-L2"),

	/**
	 * The '<em><b>L2L3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2L3_VALUE
	 * @generated
	 * @ordered
	 */
	L2L3(8, "L2L3", "L2-L3"),

	/**
	 * The '<em><b>L3L1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3L1_VALUE
	 * @generated
	 * @ordered
	 */
	L3L1(9, "L3L1", "L3-L1");

	/**
	 * The '<em><b>L1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L1_VALUE = 0;

	/**
	 * The '<em><b>L2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L2_VALUE = 1;

	/**
	 * The '<em><b>L3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L3_VALUE = 2;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 3;

	/**
	 * The '<em><b>L1N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1N
	 * @model literal="L1-N"
	 * @generated
	 * @ordered
	 */
	public static final int L1N_VALUE = 4;

	/**
	 * The '<em><b>L2N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2N
	 * @model literal="L2-N"
	 * @generated
	 * @ordered
	 */
	public static final int L2N_VALUE = 5;

	/**
	 * The '<em><b>L3N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3N
	 * @model literal="L3-N"
	 * @generated
	 * @ordered
	 */
	public static final int L3N_VALUE = 6;

	/**
	 * The '<em><b>L1L2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L1L2
	 * @model literal="L1-L2"
	 * @generated
	 * @ordered
	 */
	public static final int L1L2_VALUE = 7;

	/**
	 * The '<em><b>L2L3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L2L3
	 * @model literal="L2-L3"
	 * @generated
	 * @ordered
	 */
	public static final int L2L3_VALUE = 8;

	/**
	 * The '<em><b>L3L1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L3L1
	 * @model literal="L3-L1"
	 * @generated
	 * @ordered
	 */
	public static final int L3L1_VALUE = 9;

	/**
	 * An array of all the '<em><b>Phase</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Phase[] VALUES_ARRAY =
		new Phase[] {
			L1,
			L2,
			L3,
			N,
			L1N,
			L2N,
			L3N,
			L1L2,
			L2L3,
			L3L1,
		};

	/**
	 * A public read-only list of all the '<em><b>Phase</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Phase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Phase</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Phase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Phase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phase</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Phase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Phase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phase</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Phase get(int value) {
		switch (value) {
			case L1_VALUE: return L1;
			case L2_VALUE: return L2;
			case L3_VALUE: return L3;
			case N_VALUE: return N;
			case L1N_VALUE: return L1N;
			case L2N_VALUE: return L2N;
			case L3N_VALUE: return L3N;
			case L1L2_VALUE: return L1L2;
			case L2L3_VALUE: return L2L3;
			case L3L1_VALUE: return L3L1;
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
	private Phase(int value, String name, String literal) {
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
	
} //Phase
