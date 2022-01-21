/**
 */
package de.jena.sensinact.ocpp.centralsystem.util;

import de.jena.sensinact.ocpp.centralsystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage
 * @generated
 */
public class OcppCentralSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OcppCentralSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcppCentralSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OcppCentralSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcppCentralSystemSwitch<Adapter> modelSwitch =
		new OcppCentralSystemSwitch<Adapter>() {
			@Override
			public Adapter caseAuthorizeRequest(AuthorizeRequest object) {
				return createAuthorizeRequestAdapter();
			}
			@Override
			public Adapter caseAuthorizeResponse(AuthorizeResponse object) {
				return createAuthorizeResponseAdapter();
			}
			@Override
			public Adapter caseBootNotificationRequest(BootNotificationRequest object) {
				return createBootNotificationRequestAdapter();
			}
			@Override
			public Adapter caseBootNotificationResponse(BootNotificationResponse object) {
				return createBootNotificationResponseAdapter();
			}
			@Override
			public Adapter caseDataTransferRequest(DataTransferRequest object) {
				return createDataTransferRequestAdapter();
			}
			@Override
			public Adapter caseDataTransferResponse(DataTransferResponse object) {
				return createDataTransferResponseAdapter();
			}
			@Override
			public Adapter caseDiagnosticsStatusNotificationRequest(DiagnosticsStatusNotificationRequest object) {
				return createDiagnosticsStatusNotificationRequestAdapter();
			}
			@Override
			public Adapter caseDiagnosticsStatusNotificationResponse(DiagnosticsStatusNotificationResponse object) {
				return createDiagnosticsStatusNotificationResponseAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFirmwareStatusNotificationRequest(FirmwareStatusNotificationRequest object) {
				return createFirmwareStatusNotificationRequestAdapter();
			}
			@Override
			public Adapter caseFirmwareStatusNotificationResponse(FirmwareStatusNotificationResponse object) {
				return createFirmwareStatusNotificationResponseAdapter();
			}
			@Override
			public Adapter caseHeartbeatRequest(HeartbeatRequest object) {
				return createHeartbeatRequestAdapter();
			}
			@Override
			public Adapter caseHeartbeatResponse(HeartbeatResponse object) {
				return createHeartbeatResponseAdapter();
			}
			@Override
			public Adapter caseIdTagInfo(IdTagInfo object) {
				return createIdTagInfoAdapter();
			}
			@Override
			public Adapter caseMeterValue(MeterValue object) {
				return createMeterValueAdapter();
			}
			@Override
			public Adapter caseMeterValuesRequest(MeterValuesRequest object) {
				return createMeterValuesRequestAdapter();
			}
			@Override
			public Adapter caseMeterValuesResponse(MeterValuesResponse object) {
				return createMeterValuesResponseAdapter();
			}
			@Override
			public Adapter caseSampledValue(SampledValue object) {
				return createSampledValueAdapter();
			}
			@Override
			public Adapter caseStartTransactionRequest(StartTransactionRequest object) {
				return createStartTransactionRequestAdapter();
			}
			@Override
			public Adapter caseStartTransactionResponse(StartTransactionResponse object) {
				return createStartTransactionResponseAdapter();
			}
			@Override
			public Adapter caseStatusNotificationRequest(StatusNotificationRequest object) {
				return createStatusNotificationRequestAdapter();
			}
			@Override
			public Adapter caseStatusNotificationResponse(StatusNotificationResponse object) {
				return createStatusNotificationResponseAdapter();
			}
			@Override
			public Adapter caseStopTransactionRequest(StopTransactionRequest object) {
				return createStopTransactionRequestAdapter();
			}
			@Override
			public Adapter caseStopTransactionResponse(StopTransactionResponse object) {
				return createStopTransactionResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest <em>Authorize Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest
	 * @generated
	 */
	public Adapter createAuthorizeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse <em>Authorize Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse
	 * @generated
	 */
	public Adapter createAuthorizeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest <em>Boot Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest
	 * @generated
	 */
	public Adapter createBootNotificationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse <em>Boot Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse
	 * @generated
	 */
	public Adapter createBootNotificationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferRequest <em>Data Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferRequest
	 * @generated
	 */
	public Adapter createDataTransferRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.DataTransferResponse <em>Data Transfer Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.DataTransferResponse
	 * @generated
	 */
	public Adapter createDataTransferResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest <em>Diagnostics Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest
	 * @generated
	 */
	public Adapter createDiagnosticsStatusNotificationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse <em>Diagnostics Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse
	 * @generated
	 */
	public Adapter createDiagnosticsStatusNotificationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest <em>Firmware Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest
	 * @generated
	 */
	public Adapter createFirmwareStatusNotificationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse <em>Firmware Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse
	 * @generated
	 */
	public Adapter createFirmwareStatusNotificationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest <em>Heartbeat Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest
	 * @generated
	 */
	public Adapter createHeartbeatRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse <em>Heartbeat Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse
	 * @generated
	 */
	public Adapter createHeartbeatResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.IdTagInfo <em>Id Tag Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.IdTagInfo
	 * @generated
	 */
	public Adapter createIdTagInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.MeterValue <em>Meter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValue
	 * @generated
	 */
	public Adapter createMeterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest <em>Meter Values Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest
	 * @generated
	 */
	public Adapter createMeterValuesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse <em>Meter Values Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse
	 * @generated
	 */
	public Adapter createMeterValuesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.SampledValue <em>Sampled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.SampledValue
	 * @generated
	 */
	public Adapter createSampledValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest <em>Start Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest
	 * @generated
	 */
	public Adapter createStartTransactionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse <em>Start Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse
	 * @generated
	 */
	public Adapter createStartTransactionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest <em>Status Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest
	 * @generated
	 */
	public Adapter createStatusNotificationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse <em>Status Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse
	 * @generated
	 */
	public Adapter createStatusNotificationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest <em>Stop Transaction Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest
	 * @generated
	 */
	public Adapter createStopTransactionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse <em>Stop Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse
	 * @generated
	 */
	public Adapter createStopTransactionResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OcppCentralSystemAdapterFactory
