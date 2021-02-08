/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Unit#getType <em>Type</em>}</li>
 *   <li>{@link sbsml.Unit#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getUnit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='abbreviationLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot abbreviationLength='(not self.abbreviation.oclIsUndefined()) implies self.abbreviation.size() &lt; 5'"
 * @generated
 */
public interface Unit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sbsml.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sbsml.DataType
	 * @see #setType(DataType)
	 * @see sbsml.SbsmlPackage#getUnit_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link sbsml.Unit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sbsml.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see sbsml.SbsmlPackage#getUnit_Abbreviation()
	 * @model
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link sbsml.Unit#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

} // Unit
