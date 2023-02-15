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
 * A representation of the literals of the enumeration '<em><b>Diagnostics Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the diagnostics-status-value
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDiagnosticsStatus()
 * @model extendedMetaData="name='DiagnosticsStatus'"
 * @generated
 */
@ProviderType
public enum DiagnosticsStatus implements Enumerator {
	/**
	 * The '<em><b>Idle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDLE(0, "Idle", "Idle"),

	/**
	 * The '<em><b>Uploaded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOADED_VALUE
	 * @generated
	 * @ordered
	 */
	UPLOADED(1, "Uploaded", "Uploaded"),

	/**
	 * The '<em><b>Upload Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOAD_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	UPLOAD_FAILED(2, "UploadFailed", "UploadFailed"),

	/**
	 * The '<em><b>Uploading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOADING_VALUE
	 * @generated
	 * @ordered
	 */
	UPLOADING(3, "Uploading", "Uploading");

	/**
	 * The '<em><b>Idle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE
	 * @model name="Idle"
	 * @generated
	 * @ordered
	 */
	public static final int IDLE_VALUE = 0;

	/**
	 * The '<em><b>Uploaded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOADED
	 * @model name="Uploaded"
	 * @generated
	 * @ordered
	 */
	public static final int UPLOADED_VALUE = 1;

	/**
	 * The '<em><b>Upload Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOAD_FAILED
	 * @model name="UploadFailed"
	 * @generated
	 * @ordered
	 */
	public static final int UPLOAD_FAILED_VALUE = 2;

	/**
	 * The '<em><b>Uploading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOADING
	 * @model name="Uploading"
	 * @generated
	 * @ordered
	 */
	public static final int UPLOADING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Diagnostics Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiagnosticsStatus[] VALUES_ARRAY =
		new DiagnosticsStatus[] {
			IDLE,
			UPLOADED,
			UPLOAD_FAILED,
			UPLOADING,
		};

	/**
	 * A public read-only list of all the '<em><b>Diagnostics Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiagnosticsStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diagnostics Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticsStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagnosticsStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagnostics Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticsStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagnosticsStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagnostics Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiagnosticsStatus get(int value) {
		switch (value) {
			case IDLE_VALUE: return IDLE;
			case UPLOADED_VALUE: return UPLOADED;
			case UPLOAD_FAILED_VALUE: return UPLOAD_FAILED;
			case UPLOADING_VALUE: return UPLOADING;
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
	private DiagnosticsStatus(int value, String name, String literal) {
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
	
} //DiagnosticsStatus
