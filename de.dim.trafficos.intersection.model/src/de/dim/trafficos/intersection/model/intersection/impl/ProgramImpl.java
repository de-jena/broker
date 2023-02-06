/**
 */
package de.dim.trafficos.intersection.model.intersection.impl;

import de.dim.trafficos.common.model.common.impl.IdNameElementImpl;

import de.dim.trafficos.intersection.model.intersection.Program;
import de.dim.trafficos.intersection.model.intersection.ProgramEntry;
import de.dim.trafficos.intersection.model.intersection.SignalTable;
import de.dim.trafficos.intersection.model.intersection.TOSIntersectionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ProgramImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ProgramImpl#getOutputEntry <em>Output Entry</em>}</li>
 *   <li>{@link de.dim.trafficos.intersection.model.intersection.impl.ProgramImpl#getSignalTable <em>Signal Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends IdNameElementImpl implements Program {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputEntry() <em>Output Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramEntry> outputEntry;

	/**
	 * The cached value of the '{@link #getSignalTable() <em>Signal Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalTable()
	 * @generated
	 * @ordered
	 */
	protected SignalTable signalTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSIntersectionPackage.eINSTANCE.getProgram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PROGRAM__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramEntry> getOutputEntry() {
		if (outputEntry == null) {
			outputEntry = new EObjectContainmentEList<ProgramEntry>(ProgramEntry.class, this, TOSIntersectionPackage.PROGRAM__OUTPUT_ENTRY);
		}
		return outputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignalTable getSignalTable() {
		return signalTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalTable(SignalTable newSignalTable, NotificationChain msgs) {
		SignalTable oldSignalTable = signalTable;
		signalTable = newSignalTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE, oldSignalTable, newSignalTable);
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
	public void setSignalTable(SignalTable newSignalTable) {
		if (newSignalTable != signalTable) {
			NotificationChain msgs = null;
			if (signalTable != null)
				msgs = ((InternalEObject)signalTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE, null, msgs);
			if (newSignalTable != null)
				msgs = ((InternalEObject)newSignalTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE, null, msgs);
			msgs = basicSetSignalTable(newSignalTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE, newSignalTable, newSignalTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSIntersectionPackage.PROGRAM__OUTPUT_ENTRY:
				return ((InternalEList<?>)getOutputEntry()).basicRemove(otherEnd, msgs);
			case TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE:
				return basicSetSignalTable(null, msgs);
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
			case TOSIntersectionPackage.PROGRAM__LENGTH:
				return getLength();
			case TOSIntersectionPackage.PROGRAM__OUTPUT_ENTRY:
				return getOutputEntry();
			case TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE:
				return getSignalTable();
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
			case TOSIntersectionPackage.PROGRAM__LENGTH:
				setLength((Integer)newValue);
				return;
			case TOSIntersectionPackage.PROGRAM__OUTPUT_ENTRY:
				getOutputEntry().clear();
				getOutputEntry().addAll((Collection<? extends ProgramEntry>)newValue);
				return;
			case TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE:
				setSignalTable((SignalTable)newValue);
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
			case TOSIntersectionPackage.PROGRAM__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case TOSIntersectionPackage.PROGRAM__OUTPUT_ENTRY:
				getOutputEntry().clear();
				return;
			case TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE:
				setSignalTable((SignalTable)null);
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
			case TOSIntersectionPackage.PROGRAM__LENGTH:
				return length != LENGTH_EDEFAULT;
			case TOSIntersectionPackage.PROGRAM__OUTPUT_ENTRY:
				return outputEntry != null && !outputEntry.isEmpty();
			case TOSIntersectionPackage.PROGRAM__SIGNAL_TABLE:
				return signalTable != null;
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
		result.append(" (length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
