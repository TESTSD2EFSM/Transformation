/**
 */
package Sequencediagram.sequencediagram.impl;

import Sequencediagram.sequencediagram.InteractionFragment;
import Sequencediagram.sequencediagram.LifeLine;
import Sequencediagram.sequencediagram.SequenceDiagram;
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
 * An implementation of the model object '<em><b>Sequence Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.impl.SequenceDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.impl.SequenceDiagramImpl#getLifeLines <em>Life Lines</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.impl.SequenceDiagramImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceDiagramImpl extends MinimalEObjectImpl.Container implements SequenceDiagram {
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
	 * The cached value of the '{@link #getLifeLines() <em>Life Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeLines()
	 * @generated
	 * @ordered
	 */
	protected EList<LifeLine> lifeLines;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencediagramPackage.Literals.SEQUENCE_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SequencediagramPackage.SEQUENCE_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifeLine> getLifeLines() {
		if (lifeLines == null) {
			lifeLines = new EObjectContainmentEList<LifeLine>(LifeLine.class, this, SequencediagramPackage.SEQUENCE_DIAGRAM__LIFE_LINES);
		}
		return lifeLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, SequencediagramPackage.SEQUENCE_DIAGRAM__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencediagramPackage.SEQUENCE_DIAGRAM__LIFE_LINES:
				return ((InternalEList<?>)getLifeLines()).basicRemove(otherEnd, msgs);
			case SequencediagramPackage.SEQUENCE_DIAGRAM__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
			case SequencediagramPackage.SEQUENCE_DIAGRAM__NAME:
				return getName();
			case SequencediagramPackage.SEQUENCE_DIAGRAM__LIFE_LINES:
				return getLifeLines();
			case SequencediagramPackage.SEQUENCE_DIAGRAM__FRAGMENTS:
				return getFragments();
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
			case SequencediagramPackage.SEQUENCE_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case SequencediagramPackage.SEQUENCE_DIAGRAM__LIFE_LINES:
				getLifeLines().clear();
				getLifeLines().addAll((Collection<? extends LifeLine>)newValue);
				return;
			case SequencediagramPackage.SEQUENCE_DIAGRAM__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends InteractionFragment>)newValue);
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
			case SequencediagramPackage.SEQUENCE_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SequencediagramPackage.SEQUENCE_DIAGRAM__LIFE_LINES:
				getLifeLines().clear();
				return;
			case SequencediagramPackage.SEQUENCE_DIAGRAM__FRAGMENTS:
				getFragments().clear();
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
			case SequencediagramPackage.SEQUENCE_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SequencediagramPackage.SEQUENCE_DIAGRAM__LIFE_LINES:
				return lifeLines != null && !lifeLines.isEmpty();
			case SequencediagramPackage.SEQUENCE_DIAGRAM__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SequenceDiagramImpl
