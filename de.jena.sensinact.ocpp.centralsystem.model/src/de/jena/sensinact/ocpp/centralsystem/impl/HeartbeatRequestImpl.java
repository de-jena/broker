/*
 */
package de.jena.sensinact.ocpp.centralsystem.impl;

import de.jena.sensinact.ocpp.centralsystem.HeartbeatRequest;
import de.jena.sensinact.ocpp.centralsystem.OcppCentralSystemPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heartbeat Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HeartbeatRequestImpl extends MinimalEObjectImpl.Container implements HeartbeatRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeartbeatRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppCentralSystemPackage.Literals.HEARTBEAT_REQUEST;
	}

} //HeartbeatRequestImpl
