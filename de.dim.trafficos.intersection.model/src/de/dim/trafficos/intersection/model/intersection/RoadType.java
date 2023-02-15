/*
 */
package de.dim.trafficos.intersection.model.intersection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Road Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getRoadType()
 * @model
 * @generated
 */
@ProviderType
public enum RoadType implements Enumerator {
	/**
	 * The '<em><b>MAIN STRAIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. There is just one lane and it is for going straight. No other direction is possible.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT(0, "MAIN_STRAIGHT", "MAIN_STRAIGHT"),

	/**
	 * The '<em><b>MAIN STRAIGHT RIGHT SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn right, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_RIGHT_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT_RIGHT_SEP(1, "MAIN_STRAIGHT_RIGHT_SEP", "MAIN_STRAIGHT_RIGHT_SEP"),

	/**
	 * The '<em><b>MAIN STRAIGHT RIGHT MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn right, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_RIGHT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT_RIGHT_MERGE(2, "MAIN_STRAIGHT_RIGHT_MERGE", "MAIN_STRAIGHT_RIGHT_MERGE"),

	/**
	 * The '<em><b>MAIN STRAIGHT LEFT SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn left, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_LEFT_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT_LEFT_SEP(3, "MAIN_STRAIGHT_LEFT_SEP", "MAIN_STRAIGHT_LEFT_SEP"),

	/**
	 * The '<em><b>MAIN STRAIGHT LEFT MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn left, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_LEFT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT_LEFT_MERGE(4, "MAIN_STRAIGHT_LEFT_MERGE", "MAIN_STRAIGHT_LEFT_MERGE"),

	/**
	 * The '<em><b>MAIN LEFT RIGHT SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can turn either right or left and there are two separated lanes for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #MAIN_LEFT_RIGHT_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_LEFT_RIGHT_SEP(5, "MAIN_LEFT_RIGHT_SEP", "MAIN_LEFT_RIGHT_SEP"),

	/**
	 * The '<em><b>MAIN LEFT RIGHT MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can turn either right or left and there is just a common lane for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #MAIN_LEFT_RIGHT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_LEFT_RIGHT_MERGE(6, "MAIN_LEFT_RIGHT_MERGE", "MAIN_LEFT_RIGHT_MERGE"),

	/**
	 * The '<em><b>MAIN STRAIGHT TURNS SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go straight and turn either right or left and there are threee separated lanes for the three directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_TURNS_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT_TURNS_SEP(7, "MAIN_STRAIGHT_TURNS_SEP", "MAIN_STRAIGHT_TURNS_SEP"),

	/**
	 * The '<em><b>MAIN STRAIGHT TURNS MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go straight or turn either right or left and there is just a common lane for the three directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_TURNS_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_STRAIGHT_TURNS_MERGE(8, "MAIN_STRAIGHT_TURNS_MERGE", "MAIN_STRAIGHT_TURNS_MERGE"),

	/**
	 * The '<em><b>SEC STRAIGHT RIGHT SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn right, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_RIGHT_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_STRAIGHT_RIGHT_SEP(9, "SEC_STRAIGHT_RIGHT_SEP", "SEC_STRAIGHT_RIGHT_SEP"),

	/**
	 * The '<em><b>SEC STRAIGHT RIGHT MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go both straight and turn right, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_RIGHT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_STRAIGHT_RIGHT_MERGE(10, "SEC_STRAIGHT_RIGHT_MERGE", "SEC_STRAIGHT_RIGHT_MERGE"),

	/**
	 * The '<em><b>SEC STRAIGHT LEFT SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go both straight and turn left, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_LEFT_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_STRAIGHT_LEFT_SEP(11, "SEC_STRAIGHT_LEFT_SEP", "SEC_STRAIGHT_LEFT_SEP"),

	/**
	 * The '<em><b>SEC STRAIGHT LEFT MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go both straight and turn left, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_LEFT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_STRAIGHT_LEFT_MERGE(12, "SEC_STRAIGHT_LEFT_MERGE", "SEC_STRAIGHT_LEFT_MERGE"),

	/**
	 * The '<em><b>SEC LEFT RIGHT SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can turn either right or left and there are two separated lanes for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #SEC_LEFT_RIGHT_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_LEFT_RIGHT_SEP(13, "SEC_LEFT_RIGHT_SEP", "SEC_LEFT_RIGHT_SEP"),

	/**
	 * The '<em><b>SEC LEFT RIGHT MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can turn either right or left and there is just a common lane for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #SEC_LEFT_RIGHT_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_LEFT_RIGHT_MERGE(14, "SEC_LEFT_RIGHT_MERGE", "SEC_LEFT_RIGHT_MERGE"),

	/**
	 * The '<em><b>SEC STRAIGHT TURNS SEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go straight and turn either right or left and there are threee separated lanes for the three directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_TURNS_SEP_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_STRAIGHT_TURNS_SEP(15, "SEC_STRAIGHT_TURNS_SEP", "SEC_STRAIGHT_TURNS_SEP"),

	/**
	 * The '<em><b>SEC STRAIGHT TURNS MERGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go straight or turn either right or left and there is just a common lane for the three directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_TURNS_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEC_STRAIGHT_TURNS_MERGE(16, "SEC_STRAIGHT_TURNS_MERGE", "SEC_STRAIGHT_TURNS_MERGE");

	/**
	 * The '<em><b>MAIN STRAIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. There is just one lane and it is for going straight. No other direction is possible.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_VALUE = 0;

	/**
	 * The '<em><b>MAIN STRAIGHT RIGHT SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn right, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_RIGHT_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_RIGHT_SEP_VALUE = 1;

	/**
	 * The '<em><b>MAIN STRAIGHT RIGHT MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn right, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_RIGHT_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_RIGHT_MERGE_VALUE = 2;

	/**
	 * The '<em><b>MAIN STRAIGHT LEFT SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn left, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_LEFT_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_LEFT_SEP_VALUE = 3;

	/**
	 * The '<em><b>MAIN STRAIGHT LEFT MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn left, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_LEFT_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_LEFT_MERGE_VALUE = 4;

	/**
	 * The '<em><b>MAIN LEFT RIGHT SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can turn either right or left and there are two separated lanes for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #MAIN_LEFT_RIGHT_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_LEFT_RIGHT_SEP_VALUE = 5;

	/**
	 * The '<em><b>MAIN LEFT RIGHT MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can turn either right or left and there is just a common lane for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #MAIN_LEFT_RIGHT_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_LEFT_RIGHT_MERGE_VALUE = 6;

	/**
	 * The '<em><b>MAIN STRAIGHT TURNS SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go straight and turn either right or left and there are threee separated lanes for the three directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_TURNS_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_TURNS_SEP_VALUE = 7;

	/**
	 * The '<em><b>MAIN STRAIGHT TURNS MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go straight or turn either right or left and there is just a common lane for the three directions.
	 * <!-- end-model-doc -->
	 * @see #MAIN_STRAIGHT_TURNS_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_STRAIGHT_TURNS_MERGE_VALUE = 8;

	/**
	 * The '<em><b>SEC STRAIGHT RIGHT SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main road. You can go both straight and turn right, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_RIGHT_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_STRAIGHT_RIGHT_SEP_VALUE = 9;

	/**
	 * The '<em><b>SEC STRAIGHT RIGHT MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go both straight and turn right, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_RIGHT_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_STRAIGHT_RIGHT_MERGE_VALUE = 10;

	/**
	 * The '<em><b>SEC STRAIGHT LEFT SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go both straight and turn left, and there are separated lanes for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_LEFT_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_STRAIGHT_LEFT_SEP_VALUE = 11;

	/**
	 * The '<em><b>SEC STRAIGHT LEFT MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go both straight and turn left, and there is just one common lane for the two directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_LEFT_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_STRAIGHT_LEFT_MERGE_VALUE = 12;

	/**
	 * The '<em><b>SEC LEFT RIGHT SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can turn either right or left and there are two separated lanes for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #SEC_LEFT_RIGHT_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_LEFT_RIGHT_SEP_VALUE = 13;

	/**
	 * The '<em><b>SEC LEFT RIGHT MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can turn either right or left and there is just a common lane for the two directions. You cannot go straight.
	 * <!-- end-model-doc -->
	 * @see #SEC_LEFT_RIGHT_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_LEFT_RIGHT_MERGE_VALUE = 14;

	/**
	 * The '<em><b>SEC STRAIGHT TURNS SEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go straight and turn either right or left and there are threee separated lanes for the three directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_TURNS_SEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_STRAIGHT_TURNS_SEP_VALUE = 15;

	/**
	 * The '<em><b>SEC STRAIGHT TURNS MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secondary road. You can go straight or turn either right or left and there is just a common lane for the three directions.
	 * <!-- end-model-doc -->
	 * @see #SEC_STRAIGHT_TURNS_MERGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEC_STRAIGHT_TURNS_MERGE_VALUE = 16;

	/**
	 * An array of all the '<em><b>Road Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoadType[] VALUES_ARRAY =
		new RoadType[] {
			MAIN_STRAIGHT,
			MAIN_STRAIGHT_RIGHT_SEP,
			MAIN_STRAIGHT_RIGHT_MERGE,
			MAIN_STRAIGHT_LEFT_SEP,
			MAIN_STRAIGHT_LEFT_MERGE,
			MAIN_LEFT_RIGHT_SEP,
			MAIN_LEFT_RIGHT_MERGE,
			MAIN_STRAIGHT_TURNS_SEP,
			MAIN_STRAIGHT_TURNS_MERGE,
			SEC_STRAIGHT_RIGHT_SEP,
			SEC_STRAIGHT_RIGHT_MERGE,
			SEC_STRAIGHT_LEFT_SEP,
			SEC_STRAIGHT_LEFT_MERGE,
			SEC_LEFT_RIGHT_SEP,
			SEC_LEFT_RIGHT_MERGE,
			SEC_STRAIGHT_TURNS_SEP,
			SEC_STRAIGHT_TURNS_MERGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Road Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoadType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Road Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoadType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoadType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Road Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoadType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoadType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Road Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoadType get(int value) {
		switch (value) {
			case MAIN_STRAIGHT_VALUE: return MAIN_STRAIGHT;
			case MAIN_STRAIGHT_RIGHT_SEP_VALUE: return MAIN_STRAIGHT_RIGHT_SEP;
			case MAIN_STRAIGHT_RIGHT_MERGE_VALUE: return MAIN_STRAIGHT_RIGHT_MERGE;
			case MAIN_STRAIGHT_LEFT_SEP_VALUE: return MAIN_STRAIGHT_LEFT_SEP;
			case MAIN_STRAIGHT_LEFT_MERGE_VALUE: return MAIN_STRAIGHT_LEFT_MERGE;
			case MAIN_LEFT_RIGHT_SEP_VALUE: return MAIN_LEFT_RIGHT_SEP;
			case MAIN_LEFT_RIGHT_MERGE_VALUE: return MAIN_LEFT_RIGHT_MERGE;
			case MAIN_STRAIGHT_TURNS_SEP_VALUE: return MAIN_STRAIGHT_TURNS_SEP;
			case MAIN_STRAIGHT_TURNS_MERGE_VALUE: return MAIN_STRAIGHT_TURNS_MERGE;
			case SEC_STRAIGHT_RIGHT_SEP_VALUE: return SEC_STRAIGHT_RIGHT_SEP;
			case SEC_STRAIGHT_RIGHT_MERGE_VALUE: return SEC_STRAIGHT_RIGHT_MERGE;
			case SEC_STRAIGHT_LEFT_SEP_VALUE: return SEC_STRAIGHT_LEFT_SEP;
			case SEC_STRAIGHT_LEFT_MERGE_VALUE: return SEC_STRAIGHT_LEFT_MERGE;
			case SEC_LEFT_RIGHT_SEP_VALUE: return SEC_LEFT_RIGHT_SEP;
			case SEC_LEFT_RIGHT_MERGE_VALUE: return SEC_LEFT_RIGHT_MERGE;
			case SEC_STRAIGHT_TURNS_SEP_VALUE: return SEC_STRAIGHT_TURNS_SEP;
			case SEC_STRAIGHT_TURNS_MERGE_VALUE: return SEC_STRAIGHT_TURNS_MERGE;
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
	private RoadType(int value, String name, String literal) {
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
	
} //RoadType
