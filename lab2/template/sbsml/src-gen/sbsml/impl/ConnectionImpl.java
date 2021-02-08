/**
 */
package sbsml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sbsml.Connection;
import sbsml.Node;
import sbsml.Port;
import sbsml.SbsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.ConnectionImpl#getPortB <em>Port B</em>}</li>
 *   <li>{@link sbsml.impl.ConnectionImpl#getPortA <em>Port A</em>}</li>
 *   <li>{@link sbsml.impl.ConnectionImpl#getNodeA <em>Node A</em>}</li>
 *   <li>{@link sbsml.impl.ConnectionImpl#getNodeB <em>Node B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getPortB() <em>Port B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortB()
	 * @generated
	 * @ordered
	 */
	protected Port portB;

	/**
	 * The cached value of the '{@link #getPortA() <em>Port A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortA()
	 * @generated
	 * @ordered
	 */
	protected Port portA;

	/**
	 * The cached value of the '{@link #getNodeA() <em>Node A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeA()
	 * @generated
	 * @ordered
	 */
	protected Node nodeA;

	/**
	 * The cached value of the '{@link #getNodeB() <em>Node B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeB()
	 * @generated
	 * @ordered
	 */
	protected Node nodeB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortB() {
		if (portB != null && portB.eIsProxy()) {
			InternalEObject oldPortB = (InternalEObject) portB;
			portB = (Port) eResolveProxy(oldPortB);
			if (portB != oldPortB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.CONNECTION__PORT_B, oldPortB,
							portB));
			}
		}
		return portB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortB() {
		return portB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortB(Port newPortB) {
		Port oldPortB = portB;
		portB = newPortB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.CONNECTION__PORT_B, oldPortB, portB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortA() {
		if (portA != null && portA.eIsProxy()) {
			InternalEObject oldPortA = (InternalEObject) portA;
			portA = (Port) eResolveProxy(oldPortA);
			if (portA != oldPortA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.CONNECTION__PORT_A, oldPortA,
							portA));
			}
		}
		return portA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortA() {
		return portA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortA(Port newPortA) {
		Port oldPortA = portA;
		portA = newPortA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.CONNECTION__PORT_A, oldPortA, portA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeA() {
		if (nodeA != null && nodeA.eIsProxy()) {
			InternalEObject oldNodeA = (InternalEObject) nodeA;
			nodeA = (Node) eResolveProxy(oldNodeA);
			if (nodeA != oldNodeA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.CONNECTION__NODE_A, oldNodeA,
							nodeA));
			}
		}
		return nodeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeA() {
		return nodeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeA(Node newNodeA) {
		Node oldNodeA = nodeA;
		nodeA = newNodeA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.CONNECTION__NODE_A, oldNodeA, nodeA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeB() {
		if (nodeB != null && nodeB.eIsProxy()) {
			InternalEObject oldNodeB = (InternalEObject) nodeB;
			nodeB = (Node) eResolveProxy(oldNodeB);
			if (nodeB != oldNodeB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.CONNECTION__NODE_B, oldNodeB,
							nodeB));
			}
		}
		return nodeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeB() {
		return nodeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeB(Node newNodeB) {
		Node oldNodeB = nodeB;
		nodeB = newNodeB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.CONNECTION__NODE_B, oldNodeB, nodeB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SbsmlPackage.CONNECTION__PORT_B:
			if (resolve)
				return getPortB();
			return basicGetPortB();
		case SbsmlPackage.CONNECTION__PORT_A:
			if (resolve)
				return getPortA();
			return basicGetPortA();
		case SbsmlPackage.CONNECTION__NODE_A:
			if (resolve)
				return getNodeA();
			return basicGetNodeA();
		case SbsmlPackage.CONNECTION__NODE_B:
			if (resolve)
				return getNodeB();
			return basicGetNodeB();
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
		case SbsmlPackage.CONNECTION__PORT_B:
			setPortB((Port) newValue);
			return;
		case SbsmlPackage.CONNECTION__PORT_A:
			setPortA((Port) newValue);
			return;
		case SbsmlPackage.CONNECTION__NODE_A:
			setNodeA((Node) newValue);
			return;
		case SbsmlPackage.CONNECTION__NODE_B:
			setNodeB((Node) newValue);
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
		case SbsmlPackage.CONNECTION__PORT_B:
			setPortB((Port) null);
			return;
		case SbsmlPackage.CONNECTION__PORT_A:
			setPortA((Port) null);
			return;
		case SbsmlPackage.CONNECTION__NODE_A:
			setNodeA((Node) null);
			return;
		case SbsmlPackage.CONNECTION__NODE_B:
			setNodeB((Node) null);
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
		case SbsmlPackage.CONNECTION__PORT_B:
			return portB != null;
		case SbsmlPackage.CONNECTION__PORT_A:
			return portA != null;
		case SbsmlPackage.CONNECTION__NODE_A:
			return nodeA != null;
		case SbsmlPackage.CONNECTION__NODE_B:
			return nodeB != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
