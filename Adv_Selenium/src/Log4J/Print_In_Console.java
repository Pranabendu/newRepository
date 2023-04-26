package Log4J;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Print_In_Console {
	@Test
	void build() {
		
		
		// Step 01 configure the Log4j
		BasicConfigurator.configure();
		
		// Step 02 get the object of Log4j
		Logger log = Logger.getLogger(this.getClass().getName());
		
		// Step 03 Print the message
		log.error("error in result");
		log.warn("warn in result");
		log.info("information of the result");
	}
}
