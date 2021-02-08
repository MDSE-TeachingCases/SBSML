/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.BoolThreshold#isTriggerOn <em>Trigger On</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getBoolThreshold()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isBoolParameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isBoolParameter='self.parameter.unit.type = DataType::BOOL'"
 * @generated
 */
public interface BoolThreshold extends Threshold {
	/**
	 * Returns the value of the '<em><b>Trigger On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger On</em>' attribute.
	 * @see #setTriggerOn(boolean)
	 * @see sbsml.SbsmlPackage#getBoolThreshold_TriggerOn()
	 * @model required="true"
	 * @generated
	 */
	boolean isTriggerOn();

	/**
	 * Sets the value of the '{@link sbsml.BoolThreshold#isTriggerOn <em>Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger On</em>' attribute.
	 * @see #isTriggerOn()
	 * @generated
	 */
	void setTriggerOn(boolean value);

} // BoolThreshold
