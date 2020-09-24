package org.hcl;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggingExample {
	private static final Logger LOGGER=Logger.getLogger(LoggingExample.class); 
	public static void main(String[] args) {
		LOGGER.setLevel(Level.DEBUG);
		LOGGER.info("info message");
		LOGGER.error("Error message");
		LOGGER.trace("trace message");
		LOGGER.debug("Debug message");
	}
}
