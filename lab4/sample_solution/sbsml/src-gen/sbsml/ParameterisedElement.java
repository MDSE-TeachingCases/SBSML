/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterised Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.ParameterisedElement#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getParameterisedElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterisedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getParameterisedElement_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ParameterisedElement
