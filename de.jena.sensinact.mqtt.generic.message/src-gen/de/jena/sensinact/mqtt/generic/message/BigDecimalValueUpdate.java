/*
 */
package de.jena.sensinact.mqtt.generic.message;

import java.math.BigDecimal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Decimal Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getBigDecimalValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface BigDecimalValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(BigDecimal)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getBigDecimalValueUpdate_OldValue()
	 * @model
	 * @generated
	 */
	BigDecimal getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(BigDecimal)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getBigDecimalValueUpdate_NewValue()
	 * @model
	 * @generated
	 */
	BigDecimal getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.BigDecimalValueUpdate#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(BigDecimal value);

} // BigDecimalValueUpdate
