/**
 */
package de.jena.sensinact.mqtt.generic.message.impl;

import de.jena.sensinact.mqtt.generic.message.*;

import java.time.Instant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sensinact.gateway.geojson.FeatureCollection;
import org.eclipse.sensinact.gateway.geojson.Point;
import org.eclipse.sensinact.gateway.geojson.Polygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageFactoryImpl extends EFactoryImpl implements MessageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageFactory init() {
		try {
			MessageFactory theMessageFactory = (MessageFactory)EPackage.Registry.INSTANCE.getEFactory(MessagePackage.eNS_URI);
			if (theMessageFactory != null) {
				return theMessageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MessageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFactoryImpl() {
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
			case MessagePackage.EOBJECT_VALUE_UPDATE: return createEObjectValueUpdate();
			case MessagePackage.STRING_VALUE_UPDATE: return createStringValueUpdate();
			case MessagePackage.DOUBLE_VALUE_UPDATE: return createDoubleValueUpdate();
			case MessagePackage.INTEGER_VALUE_UPDATE: return createIntegerValueUpdate();
			case MessagePackage.LONG_VALUE_UPDATE: return createLongValueUpdate();
			case MessagePackage.BOOLEAN_VALUE_UPDATE: return createBooleanValueUpdate();
			case MessagePackage.OBJECT_VALUE_UPDATE: return createObjectValueUpdate();
			case MessagePackage.INSANT_VALUE_UPDATE: return createInsantValueUpdate();
			case MessagePackage.DATE_VALUE_UPDATE: return createDateValueUpdate();
			case MessagePackage.BIG_DECIMAL_VALUE_UPDATE: return createBigDecimalValueUpdate();
			case MessagePackage.GEO_JSON_OBJECT_VALUE_UPDATE: return createGeoJsonObjectValueUpdate();
			case MessagePackage.POINT_VALUE_UPDATE: return createPointValueUpdate();
			case MessagePackage.FEATURE_COLLECTION_VALUE_UPDATE: return createFeatureCollectionValueUpdate();
			case MessagePackage.POLYGON_VALUE_UPDATE: return createPolygonValueUpdate();
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
			case MessagePackage.EINSTANT:
				return createEInstantFromString(eDataType, initialValue);
			case MessagePackage.EPOINT:
				return createEPointFromString(eDataType, initialValue);
			case MessagePackage.EFEATURE_COLLECTION:
				return createEFeatureCollectionFromString(eDataType, initialValue);
			case MessagePackage.EPOLYGON:
				return createEPolygonFromString(eDataType, initialValue);
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
			case MessagePackage.EINSTANT:
				return convertEInstantToString(eDataType, instanceValue);
			case MessagePackage.EPOINT:
				return convertEPointToString(eDataType, instanceValue);
			case MessagePackage.EFEATURE_COLLECTION:
				return convertEFeatureCollectionToString(eDataType, instanceValue);
			case MessagePackage.EPOLYGON:
				return convertEPolygonToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectValueUpdate createEObjectValueUpdate() {
		EObjectValueUpdateImpl eObjectValueUpdate = new EObjectValueUpdateImpl();
		return eObjectValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueUpdate createStringValueUpdate() {
		StringValueUpdateImpl stringValueUpdate = new StringValueUpdateImpl();
		return stringValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueUpdate createDoubleValueUpdate() {
		DoubleValueUpdateImpl doubleValueUpdate = new DoubleValueUpdateImpl();
		return doubleValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueUpdate createIntegerValueUpdate() {
		IntegerValueUpdateImpl integerValueUpdate = new IntegerValueUpdateImpl();
		return integerValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongValueUpdate createLongValueUpdate() {
		LongValueUpdateImpl longValueUpdate = new LongValueUpdateImpl();
		return longValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueUpdate createBooleanValueUpdate() {
		BooleanValueUpdateImpl booleanValueUpdate = new BooleanValueUpdateImpl();
		return booleanValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectValueUpdate createObjectValueUpdate() {
		ObjectValueUpdateImpl objectValueUpdate = new ObjectValueUpdateImpl();
		return objectValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsantValueUpdate createInsantValueUpdate() {
		InsantValueUpdateImpl insantValueUpdate = new InsantValueUpdateImpl();
		return insantValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValueUpdate createDateValueUpdate() {
		DateValueUpdateImpl dateValueUpdate = new DateValueUpdateImpl();
		return dateValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimalValueUpdate createBigDecimalValueUpdate() {
		BigDecimalValueUpdateImpl bigDecimalValueUpdate = new BigDecimalValueUpdateImpl();
		return bigDecimalValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoJsonObjectValueUpdate createGeoJsonObjectValueUpdate() {
		GeoJsonObjectValueUpdateImpl geoJsonObjectValueUpdate = new GeoJsonObjectValueUpdateImpl();
		return geoJsonObjectValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointValueUpdate createPointValueUpdate() {
		PointValueUpdateImpl pointValueUpdate = new PointValueUpdateImpl();
		return pointValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCollectionValueUpdate createFeatureCollectionValueUpdate() {
		FeatureCollectionValueUpdateImpl featureCollectionValueUpdate = new FeatureCollectionValueUpdateImpl();
		return featureCollectionValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonValueUpdate createPolygonValueUpdate() {
		PolygonValueUpdateImpl polygonValueUpdate = new PolygonValueUpdateImpl();
		return polygonValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createEInstant(final String it) {
		return Instant.parse(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createEInstantFromString(EDataType eDataType, String initialValue) {
		return createEInstant(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInstant(final Instant it) {
		return it.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInstantToString(EDataType eDataType, Object instanceValue) {
		return convertEInstant((Instant)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createEPoint(final String it) {
		try { return new com.fasterxml.jackson.databind.ObjectMapper().readValue(it, Point.class); } catch (com.fasterxml.jackson.core.JsonProcessingException e) { throw new IllegalArgumentException(e); }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createEPointFromString(EDataType eDataType, String initialValue) {
		return createEPoint(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPoint(final Point it) {
		try { return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(it); } catch (com.fasterxml.jackson.core.JsonProcessingException e) { throw new IllegalArgumentException(e); }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPointToString(EDataType eDataType, Object instanceValue) {
		return convertEPoint((Point)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCollection createEFeatureCollection(final String it) {
		try { return new com.fasterxml.jackson.databind.ObjectMapper().readValue(it, FeatureCollection.class); } catch (com.fasterxml.jackson.core.JsonProcessingException e) { throw new IllegalArgumentException(e); }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCollection createEFeatureCollectionFromString(EDataType eDataType, String initialValue) {
		return createEFeatureCollection(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFeatureCollection(final FeatureCollection it) {
		try { return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(it); } catch (com.fasterxml.jackson.core.JsonProcessingException e) { throw new IllegalArgumentException(e); }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFeatureCollectionToString(EDataType eDataType, Object instanceValue) {
		return convertEFeatureCollection((FeatureCollection)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createEPolygon(final String it) {
		try { return new com.fasterxml.jackson.databind.ObjectMapper().readValue(it, Polygon.class); } catch (com.fasterxml.jackson.core.JsonProcessingException e) { throw new IllegalArgumentException(e); }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createEPolygonFromString(EDataType eDataType, String initialValue) {
		return createEPolygon(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPolygon(final Polygon it) {
		try { return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(it); } catch (com.fasterxml.jackson.core.JsonProcessingException e) { throw new IllegalArgumentException(e); }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPolygonToString(EDataType eDataType, Object instanceValue) {
		return convertEPolygon((Polygon)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePackage getMessagePackage() {
		return (MessagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MessagePackage getPackage() {
		return MessagePackage.eINSTANCE;
	}

} //MessageFactoryImpl
