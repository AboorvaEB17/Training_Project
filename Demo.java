package demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger logger = LogManager.getLogger(Demo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.info("Info message");
		logger.debug("Debug");
		logger.error("Error");
		logger.fatal("Fatal");
		logger.warn("Warn");
		
	}

}
