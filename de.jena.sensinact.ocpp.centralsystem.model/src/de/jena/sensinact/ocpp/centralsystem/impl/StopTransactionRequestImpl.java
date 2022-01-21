/**
 */
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Transaction Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl#getIdTag <em>Id Tag</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl#getMeterStop <em>Meter Stop</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StopTransactionRequestImpl#getTransactionData <em>Transaction Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopTransactionRequestImpl extends MinimalEObjectImpl.Container implements StopTransactionRequest {
	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected int transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * This is true if the Transaction Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionIdESet;

	/**
	 * The default value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTag() <em>Id Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTag()
	 * @generated
	 * @ordered
	 */
	protected Object idTag = ID_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeterStop() <em>Meter Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterStop()
	 * @generated
	 * @ordered
	 */
	protected static final int METER_STOP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeterStop() <em>Meter Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterStop()
	 * @generated
	 * @ordered
	 */
	protected int meterStop = METER_STOP_EDEFAULT;

	/**
	 * This is true if the Meter Stop attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meterStopESet;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected Object reason = REASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransactionData() <em>Transaction Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionData()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> transactionData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopTransactionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.STOP_TRANSACTION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(int newTransactionId) {
		int oldTransactionId = transactionId;
		transactionId = newTransactionId;
		boolean oldTransactionIdESet = transactionIdESet;
		transactionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_ID, oldTransactionId, transactionId, !oldTransactionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTransactionId() {
		int oldTransactionId = transactionId;
		boolean oldTransactionIdESet = transactionIdESet;
		transactionId = TRANSACTION_ID_EDEFAULT;
		transactionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_ID, oldTransactionId, TRANSACTION_ID_EDEFAULT, oldTransactionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTransactionId() {
		return transactionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIdTag() {
		return idTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTag(Object newIdTag) {
		Object oldIdTag = idTag;
		idTag = newIdTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__ID_TAG, oldIdTag, idTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMeterStop() {
		return meterStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterStop(int newMeterStop) {
		int oldMeterStop = meterStop;
		meterStop = newMeterStop;
		boolean oldMeterStopESet = meterStopESet;
		meterStopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__METER_STOP, oldMeterStop, meterStop, !oldMeterStopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMeterStop() {
		int oldMeterStop = meterStop;
		boolean oldMeterStopESet = meterStopESet;
		meterStop = METER_STOP_EDEFAULT;
		meterStopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__METER_STOP, oldMeterStop, METER_STOP_EDEFAULT, oldMeterStopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMeterStop() {
		return meterStopESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(Object newReason) {
		Object oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getTransactionData() {
		if (transactionData == null) {
			transactionData = new EDataTypeEList<Object>(Object.class, this, OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_DATA);
		}
		return transactionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_ID:
				return getTransactionId();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__ID_TAG:
				return getIdTag();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TIMESTAMP:
				return getTimestamp();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__METER_STOP:
				return getMeterStop();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__REASON:
				return getReason();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_DATA:
				return getTransactionData();
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
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_ID:
				setTransactionId((Integer)newValue);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__ID_TAG:
				setIdTag(newValue);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__METER_STOP:
				setMeterStop((Integer)newValue);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__REASON:
				setReason(newValue);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_DATA:
				getTransactionData().clear();
				getTransactionData().addAll((Collection<? extends Object>)newValue);
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
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_ID:
				unsetTransactionId();
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__ID_TAG:
				setIdTag(ID_TAG_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__METER_STOP:
				unsetMeterStop();
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_DATA:
				getTransactionData().clear();
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
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_ID:
				return isSetTransactionId();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__ID_TAG:
				return ID_TAG_EDEFAULT == null ? idTag != null : !ID_TAG_EDEFAULT.equals(idTag);
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__METER_STOP:
				return isSetMeterStop();
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case OcppCentralSystemPackage.STOP_TRANSACTION_REQUEST__TRANSACTION_DATA:
				return transactionData != null && !transactionData.isEmpty();
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
		result.append(" (transactionId: ");
		if (transactionIdESet) result.append(transactionId); else result.append("<unset>");
		result.append(", idTag: ");
		result.append(idTag);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", meterStop: ");
		if (meterStopESet) result.append(meterStop); else result.append("<unset>");
		result.append(", reason: ");
		result.append(reason);
		result.append(", transactionData: ");
		result.append(transactionData);
		result.append(')');
		return result.toString();
	}

} //StopTransactionRequestImpl
