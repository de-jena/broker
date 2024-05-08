/*
 */
package de.jena.traficam.sensinact.model.traficamprovider;

import org.eclipse.sensinact.gateway.geojson.GeoJsonObject;

import org.eclipse.sensinact.model.core.provider.Service;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observed Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getObjects <em>Objects</em>}</li>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getClassificationName <em>Classification Name</em>}</li>
 *   <li>{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getViewport <em>Viewport</em>}</li>
 * </ul>
 *
 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getObservedObjects()
 * @model
 * @generated
 */
@ProviderType
public interface ObservedObjects extends Service {
	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(int)
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getObservedObjects_Classification()
	 * @model
	 * @generated
	 */
	int getClassification();

	/**
	 * Sets the value of the '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(int value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' attribute.
	 * @see #setObjects(GeoJsonObject)
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getObservedObjects_Objects()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 * @generated
	 */
	GeoJsonObject getObjects();

	/**
	 * Sets the value of the '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getObjects <em>Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects</em>' attribute.
	 * @see #getObjects()
	 * @generated
	 */
	void setObjects(GeoJsonObject value);

	/**
	 * Returns the value of the '<em><b>Classification Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Name</em>' attribute.
	 * @see #setClassificationName(String)
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getObservedObjects_ClassificationName()
	 * @model annotation="Metadata sensorthings.unit.name='Type'"
	 * @generated
	 */
	String getClassificationName();

	/**
	 * Sets the value of the '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getClassificationName <em>Classification Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Name</em>' attribute.
	 * @see #getClassificationName()
	 * @generated
	 */
	void setClassificationName(String value);

	/**
	 * Returns the value of the '<em><b>Viewport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewport</em>' attribute.
	 * @see #setViewport(GeoJsonObject)
	 * @see de.jena.traficam.sensinact.model.traficamprovider.TraficamproviderPackage#getObservedObjects_Viewport()
	 * @model dataType="org.eclipse.sensinact.model.core.provider.EGeoJsonObject"
	 *        annotation="Metadata sensorthings.observedArea='true'"
	 * @generated
	 */
	GeoJsonObject getViewport();

	/**
	 * Sets the value of the '{@link de.jena.traficam.sensinact.model.traficamprovider.ObservedObjects#getViewport <em>Viewport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewport</em>' attribute.
	 * @see #getViewport()
	 * @generated
	 */
	void setViewport(GeoJsonObject value);

} // ObservedObjects
