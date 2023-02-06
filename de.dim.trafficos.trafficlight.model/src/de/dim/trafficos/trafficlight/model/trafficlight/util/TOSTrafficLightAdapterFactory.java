/**
 */
package de.dim.trafficos.trafficlight.model.trafficlight.util;

import de.dim.trafficos.common.model.common.IdNameElement;
import de.dim.trafficos.common.model.common.Localizable;
import de.dim.trafficos.common.model.common.Output;

import de.dim.trafficos.trafficlight.model.trafficlight.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dim.trafficos.trafficlight.model.trafficlight.TOSTrafficLightPackage
 * @generated
 */
public class TOSTrafficLightAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TOSTrafficLightPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSTrafficLightAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TOSTrafficLightPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOSTrafficLightSwitch<Adapter> modelSwitch =
		new TOSTrafficLightSwitch<Adapter>() {
			@Override
			public Adapter caseTLModule(TLModule object) {
				return createTLModuleAdapter();
			}
			@Override
			public Adapter caseTLSignalTransmitter(TLSignalTransmitter object) {
				return createTLSignalTransmitterAdapter();
			}
			@Override
			public Adapter caseTLSignalGroup(TLSignalGroup object) {
				return createTLSignalGroupAdapter();
			}
			@Override
			public Adapter caseLightSignal(LightSignal object) {
				return createLightSignalAdapter();
			}
			@Override
			public Adapter caseIdNameElement(IdNameElement object) {
				return createIdNameElementAdapter();
			}
			@Override
			public Adapter caseLocalizable(Localizable object) {
				return createLocalizableAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLModule <em>TL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLModule
	 * @generated
	 */
	public Adapter createTLModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter <em>TL Signal Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalTransmitter
	 * @generated
	 */
	public Adapter createTLSignalTransmitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup <em>TL Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.TLSignalGroup
	 * @generated
	 */
	public Adapter createTLSignalGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.trafficlight.model.trafficlight.LightSignal <em>Light Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.trafficlight.model.trafficlight.LightSignal
	 * @generated
	 */
	public Adapter createLightSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.IdNameElement <em>Id Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.IdNameElement
	 * @generated
	 */
	public Adapter createIdNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.Localizable <em>Localizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.Localizable
	 * @generated
	 */
	public Adapter createLocalizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dim.trafficos.common.model.common.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dim.trafficos.common.model.common.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TOSTrafficLightAdapterFactory
