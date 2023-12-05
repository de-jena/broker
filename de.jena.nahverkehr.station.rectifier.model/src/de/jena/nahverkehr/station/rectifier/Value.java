/*
 */
package de.jena.nahverkehr.station.rectifier;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Value#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Value#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getValue()
 * @model
 * @generated
 */
@ProviderType
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getValue_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Value#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getValue_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Value#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // Value
