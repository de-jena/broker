/*
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the Reset.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getResetRequest()
 * @model extendedMetaData="name='ResetRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResetRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ResetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ResetType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getResetRequest_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResetType getType();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ResetType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ResetType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ResetType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ResetRequest#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ResetType)
	 * @generated
	 */
	boolean isSetType();

} // ResetRequest
