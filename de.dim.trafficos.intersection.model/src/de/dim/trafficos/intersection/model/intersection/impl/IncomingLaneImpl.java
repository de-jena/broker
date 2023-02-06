/**
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.IncomingLane;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

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
		return TOSIntersectionPackage.eINSTANCE.getIncomingLane();
	}

} //IncomingLaneImpl
