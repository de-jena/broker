/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.TTNPackage;
import de.jena.model.ttn.VersionIds;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Ids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.VersionIdsImpl#getBrandId <em>Brand Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.VersionIdsImpl#getModelId <em>Model Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.VersionIdsImpl#getHardwareVersion <em>Hardware Version</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.VersionIdsImpl#getFirmwareVersion <em>Firmware Version</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.VersionIdsImpl#getBandId <em>Band Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionIdsImpl extends MinimalEObjectImpl.Container implements VersionIds {
	/**
	 * The default value of the '{@link #getBrandId() <em>Brand Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandId()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrandId() <em>Brand Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandId()
	 * @generated
	 * @ordered
	 */
	protected String brandId = BRAND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelId() <em>Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelId() <em>Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelId()
	 * @generated
	 * @ordered
	 */
	protected String modelId = MODEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareVersion() <em>Hardware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareVersion() <em>Hardware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String hardwareVersion = HARDWARE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String firmwareVersion = FIRMWARE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandId() <em>Band Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandId()
	 * @generated
	 * @ordered
	 */
	protected static final String BAND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandId() <em>Band Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandId()
	 * @generated
	 * @ordered
	 */
	protected String bandId = BAND_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionIdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getVersionIds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrandId() {
		return brandId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrandId(String newBrandId) {
		String oldBrandId = brandId;
		brandId = newBrandId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.VERSION_IDS__BRAND_ID, oldBrandId, brandId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelId() {
		return modelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelId(String newModelId) {
		String oldModelId = modelId;
		modelId = newModelId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.VERSION_IDS__MODEL_ID, oldModelId, modelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHardwareVersion() {
		return hardwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareVersion(String newHardwareVersion) {
		String oldHardwareVersion = hardwareVersion;
		hardwareVersion = newHardwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.VERSION_IDS__HARDWARE_VERSION, oldHardwareVersion, hardwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirmwareVersion(String newFirmwareVersion) {
		String oldFirmwareVersion = firmwareVersion;
		firmwareVersion = newFirmwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.VERSION_IDS__FIRMWARE_VERSION, oldFirmwareVersion, firmwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBandId() {
		return bandId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandId(String newBandId) {
		String oldBandId = bandId;
		bandId = newBandId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.VERSION_IDS__BAND_ID, oldBandId, bandId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTNPackage.VERSION_IDS__BRAND_ID:
				return getBrandId();
			case TTNPackage.VERSION_IDS__MODEL_ID:
				return getModelId();
			case TTNPackage.VERSION_IDS__HARDWARE_VERSION:
				return getHardwareVersion();
			case TTNPackage.VERSION_IDS__FIRMWARE_VERSION:
				return getFirmwareVersion();
			case TTNPackage.VERSION_IDS__BAND_ID:
				return getBandId();
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
			case TTNPackage.VERSION_IDS__BRAND_ID:
				setBrandId((String)newValue);
				return;
			case TTNPackage.VERSION_IDS__MODEL_ID:
				setModelId((String)newValue);
				return;
			case TTNPackage.VERSION_IDS__HARDWARE_VERSION:
				setHardwareVersion((String)newValue);
				return;
			case TTNPackage.VERSION_IDS__FIRMWARE_VERSION:
				setFirmwareVersion((String)newValue);
				return;
			case TTNPackage.VERSION_IDS__BAND_ID:
				setBandId((String)newValue);
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
			case TTNPackage.VERSION_IDS__BRAND_ID:
				setBrandId(BRAND_ID_EDEFAULT);
				return;
			case TTNPackage.VERSION_IDS__MODEL_ID:
				setModelId(MODEL_ID_EDEFAULT);
				return;
			case TTNPackage.VERSION_IDS__HARDWARE_VERSION:
				setHardwareVersion(HARDWARE_VERSION_EDEFAULT);
				return;
			case TTNPackage.VERSION_IDS__FIRMWARE_VERSION:
				setFirmwareVersion(FIRMWARE_VERSION_EDEFAULT);
				return;
			case TTNPackage.VERSION_IDS__BAND_ID:
				setBandId(BAND_ID_EDEFAULT);
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
			case TTNPackage.VERSION_IDS__BRAND_ID:
				return BRAND_ID_EDEFAULT == null ? brandId != null : !BRAND_ID_EDEFAULT.equals(brandId);
			case TTNPackage.VERSION_IDS__MODEL_ID:
				return MODEL_ID_EDEFAULT == null ? modelId != null : !MODEL_ID_EDEFAULT.equals(modelId);
			case TTNPackage.VERSION_IDS__HARDWARE_VERSION:
				return HARDWARE_VERSION_EDEFAULT == null ? hardwareVersion != null : !HARDWARE_VERSION_EDEFAULT.equals(hardwareVersion);
			case TTNPackage.VERSION_IDS__FIRMWARE_VERSION:
				return FIRMWARE_VERSION_EDEFAULT == null ? firmwareVersion != null : !FIRMWARE_VERSION_EDEFAULT.equals(firmwareVersion);
			case TTNPackage.VERSION_IDS__BAND_ID:
				return BAND_ID_EDEFAULT == null ? bandId != null : !BAND_ID_EDEFAULT.equals(bandId);
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
		result.append(" (brandId: ");
		result.append(brandId);
		result.append(", modelId: ");
		result.append(modelId);
		result.append(", hardwareVersion: ");
		result.append(hardwareVersion);
		result.append(", firmwareVersion: ");
		result.append(firmwareVersion);
		result.append(", bandId: ");
		result.append(bandId);
		result.append(')');
		return result.toString();
	}

} //VersionIdsImpl
