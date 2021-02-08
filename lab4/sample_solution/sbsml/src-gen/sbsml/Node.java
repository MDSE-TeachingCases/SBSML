/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Node#getThing <em>Thing</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='enoughComputationPower'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot enoughComputationPower='self.thing.oclIsTypeOf(FogDevice) implies \n\t\t(self.oclContainer.oclAsType(Configuration).controllers-&gt;select(c|c.computationNode=self)-&gt;collect(c|c.mips)-&gt;sum() &lt;= self.thing.oclAsType(FogDevice).mips) '"
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing</em>' reference.
	 * @see #setThing(Thing)
	 * @see sbsml.SbsmlPackage#getNode_Thing()
	 * @model required="true"
	 * @generated
	 */
	Thing getThing();

	/**
	 * Sets the value of the '{@link sbsml.Node#getThing <em>Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thing</em>' reference.
	 * @see #getThing()
	 * @generated
	 */
	void setThing(Thing value);

} // Node
