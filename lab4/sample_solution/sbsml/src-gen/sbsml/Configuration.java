/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Configuration#getNodes <em>Nodes</em>}</li>
 *   <li>{@link sbsml.Configuration#getConnections <em>Connections</em>}</li>
 *   <li>{@link sbsml.Configuration#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='connectionNodesAreInSameConfiguration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot connectionNodesAreInSameConfiguration='self.connections-&gt;forAll(c|self.nodes-&gt;exists(n|n=c.nodeA) and self.nodes-&gt;exists(n|n=c.nodeB))'"
 * @generated
 */
public interface Configuration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getConfiguration_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getConfiguration_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getConfiguration_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

} // Configuration
