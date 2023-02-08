/*
 */
package de.dim.trafficos.trafficlight.model.trafficlight;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Signal Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLSignalGroup()
 * @model
 * @generated
 */
@ProviderType
public interface TLSignalGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage#getTLSignalGroup_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TLSignalGroup
