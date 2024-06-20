/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate#getOldValue <em>Old Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getEObjectValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface EObjectValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' containment reference.
	 * @see #setNewValue(EObject)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getEObjectValueUpdate_NewValue()
	 * @model containment="true"
	 * @generated
	 */
	EObject getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate#getNewValue <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' containment reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' containment reference.
	 * @see #setOldValue(EObject)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getEObjectValueUpdate_OldValue()
	 * @model containment="true"
	 * @generated
	 */
	EObject getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.EObjectValueUpdate#getOldValue <em>Old Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' containment reference.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(EObject value);

} // EObjectValueUpdate
