/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ttn Uplink Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.TtnUplinkPayload#getEndDeviceIds <em>End Device Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.TtnUplinkPayload#getCorrelationIds <em>Correlation Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.TtnUplinkPayload#getUplinkMessage <em>Uplink Message</em>}</li>
 *   <li>{@link de.jena.model.ttn.TtnUplinkPayload#isConfirmed <em>Confirmed</em>}</li>
 *   <li>{@link de.jena.model.ttn.TtnUplinkPayload#isRetry <em>Retry</em>}</li>
 *   <li>{@link de.jena.model.ttn.TtnUplinkPayload#getReceivedAt <em>Received At</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload()
 * @model
 * @generated
 */
@ProviderType
public interface TtnUplinkPayload extends EObject {
	/**
	 * Returns the value of the '<em><b>End Device Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Ids</em>' containment reference.
	 * @see #setEndDeviceIds(EndDeviceIds)
	 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload_EndDeviceIds()
	 * @model containment="true"
	 *        extendedMetaData="name='end_device_ids' kind='element'"
	 * @generated
	 */
	EndDeviceIds getEndDeviceIds();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.TtnUplinkPayload#getEndDeviceIds <em>End Device Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Ids</em>' containment reference.
	 * @see #getEndDeviceIds()
	 * @generated
	 */
	void setEndDeviceIds(EndDeviceIds value);

	/**
	 * Returns the value of the '<em><b>Correlation Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Ids</em>' attribute list.
	 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload_CorrelationIds()
	 * @model extendedMetaData="name='correlation_ids' kind='element'"
	 * @generated
	 */
	EList<String> getCorrelationIds();

	/**
	 * Returns the value of the '<em><b>Uplink Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uplink Message</em>' containment reference.
	 * @see #setUplinkMessage(UplinkMessage)
	 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload_UplinkMessage()
	 * @model containment="true"
	 *        extendedMetaData="name='uplink_message' kind='element'"
	 * @generated
	 */
	UplinkMessage getUplinkMessage();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.TtnUplinkPayload#getUplinkMessage <em>Uplink Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uplink Message</em>' containment reference.
	 * @see #getUplinkMessage()
	 * @generated
	 */
	void setUplinkMessage(UplinkMessage value);

	/**
	 * Returns the value of the '<em><b>Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmed</em>' attribute.
	 * @see #setConfirmed(boolean)
	 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload_Confirmed()
	 * @model
	 * @generated
	 */
	boolean isConfirmed();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.TtnUplinkPayload#isConfirmed <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmed</em>' attribute.
	 * @see #isConfirmed()
	 * @generated
	 */
	void setConfirmed(boolean value);

	/**
	 * Returns the value of the '<em><b>Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry</em>' attribute.
	 * @see #setRetry(boolean)
	 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload_Retry()
	 * @model extendedMetaData="name='is_retry' kind='element'"
	 * @generated
	 */
	boolean isRetry();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.TtnUplinkPayload#isRetry <em>Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry</em>' attribute.
	 * @see #isRetry()
	 * @generated
	 */
	void setRetry(boolean value);

	/**
	 * Returns the value of the '<em><b>Received At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received At</em>' attribute.
	 * @see #setReceivedAt(String)
	 * @see de.jena.model.ttn.TTNPackage#getTtnUplinkPayload_ReceivedAt()
	 * @model extendedMetaData="name='received_at' kind='element'"
	 * @generated
	 */
	String getReceivedAt();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.TtnUplinkPayload#getReceivedAt <em>Received At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received At</em>' attribute.
	 * @see #getReceivedAt()
	 * @generated
	 */
	void setReceivedAt(String value);

} // TtnUplinkPayload
