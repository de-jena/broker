/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getBooleanValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface BooleanValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(boolean)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getBooleanValueUpdate_OldValue()
	 * @model
	 * @generated
	 */
	boolean isOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #isOldValue()
	 * @generated
	 */
	void setOldValue(boolean value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(boolean)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getBooleanValueUpdate_NewValue()
	 * @model
	 * @generated
	 */
	boolean isNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.BooleanValueUpdate#isNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #isNewValue()
	 * @generated
	 */
	void setNewValue(boolean value);

} // BooleanValueUpdate
