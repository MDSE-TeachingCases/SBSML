/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fog Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.FogDevice#getMips <em>Mips</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getFogDevice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveMips'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot positiveMips='self.mips &gt; 0'"
 * @generated
 */
public interface FogDevice extends Thing {
	/**
	 * Returns the value of the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mips</em>' attribute.
	 * @see #setMips(long)
	 * @see sbsml.SbsmlPackage#getFogDevice_Mips()
	 * @model required="true"
	 * @generated
	 */
	long getMips();

	/**
	 * Sets the value of the '{@link sbsml.FogDevice#getMips <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips</em>' attribute.
	 * @see #getMips()
	 * @generated
	 */
	void setMips(long value);

} // FogDevice
