# Codegen Notes

## Simulation Utilities

### DataSource
A DataSource is needed for all parameters of each Sensor object. It is basically a queue and the Sensors read the next values out of it. A DataSource can either have a constant value, where always the same value is read, or it can be filled with a sequence of values. If the queue is empty or the constant value is set to null the Sensor also reads null. The constant value overrule queue values.

### EventLogger (only for Unit Tests)
There is always a single EventLogger for a Simulation. If a Service of an Actuator is invoked, the Actuator logs this in the EventLogger. A log entry consists of the event name (the name of the service) and the optional list of Arguments.

Additionally, it is possible within the simulation setup to register to events using the EventLogger. So each time the registered event is logged a callback is invoked together with the logged argument list.

## Generated Code

### Runner
For each SmartSystem there is a runner. A Runner sets up the Configuration objects and passes all the needed DataSources and the EventLogger. The runner is also the only interface for the Simulation. For this each Runner implements a ``step`` method, which further invokes all the steps from its containing Configurations.

### Configuration
A Configuration holds for each node a corresponding object. For each Actuator it passes the given EventLogger. For each Sensor it passes the needed DataSources. It connects all the nodes and finally creates and adds all needed Controllers to the corresponding FogDevice objects.

In one ``step`` the methods to read the next value from their DataSource of all Sensors are invoked. Afterwards all FogDevices execute their controllers.

### Thing
Each thing has a name (name of the node) and contains a map ``ports`` which defines a mapping for each port if it is a single connection port. As each thing is connectable all things contain the method ``connect`` and ``getConnecctedDevices``. The ``getConnectedDevices`` returns all connected nodes of the network.

#### Sensor
Additionally, a Sensor has for each Parameter a ``readNext`` method, which is invoked by the Configuration and reads the next value from its DataSource, and a method named after the Parameter, which just returns the last read value.

#### Actuator
An Actuator implements a method for each of its Services, where the method call is just logged in the EventLogger together with the passed arguments. If the description of the Service is set, the corresponding JavaDoc for the method is generated including the ``@param`` attributes.

#### FogDevice
A Controller can be assigned to a FogDevice. Further the ``executeControllers`` which is invoked by the Configuration, runs all assigned Controllers in an arbitrary order.

### Controller
When a Controller is executed, it collects all the needed nodes. Afterwards it evaluates all the Thresholds. If there is a broken Sensor (returns null on the parameter) the Threshold evaluates to false.

If all Thresholds are evaluated to true the defined Services are invoked together with the constant arguments.

### Unit
A unit has an immutable value, regarding to the defined data type. The ``toString`` method returns the value following by the abbreviation. If there is no abbreviation the name of the unit is used. 

