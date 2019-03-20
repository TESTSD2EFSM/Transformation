/**
 */
package Sequencediagram.sequencediagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sequencediagram.sequencediagram.Occurence#getOrder <em>Order</em>}</li>
 *   <li>{@link Sequencediagram.sequencediagram.Occurence#getMsg <em>Msg</em>}</li>
 * </ul>
 *
 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOccurence()
 * @model
 * @generated
 */
public interface Occurence extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOccurence_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Occurence#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' reference.
	 * @see #setMsg(Message)
	 * @see Sequencediagram.sequencediagram.SequencediagramPackage#getOccurence_Msg()
	 * @model required="true"
	 * @generated
	 */
	Message getMsg();

	/**
	 * Sets the value of the '{@link Sequencediagram.sequencediagram.Occurence#getMsg <em>Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' reference.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(Message value);

} // Occurence
