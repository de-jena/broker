/**
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.IdNameElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Program#getLength <em>Length</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Program#getOutputEntry <em>Output Entry</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Program#getSignalTable <em>Signal Table</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgram_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Program#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Output Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.ProgramEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Entry</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgram_OutputEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramEntry> getOutputEntry();

	/**
	 * Returns the value of the '<em><b>Signal Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Table</em>' containment reference.
	 * @see #setSignalTable(SignalTable)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgram_SignalTable()
	 * @model containment="true"
	 * @generated
	 */
	SignalTable getSignalTable();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Program#getSignalTable <em>Signal Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Table</em>' containment reference.
	 * @see #getSignalTable()
	 * @generated
	 */
	void setSignalTable(SignalTable value);

} // Program
