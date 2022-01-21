/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Key-Value pairs returned by GetConfiguration.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#getKey <em>Key</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getKeyValue()
 * @model extendedMetaData="name='KeyValue' kind='elementOnly'"
 * @generated
 */
public interface KeyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getKeyValue_Key()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString50Type" required="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #isSetReadonly()
	 * @see #unsetReadonly()
	 * @see #setReadonly(boolean)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getKeyValue_Readonly()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='readonly' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isSetReadonly()
	 * @see #unsetReadonly()
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadonly()
	 * @see #isReadonly()
	 * @see #setReadonly(boolean)
	 * @generated
	 */
	void unsetReadonly();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#isReadonly <em>Readonly</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Readonly</em>' attribute is set.
	 * @see #unsetReadonly()
	 * @see #isReadonly()
	 * @see #setReadonly(boolean)
	 * @generated
	 */
	boolean isSetReadonly();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getKeyValue_Value()
	 * @model dataType="de.jena.sensinact.ocpp.chargepoint.CiString500Type"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.KeyValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // KeyValue
