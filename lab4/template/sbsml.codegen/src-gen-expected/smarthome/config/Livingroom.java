package smarthome.config;

import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.LightBulb;
import smarthome.thing.ZigBeeUSBGateway;
import smarthome.thing.Raspberry;
import smarthome.thing.MovementSensor;
import smarthome.thing.TemperatureSensor;
import smarthome.thing.Radiator;

import smarthome.controller.LivLightController1;
import smarthome.controller.LivLightController2;
import smarthome.controller.LivLowTempratureController;
import smarthome.controller.LivHighTempratureController;
	
public class Livingroom {

	private LightBulb livBulb1;
	private LightBulb livBulb2;
	private LightBulb livBulb3;
	private ZigBeeUSBGateway livZGW;
	private Raspberry livPi;
	private MovementSensor livM1;
	private MovementSensor livM2;
	private TemperatureSensor livTS;
	private Radiator livR;
	
	public Livingroom(EventLogger eventLogger, DataSource<Boolean> livM1isMovingDataSource, DataSource<Boolean> livM2isMovingDataSource, DataSource<Double> livTStemperatureDataSource) {
		// init
		livBulb1 = new LightBulb("LivBulb1", eventLogger);
		livBulb2 = new LightBulb("LivBulb2", eventLogger);
		livBulb3 = new LightBulb("LivBulb3", eventLogger);
		livZGW = new ZigBeeUSBGateway("LivZGW");
		livPi = new Raspberry("LivPi");
		livM1 = new MovementSensor("LivM1", livM1isMovingDataSource);
		livM2 = new MovementSensor("LivM2", livM2isMovingDataSource);
		livTS = new TemperatureSensor("LivTS", livTStemperatureDataSource);
		livR = new Radiator("LivR", eventLogger);
		
		// connect
		livPi.connect("RPI_USB", livZGW);
		livZGW.connect("ZB_USB", livPi);
		livZGW.connect("ZB_RF4CE", livBulb1);
		livBulb1.connect("LB_ZIGBEE", livZGW);
		livZGW.connect("ZB_RF4CE", livBulb2);
		livBulb2.connect("LB_ZIGBEE", livZGW);
		livZGW.connect("ZB_RF4CE", livBulb3);
		livBulb3.connect("LB_ZIGBEE", livZGW);
		livPi.connect("RPI_GPIO_1", livM1);
		livM1.connect("MS_GPIO", livPi);
		livPi.connect("RPI_GPIO_2", livM2);
		livM2.connect("MS_GPIO", livPi);
		livPi.connect("RPI_GPIO_3", livTS);
		livTS.connect("TS_GPIO", livPi);
		livPi.connect("RPI_GPIO_4", livR);
		livR.connect("R_GPIO", livPi);
		
		// controllers
		livPi.addController("LivLightController1", new LivLightController1(livPi));
		livPi.addController("LivLightController2", new LivLightController2(livPi));
		livPi.addController("LivLowTempratureController", new LivLowTempratureController(livPi));
		livPi.addController("LivHighTempratureController", new LivHighTempratureController(livPi));
	}
	
	public void step() {
		// fetch sensor data
		System.out.println(Util.ANSI_BLUE + "Livingroom Sensor Values:");
		System.out.println(Util.ANSI_ITALIC +"  LivM1" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		livM1.readNextIsMoving();
		System.out.println(Util.ANSI_ITALIC +"  LivM2" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		livM2.readNextIsMoving();
		System.out.println(Util.ANSI_ITALIC +"  LivTS" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		livTS.readNextTemperature();
		
		System.out.println(Util.ANSI_RESET);
		
		//execute controllers
		livPi.executeControllers();
	}
	
}
