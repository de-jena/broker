/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.DataRate#getLora <em>Lora</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getDataRate()
 * @model
 * @generated
 */
@ProviderType
public interface DataRate extends EObject {
	/**
	 * Returns the value of the '<em><b>Lora</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lora</em>' containment reference.
	 * @see #setLora(Lora)
	 * @see de.jena.model.ttn.TTNPackage#getDataRate_Lora()
	 * @model containment="true"
	 * @generated
	 */
	Lora getLora();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.DataRate#getLora <em>Lora</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lora</em>' containment reference.
	 * @see #getLora()
	 * @generated
	 */
	void setLora(Lora value);

} // DataRate
