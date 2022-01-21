/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Authorization Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the authorization-status-value
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getAuthorizationStatus()
 * @model extendedMetaData="name='AuthorizationStatus'"
 * @generated
 */
public enum AuthorizationStatus implements Enumerator {
	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(0, "Accepted", "Accepted"),

	/**
	 * The '<em><b>Blocked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED(1, "Blocked", "Blocked"),

	/**
	 * The '<em><b>Expired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPIRED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRED(2, "Expired", "Expired"),

	/**
	 * The '<em><b>Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID(3, "Invalid", "Invalid"),

	/**
	 * The '<em><b>Concurrent Tx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_TX_VALUE
	 * @generated
	 * @ordered
	 */
	CONCURRENT_TX(4, "ConcurrentTx", "ConcurrentTx");

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model name="Accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 0;

	/**
	 * The '<em><b>Blocked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED
	 * @model name="Blocked"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_VALUE = 1;

	/**
	 * The '<em><b>Expired</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPIRED
	 * @model name="Expired"
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRED_VALUE = 2;

	/**
	 * The '<em><b>Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID
	 * @model name="Invalid"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE = 3;

	/**
	 * The '<em><b>Concurrent Tx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_TX
	 * @model name="ConcurrentTx"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT_TX_VALUE = 4;

	/**
	 * An array of all the '<em><b>Authorization Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuthorizationStatus[] VALUES_ARRAY =
		new AuthorizationStatus[] {
			ACCEPTED,
			BLOCKED,
			EXPIRED,
			INVALID,
			CONCURRENT_TX,
		};

	/**
	 * A public read-only list of all the '<em><b>Authorization Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuthorizationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Authorization Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthorizationStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuthorizationStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Authorization Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthorizationStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuthorizationStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Authorization Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthorizationStatus get(int value) {
		switch (value) {
			case ACCEPTED_VALUE: return ACCEPTED;
			case BLOCKED_VALUE: return BLOCKED;
			case EXPIRED_VALUE: return EXPIRED;
			case INVALID_VALUE: return INVALID;
			case CONCURRENT_TX_VALUE: return CONCURRENT_TX;
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
	private AuthorizationStatus(int value, String name, String literal) {
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
	
} //AuthorizationStatus
