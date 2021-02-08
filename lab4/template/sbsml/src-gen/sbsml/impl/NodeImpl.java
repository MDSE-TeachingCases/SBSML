/**
 */
package sbsml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sbsml.Node;
import sbsml.SbsmlPackage;
import sbsml.Thing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.NodeImpl#getThing <em>Thing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends NamedElementImpl implements Node {
	/**
	 * The cached value of the '{@link #getThing() <em>Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThing()
	 * @generated
	 * @ordered
	 */
	protected Thing thing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing getThing() {
		if (thing != null && thing.eIsProxy()) {
			InternalEObject oldThing = (InternalEObject) thing;
			thing = (Thing) eResolveProxy(oldThing);
			if (thing != oldThing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.NODE__THING, oldThing,
							thing));
			}
		}
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetThing() {
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThing(Thing newThing) {
		Thing oldThing = thing;
		thing = newThing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.NODE__THING, oldThing, thing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SbsmlPackage.NODE__THING:
			if (resolve)
				return getThing();
			return basicGetThing();
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
		case SbsmlPackage.NODE__THING:
			setThing((Thing) newValue);
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
		case SbsmlPackage.NODE__THING:
			setThing((Thing) null);
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
		case SbsmlPackage.NODE__THING:
			return thing != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
