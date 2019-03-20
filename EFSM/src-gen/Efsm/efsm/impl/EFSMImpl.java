/**
 */
package Efsm.efsm.impl;

import Efsm.efsm.ContextVariable;
import Efsm.efsm.EFSM;
import Efsm.efsm.EfsmPackage;
import Efsm.efsm.InitialState;
import Efsm.efsm.State;
import Efsm.efsm.Transition;

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
 * An implementation of the model object '<em><b>EFSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Efsm.efsm.impl.EFSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link Efsm.efsm.impl.EFSMImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link Efsm.efsm.impl.EFSMImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link Efsm.efsm.impl.EFSMImpl#getStates <em>States</em>}</li>
 *   <li>{@link Efsm.efsm.impl.EFSMImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFSMImpl extends MinimalEObjectImpl.Container implements EFSM {
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
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialstate;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextVariable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EfsmPackage.Literals.EFSM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EfsmPackage.EFSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					EfsmPackage.EFSM__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialstate(InitialState newInitialstate, NotificationChain msgs) {
		InitialState oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EfsmPackage.EFSM__INITIALSTATE, oldInitialstate, newInitialstate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstate(InitialState newInitialstate) {
		if (newInitialstate != initialstate) {
			NotificationChain msgs = null;
			if (initialstate != null)
				msgs = ((InternalEObject) initialstate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EfsmPackage.EFSM__INITIALSTATE, null, msgs);
			if (newInitialstate != null)
				msgs = ((InternalEObject) newInitialstate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EfsmPackage.EFSM__INITIALSTATE, null, msgs);
			msgs = basicSetInitialstate(newInitialstate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EfsmPackage.EFSM__INITIALSTATE, newInitialstate,
					newInitialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, EfsmPackage.EFSM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<ContextVariable>(ContextVariable.class, this,
					EfsmPackage.EFSM__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EfsmPackage.EFSM__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case EfsmPackage.EFSM__INITIALSTATE:
			return basicSetInitialstate(null, msgs);
		case EfsmPackage.EFSM__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case EfsmPackage.EFSM__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
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
		case EfsmPackage.EFSM__NAME:
			return getName();
		case EfsmPackage.EFSM__TRANSITIONS:
			return getTransitions();
		case EfsmPackage.EFSM__INITIALSTATE:
			return getInitialstate();
		case EfsmPackage.EFSM__STATES:
			return getStates();
		case EfsmPackage.EFSM__VARIABLES:
			return getVariables();
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
		case EfsmPackage.EFSM__NAME:
			setName((String) newValue);
			return;
		case EfsmPackage.EFSM__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case EfsmPackage.EFSM__INITIALSTATE:
			setInitialstate((InitialState) newValue);
			return;
		case EfsmPackage.EFSM__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case EfsmPackage.EFSM__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends ContextVariable>) newValue);
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
		case EfsmPackage.EFSM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EfsmPackage.EFSM__TRANSITIONS:
			getTransitions().clear();
			return;
		case EfsmPackage.EFSM__INITIALSTATE:
			setInitialstate((InitialState) null);
			return;
		case EfsmPackage.EFSM__STATES:
			getStates().clear();
			return;
		case EfsmPackage.EFSM__VARIABLES:
			getVariables().clear();
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
		case EfsmPackage.EFSM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EfsmPackage.EFSM__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case EfsmPackage.EFSM__INITIALSTATE:
			return initialstate != null;
		case EfsmPackage.EFSM__STATES:
			return states != null && !states.isEmpty();
		case EfsmPackage.EFSM__VARIABLES:
			return variables != null && !variables.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EFSMImpl
