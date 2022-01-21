/**
 */
package de.jena.sensinact.ocpp.chargepoint.impl;

import de.jena.sensinact.ocpp.chargepoint.ChargingProfile;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfileKindType;
import de.jena.sensinact.ocpp.chargepoint.ChargingProfilePurposeType;
import de.jena.sensinact.ocpp.chargepoint.ChargingSchedule;
import de.jena.sensinact.ocpp.chargepoint.OcppChargePointPackage;
import de.jena.sensinact.ocpp.chargepoint.RecurrencyKindType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charging Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getChargingProfileId <em>Charging Profile Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getStackLevel <em>Stack Level</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getChargingProfilePurpose <em>Charging Profile Purpose</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getChargingProfileKind <em>Charging Profile Kind</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getRecurrencyKind <em>Recurrency Kind</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link de.jena.sensinact.ocpp.chargepoint.impl.ChargingProfileImpl#getChargingSchedule <em>Charging Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargingProfileImpl extends MinimalEObjectImpl.Container implements ChargingProfile {
	/**
	 * The default value of the '{@link #getChargingProfileId() <em>Charging Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfileId()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARGING_PROFILE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChargingProfileId() <em>Charging Profile Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfileId()
	 * @generated
	 * @ordered
	 */
	protected int chargingProfileId = CHARGING_PROFILE_ID_EDEFAULT;

	/**
	 * This is true if the Charging Profile Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargingProfileIdESet;

	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected int transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * This is true if the Transaction Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionIdESet;

	/**
	 * The default value of the '{@link #getStackLevel() <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int STACK_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStackLevel() <em>Stack Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackLevel()
	 * @generated
	 * @ordered
	 */
	protected int stackLevel = STACK_LEVEL_EDEFAULT;

	/**
	 * This is true if the Stack Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stackLevelESet;

	/**
	 * The default value of the '{@link #getChargingProfilePurpose() <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfilePurpose()
	 * @generated
	 * @ordered
	 */
	protected static final ChargingProfilePurposeType CHARGING_PROFILE_PURPOSE_EDEFAULT = ChargingProfilePurposeType.CHARGE_POINT_MAX_PROFILE;

	/**
	 * The cached value of the '{@link #getChargingProfilePurpose() <em>Charging Profile Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfilePurpose()
	 * @generated
	 * @ordered
	 */
	protected ChargingProfilePurposeType chargingProfilePurpose = CHARGING_PROFILE_PURPOSE_EDEFAULT;

	/**
	 * This is true if the Charging Profile Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargingProfilePurposeESet;

	/**
	 * The default value of the '{@link #getChargingProfileKind() <em>Charging Profile Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfileKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChargingProfileKindType CHARGING_PROFILE_KIND_EDEFAULT = ChargingProfileKindType.ABSOLUTE;

	/**
	 * The cached value of the '{@link #getChargingProfileKind() <em>Charging Profile Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingProfileKind()
	 * @generated
	 * @ordered
	 */
	protected ChargingProfileKindType chargingProfileKind = CHARGING_PROFILE_KIND_EDEFAULT;

	/**
	 * This is true if the Charging Profile Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargingProfileKindESet;

	/**
	 * The default value of the '{@link #getRecurrencyKind() <em>Recurrency Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencyKind()
	 * @generated
	 * @ordered
	 */
	protected static final RecurrencyKindType RECURRENCY_KIND_EDEFAULT = RecurrencyKindType.DAILY;

	/**
	 * The cached value of the '{@link #getRecurrencyKind() <em>Recurrency Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencyKind()
	 * @generated
	 * @ordered
	 */
	protected RecurrencyKindType recurrencyKind = RECURRENCY_KIND_EDEFAULT;

	/**
	 * This is true if the Recurrency Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recurrencyKindESet;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidTo() <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VALID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar validTo = VALID_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChargingSchedule() <em>Charging Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingSchedule()
	 * @generated
	 * @ordered
	 */
	protected ChargingSchedule chargingSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargingProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcppChargePointPackage.Literals.CHARGING_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChargingProfileId() {
		return chargingProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingProfileId(int newChargingProfileId) {
		int oldChargingProfileId = chargingProfileId;
		chargingProfileId = newChargingProfileId;
		boolean oldChargingProfileIdESet = chargingProfileIdESet;
		chargingProfileIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_ID, oldChargingProfileId, chargingProfileId, !oldChargingProfileIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChargingProfileId() {
		int oldChargingProfileId = chargingProfileId;
		boolean oldChargingProfileIdESet = chargingProfileIdESet;
		chargingProfileId = CHARGING_PROFILE_ID_EDEFAULT;
		chargingProfileIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_ID, oldChargingProfileId, CHARGING_PROFILE_ID_EDEFAULT, oldChargingProfileIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChargingProfileId() {
		return chargingProfileIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(int newTransactionId) {
		int oldTransactionId = transactionId;
		transactionId = newTransactionId;
		boolean oldTransactionIdESet = transactionIdESet;
		transactionIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__TRANSACTION_ID, oldTransactionId, transactionId, !oldTransactionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTransactionId() {
		int oldTransactionId = transactionId;
		boolean oldTransactionIdESet = transactionIdESet;
		transactionId = TRANSACTION_ID_EDEFAULT;
		transactionIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_PROFILE__TRANSACTION_ID, oldTransactionId, TRANSACTION_ID_EDEFAULT, oldTransactionIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTransactionId() {
		return transactionIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStackLevel() {
		return stackLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackLevel(int newStackLevel) {
		int oldStackLevel = stackLevel;
		stackLevel = newStackLevel;
		boolean oldStackLevelESet = stackLevelESet;
		stackLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__STACK_LEVEL, oldStackLevel, stackLevel, !oldStackLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStackLevel() {
		int oldStackLevel = stackLevel;
		boolean oldStackLevelESet = stackLevelESet;
		stackLevel = STACK_LEVEL_EDEFAULT;
		stackLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_PROFILE__STACK_LEVEL, oldStackLevel, STACK_LEVEL_EDEFAULT, oldStackLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStackLevel() {
		return stackLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingProfilePurposeType getChargingProfilePurpose() {
		return chargingProfilePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingProfilePurpose(ChargingProfilePurposeType newChargingProfilePurpose) {
		ChargingProfilePurposeType oldChargingProfilePurpose = chargingProfilePurpose;
		chargingProfilePurpose = newChargingProfilePurpose == null ? CHARGING_PROFILE_PURPOSE_EDEFAULT : newChargingProfilePurpose;
		boolean oldChargingProfilePurposeESet = chargingProfilePurposeESet;
		chargingProfilePurposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE, oldChargingProfilePurpose, chargingProfilePurpose, !oldChargingProfilePurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChargingProfilePurpose() {
		ChargingProfilePurposeType oldChargingProfilePurpose = chargingProfilePurpose;
		boolean oldChargingProfilePurposeESet = chargingProfilePurposeESet;
		chargingProfilePurpose = CHARGING_PROFILE_PURPOSE_EDEFAULT;
		chargingProfilePurposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE, oldChargingProfilePurpose, CHARGING_PROFILE_PURPOSE_EDEFAULT, oldChargingProfilePurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChargingProfilePurpose() {
		return chargingProfilePurposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingProfileKindType getChargingProfileKind() {
		return chargingProfileKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingProfileKind(ChargingProfileKindType newChargingProfileKind) {
		ChargingProfileKindType oldChargingProfileKind = chargingProfileKind;
		chargingProfileKind = newChargingProfileKind == null ? CHARGING_PROFILE_KIND_EDEFAULT : newChargingProfileKind;
		boolean oldChargingProfileKindESet = chargingProfileKindESet;
		chargingProfileKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_KIND, oldChargingProfileKind, chargingProfileKind, !oldChargingProfileKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChargingProfileKind() {
		ChargingProfileKindType oldChargingProfileKind = chargingProfileKind;
		boolean oldChargingProfileKindESet = chargingProfileKindESet;
		chargingProfileKind = CHARGING_PROFILE_KIND_EDEFAULT;
		chargingProfileKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_KIND, oldChargingProfileKind, CHARGING_PROFILE_KIND_EDEFAULT, oldChargingProfileKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChargingProfileKind() {
		return chargingProfileKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrencyKindType getRecurrencyKind() {
		return recurrencyKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrencyKind(RecurrencyKindType newRecurrencyKind) {
		RecurrencyKindType oldRecurrencyKind = recurrencyKind;
		recurrencyKind = newRecurrencyKind == null ? RECURRENCY_KIND_EDEFAULT : newRecurrencyKind;
		boolean oldRecurrencyKindESet = recurrencyKindESet;
		recurrencyKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__RECURRENCY_KIND, oldRecurrencyKind, recurrencyKind, !oldRecurrencyKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRecurrencyKind() {
		RecurrencyKindType oldRecurrencyKind = recurrencyKind;
		boolean oldRecurrencyKindESet = recurrencyKindESet;
		recurrencyKind = RECURRENCY_KIND_EDEFAULT;
		recurrencyKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OcppChargePointPackage.CHARGING_PROFILE__RECURRENCY_KIND, oldRecurrencyKind, RECURRENCY_KIND_EDEFAULT, oldRecurrencyKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRecurrencyKind() {
		return recurrencyKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFrom(XMLGregorianCalendar newValidFrom) {
		XMLGregorianCalendar oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidTo(XMLGregorianCalendar newValidTo) {
		XMLGregorianCalendar oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__VALID_TO, oldValidTo, validTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargingSchedule getChargingSchedule() {
		return chargingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargingSchedule(ChargingSchedule newChargingSchedule, NotificationChain msgs) {
		ChargingSchedule oldChargingSchedule = chargingSchedule;
		chargingSchedule = newChargingSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE, oldChargingSchedule, newChargingSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingSchedule(ChargingSchedule newChargingSchedule) {
		if (newChargingSchedule != chargingSchedule) {
			NotificationChain msgs = null;
			if (chargingSchedule != null)
				msgs = ((InternalEObject)chargingSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE, null, msgs);
			if (newChargingSchedule != null)
				msgs = ((InternalEObject)newChargingSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE, null, msgs);
			msgs = basicSetChargingSchedule(newChargingSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE, newChargingSchedule, newChargingSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE:
				return basicSetChargingSchedule(null, msgs);
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
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_ID:
				return getChargingProfileId();
			case OcppChargePointPackage.CHARGING_PROFILE__TRANSACTION_ID:
				return getTransactionId();
			case OcppChargePointPackage.CHARGING_PROFILE__STACK_LEVEL:
				return getStackLevel();
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE:
				return getChargingProfilePurpose();
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_KIND:
				return getChargingProfileKind();
			case OcppChargePointPackage.CHARGING_PROFILE__RECURRENCY_KIND:
				return getRecurrencyKind();
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_FROM:
				return getValidFrom();
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_TO:
				return getValidTo();
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE:
				return getChargingSchedule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_ID:
				setChargingProfileId((Integer)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__TRANSACTION_ID:
				setTransactionId((Integer)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__STACK_LEVEL:
				setStackLevel((Integer)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE:
				setChargingProfilePurpose((ChargingProfilePurposeType)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_KIND:
				setChargingProfileKind((ChargingProfileKindType)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__RECURRENCY_KIND:
				setRecurrencyKind((RecurrencyKindType)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_FROM:
				setValidFrom((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_TO:
				setValidTo((XMLGregorianCalendar)newValue);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE:
				setChargingSchedule((ChargingSchedule)newValue);
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
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_ID:
				unsetChargingProfileId();
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__TRANSACTION_ID:
				unsetTransactionId();
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__STACK_LEVEL:
				unsetStackLevel();
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE:
				unsetChargingProfilePurpose();
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_KIND:
				unsetChargingProfileKind();
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__RECURRENCY_KIND:
				unsetRecurrencyKind();
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_TO:
				setValidTo(VALID_TO_EDEFAULT);
				return;
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE:
				setChargingSchedule((ChargingSchedule)null);
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
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_ID:
				return isSetChargingProfileId();
			case OcppChargePointPackage.CHARGING_PROFILE__TRANSACTION_ID:
				return isSetTransactionId();
			case OcppChargePointPackage.CHARGING_PROFILE__STACK_LEVEL:
				return isSetStackLevel();
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_PURPOSE:
				return isSetChargingProfilePurpose();
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_PROFILE_KIND:
				return isSetChargingProfileKind();
			case OcppChargePointPackage.CHARGING_PROFILE__RECURRENCY_KIND:
				return isSetRecurrencyKind();
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
			case OcppChargePointPackage.CHARGING_PROFILE__VALID_TO:
				return VALID_TO_EDEFAULT == null ? validTo != null : !VALID_TO_EDEFAULT.equals(validTo);
			case OcppChargePointPackage.CHARGING_PROFILE__CHARGING_SCHEDULE:
				return chargingSchedule != null;
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
		result.append(" (chargingProfileId: ");
		if (chargingProfileIdESet) result.append(chargingProfileId); else result.append("<unset>");
		result.append(", transactionId: ");
		if (transactionIdESet) result.append(transactionId); else result.append("<unset>");
		result.append(", stackLevel: ");
		if (stackLevelESet) result.append(stackLevel); else result.append("<unset>");
		result.append(", chargingProfilePurpose: ");
		if (chargingProfilePurposeESet) result.append(chargingProfilePurpose); else result.append("<unset>");
		result.append(", chargingProfileKind: ");
		if (chargingProfileKindESet) result.append(chargingProfileKind); else result.append("<unset>");
		result.append(", recurrencyKind: ");
		if (recurrencyKindESet) result.append(recurrencyKind); else result.append("<unset>");
		result.append(", validFrom: ");
		result.append(validFrom);
		result.append(", validTo: ");
		result.append(validTo);
		result.append(')');
		return result.toString();
	}

} //ChargingProfileImpl
