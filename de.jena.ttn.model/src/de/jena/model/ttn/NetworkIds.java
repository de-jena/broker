/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.NetworkIds#getNetId <em>Net Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.NetworkIds#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.NetworkIds#getClusterId <em>Cluster Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.NetworkIds#getClusterAddress <em>Cluster Address</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getNetworkIds()
 * @model
 * @generated
 */
@ProviderType
public interface NetworkIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Net Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Id</em>' attribute.
	 * @see #setNetId(String)
	 * @see de.jena.model.ttn.TTNPackage#getNetworkIds_NetId()
	 * @model extendedMetaData="name='net_id' kind='element'"
	 * @generated
	 */
	String getNetId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.NetworkIds#getNetId <em>Net Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Id</em>' attribute.
	 * @see #getNetId()
	 * @generated
	 */
	void setNetId(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see #setTenantId(String)
	 * @see de.jena.model.ttn.TTNPackage#getNetworkIds_TenantId()
	 * @model extendedMetaData="name='tenant_id' kind='element'"
	 * @generated
	 */
	String getTenantId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.NetworkIds#getTenantId <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' attribute.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(String value);

	/**
	 * Returns the value of the '<em><b>Cluster Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Id</em>' attribute.
	 * @see #setClusterId(String)
	 * @see de.jena.model.ttn.TTNPackage#getNetworkIds_ClusterId()
	 * @model extendedMetaData="name='cluster_id' kind='element'"
	 * @generated
	 */
	String getClusterId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.NetworkIds#getClusterId <em>Cluster Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Id</em>' attribute.
	 * @see #getClusterId()
	 * @generated
	 */
	void setClusterId(String value);

	/**
	 * Returns the value of the '<em><b>Cluster Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Address</em>' attribute.
	 * @see #setClusterAddress(String)
	 * @see de.jena.model.ttn.TTNPackage#getNetworkIds_ClusterAddress()
	 * @model extendedMetaData="name='cluster_address' kind='element'"
	 * @generated
	 */
	String getClusterAddress();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.NetworkIds#getClusterAddress <em>Cluster Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Address</em>' attribute.
	 * @see #getClusterAddress()
	 * @generated
	 */
	void setClusterAddress(String value);

} // NetworkIds
