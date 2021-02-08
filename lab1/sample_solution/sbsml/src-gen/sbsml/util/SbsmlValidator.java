/**
 */
package sbsml.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import sbsml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sbsml.SbsmlPackage
 * @generated
 */
public class SbsmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SbsmlValidator INSTANCE = new SbsmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sbsml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbsmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SbsmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SbsmlPackage.SMART_SYSTEM:
			return validateSmartSystem((SmartSystem) value, diagnostics, context);
		case SbsmlPackage.THING:
			return validateThing((Thing) value, diagnostics, context);
		case SbsmlPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case SbsmlPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case SbsmlPackage.FOG_DEVICE:
			return validateFogDevice((FogDevice) value, diagnostics, context);
		case SbsmlPackage.CONFIGURATION:
			return validateConfiguration((Configuration) value, diagnostics, context);
		case SbsmlPackage.NODE:
			return validateNode((Node) value, diagnostics, context);
		case SbsmlPackage.CONNECTION:
			return validateConnection((Connection) value, diagnostics, context);
		case SbsmlPackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case SbsmlPackage.CONTROLLER:
			return validateController((Controller) value, diagnostics, context);
		case SbsmlPackage.THRESHOLD:
			return validateThreshold((Threshold) value, diagnostics, context);
		case SbsmlPackage.INT_THRESHOLD:
			return validateIntThreshold((IntThreshold) value, diagnostics, context);
		case SbsmlPackage.BOOL_THRESHOLD:
			return validateBoolThreshold((BoolThreshold) value, diagnostics, context);
		case SbsmlPackage.FLOAT_THRESHOLD:
			return validateFloatThreshold((FloatThreshold) value, diagnostics, context);
		case SbsmlPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case SbsmlPackage.UNIT:
			return validateUnit((Unit) value, diagnostics, context);
		case SbsmlPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case SbsmlPackage.SERVICE_CALL:
			return validateServiceCall((ServiceCall) value, diagnostics, context);
		case SbsmlPackage.PARAMETERISED_ELEMENT:
			return validateParameterisedElement((ParameterisedElement) value, diagnostics, context);
		case SbsmlPackage.ARGUMENT:
			return validateArgument((Argument) value, diagnostics, context);
		case SbsmlPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case SbsmlPackage.COMPARATOR:
			return validateComparator((Comparator) value, diagnostics, context);
		case SbsmlPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmartSystem(SmartSystem smartSystem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smartSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThing(Thing thing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFogDevice(FogDevice fogDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fogDevice, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(fogDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFogDevice_positiveMips(fogDevice, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveMips constraint of '<em>Fog Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FOG_DEVICE__POSITIVE_MIPS__EEXPRESSION = "self.mips > 0";

	/**
	 * Validates the positiveMips constraint of '<em>Fog Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFogDevice_positiveMips(FogDevice fogDevice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.FOG_DEVICE, fogDevice, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "positiveMips",
				FOG_DEVICE__POSITIVE_MIPS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configuration, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(configuration, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConfiguration_connectionNodesAreInSameConfiguration(configuration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the connectionNodesAreInSameConfiguration constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__CONNECTION_NODES_ARE_IN_SAME_CONFIGURATION__EEXPRESSION = "self.connections->forAll(c|self.nodes->exists(n|n=c.nodeA) and self.nodes->exists(n|n=c.nodeB))";

	/**
	 * Validates the connectionNodesAreInSameConfiguration constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_connectionNodesAreInSameConfiguration(Configuration configuration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.CONFIGURATION, configuration, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "connectionNodesAreInSameConfiguration",
				CONFIGURATION__CONNECTION_NODES_ARE_IN_SAME_CONFIGURATION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_enoughComputationPower(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the enoughComputationPower constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__ENOUGH_COMPUTATION_POWER__EEXPRESSION = "self.thing.oclIsTypeOf(FogDevice) implies \n"
			+ "\t\t(self.oclContainer.oclAsType(Configuration).controllers->select(c|c.computationNode=self)->collect(c|c.mips)->sum() <= self.thing.oclAsType(FogDevice).mips) ";

	/**
	 * Validates the enoughComputationPower constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_enoughComputationPower(Node node, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "enoughComputationPower",
				NODE__ENOUGH_COMPUTATION_POWER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_differentNodes(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_portsArePartOfRefThing(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_singleConnectionPortIsConnectedOnlyOnceOnNode(connection, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the differentNodes constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTION__DIFFERENT_NODES__EEXPRESSION = "self.nodeA <> self.nodeB";

	/**
	 * Validates the differentNodes constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection_differentNodes(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.CONNECTION, connection, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNodes",
				CONNECTION__DIFFERENT_NODES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the portsArePartOfRefThing constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTION__PORTS_ARE_PART_OF_REF_THING__EEXPRESSION = "self.nodeA.thing.ports->exists(p|p = self.portA) and self.nodeB.thing.ports->exists(p|p = self.portB)";

	/**
	 * Validates the portsArePartOfRefThing constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection_portsArePartOfRefThing(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.CONNECTION, connection, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "portsArePartOfRefThing",
				CONNECTION__PORTS_ARE_PART_OF_REF_THING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the singleConnectionPortIsConnectedOnlyOnceOnNode constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTION__SINGLE_CONNECTION_PORT_IS_CONNECTED_ONLY_ONCE_ON_NODE__EEXPRESSION = "(self.portA.singleConnection implies (self.oclContainer.oclAsType(Configuration).connections->select(c|(c.nodeA=self.nodeA and c.portA=self.portA) or c.nodeB=self.nodeA and c.portB=self.portA)->size() = 1))\n"
			+ "\t\t\tand (self.portB.singleConnection implies (self.oclContainer.oclAsType(Configuration).connections->select(c|(c.nodeA=self.nodeB and c.portA=self.portB) or c.nodeB=self.nodeB and c.portB=self.portB)->size() = 1 ))";

	/**
	 * Validates the singleConnectionPortIsConnectedOnlyOnceOnNode constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection_singleConnectionPortIsConnectedOnlyOnceOnNode(Connection connection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.CONNECTION, connection, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "singleConnectionPortIsConnectedOnlyOnceOnNode",
				CONNECTION__SINGLE_CONNECTION_PORT_IS_CONNECTED_ONLY_ONCE_ON_NODE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controller, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_computationNodeIsFogDevice(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_positiveMips(controller, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the computationNodeIsFogDevice constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROLLER__COMPUTATION_NODE_IS_FOG_DEVICE__EEXPRESSION = "self.computationNode.thing.oclIsTypeOf(FogDevice)";

	/**
	 * Validates the computationNodeIsFogDevice constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_computationNodeIsFogDevice(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.CONTROLLER, controller, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "computationNodeIsFogDevice",
				CONTROLLER__COMPUTATION_NODE_IS_FOG_DEVICE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the positiveMips constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROLLER__POSITIVE_MIPS__EEXPRESSION = "self.mips > 0";

	/**
	 * Validates the positiveMips constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_positiveMips(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.CONTROLLER, controller, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "positiveMips",
				CONTROLLER__POSITIVE_MIPS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreshold(Threshold threshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(threshold, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_sourceIsSensor(threshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_parameterIsMeasuredBySensor(threshold, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceIsSensor constraint of '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THRESHOLD__SOURCE_IS_SENSOR__EEXPRESSION = "self.source.thing.oclIsTypeOf(Sensor)";

	/**
	 * Validates the sourceIsSensor constraint of '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreshold_sourceIsSensor(Threshold threshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.THRESHOLD, threshold, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "sourceIsSensor",
				THRESHOLD__SOURCE_IS_SENSOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the parameterIsMeasuredBySensor constraint of '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THRESHOLD__PARAMETER_IS_MEASURED_BY_SENSOR__EEXPRESSION = "self.source.thing.oclAsType(Sensor).parameters->exists(p|p=self.parameter)";

	/**
	 * Validates the parameterIsMeasuredBySensor constraint of '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreshold_parameterIsMeasuredBySensor(Threshold threshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.THRESHOLD, threshold, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "parameterIsMeasuredBySensor",
				THRESHOLD__PARAMETER_IS_MEASURED_BY_SENSOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntThreshold(IntThreshold intThreshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intThreshold, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_sourceIsSensor(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_parameterIsMeasuredBySensor(intThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIntThreshold_isIntParameter(intThreshold, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isIntParameter constraint of '<em>Int Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INT_THRESHOLD__IS_INT_PARAMETER__EEXPRESSION = "self.parameter.unit.type = DataType::INT";

	/**
	 * Validates the isIntParameter constraint of '<em>Int Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntThreshold_isIntParameter(IntThreshold intThreshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.INT_THRESHOLD, intThreshold, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "isIntParameter",
				INT_THRESHOLD__IS_INT_PARAMETER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolThreshold(BoolThreshold boolThreshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boolThreshold, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_sourceIsSensor(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_parameterIsMeasuredBySensor(boolThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoolThreshold_isBoolParameter(boolThreshold, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isBoolParameter constraint of '<em>Bool Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOL_THRESHOLD__IS_BOOL_PARAMETER__EEXPRESSION = "self.parameter.unit.type = DataType::BOOL";

	/**
	 * Validates the isBoolParameter constraint of '<em>Bool Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolThreshold_isBoolParameter(BoolThreshold boolThreshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.BOOL_THRESHOLD, boolThreshold, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "isBoolParameter",
				BOOL_THRESHOLD__IS_BOOL_PARAMETER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatThreshold(FloatThreshold floatThreshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(floatThreshold, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_sourceIsSensor(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreshold_parameterIsMeasuredBySensor(floatThreshold, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFloatThreshold_isFloatParameter(floatThreshold, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isFloatParameter constraint of '<em>Float Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLOAT_THRESHOLD__IS_FLOAT_PARAMETER__EEXPRESSION = "self.parameter.unit.type = DataType::FLOAT";

	/**
	 * Validates the isFloatParameter constraint of '<em>Float Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatThreshold_isFloatParameter(FloatThreshold floatThreshold, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.FLOAT_THRESHOLD, floatThreshold, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "isFloatParameter",
				FLOAT_THRESHOLD__IS_FLOAT_PARAMETER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unit, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(unit, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUnit_abbreviationLength(unit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the abbreviationLength constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNIT__ABBREVIATION_LENGTH__EEXPRESSION = "(not self.abbreviation.oclIsUndefined()) implies self.abbreviation.size() < 5";

	/**
	 * Validates the abbreviationLength constraint of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit_abbreviationLength(Unit unit, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.UNIT, unit, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "abbreviationLength",
				UNIT__ABBREVIATION_LENGTH__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCall(ServiceCall serviceCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceCall, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateServiceCall_nodeIsActuator(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateServiceCall_serviceIsExposedByActuator(serviceCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateServiceCall_correctNumberArguments(serviceCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nodeIsActuator constraint of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_CALL__NODE_IS_ACTUATOR__EEXPRESSION = "self.node.thing.oclIsTypeOf(Actuator)";

	/**
	 * Validates the nodeIsActuator constraint of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCall_nodeIsActuator(ServiceCall serviceCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.SERVICE_CALL, serviceCall, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nodeIsActuator",
				SERVICE_CALL__NODE_IS_ACTUATOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the serviceIsExposedByActuator constraint of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_CALL__SERVICE_IS_EXPOSED_BY_ACTUATOR__EEXPRESSION = "self.node.thing.oclAsType(Actuator).services->exists(s|s=self.service)";

	/**
	 * Validates the serviceIsExposedByActuator constraint of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCall_serviceIsExposedByActuator(ServiceCall serviceCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.SERVICE_CALL, serviceCall, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "serviceIsExposedByActuator",
				SERVICE_CALL__SERVICE_IS_EXPOSED_BY_ACTUATOR__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the correctNumberArguments constraint of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_CALL__CORRECT_NUMBER_ARGUMENTS__EEXPRESSION = "self.arguments->size() = service.parameters->size()";

	/**
	 * Validates the correctNumberArguments constraint of '<em>Service Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceCall_correctNumberArguments(ServiceCall serviceCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SbsmlPackage.Literals.SERVICE_CALL, serviceCall, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "correctNumberArguments",
				SERVICE_CALL__CORRECT_NUMBER_ARGUMENTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterisedElement(ParameterisedElement parameterisedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterisedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparator(Comparator comparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SbsmlValidator
