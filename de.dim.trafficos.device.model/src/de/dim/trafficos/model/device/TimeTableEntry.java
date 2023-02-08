/*
 */
package de.dim.trafficos.model.device;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.TimeTableEntry#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTimeTableEntry()
 * @model
 * @generated
 */
@ProviderType
public interface TimeTableEntry extends AbstractTimeTableEntry {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see de.dim.trafficos.model.device.TOSDevicePackage#getTimeTableEntry_Program()
	 * @model keys="id" required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.model.device.TimeTableEntry#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // TimeTableEntry
