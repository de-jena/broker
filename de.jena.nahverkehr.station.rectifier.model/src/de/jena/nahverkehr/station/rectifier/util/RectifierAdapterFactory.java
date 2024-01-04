/**
 */
package de.jena.nahverkehr.station.rectifier.util;

import de.jena.nahverkehr.station.rectifier.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage
 * @generated
 */
public class RectifierAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RectifierPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RectifierPackage.eINSTANCE;
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
	protected RectifierSwitch<Adapter> modelSwitch =
		new RectifierSwitch<Adapter>() {
			@Override
			public Adapter caseSubstation(Substation object) {
				return createSubstationAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseRegsiterMessage(RegsiterMessage object) {
				return createRegsiterMessageAdapter();
			}
			@Override
			public Adapter caseMeasurementValue(MeasurementValue object) {
				return createMeasurementValueAdapter();
			}
			@Override
			public Adapter caseOverGroundCabelDistribution(OverGroundCabelDistribution object) {
				return createOverGroundCabelDistributionAdapter();
			}
			@Override
			public Adapter caseCabel(Cabel object) {
				return createCabelAdapter();
			}
			@Override
			public Adapter caseOutgoingLine(OutgoingLine object) {
				return createOutgoingLineAdapter();
			}
			@Override
			public Adapter caseBreaker(Breaker object) {
				return createBreakerAdapter();
			}
			@Override
			public Adapter caseMittelspannungsfeld(Mittelspannungsfeld object) {
				return createMittelspannungsfeldAdapter();
			}
			@Override
			public Adapter caseStateValue(StateValue object) {
				return createStateValueAdapter();
			}
			@Override
			public Adapter caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			@Override
			public Adapter caseCircuitBreaker(CircuitBreaker object) {
				return createCircuitBreakerAdapter();
			}
			@Override
			public Adapter caseDisconnector(Disconnector object) {
				return createDisconnectorAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Substation
	 * @generated
	 */
	public Adapter createSubstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.RegsiterMessage <em>Regsiter Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.RegsiterMessage
	 * @generated
	 */
	public Adapter createRegsiterMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.MeasurementValue
	 * @generated
	 */
	public Adapter createMeasurementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution <em>Over Ground Cabel Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution
	 * @generated
	 */
	public Adapter createOverGroundCabelDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Cabel <em>Cabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Cabel
	 * @generated
	 */
	public Adapter createCabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.OutgoingLine <em>Outgoing Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.OutgoingLine
	 * @generated
	 */
	public Adapter createOutgoingLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Breaker
	 * @generated
	 */
	public Adapter createBreakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld <em>Mittelspannungsfeld</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld
	 * @generated
	 */
	public Adapter createMittelspannungsfeldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.StateValue <em>State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.StateValue
	 * @generated
	 */
	public Adapter createStateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.CircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.CircuitBreaker
	 * @generated
	 */
	public Adapter createCircuitBreakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.jena.nahverkehr.station.rectifier.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.jena.nahverkehr.station.rectifier.Disconnector
	 * @generated
	 */
	public Adapter createDisconnectorAdapter() {
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

} //RectifierAdapterFactory
