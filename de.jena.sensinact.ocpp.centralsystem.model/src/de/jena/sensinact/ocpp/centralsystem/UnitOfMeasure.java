/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Of Measure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getUnitOfMeasure()
 * @model extendedMetaData="name='UnitOfMeasure'"
 * @generated
 */
public enum UnitOfMeasure implements Enumerator {
	/**
	 * The '<em><b>Celsius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
	CELSIUS(0, "Celsius", "Celsius"),

	/**
	 * The '<em><b>Fahrenheit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAHRENHEIT_VALUE
	 * @generated
	 * @ordered
	 */
	FAHRENHEIT(1, "Fahrenheit", "Fahrenheit"),

	/**
	 * The '<em><b>Wh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WH_VALUE
	 * @generated
	 * @ordered
	 */
	WH(2, "Wh", "Wh"),

	/**
	 * The '<em><b>KWh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWH_VALUE
	 * @generated
	 * @ordered
	 */
	KWH(3, "kWh", "kWh"),

	/**
	 * The '<em><b>Varh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARH_VALUE
	 * @generated
	 * @ordered
	 */
	VARH(4, "varh", "varh"),

	/**
	 * The '<em><b>Kvarh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVARH_VALUE
	 * @generated
	 * @ordered
	 */
	KVARH(5, "kvarh", "kvarh"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(6, "W", "W"),

	/**
	 * The '<em><b>KW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KW_VALUE
	 * @generated
	 * @ordered
	 */
	KW(7, "kW", "kW"),

	/**
	 * The '<em><b>VA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(8, "VA", "VA"),

	/**
	 * The '<em><b>KVA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVA_VALUE
	 * @generated
	 * @ordered
	 */
	KVA(9, "kVA", "kVA"),

	/**
	 * The '<em><b>Var</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_VALUE
	 * @generated
	 * @ordered
	 */
	VAR(10, "var", "var"),

	/**
	 * The '<em><b>Kvar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVAR_VALUE
	 * @generated
	 * @ordered
	 */
	KVAR(11, "kvar", "kvar"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(12, "A", "A"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(13, "V", "V"),

	/**
	 * The '<em><b>K</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #K_VALUE
	 * @generated
	 * @ordered
	 */
	K(14, "K", "K"),

	/**
	 * The '<em><b>Percent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENT(15, "Percent", "Percent");

	/**
	 * The '<em><b>Celsius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELSIUS
	 * @model name="Celsius"
	 * @generated
	 * @ordered
	 */
	public static final int CELSIUS_VALUE = 0;

	/**
	 * The '<em><b>Fahrenheit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAHRENHEIT
	 * @model name="Fahrenheit"
	 * @generated
	 * @ordered
	 */
	public static final int FAHRENHEIT_VALUE = 1;

	/**
	 * The '<em><b>Wh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WH
	 * @model name="Wh"
	 * @generated
	 * @ordered
	 */
	public static final int WH_VALUE = 2;

	/**
	 * The '<em><b>KWh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWH
	 * @model name="kWh"
	 * @generated
	 * @ordered
	 */
	public static final int KWH_VALUE = 3;

	/**
	 * The '<em><b>Varh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARH
	 * @model name="varh"
	 * @generated
	 * @ordered
	 */
	public static final int VARH_VALUE = 4;

	/**
	 * The '<em><b>Kvarh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVARH
	 * @model name="kvarh"
	 * @generated
	 * @ordered
	 */
	public static final int KVARH_VALUE = 5;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 6;

	/**
	 * The '<em><b>KW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KW
	 * @model name="kW"
	 * @generated
	 * @ordered
	 */
	public static final int KW_VALUE = 7;

	/**
	 * The '<em><b>VA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VA_VALUE = 8;

	/**
	 * The '<em><b>KVA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVA
	 * @model name="kVA"
	 * @generated
	 * @ordered
	 */
	public static final int KVA_VALUE = 9;

	/**
	 * The '<em><b>Var</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR
	 * @model name="var"
	 * @generated
	 * @ordered
	 */
	public static final int VAR_VALUE = 10;

	/**
	 * The '<em><b>Kvar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVAR
	 * @model name="kvar"
	 * @generated
	 * @ordered
	 */
	public static final int KVAR_VALUE = 11;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 12;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 13;

	/**
	 * The '<em><b>K</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #K
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int K_VALUE = 14;

	/**
	 * The '<em><b>Percent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENT
	 * @model name="Percent"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENT_VALUE = 15;

	/**
	 * An array of all the '<em><b>Unit Of Measure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitOfMeasure[] VALUES_ARRAY =
		new UnitOfMeasure[] {
			CELSIUS,
			FAHRENHEIT,
			WH,
			KWH,
			VARH,
			KVARH,
			W,
			KW,
			VA,
			KVA,
			VAR,
			KVAR,
			A,
			V,
			K,
			PERCENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Of Measure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitOfMeasure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Of Measure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitOfMeasure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitOfMeasure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Of Measure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitOfMeasure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitOfMeasure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Of Measure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitOfMeasure get(int value) {
		switch (value) {
			case CELSIUS_VALUE: return CELSIUS;
			case FAHRENHEIT_VALUE: return FAHRENHEIT;
			case WH_VALUE: return WH;
			case KWH_VALUE: return KWH;
			case VARH_VALUE: return VARH;
			case KVARH_VALUE: return KVARH;
			case W_VALUE: return W;
			case KW_VALUE: return KW;
			case VA_VALUE: return VA;
			case KVA_VALUE: return KVA;
			case VAR_VALUE: return VAR;
			case KVAR_VALUE: return KVAR;
			case A_VALUE: return A;
			case V_VALUE: return V;
			case K_VALUE: return K;
			case PERCENT_VALUE: return PERCENT;
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
	private UnitOfMeasure(int value, String name, String literal) {
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
	
} //UnitOfMeasure
