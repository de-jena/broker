/*
 */
package de.jena.nahverkehr.station.rectifier.impl;

import de.jena.nahverkehr.station.rectifier.Cabel;
import de.jena.nahverkehr.station.rectifier.Disconnector;
import de.jena.nahverkehr.station.rectifier.OverGroundCabelDistribution;
import de.jena.nahverkehr.station.rectifier.RectifierPackage;

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
 * An implementation of the model object '<em><b>Over Ground Cabel Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl#getCables <em>Cables</em>}</li>
 *   <li>{@link de.jena.nahverkehr.station.rectifier.impl.OverGroundCabelDistributionImpl#getDisconnector <em>Disconnector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverGroundCabelDistributionImpl extends MinimalEObjectImpl.Container implements OverGroundCabelDistribution {
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
	 * The cached value of the '{@link #getCables() <em>Cables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCables()
	 * @generated
	 * @ordered
	 */
	protected EList<Cabel> cables;

	/**
	 * The cached value of the '{@link #getDisconnector() <em>Disconnector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnector()
	 * @generated
	 * @ordered
	 */
	protected Disconnector disconnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverGroundCabelDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RectifierPackage.Literals.OVER_GROUND_CABEL_DISTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cabel> getCables() {
		if (cables == null) {
			cables = new EObjectContainmentEList<Cabel>(Cabel.class, this, RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__CABLES);
		}
		return cables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disconnector getDisconnector() {
		return disconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisconnector(Disconnector newDisconnector, NotificationChain msgs) {
		Disconnector oldDisconnector = disconnector;
		disconnector = newDisconnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR, oldDisconnector, newDisconnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnector(Disconnector newDisconnector) {
		if (newDisconnector != disconnector) {
			NotificationChain msgs = null;
			if (disconnector != null)
				msgs = ((InternalEObject)disconnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR, null, msgs);
			if (newDisconnector != null)
				msgs = ((InternalEObject)newDisconnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR, null, msgs);
			msgs = basicSetDisconnector(newDisconnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR, newDisconnector, newDisconnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__CABLES:
				return ((InternalEList<?>)getCables()).basicRemove(otherEnd, msgs);
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR:
				return basicSetDisconnector(null, msgs);
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
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__ID:
				return getId();
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__CABLES:
				return getCables();
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR:
				return getDisconnector();
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
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__ID:
				setId((String)newValue);
				return;
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__CABLES:
				getCables().clear();
				getCables().addAll((Collection<? extends Cabel>)newValue);
				return;
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR:
				setDisconnector((Disconnector)newValue);
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
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__CABLES:
				getCables().clear();
				return;
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR:
				setDisconnector((Disconnector)null);
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
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__CABLES:
				return cables != null && !cables.isEmpty();
			case RectifierPackage.OVER_GROUND_CABEL_DISTRIBUTION__DISCONNECTOR:
				return disconnector != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //OverGroundCabelDistributionImpl
