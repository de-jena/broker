/*
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ids List Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getIdsListReponse()
 * @model
 * @generated
 */
@ProviderType
public interface IdsListReponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute list.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getIdsListReponse_Ids()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<String> getIds();

} // IdsListReponse
