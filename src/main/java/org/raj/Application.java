package org.raj;

import java.util.logging.Logger;

import org.raj.service.LoadCity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/** Spring Boot Application project
 * 
 * @author Raj Ganesh
 * 
 *
 */
@SpringBootApplication
public class Application {
	
	public static void main(String args[]) throws Exception {
		final Logger log = Logger.getLogger(Application.class.getName());
		LoadCity.readData();
		SpringApplication.run(Application.class, args);
		
		log.info("Started");
	}

}
