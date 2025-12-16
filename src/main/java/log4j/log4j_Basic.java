package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j_Basic {
	
	private static Logger logger = LogManager.getLogger(log4j_Basic.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n Hello... \n");
		
		logger.trace("This is a trace message");
		
		logger.info("This is information message");
		
		logger.error("This is an error message");
		
		logger.warn("This is warn message");
		
		System.out.println(" \n Completed");
		
	}

}
