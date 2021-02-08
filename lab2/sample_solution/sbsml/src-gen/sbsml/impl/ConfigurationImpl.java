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
import sbsml.Connection;
import sbsml.Controller;
import sbsml.Node;
import sbsml.SbsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sbsml.impl.ConfigurationImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link sbsml.impl.ConfigurationImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link sbsml.impl.ConfigurationImpl#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends NamedElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SbsmlPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, SbsmlPackage.CONFIGURATION__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this,
					SbsmlPackage.CONFIGURATION__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<Controller>(Controller.class, this,
					SbsmlPackage.CONFIGURATION__CONTROLLERS);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SbsmlPackage.CONFIGURATION__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		case SbsmlPackage.CONFIGURATION__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		case SbsmlPackage.CONFIGURATION__CONTROLLERS:
			return ((InternalEList<?>) getControllers()).basicRemove(otherEnd, msgs);
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
		case SbsmlPackage.CONFIGURATION__NODES:
			return getNodes();
		case SbsmlPackage.CONFIGURATION__CONNECTIONS:
			return getConnections();
		case SbsmlPackage.CONFIGURATION__CONTROLLERS:
			return getControllers();
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
		case SbsmlPackage.CONFIGURATION__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case SbsmlPackage.CONFIGURATION__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Connection>) newValue);
			return;
		case SbsmlPackage.CONFIGURATION__CONTROLLERS:
			getControllers().clear();
			getControllers().addAll((Collection<? extends Controller>) newValue);
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
		case SbsmlPackage.CONFIGURATION__NODES:
			getNodes().clear();
			return;
		case SbsmlPackage.CONFIGURATION__CONNECTIONS:
			getConnections().clear();
			return;
		case SbsmlPackage.CONFIGURATION__CONTROLLERS:
			getControllers().clear();
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
		case SbsmlPackage.CONFIGURATION__NODES:
			return nodes != null && !nodes.isEmpty();
		case SbsmlPackage.CONFIGURATION__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		case SbsmlPackage.CONFIGURATION__CONTROLLERS:
			return controllers != null && !controllers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
