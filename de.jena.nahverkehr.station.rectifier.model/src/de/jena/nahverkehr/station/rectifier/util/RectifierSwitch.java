/**
 */
package de.jena.nahverkehr.station.rectifier.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.jena.nahverkehr.station.rectifier.Alarm;
import de.jena.nahverkehr.station.rectifier.BooleanValue;
import de.jena.nahverkehr.station.rectifier.Breaker;
import de.jena.nahverkehr.station.rectifier.Cabel;
import de.jena.nahverkehr.station.rectifier.CircuitBreaker;
import de.jena.nahverkehr.station.rectifier.Disconnector;
import de.jena.nahverkehr.station.rectifier.MeasurementValue;
import de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld;
import de.jena.nahverkehr.station.rectifier.OutgoingLine;
import de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;
import de.jena.nahverkehr.station.rectifier.RegsiterMessage;
import de.jena.nahverkehr.station.rectifier.StateValue;
import de.jena.nahverkehr.station.rectifier.Substation;
import de.jena.nahverkehr.station.rectifier.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage
 * @generated
 */
public class RectifierSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RectifierPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierSwitch() {
		if (modelPackage == null) {
			modelPackage = RectifierPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RectifierPackage.SUBSTATION: {
				Substation substation = (Substation)theEObject;
				T result = caseSubstation(substation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.REGSITER_MESSAGE: {
				RegsiterMessage regsiterMessage = (RegsiterMessage)theEObject;
				T result = caseRegsiterMessage(regsiterMessage);
				if (result == null) result = caseValue(regsiterMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.MEASUREMENT_VALUE: {
				MeasurementValue measurementValue = (MeasurementValue)theEObject;
				T result = caseMeasurementValue(measurementValue);
				if (result == null) result = caseValue(measurementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION: {
				OverGroundCabelDistribution overGroundCabelDistribution = (OverGroundCabelDistribution)theEObject;
				T result = caseOverGroundCabelDistribution(overGroundCabelDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.CABEL: {
				Cabel cabel = (Cabel)theEObject;
				T result = caseCabel(cabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.OUTGOING_LINE: {
				OutgoingLine outgoingLine = (OutgoingLine)theEObject;
				T result = caseOutgoingLine(outgoingLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.BREAKER: {
				Breaker breaker = (Breaker)theEObject;
				T result = caseBreaker(breaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.MITTELSPANNUNGSFELD: {
				Mittelspannungsfeld mittelspannungsfeld = (Mittelspannungsfeld)theEObject;
				T result = caseMittelspannungsfeld(mittelspannungsfeld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.STATE_VALUE: {
				StateValue stateValue = (StateValue)theEObject;
				T result = caseStateValue(stateValue);
				if (result == null) result = caseValue(stateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.ALARM: {
				Alarm alarm = (Alarm)theEObject;
				T result = caseAlarm(alarm);
				if (result == null) result = caseValue(alarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.CIRCUIT_BREAKER: {
				CircuitBreaker circuitBreaker = (CircuitBreaker)theEObject;
				T result = caseCircuitBreaker(circuitBreaker);
				if (result == null) result = caseBreaker(circuitBreaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RectifierPackage.DISCONNECTOR: {
				Disconnector disconnector = (Disconnector)theEObject;
				T result = caseDisconnector(disconnector);
				if (result == null) result = caseBreaker(disconnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstation(Substation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regsiter Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regsiter Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegsiterMessage(RegsiterMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValue(MeasurementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Over Ground Cabel Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Over Ground Cabel Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverGroundCabelDistribution(OverGroundCabelDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabel(Cabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingLine(OutgoingLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreaker(Breaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mittelspannungsfeld</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mittelspannungsfeld</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMittelspannungsfeld(Mittelspannungsfeld object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateValue(StateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarm(Alarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Breaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitBreaker(CircuitBreaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnector(Disconnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RectifierSwitch
