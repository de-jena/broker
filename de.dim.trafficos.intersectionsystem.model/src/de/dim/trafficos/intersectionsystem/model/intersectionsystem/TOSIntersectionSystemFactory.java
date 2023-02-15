/*
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage
 * @generated
 */
@ProviderType
public interface TOSIntersectionSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSIntersectionSystemFactory eINSTANCE = de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.TOSIntersectionSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intersection System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection System</em>'.
	 * @generated
	 */
	IntersectionSystem createIntersectionSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TOSIntersectionSystemPackage getTOSIntersectionSystemPackage();

} //TOSIntersectionSystemFactory
