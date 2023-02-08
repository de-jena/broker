/*
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.Output;
import de.dim.trafficos.common.model.common.Parameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getRoad <em>Road</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getLink <em>Link</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getPhaseGroup <em>Phase Group</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getOutput <em>Output</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getProgram <em>Program</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getState <em>State</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getName <em>Name</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Intersection#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection()
 * @model
 * @generated
 */
@ProviderType
public interface Intersection extends EObject {
	/**
	 * Returns the value of the '<em><b>Road</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Road()
	 * @model containment="true" keys="id" required="true"
	 * @generated
	 */
	EList<Road> getRoad();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Link()
	 * @model containment="true" keys="index"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Phase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Phase()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phase> getPhase();

	/**
	 * Returns the value of the '<em><b>Phase Group</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.PhaseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Group</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_PhaseGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhaseGroup> getPhaseGroup();

	/**
	 * Returns the value of the '<em><b>Time Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Table</em>' containment reference.
	 * @see #setTimeTable(TimeTable)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_TimeTable()
	 * @model containment="true"
	 * @generated
	 */
	TimeTable getTimeTable();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getTimeTable <em>Time Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Table</em>' containment reference.
	 * @see #getTimeTable()
	 * @generated
	 */
	void setTimeTable(TimeTable value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.common.model.common.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Program()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getProgram();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.common.model.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.intersection.model.intersection.IntersectionStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.IntersectionStateType
	 * @see #setState(IntersectionStateType)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_State()
	 * @model
	 * @generated
	 */
	IntersectionStateType getState();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.IntersectionStateType
	 * @see #getState()
	 * @generated
	 */
	void setState(IntersectionStateType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getIntersection_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Intersection#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Intersection
