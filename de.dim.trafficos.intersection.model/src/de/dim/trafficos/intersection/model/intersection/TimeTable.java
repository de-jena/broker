/*
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.IdNameElement;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.TimeTable#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.TimeTable#getDefaultMode <em>Default Mode</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getTimeTable()
 * @model
 * @generated
 */
@ProviderType
public interface TimeTable extends IdNameElement {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.TimeTableEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getTimeTable_Entry()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeTableEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Default Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.intersection.model.intersection.TimeTableModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mode</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableModeType
	 * @see #setDefaultMode(TimeTableModeType)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getTimeTable_DefaultMode()
	 * @model
	 * @generated
	 */
	TimeTableModeType getDefaultMode();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.TimeTable#getDefaultMode <em>Default Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Mode</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.TimeTableModeType
	 * @see #getDefaultMode()
	 * @generated
	 */
	void setDefaultMode(TimeTableModeType value);

} // TimeTable
