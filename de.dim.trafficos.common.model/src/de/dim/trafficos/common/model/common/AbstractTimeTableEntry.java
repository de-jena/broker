/**
 */
package de.dim.trafficos.common.model.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getIndex <em>Index</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getMode <em>Mode</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getBegin <em>Begin</em>}</li>
 *   <li>{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAbstractTimeTableEntry()
 * @model
 * @generated
 */
public interface AbstractTimeTableEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAbstractTimeTableEntry_Index()
	 * @model required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.common.model.common.ScheduleModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.dim.trafficos.common.model.common.ScheduleModeType
	 * @see #setMode(ScheduleModeType)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAbstractTimeTableEntry_Mode()
	 * @model
	 * @generated
	 */
	ScheduleModeType getMode();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.dim.trafficos.common.model.common.ScheduleModeType
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ScheduleModeType value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minute of the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(long)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAbstractTimeTableEntry_Begin()
	 * @model required="true"
	 * @generated
	 */
	long getBegin();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minute of the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see de.dim.trafficos.common.model.common.TOSCommonPackage#getAbstractTimeTableEntry_End()
	 * @model required="true"
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.common.model.common.AbstractTimeTableEntry#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

} // AbstractTimeTableEntry
