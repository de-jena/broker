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
 * A representation of the literals of the enumeration '<em><b>Firmware Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the firmware-status-value
 * <!-- end-model-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getFirmwareStatus()
 * @model extendedMetaData="name='FirmwareStatus'"
 * @generated
 */
@ProviderType
public enum FirmwareStatus implements Enumerator {
	/**
	 * The '<em><b>Downloaded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOADED_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNLOADED(0, "Downloaded", "Downloaded"),

	/**
	 * The '<em><b>Download Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOAD_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNLOAD_FAILED(1, "DownloadFailed", "DownloadFailed"),

	/**
	 * The '<em><b>Downloading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOADING_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNLOADING(2, "Downloading", "Downloading"),

	/**
	 * The '<em><b>Idle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDLE(3, "Idle", "Idle"),

	/**
	 * The '<em><b>Installation Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION_FAILED(4, "InstallationFailed", "InstallationFailed"),

	/**
	 * The '<em><b>Installed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLED_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLED(5, "Installed", "Installed"),

	/**
	 * The '<em><b>Installing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLING_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLING(6, "Installing", "Installing");

	/**
	 * The '<em><b>Downloaded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOADED
	 * @model name="Downloaded"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNLOADED_VALUE = 0;

	/**
	 * The '<em><b>Download Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOAD_FAILED
	 * @model name="DownloadFailed"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNLOAD_FAILED_VALUE = 1;

	/**
	 * The '<em><b>Downloading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOADING
	 * @model name="Downloading"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNLOADING_VALUE = 2;

	/**
	 * The '<em><b>Idle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE
	 * @model name="Idle"
	 * @generated
	 * @ordered
	 */
	public static final int IDLE_VALUE = 3;

	/**
	 * The '<em><b>Installation Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLATION_FAILED
	 * @model name="InstallationFailed"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_FAILED_VALUE = 4;

	/**
	 * The '<em><b>Installed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLED
	 * @model name="Installed"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLED_VALUE = 5;

	/**
	 * The '<em><b>Installing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLING
	 * @model name="Installing"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLING_VALUE = 6;

	/**
	 * An array of all the '<em><b>Firmware Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FirmwareStatus[] VALUES_ARRAY =
		new FirmwareStatus[] {
			DOWNLOADED,
			DOWNLOAD_FAILED,
			DOWNLOADING,
			IDLE,
			INSTALLATION_FAILED,
			INSTALLED,
			INSTALLING,
		};

	/**
	 * A public read-only list of all the '<em><b>Firmware Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FirmwareStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Firmware Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FirmwareStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FirmwareStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Firmware Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FirmwareStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FirmwareStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Firmware Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FirmwareStatus get(int value) {
		switch (value) {
			case DOWNLOADED_VALUE: return DOWNLOADED;
			case DOWNLOAD_FAILED_VALUE: return DOWNLOAD_FAILED;
			case DOWNLOADING_VALUE: return DOWNLOADING;
			case IDLE_VALUE: return IDLE;
			case INSTALLATION_FAILED_VALUE: return INSTALLATION_FAILED;
			case INSTALLED_VALUE: return INSTALLED;
			case INSTALLING_VALUE: return INSTALLING;
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
	private FirmwareStatus(int value, String name, String literal) {
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
	
} //FirmwareStatus
