/**
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location represanting geo coordinates in decimal from
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getLocation_Latitude()
	 * @model required="true"
	 * @generated
	 */
	String getLatitude();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getLocation_Longitude()
	 * @model required="true"
	 * @generated
	 */
	String getLongitude();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(String value);

} // Location
