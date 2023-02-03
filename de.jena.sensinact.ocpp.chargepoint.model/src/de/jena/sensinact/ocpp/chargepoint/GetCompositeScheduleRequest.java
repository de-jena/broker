/*
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Composite Schedule Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the GetCompositeSchedule.req PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getChargingRateUnit <em>Charging Rate Unit</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleRequest()
 * @model extendedMetaData="name='GetCompositeScheduleRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetCompositeScheduleRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #isSetConnectorId()
	 * @see #unsetConnectorId()
	 * @see #setConnectorId(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleRequest_ConnectorId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	int getConnectorId();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getConnectorId <em>Connector Id</em>}' attribute.
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
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectorId()
	 * @see #getConnectorId()
	 * @see #setConnectorId(int)
	 * @generated
	 */
	void unsetConnectorId();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getConnectorId <em>Connector Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleRequest_Duration()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(int)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(int)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>Charging Rate Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Rate Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @see #isSetChargingRateUnit()
	 * @see #unsetChargingRateUnit()
	 * @see #setChargingRateUnit(ChargingRateUnitType)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetCompositeScheduleRequest_ChargingRateUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='chargingRateUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargingRateUnitType getChargingRateUnit();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getChargingRateUnit <em>Charging Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Rate Unit</em>' attribute.
	 * @see de.jena.sensinact.ocpp.chargepoint.ChargingRateUnitType
	 * @see #isSetChargingRateUnit()
	 * @see #unsetChargingRateUnit()
	 * @see #getChargingRateUnit()
	 * @generated
	 */
	void setChargingRateUnit(ChargingRateUnitType value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getChargingRateUnit <em>Charging Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargingRateUnit()
	 * @see #getChargingRateUnit()
	 * @see #setChargingRateUnit(ChargingRateUnitType)
	 * @generated
	 */
	void unsetChargingRateUnit();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetCompositeScheduleRequest#getChargingRateUnit <em>Charging Rate Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charging Rate Unit</em>' attribute is set.
	 * @see #unsetChargingRateUnit()
	 * @see #getChargingRateUnit()
	 * @see #setChargingRateUnit(ChargingRateUnitType)
	 * @generated
	 */
	boolean isSetChargingRateUnit();

} // GetCompositeScheduleRequest
