/**
 */
package sbsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.SmartSystem#getThings <em>Things</em>}</li>
 *   <li>{@link sbsml.SmartSystem#getUnits <em>Units</em>}</li>
 *   <li>{@link sbsml.SmartSystem#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getSmartSystem()
 * @model
 * @generated
 */
public interface SmartSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Things</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Thing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Things</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getSmartSystem_Things()
	 * @model containment="true"
	 * @generated
	 */
	EList<Thing> getThings();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getSmartSystem_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link sbsml.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see sbsml.SbsmlPackage#getSmartSystem_Configs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigs();

} // SmartSystem
