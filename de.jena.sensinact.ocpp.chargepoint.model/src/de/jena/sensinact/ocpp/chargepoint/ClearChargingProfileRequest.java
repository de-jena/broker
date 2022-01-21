/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Charging Profile Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the ClearChargingProfile.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getChargingProfilePurpose <em>Charging Profile Purpose</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getStackLevel <em>Stack Level</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getClearChargingProfileRequest()
 * @model extendedMetaData="name='ClearChargingProfileRequest' kind='elementOnly'"
 * @generated
 */
public interface ClearChargingProfileRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getClearChargingProfileRequest_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getClearChargingProfileRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector Id</em>' attribute is set.
	 * @see #unsetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	boolean isSetConnectorId();

	/**
	 * Returns the value of the '<em><b>Charging Profile Purpose</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Profile Purpose</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @see #isSetChargingProfilePurpose()
	 * @see #unsetChargingProfilePurpose()
	 * @see #setChargingProfilePurpose(ChargingProfilePurposeType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getClearChargingProfileRequest_ChargingProfilePurpose()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='chargingProfilePurpose' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingProfilePurposeType getChargingProfilePurpose();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getChargingProfilePurpose <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Profile Purpose</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType
	 * @see #isSetChargingProfilePurpose()
	 * @see #unsetChargingProfilePurpose()
	 * @see #getChargingProfilePurpose()
	 * @generated
	 */
	void setChargingProfilePurpose(ChargingProfilePurposeType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getChargingProfilePurpose <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargingProfilePurpose()
	 * @see #getChargingProfilePurpose()
	 * @see #setChargingProfilePurpose(ChargingProfilePurposeType)
	 * @generated
	 */
	void unsetChargingProfilePurpose();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getChargingProfilePurpose <em>Charging Profile Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charging Profile Purpose</em>' attribute is set.
	 * @see #unsetChargingProfilePurpose()
	 * @see #getChargingProfilePurpose()
	 * @see #setChargingProfilePurpose(ChargingProfilePurposeType)
	 * @generated
	 */
	boolean isSetChargingProfilePurpose();

	/**
	 * Returns the value of the '<em><b>Stack Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Level</em>' attribute.
	 * @see #isSetStackLevel()
	 * @see #unsetStackLevel()
	 * @see #setStackLevel(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getClearChargingProfileRequest_StackLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='stackLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getStackLevel();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getStackLevel <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Level</em>' attribute.
	 * @see #isSetStackLevel()
	 * @see #unsetStackLevel()
	 * @see #getStackLevel()
	 * @generated
	 */
	void setStackLevel(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getStackLevel <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStackLevel()
	 * @see #getStackLevel()
	 * @see #setStackLevel(int)
	 * @generated
	 */
	void unsetStackLevel();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.ClearChargingProfileRequest#getStackLevel <em>Stack Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stack Level</em>' attribute is set.
	 * @see #unsetStackLevel()
	 * @see #getStackLevel()
	 * @see #setStackLevel(int)
	 * @generated
	 */
	boolean isSetStackLevel();

} // ClearChargingProfileRequest
