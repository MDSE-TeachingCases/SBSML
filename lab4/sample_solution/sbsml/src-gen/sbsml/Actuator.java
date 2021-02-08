/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Actuator#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Thing {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getActuator_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

} // Actuator
