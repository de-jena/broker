/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reason</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Reason for stopping a transaction
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getReason()
 * @model extendedMetaData="name='Reason'"
 * @generated
 */
public enum Reason implements Enumerator {
	/**
	 * The '<em><b>Emergency Stop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_STOP_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY_STOP(0, "EmergencyStop", "EmergencyStop"),

	/**
	 * The '<em><b>EV Disconnected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EV_DISCONNECTED_VALUE
	 * @generated
	 * @ordered
	 */
	EV_DISCONNECTED(1, "EVDisconnected", "EVDisconnected"),

	/**
	 * The '<em><b>Hard Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARD_RESET_VALUE
	 * @generated
	 * @ordered
	 */
	HARD_RESET(2, "HardReset", "HardReset"),

	/**
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(3, "Local", "Local"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "Other", "Other"),

	/**
	 * The '<em><b>Power Loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_LOSS(5, "PowerLoss", "PowerLoss"),

	/**
	 * The '<em><b>Reboot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REBOOT_VALUE
	 * @generated
	 * @ordered
	 */
	REBOOT(6, "Reboot", "Reboot"),

	/**
	 * The '<em><b>Remote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE(7, "Remote", "Remote"),

	/**
	 * The '<em><b>Soft Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT_RESET_VALUE
	 * @generated
	 * @ordered
	 */
	SOFT_RESET(8, "SoftReset", "SoftReset"),

	/**
	 * The '<em><b>Unlock Command</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCK_COMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	UNLOCK_COMMAND(9, "UnlockCommand", "UnlockCommand"),

	/**
	 * The '<em><b>De Authorized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_AUTHORIZED_VALUE
	 * @generated
	 * @ordered
	 */
	DE_AUTHORIZED(10, "DeAuthorized", "DeAuthorized");

	/**
	 * The '<em><b>Emergency Stop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_STOP
	 * @model name="EmergencyStop"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_STOP_VALUE = 0;

	/**
	 * The '<em><b>EV Disconnected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EV_DISCONNECTED
	 * @model name="EVDisconnected"
	 * @generated
	 * @ordered
	 */
	public static final int EV_DISCONNECTED_VALUE = 1;

	/**
	 * The '<em><b>Hard Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARD_RESET
	 * @model name="HardReset"
	 * @generated
	 * @ordered
	 */
	public static final int HARD_RESET_VALUE = 2;

	/**
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model name="Local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * The '<em><b>Power Loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_LOSS
	 * @model name="PowerLoss"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_LOSS_VALUE = 5;

	/**
	 * The '<em><b>Reboot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REBOOT
	 * @model name="Reboot"
	 * @generated
	 * @ordered
	 */
	public static final int REBOOT_VALUE = 6;

	/**
	 * The '<em><b>Remote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE
	 * @model name="Remote"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_VALUE = 7;

	/**
	 * The '<em><b>Soft Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT_RESET
	 * @model name="SoftReset"
	 * @generated
	 * @ordered
	 */
	public static final int SOFT_RESET_VALUE = 8;

	/**
	 * The '<em><b>Unlock Command</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCK_COMMAND
	 * @model name="UnlockCommand"
	 * @generated
	 * @ordered
	 */
	public static final int UNLOCK_COMMAND_VALUE = 9;

	/**
	 * The '<em><b>De Authorized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_AUTHORIZED
	 * @model name="DeAuthorized"
	 * @generated
	 * @ordered
	 */
	public static final int DE_AUTHORIZED_VALUE = 10;

	/**
	 * An array of all the '<em><b>Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Reason[] VALUES_ARRAY =
		new Reason[] {
			EMERGENCY_STOP,
			EV_DISCONNECTED,
			HARD_RESET,
			LOCAL,
			OTHER,
			POWER_LOSS,
			REBOOT,
			REMOTE,
			SOFT_RESET,
			UNLOCK_COMMAND,
			DE_AUTHORIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Reason> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reason</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Reason get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Reason result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reason</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Reason getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Reason result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reason</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Reason get(int value) {
		switch (value) {
			case EMERGENCY_STOP_VALUE: return EMERGENCY_STOP;
			case EV_DISCONNECTED_VALUE: return EV_DISCONNECTED;
			case HARD_RESET_VALUE: return HARD_RESET;
			case LOCAL_VALUE: return LOCAL;
			case OTHER_VALUE: return OTHER;
			case POWER_LOSS_VALUE: return POWER_LOSS;
			case REBOOT_VALUE: return REBOOT;
			case REMOTE_VALUE: return REMOTE;
			case SOFT_RESET_VALUE: return SOFT_RESET;
			case UNLOCK_COMMAND_VALUE: return UNLOCK_COMMAND;
			case DE_AUTHORIZED_VALUE: return DE_AUTHORIZED;
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
	private Reason(int value, String name, String literal) {
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
	
} //Reason
