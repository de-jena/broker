/**
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getControl_Mode()
	 * @model required="true"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

} // Control
