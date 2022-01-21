/**
 */
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Transaction Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionResponseImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.StartTransactionResponseImpl#getIdTagInfo <em>Id Tag Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartTransactionResponseImpl extends MinimalEObjectImpl.Container implements StartTransactionResponse {
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
	 * The default value of the '{@link #getIdTagInfo() <em>Id Tag Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTagInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_TAG_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTagInfo() <em>Id Tag Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTagInfo()
	 * @generated
	 * @ordered
	 */
	protected Object idTagInfo = ID_TAG_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTransactionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.START_TRANSACTION_RESPONSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__TRANSACTION_ID, oldTransactionId, transactionId, !oldTransactionIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__TRANSACTION_ID, oldTransactionId, TRANSACTION_ID_EDEFAULT, oldTransactionIdESet));
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
	public Object getIdTagInfo() {
		return idTagInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTagInfo(Object newIdTagInfo) {
		Object oldIdTagInfo = idTagInfo;
		idTagInfo = newIdTagInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__ID_TAG_INFO, oldIdTagInfo, idTagInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__TRANSACTION_ID:
				return getTransactionId();
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__ID_TAG_INFO:
				return getIdTagInfo();
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
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__TRANSACTION_ID:
				setTransactionId((Integer)newValue);
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__ID_TAG_INFO:
				setIdTagInfo(newValue);
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
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__TRANSACTION_ID:
				unsetTransactionId();
				return;
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__ID_TAG_INFO:
				setIdTagInfo(ID_TAG_INFO_EDEFAULT);
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
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__TRANSACTION_ID:
				return isSetTransactionId();
			case OcppCentralSystemPackage.START_TRANSACTION_RESPONSE__ID_TAG_INFO:
				return ID_TAG_INFO_EDEFAULT == null ? idTagInfo != null : !ID_TAG_INFO_EDEFAULT.equals(idTagInfo);
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
		result.append(", idTagInfo: ");
		result.append(idTagInfo);
		result.append(')');
		return result.toString();
	}

} //StartTransactionResponseImpl
