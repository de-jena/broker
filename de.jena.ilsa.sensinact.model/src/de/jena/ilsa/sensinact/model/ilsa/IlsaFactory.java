/*
 */
package de.jena.ilsa.sensinact.model.ilsa;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage
 * @generated
 */
@ProviderType
public interface IlsaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlsaFactory eINSTANCE = de.jena.ilsa.sensinact.model.ilsa.impl.IlsaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ilsa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ilsa</em>'.
	 * @generated
	 */
	Ilsa createIlsa();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>Thermal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thermal</em>'.
	 * @generated
	 */
	Thermal createThermal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IlsaPackage getIlsaPackage();

} //IlsaFactory
