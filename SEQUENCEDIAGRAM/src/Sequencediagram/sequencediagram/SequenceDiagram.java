/**
 */
package Sequencediagram.sequencediagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.SequenceDiagram#getName <em>Name</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.SequenceDiagram#getLifeLines <em>Life Lines</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.SequenceDiagram#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getSequenceDiagram()
 * @model
 * @generated
 */
public interface SequenceDiagram extends EObject {
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
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getSequenceDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.SequenceDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Life Lines</b></em>' containment reference list.
	 * The list contents are of type {@link Sequencediagram.sequencediagram.LifeLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Lines</em>' containment reference list.
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getSequenceDiagram_LifeLines()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LifeLine> getLifeLines();

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link Sequencediagram.sequencediagram.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getSequenceDiagram_Fragments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragments();

} // SequenceDiagram
