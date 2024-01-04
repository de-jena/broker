/**
 */
package de.jena.nahverkehr.station.rectifier.impl;

import de.jena.nahverkehr.station.rectifier.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RectifierFactoryImpl extends EFactoryImpl implements RectifierFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RectifierFactory init() {
		try {
			RectifierFactory theRectifierFactory = (RectifierFactory)EPackage.Registry.INSTANCE.getEFactory(RectifierPackage.eNS_URI);
			if (theRectifierFactory != null) {
				return theRectifierFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RectifierFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierFactoryImpl() {
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
			case RectifierPackage.SUBSTATION: return createSubstation();
			case RectifierPackage.VALUE: return createValue();
			case RectifierPackage.BOOLEAN_VALUE: return createBooleanValue();
			case RectifierPackage.REGSITER_MESSAGE: return createRegsiterMessage();
			case RectifierPackage.MEASUREMENT_VALUE: return createMeasurementValue();
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION: return createOverGroundCabelDistribution();
			case RectifierPackage.CABEL: return createCabel();
			case RectifierPackage.OUTGOING_LINE: return createOutgoingLine();
			case RectifierPackage.BREAKER: return createBreaker();
			case RectifierPackage.MITTELSPANNUNGSFELD: return createMittelspannungsfeld();
			case RectifierPackage.STATE_VALUE: return createStateValue();
			case RectifierPackage.ALARM: return createAlarm();
			case RectifierPackage.CIRCUIT_BREAKER: return createCircuitBreaker();
			case RectifierPackage.DISCONNECTOR: return createDisconnector();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RectifierPackage.UNIT:
				return createUNITFromString(eDataType, initialValue);
			case RectifierPackage.STATE:
				return createStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RectifierPackage.UNIT:
				return convertUNITToString(eDataType, instanceValue);
			case RectifierPackage.STATE:
				return convertStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		SubstationImpl substation = new SubstationImpl();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegsiterMessage createRegsiterMessage() {
		RegsiterMessageImpl regsiterMessage = new RegsiterMessageImpl();
		return regsiterMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue createMeasurementValue() {
		MeasurementValueImpl measurementValue = new MeasurementValueImpl();
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverGroundCabelDistribution createOverGroundCabelDistribution() {
		OverGroundCabelDistributionImpl overGroundCabelDistribution = new OverGroundCabelDistributionImpl();
		return overGroundCabelDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cabel createCabel() {
		CabelImpl cabel = new CabelImpl();
		return cabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingLine createOutgoingLine() {
		OutgoingLineImpl outgoingLine = new OutgoingLineImpl();
		return outgoingLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breaker createBreaker() {
		BreakerImpl breaker = new BreakerImpl();
		return breaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mittelspannungsfeld createMittelspannungsfeld() {
		MittelspannungsfeldImpl mittelspannungsfeld = new MittelspannungsfeldImpl();
		return mittelspannungsfeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateValue createStateValue() {
		StateValueImpl stateValue = new StateValueImpl();
		return stateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alarm createAlarm() {
		AlarmImpl alarm = new AlarmImpl();
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreaker createCircuitBreaker() {
		CircuitBreakerImpl circuitBreaker = new CircuitBreakerImpl();
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disconnector createDisconnector() {
		DisconnectorImpl disconnector = new DisconnectorImpl();
		return disconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNIT createUNITFromString(EDataType eDataType, String initialValue) {
		UNIT result = UNIT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUNITToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierPackage getRectifierPackage() {
		return (RectifierPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RectifierPackage getPackage() {
		return RectifierPackage.eINSTANCE;
	}

} //RectifierFactoryImpl
