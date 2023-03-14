/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage
 * @generated
 */
@ProviderType
public interface MessageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageFactory eINSTANCE = de.jena.sensinact.mqtt.generic.message.impl.MessageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>String Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value Update</em>'.
	 * @generated
	 */
	StringValueUpdate createStringValueUpdate();

	/**
	 * Returns a new object of class '<em>Double Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Value Update</em>'.
	 * @generated
	 */
	DoubleValueUpdate createDoubleValueUpdate();

	/**
	 * Returns a new object of class '<em>Integer Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Update</em>'.
	 * @generated
	 */
	IntegerValueUpdate createIntegerValueUpdate();

	/**
	 * Returns a new object of class '<em>Long Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Value Update</em>'.
	 * @generated
	 */
	LongValueUpdate createLongValueUpdate();

	/**
	 * Returns a new object of class '<em>Boolean Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Update</em>'.
	 * @generated
	 */
	BooleanValueUpdate createBooleanValueUpdate();

	/**
	 * Returns a new object of class '<em>Object Value Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Value Update</em>'.
	 * @generated
	 */
	ObjectValueUpdate createObjectValueUpdate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MessagePackage getMessagePackage();

} //MessageFactory
