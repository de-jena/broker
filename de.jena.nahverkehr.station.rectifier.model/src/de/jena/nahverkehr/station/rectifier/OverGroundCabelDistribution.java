/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Over Ground Cabel Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Oberirdischer Kabelverteiler
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getCables <em>Cables</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getDisconnector <em>Disconnector</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOverGroundCabelDistribution()
 * @model
 * @generated
 */
@ProviderType
public interface OverGroundCabelDistribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOverGroundCabelDistribution_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cables</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.Cabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cables</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOverGroundCabelDistribution_Cables()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Cabel> getCables();

	/**
	 * Returns the value of the '<em><b>Disconnector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnector</em>' containment reference.
	 * @see #setDisconnector(Disconnector)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getOverGroundCabelDistribution_Disconnector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Disconnector getDisconnector();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution#getDisconnector <em>Disconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnector</em>' containment reference.
	 * @see #getDisconnector()
	 * @generated
	 */
	void setDisconnector(Disconnector value);

} // OverGroundCabelDistribution
