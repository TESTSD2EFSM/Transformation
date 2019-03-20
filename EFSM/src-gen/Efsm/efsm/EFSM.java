/**
 */
package Efsm.efsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Efsm.efsm.EFSM#getName <em>Name</em>}</li>
 *   <li>{@link Efsm.efsm.EFSM#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link Efsm.efsm.EFSM#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link Efsm.efsm.EFSM#getStates <em>States</em>}</li>
 *   <li>{@link Efsm.efsm.EFSM#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see Efsm.efsm.EfsmPackage#getEFSM()
 * @model
 * @generated
 */
public interface EFSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Efsm.efsm.EfsmPackage#getEFSM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Efsm.efsm.EFSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link Efsm.efsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see Efsm.efsm.EfsmPackage#getEFSM_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' containment reference.
	 * @see #setInitialstate(InitialState)
	 * @see Efsm.efsm.EfsmPackage#getEFSM_Initialstate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link Efsm.efsm.EFSM#getInitialstate <em>Initialstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' containment reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link Efsm.efsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see Efsm.efsm.EfsmPackage#getEFSM_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link Efsm.efsm.ContextVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see Efsm.efsm.EfsmPackage#getEFSM_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextVariable> getVariables();

} // EFSM
