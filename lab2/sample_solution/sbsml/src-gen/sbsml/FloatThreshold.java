/**
 */
package sbsml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.FloatThreshold#getValue <em>Value</em>}</li>
 *   <li>{@link sbsml.FloatThreshold#getComperator <em>Comperator</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getFloatThreshold()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isFloatParameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isFloatParameter='self.parameter.unit.type = DataType::FLOAT'"
 * @generated
 */
public interface FloatThreshold extends Threshold {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see sbsml.SbsmlPackage#getFloatThreshold_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link sbsml.FloatThreshold#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Comperator</b></em>' attribute.
	 * The literals are from the enumeration {@link sbsml.Comparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comperator</em>' attribute.
	 * @see sbsml.Comparator
	 * @see #setComperator(Comparator)
	 * @see sbsml.SbsmlPackage#getFloatThreshold_Comperator()
	 * @model
	 * @generated
	 */
	Comparator getComperator();

	/**
	 * Sets the value of the '{@link sbsml.FloatThreshold#getComperator <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comperator</em>' attribute.
	 * @see sbsml.Comparator
	 * @see #getComperator()
	 * @generated
	 */
	void setComperator(Comparator value);

} // FloatThreshold
