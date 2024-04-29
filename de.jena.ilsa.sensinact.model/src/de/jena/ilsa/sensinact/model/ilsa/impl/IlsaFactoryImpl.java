/**
 */
package de.jena.ilsa.sensinact.model.ilsa.impl;

import de.jena.ilsa.sensinact.model.ilsa.*;

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
public class IlsaFactoryImpl extends EFactoryImpl implements IlsaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IlsaFactory init() {
		try {
			IlsaFactory theIlsaFactory = (IlsaFactory)EPackage.Registry.INSTANCE.getEFactory(IlsaPackage.eNS_URI);
			if (theIlsaFactory != null) {
				return theIlsaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IlsaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlsaFactoryImpl() {
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
			case IlsaPackage.ILSA: return createIlsa();
			case IlsaPackage.SIGNAL: return createSignal();
			case IlsaPackage.THERMAL: return createThermal();
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
	public Ilsa createIlsa() {
		IlsaImpl ilsa = new IlsaImpl();
		return ilsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thermal createThermal() {
		ThermalImpl thermal = new ThermalImpl();
		return thermal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IlsaPackage getIlsaPackage() {
		return (IlsaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IlsaPackage getPackage() {
		return IlsaPackage.eINSTANCE;
	}

} //IlsaFactoryImpl
