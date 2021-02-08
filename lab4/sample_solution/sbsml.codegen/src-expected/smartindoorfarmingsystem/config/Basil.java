package smartindoorfarmingsystem.config;

import at.ac.tuwien.big.sbsml.codegen.lib.DataSource;
import at.ac.tuwien.big.sbsml.codegen.lib.EventLogger;
import at.ac.tuwien.big.sbsml.codegen.lib.Util;

import smartindoorfarmingsystem.thing.HumiditySensor;
import smartindoorfarmingsystem.thing.LightSensor;
import smartindoorfarmingsystem.thing.WateringValve;
import smartindoorfarmingsystem.thing.Lamp;
import smartindoorfarmingsystem.thing.RaspberryPi;

import smartindoorfarmingsystem.controller.LowHumidityController;
import smartindoorfarmingsystem.controller.SunShineController;
import smartindoorfarmingsystem.controller.DarknessController;
	
public class Basil {

	private HumiditySensor basilHS;
	private LightSensor basilLS;
	private WateringValve basilWV;
	private Lamp basilLamp;
	private RaspberryPi basilRPI;
	
	public Basil(EventLogger eventLogger, DataSource<Double> basilHShumidityDataSource, DataSource<Integer> basilLSbrightnessDataSource) {
		// init
		basilHS = new HumiditySensor("BasilHS", basilHShumidityDataSource);
		basilLS = new LightSensor("BasilLS", basilLSbrightnessDataSource);
		basilWV = new WateringValve("BasilWV", eventLogger);
		basilLamp = new Lamp("BasilLamp", eventLogger);
		basilRPI = new RaspberryPi("BasilRPI");
		
		// connect
		basilRPI.connect("RPI_GPIO_1", basilHS);
		basilHS.connect("HS_GPIO", basilRPI);
		basilRPI.connect("RPI_GPIO_2", basilLS);
		basilLS.connect("LS_GPIO", basilRPI);
		basilRPI.connect("RPI_GPIO_3", basilWV);
		basilWV.connect("WV_GPIO", basilRPI);
		basilRPI.connect("RPI_GPIO_4", basilLamp);
		basilLamp.connect("L_GPIO", basilRPI);
		
		// controllers
		basilRPI.addController("LowHumidityController", new LowHumidityController(basilRPI));
		basilRPI.addController("SunShineController", new SunShineController(basilRPI));
		basilRPI.addController("DarknessController", new DarknessController(basilRPI));
	}
	
	public void step() {
		// fetch sensor data
		System.out.println(Util.ANSI_BLUE + "Basil Sensor Values:");
		System.out.println(Util.ANSI_ITALIC +"  BasilHS" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		basilHS.readNextHumidity();
		System.out.println(Util.ANSI_ITALIC +"  BasilLS" + Util.ANSI_RESET + Util.ANSI_BLUE + ":");
		basilLS.readNextBrightness();
		
		System.out.println(Util.ANSI_RESET);
		
		//execute controllers
		basilRPI.executeControllers();
	}
	
}
