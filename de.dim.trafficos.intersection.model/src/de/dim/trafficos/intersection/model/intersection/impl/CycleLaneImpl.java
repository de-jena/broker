/*
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.intersection.model.intersection.CycleLane;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

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
		return TOSIntersectionPackage.eINSTANCE.getCycleLane();
	}

} //CycleLaneImpl
