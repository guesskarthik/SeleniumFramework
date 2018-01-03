package dotcom.RediffWebsite;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPlan {
	//initializing the driver to null
	public WebDriver driver = null;
	
	final static Logger logger = Logger.getLogger(TestPlan.class);
	
	//defining the web driver
	public WebDriver getDriver()
	{
		logger.info("the web driver is initialized");
		System.setProperty("webdriver.gecko.driver", 
    			"C:\\Users\\karth\\Documents\\JavaTools\\AutomationJars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	logger.info("the web driver implicit wait is set");
		return driver;
	}

}
