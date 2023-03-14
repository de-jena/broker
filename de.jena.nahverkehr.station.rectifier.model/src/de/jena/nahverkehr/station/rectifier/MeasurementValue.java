/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.MeasurementValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.MeasurementValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMeasurementValue()
 * @model
 * @generated
 */
@ProviderType
public interface MeasurementValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMeasurementValue_Value()
	 * @model required="true"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.MeasurementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.nahverkehr.station.rectifier.UNIT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.jena.nahverkehr.station.rectifier.UNIT
	 * @see #setUnit(UNIT)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getMeasurementValue_Unit()
	 * @model required="true"
	 * @generated
	 */
	UNIT getUnit();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.MeasurementValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.jena.nahverkehr.station.rectifier.UNIT
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UNIT value);

} // MeasurementValue
