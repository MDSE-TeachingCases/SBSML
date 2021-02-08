/**
 */
package sbsml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sbsml.Comparator;
import sbsml.IntThreshold;
import sbsml.SbsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.IntThresholdImpl#getValue <em>Value</em>}</li>
 *   <li>{@link sbsml.impl.IntThresholdImpl#getComperator <em>Comperator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntThresholdImpl extends ThresholdImpl implements IntThreshold {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected static final Comparator COMPERATOR_EDEFAULT = Comparator.GREATER;

	/**
	 * The cached value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected Comparator comperator = COMPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.INT_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.INT_THRESHOLD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator getComperator() {
		return comperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComperator(Comparator newComperator) {
		Comparator oldComperator = comperator;
		comperator = newComperator == null ? COMPERATOR_EDEFAULT : newComperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.INT_THRESHOLD__COMPERATOR, oldComperator,
					comperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SbsmlPackage.INT_THRESHOLD__VALUE:
			return getValue();
		case SbsmlPackage.INT_THRESHOLD__COMPERATOR:
			return getComperator();
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
		case SbsmlPackage.INT_THRESHOLD__VALUE:
			setValue((Integer) newValue);
			return;
		case SbsmlPackage.INT_THRESHOLD__COMPERATOR:
			setComperator((Comparator) newValue);
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
		case SbsmlPackage.INT_THRESHOLD__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case SbsmlPackage.INT_THRESHOLD__COMPERATOR:
			setComperator(COMPERATOR_EDEFAULT);
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
		case SbsmlPackage.INT_THRESHOLD__VALUE:
			return value != VALUE_EDEFAULT;
		case SbsmlPackage.INT_THRESHOLD__COMPERATOR:
			return comperator != COMPERATOR_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", comperator: ");
		result.append(comperator);
		result.append(')');
		return result.toString();
	}

} //IntThresholdImpl
