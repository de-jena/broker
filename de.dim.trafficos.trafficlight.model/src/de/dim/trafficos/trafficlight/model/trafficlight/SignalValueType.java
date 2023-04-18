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
 * A representation of the literals of the enumeration '<em><b>Signal Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getSignalValueType()
 * @model
 * @generated
 */
@ProviderType
public enum SignalValueType implements Enumerator {
	/**
	 * The '<em><b>RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(0, "RED", "RED"),

	/**
	 * The '<em><b>AMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBER_VALUE
	 * @generated
	 * @ordered
	 */
	AMBER(1, "AMBER", "AMBER"),

	/**
	 * The '<em><b>GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(2, "GREEN", "GREEN"),

	/**
	 * The '<em><b>SIGNAL IS COMING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_IS_COMING_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL_IS_COMING(3, "SIGNAL_IS_COMING", "SIGNAL_IS_COMING"),

	/**
	 * The '<em><b>ORIENTATION SOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIENTATION_SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	ORIENTATION_SOUND(4, "ORIENTATION_SOUND", "ORIENTATION_SOUND");

	/**
	 * The '<em><b>RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 0;

	/**
	 * The '<em><b>AMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMBER_VALUE = 1;

	/**
	 * The '<em><b>GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 2;

	/**
	 * The '<em><b>SIGNAL IS COMING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_IS_COMING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_IS_COMING_VALUE = 3;

	/**
	 * The '<em><b>ORIENTATION SOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIENTATION_SOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORIENTATION_SOUND_VALUE = 4;

	/**
	 * An array of all the '<em><b>Signal Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SignalValueType[] VALUES_ARRAY =
		new SignalValueType[] {
			RED,
			AMBER,
			GREEN,
			SIGNAL_IS_COMING,
			ORIENTATION_SOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Signal Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SignalValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Signal Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SignalValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Signal Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SignalValueType get(int value) {
		switch (value) {
			case RED_VALUE: return RED;
			case AMBER_VALUE: return AMBER;
			case GREEN_VALUE: return GREEN;
			case SIGNAL_IS_COMING_VALUE: return SIGNAL_IS_COMING;
			case ORIENTATION_SOUND_VALUE: return ORIENTATION_SOUND;
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
	private SignalValueType(int value, String name, String literal) {
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
	
} //SignalValueType
