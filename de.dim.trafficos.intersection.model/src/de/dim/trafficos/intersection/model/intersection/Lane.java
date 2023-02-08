/*
 */
package de.dim.trafficos.intersection.model.intersection;

import de.dim.trafficos.common.model.common.DirectionType;
import de.dim.trafficos.common.model.common.Output;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getRefRoadId <em>Ref Road Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getLink <em>Link</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getRoad <em>Road</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getSubLane <em>Sub Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getParentLane <em>Parent Lane</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getIndex <em>Index</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.Lane#getDetector <em>Detector</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane()
 * @model
 * @generated
 */
@ProviderType
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Lane#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ref Road Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Road Id</em>' attribute.
	 * @see #setRefRoadId(String)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_RefRoadId()
	 * @model
	 * @generated
	 */
	String getRefRoadId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Lane#getRefRoadId <em>Ref Road Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Road Id</em>' attribute.
	 * @see #getRefRoadId()
	 * @generated
	 */
	void setRefRoadId(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_Link()
	 * @model keys="index"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Road</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' reference.
	 * @see #setRoad(Road)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_Road()
	 * @model keys="id"
	 * @generated
	 */
	Road getRoad();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Lane#getRoad <em>Road</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road</em>' reference.
	 * @see #getRoad()
	 * @generated
	 */
	void setRoad(Road value);

	/**
	 * Returns the value of the '<em><b>Sub Lane</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.Lane}.
	 * It is bidirectional and its opposite is '{@link de.dim.trafficos.intersection.model.intersection.Lane#getParentLane <em>Parent Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Lane</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_SubLane()
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getParentLane
	 * @model opposite="parentLane" containment="true" keys="id"
	 * @generated
	 */
	EList<Lane> getSubLane();

	/**
	 * Returns the value of the '<em><b>Parent Lane</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.dim.trafficos.intersection.model.intersection.Lane#getSubLane <em>Sub Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Lane</em>' container reference.
	 * @see #setParentLane(Lane)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_ParentLane()
	 * @see de.dim.trafficos.intersection.model.intersection.Lane#getSubLane
	 * @model opposite="subLane" keys="id" transient="false"
	 * @generated
	 */
	Lane getParentLane();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Lane#getParentLane <em>Parent Lane</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Lane</em>' container reference.
	 * @see #getParentLane()
	 * @generated
	 */
	void setParentLane(Lane value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_Index()
	 * @model required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Lane#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.common.model.common.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.dim.trafficos.common.model.common.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_Direction()
	 * @model
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.Lane#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.dim.trafficos.common.model.common.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Detector</b></em>' reference list.
	 * The list contents are of type {@link de.dim.trafficos.common.model.common.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detector</em>' reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getLane_Detector()
	 * @model
	 * @generated
	 */
	EList<Output> getDetector();

} // Lane
