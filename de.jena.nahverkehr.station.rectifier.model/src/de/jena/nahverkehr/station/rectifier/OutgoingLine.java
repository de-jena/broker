/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getPower <em>Power</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#isFailure <em>Failure</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getBreaker <em>Breaker</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getThermalLoad <em>Thermal Load</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getCables <em>Cables</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine()
 * @model
 * @generated
 */
@ProviderType
public interface OutgoingLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getId <em>Id</em>}' attribute.
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
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine_Power()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MeasurementValue getPower();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(MeasurementValue value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Undefiniert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see #setFailure(boolean)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine_Failure()
	 * @model required="true"
	 * @generated
	 */
	boolean isFailure();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#isFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' attribute.
	 * @see #isFailure()
	 * @generated
	 */
	void setFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Breaker</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.Breaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kann n schalter geben
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Breaker</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine_Breaker()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Breaker> getBreaker();

	/**
	 * Returns the value of the '<em><b>Thermal Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In caculated value in Percentage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Load</em>' containment reference.
	 * @see #setThermalLoad(MeasurementValue)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine_ThermalLoad()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MeasurementValue getThermalLoad();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine#getThermalLoad <em>Thermal Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load</em>' containment reference.
	 * @see #getThermalLoad()
	 * @generated
	 */
	void setThermalLoad(MeasurementValue value);

	/**
	 * Returns the value of the '<em><b>Cables</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.Cabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cables</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOutgoingLine_Cables()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Cabel> getCables();

} // OutgoingLine
