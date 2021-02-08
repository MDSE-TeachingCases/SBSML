package smarthome.config;

import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smarthome.thing.LightBulb;
import smarthome.thing.GasDetector;
import smarthome.thing.MovementSensor;
import smarthome.thing.Raspberry;
import smarthome.thing.AlarmBell;

import smarthome.controller.BaseGasLeakController;
import smarthome.controller.BaseLightController;
	
public class Basement {

	private LightBulb baseL;
	private GasDetector baseGD;
	private MovementSensor baseM;
	private Raspberry basePi;
	private AlarmBell baseBell;
	
	public Basement(EventLogger eventLogger, DataSource<Integer> baseGDconcentrationDataSource, DataSource<Boolean> baseMisMovingDataSource) {
		// init
		baseL = new LightBulb("BaseL", eventLogger);
		baseGD = new GasDetector("BaseGD", baseGDconcentrationDataSource);
		baseM = new MovementSensor("BaseM", baseMisMovingDataSource);
		basePi = new Raspberry("BasePi");
		baseBell = new AlarmBell("BaseBell", eventLogger);
		
		// connect
		basePi.connect("RPI_GPIO_1", baseL);
		baseL.connect("LB_GPIO", basePi);
		basePi.connect("RPI_GPIO_2", baseGD);
		baseGD.connect("GD_GPIO", basePi);
		basePi.connect("RPI_GPIO_3", baseM);
		baseM.connect("MS_GPIO", basePi);
		basePi.connect("RPI_GPIO_4", baseBell);
		baseBell.connect("AB_GPIO", basePi);
		
		// controllers
		basePi.addController("BaseGasLeakController", new BaseGasLeakController(basePi));
		basePi.addController("BaseLightController", new BaseLightController(basePi));
	}
	
	public void step() {
		// fetch sensor data
		System.out.println(Util.ANSI_BLUE + "Basement Sensor Values:");
		System.out.println(Util.ANSI_ITALIC +"  BaseGD" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		baseGD.readNextConcentration();
		System.out.println(Util.ANSI_ITALIC +"  BaseM" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		baseM.readNextIsMoving();
		
		System.out.println(Util.ANSI_RESET);
		
		//execute controllers
		basePi.executeControllers();
	}
	
}
