/**
 */
package de.jena.sensinact.ocpp.structures;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage
 * @generated
 */
public interface OcppStructuresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppStructuresFactory eINSTANCE = de.jena.sensinact.ocpp.structures.impl.OcppStructuresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Measurement Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Notification</em>'.
	 * @generated
	 */
	MeasurementNotification createMeasurementNotification();

	/**
	 * Returns a new object of class '<em>State Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Notification</em>'.
	 * @generated
	 */
	StateNotification createStateNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OcppStructuresPackage getOcppStructuresPackage();

} //OcppStructuresFactory
