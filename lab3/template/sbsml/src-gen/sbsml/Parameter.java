/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Parameter#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see sbsml.SbsmlPackage#getParameter_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link sbsml.Parameter#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Parameter
