/*
 */
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boot Notification Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getChargePointVendor <em>Charge Point Vendor</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getChargePointModel <em>Charge Point Model</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getChargePointSerialNumber <em>Charge Point Serial Number</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getChargeBoxSerialNumber <em>Charge Box Serial Number</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getFirmwareVersion <em>Firmware Version</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getIccid <em>Iccid</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getImsi <em>Imsi</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getMeterType <em>Meter Type</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.centralsystem.impl.BootNotificationRequestImpl#getMeterSerialNumber <em>Meter Serial Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootNotificationRequestImpl extends MinimalEObjectImpl.Container implements BootNotificationRequest {
	/**
	 * The default value of the '{@link #getChargePointVendor() <em>Charge Point Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargePointVendor()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHARGE_POINT_VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChargePointVendor() <em>Charge Point Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargePointVendor()
	 * @generated
	 * @ordered
	 */
	protected Object chargePointVendor = CHARGE_POINT_VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargePointModel() <em>Charge Point Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargePointModel()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHARGE_POINT_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChargePointModel() <em>Charge Point Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargePointModel()
	 * @generated
	 * @ordered
	 */
	protected Object chargePointModel = CHARGE_POINT_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargePointSerialNumber() <em>Charge Point Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargePointSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHARGE_POINT_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChargePointSerialNumber() <em>Charge Point Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargePointSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected Object chargePointSerialNumber = CHARGE_POINT_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargeBoxSerialNumber() <em>Charge Box Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeBoxSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHARGE_BOX_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChargeBoxSerialNumber() <em>Charge Box Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeBoxSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected Object chargeBoxSerialNumber = CHARGE_BOX_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIRMWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected Object firmwareVersion = FIRMWARE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIccid() <em>Iccid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIccid()
	 * @generated
	 * @ordered
	 */
	protected static final Object ICCID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIccid() <em>Iccid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIccid()
	 * @generated
	 * @ordered
	 */
	protected Object iccid = ICCID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImsi() <em>Imsi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImsi()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMSI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImsi() <em>Imsi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImsi()
	 * @generated
	 * @ordered
	 */
	protected Object imsi = IMSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeterType() <em>Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterType()
	 * @generated
	 * @ordered
	 */
	protected static final Object METER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterType() <em>Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterType()
	 * @generated
	 * @ordered
	 */
	protected Object meterType = METER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeterSerialNumber() <em>Meter Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Object METER_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterSerialNumber() <em>Meter Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected Object meterSerialNumber = METER_SERIAL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootNotificationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.BOOT_NOTIFICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getChargePointVendor() {
		return chargePointVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargePointVendor(Object newChargePointVendor) {
		Object oldChargePointVendor = chargePointVendor;
		chargePointVendor = newChargePointVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR, oldChargePointVendor, chargePointVendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getChargePointModel() {
		return chargePointModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargePointModel(Object newChargePointModel) {
		Object oldChargePointModel = chargePointModel;
		chargePointModel = newChargePointModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL, oldChargePointModel, chargePointModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getChargePointSerialNumber() {
		return chargePointSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargePointSerialNumber(Object newChargePointSerialNumber) {
		Object oldChargePointSerialNumber = chargePointSerialNumber;
		chargePointSerialNumber = newChargePointSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER, oldChargePointSerialNumber, chargePointSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getChargeBoxSerialNumber() {
		return chargeBoxSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargeBoxSerialNumber(Object newChargeBoxSerialNumber) {
		Object oldChargeBoxSerialNumber = chargeBoxSerialNumber;
		chargeBoxSerialNumber = newChargeBoxSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER, oldChargeBoxSerialNumber, chargeBoxSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirmwareVersion(Object newFirmwareVersion) {
		Object oldFirmwareVersion = firmwareVersion;
		firmwareVersion = newFirmwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION, oldFirmwareVersion, firmwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIccid() {
		return iccid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIccid(Object newIccid) {
		Object oldIccid = iccid;
		iccid = newIccid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__ICCID, oldIccid, iccid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImsi() {
		return imsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImsi(Object newImsi) {
		Object oldImsi = imsi;
		imsi = newImsi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__IMSI, oldImsi, imsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMeterType() {
		return meterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterType(Object newMeterType) {
		Object oldMeterType = meterType;
		meterType = newMeterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_TYPE, oldMeterType, meterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMeterSerialNumber() {
		return meterSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterSerialNumber(Object newMeterSerialNumber) {
		Object oldMeterSerialNumber = meterSerialNumber;
		meterSerialNumber = newMeterSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER, oldMeterSerialNumber, meterSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR:
				return getChargePointVendor();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL:
				return getChargePointModel();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER:
				return getChargePointSerialNumber();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER:
				return getChargeBoxSerialNumber();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION:
				return getFirmwareVersion();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__ICCID:
				return getIccid();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__IMSI:
				return getImsi();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_TYPE:
				return getMeterType();
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER:
				return getMeterSerialNumber();
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
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR:
				setChargePointVendor(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL:
				setChargePointModel(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER:
				setChargePointSerialNumber(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER:
				setChargeBoxSerialNumber(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION:
				setFirmwareVersion(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__ICCID:
				setIccid(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__IMSI:
				setImsi(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_TYPE:
				setMeterType(newValue);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER:
				setMeterSerialNumber(newValue);
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
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR:
				setChargePointVendor(CHARGE_POINT_VENDOR_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL:
				setChargePointModel(CHARGE_POINT_MODEL_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER:
				setChargePointSerialNumber(CHARGE_POINT_SERIAL_NUMBER_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER:
				setChargeBoxSerialNumber(CHARGE_BOX_SERIAL_NUMBER_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION:
				setFirmwareVersion(FIRMWARE_VERSION_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__ICCID:
				setIccid(ICCID_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__IMSI:
				setImsi(IMSI_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_TYPE:
				setMeterType(METER_TYPE_EDEFAULT);
				return;
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER:
				setMeterSerialNumber(METER_SERIAL_NUMBER_EDEFAULT);
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
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR:
				return CHARGE_POINT_VENDOR_EDEFAULT == null ? chargePointVendor != null : !CHARGE_POINT_VENDOR_EDEFAULT.equals(chargePointVendor);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL:
				return CHARGE_POINT_MODEL_EDEFAULT == null ? chargePointModel != null : !CHARGE_POINT_MODEL_EDEFAULT.equals(chargePointModel);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER:
				return CHARGE_POINT_SERIAL_NUMBER_EDEFAULT == null ? chargePointSerialNumber != null : !CHARGE_POINT_SERIAL_NUMBER_EDEFAULT.equals(chargePointSerialNumber);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER:
				return CHARGE_BOX_SERIAL_NUMBER_EDEFAULT == null ? chargeBoxSerialNumber != null : !CHARGE_BOX_SERIAL_NUMBER_EDEFAULT.equals(chargeBoxSerialNumber);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION:
				return FIRMWARE_VERSION_EDEFAULT == null ? firmwareVersion != null : !FIRMWARE_VERSION_EDEFAULT.equals(firmwareVersion);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__ICCID:
				return ICCID_EDEFAULT == null ? iccid != null : !ICCID_EDEFAULT.equals(iccid);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__IMSI:
				return IMSI_EDEFAULT == null ? imsi != null : !IMSI_EDEFAULT.equals(imsi);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_TYPE:
				return METER_TYPE_EDEFAULT == null ? meterType != null : !METER_TYPE_EDEFAULT.equals(meterType);
			case OcppCentralSystemPackage.BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER:
				return METER_SERIAL_NUMBER_EDEFAULT == null ? meterSerialNumber != null : !METER_SERIAL_NUMBER_EDEFAULT.equals(meterSerialNumber);
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
		result.append(" (chargePointVendor: ");
		result.append(chargePointVendor);
		result.append(", chargePointModel: ");
		result.append(chargePointModel);
		result.append(", chargePointSerialNumber: ");
		result.append(chargePointSerialNumber);
		result.append(", chargeBoxSerialNumber: ");
		result.append(chargeBoxSerialNumber);
		result.append(", firmwareVersion: ");
		result.append(firmwareVersion);
		result.append(", iccid: ");
		result.append(iccid);
		result.append(", imsi: ");
		result.append(imsi);
		result.append(", meterType: ");
		result.append(meterType);
		result.append(", meterSerialNumber: ");
		result.append(meterSerialNumber);
		result.append(')');
		return result.toString();
	}

} //BootNotificationRequestImpl
