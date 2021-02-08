/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Controller#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link sbsml.Controller#getServicecalls <em>Servicecalls</em>}</li>
 *   <li>{@link sbsml.Controller#getMips <em>Mips</em>}</li>
 *   <li>{@link sbsml.Controller#getComputationNode <em>Computation Node</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='computationNodeIsFogDevice positiveMips'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot computationNodeIsFogDevice='self.computationNode.thing.oclIsTypeOf(FogDevice)' positiveMips='self.mips &gt; 0'"
 * @generated
 */
public interface Controller extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Threshold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getController_Threshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threshold> getThreshold();

	/**
	 * Returns the value of the '<em><b>Servicecalls</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.ServiceCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecalls</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getController_Servicecalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceCall> getServicecalls();

	/**
	 * Returns the value of the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mips</em>' attribute.
	 * @see #setMips(long)
	 * @see sbsml.SbsmlPackage#getController_Mips()
	 * @model required="true"
	 * @generated
	 */
	long getMips();

	/**
	 * Sets the value of the '{@link sbsml.Controller#getMips <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips</em>' attribute.
	 * @see #getMips()
	 * @generated
	 */
	void setMips(long value);

	/**
	 * Returns the value of the '<em><b>Computation Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computation Node</em>' reference.
	 * @see #setComputationNode(Node)
	 * @see sbsml.SbsmlPackage#getController_ComputationNode()
	 * @model required="true"
	 * @generated
	 */
	Node getComputationNode();

	/**
	 * Sets the value of the '{@link sbsml.Controller#getComputationNode <em>Computation Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computation Node</em>' reference.
	 * @see #getComputationNode()
	 * @generated
	 */
	void setComputationNode(Node value);

} // Controller
