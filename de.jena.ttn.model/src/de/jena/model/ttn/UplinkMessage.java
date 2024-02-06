/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uplink Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getSessionKeyId <em>Session Key Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getFPort <em>FPort</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getFCnt <em>FCnt</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getFrmPayload <em>Frm Payload</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getRxMetadata <em>Rx Metadata</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getSettings <em>Settings</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getGatewayChannelIndex <em>Gateway Channel Index</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getDeviceChannelIndex <em>Device Channel Index</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getDecodedPayload <em>Decoded Payload</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getNetworkIds <em>Network Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getConsumedAirtime <em>Consumed Airtime</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getReceivedAt <em>Received At</em>}</li>
 *   <li>{@link de.jena.model.ttn.UplinkMessage#getVersionIds <em>Version Ids</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage()
 * @model
 * @generated
 */
@ProviderType
public interface UplinkMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Key Id</em>' attribute.
	 * @see #setSessionKeyId(String)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_SessionKeyId()
	 * @model extendedMetaData="name='session_key_id' kind='element'"
	 * @generated
	 */
	String getSessionKeyId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getSessionKeyId <em>Session Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Key Id</em>' attribute.
	 * @see #getSessionKeyId()
	 * @generated
	 */
	void setSessionKeyId(String value);

	/**
	 * Returns the value of the '<em><b>FPort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPort</em>' attribute.
	 * @see #setFPort(int)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_FPort()
	 * @model extendedMetaData="name='f_port' kind='element'"
	 * @generated
	 */
	int getFPort();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getFPort <em>FPort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPort</em>' attribute.
	 * @see #getFPort()
	 * @generated
	 */
	void setFPort(int value);

	/**
	 * Returns the value of the '<em><b>FCnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCnt</em>' attribute.
	 * @see #setFCnt(int)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_FCnt()
	 * @model extendedMetaData="name='f_cnt' kind='element'"
	 * @generated
	 */
	int getFCnt();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getFCnt <em>FCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCnt</em>' attribute.
	 * @see #getFCnt()
	 * @generated
	 */
	void setFCnt(int value);

	/**
	 * Returns the value of the '<em><b>Frm Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frm Payload</em>' attribute.
	 * @see #setFrmPayload(String)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_FrmPayload()
	 * @model extendedMetaData="name='frm_payload' kind='element'"
	 * @generated
	 */
	String getFrmPayload();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getFrmPayload <em>Frm Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frm Payload</em>' attribute.
	 * @see #getFrmPayload()
	 * @generated
	 */
	void setFrmPayload(String value);

	/**
	 * Returns the value of the '<em><b>Rx Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.model.ttn.RxMetadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx Metadata</em>' containment reference list.
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_RxMetadata()
	 * @model containment="true"
	 *        extendedMetaData="name='rx_metadata' kind='element'"
	 * @generated
	 */
	EList<RxMetadata> getRxMetadata();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(Settings)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_Settings()
	 * @model containment="true"
	 * @generated
	 */
	Settings getSettings();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(Settings value);

	/**
	 * Returns the value of the '<em><b>Gateway Channel Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Channel Index</em>' attribute.
	 * @see #setGatewayChannelIndex(int)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_GatewayChannelIndex()
	 * @model extendedMetaData="name='gateway_channel_index' kind='element'"
	 * @generated
	 */
	int getGatewayChannelIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getGatewayChannelIndex <em>Gateway Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Channel Index</em>' attribute.
	 * @see #getGatewayChannelIndex()
	 * @generated
	 */
	void setGatewayChannelIndex(int value);

	/**
	 * Returns the value of the '<em><b>Device Channel Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Channel Index</em>' attribute.
	 * @see #setDeviceChannelIndex(int)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_DeviceChannelIndex()
	 * @model extendedMetaData="name='device_channel_index' kind='element'"
	 * @generated
	 */
	int getDeviceChannelIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getDeviceChannelIndex <em>Device Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Channel Index</em>' attribute.
	 * @see #getDeviceChannelIndex()
	 * @generated
	 */
	void setDeviceChannelIndex(int value);

	/**
	 * Returns the value of the '<em><b>Decoded Payload</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoded Payload</em>' map.
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_DecodedPayload()
	 * @model mapType="de.jena.model.ttn.StringToObjectMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
	 *        extendedMetaData="name='decoded_payload' kind='element'"
	 * @generated
	 */
	EMap<String, Object> getDecodedPayload();

	/**
	 * Returns the value of the '<em><b>Network Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Ids</em>' containment reference.
	 * @see #setNetworkIds(NetworkIds)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_NetworkIds()
	 * @model containment="true"
	 *        extendedMetaData="name='network_ids' kind='element'"
	 * @generated
	 */
	NetworkIds getNetworkIds();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getNetworkIds <em>Network Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Ids</em>' containment reference.
	 * @see #getNetworkIds()
	 * @generated
	 */
	void setNetworkIds(NetworkIds value);

	/**
	 * Returns the value of the '<em><b>Consumed Airtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Airtime</em>' attribute.
	 * @see #setConsumedAirtime(String)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_ConsumedAirtime()
	 * @model extendedMetaData="name='consumed_airtime' kind='element'"
	 * @generated
	 */
	String getConsumedAirtime();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getConsumedAirtime <em>Consumed Airtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed Airtime</em>' attribute.
	 * @see #getConsumedAirtime()
	 * @generated
	 */
	void setConsumedAirtime(String value);

	/**
	 * Returns the value of the '<em><b>Received At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received At</em>' attribute.
	 * @see #setReceivedAt(String)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_ReceivedAt()
	 * @model extendedMetaData="name='received_at' kind='element'"
	 * @generated
	 */
	String getReceivedAt();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getReceivedAt <em>Received At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received At</em>' attribute.
	 * @see #getReceivedAt()
	 * @generated
	 */
	void setReceivedAt(String value);

	/**
	 * Returns the value of the '<em><b>Version Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Ids</em>' containment reference.
	 * @see #setVersionIds(VersionIds)
	 * @see de.jena.model.ttn.TTNPackage#getUplinkMessage_VersionIds()
	 * @model containment="true"
	 *        extendedMetaData="name='version_ids' kind='element'"
	 * @generated
	 */
	VersionIds getVersionIds();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.UplinkMessage#getVersionIds <em>Version Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Ids</em>' containment reference.
	 * @see #getVersionIds()
	 * @generated
	 */
	void setVersionIds(VersionIds value);

} // UplinkMessage
