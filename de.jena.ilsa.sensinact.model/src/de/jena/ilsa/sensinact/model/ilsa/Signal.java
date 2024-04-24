/*
 */
package de.jena.ilsa.sensinact.model.ilsa;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getColor <em>Color</em>}</li>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getSignalGroup <em>Signal Group</em>}</li>
 *   <li>{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getObservedArea <em>Observed Area</em>}</li>
 * </ul>
 *
 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal()
 * @model
 * @generated
 */
@ProviderType
public interface Signal extends Service {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal_Color()
	 * @model annotation="Metadata sensorthings.unit.name='Farbe'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal_Type()
	 * @model annotation="Metadata sensorthings.sensor.metadata='null' sensorthings.unit.name='Signaltyp'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' attribute.
	 * @see #setSignalGroup(String)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal_SignalGroup()
	 * @model annotation="Metadata sensorthings.unit.name='Signalgruppe'"
	 * @generated
	 */
	String getSignalGroup();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getSignalGroup <em>Signal Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Group</em>' attribute.
	 * @see #getSignalGroup()
	 * @generated
	 */
	void setSignalGroup(String value);

	/**
	 * Returns the value of the '<em><b>Observed Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Area</em>' attribute.
	 * @see #setObservedArea(GeoJsonObject)
	 * @see de.jena.ilsa.sensinact.model.ilsa.IlsaPackage#getSignal_ObservedArea()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 *        annotation="Metadata sensorthings.observedArea='true'"
	 * @generated
	 */
	GeoJsonObject getObservedArea();

	/**
	 * Sets the value of the '{@link de.jena.ilsa.sensinact.model.ilsa.Signal#getObservedArea <em>Observed Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Area</em>' attribute.
	 * @see #getObservedArea()
	 * @generated
	 */
	void setObservedArea(GeoJsonObject value);

} // Signal
