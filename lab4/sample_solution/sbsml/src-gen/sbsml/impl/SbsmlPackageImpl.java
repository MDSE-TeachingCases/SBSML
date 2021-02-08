/**
 */
package sbsml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sbsml.Actuator;
import sbsml.Argument;
import sbsml.BoolThreshold;
import sbsml.Comparator;
import sbsml.Configuration;
import sbsml.Connection;
import sbsml.Controller;
import sbsml.DataType;
import sbsml.FloatThreshold;
import sbsml.FogDevice;
import sbsml.IntThreshold;
import sbsml.NamedElement;
import sbsml.Node;
import sbsml.Parameter;
import sbsml.ParameterisedElement;
import sbsml.Port;
import sbsml.SbsmlFactory;
import sbsml.SbsmlPackage;
import sbsml.Sensor;
import sbsml.Service;
import sbsml.ServiceCall;
import sbsml.SmartSystem;
import sbsml.Thing;
import sbsml.Threshold;
import sbsml.Unit;

import sbsml.util.SbsmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SbsmlPackageImpl extends EPackageImpl implements SbsmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterisedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sbsml.SbsmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SbsmlPackageImpl() {
		super(eNS_URI, SbsmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SbsmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SbsmlPackage init() {
		if (isInited)
			return (SbsmlPackage) EPackage.Registry.INSTANCE.getEPackage(SbsmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSbsmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SbsmlPackageImpl theSbsmlPackage = registeredSbsmlPackage instanceof SbsmlPackageImpl
				? (SbsmlPackageImpl) registeredSbsmlPackage
				: new SbsmlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSbsmlPackage.createPackageContents();

		// Initialize created meta-data
		theSbsmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSbsmlPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return SbsmlValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSbsmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SbsmlPackage.eNS_URI, theSbsmlPackage);
		return theSbsmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartSystem() {
		return smartSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartSystem_Things() {
		return (EReference) smartSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartSystem_Units() {
		return (EReference) smartSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartSystem_Configs() {
		return (EReference) smartSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Ports() {
		return (EReference) thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_ShortName() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Services() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogDevice() {
		return fogDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFogDevice_Mips() {
		return (EAttribute) fogDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Nodes() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Connections() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Controllers() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Thing() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_PortB() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_PortA() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_NodeA() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_NodeB() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_SingleConnection() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Threshold() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Servicecalls() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Mips() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_ComputationNode() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreshold() {
		return thresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreshold_Source() {
		return (EReference) thresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreshold_Parameter() {
		return (EReference) thresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntThreshold() {
		return intThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntThreshold_Value() {
		return (EAttribute) intThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntThreshold_Comperator() {
		return (EAttribute) intThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolThreshold() {
		return boolThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolThreshold_TriggerOn() {
		return (EAttribute) boolThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatThreshold() {
		return floatThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatThreshold_Value() {
		return (EAttribute) floatThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatThreshold_Comperator() {
		return (EAttribute) floatThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Unit() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Type() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Abbreviation() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCall() {
		return serviceCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCall_Service() {
		return (EReference) serviceCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCall_Node() {
		return (EReference) serviceCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCall_Arguments() {
		return (EReference) serviceCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterisedElement() {
		return parameterisedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterisedElement_Parameters() {
		return (EReference) parameterisedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgument_StringValue() {
		return (EAttribute) argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparator() {
		return comparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbsmlFactory getSbsmlFactory() {
		return (SbsmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		smartSystemEClass = createEClass(SMART_SYSTEM);
		createEReference(smartSystemEClass, SMART_SYSTEM__THINGS);
		createEReference(smartSystemEClass, SMART_SYSTEM__UNITS);
		createEReference(smartSystemEClass, SMART_SYSTEM__CONFIGS);

		thingEClass = createEClass(THING);
		createEReference(thingEClass, THING__PORTS);
		createEAttribute(thingEClass, THING__SHORT_NAME);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);
		createEReference(actuatorEClass, ACTUATOR__SERVICES);

		fogDeviceEClass = createEClass(FOG_DEVICE);
		createEAttribute(fogDeviceEClass, FOG_DEVICE__MIPS);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__NODES);
		createEReference(configurationEClass, CONFIGURATION__CONNECTIONS);
		createEReference(configurationEClass, CONFIGURATION__CONTROLLERS);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__THING);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__PORT_B);
		createEReference(connectionEClass, CONNECTION__PORT_A);
		createEReference(connectionEClass, CONNECTION__NODE_A);
		createEReference(connectionEClass, CONNECTION__NODE_B);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__SINGLE_CONNECTION);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__THRESHOLD);
		createEReference(controllerEClass, CONTROLLER__SERVICECALLS);
		createEAttribute(controllerEClass, CONTROLLER__MIPS);
		createEReference(controllerEClass, CONTROLLER__COMPUTATION_NODE);

		thresholdEClass = createEClass(THRESHOLD);
		createEReference(thresholdEClass, THRESHOLD__SOURCE);
		createEReference(thresholdEClass, THRESHOLD__PARAMETER);

		intThresholdEClass = createEClass(INT_THRESHOLD);
		createEAttribute(intThresholdEClass, INT_THRESHOLD__VALUE);
		createEAttribute(intThresholdEClass, INT_THRESHOLD__COMPERATOR);

		boolThresholdEClass = createEClass(BOOL_THRESHOLD);
		createEAttribute(boolThresholdEClass, BOOL_THRESHOLD__TRIGGER_ON);

		floatThresholdEClass = createEClass(FLOAT_THRESHOLD);
		createEAttribute(floatThresholdEClass, FLOAT_THRESHOLD__VALUE);
		createEAttribute(floatThresholdEClass, FLOAT_THRESHOLD__COMPERATOR);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__UNIT);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__TYPE);
		createEAttribute(unitEClass, UNIT__ABBREVIATION);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);

		serviceCallEClass = createEClass(SERVICE_CALL);
		createEReference(serviceCallEClass, SERVICE_CALL__SERVICE);
		createEReference(serviceCallEClass, SERVICE_CALL__NODE);
		createEReference(serviceCallEClass, SERVICE_CALL__ARGUMENTS);

		parameterisedElementEClass = createEClass(PARAMETERISED_ELEMENT);
		createEReference(parameterisedElementEClass, PARAMETERISED_ELEMENT__PARAMETERS);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__STRING_VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		comparatorEEnum = createEEnum(COMPARATOR);
		dataTypeEEnum = createEEnum(DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smartSystemEClass.getESuperTypes().add(this.getNamedElement());
		thingEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getThing());
		sensorEClass.getESuperTypes().add(this.getParameterisedElement());
		actuatorEClass.getESuperTypes().add(this.getThing());
		fogDeviceEClass.getESuperTypes().add(this.getThing());
		configurationEClass.getESuperTypes().add(this.getNamedElement());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		portEClass.getESuperTypes().add(this.getNamedElement());
		controllerEClass.getESuperTypes().add(this.getNamedElement());
		intThresholdEClass.getESuperTypes().add(this.getThreshold());
		boolThresholdEClass.getESuperTypes().add(this.getThreshold());
		floatThresholdEClass.getESuperTypes().add(this.getThreshold());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		unitEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getParameterisedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(smartSystemEClass, SmartSystem.class, "SmartSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartSystem_Things(), this.getThing(), null, "things", null, 0, -1, SmartSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartSystem_Units(), this.getUnit(), null, "units", null, 0, -1, SmartSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartSystem_Configs(), this.getConfiguration(), null, "configs", null, 0, -1,
				SmartSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingEClass, Thing.class, "Thing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThing_Ports(), this.getPort(), null, "ports", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getThing_ShortName(), ecorePackage.getEString(), "shortName", null, 1, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActuator_Services(), this.getService(), null, "services", null, 0, -1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fogDeviceEClass, FogDevice.class, "FogDevice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFogDevice_Mips(), ecorePackage.getELong(), "mips", null, 1, 1, FogDevice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Configuration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Connections(), this.getConnection(), null, "connections", null, 0, -1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Controllers(), this.getController(), null, "controllers", null, 0, -1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Thing(), this.getThing(), null, "thing", null, 1, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_PortB(), this.getPort(), null, "portB", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_PortA(), this.getPort(), null, "portA", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_NodeA(), this.getNode(), null, "nodeA", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_NodeB(), this.getNode(), null, "nodeB", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_SingleConnection(), ecorePackage.getEBoolean(), "singleConnection", "false", 1, 1,
				Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Threshold(), this.getThreshold(), null, "threshold", null, 0, -1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Servicecalls(), this.getServiceCall(), null, "servicecalls", null, 0, -1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Mips(), ecorePackage.getELong(), "mips", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_ComputationNode(), this.getNode(), null, "computationNode", null, 1, 1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdEClass, Threshold.class, "Threshold", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreshold_Source(), this.getNode(), null, "source", null, 1, 1, Threshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreshold_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, Threshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intThresholdEClass, IntThreshold.class, "IntThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntThreshold_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntThreshold_Comperator(), this.getComparator(), "comperator", null, 0, 1, IntThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolThresholdEClass, BoolThreshold.class, "BoolThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolThreshold_TriggerOn(), ecorePackage.getEBoolean(), "triggerOn", null, 1, 1,
				BoolThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(floatThresholdEClass, FloatThreshold.class, "FloatThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatThreshold_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, FloatThreshold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatThreshold_Comperator(), this.getComparator(), "comperator", null, 0, 1,
				FloatThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Unit(), this.getUnit(), null, "unit", null, 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Type(), this.getDataType(), "type", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Unit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCallEClass, ServiceCall.class, "ServiceCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceCall_Service(), this.getService(), null, "service", null, 1, 1, ServiceCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCall_Node(), this.getNode(), null, "node", null, 1, 1, ServiceCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceCall_Arguments(), this.getArgument(), null, "arguments", null, 0, -1,
				ServiceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterisedElementEClass, ParameterisedElement.class, "ParameterisedElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterisedElement_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				ParameterisedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, Argument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparatorEEnum, Comparator.class, "Comparator");
		addEEnumLiteral(comparatorEEnum, Comparator.GREATER);
		addEEnumLiteral(comparatorEEnum, Comparator.SMALLER);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(fogDeviceEClass, source, new String[] { "constraints", "positiveMips" });
		addAnnotation(configurationEClass, source,
				new String[] { "constraints", "connectionNodesAreInSameConfiguration" });
		addAnnotation(nodeEClass, source, new String[] { "constraints", "enoughComputationPower" });
		addAnnotation(connectionEClass, source, new String[] { "constraints",
				"differentNodes portsArePartOfRefThing singleConnectionPortIsConnectedOnlyOnceOnNode" });
		addAnnotation(controllerEClass, source,
				new String[] { "constraints", "computationNodeIsFogDevice positiveMips" });
		addAnnotation(thresholdEClass, source,
				new String[] { "constraints", "sourceIsSensor parameterIsMeasuredBySensor" });
		addAnnotation(intThresholdEClass, source, new String[] { "constraints", "isIntParameter" });
		addAnnotation(boolThresholdEClass, source, new String[] { "constraints", "isBoolParameter" });
		addAnnotation(floatThresholdEClass, source, new String[] { "constraints", "isFloatParameter" });
		addAnnotation(unitEClass, source, new String[] { "constraints", "abbreviationLength" });
		addAnnotation(serviceCallEClass, source,
				new String[] { "constraints", "nodeIsActuator serviceIsExposedByActuator correctNumberArguments" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(fogDeviceEClass, source, new String[] { "positiveMips", "self.mips > 0" });
		addAnnotation(configurationEClass, source, new String[] { "connectionNodesAreInSameConfiguration",
				"self.connections->forAll(c|self.nodes->exists(n|n=c.nodeA) and self.nodes->exists(n|n=c.nodeB))" });
		addAnnotation(nodeEClass, source, new String[] { "enoughComputationPower",
				"self.thing.oclIsTypeOf(FogDevice) implies \n\t\t(self.oclContainer.oclAsType(Configuration).controllers->select(c|c.computationNode=self)->collect(c|c.mips)->sum() <= self.thing.oclAsType(FogDevice).mips) " });
		addAnnotation(connectionEClass, source, new String[] { "differentNodes", "self.nodeA <> self.nodeB",
				"portsArePartOfRefThing",
				"self.nodeA.thing.ports->exists(p|p = self.portA) and self.nodeB.thing.ports->exists(p|p = self.portB)",
				"singleConnectionPortIsConnectedOnlyOnceOnNode",
				"(self.portA.singleConnection implies (self.oclContainer.oclAsType(Configuration).connections->select(c|(c.nodeA=self.nodeA and c.portA=self.portA) or c.nodeB=self.nodeA and c.portB=self.portA)->size() = 1))\n\t\t\tand (self.portB.singleConnection implies (self.oclContainer.oclAsType(Configuration).connections->select(c|(c.nodeA=self.nodeB and c.portA=self.portB) or c.nodeB=self.nodeB and c.portB=self.portB)->size() = 1 ))" });
		addAnnotation(controllerEClass, source, new String[] { "computationNodeIsFogDevice",
				"self.computationNode.thing.oclIsTypeOf(FogDevice)", "positiveMips", "self.mips > 0" });
		addAnnotation(thresholdEClass, source,
				new String[] { "sourceIsSensor", "self.source.thing.oclIsTypeOf(Sensor)", "parameterIsMeasuredBySensor",
						"self.source.thing.oclAsType(Sensor).parameters->exists(p|p=self.parameter)" });
		addAnnotation(intThresholdEClass, source,
				new String[] { "isIntParameter", "self.parameter.unit.type = DataType::INT" });
		addAnnotation(boolThresholdEClass, source,
				new String[] { "isBoolParameter", "self.parameter.unit.type = DataType::BOOL" });
		addAnnotation(floatThresholdEClass, source,
				new String[] { "isFloatParameter", "self.parameter.unit.type = DataType::FLOAT" });
		addAnnotation(unitEClass, source, new String[] { "abbreviationLength",
				"(not self.abbreviation.oclIsUndefined()) implies self.abbreviation.size() < 5" });
		addAnnotation(serviceCallEClass, source,
				new String[] { "nodeIsActuator", "self.node.thing.oclIsTypeOf(Actuator)", "serviceIsExposedByActuator",
						"self.node.thing.oclAsType(Actuator).services->exists(s|s=self.service)",
						"correctNumberArguments", "self.arguments->size() = service.parameters->size()" });
	}

} //SbsmlPackageImpl
