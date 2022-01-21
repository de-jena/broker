/**
 */
package de.jena.sensinact.ocpp.chargepoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Local List Version Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the GetLocalListVersion.conf PDU
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse#getListVersion <em>List Version</em>}</li>
 * </ul>
 *
 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetLocalListVersionResponse()
 * @model extendedMetaData="name='GetLocalListVersionResponse' kind='elementOnly'"
 * @generated
 */
public interface GetLocalListVersionResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>List Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Version</em>' attribute.
	 * @see #isSetListVersion()
	 * @see #unsetListVersion()
	 * @see #setListVersion(int)
	 * @see de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage#getGetLocalListVersionResponse_ListVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='listVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	int getListVersion();

	/**
	 * Sets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse#getListVersion <em>List Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Version</em>' attribute.
	 * @see #isSetListVersion()
	 * @see #unsetListVersion()
	 * @see #getListVersion()
	 * @generated
	 */
	void setListVersion(int value);

	/**
	 * Unsets the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse#getListVersion <em>List Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListVersion()
	 * @see #getListVersion()
	 * @see #setListVersion(int)
	 * @generated
	 */
	void unsetListVersion();

	/**
	 * Returns whether the value of the '{@link de.jena.sensinact.ocpp.chargepoint.GetLocalListVersionResponse#getListVersion <em>List Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Version</em>' attribute is set.
	 * @see #unsetListVersion()
	 * @see #getListVersion()
	 * @see #setListVersion(int)
	 * @generated
	 */
	boolean isSetListVersion();

} // GetLocalListVersionResponse
