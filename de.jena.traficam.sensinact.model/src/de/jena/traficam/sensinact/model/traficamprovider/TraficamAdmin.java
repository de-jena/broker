/*
 */
package de.jena.traficam.sensinact.model.traficamprovider;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.Admin;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traficam Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin#getViewport <em>Viewport</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getTraficamAdmin()
 * @model
 * @generated
 */
@ProviderType
public interface TraficamAdmin extends Admin {
	/**
	 * Returns the value of the '<em><b>Viewport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewport</em>' attribute.
	 * @see #setViewport(GeoJsonObject)
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getTraficamAdmin_Viewport()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 *        annotation="Metadata sensorthings.observedArea='true'"
	 * @generated
	 */
	GeoJsonObject getViewport();

	/**
	 * Sets the value of the '{@link de.jena.traficam.sensinact.model.traficamprovider.TraficamAdmin#getViewport <em>Viewport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewport</em>' attribute.
	 * @see #getViewport()
	 * @generated
	 */
	void setViewport(GeoJsonObject value);

} // TraficamAdmin
