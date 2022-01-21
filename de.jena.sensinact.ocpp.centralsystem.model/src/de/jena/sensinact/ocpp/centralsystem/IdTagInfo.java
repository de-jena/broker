/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Tag Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getParentIdTag <em>Parent Id Tag</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getIdTagInfo()
 * @model extendedMetaData="name='IdTagInfo' kind='elementOnly'"
 * @generated
 */
public interface IdTagInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getIdTagInfo_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStatus();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Object value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getIdTagInfo_ExpiryDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='expiryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpiryDate();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getExpiryDate <em>Expiry Date</em>}' attribute.
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
	 * @see #setParentIdTag(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getIdTagInfo_ParentIdTag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='parentIdTag' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getParentIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo#getParentIdTag <em>Parent Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Id Tag</em>' attribute.
	 * @see #getParentIdTag()
	 * @generated
	 */
	void setParentIdTag(Object value);

} // IdTagInfo
