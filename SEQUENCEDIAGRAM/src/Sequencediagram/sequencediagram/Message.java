/**
 */
package Sequencediagram.sequencediagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.Message#getName <em>Name</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Message#getType <em>Type</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Message#getTarget <em>Target</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Message#getSource <em>Source</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Message#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends InteractionFragment {
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
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"op"</code>.
	 * The literals are from the enumeration {@link Sequencediagram.sequencediagram.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Sequencediagram.sequencediagram.MessageKind
	 * @see #setType(MessageKind)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getMessage_Type()
	 * @model default="op" required="true"
	 * @generated
	 */
	MessageKind getType();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Message#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Sequencediagram.sequencediagram.MessageKind
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageKind value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LifeLine)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getMessage_Target()
	 * @model required="true"
	 * @generated
	 */
	LifeLine getTarget();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Message#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LifeLine value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LifeLine)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getMessage_Source()
	 * @model required="true"
	 * @generated
	 */
	LifeLine getSource();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Message#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LifeLine value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getMessage_Operation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Message#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Message
