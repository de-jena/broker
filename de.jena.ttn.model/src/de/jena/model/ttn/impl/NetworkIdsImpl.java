/*
 */
package de.jena.model.ttn.impl;

import de.jena.model.ttn.NetworkIds;
import de.jena.model.ttn.TTNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Ids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.impl.NetworkIdsImpl#getNetId <em>Net Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.NetworkIdsImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.NetworkIdsImpl#getClusterId <em>Cluster Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.impl.NetworkIdsImpl#getClusterAddress <em>Cluster Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkIdsImpl extends MinimalEObjectImpl.Container implements NetworkIds {
	/**
	 * The default value of the '{@link #getNetId() <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetId()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetId() <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetId()
	 * @generated
	 * @ordered
	 */
	protected String netId = NET_ID_EDEFAULT;

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
	 * The default value of the '{@link #getClusterId() <em>Cluster Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterId() <em>Cluster Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterId()
	 * @generated
	 * @ordered
	 */
	protected String clusterId = CLUSTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClusterAddress() <em>Cluster Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterAddress() <em>Cluster Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterAddress()
	 * @generated
	 * @ordered
	 */
	protected String clusterAddress = CLUSTER_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkIdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TTNPackage.eINSTANCE.getNetworkIds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetId() {
		return netId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetId(String newNetId) {
		String oldNetId = netId;
		netId = newNetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.NETWORK_IDS__NET_ID, oldNetId, netId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.NETWORK_IDS__TENANT_ID, oldTenantId, tenantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClusterId() {
		return clusterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterId(String newClusterId) {
		String oldClusterId = clusterId;
		clusterId = newClusterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.NETWORK_IDS__CLUSTER_ID, oldClusterId, clusterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClusterAddress() {
		return clusterAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterAddress(String newClusterAddress) {
		String oldClusterAddress = clusterAddress;
		clusterAddress = newClusterAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TTNPackage.NETWORK_IDS__CLUSTER_ADDRESS, oldClusterAddress, clusterAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TTNPackage.NETWORK_IDS__NET_ID:
				return getNetId();
			case TTNPackage.NETWORK_IDS__TENANT_ID:
				return getTenantId();
			case TTNPackage.NETWORK_IDS__CLUSTER_ID:
				return getClusterId();
			case TTNPackage.NETWORK_IDS__CLUSTER_ADDRESS:
				return getClusterAddress();
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
			case TTNPackage.NETWORK_IDS__NET_ID:
				setNetId((String)newValue);
				return;
			case TTNPackage.NETWORK_IDS__TENANT_ID:
				setTenantId((String)newValue);
				return;
			case TTNPackage.NETWORK_IDS__CLUSTER_ID:
				setClusterId((String)newValue);
				return;
			case TTNPackage.NETWORK_IDS__CLUSTER_ADDRESS:
				setClusterAddress((String)newValue);
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
			case TTNPackage.NETWORK_IDS__NET_ID:
				setNetId(NET_ID_EDEFAULT);
				return;
			case TTNPackage.NETWORK_IDS__TENANT_ID:
				setTenantId(TENANT_ID_EDEFAULT);
				return;
			case TTNPackage.NETWORK_IDS__CLUSTER_ID:
				setClusterId(CLUSTER_ID_EDEFAULT);
				return;
			case TTNPackage.NETWORK_IDS__CLUSTER_ADDRESS:
				setClusterAddress(CLUSTER_ADDRESS_EDEFAULT);
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
			case TTNPackage.NETWORK_IDS__NET_ID:
				return NET_ID_EDEFAULT == null ? netId != null : !NET_ID_EDEFAULT.equals(netId);
			case TTNPackage.NETWORK_IDS__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case TTNPackage.NETWORK_IDS__CLUSTER_ID:
				return CLUSTER_ID_EDEFAULT == null ? clusterId != null : !CLUSTER_ID_EDEFAULT.equals(clusterId);
			case TTNPackage.NETWORK_IDS__CLUSTER_ADDRESS:
				return CLUSTER_ADDRESS_EDEFAULT == null ? clusterAddress != null : !CLUSTER_ADDRESS_EDEFAULT.equals(clusterAddress);
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
		result.append(" (netId: ");
		result.append(netId);
		result.append(", tenantId: ");
		result.append(tenantId);
		result.append(", clusterId: ");
		result.append(clusterId);
		result.append(", clusterAddress: ");
		result.append(clusterAddress);
		result.append(')');
		return result.toString();
	}

} //NetworkIdsImpl
