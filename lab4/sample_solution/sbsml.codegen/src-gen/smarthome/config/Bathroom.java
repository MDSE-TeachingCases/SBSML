package smarthome.config;

import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.HumiditySensor;
import smarthome.thing.Ventilator;
import smarthome.thing.MovementSensor;
import smarthome.thing.Raspberry;

import smarthome.controller.BathHumidityController;
	
public class Bathroom {

	private HumiditySensor bathHS;
	private Ventilator bathV;
	private MovementSensor bathM;
	private Raspberry bathPi;
	
	public Bathroom(EventLogger eventLogger, DataSource<Double> bathHShumidityDataSource, DataSource<Boolean> bathMisMovingDataSource) {
		// init
		bathHS = new HumiditySensor("BathHS", bathHShumidityDataSource);
		bathV = new Ventilator("BathV", eventLogger);
		bathM = new MovementSensor("BathM", bathMisMovingDataSource);
		bathPi = new Raspberry("BathPi");
		
		// connect
		bathPi.connect("RPI_GPIO_1", bathHS);
		bathHS.connect("HS_GPIO", bathPi);
		bathPi.connect("RPI_GPIO_2", bathV);
		bathV.connect("V_GPIO", bathPi);
		bathPi.connect("RPI_GPIO_3", bathM);
		bathM.connect("MS_GPIO", bathPi);
		
		// controllers
		bathPi.addController("BathHumidityController", new BathHumidityController(bathPi));
	}
	
	public void step() {
		// fetch sensor data
		System.out.println(Util.ANSI_BLUE + "Bathroom Sensor Values:");
		System.out.println(Util.ANSI_ITALIC +"  BathHS" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		bathHS.readNextHumidity();
		System.out.println(Util.ANSI_ITALIC +"  BathM" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		bathM.readNextIsMoving();
		
		System.out.println(Util.ANSI_RESET);
		
		//execute controllers
		bathPi.executeControllers();
	}
	
}
