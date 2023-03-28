/*
 */
package de.jena.sensinact.mqtt.generic.message;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Json Object Value Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getGeoJsonObjectValueUpdate()
 * @model
 * @generated
 */
@ProviderType
public interface GeoJsonObjectValueUpdate extends UpdateMessage {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(GeoJsonObject)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getGeoJsonObjectValueUpdate_OldValue()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 * @generated
	 */
	GeoJsonObject getOldValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(GeoJsonObject value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(GeoJsonObject)
	 * @see de.jena.sensinact.mqtt.generic.message.MessagePackage#getGeoJsonObjectValueUpdate_NewValue()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 * @generated
	 */
	GeoJsonObject getNewValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.mqtt.generic.message.GeoJsonObjectValueUpdate#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(GeoJsonObject value);

} // GeoJsonObjectValueUpdate
