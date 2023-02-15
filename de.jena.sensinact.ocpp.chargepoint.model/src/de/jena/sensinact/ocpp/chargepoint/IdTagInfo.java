/*
 */
package de.jena.sensinact.ocpp.chargepoint;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Tag Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getParentIdTag <em>Parent Id Tag</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getIdTagInfo()
 * @model extendedMetaData="name='IdTagInfo' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdTagInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(AuthorizationStatus)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getIdTagInfo_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorizationStatus getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.AuthorizationStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AuthorizationStatus value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(AuthorizationStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(AuthorizationStatus)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getIdTagInfo_ExpiryDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expiryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpiryDate();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Parent Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Id Tag</em>' attribute.
	 * @see #setParentIdTag(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getIdTagInfo_ParentIdTag()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.IdToken"
	 *        extendedMetaData="kind='element' name='parentIdTag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParentIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.IdTagInfo#getParentIdTag <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Id Tag</em>' attribute.
	 * @see #getParentIdTag()
	 * @generated
	 */
	void setParentIdTag(String value);

} // IdTagInfo
