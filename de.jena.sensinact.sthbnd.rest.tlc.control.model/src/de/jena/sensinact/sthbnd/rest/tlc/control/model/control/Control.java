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
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control#getPhaseId <em>Phase Id</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Id</em>' attribute.
	 * @see #setPhaseId(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getControl_PhaseId()
	 * @model required="true"
	 * @generated
	 */
	String getPhaseId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control#getPhaseId <em>Phase Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Id</em>' attribute.
	 * @see #getPhaseId()
	 * @generated
	 */
	void setPhaseId(String value);

} // Control
