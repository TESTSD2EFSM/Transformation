/**
 */
package Sequencediagram.sequencediagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Sequencediagram.sequencediagram.SequencediagramFactory
 * @model kind="package"
 * @generated
 */
public interface SequencediagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequencediagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sequencediagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequencediagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencediagramPackage eINSTANCE = Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.SequenceDiagramImpl <em>Sequence Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.SequenceDiagramImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getSequenceDiagram()
	 * @generated
	 */
	int SEQUENCE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Life Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM__LIFE_LINES = 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM__FRAGMENTS = 2;

	/**
	 * The number of structural features of the '<em>Sequence Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sequence Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.LifeLineImpl <em>Life Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.LifeLineImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getLifeLine()
	 * @generated
	 */
	int LIFE_LINE = 1;

	/**
	 * The feature id for the '<em><b>Abstract Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE__ABSTRACT_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE__START = 2;

	/**
	 * The number of structural features of the '<em>Life Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Life Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.AbstractObjectImpl <em>Abstract Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.AbstractObjectImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getAbstractObject()
	 * @generated
	 */
	int ABSTRACT_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.ActorImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ABSTRACT_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ABSTRACT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = ABSTRACT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.ObjectImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = ABSTRACT_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = ABSTRACT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = ABSTRACT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.InteractionFragmentImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getInteractionFragment()
	 * @generated
	 */
	int INTERACTION_FRAGMENT = 8;

	/**
	 * The number of structural features of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.MessageImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TARGET = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SOURCE = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OPERATION = INTERACTION_FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.InteractionOperandImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getInteractionOperand()
	 * @generated
	 */
	int INTERACTION_OPERAND = 6;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GUARD = 0;

	/**
	 * The feature id for the '<em><b>Frag Opds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__FRAG_OPDS = 1;

	/**
	 * The number of structural features of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.CombinedFragmentImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAME = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__INTERACTION_OPERATOR = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERANDS = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.OperationImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGS = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.impl.ParamImpl
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 10;

	/**
	 * The feature id for the '<em><b>Arg Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__ARG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Arg Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__ARG_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.MessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.MessageKind
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 11;

	/**
	 * The meta object id for the '{@link Sequencediagram.sequencediagram.OperatorKind <em>Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sequencediagram.sequencediagram.OperatorKind
	 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getOperatorKind()
	 * @generated
	 */
	int OPERATOR_KIND = 12;


	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.SequenceDiagram <em>Sequence Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Diagram</em>'.
	 * @see Sequencediagram.sequencediagram.SequenceDiagram
	 * @generated
	 */
	EClass getSequenceDiagram();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.SequenceDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Sequencediagram.sequencediagram.SequenceDiagram#getName()
	 * @see #getSequenceDiagram()
	 * @generated
	 */
	EAttribute getSequenceDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Sequencediagram.sequencediagram.SequenceDiagram#getLifeLines <em>Life Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Life Lines</em>'.
	 * @see Sequencediagram.sequencediagram.SequenceDiagram#getLifeLines()
	 * @see #getSequenceDiagram()
	 * @generated
	 */
	EReference getSequenceDiagram_LifeLines();

	/**
	 * Returns the meta object for the containment reference list '{@link Sequencediagram.sequencediagram.SequenceDiagram#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see Sequencediagram.sequencediagram.SequenceDiagram#getFragments()
	 * @see #getSequenceDiagram()
	 * @generated
	 */
	EReference getSequenceDiagram_Fragments();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.LifeLine <em>Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Line</em>'.
	 * @see Sequencediagram.sequencediagram.LifeLine
	 * @generated
	 */
	EClass getLifeLine();

	/**
	 * Returns the meta object for the containment reference '{@link Sequencediagram.sequencediagram.LifeLine#getAbstractObject <em>Abstract Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object</em>'.
	 * @see Sequencediagram.sequencediagram.LifeLine#getAbstractObject()
	 * @see #getLifeLine()
	 * @generated
	 */
	EReference getLifeLine_AbstractObject();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.LifeLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Sequencediagram.sequencediagram.LifeLine#getName()
	 * @see #getLifeLine()
	 * @generated
	 */
	EAttribute getLifeLine_Name();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.LifeLine#isStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see Sequencediagram.sequencediagram.LifeLine#isStart()
	 * @see #getLifeLine()
	 * @generated
	 */
	EAttribute getLifeLine_Start();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.AbstractObject <em>Abstract Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Object</em>'.
	 * @see Sequencediagram.sequencediagram.AbstractObject
	 * @generated
	 */
	EClass getAbstractObject();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.AbstractObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Sequencediagram.sequencediagram.AbstractObject#getName()
	 * @see #getAbstractObject()
	 * @generated
	 */
	EAttribute getAbstractObject_Name();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see Sequencediagram.sequencediagram.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see Sequencediagram.sequencediagram.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see Sequencediagram.sequencediagram.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Sequencediagram.sequencediagram.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Sequencediagram.sequencediagram.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for the reference '{@link Sequencediagram.sequencediagram.Message#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Sequencediagram.sequencediagram.Message#getTarget()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Target();

	/**
	 * Returns the meta object for the reference '{@link Sequencediagram.sequencediagram.Message#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Sequencediagram.sequencediagram.Message#getSource()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Source();

	/**
	 * Returns the meta object for the containment reference '{@link Sequencediagram.sequencediagram.Message#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see Sequencediagram.sequencediagram.Message#getOperation()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Operation();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Operand</em>'.
	 * @see Sequencediagram.sequencediagram.InteractionOperand
	 * @generated
	 */
	EClass getInteractionOperand();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.InteractionOperand#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see Sequencediagram.sequencediagram.InteractionOperand#getGuard()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EAttribute getInteractionOperand_Guard();

	/**
	 * Returns the meta object for the containment reference list '{@link Sequencediagram.sequencediagram.InteractionOperand#getFragOpds <em>Frag Opds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frag Opds</em>'.
	 * @see Sequencediagram.sequencediagram.InteractionOperand#getFragOpds()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_FragOpds();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see Sequencediagram.sequencediagram.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.CombinedFragment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Sequencediagram.sequencediagram.CombinedFragment#getName()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_Name();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Operator</em>'.
	 * @see Sequencediagram.sequencediagram.CombinedFragment#getInteractionOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_InteractionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link Sequencediagram.sequencediagram.CombinedFragment#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see Sequencediagram.sequencediagram.CombinedFragment#getOperands()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Operands();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Fragment</em>'.
	 * @see Sequencediagram.sequencediagram.InteractionFragment
	 * @generated
	 */
	EClass getInteractionFragment();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see Sequencediagram.sequencediagram.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.Operation#getReturnVariable <em>Return Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Variable</em>'.
	 * @see Sequencediagram.sequencediagram.Operation#getReturnVariable()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link Sequencediagram.sequencediagram.Operation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see Sequencediagram.sequencediagram.Operation#getArgs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Args();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see Sequencediagram.sequencediagram.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link Sequencediagram.sequencediagram.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see Sequencediagram.sequencediagram.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.Param#getArgName <em>Arg Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg Name</em>'.
	 * @see Sequencediagram.sequencediagram.Param#getArgName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_ArgName();

	/**
	 * Returns the meta object for the attribute '{@link Sequencediagram.sequencediagram.Param#getArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg Type</em>'.
	 * @see Sequencediagram.sequencediagram.Param#getArgType()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_ArgType();

	/**
	 * Returns the meta object for enum '{@link Sequencediagram.sequencediagram.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see Sequencediagram.sequencediagram.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link Sequencediagram.sequencediagram.OperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Kind</em>'.
	 * @see Sequencediagram.sequencediagram.OperatorKind
	 * @generated
	 */
	EEnum getOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequencediagramFactory getSequencediagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.SequenceDiagramImpl <em>Sequence Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.SequenceDiagramImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getSequenceDiagram()
		 * @generated
		 */
		EClass SEQUENCE_DIAGRAM = eINSTANCE.getSequenceDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_DIAGRAM__NAME = eINSTANCE.getSequenceDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Life Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_DIAGRAM__LIFE_LINES = eINSTANCE.getSequenceDiagram_LifeLines();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_DIAGRAM__FRAGMENTS = eINSTANCE.getSequenceDiagram_Fragments();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.LifeLineImpl <em>Life Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.LifeLineImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getLifeLine()
		 * @generated
		 */
		EClass LIFE_LINE = eINSTANCE.getLifeLine();

		/**
		 * The meta object literal for the '<em><b>Abstract Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_LINE__ABSTRACT_OBJECT = eINSTANCE.getLifeLine_AbstractObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_LINE__NAME = eINSTANCE.getLifeLine_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_LINE__START = eINSTANCE.getLifeLine_Start();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.AbstractObjectImpl <em>Abstract Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.AbstractObjectImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getAbstractObject()
		 * @generated
		 */
		EClass ABSTRACT_OBJECT = eINSTANCE.getAbstractObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_OBJECT__NAME = eINSTANCE.getAbstractObject_Name();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.ActorImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.ObjectImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.MessageImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TARGET = eINSTANCE.getMessage_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SOURCE = eINSTANCE.getMessage_Source();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OPERATION = eINSTANCE.getMessage_Operation();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.InteractionOperandImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getInteractionOperand()
		 * @generated
		 */
		EClass INTERACTION_OPERAND = eINSTANCE.getInteractionOperand();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_OPERAND__GUARD = eINSTANCE.getInteractionOperand_Guard();

		/**
		 * The meta object literal for the '<em><b>Frag Opds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__FRAG_OPDS = eINSTANCE.getInteractionOperand_FragOpds();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.CombinedFragmentImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__NAME = eINSTANCE.getCombinedFragment_Name();

		/**
		 * The meta object literal for the '<em><b>Interaction Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__INTERACTION_OPERATOR = eINSTANCE.getCombinedFragment_InteractionOperator();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__OPERANDS = eINSTANCE.getCombinedFragment_Operands();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.InteractionFragmentImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getInteractionFragment()
		 * @generated
		 */
		EClass INTERACTION_FRAGMENT = eINSTANCE.getInteractionFragment();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.OperationImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Return Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_VARIABLE = eINSTANCE.getOperation_ReturnVariable();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ARGS = eINSTANCE.getOperation_Args();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.impl.ParamImpl
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Arg Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__ARG_NAME = eINSTANCE.getParam_ArgName();

		/**
		 * The meta object literal for the '<em><b>Arg Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__ARG_TYPE = eINSTANCE.getParam_ArgType();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.MessageKind
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link Sequencediagram.sequencediagram.OperatorKind <em>Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sequencediagram.sequencediagram.OperatorKind
		 * @see Sequencediagram.sequencediagram.impl.SequencediagramPackageImpl#getOperatorKind()
		 * @generated
		 */
		EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

	}

} //SequencediagramPackage
