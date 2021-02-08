/**
 */
package sbsml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sbsml.SbsmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SbsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sbsml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://big.tuwien.ac.at/sbsml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sbsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SbsmlPackage eINSTANCE = sbsml.impl.SbsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sbsml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.NamedElementImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.SmartSystemImpl <em>Smart System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.SmartSystemImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getSmartSystem()
	 * @generated
	 */
	int SMART_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Things</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_SYSTEM__THINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_SYSTEM__UNITS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_SYSTEM__CONFIGS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Smart System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Smart System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ThingImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getThing()
	 * @generated
	 */
	int THING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SHORT_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.SensorImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = THING__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PORTS = THING__PORTS;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SHORT_NAME = THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARAMETERS = THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ActuatorImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = THING__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PORTS = THING__PORTS;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SHORT_NAME = THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SERVICES = THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.FogDeviceImpl <em>Fog Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.FogDeviceImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getFogDevice()
	 * @generated
	 */
	int FOG_DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DEVICE__NAME = THING__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DEVICE__PORTS = THING__PORTS;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DEVICE__SHORT_NAME = THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DEVICE__MIPS = THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fog Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DEVICE_FEATURE_COUNT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fog Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_DEVICE_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ConfigurationImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTROLLERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.NodeImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__THING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ConnectionImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Port B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT_B = 0;

	/**
	 * The feature id for the '<em><b>Port A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT_A = 1;

	/**
	 * The feature id for the '<em><b>Node A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NODE_A = 2;

	/**
	 * The feature id for the '<em><b>Node B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NODE_B = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.PortImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Single Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SINGLE_CONNECTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ControllerImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__THRESHOLD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Servicecalls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SERVICECALLS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__MIPS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Computation Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COMPUTATION_NODE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ThresholdImpl <em>Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ThresholdImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getThreshold()
	 * @generated
	 */
	int THRESHOLD = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.IntThresholdImpl <em>Int Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.IntThresholdImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getIntThreshold()
	 * @generated
	 */
	int INT_THRESHOLD = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_THRESHOLD__SOURCE = THRESHOLD__SOURCE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_THRESHOLD__PARAMETER = THRESHOLD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_THRESHOLD__VALUE = THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_THRESHOLD__COMPERATOR = THRESHOLD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_THRESHOLD_FEATURE_COUNT = THRESHOLD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_THRESHOLD_OPERATION_COUNT = THRESHOLD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.BoolThresholdImpl <em>Bool Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.BoolThresholdImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getBoolThreshold()
	 * @generated
	 */
	int BOOL_THRESHOLD = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_THRESHOLD__SOURCE = THRESHOLD__SOURCE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_THRESHOLD__PARAMETER = THRESHOLD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Trigger On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_THRESHOLD__TRIGGER_ON = THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_THRESHOLD_FEATURE_COUNT = THRESHOLD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_THRESHOLD_OPERATION_COUNT = THRESHOLD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.FloatThresholdImpl <em>Float Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.FloatThresholdImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getFloatThreshold()
	 * @generated
	 */
	int FLOAT_THRESHOLD = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_THRESHOLD__SOURCE = THRESHOLD__SOURCE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_THRESHOLD__PARAMETER = THRESHOLD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_THRESHOLD__VALUE = THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_THRESHOLD__COMPERATOR = THRESHOLD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_THRESHOLD_FEATURE_COUNT = THRESHOLD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Float Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_THRESHOLD_OPERATION_COUNT = THRESHOLD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ParameterImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.UnitImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ABBREVIATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ParameterisedElementImpl <em>Parameterised Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ParameterisedElementImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getParameterisedElement()
	 * @generated
	 */
	int PARAMETERISED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISED_ELEMENT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameterised Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameterised Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERISED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ServiceImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARAMETERS = PARAMETERISED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = PARAMETERISED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = PARAMETERISED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = PARAMETERISED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = PARAMETERISED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ServiceCallImpl <em>Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ServiceCallImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getServiceCall()
	 * @generated
	 */
	int SERVICE_CALL = 17;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__NODE = 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__ARGUMENTS = 2;

	/**
	 * The number of structural features of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sbsml.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.impl.ArgumentImpl
	 * @see sbsml.impl.SbsmlPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 19;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__STRING_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sbsml.Comparator <em>Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.Comparator
	 * @see sbsml.impl.SbsmlPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 21;

	/**
	 * The meta object id for the '{@link sbsml.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sbsml.DataType
	 * @see sbsml.impl.SbsmlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 22;

	/**
	 * Returns the meta object for class '{@link sbsml.SmartSystem <em>Smart System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart System</em>'.
	 * @see sbsml.SmartSystem
	 * @generated
	 */
	EClass getSmartSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.SmartSystem#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Things</em>'.
	 * @see sbsml.SmartSystem#getThings()
	 * @see #getSmartSystem()
	 * @generated
	 */
	EReference getSmartSystem_Things();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.SmartSystem#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see sbsml.SmartSystem#getUnits()
	 * @see #getSmartSystem()
	 * @generated
	 */
	EReference getSmartSystem_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.SmartSystem#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see sbsml.SmartSystem#getConfigs()
	 * @see #getSmartSystem()
	 * @generated
	 */
	EReference getSmartSystem_Configs();

	/**
	 * Returns the meta object for class '{@link sbsml.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see sbsml.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Thing#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sbsml.Thing#getPorts()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Ports();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Thing#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see sbsml.Thing#getShortName()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_ShortName();

	/**
	 * Returns the meta object for class '{@link sbsml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see sbsml.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link sbsml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see sbsml.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Actuator#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see sbsml.Actuator#getServices()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Services();

	/**
	 * Returns the meta object for class '{@link sbsml.FogDevice <em>Fog Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Device</em>'.
	 * @see sbsml.FogDevice
	 * @generated
	 */
	EClass getFogDevice();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.FogDevice#getMips <em>Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mips</em>'.
	 * @see sbsml.FogDevice#getMips()
	 * @see #getFogDevice()
	 * @generated
	 */
	EAttribute getFogDevice_Mips();

	/**
	 * Returns the meta object for class '{@link sbsml.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see sbsml.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Configuration#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see sbsml.Configuration#getNodes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Configuration#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see sbsml.Configuration#getConnections()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Configuration#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see sbsml.Configuration#getControllers()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Controllers();

	/**
	 * Returns the meta object for class '{@link sbsml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see sbsml.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Node#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thing</em>'.
	 * @see sbsml.Node#getThing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Thing();

	/**
	 * Returns the meta object for class '{@link sbsml.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see sbsml.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Connection#getPortB <em>Port B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port B</em>'.
	 * @see sbsml.Connection#getPortB()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_PortB();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Connection#getPortA <em>Port A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port A</em>'.
	 * @see sbsml.Connection#getPortA()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_PortA();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Connection#getNodeA <em>Node A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node A</em>'.
	 * @see sbsml.Connection#getNodeA()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_NodeA();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Connection#getNodeB <em>Node B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node B</em>'.
	 * @see sbsml.Connection#getNodeB()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_NodeB();

	/**
	 * Returns the meta object for class '{@link sbsml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see sbsml.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Port#isSingleConnection <em>Single Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Connection</em>'.
	 * @see sbsml.Port#isSingleConnection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_SingleConnection();

	/**
	 * Returns the meta object for class '{@link sbsml.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see sbsml.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Controller#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threshold</em>'.
	 * @see sbsml.Controller#getThreshold()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Threshold();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.Controller#getServicecalls <em>Servicecalls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecalls</em>'.
	 * @see sbsml.Controller#getServicecalls()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Servicecalls();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Controller#getMips <em>Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mips</em>'.
	 * @see sbsml.Controller#getMips()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Mips();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Controller#getComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computation Node</em>'.
	 * @see sbsml.Controller#getComputationNode()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ComputationNode();

	/**
	 * Returns the meta object for class '{@link sbsml.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold</em>'.
	 * @see sbsml.Threshold
	 * @generated
	 */
	EClass getThreshold();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Threshold#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sbsml.Threshold#getSource()
	 * @see #getThreshold()
	 * @generated
	 */
	EReference getThreshold_Source();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Threshold#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see sbsml.Threshold#getParameter()
	 * @see #getThreshold()
	 * @generated
	 */
	EReference getThreshold_Parameter();

	/**
	 * Returns the meta object for class '{@link sbsml.IntThreshold <em>Int Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Threshold</em>'.
	 * @see sbsml.IntThreshold
	 * @generated
	 */
	EClass getIntThreshold();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.IntThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sbsml.IntThreshold#getValue()
	 * @see #getIntThreshold()
	 * @generated
	 */
	EAttribute getIntThreshold_Value();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.IntThreshold#getComperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comperator</em>'.
	 * @see sbsml.IntThreshold#getComperator()
	 * @see #getIntThreshold()
	 * @generated
	 */
	EAttribute getIntThreshold_Comperator();

	/**
	 * Returns the meta object for class '{@link sbsml.BoolThreshold <em>Bool Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Threshold</em>'.
	 * @see sbsml.BoolThreshold
	 * @generated
	 */
	EClass getBoolThreshold();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.BoolThreshold#isTriggerOn <em>Trigger On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger On</em>'.
	 * @see sbsml.BoolThreshold#isTriggerOn()
	 * @see #getBoolThreshold()
	 * @generated
	 */
	EAttribute getBoolThreshold_TriggerOn();

	/**
	 * Returns the meta object for class '{@link sbsml.FloatThreshold <em>Float Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Threshold</em>'.
	 * @see sbsml.FloatThreshold
	 * @generated
	 */
	EClass getFloatThreshold();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.FloatThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sbsml.FloatThreshold#getValue()
	 * @see #getFloatThreshold()
	 * @generated
	 */
	EAttribute getFloatThreshold_Value();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.FloatThreshold#getComperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comperator</em>'.
	 * @see sbsml.FloatThreshold#getComperator()
	 * @see #getFloatThreshold()
	 * @generated
	 */
	EAttribute getFloatThreshold_Comperator();

	/**
	 * Returns the meta object for class '{@link sbsml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see sbsml.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link sbsml.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see sbsml.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Unit();

	/**
	 * Returns the meta object for class '{@link sbsml.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see sbsml.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Unit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sbsml.Unit#getType()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Unit#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see sbsml.Unit#getAbbreviation()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Abbreviation();

	/**
	 * Returns the meta object for class '{@link sbsml.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see sbsml.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sbsml.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for class '{@link sbsml.ServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Call</em>'.
	 * @see sbsml.ServiceCall
	 * @generated
	 */
	EClass getServiceCall();

	/**
	 * Returns the meta object for the reference '{@link sbsml.ServiceCall#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see sbsml.ServiceCall#getService()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_Service();

	/**
	 * Returns the meta object for the reference '{@link sbsml.ServiceCall#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see sbsml.ServiceCall#getNode()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.ServiceCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see sbsml.ServiceCall#getArguments()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_Arguments();

	/**
	 * Returns the meta object for class '{@link sbsml.ParameterisedElement <em>Parameterised Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterised Element</em>'.
	 * @see sbsml.ParameterisedElement
	 * @generated
	 */
	EClass getParameterisedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link sbsml.ParameterisedElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sbsml.ParameterisedElement#getParameters()
	 * @see #getParameterisedElement()
	 * @generated
	 */
	EReference getParameterisedElement_Parameters();

	/**
	 * Returns the meta object for class '{@link sbsml.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see sbsml.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.Argument#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see sbsml.Argument#getStringValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_StringValue();

	/**
	 * Returns the meta object for class '{@link sbsml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see sbsml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link sbsml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sbsml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link sbsml.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator</em>'.
	 * @see sbsml.Comparator
	 * @generated
	 */
	EEnum getComparator();

	/**
	 * Returns the meta object for enum '{@link sbsml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see sbsml.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SbsmlFactory getSbsmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sbsml.impl.SmartSystemImpl <em>Smart System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.SmartSystemImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getSmartSystem()
		 * @generated
		 */
		EClass SMART_SYSTEM = eINSTANCE.getSmartSystem();

		/**
		 * The meta object literal for the '<em><b>Things</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_SYSTEM__THINGS = eINSTANCE.getSmartSystem_Things();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_SYSTEM__UNITS = eINSTANCE.getSmartSystem_Units();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_SYSTEM__CONFIGS = eINSTANCE.getSmartSystem_Configs();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ThingImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PORTS = eINSTANCE.getThing_Ports();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SHORT_NAME = eINSTANCE.getThing_ShortName();

		/**
		 * The meta object literal for the '{@link sbsml.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.SensorImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ActuatorImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__SERVICES = eINSTANCE.getActuator_Services();

		/**
		 * The meta object literal for the '{@link sbsml.impl.FogDeviceImpl <em>Fog Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.FogDeviceImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getFogDevice()
		 * @generated
		 */
		EClass FOG_DEVICE = eINSTANCE.getFogDevice();

		/**
		 * The meta object literal for the '<em><b>Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOG_DEVICE__MIPS = eINSTANCE.getFogDevice_Mips();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ConfigurationImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__NODES = eINSTANCE.getConfiguration_Nodes();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTIONS = eINSTANCE.getConfiguration_Connections();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONTROLLERS = eINSTANCE.getConfiguration_Controllers();

		/**
		 * The meta object literal for the '{@link sbsml.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.NodeImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__THING = eINSTANCE.getNode_Thing();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ConnectionImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Port B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PORT_B = eINSTANCE.getConnection_PortB();

		/**
		 * The meta object literal for the '<em><b>Port A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PORT_A = eINSTANCE.getConnection_PortA();

		/**
		 * The meta object literal for the '<em><b>Node A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__NODE_A = eINSTANCE.getConnection_NodeA();

		/**
		 * The meta object literal for the '<em><b>Node B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__NODE_B = eINSTANCE.getConnection_NodeB();

		/**
		 * The meta object literal for the '{@link sbsml.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.PortImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Single Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SINGLE_CONNECTION = eINSTANCE.getPort_SingleConnection();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ControllerImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__THRESHOLD = eINSTANCE.getController_Threshold();

		/**
		 * The meta object literal for the '<em><b>Servicecalls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SERVICECALLS = eINSTANCE.getController_Servicecalls();

		/**
		 * The meta object literal for the '<em><b>Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__MIPS = eINSTANCE.getController_Mips();

		/**
		 * The meta object literal for the '<em><b>Computation Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__COMPUTATION_NODE = eINSTANCE.getController_ComputationNode();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ThresholdImpl <em>Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ThresholdImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getThreshold()
		 * @generated
		 */
		EClass THRESHOLD = eINSTANCE.getThreshold();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THRESHOLD__SOURCE = eINSTANCE.getThreshold_Source();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THRESHOLD__PARAMETER = eINSTANCE.getThreshold_Parameter();

		/**
		 * The meta object literal for the '{@link sbsml.impl.IntThresholdImpl <em>Int Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.IntThresholdImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getIntThreshold()
		 * @generated
		 */
		EClass INT_THRESHOLD = eINSTANCE.getIntThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_THRESHOLD__VALUE = eINSTANCE.getIntThreshold_Value();

		/**
		 * The meta object literal for the '<em><b>Comperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_THRESHOLD__COMPERATOR = eINSTANCE.getIntThreshold_Comperator();

		/**
		 * The meta object literal for the '{@link sbsml.impl.BoolThresholdImpl <em>Bool Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.BoolThresholdImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getBoolThreshold()
		 * @generated
		 */
		EClass BOOL_THRESHOLD = eINSTANCE.getBoolThreshold();

		/**
		 * The meta object literal for the '<em><b>Trigger On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_THRESHOLD__TRIGGER_ON = eINSTANCE.getBoolThreshold_TriggerOn();

		/**
		 * The meta object literal for the '{@link sbsml.impl.FloatThresholdImpl <em>Float Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.FloatThresholdImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getFloatThreshold()
		 * @generated
		 */
		EClass FLOAT_THRESHOLD = eINSTANCE.getFloatThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_THRESHOLD__VALUE = eINSTANCE.getFloatThreshold_Value();

		/**
		 * The meta object literal for the '<em><b>Comperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_THRESHOLD__COMPERATOR = eINSTANCE.getFloatThreshold_Comperator();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ParameterImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '{@link sbsml.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.UnitImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__TYPE = eINSTANCE.getUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__ABBREVIATION = eINSTANCE.getUnit_Abbreviation();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ServiceImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ServiceCallImpl <em>Service Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ServiceCallImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getServiceCall()
		 * @generated
		 */
		EClass SERVICE_CALL = eINSTANCE.getServiceCall();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__SERVICE = eINSTANCE.getServiceCall_Service();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__NODE = eINSTANCE.getServiceCall_Node();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__ARGUMENTS = eINSTANCE.getServiceCall_Arguments();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ParameterisedElementImpl <em>Parameterised Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ParameterisedElementImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getParameterisedElement()
		 * @generated
		 */
		EClass PARAMETERISED_ELEMENT = eINSTANCE.getParameterisedElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERISED_ELEMENT__PARAMETERS = eINSTANCE.getParameterisedElement_Parameters();

		/**
		 * The meta object literal for the '{@link sbsml.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.ArgumentImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__STRING_VALUE = eINSTANCE.getArgument_StringValue();

		/**
		 * The meta object literal for the '{@link sbsml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.impl.NamedElementImpl
		 * @see sbsml.impl.SbsmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link sbsml.Comparator <em>Comparator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.Comparator
		 * @see sbsml.impl.SbsmlPackageImpl#getComparator()
		 * @generated
		 */
		EEnum COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '{@link sbsml.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sbsml.DataType
		 * @see sbsml.impl.SbsmlPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //SbsmlPackage
