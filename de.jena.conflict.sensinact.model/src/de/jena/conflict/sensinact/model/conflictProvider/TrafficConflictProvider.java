/*
 */
package de.jena.conflict.sensinact.model.conflictProvider;

import org.eclipse.sensinact.model.core.provider.Provider;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Conflict Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider#getConflict <em>Conflict</em>}</li>
 * </ul>
 *
 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getTrafficConflictProvider()
 * @model
 * @generated
 */
@ProviderType
public interface TrafficConflictProvider extends Provider {
	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' containment reference.
	 * @see #setConflict(Conflict)
	 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage#getTrafficConflictProvider_Conflict()
	 * @model containment="true"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link de.jena.conflict.sensinact.model.conflictProvider.TrafficConflictProvider#getConflict <em>Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' containment reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

} // TrafficConflictProvider
