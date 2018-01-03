package dotcom.RediffWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory extends TestPlan {
	
	public WebDriver driver;
	//constructor
	public HomePageFactory(WebDriver driver2) {
		this.driver = driver2;
	}
	
	//defining objects
	@FindBy(linkText="Sign in")
	public WebElement lnkSignIn;
	
	@FindBy(linkText="Create a Rediffmail account")
	public WebElement lnkCreateAcc;
	
	@FindBy(linkText="Home")
	public WebElement lnkHome;
	
	
	//Defining the methods
	public void ClickLink(String sLinkName)
	{
		switch(sLinkName)
		{
		case "Sign In":
			lnkSignIn.click();
			break;
		
		case "Home":
			lnkHome.click();
			break;
		
		case "Create a Rediffmail account":
			lnkCreateAcc.click();
			break;
		}
	}
	
	
	public void validatePageName(String sPage)
	{
		if(driver.getTitle().equalsIgnoreCase(sPage))
		{
			System.out.println("The page is correctly displayed");
		}
		else
		{
			System.out.println("The page is incorrectly displayed");
		}
	}
	

}
