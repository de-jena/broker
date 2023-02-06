/**
 */
package de.dim.trafficos.intersection.model.intersection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getBegin <em>Begin</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getEnd <em>End</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getRefPhase <em>Ref Phase</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgramEntry()
 * @model
 * @generated
 */
public interface ProgramEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(int)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgramEntry_Begin()
	 * @model required="true"
	 * @generated
	 */
	int getBegin();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgramEntry_End()
	 * @model required="true"
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgramEntry_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Ref Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Phase</em>' reference.
	 * @see #setRefPhase(Phase)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getProgramEntry_RefPhase()
	 * @model required="true"
	 * @generated
	 */
	Phase getRefPhase();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.ProgramEntry#getRefPhase <em>Ref Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Phase</em>' reference.
	 * @see #getRefPhase()
	 * @generated
	 */
	void setRefPhase(Phase value);

} // ProgramEntry
