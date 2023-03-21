/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage
 * @generated
 */
@ProviderType
public interface RectifierFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RectifierFactory eINSTANCE = de.jena.nahverkehr.station.rectifier.impl.RectifierFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substation</em>'.
	 * @generated
	 */
	Substation createSubstation();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Regsiter Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regsiter Message</em>'.
	 * @generated
	 */
	RegsiterMessage createRegsiterMessage();

	/**
	 * Returns a new object of class '<em>Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Value</em>'.
	 * @generated
	 */
	MeasurementValue createMeasurementValue();

	/**
	 * Returns a new object of class '<em>Over Ground Cabel Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Over Ground Cabel Distribution</em>'.
	 * @generated
	 */
	OverGroundCabelDistribution createOverGroundCabelDistribution();

	/**
	 * Returns a new object of class '<em>Cabel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cabel</em>'.
	 * @generated
	 */
	Cabel createCabel();

	/**
	 * Returns a new object of class '<em>Outgoing Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Line</em>'.
	 * @generated
	 */
	OutgoingLine createOutgoingLine();

	/**
	 * Returns a new object of class '<em>Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breaker</em>'.
	 * @generated
	 */
	Breaker createBreaker();

	/**
	 * Returns a new object of class '<em>Mittelspannungsfeld</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mittelspannungsfeld</em>'.
	 * @generated
	 */
	Mittelspannungsfeld createMittelspannungsfeld();

	/**
	 * Returns a new object of class '<em>State Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Value</em>'.
	 * @generated
	 */
	StateValue createStateValue();

	/**
	 * Returns a new object of class '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm</em>'.
	 * @generated
	 */
	Alarm createAlarm();

	/**
	 * Returns a new object of class '<em>Circuit Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Breaker</em>'.
	 * @generated
	 */
	CircuitBreaker createCircuitBreaker();

	/**
	 * Returns a new object of class '<em>Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnector</em>'.
	 * @generated
	 */
	Disconnector createDisconnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RectifierPackage getRectifierPackage();

} //RectifierFactory
