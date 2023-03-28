/*
 */
package de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lora</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora#getSpreadingFactor <em>Spreading Factor</em>}</li>
 *   <li>{@link de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora#getCodingRate <em>Coding Rate</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getLora()
 * @model
 * @generated
 */
@ProviderType
public interface Lora extends EObject {
	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(long)
	 * @see de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getLora_Bandwidth()
	 * @model
	 * @generated
	 */
	long getBandwidth();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(long value);

	/**
	 * Returns the value of the '<em><b>Spreading Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreading Factor</em>' attribute.
	 * @see #setSpreadingFactor(int)
	 * @see de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getLora_SpreadingFactor()
	 * @model extendedMetaData="name='spreading_factor' kind='element'"
	 * @generated
	 */
	int getSpreadingFactor();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora#getSpreadingFactor <em>Spreading Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreading Factor</em>' attribute.
	 * @see #getSpreadingFactor()
	 * @generated
	 */
	void setSpreadingFactor(int value);

	/**
	 * Returns the value of the '<em><b>Coding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coding Rate</em>' attribute.
	 * @see #setCodingRate(String)
	 * @see de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getLora_CodingRate()
	 * @model extendedMetaData="name='coding_rate' kind='element'"
	 * @generated
	 */
	String getCodingRate();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.gateway.sthbnd.ttn.uplinkpayload.model.uplinkpayload.Lora#getCodingRate <em>Coding Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coding Rate</em>' attribute.
	 * @see #getCodingRate()
	 * @generated
	 */
	void setCodingRate(String value);

} // Lora
