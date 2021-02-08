/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.ServiceCall#getService <em>Service</em>}</li>
 *   <li>{@link sbsml.ServiceCall#getNode <em>Node</em>}</li>
 *   <li>{@link sbsml.ServiceCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getServiceCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nodeIsActuator serviceIsExposedByActuator correctNumberArguments'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nodeIsActuator='self.node.thing.oclIsTypeOf(Actuator)' serviceIsExposedByActuator='self.node.thing.oclAsType(Actuator).services-&gt;exists(s|s=self.service)' correctNumberArguments='self.arguments-&gt;size() = service.parameters-&gt;size()'"
 * @generated
 */
public interface ServiceCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see sbsml.SbsmlPackage#getServiceCall_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link sbsml.ServiceCall#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see sbsml.SbsmlPackage#getServiceCall_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link sbsml.ServiceCall#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getServiceCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // ServiceCall
