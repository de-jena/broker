/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.DataTransferRequest;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl#getVendorId <em>Vendor Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.DataTransferRequestImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTransferRequestImpl extends MinimalEObjectImpl.Container implements DataTransferRequest {
	/**
	 * The default value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorId() <em>Vendor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorId()
	 * @generated
	 * @ordered
	 */
	protected String vendorId = VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected String messageId = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransferRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.DATA_TRANSFER_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorId() {
		return vendorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorId(String newVendorId) {
		String oldVendorId = vendorId;
		vendorId = newVendorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.DATA_TRANSFER_REQUEST__VENDOR_ID, oldVendorId, vendorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageId() {
		return messageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageId(String newMessageId) {
		String oldMessageId = messageId;
		messageId = newMessageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID, oldMessageId, messageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.DATA_TRANSFER_REQUEST__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				return getVendorId();
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				return getMessageId();
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__DATA:
				return getData();
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
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				setVendorId((String)newValue);
				return;
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				setMessageId((String)newValue);
				return;
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__DATA:
				setData((String)newValue);
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
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				setVendorId(VENDOR_ID_EDEFAULT);
				return;
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
				return;
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__DATA:
				setData(DATA_EDEFAULT);
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
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorId != null : !VENDOR_ID_EDEFAULT.equals(vendorId);
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
			case OcppChargePointPackage.DATA_TRANSFER_REQUEST__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
		result.append(" (vendorId: ");
		result.append(vendorId);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //DataTransferRequestImpl
