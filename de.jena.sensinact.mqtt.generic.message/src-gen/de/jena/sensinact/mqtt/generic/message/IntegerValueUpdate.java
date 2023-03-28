/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getIntegerValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface IntegerValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Integer)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getIntegerValueUpdate_OldValue()
	 * @model
	 * @generated
	 */
	Integer getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Integer value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Integer)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getIntegerValueUpdate_NewValue()
	 * @model
	 * @generated
	 */
	Integer getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.IntegerValueUpdate#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Integer value);

} // IntegerValueUpdate
