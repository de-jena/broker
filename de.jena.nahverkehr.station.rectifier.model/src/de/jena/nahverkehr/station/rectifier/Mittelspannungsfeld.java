/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mittelspannungsfeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getPower <em>Power</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getCircuiteBreaker <em>Circuite Breaker</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMittelspannungsfeld()
 * @model
 * @generated
 */
@ProviderType
public interface Mittelspannungsfeld extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMittelspannungsfeld_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spannung - Amper
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power</em>' containment reference.
	 * @see #setPower(MeasurementValue)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMittelspannungsfeld_Power()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MeasurementValue getPower();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(MeasurementValue value);

	/**
	 * Returns the value of the '<em><b>Circuite Breaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuite Breaker</em>' containment reference.
	 * @see #setCircuiteBreaker(CircuitBreaker)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMittelspannungsfeld_CircuiteBreaker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CircuitBreaker getCircuiteBreaker();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld#getCircuiteBreaker <em>Circuite Breaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuite Breaker</em>' containment reference.
	 * @see #getCircuiteBreaker()
	 * @generated
	 */
	void setCircuiteBreaker(CircuitBreaker value);

} // Mittelspannungsfeld
