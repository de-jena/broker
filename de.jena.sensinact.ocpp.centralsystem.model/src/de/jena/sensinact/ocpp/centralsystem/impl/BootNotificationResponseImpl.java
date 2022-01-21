/**
 */
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boot Notification Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationResponseImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootNotificationResponseImpl extends MinimalEObjectImpl.Container implements BootNotificationResponse {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Object status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CURRENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar currentTime = CURRENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected int interval = INTERVAL_EDEFAULT;

	/**
	 * This is true if the Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootNotificationResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.BOOT_NOTIFICATION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Object newStatus) {
		Object oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCurrentTime() {
		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentTime(XMLGregorianCalendar newCurrentTime) {
		XMLGregorianCalendar oldCurrentTime = currentTime;
		currentTime = newCurrentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME, oldCurrentTime, currentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterval(int newInterval) {
		int oldInterval = interval;
		interval = newInterval;
		boolean oldIntervalESet = intervalESet;
		intervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__INTERVAL, oldInterval, interval, !oldIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInterval() {
		int oldInterval = interval;
		boolean oldIntervalESet = intervalESet;
		interval = INTERVAL_EDEFAULT;
		intervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__INTERVAL, oldInterval, INTERVAL_EDEFAULT, oldIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInterval() {
		return intervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__STATUS:
				return getStatus();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME:
				return getCurrentTime();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__INTERVAL:
				return getInterval();
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
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__STATUS:
				setStatus(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME:
				setCurrentTime((XMLGregorianCalendar)newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__INTERVAL:
				setInterval((Integer)newValue);
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
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME:
				setCurrentTime(CURRENT_TIME_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__INTERVAL:
				unsetInterval();
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
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME:
				return CURRENT_TIME_EDEFAULT == null ? currentTime != null : !CURRENT_TIME_EDEFAULT.equals(currentTime);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_RESPONSE__INTERVAL:
				return isSetInterval();
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
		result.append(" (status: ");
		result.append(status);
		result.append(", currentTime: ");
		result.append(currentTime);
		result.append(", interval: ");
		if (intervalESet) result.append(interval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BootNotificationResponseImpl
