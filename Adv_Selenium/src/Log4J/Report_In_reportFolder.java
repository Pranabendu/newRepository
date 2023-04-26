package Log4J;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.testng.annotations.Test;

public class Report_In_reportFolder {
	@Test
	void folder() throws IOException {
		
		// specify the layout
		PatternLayout layout = new PatternLayout("%d %m %c %n");
		
		// specify the path of the report file
		FileAppender app = new FileAppender(layout, "./report/ex.txt");
		
		// step01 configure the log4j
		BasicConfigurator.configure(app);
		
		// step02 get the object of log4j
		Logger log = Logger.getLogger(this.getClass().getName());
		
		// step3 print the messages
		log.error("error is there");
		log.warn("warning is there");
		log.info("some information is there");
	}
}
