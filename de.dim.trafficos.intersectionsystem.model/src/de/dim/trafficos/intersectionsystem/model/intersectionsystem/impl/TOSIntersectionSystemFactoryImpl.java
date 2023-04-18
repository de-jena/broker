/**
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl;

import de.dim.trafficos.intersectionsystem.model.intersectionsystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TOSIntersectionSystemFactoryImpl extends EFactoryImpl implements TOSIntersectionSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TOSIntersectionSystemFactory init() {
		try {
			TOSIntersectionSystemFactory theTOSIntersectionSystemFactory = (TOSIntersectionSystemFactory)EPackage.Registry.INSTANCE.getEFactory(TOSIntersectionSystemPackage.eNS_URI);
			if (theTOSIntersectionSystemFactory != null) {
				return theTOSIntersectionSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TOSIntersectionSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSIntersectionSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM: return createIntersectionSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntersectionSystem createIntersectionSystem() {
		IntersectionSystemImpl intersectionSystem = new IntersectionSystemImpl();
		return intersectionSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOSIntersectionSystemPackage getTOSIntersectionSystemPackage() {
		return (TOSIntersectionSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TOSIntersectionSystemPackage getPackage() {
		return TOSIntersectionSystemPackage.eINSTANCE;
	}

} //TOSIntersectionSystemFactoryImpl
