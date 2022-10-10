/**
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system internal identifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getMode_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The A human readable name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getMode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getMode_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that will be mapped on the physical pins in the TLC
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(BigInteger)
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlPackage#getMode_Code()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCode();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(BigInteger value);

} // Mode
