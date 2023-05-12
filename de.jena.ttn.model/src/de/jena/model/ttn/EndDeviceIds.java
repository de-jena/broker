/*
 */
package de.jena.model.ttn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.model.ttn.EndDeviceIds#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link de.jena.model.ttn.EndDeviceIds#getApplicationIds <em>Application Ids</em>}</li>
 *   <li>{@link de.jena.model.ttn.EndDeviceIds#getDevEui <em>Dev Eui</em>}</li>
 *   <li>{@link de.jena.model.ttn.EndDeviceIds#getJoinEui <em>Join Eui</em>}</li>
 *   <li>{@link de.jena.model.ttn.EndDeviceIds#getDevAddr <em>Dev Addr</em>}</li>
 * </ul>
 *
 * @see de.jena.model.ttn.TTNPackage#getEndDeviceIds()
 * @model
 * @generated
 */
@ProviderType
public interface EndDeviceIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(String)
	 * @see de.jena.model.ttn.TTNPackage#getEndDeviceIds_DeviceId()
	 * @model extendedMetaData="name='device_id' kind='element'"
	 * @generated
	 */
	String getDeviceId();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.EndDeviceIds#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(String value);

	/**
	 * Returns the value of the '<em><b>Application Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Ids</em>' containment reference.
	 * @see #setApplicationIds(ApplicationId)
	 * @see de.jena.model.ttn.TTNPackage#getEndDeviceIds_ApplicationIds()
	 * @model containment="true"
	 *        extendedMetaData="name='application_ids' kind='element'"
	 * @generated
	 */
	ApplicationId getApplicationIds();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.EndDeviceIds#getApplicationIds <em>Application Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Ids</em>' containment reference.
	 * @see #getApplicationIds()
	 * @generated
	 */
	void setApplicationIds(ApplicationId value);

	/**
	 * Returns the value of the '<em><b>Dev Eui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev Eui</em>' attribute.
	 * @see #setDevEui(String)
	 * @see de.jena.model.ttn.TTNPackage#getEndDeviceIds_DevEui()
	 * @model extendedMetaData="name='dev_eui' kind='element'"
	 * @generated
	 */
	String getDevEui();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.EndDeviceIds#getDevEui <em>Dev Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Eui</em>' attribute.
	 * @see #getDevEui()
	 * @generated
	 */
	void setDevEui(String value);

	/**
	 * Returns the value of the '<em><b>Join Eui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Eui</em>' attribute.
	 * @see #setJoinEui(String)
	 * @see de.jena.model.ttn.TTNPackage#getEndDeviceIds_JoinEui()
	 * @model extendedMetaData="name='join_eui' kind='element'"
	 * @generated
	 */
	String getJoinEui();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.EndDeviceIds#getJoinEui <em>Join Eui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Eui</em>' attribute.
	 * @see #getJoinEui()
	 * @generated
	 */
	void setJoinEui(String value);

	/**
	 * Returns the value of the '<em><b>Dev Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev Addr</em>' attribute.
	 * @see #setDevAddr(String)
	 * @see de.jena.model.ttn.TTNPackage#getEndDeviceIds_DevAddr()
	 * @model extendedMetaData="name='dev_addr' kind='element'"
	 * @generated
	 */
	String getDevAddr();

	/**
	 * Sets the value of the '{@link de.jena.model.ttn.EndDeviceIds#getDevAddr <em>Dev Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev Addr</em>' attribute.
	 * @see #getDevAddr()
	 * @generated
	 */
	void setDevAddr(String value);

} // EndDeviceIds
