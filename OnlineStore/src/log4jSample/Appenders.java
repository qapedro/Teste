package log4jSample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Appenders {
	static Logger mainLogger = LogManager.getLogger(Appenders.class.getName());
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		ConsoleAppender appender = new ConsoleAppender();
		appender.activateOptions();
		PatternLayout layoutHelper = new PatternLayout();
		layoutHelper.setConversionPattern("%-5p [%t]: %m%n");
		layoutHelper.activateOptions();
		appender.setLayout(layoutHelper);
		mainLogger.addAppender(appender);
		mainLogger.info("Pattern 1 is displayed like this");
		layoutHelper.setConversionPattern("%C %m%n");
		mainLogger.info("Pattern 2 is displayed like this");
	}
}
