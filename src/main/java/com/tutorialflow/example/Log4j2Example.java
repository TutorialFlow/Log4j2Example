package com.tutorialflow.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {

	private static Logger logger = LogManager.getLogger(Log4j2Example.class);
	
	public static void main(String[] args) {

		logger.info("Log4j2Example Info Message Printed");
		
		logger.debug("Log4j2Example Debug Message Printed");
		
		logger.error("Log4j2Example Error Message Printed");
	}

}
