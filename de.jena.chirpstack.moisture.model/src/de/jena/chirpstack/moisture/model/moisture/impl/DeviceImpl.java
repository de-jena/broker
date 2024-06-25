/*
 */
package de.jena.chirpstack.moisture.model.moisture.impl;

import de.jena.chirpstack.moisture.model.moisture.ChirpstackMoisturePackage;
import de.jena.chirpstack.moisture.model.moisture.Device;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sensinact.model.core.provider.impl.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getDevEUI <em>Dev EUI</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getProfileId <em>Profile Id</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link de.jena.chirpstack.moisture.model.moisture.impl.DeviceImpl#getApplicationName <em>Application Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends ServiceImpl implements Device {
	/**
	 * The default value of the '{@link #getDevEUI() <em>Dev EUI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevEUI()
	 * @generated
	 * @ordered
	 */
	protected static final String DEV_EUI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevEUI() <em>Dev EUI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevEUI()
	 * @generated
	 * @ordered
	 */
	protected String devEUI = DEV_EUI_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileId() <em>Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileId() <em>Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileId()
	 * @generated
	 * @ordered
	 */
	protected String profileId = PROFILE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected String profileName = PROFILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected String tenantId = TENANT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenantName() <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantName()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantName() <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantName()
	 * @generated
	 * @ordered
	 */
	protected String tenantName = TENANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected String applicationId = APPLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChirpstackMoisturePackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevEUI() {
		return devEUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevEUI(String newDevEUI) {
		String oldDevEUI = devEUI;
		devEUI = newDevEUI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__DEV_EUI, oldDevEUI, devEUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfileId() {
		return profileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfileId(String newProfileId) {
		String oldProfileId = profileId;
		profileId = newProfileId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__PROFILE_ID, oldProfileId, profileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfileName() {
		return profileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfileName(String newProfileName) {
		String oldProfileName = profileName;
		profileName = newProfileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__PROFILE_NAME, oldProfileName, profileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(String newTenantId) {
		String oldTenantId = tenantId;
		tenantId = newTenantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__TENANT_ID, oldTenantId, tenantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantName() {
		return tenantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantName(String newTenantName) {
		String oldTenantName = tenantName;
		tenantName = newTenantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__TENANT_NAME, oldTenantName, tenantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationId(String newApplicationId) {
		String oldApplicationId = applicationId;
		applicationId = newApplicationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__APPLICATION_ID, oldApplicationId, applicationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationName(String newApplicationName) {
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChirpstackMoisturePackage.DEVICE__APPLICATION_NAME, oldApplicationName, applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChirpstackMoisturePackage.DEVICE__DEV_EUI:
				return getDevEUI();
			case ChirpstackMoisturePackage.DEVICE__NAME:
				return getName();
			case ChirpstackMoisturePackage.DEVICE__PROFILE_ID:
				return getProfileId();
			case ChirpstackMoisturePackage.DEVICE__PROFILE_NAME:
				return getProfileName();
			case ChirpstackMoisturePackage.DEVICE__TENANT_ID:
				return getTenantId();
			case ChirpstackMoisturePackage.DEVICE__TENANT_NAME:
				return getTenantName();
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_ID:
				return getApplicationId();
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_NAME:
				return getApplicationName();
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
			case ChirpstackMoisturePackage.DEVICE__DEV_EUI:
				setDevEUI((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__NAME:
				setName((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__PROFILE_ID:
				setProfileId((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__PROFILE_NAME:
				setProfileName((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__TENANT_ID:
				setTenantId((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__TENANT_NAME:
				setTenantName((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_ID:
				setApplicationId((String)newValue);
				return;
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_NAME:
				setApplicationName((String)newValue);
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
			case ChirpstackMoisturePackage.DEVICE__DEV_EUI:
				setDevEUI(DEV_EUI_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__PROFILE_ID:
				setProfileId(PROFILE_ID_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__PROFILE_NAME:
				setProfileName(PROFILE_NAME_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__TENANT_ID:
				setTenantId(TENANT_ID_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__TENANT_NAME:
				setTenantName(TENANT_NAME_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_ID:
				setApplicationId(APPLICATION_ID_EDEFAULT);
				return;
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_NAME:
				setApplicationName(APPLICATION_NAME_EDEFAULT);
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
			case ChirpstackMoisturePackage.DEVICE__DEV_EUI:
				return DEV_EUI_EDEFAULT == null ? devEUI != null : !DEV_EUI_EDEFAULT.equals(devEUI);
			case ChirpstackMoisturePackage.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChirpstackMoisturePackage.DEVICE__PROFILE_ID:
				return PROFILE_ID_EDEFAULT == null ? profileId != null : !PROFILE_ID_EDEFAULT.equals(profileId);
			case ChirpstackMoisturePackage.DEVICE__PROFILE_NAME:
				return PROFILE_NAME_EDEFAULT == null ? profileName != null : !PROFILE_NAME_EDEFAULT.equals(profileName);
			case ChirpstackMoisturePackage.DEVICE__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case ChirpstackMoisturePackage.DEVICE__TENANT_NAME:
				return TENANT_NAME_EDEFAULT == null ? tenantName != null : !TENANT_NAME_EDEFAULT.equals(tenantName);
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationId != null : !APPLICATION_ID_EDEFAULT.equals(applicationId);
			case ChirpstackMoisturePackage.DEVICE__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
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
		result.append(" (DevEUI: ");
		result.append(devEUI);
		result.append(", name: ");
		result.append(name);
		result.append(", profileId: ");
		result.append(profileId);
		result.append(", profileName: ");
		result.append(profileName);
		result.append(", tenantId: ");
		result.append(tenantId);
		result.append(", tenantName: ");
		result.append(tenantName);
		result.append(", applicationId: ");
		result.append(applicationId);
		result.append(", applicationName: ");
		result.append(applicationName);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
