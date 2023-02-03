/*
 */
package de.jena.sensinact.ocpp.centralsystem;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Transaction Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the StopTransaction.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getMeterStop <em>Meter Stop</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionData <em>Transaction Data</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest()
 * @model extendedMetaData="name='StopTransactionRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StopTransactionRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #setTransactionId(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest_TransactionId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='transactionId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTransactionId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #isSetTransactionId()
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	void unsetTransactionId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTransactionId <em>Transaction Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Id</em>' attribute is set.
	 * @see #unsetTransactionId()
	 * @see #getTransactionId()
	 * @see #setTransactionId(int)
	 * @generated
	 */
	boolean isSetTransactionId();

	/**
	 * Returns the value of the '<em><b>Id Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tag</em>' attribute.
	 * @see #setIdTag(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest_IdTag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='idTag' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIdTag();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getIdTag <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tag</em>' attribute.
	 * @see #getIdTag()
	 * @generated
	 */
	void setIdTag(Object value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Meter Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Stop</em>' attribute.
	 * @see #isSetMeterStop()
	 * @see #unsetMeterStop()
	 * @see #setMeterStop(int)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest_MeterStop()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='meterStop' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMeterStop();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getMeterStop <em>Meter Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Stop</em>' attribute.
	 * @see #isSetMeterStop()
	 * @see #unsetMeterStop()
	 * @see #getMeterStop()
	 * @generated
	 */
	void setMeterStop(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getMeterStop <em>Meter Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeterStop()
	 * @see #getMeterStop()
	 * @see #setMeterStop(int)
	 * @generated
	 */
	void unsetMeterStop();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getMeterStop <em>Meter Stop</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Meter Stop</em>' attribute is set.
	 * @see #unsetMeterStop()
	 * @see #getMeterStop()
	 * @see #setMeterStop(int)
	 * @generated
	 */
	boolean isSetMeterStop();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(Object)
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest_Reason()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getReason();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(Object value);

	/**
	 * Returns the value of the '<em><b>Transaction Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Data</em>' attribute list.
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#getStopTransactionRequest_TransactionData()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='transactionData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Object> getTransactionData();

} // StopTransactionRequest
