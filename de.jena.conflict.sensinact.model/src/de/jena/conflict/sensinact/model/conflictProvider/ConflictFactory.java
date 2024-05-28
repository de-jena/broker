/*
 */
package de.jena.conflict.sensinact.model.conflictProvider;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.conflict.sensinact.model.conflictProvider.ConflictPackage
 * @generated
 */
@ProviderType
public interface ConflictFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConflictFactory eINSTANCE = de.jena.conflict.sensinact.model.conflictProvider.impl.ConflictFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traffic Conflict Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Conflict Provider</em>'.
	 * @generated
	 */
	TrafficConflictProvider createTrafficConflictProvider();

	/**
	 * Returns a new object of class '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict</em>'.
	 * @generated
	 */
	Conflict createConflict();

	/**
	 * Returns a new object of class '<em>Traffic Conflict Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Conflict Admin</em>'.
	 * @generated
	 */
	TrafficConflictAdmin createTrafficConflictAdmin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConflictPackage getConflictPackage();

} //ConflictFactory
