/**
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.AuthorizationStatus;
import de.jena.sensinact.ocpp.centralsystem.AuthorizeRequest;
import de.jena.sensinact.ocpp.centralsystem.AuthorizeResponse;
import de.jena.sensinact.ocpp.centralsystem.BootNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.BootNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.ChargePointErrorCode;
import de.jena.sensinact.ocpp.centralsystem.ChargePointStatus;
import de.jena.sensinact.ocpp.centralsystem.DataTransferRequest;
import de.jena.sensinact.ocpp.centralsystem.DataTransferResponse;
import de.jena.sensinact.ocpp.centralsystem.DataTransferStatus;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatus;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.DiagnosticsStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.DocumentRoot;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatus;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.FirmwareStatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest;
import de.jena.sensinact.ocpp.centralsystem.HeartbeatResponse;
import de.jena.sensinact.ocpp.centralsystem.IdTagInfo;
import de.jena.sensinact.ocpp.centralsystem.Location;
import de.jena.sensinact.ocpp.centralsystem.Measurand;
import de.jena.sensinact.ocpp.centralsystem.MeterValue;
import de.jena.sensinact.ocpp.centralsystem.MeterValuesRequest;
import de.jena.sensinact.ocpp.centralsystem.MeterValuesResponse;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemFactory;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;
import de.jena.sensinact.ocpp.centralsystem.Phase;
import de.jena.sensinact.ocpp.centralsystem.ReadingContext;
import de.jena.sensinact.ocpp.centralsystem.Reason;
import de.jena.sensinact.ocpp.centralsystem.RegistrationStatus;
import de.jena.sensinact.ocpp.centralsystem.SampledValue;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionRequest;
import de.jena.sensinact.ocpp.centralsystem.StartTransactionResponse;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationRequest;
import de.jena.sensinact.ocpp.centralsystem.StatusNotificationResponse;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionRequest;
import de.jena.sensinact.ocpp.centralsystem.StopTransactionResponse;
import de.jena.sensinact.ocpp.centralsystem.UnitOfMeasure;
import de.jena.sensinact.ocpp.centralsystem.ValueFormat;

import de.jena.sensinact.ocpp.centralsystem.util.OcppCentralSystemValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcppCentralSystemPackageImpl extends EPackageImpl implements OcppCentralSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootNotificationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootNotificationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransferRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransferResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticsStatusNotificationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticsStatusNotificationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmwareStatusNotificationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmwareStatusNotificationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartbeatRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartbeatResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idTagInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterValuesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterValuesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampledValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTransactionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTransactionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusNotificationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusNotificationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTransactionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTransactionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorizationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargePointErrorCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargePointStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTransferStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticsStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum firmwareStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum readingContextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum registrationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitOfMeasureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authorizationStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chargePointErrorCodeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chargePointStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString20TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString255TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString25TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString500TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ciString50TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTransferStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagnosticsStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType firmwareStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idTokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType measurandObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phaseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType readingContextObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reasonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registrationStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitOfMeasureObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueFormatObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OcppCentralSystemPackageImpl() {
		super(eNS_URI, OcppCentralSystemFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OcppCentralSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OcppCentralSystemPackage init() {
		if (isInited) return (OcppCentralSystemPackage)EPackage.Registry.INSTANCE.getEPackage(OcppCentralSystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOcppCentralSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OcppCentralSystemPackageImpl theOcppCentralSystemPackage = registeredOcppCentralSystemPackage instanceof OcppCentralSystemPackageImpl ? (OcppCentralSystemPackageImpl)registeredOcppCentralSystemPackage : new OcppCentralSystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOcppCentralSystemPackage.createPackageContents();

		// Initialize created meta-data
		theOcppCentralSystemPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOcppCentralSystemPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OcppCentralSystemValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOcppCentralSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OcppCentralSystemPackage.eNS_URI, theOcppCentralSystemPackage);
		return theOcppCentralSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizeRequest() {
		return authorizeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizeRequest_IdTag() {
		return (EAttribute)authorizeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizeResponse() {
		return authorizeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizeResponse_IdTagInfo() {
		return (EAttribute)authorizeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootNotificationRequest() {
		return bootNotificationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_ChargePointVendor() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_ChargePointModel() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_ChargePointSerialNumber() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_ChargeBoxSerialNumber() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_FirmwareVersion() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_Iccid() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_Imsi() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_MeterType() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationRequest_MeterSerialNumber() {
		return (EAttribute)bootNotificationRequestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootNotificationResponse() {
		return bootNotificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationResponse_Status() {
		return (EAttribute)bootNotificationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationResponse_CurrentTime() {
		return (EAttribute)bootNotificationResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootNotificationResponse_Interval() {
		return (EAttribute)bootNotificationResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTransferRequest() {
		return dataTransferRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferRequest_VendorId() {
		return (EAttribute)dataTransferRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferRequest_MessageId() {
		return (EAttribute)dataTransferRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferRequest_Data() {
		return (EAttribute)dataTransferRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTransferResponse() {
		return dataTransferResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferResponse_Status() {
		return (EAttribute)dataTransferResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTransferResponse_Data() {
		return (EAttribute)dataTransferResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagnosticsStatusNotificationRequest() {
		return diagnosticsStatusNotificationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiagnosticsStatusNotificationRequest_Status() {
		return (EAttribute)diagnosticsStatusNotificationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagnosticsStatusNotificationResponse() {
		return diagnosticsStatusNotificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AuthorizeRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_AuthorizeResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_BootNotificationRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_BootNotificationResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_ChargeBoxIdentity() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DataTransferRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DataTransferResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DiagnosticsStatusNotificationRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_DiagnosticsStatusNotificationResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_FirmwareStatusNotificationRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_FirmwareStatusNotificationResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_HeartbeatRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_HeartbeatResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MeterValuesRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MeterValuesResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StartTransactionRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StartTransactionResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StatusNotificationRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StatusNotificationResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StopTransactionRequest() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_StopTransactionResponse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirmwareStatusNotificationRequest() {
		return firmwareStatusNotificationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirmwareStatusNotificationRequest_Status() {
		return (EAttribute)firmwareStatusNotificationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirmwareStatusNotificationResponse() {
		return firmwareStatusNotificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeartbeatRequest() {
		return heartbeatRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeartbeatResponse() {
		return heartbeatResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeartbeatResponse_CurrentTime() {
		return (EAttribute)heartbeatResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdTagInfo() {
		return idTagInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdTagInfo_Status() {
		return (EAttribute)idTagInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdTagInfo_ExpiryDate() {
		return (EAttribute)idTagInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdTagInfo_ParentIdTag() {
		return (EAttribute)idTagInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeterValue() {
		return meterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeterValue_Timestamp() {
		return (EAttribute)meterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeterValue_SampledValue() {
		return (EAttribute)meterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeterValuesRequest() {
		return meterValuesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeterValuesRequest_ConnectorId() {
		return (EAttribute)meterValuesRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeterValuesRequest_TransactionId() {
		return (EAttribute)meterValuesRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeterValuesRequest_MeterValue() {
		return (EAttribute)meterValuesRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeterValuesResponse() {
		return meterValuesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSampledValue() {
		return sampledValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Value() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Context() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Format() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Measurand() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Phase() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Location() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSampledValue_Unit() {
		return (EAttribute)sampledValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartTransactionRequest() {
		return startTransactionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionRequest_ConnectorId() {
		return (EAttribute)startTransactionRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionRequest_IdTag() {
		return (EAttribute)startTransactionRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionRequest_Timestamp() {
		return (EAttribute)startTransactionRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionRequest_MeterStart() {
		return (EAttribute)startTransactionRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionRequest_ReservationId() {
		return (EAttribute)startTransactionRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartTransactionResponse() {
		return startTransactionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionResponse_TransactionId() {
		return (EAttribute)startTransactionResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartTransactionResponse_IdTagInfo() {
		return (EAttribute)startTransactionResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusNotificationRequest() {
		return statusNotificationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_ConnectorId() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_Status() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_ErrorCode() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_Info() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_Timestamp() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_VendorId() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusNotificationRequest_VendorErrorCode() {
		return (EAttribute)statusNotificationRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusNotificationResponse() {
		return statusNotificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopTransactionRequest() {
		return stopTransactionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionRequest_TransactionId() {
		return (EAttribute)stopTransactionRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionRequest_IdTag() {
		return (EAttribute)stopTransactionRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionRequest_Timestamp() {
		return (EAttribute)stopTransactionRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionRequest_MeterStop() {
		return (EAttribute)stopTransactionRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionRequest_Reason() {
		return (EAttribute)stopTransactionRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionRequest_TransactionData() {
		return (EAttribute)stopTransactionRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopTransactionResponse() {
		return stopTransactionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStopTransactionResponse_IdTagInfo() {
		return (EAttribute)stopTransactionResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthorizationStatus() {
		return authorizationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargePointErrorCode() {
		return chargePointErrorCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargePointStatus() {
		return chargePointStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTransferStatus() {
		return dataTransferStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDiagnosticsStatus() {
		return diagnosticsStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFirmwareStatus() {
		return firmwareStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocation() {
		return locationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasurand() {
		return measurandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPhase() {
		return phaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReadingContext() {
		return readingContextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReason() {
		return reasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRegistrationStatus() {
		return registrationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitOfMeasure() {
		return unitOfMeasureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValueFormat() {
		return valueFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAuthorizationStatusObject() {
		return authorizationStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChargePointErrorCodeObject() {
		return chargePointErrorCodeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChargePointStatusObject() {
		return chargePointStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString20Type() {
		return ciString20TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString255Type() {
		return ciString255TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString25Type() {
		return ciString25TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString500Type() {
		return ciString500TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCiString50Type() {
		return ciString50TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataTransferStatusObject() {
		return dataTransferStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDiagnosticsStatusObject() {
		return diagnosticsStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFirmwareStatusObject() {
		return firmwareStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdToken() {
		return idTokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLocationObject() {
		return locationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeasurandObject() {
		return measurandObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPhaseObject() {
		return phaseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReadingContextObject() {
		return readingContextObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReasonObject() {
		return reasonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegistrationStatusObject() {
		return registrationStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitOfMeasureObject() {
		return unitOfMeasureObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getValueFormatObject() {
		return valueFormatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcppCentralSystemFactory getOcppCentralSystemFactory() {
		return (OcppCentralSystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorizeRequestEClass = createEClass(AUTHORIZE_REQUEST);
		createEAttribute(authorizeRequestEClass, AUTHORIZE_REQUEST__ID_TAG);

		authorizeResponseEClass = createEClass(AUTHORIZE_RESPONSE);
		createEAttribute(authorizeResponseEClass, AUTHORIZE_RESPONSE__ID_TAG_INFO);

		bootNotificationRequestEClass = createEClass(BOOT_NOTIFICATION_REQUEST);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_VENDOR);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_MODEL);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__CHARGE_POINT_SERIAL_NUMBER);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__CHARGE_BOX_SERIAL_NUMBER);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__FIRMWARE_VERSION);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__ICCID);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__IMSI);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__METER_TYPE);
		createEAttribute(bootNotificationRequestEClass, BOOT_NOTIFICATION_REQUEST__METER_SERIAL_NUMBER);

		bootNotificationResponseEClass = createEClass(BOOT_NOTIFICATION_RESPONSE);
		createEAttribute(bootNotificationResponseEClass, BOOT_NOTIFICATION_RESPONSE__STATUS);
		createEAttribute(bootNotificationResponseEClass, BOOT_NOTIFICATION_RESPONSE__CURRENT_TIME);
		createEAttribute(bootNotificationResponseEClass, BOOT_NOTIFICATION_RESPONSE__INTERVAL);

		dataTransferRequestEClass = createEClass(DATA_TRANSFER_REQUEST);
		createEAttribute(dataTransferRequestEClass, DATA_TRANSFER_REQUEST__VENDOR_ID);
		createEAttribute(dataTransferRequestEClass, DATA_TRANSFER_REQUEST__MESSAGE_ID);
		createEAttribute(dataTransferRequestEClass, DATA_TRANSFER_REQUEST__DATA);

		dataTransferResponseEClass = createEClass(DATA_TRANSFER_RESPONSE);
		createEAttribute(dataTransferResponseEClass, DATA_TRANSFER_RESPONSE__STATUS);
		createEAttribute(dataTransferResponseEClass, DATA_TRANSFER_RESPONSE__DATA);

		diagnosticsStatusNotificationRequestEClass = createEClass(DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST);
		createEAttribute(diagnosticsStatusNotificationRequestEClass, DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST__STATUS);

		diagnosticsStatusNotificationResponseEClass = createEClass(DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTHORIZE_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTHORIZE_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BOOT_NOTIFICATION_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BOOT_NOTIFICATION_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CHARGE_BOX_IDENTITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_TRANSFER_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_TRANSFER_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIAGNOSTICS_STATUS_NOTIFICATION_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FIRMWARE_STATUS_NOTIFICATION_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HEARTBEAT_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HEARTBEAT_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__METER_VALUES_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__METER_VALUES_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_TRANSACTION_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_TRANSACTION_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STATUS_NOTIFICATION_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STATUS_NOTIFICATION_RESPONSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STOP_TRANSACTION_REQUEST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STOP_TRANSACTION_RESPONSE);

		firmwareStatusNotificationRequestEClass = createEClass(FIRMWARE_STATUS_NOTIFICATION_REQUEST);
		createEAttribute(firmwareStatusNotificationRequestEClass, FIRMWARE_STATUS_NOTIFICATION_REQUEST__STATUS);

		firmwareStatusNotificationResponseEClass = createEClass(FIRMWARE_STATUS_NOTIFICATION_RESPONSE);

		heartbeatRequestEClass = createEClass(HEARTBEAT_REQUEST);

		heartbeatResponseEClass = createEClass(HEARTBEAT_RESPONSE);
		createEAttribute(heartbeatResponseEClass, HEARTBEAT_RESPONSE__CURRENT_TIME);

		idTagInfoEClass = createEClass(ID_TAG_INFO);
		createEAttribute(idTagInfoEClass, ID_TAG_INFO__STATUS);
		createEAttribute(idTagInfoEClass, ID_TAG_INFO__EXPIRY_DATE);
		createEAttribute(idTagInfoEClass, ID_TAG_INFO__PARENT_ID_TAG);

		meterValueEClass = createEClass(METER_VALUE);
		createEAttribute(meterValueEClass, METER_VALUE__TIMESTAMP);
		createEAttribute(meterValueEClass, METER_VALUE__SAMPLED_VALUE);

		meterValuesRequestEClass = createEClass(METER_VALUES_REQUEST);
		createEAttribute(meterValuesRequestEClass, METER_VALUES_REQUEST__CONNECTOR_ID);
		createEAttribute(meterValuesRequestEClass, METER_VALUES_REQUEST__TRANSACTION_ID);
		createEAttribute(meterValuesRequestEClass, METER_VALUES_REQUEST__METER_VALUE);

		meterValuesResponseEClass = createEClass(METER_VALUES_RESPONSE);

		sampledValueEClass = createEClass(SAMPLED_VALUE);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__VALUE);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__CONTEXT);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__FORMAT);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__MEASURAND);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__PHASE);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__LOCATION);
		createEAttribute(sampledValueEClass, SAMPLED_VALUE__UNIT);

		startTransactionRequestEClass = createEClass(START_TRANSACTION_REQUEST);
		createEAttribute(startTransactionRequestEClass, START_TRANSACTION_REQUEST__CONNECTOR_ID);
		createEAttribute(startTransactionRequestEClass, START_TRANSACTION_REQUEST__ID_TAG);
		createEAttribute(startTransactionRequestEClass, START_TRANSACTION_REQUEST__TIMESTAMP);
		createEAttribute(startTransactionRequestEClass, START_TRANSACTION_REQUEST__METER_START);
		createEAttribute(startTransactionRequestEClass, START_TRANSACTION_REQUEST__RESERVATION_ID);

		startTransactionResponseEClass = createEClass(START_TRANSACTION_RESPONSE);
		createEAttribute(startTransactionResponseEClass, START_TRANSACTION_RESPONSE__TRANSACTION_ID);
		createEAttribute(startTransactionResponseEClass, START_TRANSACTION_RESPONSE__ID_TAG_INFO);

		statusNotificationRequestEClass = createEClass(STATUS_NOTIFICATION_REQUEST);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__CONNECTOR_ID);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__STATUS);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__ERROR_CODE);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__INFO);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__TIMESTAMP);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__VENDOR_ID);
		createEAttribute(statusNotificationRequestEClass, STATUS_NOTIFICATION_REQUEST__VENDOR_ERROR_CODE);

		statusNotificationResponseEClass = createEClass(STATUS_NOTIFICATION_RESPONSE);

		stopTransactionRequestEClass = createEClass(STOP_TRANSACTION_REQUEST);
		createEAttribute(stopTransactionRequestEClass, STOP_TRANSACTION_REQUEST__TRANSACTION_ID);
		createEAttribute(stopTransactionRequestEClass, STOP_TRANSACTION_REQUEST__ID_TAG);
		createEAttribute(stopTransactionRequestEClass, STOP_TRANSACTION_REQUEST__TIMESTAMP);
		createEAttribute(stopTransactionRequestEClass, STOP_TRANSACTION_REQUEST__METER_STOP);
		createEAttribute(stopTransactionRequestEClass, STOP_TRANSACTION_REQUEST__REASON);
		createEAttribute(stopTransactionRequestEClass, STOP_TRANSACTION_REQUEST__TRANSACTION_DATA);

		stopTransactionResponseEClass = createEClass(STOP_TRANSACTION_RESPONSE);
		createEAttribute(stopTransactionResponseEClass, STOP_TRANSACTION_RESPONSE__ID_TAG_INFO);

		// Create enums
		authorizationStatusEEnum = createEEnum(AUTHORIZATION_STATUS);
		chargePointErrorCodeEEnum = createEEnum(CHARGE_POINT_ERROR_CODE);
		chargePointStatusEEnum = createEEnum(CHARGE_POINT_STATUS);
		dataTransferStatusEEnum = createEEnum(DATA_TRANSFER_STATUS);
		diagnosticsStatusEEnum = createEEnum(DIAGNOSTICS_STATUS);
		firmwareStatusEEnum = createEEnum(FIRMWARE_STATUS);
		locationEEnum = createEEnum(LOCATION);
		measurandEEnum = createEEnum(MEASURAND);
		phaseEEnum = createEEnum(PHASE);
		readingContextEEnum = createEEnum(READING_CONTEXT);
		reasonEEnum = createEEnum(REASON);
		registrationStatusEEnum = createEEnum(REGISTRATION_STATUS);
		unitOfMeasureEEnum = createEEnum(UNIT_OF_MEASURE);
		valueFormatEEnum = createEEnum(VALUE_FORMAT);

		// Create data types
		authorizationStatusObjectEDataType = createEDataType(AUTHORIZATION_STATUS_OBJECT);
		chargePointErrorCodeObjectEDataType = createEDataType(CHARGE_POINT_ERROR_CODE_OBJECT);
		chargePointStatusObjectEDataType = createEDataType(CHARGE_POINT_STATUS_OBJECT);
		ciString20TypeEDataType = createEDataType(CI_STRING20_TYPE);
		ciString255TypeEDataType = createEDataType(CI_STRING255_TYPE);
		ciString25TypeEDataType = createEDataType(CI_STRING25_TYPE);
		ciString500TypeEDataType = createEDataType(CI_STRING500_TYPE);
		ciString50TypeEDataType = createEDataType(CI_STRING50_TYPE);
		dataTransferStatusObjectEDataType = createEDataType(DATA_TRANSFER_STATUS_OBJECT);
		diagnosticsStatusObjectEDataType = createEDataType(DIAGNOSTICS_STATUS_OBJECT);
		firmwareStatusObjectEDataType = createEDataType(FIRMWARE_STATUS_OBJECT);
		idTokenEDataType = createEDataType(ID_TOKEN);
		locationObjectEDataType = createEDataType(LOCATION_OBJECT);
		measurandObjectEDataType = createEDataType(MEASURAND_OBJECT);
		phaseObjectEDataType = createEDataType(PHASE_OBJECT);
		readingContextObjectEDataType = createEDataType(READING_CONTEXT_OBJECT);
		reasonObjectEDataType = createEDataType(REASON_OBJECT);
		registrationStatusObjectEDataType = createEDataType(REGISTRATION_STATUS_OBJECT);
		unitOfMeasureObjectEDataType = createEDataType(UNIT_OF_MEASURE_OBJECT);
		valueFormatObjectEDataType = createEDataType(VALUE_FORMAT_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(authorizeRequestEClass, AuthorizeRequest.class, "AuthorizeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizeRequest_IdTag(), theXMLTypePackage.getAnySimpleType(), "idTag", null, 1, 1, AuthorizeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizeResponseEClass, AuthorizeResponse.class, "AuthorizeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizeResponse_IdTagInfo(), theXMLTypePackage.getAnySimpleType(), "idTagInfo", null, 1, 1, AuthorizeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootNotificationRequestEClass, BootNotificationRequest.class, "BootNotificationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootNotificationRequest_ChargePointVendor(), theXMLTypePackage.getAnySimpleType(), "chargePointVendor", null, 1, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_ChargePointModel(), theXMLTypePackage.getAnySimpleType(), "chargePointModel", null, 1, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_ChargePointSerialNumber(), theXMLTypePackage.getAnySimpleType(), "chargePointSerialNumber", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_ChargeBoxSerialNumber(), theXMLTypePackage.getAnySimpleType(), "chargeBoxSerialNumber", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_FirmwareVersion(), theXMLTypePackage.getAnySimpleType(), "firmwareVersion", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_Iccid(), theXMLTypePackage.getAnySimpleType(), "iccid", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_Imsi(), theXMLTypePackage.getAnySimpleType(), "imsi", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_MeterType(), theXMLTypePackage.getAnySimpleType(), "meterType", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationRequest_MeterSerialNumber(), theXMLTypePackage.getAnySimpleType(), "meterSerialNumber", null, 0, 1, BootNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootNotificationResponseEClass, BootNotificationResponse.class, "BootNotificationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootNotificationResponse_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, BootNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationResponse_CurrentTime(), theXMLTypePackage.getDateTime(), "currentTime", null, 1, 1, BootNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootNotificationResponse_Interval(), theXMLTypePackage.getInt(), "interval", null, 1, 1, BootNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTransferRequestEClass, DataTransferRequest.class, "DataTransferRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTransferRequest_VendorId(), theXMLTypePackage.getAnySimpleType(), "vendorId", null, 1, 1, DataTransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTransferRequest_MessageId(), theXMLTypePackage.getAnySimpleType(), "messageId", null, 0, 1, DataTransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTransferRequest_Data(), theXMLTypePackage.getString(), "data", null, 0, 1, DataTransferRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTransferResponseEClass, DataTransferResponse.class, "DataTransferResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTransferResponse_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, DataTransferResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTransferResponse_Data(), theXMLTypePackage.getString(), "data", null, 0, 1, DataTransferResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagnosticsStatusNotificationRequestEClass, DiagnosticsStatusNotificationRequest.class, "DiagnosticsStatusNotificationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagnosticsStatusNotificationRequest_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, DiagnosticsStatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagnosticsStatusNotificationResponseEClass, DiagnosticsStatusNotificationResponse.class, "DiagnosticsStatusNotificationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AuthorizeRequest(), theXMLTypePackage.getAnySimpleType(), "authorizeRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AuthorizeResponse(), theXMLTypePackage.getAnySimpleType(), "authorizeResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BootNotificationRequest(), theXMLTypePackage.getAnySimpleType(), "bootNotificationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BootNotificationResponse(), theXMLTypePackage.getAnySimpleType(), "bootNotificationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ChargeBoxIdentity(), theXMLTypePackage.getString(), "chargeBoxIdentity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataTransferRequest(), theXMLTypePackage.getAnySimpleType(), "dataTransferRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataTransferResponse(), theXMLTypePackage.getAnySimpleType(), "dataTransferResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DiagnosticsStatusNotificationRequest(), theXMLTypePackage.getAnySimpleType(), "diagnosticsStatusNotificationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DiagnosticsStatusNotificationResponse(), theXMLTypePackage.getAnySimpleType(), "diagnosticsStatusNotificationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FirmwareStatusNotificationRequest(), theXMLTypePackage.getAnySimpleType(), "firmwareStatusNotificationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FirmwareStatusNotificationResponse(), theXMLTypePackage.getAnySimpleType(), "firmwareStatusNotificationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HeartbeatRequest(), theXMLTypePackage.getAnySimpleType(), "heartbeatRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HeartbeatResponse(), theXMLTypePackage.getAnySimpleType(), "heartbeatResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MeterValuesRequest(), theXMLTypePackage.getAnySimpleType(), "meterValuesRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MeterValuesResponse(), theXMLTypePackage.getAnySimpleType(), "meterValuesResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartTransactionRequest(), theXMLTypePackage.getAnySimpleType(), "startTransactionRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartTransactionResponse(), theXMLTypePackage.getAnySimpleType(), "startTransactionResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StatusNotificationRequest(), theXMLTypePackage.getAnySimpleType(), "statusNotificationRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StatusNotificationResponse(), theXMLTypePackage.getAnySimpleType(), "statusNotificationResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StopTransactionRequest(), theXMLTypePackage.getAnySimpleType(), "stopTransactionRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StopTransactionResponse(), theXMLTypePackage.getAnySimpleType(), "stopTransactionResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(firmwareStatusNotificationRequestEClass, FirmwareStatusNotificationRequest.class, "FirmwareStatusNotificationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirmwareStatusNotificationRequest_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, FirmwareStatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firmwareStatusNotificationResponseEClass, FirmwareStatusNotificationResponse.class, "FirmwareStatusNotificationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(heartbeatRequestEClass, HeartbeatRequest.class, "HeartbeatRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(heartbeatResponseEClass, HeartbeatResponse.class, "HeartbeatResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeartbeatResponse_CurrentTime(), theXMLTypePackage.getDateTime(), "currentTime", null, 1, 1, HeartbeatResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idTagInfoEClass, IdTagInfo.class, "IdTagInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdTagInfo_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, IdTagInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdTagInfo_ExpiryDate(), theXMLTypePackage.getDateTime(), "expiryDate", null, 0, 1, IdTagInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdTagInfo_ParentIdTag(), theXMLTypePackage.getAnySimpleType(), "parentIdTag", null, 0, 1, IdTagInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterValueEClass, MeterValue.class, "MeterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeterValue_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 1, 1, MeterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeterValue_SampledValue(), theXMLTypePackage.getAnySimpleType(), "sampledValue", null, 1, -1, MeterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterValuesRequestEClass, MeterValuesRequest.class, "MeterValuesRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeterValuesRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, MeterValuesRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeterValuesRequest_TransactionId(), theXMLTypePackage.getInt(), "transactionId", null, 0, 1, MeterValuesRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeterValuesRequest_MeterValue(), theXMLTypePackage.getAnySimpleType(), "meterValue", null, 0, -1, MeterValuesRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterValuesResponseEClass, MeterValuesResponse.class, "MeterValuesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sampledValueEClass, SampledValue.class, "SampledValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampledValue_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampledValue_Context(), theXMLTypePackage.getAnySimpleType(), "context", null, 0, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampledValue_Format(), theXMLTypePackage.getAnySimpleType(), "format", null, 0, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampledValue_Measurand(), theXMLTypePackage.getAnySimpleType(), "measurand", null, 0, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampledValue_Phase(), theXMLTypePackage.getAnySimpleType(), "phase", null, 0, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampledValue_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampledValue_Unit(), theXMLTypePackage.getAnySimpleType(), "unit", null, 0, 1, SampledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startTransactionRequestEClass, StartTransactionRequest.class, "StartTransactionRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartTransactionRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, StartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTransactionRequest_IdTag(), theXMLTypePackage.getAnySimpleType(), "idTag", null, 1, 1, StartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTransactionRequest_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 1, 1, StartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTransactionRequest_MeterStart(), theXMLTypePackage.getInt(), "meterStart", null, 1, 1, StartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTransactionRequest_ReservationId(), theXMLTypePackage.getInt(), "reservationId", null, 0, 1, StartTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startTransactionResponseEClass, StartTransactionResponse.class, "StartTransactionResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartTransactionResponse_TransactionId(), theXMLTypePackage.getInt(), "transactionId", null, 1, 1, StartTransactionResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartTransactionResponse_IdTagInfo(), theXMLTypePackage.getAnySimpleType(), "idTagInfo", null, 1, 1, StartTransactionResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusNotificationRequestEClass, StatusNotificationRequest.class, "StatusNotificationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusNotificationRequest_ConnectorId(), theXMLTypePackage.getInt(), "connectorId", null, 1, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusNotificationRequest_Status(), theXMLTypePackage.getAnySimpleType(), "status", null, 1, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusNotificationRequest_ErrorCode(), theXMLTypePackage.getAnySimpleType(), "errorCode", null, 1, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusNotificationRequest_Info(), theXMLTypePackage.getAnySimpleType(), "info", null, 0, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusNotificationRequest_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusNotificationRequest_VendorId(), theXMLTypePackage.getAnySimpleType(), "vendorId", null, 0, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusNotificationRequest_VendorErrorCode(), theXMLTypePackage.getAnySimpleType(), "vendorErrorCode", null, 0, 1, StatusNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusNotificationResponseEClass, StatusNotificationResponse.class, "StatusNotificationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopTransactionRequestEClass, StopTransactionRequest.class, "StopTransactionRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopTransactionRequest_TransactionId(), theXMLTypePackage.getInt(), "transactionId", null, 1, 1, StopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTransactionRequest_IdTag(), theXMLTypePackage.getAnySimpleType(), "idTag", null, 0, 1, StopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTransactionRequest_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 1, 1, StopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTransactionRequest_MeterStop(), theXMLTypePackage.getInt(), "meterStop", null, 1, 1, StopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTransactionRequest_Reason(), theXMLTypePackage.getAnySimpleType(), "reason", null, 0, 1, StopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTransactionRequest_TransactionData(), theXMLTypePackage.getAnySimpleType(), "transactionData", null, 0, -1, StopTransactionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopTransactionResponseEClass, StopTransactionResponse.class, "StopTransactionResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopTransactionResponse_IdTagInfo(), theXMLTypePackage.getAnySimpleType(), "idTagInfo", null, 0, 1, StopTransactionResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorizationStatusEEnum, AuthorizationStatus.class, "AuthorizationStatus");
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.ACCEPTED);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.BLOCKED);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.EXPIRED);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.INVALID);
		addEEnumLiteral(authorizationStatusEEnum, AuthorizationStatus.CONCURRENT_TX);

		initEEnum(chargePointErrorCodeEEnum, ChargePointErrorCode.class, "ChargePointErrorCode");
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.CONNECTOR_LOCK_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.EV_COMMUNICATION_ERROR);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.GROUND_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.HIGH_TEMPERATURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.INTERNAL_ERROR);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.LOCAL_LIST_CONFLICT);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.NO_ERROR);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.OTHER_ERROR);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.OVER_CURRENT_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.OVER_VOLTAGE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.POWER_METER_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.POWER_SWITCH_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.READER_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.RESET_FAILURE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.UNDER_VOLTAGE);
		addEEnumLiteral(chargePointErrorCodeEEnum, ChargePointErrorCode.WEAK_SIGNAL);

		initEEnum(chargePointStatusEEnum, ChargePointStatus.class, "ChargePointStatus");
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.AVAILABLE);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.PREPARING);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.CHARGING);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.SUSPENDED_EV);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.SUSPENDED_EVSE);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.FINISHING);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.RESERVED);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.FAULTED);
		addEEnumLiteral(chargePointStatusEEnum, ChargePointStatus.UNAVAILABLE);

		initEEnum(dataTransferStatusEEnum, DataTransferStatus.class, "DataTransferStatus");
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.ACCEPTED);
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.REJECTED);
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.UNKNOWN_MESSAGE_ID);
		addEEnumLiteral(dataTransferStatusEEnum, DataTransferStatus.UNKNOWN_VENDOR_ID);

		initEEnum(diagnosticsStatusEEnum, DiagnosticsStatus.class, "DiagnosticsStatus");
		addEEnumLiteral(diagnosticsStatusEEnum, DiagnosticsStatus.IDLE);
		addEEnumLiteral(diagnosticsStatusEEnum, DiagnosticsStatus.UPLOADED);
		addEEnumLiteral(diagnosticsStatusEEnum, DiagnosticsStatus.UPLOAD_FAILED);
		addEEnumLiteral(diagnosticsStatusEEnum, DiagnosticsStatus.UPLOADING);

		initEEnum(firmwareStatusEEnum, FirmwareStatus.class, "FirmwareStatus");
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.DOWNLOADED);
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.DOWNLOAD_FAILED);
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.DOWNLOADING);
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.IDLE);
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.INSTALLATION_FAILED);
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.INSTALLED);
		addEEnumLiteral(firmwareStatusEEnum, FirmwareStatus.INSTALLING);

		initEEnum(locationEEnum, Location.class, "Location");
		addEEnumLiteral(locationEEnum, Location.BODY);
		addEEnumLiteral(locationEEnum, Location.CABLE);
		addEEnumLiteral(locationEEnum, Location.EV);
		addEEnumLiteral(locationEEnum, Location.INLET);
		addEEnumLiteral(locationEEnum, Location.OUTLET);

		initEEnum(measurandEEnum, Measurand.class, "Measurand");
		addEEnumLiteral(measurandEEnum, Measurand.CURRENT_EXPORT);
		addEEnumLiteral(measurandEEnum, Measurand.CURRENT_IMPORT);
		addEEnumLiteral(measurandEEnum, Measurand.CURRENT_OFFERED);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_ACTIVE_EXPORT_REGISTER);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_ACTIVE_IMPORT_REGISTER);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_REACTIVE_EXPORT_REGISTER);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_REACTIVE_IMPORT_REGISTER);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_ACTIVE_EXPORT_INTERVAL);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_ACTIVE_IMPORT_INTERVAL);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_REACTIVE_EXPORT_INTERVAL);
		addEEnumLiteral(measurandEEnum, Measurand.ENERGY_REACTIVE_IMPORT_INTERVAL);
		addEEnumLiteral(measurandEEnum, Measurand.FREQUENCY);
		addEEnumLiteral(measurandEEnum, Measurand.POWER_ACTIVE_EXPORT);
		addEEnumLiteral(measurandEEnum, Measurand.POWER_ACTIVE_IMPORT);
		addEEnumLiteral(measurandEEnum, Measurand.POWER_FACTOR);
		addEEnumLiteral(measurandEEnum, Measurand.POWER_OFFERED);
		addEEnumLiteral(measurandEEnum, Measurand.POWER_REACTIVE_EXPORT);
		addEEnumLiteral(measurandEEnum, Measurand.POWER_REACTIVE_IMPORT);
		addEEnumLiteral(measurandEEnum, Measurand.RPM);
		addEEnumLiteral(measurandEEnum, Measurand.SO_C);
		addEEnumLiteral(measurandEEnum, Measurand.TEMPERATURE);
		addEEnumLiteral(measurandEEnum, Measurand.VOLTAGE);

		initEEnum(phaseEEnum, Phase.class, "Phase");
		addEEnumLiteral(phaseEEnum, Phase.L1);
		addEEnumLiteral(phaseEEnum, Phase.L2);
		addEEnumLiteral(phaseEEnum, Phase.L3);
		addEEnumLiteral(phaseEEnum, Phase.N);
		addEEnumLiteral(phaseEEnum, Phase.L1N);
		addEEnumLiteral(phaseEEnum, Phase.L2N);
		addEEnumLiteral(phaseEEnum, Phase.L3N);
		addEEnumLiteral(phaseEEnum, Phase.L1L2);
		addEEnumLiteral(phaseEEnum, Phase.L2L3);
		addEEnumLiteral(phaseEEnum, Phase.L3L1);

		initEEnum(readingContextEEnum, ReadingContext.class, "ReadingContext");
		addEEnumLiteral(readingContextEEnum, ReadingContext.INTERRUPTION_BEGIN);
		addEEnumLiteral(readingContextEEnum, ReadingContext.INTERRUPTION_END);
		addEEnumLiteral(readingContextEEnum, ReadingContext.OTHER);
		addEEnumLiteral(readingContextEEnum, ReadingContext.SAMPLE_CLOCK);
		addEEnumLiteral(readingContextEEnum, ReadingContext.SAMPLE_PERIODIC);
		addEEnumLiteral(readingContextEEnum, ReadingContext.TRANSACTION_BEGIN);
		addEEnumLiteral(readingContextEEnum, ReadingContext.TRANSACTION_END);
		addEEnumLiteral(readingContextEEnum, ReadingContext.TRIGGER);

		initEEnum(reasonEEnum, Reason.class, "Reason");
		addEEnumLiteral(reasonEEnum, Reason.EMERGENCY_STOP);
		addEEnumLiteral(reasonEEnum, Reason.EV_DISCONNECTED);
		addEEnumLiteral(reasonEEnum, Reason.HARD_RESET);
		addEEnumLiteral(reasonEEnum, Reason.LOCAL);
		addEEnumLiteral(reasonEEnum, Reason.OTHER);
		addEEnumLiteral(reasonEEnum, Reason.POWER_LOSS);
		addEEnumLiteral(reasonEEnum, Reason.REBOOT);
		addEEnumLiteral(reasonEEnum, Reason.REMOTE);
		addEEnumLiteral(reasonEEnum, Reason.SOFT_RESET);
		addEEnumLiteral(reasonEEnum, Reason.UNLOCK_COMMAND);
		addEEnumLiteral(reasonEEnum, Reason.DE_AUTHORIZED);

		initEEnum(registrationStatusEEnum, RegistrationStatus.class, "RegistrationStatus");
		addEEnumLiteral(registrationStatusEEnum, RegistrationStatus.ACCEPTED);
		addEEnumLiteral(registrationStatusEEnum, RegistrationStatus.PENDING);
		addEEnumLiteral(registrationStatusEEnum, RegistrationStatus.REJECTED);

		initEEnum(unitOfMeasureEEnum, UnitOfMeasure.class, "UnitOfMeasure");
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.CELSIUS);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.FAHRENHEIT);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.WH);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.KWH);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.VARH);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.KVARH);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.W);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.KW);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.VA);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.KVA);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.VAR);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.KVAR);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.A);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.V);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.K);
		addEEnumLiteral(unitOfMeasureEEnum, UnitOfMeasure.PERCENT);

		initEEnum(valueFormatEEnum, ValueFormat.class, "ValueFormat");
		addEEnumLiteral(valueFormatEEnum, ValueFormat.RAW);
		addEEnumLiteral(valueFormatEEnum, ValueFormat.SIGNED_DATA);

		// Initialize data types
		initEDataType(authorizationStatusObjectEDataType, AuthorizationStatus.class, "AuthorizationStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chargePointErrorCodeObjectEDataType, ChargePointErrorCode.class, "ChargePointErrorCodeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chargePointStatusObjectEDataType, ChargePointStatus.class, "ChargePointStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString20TypeEDataType, String.class, "CiString20Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString255TypeEDataType, String.class, "CiString255Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString25TypeEDataType, String.class, "CiString25Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString500TypeEDataType, String.class, "CiString500Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ciString50TypeEDataType, String.class, "CiString50Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataTransferStatusObjectEDataType, DataTransferStatus.class, "DataTransferStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(diagnosticsStatusObjectEDataType, DiagnosticsStatus.class, "DiagnosticsStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(firmwareStatusObjectEDataType, FirmwareStatus.class, "FirmwareStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(idTokenEDataType, String.class, "IdToken", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(locationObjectEDataType, Location.class, "LocationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(measurandObjectEDataType, Measurand.class, "MeasurandObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(phaseObjectEDataType, Phase.class, "PhaseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(readingContextObjectEDataType, ReadingContext.class, "ReadingContextObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reasonObjectEDataType, Reason.class, "ReasonObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(registrationStatusObjectEDataType, RegistrationStatus.class, "RegistrationStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitOfMeasureObjectEDataType, UnitOfMeasure.class, "UnitOfMeasureObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueFormatObjectEDataType, ValueFormat.class, "ValueFormatObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (authorizationStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the authorization-status-value"
		   });
		addAnnotation
		  (authorizeRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the Authorize.req PDU"
		   });
		addAnnotation
		  (authorizeResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the Authorize.conf PDU"
		   });
		addAnnotation
		  (bootNotificationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the BootNotification.req PDU"
		   });
		addAnnotation
		  (bootNotificationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the BootNotification.conf PDU"
		   });
		addAnnotation
		  (chargePointErrorCodeEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the charge-point-error-value"
		   });
		addAnnotation
		  (chargePointStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the charge-point-status-value"
		   });
		addAnnotation
		  (ciString20TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 20 printable characters. To be treated as case insensitive.\n            "
		   });
		addAnnotation
		  (ciString255TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 255 printable characters. To be treated as case insensitive.\n            "
		   });
		addAnnotation
		  (ciString25TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 25 printable characters. To be treated as case insensitive.\n            "
		   });
		addAnnotation
		  (ciString500TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 500 printable characters. To be treated as case insensitive.\n            "
		   });
		addAnnotation
		  (ciString50TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "String of maximum 50 printable characters. To be treated as case insensitive.\n            "
		   });
		addAnnotation
		  (dataTransferRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the DataTransfer.req PDU"
		   });
		addAnnotation
		  (dataTransferResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the DataTransfer.conf PDU"
		   });
		addAnnotation
		  (dataTransferStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the status returned in DataTransfer.conf"
		   });
		addAnnotation
		  (diagnosticsStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the diagnostics-status-value"
		   });
		addAnnotation
		  (diagnosticsStatusNotificationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the DiagnosticsStatusNotification.req PDU"
		   });
		addAnnotation
		  (diagnosticsStatusNotificationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the DiagnosticsStatusNotification.conf PDU"
		   });
		addAnnotation
		  (firmwareStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the firmware-status-value"
		   });
		addAnnotation
		  (firmwareStatusNotificationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the FirmwareStatusNotification.req PDU"
		   });
		addAnnotation
		  (firmwareStatusNotificationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the FirmwareStatusNotification.conf PDU"
		   });
		addAnnotation
		  (heartbeatRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the Heartbeat.req PDU"
		   });
		addAnnotation
		  (heartbeatResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the Heartbeat.conf PDU"
		   });
		addAnnotation
		  (idTokenEDataType,
		   source,
		   new String[] {
			   "documentation", "Type of string defining identification token, e.g. RFID or credit card number. To be\n                treated as case insensitive.\n            "
		   });
		addAnnotation
		  (meterValueEClass,
		   source,
		   new String[] {
			   "documentation", "Defines single value of the meter-value-value"
		   });
		addAnnotation
		  (meterValuesRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the MeterValues.req PDU"
		   });
		addAnnotation
		  (meterValuesResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the MeterValues.conf PDU"
		   });
		addAnnotation
		  (reasonEEnum,
		   source,
		   new String[] {
			   "documentation", "Reason for stopping a transaction"
		   });
		addAnnotation
		  (registrationStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines the registration-status-value"
		   });
		addAnnotation
		  (sampledValueEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the SampledValue-value"
		   });
		addAnnotation
		  (startTransactionRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the StartTransaction.req PDU"
		   });
		addAnnotation
		  (startTransactionResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the StartTransaction.conf PDU"
		   });
		addAnnotation
		  (statusNotificationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the StatusNotification.req PDU"
		   });
		addAnnotation
		  (statusNotificationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the StatusNotification.conf PDU"
		   });
		addAnnotation
		  (stopTransactionRequestEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the StopTransaction.req PDU"
		   });
		addAnnotation
		  (stopTransactionResponseEClass,
		   source,
		   new String[] {
			   "documentation", "Defines the StopTransaction.conf PDU"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (authorizationStatusEEnum,
		   source,
		   new String[] {
			   "name", "AuthorizationStatus"
		   });
		addAnnotation
		  (authorizationStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "AuthorizationStatus:Object",
			   "baseType", "AuthorizationStatus"
		   });
		addAnnotation
		  (authorizeRequestEClass,
		   source,
		   new String[] {
			   "name", "AuthorizeRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuthorizeRequest_IdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (authorizeResponseEClass,
		   source,
		   new String[] {
			   "name", "AuthorizeResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuthorizeResponse_IdTagInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTagInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bootNotificationRequestEClass,
		   source,
		   new String[] {
			   "name", "BootNotificationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBootNotificationRequest_ChargePointVendor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargePointVendor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_ChargePointModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargePointModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_ChargePointSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargePointSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_ChargeBoxSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargeBoxSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_FirmwareVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firmwareVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_Iccid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "iccid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_Imsi(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "imsi",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_MeterType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationRequest_MeterSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bootNotificationResponseEClass,
		   source,
		   new String[] {
			   "name", "BootNotificationResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBootNotificationResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationResponse_CurrentTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "currentTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBootNotificationResponse_Interval(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "interval",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (chargePointErrorCodeEEnum,
		   source,
		   new String[] {
			   "name", "ChargePointErrorCode"
		   });
		addAnnotation
		  (chargePointErrorCodeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChargePointErrorCode:Object",
			   "baseType", "ChargePointErrorCode"
		   });
		addAnnotation
		  (chargePointStatusEEnum,
		   source,
		   new String[] {
			   "name", "ChargePointStatus"
		   });
		addAnnotation
		  (chargePointStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "ChargePointStatus:Object",
			   "baseType", "ChargePointStatus"
		   });
		addAnnotation
		  (ciString20TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString20Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "20"
		   });
		addAnnotation
		  (ciString255TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString255Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "255"
		   });
		addAnnotation
		  (ciString25TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString25Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "25"
		   });
		addAnnotation
		  (ciString500TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString500Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "500"
		   });
		addAnnotation
		  (ciString50TypeEDataType,
		   source,
		   new String[] {
			   "name", "CiString50Type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "50"
		   });
		addAnnotation
		  (dataTransferRequestEClass,
		   source,
		   new String[] {
			   "name", "DataTransferRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataTransferRequest_VendorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vendorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTransferRequest_MessageId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "messageId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTransferRequest_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataTransferResponseEClass,
		   source,
		   new String[] {
			   "name", "DataTransferResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataTransferResponse_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDataTransferResponse_Data(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dataTransferStatusEEnum,
		   source,
		   new String[] {
			   "name", "DataTransferStatus"
		   });
		addAnnotation
		  (dataTransferStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "DataTransferStatus:Object",
			   "baseType", "DataTransferStatus"
		   });
		addAnnotation
		  (diagnosticsStatusEEnum,
		   source,
		   new String[] {
			   "name", "DiagnosticsStatus"
		   });
		addAnnotation
		  (diagnosticsStatusNotificationRequestEClass,
		   source,
		   new String[] {
			   "name", "DiagnosticsStatusNotificationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDiagnosticsStatusNotificationRequest_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (diagnosticsStatusNotificationResponseEClass,
		   source,
		   new String[] {
			   "name", "DiagnosticsStatusNotificationResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (diagnosticsStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "DiagnosticsStatus:Object",
			   "baseType", "DiagnosticsStatus"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_AuthorizeRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorizeRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AuthorizeResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorizeResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BootNotificationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bootNotificationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_BootNotificationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bootNotificationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ChargeBoxIdentity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "chargeBoxIdentity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataTransferRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataTransferRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DataTransferResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dataTransferResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DiagnosticsStatusNotificationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "diagnosticsStatusNotificationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_DiagnosticsStatusNotificationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "diagnosticsStatusNotificationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FirmwareStatusNotificationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firmwareStatusNotificationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FirmwareStatusNotificationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firmwareStatusNotificationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HeartbeatRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "heartbeatRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HeartbeatResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "heartbeatResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MeterValuesRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterValuesRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MeterValuesResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterValuesResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StartTransactionRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startTransactionRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StartTransactionResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startTransactionResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StatusNotificationRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "statusNotificationRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StatusNotificationResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "statusNotificationResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StopTransactionRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stopTransactionRequest",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_StopTransactionResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stopTransactionResponse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (firmwareStatusEEnum,
		   source,
		   new String[] {
			   "name", "FirmwareStatus"
		   });
		addAnnotation
		  (firmwareStatusNotificationRequestEClass,
		   source,
		   new String[] {
			   "name", "FirmwareStatusNotificationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFirmwareStatusNotificationRequest_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (firmwareStatusNotificationResponseEClass,
		   source,
		   new String[] {
			   "name", "FirmwareStatusNotificationResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (firmwareStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "FirmwareStatus:Object",
			   "baseType", "FirmwareStatus"
		   });
		addAnnotation
		  (heartbeatRequestEClass,
		   source,
		   new String[] {
			   "name", "HeartbeatRequest",
			   "kind", "empty"
		   });
		addAnnotation
		  (heartbeatResponseEClass,
		   source,
		   new String[] {
			   "name", "HeartbeatResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHeartbeatResponse_CurrentTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "currentTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (idTagInfoEClass,
		   source,
		   new String[] {
			   "name", "IdTagInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdTagInfo_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdTagInfo_ExpiryDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expiryDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdTagInfo_ParentIdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parentIdTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (idTokenEDataType,
		   source,
		   new String[] {
			   "name", "IdToken",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "maxLength", "20"
		   });
		addAnnotation
		  (locationEEnum,
		   source,
		   new String[] {
			   "name", "Location"
		   });
		addAnnotation
		  (locationObjectEDataType,
		   source,
		   new String[] {
			   "name", "Location:Object",
			   "baseType", "Location"
		   });
		addAnnotation
		  (measurandEEnum,
		   source,
		   new String[] {
			   "name", "Measurand"
		   });
		addAnnotation
		  (measurandObjectEDataType,
		   source,
		   new String[] {
			   "name", "Measurand:Object",
			   "baseType", "Measurand"
		   });
		addAnnotation
		  (meterValueEClass,
		   source,
		   new String[] {
			   "name", "MeterValue",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeterValue_Timestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeterValue_SampledValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sampledValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (meterValuesRequestEClass,
		   source,
		   new String[] {
			   "name", "MeterValuesRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMeterValuesRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeterValuesRequest_TransactionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transactionId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMeterValuesRequest_MeterValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (meterValuesResponseEClass,
		   source,
		   new String[] {
			   "name", "MeterValuesResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (phaseEEnum,
		   source,
		   new String[] {
			   "name", "Phase"
		   });
		addAnnotation
		  (phaseObjectEDataType,
		   source,
		   new String[] {
			   "name", "Phase:Object",
			   "baseType", "Phase"
		   });
		addAnnotation
		  (readingContextEEnum,
		   source,
		   new String[] {
			   "name", "ReadingContext"
		   });
		addAnnotation
		  (readingContextObjectEDataType,
		   source,
		   new String[] {
			   "name", "ReadingContext:Object",
			   "baseType", "ReadingContext"
		   });
		addAnnotation
		  (reasonEEnum,
		   source,
		   new String[] {
			   "name", "Reason"
		   });
		addAnnotation
		  (reasonObjectEDataType,
		   source,
		   new String[] {
			   "name", "Reason:Object",
			   "baseType", "Reason"
		   });
		addAnnotation
		  (registrationStatusEEnum,
		   source,
		   new String[] {
			   "name", "RegistrationStatus"
		   });
		addAnnotation
		  (registrationStatusObjectEDataType,
		   source,
		   new String[] {
			   "name", "RegistrationStatus:Object",
			   "baseType", "RegistrationStatus"
		   });
		addAnnotation
		  (sampledValueEClass,
		   source,
		   new String[] {
			   "name", "SampledValue",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSampledValue_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledValue_Context(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "context",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledValue_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledValue_Measurand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "measurand",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledValue_Phase(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "phase",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledValue_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSampledValue_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (startTransactionRequestEClass,
		   source,
		   new String[] {
			   "name", "StartTransactionRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStartTransactionRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStartTransactionRequest_IdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStartTransactionRequest_Timestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStartTransactionRequest_MeterStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterStart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStartTransactionRequest_ReservationId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reservationId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (startTransactionResponseEClass,
		   source,
		   new String[] {
			   "name", "StartTransactionResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStartTransactionResponse_TransactionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transactionId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStartTransactionResponse_IdTagInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTagInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (statusNotificationRequestEClass,
		   source,
		   new String[] {
			   "name", "StatusNotificationRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStatusNotificationRequest_ConnectorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "connectorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusNotificationRequest_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusNotificationRequest_ErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "errorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusNotificationRequest_Info(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "info",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusNotificationRequest_Timestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusNotificationRequest_VendorId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vendorId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStatusNotificationRequest_VendorErrorCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vendorErrorCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (statusNotificationResponseEClass,
		   source,
		   new String[] {
			   "name", "StatusNotificationResponse",
			   "kind", "empty"
		   });
		addAnnotation
		  (stopTransactionRequestEClass,
		   source,
		   new String[] {
			   "name", "StopTransactionRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopTransactionRequest_TransactionId(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transactionId",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopTransactionRequest_IdTag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopTransactionRequest_Timestamp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timestamp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopTransactionRequest_MeterStop(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "meterStop",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopTransactionRequest_Reason(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStopTransactionRequest_TransactionData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transactionData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stopTransactionResponseEClass,
		   source,
		   new String[] {
			   "name", "StopTransactionResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStopTransactionResponse_IdTagInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "idTagInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unitOfMeasureEEnum,
		   source,
		   new String[] {
			   "name", "UnitOfMeasure"
		   });
		addAnnotation
		  (unitOfMeasureObjectEDataType,
		   source,
		   new String[] {
			   "name", "UnitOfMeasure:Object",
			   "baseType", "UnitOfMeasure"
		   });
		addAnnotation
		  (valueFormatEEnum,
		   source,
		   new String[] {
			   "name", "ValueFormat"
		   });
		addAnnotation
		  (valueFormatObjectEDataType,
		   source,
		   new String[] {
			   "name", "ValueFormat:Object",
			   "baseType", "ValueFormat"
		   });
	}

} //OcppCentralSystemPackageImpl
