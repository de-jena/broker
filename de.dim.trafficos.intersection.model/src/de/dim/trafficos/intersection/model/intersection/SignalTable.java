/*
 */
package de.dim.trafficos.intersection.model.intersection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.SignalTable#getCacheDataEntry <em>Cache Data Entry</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getSignalTable()
 * @model
 * @generated
 */
@ProviderType
public interface SignalTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Cache Data Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.dim.trafficos.intersection.model.intersection.CacheDataEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Data Entry</em>' containment reference list.
	 * @see de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage#getSignalTable_CacheDataEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<CacheDataEntry> getCacheDataEntry();

} // SignalTable
