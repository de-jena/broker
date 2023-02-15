/*
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationRequest <em>Cancel Reservation Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationResponse <em>Cancel Reservation Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityRequest <em>Change Availability Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityResponse <em>Change Availability Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationRequest <em>Change Configuration Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationResponse <em>Change Configuration Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChargeBoxIdentity <em>Charge Box Identity</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheRequest <em>Clear Cache Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheResponse <em>Clear Cache Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileRequest <em>Clear Charging Profile Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileResponse <em>Clear Charging Profile Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferRequest <em>Data Transfer Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferResponse <em>Data Transfer Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleRequest <em>Get Composite Schedule Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleResponse <em>Get Composite Schedule Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationRequest <em>Get Configuration Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationResponse <em>Get Configuration Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsRequest <em>Get Diagnostics Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsResponse <em>Get Diagnostics Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionRequest <em>Get Local List Version Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionResponse <em>Get Local List Version Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionRequest <em>Remote Start Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionResponse <em>Remote Start Transaction Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionRequest <em>Remote Stop Transaction Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionResponse <em>Remote Stop Transaction Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowRequest <em>Reserve Now Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowResponse <em>Reserve Now Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetRequest <em>Reset Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetResponse <em>Reset Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListRequest <em>Send Local List Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListResponse <em>Send Local List Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileRequest <em>Set Charging Profile Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileResponse <em>Set Charging Profile Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageRequest <em>Trigger Message Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageResponse <em>Trigger Message Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorRequest <em>Unlock Connector Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorResponse <em>Unlock Connector Response</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareRequest <em>Update Firmware Request</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareResponse <em>Update Firmware Response</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Cancel Reservation Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Reservation Request</em>' containment reference.
	 * @see #setCancelReservationRequest(CancelReservationRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_CancelReservationRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cancelReservationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelReservationRequest getCancelReservationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationRequest <em>Cancel Reservation Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Reservation Request</em>' containment reference.
	 * @see #getCancelReservationRequest()
	 * @generated
	 */
	void setCancelReservationRequest(CancelReservationRequest value);

	/**
	 * Returns the value of the '<em><b>Cancel Reservation Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Reservation Response</em>' containment reference.
	 * @see #setCancelReservationResponse(CancelReservationResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_CancelReservationResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cancelReservationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelReservationResponse getCancelReservationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getCancelReservationResponse <em>Cancel Reservation Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Reservation Response</em>' containment reference.
	 * @see #getCancelReservationResponse()
	 * @generated
	 */
	void setCancelReservationResponse(CancelReservationResponse value);

	/**
	 * Returns the value of the '<em><b>Change Availability Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Availability Request</em>' containment reference.
	 * @see #setChangeAvailabilityRequest(ChangeAvailabilityRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ChangeAvailabilityRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeAvailabilityRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeAvailabilityRequest getChangeAvailabilityRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityRequest <em>Change Availability Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Availability Request</em>' containment reference.
	 * @see #getChangeAvailabilityRequest()
	 * @generated
	 */
	void setChangeAvailabilityRequest(ChangeAvailabilityRequest value);

	/**
	 * Returns the value of the '<em><b>Change Availability Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Availability Response</em>' containment reference.
	 * @see #setChangeAvailabilityResponse(ChangeAvailabilityResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ChangeAvailabilityResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeAvailabilityResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeAvailabilityResponse getChangeAvailabilityResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeAvailabilityResponse <em>Change Availability Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Availability Response</em>' containment reference.
	 * @see #getChangeAvailabilityResponse()
	 * @generated
	 */
	void setChangeAvailabilityResponse(ChangeAvailabilityResponse value);

	/**
	 * Returns the value of the '<em><b>Change Configuration Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Configuration Request</em>' containment reference.
	 * @see #setChangeConfigurationRequest(ChangeConfigurationRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ChangeConfigurationRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeConfigurationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeConfigurationRequest getChangeConfigurationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationRequest <em>Change Configuration Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Configuration Request</em>' containment reference.
	 * @see #getChangeConfigurationRequest()
	 * @generated
	 */
	void setChangeConfigurationRequest(ChangeConfigurationRequest value);

	/**
	 * Returns the value of the '<em><b>Change Configuration Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Configuration Response</em>' containment reference.
	 * @see #setChangeConfigurationResponse(ChangeConfigurationResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ChangeConfigurationResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='changeConfigurationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeConfigurationResponse getChangeConfigurationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChangeConfigurationResponse <em>Change Configuration Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Configuration Response</em>' containment reference.
	 * @see #getChangeConfigurationResponse()
	 * @generated
	 */
	void setChangeConfigurationResponse(ChangeConfigurationResponse value);

	/**
	 * Returns the value of the '<em><b>Charge Box Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Box Identity</em>' attribute.
	 * @see #setChargeBoxIdentity(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ChargeBoxIdentity()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chargeBoxIdentity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChargeBoxIdentity();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getChargeBoxIdentity <em>Charge Box Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Box Identity</em>' attribute.
	 * @see #getChargeBoxIdentity()
	 * @generated
	 */
	void setChargeBoxIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Clear Cache Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Cache Request</em>' containment reference.
	 * @see #setClearCacheRequest(ClearCacheRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ClearCacheRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='clearCacheRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ClearCacheRequest getClearCacheRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheRequest <em>Clear Cache Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Cache Request</em>' containment reference.
	 * @see #getClearCacheRequest()
	 * @generated
	 */
	void setClearCacheRequest(ClearCacheRequest value);

	/**
	 * Returns the value of the '<em><b>Clear Cache Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Cache Response</em>' containment reference.
	 * @see #setClearCacheResponse(ClearCacheResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ClearCacheResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='clearCacheResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClearCacheResponse getClearCacheResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearCacheResponse <em>Clear Cache Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Cache Response</em>' containment reference.
	 * @see #getClearCacheResponse()
	 * @generated
	 */
	void setClearCacheResponse(ClearCacheResponse value);

	/**
	 * Returns the value of the '<em><b>Clear Charging Profile Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Charging Profile Request</em>' containment reference.
	 * @see #setClearChargingProfileRequest(ClearChargingProfileRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ClearChargingProfileRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='clearChargingProfileRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ClearChargingProfileRequest getClearChargingProfileRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileRequest <em>Clear Charging Profile Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Charging Profile Request</em>' containment reference.
	 * @see #getClearChargingProfileRequest()
	 * @generated
	 */
	void setClearChargingProfileRequest(ClearChargingProfileRequest value);

	/**
	 * Returns the value of the '<em><b>Clear Charging Profile Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Charging Profile Response</em>' containment reference.
	 * @see #setClearChargingProfileResponse(ClearChargingProfileResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ClearChargingProfileResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='clearChargingProfileResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClearChargingProfileResponse getClearChargingProfileResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getClearChargingProfileResponse <em>Clear Charging Profile Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Charging Profile Response</em>' containment reference.
	 * @see #getClearChargingProfileResponse()
	 * @generated
	 */
	void setClearChargingProfileResponse(ClearChargingProfileResponse value);

	/**
	 * Returns the value of the '<em><b>Data Transfer Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Transfer Request</em>' containment reference.
	 * @see #setDataTransferRequest(DataTransferRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_DataTransferRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataTransferRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTransferRequest getDataTransferRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferRequest <em>Data Transfer Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transfer Request</em>' containment reference.
	 * @see #getDataTransferRequest()
	 * @generated
	 */
	void setDataTransferRequest(DataTransferRequest value);

	/**
	 * Returns the value of the '<em><b>Data Transfer Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Transfer Response</em>' containment reference.
	 * @see #setDataTransferResponse(DataTransferResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_DataTransferResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataTransferResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTransferResponse getDataTransferResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getDataTransferResponse <em>Data Transfer Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Transfer Response</em>' containment reference.
	 * @see #getDataTransferResponse()
	 * @generated
	 */
	void setDataTransferResponse(DataTransferResponse value);

	/**
	 * Returns the value of the '<em><b>Get Composite Schedule Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Composite Schedule Request</em>' containment reference.
	 * @see #setGetCompositeScheduleRequest(GetCompositeScheduleRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetCompositeScheduleRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCompositeScheduleRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCompositeScheduleRequest getGetCompositeScheduleRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleRequest <em>Get Composite Schedule Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Composite Schedule Request</em>' containment reference.
	 * @see #getGetCompositeScheduleRequest()
	 * @generated
	 */
	void setGetCompositeScheduleRequest(GetCompositeScheduleRequest value);

	/**
	 * Returns the value of the '<em><b>Get Composite Schedule Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Composite Schedule Response</em>' containment reference.
	 * @see #setGetCompositeScheduleResponse(GetCompositeScheduleResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetCompositeScheduleResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getCompositeScheduleResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCompositeScheduleResponse getGetCompositeScheduleResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetCompositeScheduleResponse <em>Get Composite Schedule Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Composite Schedule Response</em>' containment reference.
	 * @see #getGetCompositeScheduleResponse()
	 * @generated
	 */
	void setGetCompositeScheduleResponse(GetCompositeScheduleResponse value);

	/**
	 * Returns the value of the '<em><b>Get Configuration Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Configuration Request</em>' containment reference.
	 * @see #setGetConfigurationRequest(GetConfigurationRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetConfigurationRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConfigurationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConfigurationRequest getGetConfigurationRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationRequest <em>Get Configuration Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Configuration Request</em>' containment reference.
	 * @see #getGetConfigurationRequest()
	 * @generated
	 */
	void setGetConfigurationRequest(GetConfigurationRequest value);

	/**
	 * Returns the value of the '<em><b>Get Configuration Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Configuration Response</em>' containment reference.
	 * @see #setGetConfigurationResponse(GetConfigurationResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetConfigurationResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getConfigurationResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetConfigurationResponse getGetConfigurationResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetConfigurationResponse <em>Get Configuration Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Configuration Response</em>' containment reference.
	 * @see #getGetConfigurationResponse()
	 * @generated
	 */
	void setGetConfigurationResponse(GetConfigurationResponse value);

	/**
	 * Returns the value of the '<em><b>Get Diagnostics Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Diagnostics Request</em>' containment reference.
	 * @see #setGetDiagnosticsRequest(GetDiagnosticsRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetDiagnosticsRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getDiagnosticsRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDiagnosticsRequest getGetDiagnosticsRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsRequest <em>Get Diagnostics Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Diagnostics Request</em>' containment reference.
	 * @see #getGetDiagnosticsRequest()
	 * @generated
	 */
	void setGetDiagnosticsRequest(GetDiagnosticsRequest value);

	/**
	 * Returns the value of the '<em><b>Get Diagnostics Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Diagnostics Response</em>' containment reference.
	 * @see #setGetDiagnosticsResponse(GetDiagnosticsResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetDiagnosticsResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getDiagnosticsResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDiagnosticsResponse getGetDiagnosticsResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetDiagnosticsResponse <em>Get Diagnostics Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Diagnostics Response</em>' containment reference.
	 * @see #getGetDiagnosticsResponse()
	 * @generated
	 */
	void setGetDiagnosticsResponse(GetDiagnosticsResponse value);

	/**
	 * Returns the value of the '<em><b>Get Local List Version Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Local List Version Request</em>' containment reference.
	 * @see #setGetLocalListVersionRequest(GetLocalListVersionRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetLocalListVersionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getLocalListVersionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	GetLocalListVersionRequest getGetLocalListVersionRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionRequest <em>Get Local List Version Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Local List Version Request</em>' containment reference.
	 * @see #getGetLocalListVersionRequest()
	 * @generated
	 */
	void setGetLocalListVersionRequest(GetLocalListVersionRequest value);

	/**
	 * Returns the value of the '<em><b>Get Local List Version Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Local List Version Response</em>' containment reference.
	 * @see #setGetLocalListVersionResponse(GetLocalListVersionResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_GetLocalListVersionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='getLocalListVersionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	GetLocalListVersionResponse getGetLocalListVersionResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getGetLocalListVersionResponse <em>Get Local List Version Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Local List Version Response</em>' containment reference.
	 * @see #getGetLocalListVersionResponse()
	 * @generated
	 */
	void setGetLocalListVersionResponse(GetLocalListVersionResponse value);

	/**
	 * Returns the value of the '<em><b>Remote Start Transaction Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Start Transaction Request</em>' containment reference.
	 * @see #setRemoteStartTransactionRequest(RemoteStartTransactionRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_RemoteStartTransactionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remoteStartTransactionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteStartTransactionRequest getRemoteStartTransactionRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionRequest <em>Remote Start Transaction Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Start Transaction Request</em>' containment reference.
	 * @see #getRemoteStartTransactionRequest()
	 * @generated
	 */
	void setRemoteStartTransactionRequest(RemoteStartTransactionRequest value);

	/**
	 * Returns the value of the '<em><b>Remote Start Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Start Transaction Response</em>' containment reference.
	 * @see #setRemoteStartTransactionResponse(RemoteStartTransactionResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_RemoteStartTransactionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remoteStartTransactionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteStartTransactionResponse getRemoteStartTransactionResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStartTransactionResponse <em>Remote Start Transaction Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Start Transaction Response</em>' containment reference.
	 * @see #getRemoteStartTransactionResponse()
	 * @generated
	 */
	void setRemoteStartTransactionResponse(RemoteStartTransactionResponse value);

	/**
	 * Returns the value of the '<em><b>Remote Stop Transaction Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Stop Transaction Request</em>' containment reference.
	 * @see #setRemoteStopTransactionRequest(RemoteStopTransactionRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_RemoteStopTransactionRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remoteStopTransactionRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteStopTransactionRequest getRemoteStopTransactionRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionRequest <em>Remote Stop Transaction Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Stop Transaction Request</em>' containment reference.
	 * @see #getRemoteStopTransactionRequest()
	 * @generated
	 */
	void setRemoteStopTransactionRequest(RemoteStopTransactionRequest value);

	/**
	 * Returns the value of the '<em><b>Remote Stop Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Stop Transaction Response</em>' containment reference.
	 * @see #setRemoteStopTransactionResponse(RemoteStopTransactionResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_RemoteStopTransactionResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remoteStopTransactionResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteStopTransactionResponse getRemoteStopTransactionResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getRemoteStopTransactionResponse <em>Remote Stop Transaction Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Stop Transaction Response</em>' containment reference.
	 * @see #getRemoteStopTransactionResponse()
	 * @generated
	 */
	void setRemoteStopTransactionResponse(RemoteStopTransactionResponse value);

	/**
	 * Returns the value of the '<em><b>Reserve Now Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Now Request</em>' containment reference.
	 * @see #setReserveNowRequest(ReserveNowRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ReserveNowRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reserveNowRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ReserveNowRequest getReserveNowRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowRequest <em>Reserve Now Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Now Request</em>' containment reference.
	 * @see #getReserveNowRequest()
	 * @generated
	 */
	void setReserveNowRequest(ReserveNowRequest value);

	/**
	 * Returns the value of the '<em><b>Reserve Now Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Now Response</em>' containment reference.
	 * @see #setReserveNowResponse(ReserveNowResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ReserveNowResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reserveNowResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ReserveNowResponse getReserveNowResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getReserveNowResponse <em>Reserve Now Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Now Response</em>' containment reference.
	 * @see #getReserveNowResponse()
	 * @generated
	 */
	void setReserveNowResponse(ReserveNowResponse value);

	/**
	 * Returns the value of the '<em><b>Reset Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Request</em>' containment reference.
	 * @see #setResetRequest(ResetRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ResetRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resetRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ResetRequest getResetRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetRequest <em>Reset Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Request</em>' containment reference.
	 * @see #getResetRequest()
	 * @generated
	 */
	void setResetRequest(ResetRequest value);

	/**
	 * Returns the value of the '<em><b>Reset Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Response</em>' containment reference.
	 * @see #setResetResponse(ResetResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_ResetResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resetResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ResetResponse getResetResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getResetResponse <em>Reset Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Response</em>' containment reference.
	 * @see #getResetResponse()
	 * @generated
	 */
	void setResetResponse(ResetResponse value);

	/**
	 * Returns the value of the '<em><b>Send Local List Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Local List Request</em>' containment reference.
	 * @see #setSendLocalListRequest(SendLocalListRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_SendLocalListRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sendLocalListRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SendLocalListRequest getSendLocalListRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListRequest <em>Send Local List Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Local List Request</em>' containment reference.
	 * @see #getSendLocalListRequest()
	 * @generated
	 */
	void setSendLocalListRequest(SendLocalListRequest value);

	/**
	 * Returns the value of the '<em><b>Send Local List Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Local List Response</em>' containment reference.
	 * @see #setSendLocalListResponse(SendLocalListResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_SendLocalListResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sendLocalListResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SendLocalListResponse getSendLocalListResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSendLocalListResponse <em>Send Local List Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Local List Response</em>' containment reference.
	 * @see #getSendLocalListResponse()
	 * @generated
	 */
	void setSendLocalListResponse(SendLocalListResponse value);

	/**
	 * Returns the value of the '<em><b>Set Charging Profile Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Charging Profile Request</em>' containment reference.
	 * @see #setSetChargingProfileRequest(SetChargingProfileRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_SetChargingProfileRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setChargingProfileRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SetChargingProfileRequest getSetChargingProfileRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileRequest <em>Set Charging Profile Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Charging Profile Request</em>' containment reference.
	 * @see #getSetChargingProfileRequest()
	 * @generated
	 */
	void setSetChargingProfileRequest(SetChargingProfileRequest value);

	/**
	 * Returns the value of the '<em><b>Set Charging Profile Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Charging Profile Response</em>' containment reference.
	 * @see #setSetChargingProfileResponse(SetChargingProfileResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_SetChargingProfileResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setChargingProfileResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SetChargingProfileResponse getSetChargingProfileResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getSetChargingProfileResponse <em>Set Charging Profile Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Charging Profile Response</em>' containment reference.
	 * @see #getSetChargingProfileResponse()
	 * @generated
	 */
	void setSetChargingProfileResponse(SetChargingProfileResponse value);

	/**
	 * Returns the value of the '<em><b>Trigger Message Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Message Request</em>' containment reference.
	 * @see #setTriggerMessageRequest(TriggerMessageRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_TriggerMessageRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='triggerMessageRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerMessageRequest getTriggerMessageRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageRequest <em>Trigger Message Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Message Request</em>' containment reference.
	 * @see #getTriggerMessageRequest()
	 * @generated
	 */
	void setTriggerMessageRequest(TriggerMessageRequest value);

	/**
	 * Returns the value of the '<em><b>Trigger Message Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Message Response</em>' containment reference.
	 * @see #setTriggerMessageResponse(TriggerMessageResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_TriggerMessageResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='triggerMessageResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerMessageResponse getTriggerMessageResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getTriggerMessageResponse <em>Trigger Message Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Message Response</em>' containment reference.
	 * @see #getTriggerMessageResponse()
	 * @generated
	 */
	void setTriggerMessageResponse(TriggerMessageResponse value);

	/**
	 * Returns the value of the '<em><b>Unlock Connector Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock Connector Request</em>' containment reference.
	 * @see #setUnlockConnectorRequest(UnlockConnectorRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_UnlockConnectorRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unlockConnectorRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlockConnectorRequest getUnlockConnectorRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorRequest <em>Unlock Connector Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlock Connector Request</em>' containment reference.
	 * @see #getUnlockConnectorRequest()
	 * @generated
	 */
	void setUnlockConnectorRequest(UnlockConnectorRequest value);

	/**
	 * Returns the value of the '<em><b>Unlock Connector Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock Connector Response</em>' containment reference.
	 * @see #setUnlockConnectorResponse(UnlockConnectorResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_UnlockConnectorResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unlockConnectorResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlockConnectorResponse getUnlockConnectorResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUnlockConnectorResponse <em>Unlock Connector Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlock Connector Response</em>' containment reference.
	 * @see #getUnlockConnectorResponse()
	 * @generated
	 */
	void setUnlockConnectorResponse(UnlockConnectorResponse value);

	/**
	 * Returns the value of the '<em><b>Update Firmware Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Firmware Request</em>' containment reference.
	 * @see #setUpdateFirmwareRequest(UpdateFirmwareRequest)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_UpdateFirmwareRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='updateFirmwareRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateFirmwareRequest getUpdateFirmwareRequest();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareRequest <em>Update Firmware Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Firmware Request</em>' containment reference.
	 * @see #getUpdateFirmwareRequest()
	 * @generated
	 */
	void setUpdateFirmwareRequest(UpdateFirmwareRequest value);

	/**
	 * Returns the value of the '<em><b>Update Firmware Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Firmware Response</em>' containment reference.
	 * @see #setUpdateFirmwareResponse(UpdateFirmwareResponse)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getDocumentRoot_UpdateFirmwareResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='updateFirmwareResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateFirmwareResponse getUpdateFirmwareResponse();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.DocumentRoot#getUpdateFirmwareResponse <em>Update Firmware Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Firmware Response</em>' containment reference.
	 * @see #getUpdateFirmwareResponse()
	 * @generated
	 */
	void setUpdateFirmwareResponse(UpdateFirmwareResponse value);

} // DocumentRoot
