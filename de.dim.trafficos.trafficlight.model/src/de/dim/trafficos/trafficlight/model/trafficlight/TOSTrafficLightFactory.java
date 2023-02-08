/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage
 * @generated
 */
@ProviderType
public interface TOSTrafficLightFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TOSTrafficLightFactory eINSTANCE = de.dim.trafficos.trafficlight.model.trafficlight.impl.TOSTrafficLightFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TL Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Module</em>'.
	 * @generated
	 */
	TLModule createTLModule();

	/**
	 * Returns a new object of class '<em>TL Signal Transmitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Signal Transmitter</em>'.
	 * @generated
	 */
	TLSignalTransmitter createTLSignalTransmitter();

	/**
	 * Returns a new object of class '<em>TL Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Signal Group</em>'.
	 * @generated
	 */
	TLSignalGroup createTLSignalGroup();

	/**
	 * Returns a new object of class '<em>Light Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Signal</em>'.
	 * @generated
	 */
	LightSignal createLightSignal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TOSTrafficLightPackage getTOSTrafficLightPackage();

} //TOSTrafficLightFactory
