/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rx Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getGatewayIds <em>Gateway Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getRssi <em>Rssi</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getChannelRssi <em>Channel Rssi</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getSnr <em>Snr</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getUplinkToken <em>Uplink Token</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getReceivedAt <em>Received At</em>}</li>
 *   <li>{@link de.jena.model.ttn.RxMetadata#getChannelIndex <em>Channel Index</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getRxMetadata()
 * @model
 * @generated
 */
@ProviderType
public interface RxMetadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Gateway Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Ids</em>' containment reference.
	 * @see #setGatewayIds(GatewayIds)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_GatewayIds()
	 * @model containment="true"
	 *        extendedMetaData="name='gateway_ids' kind='element'"
	 * @generated
	 */
	GatewayIds getGatewayIds();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getGatewayIds <em>Gateway Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Ids</em>' containment reference.
	 * @see #getGatewayIds()
	 * @generated
	 */
	void setGatewayIds(GatewayIds value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi</em>' attribute.
	 * @see #setRssi(int)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_Rssi()
	 * @model
	 * @generated
	 */
	int getRssi();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getRssi <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi</em>' attribute.
	 * @see #getRssi()
	 * @generated
	 */
	void setRssi(int value);

	/**
	 * Returns the value of the '<em><b>Channel Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Rssi</em>' attribute.
	 * @see #setChannelRssi(int)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_ChannelRssi()
	 * @model extendedMetaData="name='channel_rssi' kind='element'"
	 * @generated
	 */
	int getChannelRssi();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getChannelRssi <em>Channel Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Rssi</em>' attribute.
	 * @see #getChannelRssi()
	 * @generated
	 */
	void setChannelRssi(int value);

	/**
	 * Returns the value of the '<em><b>Snr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snr</em>' attribute.
	 * @see #setSnr(double)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_Snr()
	 * @model
	 * @generated
	 */
	double getSnr();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getSnr <em>Snr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snr</em>' attribute.
	 * @see #getSnr()
	 * @generated
	 */
	void setSnr(double value);

	/**
	 * Returns the value of the '<em><b>Uplink Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uplink Token</em>' attribute.
	 * @see #setUplinkToken(String)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_UplinkToken()
	 * @model extendedMetaData="name='uplink_token' kind='element'"
	 * @generated
	 */
	String getUplinkToken();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getUplinkToken <em>Uplink Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uplink Token</em>' attribute.
	 * @see #getUplinkToken()
	 * @generated
	 */
	void setUplinkToken(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Received At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received At</em>' attribute.
	 * @see #setReceivedAt(String)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_ReceivedAt()
	 * @model extendedMetaData="name='received_at' kind='element'"
	 * @generated
	 */
	String getReceivedAt();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getReceivedAt <em>Received At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received At</em>' attribute.
	 * @see #getReceivedAt()
	 * @generated
	 */
	void setReceivedAt(String value);

	/**
	 * Returns the value of the '<em><b>Channel Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Index</em>' attribute.
	 * @see #setChannelIndex(int)
	 * @see de.jena.model.ttn.TTNPackage#getRxMetadata_ChannelIndex()
	 * @model extendedMetaData="name='channel_index' kind='element'"
	 * @generated
	 */
	int getChannelIndex();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.RxMetadata#getChannelIndex <em>Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Index</em>' attribute.
	 * @see #getChannelIndex()
	 * @generated
	 */
	void setChannelIndex(int value);

} // RxMetadata
