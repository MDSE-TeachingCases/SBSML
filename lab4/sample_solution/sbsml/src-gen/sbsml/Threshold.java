/**
 */
package sbsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sbsml.Threshold#getSource <em>Source</em>}</li>
 *   <li>{@link sbsml.Threshold#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see sbsml.SbsmlPackage#getThreshold()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceIsSensor parameterIsMeasuredBySensor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sourceIsSensor='self.source.thing.oclIsTypeOf(Sensor)' parameterIsMeasuredBySensor='self.source.thing.oclAsType(Sensor).parameters-&gt;exists(p|p=self.parameter)'"
 * @generated
 */
public interface Threshold extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see sbsml.SbsmlPackage#getThreshold_Source()
	 * @model required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link sbsml.Threshold#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see sbsml.SbsmlPackage#getThreshold_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link sbsml.Threshold#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // Threshold
