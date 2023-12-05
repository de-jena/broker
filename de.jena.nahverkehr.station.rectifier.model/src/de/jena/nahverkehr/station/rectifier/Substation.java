/*
 */
package de.jena.nahverkehr.station.rectifier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getRevision <em>Revision</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getOutgoingLines <em>Outgoing Lines</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getDisconnectors <em>Disconnectors</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getMittelspannungsfelder <em>Mittelspannungsfelder</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.Substation#getOvergroundCalbes <em>Overground Calbes</em>}</li>
 * </ul>
 *
 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation()
 * @model
 * @generated
 */
@ProviderType
public interface Substation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference.
	 * @see #setRevision(BooleanValue)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Revision()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanValue getRevision();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getRevision <em>Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' containment reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(BooleanValue value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * haben eindeutige Adressen z.B UWBHB/MSF002/FDXX/IMESS/W
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage</em>' containment reference.
	 * @see #setVoltage(MeasurementValue)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Voltage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MeasurementValue getVoltage();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getVoltage <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' containment reference.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(MeasurementValue value);

	/**
	 * Returns the value of the '<em><b>Outgoing Lines</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.OutgoingLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Lines</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_OutgoingLines()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<OutgoingLine> getOutgoingLines();

	/**
	 * Returns the value of the '<em><b>Disconnectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.Disconnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mastscahlter auf der Strecke n
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disconnectors</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Disconnectors()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Disconnector> getDisconnectors();

	/**
	 * Returns the value of the '<em><b>Mittelspannungsfelder</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mittelspannungsfelder</em>' containment reference list.
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_Mittelspannungsfelder()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Mittelspannungsfeld> getMittelspannungsfelder();

	/**
	 * Returns the value of the '<em><b>Overground Calbes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overground Calbes</em>' containment reference.
	 * @see #setOvergroundCalbes(OverGroundCabelDistribution)
	 * @see de.jena.nahverkehr.station.rectifier.RectifierPackage#getSubstation_OvergroundCalbes()
	 * @model containment="true"
	 * @generated
	 */
	OverGroundCabelDistribution getOvergroundCalbes();

	/**
	 * Sets the value of the '{@link de.jena.nahverkehr.station.rectifier.Substation#getOvergroundCalbes <em>Overground Calbes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overground Calbes</em>' containment reference.
	 * @see #getOvergroundCalbes()
	 * @generated
	 */
	void setOvergroundCalbes(OverGroundCabelDistribution value);

} // Substation
