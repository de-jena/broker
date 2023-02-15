/*
 */
package de.jena.sensinact.ocpp.centralsystem;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Transaction Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the StopTransaction.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse#getIdTagInfo <em>Id Tag Info</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionResponse()
 * @model extendedMetaData="name='StopTransactionResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StopTransactionResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Tag Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag Info</em>' attribute.
	 * @see #setIdTagInfo(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionResponse_IdTagInfo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='idTagInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIdTagInfo();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse#getIdTagInfo <em>Id Tag Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag Info</em>' attribute.
	 * @see #getIdTagInfo()
	 * @generated
	 */
	void setIdTagInfo(Object value);

} // StopTransactionResponse
