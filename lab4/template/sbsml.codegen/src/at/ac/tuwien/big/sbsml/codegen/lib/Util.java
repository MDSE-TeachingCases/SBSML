package at.ac.tuwien.big.sbsml.codegen.lib;

import java.util.Random;

public class Util {
	
	private static Random random = new Random(233434);
	
	public static double random() {
		return random.nextDouble();
	}
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BOLD = "\u001b[1m";
	public static final String ANSI_ITALIC = "\u001b[3m";

}
