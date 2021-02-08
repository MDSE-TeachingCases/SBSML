/**
 */
package sbsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Connection#getPortB <em>Port B</em>}</li>
 *   <li>{@link sbsml.Connection#getPortA <em>Port A</em>}</li>
 *   <li>{@link sbsml.Connection#getNodeA <em>Node A</em>}</li>
 *   <li>{@link sbsml.Connection#getNodeB <em>Node B</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentNodes portsArePartOfRefThing singleConnectionPortIsConnectedOnlyOnceOnNode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentNodes='self.nodeA &lt;&gt; self.nodeB' portsArePartOfRefThing='self.nodeA.thing.ports-&gt;exists(p|p = self.portA) and self.nodeB.thing.ports-&gt;exists(p|p = self.portB)' singleConnectionPortIsConnectedOnlyOnceOnNode='(self.portA.singleConnection implies (self.oclContainer.oclAsType(Configuration).connections-&gt;select(c|(c.nodeA=self.nodeA and c.portA=self.portA) or c.nodeB=self.nodeA and c.portB=self.portA)-&gt;size() = 1))\n\t\t\tand (self.portB.singleConnection implies (self.oclContainer.oclAsType(Configuration).connections-&gt;select(c|(c.nodeA=self.nodeB and c.portA=self.portB) or c.nodeB=self.nodeB and c.portB=self.portB)-&gt;size() = 1 ))'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Port B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port B</em>' reference.
	 * @see #setPortB(Port)
	 * @see sbsml.SbsmlPackage#getConnection_PortB()
	 * @model required="true"
	 * @generated
	 */
	Port getPortB();

	/**
	 * Sets the value of the '{@link sbsml.Connection#getPortB <em>Port B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port B</em>' reference.
	 * @see #getPortB()
	 * @generated
	 */
	void setPortB(Port value);

	/**
	 * Returns the value of the '<em><b>Port A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port A</em>' reference.
	 * @see #setPortA(Port)
	 * @see sbsml.SbsmlPackage#getConnection_PortA()
	 * @model required="true"
	 * @generated
	 */
	Port getPortA();

	/**
	 * Sets the value of the '{@link sbsml.Connection#getPortA <em>Port A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port A</em>' reference.
	 * @see #getPortA()
	 * @generated
	 */
	void setPortA(Port value);

	/**
	 * Returns the value of the '<em><b>Node A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node A</em>' reference.
	 * @see #setNodeA(Node)
	 * @see sbsml.SbsmlPackage#getConnection_NodeA()
	 * @model required="true"
	 * @generated
	 */
	Node getNodeA();

	/**
	 * Sets the value of the '{@link sbsml.Connection#getNodeA <em>Node A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node A</em>' reference.
	 * @see #getNodeA()
	 * @generated
	 */
	void setNodeA(Node value);

	/**
	 * Returns the value of the '<em><b>Node B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node B</em>' reference.
	 * @see #setNodeB(Node)
	 * @see sbsml.SbsmlPackage#getConnection_NodeB()
	 * @model required="true"
	 * @generated
	 */
	Node getNodeB();

	/**
	 * Sets the value of the '{@link sbsml.Connection#getNodeB <em>Node B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node B</em>' reference.
	 * @see #getNodeB()
	 * @generated
	 */
	void setNodeB(Node value);

} // Connection
