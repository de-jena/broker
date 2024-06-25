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
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#isConflict <em>Conflict</em>}</li>
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#getBikeId <em>Bike Id</em>}</li>
 * </ul>
 *
 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getConflict()
 * @model
 * @generated
 */
@ProviderType
public interface Conflict extends Service {
	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' attribute.
	 * @see #setConflict(boolean)
	 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getConflict_Conflict()
	 * @model
	 * @generated
	 */
	boolean isConflict();

	/**
	 * Sets the value of the '{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#isConflict <em>Conflict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' attribute.
	 * @see #isConflict()
	 * @generated
	 */
	void setConflict(boolean value);

	/**
	 * Returns the value of the '<em><b>Bike Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike Id</em>' attribute.
	 * @see #setBikeId(Long)
	 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getConflict_BikeId()
	 * @model
	 * @generated
	 */
	Long getBikeId();

	/**
	 * Sets the value of the '{@link de.jena.conflict.sensinact.model.conflictProvider.Conflict#getBikeId <em>Bike Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike Id</em>' attribute.
	 * @see #getBikeId()
	 * @generated
	 */
	void setBikeId(Long value);

} // Conflict
