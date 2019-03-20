/**
 */
package Sequencediagram.sequencediagram.impl;

import Sequencediagram.sequencediagram.InteractionFragment;
import Sequencediagram.sequencediagram.InteractionOperand;
import Sequencediagram.sequencediagram.SequencediagramPackage;

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
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.impl.InteractionOperandImpl#getFragOpds <em>Frag Opds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionOperandImpl extends MinimalEObjectImpl.Container implements InteractionOperand {
	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFragOpds() <em>Frag Opds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragOpds()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragOpds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencediagramPackage.Literals.INTERACTION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencediagramPackage.INTERACTION_OPERAND__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragOpds() {
		if (fragOpds == null) {
			fragOpds = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, SequencediagramPackage.INTERACTION_OPERAND__FRAG_OPDS);
		}
		return fragOpds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencediagramPackage.INTERACTION_OPERAND__FRAG_OPDS:
				return ((InternalEList<?>)getFragOpds()).basicRemove(otherEnd, msgs);
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
			case SequencediagramPackage.INTERACTION_OPERAND__GUARD:
				return getGuard();
			case SequencediagramPackage.INTERACTION_OPERAND__FRAG_OPDS:
				return getFragOpds();
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
			case SequencediagramPackage.INTERACTION_OPERAND__GUARD:
				setGuard((String)newValue);
				return;
			case SequencediagramPackage.INTERACTION_OPERAND__FRAG_OPDS:
				getFragOpds().clear();
				getFragOpds().addAll((Collection<? extends InteractionFragment>)newValue);
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
			case SequencediagramPackage.INTERACTION_OPERAND__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case SequencediagramPackage.INTERACTION_OPERAND__FRAG_OPDS:
				getFragOpds().clear();
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
			case SequencediagramPackage.INTERACTION_OPERAND__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case SequencediagramPackage.INTERACTION_OPERAND__FRAG_OPDS:
				return fragOpds != null && !fragOpds.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}

} //InteractionOperandImpl
