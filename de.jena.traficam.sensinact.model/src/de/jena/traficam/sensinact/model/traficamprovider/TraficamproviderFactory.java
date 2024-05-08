/*
 */
package de.jena.traficam.sensinact.model.traficamprovider;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage
 * @generated
 */
@ProviderType
public interface TraficamproviderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraficamproviderFactory eINSTANCE = de.jena.traficam.sensinact.model.traficamprovider.impl.TraficamproviderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traficam Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traficam Provider</em>'.
	 * @generated
	 */
	TraficamProvider createTraficamProvider();

	/**
	 * Returns a new object of class '<em>Traficam Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traficam Admin</em>'.
	 * @generated
	 */
	TraficamAdmin createTraficamAdmin();

	/**
	 * Returns a new object of class '<em>Observed Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observed Objects</em>'.
	 * @generated
	 */
	ObservedObjects createObservedObjects();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TraficamproviderPackage getTraficamproviderPackage();

} //TraficamproviderFactory
