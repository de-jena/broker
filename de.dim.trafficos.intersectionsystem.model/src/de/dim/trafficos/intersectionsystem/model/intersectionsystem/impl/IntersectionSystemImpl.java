/*
 */
package de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl;

import de.dim.trafficos.intersectionsystem.model.intersectionsystem.IntersectionSystem;
import de.dim.trafficos.intersectionsystem.model.intersectionsystem.TOSIntersectionSystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersection System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl#getIntersectionId <em>Intersection Id</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl#getTlModuleIds <em>Tl Module Ids</em>}</li>
 *   <li>{@link de.dim.trafficos.intersectionsystem.model.intersectionsystem.impl.IntersectionSystemImpl#getDetectorIds <em>Detector Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntersectionSystemImpl extends MinimalEObjectImpl.Container implements IntersectionSystem {
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
	 * The default value of the '{@link #getIntersectionId() <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERSECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntersectionId() <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionId()
	 * @generated
	 * @ordered
	 */
	protected String intersectionId = INTERSECTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTlModuleIds() <em>Tl Module Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlModuleIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tlModuleIds;

	/**
	 * The cached value of the '{@link #getDetectorIds() <em>Detector Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectorIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> detectorIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntersectionSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionSystemPackage.Literals.INTERSECTION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntersectionId() {
		return intersectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntersectionId(String newIntersectionId) {
		String oldIntersectionId = intersectionId;
		intersectionId = newIntersectionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__INTERSECTION_ID, oldIntersectionId, intersectionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTlModuleIds() {
		if (tlModuleIds == null) {
			tlModuleIds = new EDataTypeUniqueEList<String>(String.class, this, TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__TL_MODULE_IDS);
		}
		return tlModuleIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDetectorIds() {
		if (detectorIds == null) {
			detectorIds = new EDataTypeUniqueEList<String>(String.class, this, TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__DETECTOR_IDS);
		}
		return detectorIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__ID:
				return getId();
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__INTERSECTION_ID:
				return getIntersectionId();
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__TL_MODULE_IDS:
				return getTlModuleIds();
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__DETECTOR_IDS:
				return getDetectorIds();
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
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__ID:
				setId((String)newValue);
				return;
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__INTERSECTION_ID:
				setIntersectionId((String)newValue);
				return;
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__TL_MODULE_IDS:
				getTlModuleIds().clear();
				getTlModuleIds().addAll((Collection<? extends String>)newValue);
				return;
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__DETECTOR_IDS:
				getDetectorIds().clear();
				getDetectorIds().addAll((Collection<? extends String>)newValue);
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
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__INTERSECTION_ID:
				setIntersectionId(INTERSECTION_ID_EDEFAULT);
				return;
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__TL_MODULE_IDS:
				getTlModuleIds().clear();
				return;
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__DETECTOR_IDS:
				getDetectorIds().clear();
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
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__INTERSECTION_ID:
				return INTERSECTION_ID_EDEFAULT == null ? intersectionId != null : !INTERSECTION_ID_EDEFAULT.equals(intersectionId);
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__TL_MODULE_IDS:
				return tlModuleIds != null && !tlModuleIds.isEmpty();
			case TOSIntersectionSystemPackage.INTERSECTION_SYSTEM__DETECTOR_IDS:
				return detectorIds != null && !detectorIds.isEmpty();
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
		result.append(", intersectionId: ");
		result.append(intersectionId);
		result.append(", tlModuleIds: ");
		result.append(tlModuleIds);
		result.append(", detectorIds: ");
		result.append(detectorIds);
		result.append(')');
		return result.toString();
	}

} //IntersectionSystemImpl
