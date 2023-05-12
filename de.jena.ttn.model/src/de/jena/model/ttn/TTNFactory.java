/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.model.ttn.TTNPackage
 * @generated
 */
@ProviderType
public interface TTNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TTNFactory eINSTANCE = de.jena.model.ttn.impl.TTNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ttn Uplink Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttn Uplink Payload</em>'.
	 * @generated
	 */
	TtnUplinkPayload createTtnUplinkPayload();

	/**
	 * Returns a new object of class '<em>End Device Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Device Ids</em>'.
	 * @generated
	 */
	EndDeviceIds createEndDeviceIds();

	/**
	 * Returns a new object of class '<em>Application Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Id</em>'.
	 * @generated
	 */
	ApplicationId createApplicationId();

	/**
	 * Returns a new object of class '<em>Network Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Ids</em>'.
	 * @generated
	 */
	NetworkIds createNetworkIds();

	/**
	 * Returns a new object of class '<em>Uplink Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uplink Message</em>'.
	 * @generated
	 */
	UplinkMessage createUplinkMessage();

	/**
	 * Returns a new object of class '<em>Gateway Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Ids</em>'.
	 * @generated
	 */
	GatewayIds createGatewayIds();

	/**
	 * Returns a new object of class '<em>Rx Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rx Metadata</em>'.
	 * @generated
	 */
	RxMetadata createRxMetadata();

	/**
	 * Returns a new object of class '<em>Data Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Rate</em>'.
	 * @generated
	 */
	DataRate createDataRate();

	/**
	 * Returns a new object of class '<em>Lora</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lora</em>'.
	 * @generated
	 */
	Lora createLora();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Version Ids</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Ids</em>'.
	 * @generated
	 */
	VersionIds createVersionIds();

	/**
	 * Returns a new object of class '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings</em>'.
	 * @generated
	 */
	Settings createSettings();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TTNPackage getTTNPackage();

} //TTNFactory
