/**
 */
package Sequencediagram.sequencediagram.impl;

import Sequencediagram.sequencediagram.AbstractObject;
import Sequencediagram.sequencediagram.LifeLine;
import Sequencediagram.sequencediagram.SequencediagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.impl.LifeLineImpl#getAbstractObject <em>Abstract Object</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.impl.LifeLineImpl#getName <em>Name</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.impl.LifeLineImpl#isStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeLineImpl extends MinimalEObjectImpl.Container implements LifeLine {
	/**
	 * The cached value of the '{@link #getAbstractObject() <em>Abstract Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractObject()
	 * @generated
	 * @ordered
	 */
	protected AbstractObject abstractObject;

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
	 * The default value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected boolean start = START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencediagramPackage.Literals.LIFE_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObject getAbstractObject() {
		return abstractObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObject(AbstractObject newAbstractObject, NotificationChain msgs) {
		AbstractObject oldAbstractObject = abstractObject;
		abstractObject = newAbstractObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT, oldAbstractObject, newAbstractObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractObject(AbstractObject newAbstractObject) {
		if (newAbstractObject != abstractObject) {
			NotificationChain msgs = null;
			if (abstractObject != null)
				msgs = ((InternalEObject)abstractObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT, null, msgs);
			if (newAbstractObject != null)
				msgs = ((InternalEObject)newAbstractObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT, null, msgs);
			msgs = basicSetAbstractObject(newAbstractObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT, newAbstractObject, newAbstractObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SequencediagramPackage.LIFE_LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(boolean newStart) {
		boolean oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencediagramPackage.LIFE_LINE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT:
				return basicSetAbstractObject(null, msgs);
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
			case SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT:
				return getAbstractObject();
			case SequencediagramPackage.LIFE_LINE__NAME:
				return getName();
			case SequencediagramPackage.LIFE_LINE__START:
				return isStart();
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
			case SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT:
				setAbstractObject((AbstractObject)newValue);
				return;
			case SequencediagramPackage.LIFE_LINE__NAME:
				setName((String)newValue);
				return;
			case SequencediagramPackage.LIFE_LINE__START:
				setStart((Boolean)newValue);
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
			case SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT:
				setAbstractObject((AbstractObject)null);
				return;
			case SequencediagramPackage.LIFE_LINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SequencediagramPackage.LIFE_LINE__START:
				setStart(START_EDEFAULT);
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
			case SequencediagramPackage.LIFE_LINE__ABSTRACT_OBJECT:
				return abstractObject != null;
			case SequencediagramPackage.LIFE_LINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SequencediagramPackage.LIFE_LINE__START:
				return start != START_EDEFAULT;
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
		result.append(", start: ");
		result.append(start);
		result.append(')');
		return result.toString();
	}

} //LifeLineImpl
