/**
 */
package Sequencediagram.sequencediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.Operation#getReturnVariable <em>Return Variable</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Operation#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Return Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Variable</em>' attribute.
	 * @see #setReturnVariable(String)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOperation_ReturnVariable()
	 * @model
	 * @generated
	 */
	String getReturnVariable();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Operation#getReturnVariable <em>Return Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Variable</em>' attribute.
	 * @see #getReturnVariable()
	 * @generated
	 */
	void setReturnVariable(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link Sequencediagram.sequencediagram.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOperation_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getArgs();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOperation_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Operation#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

} // Operation
