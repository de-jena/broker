/**
 */
package de.jena.sensinact.ocpp.structures;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getValue <em>Value</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getMeasurementNotification()
 * @model
 * @generated
 */
public interface MeasurementNotification extends Notification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getMeasurementNotification_Value()
	 * @model
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"W"</code>.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.structures.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.structures.Unit
	 * @see #setUnit(Unit)
	 * @see de.jena.sensinact.ocpp.structures.OcppStructuresPackage#getMeasurementNotification_Unit()
	 * @model default="W"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.structures.MeasurementNotification#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.structures.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // MeasurementNotification
