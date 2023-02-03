/*
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.IncomingLane;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IncomingLaneImpl extends ConflictingLaneImpl implements IncomingLane {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingLaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.INCOMING_LANE;
	}

} //IncomingLaneImpl
