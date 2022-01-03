/**
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.CycleLane;
import de.dim.trafficos.model.device.TOSDevicePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cycle Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CycleLaneImpl extends ConflictingLaneImpl implements CycleLane {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CycleLaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.CYCLE_LANE;
	}

} //CycleLaneImpl
