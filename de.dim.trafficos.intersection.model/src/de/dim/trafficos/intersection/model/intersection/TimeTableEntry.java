/**
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.AbstractTimeTableEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.TimeTableEntry#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getTimeTableEntry()
 * @model
 * @generated
 */
public interface TimeTableEntry extends AbstractTimeTableEntry {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getTimeTableEntry_Program()
	 * @model required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.TimeTableEntry#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // TimeTableEntry
