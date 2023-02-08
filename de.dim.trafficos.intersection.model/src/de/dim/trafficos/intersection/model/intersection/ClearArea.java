/*
 */
package de.dim.trafficos.intersection.model.intersection;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.ClearArea#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getClearArea()
 * @model
 * @generated
 */
@ProviderType
public interface ClearArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dim.trafficos.intersection.model.intersection.ClearAreaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.ClearAreaType
	 * @see #setType(ClearAreaType)
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getClearArea_Type()
	 * @model
	 * @generated
	 */
	ClearAreaType getType();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.intersection.model.intersection.ClearArea#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dim.trafficos.intersection.model.intersection.ClearAreaType
	 * @see #getType()
	 * @generated
	 */
	void setType(ClearAreaType value);

} // ClearArea
