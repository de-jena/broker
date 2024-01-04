/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Breaker#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Breaker#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Breaker#getState <em>State</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Breaker#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getBreaker()
 * @model
 * @generated
 */
@ProviderType
public interface Breaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getBreaker_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Breaker#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.RegsiterMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * können unterschiedlich je nach GUW und hersteller sein, Werden via bit und adresse direkt identifiziert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getBreaker_Alarm()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<RegsiterMessage> getAlarm();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf, Zu, Undefeiniert, gestört
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(StateValue)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getBreaker_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StateValue getState();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Breaker#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(StateValue value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(MeasurementValue)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getBreaker_Value()
	 * @model containment="true"
	 * @generated
	 */
	MeasurementValue getValue();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Breaker#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MeasurementValue value);

} // Breaker
