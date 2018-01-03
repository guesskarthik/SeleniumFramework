package dotcom.RediffWebsite;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class SignOnBusinessFunctions extends SignOnPage {
	
	final static Logger logger = Logger.getLogger(SignOnBusinessFunctions.class);

	public SignOnBusinessFunctions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Functionality
	public void NavigateURL(String sURL)
	{
		driver.get(sURL);
		logger.info("The website is opened "+ sURL);
	}
	
	public void Login(String Username, String Pwd)
	{
		getUserName().clear();
		getUserName().sendKeys(Username);
		logger.info("The username is set "+ Username);
		getPwd().clear();
		getPwd().sendKeys(Pwd);
		logger.info("The Password is set "+ Pwd);
	}

	public void ClickGoBtn()
	{
		ClickGo().click();
		logger.info("The Go button is clicked ");
	}
	
}
