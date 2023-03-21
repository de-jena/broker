/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.GatewayIds;
import de.jena.model.ttn.Location;
import de.jena.model.ttn.RxMetadata;
import de.jena.model.ttn.TTNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rx Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getGatewayIds <em>Gateway Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getRssi <em>Rssi</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getChannelRssi <em>Channel Rssi</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getSnr <em>Snr</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getUplinkToken <em>Uplink Token</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getReceivedAt <em>Received At</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.RxMetadataImpl#getChannelIndex <em>Channel Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RxMetadataImpl extends MinimalEObjectImpl.Container implements RxMetadata {
	/**
	 * The cached value of the '{@link #getGatewayIds() <em>Gateway Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIds()
	 * @generated
	 * @ordered
	 */
	protected GatewayIds gatewayIds;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected static final int RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected int rssi = RSSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelRssi() <em>Channel Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelRssi()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannelRssi() <em>Channel Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelRssi()
	 * @generated
	 * @ordered
	 */
	protected int channelRssi = CHANNEL_RSSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnr() <em>Snr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnr()
	 * @generated
	 * @ordered
	 */
	protected static final double SNR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSnr() <em>Snr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnr()
	 * @generated
	 * @ordered
	 */
	protected double snr = SNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getUplinkToken() <em>Uplink Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUplinkToken()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLINK_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUplinkToken() <em>Uplink Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUplinkToken()
	 * @generated
	 * @ordered
	 */
	protected String uplinkToken = UPLINK_TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getReceivedAt() <em>Received At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedAt() <em>Received At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedAt()
	 * @generated
	 * @ordered
	 */
	protected String receivedAt = RECEIVED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelIndex() <em>Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannelIndex() <em>Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelIndex()
	 * @generated
	 * @ordered
	 */
	protected int channelIndex = CHANNEL_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RxMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getRxMetadata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayIds getGatewayIds() {
		return gatewayIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGatewayIds(GatewayIds newGatewayIds, NotificationChain msgs) {
		GatewayIds oldGatewayIds = gatewayIds;
		gatewayIds = newGatewayIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__GATEWAY_IDS, oldGatewayIds, newGatewayIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayIds(GatewayIds newGatewayIds) {
		if (newGatewayIds != gatewayIds) {
			NotificationChain msgs = null;
			if (gatewayIds != null)
				msgs = ((InternalEObject)gatewayIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.RX_METADATA__GATEWAY_IDS, null, msgs);
			if (newGatewayIds != null)
				msgs = ((InternalEObject)newGatewayIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.RX_METADATA__GATEWAY_IDS, null, msgs);
			msgs = basicSetGatewayIds(newGatewayIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__GATEWAY_IDS, newGatewayIds, newGatewayIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRssi() {
		return rssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRssi(int newRssi) {
		int oldRssi = rssi;
		rssi = newRssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__RSSI, oldRssi, rssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChannelRssi() {
		return channelRssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelRssi(int newChannelRssi) {
		int oldChannelRssi = channelRssi;
		channelRssi = newChannelRssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__CHANNEL_RSSI, oldChannelRssi, channelRssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSnr() {
		return snr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnr(double newSnr) {
		double oldSnr = snr;
		snr = newSnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__SNR, oldSnr, snr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUplinkToken() {
		return uplinkToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUplinkToken(String newUplinkToken) {
		String oldUplinkToken = uplinkToken;
		uplinkToken = newUplinkToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__UPLINK_TOKEN, oldUplinkToken, uplinkToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.RX_METADATA__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.RX_METADATA__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceivedAt() {
		return receivedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedAt(String newReceivedAt) {
		String oldReceivedAt = receivedAt;
		receivedAt = newReceivedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__RECEIVED_AT, oldReceivedAt, receivedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChannelIndex() {
		return channelIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelIndex(int newChannelIndex) {
		int oldChannelIndex = channelIndex;
		channelIndex = newChannelIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.RX_METADATA__CHANNEL_INDEX, oldChannelIndex, channelIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTNPackage.RX_METADATA__GATEWAY_IDS:
				return basicSetGatewayIds(null, msgs);
			case TTNPackage.RX_METADATA__LOCATION:
				return basicSetLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTNPackage.RX_METADATA__GATEWAY_IDS:
				return getGatewayIds();
			case TTNPackage.RX_METADATA__TIME:
				return getTime();
			case TTNPackage.RX_METADATA__TIMESTAMP:
				return getTimestamp();
			case TTNPackage.RX_METADATA__RSSI:
				return getRssi();
			case TTNPackage.RX_METADATA__CHANNEL_RSSI:
				return getChannelRssi();
			case TTNPackage.RX_METADATA__SNR:
				return getSnr();
			case TTNPackage.RX_METADATA__UPLINK_TOKEN:
				return getUplinkToken();
			case TTNPackage.RX_METADATA__LOCATION:
				return getLocation();
			case TTNPackage.RX_METADATA__RECEIVED_AT:
				return getReceivedAt();
			case TTNPackage.RX_METADATA__CHANNEL_INDEX:
				return getChannelIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TTNPackage.RX_METADATA__GATEWAY_IDS:
				setGatewayIds((GatewayIds)newValue);
				return;
			case TTNPackage.RX_METADATA__TIME:
				setTime((String)newValue);
				return;
			case TTNPackage.RX_METADATA__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case TTNPackage.RX_METADATA__RSSI:
				setRssi((Integer)newValue);
				return;
			case TTNPackage.RX_METADATA__CHANNEL_RSSI:
				setChannelRssi((Integer)newValue);
				return;
			case TTNPackage.RX_METADATA__SNR:
				setSnr((Double)newValue);
				return;
			case TTNPackage.RX_METADATA__UPLINK_TOKEN:
				setUplinkToken((String)newValue);
				return;
			case TTNPackage.RX_METADATA__LOCATION:
				setLocation((Location)newValue);
				return;
			case TTNPackage.RX_METADATA__RECEIVED_AT:
				setReceivedAt((String)newValue);
				return;
			case TTNPackage.RX_METADATA__CHANNEL_INDEX:
				setChannelIndex((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TTNPackage.RX_METADATA__GATEWAY_IDS:
				setGatewayIds((GatewayIds)null);
				return;
			case TTNPackage.RX_METADATA__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__RSSI:
				setRssi(RSSI_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__CHANNEL_RSSI:
				setChannelRssi(CHANNEL_RSSI_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__SNR:
				setSnr(SNR_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__UPLINK_TOKEN:
				setUplinkToken(UPLINK_TOKEN_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__LOCATION:
				setLocation((Location)null);
				return;
			case TTNPackage.RX_METADATA__RECEIVED_AT:
				setReceivedAt(RECEIVED_AT_EDEFAULT);
				return;
			case TTNPackage.RX_METADATA__CHANNEL_INDEX:
				setChannelIndex(CHANNEL_INDEX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TTNPackage.RX_METADATA__GATEWAY_IDS:
				return gatewayIds != null;
			case TTNPackage.RX_METADATA__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case TTNPackage.RX_METADATA__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case TTNPackage.RX_METADATA__RSSI:
				return rssi != RSSI_EDEFAULT;
			case TTNPackage.RX_METADATA__CHANNEL_RSSI:
				return channelRssi != CHANNEL_RSSI_EDEFAULT;
			case TTNPackage.RX_METADATA__SNR:
				return snr != SNR_EDEFAULT;
			case TTNPackage.RX_METADATA__UPLINK_TOKEN:
				return UPLINK_TOKEN_EDEFAULT == null ? uplinkToken != null : !UPLINK_TOKEN_EDEFAULT.equals(uplinkToken);
			case TTNPackage.RX_METADATA__LOCATION:
				return location != null;
			case TTNPackage.RX_METADATA__RECEIVED_AT:
				return RECEIVED_AT_EDEFAULT == null ? receivedAt != null : !RECEIVED_AT_EDEFAULT.equals(receivedAt);
			case TTNPackage.RX_METADATA__CHANNEL_INDEX:
				return channelIndex != CHANNEL_INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", rssi: ");
		result.append(rssi);
		result.append(", channelRssi: ");
		result.append(channelRssi);
		result.append(", snr: ");
		result.append(snr);
		result.append(", uplinkToken: ");
		result.append(uplinkToken);
		result.append(", receivedAt: ");
		result.append(receivedAt);
		result.append(", channelIndex: ");
		result.append(channelIndex);
		result.append(')');
		return result.toString();
	}

} //RxMetadataImpl
