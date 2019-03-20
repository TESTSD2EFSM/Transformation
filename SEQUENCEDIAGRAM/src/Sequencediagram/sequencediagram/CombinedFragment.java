/**
 */
package Sequencediagram.sequencediagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.CombinedFragment#getName <em>Name</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.CombinedFragment#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends InteractionFragment {
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
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getCombinedFragment_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.CombinedFragment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The default value is <code>"opt"</code>.
	 * The literals are from the enumeration {@link Sequencediagram.sequencediagram.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see Sequencediagram.sequencediagram.OperatorKind
	 * @see #setInteractionOperator(OperatorKind)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getCombinedFragment_InteractionOperator()
	 * @model default="opt" required="true"
	 * @generated
	 */
	OperatorKind getInteractionOperator();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see Sequencediagram.sequencediagram.OperatorKind
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(OperatorKind value);

	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link Sequencediagram.sequencediagram.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getCombinedFragment_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionOperand> getOperands();

} // CombinedFragment
