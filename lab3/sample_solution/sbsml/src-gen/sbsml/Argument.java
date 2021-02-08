/**
 */
package sbsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Argument#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see sbsml.SbsmlPackage#getArgument_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link sbsml.Argument#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

} // Argument
