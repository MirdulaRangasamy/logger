package com.exterro.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        log.info("In main");
        log.error("Using error");
        
        Sample sample = new Sample();
        sample.print();
        sample.display();
    }
}
