/*
 */
package org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getGatewayId <em>Gateway Id</em>}</li>
 *   <li>{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getEui <em>Eui</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getGatewayIds()
 * @model
 * @generated
 */
@ProviderType
public interface GatewayIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Gateway Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Id</em>' attribute.
	 * @see #setGatewayId(String)
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getGatewayIds_GatewayId()
	 * @model extendedMetaData="name='gateway_id' kind='element'"
	 * @generated
	 */
	String getGatewayId();

	/**
	 * Sets the value of the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getGatewayId <em>Gateway Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Id</em>' attribute.
	 * @see #getGatewayId()
	 * @generated
	 */
	void setGatewayId(String value);

	/**
	 * Returns the value of the '<em><b>Eui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eui</em>' attribute.
	 * @see #setEui(String)
	 * @see org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.UplinkPayloadPackage#getGatewayIds_Eui()
	 * @model
	 * @generated
	 */
	String getEui();

	/**
	 * Sets the value of the '{@link org.eclipse.sensinact.southbound.ttn.uplinkpayload.model.uplinkpayload.GatewayIds#getEui <em>Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eui</em>' attribute.
	 * @see #getEui()
	 * @generated
	 */
	void setEui(String value);

} // GatewayIds
