/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.eclipse.sensinact.gateway.geojson.FeatureCollection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.FeatureCollectionValueUpdate#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.FeatureCollectionValueUpdate#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getFeatureCollectionValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface FeatureCollectionValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(FeatureCollection)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getFeatureCollectionValueUpdate_OldValue()
	 * @model dataType="de.jena.sensinact.mqtt.generic.message.EFeatureCollection"
	 * @generated
	 */
	FeatureCollection getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.FeatureCollectionValueUpdate#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(FeatureCollection value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(FeatureCollection)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getFeatureCollectionValueUpdate_NewValue()
	 * @model dataType="de.jena.sensinact.mqtt.generic.message.EFeatureCollection"
	 * @generated
	 */
	FeatureCollection getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.FeatureCollectionValueUpdate#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(FeatureCollection value);

} // FeatureCollectionValueUpdate
