/*
 */
package org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.EndDeviceIds;
import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.TtnUplinkPayload;
import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkMessage;
import org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ttn Uplink Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl#getEndDeviceIds <em>End Device Ids</em>}</li>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl#getCorrelationIds <em>Correlation Ids</em>}</li>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl#getUplinkMessage <em>Uplink Message</em>}</li>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl#isConfirmed <em>Confirmed</em>}</li>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl#isRetry <em>Retry</em>}</li>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.impl.TtnUplinkPayloadImpl#getReceivedAt <em>Received At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TtnUplinkPayloadImpl extends MinimalEObjectImpl.Container implements TtnUplinkPayload {
	/**
	 * The cached value of the '{@link #getEndDeviceIds() <em>End Device Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceIds()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceIds endDeviceIds;

	/**
	 * The cached value of the '{@link #getCorrelationIds() <em>Correlation Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> correlationIds;

	/**
	 * The cached value of the '{@link #getUplinkMessage() <em>Uplink Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUplinkMessage()
	 * @generated
	 * @ordered
	 */
	protected UplinkMessage uplinkMessage;

	/**
	 * The default value of the '{@link #isConfirmed() <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirmed() <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmed()
	 * @generated
	 * @ordered
	 */
	protected boolean confirmed = CONFIRMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRetry() <em>Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetry() <em>Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetry()
	 * @generated
	 * @ordered
	 */
	protected boolean retry = RETRY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtnUplinkPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UplinkPayloadPackage.eINSTANCE.getTtnUplinkPayload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndDeviceIds getEndDeviceIds() {
		return endDeviceIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceIds(EndDeviceIds newEndDeviceIds, NotificationChain msgs) {
		EndDeviceIds oldEndDeviceIds = endDeviceIds;
		endDeviceIds = newEndDeviceIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS, oldEndDeviceIds, newEndDeviceIds);
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
	public void setEndDeviceIds(EndDeviceIds newEndDeviceIds) {
		if (newEndDeviceIds != endDeviceIds) {
			NotificationChain msgs = null;
			if (endDeviceIds != null)
				msgs = ((InternalEObject)endDeviceIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS, null, msgs);
			if (newEndDeviceIds != null)
				msgs = ((InternalEObject)newEndDeviceIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS, null, msgs);
			msgs = basicSetEndDeviceIds(newEndDeviceIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS, newEndDeviceIds, newEndDeviceIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCorrelationIds() {
		if (correlationIds == null) {
			correlationIds = new EDataTypeUniqueEList<String>(String.class, this, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CORRELATION_IDS);
		}
		return correlationIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UplinkMessage getUplinkMessage() {
		return uplinkMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUplinkMessage(UplinkMessage newUplinkMessage, NotificationChain msgs) {
		UplinkMessage oldUplinkMessage = uplinkMessage;
		uplinkMessage = newUplinkMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE, oldUplinkMessage, newUplinkMessage);
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
	public void setUplinkMessage(UplinkMessage newUplinkMessage) {
		if (newUplinkMessage != uplinkMessage) {
			NotificationChain msgs = null;
			if (uplinkMessage != null)
				msgs = ((InternalEObject)uplinkMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE, null, msgs);
			if (newUplinkMessage != null)
				msgs = ((InternalEObject)newUplinkMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE, null, msgs);
			msgs = basicSetUplinkMessage(newUplinkMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE, newUplinkMessage, newUplinkMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConfirmed() {
		return confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmed(boolean newConfirmed) {
		boolean oldConfirmed = confirmed;
		confirmed = newConfirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CONFIRMED, oldConfirmed, confirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetry() {
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetry(boolean newRetry) {
		boolean oldRetry = retry;
		retry = newRetry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RETRY, oldRetry, retry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RECEIVED_AT, oldReceivedAt, receivedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS:
				return basicSetEndDeviceIds(null, msgs);
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE:
				return basicSetUplinkMessage(null, msgs);
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
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS:
				return getEndDeviceIds();
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CORRELATION_IDS:
				return getCorrelationIds();
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE:
				return getUplinkMessage();
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CONFIRMED:
				return isConfirmed();
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RETRY:
				return isRetry();
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RECEIVED_AT:
				return getReceivedAt();
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
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS:
				setEndDeviceIds((EndDeviceIds)newValue);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CORRELATION_IDS:
				getCorrelationIds().clear();
				getCorrelationIds().addAll((Collection<? extends String>)newValue);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE:
				setUplinkMessage((UplinkMessage)newValue);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CONFIRMED:
				setConfirmed((Boolean)newValue);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RETRY:
				setRetry((Boolean)newValue);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RECEIVED_AT:
				setReceivedAt((String)newValue);
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
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS:
				setEndDeviceIds((EndDeviceIds)null);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CORRELATION_IDS:
				getCorrelationIds().clear();
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE:
				setUplinkMessage((UplinkMessage)null);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CONFIRMED:
				setConfirmed(CONFIRMED_EDEFAULT);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RETRY:
				setRetry(RETRY_EDEFAULT);
				return;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RECEIVED_AT:
				setReceivedAt(RECEIVED_AT_EDEFAULT);
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
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__END_DEVICE_IDS:
				return endDeviceIds != null;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CORRELATION_IDS:
				return correlationIds != null && !correlationIds.isEmpty();
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__UPLINK_MESSAGE:
				return uplinkMessage != null;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__CONFIRMED:
				return confirmed != CONFIRMED_EDEFAULT;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RETRY:
				return retry != RETRY_EDEFAULT;
			case UplinkPayloadPackage.TTN_UPLINK_PAYLOAD__RECEIVED_AT:
				return RECEIVED_AT_EDEFAULT == null ? receivedAt != null : !RECEIVED_AT_EDEFAULT.equals(receivedAt);
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
		result.append(" (correlationIds: ");
		result.append(correlationIds);
		result.append(", confirmed: ");
		result.append(confirmed);
		result.append(", retry: ");
		result.append(retry);
		result.append(", receivedAt: ");
		result.append(receivedAt);
		result.append(')');
		return result.toString();
	}

} //TtnUplinkPayloadImpl
