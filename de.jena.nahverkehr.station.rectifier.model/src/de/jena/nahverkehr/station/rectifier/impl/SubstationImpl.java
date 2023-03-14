/*
 */
package de.jena.nahverkehr.station.rectifier.impl;

import de.jena.nahverkehr.station.rectifier.BooleanValue;
import de.jena.nahverkehr.station.rectifier.Disconnector;
import de.jena.nahverkehr.station.rectifier.MeasurementValue;
import de.jena.nahverkehr.station.rectifier.Mittelspannungsfeld;
import de.jena.nahverkehr.station.rectifier.OutgoingLine;
import de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;
import de.jena.nahverkehr.station.rectifier.Substation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getOutgoingLines <em>Outgoing Lines</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getDisconnectors <em>Disconnectors</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getMittelspannungsfelder <em>Mittelspannungsfelder</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.SubstationImpl#getOvergroundCalbes <em>Overground Calbes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstationImpl extends MinimalEObjectImpl.Container implements Substation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected BooleanValue revision;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue voltage;

	/**
	 * The cached value of the '{@link #getOutgoingLines() <em>Outgoing Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLines()
	 * @generated
	 * @ordered
	 */
	protected EList<OutgoingLine> outgoingLines;

	/**
	 * The cached value of the '{@link #getDisconnectors() <em>Disconnectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Disconnector> disconnectors;

	/**
	 * The cached value of the '{@link #getMittelspannungsfelder() <em>Mittelspannungsfelder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMittelspannungsfelder()
	 * @generated
	 * @ordered
	 */
	protected EList<Mittelspannungsfeld> mittelspannungsfelder;

	/**
	 * The cached value of the '{@link #getOvergroundCalbes() <em>Overground Calbes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvergroundCalbes()
	 * @generated
	 * @ordered
	 */
	protected OverGroundCabelDistribution overgroundCalbes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RectifierPackage.Literals.SUBSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevision(BooleanValue newRevision, NotificationChain msgs) {
		BooleanValue oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__REVISION, oldRevision, newRevision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(BooleanValue newRevision) {
		if (newRevision != revision) {
			NotificationChain msgs = null;
			if (revision != null)
				msgs = ((InternalEObject)revision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.SUBSTATION__REVISION, null, msgs);
			if (newRevision != null)
				msgs = ((InternalEObject)newRevision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.SUBSTATION__REVISION, null, msgs);
			msgs = basicSetRevision(newRevision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__REVISION, newRevision, newRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltage(MeasurementValue newVoltage, NotificationChain msgs) {
		MeasurementValue oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__VOLTAGE, oldVoltage, newVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(MeasurementValue newVoltage) {
		if (newVoltage != voltage) {
			NotificationChain msgs = null;
			if (voltage != null)
				msgs = ((InternalEObject)voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.SUBSTATION__VOLTAGE, null, msgs);
			if (newVoltage != null)
				msgs = ((InternalEObject)newVoltage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.SUBSTATION__VOLTAGE, null, msgs);
			msgs = basicSetVoltage(newVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__VOLTAGE, newVoltage, newVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutgoingLine> getOutgoingLines() {
		if (outgoingLines == null) {
			outgoingLines = new EObjectContainmentEList<OutgoingLine>(OutgoingLine.class, this, RectifierPackage.SUBSTATION__OUTGOING_LINES);
		}
		return outgoingLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Disconnector> getDisconnectors() {
		if (disconnectors == null) {
			disconnectors = new EObjectContainmentEList<Disconnector>(Disconnector.class, this, RectifierPackage.SUBSTATION__DISCONNECTORS);
		}
		return disconnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mittelspannungsfeld> getMittelspannungsfelder() {
		if (mittelspannungsfelder == null) {
			mittelspannungsfelder = new EObjectContainmentEList<Mittelspannungsfeld>(Mittelspannungsfeld.class, this, RectifierPackage.SUBSTATION__MITTELSPANNUNGSFELDER);
		}
		return mittelspannungsfelder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverGroundCabelDistribution getOvergroundCalbes() {
		return overgroundCalbes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOvergroundCalbes(OverGroundCabelDistribution newOvergroundCalbes, NotificationChain msgs) {
		OverGroundCabelDistribution oldOvergroundCalbes = overgroundCalbes;
		overgroundCalbes = newOvergroundCalbes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__OVERGROUND_CALBES, oldOvergroundCalbes, newOvergroundCalbes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvergroundCalbes(OverGroundCabelDistribution newOvergroundCalbes) {
		if (newOvergroundCalbes != overgroundCalbes) {
			NotificationChain msgs = null;
			if (overgroundCalbes != null)
				msgs = ((InternalEObject)overgroundCalbes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.SUBSTATION__OVERGROUND_CALBES, null, msgs);
			if (newOvergroundCalbes != null)
				msgs = ((InternalEObject)newOvergroundCalbes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.SUBSTATION__OVERGROUND_CALBES, null, msgs);
			msgs = basicSetOvergroundCalbes(newOvergroundCalbes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.SUBSTATION__OVERGROUND_CALBES, newOvergroundCalbes, newOvergroundCalbes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RectifierPackage.SUBSTATION__REVISION:
				return basicSetRevision(null, msgs);
			case RectifierPackage.SUBSTATION__VOLTAGE:
				return basicSetVoltage(null, msgs);
			case RectifierPackage.SUBSTATION__OUTGOING_LINES:
				return ((InternalEList<?>)getOutgoingLines()).basicRemove(otherEnd, msgs);
			case RectifierPackage.SUBSTATION__DISCONNECTORS:
				return ((InternalEList<?>)getDisconnectors()).basicRemove(otherEnd, msgs);
			case RectifierPackage.SUBSTATION__MITTELSPANNUNGSFELDER:
				return ((InternalEList<?>)getMittelspannungsfelder()).basicRemove(otherEnd, msgs);
			case RectifierPackage.SUBSTATION__OVERGROUND_CALBES:
				return basicSetOvergroundCalbes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RectifierPackage.SUBSTATION__NAME:
				return getName();
			case RectifierPackage.SUBSTATION__DESCRIPTION:
				return getDescription();
			case RectifierPackage.SUBSTATION__ID:
				return getId();
			case RectifierPackage.SUBSTATION__LOCATION:
				return getLocation();
			case RectifierPackage.SUBSTATION__REVISION:
				return getRevision();
			case RectifierPackage.SUBSTATION__VOLTAGE:
				return getVoltage();
			case RectifierPackage.SUBSTATION__OUTGOING_LINES:
				return getOutgoingLines();
			case RectifierPackage.SUBSTATION__DISCONNECTORS:
				return getDisconnectors();
			case RectifierPackage.SUBSTATION__MITTELSPANNUNGSFELDER:
				return getMittelspannungsfelder();
			case RectifierPackage.SUBSTATION__OVERGROUND_CALBES:
				return getOvergroundCalbes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RectifierPackage.SUBSTATION__NAME:
				setName((String)newValue);
				return;
			case RectifierPackage.SUBSTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RectifierPackage.SUBSTATION__ID:
				setId((String)newValue);
				return;
			case RectifierPackage.SUBSTATION__LOCATION:
				setLocation((String)newValue);
				return;
			case RectifierPackage.SUBSTATION__REVISION:
				setRevision((BooleanValue)newValue);
				return;
			case RectifierPackage.SUBSTATION__VOLTAGE:
				setVoltage((MeasurementValue)newValue);
				return;
			case RectifierPackage.SUBSTATION__OUTGOING_LINES:
				getOutgoingLines().clear();
				getOutgoingLines().addAll((Collection<? extends OutgoingLine>)newValue);
				return;
			case RectifierPackage.SUBSTATION__DISCONNECTORS:
				getDisconnectors().clear();
				getDisconnectors().addAll((Collection<? extends Disconnector>)newValue);
				return;
			case RectifierPackage.SUBSTATION__MITTELSPANNUNGSFELDER:
				getMittelspannungsfelder().clear();
				getMittelspannungsfelder().addAll((Collection<? extends Mittelspannungsfeld>)newValue);
				return;
			case RectifierPackage.SUBSTATION__OVERGROUND_CALBES:
				setOvergroundCalbes((OverGroundCabelDistribution)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RectifierPackage.SUBSTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RectifierPackage.SUBSTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RectifierPackage.SUBSTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case RectifierPackage.SUBSTATION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case RectifierPackage.SUBSTATION__REVISION:
				setRevision((BooleanValue)null);
				return;
			case RectifierPackage.SUBSTATION__VOLTAGE:
				setVoltage((MeasurementValue)null);
				return;
			case RectifierPackage.SUBSTATION__OUTGOING_LINES:
				getOutgoingLines().clear();
				return;
			case RectifierPackage.SUBSTATION__DISCONNECTORS:
				getDisconnectors().clear();
				return;
			case RectifierPackage.SUBSTATION__MITTELSPANNUNGSFELDER:
				getMittelspannungsfelder().clear();
				return;
			case RectifierPackage.SUBSTATION__OVERGROUND_CALBES:
				setOvergroundCalbes((OverGroundCabelDistribution)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RectifierPackage.SUBSTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RectifierPackage.SUBSTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RectifierPackage.SUBSTATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RectifierPackage.SUBSTATION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case RectifierPackage.SUBSTATION__REVISION:
				return revision != null;
			case RectifierPackage.SUBSTATION__VOLTAGE:
				return voltage != null;
			case RectifierPackage.SUBSTATION__OUTGOING_LINES:
				return outgoingLines != null && !outgoingLines.isEmpty();
			case RectifierPackage.SUBSTATION__DISCONNECTORS:
				return disconnectors != null && !disconnectors.isEmpty();
			case RectifierPackage.SUBSTATION__MITTELSPANNUNGSFELDER:
				return mittelspannungsfelder != null && !mittelspannungsfelder.isEmpty();
			case RectifierPackage.SUBSTATION__OVERGROUND_CALBES:
				return overgroundCalbes != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //SubstationImpl
