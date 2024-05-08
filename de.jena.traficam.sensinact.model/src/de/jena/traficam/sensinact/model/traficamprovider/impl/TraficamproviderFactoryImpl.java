/**
 */
package de.jena.traficam.sensinact.model.traficamprovider.impl;

import de.jena.traficam.sensinact.model.traficamprovider.*;

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
public class TraficamproviderFactoryImpl extends EFactoryImpl implements TraficamproviderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraficamproviderFactory init() {
		try {
			TraficamproviderFactory theTraficamproviderFactory = (TraficamproviderFactory)EPackage.Registry.INSTANCE.getEFactory(TraficamproviderPackage.eNS_URI);
			if (theTraficamproviderFactory != null) {
				return theTraficamproviderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraficamproviderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficamproviderFactoryImpl() {
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
			case TraficamproviderPackage.TRAFICAM_PROVIDER: return createTraficamProvider();
			case TraficamproviderPackage.TRAFICAM_ADMIN: return createTraficamAdmin();
			case TraficamproviderPackage.OBSERVED_OBJECTS: return createObservedObjects();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficamProvider createTraficamProvider() {
		TraficamProviderImpl traficamProvider = new TraficamProviderImpl();
		return traficamProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficamAdmin createTraficamAdmin() {
		TraficamAdminImpl traficamAdmin = new TraficamAdminImpl();
		return traficamAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservedObjects createObservedObjects() {
		ObservedObjectsImpl observedObjects = new ObservedObjectsImpl();
		return observedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraficamproviderPackage getTraficamproviderPackage() {
		return (TraficamproviderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraficamproviderPackage getPackage() {
		return TraficamproviderPackage.eINSTANCE;
	}

} //TraficamproviderFactoryImpl
