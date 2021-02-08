/**
 */
package sbsml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sbsml.Controller;
import sbsml.Node;
import sbsml.SbsmlPackage;
import sbsml.ServiceCall;
import sbsml.Threshold;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.ControllerImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link sbsml.impl.ControllerImpl#getServicecalls <em>Servicecalls</em>}</li>
 *   <li>{@link sbsml.impl.ControllerImpl#getMips <em>Mips</em>}</li>
 *   <li>{@link sbsml.impl.ControllerImpl#getComputationNode <em>Computation Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends NamedElementImpl implements Controller {
	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<Threshold> threshold;

	/**
	 * The cached value of the '{@link #getServicecalls() <em>Servicecalls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicecalls()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCall> servicecalls;

	/**
	 * The default value of the '{@link #getMips() <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected static final long MIPS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMips() <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected long mips = MIPS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComputationNode() <em>Computation Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationNode()
	 * @generated
	 * @ordered
	 */
	protected Node computationNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threshold> getThreshold() {
		if (threshold == null) {
			threshold = new EObjectContainmentEList<Threshold>(Threshold.class, this,
					SbsmlPackage.CONTROLLER__THRESHOLD);
		}
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceCall> getServicecalls() {
		if (servicecalls == null) {
			servicecalls = new EObjectContainmentEList<ServiceCall>(ServiceCall.class, this,
					SbsmlPackage.CONTROLLER__SERVICECALLS);
		}
		return servicecalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMips() {
		return mips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMips(long newMips) {
		long oldMips = mips;
		mips = newMips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.CONTROLLER__MIPS, oldMips, mips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getComputationNode() {
		if (computationNode != null && computationNode.eIsProxy()) {
			InternalEObject oldComputationNode = (InternalEObject) computationNode;
			computationNode = (Node) eResolveProxy(oldComputationNode);
			if (computationNode != oldComputationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.CONTROLLER__COMPUTATION_NODE,
							oldComputationNode, computationNode));
			}
		}
		return computationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetComputationNode() {
		return computationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputationNode(Node newComputationNode) {
		Node oldComputationNode = computationNode;
		computationNode = newComputationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.CONTROLLER__COMPUTATION_NODE,
					oldComputationNode, computationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SbsmlPackage.CONTROLLER__THRESHOLD:
			return ((InternalEList<?>) getThreshold()).basicRemove(otherEnd, msgs);
		case SbsmlPackage.CONTROLLER__SERVICECALLS:
			return ((InternalEList<?>) getServicecalls()).basicRemove(otherEnd, msgs);
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
		case SbsmlPackage.CONTROLLER__THRESHOLD:
			return getThreshold();
		case SbsmlPackage.CONTROLLER__SERVICECALLS:
			return getServicecalls();
		case SbsmlPackage.CONTROLLER__MIPS:
			return getMips();
		case SbsmlPackage.CONTROLLER__COMPUTATION_NODE:
			if (resolve)
				return getComputationNode();
			return basicGetComputationNode();
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
		case SbsmlPackage.CONTROLLER__THRESHOLD:
			getThreshold().clear();
			getThreshold().addAll((Collection<? extends Threshold>) newValue);
			return;
		case SbsmlPackage.CONTROLLER__SERVICECALLS:
			getServicecalls().clear();
			getServicecalls().addAll((Collection<? extends ServiceCall>) newValue);
			return;
		case SbsmlPackage.CONTROLLER__MIPS:
			setMips((Long) newValue);
			return;
		case SbsmlPackage.CONTROLLER__COMPUTATION_NODE:
			setComputationNode((Node) newValue);
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
		case SbsmlPackage.CONTROLLER__THRESHOLD:
			getThreshold().clear();
			return;
		case SbsmlPackage.CONTROLLER__SERVICECALLS:
			getServicecalls().clear();
			return;
		case SbsmlPackage.CONTROLLER__MIPS:
			setMips(MIPS_EDEFAULT);
			return;
		case SbsmlPackage.CONTROLLER__COMPUTATION_NODE:
			setComputationNode((Node) null);
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
		case SbsmlPackage.CONTROLLER__THRESHOLD:
			return threshold != null && !threshold.isEmpty();
		case SbsmlPackage.CONTROLLER__SERVICECALLS:
			return servicecalls != null && !servicecalls.isEmpty();
		case SbsmlPackage.CONTROLLER__MIPS:
			return mips != MIPS_EDEFAULT;
		case SbsmlPackage.CONTROLLER__COMPUTATION_NODE:
			return computationNode != null;
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
		result.append(" (mips: ");
		result.append(mips);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
