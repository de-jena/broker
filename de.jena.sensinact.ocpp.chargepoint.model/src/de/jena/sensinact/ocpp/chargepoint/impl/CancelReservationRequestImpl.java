/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.CancelReservationRequest;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cancel Reservation Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.CancelReservationRequestImpl#getReservationId <em>Reservation Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CancelReservationRequestImpl extends MinimalEObjectImpl.Container implements CancelReservationRequest {
	/**
	 * The default value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected int reservationId = RESERVATION_ID_EDEFAULT;

	/**
	 * This is true if the Reservation Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reservationIdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CancelReservationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.CANCEL_RESERVATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReservationId() {
		return reservationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservationId(int newReservationId) {
		int oldReservationId = reservationId;
		reservationId = newReservationId;
		boolean oldReservationIdESet = reservationIdESet;
		reservationIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CANCEL_RESERVATION_REQUEST__RESERVATION_ID, oldReservationId, reservationId, !oldReservationIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReservationId() {
		int oldReservationId = reservationId;
		boolean oldReservationIdESet = reservationIdESet;
		reservationId = RESERVATION_ID_EDEFAULT;
		reservationIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CANCEL_RESERVATION_REQUEST__RESERVATION_ID, oldReservationId, RESERVATION_ID_EDEFAULT, oldReservationIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReservationId() {
		return reservationIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST__RESERVATION_ID:
				return getReservationId();
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
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST__RESERVATION_ID:
				setReservationId((Integer)newValue);
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
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST__RESERVATION_ID:
				unsetReservationId();
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
			case OcppChargePointPackage.CANCEL_RESERVATION_REQUEST__RESERVATION_ID:
				return isSetReservationId();
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
		result.append(" (reservationId: ");
		if (reservationIdESet) result.append(reservationId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CancelReservationRequestImpl
