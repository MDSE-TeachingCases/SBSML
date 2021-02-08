/**
 */
package sbsml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sbsml.Configuration;
import sbsml.SbsmlPackage;
import sbsml.SmartSystem;
import sbsml.Thing;
import sbsml.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.SmartSystemImpl#getThings <em>Things</em>}</li>
 *   <li>{@link sbsml.impl.SmartSystemImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link sbsml.impl.SmartSystemImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartSystemImpl extends NamedElementImpl implements SmartSystem {
	/**
	 * The cached value of the '{@link #getThings() <em>Things</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThings()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> things;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.SMART_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getThings() {
		if (things == null) {
			things = new EObjectContainmentEList<Thing>(Thing.class, this, SbsmlPackage.SMART_SYSTEM__THINGS);
		}
		return things;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Unit>(Unit.class, this, SbsmlPackage.SMART_SYSTEM__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList<Configuration>(Configuration.class, this,
					SbsmlPackage.SMART_SYSTEM__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SbsmlPackage.SMART_SYSTEM__THINGS:
			return ((InternalEList<?>) getThings()).basicRemove(otherEnd, msgs);
		case SbsmlPackage.SMART_SYSTEM__UNITS:
			return ((InternalEList<?>) getUnits()).basicRemove(otherEnd, msgs);
		case SbsmlPackage.SMART_SYSTEM__CONFIGS:
			return ((InternalEList<?>) getConfigs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SbsmlPackage.SMART_SYSTEM__THINGS:
			return getThings();
		case SbsmlPackage.SMART_SYSTEM__UNITS:
			return getUnits();
		case SbsmlPackage.SMART_SYSTEM__CONFIGS:
			return getConfigs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SbsmlPackage.SMART_SYSTEM__THINGS:
			getThings().clear();
			getThings().addAll((Collection<? extends Thing>) newValue);
			return;
		case SbsmlPackage.SMART_SYSTEM__UNITS:
			getUnits().clear();
			getUnits().addAll((Collection<? extends Unit>) newValue);
			return;
		case SbsmlPackage.SMART_SYSTEM__CONFIGS:
			getConfigs().clear();
			getConfigs().addAll((Collection<? extends Configuration>) newValue);
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
		case SbsmlPackage.SMART_SYSTEM__THINGS:
			getThings().clear();
			return;
		case SbsmlPackage.SMART_SYSTEM__UNITS:
			getUnits().clear();
			return;
		case SbsmlPackage.SMART_SYSTEM__CONFIGS:
			getConfigs().clear();
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
		case SbsmlPackage.SMART_SYSTEM__THINGS:
			return things != null && !things.isEmpty();
		case SbsmlPackage.SMART_SYSTEM__UNITS:
			return units != null && !units.isEmpty();
		case SbsmlPackage.SMART_SYSTEM__CONFIGS:
			return configs != null && !configs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SmartSystemImpl
