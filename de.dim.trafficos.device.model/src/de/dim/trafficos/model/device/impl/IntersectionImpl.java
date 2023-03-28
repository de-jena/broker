/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion - initial API and implementation 
 */
package de.dim.trafficos.model.device.impl;

import de.dim.trafficos.model.device.Intersection;
import de.dim.trafficos.model.device.IntersectionStateType;
import de.dim.trafficos.model.device.Link;
import de.dim.trafficos.model.device.Output;
import de.dim.trafficos.model.device.Parameter;
import de.dim.trafficos.model.device.Phase;
import de.dim.trafficos.model.device.PhaseGroup;
import de.dim.trafficos.model.device.Program;
import de.dim.trafficos.model.device.Road;
import de.dim.trafficos.model.device.TOSDevicePackage;
import de.dim.trafficos.model.device.TimeTable;

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
 * An implementation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getRoad <em>Road</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getPhaseGroup <em>Phase Group</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getState <em>State</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dim.trafficos.model.device.impl.IntersectionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntersectionImpl extends AbstractDataEntryImpl implements Intersection {
	/**
	 * The cached value of the '{@link #getRoad() <em>Road</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoad()
	 * @generated
	 * @ordered
	 */
	protected EList<Road> road;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phase;

	/**
	 * The cached value of the '{@link #getPhaseGroup() <em>Phase Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<PhaseGroup> phaseGroup;

	/**
	 * The cached value of the '{@link #getTimeTable() <em>Time Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTable()
	 * @generated
	 * @ordered
	 */
	protected TimeTable timeTable;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> program;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final IntersectionStateType STATE_EDEFAULT = IntersectionStateType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected IntersectionStateType state = STATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSDevicePackage.Literals.INTERSECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Road> getRoad() {
		if (road == null) {
			road = new EObjectContainmentEList<Road>(Road.class, this, TOSDevicePackage.INTERSECTION__ROAD);
		}
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, TOSDevicePackage.INTERSECTION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Phase> getPhase() {
		if (phase == null) {
			phase = new EObjectContainmentEList<Phase>(Phase.class, this, TOSDevicePackage.INTERSECTION__PHASE);
		}
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhaseGroup> getPhaseGroup() {
		if (phaseGroup == null) {
			phaseGroup = new EObjectContainmentEList<PhaseGroup>(PhaseGroup.class, this, TOSDevicePackage.INTERSECTION__PHASE_GROUP);
		}
		return phaseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTable getTimeTable() {
		return timeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTable(TimeTable newTimeTable, NotificationChain msgs) {
		TimeTable oldTimeTable = timeTable;
		timeTable = newTimeTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSDevicePackage.INTERSECTION__TIME_TABLE, oldTimeTable, newTimeTable);
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
	public void setTimeTable(TimeTable newTimeTable) {
		if (newTimeTable != timeTable) {
			NotificationChain msgs = null;
			if (timeTable != null)
				msgs = ((InternalEObject)timeTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.INTERSECTION__TIME_TABLE, null, msgs);
			if (newTimeTable != null)
				msgs = ((InternalEObject)newTimeTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSDevicePackage.INTERSECTION__TIME_TABLE, null, msgs);
			msgs = basicSetTimeTable(newTimeTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.INTERSECTION__TIME_TABLE, newTimeTable, newTimeTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, TOSDevicePackage.INTERSECTION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Program> getProgram() {
		if (program == null) {
			program = new EObjectContainmentEList<Program>(Program.class, this, TOSDevicePackage.INTERSECTION__PROGRAM);
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, TOSDevicePackage.INTERSECTION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntersectionStateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(IntersectionStateType newState) {
		IntersectionStateType oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.INTERSECTION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.INTERSECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSDevicePackage.INTERSECTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSDevicePackage.INTERSECTION__ROAD:
				return ((InternalEList<?>)getRoad()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.INTERSECTION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.INTERSECTION__PHASE:
				return ((InternalEList<?>)getPhase()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.INTERSECTION__PHASE_GROUP:
				return ((InternalEList<?>)getPhaseGroup()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.INTERSECTION__TIME_TABLE:
				return basicSetTimeTable(null, msgs);
			case TOSDevicePackage.INTERSECTION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.INTERSECTION__PROGRAM:
				return ((InternalEList<?>)getProgram()).basicRemove(otherEnd, msgs);
			case TOSDevicePackage.INTERSECTION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case TOSDevicePackage.INTERSECTION__ROAD:
				return getRoad();
			case TOSDevicePackage.INTERSECTION__LINK:
				return getLink();
			case TOSDevicePackage.INTERSECTION__PHASE:
				return getPhase();
			case TOSDevicePackage.INTERSECTION__PHASE_GROUP:
				return getPhaseGroup();
			case TOSDevicePackage.INTERSECTION__TIME_TABLE:
				return getTimeTable();
			case TOSDevicePackage.INTERSECTION__OUTPUT:
				return getOutput();
			case TOSDevicePackage.INTERSECTION__PROGRAM:
				return getProgram();
			case TOSDevicePackage.INTERSECTION__PARAMETER:
				return getParameter();
			case TOSDevicePackage.INTERSECTION__STATE:
				return getState();
			case TOSDevicePackage.INTERSECTION__NAME:
				return getName();
			case TOSDevicePackage.INTERSECTION__DESCRIPTION:
				return getDescription();
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
			case TOSDevicePackage.INTERSECTION__ROAD:
				getRoad().clear();
				getRoad().addAll((Collection<? extends Road>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__PHASE:
				getPhase().clear();
				getPhase().addAll((Collection<? extends Phase>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__PHASE_GROUP:
				getPhaseGroup().clear();
				getPhaseGroup().addAll((Collection<? extends PhaseGroup>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__TIME_TABLE:
				setTimeTable((TimeTable)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__PROGRAM:
				getProgram().clear();
				getProgram().addAll((Collection<? extends Program>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__STATE:
				setState((IntersectionStateType)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__NAME:
				setName((String)newValue);
				return;
			case TOSDevicePackage.INTERSECTION__DESCRIPTION:
				setDescription((String)newValue);
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
			case TOSDevicePackage.INTERSECTION__ROAD:
				getRoad().clear();
				return;
			case TOSDevicePackage.INTERSECTION__LINK:
				getLink().clear();
				return;
			case TOSDevicePackage.INTERSECTION__PHASE:
				getPhase().clear();
				return;
			case TOSDevicePackage.INTERSECTION__PHASE_GROUP:
				getPhaseGroup().clear();
				return;
			case TOSDevicePackage.INTERSECTION__TIME_TABLE:
				setTimeTable((TimeTable)null);
				return;
			case TOSDevicePackage.INTERSECTION__OUTPUT:
				getOutput().clear();
				return;
			case TOSDevicePackage.INTERSECTION__PROGRAM:
				getProgram().clear();
				return;
			case TOSDevicePackage.INTERSECTION__PARAMETER:
				getParameter().clear();
				return;
			case TOSDevicePackage.INTERSECTION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case TOSDevicePackage.INTERSECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TOSDevicePackage.INTERSECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case TOSDevicePackage.INTERSECTION__ROAD:
				return road != null && !road.isEmpty();
			case TOSDevicePackage.INTERSECTION__LINK:
				return link != null && !link.isEmpty();
			case TOSDevicePackage.INTERSECTION__PHASE:
				return phase != null && !phase.isEmpty();
			case TOSDevicePackage.INTERSECTION__PHASE_GROUP:
				return phaseGroup != null && !phaseGroup.isEmpty();
			case TOSDevicePackage.INTERSECTION__TIME_TABLE:
				return timeTable != null;
			case TOSDevicePackage.INTERSECTION__OUTPUT:
				return output != null && !output.isEmpty();
			case TOSDevicePackage.INTERSECTION__PROGRAM:
				return program != null && !program.isEmpty();
			case TOSDevicePackage.INTERSECTION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case TOSDevicePackage.INTERSECTION__STATE:
				return state != STATE_EDEFAULT;
			case TOSDevicePackage.INTERSECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TOSDevicePackage.INTERSECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (state: ");
		result.append(state);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IntersectionImpl
