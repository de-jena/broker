/**
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.Output;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflicting Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getConflictingLane <em>Conflicting Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getConflictingLink <em>Conflicting Link</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroups <em>Signal Groups</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getConflictingLane()
 * @model
 * @generated
 */
public interface ConflictingLane extends Lane {
	/**
	 * Returns the value of the '<em><b>Conflicting Lane</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.ConflictingLane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicting Lane</em>' reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getConflictingLane_ConflictingLane()
	 * @model keys="id"
	 * @generated
	 */
	EList<ConflictingLane> getConflictingLane();

	/**
	 * Returns the value of the '<em><b>Conflicting Link</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicting Link</em>' reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getConflictingLane_ConflictingLink()
	 * @model keys="index"
	 * @generated
	 */
	EList<Link> getConflictingLink();

	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' reference.
	 * @see #setSignalGroup(Output)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getConflictingLane_SignalGroup()
	 * @model
	 * @generated
	 */
	Output getSignalGroup();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.ConflictingLane#getSignalGroup <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group</em>' reference.
	 * @see #getSignalGroup()
	 * @generated
	 */
	void setSignalGroup(Output value);

	/**
	 * Returns the value of the '<em><b>Signal Groups</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.common.model.common.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Groups</em>' reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getConflictingLane_SignalGroups()
	 * @model
	 * @generated
	 */
	EList<Output> getSignalGroups();

} // ConflictingLane
