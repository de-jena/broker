/*
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionId <em>Intersection Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionName <em>Intersection Name</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getTlModuleIds <em>Tl Module Ids</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getDetectorIds <em>Detector Ids</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#getIntersectionSystem()
 * @model
 * @generated
 */
@ProviderType
public interface IntersectionSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#getIntersectionSystem_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Intersection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersection Id</em>' attribute.
	 * @see #setIntersectionId(String)
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#getIntersectionSystem_IntersectionId()
	 * @model required="true"
	 * @generated
	 */
	String getIntersectionId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionId <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersection Id</em>' attribute.
	 * @see #getIntersectionId()
	 * @generated
	 */
	void setIntersectionId(String value);

	/**
	 * Returns the value of the '<em><b>Intersection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersection Name</em>' attribute.
	 * @see #setIntersectionName(String)
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#getIntersectionSystem_IntersectionName()
	 * @model
	 * @generated
	 */
	String getIntersectionName();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem#getIntersectionName <em>Intersection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersection Name</em>' attribute.
	 * @see #getIntersectionName()
	 * @generated
	 */
	void setIntersectionName(String value);

	/**
	 * Returns the value of the '<em><b>Tl Module Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tl Module Ids</em>' attribute list.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#getIntersectionSystem_TlModuleIds()
	 * @model
	 * @generated
	 */
	EList<String> getTlModuleIds();

	/**
	 * Returns the value of the '<em><b>Detector Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detector Ids</em>' attribute list.
	 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage#getIntersectionSystem_DetectorIds()
	 * @model
	 * @generated
	 */
	EList<String> getDetectorIds();

} // IntersectionSystem
