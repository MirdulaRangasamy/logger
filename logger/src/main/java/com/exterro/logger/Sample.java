package com.exterro.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample {
	private static final Logger log = LogManager.getLogger(Sample.class);
	public void print() {
		log.info("In Sample Print");
	}
	
	public void display() {
		log.info("In Sample display");
	}
	
}
