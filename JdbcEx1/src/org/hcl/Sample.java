package org.hcl;

import org.apache.log4j.Logger;

public class Sample {
	private static final Logger logger=Logger.getLogger(Sample.class);
	public static void main(String[] args) {
		logger.info("hello");
		logger.fatal("hello");
		logger.error("hello");

	}

}
