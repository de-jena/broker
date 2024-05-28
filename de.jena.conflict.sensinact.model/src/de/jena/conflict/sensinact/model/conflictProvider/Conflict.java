/*
 */
package de.jena.conflict.sensinact.model.conflictProvider;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#isIsConflict <em>Is Conflict</em>}</li>
 * </ul>
 *
 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getConflict()
 * @model
 * @generated
 */
@ProviderType
public interface Conflict extends Service {
	/**
	 * Returns the value of the '<em><b>Is Conflict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Conflict</em>' attribute.
	 * @see #setIsConflict(boolean)
	 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getConflict_IsConflict()
	 * @model
	 * @generated
	 */
	boolean isIsConflict();

	/**
	 * Sets the value of the '{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#isIsConflict <em>Is Conflict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conflict</em>' attribute.
	 * @see #isIsConflict()
	 * @generated
	 */
	void setIsConflict(boolean value);

} // Conflict
