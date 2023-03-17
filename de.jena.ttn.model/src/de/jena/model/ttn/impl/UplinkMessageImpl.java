/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.NetworkIds;
import de.jena.model.ttn.RxMetadata;
import de.jena.model.ttn.Settings;
import de.jena.model.ttn.TTNPackage;
import de.jena.model.ttn.UplinkMessage;
import de.jena.model.ttn.VersionIds;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uplink Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getSessionKeyId <em>Session Key Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getFPort <em>FPort</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getFCnt <em>FCnt</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getFrmPayload <em>Frm Payload</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getRxMetadata <em>Rx Metadata</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getGatewayChannelIndex <em>Gateway Channel Index</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getDeviceChannelIndex <em>Device Channel Index</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getDecodedPayload <em>Decoded Payload</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getNetworkIds <em>Network Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getConsumedAirtime <em>Consumed Airtime</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getReceivedAt <em>Received At</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.UplinkMessageImpl#getVersionIds <em>Version Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UplinkMessageImpl extends MinimalEObjectImpl.Container implements UplinkMessage {
	/**
	 * The default value of the '{@link #getSessionKeyId() <em>Session Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionKeyId()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_KEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionKeyId() <em>Session Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionKeyId()
	 * @generated
	 * @ordered
	 */
	protected String sessionKeyId = SESSION_KEY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFPort() <em>FPort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPort()
	 * @generated
	 * @ordered
	 */
	protected static final int FPORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFPort() <em>FPort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPort()
	 * @generated
	 * @ordered
	 */
	protected int fPort = FPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFCnt() <em>FCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCnt()
	 * @generated
	 * @ordered
	 */
	protected static final int FCNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFCnt() <em>FCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCnt()
	 * @generated
	 * @ordered
	 */
	protected int fCnt = FCNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrmPayload() <em>Frm Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrmPayload()
	 * @generated
	 * @ordered
	 */
	protected static final String FRM_PAYLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrmPayload() <em>Frm Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrmPayload()
	 * @generated
	 * @ordered
	 */
	protected String frmPayload = FRM_PAYLOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRxMetadata() <em>Rx Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<RxMetadata> rxMetadata;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected Settings settings;

	/**
	 * The default value of the '{@link #getGatewayChannelIndex() <em>Gateway Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayChannelIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int GATEWAY_CHANNEL_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGatewayChannelIndex() <em>Gateway Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayChannelIndex()
	 * @generated
	 * @ordered
	 */
	protected int gatewayChannelIndex = GATEWAY_CHANNEL_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceChannelIndex() <em>Device Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceChannelIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int DEVICE_CHANNEL_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeviceChannelIndex() <em>Device Channel Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceChannelIndex()
	 * @generated
	 * @ordered
	 */
	protected int deviceChannelIndex = DEVICE_CHANNEL_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecodedPayload() <em>Decoded Payload</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecodedPayload()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Object> decodedPayload;

	/**
	 * The cached value of the '{@link #getNetworkIds() <em>Network Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIds()
	 * @generated
	 * @ordered
	 */
	protected NetworkIds networkIds;

	/**
	 * The default value of the '{@link #getConsumedAirtime() <em>Consumed Airtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedAirtime()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMED_AIRTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumedAirtime() <em>Consumed Airtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedAirtime()
	 * @generated
	 * @ordered
	 */
	protected String consumedAirtime = CONSUMED_AIRTIME_EDEFAULT;

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
	 * The cached value of the '{@link #getVersionIds() <em>Version Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionIds()
	 * @generated
	 * @ordered
	 */
	protected VersionIds versionIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UplinkMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getUplinkMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionKeyId() {
		return sessionKeyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionKeyId(String newSessionKeyId) {
		String oldSessionKeyId = sessionKeyId;
		sessionKeyId = newSessionKeyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__SESSION_KEY_ID, oldSessionKeyId, sessionKeyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFPort() {
		return fPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFPort(int newFPort) {
		int oldFPort = fPort;
		fPort = newFPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__FPORT, oldFPort, fPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFCnt() {
		return fCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFCnt(int newFCnt) {
		int oldFCnt = fCnt;
		fCnt = newFCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__FCNT, oldFCnt, fCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrmPayload() {
		return frmPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrmPayload(String newFrmPayload) {
		String oldFrmPayload = frmPayload;
		frmPayload = newFrmPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__FRM_PAYLOAD, oldFrmPayload, frmPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RxMetadata> getRxMetadata() {
		if (rxMetadata == null) {
			rxMetadata = new EObjectContainmentEList<RxMetadata>(RxMetadata.class, this, TTNPackage.UPLINK_MESSAGE__RX_METADATA);
		}
		return rxMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Settings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(Settings newSettings, NotificationChain msgs) {
		Settings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__SETTINGS, oldSettings, newSettings);
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
	public void setSettings(Settings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.UPLINK_MESSAGE__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.UPLINK_MESSAGE__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGatewayChannelIndex() {
		return gatewayChannelIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayChannelIndex(int newGatewayChannelIndex) {
		int oldGatewayChannelIndex = gatewayChannelIndex;
		gatewayChannelIndex = newGatewayChannelIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX, oldGatewayChannelIndex, gatewayChannelIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeviceChannelIndex() {
		return deviceChannelIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceChannelIndex(int newDeviceChannelIndex) {
		int oldDeviceChannelIndex = deviceChannelIndex;
		deviceChannelIndex = newDeviceChannelIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX, oldDeviceChannelIndex, deviceChannelIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Object> getDecodedPayload() {
		if (decodedPayload == null) {
			decodedPayload = new EcoreEMap<String,Object>(TTNPackage.eINSTANCE.getStringToObjectMap(), StringToObjectMapImpl.class, this, TTNPackage.UPLINK_MESSAGE__DECODED_PAYLOAD);
		}
		return decodedPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkIds getNetworkIds() {
		return networkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkIds(NetworkIds newNetworkIds, NotificationChain msgs) {
		NetworkIds oldNetworkIds = networkIds;
		networkIds = newNetworkIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__NETWORK_IDS, oldNetworkIds, newNetworkIds);
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
	public void setNetworkIds(NetworkIds newNetworkIds) {
		if (newNetworkIds != networkIds) {
			NotificationChain msgs = null;
			if (networkIds != null)
				msgs = ((InternalEObject)networkIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.UPLINK_MESSAGE__NETWORK_IDS, null, msgs);
			if (newNetworkIds != null)
				msgs = ((InternalEObject)newNetworkIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.UPLINK_MESSAGE__NETWORK_IDS, null, msgs);
			msgs = basicSetNetworkIds(newNetworkIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__NETWORK_IDS, newNetworkIds, newNetworkIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumedAirtime() {
		return consumedAirtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumedAirtime(String newConsumedAirtime) {
		String oldConsumedAirtime = consumedAirtime;
		consumedAirtime = newConsumedAirtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__CONSUMED_AIRTIME, oldConsumedAirtime, consumedAirtime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__RECEIVED_AT, oldReceivedAt, receivedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionIds getVersionIds() {
		return versionIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionIds(VersionIds newVersionIds, NotificationChain msgs) {
		VersionIds oldVersionIds = versionIds;
		versionIds = newVersionIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__VERSION_IDS, oldVersionIds, newVersionIds);
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
	public void setVersionIds(VersionIds newVersionIds) {
		if (newVersionIds != versionIds) {
			NotificationChain msgs = null;
			if (versionIds != null)
				msgs = ((InternalEObject)versionIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TTNPackage.UPLINK_MESSAGE__VERSION_IDS, null, msgs);
			if (newVersionIds != null)
				msgs = ((InternalEObject)newVersionIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TTNPackage.UPLINK_MESSAGE__VERSION_IDS, null, msgs);
			msgs = basicSetVersionIds(newVersionIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.UPLINK_MESSAGE__VERSION_IDS, newVersionIds, newVersionIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TTNPackage.UPLINK_MESSAGE__RX_METADATA:
				return ((InternalEList<?>)getRxMetadata()).basicRemove(otherEnd, msgs);
			case TTNPackage.UPLINK_MESSAGE__SETTINGS:
				return basicSetSettings(null, msgs);
			case TTNPackage.UPLINK_MESSAGE__DECODED_PAYLOAD:
				return ((InternalEList<?>)getDecodedPayload()).basicRemove(otherEnd, msgs);
			case TTNPackage.UPLINK_MESSAGE__NETWORK_IDS:
				return basicSetNetworkIds(null, msgs);
			case TTNPackage.UPLINK_MESSAGE__VERSION_IDS:
				return basicSetVersionIds(null, msgs);
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
			case TTNPackage.UPLINK_MESSAGE__SESSION_KEY_ID:
				return getSessionKeyId();
			case TTNPackage.UPLINK_MESSAGE__FPORT:
				return getFPort();
			case TTNPackage.UPLINK_MESSAGE__FCNT:
				return getFCnt();
			case TTNPackage.UPLINK_MESSAGE__FRM_PAYLOAD:
				return getFrmPayload();
			case TTNPackage.UPLINK_MESSAGE__RX_METADATA:
				return getRxMetadata();
			case TTNPackage.UPLINK_MESSAGE__SETTINGS:
				return getSettings();
			case TTNPackage.UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX:
				return getGatewayChannelIndex();
			case TTNPackage.UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX:
				return getDeviceChannelIndex();
			case TTNPackage.UPLINK_MESSAGE__DECODED_PAYLOAD:
				if (coreType) return getDecodedPayload();
				else return getDecodedPayload().map();
			case TTNPackage.UPLINK_MESSAGE__NETWORK_IDS:
				return getNetworkIds();
			case TTNPackage.UPLINK_MESSAGE__CONSUMED_AIRTIME:
				return getConsumedAirtime();
			case TTNPackage.UPLINK_MESSAGE__RECEIVED_AT:
				return getReceivedAt();
			case TTNPackage.UPLINK_MESSAGE__VERSION_IDS:
				return getVersionIds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TTNPackage.UPLINK_MESSAGE__SESSION_KEY_ID:
				setSessionKeyId((String)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__FPORT:
				setFPort((Integer)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__FCNT:
				setFCnt((Integer)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__FRM_PAYLOAD:
				setFrmPayload((String)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__RX_METADATA:
				getRxMetadata().clear();
				getRxMetadata().addAll((Collection<? extends RxMetadata>)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__SETTINGS:
				setSettings((Settings)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX:
				setGatewayChannelIndex((Integer)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX:
				setDeviceChannelIndex((Integer)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__DECODED_PAYLOAD:
				((EStructuralFeature.Setting)getDecodedPayload()).set(newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__NETWORK_IDS:
				setNetworkIds((NetworkIds)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__CONSUMED_AIRTIME:
				setConsumedAirtime((String)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__RECEIVED_AT:
				setReceivedAt((String)newValue);
				return;
			case TTNPackage.UPLINK_MESSAGE__VERSION_IDS:
				setVersionIds((VersionIds)newValue);
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
			case TTNPackage.UPLINK_MESSAGE__SESSION_KEY_ID:
				setSessionKeyId(SESSION_KEY_ID_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__FPORT:
				setFPort(FPORT_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__FCNT:
				setFCnt(FCNT_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__FRM_PAYLOAD:
				setFrmPayload(FRM_PAYLOAD_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__RX_METADATA:
				getRxMetadata().clear();
				return;
			case TTNPackage.UPLINK_MESSAGE__SETTINGS:
				setSettings((Settings)null);
				return;
			case TTNPackage.UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX:
				setGatewayChannelIndex(GATEWAY_CHANNEL_INDEX_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX:
				setDeviceChannelIndex(DEVICE_CHANNEL_INDEX_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__DECODED_PAYLOAD:
				getDecodedPayload().clear();
				return;
			case TTNPackage.UPLINK_MESSAGE__NETWORK_IDS:
				setNetworkIds((NetworkIds)null);
				return;
			case TTNPackage.UPLINK_MESSAGE__CONSUMED_AIRTIME:
				setConsumedAirtime(CONSUMED_AIRTIME_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__RECEIVED_AT:
				setReceivedAt(RECEIVED_AT_EDEFAULT);
				return;
			case TTNPackage.UPLINK_MESSAGE__VERSION_IDS:
				setVersionIds((VersionIds)null);
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
			case TTNPackage.UPLINK_MESSAGE__SESSION_KEY_ID:
				return SESSION_KEY_ID_EDEFAULT == null ? sessionKeyId != null : !SESSION_KEY_ID_EDEFAULT.equals(sessionKeyId);
			case TTNPackage.UPLINK_MESSAGE__FPORT:
				return fPort != FPORT_EDEFAULT;
			case TTNPackage.UPLINK_MESSAGE__FCNT:
				return fCnt != FCNT_EDEFAULT;
			case TTNPackage.UPLINK_MESSAGE__FRM_PAYLOAD:
				return FRM_PAYLOAD_EDEFAULT == null ? frmPayload != null : !FRM_PAYLOAD_EDEFAULT.equals(frmPayload);
			case TTNPackage.UPLINK_MESSAGE__RX_METADATA:
				return rxMetadata != null && !rxMetadata.isEmpty();
			case TTNPackage.UPLINK_MESSAGE__SETTINGS:
				return settings != null;
			case TTNPackage.UPLINK_MESSAGE__GATEWAY_CHANNEL_INDEX:
				return gatewayChannelIndex != GATEWAY_CHANNEL_INDEX_EDEFAULT;
			case TTNPackage.UPLINK_MESSAGE__DEVICE_CHANNEL_INDEX:
				return deviceChannelIndex != DEVICE_CHANNEL_INDEX_EDEFAULT;
			case TTNPackage.UPLINK_MESSAGE__DECODED_PAYLOAD:
				return decodedPayload != null && !decodedPayload.isEmpty();
			case TTNPackage.UPLINK_MESSAGE__NETWORK_IDS:
				return networkIds != null;
			case TTNPackage.UPLINK_MESSAGE__CONSUMED_AIRTIME:
				return CONSUMED_AIRTIME_EDEFAULT == null ? consumedAirtime != null : !CONSUMED_AIRTIME_EDEFAULT.equals(consumedAirtime);
			case TTNPackage.UPLINK_MESSAGE__RECEIVED_AT:
				return RECEIVED_AT_EDEFAULT == null ? receivedAt != null : !RECEIVED_AT_EDEFAULT.equals(receivedAt);
			case TTNPackage.UPLINK_MESSAGE__VERSION_IDS:
				return versionIds != null;
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
		result.append(" (sessionKeyId: ");
		result.append(sessionKeyId);
		result.append(", fPort: ");
		result.append(fPort);
		result.append(", fCnt: ");
		result.append(fCnt);
		result.append(", frmPayload: ");
		result.append(frmPayload);
		result.append(", gatewayChannelIndex: ");
		result.append(gatewayChannelIndex);
		result.append(", deviceChannelIndex: ");
		result.append(deviceChannelIndex);
		result.append(", consumedAirtime: ");
		result.append(consumedAirtime);
		result.append(", receivedAt: ");
		result.append(receivedAt);
		result.append(')');
		return result.toString();
	}

} //UplinkMessageImpl
