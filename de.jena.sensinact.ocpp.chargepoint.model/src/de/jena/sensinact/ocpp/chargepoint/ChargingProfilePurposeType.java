/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Charging Profile Purpose Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the charging-profile-purpose-type-value
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getChargingProfilePurposeType()
 * @model extendedMetaData="name='ChargingProfilePurposeType'"
 * @generated
 */
public enum ChargingProfilePurposeType implements Enumerator {
	/**
	 * The '<em><b>Charge Point Max Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_POINT_MAX_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_POINT_MAX_PROFILE(0, "ChargePointMaxProfile", "ChargePointMaxProfile"),

	/**
	 * The '<em><b>Tx Default Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TX_DEFAULT_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	TX_DEFAULT_PROFILE(1, "TxDefaultProfile", "TxDefaultProfile"),

	/**
	 * The '<em><b>Tx Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TX_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	TX_PROFILE(2, "TxProfile", "TxProfile");

	/**
	 * The '<em><b>Charge Point Max Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_POINT_MAX_PROFILE
	 * @model name="ChargePointMaxProfile"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_POINT_MAX_PROFILE_VALUE = 0;

	/**
	 * The '<em><b>Tx Default Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TX_DEFAULT_PROFILE
	 * @model name="TxDefaultProfile"
	 * @generated
	 * @ordered
	 */
	public static final int TX_DEFAULT_PROFILE_VALUE = 1;

	/**
	 * The '<em><b>Tx Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TX_PROFILE
	 * @model name="TxProfile"
	 * @generated
	 * @ordered
	 */
	public static final int TX_PROFILE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Charging Profile Purpose Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChargingProfilePurposeType[] VALUES_ARRAY =
		new ChargingProfilePurposeType[] {
			CHARGE_POINT_MAX_PROFILE,
			TX_DEFAULT_PROFILE,
			TX_PROFILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Charging Profile Purpose Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChargingProfilePurposeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Charging Profile Purpose Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargingProfilePurposeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargingProfilePurposeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charging Profile Purpose Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargingProfilePurposeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargingProfilePurposeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charging Profile Purpose Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargingProfilePurposeType get(int value) {
		switch (value) {
			case CHARGE_POINT_MAX_PROFILE_VALUE: return CHARGE_POINT_MAX_PROFILE;
			case TX_DEFAULT_PROFILE_VALUE: return TX_DEFAULT_PROFILE;
			case TX_PROFILE_VALUE: return TX_PROFILE;
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
	private ChargingProfilePurposeType(int value, String name, String literal) {
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
	
} //ChargingProfilePurposeType
