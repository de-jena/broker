/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getStringValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface StringValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(String)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getStringValueUpdate_OldValue()
	 * @model
	 * @generated
	 */
	String getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(String value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(String)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getStringValueUpdate_NewValue()
	 * @model
	 * @generated
	 */
	String getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.StringValueUpdate#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(String value);

} // StringValueUpdate
