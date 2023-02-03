/*
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.MessageTrigger;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.TriggerMessageRequest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Message Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageRequestImpl#getRequestedMessage <em>Requested Message</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.TriggerMessageRequestImpl#getConnectorId <em>Connector Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerMessageRequestImpl extends MinimalEObjectImpl.Container implements TriggerMessageRequest {
	/**
	 * The default value of the '{@link #getRequestedMessage() <em>Requested Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMessage()
	 * @generated
	 * @ordered
	 */
	protected static final MessageTrigger REQUESTED_MESSAGE_EDEFAULT = MessageTrigger.BOOT_NOTIFICATION;

	/**
	 * The cached value of the '{@link #getRequestedMessage() <em>Requested Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedMessage()
	 * @generated
	 * @ordered
	 */
	protected MessageTrigger requestedMessage = REQUESTED_MESSAGE_EDEFAULT;

	/**
	 * This is true if the Requested Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestedMessageESet;

	/**
	 * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorId()
	 * @generated
	 * @ordered
	 */
	protected int connectorId = CONNECTOR_ID_EDEFAULT;

	/**
	 * This is true if the Connector Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectorIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerMessageRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.TRIGGER_MESSAGE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageTrigger getRequestedMessage() {
		return requestedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedMessage(MessageTrigger newRequestedMessage) {
		MessageTrigger oldRequestedMessage = requestedMessage;
		requestedMessage = newRequestedMessage == null ? REQUESTED_MESSAGE_EDEFAULT : newRequestedMessage;
		boolean oldRequestedMessageESet = requestedMessageESet;
		requestedMessageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE, oldRequestedMessage, requestedMessage, !oldRequestedMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRequestedMessage() {
		MessageTrigger oldRequestedMessage = requestedMessage;
		boolean oldRequestedMessageESet = requestedMessageESet;
		requestedMessage = REQUESTED_MESSAGE_EDEFAULT;
		requestedMessageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE, oldRequestedMessage, REQUESTED_MESSAGE_EDEFAULT, oldRequestedMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRequestedMessage() {
		return requestedMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectorId() {
		return connectorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorId(int newConnectorId) {
		int oldConnectorId = connectorId;
		connectorId = newConnectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID, oldConnectorId, connectorId, !oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectorId() {
		int oldConnectorId = connectorId;
		boolean oldConnectorIdESet = connectorIdESet;
		connectorId = CONNECTOR_ID_EDEFAULT;
		connectorIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID, oldConnectorId, CONNECTOR_ID_EDEFAULT, oldConnectorIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectorId() {
		return connectorIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE:
				return getRequestedMessage();
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID:
				return getConnectorId();
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
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE:
				setRequestedMessage((MessageTrigger)newValue);
				return;
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID:
				setConnectorId((Integer)newValue);
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
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE:
				unsetRequestedMessage();
				return;
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID:
				unsetConnectorId();
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
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__REQUESTED_MESSAGE:
				return isSetRequestedMessage();
			case OcppChargePointPackage.TRIGGER_MESSAGE_REQUEST__CONNECTOR_ID:
				return isSetConnectorId();
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
		result.append(" (requestedMessage: ");
		if (requestedMessageESet) result.append(requestedMessage); else result.append("<unset>");
		result.append(", connectorId: ");
		if (connectorIdESet) result.append(connectorId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TriggerMessageRequestImpl
