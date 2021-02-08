/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Port#isSingleConnection <em>Single Connection</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Single Connection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Connection</em>' attribute.
	 * @see #setSingleConnection(boolean)
	 * @see sbsml.SbsmlPackage#getPort_SingleConnection()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSingleConnection();

	/**
	 * Sets the value of the '{@link sbsml.Port#isSingleConnection <em>Single Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Connection</em>' attribute.
	 * @see #isSingleConnection()
	 * @generated
	 */
	void setSingleConnection(boolean value);

} // Port
