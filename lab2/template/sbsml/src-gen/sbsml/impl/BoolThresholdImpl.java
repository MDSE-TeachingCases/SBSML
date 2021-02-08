/**
 */
package sbsml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sbsml.BoolThreshold;
import sbsml.SbsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.BoolThresholdImpl#isTriggerOn <em>Trigger On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoolThresholdImpl extends ThresholdImpl implements BoolThreshold {
	/**
	 * The default value of the '{@link #isTriggerOn() <em>Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggerOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIGGER_ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTriggerOn() <em>Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggerOn()
	 * @generated
	 * @ordered
	 */
	protected boolean triggerOn = TRIGGER_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.BOOL_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTriggerOn() {
		return triggerOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerOn(boolean newTriggerOn) {
		boolean oldTriggerOn = triggerOn;
		triggerOn = newTriggerOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.BOOL_THRESHOLD__TRIGGER_ON, oldTriggerOn,
					triggerOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SbsmlPackage.BOOL_THRESHOLD__TRIGGER_ON:
			return isTriggerOn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SbsmlPackage.BOOL_THRESHOLD__TRIGGER_ON:
			setTriggerOn((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SbsmlPackage.BOOL_THRESHOLD__TRIGGER_ON:
			setTriggerOn(TRIGGER_ON_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SbsmlPackage.BOOL_THRESHOLD__TRIGGER_ON:
			return triggerOn != TRIGGER_ON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (triggerOn: ");
		result.append(triggerOn);
		result.append(')');
		return result.toString();
	}

} //BoolThresholdImpl
