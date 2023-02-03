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
 * A representation of the literals of the enumeration '<em><b>Reading Context</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getReadingContext()
 * @model extendedMetaData="name='ReadingContext'"
 * @generated
 */
@ProviderType
public enum ReadingContext implements Enumerator {
	/**
	 * The '<em><b>Interruption Begin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPTION_BEGIN_VALUE
	 * @generated
	 * @ordered
	 */
	INTERRUPTION_BEGIN(0, "InterruptionBegin", "Interruption.Begin"),

	/**
	 * The '<em><b>Interruption End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPTION_END_VALUE
	 * @generated
	 * @ordered
	 */
	INTERRUPTION_END(1, "InterruptionEnd", "Interruption.End"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "Other", "Other"),

	/**
	 * The '<em><b>Sample Clock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_CLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE_CLOCK(3, "SampleClock", "Sample.Clock"),

	/**
	 * The '<em><b>Sample Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_PERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE_PERIODIC(4, "SamplePeriodic", "Sample.Periodic"),

	/**
	 * The '<em><b>Transaction Begin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_BEGIN_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_BEGIN(5, "TransactionBegin", "Transaction.Begin"),

	/**
	 * The '<em><b>Transaction End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_END_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_END(6, "TransactionEnd", "Transaction.End"),

	/**
	 * The '<em><b>Trigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER(7, "Trigger", "Trigger");

	/**
	 * The '<em><b>Interruption Begin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPTION_BEGIN
	 * @model name="InterruptionBegin" literal="Interruption.Begin"
	 * @generated
	 * @ordered
	 */
	public static final int INTERRUPTION_BEGIN_VALUE = 0;

	/**
	 * The '<em><b>Interruption End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPTION_END
	 * @model name="InterruptionEnd" literal="Interruption.End"
	 * @generated
	 * @ordered
	 */
	public static final int INTERRUPTION_END_VALUE = 1;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Sample Clock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_CLOCK
	 * @model name="SampleClock" literal="Sample.Clock"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_CLOCK_VALUE = 3;

	/**
	 * The '<em><b>Sample Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_PERIODIC
	 * @model name="SamplePeriodic" literal="Sample.Periodic"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_PERIODIC_VALUE = 4;

	/**
	 * The '<em><b>Transaction Begin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_BEGIN
	 * @model name="TransactionBegin" literal="Transaction.Begin"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_BEGIN_VALUE = 5;

	/**
	 * The '<em><b>Transaction End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_END
	 * @model name="TransactionEnd" literal="Transaction.End"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_END_VALUE = 6;

	/**
	 * The '<em><b>Trigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER
	 * @model name="Trigger"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Reading Context</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReadingContext[] VALUES_ARRAY =
		new ReadingContext[] {
			INTERRUPTION_BEGIN,
			INTERRUPTION_END,
			OTHER,
			SAMPLE_CLOCK,
			SAMPLE_PERIODIC,
			TRANSACTION_BEGIN,
			TRANSACTION_END,
			TRIGGER,
		};

	/**
	 * A public read-only list of all the '<em><b>Reading Context</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReadingContext> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reading Context</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReadingContext get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadingContext result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reading Context</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReadingContext getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadingContext result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reading Context</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReadingContext get(int value) {
		switch (value) {
			case INTERRUPTION_BEGIN_VALUE: return INTERRUPTION_BEGIN;
			case INTERRUPTION_END_VALUE: return INTERRUPTION_END;
			case OTHER_VALUE: return OTHER;
			case SAMPLE_CLOCK_VALUE: return SAMPLE_CLOCK;
			case SAMPLE_PERIODIC_VALUE: return SAMPLE_PERIODIC;
			case TRANSACTION_BEGIN_VALUE: return TRANSACTION_BEGIN;
			case TRANSACTION_END_VALUE: return TRANSACTION_END;
			case TRIGGER_VALUE: return TRIGGER;
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
	private ReadingContext(int value, String name, String literal) {
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
	
} //ReadingContext
