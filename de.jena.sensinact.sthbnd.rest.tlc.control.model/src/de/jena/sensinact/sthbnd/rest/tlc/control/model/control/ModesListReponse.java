/**
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modes List Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getModesListReponse()
 * @model
 * @generated
 */
public interface ModesListReponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getModesListReponse_Modes()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Mode> getModes();

} // ModesListReponse
