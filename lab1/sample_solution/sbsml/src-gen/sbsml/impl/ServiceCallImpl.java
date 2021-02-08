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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sbsml.Argument;
import sbsml.Node;
import sbsml.SbsmlPackage;
import sbsml.Service;
import sbsml.ServiceCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.ServiceCallImpl#getService <em>Service</em>}</li>
 *   <li>{@link sbsml.impl.ServiceCallImpl#getNode <em>Node</em>}</li>
 *   <li>{@link sbsml.impl.ServiceCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCallImpl extends MinimalEObjectImpl.Container implements ServiceCall {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.SERVICE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject) service;
			service = (Service) eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.SERVICE_CALL__SERVICE,
							oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.SERVICE_CALL__SERVICE, oldService,
					service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject) node;
			node = (Node) eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SbsmlPackage.SERVICE_CALL__NODE, oldNode,
							node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SbsmlPackage.SERVICE_CALL__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this,
					SbsmlPackage.SERVICE_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SbsmlPackage.SERVICE_CALL__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
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
		case SbsmlPackage.SERVICE_CALL__SERVICE:
			if (resolve)
				return getService();
			return basicGetService();
		case SbsmlPackage.SERVICE_CALL__NODE:
			if (resolve)
				return getNode();
			return basicGetNode();
		case SbsmlPackage.SERVICE_CALL__ARGUMENTS:
			return getArguments();
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
		case SbsmlPackage.SERVICE_CALL__SERVICE:
			setService((Service) newValue);
			return;
		case SbsmlPackage.SERVICE_CALL__NODE:
			setNode((Node) newValue);
			return;
		case SbsmlPackage.SERVICE_CALL__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends Argument>) newValue);
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
		case SbsmlPackage.SERVICE_CALL__SERVICE:
			setService((Service) null);
			return;
		case SbsmlPackage.SERVICE_CALL__NODE:
			setNode((Node) null);
			return;
		case SbsmlPackage.SERVICE_CALL__ARGUMENTS:
			getArguments().clear();
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
		case SbsmlPackage.SERVICE_CALL__SERVICE:
			return service != null;
		case SbsmlPackage.SERVICE_CALL__NODE:
			return node != null;
		case SbsmlPackage.SERVICE_CALL__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceCallImpl
