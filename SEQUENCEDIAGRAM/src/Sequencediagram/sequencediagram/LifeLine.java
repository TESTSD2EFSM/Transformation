/**
 */
package Sequencediagram.sequencediagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.LifeLine#getAbstractObject <em>Abstract Object</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.LifeLine#getName <em>Name</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.LifeLine#isStart <em>Start</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getLifeLine()
 * @model
 * @generated
 */
public interface LifeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object</em>' containment reference.
	 * @see #setAbstractObject(AbstractObject)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getLifeLine_AbstractObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractObject getAbstractObject();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.LifeLine#getAbstractObject <em>Abstract Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Object</em>' containment reference.
	 * @see #getAbstractObject()
	 * @generated
	 */
	void setAbstractObject(AbstractObject value);

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
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getLifeLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.LifeLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(boolean)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getLifeLine_Start()
	 * @model default="false"
	 * @generated
	 */
	boolean isStart();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.LifeLine#isStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isStart()
	 * @generated
	 */
	void setStart(boolean value);

} // LifeLine
