/*
 */
package de.jena.sensinact.ocpp.centralsystem;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage
 * @generated
 */
@ProviderType
public interface OcppCentralSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcppCentralSystemFactory eINSTANCE = de.jena.sensinact.ocpp.centralsystem.impl.OcppCentralSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Authorize Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorize Request</em>'.
	 * @generated
	 */
	AuthorizeRequest createAuthorizeRequest();

	/**
	 * Returns a new object of class '<em>Authorize Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorize Response</em>'.
	 * @generated
	 */
	AuthorizeResponse createAuthorizeResponse();

	/**
	 * Returns a new object of class '<em>Boot Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boot Notification Request</em>'.
	 * @generated
	 */
	BootNotificationRequest createBootNotificationRequest();

	/**
	 * Returns a new object of class '<em>Boot Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boot Notification Response</em>'.
	 * @generated
	 */
	BootNotificationResponse createBootNotificationResponse();

	/**
	 * Returns a new object of class '<em>Data Transfer Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Transfer Request</em>'.
	 * @generated
	 */
	DataTransferRequest createDataTransferRequest();

	/**
	 * Returns a new object of class '<em>Data Transfer Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Transfer Response</em>'.
	 * @generated
	 */
	DataTransferResponse createDataTransferResponse();

	/**
	 * Returns a new object of class '<em>Diagnostics Status Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostics Status Notification Request</em>'.
	 * @generated
	 */
	DiagnosticsStatusNotificationRequest createDiagnosticsStatusNotificationRequest();

	/**
	 * Returns a new object of class '<em>Diagnostics Status Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostics Status Notification Response</em>'.
	 * @generated
	 */
	DiagnosticsStatusNotificationResponse createDiagnosticsStatusNotificationResponse();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Firmware Status Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmware Status Notification Request</em>'.
	 * @generated
	 */
	FirmwareStatusNotificationRequest createFirmwareStatusNotificationRequest();

	/**
	 * Returns a new object of class '<em>Firmware Status Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmware Status Notification Response</em>'.
	 * @generated
	 */
	FirmwareStatusNotificationResponse createFirmwareStatusNotificationResponse();

	/**
	 * Returns a new object of class '<em>Heartbeat Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heartbeat Request</em>'.
	 * @generated
	 */
	HeartbeatRequest createHeartbeatRequest();

	/**
	 * Returns a new object of class '<em>Heartbeat Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heartbeat Response</em>'.
	 * @generated
	 */
	HeartbeatResponse createHeartbeatResponse();

	/**
	 * Returns a new object of class '<em>Id Tag Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Tag Info</em>'.
	 * @generated
	 */
	IdTagInfo createIdTagInfo();

	/**
	 * Returns a new object of class '<em>Meter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Value</em>'.
	 * @generated
	 */
	MeterValue createMeterValue();

	/**
	 * Returns a new object of class '<em>Meter Values Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Values Request</em>'.
	 * @generated
	 */
	MeterValuesRequest createMeterValuesRequest();

	/**
	 * Returns a new object of class '<em>Meter Values Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Values Response</em>'.
	 * @generated
	 */
	MeterValuesResponse createMeterValuesResponse();

	/**
	 * Returns a new object of class '<em>Sampled Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampled Value</em>'.
	 * @generated
	 */
	SampledValue createSampledValue();

	/**
	 * Returns a new object of class '<em>Start Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Transaction Request</em>'.
	 * @generated
	 */
	StartTransactionRequest createStartTransactionRequest();

	/**
	 * Returns a new object of class '<em>Start Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Transaction Response</em>'.
	 * @generated
	 */
	StartTransactionResponse createStartTransactionResponse();

	/**
	 * Returns a new object of class '<em>Status Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Notification Request</em>'.
	 * @generated
	 */
	StatusNotificationRequest createStatusNotificationRequest();

	/**
	 * Returns a new object of class '<em>Status Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Notification Response</em>'.
	 * @generated
	 */
	StatusNotificationResponse createStatusNotificationResponse();

	/**
	 * Returns a new object of class '<em>Stop Transaction Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Transaction Request</em>'.
	 * @generated
	 */
	StopTransactionRequest createStopTransactionRequest();

	/**
	 * Returns a new object of class '<em>Stop Transaction Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Transaction Response</em>'.
	 * @generated
	 */
	StopTransactionResponse createStopTransactionResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OcppCentralSystemPackage getOcppCentralSystemPackage();

} //OcppCentralSystemFactory
