/**
 */
package Sequencediagram.sequencediagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.InteractionOperand#getGuard <em>Guard</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.InteractionOperand#getFragOpds <em>Frag Opds</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getInteractionOperand()
 * @model
 * @generated
 */
public interface InteractionOperand extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getInteractionOperand_Guard()
	 * @model required="true"
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.InteractionOperand#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Frag Opds</b></em>' containment reference list.
	 * The list contents are of type {@link Sequencediagram.sequencediagram.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frag Opds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frag Opds</em>' containment reference list.
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getInteractionOperand_FragOpds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragOpds();

} // InteractionOperand
