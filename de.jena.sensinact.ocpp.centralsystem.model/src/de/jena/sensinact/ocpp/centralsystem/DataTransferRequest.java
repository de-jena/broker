/**
 */
package de.jena.sensinact.ocpp.centralsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the DataTransfer.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getVendorId <em>Vendor Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDataTransferRequest()
 * @model extendedMetaData="name='DataTransferRequest' kind='elementOnly'"
 * @generated
 */
public interface DataTransferRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Id</em>' attribute.
	 * @see #setVendorId(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDataTransferRequest_VendorId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='element' name='vendorId' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getVendorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getVendorId <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Id</em>' attribute.
	 * @see #getVendorId()
	 * @generated
	 */
	void setVendorId(Object value);

	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDataTransferRequest_MessageId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='messageId' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMessageId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(Object value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getDataTransferRequest_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // DataTransferRequest
