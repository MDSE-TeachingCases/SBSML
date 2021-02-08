/**
 */
package sbsml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sbsml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SbsmlFactoryImpl extends EFactoryImpl implements SbsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SbsmlFactory init() {
		try {
			SbsmlFactory theSbsmlFactory = (SbsmlFactory) EPackage.Registry.INSTANCE.getEFactory(SbsmlPackage.eNS_URI);
			if (theSbsmlFactory != null) {
				return theSbsmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SbsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SbsmlPackage.SMART_SYSTEM:
			return createSmartSystem();
		case SbsmlPackage.SENSOR:
			return createSensor();
		case SbsmlPackage.ACTUATOR:
			return createActuator();
		case SbsmlPackage.FOG_DEVICE:
			return createFogDevice();
		case SbsmlPackage.CONFIGURATION:
			return createConfiguration();
		case SbsmlPackage.NODE:
			return createNode();
		case SbsmlPackage.CONNECTION:
			return createConnection();
		case SbsmlPackage.PORT:
			return createPort();
		case SbsmlPackage.CONTROLLER:
			return createController();
		case SbsmlPackage.INT_THRESHOLD:
			return createIntThreshold();
		case SbsmlPackage.BOOL_THRESHOLD:
			return createBoolThreshold();
		case SbsmlPackage.FLOAT_THRESHOLD:
			return createFloatThreshold();
		case SbsmlPackage.PARAMETER:
			return createParameter();
		case SbsmlPackage.UNIT:
			return createUnit();
		case SbsmlPackage.SERVICE:
			return createService();
		case SbsmlPackage.SERVICE_CALL:
			return createServiceCall();
		case SbsmlPackage.ARGUMENT:
			return createArgument();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SbsmlPackage.COMPARATOR:
			return createComparatorFromString(eDataType, initialValue);
		case SbsmlPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SbsmlPackage.COMPARATOR:
			return convertComparatorToString(eDataType, instanceValue);
		case SbsmlPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartSystem createSmartSystem() {
		SmartSystemImpl smartSystem = new SmartSystemImpl();
		return smartSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogDevice createFogDevice() {
		FogDeviceImpl fogDevice = new FogDeviceImpl();
		return fogDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntThreshold createIntThreshold() {
		IntThresholdImpl intThreshold = new IntThresholdImpl();
		return intThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolThreshold createBoolThreshold() {
		BoolThresholdImpl boolThreshold = new BoolThresholdImpl();
		return boolThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatThreshold createFloatThreshold() {
		FloatThresholdImpl floatThreshold = new FloatThresholdImpl();
		return floatThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCall createServiceCall() {
		ServiceCallImpl serviceCall = new ServiceCallImpl();
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator createComparatorFromString(EDataType eDataType, String initialValue) {
		Comparator result = Comparator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbsmlPackage getSbsmlPackage() {
		return (SbsmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SbsmlPackage getPackage() {
		return SbsmlPackage.eINSTANCE;
	}

} //SbsmlFactoryImpl
