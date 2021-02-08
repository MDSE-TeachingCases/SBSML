/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Thing#getPorts <em>Ports</em>}</li>
 *   <li>{@link sbsml.Thing#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getThing()
 * @model abstract="true"
 * @generated
 */
public interface Thing extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getThing_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see sbsml.SbsmlPackage#getThing_ShortName()
	 * @model required="true"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link sbsml.Thing#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

} // Thing
